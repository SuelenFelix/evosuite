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

public class PlayerInfo_getBestUnchartedSector_42239427749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4705911;

    public PlayerInfo_getBestUnchartedSector_42239427749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4705911 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4705911, term4705911.getClass(), "race", null);
        setField(term4705911, term4705911.getClass(), "government", null);
        setIntField(term4705911, term4705911.getClass(), "warFatigue", 0);
        setField(term4705911, term4705911.getClass(), "empireName", null);
        setIntField(term4705911, term4705911.getClass(), "totalCredits", 0);
        setField(term4705911, term4705911.getClass(), "techList", null);
        setField(term4705911, term4705911.getClass(), "msgList", null);
        setField(term4705911, term4705911.getClass(), "shipStatList", null);
        setField(term4705911, term4705911.getClass(), "fleets", null);
        setField(term4705911, term4705911.getClass(), "mapData", null);
        setField(term4705911, term4705911.getClass(), "mapCloakDetection", null);
        setField(term4705911, term4705911.getClass(), "maxCoordinate", null);
        setBooleanField(term4705911, term4705911.getClass(), "human", false);
        setBooleanField(term4705911, term4705911.getClass(), "board", false);
        setField(term4705911, term4705911.getClass(), "missions", null);
        setField(term4705911, term4705911.getClass(), "diplomacy", null);
        setField(term4705911, term4705911.getClass(), "espionage", null);
        setIntField(term4705911, term4705911.getClass(), "fakeMilitarySize", 0);
        setField(term4705911, term4705911.getClass(), "attitude", null);
        setField(term4705911, term4705911.getClass(), "randomEventOccured", null);
        setField(term4705911, term4705911.getClass(), "strategy", null);
        setBooleanField(term4705911, term4705911.getClass(), "elderRealm", false);
        setField(term4705911, term4705911.getClass(), "leaderPool", null);
        setField(term4705911, term4705911.getClass(), "leaderRecruitPool", null);
        setField(term4705911, term4705911.getClass(), "ruler", null);
        setField(term4705911, term4705911.getClass(), "color", null);
        setField(term4705911, term4705911.getClass(), "interceptableFleets", null);
        setField(term4705911, term4705911.getClass(), "centerRealm", null);
        setField(term4705911, term4705911.getClass(), "bestPlanetForTechWorld", null);
        setField(term4705911, term4705911.getClass(), "aiDifficulty", null);
        setField(term4705911, term4705911.getClass(), "artifactLists", null);
        setBooleanField(term4705911, term4705911.getClass(), "realmLost", false);
        setField(term4705911, term4705911.getClass(), "backgroundStory", null);
        setBooleanField(term4705911, term4705911.getClass(), "enemyShipsDetected", false);
        setField(term4705911, term4705911.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Sun");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getBestUnchartedSector", argTypes, term4705911, args);
    }

};


