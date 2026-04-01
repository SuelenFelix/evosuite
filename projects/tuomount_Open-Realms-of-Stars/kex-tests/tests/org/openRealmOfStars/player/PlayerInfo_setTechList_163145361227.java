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

public class PlayerInfo_setTechList_163145361227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536961;

    public PlayerInfo_setTechList_163145361227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536961 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5536961, term5536961.getClass(), "race", null);
        setField(term5536961, term5536961.getClass(), "government", null);
        setIntField(term5536961, term5536961.getClass(), "warFatigue", 0);
        setField(term5536961, term5536961.getClass(), "empireName", null);
        setIntField(term5536961, term5536961.getClass(), "totalCredits", 0);
        setField(term5536961, term5536961.getClass(), "techList", null);
        setField(term5536961, term5536961.getClass(), "msgList", null);
        setField(term5536961, term5536961.getClass(), "shipStatList", null);
        setField(term5536961, term5536961.getClass(), "fleets", null);
        setField(term5536961, term5536961.getClass(), "mapData", null);
        setField(term5536961, term5536961.getClass(), "mapCloakDetection", null);
        setField(term5536961, term5536961.getClass(), "maxCoordinate", null);
        setBooleanField(term5536961, term5536961.getClass(), "human", false);
        setBooleanField(term5536961, term5536961.getClass(), "board", false);
        setField(term5536961, term5536961.getClass(), "missions", null);
        setField(term5536961, term5536961.getClass(), "diplomacy", null);
        setField(term5536961, term5536961.getClass(), "espionage", null);
        setIntField(term5536961, term5536961.getClass(), "fakeMilitarySize", 0);
        setField(term5536961, term5536961.getClass(), "attitude", null);
        setField(term5536961, term5536961.getClass(), "randomEventOccured", null);
        setField(term5536961, term5536961.getClass(), "strategy", null);
        setBooleanField(term5536961, term5536961.getClass(), "elderRealm", false);
        setField(term5536961, term5536961.getClass(), "leaderPool", null);
        setField(term5536961, term5536961.getClass(), "leaderRecruitPool", null);
        setField(term5536961, term5536961.getClass(), "ruler", null);
        setField(term5536961, term5536961.getClass(), "color", null);
        setField(term5536961, term5536961.getClass(), "interceptableFleets", null);
        setField(term5536961, term5536961.getClass(), "centerRealm", null);
        setField(term5536961, term5536961.getClass(), "bestPlanetForTechWorld", null);
        setField(term5536961, term5536961.getClass(), "aiDifficulty", null);
        setField(term5536961, term5536961.getClass(), "artifactLists", null);
        setBooleanField(term5536961, term5536961.getClass(), "realmLost", false);
        setField(term5536961, term5536961.getClass(), "backgroundStory", null);
        setBooleanField(term5536961, term5536961.getClass(), "enemyShipsDetected", false);
        setField(term5536961, term5536961.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTechList", argTypes, term5536961, args);
    }

};


