# Repositorio de ejemplos de Cucumber con Java
Este repositorio contiene ejemplos de cómo utilizar Cucumber con Java para realizar pruebas de comportamiento (BDD). Aquí encontrarás ejemplos de configuración, definición de pasos y ejecución de pruebas utilizando Cucumber junto con JUnit5.
## Estructura del Proyecto
- `src/main/java`: Contiene el código fuente principal de la aplicación.
- `src/test/java`: Contiene los archivos de prueba, incluyendo las definiciones de pasos
- `src/test/resources`: Contiene los archivos de características (feature files) de Cucumber.
- `pom.xml`: Archivo de configuración de Maven que incluye las dependencias necesarias para Cucumber y JUnit5.
- `README.md`: Este archivo, que proporciona una visión general del proyecto y cómo utilizarlo.
## Requisitos Previos
  - Java 21 o superior
  - Maven 3.6 o superior
  - IDE compatible con Java (Eclipse, IntelliJ IDEA, etc.)

## Lanzamiento de Pruebas
Para ejecutar las pruebas de Cucumber, sigue estos pasos:
1. Lanza maven desde la terminal en el directorio raíz del proyecto:
   ```bash
   mvn clean test
   ```
2. Maven descargará las dependencias necesarias y ejecutará las pruebas definidas en los archivos de características.
3. Los resultados de las pruebas se mostrarán en la consola y también se generarán informes en el fichero `target/cucumber-report.html`.
4. Abre el informe en un navegador para ver los resultados detallados de las pruebas.

## Lanzamiento de un único feature
Para ejecutar un único archivo de características (feature file), puedes utilizar el siguiente comando de Maven,
reemplazando `ruta/al/archivo.feature` con la ruta real del archivo que deseas ejecutar:
```bash
mvn -q clean test \
  -Dcucumber.glue=com.cursosdedesarrollo.steps \
  -Dcucumber.features=classpath:features/calculadora.feature
```


