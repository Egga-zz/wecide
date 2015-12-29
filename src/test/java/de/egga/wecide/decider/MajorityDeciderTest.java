package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.decision.NegativeDecision;
import de.egga.wecide.decision.PositiveDecision;
import org.junit.Test;

import static de.egga.wecide.votes.VoteBuilder.lessThanHalfInFavor;
import static de.egga.wecide.votes.VoteBuilder.moreThanHalfInFavor;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class MajorityDeciderTest {

    MajorityDecider decider = new MajorityDecider();

    @Test
    public void majority_is_reached_when_more_than_half_of_the_votes_are_in_favor() {
        Decision decision = decider.evaluateVotes(moreThanHalfInFavor());
        assertThat(decision).isInstanceOf(PositiveDecision.class);
    }

    @Test
    public void majority_is_not_reached_when_less_than_half_of_the_votes_are_in_favor() {
        Decision decision = decider.evaluateVotes(lessThanHalfInFavor());
        assertThat(decision).isInstanceOf(NegativeDecision.class);
    }
}