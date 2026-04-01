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

public class StarMap_setTile_680267242226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199012;
     Object term4199036;
     Object term4199038;

    public StarMap_setTile_680267242226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199012 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199012, term4199012.getClass(), "maxX", 0);
        setIntField(term4199012, term4199012.getClass(), "maxY", 0);
        setField(term4199012, term4199012.getClass(), "tiles", null);
        setField(term4199012, term4199012.getClass(), "tileInfo", null);
        setField(term4199012, term4199012.getClass(), "culture", null);
        setIntField(term4199012, term4199012.getClass(), "cursorX", 0);
        setIntField(term4199012, term4199012.getClass(), "cursorY", 0);
        setIntField(term4199012, term4199012.getClass(), "drawX", 0);
        setIntField(term4199012, term4199012.getClass(), "drawY", 0);
        setField(term4199012, term4199012.getClass(), "sunList", null);
        setField(term4199012, term4199012.getClass(), "planetList", null);
        setField(term4199012, term4199012.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199012, term4199012.getClass(), "players", null);
        setIntField(term4199012, term4199012.getClass(), "turn", 0);
        setField(term4199012, term4199012.getClass(), "fleetTiles", null);
        setIntField(term4199012, term4199012.getClass(), "aiTurnNumber", 0);
        setField(term4199012, term4199012.getClass(), "aiFleet", null);
        setField(term4199012, term4199012.getClass(), "newsCorpData", null);
        setBooleanField(term4199012, term4199012.getClass(), "debug", false);
        setIntField(term4199012, term4199012.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199012, term4199012.getClass(), "scoreConquer", 0);
        setIntField(term4199012, term4199012.getClass(), "scoreCulture", 0);
        setIntField(term4199012, term4199012.getClass(), "scoreResearch", 0);
        setIntField(term4199012, term4199012.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199012, term4199012.getClass(), "scorePopulation", 0);
        setField(term4199012, term4199012.getClass(), "history", null);
        setField(term4199012, term4199012.getClass(), "votes", null);
        setBooleanField(term4199012, term4199012.getClass(), "gameEnd", false);
        setBooleanField(term4199012, term4199012.getClass(), "humanLost", false);
        setField(term4199012, term4199012.getClass(), "pirateDifficulty", null);
        setField(term4199012, term4199012.getClass(), "karmaEvents", null);
        setField(term4199012, term4199012.getClass(), "ascensionEvents", null);
        setBooleanField(term4199012, term4199012.getClass(), "tutorialEnabled", false);
        setField(term4199012, term4199012.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199012, term4199012.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199012, term4199012.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199012, term4199012.getClass(), "forceRedraw", false);
        setIntField(term4199012, term4199012.getClass(), "zoomLevel", 0);
        setBooleanField(term4199012, term4199012.getClass(), "generateFullGame", false);
        term4199036 = new Integer(0);
        term4199038 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[3];
        args[0] = term4199036;
        args[1] = term4199038;
        args[2] = null;
        callMethod(klass, "setTile", argTypes, term4199012, args);
    }

};


