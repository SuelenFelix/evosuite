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

public class StarMap_addSpacePirate_18611313136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3732704;
     Object term3732728;
     Object term3732730;

    public StarMap_addSpacePirate_18611313136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3732704 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3732704, term3732704.getClass(), "maxX", 0);
        setIntField(term3732704, term3732704.getClass(), "maxY", 0);
        setField(term3732704, term3732704.getClass(), "tiles", null);
        setField(term3732704, term3732704.getClass(), "tileInfo", null);
        setField(term3732704, term3732704.getClass(), "culture", null);
        setIntField(term3732704, term3732704.getClass(), "cursorX", 0);
        setIntField(term3732704, term3732704.getClass(), "cursorY", 0);
        setIntField(term3732704, term3732704.getClass(), "drawX", 0);
        setIntField(term3732704, term3732704.getClass(), "drawY", 0);
        setField(term3732704, term3732704.getClass(), "sunList", null);
        setField(term3732704, term3732704.getClass(), "planetList", null);
        setField(term3732704, term3732704.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3732704, term3732704.getClass(), "players", null);
        setIntField(term3732704, term3732704.getClass(), "turn", 0);
        setField(term3732704, term3732704.getClass(), "fleetTiles", null);
        setIntField(term3732704, term3732704.getClass(), "aiTurnNumber", 0);
        setField(term3732704, term3732704.getClass(), "aiFleet", null);
        setField(term3732704, term3732704.getClass(), "newsCorpData", null);
        setBooleanField(term3732704, term3732704.getClass(), "debug", false);
        setIntField(term3732704, term3732704.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3732704, term3732704.getClass(), "scoreConquer", 0);
        setIntField(term3732704, term3732704.getClass(), "scoreCulture", 0);
        setIntField(term3732704, term3732704.getClass(), "scoreResearch", 0);
        setIntField(term3732704, term3732704.getClass(), "scoreDiplomacy", 0);
        setIntField(term3732704, term3732704.getClass(), "scorePopulation", 0);
        setField(term3732704, term3732704.getClass(), "history", null);
        setField(term3732704, term3732704.getClass(), "votes", null);
        setBooleanField(term3732704, term3732704.getClass(), "gameEnd", false);
        setBooleanField(term3732704, term3732704.getClass(), "humanLost", false);
        setField(term3732704, term3732704.getClass(), "pirateDifficulty", null);
        setField(term3732704, term3732704.getClass(), "karmaEvents", null);
        setField(term3732704, term3732704.getClass(), "ascensionEvents", null);
        setBooleanField(term3732704, term3732704.getClass(), "tutorialEnabled", false);
        setField(term3732704, term3732704.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3732704, term3732704.getClass(), "allNewsEnabled", false);
        setBooleanField(term3732704, term3732704.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3732704, term3732704.getClass(), "forceRedraw", false);
        setIntField(term3732704, term3732704.getClass(), "zoomLevel", 0);
        setBooleanField(term3732704, term3732704.getClass(), "generateFullGame", false);
        term3732728 = new Integer(0);
        term3732730 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = term3732728;
        args[1] = term3732730;
        args[2] = null;
        callMethod(klass, "addSpacePirate", argTypes, term3732704, args);
    }

};


