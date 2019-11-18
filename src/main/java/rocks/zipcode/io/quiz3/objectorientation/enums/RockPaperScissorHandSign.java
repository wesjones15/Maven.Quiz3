package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSOR;

    public RockPaperScissorHandSign getWinner() {
        switch(this) {
            case ROCK:
                return PAPER;
            case PAPER:
                return SCISSOR;
            case SCISSOR:
                return ROCK;
        }
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        switch(this) {
            case ROCK:
                return SCISSOR;
            case PAPER:
                return ROCK;
            case SCISSOR:
                return PAPER;
        }
        return null;
    }

//    public String getWinningMove(String handSign) {
//        String[] handSigns = {"rock", "paper", "scissor"};
//        String winningMove = "";
//        for (int i = 0; i < handSigns.length; i++) {
//            if (handSign.equals(handSigns[i])) {
//                if(i+1 >= handSigns.length) {
//                    i = -1;
//                }
//                winningMove = handSigns[i+1];
//                break;
//            }
//        }
//        return winningMove;
//    }
}


