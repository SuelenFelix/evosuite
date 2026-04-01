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

public class PlayerInfo_getShipStatHighestNumber_30516138180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4844734;

    public PlayerInfo_getShipStatHighestNumber_30516138180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4844734 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4844734, term4844734.getClass(), "race", null);
        setField(term4844734, term4844734.getClass(), "government", null);
        setIntField(term4844734, term4844734.getClass(), "warFatigue", 0);
        setField(term4844734, term4844734.getClass(), "empireName", null);
        setIntField(term4844734, term4844734.getClass(), "totalCredits", 0);
        setField(term4844734, term4844734.getClass(), "techList", null);
        setField(term4844734, term4844734.getClass(), "msgList", null);
        setField(term4844734, term4844734.getClass(), "shipStatList", null);
        setField(term4844734, term4844734.getClass(), "fleets", null);
        setField(term4844734, term4844734.getClass(), "mapData", null);
        setField(term4844734, term4844734.getClass(), "mapCloakDetection", null);
        setField(term4844734, term4844734.getClass(), "maxCoordinate", null);
        setBooleanField(term4844734, term4844734.getClass(), "human", false);
        setBooleanField(term4844734, term4844734.getClass(), "board", false);
        setField(term4844734, term4844734.getClass(), "missions", null);
        setField(term4844734, term4844734.getClass(), "diplomacy", null);
        setField(term4844734, term4844734.getClass(), "espionage", null);
        setIntField(term4844734, term4844734.getClass(), "fakeMilitarySize", 0);
        setField(term4844734, term4844734.getClass(), "attitude", null);
        setField(term4844734, term4844734.getClass(), "randomEventOccured", null);
        setField(term4844734, term4844734.getClass(), "strategy", null);
        setBooleanField(term4844734, term4844734.getClass(), "elderRealm", false);
        setField(term4844734, term4844734.getClass(), "leaderPool", null);
        setField(term4844734, term4844734.getClass(), "leaderRecruitPool", null);
        setField(term4844734, term4844734.getClass(), "ruler", null);
        setField(term4844734, term4844734.getClass(), "color", null);
        setField(term4844734, term4844734.getClass(), "interceptableFleets", null);
        setField(term4844734, term4844734.getClass(), "centerRealm", null);
        setField(term4844734, term4844734.getClass(), "bestPlanetForTechWorld", null);
        setField(term4844734, term4844734.getClass(), "aiDifficulty", null);
        setField(term4844734, term4844734.getClass(), "artifactLists", null);
        setBooleanField(term4844734, term4844734.getClass(), "realmLost", false);
        setField(term4844734, term4844734.getClass(), "backgroundStory", null);
        setBooleanField(term4844734, term4844734.getClass(), "enemyShipsDetected", false);
        setField(term4844734, term4844734.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getShipStatHighestNumber", argTypes, term4844734, args);
    }

};


