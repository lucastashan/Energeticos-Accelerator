# Energeticos-Accelerator

A fábrica de bebidas energéticas Energéticos Accelerator vendeu uma carga de energéticos para uma grande rede de supermercados. O caminhão precisa de uma nota fiscal de saída da fábrica para poder fazer a entrega de cada carga e para isso é necessário ter os cálculos de tributação. Para tanto, a fábrica solicitou o desenvolvimento de uma aplicação que faça os cálculos de impostos sobre cada carga. Você é o responsável por desenvolver esta aplicação e sua tarefa é desenvolver o algoritmo para calcular os impostos referentes a cada venda. Gerando um relatório de impostos a partir dos dados inseridos no sistema, nome do cliente e quantidade comprada. A fábrica também necessita saber o valor total (valor unitário x quantidade + impostos) sobre cada carga. O valor unitário de cada energético é fixo e cada um custa R$ 4,50. As alíquotas de imposto que serão somados no valor são os seguintes:
● ICMS: 18%
● IPI: 4%
● PIS: 1,86%
● COFINS: 8,54%

exemplo, podemos ter:
ENTRADA
Supermercado Dosul; 350;
Super Zottis; 400;

SAÍDA
Cliente: Supermercado Dosul
ICMS: R$ 283,50; IPI: R$ 63,00; PIS: R$ 29,29; COFINS: R$ 134,50;Total: R$
2085,30

Cliente: Super Zottis;
ICMS: R$ 324,00; IPI: R$72,00; PIS: R$33,48; COFINS: R$153,72; Total: R$
2383,20

Total Impostos: R$ 1.093,50
Total Mercadorias: R$ 3.375,00
Total Geral: R$ 4.4468,49

Esta empresa, deseja dar uma bonificação/desconto, mas não sabe como bonificar os clientes que compraram grandes quantidades.
Como questão bônus (não obrigatória), você pode sugerir um algoritmo para ajudar a bonificar os clientes.
