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

public class PlayerInfo_setFakeMilitarySize_486688124135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5117241;
     Object term5117250;

    public PlayerInfo_setFakeMilitarySize_486688124135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5117241 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5117241, term5117241.getClass(), "race", null);
        setField(term5117241, term5117241.getClass(), "government", null);
        setIntField(term5117241, term5117241.getClass(), "warFatigue", 0);
        setField(term5117241, term5117241.getClass(), "empireName", null);
        setIntField(term5117241, term5117241.getClass(), "totalCredits", 0);
        setField(term5117241, term5117241.getClass(), "techList", null);
        setField(term5117241, term5117241.getClass(), "msgList", null);
        setField(term5117241, term5117241.getClass(), "shipStatList", null);
        setField(term5117241, term5117241.getClass(), "fleets", null);
        setField(term5117241, term5117241.getClass(), "mapData", null);
        setField(term5117241, term5117241.getClass(), "mapCloakDetection", null);
        setField(term5117241, term5117241.getClass(), "maxCoordinate", null);
        setBooleanField(term5117241, term5117241.getClass(), "human", false);
        setBooleanField(term5117241, term5117241.getClass(), "board", false);
        setField(term5117241, term5117241.getClass(), "missions", null);
        setField(term5117241, term5117241.getClass(), "diplomacy", null);
        setField(term5117241, term5117241.getClass(), "espionage", null);
        setIntField(term5117241, term5117241.getClass(), "fakeMilitarySize", 0);
        setField(term5117241, term5117241.getClass(), "attitude", null);
        setField(term5117241, term5117241.getClass(), "randomEventOccured", null);
        setField(term5117241, term5117241.getClass(), "strategy", null);
        setBooleanField(term5117241, term5117241.getClass(), "elderRealm", false);
        setField(term5117241, term5117241.getClass(), "leaderPool", null);
        setField(term5117241, term5117241.getClass(), "leaderRecruitPool", null);
        setField(term5117241, term5117241.getClass(), "ruler", null);
        setField(term5117241, term5117241.getClass(), "color", null);
        setField(term5117241, term5117241.getClass(), "interceptableFleets", null);
        setField(term5117241, term5117241.getClass(), "centerRealm", null);
        setField(term5117241, term5117241.getClass(), "bestPlanetForTechWorld", null);
        setField(term5117241, term5117241.getClass(), "aiDifficulty", null);
        setField(term5117241, term5117241.getClass(), "artifactLists", null);
        setBooleanField(term5117241, term5117241.getClass(), "realmLost", false);
        setField(term5117241, term5117241.getClass(), "backgroundStory", null);
        setBooleanField(term5117241, term5117241.getClass(), "enemyShipsDetected", false);
        setField(term5117241, term5117241.getClass(), "startingScenario", null);
        term5117250 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5117250;
        callMethod(klass, "setFakeMilitarySize", argTypes, term5117241, args);
    }

};


