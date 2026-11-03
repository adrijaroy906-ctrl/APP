import socket

server = socket.socket()
server.bind(("localhost", 5000))
server.listen(1)

print("Server waiting...")
conn, addr = server.accept()

reg = conn.recv(1024).decode()

results = {
    "101": "Pass",
    "102": "Fail",
    "103": "Pass"
}

result = results.get(reg, "Register Number Not Found")

conn.send(result.encode())
conn.close()
server.close()
