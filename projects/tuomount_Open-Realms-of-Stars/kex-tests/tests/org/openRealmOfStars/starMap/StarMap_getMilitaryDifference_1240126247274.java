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

public class StarMap_getMilitaryDifference_1240126247274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200228;
     Object term4200252;
     Object term4200254;

    public StarMap_getMilitaryDifference_1240126247274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200228 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200228, term4200228.getClass(), "maxX", 0);
        setIntField(term4200228, term4200228.getClass(), "maxY", 0);
        setField(term4200228, term4200228.getClass(), "tiles", null);
        setField(term4200228, term4200228.getClass(), "tileInfo", null);
        setField(term4200228, term4200228.getClass(), "culture", null);
        setIntField(term4200228, term4200228.getClass(), "cursorX", 0);
        setIntField(term4200228, term4200228.getClass(), "cursorY", 0);
        setIntField(term4200228, term4200228.getClass(), "drawX", 0);
        setIntField(term4200228, term4200228.getClass(), "drawY", 0);
        setField(term4200228, term4200228.getClass(), "sunList", null);
        setField(term4200228, term4200228.getClass(), "planetList", null);
        setField(term4200228, term4200228.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200228, term4200228.getClass(), "players", null);
        setIntField(term4200228, term4200228.getClass(), "turn", 0);
        setField(term4200228, term4200228.getClass(), "fleetTiles", null);
        setIntField(term4200228, term4200228.getClass(), "aiTurnNumber", 0);
        setField(term4200228, term4200228.getClass(), "aiFleet", null);
        setField(term4200228, term4200228.getClass(), "newsCorpData", null);
        setBooleanField(term4200228, term4200228.getClass(), "debug", false);
        setIntField(term4200228, term4200228.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200228, term4200228.getClass(), "scoreConquer", 0);
        setIntField(term4200228, term4200228.getClass(), "scoreCulture", 0);
        setIntField(term4200228, term4200228.getClass(), "scoreResearch", 0);
        setIntField(term4200228, term4200228.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200228, term4200228.getClass(), "scorePopulation", 0);
        setField(term4200228, term4200228.getClass(), "history", null);
        setField(term4200228, term4200228.getClass(), "votes", null);
        setBooleanField(term4200228, term4200228.getClass(), "gameEnd", false);
        setBooleanField(term4200228, term4200228.getClass(), "humanLost", false);
        setField(term4200228, term4200228.getClass(), "pirateDifficulty", null);
        setField(term4200228, term4200228.getClass(), "karmaEvents", null);
        setField(term4200228, term4200228.getClass(), "ascensionEvents", null);
        setBooleanField(term4200228, term4200228.getClass(), "tutorialEnabled", false);
        setField(term4200228, term4200228.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200228, term4200228.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200228, term4200228.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200228, term4200228.getClass(), "forceRedraw", false);
        setIntField(term4200228, term4200228.getClass(), "zoomLevel", 0);
        setBooleanField(term4200228, term4200228.getClass(), "generateFullGame", false);
        term4200252 = new Integer(0);
        term4200254 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4200252;
        args[1] = term4200254;
        callMethod(klass, "getMilitaryDifference", argTypes, term4200228, args);
    }

};


