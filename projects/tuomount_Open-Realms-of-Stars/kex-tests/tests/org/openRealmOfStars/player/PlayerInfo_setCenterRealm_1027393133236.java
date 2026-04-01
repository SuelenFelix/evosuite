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

public class PlayerInfo_setCenterRealm_1027393133236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5537046;

    public PlayerInfo_setCenterRealm_1027393133236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5537046 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5537046, term5537046.getClass(), "race", null);
        setField(term5537046, term5537046.getClass(), "government", null);
        setIntField(term5537046, term5537046.getClass(), "warFatigue", 0);
        setField(term5537046, term5537046.getClass(), "empireName", null);
        setIntField(term5537046, term5537046.getClass(), "totalCredits", 0);
        setField(term5537046, term5537046.getClass(), "techList", null);
        setField(term5537046, term5537046.getClass(), "msgList", null);
        setField(term5537046, term5537046.getClass(), "shipStatList", null);
        setField(term5537046, term5537046.getClass(), "fleets", null);
        setField(term5537046, term5537046.getClass(), "mapData", null);
        setField(term5537046, term5537046.getClass(), "mapCloakDetection", null);
        setField(term5537046, term5537046.getClass(), "maxCoordinate", null);
        setBooleanField(term5537046, term5537046.getClass(), "human", false);
        setBooleanField(term5537046, term5537046.getClass(), "board", false);
        setField(term5537046, term5537046.getClass(), "missions", null);
        setField(term5537046, term5537046.getClass(), "diplomacy", null);
        setField(term5537046, term5537046.getClass(), "espionage", null);
        setIntField(term5537046, term5537046.getClass(), "fakeMilitarySize", 0);
        setField(term5537046, term5537046.getClass(), "attitude", null);
        setField(term5537046, term5537046.getClass(), "randomEventOccured", null);
        setField(term5537046, term5537046.getClass(), "strategy", null);
        setBooleanField(term5537046, term5537046.getClass(), "elderRealm", false);
        setField(term5537046, term5537046.getClass(), "leaderPool", null);
        setField(term5537046, term5537046.getClass(), "leaderRecruitPool", null);
        setField(term5537046, term5537046.getClass(), "ruler", null);
        setField(term5537046, term5537046.getClass(), "color", null);
        setField(term5537046, term5537046.getClass(), "interceptableFleets", null);
        setField(term5537046, term5537046.getClass(), "centerRealm", null);
        setField(term5537046, term5537046.getClass(), "bestPlanetForTechWorld", null);
        setField(term5537046, term5537046.getClass(), "aiDifficulty", null);
        setField(term5537046, term5537046.getClass(), "artifactLists", null);
        setBooleanField(term5537046, term5537046.getClass(), "realmLost", false);
        setField(term5537046, term5537046.getClass(), "backgroundStory", null);
        setBooleanField(term5537046, term5537046.getClass(), "enemyShipsDetected", false);
        setField(term5537046, term5537046.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCenterRealm", argTypes, term5537046, args);
    }

};


