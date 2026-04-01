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

public class Game_planetBombingView_1680526049192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305064;

    public Game_planetBombingView_1680526049192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305064 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305064, term2305064.getClass(), "animationTimer", null);
        setField(term2305064, term2305064.getClass(), "musicTimer", null);
        setField(term2305064, term2305064.getClass(), "starMap", null);
        setField(term2305064, term2305064.getClass(), "players", null);
        setField(term2305064, term2305064.getClass(), "gameState", null);
        setField(term2305064, term2305064.getClass(), "previousState", null);
        setField(term2305064, term2305064.getClass(), "planetView", null);
        setField(term2305064, term2305064.getClass(), "espionageMissionView", null);
        setField(term2305064, term2305064.getClass(), "planetBombingView", null);
        setField(term2305064, term2305064.getClass(), "fleetView", null);
        setField(term2305064, term2305064.getClass(), "shipUpgradeView", null);
        setField(term2305064, term2305064.getClass(), "fleetTradeView", null);
        setField(term2305064, term2305064.getClass(), "mainMenu", null);
        setField(term2305064, term2305064.getClass(), "galaxyCreationView", null);
        setField(term2305064, term2305064.getClass(), "saveGameView", null);
        setField(term2305064, term2305064.getClass(), "helpView", null);
        setField(term2305064, term2305064.getClass(), "loadGameView", null);
        setField(term2305064, term2305064.getClass(), "aiTurnView", null);
        setField(term2305064, term2305064.getClass(), "creditsView", null);
        setField(term2305064, term2305064.getClass(), "endGameView", null);
        setField(term2305064, term2305064.getClass(), "starMapView", null);
        setField(term2305064, term2305064.getClass(), "combatView", null);
        setField(term2305064, term2305064.getClass(), "researchView", null);
        setField(term2305064, term2305064.getClass(), "diplomacyView", null);
        setField(term2305064, term2305064.getClass(), "shipView", null);
        setField(term2305064, term2305064.getClass(), "statView", null);
        setField(term2305064, term2305064.getClass(), "voteView", null);
        setField(term2305064, term2305064.getClass(), "shipDesignView", null);
        setField(term2305064, term2305064.getClass(), "galaxyConfig", null);
        setField(term2305064, term2305064.getClass(), "newsCorpView", null);
        setField(term2305064, term2305064.getClass(), "espionageView", null);
        setField(term2305064, term2305064.getClass(), "historyView", null);
        setField(term2305064, term2305064.getClass(), "optionsView", null);
        setField(term2305064, term2305064.getClass(), "realmView", null);
        setField(term2305064, term2305064.getClass(), "leaderView", null);
        setField(term2305064, term2305064.getClass(), "planetListView", null);
        setField(term2305064, term2305064.getClass(), "ambientLightsView", null);
        setField(term2305064, term2305064.getClass(), "votingSelectionView", null);
        setField(term2305064, term2305064.getClass(), "storyView", null);
        setField(term2305064, term2305064.getClass(), "endStoryView", null);
        setField(term2305064, term2305064.getClass(), "realmSetupView", null);
        setField(term2305064, term2305064.getClass(), "aiRealmSetupView", null);
        setField(term2305064, term2305064.getClass(), "governmentEditorView", null);
        setField(term2305064, term2305064.getClass(), "spaceRaceEditorView", null);
        setField(term2305064, term2305064.getClass(), "changeMessage", null);
        setField(term2305064, term2305064.getClass(), "gameFrame", null);
        setField(term2305064, term2305064.getClass(), "layeredPane", null);
        setField(term2305064, term2305064.getClass(), "configFile", null);
        setBooleanField(term2305064, term2305064.getClass(), "showMiniMapFlag", false);
        setField(term2305064, term2305064.getClass(), "saveFilename", null);
        setField(term2305064, term2305064.getClass(), "bridge", null);
        setBooleanField(term2305064, term2305064.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305064, term2305064.getClass(), "fullscreenMode", false);
        setBooleanField(term2305064, term2305064.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "planetBombingView", argTypes, term2305064, args);
    }

};


