# Função para calcular a constante elástica
def calcular_constante_elastica():
    # Solicitar as informações do usuário
    f = float(input("Digite a força aplicada (em Newtons): "))
    x = float(input("Digite a deformação da mola (em metros): "))

    # Calcular a constante elástica
    k = f / x

    # Imprimir o resultado
    print("A constante elástica da mola é:", k, "N/m")

# Chamada da função para calcular a constante elástica
calcular_constante_elastica()
