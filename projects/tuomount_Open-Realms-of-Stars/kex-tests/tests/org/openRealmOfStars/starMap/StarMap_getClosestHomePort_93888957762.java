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

public class StarMap_getClosestHomePort_93888957762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3886131;

    public StarMap_getClosestHomePort_93888957762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3886131 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3886131, term3886131.getClass(), "maxX", 0);
        setIntField(term3886131, term3886131.getClass(), "maxY", 0);
        setField(term3886131, term3886131.getClass(), "tiles", null);
        setField(term3886131, term3886131.getClass(), "tileInfo", null);
        setField(term3886131, term3886131.getClass(), "culture", null);
        setIntField(term3886131, term3886131.getClass(), "cursorX", 0);
        setIntField(term3886131, term3886131.getClass(), "cursorY", 0);
        setIntField(term3886131, term3886131.getClass(), "drawX", 0);
        setIntField(term3886131, term3886131.getClass(), "drawY", 0);
        setField(term3886131, term3886131.getClass(), "sunList", null);
        setField(term3886131, term3886131.getClass(), "planetList", null);
        setField(term3886131, term3886131.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3886131, term3886131.getClass(), "players", null);
        setIntField(term3886131, term3886131.getClass(), "turn", 0);
        setField(term3886131, term3886131.getClass(), "fleetTiles", null);
        setIntField(term3886131, term3886131.getClass(), "aiTurnNumber", 0);
        setField(term3886131, term3886131.getClass(), "aiFleet", null);
        setField(term3886131, term3886131.getClass(), "newsCorpData", null);
        setBooleanField(term3886131, term3886131.getClass(), "debug", false);
        setIntField(term3886131, term3886131.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3886131, term3886131.getClass(), "scoreConquer", 0);
        setIntField(term3886131, term3886131.getClass(), "scoreCulture", 0);
        setIntField(term3886131, term3886131.getClass(), "scoreResearch", 0);
        setIntField(term3886131, term3886131.getClass(), "scoreDiplomacy", 0);
        setIntField(term3886131, term3886131.getClass(), "scorePopulation", 0);
        setField(term3886131, term3886131.getClass(), "history", null);
        setField(term3886131, term3886131.getClass(), "votes", null);
        setBooleanField(term3886131, term3886131.getClass(), "gameEnd", false);
        setBooleanField(term3886131, term3886131.getClass(), "humanLost", false);
        setField(term3886131, term3886131.getClass(), "pirateDifficulty", null);
        setField(term3886131, term3886131.getClass(), "karmaEvents", null);
        setField(term3886131, term3886131.getClass(), "ascensionEvents", null);
        setBooleanField(term3886131, term3886131.getClass(), "tutorialEnabled", false);
        setField(term3886131, term3886131.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3886131, term3886131.getClass(), "allNewsEnabled", false);
        setBooleanField(term3886131, term3886131.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3886131, term3886131.getClass(), "forceRedraw", false);
        setIntField(term3886131, term3886131.getClass(), "zoomLevel", 0);
        setBooleanField(term3886131, term3886131.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getClosestHomePort", argTypes, term3886131, args);
    }

};


