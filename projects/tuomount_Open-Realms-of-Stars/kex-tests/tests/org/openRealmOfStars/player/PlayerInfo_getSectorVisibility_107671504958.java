package org.openRealmOfStars.player;

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
import static org.openRealmOfStars.player.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlayerInfo_getSectorVisibility_107671504958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4751846;
     Object term4751855;
     Object term4751857;

    public PlayerInfo_getSectorVisibility_107671504958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4751846 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4751846, term4751846.getClass(), "race", null);
        setField(term4751846, term4751846.getClass(), "government", null);
        setIntField(term4751846, term4751846.getClass(), "warFatigue", 0);
        setField(term4751846, term4751846.getClass(), "empireName", null);
        setIntField(term4751846, term4751846.getClass(), "totalCredits", 0);
        setField(term4751846, term4751846.getClass(), "techList", null);
        setField(term4751846, term4751846.getClass(), "msgList", null);
        setField(term4751846, term4751846.getClass(), "shipStatList", null);
        setField(term4751846, term4751846.getClass(), "fleets", null);
        setField(term4751846, term4751846.getClass(), "mapData", null);
        setField(term4751846, term4751846.getClass(), "mapCloakDetection", null);
        setField(term4751846, term4751846.getClass(), "maxCoordinate", null);
        setBooleanField(term4751846, term4751846.getClass(), "human", false);
        setBooleanField(term4751846, term4751846.getClass(), "board", false);
        setField(term4751846, term4751846.getClass(), "missions", null);
        setField(term4751846, term4751846.getClass(), "diplomacy", null);
        setField(term4751846, term4751846.getClass(), "espionage", null);
        setIntField(term4751846, term4751846.getClass(), "fakeMilitarySize", 0);
        setField(term4751846, term4751846.getClass(), "attitude", null);
        setField(term4751846, term4751846.getClass(), "randomEventOccured", null);
        setField(term4751846, term4751846.getClass(), "strategy", null);
        setBooleanField(term4751846, term4751846.getClass(), "elderRealm", false);
        setField(term4751846, term4751846.getClass(), "leaderPool", null);
        setField(term4751846, term4751846.getClass(), "leaderRecruitPool", null);
        setField(term4751846, term4751846.getClass(), "ruler", null);
        setField(term4751846, term4751846.getClass(), "color", null);
        setField(term4751846, term4751846.getClass(), "interceptableFleets", null);
        setField(term4751846, term4751846.getClass(), "centerRealm", null);
        setField(term4751846, term4751846.getClass(), "bestPlanetForTechWorld", null);
        setField(term4751846, term4751846.getClass(), "aiDifficulty", null);
        setField(term4751846, term4751846.getClass(), "artifactLists", null);
        setBooleanField(term4751846, term4751846.getClass(), "realmLost", false);
        setField(term4751846, term4751846.getClass(), "backgroundStory", null);
        setBooleanField(term4751846, term4751846.getClass(), "enemyShipsDetected", false);
        setField(term4751846, term4751846.getClass(), "startingScenario", null);
        term4751855 = new Integer(0);
        term4751857 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4751855;
        args[1] = term4751857;
        callMethod(klass, "getSectorVisibility", argTypes, term4751846, args);
    }

};


