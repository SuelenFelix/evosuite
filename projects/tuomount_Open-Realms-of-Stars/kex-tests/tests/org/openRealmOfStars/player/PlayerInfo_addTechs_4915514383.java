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

public class PlayerInfo_addTechs_4915514383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4499114;

    public PlayerInfo_addTechs_4915514383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4499114 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4499114, term4499114.getClass(), "race", null);
        setField(term4499114, term4499114.getClass(), "government", null);
        setIntField(term4499114, term4499114.getClass(), "warFatigue", 0);
        setField(term4499114, term4499114.getClass(), "empireName", null);
        setIntField(term4499114, term4499114.getClass(), "totalCredits", 0);
        setField(term4499114, term4499114.getClass(), "techList", null);
        setField(term4499114, term4499114.getClass(), "msgList", null);
        setField(term4499114, term4499114.getClass(), "shipStatList", null);
        setField(term4499114, term4499114.getClass(), "fleets", null);
        setField(term4499114, term4499114.getClass(), "mapData", null);
        setField(term4499114, term4499114.getClass(), "mapCloakDetection", null);
        setField(term4499114, term4499114.getClass(), "maxCoordinate", null);
        setBooleanField(term4499114, term4499114.getClass(), "human", false);
        setBooleanField(term4499114, term4499114.getClass(), "board", false);
        setField(term4499114, term4499114.getClass(), "missions", null);
        setField(term4499114, term4499114.getClass(), "diplomacy", null);
        setField(term4499114, term4499114.getClass(), "espionage", null);
        setIntField(term4499114, term4499114.getClass(), "fakeMilitarySize", 0);
        setField(term4499114, term4499114.getClass(), "attitude", null);
        setField(term4499114, term4499114.getClass(), "randomEventOccured", null);
        setField(term4499114, term4499114.getClass(), "strategy", null);
        setBooleanField(term4499114, term4499114.getClass(), "elderRealm", false);
        setField(term4499114, term4499114.getClass(), "leaderPool", null);
        setField(term4499114, term4499114.getClass(), "leaderRecruitPool", null);
        setField(term4499114, term4499114.getClass(), "ruler", null);
        setField(term4499114, term4499114.getClass(), "color", null);
        setField(term4499114, term4499114.getClass(), "interceptableFleets", null);
        setField(term4499114, term4499114.getClass(), "centerRealm", null);
        setField(term4499114, term4499114.getClass(), "bestPlanetForTechWorld", null);
        setField(term4499114, term4499114.getClass(), "aiDifficulty", null);
        setField(term4499114, term4499114.getClass(), "artifactLists", null);
        setBooleanField(term4499114, term4499114.getClass(), "realmLost", false);
        setField(term4499114, term4499114.getClass(), "backgroundStory", null);
        setBooleanField(term4499114, term4499114.getClass(), "enemyShipsDetected", false);
        setField(term4499114, term4499114.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addTechs", argTypes, term4499114, args);
    }

};


