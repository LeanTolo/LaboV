# Trabajo Practico 1 - Torneo De Frescas

![Torneo-De-Frescas](TorneoDeFrescas.png)

## 1 - ¿Qué es Maven?

Maven es una herramienta que estandariza la configuracion de un proyecto en todo su ciclo de vida (sus fases de compilacion, empaquetado, etc). Ofreciendonos una gestion de dependencias, administrando librerias, o logicas de ejecucion de plugins.

## 2 - POM: Qué significa y para que nos sirve

POM (Project Object Model), es un fichero (XML) donde se especifican los distintos modulos para la construccion del proyecto.

## 3 - Diferencia entre Archetype y Artifacld

- ArtifacId es el identificador único del artefacto principal de un proyecto. El artefacto principal para un proyecto es típicamente el archivo JAR. Los artefactos secundarios como los paquetes de origen también usan el artefacto como parte de su nombre final.

- En cambio Archetype es una plantilla de proyecto, definida como un patrón o modelo original a partir del cual se hacen todas las otras cosas del mismo tipo. También son empaquetados en un archivo JAR, pero solo contienen las configuraciones y datos necesarios para generar la plantilla del proyecto.

## 4 - Explique los siguientes Goals de Maven: clean, package, install, compile.

Un Goal es un comando que recibe Maven como parámetro para realizar una tarea. Sintaxis en Linea de Comandos: mvn plugin:comando/

- mvn clean: limpia todas las clases compiladas del proyecto.

- mvn package: empaqueta el proyecto (si es un proyecto java simple, genera un jar, si es un proyecto web, un war, etc…).

- mvn install: instala el artefacto en el repositorio local.

- mvn compile: compila el proyecto.

## 5 - Explique los siguientes Scopes: compile, provide, runtime, test, system.

- Compile: Las dependencias con este alcance están disponibles en la ruta de clase (classpath) del proyecto en todas las tareas de compilación y se propagan a los proyectos dependientes.
- Provide: Este alcance se utiliza para marcar las dependencias que deben proporcionarse en tiempo de ejecución (runtime) por JDK o un contenedor.
- Runtime: Las dependencias con este alcance son necesarias en tiempo de ejecución, pero no son necesarias para la compilación del código del Proyecto. (Ejemplo: JDBC driver)
- Test: Este alcance se usa para indicar que la dependencia no es necesaria en el tiempo de ejecución estándar de la aplicación, pero se usa solo para fines de prueba. Las dependencias de prueba no son transitivas y solo están presentes para las rutas de clase de prueba y ejecución.
- System: Este alance es muy similar al alcance proporcionado (provided). La principal diferencia entre estos dos ámbitos es que el sistema nos obliga a apuntar directamente a un JAR específico en el sistema. Puede fallar en diferentes sistemas si la dependencia no se encuentra en el camino especificado.
