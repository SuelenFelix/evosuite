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

public class PlayerInfo_researchSpyShips_203759848729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4615433;

    public PlayerInfo_researchSpyShips_203759848729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4615433 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4615433, term4615433.getClass(), "race", null);
        setField(term4615433, term4615433.getClass(), "government", null);
        setIntField(term4615433, term4615433.getClass(), "warFatigue", 0);
        setField(term4615433, term4615433.getClass(), "empireName", null);
        setIntField(term4615433, term4615433.getClass(), "totalCredits", 0);
        setField(term4615433, term4615433.getClass(), "techList", null);
        setField(term4615433, term4615433.getClass(), "msgList", null);
        setField(term4615433, term4615433.getClass(), "shipStatList", null);
        setField(term4615433, term4615433.getClass(), "fleets", null);
        setField(term4615433, term4615433.getClass(), "mapData", null);
        setField(term4615433, term4615433.getClass(), "mapCloakDetection", null);
        setField(term4615433, term4615433.getClass(), "maxCoordinate", null);
        setBooleanField(term4615433, term4615433.getClass(), "human", false);
        setBooleanField(term4615433, term4615433.getClass(), "board", false);
        setField(term4615433, term4615433.getClass(), "missions", null);
        setField(term4615433, term4615433.getClass(), "diplomacy", null);
        setField(term4615433, term4615433.getClass(), "espionage", null);
        setIntField(term4615433, term4615433.getClass(), "fakeMilitarySize", 0);
        setField(term4615433, term4615433.getClass(), "attitude", null);
        setField(term4615433, term4615433.getClass(), "randomEventOccured", null);
        setField(term4615433, term4615433.getClass(), "strategy", null);
        setBooleanField(term4615433, term4615433.getClass(), "elderRealm", false);
        setField(term4615433, term4615433.getClass(), "leaderPool", null);
        setField(term4615433, term4615433.getClass(), "leaderRecruitPool", null);
        setField(term4615433, term4615433.getClass(), "ruler", null);
        setField(term4615433, term4615433.getClass(), "color", null);
        setField(term4615433, term4615433.getClass(), "interceptableFleets", null);
        setField(term4615433, term4615433.getClass(), "centerRealm", null);
        setField(term4615433, term4615433.getClass(), "bestPlanetForTechWorld", null);
        setField(term4615433, term4615433.getClass(), "aiDifficulty", null);
        setField(term4615433, term4615433.getClass(), "artifactLists", null);
        setBooleanField(term4615433, term4615433.getClass(), "realmLost", false);
        setField(term4615433, term4615433.getClass(), "backgroundStory", null);
        setBooleanField(term4615433, term4615433.getClass(), "enemyShipsDetected", false);
        setField(term4615433, term4615433.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "researchSpyShips", argTypes, term4615433, args);
    }

};


