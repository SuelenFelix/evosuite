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

public class Vote_getPlanetName_73611249817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19598;

    public Vote_getPlanetName_73611249817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19661 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term19660 = ((Class) term19661).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term19660).setAccessible(true);
        Object enum58 = ((Field) term19660).get((Object) null);
        Class<? extends Object> term19933 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term19932 = ((Class) term19933).getDeclaredField((String) "ABSTAIN");
        ((Field) term19932).setAccessible(true);
        Object enum59 = ((Field) term19932).get((Object) null);
        Class<? extends Object> term20226 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term20225 = ((Class) term20226).getDeclaredField((String) "NOT_VOTED");
        ((Field) term20225).setAccessible(true);
        Object enum60 = ((Field) term20225).get((Object) null);
        term19598 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term19618 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 4);
        int[] term19643 = (int[]) newIntArray(1);
        setField(term19598, term19598.getClass(), "type", enum58);
        setElement(term19618, 0, enum59);
        setElement(term19618, 1, enum59);
        setElement(term19618, 2, enum60);
        setElement(term19618, 3, enum60);
        setField(term19598, term19598.getClass(), "choices", term19618);
        setIntElement(term19643, 0, -1497710478);
        setField(term19598, term19598.getClass(), "numberOfVotes", term19643);
        setIntField(term19598, term19598.getClass(), "turnsToVote", 49950830);
        setIntField(term19598, term19598.getClass(), "organizerIndex", -525257914);
        setIntField(term19598, term19598.getClass(), "secondCandidateIndex", 147209682);
        setField(term19598, term19598.getClass(), "planetName", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetName", argTypes, term19598, args);
    }

};


