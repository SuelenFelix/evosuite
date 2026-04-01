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
import java.lang.Boolean;

public class PlayerInfo_setRealmLost_945136520199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5479701;
     Object term5479710;

    public PlayerInfo_setRealmLost_945136520199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5479701 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5479701, term5479701.getClass(), "race", null);
        setField(term5479701, term5479701.getClass(), "government", null);
        setIntField(term5479701, term5479701.getClass(), "warFatigue", 0);
        setField(term5479701, term5479701.getClass(), "empireName", null);
        setIntField(term5479701, term5479701.getClass(), "totalCredits", 0);
        setField(term5479701, term5479701.getClass(), "techList", null);
        setField(term5479701, term5479701.getClass(), "msgList", null);
        setField(term5479701, term5479701.getClass(), "shipStatList", null);
        setField(term5479701, term5479701.getClass(), "fleets", null);
        setField(term5479701, term5479701.getClass(), "mapData", null);
        setField(term5479701, term5479701.getClass(), "mapCloakDetection", null);
        setField(term5479701, term5479701.getClass(), "maxCoordinate", null);
        setBooleanField(term5479701, term5479701.getClass(), "human", false);
        setBooleanField(term5479701, term5479701.getClass(), "board", false);
        setField(term5479701, term5479701.getClass(), "missions", null);
        setField(term5479701, term5479701.getClass(), "diplomacy", null);
        setField(term5479701, term5479701.getClass(), "espionage", null);
        setIntField(term5479701, term5479701.getClass(), "fakeMilitarySize", 0);
        setField(term5479701, term5479701.getClass(), "attitude", null);
        setField(term5479701, term5479701.getClass(), "randomEventOccured", null);
        setField(term5479701, term5479701.getClass(), "strategy", null);
        setBooleanField(term5479701, term5479701.getClass(), "elderRealm", false);
        setField(term5479701, term5479701.getClass(), "leaderPool", null);
        setField(term5479701, term5479701.getClass(), "leaderRecruitPool", null);
        setField(term5479701, term5479701.getClass(), "ruler", null);
        setField(term5479701, term5479701.getClass(), "color", null);
        setField(term5479701, term5479701.getClass(), "interceptableFleets", null);
        setField(term5479701, term5479701.getClass(), "centerRealm", null);
        setField(term5479701, term5479701.getClass(), "bestPlanetForTechWorld", null);
        setField(term5479701, term5479701.getClass(), "aiDifficulty", null);
        setField(term5479701, term5479701.getClass(), "artifactLists", null);
        setBooleanField(term5479701, term5479701.getClass(), "realmLost", false);
        setField(term5479701, term5479701.getClass(), "backgroundStory", null);
        setBooleanField(term5479701, term5479701.getClass(), "enemyShipsDetected", false);
        setField(term5479701, term5479701.getClass(), "startingScenario", null);
        term5479710 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5479710;
        callMethod(klass, "setRealmLost", argTypes, term5479701, args);
    }

};


