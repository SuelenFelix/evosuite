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
import java.lang.Integer;

public class Vote_getChoice_7324956129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8279;
     Object term8371;

    public Vote_getChoice_7324956129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8374 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term8373 = ((Class) term8374).getDeclaredField((String) "RULER_OF_GALAXY");
        ((Field) term8373).setAccessible(true);
        Object enum25 = ((Field) term8373).get((Object) null);
        Class<? extends Object> term8646 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term8645 = ((Class) term8646).getDeclaredField((String) "VOTED_YES");
        ((Field) term8645).setAccessible(true);
        Object enum26 = ((Field) term8645).get((Object) null);
        Class<? extends Object> term8945 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term8944 = ((Class) term8945).getDeclaredField((String) "NOT_VOTED");
        ((Field) term8944).setAccessible(true);
        Object enum27 = ((Field) term8944).get((Object) null);
        Class<? extends Object> term9244 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term9243 = ((Class) term9244).getDeclaredField((String) "VOTED_NO");
        ((Field) term9243).setAccessible(true);
        Object enum28 = ((Field) term9243).get((Object) null);
        Class<? extends Object> term9540 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term9539 = ((Class) term9540).getDeclaredField((String) "ABSTAIN");
        ((Field) term9539).setAccessible(true);
        Object enum29 = ((Field) term9539).get((Object) null);
        term8279 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term8299 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 8);
        int[] term8349 = (int[]) newIntArray(6);
        setField(term8279, term8279.getClass(), "type", enum25);
        setElement(term8299, 0, enum26);
        setElement(term8299, 1, enum27);
        setElement(term8299, 2, enum27);
        setElement(term8299, 3, enum28);
        setElement(term8299, 4, enum29);
        setElement(term8299, 5, enum29);
        setElement(term8299, 6, enum28);
        setElement(term8299, 7, enum29);
        setField(term8279, term8279.getClass(), "choices", term8299);
        setIntElement(term8349, 0, 454281060);
        setIntElement(term8349, 1, -1786399638);
        setIntElement(term8349, 2, 2055867847);
        setIntElement(term8349, 3, -1048298087);
        setIntElement(term8349, 4, 292681826);
        setIntElement(term8349, 5, 458147407);
        setField(term8279, term8279.getClass(), "numberOfVotes", term8349);
        setIntField(term8279, term8279.getClass(), "turnsToVote", -184153539);
        setIntField(term8279, term8279.getClass(), "organizerIndex", 493620644);
        setIntField(term8279, term8279.getClass(), "secondCandidateIndex", 1328271830);
        setField(term8279, term8279.getClass(), "planetName", "MjGYSRKTNF");
        term8371 = new Integer(1596070772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8371;
        callMethod(klass, "getChoice", argTypes, term8279, args);
    }

};


