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

public class StarMap_drawTelescopeLine_2137059323114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4024396;
     Object term4024420;
     Object term4024422;
     Object term4024424;
     Object term4024426;
     Object term4024428;

    public StarMap_drawTelescopeLine_2137059323114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4024396 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4024396, term4024396.getClass(), "maxX", 0);
        setIntField(term4024396, term4024396.getClass(), "maxY", 0);
        setField(term4024396, term4024396.getClass(), "tiles", null);
        setField(term4024396, term4024396.getClass(), "tileInfo", null);
        setField(term4024396, term4024396.getClass(), "culture", null);
        setIntField(term4024396, term4024396.getClass(), "cursorX", 0);
        setIntField(term4024396, term4024396.getClass(), "cursorY", 0);
        setIntField(term4024396, term4024396.getClass(), "drawX", 0);
        setIntField(term4024396, term4024396.getClass(), "drawY", 0);
        setField(term4024396, term4024396.getClass(), "sunList", null);
        setField(term4024396, term4024396.getClass(), "planetList", null);
        setField(term4024396, term4024396.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4024396, term4024396.getClass(), "players", null);
        setIntField(term4024396, term4024396.getClass(), "turn", 0);
        setField(term4024396, term4024396.getClass(), "fleetTiles", null);
        setIntField(term4024396, term4024396.getClass(), "aiTurnNumber", 0);
        setField(term4024396, term4024396.getClass(), "aiFleet", null);
        setField(term4024396, term4024396.getClass(), "newsCorpData", null);
        setBooleanField(term4024396, term4024396.getClass(), "debug", false);
        setIntField(term4024396, term4024396.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4024396, term4024396.getClass(), "scoreConquer", 0);
        setIntField(term4024396, term4024396.getClass(), "scoreCulture", 0);
        setIntField(term4024396, term4024396.getClass(), "scoreResearch", 0);
        setIntField(term4024396, term4024396.getClass(), "scoreDiplomacy", 0);
        setIntField(term4024396, term4024396.getClass(), "scorePopulation", 0);
        setField(term4024396, term4024396.getClass(), "history", null);
        setField(term4024396, term4024396.getClass(), "votes", null);
        setBooleanField(term4024396, term4024396.getClass(), "gameEnd", false);
        setBooleanField(term4024396, term4024396.getClass(), "humanLost", false);
        setField(term4024396, term4024396.getClass(), "pirateDifficulty", null);
        setField(term4024396, term4024396.getClass(), "karmaEvents", null);
        setField(term4024396, term4024396.getClass(), "ascensionEvents", null);
        setBooleanField(term4024396, term4024396.getClass(), "tutorialEnabled", false);
        setField(term4024396, term4024396.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4024396, term4024396.getClass(), "allNewsEnabled", false);
        setBooleanField(term4024396, term4024396.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4024396, term4024396.getClass(), "forceRedraw", false);
        setIntField(term4024396, term4024396.getClass(), "zoomLevel", 0);
        setBooleanField(term4024396, term4024396.getClass(), "generateFullGame", false);
        term4024420 = new Integer(0);
        term4024422 = new Integer(0);
        term4024424 = new Integer(0);
        term4024426 = new Integer(0);
        term4024428 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term4024420;
        args[2] = term4024422;
        args[3] = term4024424;
        args[4] = term4024426;
        args[5] = term4024428;
        callMethod(klass, "drawTelescopeLine", argTypes, term4024396, args);
    }

};


