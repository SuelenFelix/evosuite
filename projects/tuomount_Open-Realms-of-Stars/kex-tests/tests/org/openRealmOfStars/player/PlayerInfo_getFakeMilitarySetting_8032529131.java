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

public class PlayerInfo_getFakeMilitarySetting_8032529131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4623079;

    public PlayerInfo_getFakeMilitarySetting_8032529131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4623079 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4623079, term4623079.getClass(), "race", null);
        setField(term4623079, term4623079.getClass(), "government", null);
        setIntField(term4623079, term4623079.getClass(), "warFatigue", 0);
        setField(term4623079, term4623079.getClass(), "empireName", null);
        setIntField(term4623079, term4623079.getClass(), "totalCredits", 0);
        setField(term4623079, term4623079.getClass(), "techList", null);
        setField(term4623079, term4623079.getClass(), "msgList", null);
        setField(term4623079, term4623079.getClass(), "shipStatList", null);
        setField(term4623079, term4623079.getClass(), "fleets", null);
        setField(term4623079, term4623079.getClass(), "mapData", null);
        setField(term4623079, term4623079.getClass(), "mapCloakDetection", null);
        setField(term4623079, term4623079.getClass(), "maxCoordinate", null);
        setBooleanField(term4623079, term4623079.getClass(), "human", false);
        setBooleanField(term4623079, term4623079.getClass(), "board", false);
        setField(term4623079, term4623079.getClass(), "missions", null);
        setField(term4623079, term4623079.getClass(), "diplomacy", null);
        setField(term4623079, term4623079.getClass(), "espionage", null);
        setIntField(term4623079, term4623079.getClass(), "fakeMilitarySize", 0);
        setField(term4623079, term4623079.getClass(), "attitude", null);
        setField(term4623079, term4623079.getClass(), "randomEventOccured", null);
        setField(term4623079, term4623079.getClass(), "strategy", null);
        setBooleanField(term4623079, term4623079.getClass(), "elderRealm", false);
        setField(term4623079, term4623079.getClass(), "leaderPool", null);
        setField(term4623079, term4623079.getClass(), "leaderRecruitPool", null);
        setField(term4623079, term4623079.getClass(), "ruler", null);
        setField(term4623079, term4623079.getClass(), "color", null);
        setField(term4623079, term4623079.getClass(), "interceptableFleets", null);
        setField(term4623079, term4623079.getClass(), "centerRealm", null);
        setField(term4623079, term4623079.getClass(), "bestPlanetForTechWorld", null);
        setField(term4623079, term4623079.getClass(), "aiDifficulty", null);
        setField(term4623079, term4623079.getClass(), "artifactLists", null);
        setBooleanField(term4623079, term4623079.getClass(), "realmLost", false);
        setField(term4623079, term4623079.getClass(), "backgroundStory", null);
        setBooleanField(term4623079, term4623079.getClass(), "enemyShipsDetected", false);
        setField(term4623079, term4623079.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.GameLengthState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFakeMilitarySetting", argTypes, term4623079, args);
    }

};


