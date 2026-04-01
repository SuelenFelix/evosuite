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

public class PlayerInfo_getUnchartedSector_645116905221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536903;

    public PlayerInfo_getUnchartedSector_645116905221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536903 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536903, term5536903.getClass(), "race", null);
        setField(term5536903, term5536903.getClass(), "government", null);
        setIntField(term5536903, term5536903.getClass(), "warFatigue", 0);
        setField(term5536903, term5536903.getClass(), "empireName", null);
        setIntField(term5536903, term5536903.getClass(), "totalCredits", 0);
        setField(term5536903, term5536903.getClass(), "techList", null);
        setField(term5536903, term5536903.getClass(), "msgList", null);
        setField(term5536903, term5536903.getClass(), "shipStatList", null);
        setField(term5536903, term5536903.getClass(), "fleets", null);
        setField(term5536903, term5536903.getClass(), "mapData", null);
        setField(term5536903, term5536903.getClass(), "mapCloakDetection", null);
        setField(term5536903, term5536903.getClass(), "maxCoordinate", null);
        setBooleanField(term5536903, term5536903.getClass(), "human", false);
        setBooleanField(term5536903, term5536903.getClass(), "board", false);
        setField(term5536903, term5536903.getClass(), "missions", null);
        setField(term5536903, term5536903.getClass(), "diplomacy", null);
        setField(term5536903, term5536903.getClass(), "espionage", null);
        setIntField(term5536903, term5536903.getClass(), "fakeMilitarySize", 0);
        setField(term5536903, term5536903.getClass(), "attitude", null);
        setField(term5536903, term5536903.getClass(), "randomEventOccured", null);
        setField(term5536903, term5536903.getClass(), "strategy", null);
        setBooleanField(term5536903, term5536903.getClass(), "elderRealm", false);
        setField(term5536903, term5536903.getClass(), "leaderPool", null);
        setField(term5536903, term5536903.getClass(), "leaderRecruitPool", null);
        setField(term5536903, term5536903.getClass(), "ruler", null);
        setField(term5536903, term5536903.getClass(), "color", null);
        setField(term5536903, term5536903.getClass(), "interceptableFleets", null);
        setField(term5536903, term5536903.getClass(), "centerRealm", null);
        setField(term5536903, term5536903.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536903, term5536903.getClass(), "aiDifficulty", null);
        setField(term5536903, term5536903.getClass(), "artifactLists", null);
        setBooleanField(term5536903, term5536903.getClass(), "realmLost", false);
        setField(term5536903, term5536903.getClass(), "backgroundStory", null);
        setBooleanField(term5536903, term5536903.getClass(), "enemyShipsDetected", false);
        setField(term5536903, term5536903.getClass(), "startingScenario", null);
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
        callMethod(klass, "getUnchartedSector", argTypes, term5536903, args);
    }

};


