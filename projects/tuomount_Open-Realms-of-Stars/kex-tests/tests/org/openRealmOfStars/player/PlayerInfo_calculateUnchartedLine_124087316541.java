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

public class PlayerInfo_calculateUnchartedLine_124087316541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4662450;
     Object term4662459;
     Object term4662461;
     Object term4662463;
     Object term4662465;

    public PlayerInfo_calculateUnchartedLine_124087316541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4662450 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4662450, term4662450.getClass(), "race", null);
        setField(term4662450, term4662450.getClass(), "government", null);
        setIntField(term4662450, term4662450.getClass(), "warFatigue", 0);
        setField(term4662450, term4662450.getClass(), "empireName", null);
        setIntField(term4662450, term4662450.getClass(), "totalCredits", 0);
        setField(term4662450, term4662450.getClass(), "techList", null);
        setField(term4662450, term4662450.getClass(), "msgList", null);
        setField(term4662450, term4662450.getClass(), "shipStatList", null);
        setField(term4662450, term4662450.getClass(), "fleets", null);
        setField(term4662450, term4662450.getClass(), "mapData", null);
        setField(term4662450, term4662450.getClass(), "mapCloakDetection", null);
        setField(term4662450, term4662450.getClass(), "maxCoordinate", null);
        setBooleanField(term4662450, term4662450.getClass(), "human", false);
        setBooleanField(term4662450, term4662450.getClass(), "board", false);
        setField(term4662450, term4662450.getClass(), "missions", null);
        setField(term4662450, term4662450.getClass(), "diplomacy", null);
        setField(term4662450, term4662450.getClass(), "espionage", null);
        setIntField(term4662450, term4662450.getClass(), "fakeMilitarySize", 0);
        setField(term4662450, term4662450.getClass(), "attitude", null);
        setField(term4662450, term4662450.getClass(), "randomEventOccured", null);
        setField(term4662450, term4662450.getClass(), "strategy", null);
        setBooleanField(term4662450, term4662450.getClass(), "elderRealm", false);
        setField(term4662450, term4662450.getClass(), "leaderPool", null);
        setField(term4662450, term4662450.getClass(), "leaderRecruitPool", null);
        setField(term4662450, term4662450.getClass(), "ruler", null);
        setField(term4662450, term4662450.getClass(), "color", null);
        setField(term4662450, term4662450.getClass(), "interceptableFleets", null);
        setField(term4662450, term4662450.getClass(), "centerRealm", null);
        setField(term4662450, term4662450.getClass(), "bestPlanetForTechWorld", null);
        setField(term4662450, term4662450.getClass(), "aiDifficulty", null);
        setField(term4662450, term4662450.getClass(), "artifactLists", null);
        setBooleanField(term4662450, term4662450.getClass(), "realmLost", false);
        setField(term4662450, term4662450.getClass(), "backgroundStory", null);
        setBooleanField(term4662450, term4662450.getClass(), "enemyShipsDetected", false);
        setField(term4662450, term4662450.getClass(), "startingScenario", null);
        term4662459 = new Integer(0);
        term4662461 = new Integer(0);
        term4662463 = new Integer(0);
        term4662465 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4662459;
        args[1] = term4662461;
        args[2] = term4662463;
        args[3] = term4662465;
        callMethod(klass, "calculateUnchartedLine", argTypes, term4662450, args);
    }

};


