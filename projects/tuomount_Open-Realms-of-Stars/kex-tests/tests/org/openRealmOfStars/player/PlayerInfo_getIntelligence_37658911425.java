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

public class PlayerInfo_getIntelligence_37658911425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4599289;

    public PlayerInfo_getIntelligence_37658911425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4599289 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4599289, term4599289.getClass(), "race", null);
        setField(term4599289, term4599289.getClass(), "government", null);
        setIntField(term4599289, term4599289.getClass(), "warFatigue", 0);
        setField(term4599289, term4599289.getClass(), "empireName", null);
        setIntField(term4599289, term4599289.getClass(), "totalCredits", 0);
        setField(term4599289, term4599289.getClass(), "techList", null);
        setField(term4599289, term4599289.getClass(), "msgList", null);
        setField(term4599289, term4599289.getClass(), "shipStatList", null);
        setField(term4599289, term4599289.getClass(), "fleets", null);
        setField(term4599289, term4599289.getClass(), "mapData", null);
        setField(term4599289, term4599289.getClass(), "mapCloakDetection", null);
        setField(term4599289, term4599289.getClass(), "maxCoordinate", null);
        setBooleanField(term4599289, term4599289.getClass(), "human", false);
        setBooleanField(term4599289, term4599289.getClass(), "board", false);
        setField(term4599289, term4599289.getClass(), "missions", null);
        setField(term4599289, term4599289.getClass(), "diplomacy", null);
        setField(term4599289, term4599289.getClass(), "espionage", null);
        setIntField(term4599289, term4599289.getClass(), "fakeMilitarySize", 0);
        setField(term4599289, term4599289.getClass(), "attitude", null);
        setField(term4599289, term4599289.getClass(), "randomEventOccured", null);
        setField(term4599289, term4599289.getClass(), "strategy", null);
        setBooleanField(term4599289, term4599289.getClass(), "elderRealm", false);
        setField(term4599289, term4599289.getClass(), "leaderPool", null);
        setField(term4599289, term4599289.getClass(), "leaderRecruitPool", null);
        setField(term4599289, term4599289.getClass(), "ruler", null);
        setField(term4599289, term4599289.getClass(), "color", null);
        setField(term4599289, term4599289.getClass(), "interceptableFleets", null);
        setField(term4599289, term4599289.getClass(), "centerRealm", null);
        setField(term4599289, term4599289.getClass(), "bestPlanetForTechWorld", null);
        setField(term4599289, term4599289.getClass(), "aiDifficulty", null);
        setField(term4599289, term4599289.getClass(), "artifactLists", null);
        setBooleanField(term4599289, term4599289.getClass(), "realmLost", false);
        setField(term4599289, term4599289.getClass(), "backgroundStory", null);
        setBooleanField(term4599289, term4599289.getClass(), "enemyShipsDetected", false);
        setField(term4599289, term4599289.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligence", argTypes, term4599289, args);
    }

};


