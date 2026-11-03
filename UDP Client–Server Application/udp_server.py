import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
server.bind(("localhost", 5001))

print("Waiting for temperature readings...")

while True:
    data, addr = server.recvfrom(1024)
    print("Temperature:", data.decode())
