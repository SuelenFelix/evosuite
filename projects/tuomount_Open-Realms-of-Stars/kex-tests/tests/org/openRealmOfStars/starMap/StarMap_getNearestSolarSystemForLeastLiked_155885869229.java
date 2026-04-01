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

public class StarMap_getNearestSolarSystemForLeastLiked_155885869229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3838111;
     Object term3838135;
     Object term3838137;
     Object term3838139;

    public StarMap_getNearestSolarSystemForLeastLiked_155885869229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3838111 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3838111, term3838111.getClass(), "maxX", 0);
        setIntField(term3838111, term3838111.getClass(), "maxY", 0);
        setField(term3838111, term3838111.getClass(), "tiles", null);
        setField(term3838111, term3838111.getClass(), "tileInfo", null);
        setField(term3838111, term3838111.getClass(), "culture", null);
        setIntField(term3838111, term3838111.getClass(), "cursorX", 0);
        setIntField(term3838111, term3838111.getClass(), "cursorY", 0);
        setIntField(term3838111, term3838111.getClass(), "drawX", 0);
        setIntField(term3838111, term3838111.getClass(), "drawY", 0);
        setField(term3838111, term3838111.getClass(), "sunList", null);
        setField(term3838111, term3838111.getClass(), "planetList", null);
        setField(term3838111, term3838111.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3838111, term3838111.getClass(), "players", null);
        setIntField(term3838111, term3838111.getClass(), "turn", 0);
        setField(term3838111, term3838111.getClass(), "fleetTiles", null);
        setIntField(term3838111, term3838111.getClass(), "aiTurnNumber", 0);
        setField(term3838111, term3838111.getClass(), "aiFleet", null);
        setField(term3838111, term3838111.getClass(), "newsCorpData", null);
        setBooleanField(term3838111, term3838111.getClass(), "debug", false);
        setIntField(term3838111, term3838111.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3838111, term3838111.getClass(), "scoreConquer", 0);
        setIntField(term3838111, term3838111.getClass(), "scoreCulture", 0);
        setIntField(term3838111, term3838111.getClass(), "scoreResearch", 0);
        setIntField(term3838111, term3838111.getClass(), "scoreDiplomacy", 0);
        setIntField(term3838111, term3838111.getClass(), "scorePopulation", 0);
        setField(term3838111, term3838111.getClass(), "history", null);
        setField(term3838111, term3838111.getClass(), "votes", null);
        setBooleanField(term3838111, term3838111.getClass(), "gameEnd", false);
        setBooleanField(term3838111, term3838111.getClass(), "humanLost", false);
        setField(term3838111, term3838111.getClass(), "pirateDifficulty", null);
        setField(term3838111, term3838111.getClass(), "karmaEvents", null);
        setField(term3838111, term3838111.getClass(), "ascensionEvents", null);
        setBooleanField(term3838111, term3838111.getClass(), "tutorialEnabled", false);
        setField(term3838111, term3838111.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3838111, term3838111.getClass(), "allNewsEnabled", false);
        setBooleanField(term3838111, term3838111.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3838111, term3838111.getClass(), "forceRedraw", false);
        setIntField(term3838111, term3838111.getClass(), "zoomLevel", 0);
        setBooleanField(term3838111, term3838111.getClass(), "generateFullGame", false);
        term3838135 = new Integer(0);
        term3838137 = new Integer(0);
        term3838139 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term3838135;
        args[1] = term3838137;
        args[2] = null;
        args[3] = term3838139;
        callMethod(klass, "getNearestSolarSystemForLeastLiked", argTypes, term3838111, args);
    }

};


