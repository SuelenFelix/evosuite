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

public class StarMap_doTelescopeScan_191435824488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3949532;

    public StarMap_doTelescopeScan_191435824488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3949532 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3949532, term3949532.getClass(), "maxX", 0);
        setIntField(term3949532, term3949532.getClass(), "maxY", 0);
        setField(term3949532, term3949532.getClass(), "tiles", null);
        setField(term3949532, term3949532.getClass(), "tileInfo", null);
        setField(term3949532, term3949532.getClass(), "culture", null);
        setIntField(term3949532, term3949532.getClass(), "cursorX", 0);
        setIntField(term3949532, term3949532.getClass(), "cursorY", 0);
        setIntField(term3949532, term3949532.getClass(), "drawX", 0);
        setIntField(term3949532, term3949532.getClass(), "drawY", 0);
        setField(term3949532, term3949532.getClass(), "sunList", null);
        setField(term3949532, term3949532.getClass(), "planetList", null);
        setField(term3949532, term3949532.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3949532, term3949532.getClass(), "players", null);
        setIntField(term3949532, term3949532.getClass(), "turn", 0);
        setField(term3949532, term3949532.getClass(), "fleetTiles", null);
        setIntField(term3949532, term3949532.getClass(), "aiTurnNumber", 0);
        setField(term3949532, term3949532.getClass(), "aiFleet", null);
        setField(term3949532, term3949532.getClass(), "newsCorpData", null);
        setBooleanField(term3949532, term3949532.getClass(), "debug", false);
        setIntField(term3949532, term3949532.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3949532, term3949532.getClass(), "scoreConquer", 0);
        setIntField(term3949532, term3949532.getClass(), "scoreCulture", 0);
        setIntField(term3949532, term3949532.getClass(), "scoreResearch", 0);
        setIntField(term3949532, term3949532.getClass(), "scoreDiplomacy", 0);
        setIntField(term3949532, term3949532.getClass(), "scorePopulation", 0);
        setField(term3949532, term3949532.getClass(), "history", null);
        setField(term3949532, term3949532.getClass(), "votes", null);
        setBooleanField(term3949532, term3949532.getClass(), "gameEnd", false);
        setBooleanField(term3949532, term3949532.getClass(), "humanLost", false);
        setField(term3949532, term3949532.getClass(), "pirateDifficulty", null);
        setField(term3949532, term3949532.getClass(), "karmaEvents", null);
        setField(term3949532, term3949532.getClass(), "ascensionEvents", null);
        setBooleanField(term3949532, term3949532.getClass(), "tutorialEnabled", false);
        setField(term3949532, term3949532.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3949532, term3949532.getClass(), "allNewsEnabled", false);
        setBooleanField(term3949532, term3949532.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3949532, term3949532.getClass(), "forceRedraw", false);
        setIntField(term3949532, term3949532.getClass(), "zoomLevel", 0);
        setBooleanField(term3949532, term3949532.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "doTelescopeScan", argTypes, term3949532, args);
    }

};


