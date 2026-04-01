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

public class Vote_getNumberOfVotes_99368619911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10785;
     Object term10878;

    public Vote_getNumberOfVotes_99368619911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10881 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term10880 = ((Class) term10881).getDeclaredField((String) "BAN_NUCLEAR_WEAPONS");
        ((Field) term10880).setAccessible(true);
        Object enum33 = ((Field) term10880).get((Object) null);
        Class<? extends Object> term11165 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term11164 = ((Class) term11165).getDeclaredField((String) "VOTED_NO");
        ((Field) term11164).setAccessible(true);
        Object enum34 = ((Field) term11164).get((Object) null);
        Class<? extends Object> term11461 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term11460 = ((Class) term11461).getDeclaredField((String) "ABSTAIN");
        ((Field) term11460).setAccessible(true);
        Object enum35 = ((Field) term11460).get((Object) null);
        Class<? extends Object> term11754 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term11753 = ((Class) term11754).getDeclaredField((String) "NOT_VOTED");
        ((Field) term11753).setAccessible(true);
        Object enum36 = ((Field) term11753).get((Object) null);
        Class<? extends Object> term12053 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term12052 = ((Class) term12053).getDeclaredField((String) "VOTED_YES");
        ((Field) term12052).setAccessible(true);
        Object enum37 = ((Field) term12052).get((Object) null);
        term10785 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term10809 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 9);
        int[] term10859 = (int[]) newIntArray(3);
        setField(term10785, term10785.getClass(), "type", enum33);
        setElement(term10809, 0, enum34);
        setElement(term10809, 1, enum34);
        setElement(term10809, 2, enum35);
        setElement(term10809, 3, enum34);
        setElement(term10809, 4, enum36);
        setElement(term10809, 5, enum37);
        setElement(term10809, 6, enum36);
        setElement(term10809, 7, enum35);
        setElement(term10809, 8, enum35);
        setField(term10785, term10785.getClass(), "choices", term10809);
        setIntElement(term10859, 0, -93135961);
        setIntElement(term10859, 1, -112921587);
        setIntElement(term10859, 2, 933028652);
        setField(term10785, term10785.getClass(), "numberOfVotes", term10859);
        setIntField(term10785, term10785.getClass(), "turnsToVote", 287287233);
        setIntField(term10785, term10785.getClass(), "organizerIndex", 962840079);
        setIntField(term10785, term10785.getClass(), "secondCandidateIndex", 1540719661);
        setField(term10785, term10785.getClass(), "planetName", "RMFIsYGgne");
        term10878 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10878;
        callMethod(klass, "getNumberOfVotes", argTypes, term10785, args);
    }

};


