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

public class PlayerInfo_addSpaceMonsterTechs_166157324516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4554135;

    public PlayerInfo_addSpaceMonsterTechs_166157324516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4554135 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4554135, term4554135.getClass(), "race", null);
        setField(term4554135, term4554135.getClass(), "government", null);
        setIntField(term4554135, term4554135.getClass(), "warFatigue", 0);
        setField(term4554135, term4554135.getClass(), "empireName", null);
        setIntField(term4554135, term4554135.getClass(), "totalCredits", 0);
        setField(term4554135, term4554135.getClass(), "techList", null);
        setField(term4554135, term4554135.getClass(), "msgList", null);
        setField(term4554135, term4554135.getClass(), "shipStatList", null);
        setField(term4554135, term4554135.getClass(), "fleets", null);
        setField(term4554135, term4554135.getClass(), "mapData", null);
        setField(term4554135, term4554135.getClass(), "mapCloakDetection", null);
        setField(term4554135, term4554135.getClass(), "maxCoordinate", null);
        setBooleanField(term4554135, term4554135.getClass(), "human", false);
        setBooleanField(term4554135, term4554135.getClass(), "board", false);
        setField(term4554135, term4554135.getClass(), "missions", null);
        setField(term4554135, term4554135.getClass(), "diplomacy", null);
        setField(term4554135, term4554135.getClass(), "espionage", null);
        setIntField(term4554135, term4554135.getClass(), "fakeMilitarySize", 0);
        setField(term4554135, term4554135.getClass(), "attitude", null);
        setField(term4554135, term4554135.getClass(), "randomEventOccured", null);
        setField(term4554135, term4554135.getClass(), "strategy", null);
        setBooleanField(term4554135, term4554135.getClass(), "elderRealm", false);
        setField(term4554135, term4554135.getClass(), "leaderPool", null);
        setField(term4554135, term4554135.getClass(), "leaderRecruitPool", null);
        setField(term4554135, term4554135.getClass(), "ruler", null);
        setField(term4554135, term4554135.getClass(), "color", null);
        setField(term4554135, term4554135.getClass(), "interceptableFleets", null);
        setField(term4554135, term4554135.getClass(), "centerRealm", null);
        setField(term4554135, term4554135.getClass(), "bestPlanetForTechWorld", null);
        setField(term4554135, term4554135.getClass(), "aiDifficulty", null);
        setField(term4554135, term4554135.getClass(), "artifactLists", null);
        setBooleanField(term4554135, term4554135.getClass(), "realmLost", false);
        setField(term4554135, term4554135.getClass(), "backgroundStory", null);
        setBooleanField(term4554135, term4554135.getClass(), "enemyShipsDetected", false);
        setField(term4554135, term4554135.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addSpaceMonsterTechs", argTypes, term4554135, args);
    }

};


