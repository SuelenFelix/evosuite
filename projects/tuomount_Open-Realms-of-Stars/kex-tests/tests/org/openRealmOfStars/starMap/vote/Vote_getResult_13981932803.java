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

public class Vote_getResult_13981932803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3071;
     Object term3130;

    public Vote_getResult_13981932803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3133 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term3132 = ((Class) term3133).getDeclaredField((String) "BAN_PRIVATEER_SHIPS");
        ((Field) term3132).setAccessible(true);
        Object enum9 = ((Field) term3132).get((Object) null);
        Class<? extends Object> term3417 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term3416 = ((Class) term3417).getDeclaredField((String) "VOTED_NO");
        ((Field) term3416).setAccessible(true);
        Object enum10 = ((Field) term3416).get((Object) null);
        term3071 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term3095 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 1);
        int[] term3108 = (int[]) newIntArray(6);
        setField(term3071, term3071.getClass(), "type", enum9);
        setElement(term3095, 0, enum10);
        setField(term3071, term3071.getClass(), "choices", term3095);
        setIntElement(term3108, 0, -1685132342);
        setIntElement(term3108, 1, -1456670397);
        setIntElement(term3108, 2, 1622346318);
        setIntElement(term3108, 3, 1048535127);
        setIntElement(term3108, 4, -655067527);
        setIntElement(term3108, 5, -6029667);
        setField(term3071, term3071.getClass(), "numberOfVotes", term3108);
        setIntField(term3071, term3071.getClass(), "turnsToVote", -2068769794);
        setIntField(term3071, term3071.getClass(), "organizerIndex", -117576464);
        setIntField(term3071, term3071.getClass(), "secondCandidateIndex", -1007160944);
        setField(term3071, term3071.getClass(), "planetName", "MuLcgQHgqz");
        term3130 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3130;
        callMethod(klass, "getResult", argTypes, term3071, args);
    }

};


