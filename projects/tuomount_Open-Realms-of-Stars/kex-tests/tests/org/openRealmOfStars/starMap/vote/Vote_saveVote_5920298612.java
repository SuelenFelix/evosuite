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

public class Vote_saveVote_5920298612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12364;
     Object term12469;

    public Vote_saveVote_5920298612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12484 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term12483 = ((Class) term12484).getDeclaredField((String) "GALACTIC_OLYMPIC_PARTICIPATE");
        ((Field) term12483).setAccessible(true);
        Object enum38 = ((Field) term12483).get((Object) null);
        Class<? extends Object> term12795 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term12794 = ((Class) term12795).getDeclaredField((String) "VOTED_YES");
        ((Field) term12794).setAccessible(true);
        Object enum39 = ((Field) term12794).get((Object) null);
        Class<? extends Object> term13094 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term13093 = ((Class) term13094).getDeclaredField((String) "ABSTAIN");
        ((Field) term13093).setAccessible(true);
        Object enum40 = ((Field) term13093).get((Object) null);
        Class<? extends Object> term13387 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term13386 = ((Class) term13387).getDeclaredField((String) "VOTED_NO");
        ((Field) term13386).setAccessible(true);
        Object enum41 = ((Field) term13386).get((Object) null);
        Class<? extends Object> term13683 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term13682 = ((Class) term13683).getDeclaredField((String) "NOT_VOTED");
        ((Field) term13682).setAccessible(true);
        Object enum42 = ((Field) term13682).get((Object) null);
        term12364 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term12397 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term12447 = (int[]) newIntArray(6);
        setField(term12364, term12364.getClass(), "type", enum38);
        setElement(term12397, 0, enum39);
        setElement(term12397, 1, enum40);
        setElement(term12397, 2, enum40);
        setElement(term12397, 3, enum41);
        setElement(term12397, 4, enum42);
        setField(term12364, term12364.getClass(), "choices", term12397);
        setIntElement(term12447, 0, 335112684);
        setIntElement(term12447, 1, 1551099402);
        setIntElement(term12447, 2, -2027534003);
        setIntElement(term12447, 3, 1063420942);
        setIntElement(term12447, 4, 1375330971);
        setIntElement(term12447, 5, -478195677);
        setField(term12364, term12364.getClass(), "numberOfVotes", term12447);
        setIntField(term12364, term12364.getClass(), "turnsToVote", 972867650);
        setIntField(term12364, term12364.getClass(), "organizerIndex", 1655935355);
        setIntField(term12364, term12364.getClass(), "secondCandidateIndex", -481533957);
        setField(term12364, term12364.getClass(), "planetName", "NRdvgJlhkX");
        term12469 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term12471 = (byte[]) newByteArray(5);
        byte[] term12477 = (byte[]) newByteArray(3);
        Object term12482 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term12469, term12469.getClass(), "written", 1240914516);
        setByteElement(term12471, 0, (byte) 79);
        setByteElement(term12471, 1, (byte) -119);
        setByteElement(term12471, 2, (byte) -66);
        setByteElement(term12471, 3, (byte) 83);
        setByteElement(term12471, 4, (byte) 74);
        setField(term12469, term12469.getClass(), "bytearr", term12471);
        setByteElement(term12477, 0, (byte) -71);
        setByteElement(term12477, 1, (byte) 49);
        setByteElement(term12477, 2, (byte) -54);
        setField(term12469, term12469.getClass(), "writeBuffer", term12477);
        setField(term12469, term12469.getClass(), "out", null);
        setBooleanField(term12469, term12469.getClass(), "closed", false);
        setField(term12469, term12469.getClass(), "closeLock", term12482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term12469;
        callMethod(klass, "saveVote", argTypes, term12364, args);
    }

};


