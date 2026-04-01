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

public class StarMap_removeObsoleteShipDesign_98044572348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202122;

    public StarMap_removeObsoleteShipDesign_98044572348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202122 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4202122, term4202122.getClass(), "maxX", 0);
        setIntField(term4202122, term4202122.getClass(), "maxY", 0);
        setField(term4202122, term4202122.getClass(), "tiles", null);
        setField(term4202122, term4202122.getClass(), "tileInfo", null);
        setField(term4202122, term4202122.getClass(), "culture", null);
        setIntField(term4202122, term4202122.getClass(), "cursorX", 0);
        setIntField(term4202122, term4202122.getClass(), "cursorY", 0);
        setIntField(term4202122, term4202122.getClass(), "drawX", 0);
        setIntField(term4202122, term4202122.getClass(), "drawY", 0);
        setField(term4202122, term4202122.getClass(), "sunList", null);
        setField(term4202122, term4202122.getClass(), "planetList", null);
        setField(term4202122, term4202122.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4202122, term4202122.getClass(), "players", null);
        setIntField(term4202122, term4202122.getClass(), "turn", 0);
        setField(term4202122, term4202122.getClass(), "fleetTiles", null);
        setIntField(term4202122, term4202122.getClass(), "aiTurnNumber", 0);
        setField(term4202122, term4202122.getClass(), "aiFleet", null);
        setField(term4202122, term4202122.getClass(), "newsCorpData", null);
        setBooleanField(term4202122, term4202122.getClass(), "debug", false);
        setIntField(term4202122, term4202122.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4202122, term4202122.getClass(), "scoreConquer", 0);
        setIntField(term4202122, term4202122.getClass(), "scoreCulture", 0);
        setIntField(term4202122, term4202122.getClass(), "scoreResearch", 0);
        setIntField(term4202122, term4202122.getClass(), "scoreDiplomacy", 0);
        setIntField(term4202122, term4202122.getClass(), "scorePopulation", 0);
        setField(term4202122, term4202122.getClass(), "history", null);
        setField(term4202122, term4202122.getClass(), "votes", null);
        setBooleanField(term4202122, term4202122.getClass(), "gameEnd", false);
        setBooleanField(term4202122, term4202122.getClass(), "humanLost", false);
        setField(term4202122, term4202122.getClass(), "pirateDifficulty", null);
        setField(term4202122, term4202122.getClass(), "karmaEvents", null);
        setField(term4202122, term4202122.getClass(), "ascensionEvents", null);
        setBooleanField(term4202122, term4202122.getClass(), "tutorialEnabled", false);
        setField(term4202122, term4202122.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4202122, term4202122.getClass(), "allNewsEnabled", false);
        setBooleanField(term4202122, term4202122.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4202122, term4202122.getClass(), "forceRedraw", false);
        setIntField(term4202122, term4202122.getClass(), "zoomLevel", 0);
        setBooleanField(term4202122, term4202122.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeObsoleteShipDesign", argTypes, term4202122, args);
    }

};


