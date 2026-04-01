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

public class PlayerInfo_getUnchartedValueSystem_1453368275219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536885;

    public PlayerInfo_getUnchartedValueSystem_1453368275219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536885 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536885, term5536885.getClass(), "race", null);
        setField(term5536885, term5536885.getClass(), "government", null);
        setIntField(term5536885, term5536885.getClass(), "warFatigue", 0);
        setField(term5536885, term5536885.getClass(), "empireName", null);
        setIntField(term5536885, term5536885.getClass(), "totalCredits", 0);
        setField(term5536885, term5536885.getClass(), "techList", null);
        setField(term5536885, term5536885.getClass(), "msgList", null);
        setField(term5536885, term5536885.getClass(), "shipStatList", null);
        setField(term5536885, term5536885.getClass(), "fleets", null);
        setField(term5536885, term5536885.getClass(), "mapData", null);
        setField(term5536885, term5536885.getClass(), "mapCloakDetection", null);
        setField(term5536885, term5536885.getClass(), "maxCoordinate", null);
        setBooleanField(term5536885, term5536885.getClass(), "human", false);
        setBooleanField(term5536885, term5536885.getClass(), "board", false);
        setField(term5536885, term5536885.getClass(), "missions", null);
        setField(term5536885, term5536885.getClass(), "diplomacy", null);
        setField(term5536885, term5536885.getClass(), "espionage", null);
        setIntField(term5536885, term5536885.getClass(), "fakeMilitarySize", 0);
        setField(term5536885, term5536885.getClass(), "attitude", null);
        setField(term5536885, term5536885.getClass(), "randomEventOccured", null);
        setField(term5536885, term5536885.getClass(), "strategy", null);
        setBooleanField(term5536885, term5536885.getClass(), "elderRealm", false);
        setField(term5536885, term5536885.getClass(), "leaderPool", null);
        setField(term5536885, term5536885.getClass(), "leaderRecruitPool", null);
        setField(term5536885, term5536885.getClass(), "ruler", null);
        setField(term5536885, term5536885.getClass(), "color", null);
        setField(term5536885, term5536885.getClass(), "interceptableFleets", null);
        setField(term5536885, term5536885.getClass(), "centerRealm", null);
        setField(term5536885, term5536885.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536885, term5536885.getClass(), "aiDifficulty", null);
        setField(term5536885, term5536885.getClass(), "artifactLists", null);
        setBooleanField(term5536885, term5536885.getClass(), "realmLost", false);
        setField(term5536885, term5536885.getClass(), "backgroundStory", null);
        setBooleanField(term5536885, term5536885.getClass(), "enemyShipsDetected", false);
        setField(term5536885, term5536885.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Sun");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getUnchartedValueSystem", argTypes, term5536885, args);
    }

};


