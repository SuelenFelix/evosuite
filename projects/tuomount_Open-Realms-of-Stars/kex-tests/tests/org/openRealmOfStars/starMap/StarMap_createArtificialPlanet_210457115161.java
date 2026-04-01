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

public class StarMap_createArtificialPlanet_210457115161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4105278;

    public StarMap_createArtificialPlanet_210457115161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4105278 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4105278, term4105278.getClass(), "maxX", 0);
        setIntField(term4105278, term4105278.getClass(), "maxY", 0);
        setField(term4105278, term4105278.getClass(), "tiles", null);
        setField(term4105278, term4105278.getClass(), "tileInfo", null);
        setField(term4105278, term4105278.getClass(), "culture", null);
        setIntField(term4105278, term4105278.getClass(), "cursorX", 0);
        setIntField(term4105278, term4105278.getClass(), "cursorY", 0);
        setIntField(term4105278, term4105278.getClass(), "drawX", 0);
        setIntField(term4105278, term4105278.getClass(), "drawY", 0);
        setField(term4105278, term4105278.getClass(), "sunList", null);
        setField(term4105278, term4105278.getClass(), "planetList", null);
        setField(term4105278, term4105278.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4105278, term4105278.getClass(), "players", null);
        setIntField(term4105278, term4105278.getClass(), "turn", 0);
        setField(term4105278, term4105278.getClass(), "fleetTiles", null);
        setIntField(term4105278, term4105278.getClass(), "aiTurnNumber", 0);
        setField(term4105278, term4105278.getClass(), "aiFleet", null);
        setField(term4105278, term4105278.getClass(), "newsCorpData", null);
        setBooleanField(term4105278, term4105278.getClass(), "debug", false);
        setIntField(term4105278, term4105278.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4105278, term4105278.getClass(), "scoreConquer", 0);
        setIntField(term4105278, term4105278.getClass(), "scoreCulture", 0);
        setIntField(term4105278, term4105278.getClass(), "scoreResearch", 0);
        setIntField(term4105278, term4105278.getClass(), "scoreDiplomacy", 0);
        setIntField(term4105278, term4105278.getClass(), "scorePopulation", 0);
        setField(term4105278, term4105278.getClass(), "history", null);
        setField(term4105278, term4105278.getClass(), "votes", null);
        setBooleanField(term4105278, term4105278.getClass(), "gameEnd", false);
        setBooleanField(term4105278, term4105278.getClass(), "humanLost", false);
        setField(term4105278, term4105278.getClass(), "pirateDifficulty", null);
        setField(term4105278, term4105278.getClass(), "karmaEvents", null);
        setField(term4105278, term4105278.getClass(), "ascensionEvents", null);
        setBooleanField(term4105278, term4105278.getClass(), "tutorialEnabled", false);
        setField(term4105278, term4105278.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4105278, term4105278.getClass(), "allNewsEnabled", false);
        setBooleanField(term4105278, term4105278.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4105278, term4105278.getClass(), "forceRedraw", false);
        setIntField(term4105278, term4105278.getClass(), "zoomLevel", 0);
        setBooleanField(term4105278, term4105278.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createArtificialPlanet", argTypes, term4105278, args);
    }

};


