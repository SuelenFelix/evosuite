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

public class PlayerInfo_getArtifactLists_196782508537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4646697;

    public PlayerInfo_getArtifactLists_196782508537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4646697 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4646697, term4646697.getClass(), "race", null);
        setField(term4646697, term4646697.getClass(), "government", null);
        setIntField(term4646697, term4646697.getClass(), "warFatigue", 0);
        setField(term4646697, term4646697.getClass(), "empireName", null);
        setIntField(term4646697, term4646697.getClass(), "totalCredits", 0);
        setField(term4646697, term4646697.getClass(), "techList", null);
        setField(term4646697, term4646697.getClass(), "msgList", null);
        setField(term4646697, term4646697.getClass(), "shipStatList", null);
        setField(term4646697, term4646697.getClass(), "fleets", null);
        setField(term4646697, term4646697.getClass(), "mapData", null);
        setField(term4646697, term4646697.getClass(), "mapCloakDetection", null);
        setField(term4646697, term4646697.getClass(), "maxCoordinate", null);
        setBooleanField(term4646697, term4646697.getClass(), "human", false);
        setBooleanField(term4646697, term4646697.getClass(), "board", false);
        setField(term4646697, term4646697.getClass(), "missions", null);
        setField(term4646697, term4646697.getClass(), "diplomacy", null);
        setField(term4646697, term4646697.getClass(), "espionage", null);
        setIntField(term4646697, term4646697.getClass(), "fakeMilitarySize", 0);
        setField(term4646697, term4646697.getClass(), "attitude", null);
        setField(term4646697, term4646697.getClass(), "randomEventOccured", null);
        setField(term4646697, term4646697.getClass(), "strategy", null);
        setBooleanField(term4646697, term4646697.getClass(), "elderRealm", false);
        setField(term4646697, term4646697.getClass(), "leaderPool", null);
        setField(term4646697, term4646697.getClass(), "leaderRecruitPool", null);
        setField(term4646697, term4646697.getClass(), "ruler", null);
        setField(term4646697, term4646697.getClass(), "color", null);
        setField(term4646697, term4646697.getClass(), "interceptableFleets", null);
        setField(term4646697, term4646697.getClass(), "centerRealm", null);
        setField(term4646697, term4646697.getClass(), "bestPlanetForTechWorld", null);
        setField(term4646697, term4646697.getClass(), "aiDifficulty", null);
        setField(term4646697, term4646697.getClass(), "artifactLists", null);
        setBooleanField(term4646697, term4646697.getClass(), "realmLost", false);
        setField(term4646697, term4646697.getClass(), "backgroundStory", null);
        setBooleanField(term4646697, term4646697.getClass(), "enemyShipsDetected", false);
        setField(term4646697, term4646697.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtifactLists", argTypes, term4646697, args);
    }

};


