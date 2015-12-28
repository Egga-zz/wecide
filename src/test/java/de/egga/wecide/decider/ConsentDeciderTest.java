package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.decision.NegativeDecision;
import de.egga.wecide.decision.PositiveDecision;
import org.junit.Test;

import static de.egga.wecide.votes.VoteBuilder.oneAgainst;
import static de.egga.wecide.votes.VoteBuilder.oneInFavor;
import static de.egga.wecide.votes.VoteBuilder.oneNeutral;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class ConsentDeciderTest {

    private final ConsentDecider decider = new ConsentDecider();

    @Test
    public void consent_is_reached_when_all_votes_are_in_favor() {
        Decision decision = decider.evaluateVotes(oneInFavor());
        assertThat(decision).isInstanceOf(PositiveDecision.class);
    }

    @Test
    public void consent_is_not_reached_when_a_single_vote_is_against() {
        Decision decision = decider.evaluateVotes(oneAgainst());
        assertThat(decision).isInstanceOf(NegativeDecision.class);
    }

    @Test
    public void consent_is_reached_when_a_vote_is_neutral() {
        Decision decision = decider.evaluateVotes(oneNeutral());
        assertThat(decision).isInstanceOf(PositiveDecision.class);
    }

}
