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

public class StarMap_getSunByName_718878966244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199486;

    public StarMap_getSunByName_718878966244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199486 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199486, term4199486.getClass(), "maxX", 0);
        setIntField(term4199486, term4199486.getClass(), "maxY", 0);
        setField(term4199486, term4199486.getClass(), "tiles", null);
        setField(term4199486, term4199486.getClass(), "tileInfo", null);
        setField(term4199486, term4199486.getClass(), "culture", null);
        setIntField(term4199486, term4199486.getClass(), "cursorX", 0);
        setIntField(term4199486, term4199486.getClass(), "cursorY", 0);
        setIntField(term4199486, term4199486.getClass(), "drawX", 0);
        setIntField(term4199486, term4199486.getClass(), "drawY", 0);
        setField(term4199486, term4199486.getClass(), "sunList", null);
        setField(term4199486, term4199486.getClass(), "planetList", null);
        setField(term4199486, term4199486.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199486, term4199486.getClass(), "players", null);
        setIntField(term4199486, term4199486.getClass(), "turn", 0);
        setField(term4199486, term4199486.getClass(), "fleetTiles", null);
        setIntField(term4199486, term4199486.getClass(), "aiTurnNumber", 0);
        setField(term4199486, term4199486.getClass(), "aiFleet", null);
        setField(term4199486, term4199486.getClass(), "newsCorpData", null);
        setBooleanField(term4199486, term4199486.getClass(), "debug", false);
        setIntField(term4199486, term4199486.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199486, term4199486.getClass(), "scoreConquer", 0);
        setIntField(term4199486, term4199486.getClass(), "scoreCulture", 0);
        setIntField(term4199486, term4199486.getClass(), "scoreResearch", 0);
        setIntField(term4199486, term4199486.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199486, term4199486.getClass(), "scorePopulation", 0);
        setField(term4199486, term4199486.getClass(), "history", null);
        setField(term4199486, term4199486.getClass(), "votes", null);
        setBooleanField(term4199486, term4199486.getClass(), "gameEnd", false);
        setBooleanField(term4199486, term4199486.getClass(), "humanLost", false);
        setField(term4199486, term4199486.getClass(), "pirateDifficulty", null);
        setField(term4199486, term4199486.getClass(), "karmaEvents", null);
        setField(term4199486, term4199486.getClass(), "ascensionEvents", null);
        setBooleanField(term4199486, term4199486.getClass(), "tutorialEnabled", false);
        setField(term4199486, term4199486.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199486, term4199486.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199486, term4199486.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199486, term4199486.getClass(), "forceRedraw", false);
        setIntField(term4199486, term4199486.getClass(), "zoomLevel", 0);
        setBooleanField(term4199486, term4199486.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSunByName", argTypes, term4199486, args);
    }

};


