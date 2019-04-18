¿Que es Maven? -Maven es una herramienta open-source, que se creó en 2001 con el objetivo de simplificar los procesos de build (compilar y generar ejecutables a partir del código fuente).

POM significa Project Object Model, sirve para describir el proyecto de software a construir, sus dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos. Viene con objetivos predefinidos para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado.

La diferencia es que un archetype es una plantilla que se puede utilizar para crear proyectos que se basan en parámetros establecidos en la definición del archetype y artifactid es el nombre que le pondremos al proyecto maven que tambien sera compartido con el directorio creado por maven

mvn clean: limpia todas las clases compiladas del proyecto.

mvn compile: compila el proyecto

mvn package: empaqueta el proyecto (si es un proyecto java simple, genera un jar)

mvn install: instala el artefacto en el repositorio local

Compile: es la que tenemos por defecto sino especificamos scope. Indica que la dependencia es necesaria para compilar. La dependencia además se propaga en los proyectos dependientes.

Provided: Es como la anterior, pero esperas que el contenedor ya tenga esa libreria. Un claro ejemplo es cuando desplegamos en un servidor de aplicaciones, que por defecto, tiene bastantes librerías que utilizaremos en el proyecto, así que no necesitamos desplegar la dependencia.

Runtime: La dependencia es necesaria en tiempo de ejecución pero no es necesaria para compilar.

Test: La dependencia es solo para testing que es una de las fases de compilación con maven.

System: Es como provided pero tienes que incluir la dependencia explicitamente. Maven no buscará este artefacto en tu repositorio local. Habrá que especificar la ruta de la dependencia mediante la etiqueta