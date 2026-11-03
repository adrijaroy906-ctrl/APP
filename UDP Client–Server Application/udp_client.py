import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

temp = input("Enter Temperature: ")
client.sendto(temp.encode(), ("localhost", 5001))

client.close()
