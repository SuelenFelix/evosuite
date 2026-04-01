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

public class PlayerInfo_setColor_590829893187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5419159;

    public PlayerInfo_setColor_590829893187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5419159 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5419159, term5419159.getClass(), "race", null);
        setField(term5419159, term5419159.getClass(), "government", null);
        setIntField(term5419159, term5419159.getClass(), "warFatigue", 0);
        setField(term5419159, term5419159.getClass(), "empireName", null);
        setIntField(term5419159, term5419159.getClass(), "totalCredits", 0);
        setField(term5419159, term5419159.getClass(), "techList", null);
        setField(term5419159, term5419159.getClass(), "msgList", null);
        setField(term5419159, term5419159.getClass(), "shipStatList", null);
        setField(term5419159, term5419159.getClass(), "fleets", null);
        setField(term5419159, term5419159.getClass(), "mapData", null);
        setField(term5419159, term5419159.getClass(), "mapCloakDetection", null);
        setField(term5419159, term5419159.getClass(), "maxCoordinate", null);
        setBooleanField(term5419159, term5419159.getClass(), "human", false);
        setBooleanField(term5419159, term5419159.getClass(), "board", false);
        setField(term5419159, term5419159.getClass(), "missions", null);
        setField(term5419159, term5419159.getClass(), "diplomacy", null);
        setField(term5419159, term5419159.getClass(), "espionage", null);
        setIntField(term5419159, term5419159.getClass(), "fakeMilitarySize", 0);
        setField(term5419159, term5419159.getClass(), "attitude", null);
        setField(term5419159, term5419159.getClass(), "randomEventOccured", null);
        setField(term5419159, term5419159.getClass(), "strategy", null);
        setBooleanField(term5419159, term5419159.getClass(), "elderRealm", false);
        setField(term5419159, term5419159.getClass(), "leaderPool", null);
        setField(term5419159, term5419159.getClass(), "leaderRecruitPool", null);
        setField(term5419159, term5419159.getClass(), "ruler", null);
        setField(term5419159, term5419159.getClass(), "color", null);
        setField(term5419159, term5419159.getClass(), "interceptableFleets", null);
        setField(term5419159, term5419159.getClass(), "centerRealm", null);
        setField(term5419159, term5419159.getClass(), "bestPlanetForTechWorld", null);
        setField(term5419159, term5419159.getClass(), "aiDifficulty", null);
        setField(term5419159, term5419159.getClass(), "artifactLists", null);
        setBooleanField(term5419159, term5419159.getClass(), "realmLost", false);
        setField(term5419159, term5419159.getClass(), "backgroundStory", null);
        setBooleanField(term5419159, term5419159.getClass(), "enemyShipsDetected", false);
        setField(term5419159, term5419159.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerColor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setColor", argTypes, term5419159, args);
    }

};


