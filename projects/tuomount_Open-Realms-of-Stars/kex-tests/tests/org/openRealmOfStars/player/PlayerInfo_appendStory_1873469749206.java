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

public class PlayerInfo_appendStory_1873469749206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5510662;
     Object term5510671;

    public PlayerInfo_appendStory_1873469749206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5510662 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5510662, term5510662.getClass(), "race", null);
        setField(term5510662, term5510662.getClass(), "government", null);
        setIntField(term5510662, term5510662.getClass(), "warFatigue", 0);
        setField(term5510662, term5510662.getClass(), "empireName", null);
        setIntField(term5510662, term5510662.getClass(), "totalCredits", 0);
        setField(term5510662, term5510662.getClass(), "techList", null);
        setField(term5510662, term5510662.getClass(), "msgList", null);
        setField(term5510662, term5510662.getClass(), "shipStatList", null);
        setField(term5510662, term5510662.getClass(), "fleets", null);
        setField(term5510662, term5510662.getClass(), "mapData", null);
        setField(term5510662, term5510662.getClass(), "mapCloakDetection", null);
        setField(term5510662, term5510662.getClass(), "maxCoordinate", null);
        setBooleanField(term5510662, term5510662.getClass(), "human", false);
        setBooleanField(term5510662, term5510662.getClass(), "board", false);
        setField(term5510662, term5510662.getClass(), "missions", null);
        setField(term5510662, term5510662.getClass(), "diplomacy", null);
        setField(term5510662, term5510662.getClass(), "espionage", null);
        setIntField(term5510662, term5510662.getClass(), "fakeMilitarySize", 0);
        setField(term5510662, term5510662.getClass(), "attitude", null);
        setField(term5510662, term5510662.getClass(), "randomEventOccured", null);
        setField(term5510662, term5510662.getClass(), "strategy", null);
        setBooleanField(term5510662, term5510662.getClass(), "elderRealm", false);
        setField(term5510662, term5510662.getClass(), "leaderPool", null);
        setField(term5510662, term5510662.getClass(), "leaderRecruitPool", null);
        setField(term5510662, term5510662.getClass(), "ruler", null);
        setField(term5510662, term5510662.getClass(), "color", null);
        setField(term5510662, term5510662.getClass(), "interceptableFleets", null);
        setField(term5510662, term5510662.getClass(), "centerRealm", null);
        setField(term5510662, term5510662.getClass(), "bestPlanetForTechWorld", null);
        setField(term5510662, term5510662.getClass(), "aiDifficulty", null);
        setField(term5510662, term5510662.getClass(), "artifactLists", null);
        setBooleanField(term5510662, term5510662.getClass(), "realmLost", false);
        setField(term5510662, term5510662.getClass(), "backgroundStory", null);
        setBooleanField(term5510662, term5510662.getClass(), "enemyShipsDetected", false);
        setField(term5510662, term5510662.getClass(), "startingScenario", null);
        term5510671 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5510671;
        callMethod(klass, "appendStory", argTypes, term5510662, args);
    }

};


