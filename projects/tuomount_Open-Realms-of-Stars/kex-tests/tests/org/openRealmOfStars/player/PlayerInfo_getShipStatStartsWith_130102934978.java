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

public class PlayerInfo_getShipStatStartsWith_130102934978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4836627;

    public PlayerInfo_getShipStatStartsWith_130102934978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4836627 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4836627, term4836627.getClass(), "race", null);
        setField(term4836627, term4836627.getClass(), "government", null);
        setIntField(term4836627, term4836627.getClass(), "warFatigue", 0);
        setField(term4836627, term4836627.getClass(), "empireName", null);
        setIntField(term4836627, term4836627.getClass(), "totalCredits", 0);
        setField(term4836627, term4836627.getClass(), "techList", null);
        setField(term4836627, term4836627.getClass(), "msgList", null);
        setField(term4836627, term4836627.getClass(), "shipStatList", null);
        setField(term4836627, term4836627.getClass(), "fleets", null);
        setField(term4836627, term4836627.getClass(), "mapData", null);
        setField(term4836627, term4836627.getClass(), "mapCloakDetection", null);
        setField(term4836627, term4836627.getClass(), "maxCoordinate", null);
        setBooleanField(term4836627, term4836627.getClass(), "human", false);
        setBooleanField(term4836627, term4836627.getClass(), "board", false);
        setField(term4836627, term4836627.getClass(), "missions", null);
        setField(term4836627, term4836627.getClass(), "diplomacy", null);
        setField(term4836627, term4836627.getClass(), "espionage", null);
        setIntField(term4836627, term4836627.getClass(), "fakeMilitarySize", 0);
        setField(term4836627, term4836627.getClass(), "attitude", null);
        setField(term4836627, term4836627.getClass(), "randomEventOccured", null);
        setField(term4836627, term4836627.getClass(), "strategy", null);
        setBooleanField(term4836627, term4836627.getClass(), "elderRealm", false);
        setField(term4836627, term4836627.getClass(), "leaderPool", null);
        setField(term4836627, term4836627.getClass(), "leaderRecruitPool", null);
        setField(term4836627, term4836627.getClass(), "ruler", null);
        setField(term4836627, term4836627.getClass(), "color", null);
        setField(term4836627, term4836627.getClass(), "interceptableFleets", null);
        setField(term4836627, term4836627.getClass(), "centerRealm", null);
        setField(term4836627, term4836627.getClass(), "bestPlanetForTechWorld", null);
        setField(term4836627, term4836627.getClass(), "aiDifficulty", null);
        setField(term4836627, term4836627.getClass(), "artifactLists", null);
        setBooleanField(term4836627, term4836627.getClass(), "realmLost", false);
        setField(term4836627, term4836627.getClass(), "backgroundStory", null);
        setBooleanField(term4836627, term4836627.getClass(), "enemyShipsDetected", false);
        setField(term4836627, term4836627.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getShipStatStartsWith", argTypes, term4836627, args);
    }

};


