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

public class AITurnView_handleOlympicDiplomacyBonus_76968166655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328448;
     Object term1328531;

    public AITurnView_handleOlympicDiplomacyBonus_76968166655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1328538 = Class.forName((String) "org.openRealmOfStars.starMap.vote.VotingType");
        Field term1328537 = ((Class) term1328538).getDeclaredField((String) "FIRST_CANDIDATE");
        ((Field) term1328537).setAccessible(true);
        Object enum2715 = ((Field) term1328537).get((Object) null);
        Class<? extends Object> term1328810 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1328809 = ((Class) term1328810).getDeclaredField((String) "ABSTAIN");
        ((Field) term1328809).setAccessible(true);
        Object enum2716 = ((Field) term1328809).get((Object) null);
        Class<? extends Object> term1329103 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1329102 = ((Class) term1329103).getDeclaredField((String) "VOTED_YES");
        ((Field) term1329102).setAccessible(true);
        Object enum2717 = ((Field) term1329102).get((Object) null);
        Class<? extends Object> term1329402 = Class.forName((String) "org.openRealmOfStars.starMap.vote.sports.VotingChoice");
        Field term1329401 = ((Class) term1329402).getDeclaredField((String) "NOT_VOTED");
        ((Field) term1329401).setAccessible(true);
        Object enum2718 = ((Field) term1329401).get((Object) null);
        term1328448 = newInstance(Class.forName("org.openRealmOfStars.starMap.vote.Vote"));
        Object[] term1328468 = (Object[]) newArray("org.openRealmOfStars.starMap.vote.sports.VotingChoice", 3);
        int[] term1328506 = (int[]) newIntArray(9);
        setField(term1328448, term1328448.getClass(), "type", enum2715);
        setElement(term1328468, 0, enum2716);
        setElement(term1328468, 1, enum2717);
        setElement(term1328468, 2, enum2718);
        setField(term1328448, term1328448.getClass(), "choices", term1328468);
        setIntElement(term1328506, 0, 584778052);
        setIntElement(term1328506, 1, -1035190912);
        setIntElement(term1328506, 2, -114899406);
        setIntElement(term1328506, 3, 1981135159);
        setIntElement(term1328506, 4, 1995986979);
        setIntElement(term1328506, 5, 618309718);
        setIntElement(term1328506, 6, -961959581);
        setIntElement(term1328506, 7, 110353393);
        setIntElement(term1328506, 8, -1223746072);
        setField(term1328448, term1328448.getClass(), "numberOfVotes", term1328506);
        setIntField(term1328448, term1328448.getClass(), "turnsToVote", 1603798718);
        setIntField(term1328448, term1328448.getClass(), "organizerIndex", 539468613);
        setIntField(term1328448, term1328448.getClass(), "secondCandidateIndex", -1011658280);
        setField(term1328448, term1328448.getClass(), "planetName", "WUuRozzhRI");
        ArrayList term1328532 = new ArrayList();
        term1328531 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term1328531, term1328531.getClass(), "list", term1328532);
        setIntField(term1328531, term1328531.getClass(), "currentPlayer", 1675784185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term1328448;
        args[1] = term1328531;
        callMethod(klass, "handleOlympicDiplomacyBonus", argTypes, null, args);
    }

};


