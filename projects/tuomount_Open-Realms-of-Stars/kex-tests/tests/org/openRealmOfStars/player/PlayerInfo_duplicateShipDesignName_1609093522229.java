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

public class PlayerInfo_duplicateShipDesignName_1609093522229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536981;

    public PlayerInfo_duplicateShipDesignName_1609093522229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536981 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536981, term5536981.getClass(), "race", null);
        setField(term5536981, term5536981.getClass(), "government", null);
        setIntField(term5536981, term5536981.getClass(), "warFatigue", 0);
        setField(term5536981, term5536981.getClass(), "empireName", null);
        setIntField(term5536981, term5536981.getClass(), "totalCredits", 0);
        setField(term5536981, term5536981.getClass(), "techList", null);
        setField(term5536981, term5536981.getClass(), "msgList", null);
        setField(term5536981, term5536981.getClass(), "shipStatList", null);
        setField(term5536981, term5536981.getClass(), "fleets", null);
        setField(term5536981, term5536981.getClass(), "mapData", null);
        setField(term5536981, term5536981.getClass(), "mapCloakDetection", null);
        setField(term5536981, term5536981.getClass(), "maxCoordinate", null);
        setBooleanField(term5536981, term5536981.getClass(), "human", false);
        setBooleanField(term5536981, term5536981.getClass(), "board", false);
        setField(term5536981, term5536981.getClass(), "missions", null);
        setField(term5536981, term5536981.getClass(), "diplomacy", null);
        setField(term5536981, term5536981.getClass(), "espionage", null);
        setIntField(term5536981, term5536981.getClass(), "fakeMilitarySize", 0);
        setField(term5536981, term5536981.getClass(), "attitude", null);
        setField(term5536981, term5536981.getClass(), "randomEventOccured", null);
        setField(term5536981, term5536981.getClass(), "strategy", null);
        setBooleanField(term5536981, term5536981.getClass(), "elderRealm", false);
        setField(term5536981, term5536981.getClass(), "leaderPool", null);
        setField(term5536981, term5536981.getClass(), "leaderRecruitPool", null);
        setField(term5536981, term5536981.getClass(), "ruler", null);
        setField(term5536981, term5536981.getClass(), "color", null);
        setField(term5536981, term5536981.getClass(), "interceptableFleets", null);
        setField(term5536981, term5536981.getClass(), "centerRealm", null);
        setField(term5536981, term5536981.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536981, term5536981.getClass(), "aiDifficulty", null);
        setField(term5536981, term5536981.getClass(), "artifactLists", null);
        setBooleanField(term5536981, term5536981.getClass(), "realmLost", false);
        setField(term5536981, term5536981.getClass(), "backgroundStory", null);
        setBooleanField(term5536981, term5536981.getClass(), "enemyShipsDetected", false);
        setField(term5536981, term5536981.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "duplicateShipDesignName", argTypes, term5536981, args);
    }

};


