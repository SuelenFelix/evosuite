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

public class Vote_getTurnsToVote_6831235456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5024;

    public Vote_getTurnsToVote_6831235456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5123 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term5122 = ((Class) term5123).getDeclaredField((String) "TAXATION_OF_RICHEST_REALM");
        ((Field) term5122).setAccessible(true);
        Object enum15 = ((Field) term5122).get((Object) null);
        Class<? extends Object> term5425 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term5424 = ((Class) term5425).getDeclaredField((String) "VOTED_NO");
        ((Field) term5424).setAccessible(true);
        Object enum16 = ((Field) term5424).get((Object) null);
        Class<? extends Object> term5721 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term5720 = ((Class) term5721).getDeclaredField((String) "VOTED_YES");
        ((Field) term5720).setAccessible(true);
        Object enum17 = ((Field) term5720).get((Object) null);
        Class<? extends Object> term6020 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term6019 = ((Class) term6020).getDeclaredField((String) "NOT_VOTED");
        ((Field) term6019).setAccessible(true);
        Object enum18 = ((Field) term6019).get((Object) null);
        Class<? extends Object> term6319 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term6318 = ((Class) term6319).getDeclaredField((String) "ABSTAIN");
        ((Field) term6318).setAccessible(true);
        Object enum19 = ((Field) term6318).get((Object) null);
        term5024 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term5054 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term5104 = (int[]) newIntArray(2);
        setField(term5024, term5024.getClass(), "type", enum15);
        setElement(term5054, 0, enum16);
        setElement(term5054, 1, enum16);
        setElement(term5054, 2, enum17);
        setElement(term5054, 3, enum18);
        setElement(term5054, 4, enum19);
        setField(term5024, term5024.getClass(), "choices", term5054);
        setIntElement(term5104, 0, -1087774327);
        setIntElement(term5104, 1, -1530420153);
        setField(term5024, term5024.getClass(), "numberOfVotes", term5104);
        setIntField(term5024, term5024.getClass(), "turnsToVote", -469968304);
        setIntField(term5024, term5024.getClass(), "organizerIndex", -1145578966);
        setIntField(term5024, term5024.getClass(), "secondCandidateIndex", 679763016);
        setField(term5024, term5024.getClass(), "planetName", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurnsToVote", argTypes, term5024, args);
    }

};


