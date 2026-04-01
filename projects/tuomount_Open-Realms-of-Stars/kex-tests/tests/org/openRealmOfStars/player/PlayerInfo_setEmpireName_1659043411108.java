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

public class PlayerInfo_setEmpireName_1659043411108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4983222;

    public PlayerInfo_setEmpireName_1659043411108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4983222 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4983222, term4983222.getClass(), "race", null);
        setField(term4983222, term4983222.getClass(), "government", null);
        setIntField(term4983222, term4983222.getClass(), "warFatigue", 0);
        setField(term4983222, term4983222.getClass(), "empireName", null);
        setIntField(term4983222, term4983222.getClass(), "totalCredits", 0);
        setField(term4983222, term4983222.getClass(), "techList", null);
        setField(term4983222, term4983222.getClass(), "msgList", null);
        setField(term4983222, term4983222.getClass(), "shipStatList", null);
        setField(term4983222, term4983222.getClass(), "fleets", null);
        setField(term4983222, term4983222.getClass(), "mapData", null);
        setField(term4983222, term4983222.getClass(), "mapCloakDetection", null);
        setField(term4983222, term4983222.getClass(), "maxCoordinate", null);
        setBooleanField(term4983222, term4983222.getClass(), "human", false);
        setBooleanField(term4983222, term4983222.getClass(), "board", false);
        setField(term4983222, term4983222.getClass(), "missions", null);
        setField(term4983222, term4983222.getClass(), "diplomacy", null);
        setField(term4983222, term4983222.getClass(), "espionage", null);
        setIntField(term4983222, term4983222.getClass(), "fakeMilitarySize", 0);
        setField(term4983222, term4983222.getClass(), "attitude", null);
        setField(term4983222, term4983222.getClass(), "randomEventOccured", null);
        setField(term4983222, term4983222.getClass(), "strategy", null);
        setBooleanField(term4983222, term4983222.getClass(), "elderRealm", false);
        setField(term4983222, term4983222.getClass(), "leaderPool", null);
        setField(term4983222, term4983222.getClass(), "leaderRecruitPool", null);
        setField(term4983222, term4983222.getClass(), "ruler", null);
        setField(term4983222, term4983222.getClass(), "color", null);
        setField(term4983222, term4983222.getClass(), "interceptableFleets", null);
        setField(term4983222, term4983222.getClass(), "centerRealm", null);
        setField(term4983222, term4983222.getClass(), "bestPlanetForTechWorld", null);
        setField(term4983222, term4983222.getClass(), "aiDifficulty", null);
        setField(term4983222, term4983222.getClass(), "artifactLists", null);
        setBooleanField(term4983222, term4983222.getClass(), "realmLost", false);
        setField(term4983222, term4983222.getClass(), "backgroundStory", null);
        setBooleanField(term4983222, term4983222.getClass(), "enemyShipsDetected", false);
        setField(term4983222, term4983222.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmpireName", argTypes, term4983222, args);
    }

};


