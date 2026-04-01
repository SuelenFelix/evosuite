package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class AITurnView_handlePromises_90390911053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268829;
     Object term1268923;

    public AITurnView_handlePromises_90390911053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1268930 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term1268929 = ((Class) term1268930).getDeclaredField((String) "SECOND_CANDIDATE");
        ((Field) term1268929).setAccessible(true);
        Object enum2564 = ((Field) term1268929).get((Object) null);
        Class<? extends Object> term1269205 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1269204 = ((Class) term1269205).getDeclaredField((String) "VOTED_YES");
        ((Field) term1269204).setAccessible(true);
        Object enum2565 = ((Field) term1269204).get((Object) null);
        Class<? extends Object> term1269504 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1269503 = ((Class) term1269504).getDeclaredField((String) "NOT_VOTED");
        ((Field) term1269503).setAccessible(true);
        Object enum2566 = ((Field) term1269503).get((Object) null);
        Class<? extends Object> term1269803 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1269802 = ((Class) term1269803).getDeclaredField((String) "VOTED_NO");
        ((Field) term1269802).setAccessible(true);
        Object enum2567 = ((Field) term1269802).get((Object) null);
        Class<? extends Object> term1270099 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1270098 = ((Class) term1270099).getDeclaredField((String) "ABSTAIN");
        ((Field) term1270098).setAccessible(true);
        Object enum2568 = ((Field) term1270098).get((Object) null);
        term1268829 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term1268850 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 9);
        int[] term1268900 = (int[]) newIntArray(7);
        setField(term1268829, term1268829.getClass(), "type", enum2564);
        setElement(term1268850, 0, enum2565);
        setElement(term1268850, 1, enum2566);
        setElement(term1268850, 2, enum2567);
        setElement(term1268850, 3, enum2568);
        setElement(term1268850, 4, enum2567);
        setElement(term1268850, 5, enum2567);
        setElement(term1268850, 6, enum2565);
        setElement(term1268850, 7, enum2567);
        setElement(term1268850, 8, enum2565);
        setField(term1268829, term1268829.getClass(), "choices", term1268850);
        setIntElement(term1268900, 0, 1596168275);
        setIntElement(term1268900, 1, 791111126);
        setIntElement(term1268900, 2, -861509354);
        setIntElement(term1268900, 3, 575736309);
        setIntElement(term1268900, 4, -80996546);
        setIntElement(term1268900, 5, -723344903);
        setIntElement(term1268900, 6, -1694538425);
        setField(term1268829, term1268829.getClass(), "numberOfVotes", term1268900);
        setIntField(term1268829, term1268829.getClass(), "turnsToVote", -1583996581);
        setIntField(term1268829, term1268829.getClass(), "organizerIndex", 894201089);
        setIntField(term1268829, term1268829.getClass(), "secondCandidateIndex", -1774723195);
        setField(term1268829, term1268829.getClass(), "planetName", "phtszNASMI");
        ArrayList term1268924 = new ArrayList();
        term1268923 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1268923, term1268923.getClass(), "list", term1268924);
        setIntField(term1268923, term1268923.getClass(), "currentPlayer", 1112199407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1268829;
        args[1] = term1268923;
        callMethod(klass, "handlePromises", argTypes, null, args);
    }

};


