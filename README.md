Це код другої лабораторної роботи з ссп. 
Структура Java-програми складається з шістнадцяти класів: Main.java, Function.java, Composite.java, Const.java, Linear.java, Sum.java, Multiplication.java, Cosine.java, Sine.java, NaturalLogarithm.java, Absolute.java, HyperbolicCosine.java, HyperbolicSine.java, Power.java, HyperbolicTangent.java, CubeRoot.java та Sign.java. 
	Main.java – це основний клас, в якому створюються об’єкти класів функцій та виводяться результати роботи цих функцій.
	Function.java – це інтерфейс, який наслідується до основних об’єктів типу функція.
	Composite.java – це абстрактний клас, який імлементує Function, для обробки даних типу функція.
	Const.java – це клас, який також імлементує Function, для роботи з числами, які потрібно ідентифікувати як константу.
	Linear.java – це клас, який також імлементує Function, для роботи зі змінними, які надалі потрібно буде ідентифікувати, як лінійну функцію.
	Sum.java – це клас, який наслідує Composite, цей клас слугує для знаходження суми результатів функцій які передані до цього класу як аргументи.
	Multiplication.java – це клас, який також наслідує Composite, цей клас слугує для знаходження добутку результатів функцій які передані до цього класу як аргументи.
	Cosine.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення косинусу від результатів функцій які передані до цього класу як аргументи.
	Sine.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення синусу від результатів функцій які передані до цього класу як аргументи.
	NaturalLogarithm.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення натурального логаріфму від результатів функцій які передані до цього класу як аргументи.
	Absolute.java – це клас, який також наслідує Composite, цей клас слугує для модуля результатів функцій які передані до цього класу як аргументи.
	HyperbolicCosine.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення гіперболічного косинусу від результатів функцій які передані до цього класу як аргументи.
	HyperbolicSine.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення гіперболічного синусу від результатів функцій які передані до цього класу як аргументи.
	Power.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення результату функції який передано до цього класу, як аргумент у степені, яку також передано, як аргумент.
	HyperbolicTangent.java – це клас, який також наслідує Composite, цей клас слугує для знаходження значення гіперболічного тангенсу від результатів функцій які передані до цього класу як аргументи.
          Cube.Root.java-– це клас, який наслідує Composite, цей клас слугує для знаходження значення кубічного кореня від результатів функцій які передані до цього класу як аргументи.
	Sign.java – це клас, який також наслідує Composite, цей клас слугує для повернення модулю результатів функцій які передані до цього класу як аргументи, об’єкт цього класу створюється коли програма знаходить похідну у класі Absolute.

