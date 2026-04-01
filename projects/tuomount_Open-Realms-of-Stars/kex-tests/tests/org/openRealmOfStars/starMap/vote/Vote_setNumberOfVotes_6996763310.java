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

public class Vote_setNumberOfVotes_6996763310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9848;
     Object term9909;
     Object term9911;

    public Vote_setNumberOfVotes_6996763310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9914 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term9913 = ((Class) term9914).getDeclaredField((String) "GALACTIC_PEACE");
        ((Field) term9913).setAccessible(true);
        Object enum30 = ((Field) term9913).get((Object) null);
        Class<? extends Object> term10183 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term10182 = ((Class) term10183).getDeclaredField((String) "ABSTAIN");
        ((Field) term10182).setAccessible(true);
        Object enum31 = ((Field) term10182).get((Object) null);
        Class<? extends Object> term10476 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term10475 = ((Class) term10476).getDeclaredField((String) "VOTED_YES");
        ((Field) term10475).setAccessible(true);
        Object enum32 = ((Field) term10475).get((Object) null);
        term9848 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term9867 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 2);
        int[] term9892 = (int[]) newIntArray(1);
        setField(term9848, term9848.getClass(), "type", enum30);
        setElement(term9867, 0, enum31);
        setElement(term9867, 1, enum32);
        setField(term9848, term9848.getClass(), "choices", term9867);
        setIntElement(term9892, 0, 97029295);
        setField(term9848, term9848.getClass(), "numberOfVotes", term9892);
        setIntField(term9848, term9848.getClass(), "turnsToVote", -1371869594);
        setIntField(term9848, term9848.getClass(), "organizerIndex", -2095575670);
        setIntField(term9848, term9848.getClass(), "secondCandidateIndex", 1225272962);
        setField(term9848, term9848.getClass(), "planetName", "hRNSzYYIrc");
        term9909 = new Integer(1324040357);
        term9911 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9909;
        args[1] = term9911;
        callMethod(klass, "setNumberOfVotes", argTypes, term9848, args);
    }

};


