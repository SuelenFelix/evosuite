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

public class PlayerInfo_getTotalWarFatigue_224968270104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4967142;

    public PlayerInfo_getTotalWarFatigue_224968270104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4967142 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4967142, term4967142.getClass(), "race", null);
        setField(term4967142, term4967142.getClass(), "government", null);
        setIntField(term4967142, term4967142.getClass(), "warFatigue", 0);
        setField(term4967142, term4967142.getClass(), "empireName", null);
        setIntField(term4967142, term4967142.getClass(), "totalCredits", 0);
        setField(term4967142, term4967142.getClass(), "techList", null);
        setField(term4967142, term4967142.getClass(), "msgList", null);
        setField(term4967142, term4967142.getClass(), "shipStatList", null);
        setField(term4967142, term4967142.getClass(), "fleets", null);
        setField(term4967142, term4967142.getClass(), "mapData", null);
        setField(term4967142, term4967142.getClass(), "mapCloakDetection", null);
        setField(term4967142, term4967142.getClass(), "maxCoordinate", null);
        setBooleanField(term4967142, term4967142.getClass(), "human", false);
        setBooleanField(term4967142, term4967142.getClass(), "board", false);
        setField(term4967142, term4967142.getClass(), "missions", null);
        setField(term4967142, term4967142.getClass(), "diplomacy", null);
        setField(term4967142, term4967142.getClass(), "espionage", null);
        setIntField(term4967142, term4967142.getClass(), "fakeMilitarySize", 0);
        setField(term4967142, term4967142.getClass(), "attitude", null);
        setField(term4967142, term4967142.getClass(), "randomEventOccured", null);
        setField(term4967142, term4967142.getClass(), "strategy", null);
        setBooleanField(term4967142, term4967142.getClass(), "elderRealm", false);
        setField(term4967142, term4967142.getClass(), "leaderPool", null);
        setField(term4967142, term4967142.getClass(), "leaderRecruitPool", null);
        setField(term4967142, term4967142.getClass(), "ruler", null);
        setField(term4967142, term4967142.getClass(), "color", null);
        setField(term4967142, term4967142.getClass(), "interceptableFleets", null);
        setField(term4967142, term4967142.getClass(), "centerRealm", null);
        setField(term4967142, term4967142.getClass(), "bestPlanetForTechWorld", null);
        setField(term4967142, term4967142.getClass(), "aiDifficulty", null);
        setField(term4967142, term4967142.getClass(), "artifactLists", null);
        setBooleanField(term4967142, term4967142.getClass(), "realmLost", false);
        setField(term4967142, term4967142.getClass(), "backgroundStory", null);
        setBooleanField(term4967142, term4967142.getClass(), "enemyShipsDetected", false);
        setField(term4967142, term4967142.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalWarFatigue", argTypes, term4967142, args);
    }

};


