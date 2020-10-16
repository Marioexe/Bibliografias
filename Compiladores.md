# Compiladores
Historia de los compiladores

# 1946

***Se desarrolla el primer ordenador digital***

Las instrucciones que se ejecutaban eran códigos numéricos, lenguaje de máquina., esto es engorroso, entonces surgen los ensamblador.

# 1954

***Comienza desarrollo***

En IBM se comienza con el desarrollo de FORNTRAN aunque la investigación ya lleva tiempo

# 1957

***FORTRAN***

El nacimiento de este lenguaje se debe principalmente a John Backus en unión de Richard Goldberg, Sheldon F. Best, Harlan Herrick, Peter Sheridan, Roy Nutt, Robert Nelson, Irving Ziller, Lois Haibt y David Sayre, todos ellos de la nómina de IBM, quienes en 1954 presentan el informe titulado “Preliminary Report, Specifications for the IBM Mathematical FORmula TRANslating System, FORTRAN.”

Se caracteriza por su potencia en los cálculos matemáticos, pero esta limitado en las aplicaciones de gestión, manejo de archivos, tratamiento de cadenas de caracteres y edición de informes. Es un lenguaje notorio, por la facilidad con que permite expresar una ecuación. FORTRAN fue diseñado teniendo en cuenta el uso de la Tarjeta perforada de 80 columnas, por lo que el orden de las instrucciones debía ser secuencial, es decir la programación de los algoritmos era lineal, para producir cualquier alteración del orden de la lógica, se introduce la instrucción Goto. 

# 1959

***CODASYL***

En la creación de este lenguaje participó la comisión CODASYL, compuesta por fabricantes de ordenadores, usuarios y el Departamento de Defensa de Estados Unidos en mayo de 1959.

La definición del lenguaje se completó en poco más de seis meses, siendo aprobada por la comisión en enero de 1960. El lenguaje COBOL fue diseñado inspirándose en el lenguaje Flow-Matic de Grace Hopper y el IBM COMTRAN de Bob Bemer, ya que ambos formaron parte de la comisión.

COBOL fue dotado de unas excelentes capacidades de autodocumentación
Una buena gestión de archivos y una excelente gestión de los tipos de datos para la época, a través de la conocida sentencia PICTURE para la definición de campos estructurados.
Para evitar errores de redondeo en los cálculos que se producen al convertir los números a binario y que son inaceptables en temas comerciales, COBOL puede emplear y emplea por defecto números en Base diez.

Para facilitar la creación de programas en COBOL, la sintaxis del mismo fue creada de forma que fuese parecida al idioma inglés, evitando el uso de símbolos que se impusieron en lenguajes de programación posteriores.

# 1964

***BASIC***

A principios de la década de 1960, las computadoras eran máquinas sumamente caras que se utilizaban únicamente para propósitos especiales, ejecutando "una sola tarea" a la vez. Sin embargo, durante esa década, los precios comenzaron a bajar al punto que incluso las pequeñas empresas podían costearlas. La velocidad de las máquinas se incrementó al grado que a menudo quedaban ociosas porque no había suficientes tareas para ellas. Todo esto fue debido a la rápida evolución del hardware. Los lenguajes de programación de aquellos tiempos estaban diseñados con orientación para propósitos específicos, como las máquinas en las que corrían; por ejemplo para el desarrollo de programas de cálculo o procesamiento de fórmulas se diseñó Fortran y para los de gestión o administración de información se desarrolló COBOL.

La sintaxis mínima de BASIC sólo necesita los comandos LET, INPUT, PRINT, IF y GOTO. Un intérprete que ejecuta programas con esta sintaxis mínima no necesita una pila. Algunas de las primeras implementaciones eran así de simples. Si se le agrega una pila, se pueden agregar también ciclos FOR anidados y el comando GOSUB. Un intérprete de BASIC con estas características necesita que el código tenga números de línea.

# 1960

***ALGOL 60***

Fue desarrollado a finales de los años 1950 por un comité internacional para crear un lenguaje de programación internacional e independiente de la máquina y corregir algunos problemas presentados por Fortran. Fue muy popular en las universidades durante el  año 1960, pero no llegó a cuajar como lenguaje de utilización comercial como lo hicieron Fortran y COBOL . Es de la familia de los lenguales imperativos iniciada a mediados de los años 1950-1955, convirtiendose en un estándar de facto para presentar algoritmos hasta alrededor del año 1980. 

