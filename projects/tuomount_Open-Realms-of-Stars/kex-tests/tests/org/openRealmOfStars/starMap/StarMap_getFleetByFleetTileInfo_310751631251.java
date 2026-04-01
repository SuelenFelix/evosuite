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

public class StarMap_getFleetByFleetTileInfo_310751631251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199662;

    public StarMap_getFleetByFleetTileInfo_310751631251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199662 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199662, term4199662.getClass(), "maxX", 0);
        setIntField(term4199662, term4199662.getClass(), "maxY", 0);
        setField(term4199662, term4199662.getClass(), "tiles", null);
        setField(term4199662, term4199662.getClass(), "tileInfo", null);
        setField(term4199662, term4199662.getClass(), "culture", null);
        setIntField(term4199662, term4199662.getClass(), "cursorX", 0);
        setIntField(term4199662, term4199662.getClass(), "cursorY", 0);
        setIntField(term4199662, term4199662.getClass(), "drawX", 0);
        setIntField(term4199662, term4199662.getClass(), "drawY", 0);
        setField(term4199662, term4199662.getClass(), "sunList", null);
        setField(term4199662, term4199662.getClass(), "planetList", null);
        setField(term4199662, term4199662.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199662, term4199662.getClass(), "players", null);
        setIntField(term4199662, term4199662.getClass(), "turn", 0);
        setField(term4199662, term4199662.getClass(), "fleetTiles", null);
        setIntField(term4199662, term4199662.getClass(), "aiTurnNumber", 0);
        setField(term4199662, term4199662.getClass(), "aiFleet", null);
        setField(term4199662, term4199662.getClass(), "newsCorpData", null);
        setBooleanField(term4199662, term4199662.getClass(), "debug", false);
        setIntField(term4199662, term4199662.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199662, term4199662.getClass(), "scoreConquer", 0);
        setIntField(term4199662, term4199662.getClass(), "scoreCulture", 0);
        setIntField(term4199662, term4199662.getClass(), "scoreResearch", 0);
        setIntField(term4199662, term4199662.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199662, term4199662.getClass(), "scorePopulation", 0);
        setField(term4199662, term4199662.getClass(), "history", null);
        setField(term4199662, term4199662.getClass(), "votes", null);
        setBooleanField(term4199662, term4199662.getClass(), "gameEnd", false);
        setBooleanField(term4199662, term4199662.getClass(), "humanLost", false);
        setField(term4199662, term4199662.getClass(), "pirateDifficulty", null);
        setField(term4199662, term4199662.getClass(), "karmaEvents", null);
        setField(term4199662, term4199662.getClass(), "ascensionEvents", null);
        setBooleanField(term4199662, term4199662.getClass(), "tutorialEnabled", false);
        setField(term4199662, term4199662.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199662, term4199662.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199662, term4199662.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199662, term4199662.getClass(), "forceRedraw", false);
        setIntField(term4199662, term4199662.getClass(), "zoomLevel", 0);
        setBooleanField(term4199662, term4199662.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFleetByFleetTileInfo", argTypes, term4199662, args);
    }

};


