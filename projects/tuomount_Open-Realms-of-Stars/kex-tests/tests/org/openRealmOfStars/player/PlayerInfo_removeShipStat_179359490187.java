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

public class PlayerInfo_removeShipStat_179359490187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4882385;
     Object term4882394;

    public PlayerInfo_removeShipStat_179359490187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4882385 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4882385, term4882385.getClass(), "race", null);
        setField(term4882385, term4882385.getClass(), "government", null);
        setIntField(term4882385, term4882385.getClass(), "warFatigue", 0);
        setField(term4882385, term4882385.getClass(), "empireName", null);
        setIntField(term4882385, term4882385.getClass(), "totalCredits", 0);
        setField(term4882385, term4882385.getClass(), "techList", null);
        setField(term4882385, term4882385.getClass(), "msgList", null);
        setField(term4882385, term4882385.getClass(), "shipStatList", null);
        setField(term4882385, term4882385.getClass(), "fleets", null);
        setField(term4882385, term4882385.getClass(), "mapData", null);
        setField(term4882385, term4882385.getClass(), "mapCloakDetection", null);
        setField(term4882385, term4882385.getClass(), "maxCoordinate", null);
        setBooleanField(term4882385, term4882385.getClass(), "human", false);
        setBooleanField(term4882385, term4882385.getClass(), "board", false);
        setField(term4882385, term4882385.getClass(), "missions", null);
        setField(term4882385, term4882385.getClass(), "diplomacy", null);
        setField(term4882385, term4882385.getClass(), "espionage", null);
        setIntField(term4882385, term4882385.getClass(), "fakeMilitarySize", 0);
        setField(term4882385, term4882385.getClass(), "attitude", null);
        setField(term4882385, term4882385.getClass(), "randomEventOccured", null);
        setField(term4882385, term4882385.getClass(), "strategy", null);
        setBooleanField(term4882385, term4882385.getClass(), "elderRealm", false);
        setField(term4882385, term4882385.getClass(), "leaderPool", null);
        setField(term4882385, term4882385.getClass(), "leaderRecruitPool", null);
        setField(term4882385, term4882385.getClass(), "ruler", null);
        setField(term4882385, term4882385.getClass(), "color", null);
        setField(term4882385, term4882385.getClass(), "interceptableFleets", null);
        setField(term4882385, term4882385.getClass(), "centerRealm", null);
        setField(term4882385, term4882385.getClass(), "bestPlanetForTechWorld", null);
        setField(term4882385, term4882385.getClass(), "aiDifficulty", null);
        setField(term4882385, term4882385.getClass(), "artifactLists", null);
        setBooleanField(term4882385, term4882385.getClass(), "realmLost", false);
        setField(term4882385, term4882385.getClass(), "backgroundStory", null);
        setBooleanField(term4882385, term4882385.getClass(), "enemyShipsDetected", false);
        setField(term4882385, term4882385.getClass(), "startingScenario", null);
        term4882394 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4882394;
        callMethod(klass, "removeShipStat", argTypes, term4882385, args);
    }

};


