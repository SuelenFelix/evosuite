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

public class PlayerInfo_setSectorCloakingDetection_197503292664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4776800;
     Object term4776809;
     Object term4776811;
     Object term4776813;

    public PlayerInfo_setSectorCloakingDetection_197503292664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4776800 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4776800, term4776800.getClass(), "race", null);
        setField(term4776800, term4776800.getClass(), "government", null);
        setIntField(term4776800, term4776800.getClass(), "warFatigue", 0);
        setField(term4776800, term4776800.getClass(), "empireName", null);
        setIntField(term4776800, term4776800.getClass(), "totalCredits", 0);
        setField(term4776800, term4776800.getClass(), "techList", null);
        setField(term4776800, term4776800.getClass(), "msgList", null);
        setField(term4776800, term4776800.getClass(), "shipStatList", null);
        setField(term4776800, term4776800.getClass(), "fleets", null);
        setField(term4776800, term4776800.getClass(), "mapData", null);
        setField(term4776800, term4776800.getClass(), "mapCloakDetection", null);
        setField(term4776800, term4776800.getClass(), "maxCoordinate", null);
        setBooleanField(term4776800, term4776800.getClass(), "human", false);
        setBooleanField(term4776800, term4776800.getClass(), "board", false);
        setField(term4776800, term4776800.getClass(), "missions", null);
        setField(term4776800, term4776800.getClass(), "diplomacy", null);
        setField(term4776800, term4776800.getClass(), "espionage", null);
        setIntField(term4776800, term4776800.getClass(), "fakeMilitarySize", 0);
        setField(term4776800, term4776800.getClass(), "attitude", null);
        setField(term4776800, term4776800.getClass(), "randomEventOccured", null);
        setField(term4776800, term4776800.getClass(), "strategy", null);
        setBooleanField(term4776800, term4776800.getClass(), "elderRealm", false);
        setField(term4776800, term4776800.getClass(), "leaderPool", null);
        setField(term4776800, term4776800.getClass(), "leaderRecruitPool", null);
        setField(term4776800, term4776800.getClass(), "ruler", null);
        setField(term4776800, term4776800.getClass(), "color", null);
        setField(term4776800, term4776800.getClass(), "interceptableFleets", null);
        setField(term4776800, term4776800.getClass(), "centerRealm", null);
        setField(term4776800, term4776800.getClass(), "bestPlanetForTechWorld", null);
        setField(term4776800, term4776800.getClass(), "aiDifficulty", null);
        setField(term4776800, term4776800.getClass(), "artifactLists", null);
        setBooleanField(term4776800, term4776800.getClass(), "realmLost", false);
        setField(term4776800, term4776800.getClass(), "backgroundStory", null);
        setBooleanField(term4776800, term4776800.getClass(), "enemyShipsDetected", false);
        setField(term4776800, term4776800.getClass(), "startingScenario", null);
        term4776809 = new Integer(0);
        term4776811 = new Integer(0);
        term4776813 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4776809;
        args[1] = term4776811;
        args[2] = term4776813;
        callMethod(klass, "setSectorCloakingDetection", argTypes, term4776800, args);
    }

};


