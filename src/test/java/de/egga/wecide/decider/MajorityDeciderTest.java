package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import org.junit.Test;

import static de.egga.wecide.decision.DecisionStatus.CON;
import static de.egga.wecide.decision.DecisionStatus.PRO;
import static de.egga.wecide.votes.VoteBuilder.lessThanHalfInFavor;
import static de.egga.wecide.votes.VoteBuilder.moreThanHalfInFavor;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class MajorityDeciderTest {

    MajorityDecider decider = new MajorityDecider();

    @Test
    public void majority_is_reached_when_more_than_half_of_the_votes_are_in_favor() {
        DecisionStatus decision = decider.evaluateVotes(moreThanHalfInFavor());
        assertThat(decision).isEqualTo(PRO);
    }

    @Test
    public void majority_is_not_reached_when_less_than_half_of_the_votes_are_in_favor() {
        DecisionStatus decision = decider.evaluateVotes(lessThanHalfInFavor());
        assertThat(decision).isEqualTo(CON);
    }
}