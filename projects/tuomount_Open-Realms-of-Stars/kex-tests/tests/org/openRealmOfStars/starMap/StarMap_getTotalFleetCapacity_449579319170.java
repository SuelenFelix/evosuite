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

public class StarMap_getTotalFleetCapacity_449579319170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4126187;

    public StarMap_getTotalFleetCapacity_449579319170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4126187 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4126187, term4126187.getClass(), "maxX", 0);
        setIntField(term4126187, term4126187.getClass(), "maxY", 0);
        setField(term4126187, term4126187.getClass(), "tiles", null);
        setField(term4126187, term4126187.getClass(), "tileInfo", null);
        setField(term4126187, term4126187.getClass(), "culture", null);
        setIntField(term4126187, term4126187.getClass(), "cursorX", 0);
        setIntField(term4126187, term4126187.getClass(), "cursorY", 0);
        setIntField(term4126187, term4126187.getClass(), "drawX", 0);
        setIntField(term4126187, term4126187.getClass(), "drawY", 0);
        setField(term4126187, term4126187.getClass(), "sunList", null);
        setField(term4126187, term4126187.getClass(), "planetList", null);
        setField(term4126187, term4126187.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4126187, term4126187.getClass(), "players", null);
        setIntField(term4126187, term4126187.getClass(), "turn", 0);
        setField(term4126187, term4126187.getClass(), "fleetTiles", null);
        setIntField(term4126187, term4126187.getClass(), "aiTurnNumber", 0);
        setField(term4126187, term4126187.getClass(), "aiFleet", null);
        setField(term4126187, term4126187.getClass(), "newsCorpData", null);
        setBooleanField(term4126187, term4126187.getClass(), "debug", false);
        setIntField(term4126187, term4126187.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4126187, term4126187.getClass(), "scoreConquer", 0);
        setIntField(term4126187, term4126187.getClass(), "scoreCulture", 0);
        setIntField(term4126187, term4126187.getClass(), "scoreResearch", 0);
        setIntField(term4126187, term4126187.getClass(), "scoreDiplomacy", 0);
        setIntField(term4126187, term4126187.getClass(), "scorePopulation", 0);
        setField(term4126187, term4126187.getClass(), "history", null);
        setField(term4126187, term4126187.getClass(), "votes", null);
        setBooleanField(term4126187, term4126187.getClass(), "gameEnd", false);
        setBooleanField(term4126187, term4126187.getClass(), "humanLost", false);
        setField(term4126187, term4126187.getClass(), "pirateDifficulty", null);
        setField(term4126187, term4126187.getClass(), "karmaEvents", null);
        setField(term4126187, term4126187.getClass(), "ascensionEvents", null);
        setBooleanField(term4126187, term4126187.getClass(), "tutorialEnabled", false);
        setField(term4126187, term4126187.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4126187, term4126187.getClass(), "allNewsEnabled", false);
        setBooleanField(term4126187, term4126187.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4126187, term4126187.getClass(), "forceRedraw", false);
        setIntField(term4126187, term4126187.getClass(), "zoomLevel", 0);
        setBooleanField(term4126187, term4126187.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getTotalFleetCapacity", argTypes, term4126187, args);
    }

};


