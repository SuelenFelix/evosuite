package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMap_setDrawPos_415549019242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199430;
     Object term4199454;
     Object term4199456;

    public StarMap_setDrawPos_415549019242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199430 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199430, term4199430.getClass(), "maxX", 0);
        setIntField(term4199430, term4199430.getClass(), "maxY", 0);
        setField(term4199430, term4199430.getClass(), "tiles", null);
        setField(term4199430, term4199430.getClass(), "tileInfo", null);
        setField(term4199430, term4199430.getClass(), "culture", null);
        setIntField(term4199430, term4199430.getClass(), "cursorX", 0);
        setIntField(term4199430, term4199430.getClass(), "cursorY", 0);
        setIntField(term4199430, term4199430.getClass(), "drawX", 0);
        setIntField(term4199430, term4199430.getClass(), "drawY", 0);
        setField(term4199430, term4199430.getClass(), "sunList", null);
        setField(term4199430, term4199430.getClass(), "planetList", null);
        setField(term4199430, term4199430.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199430, term4199430.getClass(), "players", null);
        setIntField(term4199430, term4199430.getClass(), "turn", 0);
        setField(term4199430, term4199430.getClass(), "fleetTiles", null);
        setIntField(term4199430, term4199430.getClass(), "aiTurnNumber", 0);
        setField(term4199430, term4199430.getClass(), "aiFleet", null);
        setField(term4199430, term4199430.getClass(), "newsCorpData", null);
        setBooleanField(term4199430, term4199430.getClass(), "debug", false);
        setIntField(term4199430, term4199430.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199430, term4199430.getClass(), "scoreConquer", 0);
        setIntField(term4199430, term4199430.getClass(), "scoreCulture", 0);
        setIntField(term4199430, term4199430.getClass(), "scoreResearch", 0);
        setIntField(term4199430, term4199430.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199430, term4199430.getClass(), "scorePopulation", 0);
        setField(term4199430, term4199430.getClass(), "history", null);
        setField(term4199430, term4199430.getClass(), "votes", null);
        setBooleanField(term4199430, term4199430.getClass(), "gameEnd", false);
        setBooleanField(term4199430, term4199430.getClass(), "humanLost", false);
        setField(term4199430, term4199430.getClass(), "pirateDifficulty", null);
        setField(term4199430, term4199430.getClass(), "karmaEvents", null);
        setField(term4199430, term4199430.getClass(), "ascensionEvents", null);
        setBooleanField(term4199430, term4199430.getClass(), "tutorialEnabled", false);
        setField(term4199430, term4199430.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199430, term4199430.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199430, term4199430.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199430, term4199430.getClass(), "forceRedraw", false);
        setIntField(term4199430, term4199430.getClass(), "zoomLevel", 0);
        setBooleanField(term4199430, term4199430.getClass(), "generateFullGame", false);
        term4199454 = new Integer(0);
        term4199456 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4199454;
        args[1] = term4199456;
        callMethod(klass, "setDrawPos", argTypes, term4199430, args);
    }

};


