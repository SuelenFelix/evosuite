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

public class StarMap_addSpaceAnomalyEnemy_1181691681212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198670;
     Object term4198694;
     Object term4198696;
     Object term4198698;

    public StarMap_addSpaceAnomalyEnemy_1181691681212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198670 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198670, term4198670.getClass(), "maxX", 0);
        setIntField(term4198670, term4198670.getClass(), "maxY", 0);
        setField(term4198670, term4198670.getClass(), "tiles", null);
        setField(term4198670, term4198670.getClass(), "tileInfo", null);
        setField(term4198670, term4198670.getClass(), "culture", null);
        setIntField(term4198670, term4198670.getClass(), "cursorX", 0);
        setIntField(term4198670, term4198670.getClass(), "cursorY", 0);
        setIntField(term4198670, term4198670.getClass(), "drawX", 0);
        setIntField(term4198670, term4198670.getClass(), "drawY", 0);
        setField(term4198670, term4198670.getClass(), "sunList", null);
        setField(term4198670, term4198670.getClass(), "planetList", null);
        setField(term4198670, term4198670.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198670, term4198670.getClass(), "players", null);
        setIntField(term4198670, term4198670.getClass(), "turn", 0);
        setField(term4198670, term4198670.getClass(), "fleetTiles", null);
        setIntField(term4198670, term4198670.getClass(), "aiTurnNumber", 0);
        setField(term4198670, term4198670.getClass(), "aiFleet", null);
        setField(term4198670, term4198670.getClass(), "newsCorpData", null);
        setBooleanField(term4198670, term4198670.getClass(), "debug", false);
        setIntField(term4198670, term4198670.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198670, term4198670.getClass(), "scoreConquer", 0);
        setIntField(term4198670, term4198670.getClass(), "scoreCulture", 0);
        setIntField(term4198670, term4198670.getClass(), "scoreResearch", 0);
        setIntField(term4198670, term4198670.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198670, term4198670.getClass(), "scorePopulation", 0);
        setField(term4198670, term4198670.getClass(), "history", null);
        setField(term4198670, term4198670.getClass(), "votes", null);
        setBooleanField(term4198670, term4198670.getClass(), "gameEnd", false);
        setBooleanField(term4198670, term4198670.getClass(), "humanLost", false);
        setField(term4198670, term4198670.getClass(), "pirateDifficulty", null);
        setField(term4198670, term4198670.getClass(), "karmaEvents", null);
        setField(term4198670, term4198670.getClass(), "ascensionEvents", null);
        setBooleanField(term4198670, term4198670.getClass(), "tutorialEnabled", false);
        setField(term4198670, term4198670.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198670, term4198670.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198670, term4198670.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198670, term4198670.getClass(), "forceRedraw", false);
        setIntField(term4198670, term4198670.getClass(), "zoomLevel", 0);
        setBooleanField(term4198670, term4198670.getClass(), "generateFullGame", false);
        term4198694 = new Integer(0);
        term4198696 = new Integer(0);
        term4198698 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4198694;
        args[1] = term4198696;
        args[2] = null;
        args[3] = term4198698;
        callMethod(klass, "addSpaceAnomalyEnemy", argTypes, term4198670, args);
    }

};


