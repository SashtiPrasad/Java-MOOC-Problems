public class Items{
    private String identifier;
    private String name;

    public Items(String identifier, String name){
        this.identifier=identifier;
        this.name=name;
    }

    public String getIdentifier(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compare){
        if(this == compare){
            return true;
        }

        if(!(compare instanceof Items)){
            return false;
        }

        Items comparedItems = (Items) compare;

        if(comparedItems.identifier.equals(this.identifier)){
            return true;
        }

        return false;
    }
}