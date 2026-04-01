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

public class StarMap_getNearesetSolarSystem_1775463594220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198856;
     Object term4198880;
     Object term4198882;

    public StarMap_getNearesetSolarSystem_1775463594220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198856 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198856, term4198856.getClass(), "maxX", 0);
        setIntField(term4198856, term4198856.getClass(), "maxY", 0);
        setField(term4198856, term4198856.getClass(), "tiles", null);
        setField(term4198856, term4198856.getClass(), "tileInfo", null);
        setField(term4198856, term4198856.getClass(), "culture", null);
        setIntField(term4198856, term4198856.getClass(), "cursorX", 0);
        setIntField(term4198856, term4198856.getClass(), "cursorY", 0);
        setIntField(term4198856, term4198856.getClass(), "drawX", 0);
        setIntField(term4198856, term4198856.getClass(), "drawY", 0);
        setField(term4198856, term4198856.getClass(), "sunList", null);
        setField(term4198856, term4198856.getClass(), "planetList", null);
        setField(term4198856, term4198856.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198856, term4198856.getClass(), "players", null);
        setIntField(term4198856, term4198856.getClass(), "turn", 0);
        setField(term4198856, term4198856.getClass(), "fleetTiles", null);
        setIntField(term4198856, term4198856.getClass(), "aiTurnNumber", 0);
        setField(term4198856, term4198856.getClass(), "aiFleet", null);
        setField(term4198856, term4198856.getClass(), "newsCorpData", null);
        setBooleanField(term4198856, term4198856.getClass(), "debug", false);
        setIntField(term4198856, term4198856.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198856, term4198856.getClass(), "scoreConquer", 0);
        setIntField(term4198856, term4198856.getClass(), "scoreCulture", 0);
        setIntField(term4198856, term4198856.getClass(), "scoreResearch", 0);
        setIntField(term4198856, term4198856.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198856, term4198856.getClass(), "scorePopulation", 0);
        setField(term4198856, term4198856.getClass(), "history", null);
        setField(term4198856, term4198856.getClass(), "votes", null);
        setBooleanField(term4198856, term4198856.getClass(), "gameEnd", false);
        setBooleanField(term4198856, term4198856.getClass(), "humanLost", false);
        setField(term4198856, term4198856.getClass(), "pirateDifficulty", null);
        setField(term4198856, term4198856.getClass(), "karmaEvents", null);
        setField(term4198856, term4198856.getClass(), "ascensionEvents", null);
        setBooleanField(term4198856, term4198856.getClass(), "tutorialEnabled", false);
        setField(term4198856, term4198856.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198856, term4198856.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198856, term4198856.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198856, term4198856.getClass(), "forceRedraw", false);
        setIntField(term4198856, term4198856.getClass(), "zoomLevel", 0);
        setBooleanField(term4198856, term4198856.getClass(), "generateFullGame", false);
        term4198880 = new Integer(0);
        term4198882 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4198880;
        args[1] = term4198882;
        callMethod(klass, "getNearesetSolarSystem", argTypes, term4198856, args);
    }

};


