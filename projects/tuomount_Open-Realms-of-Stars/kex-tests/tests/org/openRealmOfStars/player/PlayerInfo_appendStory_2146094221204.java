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

public class PlayerInfo_appendStory_2146094221204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5502936;

    public PlayerInfo_appendStory_2146094221204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5502936 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5502936, term5502936.getClass(), "race", null);
        setField(term5502936, term5502936.getClass(), "government", null);
        setIntField(term5502936, term5502936.getClass(), "warFatigue", 0);
        setField(term5502936, term5502936.getClass(), "empireName", null);
        setIntField(term5502936, term5502936.getClass(), "totalCredits", 0);
        setField(term5502936, term5502936.getClass(), "techList", null);
        setField(term5502936, term5502936.getClass(), "msgList", null);
        setField(term5502936, term5502936.getClass(), "shipStatList", null);
        setField(term5502936, term5502936.getClass(), "fleets", null);
        setField(term5502936, term5502936.getClass(), "mapData", null);
        setField(term5502936, term5502936.getClass(), "mapCloakDetection", null);
        setField(term5502936, term5502936.getClass(), "maxCoordinate", null);
        setBooleanField(term5502936, term5502936.getClass(), "human", false);
        setBooleanField(term5502936, term5502936.getClass(), "board", false);
        setField(term5502936, term5502936.getClass(), "missions", null);
        setField(term5502936, term5502936.getClass(), "diplomacy", null);
        setField(term5502936, term5502936.getClass(), "espionage", null);
        setIntField(term5502936, term5502936.getClass(), "fakeMilitarySize", 0);
        setField(term5502936, term5502936.getClass(), "attitude", null);
        setField(term5502936, term5502936.getClass(), "randomEventOccured", null);
        setField(term5502936, term5502936.getClass(), "strategy", null);
        setBooleanField(term5502936, term5502936.getClass(), "elderRealm", false);
        setField(term5502936, term5502936.getClass(), "leaderPool", null);
        setField(term5502936, term5502936.getClass(), "leaderRecruitPool", null);
        setField(term5502936, term5502936.getClass(), "ruler", null);
        setField(term5502936, term5502936.getClass(), "color", null);
        setField(term5502936, term5502936.getClass(), "interceptableFleets", null);
        setField(term5502936, term5502936.getClass(), "centerRealm", null);
        setField(term5502936, term5502936.getClass(), "bestPlanetForTechWorld", null);
        setField(term5502936, term5502936.getClass(), "aiDifficulty", null);
        setField(term5502936, term5502936.getClass(), "artifactLists", null);
        setBooleanField(term5502936, term5502936.getClass(), "realmLost", false);
        setField(term5502936, term5502936.getClass(), "backgroundStory", null);
        setBooleanField(term5502936, term5502936.getClass(), "enemyShipsDetected", false);
        setField(term5502936, term5502936.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendStory", argTypes, term5502936, args);
    }

};


