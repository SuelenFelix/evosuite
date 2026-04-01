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

public class StarMap_handleDiplomaticDelegacies_936292375263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199952;

    public StarMap_handleDiplomaticDelegacies_936292375263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199952 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199952, term4199952.getClass(), "maxX", 0);
        setIntField(term4199952, term4199952.getClass(), "maxY", 0);
        setField(term4199952, term4199952.getClass(), "tiles", null);
        setField(term4199952, term4199952.getClass(), "tileInfo", null);
        setField(term4199952, term4199952.getClass(), "culture", null);
        setIntField(term4199952, term4199952.getClass(), "cursorX", 0);
        setIntField(term4199952, term4199952.getClass(), "cursorY", 0);
        setIntField(term4199952, term4199952.getClass(), "drawX", 0);
        setIntField(term4199952, term4199952.getClass(), "drawY", 0);
        setField(term4199952, term4199952.getClass(), "sunList", null);
        setField(term4199952, term4199952.getClass(), "planetList", null);
        setField(term4199952, term4199952.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199952, term4199952.getClass(), "players", null);
        setIntField(term4199952, term4199952.getClass(), "turn", 0);
        setField(term4199952, term4199952.getClass(), "fleetTiles", null);
        setIntField(term4199952, term4199952.getClass(), "aiTurnNumber", 0);
        setField(term4199952, term4199952.getClass(), "aiFleet", null);
        setField(term4199952, term4199952.getClass(), "newsCorpData", null);
        setBooleanField(term4199952, term4199952.getClass(), "debug", false);
        setIntField(term4199952, term4199952.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199952, term4199952.getClass(), "scoreConquer", 0);
        setIntField(term4199952, term4199952.getClass(), "scoreCulture", 0);
        setIntField(term4199952, term4199952.getClass(), "scoreResearch", 0);
        setIntField(term4199952, term4199952.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199952, term4199952.getClass(), "scorePopulation", 0);
        setField(term4199952, term4199952.getClass(), "history", null);
        setField(term4199952, term4199952.getClass(), "votes", null);
        setBooleanField(term4199952, term4199952.getClass(), "gameEnd", false);
        setBooleanField(term4199952, term4199952.getClass(), "humanLost", false);
        setField(term4199952, term4199952.getClass(), "pirateDifficulty", null);
        setField(term4199952, term4199952.getClass(), "karmaEvents", null);
        setField(term4199952, term4199952.getClass(), "ascensionEvents", null);
        setBooleanField(term4199952, term4199952.getClass(), "tutorialEnabled", false);
        setField(term4199952, term4199952.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199952, term4199952.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199952, term4199952.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199952, term4199952.getClass(), "forceRedraw", false);
        setIntField(term4199952, term4199952.getClass(), "zoomLevel", 0);
        setBooleanField(term4199952, term4199952.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleDiplomaticDelegacies", argTypes, term4199952, args);
    }

};


