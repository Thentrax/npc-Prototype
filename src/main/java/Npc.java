public class Npc implements Cloneable  {

    private String name;
    private int age;
    private String lore;

    public Npc(String name, int age, String lore){
        this.name = name;
        this.age = age;
        this.lore = lore;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
    @Override
    public Npc clone() throws CloneNotSupportedException {
        try {
            return (Npc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "NPC:" +
                " Nome:" + name +
                " Age:" + age +
                " Lore:" + lore;
    }
}
