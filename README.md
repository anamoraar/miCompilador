# Proyecto 2 - miCompilador

## Grupo 4:
- Ana Laura Mora Arias - 2021066978
- Derinia Zhang Gu - 2021077766 
- Josué Castro Ramírez - 2020065036 


## Probar la fase léxica
```bash
java -cp "lib/antlr-4.13.1-complete.jar;out/production/miCompilador" PruebaLexer IO/prueba1.txt IO/salidaL1.txt
```
## Probar la fase sintática
```bash
java -cp "lib/antlr-4.13.1-complete.jar;out/production/miCompilador" PruebaParser IO/prueba1.txt IO/salidaP1.txt
```
## Probar la fase semántica
```bash
java -cp "lib/antlr-4.13.1-complete.jar;out/production/miCompilador" Main IO/prueba1.txt IO/output_prueba1.txt
```

## Requisitos

1. Versión de Java >= 16.
2. Para ejecutar las pruebas hay que estar en el root del proyecto, es decir, en miCompilador
