import java.lang.Class;
import java.lang.reflect;
import java.util.*;
public class reflection {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception, ClassNotFoundException{
		List<Object> objcriados = new ArrayList<>();
		Class<?> sc = Class.forName("aula10.Circulo");
		System.out.println(sc.getName());
		System.out.println(sc.getSimpleName());
		System.out.println(sc.getCanonicalName());

		//usar os construtores da class escolhida acima
		Class<?>[] paramTypes = {Double.TYPE, double.TYPE, double.TYPE};
		Constructor<?> cons = sc.getConstructor(paramTypes);
		Object[] ar = {2, 4, 10}; 
		Object obj = cons.newInstance(ar);
		System.out.println(obj);

		//tbm podemos usar esta maneira
		Constructor<?> cs = sc.getConstructor(new Class<?>[]{double.TYPE});
		System.out.println("New object: "+ cs.newInstance(new Object[]{20}));

		System.out.println("Escolha os parametros para criar um objeto:");
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();
		System.out.print("raio: ");
		int raio = sc.nextInt();
		Object[] newobj = {x, y, raio};
		Object novo = cons.newInstance(newobj);
		System.out.println(novo);

		for(int i = 0; i<objetoscriados.size(); i++){
			System.out.println(i+" - "+objcriados.get(i));
		}
	}

	private static void invocaClass(Object c1) throws IllegalAccessException,IllegalArgumentException {
		Method[] classMethod = c1.getClass().getDeclaredMethods();
		for(int i = 0; i < classMethod.length; i++){
			System.out.println(i+" - "+methodToString(classMethods[i].toString()));
		}
		System.out.println("Metodo selecionado: ");
		Method method = classMethods[Integer.parseInt(read.nextLine())];
		Class<?> argTypes = method.getParameterTypes();
		List<Object> args = new ArrayList<>();
		for (int i = 0;i < argTypes.length ;i++ ) {
			args.add(instanciateObjectOfType(argTypes[i]));
		}
		System.out.println("Output: "+method.invoke(c1, args.toArray(new Object[0])));
	}

	private static Obejct criaObj(String classname) throws ClassNotFoundException{
		Class<?> reflection = Class.forName(classname);
		if(Modifier.isAbstract(reflection.getModifiers) || reflection.isInterface()){
			throw new InstantiationException();
		}
		Constructor<?>[] constructors = reflection.getConstructos();
		for(int i = 0; i< constructors.length;i++){
			System.out.println(i+" - "+ConstructorToString(constructors[i]));
		}
		int chosenIndex = -1;
		do{
			System.out.print("Metodo escolhido: ");
			chosenIndex = Integer.parseInt(read.nextLine());
		}while(chosenIndex == -1);
		Constructor<?> escolhido = constructors[chosenIndex];
		Class<?>[] params = escolhido.getParameterTypes();
		List<Object> args = new ArrayList<Object>();
		for(Class<?> param : params){
			args.add(instanciateObjectOfType(param));
		}
		return escolhido.newInstance(args.toArray(new Object[0]));
	}

	private static Object instanciateObjectOfType(Class<?> arg) {
		String argType = arg.getCanonicalName();
		Object obj = null;
		String userInputValue = null;
		if(arg.isPrimitive()) {
			System.out.print(argType+": ");
			userInputValue = read.nextLine();
		}
		if(argType.equals("float")) {
			obj = Float.parseFloat(userInputValue);
		}else if(argType.equals("double")) {
			obj = Double.parseDouble(userInputValue);
		}else if(argType.equals("byte")) {
			obj = Byte.parseByte(userInputValue);
		}else if(argType.equals("int")) {
			obj = Integer.parseInt(userInputValue);
		}else if(argType.equals("short")) {
			obj = Short.parseShort(userInputValue);
		}else if(argType.equals("long")) {
			obj = Long.parseLong(userInputValue);
		}else if(argType.equals("boolean")) {
			obj = Boolean.parseBoolean(userInputValue);
		}else if(argType.equals("char")) {
			obj = userInputValue.charAt(0);
		}else if(argType.equals("String")){
			obj = userInputValue;
		}else{ //In case it's not a primitive type
			try {
				obj = createObject(arg.getCanonicalName());
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("UNKNOWN ERROR");
				System.exit(1);
			}
		}
		return obj;
	}
}