ALGOL utiliza bloques de declaraciones entre parentesis y fue el primer lenguaje en emplear los términos BEGIN y END para delimitarlos.
ALGOL 58 incorporó ciclos, hasta entonces los programas eran de estructura plana, secuencial, como los realizados en ensamblador.
La publicación del informe preliminar de ALGOL 58 en “Communications of the ACM” despertó mucho interés en el lenguaje ALGOL. Tras varias reuniones, tanto en Europa como en EE.UU., se llegaría a ALGOL 60.

# 1970

***LENGUAJE C***

Lenguaje de programación C. También conocido como “Lenguaje de programación de sistemas” desarrollado en el año 1972 por Dennis Ritchie para UNIX un sistema operativo multiplataforma. El lenguaje C es del tipo lenguaje estructurado como son Pascal, Fortran, Basic. Sus instrucciones son muy parecidas a otros lenguajes incluyendo sentencias como if, else, for, do y while... . Aunque C es un lenguaje de alto nivel (puesto que es estructurado y posee sentencias y funciones que simplifican su funcionamiento) tenemos la posibilidad de programar a bajo nivel ( como en el Assembler tocando los registros, memoria etc. ). Para simplificar el funcionamiento de el lenguaje C tiene incluidas librerías de funciones que pueden ser incluidas haciendo referencia la librería que las incluye, es decir que si queremos usar una función para borrar la pantalla tendremos que incluir en nuestro programa la librería que tiene la función para borrar la pantalla.

La programación en C tiene una gran facilidad para escribir código compacto y sencillo a su misma vez. En el lenguaje C no tenemos procedimientos como en otros lenguajes solamente tenemos funciones los procedimientos los simula y esta terminante mente prohibido escribir funciones , procedimientos y los comandos en mayúscula todo se escribe en minúsculas (a no ser las constantes J ) Los archivos en la C se escriben en texto puro de ASCII del Dos si se escribe en WORD por ejemplo el mismo incluye muchos códigos no entendidos por el compilador y generara errores ;una vez escrito se debe pasar a compilar el archivo; los archivos tienen 2 Extensiones archivo.C que es el archivo a compilar el que contiene todas los procedimientos funciones y código de nuestro programa y archivo.h que es las librerías que contienen las funciones de nuestro programa. (NOTA : El compilador genera Archivos con extensión .EXE). Cada instrucción que pasemos a poner en C va segida de un punto y coma para decirle al compilador que hasta ahí llega la instrucción simula un Enter del teclado. Ejemplo: clrscr(); /* borra la pantalla */

# 1972

***PROLOG***

Los inicios de la programación lógica se dan gracias a los primeros trabajos de inteligencia artificial. Los cuales originaron el primer lenguaje de programación que contempla los mecanismos de inferencia necesarios para la demostración automática de teoremas. El lenguaje de programación ProLog se originó del trabajo hecho por Robert A. Kowalski en la Universidad de Edinburgo (Escocia, Reino Unido) y Alain Colmerauer en la Universidad de Aix-Marseille (Francia) en los años 70. La investigación de Kowalski en el área de deducción automatizada, llevó al desarrollo con Colmerauer al uso formal de lógica como un lenguaje de programación. Kowalski proporcionó la base teórica y Colmerauer inició la programación de ProLog. Colmerauer y Philippe Roussel desarrollaron el primer intérprete, y David Warren de la Universidad de Edinburgh desarrolló el primer compilador ProLog. La mayoría de las implementaciones comerciales de ProLog usan la misma sintaxis desarrollada en Edimburgo. Su nombre proviene de las palabras en inglés Programming in Logics, que significan "programación lógica".

ProLog es un lenguaje de programación simple, pero poderoso. Se basa en nociones matemáticas de relaciones de inferencia. Es un lenguaje declarativo e interpretado, esto quiere decir que el lenguaje se usa para representar conocimientos sobre un determinado dominio y las relaciones entre objetos de ese dominio.
Un programa en ProLog consiste de una base de hechos de relaciones lógicas y detalles que se cumplen para la aplicación. Dicha base de datos no tiene una estructura impuesta, ni un procedimiento o clase principal. Escribir un programa en ProLog consiste en declarar el conocimiento disponible acerca de los objetivos, además de sus relaciones y sus reglas. En lugar de correr en un programa para obtener una solución, se hace una pregunta, el programa revisa la base de datos para encontrar la solución a la pregunta. Si existe más de una solución, ProLog hace backtracking para encontrar soluciones distintas. El propio sistema es el que deduce las respuestas a las preguntas que se le plantean, dichas respuestas las deduce del conocimiento obtenido por el conjunto de reglas dadas. La ejecución de ProLog consiste en una búsqueda en profundidad de un árbol conteniendo todas las posibles soluciones. Para cada una de ellas se evaluará su validez. La estructura de un programa en ProLog es lógica y directa. Se explican cada una de sus partes y operadores disponibles a continuación.

