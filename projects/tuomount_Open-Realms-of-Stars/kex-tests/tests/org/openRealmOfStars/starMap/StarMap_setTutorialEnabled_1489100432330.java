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

public class StarMap_setTutorialEnabled_1489100432330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201676;
     Object term4201700;

    public StarMap_setTutorialEnabled_1489100432330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201676 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201676, term4201676.getClass(), "maxX", 0);
        setIntField(term4201676, term4201676.getClass(), "maxY", 0);
        setField(term4201676, term4201676.getClass(), "tiles", null);
        setField(term4201676, term4201676.getClass(), "tileInfo", null);
        setField(term4201676, term4201676.getClass(), "culture", null);
        setIntField(term4201676, term4201676.getClass(), "cursorX", 0);
        setIntField(term4201676, term4201676.getClass(), "cursorY", 0);
        setIntField(term4201676, term4201676.getClass(), "drawX", 0);
        setIntField(term4201676, term4201676.getClass(), "drawY", 0);
        setField(term4201676, term4201676.getClass(), "sunList", null);
        setField(term4201676, term4201676.getClass(), "planetList", null);
        setField(term4201676, term4201676.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201676, term4201676.getClass(), "players", null);
        setIntField(term4201676, term4201676.getClass(), "turn", 0);
        setField(term4201676, term4201676.getClass(), "fleetTiles", null);
        setIntField(term4201676, term4201676.getClass(), "aiTurnNumber", 0);
        setField(term4201676, term4201676.getClass(), "aiFleet", null);
        setField(term4201676, term4201676.getClass(), "newsCorpData", null);
        setBooleanField(term4201676, term4201676.getClass(), "debug", false);
        setIntField(term4201676, term4201676.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201676, term4201676.getClass(), "scoreConquer", 0);
        setIntField(term4201676, term4201676.getClass(), "scoreCulture", 0);
        setIntField(term4201676, term4201676.getClass(), "scoreResearch", 0);
        setIntField(term4201676, term4201676.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201676, term4201676.getClass(), "scorePopulation", 0);
        setField(term4201676, term4201676.getClass(), "history", null);
        setField(term4201676, term4201676.getClass(), "votes", null);
        setBooleanField(term4201676, term4201676.getClass(), "gameEnd", false);
        setBooleanField(term4201676, term4201676.getClass(), "humanLost", false);
        setField(term4201676, term4201676.getClass(), "pirateDifficulty", null);
        setField(term4201676, term4201676.getClass(), "karmaEvents", null);
        setField(term4201676, term4201676.getClass(), "ascensionEvents", null);
        setBooleanField(term4201676, term4201676.getClass(), "tutorialEnabled", false);
        setField(term4201676, term4201676.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201676, term4201676.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201676, term4201676.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201676, term4201676.getClass(), "forceRedraw", false);
        setIntField(term4201676, term4201676.getClass(), "zoomLevel", 0);
        setBooleanField(term4201676, term4201676.getClass(), "generateFullGame", false);
        term4201700 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4201700;
        callMethod(klass, "setTutorialEnabled", argTypes, term4201676, args);
    }

};


