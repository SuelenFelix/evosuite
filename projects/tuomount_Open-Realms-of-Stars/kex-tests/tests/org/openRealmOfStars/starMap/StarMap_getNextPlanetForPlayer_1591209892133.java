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

public class StarMap_getNextPlanetForPlayer_1591209892133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4064704;
     Object term4064728;

    public StarMap_getNextPlanetForPlayer_1591209892133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4064704 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4064704, term4064704.getClass(), "maxX", 0);
        setIntField(term4064704, term4064704.getClass(), "maxY", 0);
        setField(term4064704, term4064704.getClass(), "tiles", null);
        setField(term4064704, term4064704.getClass(), "tileInfo", null);
        setField(term4064704, term4064704.getClass(), "culture", null);
        setIntField(term4064704, term4064704.getClass(), "cursorX", 0);
        setIntField(term4064704, term4064704.getClass(), "cursorY", 0);
        setIntField(term4064704, term4064704.getClass(), "drawX", 0);
        setIntField(term4064704, term4064704.getClass(), "drawY", 0);
        setField(term4064704, term4064704.getClass(), "sunList", null);
        setField(term4064704, term4064704.getClass(), "planetList", null);
        setField(term4064704, term4064704.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4064704, term4064704.getClass(), "players", null);
        setIntField(term4064704, term4064704.getClass(), "turn", 0);
        setField(term4064704, term4064704.getClass(), "fleetTiles", null);
        setIntField(term4064704, term4064704.getClass(), "aiTurnNumber", 0);
        setField(term4064704, term4064704.getClass(), "aiFleet", null);
        setField(term4064704, term4064704.getClass(), "newsCorpData", null);
        setBooleanField(term4064704, term4064704.getClass(), "debug", false);
        setIntField(term4064704, term4064704.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4064704, term4064704.getClass(), "scoreConquer", 0);
        setIntField(term4064704, term4064704.getClass(), "scoreCulture", 0);
        setIntField(term4064704, term4064704.getClass(), "scoreResearch", 0);
        setIntField(term4064704, term4064704.getClass(), "scoreDiplomacy", 0);
        setIntField(term4064704, term4064704.getClass(), "scorePopulation", 0);
        setField(term4064704, term4064704.getClass(), "history", null);
        setField(term4064704, term4064704.getClass(), "votes", null);
        setBooleanField(term4064704, term4064704.getClass(), "gameEnd", false);
        setBooleanField(term4064704, term4064704.getClass(), "humanLost", false);
        setField(term4064704, term4064704.getClass(), "pirateDifficulty", null);
        setField(term4064704, term4064704.getClass(), "karmaEvents", null);
        setField(term4064704, term4064704.getClass(), "ascensionEvents", null);
        setBooleanField(term4064704, term4064704.getClass(), "tutorialEnabled", false);
        setField(term4064704, term4064704.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4064704, term4064704.getClass(), "allNewsEnabled", false);
        setBooleanField(term4064704, term4064704.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4064704, term4064704.getClass(), "forceRedraw", false);
        setIntField(term4064704, term4064704.getClass(), "zoomLevel", 0);
        setBooleanField(term4064704, term4064704.getClass(), "generateFullGame", false);
        term4064728 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term4064728;
        callMethod(klass, "getNextPlanetForPlayer", argTypes, term4064704, args);
    }

};


