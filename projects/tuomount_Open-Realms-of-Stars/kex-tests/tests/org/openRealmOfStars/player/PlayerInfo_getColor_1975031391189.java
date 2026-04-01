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

public class PlayerInfo_getColor_1975031391189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5427178;

    public PlayerInfo_getColor_1975031391189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5427178 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5427178, term5427178.getClass(), "race", null);
        setField(term5427178, term5427178.getClass(), "government", null);
        setIntField(term5427178, term5427178.getClass(), "warFatigue", 0);
        setField(term5427178, term5427178.getClass(), "empireName", null);
        setIntField(term5427178, term5427178.getClass(), "totalCredits", 0);
        setField(term5427178, term5427178.getClass(), "techList", null);
        setField(term5427178, term5427178.getClass(), "msgList", null);
        setField(term5427178, term5427178.getClass(), "shipStatList", null);
        setField(term5427178, term5427178.getClass(), "fleets", null);
        setField(term5427178, term5427178.getClass(), "mapData", null);
        setField(term5427178, term5427178.getClass(), "mapCloakDetection", null);
        setField(term5427178, term5427178.getClass(), "maxCoordinate", null);
        setBooleanField(term5427178, term5427178.getClass(), "human", false);
        setBooleanField(term5427178, term5427178.getClass(), "board", false);
        setField(term5427178, term5427178.getClass(), "missions", null);
        setField(term5427178, term5427178.getClass(), "diplomacy", null);
        setField(term5427178, term5427178.getClass(), "espionage", null);
        setIntField(term5427178, term5427178.getClass(), "fakeMilitarySize", 0);
        setField(term5427178, term5427178.getClass(), "attitude", null);
        setField(term5427178, term5427178.getClass(), "randomEventOccured", null);
        setField(term5427178, term5427178.getClass(), "strategy", null);
        setBooleanField(term5427178, term5427178.getClass(), "elderRealm", false);
        setField(term5427178, term5427178.getClass(), "leaderPool", null);
        setField(term5427178, term5427178.getClass(), "leaderRecruitPool", null);
        setField(term5427178, term5427178.getClass(), "ruler", null);
        setField(term5427178, term5427178.getClass(), "color", null);
        setField(term5427178, term5427178.getClass(), "interceptableFleets", null);
        setField(term5427178, term5427178.getClass(), "centerRealm", null);
        setField(term5427178, term5427178.getClass(), "bestPlanetForTechWorld", null);
        setField(term5427178, term5427178.getClass(), "aiDifficulty", null);
        setField(term5427178, term5427178.getClass(), "artifactLists", null);
        setBooleanField(term5427178, term5427178.getClass(), "realmLost", false);
        setField(term5427178, term5427178.getClass(), "backgroundStory", null);
        setBooleanField(term5427178, term5427178.getClass(), "enemyShipsDetected", false);
        setField(term5427178, term5427178.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColor", argTypes, term5427178, args);
    }

};


