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

public class StarMap_generateAscensionPortal_471998445281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200418;

    public StarMap_generateAscensionPortal_471998445281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200418 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200418, term4200418.getClass(), "maxX", 0);
        setIntField(term4200418, term4200418.getClass(), "maxY", 0);
        setField(term4200418, term4200418.getClass(), "tiles", null);
        setField(term4200418, term4200418.getClass(), "tileInfo", null);
        setField(term4200418, term4200418.getClass(), "culture", null);
        setIntField(term4200418, term4200418.getClass(), "cursorX", 0);
        setIntField(term4200418, term4200418.getClass(), "cursorY", 0);
        setIntField(term4200418, term4200418.getClass(), "drawX", 0);
        setIntField(term4200418, term4200418.getClass(), "drawY", 0);
        setField(term4200418, term4200418.getClass(), "sunList", null);
        setField(term4200418, term4200418.getClass(), "planetList", null);
        setField(term4200418, term4200418.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200418, term4200418.getClass(), "players", null);
        setIntField(term4200418, term4200418.getClass(), "turn", 0);
        setField(term4200418, term4200418.getClass(), "fleetTiles", null);
        setIntField(term4200418, term4200418.getClass(), "aiTurnNumber", 0);
        setField(term4200418, term4200418.getClass(), "aiFleet", null);
        setField(term4200418, term4200418.getClass(), "newsCorpData", null);
        setBooleanField(term4200418, term4200418.getClass(), "debug", false);
        setIntField(term4200418, term4200418.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200418, term4200418.getClass(), "scoreConquer", 0);
        setIntField(term4200418, term4200418.getClass(), "scoreCulture", 0);
        setIntField(term4200418, term4200418.getClass(), "scoreResearch", 0);
        setIntField(term4200418, term4200418.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200418, term4200418.getClass(), "scorePopulation", 0);
        setField(term4200418, term4200418.getClass(), "history", null);
        setField(term4200418, term4200418.getClass(), "votes", null);
        setBooleanField(term4200418, term4200418.getClass(), "gameEnd", false);
        setBooleanField(term4200418, term4200418.getClass(), "humanLost", false);
        setField(term4200418, term4200418.getClass(), "pirateDifficulty", null);
        setField(term4200418, term4200418.getClass(), "karmaEvents", null);
        setField(term4200418, term4200418.getClass(), "ascensionEvents", null);
        setBooleanField(term4200418, term4200418.getClass(), "tutorialEnabled", false);
        setField(term4200418, term4200418.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200418, term4200418.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200418, term4200418.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200418, term4200418.getClass(), "forceRedraw", false);
        setIntField(term4200418, term4200418.getClass(), "zoomLevel", 0);
        setBooleanField(term4200418, term4200418.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateAscensionPortal", argTypes, term4200418, args);
    }

};


