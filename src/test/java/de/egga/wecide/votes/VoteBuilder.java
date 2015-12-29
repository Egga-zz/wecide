package de.egga.wecide.votes;

import java.util.List;

import static de.egga.wecide.votes.VoteStatus.CON;
import static de.egga.wecide.votes.VoteStatus.PRO;
import static de.egga.wecide.votes.VoteStatus.NEUTRAL;
import static java.util.Arrays.asList;

public class VoteBuilder {

    public static List<Vote> onePro() {
        return asList(new Vote(PRO));
    }

    public static List<Vote> oneCon() {
        return asList(new Vote(CON));
    }
    public static List<Vote> oneNeutral() {
        return asList(new Vote(NEUTRAL));
    }
    public static List<Vote> moreThanHalfPro() {
        return asList(new Vote(PRO), new Vote(PRO), new Vote(CON));
    }
    public static List<Vote> lessThanHalfPro() {
        return asList(new Vote(PRO), new Vote(CON), new Vote(CON));
    }
}
