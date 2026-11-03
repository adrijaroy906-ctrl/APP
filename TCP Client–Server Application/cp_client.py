import socket

client = socket.socket()
client.connect(("localhost", 5000))

reg = input("Enter Register Number: ")
client.send(reg.encode())

result = client.recv(1024).decode()
print("Examination Result:", result)

client.close()
