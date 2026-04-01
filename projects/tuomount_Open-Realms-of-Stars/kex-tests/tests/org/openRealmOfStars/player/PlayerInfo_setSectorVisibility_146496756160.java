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
import java.lang.Byte;

public class PlayerInfo_setSectorVisibility_146496756160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4760157;
     Object term4760166;
     Object term4760168;
     Object term4760170;

    public PlayerInfo_setSectorVisibility_146496756160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4760157 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4760157, term4760157.getClass(), "race", null);
        setField(term4760157, term4760157.getClass(), "government", null);
        setIntField(term4760157, term4760157.getClass(), "warFatigue", 0);
        setField(term4760157, term4760157.getClass(), "empireName", null);
        setIntField(term4760157, term4760157.getClass(), "totalCredits", 0);
        setField(term4760157, term4760157.getClass(), "techList", null);
        setField(term4760157, term4760157.getClass(), "msgList", null);
        setField(term4760157, term4760157.getClass(), "shipStatList", null);
        setField(term4760157, term4760157.getClass(), "fleets", null);
        setField(term4760157, term4760157.getClass(), "mapData", null);
        setField(term4760157, term4760157.getClass(), "mapCloakDetection", null);
        setField(term4760157, term4760157.getClass(), "maxCoordinate", null);
        setBooleanField(term4760157, term4760157.getClass(), "human", false);
        setBooleanField(term4760157, term4760157.getClass(), "board", false);
        setField(term4760157, term4760157.getClass(), "missions", null);
        setField(term4760157, term4760157.getClass(), "diplomacy", null);
        setField(term4760157, term4760157.getClass(), "espionage", null);
        setIntField(term4760157, term4760157.getClass(), "fakeMilitarySize", 0);
        setField(term4760157, term4760157.getClass(), "attitude", null);
        setField(term4760157, term4760157.getClass(), "randomEventOccured", null);
        setField(term4760157, term4760157.getClass(), "strategy", null);
        setBooleanField(term4760157, term4760157.getClass(), "elderRealm", false);
        setField(term4760157, term4760157.getClass(), "leaderPool", null);
        setField(term4760157, term4760157.getClass(), "leaderRecruitPool", null);
        setField(term4760157, term4760157.getClass(), "ruler", null);
        setField(term4760157, term4760157.getClass(), "color", null);
        setField(term4760157, term4760157.getClass(), "interceptableFleets", null);
        setField(term4760157, term4760157.getClass(), "centerRealm", null);
        setField(term4760157, term4760157.getClass(), "bestPlanetForTechWorld", null);
        setField(term4760157, term4760157.getClass(), "aiDifficulty", null);
        setField(term4760157, term4760157.getClass(), "artifactLists", null);
        setBooleanField(term4760157, term4760157.getClass(), "realmLost", false);
        setField(term4760157, term4760157.getClass(), "backgroundStory", null);
        setBooleanField(term4760157, term4760157.getClass(), "enemyShipsDetected", false);
        setField(term4760157, term4760157.getClass(), "startingScenario", null);
        term4760166 = new Integer(0);
        term4760168 = new Integer(0);
        term4760170 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = byte.class;
        Object[] args = new Object[3];
        args[0] = term4760166;
        args[1] = term4760168;
        args[2] = term4760170;
        callMethod(klass, "setSectorVisibility", argTypes, term4760157, args);
    }

};


