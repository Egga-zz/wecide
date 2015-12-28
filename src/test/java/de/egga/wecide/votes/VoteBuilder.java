package de.egga.wecide.votes;

import java.util.List;

import static de.egga.wecide.votes.VoteStatus.AGAINST;
import static de.egga.wecide.votes.VoteStatus.FOR;
import static de.egga.wecide.votes.VoteStatus.NEUTRAL;
import static java.util.Arrays.asList;

public class VoteBuilder {

    public static List<Vote> oneInFavor() {
        return asList(new Vote(FOR));
    }

    public static List<Vote> oneAgainst() {
        return asList(new Vote(AGAINST));
    }
    public static List<Vote> oneNeutral() {
        return asList(new Vote(NEUTRAL));
    }
}
