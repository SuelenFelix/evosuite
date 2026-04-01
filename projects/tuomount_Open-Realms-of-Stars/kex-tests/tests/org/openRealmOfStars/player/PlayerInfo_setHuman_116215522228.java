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
import java.lang.Boolean;

public class PlayerInfo_setHuman_116215522228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536970;
     Object term5536979;

    public PlayerInfo_setHuman_116215522228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536970 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536970, term5536970.getClass(), "race", null);
        setField(term5536970, term5536970.getClass(), "government", null);
        setIntField(term5536970, term5536970.getClass(), "warFatigue", 0);
        setField(term5536970, term5536970.getClass(), "empireName", null);
        setIntField(term5536970, term5536970.getClass(), "totalCredits", 0);
        setField(term5536970, term5536970.getClass(), "techList", null);
        setField(term5536970, term5536970.getClass(), "msgList", null);
        setField(term5536970, term5536970.getClass(), "shipStatList", null);
        setField(term5536970, term5536970.getClass(), "fleets", null);
        setField(term5536970, term5536970.getClass(), "mapData", null);
        setField(term5536970, term5536970.getClass(), "mapCloakDetection", null);
        setField(term5536970, term5536970.getClass(), "maxCoordinate", null);
        setBooleanField(term5536970, term5536970.getClass(), "human", false);
        setBooleanField(term5536970, term5536970.getClass(), "board", false);
        setField(term5536970, term5536970.getClass(), "missions", null);
        setField(term5536970, term5536970.getClass(), "diplomacy", null);
        setField(term5536970, term5536970.getClass(), "espionage", null);
        setIntField(term5536970, term5536970.getClass(), "fakeMilitarySize", 0);
        setField(term5536970, term5536970.getClass(), "attitude", null);
        setField(term5536970, term5536970.getClass(), "randomEventOccured", null);
        setField(term5536970, term5536970.getClass(), "strategy", null);
        setBooleanField(term5536970, term5536970.getClass(), "elderRealm", false);
        setField(term5536970, term5536970.getClass(), "leaderPool", null);
        setField(term5536970, term5536970.getClass(), "leaderRecruitPool", null);
        setField(term5536970, term5536970.getClass(), "ruler", null);
        setField(term5536970, term5536970.getClass(), "color", null);
        setField(term5536970, term5536970.getClass(), "interceptableFleets", null);
        setField(term5536970, term5536970.getClass(), "centerRealm", null);
        setField(term5536970, term5536970.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536970, term5536970.getClass(), "aiDifficulty", null);
        setField(term5536970, term5536970.getClass(), "artifactLists", null);
        setBooleanField(term5536970, term5536970.getClass(), "realmLost", false);
        setField(term5536970, term5536970.getClass(), "backgroundStory", null);
        setBooleanField(term5536970, term5536970.getClass(), "enemyShipsDetected", false);
        setField(term5536970, term5536970.getClass(), "startingScenario", null);
        term5536979 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5536979;
        callMethod(klass, "setHuman", argTypes, term5536970, args);
    }

};


