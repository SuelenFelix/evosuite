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

public class StarMap_generateMultiPathRoute_1601787557293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200752;

    public StarMap_generateMultiPathRoute_1601787557293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200752 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200752, term4200752.getClass(), "maxX", 0);
        setIntField(term4200752, term4200752.getClass(), "maxY", 0);
        setField(term4200752, term4200752.getClass(), "tiles", null);
        setField(term4200752, term4200752.getClass(), "tileInfo", null);
        setField(term4200752, term4200752.getClass(), "culture", null);
        setIntField(term4200752, term4200752.getClass(), "cursorX", 0);
        setIntField(term4200752, term4200752.getClass(), "cursorY", 0);
        setIntField(term4200752, term4200752.getClass(), "drawX", 0);
        setIntField(term4200752, term4200752.getClass(), "drawY", 0);
        setField(term4200752, term4200752.getClass(), "sunList", null);
        setField(term4200752, term4200752.getClass(), "planetList", null);
        setField(term4200752, term4200752.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200752, term4200752.getClass(), "players", null);
        setIntField(term4200752, term4200752.getClass(), "turn", 0);
        setField(term4200752, term4200752.getClass(), "fleetTiles", null);
        setIntField(term4200752, term4200752.getClass(), "aiTurnNumber", 0);
        setField(term4200752, term4200752.getClass(), "aiFleet", null);
        setField(term4200752, term4200752.getClass(), "newsCorpData", null);
        setBooleanField(term4200752, term4200752.getClass(), "debug", false);
        setIntField(term4200752, term4200752.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200752, term4200752.getClass(), "scoreConquer", 0);
        setIntField(term4200752, term4200752.getClass(), "scoreCulture", 0);
        setIntField(term4200752, term4200752.getClass(), "scoreResearch", 0);
        setIntField(term4200752, term4200752.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200752, term4200752.getClass(), "scorePopulation", 0);
        setField(term4200752, term4200752.getClass(), "history", null);
        setField(term4200752, term4200752.getClass(), "votes", null);
        setBooleanField(term4200752, term4200752.getClass(), "gameEnd", false);
        setBooleanField(term4200752, term4200752.getClass(), "humanLost", false);
        setField(term4200752, term4200752.getClass(), "pirateDifficulty", null);
        setField(term4200752, term4200752.getClass(), "karmaEvents", null);
        setField(term4200752, term4200752.getClass(), "ascensionEvents", null);
        setBooleanField(term4200752, term4200752.getClass(), "tutorialEnabled", false);
        setField(term4200752, term4200752.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200752, term4200752.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200752, term4200752.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200752, term4200752.getClass(), "forceRedraw", false);
        setIntField(term4200752, term4200752.getClass(), "zoomLevel", 0);
        setBooleanField(term4200752, term4200752.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Route");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateMultiPathRoute", argTypes, term4200752, args);
    }

};


