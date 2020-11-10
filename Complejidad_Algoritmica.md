# Complejidad Logaritmica

 # Algoritmo de orden constante O(1) 
Es una operación simple, unitaria, por ejemplo, asignar un valor a una variable, añadir a un vector, etc. Se dice que un algoritmo es tiempo constante (también escrito como tiempo O(1)) si el valor de T(n) está limitado por un valor que no depende del tamaño de la entrada Si T(n) es O(cualquier valor constante) se indica en notación estándar como T(n) siendo O(1).

# Algoritmo de orden logaritmico O(Log* n)

El análisis del método de la sacudida y en general el de los métodos mejorados y logarítmicos son muy complejos. Para el análisis de este método es necesario tener en cuenta tres factores que afectan directamente al tiempo de ejecución del algoritmo: las comparaciones entre las claves, los intercambios entre las mismas y las pasadas que se realizan. Encontrar fórmulas que permitan calcular cada uno de estos factores es una tarea muy difícil de realizar
/**Ejemplo**/
La búsqueda dentro de un diccionario. Considere un diccionario D que contiene n entradas, ordenadas por orden alfabético. Suponemos que, para 1 ≤ k ≤ n, uno puede acceder a la entrada k del diccionario en un tiempo constante. Usemos D(k) para denotar la k-ésima entrada. Bajo estas hipótesis, la prueba de si una palabra w está en el diccionario se puede hacer en tiempo logarítmico
# Algoritmo de orden lineal O(n)
Por ordenar se entiende el proceso de reorganizar un conjunto de objetos en una cierta secuencia de acuerdo a un criterio especificado. En general, el objetivo de este proceso es facilitar la posterior búsqueda de elementos en el conjunto ordenado.

Existen múltiples ejemplos reales de conjuntos que requieren ser ordenados: la guía telefónica, índices de libros, ficheros de bibliotecas, diccionarios, ficheros de diverso tipo en oficinas, actas de exámenes, etc.
/**Ejemplo**/
Un procedimiento que suma todos los elementos de una lista requiere un tiempo proporcional a la longitud de la lista, si el tiempo de adición es constante o, al menos, está limitado por una constante.

# Ejemplo de Algoritmo de orden nlogn O(n log* n)
Basa su funcionamiento en una propiedad de los montículos, por la cual, la cima contiene siempre el menor elemento (o el mayor, según se haya definido el montículo)
de todos los almacenados en él.
Su versión aleatoria, tiene un tiempo de ejecución que es O(n log n) en espera de la entrada del peor de los casos. Su versión no aleatoria tiene un tiempo de ejecución O(n log n) solo cuando se considera la complejidad promedio de los casos.

# Algoritmo de orden cuadrático O(n2)
Aplicable a bucles anidados, el primer bucle se ejecuta n veces y el segundo (interno) también n veces. Aparece cuando tenemos que enumerar todas las parejas posibles de elementos de un conjunto.
/**Ejemplo**/
Una complejidad cuadrática (O(n^2)) si para un dato necesitamos 2 operaciones, para 2 datos vamos a necesitar 4 operaciones, para 3 datos 9 operaciones y así sucesivamente.

# Algoritmo de orden polinomial O(n3)
Un algoritmo de tiempo polinomial se define como aquel con función de complejidad temporal dentro de una cota superior asintótica (denominada a veces "orden") O(p(n)) para alguna función polinómica p, donde n denota el tamaño de la entrada. Los algoritmos de tiempo exponencial, {\displaystyle O(e^{n}),}{\displaystyle O(e^{n}),} son los que el número de ciclos que tienen que realizarse con el algoritmo es proporcional a la función {\displaystyle e^{n}}{\displaystyle e^{n}} de modo que el poder computacional necesario para correr el algoritmo crece de forma exponencial al tamaño {\displaystyle n}n del problema.

# Algoritmo de orden exponencial O(an)
Los científicos de la computación realizan la distinción entre algoritmos de Tiempo polinómico y algoritmos de tiempo exponencial cuando se trata de caracterizar a los algoritmos como "suficientemente eficiente" y "muy ineficiente" respectivamente. La mayoría de los algoritmos de tiempo exponencial son simples variaciones de una búsqueda exhaustiva, mientras que los algoritmos de tiempo polinomial, usualmente se obtienen mediante un análisis más profundo de la estructura del problema. Si la entrada es pequeña, un algoritmo con tiempo de ejecución exponencial pudiera ser perfectamente aceptable.

# Algoritmo de orden factorial O(n!)
Es el típico de aquellos algoritmos que para un problema complejo prueban todas las combinaciones posibles. O(n!) combinatorio Tan intratable como el anterior. A menudo no se hace distinción entre ellos. Itera a través de todas las permutaciones de los elementos de entrada.
