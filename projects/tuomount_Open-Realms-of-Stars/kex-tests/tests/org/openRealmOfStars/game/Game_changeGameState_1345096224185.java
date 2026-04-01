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

public class Game_changeGameState_1345096224185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305029;

    public Game_changeGameState_1345096224185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305029 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305029, term2305029.getClass(), "animationTimer", null);
        setField(term2305029, term2305029.getClass(), "musicTimer", null);
        setField(term2305029, term2305029.getClass(), "starMap", null);
        setField(term2305029, term2305029.getClass(), "players", null);
        setField(term2305029, term2305029.getClass(), "gameState", null);
        setField(term2305029, term2305029.getClass(), "previousState", null);
        setField(term2305029, term2305029.getClass(), "planetView", null);
        setField(term2305029, term2305029.getClass(), "espionageMissionView", null);
        setField(term2305029, term2305029.getClass(), "planetBombingView", null);
        setField(term2305029, term2305029.getClass(), "fleetView", null);
        setField(term2305029, term2305029.getClass(), "shipUpgradeView", null);
        setField(term2305029, term2305029.getClass(), "fleetTradeView", null);
        setField(term2305029, term2305029.getClass(), "mainMenu", null);
        setField(term2305029, term2305029.getClass(), "galaxyCreationView", null);
        setField(term2305029, term2305029.getClass(), "saveGameView", null);
        setField(term2305029, term2305029.getClass(), "helpView", null);
        setField(term2305029, term2305029.getClass(), "loadGameView", null);
        setField(term2305029, term2305029.getClass(), "aiTurnView", null);
        setField(term2305029, term2305029.getClass(), "creditsView", null);
        setField(term2305029, term2305029.getClass(), "endGameView", null);
        setField(term2305029, term2305029.getClass(), "starMapView", null);
        setField(term2305029, term2305029.getClass(), "combatView", null);
        setField(term2305029, term2305029.getClass(), "researchView", null);
        setField(term2305029, term2305029.getClass(), "diplomacyView", null);
        setField(term2305029, term2305029.getClass(), "shipView", null);
        setField(term2305029, term2305029.getClass(), "statView", null);
        setField(term2305029, term2305029.getClass(), "voteView", null);
        setField(term2305029, term2305029.getClass(), "shipDesignView", null);
        setField(term2305029, term2305029.getClass(), "galaxyConfig", null);
        setField(term2305029, term2305029.getClass(), "newsCorpView", null);
        setField(term2305029, term2305029.getClass(), "espionageView", null);
        setField(term2305029, term2305029.getClass(), "historyView", null);
        setField(term2305029, term2305029.getClass(), "optionsView", null);
        setField(term2305029, term2305029.getClass(), "realmView", null);
        setField(term2305029, term2305029.getClass(), "leaderView", null);
        setField(term2305029, term2305029.getClass(), "planetListView", null);
        setField(term2305029, term2305029.getClass(), "ambientLightsView", null);
        setField(term2305029, term2305029.getClass(), "votingSelectionView", null);
        setField(term2305029, term2305029.getClass(), "storyView", null);
        setField(term2305029, term2305029.getClass(), "endStoryView", null);
        setField(term2305029, term2305029.getClass(), "realmSetupView", null);
        setField(term2305029, term2305029.getClass(), "aiRealmSetupView", null);
        setField(term2305029, term2305029.getClass(), "governmentEditorView", null);
        setField(term2305029, term2305029.getClass(), "spaceRaceEditorView", null);
        setField(term2305029, term2305029.getClass(), "changeMessage", null);
        setField(term2305029, term2305029.getClass(), "gameFrame", null);
        setField(term2305029, term2305029.getClass(), "layeredPane", null);
        setField(term2305029, term2305029.getClass(), "configFile", null);
        setBooleanField(term2305029, term2305029.getClass(), "showMiniMapFlag", false);
        setField(term2305029, term2305029.getClass(), "saveFilename", null);
        setField(term2305029, term2305029.getClass(), "bridge", null);
        setBooleanField(term2305029, term2305029.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305029, term2305029.getClass(), "fullscreenMode", false);
        setBooleanField(term2305029, term2305029.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.GameState");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "changeGameState", argTypes, term2305029, args);
    }

};


