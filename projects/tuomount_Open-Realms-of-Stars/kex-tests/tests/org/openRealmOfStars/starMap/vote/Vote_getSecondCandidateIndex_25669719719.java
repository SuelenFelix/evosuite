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

public class Vote_getSecondCandidateIndex_25669719719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20930;

    public Vote_getSecondCandidateIndex_25669719719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21010 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term21009 = ((Class) term21010).getDeclaredField((String) "GALACTIC_OLYMPIC_PARTICIPATE");
        ((Field) term21009).setAccessible(true);
        Object enum62 = ((Field) term21009).get((Object) null);
        Class<? extends Object> term21321 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term21320 = ((Class) term21321).getDeclaredField((String) "NOT_VOTED");
        ((Field) term21320).setAccessible(true);
        Object enum63 = ((Field) term21320).get((Object) null);
        Class<? extends Object> term21620 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term21619 = ((Class) term21620).getDeclaredField((String) "VOTED_YES");
        ((Field) term21619).setAccessible(true);
        Object enum64 = ((Field) term21619).get((Object) null);
        term20930 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term20963 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term20990 = (int[]) newIntArray(3);
        setField(term20930, term20930.getClass(), "type", enum62);
        setElement(term20963, 0, enum63);
        setElement(term20963, 1, enum64);
        setElement(term20963, 2, enum64);
        setElement(term20963, 3, enum63);
        setElement(term20963, 4, enum64);
        setField(term20930, term20930.getClass(), "choices", term20963);
        setIntElement(term20990, 0, 1593461795);
        setIntElement(term20990, 1, 515182546);
        setIntElement(term20990, 2, -936895502);
        setField(term20930, term20930.getClass(), "numberOfVotes", term20990);
        setIntField(term20930, term20930.getClass(), "turnsToVote", -129547140);
        setIntField(term20930, term20930.getClass(), "organizerIndex", 199287428);
        setIntField(term20930, term20930.getClass(), "secondCandidateIndex", -1195339592);
        setField(term20930, term20930.getClass(), "planetName", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecondCandidateIndex", argTypes, term20930, args);
    }

};