# 1979

***SMALL-C***

Small-C es una especificación para un subconjunto del lenguaje de programación C, conveniente para microcomputadores limitados en recursos y para sistema embebidos. También se refiere a la implementación de ese subconjunto de instrucciones. Originalmente valioso como desarrollo temprano de un compilador para sistemas de microcomputadores disponibles durante el periodo que se extiende entre fines de los años 1970 y principios de los 1980. Esta implementación también ha sido útil como ejemplo simple para propósitos de enseñanza.

El compilador original, escrito en Small-C para el Intel 8080 por Ron Cain, apareció en la edición de mayo de 1980 del Dr. Dobb's Journal. James E. Hendrix mejoró y extendió el compilador original, y escribió el manual The Small-C Handbook. Ron hizo un Small-C con capacidad de bootstrap, en el sistema Unix PDP 11/45 del Stanford Research Institute, con una cuenta proporcionada por John Bass para el desarrollo del Small C (con el permiso de la gerencia, siempre que el código fuente del compilador fuera puesto a disposición en el dominio público). Small-C era importante para los computadores más pequeños de forma algo análoga a la importancia que tenía el GCC para los computadores más grandes. Tal como sus contrapartes de Unix, el compilador genera código ensamblador, que enseguida debe ser traducido al código de máquina por un ensamblador disponible.

Small-C es un compilador redirigible (retargeting compiler). Portar al Small C requiere solo que el generador de código del back-end sea reescrito para el procesador objetivo.

# 1982

***LATICCE COMPILER***

El compilador Lattice C fue lanzado en junio de 1982 por Lifeboat Associates y fue el primer compilador C para IBM Personal Computer . El compilador se vendía por $ 500 y se ejecutaba en PC DOS o MS-DOS (que en ese momento eran el mismo producto con diferentes marcas). Los requisitos de hardware eran 96 KB de RAM y dos unidades de disquete. Fue portado a muchas otras plataformas, como mainframes ( MVS ), minicomputadoras ( VMS ), estaciones de trabajo ( UNIX ), OS / 2, el Commodore Amiga , Atari ST y el Sinclair QL .

Microsoft volvió a empaquetar posteriormente el compilador en virtud de un acuerdo de distribución como Microsoft C versión 2.0. Microsoft desarrolló su propio compilador de C que fue lanzado en abril de 1985 como Microsoft C Compiler 3.0. Lattice fue comprado por SAS Institute en 1987 y rebautizado como SAS / C. Después de esto, el soporte para otras plataformas disminuyó hasta que cesó el desarrollo del compilador para todas las plataformas excepto los mainframes de IBM. El producto todavía está disponible en versiones que se ejecutan en otras plataformas, pero estos son compiladores cruzados que solo producen código de mainframe.

Parte del software comercial de principios de 1982 para IBM PC se transfirió de CP / M (donde se escribió para el subconjunto BDS C del lenguaje C) a MS-DOS utilizando Lattice C, incluidos Perfect Writer , PerfectCalc , PerfectSpeller y PerfectFiler . Esta suite se incluyó con Seequa Chameleon y Columbia Data Products .

LMK, hacer herramienta
LSE, editor de pantalla
TMN, utilidades de gestión de texto

# 1985

***TURBO PASCAL***

Turbo Pascal. Fue el compilador del lenguaje Pascal dominante para computadoras personales (Personal Computers, PCs) durante la década de los 80 y hasta principios de los 90, muy popular debido a sus magníficas extensiones y tiempos de compilación sumamente cortos.

Turbo Pascal es un sistema de desarrollo de software que incluye un compilador y un entorno de desarrollo integrado (IDE) para el lenguaje de programación Pascal, desarrollado por Borland y liderado por Philippe Kahn. Saliö a la venta en 1983 para MS-DOS, CP/M, CP/M-86 y, posteriormente, para Microsoft Windows. También hubo una versión de corta vida para Apple Macintosh.

