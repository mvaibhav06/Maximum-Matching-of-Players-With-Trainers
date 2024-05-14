import java.util.Arrays;

public class MatchPlayers {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int out = 0;
        int temp = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        for(int i=0; i<players.length; i++){
            for(int j=temp; j<trainers.length; j++){
                if(trainers[j] >= players[i]){
                    out++;
                    temp = j+1;
                    break;
                }
            }
        }
        return out;
    }
}
