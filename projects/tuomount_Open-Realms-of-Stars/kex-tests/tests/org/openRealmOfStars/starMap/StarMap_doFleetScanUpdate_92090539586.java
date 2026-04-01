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

public class StarMap_doFleetScanUpdate_92090539586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3934171;

    public StarMap_doFleetScanUpdate_92090539586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3934171 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3934171, term3934171.getClass(), "maxX", 0);
        setIntField(term3934171, term3934171.getClass(), "maxY", 0);
        setField(term3934171, term3934171.getClass(), "tiles", null);
        setField(term3934171, term3934171.getClass(), "tileInfo", null);
        setField(term3934171, term3934171.getClass(), "culture", null);
        setIntField(term3934171, term3934171.getClass(), "cursorX", 0);
        setIntField(term3934171, term3934171.getClass(), "cursorY", 0);
        setIntField(term3934171, term3934171.getClass(), "drawX", 0);
        setIntField(term3934171, term3934171.getClass(), "drawY", 0);
        setField(term3934171, term3934171.getClass(), "sunList", null);
        setField(term3934171, term3934171.getClass(), "planetList", null);
        setField(term3934171, term3934171.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3934171, term3934171.getClass(), "players", null);
        setIntField(term3934171, term3934171.getClass(), "turn", 0);
        setField(term3934171, term3934171.getClass(), "fleetTiles", null);
        setIntField(term3934171, term3934171.getClass(), "aiTurnNumber", 0);
        setField(term3934171, term3934171.getClass(), "aiFleet", null);
        setField(term3934171, term3934171.getClass(), "newsCorpData", null);
        setBooleanField(term3934171, term3934171.getClass(), "debug", false);
        setIntField(term3934171, term3934171.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3934171, term3934171.getClass(), "scoreConquer", 0);
        setIntField(term3934171, term3934171.getClass(), "scoreCulture", 0);
        setIntField(term3934171, term3934171.getClass(), "scoreResearch", 0);
        setIntField(term3934171, term3934171.getClass(), "scoreDiplomacy", 0);
        setIntField(term3934171, term3934171.getClass(), "scorePopulation", 0);
        setField(term3934171, term3934171.getClass(), "history", null);
        setField(term3934171, term3934171.getClass(), "votes", null);
        setBooleanField(term3934171, term3934171.getClass(), "gameEnd", false);
        setBooleanField(term3934171, term3934171.getClass(), "humanLost", false);
        setField(term3934171, term3934171.getClass(), "pirateDifficulty", null);
        setField(term3934171, term3934171.getClass(), "karmaEvents", null);
        setField(term3934171, term3934171.getClass(), "ascensionEvents", null);
        setBooleanField(term3934171, term3934171.getClass(), "tutorialEnabled", false);
        setField(term3934171, term3934171.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3934171, term3934171.getClass(), "allNewsEnabled", false);
        setBooleanField(term3934171, term3934171.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3934171, term3934171.getClass(), "forceRedraw", false);
        setIntField(term3934171, term3934171.getClass(), "zoomLevel", 0);
        setBooleanField(term3934171, term3934171.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "doFleetScanUpdate", argTypes, term3934171, args);
    }

};


