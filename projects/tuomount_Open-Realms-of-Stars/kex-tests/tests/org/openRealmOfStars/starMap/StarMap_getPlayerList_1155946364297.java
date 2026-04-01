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

public class StarMap_getPlayerList_1155946364297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200858;

    public StarMap_getPlayerList_1155946364297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200858 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200858, term4200858.getClass(), "maxX", 0);
        setIntField(term4200858, term4200858.getClass(), "maxY", 0);
        setField(term4200858, term4200858.getClass(), "tiles", null);
        setField(term4200858, term4200858.getClass(), "tileInfo", null);
        setField(term4200858, term4200858.getClass(), "culture", null);
        setIntField(term4200858, term4200858.getClass(), "cursorX", 0);
        setIntField(term4200858, term4200858.getClass(), "cursorY", 0);
        setIntField(term4200858, term4200858.getClass(), "drawX", 0);
        setIntField(term4200858, term4200858.getClass(), "drawY", 0);
        setField(term4200858, term4200858.getClass(), "sunList", null);
        setField(term4200858, term4200858.getClass(), "planetList", null);
        setField(term4200858, term4200858.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200858, term4200858.getClass(), "players", null);
        setIntField(term4200858, term4200858.getClass(), "turn", 0);
        setField(term4200858, term4200858.getClass(), "fleetTiles", null);
        setIntField(term4200858, term4200858.getClass(), "aiTurnNumber", 0);
        setField(term4200858, term4200858.getClass(), "aiFleet", null);
        setField(term4200858, term4200858.getClass(), "newsCorpData", null);
        setBooleanField(term4200858, term4200858.getClass(), "debug", false);
        setIntField(term4200858, term4200858.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200858, term4200858.getClass(), "scoreConquer", 0);
        setIntField(term4200858, term4200858.getClass(), "scoreCulture", 0);
        setIntField(term4200858, term4200858.getClass(), "scoreResearch", 0);
        setIntField(term4200858, term4200858.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200858, term4200858.getClass(), "scorePopulation", 0);
        setField(term4200858, term4200858.getClass(), "history", null);
        setField(term4200858, term4200858.getClass(), "votes", null);
        setBooleanField(term4200858, term4200858.getClass(), "gameEnd", false);
        setBooleanField(term4200858, term4200858.getClass(), "humanLost", false);
        setField(term4200858, term4200858.getClass(), "pirateDifficulty", null);
        setField(term4200858, term4200858.getClass(), "karmaEvents", null);
        setField(term4200858, term4200858.getClass(), "ascensionEvents", null);
        setBooleanField(term4200858, term4200858.getClass(), "tutorialEnabled", false);
        setField(term4200858, term4200858.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200858, term4200858.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200858, term4200858.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200858, term4200858.getClass(), "forceRedraw", false);
        setIntField(term4200858, term4200858.getClass(), "zoomLevel", 0);
        setBooleanField(term4200858, term4200858.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerList", argTypes, term4200858, args);
    }

};


