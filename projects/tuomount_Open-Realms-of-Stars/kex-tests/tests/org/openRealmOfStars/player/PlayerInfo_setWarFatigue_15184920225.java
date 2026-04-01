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
import java.lang.Integer;

public class PlayerInfo_setWarFatigue_15184920225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536939;
     Object term5536948;

    public PlayerInfo_setWarFatigue_15184920225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536939 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536939, term5536939.getClass(), "race", null);
        setField(term5536939, term5536939.getClass(), "government", null);
        setIntField(term5536939, term5536939.getClass(), "warFatigue", 0);
        setField(term5536939, term5536939.getClass(), "empireName", null);
        setIntField(term5536939, term5536939.getClass(), "totalCredits", 0);
        setField(term5536939, term5536939.getClass(), "techList", null);
        setField(term5536939, term5536939.getClass(), "msgList", null);
        setField(term5536939, term5536939.getClass(), "shipStatList", null);
        setField(term5536939, term5536939.getClass(), "fleets", null);
        setField(term5536939, term5536939.getClass(), "mapData", null);
        setField(term5536939, term5536939.getClass(), "mapCloakDetection", null);
        setField(term5536939, term5536939.getClass(), "maxCoordinate", null);
        setBooleanField(term5536939, term5536939.getClass(), "human", false);
        setBooleanField(term5536939, term5536939.getClass(), "board", false);
        setField(term5536939, term5536939.getClass(), "missions", null);
        setField(term5536939, term5536939.getClass(), "diplomacy", null);
        setField(term5536939, term5536939.getClass(), "espionage", null);
        setIntField(term5536939, term5536939.getClass(), "fakeMilitarySize", 0);
        setField(term5536939, term5536939.getClass(), "attitude", null);
        setField(term5536939, term5536939.getClass(), "randomEventOccured", null);
        setField(term5536939, term5536939.getClass(), "strategy", null);
        setBooleanField(term5536939, term5536939.getClass(), "elderRealm", false);
        setField(term5536939, term5536939.getClass(), "leaderPool", null);
        setField(term5536939, term5536939.getClass(), "leaderRecruitPool", null);
        setField(term5536939, term5536939.getClass(), "ruler", null);
        setField(term5536939, term5536939.getClass(), "color", null);
        setField(term5536939, term5536939.getClass(), "interceptableFleets", null);
        setField(term5536939, term5536939.getClass(), "centerRealm", null);
        setField(term5536939, term5536939.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536939, term5536939.getClass(), "aiDifficulty", null);
        setField(term5536939, term5536939.getClass(), "artifactLists", null);
        setBooleanField(term5536939, term5536939.getClass(), "realmLost", false);
        setField(term5536939, term5536939.getClass(), "backgroundStory", null);
        setBooleanField(term5536939, term5536939.getClass(), "enemyShipsDetected", false);
        setField(term5536939, term5536939.getClass(), "startingScenario", null);
        term5536948 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5536948;
        callMethod(klass, "setWarFatigue", argTypes, term5536939, args);
    }

};


