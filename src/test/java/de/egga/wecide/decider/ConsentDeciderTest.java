package de.egga.wecide.decider;

import de.egga.wecide.votes.VoteStatus;
import org.junit.Test;

import static de.egga.wecide.votes.VoteBuilder.*;
import static de.egga.wecide.votes.VoteStatus.*;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class ConsentDeciderTest {

    private final ConsentDecider decider = new ConsentDecider();

    @Test
    public void consent_is_reached_when_all_votes_are_pro() {
        VoteStatus decision = decider.evaluateVotes(onePro());
        assertThat(decision).isEqualTo(PRO);
    }

    @Test
    public void consent_is_not_reached_when_a_single_vote_is_con() {
        VoteStatus decision = decider.evaluateVotes(oneCon());
        assertThat(decision).isEqualTo(CON);
    }

    @Test
    public void consent_is_reached_when_a_vote_is_neutral() {
        VoteStatus decision = decider.evaluateVotes(oneNeutral());
        assertThat(decision).isEqualTo(PRO);
    }

}
