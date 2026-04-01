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

public class Vote_setPlanetName_71360863018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20535;

    public Vote_setPlanetName_71360863018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20599 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term20598 = ((Class) term20599).getDeclaredField((String) "GALACTIC_OLYMPIC_PARTICIPATE");
        ((Field) term20598).setAccessible(true);
        Object enum61 = ((Field) term20598).get((Object) null);
        term20535 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term20568 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 0);
        int[] term20569 = (int[]) newIntArray(1);
        setField(term20535, term20535.getClass(), "type", enum61);
        setField(term20535, term20535.getClass(), "choices", term20568);
        setIntElement(term20569, 0, 34470066);
        setField(term20535, term20535.getClass(), "numberOfVotes", term20569);
        setIntField(term20535, term20535.getClass(), "turnsToVote", 2058711405);
        setIntField(term20535, term20535.getClass(), "organizerIndex", 1743683601);
        setIntField(term20535, term20535.getClass(), "secondCandidateIndex", -945116798);
        setField(term20535, term20535.getClass(), "planetName", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setPlanetName", argTypes, term20535, args);
    }

};


