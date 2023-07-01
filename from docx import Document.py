#um programa que permite digitar um texto e salvá-lo automaticamente no Word, utilizando a biblioteca python-docx
from docx import Document

def salvar_no_word(texto):
    document = Document()
    document.add_paragraph(texto)
    document.save('texto_no_word.docx')
    print("Texto salvo no Word com sucesso!")

texto_digitado = input("Digite o texto que deseja salvar no Word: ")
salvar_no_word(texto_digitado)
