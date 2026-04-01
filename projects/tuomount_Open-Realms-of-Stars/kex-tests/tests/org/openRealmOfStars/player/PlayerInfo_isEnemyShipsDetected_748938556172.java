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

public class PlayerInfo_isEnemyShipsDetected_748938556172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5346326;

    public PlayerInfo_isEnemyShipsDetected_748938556172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5346326 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5346326, term5346326.getClass(), "race", null);
        setField(term5346326, term5346326.getClass(), "government", null);
        setIntField(term5346326, term5346326.getClass(), "warFatigue", 0);
        setField(term5346326, term5346326.getClass(), "empireName", null);
        setIntField(term5346326, term5346326.getClass(), "totalCredits", 0);
        setField(term5346326, term5346326.getClass(), "techList", null);
        setField(term5346326, term5346326.getClass(), "msgList", null);
        setField(term5346326, term5346326.getClass(), "shipStatList", null);
        setField(term5346326, term5346326.getClass(), "fleets", null);
        setField(term5346326, term5346326.getClass(), "mapData", null);
        setField(term5346326, term5346326.getClass(), "mapCloakDetection", null);
        setField(term5346326, term5346326.getClass(), "maxCoordinate", null);
        setBooleanField(term5346326, term5346326.getClass(), "human", false);
        setBooleanField(term5346326, term5346326.getClass(), "board", false);
        setField(term5346326, term5346326.getClass(), "missions", null);
        setField(term5346326, term5346326.getClass(), "diplomacy", null);
        setField(term5346326, term5346326.getClass(), "espionage", null);
        setIntField(term5346326, term5346326.getClass(), "fakeMilitarySize", 0);
        setField(term5346326, term5346326.getClass(), "attitude", null);
        setField(term5346326, term5346326.getClass(), "randomEventOccured", null);
        setField(term5346326, term5346326.getClass(), "strategy", null);
        setBooleanField(term5346326, term5346326.getClass(), "elderRealm", false);
        setField(term5346326, term5346326.getClass(), "leaderPool", null);
        setField(term5346326, term5346326.getClass(), "leaderRecruitPool", null);
        setField(term5346326, term5346326.getClass(), "ruler", null);
        setField(term5346326, term5346326.getClass(), "color", null);
        setField(term5346326, term5346326.getClass(), "interceptableFleets", null);
        setField(term5346326, term5346326.getClass(), "centerRealm", null);
        setField(term5346326, term5346326.getClass(), "bestPlanetForTechWorld", null);
        setField(term5346326, term5346326.getClass(), "aiDifficulty", null);
        setField(term5346326, term5346326.getClass(), "artifactLists", null);
        setBooleanField(term5346326, term5346326.getClass(), "realmLost", false);
        setField(term5346326, term5346326.getClass(), "backgroundStory", null);
        setBooleanField(term5346326, term5346326.getClass(), "enemyShipsDetected", false);
        setField(term5346326, term5346326.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnemyShipsDetected", argTypes, term5346326, args);
    }

};


