public class Minipig extends Animal {
    Minipig(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    public void voice() {
        System.out.println(name + ", который никогда особенно не любил купаться, задрожал и сказал мужественным голосом:");
    }

    public void see(Kenga kenga) {
        System.out.println("--" + kenga + "! Я вижу, что пришло время поговорить начистоту.");
    }

    public class Voice{
        private boolean isNotManly = true;

        public void doManlyVoice(Minipig minipig){
            isNotManly = false;
            System.out.println("У " + minipig.getName() + " был мужественный! голос.");
        }
    }
}

