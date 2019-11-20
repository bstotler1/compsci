class Replace{
    public Replace(){}
     int i;
     String partBefore, partAfter, replacedGalesi;
     String galesi = "Galesi";
    boolean even;
    int y=0;
    public String replaceAllGalesis(String sentence){
        while (sentence.contains("Galesi")){
            i = sentence.indexOf("Galesi");
            partBefore = sentence.substring(0,i);
            partAfter = sentence.substring(i + galesi.length());
            if(i%2==0){
                even = true;
            }else{
                even = false;
            }
            if(even){
                replacedGalesi = "Cat";
            }else{
                replacedGalesi = "Zombie";
            }
            sentence = partBefore + replacedGalesi + partAfter;
        }
        return sentence;
    }
}