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
import java.lang.Boolean;

public class StarMap_getNearestSolarSystem_18227566627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3829718;
     Object term3829742;
     Object term3829744;
     Object term3829746;

    public StarMap_getNearestSolarSystem_18227566627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3829718 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3829718, term3829718.getClass(), "maxX", 0);
        setIntField(term3829718, term3829718.getClass(), "maxY", 0);
        setField(term3829718, term3829718.getClass(), "tiles", null);
        setField(term3829718, term3829718.getClass(), "tileInfo", null);
        setField(term3829718, term3829718.getClass(), "culture", null);
        setIntField(term3829718, term3829718.getClass(), "cursorX", 0);
        setIntField(term3829718, term3829718.getClass(), "cursorY", 0);
        setIntField(term3829718, term3829718.getClass(), "drawX", 0);
        setIntField(term3829718, term3829718.getClass(), "drawY", 0);
        setField(term3829718, term3829718.getClass(), "sunList", null);
        setField(term3829718, term3829718.getClass(), "planetList", null);
        setField(term3829718, term3829718.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3829718, term3829718.getClass(), "players", null);
        setIntField(term3829718, term3829718.getClass(), "turn", 0);
        setField(term3829718, term3829718.getClass(), "fleetTiles", null);
        setIntField(term3829718, term3829718.getClass(), "aiTurnNumber", 0);
        setField(term3829718, term3829718.getClass(), "aiFleet", null);
        setField(term3829718, term3829718.getClass(), "newsCorpData", null);
        setBooleanField(term3829718, term3829718.getClass(), "debug", false);
        setIntField(term3829718, term3829718.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3829718, term3829718.getClass(), "scoreConquer", 0);
        setIntField(term3829718, term3829718.getClass(), "scoreCulture", 0);
        setIntField(term3829718, term3829718.getClass(), "scoreResearch", 0);
        setIntField(term3829718, term3829718.getClass(), "scoreDiplomacy", 0);
        setIntField(term3829718, term3829718.getClass(), "scorePopulation", 0);
        setField(term3829718, term3829718.getClass(), "history", null);
        setField(term3829718, term3829718.getClass(), "votes", null);
        setBooleanField(term3829718, term3829718.getClass(), "gameEnd", false);
        setBooleanField(term3829718, term3829718.getClass(), "humanLost", false);
        setField(term3829718, term3829718.getClass(), "pirateDifficulty", null);
        setField(term3829718, term3829718.getClass(), "karmaEvents", null);
        setField(term3829718, term3829718.getClass(), "ascensionEvents", null);
        setBooleanField(term3829718, term3829718.getClass(), "tutorialEnabled", false);
        setField(term3829718, term3829718.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3829718, term3829718.getClass(), "allNewsEnabled", false);
        setBooleanField(term3829718, term3829718.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3829718, term3829718.getClass(), "forceRedraw", false);
        setIntField(term3829718, term3829718.getClass(), "zoomLevel", 0);
        setBooleanField(term3829718, term3829718.getClass(), "generateFullGame", false);
        term3829742 = new Integer(0);
        term3829744 = new Integer(0);
        term3829746 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term3829742;
        args[1] = term3829744;
        args[2] = null;
        args[3] = null;
        args[4] = term3829746;
        callMethod(klass, "getNearestSolarSystem", argTypes, term3829718, args);
    }

};


