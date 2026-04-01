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

public class StarMap_getMaxX_645433885221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198884;

    public StarMap_getMaxX_645433885221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198884 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198884, term4198884.getClass(), "maxX", 0);
        setIntField(term4198884, term4198884.getClass(), "maxY", 0);
        setField(term4198884, term4198884.getClass(), "tiles", null);
        setField(term4198884, term4198884.getClass(), "tileInfo", null);
        setField(term4198884, term4198884.getClass(), "culture", null);
        setIntField(term4198884, term4198884.getClass(), "cursorX", 0);
        setIntField(term4198884, term4198884.getClass(), "cursorY", 0);
        setIntField(term4198884, term4198884.getClass(), "drawX", 0);
        setIntField(term4198884, term4198884.getClass(), "drawY", 0);
        setField(term4198884, term4198884.getClass(), "sunList", null);
        setField(term4198884, term4198884.getClass(), "planetList", null);
        setField(term4198884, term4198884.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198884, term4198884.getClass(), "players", null);
        setIntField(term4198884, term4198884.getClass(), "turn", 0);
        setField(term4198884, term4198884.getClass(), "fleetTiles", null);
        setIntField(term4198884, term4198884.getClass(), "aiTurnNumber", 0);
        setField(term4198884, term4198884.getClass(), "aiFleet", null);
        setField(term4198884, term4198884.getClass(), "newsCorpData", null);
        setBooleanField(term4198884, term4198884.getClass(), "debug", false);
        setIntField(term4198884, term4198884.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198884, term4198884.getClass(), "scoreConquer", 0);
        setIntField(term4198884, term4198884.getClass(), "scoreCulture", 0);
        setIntField(term4198884, term4198884.getClass(), "scoreResearch", 0);
        setIntField(term4198884, term4198884.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198884, term4198884.getClass(), "scorePopulation", 0);
        setField(term4198884, term4198884.getClass(), "history", null);
        setField(term4198884, term4198884.getClass(), "votes", null);
        setBooleanField(term4198884, term4198884.getClass(), "gameEnd", false);
        setBooleanField(term4198884, term4198884.getClass(), "humanLost", false);
        setField(term4198884, term4198884.getClass(), "pirateDifficulty", null);
        setField(term4198884, term4198884.getClass(), "karmaEvents", null);
        setField(term4198884, term4198884.getClass(), "ascensionEvents", null);
        setBooleanField(term4198884, term4198884.getClass(), "tutorialEnabled", false);
        setField(term4198884, term4198884.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198884, term4198884.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198884, term4198884.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198884, term4198884.getClass(), "forceRedraw", false);
        setIntField(term4198884, term4198884.getClass(), "zoomLevel", 0);
        setBooleanField(term4198884, term4198884.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxX", argTypes, term4198884, args);
    }

};


