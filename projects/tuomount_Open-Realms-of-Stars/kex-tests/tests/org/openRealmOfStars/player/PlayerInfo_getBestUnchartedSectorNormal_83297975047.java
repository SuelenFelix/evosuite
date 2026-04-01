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

public class PlayerInfo_getBestUnchartedSectorNormal_83297975047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4696869;

    public PlayerInfo_getBestUnchartedSectorNormal_83297975047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4696869 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4696869, term4696869.getClass(), "race", null);
        setField(term4696869, term4696869.getClass(), "government", null);
        setIntField(term4696869, term4696869.getClass(), "warFatigue", 0);
        setField(term4696869, term4696869.getClass(), "empireName", null);
        setIntField(term4696869, term4696869.getClass(), "totalCredits", 0);
        setField(term4696869, term4696869.getClass(), "techList", null);
        setField(term4696869, term4696869.getClass(), "msgList", null);
        setField(term4696869, term4696869.getClass(), "shipStatList", null);
        setField(term4696869, term4696869.getClass(), "fleets", null);
        setField(term4696869, term4696869.getClass(), "mapData", null);
        setField(term4696869, term4696869.getClass(), "mapCloakDetection", null);
        setField(term4696869, term4696869.getClass(), "maxCoordinate", null);
        setBooleanField(term4696869, term4696869.getClass(), "human", false);
        setBooleanField(term4696869, term4696869.getClass(), "board", false);
        setField(term4696869, term4696869.getClass(), "missions", null);
        setField(term4696869, term4696869.getClass(), "diplomacy", null);
        setField(term4696869, term4696869.getClass(), "espionage", null);
        setIntField(term4696869, term4696869.getClass(), "fakeMilitarySize", 0);
        setField(term4696869, term4696869.getClass(), "attitude", null);
        setField(term4696869, term4696869.getClass(), "randomEventOccured", null);
        setField(term4696869, term4696869.getClass(), "strategy", null);
        setBooleanField(term4696869, term4696869.getClass(), "elderRealm", false);
        setField(term4696869, term4696869.getClass(), "leaderPool", null);
        setField(term4696869, term4696869.getClass(), "leaderRecruitPool", null);
        setField(term4696869, term4696869.getClass(), "ruler", null);
        setField(term4696869, term4696869.getClass(), "color", null);
        setField(term4696869, term4696869.getClass(), "interceptableFleets", null);
        setField(term4696869, term4696869.getClass(), "centerRealm", null);
        setField(term4696869, term4696869.getClass(), "bestPlanetForTechWorld", null);
        setField(term4696869, term4696869.getClass(), "aiDifficulty", null);
        setField(term4696869, term4696869.getClass(), "artifactLists", null);
        setBooleanField(term4696869, term4696869.getClass(), "realmLost", false);
        setField(term4696869, term4696869.getClass(), "backgroundStory", null);
        setBooleanField(term4696869, term4696869.getClass(), "enemyShipsDetected", false);
        setField(term4696869, term4696869.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Sun");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getBestUnchartedSectorNormal", argTypes, term4696869, args);
    }

};


