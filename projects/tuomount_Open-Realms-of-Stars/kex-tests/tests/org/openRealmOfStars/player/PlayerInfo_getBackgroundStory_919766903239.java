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

public class PlayerInfo_getBackgroundStory_919766903239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5537073;

    public PlayerInfo_getBackgroundStory_919766903239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5537073 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5537073, term5537073.getClass(), "race", null);
        setField(term5537073, term5537073.getClass(), "government", null);
        setIntField(term5537073, term5537073.getClass(), "warFatigue", 0);
        setField(term5537073, term5537073.getClass(), "empireName", null);
        setIntField(term5537073, term5537073.getClass(), "totalCredits", 0);
        setField(term5537073, term5537073.getClass(), "techList", null);
        setField(term5537073, term5537073.getClass(), "msgList", null);
        setField(term5537073, term5537073.getClass(), "shipStatList", null);
        setField(term5537073, term5537073.getClass(), "fleets", null);
        setField(term5537073, term5537073.getClass(), "mapData", null);
        setField(term5537073, term5537073.getClass(), "mapCloakDetection", null);
        setField(term5537073, term5537073.getClass(), "maxCoordinate", null);
        setBooleanField(term5537073, term5537073.getClass(), "human", false);
        setBooleanField(term5537073, term5537073.getClass(), "board", false);
        setField(term5537073, term5537073.getClass(), "missions", null);
        setField(term5537073, term5537073.getClass(), "diplomacy", null);
        setField(term5537073, term5537073.getClass(), "espionage", null);
        setIntField(term5537073, term5537073.getClass(), "fakeMilitarySize", 0);
        setField(term5537073, term5537073.getClass(), "attitude", null);
        setField(term5537073, term5537073.getClass(), "randomEventOccured", null);
        setField(term5537073, term5537073.getClass(), "strategy", null);
        setBooleanField(term5537073, term5537073.getClass(), "elderRealm", false);
        setField(term5537073, term5537073.getClass(), "leaderPool", null);
        setField(term5537073, term5537073.getClass(), "leaderRecruitPool", null);
        setField(term5537073, term5537073.getClass(), "ruler", null);
        setField(term5537073, term5537073.getClass(), "color", null);
        setField(term5537073, term5537073.getClass(), "interceptableFleets", null);
        setField(term5537073, term5537073.getClass(), "centerRealm", null);
        setField(term5537073, term5537073.getClass(), "bestPlanetForTechWorld", null);
        setField(term5537073, term5537073.getClass(), "aiDifficulty", null);
        setField(term5537073, term5537073.getClass(), "artifactLists", null);
        setBooleanField(term5537073, term5537073.getClass(), "realmLost", false);
        setField(term5537073, term5537073.getClass(), "backgroundStory", null);
        setBooleanField(term5537073, term5537073.getClass(), "enemyShipsDetected", false);
        setField(term5537073, term5537073.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackgroundStory", argTypes, term5537073, args);
    }

};


