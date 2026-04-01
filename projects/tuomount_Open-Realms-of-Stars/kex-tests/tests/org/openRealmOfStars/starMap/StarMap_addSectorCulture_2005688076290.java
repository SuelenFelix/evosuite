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

public class StarMap_addSectorCulture_2005688076290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200664;
     Object term4200688;
     Object term4200690;
     Object term4200692;
     Object term4200694;

    public StarMap_addSectorCulture_2005688076290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200664 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200664, term4200664.getClass(), "maxX", 0);
        setIntField(term4200664, term4200664.getClass(), "maxY", 0);
        setField(term4200664, term4200664.getClass(), "tiles", null);
        setField(term4200664, term4200664.getClass(), "tileInfo", null);
        setField(term4200664, term4200664.getClass(), "culture", null);
        setIntField(term4200664, term4200664.getClass(), "cursorX", 0);
        setIntField(term4200664, term4200664.getClass(), "cursorY", 0);
        setIntField(term4200664, term4200664.getClass(), "drawX", 0);
        setIntField(term4200664, term4200664.getClass(), "drawY", 0);
        setField(term4200664, term4200664.getClass(), "sunList", null);
        setField(term4200664, term4200664.getClass(), "planetList", null);
        setField(term4200664, term4200664.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200664, term4200664.getClass(), "players", null);
        setIntField(term4200664, term4200664.getClass(), "turn", 0);
        setField(term4200664, term4200664.getClass(), "fleetTiles", null);
        setIntField(term4200664, term4200664.getClass(), "aiTurnNumber", 0);
        setField(term4200664, term4200664.getClass(), "aiFleet", null);
        setField(term4200664, term4200664.getClass(), "newsCorpData", null);
        setBooleanField(term4200664, term4200664.getClass(), "debug", false);
        setIntField(term4200664, term4200664.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200664, term4200664.getClass(), "scoreConquer", 0);
        setIntField(term4200664, term4200664.getClass(), "scoreCulture", 0);
        setIntField(term4200664, term4200664.getClass(), "scoreResearch", 0);
        setIntField(term4200664, term4200664.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200664, term4200664.getClass(), "scorePopulation", 0);
        setField(term4200664, term4200664.getClass(), "history", null);
        setField(term4200664, term4200664.getClass(), "votes", null);
        setBooleanField(term4200664, term4200664.getClass(), "gameEnd", false);
        setBooleanField(term4200664, term4200664.getClass(), "humanLost", false);
        setField(term4200664, term4200664.getClass(), "pirateDifficulty", null);
        setField(term4200664, term4200664.getClass(), "karmaEvents", null);
        setField(term4200664, term4200664.getClass(), "ascensionEvents", null);
        setBooleanField(term4200664, term4200664.getClass(), "tutorialEnabled", false);
        setField(term4200664, term4200664.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200664, term4200664.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200664, term4200664.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200664, term4200664.getClass(), "forceRedraw", false);
        setIntField(term4200664, term4200664.getClass(), "zoomLevel", 0);
        setBooleanField(term4200664, term4200664.getClass(), "generateFullGame", false);
        term4200688 = new Integer(0);
        term4200690 = new Integer(0);
        term4200692 = new Integer(0);
        term4200694 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4200688;
        args[1] = term4200690;
        args[2] = term4200692;
        args[3] = term4200694;
        callMethod(klass, "addSectorCulture", argTypes, term4200664, args);
    }

};


