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

public class StarMap_isDangerous_1118977241291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200696;
     Object term4200720;
     Object term4200722;

    public StarMap_isDangerous_1118977241291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200696 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200696, term4200696.getClass(), "maxX", 0);
        setIntField(term4200696, term4200696.getClass(), "maxY", 0);
        setField(term4200696, term4200696.getClass(), "tiles", null);
        setField(term4200696, term4200696.getClass(), "tileInfo", null);
        setField(term4200696, term4200696.getClass(), "culture", null);
        setIntField(term4200696, term4200696.getClass(), "cursorX", 0);
        setIntField(term4200696, term4200696.getClass(), "cursorY", 0);
        setIntField(term4200696, term4200696.getClass(), "drawX", 0);
        setIntField(term4200696, term4200696.getClass(), "drawY", 0);
        setField(term4200696, term4200696.getClass(), "sunList", null);
        setField(term4200696, term4200696.getClass(), "planetList", null);
        setField(term4200696, term4200696.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200696, term4200696.getClass(), "players", null);
        setIntField(term4200696, term4200696.getClass(), "turn", 0);
        setField(term4200696, term4200696.getClass(), "fleetTiles", null);
        setIntField(term4200696, term4200696.getClass(), "aiTurnNumber", 0);
        setField(term4200696, term4200696.getClass(), "aiFleet", null);
        setField(term4200696, term4200696.getClass(), "newsCorpData", null);
        setBooleanField(term4200696, term4200696.getClass(), "debug", false);
        setIntField(term4200696, term4200696.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200696, term4200696.getClass(), "scoreConquer", 0);
        setIntField(term4200696, term4200696.getClass(), "scoreCulture", 0);
        setIntField(term4200696, term4200696.getClass(), "scoreResearch", 0);
        setIntField(term4200696, term4200696.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200696, term4200696.getClass(), "scorePopulation", 0);
        setField(term4200696, term4200696.getClass(), "history", null);
        setField(term4200696, term4200696.getClass(), "votes", null);
        setBooleanField(term4200696, term4200696.getClass(), "gameEnd", false);
        setBooleanField(term4200696, term4200696.getClass(), "humanLost", false);
        setField(term4200696, term4200696.getClass(), "pirateDifficulty", null);
        setField(term4200696, term4200696.getClass(), "karmaEvents", null);
        setField(term4200696, term4200696.getClass(), "ascensionEvents", null);
        setBooleanField(term4200696, term4200696.getClass(), "tutorialEnabled", false);
        setField(term4200696, term4200696.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200696, term4200696.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200696, term4200696.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200696, term4200696.getClass(), "forceRedraw", false);
        setIntField(term4200696, term4200696.getClass(), "zoomLevel", 0);
        setBooleanField(term4200696, term4200696.getClass(), "generateFullGame", false);
        term4200720 = new Integer(0);
        term4200722 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4200720;
        args[1] = term4200722;
        callMethod(klass, "isDangerous", argTypes, term4200696, args);
    }

};


