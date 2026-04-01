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

public class Vote_getNumberOfRealms_2975539021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;

    public Vote_getNumberOfRealms_2975539021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term589 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term588 = ((Class) term589).getDeclaredField((String) "SECOND_CANDIDATE");
        ((Field) term588).setAccessible(true);
        Object enum1 = ((Field) term588).get((Object) null);
        Class<? extends Object> term913 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term912 = ((Class) term913).getDeclaredField((String) "NOT_VOTED");
        ((Field) term912).setAccessible(true);
        Object enum2 = ((Field) term912).get((Object) null);
        Class<? extends Object> term1212 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1211 = ((Class) term1212).getDeclaredField((String) "VOTED_YES");
        ((Field) term1211).setAccessible(true);
        Object enum3 = ((Field) term1211).get((Object) null);
        Class<? extends Object> term1511 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1510 = ((Class) term1511).getDeclaredField((String) "VOTED_NO");
        ((Field) term1510).setAccessible(true);
        Object enum4 = ((Field) term1510).get((Object) null);
        term508 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term529 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term568 = (int[]) newIntArray(4);
        setField(term508, term508.getClass(), "type", enum1);
        setElement(term529, 0, enum2);
        setElement(term529, 1, enum3);
        setElement(term529, 2, enum3);
        setElement(term529, 3, enum2);
        setElement(term529, 4, enum4);
        setField(term508, term508.getClass(), "choices", term529);
        setIntElement(term568, 0, 1484323161);
        setIntElement(term568, 1, 391863371);
        setIntElement(term568, 2, -1922583790);
        setIntElement(term568, 3, -616727354);
        setField(term508, term508.getClass(), "numberOfVotes", term568);
        setIntField(term508, term508.getClass(), "turnsToVote", -1955890973);
        setIntField(term508, term508.getClass(), "organizerIndex", -2038273078);
        setIntField(term508, term508.getClass(), "secondCandidateIndex", 1227103734);
        setField(term508, term508.getClass(), "planetName", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfRealms", argTypes, term508, args);
    }

};


