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

public class Vote_setOrganizerIndex_37237815916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18345;
     Object term18420;

    public Vote_setOrganizerIndex_37237815916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18423 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term18422 = ((Class) term18423).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term18422).setAccessible(true);
        Object enum54 = ((Field) term18422).get((Object) null);
        Class<? extends Object> term18695 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term18694 = ((Class) term18695).getDeclaredField((String) "VOTED_YES");
        ((Field) term18694).setAccessible(true);
        Object enum55 = ((Field) term18694).get((Object) null);
        Class<? extends Object> term18994 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term18993 = ((Class) term18994).getDeclaredField((String) "NOT_VOTED");
        ((Field) term18993).setAccessible(true);
        Object enum56 = ((Field) term18993).get((Object) null);
        Class<? extends Object> term19293 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term19292 = ((Class) term19293).getDeclaredField((String) "VOTED_NO");
        ((Field) term19292).setAccessible(true);
        Object enum57 = ((Field) term19292).get((Object) null);
        term18345 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term18365 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 8);
        int[] term18404 = (int[]) newIntArray(0);
        setField(term18345, term18345.getClass(), "type", enum54);
        setElement(term18365, 0, enum55);
        setElement(term18365, 1, enum55);
        setElement(term18365, 2, enum56);
        setElement(term18365, 3, enum57);
        setElement(term18365, 4, enum57);
        setElement(term18365, 5, enum55);
        setElement(term18365, 6, enum55);
        setElement(term18365, 7, enum57);
        setField(term18345, term18345.getClass(), "choices", term18365);
        setField(term18345, term18345.getClass(), "numberOfVotes", term18404);
        setIntField(term18345, term18345.getClass(), "turnsToVote", -282881827);
        setIntField(term18345, term18345.getClass(), "organizerIndex", -1183353915);
        setIntField(term18345, term18345.getClass(), "secondCandidateIndex", -420030135);
        setField(term18345, term18345.getClass(), "planetName", "RkybSrpybU");
        term18420 = new Integer(267763294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term18420;
        callMethod(klass, "setOrganizerIndex", argTypes, term18345, args);
    }

};


