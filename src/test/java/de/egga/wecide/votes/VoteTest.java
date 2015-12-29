package de.egga.wecide.votes;

import org.junit.Test;

import static de.egga.wecide.votes.VoteStatus.*;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class VoteTest {

    @Test
    public void it_should_be_con_if_voted_con() {
        Vote vote = new Vote(CON);
        assertThat(vote.isCon()).isTrue();
    }

    @Test
    public void it_should_not_be_con_if_voted_pro() {
        Vote vote = new Vote(PRO);
        assertThat(vote.isCon()).isFalse();
    }

    @Test
    public void it_should_not_be_con_if_vote_is_pending() {
        Vote vote = new Vote(PENDING);
        assertThat(vote.isCon()).isFalse();
    }

    @Test
    public void it_should_not_be_con_if_voted_neutral() {
        Vote vote = new Vote(NEUTRAL);
        assertThat(vote.isCon()).isFalse();
    }

    @Test
    public void it_should_be_pro_if_voted_pro() {
        Vote vote = new Vote(PRO);
        assertThat(vote.isPro()).isTrue();
    }

    @Test
    public void it_should_not_be_pro_if_voted_con() {
        Vote vote = new Vote(CON);
        assertThat(vote.isPro()).isFalse();
    }

    @Test
    public void it_should_not_be_pro_if_vote_is_pending() {
        Vote vote = new Vote(PENDING);
        assertThat(vote.isPro()).isFalse();
    }

    @Test
    public void it_should_not_be_pro_if_voted_neutral() {
        Vote vote = new Vote(NEUTRAL);
        assertThat(vote.isPro()).isFalse();
    }
}