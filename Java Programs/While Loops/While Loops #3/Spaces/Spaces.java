class Spaces{
    int count;
    int i;
    public Spaces(){}
    public int spaceCounter(String sentence){
        count = 0;
        i = 0;
        while(i < sentence.length()){
            if(sentence.charAt(i) == ' '){
                count++;
            }
            i++;
        }
        return count;
    }
}