El compilador de Pascal de Borland, famoso en todo el mundo, fue presentado en 1985. El compilador Turbo Pascal ha sido una de las series de compiladores que mejor se han vendido de todos los tiempos, e hizo de Pascal un lenguaje especialmente importante en la plataforma PC, gracias a su equilibrio entre simplicidad y potencia. Turbo Pascal introdujo un entorno integrado de programación (IDE) en que se podía editar el código (en un editor compatible con WordStar), ejecutar el compilador, ver los errores, y volver directamente a las líneas que contenían los errores. Ahora suena trivial, pero antes de eso había que salir del editor, volver a MS-DOS, ejecutar el compilador de línea de comandos, anotar las líneas erróneas, abrir de nuevo el editor y buscarlas.

Fue Borland la que, hasta el Turbo Pascal 7, se encargó de la mayor parte de la evolución de este lenguaje. Amediados de los 90, con el boom de Windows y el renacimiento de los sistemas Unix (entre ellos Linux) como ordenadores servidores primero y luego como estaciones de trabajo, motivó que Pascal pasara a un segundo plano en sustitución de C.

En ese momento, prácticamente solo Delphi (Object Pascal para Windows) consiguió mantenerse en la brecha, pero conformándose con una pequeña parte del mercado solamente.

Casi todo el mundo intentó pasarse a C++ pero este no consiguió calar del todo por su extrema complejidad. Su sistema de objetos, los macros, los crípticos nombres de funciones, los namespaces tan difíciles de manejar, los templates, la STL y otra serie de cosas, hicieron que rápidamente mucha gente pasara de querer usar esa herramienta que todo el mundo proclamaba que era tan potente, a buscar alternativas que fueran más simples y prácticas. Sun, la compañía del Java, se gastó una millonada en promocionar su lenguaje, y tuvo un gran éxito, sin duda debido no solo al dinero en publicidad, sino a la gente que escapaba escaldada del C++. En realidad, Java no es un lenguaje fácil de aprender (obliga a pensar en objetos desde el principio, algo que los novatos no llevan bien), pero comparado con C++, se podía considerar como algo sencillo.

# 1987

***TURBO C***

Turbo C era un entorno de desarrollo integrado y compilador desarrollado por Borland para programar en lenguaje C.

Su primera versión es de 1987, a la que siguieron las versiones 1.5 y 2.0, de 1989. Fue el compilador más popular para desarrollar en C en entornos MS-DOS. Se le considera el primer IDE para C disponible para dicha plataforma.

Fue sustituido por Turbo C++ en 1990. La siguiente versión fue llamada Borland C++, y en la versión 3.0 el nombre Turbo C++ fue retomado. Tras el Borland C++ llegó el C++Builder.

1987: Turbo C 1.0
1987: Turbo C 1.1
1988: Turbo C 1.5
1989: Turbo C 2.0 (ahora con debugger integrado, también para el Atari ST)
1990: Turbo C++ 1.0
1991: Turbo C++ 1.01
1991: Turbo C++ 2.0
1992: Turbo C++ 3.0

Ambos productos, junto a los otros IDEs de Borland, pasaron a la nueva filial, CodeGear (filial de Embarcadero Technologies). En noviembre de 2006 se relanzó el compilador Turbo C y las versiones para MS-DOS del Turbo C++ como freeware.

# 1990

***JAVA***

Java es un lenguaje de programación orientado a objetos desarrollado por Sun Microsystems a principios de los años 90. El lenguaje en sí mismo toma mucha de su sintaxis de Lenguaje de Programación C y C++, pero tiene un modelo de objetos más simple y elimina herramientas de bajo nivel, que suelen inducir a muchos errores, como la manipulación directa de punteros o memoria.

Las aplicaciones Java están típicamente compiladas en un bytecode, aunque la compilación en código máquina nativo también es posible. En el tiempo de ejecución, el bytecode es normalmente interpretado o compilado a código nativo para la ejecución, aunque la ejecución directa por hardware del bytecode por un procesador Java también es posible.

La tecnología Java se creó como una herramienta de programación para ser usada en un proyecto de set-top-box en una pequeña operación denominada the Green Project en Sun Microsystems en el año 1991. El equipo (Green Team), compuesto por trece personas y dirigido por James Gosling, trabajó durante 18 meses en Sand Hill Road en Menlo Park en su desarrollo.

