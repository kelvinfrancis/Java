public class App {
    public static void main(String[] args) throws Exception {
        
        Canido perros = new Canido("ladrido", "carnivora", "domestico", "Canis lupus familiaris");

        Canido lobos = new Canido("aullido", "carnivora", "bosque", "Canis lupus");

        Felino leones = new Felino("rugido", "carnivora", "pradera", "Panthera leo");

        Felino gatos = new Felino("maullan", "ratones", "domestico", "Felis silvestris catus");

        Animal[] animalList = {lobos,leones,gatos,perros};
        //Impresion de datos
        for(int i = 0; i < animalList.length; i++){
            if (i == 0){
                System.out.println("Animal: Lobos");
            }else if (i == 1){
                System.out.println("Animal: Leones");
            }else if(i == 2){
                System.out.println("Animal: Gatos");
            }else{
                System.out.println("Animal: Perros");
            }
            System.out.println("Sonido: "+ animalList[i].getSonido());
            System.out.println("Alimentación: "+ animalList[i].getAlimentos());
            System.out.println("Hábitat: "+ animalList[i].getHabitat());
            System.out.println("Nombre cientifico: "+ animalList[i].getNombreCientifico());
            System.out.println("----------------------------------------");
        }

    }
}
