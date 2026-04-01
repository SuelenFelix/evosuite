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

public class StarMap_setScoreCulture_1990742483305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201058;
     Object term4201082;

    public StarMap_setScoreCulture_1990742483305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201058 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201058, term4201058.getClass(), "maxX", 0);
        setIntField(term4201058, term4201058.getClass(), "maxY", 0);
        setField(term4201058, term4201058.getClass(), "tiles", null);
        setField(term4201058, term4201058.getClass(), "tileInfo", null);
        setField(term4201058, term4201058.getClass(), "culture", null);
        setIntField(term4201058, term4201058.getClass(), "cursorX", 0);
        setIntField(term4201058, term4201058.getClass(), "cursorY", 0);
        setIntField(term4201058, term4201058.getClass(), "drawX", 0);
        setIntField(term4201058, term4201058.getClass(), "drawY", 0);
        setField(term4201058, term4201058.getClass(), "sunList", null);
        setField(term4201058, term4201058.getClass(), "planetList", null);
        setField(term4201058, term4201058.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201058, term4201058.getClass(), "players", null);
        setIntField(term4201058, term4201058.getClass(), "turn", 0);
        setField(term4201058, term4201058.getClass(), "fleetTiles", null);
        setIntField(term4201058, term4201058.getClass(), "aiTurnNumber", 0);
        setField(term4201058, term4201058.getClass(), "aiFleet", null);
        setField(term4201058, term4201058.getClass(), "newsCorpData", null);
        setBooleanField(term4201058, term4201058.getClass(), "debug", false);
        setIntField(term4201058, term4201058.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201058, term4201058.getClass(), "scoreConquer", 0);
        setIntField(term4201058, term4201058.getClass(), "scoreCulture", 0);
        setIntField(term4201058, term4201058.getClass(), "scoreResearch", 0);
        setIntField(term4201058, term4201058.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201058, term4201058.getClass(), "scorePopulation", 0);
        setField(term4201058, term4201058.getClass(), "history", null);
        setField(term4201058, term4201058.getClass(), "votes", null);
        setBooleanField(term4201058, term4201058.getClass(), "gameEnd", false);
        setBooleanField(term4201058, term4201058.getClass(), "humanLost", false);
        setField(term4201058, term4201058.getClass(), "pirateDifficulty", null);
        setField(term4201058, term4201058.getClass(), "karmaEvents", null);
        setField(term4201058, term4201058.getClass(), "ascensionEvents", null);
        setBooleanField(term4201058, term4201058.getClass(), "tutorialEnabled", false);
        setField(term4201058, term4201058.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201058, term4201058.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201058, term4201058.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201058, term4201058.getClass(), "forceRedraw", false);
        setIntField(term4201058, term4201058.getClass(), "zoomLevel", 0);
        setBooleanField(term4201058, term4201058.getClass(), "generateFullGame", false);
        term4201082 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4201082;
        callMethod(klass, "setScoreCulture", argTypes, term4201058, args);
    }

};


