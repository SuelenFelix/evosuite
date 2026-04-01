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

public class PlayerInfo_getSectorVisibility_77442774756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4739959;

    public PlayerInfo_getSectorVisibility_77442774756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4739959 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4739959, term4739959.getClass(), "race", null);
        setField(term4739959, term4739959.getClass(), "government", null);
        setIntField(term4739959, term4739959.getClass(), "warFatigue", 0);
        setField(term4739959, term4739959.getClass(), "empireName", null);
        setIntField(term4739959, term4739959.getClass(), "totalCredits", 0);
        setField(term4739959, term4739959.getClass(), "techList", null);
        setField(term4739959, term4739959.getClass(), "msgList", null);
        setField(term4739959, term4739959.getClass(), "shipStatList", null);
        setField(term4739959, term4739959.getClass(), "fleets", null);
        setField(term4739959, term4739959.getClass(), "mapData", null);
        setField(term4739959, term4739959.getClass(), "mapCloakDetection", null);
        setField(term4739959, term4739959.getClass(), "maxCoordinate", null);
        setBooleanField(term4739959, term4739959.getClass(), "human", false);
        setBooleanField(term4739959, term4739959.getClass(), "board", false);
        setField(term4739959, term4739959.getClass(), "missions", null);
        setField(term4739959, term4739959.getClass(), "diplomacy", null);
        setField(term4739959, term4739959.getClass(), "espionage", null);
        setIntField(term4739959, term4739959.getClass(), "fakeMilitarySize", 0);
        setField(term4739959, term4739959.getClass(), "attitude", null);
        setField(term4739959, term4739959.getClass(), "randomEventOccured", null);
        setField(term4739959, term4739959.getClass(), "strategy", null);
        setBooleanField(term4739959, term4739959.getClass(), "elderRealm", false);
        setField(term4739959, term4739959.getClass(), "leaderPool", null);
        setField(term4739959, term4739959.getClass(), "leaderRecruitPool", null);
        setField(term4739959, term4739959.getClass(), "ruler", null);
        setField(term4739959, term4739959.getClass(), "color", null);
        setField(term4739959, term4739959.getClass(), "interceptableFleets", null);
        setField(term4739959, term4739959.getClass(), "centerRealm", null);
        setField(term4739959, term4739959.getClass(), "bestPlanetForTechWorld", null);
        setField(term4739959, term4739959.getClass(), "aiDifficulty", null);
        setField(term4739959, term4739959.getClass(), "artifactLists", null);
        setBooleanField(term4739959, term4739959.getClass(), "realmLost", false);
        setField(term4739959, term4739959.getClass(), "backgroundStory", null);
        setBooleanField(term4739959, term4739959.getClass(), "enemyShipsDetected", false);
        setField(term4739959, term4739959.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSectorVisibility", argTypes, term4739959, args);
    }

};


