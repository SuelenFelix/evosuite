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

public class PlayerInfo_setBoard_1096199589125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5065059;
     Object term5065068;

    public PlayerInfo_setBoard_1096199589125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5065059 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5065059, term5065059.getClass(), "race", null);
        setField(term5065059, term5065059.getClass(), "government", null);
        setIntField(term5065059, term5065059.getClass(), "warFatigue", 0);
        setField(term5065059, term5065059.getClass(), "empireName", null);
        setIntField(term5065059, term5065059.getClass(), "totalCredits", 0);
        setField(term5065059, term5065059.getClass(), "techList", null);
        setField(term5065059, term5065059.getClass(), "msgList", null);
        setField(term5065059, term5065059.getClass(), "shipStatList", null);
        setField(term5065059, term5065059.getClass(), "fleets", null);
        setField(term5065059, term5065059.getClass(), "mapData", null);
        setField(term5065059, term5065059.getClass(), "mapCloakDetection", null);
        setField(term5065059, term5065059.getClass(), "maxCoordinate", null);
        setBooleanField(term5065059, term5065059.getClass(), "human", false);
        setBooleanField(term5065059, term5065059.getClass(), "board", false);
        setField(term5065059, term5065059.getClass(), "missions", null);
        setField(term5065059, term5065059.getClass(), "diplomacy", null);
        setField(term5065059, term5065059.getClass(), "espionage", null);
        setIntField(term5065059, term5065059.getClass(), "fakeMilitarySize", 0);
        setField(term5065059, term5065059.getClass(), "attitude", null);
        setField(term5065059, term5065059.getClass(), "randomEventOccured", null);
        setField(term5065059, term5065059.getClass(), "strategy", null);
        setBooleanField(term5065059, term5065059.getClass(), "elderRealm", false);
        setField(term5065059, term5065059.getClass(), "leaderPool", null);
        setField(term5065059, term5065059.getClass(), "leaderRecruitPool", null);
        setField(term5065059, term5065059.getClass(), "ruler", null);
        setField(term5065059, term5065059.getClass(), "color", null);
        setField(term5065059, term5065059.getClass(), "interceptableFleets", null);
        setField(term5065059, term5065059.getClass(), "centerRealm", null);
        setField(term5065059, term5065059.getClass(), "bestPlanetForTechWorld", null);
        setField(term5065059, term5065059.getClass(), "aiDifficulty", null);
        setField(term5065059, term5065059.getClass(), "artifactLists", null);
        setBooleanField(term5065059, term5065059.getClass(), "realmLost", false);
        setField(term5065059, term5065059.getClass(), "backgroundStory", null);
        setBooleanField(term5065059, term5065059.getClass(), "enemyShipsDetected", false);
        setField(term5065059, term5065059.getClass(), "startingScenario", null);
        term5065068 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5065068;
        callMethod(klass, "setBoard", argTypes, term5065059, args);
    }

};


