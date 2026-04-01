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

public class Vote_setChoice_19911165328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7598;
     Object term7650;
     Object enum24;

    public Vote_setChoice_19911165328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7664 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term7663 = ((Class) term7664).getDeclaredField((String) "GALACTIC_OLYMPIC_PARTICIPATE");
        ((Field) term7663).setAccessible(true);
        Object enum23 = ((Field) term7663).get((Object) null);
        term7598 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term7631 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 0);
        int[] term7632 = (int[]) newIntArray(2);
        setField(term7598, term7598.getClass(), "type", enum23);
        setField(term7598, term7598.getClass(), "choices", term7631);
        setIntElement(term7632, 0, -817164822);
        setIntElement(term7632, 1, -1016503459);
        setField(term7598, term7598.getClass(), "numberOfVotes", term7632);
        setIntField(term7598, term7598.getClass(), "turnsToVote", -1968847291);
        setIntField(term7598, term7598.getClass(), "organizerIndex", 579005622);
        setIntField(term7598, term7598.getClass(), "secondCandidateIndex", -14890619);
        setField(term7598, term7598.getClass(), "planetName", "SzjVpOQTyS");
        term7650 = new Integer(1632125673);
        Class<? extends Object> term7987 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term7986 = ((Class) term7987).getDeclaredField((String) "ABSTAIN");
        ((Field) term7986).setAccessible(true);
        enum24 = ((Field) term7986).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Object[] args = new Object[2];
        args[0] = term7650;
        args[1] = enum24;
        callMethod(klass, "setChoice", argTypes, term7598, args);
    }

};


