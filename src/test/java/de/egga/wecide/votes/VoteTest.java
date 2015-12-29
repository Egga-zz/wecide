package de.egga.wecide.votes;

import org.junit.Test;

import static de.egga.wecide.votes.VoteStatus.*;
import static org.assertj.core.api.StrictAssertions.assertThat;

public class VoteTest {

    @Test
    public void it_should_be_against_if_voted_against() {
        Vote vote = new Vote(AGAINST);
        assertThat(vote.isAgainst()).isTrue();
    }

    @Test
    public void it_should_not_be_against_if_voted_for() {
        Vote vote = new Vote(FOR);
        assertThat(vote.isAgainst()).isFalse();
    }

    @Test
    public void it_should_not_be_against_if_pending() {
        Vote vote = new Vote(PENDING);
        assertThat(vote.isAgainst()).isFalse();
    }

    @Test
    public void it_should_not_be_against_if_neutral() {
        Vote vote = new Vote(NEUTRAL);
        assertThat(vote.isAgainst()).isFalse();
    }

    @Test
    public void it_should_be_in_favor_if_voted_for() {
        Vote vote = new Vote(FOR);
        assertThat(vote.isInFavor()).isTrue();
    }

    @Test
    public void it_should_not_be_in_favor_if_voted_against() {
        Vote vote = new Vote(AGAINST);
        assertThat(vote.isInFavor()).isFalse();
    }

    @Test
    public void it_should_not_be_in_favor_if_pending() {
        Vote vote = new Vote(PENDING);
        assertThat(vote.isInFavor()).isFalse();
    }

    @Test
    public void it_should_not_be_in_favor_if_neutral() {
        Vote vote = new Vote(NEUTRAL);
        assertThat(vote.isInFavor()).isFalse();
    }
}