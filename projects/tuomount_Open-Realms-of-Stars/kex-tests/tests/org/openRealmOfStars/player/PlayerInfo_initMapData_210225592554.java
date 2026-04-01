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

public class PlayerInfo_initMapData_210225592554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4732087;
     Object term4732096;
     Object term4732098;

    public PlayerInfo_initMapData_210225592554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4732087 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4732087, term4732087.getClass(), "race", null);
        setField(term4732087, term4732087.getClass(), "government", null);
        setIntField(term4732087, term4732087.getClass(), "warFatigue", 0);
        setField(term4732087, term4732087.getClass(), "empireName", null);
        setIntField(term4732087, term4732087.getClass(), "totalCredits", 0);
        setField(term4732087, term4732087.getClass(), "techList", null);
        setField(term4732087, term4732087.getClass(), "msgList", null);
        setField(term4732087, term4732087.getClass(), "shipStatList", null);
        setField(term4732087, term4732087.getClass(), "fleets", null);
        setField(term4732087, term4732087.getClass(), "mapData", null);
        setField(term4732087, term4732087.getClass(), "mapCloakDetection", null);
        setField(term4732087, term4732087.getClass(), "maxCoordinate", null);
        setBooleanField(term4732087, term4732087.getClass(), "human", false);
        setBooleanField(term4732087, term4732087.getClass(), "board", false);
        setField(term4732087, term4732087.getClass(), "missions", null);
        setField(term4732087, term4732087.getClass(), "diplomacy", null);
        setField(term4732087, term4732087.getClass(), "espionage", null);
        setIntField(term4732087, term4732087.getClass(), "fakeMilitarySize", 0);
        setField(term4732087, term4732087.getClass(), "attitude", null);
        setField(term4732087, term4732087.getClass(), "randomEventOccured", null);
        setField(term4732087, term4732087.getClass(), "strategy", null);
        setBooleanField(term4732087, term4732087.getClass(), "elderRealm", false);
        setField(term4732087, term4732087.getClass(), "leaderPool", null);
        setField(term4732087, term4732087.getClass(), "leaderRecruitPool", null);
        setField(term4732087, term4732087.getClass(), "ruler", null);
        setField(term4732087, term4732087.getClass(), "color", null);
        setField(term4732087, term4732087.getClass(), "interceptableFleets", null);
        setField(term4732087, term4732087.getClass(), "centerRealm", null);
        setField(term4732087, term4732087.getClass(), "bestPlanetForTechWorld", null);
        setField(term4732087, term4732087.getClass(), "aiDifficulty", null);
        setField(term4732087, term4732087.getClass(), "artifactLists", null);
        setBooleanField(term4732087, term4732087.getClass(), "realmLost", false);
        setField(term4732087, term4732087.getClass(), "backgroundStory", null);
        setBooleanField(term4732087, term4732087.getClass(), "enemyShipsDetected", false);
        setField(term4732087, term4732087.getClass(), "startingScenario", null);
        term4732096 = new Integer(0);
        term4732098 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4732096;
        args[1] = term4732098;
        callMethod(klass, "initMapData", argTypes, term4732087, args);
    }

};


