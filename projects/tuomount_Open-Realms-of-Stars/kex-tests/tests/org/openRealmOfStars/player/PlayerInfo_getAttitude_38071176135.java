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

public class PlayerInfo_getAttitude_38071176135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4638561;

    public PlayerInfo_getAttitude_38071176135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4638561 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4638561, term4638561.getClass(), "race", null);
        setField(term4638561, term4638561.getClass(), "government", null);
        setIntField(term4638561, term4638561.getClass(), "warFatigue", 0);
        setField(term4638561, term4638561.getClass(), "empireName", null);
        setIntField(term4638561, term4638561.getClass(), "totalCredits", 0);
        setField(term4638561, term4638561.getClass(), "techList", null);
        setField(term4638561, term4638561.getClass(), "msgList", null);
        setField(term4638561, term4638561.getClass(), "shipStatList", null);
        setField(term4638561, term4638561.getClass(), "fleets", null);
        setField(term4638561, term4638561.getClass(), "mapData", null);
        setField(term4638561, term4638561.getClass(), "mapCloakDetection", null);
        setField(term4638561, term4638561.getClass(), "maxCoordinate", null);
        setBooleanField(term4638561, term4638561.getClass(), "human", false);
        setBooleanField(term4638561, term4638561.getClass(), "board", false);
        setField(term4638561, term4638561.getClass(), "missions", null);
        setField(term4638561, term4638561.getClass(), "diplomacy", null);
        setField(term4638561, term4638561.getClass(), "espionage", null);
        setIntField(term4638561, term4638561.getClass(), "fakeMilitarySize", 0);
        setField(term4638561, term4638561.getClass(), "attitude", null);
        setField(term4638561, term4638561.getClass(), "randomEventOccured", null);
        setField(term4638561, term4638561.getClass(), "strategy", null);
        setBooleanField(term4638561, term4638561.getClass(), "elderRealm", false);
        setField(term4638561, term4638561.getClass(), "leaderPool", null);
        setField(term4638561, term4638561.getClass(), "leaderRecruitPool", null);
        setField(term4638561, term4638561.getClass(), "ruler", null);
        setField(term4638561, term4638561.getClass(), "color", null);
        setField(term4638561, term4638561.getClass(), "interceptableFleets", null);
        setField(term4638561, term4638561.getClass(), "centerRealm", null);
        setField(term4638561, term4638561.getClass(), "bestPlanetForTechWorld", null);
        setField(term4638561, term4638561.getClass(), "aiDifficulty", null);
        setField(term4638561, term4638561.getClass(), "artifactLists", null);
        setBooleanField(term4638561, term4638561.getClass(), "realmLost", false);
        setField(term4638561, term4638561.getClass(), "backgroundStory", null);
        setBooleanField(term4638561, term4638561.getClass(), "enemyShipsDetected", false);
        setField(term4638561, term4638561.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttitude", argTypes, term4638561, args);
    }

};


