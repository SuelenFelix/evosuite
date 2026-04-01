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

public class StarMap_isWarBetween_1872548061129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4049609;

    public StarMap_isWarBetween_1872548061129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4049609 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4049609, term4049609.getClass(), "maxX", 0);
        setIntField(term4049609, term4049609.getClass(), "maxY", 0);
        setField(term4049609, term4049609.getClass(), "tiles", null);
        setField(term4049609, term4049609.getClass(), "tileInfo", null);
        setField(term4049609, term4049609.getClass(), "culture", null);
        setIntField(term4049609, term4049609.getClass(), "cursorX", 0);
        setIntField(term4049609, term4049609.getClass(), "cursorY", 0);
        setIntField(term4049609, term4049609.getClass(), "drawX", 0);
        setIntField(term4049609, term4049609.getClass(), "drawY", 0);
        setField(term4049609, term4049609.getClass(), "sunList", null);
        setField(term4049609, term4049609.getClass(), "planetList", null);
        setField(term4049609, term4049609.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4049609, term4049609.getClass(), "players", null);
        setIntField(term4049609, term4049609.getClass(), "turn", 0);
        setField(term4049609, term4049609.getClass(), "fleetTiles", null);
        setIntField(term4049609, term4049609.getClass(), "aiTurnNumber", 0);
        setField(term4049609, term4049609.getClass(), "aiFleet", null);
        setField(term4049609, term4049609.getClass(), "newsCorpData", null);
        setBooleanField(term4049609, term4049609.getClass(), "debug", false);
        setIntField(term4049609, term4049609.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4049609, term4049609.getClass(), "scoreConquer", 0);
        setIntField(term4049609, term4049609.getClass(), "scoreCulture", 0);
        setIntField(term4049609, term4049609.getClass(), "scoreResearch", 0);
        setIntField(term4049609, term4049609.getClass(), "scoreDiplomacy", 0);
        setIntField(term4049609, term4049609.getClass(), "scorePopulation", 0);
        setField(term4049609, term4049609.getClass(), "history", null);
        setField(term4049609, term4049609.getClass(), "votes", null);
        setBooleanField(term4049609, term4049609.getClass(), "gameEnd", false);
        setBooleanField(term4049609, term4049609.getClass(), "humanLost", false);
        setField(term4049609, term4049609.getClass(), "pirateDifficulty", null);
        setField(term4049609, term4049609.getClass(), "karmaEvents", null);
        setField(term4049609, term4049609.getClass(), "ascensionEvents", null);
        setBooleanField(term4049609, term4049609.getClass(), "tutorialEnabled", false);
        setField(term4049609, term4049609.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4049609, term4049609.getClass(), "allNewsEnabled", false);
        setBooleanField(term4049609, term4049609.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4049609, term4049609.getClass(), "forceRedraw", false);
        setIntField(term4049609, term4049609.getClass(), "zoomLevel", 0);
        setBooleanField(term4049609, term4049609.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "isWarBetween", argTypes, term4049609, args);
    }

};


