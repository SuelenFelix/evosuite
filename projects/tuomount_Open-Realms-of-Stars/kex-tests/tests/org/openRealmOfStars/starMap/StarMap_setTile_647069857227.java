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

public class StarMap_setTile_647069857227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199040;
     Object term4199064;
     Object term4199066;
     Object term4199068;

    public StarMap_setTile_647069857227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199040 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199040, term4199040.getClass(), "maxX", 0);
        setIntField(term4199040, term4199040.getClass(), "maxY", 0);
        setField(term4199040, term4199040.getClass(), "tiles", null);
        setField(term4199040, term4199040.getClass(), "tileInfo", null);
        setField(term4199040, term4199040.getClass(), "culture", null);
        setIntField(term4199040, term4199040.getClass(), "cursorX", 0);
        setIntField(term4199040, term4199040.getClass(), "cursorY", 0);
        setIntField(term4199040, term4199040.getClass(), "drawX", 0);
        setIntField(term4199040, term4199040.getClass(), "drawY", 0);
        setField(term4199040, term4199040.getClass(), "sunList", null);
        setField(term4199040, term4199040.getClass(), "planetList", null);
        setField(term4199040, term4199040.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199040, term4199040.getClass(), "players", null);
        setIntField(term4199040, term4199040.getClass(), "turn", 0);
        setField(term4199040, term4199040.getClass(), "fleetTiles", null);
        setIntField(term4199040, term4199040.getClass(), "aiTurnNumber", 0);
        setField(term4199040, term4199040.getClass(), "aiFleet", null);
        setField(term4199040, term4199040.getClass(), "newsCorpData", null);
        setBooleanField(term4199040, term4199040.getClass(), "debug", false);
        setIntField(term4199040, term4199040.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199040, term4199040.getClass(), "scoreConquer", 0);
        setIntField(term4199040, term4199040.getClass(), "scoreCulture", 0);
        setIntField(term4199040, term4199040.getClass(), "scoreResearch", 0);
        setIntField(term4199040, term4199040.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199040, term4199040.getClass(), "scorePopulation", 0);
        setField(term4199040, term4199040.getClass(), "history", null);
        setField(term4199040, term4199040.getClass(), "votes", null);
        setBooleanField(term4199040, term4199040.getClass(), "gameEnd", false);
        setBooleanField(term4199040, term4199040.getClass(), "humanLost", false);
        setField(term4199040, term4199040.getClass(), "pirateDifficulty", null);
        setField(term4199040, term4199040.getClass(), "karmaEvents", null);
        setField(term4199040, term4199040.getClass(), "ascensionEvents", null);
        setBooleanField(term4199040, term4199040.getClass(), "tutorialEnabled", false);
        setField(term4199040, term4199040.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199040, term4199040.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199040, term4199040.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199040, term4199040.getClass(), "forceRedraw", false);
        setIntField(term4199040, term4199040.getClass(), "zoomLevel", 0);
        setBooleanField(term4199040, term4199040.getClass(), "generateFullGame", false);
        term4199064 = new Integer(0);
        term4199066 = new Integer(0);
        term4199068 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4199064;
        args[1] = term4199066;
        args[2] = term4199068;
        callMethod(klass, "setTile", argTypes, term4199040, args);
    }

};


