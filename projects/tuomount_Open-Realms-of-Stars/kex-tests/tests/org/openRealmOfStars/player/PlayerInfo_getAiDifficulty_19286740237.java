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

public class PlayerInfo_getAiDifficulty_19286740237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5537055;

    public PlayerInfo_getAiDifficulty_19286740237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5537055 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5537055, term5537055.getClass(), "race", null);
        setField(term5537055, term5537055.getClass(), "government", null);
        setIntField(term5537055, term5537055.getClass(), "warFatigue", 0);
        setField(term5537055, term5537055.getClass(), "empireName", null);
        setIntField(term5537055, term5537055.getClass(), "totalCredits", 0);
        setField(term5537055, term5537055.getClass(), "techList", null);
        setField(term5537055, term5537055.getClass(), "msgList", null);
        setField(term5537055, term5537055.getClass(), "shipStatList", null);
        setField(term5537055, term5537055.getClass(), "fleets", null);
        setField(term5537055, term5537055.getClass(), "mapData", null);
        setField(term5537055, term5537055.getClass(), "mapCloakDetection", null);
        setField(term5537055, term5537055.getClass(), "maxCoordinate", null);
        setBooleanField(term5537055, term5537055.getClass(), "human", false);
        setBooleanField(term5537055, term5537055.getClass(), "board", false);
        setField(term5537055, term5537055.getClass(), "missions", null);
        setField(term5537055, term5537055.getClass(), "diplomacy", null);
        setField(term5537055, term5537055.getClass(), "espionage", null);
        setIntField(term5537055, term5537055.getClass(), "fakeMilitarySize", 0);
        setField(term5537055, term5537055.getClass(), "attitude", null);
        setField(term5537055, term5537055.getClass(), "randomEventOccured", null);
        setField(term5537055, term5537055.getClass(), "strategy", null);
        setBooleanField(term5537055, term5537055.getClass(), "elderRealm", false);
        setField(term5537055, term5537055.getClass(), "leaderPool", null);
        setField(term5537055, term5537055.getClass(), "leaderRecruitPool", null);
        setField(term5537055, term5537055.getClass(), "ruler", null);
        setField(term5537055, term5537055.getClass(), "color", null);
        setField(term5537055, term5537055.getClass(), "interceptableFleets", null);
        setField(term5537055, term5537055.getClass(), "centerRealm", null);
        setField(term5537055, term5537055.getClass(), "bestPlanetForTechWorld", null);
        setField(term5537055, term5537055.getClass(), "aiDifficulty", null);
        setField(term5537055, term5537055.getClass(), "artifactLists", null);
        setBooleanField(term5537055, term5537055.getClass(), "realmLost", false);
        setField(term5537055, term5537055.getClass(), "backgroundStory", null);
        setBooleanField(term5537055, term5537055.getClass(), "enemyShipsDetected", false);
        setField(term5537055, term5537055.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAiDifficulty", argTypes, term5537055, args);
    }

};


