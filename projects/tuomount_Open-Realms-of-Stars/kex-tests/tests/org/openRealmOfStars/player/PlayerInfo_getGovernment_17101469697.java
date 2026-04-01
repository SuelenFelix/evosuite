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

public class PlayerInfo_getGovernment_17101469697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4931488;

    public PlayerInfo_getGovernment_17101469697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4931488 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4931488, term4931488.getClass(), "race", null);
        setField(term4931488, term4931488.getClass(), "government", null);
        setIntField(term4931488, term4931488.getClass(), "warFatigue", 0);
        setField(term4931488, term4931488.getClass(), "empireName", null);
        setIntField(term4931488, term4931488.getClass(), "totalCredits", 0);
        setField(term4931488, term4931488.getClass(), "techList", null);
        setField(term4931488, term4931488.getClass(), "msgList", null);
        setField(term4931488, term4931488.getClass(), "shipStatList", null);
        setField(term4931488, term4931488.getClass(), "fleets", null);
        setField(term4931488, term4931488.getClass(), "mapData", null);
        setField(term4931488, term4931488.getClass(), "mapCloakDetection", null);
        setField(term4931488, term4931488.getClass(), "maxCoordinate", null);
        setBooleanField(term4931488, term4931488.getClass(), "human", false);
        setBooleanField(term4931488, term4931488.getClass(), "board", false);
        setField(term4931488, term4931488.getClass(), "missions", null);
        setField(term4931488, term4931488.getClass(), "diplomacy", null);
        setField(term4931488, term4931488.getClass(), "espionage", null);
        setIntField(term4931488, term4931488.getClass(), "fakeMilitarySize", 0);
        setField(term4931488, term4931488.getClass(), "attitude", null);
        setField(term4931488, term4931488.getClass(), "randomEventOccured", null);
        setField(term4931488, term4931488.getClass(), "strategy", null);
        setBooleanField(term4931488, term4931488.getClass(), "elderRealm", false);
        setField(term4931488, term4931488.getClass(), "leaderPool", null);
        setField(term4931488, term4931488.getClass(), "leaderRecruitPool", null);
        setField(term4931488, term4931488.getClass(), "ruler", null);
        setField(term4931488, term4931488.getClass(), "color", null);
        setField(term4931488, term4931488.getClass(), "interceptableFleets", null);
        setField(term4931488, term4931488.getClass(), "centerRealm", null);
        setField(term4931488, term4931488.getClass(), "bestPlanetForTechWorld", null);
        setField(term4931488, term4931488.getClass(), "aiDifficulty", null);
        setField(term4931488, term4931488.getClass(), "artifactLists", null);
        setBooleanField(term4931488, term4931488.getClass(), "realmLost", false);
        setField(term4931488, term4931488.getClass(), "backgroundStory", null);
        setBooleanField(term4931488, term4931488.getClass(), "enemyShipsDetected", false);
        setField(term4931488, term4931488.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGovernment", argTypes, term4931488, args);
    }

};


