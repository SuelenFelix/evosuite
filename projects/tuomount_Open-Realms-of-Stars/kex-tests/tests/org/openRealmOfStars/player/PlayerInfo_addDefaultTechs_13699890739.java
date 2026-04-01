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

public class PlayerInfo_addDefaultTechs_13699890739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4525076;

    public PlayerInfo_addDefaultTechs_13699890739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4525076 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4525076, term4525076.getClass(), "race", null);
        setField(term4525076, term4525076.getClass(), "government", null);
        setIntField(term4525076, term4525076.getClass(), "warFatigue", 0);
        setField(term4525076, term4525076.getClass(), "empireName", null);
        setIntField(term4525076, term4525076.getClass(), "totalCredits", 0);
        setField(term4525076, term4525076.getClass(), "techList", null);
        setField(term4525076, term4525076.getClass(), "msgList", null);
        setField(term4525076, term4525076.getClass(), "shipStatList", null);
        setField(term4525076, term4525076.getClass(), "fleets", null);
        setField(term4525076, term4525076.getClass(), "mapData", null);
        setField(term4525076, term4525076.getClass(), "mapCloakDetection", null);
        setField(term4525076, term4525076.getClass(), "maxCoordinate", null);
        setBooleanField(term4525076, term4525076.getClass(), "human", false);
        setBooleanField(term4525076, term4525076.getClass(), "board", false);
        setField(term4525076, term4525076.getClass(), "missions", null);
        setField(term4525076, term4525076.getClass(), "diplomacy", null);
        setField(term4525076, term4525076.getClass(), "espionage", null);
        setIntField(term4525076, term4525076.getClass(), "fakeMilitarySize", 0);
        setField(term4525076, term4525076.getClass(), "attitude", null);
        setField(term4525076, term4525076.getClass(), "randomEventOccured", null);
        setField(term4525076, term4525076.getClass(), "strategy", null);
        setBooleanField(term4525076, term4525076.getClass(), "elderRealm", false);
        setField(term4525076, term4525076.getClass(), "leaderPool", null);
        setField(term4525076, term4525076.getClass(), "leaderRecruitPool", null);
        setField(term4525076, term4525076.getClass(), "ruler", null);
        setField(term4525076, term4525076.getClass(), "color", null);
        setField(term4525076, term4525076.getClass(), "interceptableFleets", null);
        setField(term4525076, term4525076.getClass(), "centerRealm", null);
        setField(term4525076, term4525076.getClass(), "bestPlanetForTechWorld", null);
        setField(term4525076, term4525076.getClass(), "aiDifficulty", null);
        setField(term4525076, term4525076.getClass(), "artifactLists", null);
        setBooleanField(term4525076, term4525076.getClass(), "realmLost", false);
        setField(term4525076, term4525076.getClass(), "backgroundStory", null);
        setBooleanField(term4525076, term4525076.getClass(), "enemyShipsDetected", false);
        setField(term4525076, term4525076.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addDefaultTechs", argTypes, term4525076, args);
    }

};


