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

public class StarMap_drawVisibilityLine_1388471063282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200442;
     Object term4200466;
     Object term4200468;
     Object term4200470;
     Object term4200472;
     Object term4200474;
     Object term4200476;

    public StarMap_drawVisibilityLine_1388471063282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200442 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200442, term4200442.getClass(), "maxX", 0);
        setIntField(term4200442, term4200442.getClass(), "maxY", 0);
        setField(term4200442, term4200442.getClass(), "tiles", null);
        setField(term4200442, term4200442.getClass(), "tileInfo", null);
        setField(term4200442, term4200442.getClass(), "culture", null);
        setIntField(term4200442, term4200442.getClass(), "cursorX", 0);
        setIntField(term4200442, term4200442.getClass(), "cursorY", 0);
        setIntField(term4200442, term4200442.getClass(), "drawX", 0);
        setIntField(term4200442, term4200442.getClass(), "drawY", 0);
        setField(term4200442, term4200442.getClass(), "sunList", null);
        setField(term4200442, term4200442.getClass(), "planetList", null);
        setField(term4200442, term4200442.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200442, term4200442.getClass(), "players", null);
        setIntField(term4200442, term4200442.getClass(), "turn", 0);
        setField(term4200442, term4200442.getClass(), "fleetTiles", null);
        setIntField(term4200442, term4200442.getClass(), "aiTurnNumber", 0);
        setField(term4200442, term4200442.getClass(), "aiFleet", null);
        setField(term4200442, term4200442.getClass(), "newsCorpData", null);
        setBooleanField(term4200442, term4200442.getClass(), "debug", false);
        setIntField(term4200442, term4200442.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200442, term4200442.getClass(), "scoreConquer", 0);
        setIntField(term4200442, term4200442.getClass(), "scoreCulture", 0);
        setIntField(term4200442, term4200442.getClass(), "scoreResearch", 0);
        setIntField(term4200442, term4200442.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200442, term4200442.getClass(), "scorePopulation", 0);
        setField(term4200442, term4200442.getClass(), "history", null);
        setField(term4200442, term4200442.getClass(), "votes", null);
        setBooleanField(term4200442, term4200442.getClass(), "gameEnd", false);
        setBooleanField(term4200442, term4200442.getClass(), "humanLost", false);
        setField(term4200442, term4200442.getClass(), "pirateDifficulty", null);
        setField(term4200442, term4200442.getClass(), "karmaEvents", null);
        setField(term4200442, term4200442.getClass(), "ascensionEvents", null);
        setBooleanField(term4200442, term4200442.getClass(), "tutorialEnabled", false);
        setField(term4200442, term4200442.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200442, term4200442.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200442, term4200442.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200442, term4200442.getClass(), "forceRedraw", false);
        setIntField(term4200442, term4200442.getClass(), "zoomLevel", 0);
        setBooleanField(term4200442, term4200442.getClass(), "generateFullGame", false);
        term4200466 = new Integer(0);
        term4200468 = new Integer(0);
        term4200470 = new Integer(0);
        term4200472 = new Integer(0);
        term4200474 = new Integer(0);
        term4200476 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = term4200466;
        args[2] = term4200468;
        args[3] = term4200470;
        args[4] = term4200472;
        args[5] = term4200474;
        args[6] = term4200476;
        args[7] = null;
        callMethod(klass, "drawVisibilityLine", argTypes, term4200442, args);
    }

};


