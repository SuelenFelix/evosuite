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

public class StarMap_setShownTutorial_172121925332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201726;

    public StarMap_setShownTutorial_172121925332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201726 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201726, term4201726.getClass(), "maxX", 0);
        setIntField(term4201726, term4201726.getClass(), "maxY", 0);
        setField(term4201726, term4201726.getClass(), "tiles", null);
        setField(term4201726, term4201726.getClass(), "tileInfo", null);
        setField(term4201726, term4201726.getClass(), "culture", null);
        setIntField(term4201726, term4201726.getClass(), "cursorX", 0);
        setIntField(term4201726, term4201726.getClass(), "cursorY", 0);
        setIntField(term4201726, term4201726.getClass(), "drawX", 0);
        setIntField(term4201726, term4201726.getClass(), "drawY", 0);
        setField(term4201726, term4201726.getClass(), "sunList", null);
        setField(term4201726, term4201726.getClass(), "planetList", null);
        setField(term4201726, term4201726.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201726, term4201726.getClass(), "players", null);
        setIntField(term4201726, term4201726.getClass(), "turn", 0);
        setField(term4201726, term4201726.getClass(), "fleetTiles", null);
        setIntField(term4201726, term4201726.getClass(), "aiTurnNumber", 0);
        setField(term4201726, term4201726.getClass(), "aiFleet", null);
        setField(term4201726, term4201726.getClass(), "newsCorpData", null);
        setBooleanField(term4201726, term4201726.getClass(), "debug", false);
        setIntField(term4201726, term4201726.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201726, term4201726.getClass(), "scoreConquer", 0);
        setIntField(term4201726, term4201726.getClass(), "scoreCulture", 0);
        setIntField(term4201726, term4201726.getClass(), "scoreResearch", 0);
        setIntField(term4201726, term4201726.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201726, term4201726.getClass(), "scorePopulation", 0);
        setField(term4201726, term4201726.getClass(), "history", null);
        setField(term4201726, term4201726.getClass(), "votes", null);
        setBooleanField(term4201726, term4201726.getClass(), "gameEnd", false);
        setBooleanField(term4201726, term4201726.getClass(), "humanLost", false);
        setField(term4201726, term4201726.getClass(), "pirateDifficulty", null);
        setField(term4201726, term4201726.getClass(), "karmaEvents", null);
        setField(term4201726, term4201726.getClass(), "ascensionEvents", null);
        setBooleanField(term4201726, term4201726.getClass(), "tutorialEnabled", false);
        setField(term4201726, term4201726.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201726, term4201726.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201726, term4201726.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201726, term4201726.getClass(), "forceRedraw", false);
        setIntField(term4201726, term4201726.getClass(), "zoomLevel", 0);
        setBooleanField(term4201726, term4201726.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShownTutorial", argTypes, term4201726, args);
    }

};


