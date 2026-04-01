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

public class StarMap_setAIFleet_1778156213266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200024;

    public StarMap_setAIFleet_1778156213266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200024 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200024, term4200024.getClass(), "maxX", 0);
        setIntField(term4200024, term4200024.getClass(), "maxY", 0);
        setField(term4200024, term4200024.getClass(), "tiles", null);
        setField(term4200024, term4200024.getClass(), "tileInfo", null);
        setField(term4200024, term4200024.getClass(), "culture", null);
        setIntField(term4200024, term4200024.getClass(), "cursorX", 0);
        setIntField(term4200024, term4200024.getClass(), "cursorY", 0);
        setIntField(term4200024, term4200024.getClass(), "drawX", 0);
        setIntField(term4200024, term4200024.getClass(), "drawY", 0);
        setField(term4200024, term4200024.getClass(), "sunList", null);
        setField(term4200024, term4200024.getClass(), "planetList", null);
        setField(term4200024, term4200024.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200024, term4200024.getClass(), "players", null);
        setIntField(term4200024, term4200024.getClass(), "turn", 0);
        setField(term4200024, term4200024.getClass(), "fleetTiles", null);
        setIntField(term4200024, term4200024.getClass(), "aiTurnNumber", 0);
        setField(term4200024, term4200024.getClass(), "aiFleet", null);
        setField(term4200024, term4200024.getClass(), "newsCorpData", null);
        setBooleanField(term4200024, term4200024.getClass(), "debug", false);
        setIntField(term4200024, term4200024.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200024, term4200024.getClass(), "scoreConquer", 0);
        setIntField(term4200024, term4200024.getClass(), "scoreCulture", 0);
        setIntField(term4200024, term4200024.getClass(), "scoreResearch", 0);
        setIntField(term4200024, term4200024.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200024, term4200024.getClass(), "scorePopulation", 0);
        setField(term4200024, term4200024.getClass(), "history", null);
        setField(term4200024, term4200024.getClass(), "votes", null);
        setBooleanField(term4200024, term4200024.getClass(), "gameEnd", false);
        setBooleanField(term4200024, term4200024.getClass(), "humanLost", false);
        setField(term4200024, term4200024.getClass(), "pirateDifficulty", null);
        setField(term4200024, term4200024.getClass(), "karmaEvents", null);
        setField(term4200024, term4200024.getClass(), "ascensionEvents", null);
        setBooleanField(term4200024, term4200024.getClass(), "tutorialEnabled", false);
        setField(term4200024, term4200024.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200024, term4200024.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200024, term4200024.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200024, term4200024.getClass(), "forceRedraw", false);
        setIntField(term4200024, term4200024.getClass(), "zoomLevel", 0);
        setBooleanField(term4200024, term4200024.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAIFleet", argTypes, term4200024, args);
    }

};


