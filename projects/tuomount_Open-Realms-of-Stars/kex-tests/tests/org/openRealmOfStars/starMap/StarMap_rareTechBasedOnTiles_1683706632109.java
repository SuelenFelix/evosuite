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

public class StarMap_rareTechBasedOnTiles_1683706632109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3997053;
     Object term3997077;
     Object term3997079;

    public StarMap_rareTechBasedOnTiles_1683706632109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3997053 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3997053, term3997053.getClass(), "maxX", 0);
        setIntField(term3997053, term3997053.getClass(), "maxY", 0);
        setField(term3997053, term3997053.getClass(), "tiles", null);
        setField(term3997053, term3997053.getClass(), "tileInfo", null);
        setField(term3997053, term3997053.getClass(), "culture", null);
        setIntField(term3997053, term3997053.getClass(), "cursorX", 0);
        setIntField(term3997053, term3997053.getClass(), "cursorY", 0);
        setIntField(term3997053, term3997053.getClass(), "drawX", 0);
        setIntField(term3997053, term3997053.getClass(), "drawY", 0);
        setField(term3997053, term3997053.getClass(), "sunList", null);
        setField(term3997053, term3997053.getClass(), "planetList", null);
        setField(term3997053, term3997053.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3997053, term3997053.getClass(), "players", null);
        setIntField(term3997053, term3997053.getClass(), "turn", 0);
        setField(term3997053, term3997053.getClass(), "fleetTiles", null);
        setIntField(term3997053, term3997053.getClass(), "aiTurnNumber", 0);
        setField(term3997053, term3997053.getClass(), "aiFleet", null);
        setField(term3997053, term3997053.getClass(), "newsCorpData", null);
        setBooleanField(term3997053, term3997053.getClass(), "debug", false);
        setIntField(term3997053, term3997053.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3997053, term3997053.getClass(), "scoreConquer", 0);
        setIntField(term3997053, term3997053.getClass(), "scoreCulture", 0);
        setIntField(term3997053, term3997053.getClass(), "scoreResearch", 0);
        setIntField(term3997053, term3997053.getClass(), "scoreDiplomacy", 0);
        setIntField(term3997053, term3997053.getClass(), "scorePopulation", 0);
        setField(term3997053, term3997053.getClass(), "history", null);
        setField(term3997053, term3997053.getClass(), "votes", null);
        setBooleanField(term3997053, term3997053.getClass(), "gameEnd", false);
        setBooleanField(term3997053, term3997053.getClass(), "humanLost", false);
        setField(term3997053, term3997053.getClass(), "pirateDifficulty", null);
        setField(term3997053, term3997053.getClass(), "karmaEvents", null);
        setField(term3997053, term3997053.getClass(), "ascensionEvents", null);
        setBooleanField(term3997053, term3997053.getClass(), "tutorialEnabled", false);
        setField(term3997053, term3997053.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3997053, term3997053.getClass(), "allNewsEnabled", false);
        setBooleanField(term3997053, term3997053.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3997053, term3997053.getClass(), "forceRedraw", false);
        setIntField(term3997053, term3997053.getClass(), "zoomLevel", 0);
        setBooleanField(term3997053, term3997053.getClass(), "generateFullGame", false);
        term3997077 = new Integer(0);
        term3997079 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3997077;
        args[2] = term3997079;
        args[3] = null;
        callMethod(klass, "rareTechBasedOnTiles", argTypes, term3997053, args);
    }

};


