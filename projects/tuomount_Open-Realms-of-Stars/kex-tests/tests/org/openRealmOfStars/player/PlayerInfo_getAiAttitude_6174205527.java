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

public class PlayerInfo_getAiAttitude_6174205527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4607580;

    public PlayerInfo_getAiAttitude_6174205527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4607580 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4607580, term4607580.getClass(), "race", null);
        setField(term4607580, term4607580.getClass(), "government", null);
        setIntField(term4607580, term4607580.getClass(), "warFatigue", 0);
        setField(term4607580, term4607580.getClass(), "empireName", null);
        setIntField(term4607580, term4607580.getClass(), "totalCredits", 0);
        setField(term4607580, term4607580.getClass(), "techList", null);
        setField(term4607580, term4607580.getClass(), "msgList", null);
        setField(term4607580, term4607580.getClass(), "shipStatList", null);
        setField(term4607580, term4607580.getClass(), "fleets", null);
        setField(term4607580, term4607580.getClass(), "mapData", null);
        setField(term4607580, term4607580.getClass(), "mapCloakDetection", null);
        setField(term4607580, term4607580.getClass(), "maxCoordinate", null);
        setBooleanField(term4607580, term4607580.getClass(), "human", false);
        setBooleanField(term4607580, term4607580.getClass(), "board", false);
        setField(term4607580, term4607580.getClass(), "missions", null);
        setField(term4607580, term4607580.getClass(), "diplomacy", null);
        setField(term4607580, term4607580.getClass(), "espionage", null);
        setIntField(term4607580, term4607580.getClass(), "fakeMilitarySize", 0);
        setField(term4607580, term4607580.getClass(), "attitude", null);
        setField(term4607580, term4607580.getClass(), "randomEventOccured", null);
        setField(term4607580, term4607580.getClass(), "strategy", null);
        setBooleanField(term4607580, term4607580.getClass(), "elderRealm", false);
        setField(term4607580, term4607580.getClass(), "leaderPool", null);
        setField(term4607580, term4607580.getClass(), "leaderRecruitPool", null);
        setField(term4607580, term4607580.getClass(), "ruler", null);
        setField(term4607580, term4607580.getClass(), "color", null);
        setField(term4607580, term4607580.getClass(), "interceptableFleets", null);
        setField(term4607580, term4607580.getClass(), "centerRealm", null);
        setField(term4607580, term4607580.getClass(), "bestPlanetForTechWorld", null);
        setField(term4607580, term4607580.getClass(), "aiDifficulty", null);
        setField(term4607580, term4607580.getClass(), "artifactLists", null);
        setBooleanField(term4607580, term4607580.getClass(), "realmLost", false);
        setField(term4607580, term4607580.getClass(), "backgroundStory", null);
        setBooleanField(term4607580, term4607580.getClass(), "enemyShipsDetected", false);
        setField(term4607580, term4607580.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAiAttitude", argTypes, term4607580, args);
    }

};


