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

public class StarMap_doFleetScanBlocked_120174458390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3958226;
     Object term3958250;
     Object term3958252;

    public StarMap_doFleetScanBlocked_120174458390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3958226 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3958226, term3958226.getClass(), "maxX", 0);
        setIntField(term3958226, term3958226.getClass(), "maxY", 0);
        setField(term3958226, term3958226.getClass(), "tiles", null);
        setField(term3958226, term3958226.getClass(), "tileInfo", null);
        setField(term3958226, term3958226.getClass(), "culture", null);
        setIntField(term3958226, term3958226.getClass(), "cursorX", 0);
        setIntField(term3958226, term3958226.getClass(), "cursorY", 0);
        setIntField(term3958226, term3958226.getClass(), "drawX", 0);
        setIntField(term3958226, term3958226.getClass(), "drawY", 0);
        setField(term3958226, term3958226.getClass(), "sunList", null);
        setField(term3958226, term3958226.getClass(), "planetList", null);
        setField(term3958226, term3958226.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3958226, term3958226.getClass(), "players", null);
        setIntField(term3958226, term3958226.getClass(), "turn", 0);
        setField(term3958226, term3958226.getClass(), "fleetTiles", null);
        setIntField(term3958226, term3958226.getClass(), "aiTurnNumber", 0);
        setField(term3958226, term3958226.getClass(), "aiFleet", null);
        setField(term3958226, term3958226.getClass(), "newsCorpData", null);
        setBooleanField(term3958226, term3958226.getClass(), "debug", false);
        setIntField(term3958226, term3958226.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3958226, term3958226.getClass(), "scoreConquer", 0);
        setIntField(term3958226, term3958226.getClass(), "scoreCulture", 0);
        setIntField(term3958226, term3958226.getClass(), "scoreResearch", 0);
        setIntField(term3958226, term3958226.getClass(), "scoreDiplomacy", 0);
        setIntField(term3958226, term3958226.getClass(), "scorePopulation", 0);
        setField(term3958226, term3958226.getClass(), "history", null);
        setField(term3958226, term3958226.getClass(), "votes", null);
        setBooleanField(term3958226, term3958226.getClass(), "gameEnd", false);
        setBooleanField(term3958226, term3958226.getClass(), "humanLost", false);
        setField(term3958226, term3958226.getClass(), "pirateDifficulty", null);
        setField(term3958226, term3958226.getClass(), "karmaEvents", null);
        setField(term3958226, term3958226.getClass(), "ascensionEvents", null);
        setBooleanField(term3958226, term3958226.getClass(), "tutorialEnabled", false);
        setField(term3958226, term3958226.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3958226, term3958226.getClass(), "allNewsEnabled", false);
        setBooleanField(term3958226, term3958226.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3958226, term3958226.getClass(), "forceRedraw", false);
        setIntField(term3958226, term3958226.getClass(), "zoomLevel", 0);
        setBooleanField(term3958226, term3958226.getClass(), "generateFullGame", false);
        term3958250 = new Integer(0);
        term3958252 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term3958250;
        args[3] = term3958252;
        callMethod(klass, "doFleetScanBlocked", argTypes, term3958226, args);
    }

};


