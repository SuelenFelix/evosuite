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

public class PlayerInfo_getFakeMilitarySize_2053150086230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536990;

    public PlayerInfo_getFakeMilitarySize_2053150086230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536990 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536990, term5536990.getClass(), "race", null);
        setField(term5536990, term5536990.getClass(), "government", null);
        setIntField(term5536990, term5536990.getClass(), "warFatigue", 0);
        setField(term5536990, term5536990.getClass(), "empireName", null);
        setIntField(term5536990, term5536990.getClass(), "totalCredits", 0);
        setField(term5536990, term5536990.getClass(), "techList", null);
        setField(term5536990, term5536990.getClass(), "msgList", null);
        setField(term5536990, term5536990.getClass(), "shipStatList", null);
        setField(term5536990, term5536990.getClass(), "fleets", null);
        setField(term5536990, term5536990.getClass(), "mapData", null);
        setField(term5536990, term5536990.getClass(), "mapCloakDetection", null);
        setField(term5536990, term5536990.getClass(), "maxCoordinate", null);
        setBooleanField(term5536990, term5536990.getClass(), "human", false);
        setBooleanField(term5536990, term5536990.getClass(), "board", false);
        setField(term5536990, term5536990.getClass(), "missions", null);
        setField(term5536990, term5536990.getClass(), "diplomacy", null);
        setField(term5536990, term5536990.getClass(), "espionage", null);
        setIntField(term5536990, term5536990.getClass(), "fakeMilitarySize", 0);
        setField(term5536990, term5536990.getClass(), "attitude", null);
        setField(term5536990, term5536990.getClass(), "randomEventOccured", null);
        setField(term5536990, term5536990.getClass(), "strategy", null);
        setBooleanField(term5536990, term5536990.getClass(), "elderRealm", false);
        setField(term5536990, term5536990.getClass(), "leaderPool", null);
        setField(term5536990, term5536990.getClass(), "leaderRecruitPool", null);
        setField(term5536990, term5536990.getClass(), "ruler", null);
        setField(term5536990, term5536990.getClass(), "color", null);
        setField(term5536990, term5536990.getClass(), "interceptableFleets", null);
        setField(term5536990, term5536990.getClass(), "centerRealm", null);
        setField(term5536990, term5536990.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536990, term5536990.getClass(), "aiDifficulty", null);
        setField(term5536990, term5536990.getClass(), "artifactLists", null);
        setBooleanField(term5536990, term5536990.getClass(), "realmLost", false);
        setField(term5536990, term5536990.getClass(), "backgroundStory", null);
        setBooleanField(term5536990, term5536990.getClass(), "enemyShipsDetected", false);
        setField(term5536990, term5536990.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFakeMilitarySize", argTypes, term5536990, args);
    }

};


