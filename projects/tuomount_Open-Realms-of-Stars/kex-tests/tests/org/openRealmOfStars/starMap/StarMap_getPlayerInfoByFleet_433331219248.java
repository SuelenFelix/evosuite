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

public class StarMap_getPlayerInfoByFleet_433331219248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199590;

    public StarMap_getPlayerInfoByFleet_433331219248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199590 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199590, term4199590.getClass(), "maxX", 0);
        setIntField(term4199590, term4199590.getClass(), "maxY", 0);
        setField(term4199590, term4199590.getClass(), "tiles", null);
        setField(term4199590, term4199590.getClass(), "tileInfo", null);
        setField(term4199590, term4199590.getClass(), "culture", null);
        setIntField(term4199590, term4199590.getClass(), "cursorX", 0);
        setIntField(term4199590, term4199590.getClass(), "cursorY", 0);
        setIntField(term4199590, term4199590.getClass(), "drawX", 0);
        setIntField(term4199590, term4199590.getClass(), "drawY", 0);
        setField(term4199590, term4199590.getClass(), "sunList", null);
        setField(term4199590, term4199590.getClass(), "planetList", null);
        setField(term4199590, term4199590.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199590, term4199590.getClass(), "players", null);
        setIntField(term4199590, term4199590.getClass(), "turn", 0);
        setField(term4199590, term4199590.getClass(), "fleetTiles", null);
        setIntField(term4199590, term4199590.getClass(), "aiTurnNumber", 0);
        setField(term4199590, term4199590.getClass(), "aiFleet", null);
        setField(term4199590, term4199590.getClass(), "newsCorpData", null);
        setBooleanField(term4199590, term4199590.getClass(), "debug", false);
        setIntField(term4199590, term4199590.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199590, term4199590.getClass(), "scoreConquer", 0);
        setIntField(term4199590, term4199590.getClass(), "scoreCulture", 0);
        setIntField(term4199590, term4199590.getClass(), "scoreResearch", 0);
        setIntField(term4199590, term4199590.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199590, term4199590.getClass(), "scorePopulation", 0);
        setField(term4199590, term4199590.getClass(), "history", null);
        setField(term4199590, term4199590.getClass(), "votes", null);
        setBooleanField(term4199590, term4199590.getClass(), "gameEnd", false);
        setBooleanField(term4199590, term4199590.getClass(), "humanLost", false);
        setField(term4199590, term4199590.getClass(), "pirateDifficulty", null);
        setField(term4199590, term4199590.getClass(), "karmaEvents", null);
        setField(term4199590, term4199590.getClass(), "ascensionEvents", null);
        setBooleanField(term4199590, term4199590.getClass(), "tutorialEnabled", false);
        setField(term4199590, term4199590.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199590, term4199590.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199590, term4199590.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199590, term4199590.getClass(), "forceRedraw", false);
        setIntField(term4199590, term4199590.getClass(), "zoomLevel", 0);
        setBooleanField(term4199590, term4199590.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPlayerInfoByFleet", argTypes, term4199590, args);
    }

};


