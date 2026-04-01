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

public class PlayerInfo_getRace_63429486493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4913436;

    public PlayerInfo_getRace_63429486493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4913436 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4913436, term4913436.getClass(), "race", null);
        setField(term4913436, term4913436.getClass(), "government", null);
        setIntField(term4913436, term4913436.getClass(), "warFatigue", 0);
        setField(term4913436, term4913436.getClass(), "empireName", null);
        setIntField(term4913436, term4913436.getClass(), "totalCredits", 0);
        setField(term4913436, term4913436.getClass(), "techList", null);
        setField(term4913436, term4913436.getClass(), "msgList", null);
        setField(term4913436, term4913436.getClass(), "shipStatList", null);
        setField(term4913436, term4913436.getClass(), "fleets", null);
        setField(term4913436, term4913436.getClass(), "mapData", null);
        setField(term4913436, term4913436.getClass(), "mapCloakDetection", null);
        setField(term4913436, term4913436.getClass(), "maxCoordinate", null);
        setBooleanField(term4913436, term4913436.getClass(), "human", false);
        setBooleanField(term4913436, term4913436.getClass(), "board", false);
        setField(term4913436, term4913436.getClass(), "missions", null);
        setField(term4913436, term4913436.getClass(), "diplomacy", null);
        setField(term4913436, term4913436.getClass(), "espionage", null);
        setIntField(term4913436, term4913436.getClass(), "fakeMilitarySize", 0);
        setField(term4913436, term4913436.getClass(), "attitude", null);
        setField(term4913436, term4913436.getClass(), "randomEventOccured", null);
        setField(term4913436, term4913436.getClass(), "strategy", null);
        setBooleanField(term4913436, term4913436.getClass(), "elderRealm", false);
        setField(term4913436, term4913436.getClass(), "leaderPool", null);
        setField(term4913436, term4913436.getClass(), "leaderRecruitPool", null);
        setField(term4913436, term4913436.getClass(), "ruler", null);
        setField(term4913436, term4913436.getClass(), "color", null);
        setField(term4913436, term4913436.getClass(), "interceptableFleets", null);
        setField(term4913436, term4913436.getClass(), "centerRealm", null);
        setField(term4913436, term4913436.getClass(), "bestPlanetForTechWorld", null);
        setField(term4913436, term4913436.getClass(), "aiDifficulty", null);
        setField(term4913436, term4913436.getClass(), "artifactLists", null);
        setBooleanField(term4913436, term4913436.getClass(), "realmLost", false);
        setField(term4913436, term4913436.getClass(), "backgroundStory", null);
        setBooleanField(term4913436, term4913436.getClass(), "enemyShipsDetected", false);
        setField(term4913436, term4913436.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRace", argTypes, term4913436, args);
    }

};


