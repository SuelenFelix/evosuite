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

public class PlayerInfo_hasMutualEnemy_165293904123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4591205;

    public PlayerInfo_hasMutualEnemy_165293904123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4591205 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4591205, term4591205.getClass(), "race", null);
        setField(term4591205, term4591205.getClass(), "government", null);
        setIntField(term4591205, term4591205.getClass(), "warFatigue", 0);
        setField(term4591205, term4591205.getClass(), "empireName", null);
        setIntField(term4591205, term4591205.getClass(), "totalCredits", 0);
        setField(term4591205, term4591205.getClass(), "techList", null);
        setField(term4591205, term4591205.getClass(), "msgList", null);
        setField(term4591205, term4591205.getClass(), "shipStatList", null);
        setField(term4591205, term4591205.getClass(), "fleets", null);
        setField(term4591205, term4591205.getClass(), "mapData", null);
        setField(term4591205, term4591205.getClass(), "mapCloakDetection", null);
        setField(term4591205, term4591205.getClass(), "maxCoordinate", null);
        setBooleanField(term4591205, term4591205.getClass(), "human", false);
        setBooleanField(term4591205, term4591205.getClass(), "board", false);
        setField(term4591205, term4591205.getClass(), "missions", null);
        setField(term4591205, term4591205.getClass(), "diplomacy", null);
        setField(term4591205, term4591205.getClass(), "espionage", null);
        setIntField(term4591205, term4591205.getClass(), "fakeMilitarySize", 0);
        setField(term4591205, term4591205.getClass(), "attitude", null);
        setField(term4591205, term4591205.getClass(), "randomEventOccured", null);
        setField(term4591205, term4591205.getClass(), "strategy", null);
        setBooleanField(term4591205, term4591205.getClass(), "elderRealm", false);
        setField(term4591205, term4591205.getClass(), "leaderPool", null);
        setField(term4591205, term4591205.getClass(), "leaderRecruitPool", null);
        setField(term4591205, term4591205.getClass(), "ruler", null);
        setField(term4591205, term4591205.getClass(), "color", null);
        setField(term4591205, term4591205.getClass(), "interceptableFleets", null);
        setField(term4591205, term4591205.getClass(), "centerRealm", null);
        setField(term4591205, term4591205.getClass(), "bestPlanetForTechWorld", null);
        setField(term4591205, term4591205.getClass(), "aiDifficulty", null);
        setField(term4591205, term4591205.getClass(), "artifactLists", null);
        setBooleanField(term4591205, term4591205.getClass(), "realmLost", false);
        setField(term4591205, term4591205.getClass(), "backgroundStory", null);
        setBooleanField(term4591205, term4591205.getClass(), "enemyShipsDetected", false);
        setField(term4591205, term4591205.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasMutualEnemy", argTypes, term4591205, args);
    }

};


