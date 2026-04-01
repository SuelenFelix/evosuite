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

public class PlayerInfo_setEnemyShipsDetected_1940200874174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5353780;
     Object term5353789;

    public PlayerInfo_setEnemyShipsDetected_1940200874174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5353780 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5353780, term5353780.getClass(), "race", null);
        setField(term5353780, term5353780.getClass(), "government", null);
        setIntField(term5353780, term5353780.getClass(), "warFatigue", 0);
        setField(term5353780, term5353780.getClass(), "empireName", null);
        setIntField(term5353780, term5353780.getClass(), "totalCredits", 0);
        setField(term5353780, term5353780.getClass(), "techList", null);
        setField(term5353780, term5353780.getClass(), "msgList", null);
        setField(term5353780, term5353780.getClass(), "shipStatList", null);
        setField(term5353780, term5353780.getClass(), "fleets", null);
        setField(term5353780, term5353780.getClass(), "mapData", null);
        setField(term5353780, term5353780.getClass(), "mapCloakDetection", null);
        setField(term5353780, term5353780.getClass(), "maxCoordinate", null);
        setBooleanField(term5353780, term5353780.getClass(), "human", false);
        setBooleanField(term5353780, term5353780.getClass(), "board", false);
        setField(term5353780, term5353780.getClass(), "missions", null);
        setField(term5353780, term5353780.getClass(), "diplomacy", null);
        setField(term5353780, term5353780.getClass(), "espionage", null);
        setIntField(term5353780, term5353780.getClass(), "fakeMilitarySize", 0);
        setField(term5353780, term5353780.getClass(), "attitude", null);
        setField(term5353780, term5353780.getClass(), "randomEventOccured", null);
        setField(term5353780, term5353780.getClass(), "strategy", null);
        setBooleanField(term5353780, term5353780.getClass(), "elderRealm", false);
        setField(term5353780, term5353780.getClass(), "leaderPool", null);
        setField(term5353780, term5353780.getClass(), "leaderRecruitPool", null);
        setField(term5353780, term5353780.getClass(), "ruler", null);
        setField(term5353780, term5353780.getClass(), "color", null);
        setField(term5353780, term5353780.getClass(), "interceptableFleets", null);
        setField(term5353780, term5353780.getClass(), "centerRealm", null);
        setField(term5353780, term5353780.getClass(), "bestPlanetForTechWorld", null);
        setField(term5353780, term5353780.getClass(), "aiDifficulty", null);
        setField(term5353780, term5353780.getClass(), "artifactLists", null);
        setBooleanField(term5353780, term5353780.getClass(), "realmLost", false);
        setField(term5353780, term5353780.getClass(), "backgroundStory", null);
        setBooleanField(term5353780, term5353780.getClass(), "enemyShipsDetected", false);
        setField(term5353780, term5353780.getClass(), "startingScenario", null);
        term5353789 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5353789;
        callMethod(klass, "setEnemyShipsDetected", argTypes, term5353780, args);
    }

};


