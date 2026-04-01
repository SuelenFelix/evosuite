package org.openRealmOfStars.starMap.vote;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.starMap.vote.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Vote_getOrganizerIndex_191247876515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17362;

    public Vote_getOrganizerIndex_191247876515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17438 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term17437 = ((Class) term17438).getDeclaredField((String) "SECOND_CANDIDATE_MILITARY");
        ((Field) term17437).setAccessible(true);
        Object enum51 = ((Field) term17437).get((Object) null);
        Class<? extends Object> term17740 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term17739 = ((Class) term17740).getDeclaredField((String) "NOT_VOTED");
        ((Field) term17739).setAccessible(true);
        Object enum52 = ((Field) term17739).get((Object) null);
        Class<? extends Object> term18039 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term18038 = ((Class) term18039).getDeclaredField((String) "ABSTAIN");
        ((Field) term18038).setAccessible(true);
        Object enum53 = ((Field) term18038).get((Object) null);
        term17362 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term17392 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 3);
        int[] term17417 = (int[]) newIntArray(4);
        setField(term17362, term17362.getClass(), "type", enum51);
        setElement(term17392, 0, enum52);
        setElement(term17392, 1, enum53);
        setElement(term17392, 2, enum52);
        setField(term17362, term17362.getClass(), "choices", term17392);
        setIntElement(term17417, 0, 57189932);
        setIntElement(term17417, 1, 1460722225);
        setIntElement(term17417, 2, 1743224434);
        setIntElement(term17417, 3, 842904495);
        setField(term17362, term17362.getClass(), "numberOfVotes", term17417);
        setIntField(term17362, term17362.getClass(), "turnsToVote", 1008080511);
        setIntField(term17362, term17362.getClass(), "organizerIndex", 1935707624);
        setIntField(term17362, term17362.getClass(), "secondCandidateIndex", 1507074215);
        setField(term17362, term17362.getClass(), "planetName", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrganizerIndex", argTypes, term17362, args);
    }

};


