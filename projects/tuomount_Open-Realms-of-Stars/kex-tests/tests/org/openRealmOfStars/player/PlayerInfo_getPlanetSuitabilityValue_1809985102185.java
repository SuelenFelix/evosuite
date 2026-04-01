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
import java.lang.Boolean;

public class PlayerInfo_getPlanetSuitabilityValue_1809985102185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5411827;
     Object term5411836;

    public PlayerInfo_getPlanetSuitabilityValue_1809985102185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5411827 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5411827, term5411827.getClass(), "race", null);
        setField(term5411827, term5411827.getClass(), "government", null);
        setIntField(term5411827, term5411827.getClass(), "warFatigue", 0);
        setField(term5411827, term5411827.getClass(), "empireName", null);
        setIntField(term5411827, term5411827.getClass(), "totalCredits", 0);
        setField(term5411827, term5411827.getClass(), "techList", null);
        setField(term5411827, term5411827.getClass(), "msgList", null);
        setField(term5411827, term5411827.getClass(), "shipStatList", null);
        setField(term5411827, term5411827.getClass(), "fleets", null);
        setField(term5411827, term5411827.getClass(), "mapData", null);
        setField(term5411827, term5411827.getClass(), "mapCloakDetection", null);
        setField(term5411827, term5411827.getClass(), "maxCoordinate", null);
        setBooleanField(term5411827, term5411827.getClass(), "human", false);
        setBooleanField(term5411827, term5411827.getClass(), "board", false);
        setField(term5411827, term5411827.getClass(), "missions", null);
        setField(term5411827, term5411827.getClass(), "diplomacy", null);
        setField(term5411827, term5411827.getClass(), "espionage", null);
        setIntField(term5411827, term5411827.getClass(), "fakeMilitarySize", 0);
        setField(term5411827, term5411827.getClass(), "attitude", null);
        setField(term5411827, term5411827.getClass(), "randomEventOccured", null);
        setField(term5411827, term5411827.getClass(), "strategy", null);
        setBooleanField(term5411827, term5411827.getClass(), "elderRealm", false);
        setField(term5411827, term5411827.getClass(), "leaderPool", null);
        setField(term5411827, term5411827.getClass(), "leaderRecruitPool", null);
        setField(term5411827, term5411827.getClass(), "ruler", null);
        setField(term5411827, term5411827.getClass(), "color", null);
        setField(term5411827, term5411827.getClass(), "interceptableFleets", null);
        setField(term5411827, term5411827.getClass(), "centerRealm", null);
        setField(term5411827, term5411827.getClass(), "bestPlanetForTechWorld", null);
        setField(term5411827, term5411827.getClass(), "aiDifficulty", null);
        setField(term5411827, term5411827.getClass(), "artifactLists", null);
        setBooleanField(term5411827, term5411827.getClass(), "realmLost", false);
        setField(term5411827, term5411827.getClass(), "backgroundStory", null);
        setBooleanField(term5411827, term5411827.getClass(), "enemyShipsDetected", false);
        setField(term5411827, term5411827.getClass(), "startingScenario", null);
        term5411836 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5411836;
        callMethod(klass, "getPlanetSuitabilityValue", argTypes, term5411827, args);
    }

};


