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

public class StarMap_getPlanetListSeenByOther_179874988078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3915103;
     Object term3915127;

    public StarMap_getPlanetListSeenByOther_179874988078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3915103 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3915103, term3915103.getClass(), "maxX", 0);
        setIntField(term3915103, term3915103.getClass(), "maxY", 0);
        setField(term3915103, term3915103.getClass(), "tiles", null);
        setField(term3915103, term3915103.getClass(), "tileInfo", null);
        setField(term3915103, term3915103.getClass(), "culture", null);
        setIntField(term3915103, term3915103.getClass(), "cursorX", 0);
        setIntField(term3915103, term3915103.getClass(), "cursorY", 0);
        setIntField(term3915103, term3915103.getClass(), "drawX", 0);
        setIntField(term3915103, term3915103.getClass(), "drawY", 0);
        setField(term3915103, term3915103.getClass(), "sunList", null);
        setField(term3915103, term3915103.getClass(), "planetList", null);
        setField(term3915103, term3915103.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3915103, term3915103.getClass(), "players", null);
        setIntField(term3915103, term3915103.getClass(), "turn", 0);
        setField(term3915103, term3915103.getClass(), "fleetTiles", null);
        setIntField(term3915103, term3915103.getClass(), "aiTurnNumber", 0);
        setField(term3915103, term3915103.getClass(), "aiFleet", null);
        setField(term3915103, term3915103.getClass(), "newsCorpData", null);
        setBooleanField(term3915103, term3915103.getClass(), "debug", false);
        setIntField(term3915103, term3915103.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3915103, term3915103.getClass(), "scoreConquer", 0);
        setIntField(term3915103, term3915103.getClass(), "scoreCulture", 0);
        setIntField(term3915103, term3915103.getClass(), "scoreResearch", 0);
        setIntField(term3915103, term3915103.getClass(), "scoreDiplomacy", 0);
        setIntField(term3915103, term3915103.getClass(), "scorePopulation", 0);
        setField(term3915103, term3915103.getClass(), "history", null);
        setField(term3915103, term3915103.getClass(), "votes", null);
        setBooleanField(term3915103, term3915103.getClass(), "gameEnd", false);
        setBooleanField(term3915103, term3915103.getClass(), "humanLost", false);
        setField(term3915103, term3915103.getClass(), "pirateDifficulty", null);
        setField(term3915103, term3915103.getClass(), "karmaEvents", null);
        setField(term3915103, term3915103.getClass(), "ascensionEvents", null);
        setBooleanField(term3915103, term3915103.getClass(), "tutorialEnabled", false);
        setField(term3915103, term3915103.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3915103, term3915103.getClass(), "allNewsEnabled", false);
        setBooleanField(term3915103, term3915103.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3915103, term3915103.getClass(), "forceRedraw", false);
        setIntField(term3915103, term3915103.getClass(), "zoomLevel", 0);
        setBooleanField(term3915103, term3915103.getClass(), "generateFullGame", false);
        term3915127 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term3915127;
        args[1] = null;
        callMethod(klass, "getPlanetListSeenByOther", argTypes, term3915103, args);
    }

};


