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

public class StarMap_isValidCoordinate_855176739215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198724;
     Object term4198748;
     Object term4198750;

    public StarMap_isValidCoordinate_855176739215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198724 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198724, term4198724.getClass(), "maxX", 0);
        setIntField(term4198724, term4198724.getClass(), "maxY", 0);
        setField(term4198724, term4198724.getClass(), "tiles", null);
        setField(term4198724, term4198724.getClass(), "tileInfo", null);
        setField(term4198724, term4198724.getClass(), "culture", null);
        setIntField(term4198724, term4198724.getClass(), "cursorX", 0);
        setIntField(term4198724, term4198724.getClass(), "cursorY", 0);
        setIntField(term4198724, term4198724.getClass(), "drawX", 0);
        setIntField(term4198724, term4198724.getClass(), "drawY", 0);
        setField(term4198724, term4198724.getClass(), "sunList", null);
        setField(term4198724, term4198724.getClass(), "planetList", null);
        setField(term4198724, term4198724.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198724, term4198724.getClass(), "players", null);
        setIntField(term4198724, term4198724.getClass(), "turn", 0);
        setField(term4198724, term4198724.getClass(), "fleetTiles", null);
        setIntField(term4198724, term4198724.getClass(), "aiTurnNumber", 0);
        setField(term4198724, term4198724.getClass(), "aiFleet", null);
        setField(term4198724, term4198724.getClass(), "newsCorpData", null);
        setBooleanField(term4198724, term4198724.getClass(), "debug", false);
        setIntField(term4198724, term4198724.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198724, term4198724.getClass(), "scoreConquer", 0);
        setIntField(term4198724, term4198724.getClass(), "scoreCulture", 0);
        setIntField(term4198724, term4198724.getClass(), "scoreResearch", 0);
        setIntField(term4198724, term4198724.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198724, term4198724.getClass(), "scorePopulation", 0);
        setField(term4198724, term4198724.getClass(), "history", null);
        setField(term4198724, term4198724.getClass(), "votes", null);
        setBooleanField(term4198724, term4198724.getClass(), "gameEnd", false);
        setBooleanField(term4198724, term4198724.getClass(), "humanLost", false);
        setField(term4198724, term4198724.getClass(), "pirateDifficulty", null);
        setField(term4198724, term4198724.getClass(), "karmaEvents", null);
        setField(term4198724, term4198724.getClass(), "ascensionEvents", null);
        setBooleanField(term4198724, term4198724.getClass(), "tutorialEnabled", false);
        setField(term4198724, term4198724.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198724, term4198724.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198724, term4198724.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198724, term4198724.getClass(), "forceRedraw", false);
        setIntField(term4198724, term4198724.getClass(), "zoomLevel", 0);
        setBooleanField(term4198724, term4198724.getClass(), "generateFullGame", false);
        term4198748 = new Integer(0);
        term4198750 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4198748;
        args[1] = term4198750;
        callMethod(klass, "isValidCoordinate", argTypes, term4198724, args);
    }

};


