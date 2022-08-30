import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName=scan.nextLine();

        System.out.println("Team:");
        String teamName=scan.nextLine();

        ArrayList<TeamData> teamData=new ArrayList<>();

        int numberOfGames=0;
        int wins=0;
        int losses=0;

        try (Scanner fileReader=new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){

                String lines=fileReader.nextLine();
                String[] split=lines.split(",");
                String homeTeam=split[0];
                String visitingTeam=split[1];
                int homeTeamPoints=Integer.valueOf(split[2]);
                int visitingTeamPoints=Integer.valueOf(split[3]);

                teamData.add(new TeamData(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        for(TeamData values : teamData){
            if(values.getHomeTeam().equals(teamName)){
                numberOfGames++;
                if(values.getHomeTeamPoints()>values.getVisitingTeamPoints()){
                    wins++;
                }else{
                    losses++;
                }
            }
            if(values.getVisitingTeam().equals(teamName)){
                numberOfGames++;
                if(values.getHomeTeamPoints()<values.getVisitingTeamPoints()){
                    wins++;
                }else{
                    losses++;
                }
            }
        }
        
        System.out.println("Games: "+numberOfGames);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
    }
}
