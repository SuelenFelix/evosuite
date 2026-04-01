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

public class StarMap_isShipStatBeingBuilt_481463512138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4077621;

    public StarMap_isShipStatBeingBuilt_481463512138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4077621 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4077621, term4077621.getClass(), "maxX", 0);
        setIntField(term4077621, term4077621.getClass(), "maxY", 0);
        setField(term4077621, term4077621.getClass(), "tiles", null);
        setField(term4077621, term4077621.getClass(), "tileInfo", null);
        setField(term4077621, term4077621.getClass(), "culture", null);
        setIntField(term4077621, term4077621.getClass(), "cursorX", 0);
        setIntField(term4077621, term4077621.getClass(), "cursorY", 0);
        setIntField(term4077621, term4077621.getClass(), "drawX", 0);
        setIntField(term4077621, term4077621.getClass(), "drawY", 0);
        setField(term4077621, term4077621.getClass(), "sunList", null);
        setField(term4077621, term4077621.getClass(), "planetList", null);
        setField(term4077621, term4077621.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4077621, term4077621.getClass(), "players", null);
        setIntField(term4077621, term4077621.getClass(), "turn", 0);
        setField(term4077621, term4077621.getClass(), "fleetTiles", null);
        setIntField(term4077621, term4077621.getClass(), "aiTurnNumber", 0);
        setField(term4077621, term4077621.getClass(), "aiFleet", null);
        setField(term4077621, term4077621.getClass(), "newsCorpData", null);
        setBooleanField(term4077621, term4077621.getClass(), "debug", false);
        setIntField(term4077621, term4077621.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4077621, term4077621.getClass(), "scoreConquer", 0);
        setIntField(term4077621, term4077621.getClass(), "scoreCulture", 0);
        setIntField(term4077621, term4077621.getClass(), "scoreResearch", 0);
        setIntField(term4077621, term4077621.getClass(), "scoreDiplomacy", 0);
        setIntField(term4077621, term4077621.getClass(), "scorePopulation", 0);
        setField(term4077621, term4077621.getClass(), "history", null);
        setField(term4077621, term4077621.getClass(), "votes", null);
        setBooleanField(term4077621, term4077621.getClass(), "gameEnd", false);
        setBooleanField(term4077621, term4077621.getClass(), "humanLost", false);
        setField(term4077621, term4077621.getClass(), "pirateDifficulty", null);
        setField(term4077621, term4077621.getClass(), "karmaEvents", null);
        setField(term4077621, term4077621.getClass(), "ascensionEvents", null);
        setBooleanField(term4077621, term4077621.getClass(), "tutorialEnabled", false);
        setField(term4077621, term4077621.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4077621, term4077621.getClass(), "allNewsEnabled", false);
        setBooleanField(term4077621, term4077621.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4077621, term4077621.getClass(), "forceRedraw", false);
        setIntField(term4077621, term4077621.getClass(), "zoomLevel", 0);
        setBooleanField(term4077621, term4077621.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isShipStatBeingBuilt", argTypes, term4077621, args);
    }

};


