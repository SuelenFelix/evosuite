package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Game_createConflictingShipImage_961252208104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231949;
     Object term2231954;

    public Game_createConflictingShipImage_961252208104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231949 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2231949, term2231949.getClass(), "animationTimer", null);
        setField(term2231949, term2231949.getClass(), "musicTimer", null);
        setField(term2231949, term2231949.getClass(), "starMap", null);
        setField(term2231949, term2231949.getClass(), "players", null);
        setField(term2231949, term2231949.getClass(), "gameState", null);
        setField(term2231949, term2231949.getClass(), "previousState", null);
        setField(term2231949, term2231949.getClass(), "planetView", null);
        setField(term2231949, term2231949.getClass(), "espionageMissionView", null);
        setField(term2231949, term2231949.getClass(), "planetBombingView", null);
        setField(term2231949, term2231949.getClass(), "fleetView", null);
        setField(term2231949, term2231949.getClass(), "shipUpgradeView", null);
        setField(term2231949, term2231949.getClass(), "fleetTradeView", null);
        setField(term2231949, term2231949.getClass(), "mainMenu", null);
        setField(term2231949, term2231949.getClass(), "galaxyCreationView", null);
        setField(term2231949, term2231949.getClass(), "saveGameView", null);
        setField(term2231949, term2231949.getClass(), "helpView", null);
        setField(term2231949, term2231949.getClass(), "loadGameView", null);
        setField(term2231949, term2231949.getClass(), "aiTurnView", null);
        setField(term2231949, term2231949.getClass(), "creditsView", null);
        setField(term2231949, term2231949.getClass(), "endGameView", null);
        setField(term2231949, term2231949.getClass(), "starMapView", null);
        setField(term2231949, term2231949.getClass(), "combatView", null);
        setField(term2231949, term2231949.getClass(), "researchView", null);
        setField(term2231949, term2231949.getClass(), "diplomacyView", null);
        setField(term2231949, term2231949.getClass(), "shipView", null);
        setField(term2231949, term2231949.getClass(), "statView", null);
        setField(term2231949, term2231949.getClass(), "voteView", null);
        setField(term2231949, term2231949.getClass(), "shipDesignView", null);
        setField(term2231949, term2231949.getClass(), "galaxyConfig", null);
        setField(term2231949, term2231949.getClass(), "newsCorpView", null);
        setField(term2231949, term2231949.getClass(), "espionageView", null);
        setField(term2231949, term2231949.getClass(), "historyView", null);
        setField(term2231949, term2231949.getClass(), "optionsView", null);
        setField(term2231949, term2231949.getClass(), "realmView", null);
        setField(term2231949, term2231949.getClass(), "leaderView", null);
        setField(term2231949, term2231949.getClass(), "planetListView", null);
        setField(term2231949, term2231949.getClass(), "ambientLightsView", null);
        setField(term2231949, term2231949.getClass(), "votingSelectionView", null);
        setField(term2231949, term2231949.getClass(), "storyView", null);
        setField(term2231949, term2231949.getClass(), "endStoryView", null);
        setField(term2231949, term2231949.getClass(), "realmSetupView", null);
        setField(term2231949, term2231949.getClass(), "aiRealmSetupView", null);
        setField(term2231949, term2231949.getClass(), "governmentEditorView", null);
        setField(term2231949, term2231949.getClass(), "spaceRaceEditorView", null);
        setField(term2231949, term2231949.getClass(), "changeMessage", null);
        setField(term2231949, term2231949.getClass(), "gameFrame", null);
        setField(term2231949, term2231949.getClass(), "layeredPane", null);
        setField(term2231949, term2231949.getClass(), "configFile", null);
        setBooleanField(term2231949, term2231949.getClass(), "showMiniMapFlag", false);
        setField(term2231949, term2231949.getClass(), "saveFilename", null);
        setField(term2231949, term2231949.getClass(), "bridge", null);
        setBooleanField(term2231949, term2231949.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2231949, term2231949.getClass(), "fullscreenMode", false);
        setBooleanField(term2231949, term2231949.getClass(), "resolutionChanged", false);
        term2231954 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[2];
        args[0] = term2231954;
        args[1] = null;
        callMethod(klass, "createConflictingShipImage", argTypes, term2231949, args);
    }

};


