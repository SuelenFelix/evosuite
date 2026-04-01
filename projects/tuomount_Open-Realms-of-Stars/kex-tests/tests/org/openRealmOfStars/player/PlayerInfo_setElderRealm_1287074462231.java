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

public class PlayerInfo_setElderRealm_1287074462231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536999;
     Object term5537008;

    public PlayerInfo_setElderRealm_1287074462231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536999 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536999, term5536999.getClass(), "race", null);
        setField(term5536999, term5536999.getClass(), "government", null);
        setIntField(term5536999, term5536999.getClass(), "warFatigue", 0);
        setField(term5536999, term5536999.getClass(), "empireName", null);
        setIntField(term5536999, term5536999.getClass(), "totalCredits", 0);
        setField(term5536999, term5536999.getClass(), "techList", null);
        setField(term5536999, term5536999.getClass(), "msgList", null);
        setField(term5536999, term5536999.getClass(), "shipStatList", null);
        setField(term5536999, term5536999.getClass(), "fleets", null);
        setField(term5536999, term5536999.getClass(), "mapData", null);
        setField(term5536999, term5536999.getClass(), "mapCloakDetection", null);
        setField(term5536999, term5536999.getClass(), "maxCoordinate", null);
        setBooleanField(term5536999, term5536999.getClass(), "human", false);
        setBooleanField(term5536999, term5536999.getClass(), "board", false);
        setField(term5536999, term5536999.getClass(), "missions", null);
        setField(term5536999, term5536999.getClass(), "diplomacy", null);
        setField(term5536999, term5536999.getClass(), "espionage", null);
        setIntField(term5536999, term5536999.getClass(), "fakeMilitarySize", 0);
        setField(term5536999, term5536999.getClass(), "attitude", null);
        setField(term5536999, term5536999.getClass(), "randomEventOccured", null);
        setField(term5536999, term5536999.getClass(), "strategy", null);
        setBooleanField(term5536999, term5536999.getClass(), "elderRealm", false);
        setField(term5536999, term5536999.getClass(), "leaderPool", null);
        setField(term5536999, term5536999.getClass(), "leaderRecruitPool", null);
        setField(term5536999, term5536999.getClass(), "ruler", null);
        setField(term5536999, term5536999.getClass(), "color", null);
        setField(term5536999, term5536999.getClass(), "interceptableFleets", null);
        setField(term5536999, term5536999.getClass(), "centerRealm", null);
        setField(term5536999, term5536999.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536999, term5536999.getClass(), "aiDifficulty", null);
        setField(term5536999, term5536999.getClass(), "artifactLists", null);
        setBooleanField(term5536999, term5536999.getClass(), "realmLost", false);
        setField(term5536999, term5536999.getClass(), "backgroundStory", null);
        setBooleanField(term5536999, term5536999.getClass(), "enemyShipsDetected", false);
        setField(term5536999, term5536999.getClass(), "startingScenario", null);
        term5537008 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5537008;
        callMethod(klass, "setElderRealm", argTypes, term5536999, args);
    }

};


