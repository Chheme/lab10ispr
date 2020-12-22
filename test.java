public class test {
    public static void main(String[] args) {
        Cat cat=new Cat("Tom");
        Dog dog=new Dog("Kivi");
System.out.println("cat.swim(4) -> результат: swim:"+cat.swim(4));
        System.out.println("dog.swim(6) -> результат: swim:"+dog.swim(6));
        System.out.println("cat.run(250) -> результат: run:"+cat.run(250));
        System.out.println("dog.run(250) -> результат: run:"+dog.run(250));
        System.out.println("cat.jump(1) -> результат: jump:"+cat.jump(1));
        System.out.println("dog.jump(0.5) -> результат: jump:"+dog.jump(0.5));
    }


}
