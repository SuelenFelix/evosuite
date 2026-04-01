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

public class Vote_getType_4976838345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;

    public Vote_getType_4976838345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3847 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term3846 = ((Class) term3847).getDeclaredField((String) "RULER_OF_GALAXY");
        ((Field) term3846).setAccessible(true);
        Object enum11 = ((Field) term3846).get((Object) null);
        Class<? extends Object> term4119 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term4118 = ((Class) term4119).getDeclaredField((String) "VOTED_YES");
        ((Field) term4118).setAccessible(true);
        Object enum12 = ((Field) term4118).get((Object) null);
        Class<? extends Object> term4418 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term4417 = ((Class) term4418).getDeclaredField((String) "ABSTAIN");
        ((Field) term4417).setAccessible(true);
        Object enum13 = ((Field) term4417).get((Object) null);
        Class<? extends Object> term4711 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term4710 = ((Class) term4711).getDeclaredField((String) "NOT_VOTED");
        ((Field) term4710).setAccessible(true);
        Object enum14 = ((Field) term4710).get((Object) null);
        term3767 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term3787 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 6);
        int[] term3825 = (int[]) newIntArray(5);
        setField(term3767, term3767.getClass(), "type", enum11);
        setElement(term3787, 0, enum12);
        setElement(term3787, 1, enum13);
        setElement(term3787, 2, enum12);
        setElement(term3787, 3, enum13);
        setElement(term3787, 4, enum12);
        setElement(term3787, 5, enum14);
        setField(term3767, term3767.getClass(), "choices", term3787);
        setIntElement(term3825, 0, 865208305);
        setIntElement(term3825, 1, -1275173084);
        setIntElement(term3825, 2, -244121226);
        setIntElement(term3825, 3, -203030934);
        setIntElement(term3825, 4, -1179120542);
        setField(term3767, term3767.getClass(), "numberOfVotes", term3825);
        setIntField(term3767, term3767.getClass(), "turnsToVote", -73683645);
        setIntField(term3767, term3767.getClass(), "organizerIndex", -226514366);
        setIntField(term3767, term3767.getClass(), "secondCandidateIndex", 1193880199);
        setField(term3767, term3767.getClass(), "planetName", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3767, args);
    }

};


