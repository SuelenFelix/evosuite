package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NewsFactory_createVotingString_38109528596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861267;
     Object term861367;

    public NewsFactory_createVotingString_38109528596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term861417 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term861416 = ((Class) term861417).getDeclaredField((String) "TAXATION_OF_RICHEST_REALM");
        ((Field) term861416).setAccessible(true);
        Object enum2605 = ((Field) term861416).get((Object) null);
        Class<? extends Object> term861719 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term861718 = ((Class) term861719).getDeclaredField((String) "VOTED_YES");
        ((Field) term861718).setAccessible(true);
        Object enum2606 = ((Field) term861718).get((Object) null);
        Class<? extends Object> term862018 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term862017 = ((Class) term862018).getDeclaredField((String) "ABSTAIN");
        ((Field) term862017).setAccessible(true);
        Object enum2607 = ((Field) term862017).get((Object) null);
        Class<? extends Object> term862311 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term862310 = ((Class) term862311).getDeclaredField((String) "VOTED_NO");
        ((Field) term862310).setAccessible(true);
        Object enum2608 = ((Field) term862310).get((Object) null);
        Class<? extends Object> term862607 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term862606 = ((Class) term862607).getDeclaredField((String) "NOT_VOTED");
        ((Field) term862606).setAccessible(true);
        Object enum2609 = ((Field) term862606).get((Object) null);
        term861267 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term861297 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 7);
        int[] term861347 = (int[]) newIntArray(4);
        setField(term861267, term861267.getClass(), "type", enum2605);
        setElement(term861297, 0, enum2606);
        setElement(term861297, 1, enum2607);
        setElement(term861297, 2, enum2608);
        setElement(term861297, 3, enum2608);
        setElement(term861297, 4, enum2607);
        setElement(term861297, 5, enum2607);
        setElement(term861297, 6, enum2609);
        setField(term861267, term861267.getClass(), "choices", term861297);
        setIntElement(term861347, 0, 1658363147);
        setIntElement(term861347, 1, -1956877320);
        setIntElement(term861347, 2, -1179198829);
        setIntElement(term861347, 3, 1876139529);
        setField(term861267, term861267.getClass(), "numberOfVotes", term861347);
        setIntField(term861267, term861267.getClass(), "turnsToVote", 372209440);
        setIntField(term861267, term861267.getClass(), "organizerIndex", -1365993688);
        setIntField(term861267, term861267.getClass(), "secondCandidateIndex", -1302807664);
        setField(term861267, term861267.getClass(), "planetName", "MOYoyeXpoY");
        term861367 = (Object[]) newArray("java.lang.String", 4);
        setElement(term861367, 0, "nUjcaDejNf");
        setElement(term861367, 1, "gqUUkfoDNJ");
        setElement(term861367, 2, "BJTnoWygQe");
        setElement(term861367, 3, "GEcbgzxNuT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term861267;
        args[1] = term861367;
        callMethod(klass, "createVotingString", argTypes, null, args);
    }

};


