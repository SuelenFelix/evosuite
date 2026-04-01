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

public class PlayerInfo_calculateAmountOfUncharted_40966622044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4677633;
     Object term4677642;
     Object term4677644;

    public PlayerInfo_calculateAmountOfUncharted_40966622044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4677633 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerInfo"));
        setField(term4677633, term4677633.getClass(), "race", null);
        setField(term4677633, term4677633.getClass(), "government", null);
        setIntField(term4677633, term4677633.getClass(), "warFatigue", 0);
        setField(term4677633, term4677633.getClass(), "empireName", null);
        setIntField(term4677633, term4677633.getClass(), "totalCredits", 0);
        setField(term4677633, term4677633.getClass(), "techList", null);
        setField(term4677633, term4677633.getClass(), "msgList", null);
        setField(term4677633, term4677633.getClass(), "shipStatList", null);
        setField(term4677633, term4677633.getClass(), "fleets", null);
        setField(term4677633, term4677633.getClass(), "mapData", null);
        setField(term4677633, term4677633.getClass(), "mapCloakDetection", null);
        setField(term4677633, term4677633.getClass(), "maxCoordinate", null);
        setBooleanField(term4677633, term4677633.getClass(), "human", false);
        setBooleanField(term4677633, term4677633.getClass(), "board", false);
        setField(term4677633, term4677633.getClass(), "missions", null);
        setField(term4677633, term4677633.getClass(), "diplomacy", null);
        setField(term4677633, term4677633.getClass(), "espionage", null);
        setIntField(term4677633, term4677633.getClass(), "fakeMilitarySize", 0);
        setField(term4677633, term4677633.getClass(), "attitude", null);
        setField(term4677633, term4677633.getClass(), "randomEventOccured", null);
        setField(term4677633, term4677633.getClass(), "strategy", null);
        setBooleanField(term4677633, term4677633.getClass(), "elderRealm", false);
        setField(term4677633, term4677633.getClass(), "leaderPool", null);
        setField(term4677633, term4677633.getClass(), "leaderRecruitPool", null);
        setField(term4677633, term4677633.getClass(), "ruler", null);
        setField(term4677633, term4677633.getClass(), "color", null);
        setField(term4677633, term4677633.getClass(), "interceptableFleets", null);
        setField(term4677633, term4677633.getClass(), "centerRealm", null);
        setField(term4677633, term4677633.getClass(), "bestPlanetForTechWorld", null);
        setField(term4677633, term4677633.getClass(), "aiDifficulty", null);
        setField(term4677633, term4677633.getClass(), "artifactLists", null);
        setBooleanField(term4677633, term4677633.getClass(), "realmLost", false);
        setField(term4677633, term4677633.getClass(), "backgroundStory", null);
        setBooleanField(term4677633, term4677633.getClass(), "enemyShipsDetected", false);
        setField(term4677633, term4677633.getClass(), "startingScenario", null);
        term4677642 = new Integer(0);
        term4677644 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.Sun");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term4677642;
        args[2] = null;
        args[3] = term4677644;
        callMethod(klass, "calculateAmountOfUncharted", argTypes, term4677633, args);
    }

};


