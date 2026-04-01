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
import java.lang.Boolean;

public class StarMap_setGameEnded_1113996363318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201380;
     Object term4201404;

    public StarMap_setGameEnded_1113996363318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201380 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201380, term4201380.getClass(), "maxX", 0);
        setIntField(term4201380, term4201380.getClass(), "maxY", 0);
        setField(term4201380, term4201380.getClass(), "tiles", null);
        setField(term4201380, term4201380.getClass(), "tileInfo", null);
        setField(term4201380, term4201380.getClass(), "culture", null);
        setIntField(term4201380, term4201380.getClass(), "cursorX", 0);
        setIntField(term4201380, term4201380.getClass(), "cursorY", 0);
        setIntField(term4201380, term4201380.getClass(), "drawX", 0);
        setIntField(term4201380, term4201380.getClass(), "drawY", 0);
        setField(term4201380, term4201380.getClass(), "sunList", null);
        setField(term4201380, term4201380.getClass(), "planetList", null);
        setField(term4201380, term4201380.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201380, term4201380.getClass(), "players", null);
        setIntField(term4201380, term4201380.getClass(), "turn", 0);
        setField(term4201380, term4201380.getClass(), "fleetTiles", null);
        setIntField(term4201380, term4201380.getClass(), "aiTurnNumber", 0);
        setField(term4201380, term4201380.getClass(), "aiFleet", null);
        setField(term4201380, term4201380.getClass(), "newsCorpData", null);
        setBooleanField(term4201380, term4201380.getClass(), "debug", false);
        setIntField(term4201380, term4201380.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201380, term4201380.getClass(), "scoreConquer", 0);
        setIntField(term4201380, term4201380.getClass(), "scoreCulture", 0);
        setIntField(term4201380, term4201380.getClass(), "scoreResearch", 0);
        setIntField(term4201380, term4201380.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201380, term4201380.getClass(), "scorePopulation", 0);
        setField(term4201380, term4201380.getClass(), "history", null);
        setField(term4201380, term4201380.getClass(), "votes", null);
        setBooleanField(term4201380, term4201380.getClass(), "gameEnd", false);
        setBooleanField(term4201380, term4201380.getClass(), "humanLost", false);
        setField(term4201380, term4201380.getClass(), "pirateDifficulty", null);
        setField(term4201380, term4201380.getClass(), "karmaEvents", null);
        setField(term4201380, term4201380.getClass(), "ascensionEvents", null);
        setBooleanField(term4201380, term4201380.getClass(), "tutorialEnabled", false);
        setField(term4201380, term4201380.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201380, term4201380.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201380, term4201380.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201380, term4201380.getClass(), "forceRedraw", false);
        setIntField(term4201380, term4201380.getClass(), "zoomLevel", 0);
        setBooleanField(term4201380, term4201380.getClass(), "generateFullGame", false);
        term4201404 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4201404;
        callMethod(klass, "setGameEnded", argTypes, term4201380, args);
    }

};


