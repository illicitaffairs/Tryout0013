#you can add additional code within the loop to process or send the coordinates to an external system or store them somewhere like a database.
import random

# Função para gerar coordenadas aleatórias
def gerar_coordenadas():
    latitude = random.uniform(-90, 90)
    longitude = random.uniform(-180, 180)
    return latitude, longitude

# Simulação do monitoramento de localização da aeronave
while True:
    latitude, longitude = gerar_coordenadas()
    print(f"Aeronave: Latitude={latitude}, Longitude={longitude}")
    # Aqui você pode adicionar código adicional para processar ou enviar as coordenadas para algum sistema externo
    # ou armazená-las em algum lugar, como um banco de dados
