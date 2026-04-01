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

public class AITurnView_handleOlympicDiplomacyBonus_76968166658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1280528;
     Object term1280571;

    public AITurnView_handleOlympicDiplomacyBonus_76968166658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1280578 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term1280577 = ((Class) term1280578).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term1280577).setAccessible(true);
        Object enum2599 = ((Field) term1280577).get((Object) null);
        term1280528 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term1280548 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 0);
        int[] term1280549 = (int[]) newIntArray(6);
        setField(term1280528, term1280528.getClass(), "type", enum2599);
        setField(term1280528, term1280528.getClass(), "choices", term1280548);
        setIntElement(term1280549, 0, -1622152715);
        setIntElement(term1280549, 1, -205594356);
        setIntElement(term1280549, 2, 678056629);
        setIntElement(term1280549, 3, 1559109983);
        setIntElement(term1280549, 4, -829444841);
        setIntElement(term1280549, 5, -2074246809);
        setField(term1280528, term1280528.getClass(), "numberOfVotes", term1280549);
        setIntField(term1280528, term1280528.getClass(), "turnsToVote", 1942205813);
        setIntField(term1280528, term1280528.getClass(), "organizerIndex", -785227692);
        setIntField(term1280528, term1280528.getClass(), "secondCandidateIndex", -891853241);
        setField(term1280528, term1280528.getClass(), "planetName", "zsxyMqglRP");
        ArrayList term1280572 = new ArrayList();
        term1280571 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1280571, term1280571.getClass(), "list", term1280572);
        setIntField(term1280571, term1280571.getClass(), "currentPlayer", 714477483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1280528;
        args[1] = term1280571;
        callMethod(klass, "handleOlympicDiplomacyBonus", argTypes, null, args);
    }

};


