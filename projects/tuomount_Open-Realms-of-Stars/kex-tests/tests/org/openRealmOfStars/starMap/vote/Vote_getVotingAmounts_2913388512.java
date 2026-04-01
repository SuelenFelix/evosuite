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

public class Vote_getVotingAmounts_2913388512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object enum8;

    public Vote_getVotingAmounts_2913388512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1898 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term1897 = ((Class) term1898).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term1897).setAccessible(true);
        Object enum5 = ((Field) term1897).get((Object) null);
        Class<? extends Object> term2170 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term2169 = ((Class) term2170).getDeclaredField((String) "ABSTAIN");
        ((Field) term2169).setAccessible(true);
        Object enum6 = ((Field) term2169).get((Object) null);
        Class<? extends Object> term2463 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term2462 = ((Class) term2463).getDeclaredField((String) "VOTED_NO");
        ((Field) term2462).setAccessible(true);
        Object enum7 = ((Field) term2462).get((Object) null);
        term1820 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term1840 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 3);
        int[] term1864 = (int[]) newIntArray(4);
        setField(term1820, term1820.getClass(), "type", enum5);
        setElement(term1840, 0, enum6);
        setElement(term1840, 1, enum7);
        setElement(term1840, 2, enum7);
        setField(term1820, term1820.getClass(), "choices", term1840);
        setIntElement(term1864, 0, -1339778481);
        setIntElement(term1864, 1, 1725571209);
        setIntElement(term1864, 2, -522618178);
        setIntElement(term1864, 3, 1134449235);
        setField(term1820, term1820.getClass(), "numberOfVotes", term1864);
        setIntField(term1820, term1820.getClass(), "turnsToVote", -883034806);
        setIntField(term1820, term1820.getClass(), "organizerIndex", 1585847225);
        setIntField(term1820, term1820.getClass(), "secondCandidateIndex", 597278769);
        setField(term1820, term1820.getClass(), "planetName", "sjlJAEtRrb");
        Class<? extends Object> term2773 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term2772 = ((Class) term2773).getDeclaredField((String) "VOTED_YES");
        ((Field) term2772).setAccessible(true);
        enum8 = ((Field) term2772).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Object[] args = new Object[1];
        args[0] = enum8;
        callMethod(klass, "getVotingAmounts", argTypes, term1820, args);
    }

};