El lenguaje se denominó inicialmente Oak (por un roble que había fuera de la oficina de Gosling), luego pasó a denominarse Green tras descubrir que Oak era ya una marca comercial registrada para adaptadores de tarjetas gráficas y finalmente se renombró a Java.

El lenguaje Java se creó con cinco objetivos principales:

Debería usar la metodología de la programación orientada a objetos.
Debería permitir la ejecución de un mismo programa en múltiples sistemas operativos.
Debería incluir por defecto soporte para trabajo en red.
Debería diseñarse para ejecutar código en sistemas remotos de forma segura.
Debería ser fácil de usar y tomar lo mejor de otros lenguajes orientados a objetos, como C++.
Para conseguir la ejecución de código remoto y el soporte de red, los programadores de Java a veces recurren a extensiones como CORBA (Common Object Request Broker Architecture), Internet Communications Engine o OSGi respectivamente.

# 1991

***PHYTON***

Python es un lenguaje de programación creado por Guido van Rossum en el año 1991, la extensión de los creados en el es .py. Se compara habitualmente con Tcl, Perl, Scheme, Java y Ruby. En la actualidad Python se desarrolla como un proyecto de Código abierto, administrado por la Python Software Foundation. La última versión estable del lenguaje es la 3.2.2. Python es considerado como la "oposición leal" a Perl, lenguaje con el cual mantiene una rivalidad amistosa. Los usuarios de Python consideran a éste mucho más limpio y elegante para programar.

Python fue creado a finales de los ochenta por Guido van Rossum en CWI en los Países Bajos como un sucesor del Lenguaje de programación ABC, capaz de manejar excepciones e interactuar con el sistema operativo Amoeba.

Van Rossum es el principal autor de Python, y su continuo rol central en decidir la dirección de Python es reconocido, refiriéndose a él como Benevolente dictador vitalicio o Benevolent Dictator for Life (BDFL).

En 1991, van Rossum publicó el código (versión 0.9.0) en . En esta etapa del desarrollo ya estaban presentes clases con herencia, manejo de excepciones, funciones, y los tipos modulares: list, dict, str y así sucesivamente. Además en este lanzamiento inicial aparecía un sistema de módulos adoptado de Modula-3; van Rossum describe el módulo como "uno de las mayores unidades de programación de Python". El modelo de excepciones en Python es parecido al de Modula-3, con la adición de una cláusula else. En el año 1994 se formó , el foro de discusión principal de Python, marcando un hito en el crecimiento del grupo de usuarios de este lenguaje.

# 1993

***R***

R es un lenguaje y entorno de programación libre, que integra un conjunto de programas para investigación en estadística y gráficos.

El proyecto R fue iniciado en 1995 por Ross Ihaka and Robert Gentleman del Departamento de Estadística de la Universidad de Auckland. R es un dialecto de S lenguaje desarrollado en 1976 por John Chambers.

R es un lenguaje Orientado a Objetos, lo cual lo hace simple y flexible. R se distribuye gratuitamente bajo la licencia GNU GPL (General Public Licence) y su constante mejora es debida al denominado ‘Grupo Nuclear de desarrollo de R”.

# 2003

***GO***

El Lenguaje de Programación Go es para sistemas lanzado por Google en noviembre del 2009 cuyo desarrollo comenzó en septiembre del 2007 por Robert Griesemer, Rob Pike y Ken Thompson. Es un lenguaje de programación compilado, concurrente, imperativo, estructurado, no orientado a objetos —de una manera bastante especial— y con recolector de basura, soportado en diferentes tipos de sistemas.

GO proviene de la fusión de varios lenguajes de familias de donde desciende, entre ellos el lenguaje C. Aún así incorpora elementos de Python (recordemos que es lenguaje preferido de Google, además que el creador de este lenguaje, trabaja también allí), así como de la familia de Pascal/Modula/Oberon entre otros programas dinámicos. Google no solamente pretende el diseñar un lenguaje de programación que sea bastante eficiente, sino que este lenguaje sea usado masivamente por miles de desarrolladores en la creación de aplicaciones web y de software a nivel mundial Este proyecto combina el rendimiento y las prestaciones de seguridad propios de un lenguaje compilado como C++ con la velocidad de un lenguaje dinámico como Python.
