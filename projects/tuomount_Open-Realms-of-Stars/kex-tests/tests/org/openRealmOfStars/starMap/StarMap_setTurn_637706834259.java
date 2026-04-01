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

public class StarMap_setTurn_637706834259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199854;
     Object term4199878;

    public StarMap_setTurn_637706834259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199854 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199854, term4199854.getClass(), "maxX", 0);
        setIntField(term4199854, term4199854.getClass(), "maxY", 0);
        setField(term4199854, term4199854.getClass(), "tiles", null);
        setField(term4199854, term4199854.getClass(), "tileInfo", null);
        setField(term4199854, term4199854.getClass(), "culture", null);
        setIntField(term4199854, term4199854.getClass(), "cursorX", 0);
        setIntField(term4199854, term4199854.getClass(), "cursorY", 0);
        setIntField(term4199854, term4199854.getClass(), "drawX", 0);
        setIntField(term4199854, term4199854.getClass(), "drawY", 0);
        setField(term4199854, term4199854.getClass(), "sunList", null);
        setField(term4199854, term4199854.getClass(), "planetList", null);
        setField(term4199854, term4199854.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199854, term4199854.getClass(), "players", null);
        setIntField(term4199854, term4199854.getClass(), "turn", 0);
        setField(term4199854, term4199854.getClass(), "fleetTiles", null);
        setIntField(term4199854, term4199854.getClass(), "aiTurnNumber", 0);
        setField(term4199854, term4199854.getClass(), "aiFleet", null);
        setField(term4199854, term4199854.getClass(), "newsCorpData", null);
        setBooleanField(term4199854, term4199854.getClass(), "debug", false);
        setIntField(term4199854, term4199854.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199854, term4199854.getClass(), "scoreConquer", 0);
        setIntField(term4199854, term4199854.getClass(), "scoreCulture", 0);
        setIntField(term4199854, term4199854.getClass(), "scoreResearch", 0);
        setIntField(term4199854, term4199854.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199854, term4199854.getClass(), "scorePopulation", 0);
        setField(term4199854, term4199854.getClass(), "history", null);
        setField(term4199854, term4199854.getClass(), "votes", null);
        setBooleanField(term4199854, term4199854.getClass(), "gameEnd", false);
        setBooleanField(term4199854, term4199854.getClass(), "humanLost", false);
        setField(term4199854, term4199854.getClass(), "pirateDifficulty", null);
        setField(term4199854, term4199854.getClass(), "karmaEvents", null);
        setField(term4199854, term4199854.getClass(), "ascensionEvents", null);
        setBooleanField(term4199854, term4199854.getClass(), "tutorialEnabled", false);
        setField(term4199854, term4199854.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199854, term4199854.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199854, term4199854.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199854, term4199854.getClass(), "forceRedraw", false);
        setIntField(term4199854, term4199854.getClass(), "zoomLevel", 0);
        setBooleanField(term4199854, term4199854.getClass(), "generateFullGame", false);
        term4199878 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4199878;
        callMethod(klass, "setTurn", argTypes, term4199854, args);
    }

};


