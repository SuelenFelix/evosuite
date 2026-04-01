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

public class PlayerInfo_savePlayerInfo_19981952420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4569021;

    public PlayerInfo_savePlayerInfo_19981952420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4569021 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4569021, term4569021.getClass(), "race", null);
        setField(term4569021, term4569021.getClass(), "government", null);
        setIntField(term4569021, term4569021.getClass(), "warFatigue", 0);
        setField(term4569021, term4569021.getClass(), "empireName", null);
        setIntField(term4569021, term4569021.getClass(), "totalCredits", 0);
        setField(term4569021, term4569021.getClass(), "techList", null);
        setField(term4569021, term4569021.getClass(), "msgList", null);
        setField(term4569021, term4569021.getClass(), "shipStatList", null);
        setField(term4569021, term4569021.getClass(), "fleets", null);
        setField(term4569021, term4569021.getClass(), "mapData", null);
        setField(term4569021, term4569021.getClass(), "mapCloakDetection", null);
        setField(term4569021, term4569021.getClass(), "maxCoordinate", null);
        setBooleanField(term4569021, term4569021.getClass(), "human", false);
        setBooleanField(term4569021, term4569021.getClass(), "board", false);
        setField(term4569021, term4569021.getClass(), "missions", null);
        setField(term4569021, term4569021.getClass(), "diplomacy", null);
        setField(term4569021, term4569021.getClass(), "espionage", null);
        setIntField(term4569021, term4569021.getClass(), "fakeMilitarySize", 0);
        setField(term4569021, term4569021.getClass(), "attitude", null);
        setField(term4569021, term4569021.getClass(), "randomEventOccured", null);
        setField(term4569021, term4569021.getClass(), "strategy", null);
        setBooleanField(term4569021, term4569021.getClass(), "elderRealm", false);
        setField(term4569021, term4569021.getClass(), "leaderPool", null);
        setField(term4569021, term4569021.getClass(), "leaderRecruitPool", null);
        setField(term4569021, term4569021.getClass(), "ruler", null);
        setField(term4569021, term4569021.getClass(), "color", null);
        setField(term4569021, term4569021.getClass(), "interceptableFleets", null);
        setField(term4569021, term4569021.getClass(), "centerRealm", null);
        setField(term4569021, term4569021.getClass(), "bestPlanetForTechWorld", null);
        setField(term4569021, term4569021.getClass(), "aiDifficulty", null);
        setField(term4569021, term4569021.getClass(), "artifactLists", null);
        setBooleanField(term4569021, term4569021.getClass(), "realmLost", false);
        setField(term4569021, term4569021.getClass(), "backgroundStory", null);
        setBooleanField(term4569021, term4569021.getClass(), "enemyShipsDetected", false);
        setField(term4569021, term4569021.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "savePlayerInfo", argTypes, term4569021, args);
    }

};


