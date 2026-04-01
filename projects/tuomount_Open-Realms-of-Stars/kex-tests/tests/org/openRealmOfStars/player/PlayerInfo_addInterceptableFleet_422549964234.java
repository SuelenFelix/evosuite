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

public class PlayerInfo_addInterceptableFleet_422549964234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5537028;

    public PlayerInfo_addInterceptableFleet_422549964234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5537028 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5537028, term5537028.getClass(), "race", null);
        setField(term5537028, term5537028.getClass(), "government", null);
        setIntField(term5537028, term5537028.getClass(), "warFatigue", 0);
        setField(term5537028, term5537028.getClass(), "empireName", null);
        setIntField(term5537028, term5537028.getClass(), "totalCredits", 0);
        setField(term5537028, term5537028.getClass(), "techList", null);
        setField(term5537028, term5537028.getClass(), "msgList", null);
        setField(term5537028, term5537028.getClass(), "shipStatList", null);
        setField(term5537028, term5537028.getClass(), "fleets", null);
        setField(term5537028, term5537028.getClass(), "mapData", null);
        setField(term5537028, term5537028.getClass(), "mapCloakDetection", null);
        setField(term5537028, term5537028.getClass(), "maxCoordinate", null);
        setBooleanField(term5537028, term5537028.getClass(), "human", false);
        setBooleanField(term5537028, term5537028.getClass(), "board", false);
        setField(term5537028, term5537028.getClass(), "missions", null);
        setField(term5537028, term5537028.getClass(), "diplomacy", null);
        setField(term5537028, term5537028.getClass(), "espionage", null);
        setIntField(term5537028, term5537028.getClass(), "fakeMilitarySize", 0);
        setField(term5537028, term5537028.getClass(), "attitude", null);
        setField(term5537028, term5537028.getClass(), "randomEventOccured", null);
        setField(term5537028, term5537028.getClass(), "strategy", null);
        setBooleanField(term5537028, term5537028.getClass(), "elderRealm", false);
        setField(term5537028, term5537028.getClass(), "leaderPool", null);
        setField(term5537028, term5537028.getClass(), "leaderRecruitPool", null);
        setField(term5537028, term5537028.getClass(), "ruler", null);
        setField(term5537028, term5537028.getClass(), "color", null);
        setField(term5537028, term5537028.getClass(), "interceptableFleets", null);
        setField(term5537028, term5537028.getClass(), "centerRealm", null);
        setField(term5537028, term5537028.getClass(), "bestPlanetForTechWorld", null);
        setField(term5537028, term5537028.getClass(), "aiDifficulty", null);
        setField(term5537028, term5537028.getClass(), "artifactLists", null);
        setBooleanField(term5537028, term5537028.getClass(), "realmLost", false);
        setField(term5537028, term5537028.getClass(), "backgroundStory", null);
        setBooleanField(term5537028, term5537028.getClass(), "enemyShipsDetected", false);
        setField(term5537028, term5537028.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addInterceptableFleet", argTypes, term5537028, args);
    }

};


