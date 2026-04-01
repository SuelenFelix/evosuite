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

public class PlayerInfo_getPlanetSuitabilityValue_550148678183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5397358;

    public PlayerInfo_getPlanetSuitabilityValue_550148678183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5397358 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5397358, term5397358.getClass(), "race", null);
        setField(term5397358, term5397358.getClass(), "government", null);
        setIntField(term5397358, term5397358.getClass(), "warFatigue", 0);
        setField(term5397358, term5397358.getClass(), "empireName", null);
        setIntField(term5397358, term5397358.getClass(), "totalCredits", 0);
        setField(term5397358, term5397358.getClass(), "techList", null);
        setField(term5397358, term5397358.getClass(), "msgList", null);
        setField(term5397358, term5397358.getClass(), "shipStatList", null);
        setField(term5397358, term5397358.getClass(), "fleets", null);
        setField(term5397358, term5397358.getClass(), "mapData", null);
        setField(term5397358, term5397358.getClass(), "mapCloakDetection", null);
        setField(term5397358, term5397358.getClass(), "maxCoordinate", null);
        setBooleanField(term5397358, term5397358.getClass(), "human", false);
        setBooleanField(term5397358, term5397358.getClass(), "board", false);
        setField(term5397358, term5397358.getClass(), "missions", null);
        setField(term5397358, term5397358.getClass(), "diplomacy", null);
        setField(term5397358, term5397358.getClass(), "espionage", null);
        setIntField(term5397358, term5397358.getClass(), "fakeMilitarySize", 0);
        setField(term5397358, term5397358.getClass(), "attitude", null);
        setField(term5397358, term5397358.getClass(), "randomEventOccured", null);
        setField(term5397358, term5397358.getClass(), "strategy", null);
        setBooleanField(term5397358, term5397358.getClass(), "elderRealm", false);
        setField(term5397358, term5397358.getClass(), "leaderPool", null);
        setField(term5397358, term5397358.getClass(), "leaderRecruitPool", null);
        setField(term5397358, term5397358.getClass(), "ruler", null);
        setField(term5397358, term5397358.getClass(), "color", null);
        setField(term5397358, term5397358.getClass(), "interceptableFleets", null);
        setField(term5397358, term5397358.getClass(), "centerRealm", null);
        setField(term5397358, term5397358.getClass(), "bestPlanetForTechWorld", null);
        setField(term5397358, term5397358.getClass(), "aiDifficulty", null);
        setField(term5397358, term5397358.getClass(), "artifactLists", null);
        setBooleanField(term5397358, term5397358.getClass(), "realmLost", false);
        setField(term5397358, term5397358.getClass(), "backgroundStory", null);
        setBooleanField(term5397358, term5397358.getClass(), "enemyShipsDetected", false);
        setField(term5397358, term5397358.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPlanetSuitabilityValue", argTypes, term5397358, args);
    }

};


