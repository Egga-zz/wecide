package de.egga.wecide.votes;

import static de.egga.wecide.votes.VoteStatus.CON;
import static de.egga.wecide.votes.VoteStatus.PRO;

public class Vote {

    private final VoteStatus status;

    public Vote(VoteStatus status) {
        this.status = status;
    }

    public boolean isCon() {
        if (status == CON) {
            return true;
        }
        return false;
    }

    public boolean isPro() {
        if (status == PRO) {
            return true;
        }
        return false;
    }
}
