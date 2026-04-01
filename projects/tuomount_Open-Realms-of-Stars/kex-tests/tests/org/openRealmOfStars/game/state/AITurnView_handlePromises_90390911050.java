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

public class AITurnView_handlePromises_90390911050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1318110;
     Object term1318185;

    public AITurnView_handlePromises_90390911050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1318192 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term1318191 = ((Class) term1318192).getDeclaredField((String) "SECOND_CANDIDATE");
        ((Field) term1318191).setAccessible(true);
        Object enum2684 = ((Field) term1318191).get((Object) null);
        Class<? extends Object> term1318467 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1318466 = ((Class) term1318467).getDeclaredField((String) "VOTED_YES");
        ((Field) term1318466).setAccessible(true);
        Object enum2685 = ((Field) term1318466).get((Object) null);
        Class<? extends Object> term1318766 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1318765 = ((Class) term1318766).getDeclaredField((String) "VOTED_NO");
        ((Field) term1318765).setAccessible(true);
        Object enum2686 = ((Field) term1318765).get((Object) null);
        Class<? extends Object> term1319062 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1319061 = ((Class) term1319062).getDeclaredField((String) "ABSTAIN");
        ((Field) term1319061).setAccessible(true);
        Object enum2687 = ((Field) term1319061).get((Object) null);
        term1318110 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term1318131 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 5);
        int[] term1318168 = (int[]) newIntArray(1);
        setField(term1318110, term1318110.getClass(), "type", enum2684);
        setElement(term1318131, 0, enum2685);
        setElement(term1318131, 1, enum2686);
        setElement(term1318131, 2, enum2685);
        setElement(term1318131, 3, enum2687);
        setElement(term1318131, 4, enum2685);
        setField(term1318110, term1318110.getClass(), "choices", term1318131);
        setIntElement(term1318168, 0, 2107367190);
        setField(term1318110, term1318110.getClass(), "numberOfVotes", term1318168);
        setIntField(term1318110, term1318110.getClass(), "turnsToVote", -2111064731);
        setIntField(term1318110, term1318110.getClass(), "organizerIndex", -157506467);
        setIntField(term1318110, term1318110.getClass(), "secondCandidateIndex", -972362325);
        setField(term1318110, term1318110.getClass(), "planetName", "cjnEGxpQyu");
        ArrayList term1318186 = new ArrayList();
        term1318185 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1318185, term1318185.getClass(), "list", term1318186);
        setIntField(term1318185, term1318185.getClass(), "currentPlayer", 1699217154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1318110;
        args[1] = term1318185;
        callMethod(klass, "handlePromises", argTypes, null, args);
    }

};


