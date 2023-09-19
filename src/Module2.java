public class Module2 {

    public void chemistry(){
        String chem[] = {"Organic Chemistry","Physical Chemistry","Inorganic Chemistry","Polymer Chemistry","Bio Chemistry"};

        System.out.println("Books that are available in Chemistry department are follow:");
        for(int i =0;i<chem.length;i++){
            System.out.println(chem[i]);
        }
        System.out.println();
    }

    public void physics(){
        String phy[] = {"Semi-Conductor Physics","Electromagnetic Physics","Astro Physics","Solid State Physics","Mechanics"};

        System.out.println("Books that are available in Physics department are follow:");

        for(int i =0;i<phy.length;i++){
            System.out.println(phy[i]);
        }
        System.out.println(" ");
    }

    public void computer(){
        String com[] = {"DSA with C++","Java Programming","C programming","Python Programming and DSA","Web Development"};

        System.out.println("Books that are available in Computer department are follow:");
        for(int i =0;i<com.length;i++){
            System.out.println(com[i]);
        }
        System.out.println();
    }

    public void self_development(){
        String other[] = {"Atmoic Habits","Ikigai","Power of Subconsious Mind","Aptitude Practice Book"};

        System.out.println("Books that are available in Self development department are follow:");
        for(int i =0;i<other.length;i++){
            System.out.println(other[i]);
        }
        System.out.println();
    }
}
