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

public class PlayerInfo_setAiDifficulty_2001424438192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5445584;

    public PlayerInfo_setAiDifficulty_2001424438192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5445584 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5445584, term5445584.getClass(), "race", null);
        setField(term5445584, term5445584.getClass(), "government", null);
        setIntField(term5445584, term5445584.getClass(), "warFatigue", 0);
        setField(term5445584, term5445584.getClass(), "empireName", null);
        setIntField(term5445584, term5445584.getClass(), "totalCredits", 0);
        setField(term5445584, term5445584.getClass(), "techList", null);
        setField(term5445584, term5445584.getClass(), "msgList", null);
        setField(term5445584, term5445584.getClass(), "shipStatList", null);
        setField(term5445584, term5445584.getClass(), "fleets", null);
        setField(term5445584, term5445584.getClass(), "mapData", null);
        setField(term5445584, term5445584.getClass(), "mapCloakDetection", null);
        setField(term5445584, term5445584.getClass(), "maxCoordinate", null);
        setBooleanField(term5445584, term5445584.getClass(), "human", false);
        setBooleanField(term5445584, term5445584.getClass(), "board", false);
        setField(term5445584, term5445584.getClass(), "missions", null);
        setField(term5445584, term5445584.getClass(), "diplomacy", null);
        setField(term5445584, term5445584.getClass(), "espionage", null);
        setIntField(term5445584, term5445584.getClass(), "fakeMilitarySize", 0);
        setField(term5445584, term5445584.getClass(), "attitude", null);
        setField(term5445584, term5445584.getClass(), "randomEventOccured", null);
        setField(term5445584, term5445584.getClass(), "strategy", null);
        setBooleanField(term5445584, term5445584.getClass(), "elderRealm", false);
        setField(term5445584, term5445584.getClass(), "leaderPool", null);
        setField(term5445584, term5445584.getClass(), "leaderRecruitPool", null);
        setField(term5445584, term5445584.getClass(), "ruler", null);
        setField(term5445584, term5445584.getClass(), "color", null);
        setField(term5445584, term5445584.getClass(), "interceptableFleets", null);
        setField(term5445584, term5445584.getClass(), "centerRealm", null);
        setField(term5445584, term5445584.getClass(), "bestPlanetForTechWorld", null);
        setField(term5445584, term5445584.getClass(), "aiDifficulty", null);
        setField(term5445584, term5445584.getClass(), "artifactLists", null);
        setBooleanField(term5445584, term5445584.getClass(), "realmLost", false);
        setField(term5445584, term5445584.getClass(), "backgroundStory", null);
        setBooleanField(term5445584, term5445584.getClass(), "enemyShipsDetected", false);
        setField(term5445584, term5445584.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.AiDifficulty");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAiDifficulty", argTypes, term5445584, args);
    }

};


