#precisaremos utilizar a biblioteca psutil, que fornece uma interface para acessar informações do sistema, incluindo a temperatura da CPU.
import psutil

def monitorar_temperatura():
    while True:
        temperatura = psutil.sensors_temperatures()['coretemp'][0].current
        if temperatura > 30:
            print(f"A temperatura do computador é {temperatura}°C. Cuidado!")
            # Aqui você pode adicionar a lógica para enviar um aviso, como um e-mail ou uma notificação.
        else:
            print(f"A temperatura do computador é {temperatura}°C.")

monitorar_temperatura()
