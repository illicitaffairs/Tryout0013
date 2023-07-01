#This code serves as a basic framework for monitoring the temperature of an engine. In a real-world scenario, you would likely have additional code to interface with temperature sensors and perform more complex actions based on the temperature readings.
import random
import time

def obter_leitura_temperatura():
    # Simulação de leitura de temperatura
    temperatura = random.uniform(60, 100)  # Gerando um valor aleatório entre 60 e 100
    return temperatura

def monitorar_temperatura():
    while True:
        temperatura = obter_leitura_temperatura()
        print("Temperatura do motor: ", temperatura, "°C")
        
        if temperatura > 90:
            print("ALERTA: Temperatura alta detectada!")
            # Aqui você pode adicionar a lógica para notificar a equipe de manutenção ou tomar outras ações necessárias.
        
        time.sleep(1)  # Aguarda 1 segundo antes de realizar a próxima leitura

monitorar_temperatura()
