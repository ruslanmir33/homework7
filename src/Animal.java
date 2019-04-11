public abstract class Animal {
    String type;
    String name;

    int maxRun;
    int maxJump;
    int maxSwim;

    public  void  run(int distance) {
        if ( distance <= maxRun){
            System.out.println(type +" "+name+ " хорошо пробежал " + distance + " метров");
        }else  {
            System.out.println(type +" "+name+ " забег не выполнен");
        }
    }
    public  void  jump(int height) {
        if ( height <= maxJump){
            System.out.println(type +" "+name+ " хорошо прыгнул " + height + " метров");
        }else  {
            System.out.println(type +" "+name+ " прыжок не выполнен");
        }
    }

    public  void  swim(int distance) {
        if (maxSwim == 0){
            System.out.println(type +" "+ name + " не умеет плавать");
            return;
        }
        if ( distance <= maxSwim){
            System.out.println(type +" "+ name + " хорошо проплыл " + distance + " метров");
        }else  {
            System.out.println(type +" "+name+ " проплыть не выполнен");
        }
    }

    public Animal(String type, String name, int maxRun, int maxJump, int maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }
}
