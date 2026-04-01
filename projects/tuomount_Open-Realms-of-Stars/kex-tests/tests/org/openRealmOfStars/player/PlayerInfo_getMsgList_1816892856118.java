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

public class PlayerInfo_getMsgList_1816892856118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5031529;

    public PlayerInfo_getMsgList_1816892856118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5031529 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term5031529, term5031529.getClass(), "race", null);
        setField(term5031529, term5031529.getClass(), "government", null);
        setIntField(term5031529, term5031529.getClass(), "warFatigue", 0);
        setField(term5031529, term5031529.getClass(), "empireName", null);
        setIntField(term5031529, term5031529.getClass(), "totalCredits", 0);
        setField(term5031529, term5031529.getClass(), "techList", null);
        setField(term5031529, term5031529.getClass(), "msgList", null);
        setField(term5031529, term5031529.getClass(), "shipStatList", null);
        setField(term5031529, term5031529.getClass(), "fleets", null);
        setField(term5031529, term5031529.getClass(), "mapData", null);
        setField(term5031529, term5031529.getClass(), "mapCloakDetection", null);
        setField(term5031529, term5031529.getClass(), "maxCoordinate", null);
        setBooleanField(term5031529, term5031529.getClass(), "human", false);
        setBooleanField(term5031529, term5031529.getClass(), "board", false);
        setField(term5031529, term5031529.getClass(), "missions", null);
        setField(term5031529, term5031529.getClass(), "diplomacy", null);
        setField(term5031529, term5031529.getClass(), "espionage", null);
        setIntField(term5031529, term5031529.getClass(), "fakeMilitarySize", 0);
        setField(term5031529, term5031529.getClass(), "attitude", null);
        setField(term5031529, term5031529.getClass(), "randomEventOccured", null);
        setField(term5031529, term5031529.getClass(), "strategy", null);
        setBooleanField(term5031529, term5031529.getClass(), "elderRealm", false);
        setField(term5031529, term5031529.getClass(), "leaderPool", null);
        setField(term5031529, term5031529.getClass(), "leaderRecruitPool", null);
        setField(term5031529, term5031529.getClass(), "ruler", null);
        setField(term5031529, term5031529.getClass(), "color", null);
        setField(term5031529, term5031529.getClass(), "interceptableFleets", null);
        setField(term5031529, term5031529.getClass(), "centerRealm", null);
        setField(term5031529, term5031529.getClass(), "bestPlanetForTechWorld", null);
        setField(term5031529, term5031529.getClass(), "aiDifficulty", null);
        setField(term5031529, term5031529.getClass(), "artifactLists", null);
        setBooleanField(term5031529, term5031529.getClass(), "realmLost", false);
        setField(term5031529, term5031529.getClass(), "backgroundStory", null);
        setBooleanField(term5031529, term5031529.getClass(), "enemyShipsDetected", false);
        setField(term5031529, term5031529.getClass(), "startingScenario", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMsgList", argTypes, term5031529, args);
    }

};


