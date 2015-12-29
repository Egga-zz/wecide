package de.egga.wecide.votes;

import static de.egga.wecide.votes.VoteStatus.AGAINST;
import static de.egga.wecide.votes.VoteStatus.FOR;

public class Vote {

    private final VoteStatus status;

    public Vote(VoteStatus status) {
        this.status = status;
    }

    public boolean isAgainst() {
        if (status == AGAINST) {
            return true;
        }
        return false;
    }

    public boolean isInFavor() {
        if (status == FOR) {
            return true;
        }
        return false;
    }
}
