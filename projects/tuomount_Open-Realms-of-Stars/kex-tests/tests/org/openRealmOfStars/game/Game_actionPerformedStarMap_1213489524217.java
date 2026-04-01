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

public class Game_actionPerformedStarMap_1213489524217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305195;

    public Game_actionPerformedStarMap_1213489524217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305195 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305195, term2305195.getClass(), "animationTimer", null);
        setField(term2305195, term2305195.getClass(), "musicTimer", null);
        setField(term2305195, term2305195.getClass(), "starMap", null);
        setField(term2305195, term2305195.getClass(), "players", null);
        setField(term2305195, term2305195.getClass(), "gameState", null);
        setField(term2305195, term2305195.getClass(), "previousState", null);
        setField(term2305195, term2305195.getClass(), "planetView", null);
        setField(term2305195, term2305195.getClass(), "espionageMissionView", null);
        setField(term2305195, term2305195.getClass(), "planetBombingView", null);
        setField(term2305195, term2305195.getClass(), "fleetView", null);
        setField(term2305195, term2305195.getClass(), "shipUpgradeView", null);
        setField(term2305195, term2305195.getClass(), "fleetTradeView", null);
        setField(term2305195, term2305195.getClass(), "mainMenu", null);
        setField(term2305195, term2305195.getClass(), "galaxyCreationView", null);
        setField(term2305195, term2305195.getClass(), "saveGameView", null);
        setField(term2305195, term2305195.getClass(), "helpView", null);
        setField(term2305195, term2305195.getClass(), "loadGameView", null);
        setField(term2305195, term2305195.getClass(), "aiTurnView", null);
        setField(term2305195, term2305195.getClass(), "creditsView", null);
        setField(term2305195, term2305195.getClass(), "endGameView", null);
        setField(term2305195, term2305195.getClass(), "starMapView", null);
        setField(term2305195, term2305195.getClass(), "combatView", null);
        setField(term2305195, term2305195.getClass(), "researchView", null);
        setField(term2305195, term2305195.getClass(), "diplomacyView", null);
        setField(term2305195, term2305195.getClass(), "shipView", null);
        setField(term2305195, term2305195.getClass(), "statView", null);
        setField(term2305195, term2305195.getClass(), "voteView", null);
        setField(term2305195, term2305195.getClass(), "shipDesignView", null);
        setField(term2305195, term2305195.getClass(), "galaxyConfig", null);
        setField(term2305195, term2305195.getClass(), "newsCorpView", null);
        setField(term2305195, term2305195.getClass(), "espionageView", null);
        setField(term2305195, term2305195.getClass(), "historyView", null);
        setField(term2305195, term2305195.getClass(), "optionsView", null);
        setField(term2305195, term2305195.getClass(), "realmView", null);
        setField(term2305195, term2305195.getClass(), "leaderView", null);
        setField(term2305195, term2305195.getClass(), "planetListView", null);
        setField(term2305195, term2305195.getClass(), "ambientLightsView", null);
        setField(term2305195, term2305195.getClass(), "votingSelectionView", null);
        setField(term2305195, term2305195.getClass(), "storyView", null);
        setField(term2305195, term2305195.getClass(), "endStoryView", null);
        setField(term2305195, term2305195.getClass(), "realmSetupView", null);
        setField(term2305195, term2305195.getClass(), "aiRealmSetupView", null);
        setField(term2305195, term2305195.getClass(), "governmentEditorView", null);
        setField(term2305195, term2305195.getClass(), "spaceRaceEditorView", null);
        setField(term2305195, term2305195.getClass(), "changeMessage", null);
        setField(term2305195, term2305195.getClass(), "gameFrame", null);
        setField(term2305195, term2305195.getClass(), "layeredPane", null);
        setField(term2305195, term2305195.getClass(), "configFile", null);
        setBooleanField(term2305195, term2305195.getClass(), "showMiniMapFlag", false);
        setField(term2305195, term2305195.getClass(), "saveFilename", null);
        setField(term2305195, term2305195.getClass(), "bridge", null);
        setBooleanField(term2305195, term2305195.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305195, term2305195.getClass(), "fullscreenMode", false);
        setBooleanField(term2305195, term2305195.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformedStarMap", argTypes, term2305195, args);
    }

};


