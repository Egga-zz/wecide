package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import org.junit.Test;

import static de.egga.wecide.decision.DecisionStatus.CON;
import static de.egga.wecide.decision.DecisionStatus.PRO;
import static de.egga.wecide.votes.VoteBuilder.*;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class ConsentDeciderTest {

    private final ConsentDecider decider = new ConsentDecider();

    @Test
    public void consent_is_reached_when_all_votes_are_in_favor() {
        DecisionStatus decision = decider.evaluateVotes(oneInFavor());
        assertThat(decision).isEqualTo(PRO);
    }

    @Test
    public void consent_is_not_reached_when_a_single_vote_is_against() {
        DecisionStatus decision = decider.evaluateVotes(oneAgainst());
        assertThat(decision).isEqualTo(CON);
    }

    @Test
    public void consent_is_reached_when_a_vote_is_neutral() {
        DecisionStatus decision = decider.evaluateVotes(oneNeutral());
        assertThat(decision).isEqualTo(PRO);
    }

}
