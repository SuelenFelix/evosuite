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

public class Game_setAITurnView_1184639637227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305245;

    public Game_setAITurnView_1184639637227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305245 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305245, term2305245.getClass(), "animationTimer", null);
        setField(term2305245, term2305245.getClass(), "musicTimer", null);
        setField(term2305245, term2305245.getClass(), "starMap", null);
        setField(term2305245, term2305245.getClass(), "players", null);
        setField(term2305245, term2305245.getClass(), "gameState", null);
        setField(term2305245, term2305245.getClass(), "previousState", null);
        setField(term2305245, term2305245.getClass(), "planetView", null);
        setField(term2305245, term2305245.getClass(), "espionageMissionView", null);
        setField(term2305245, term2305245.getClass(), "planetBombingView", null);
        setField(term2305245, term2305245.getClass(), "fleetView", null);
        setField(term2305245, term2305245.getClass(), "shipUpgradeView", null);
        setField(term2305245, term2305245.getClass(), "fleetTradeView", null);
        setField(term2305245, term2305245.getClass(), "mainMenu", null);
        setField(term2305245, term2305245.getClass(), "galaxyCreationView", null);
        setField(term2305245, term2305245.getClass(), "saveGameView", null);
        setField(term2305245, term2305245.getClass(), "helpView", null);
        setField(term2305245, term2305245.getClass(), "loadGameView", null);
        setField(term2305245, term2305245.getClass(), "aiTurnView", null);
        setField(term2305245, term2305245.getClass(), "creditsView", null);
        setField(term2305245, term2305245.getClass(), "endGameView", null);
        setField(term2305245, term2305245.getClass(), "starMapView", null);
        setField(term2305245, term2305245.getClass(), "combatView", null);
        setField(term2305245, term2305245.getClass(), "researchView", null);
        setField(term2305245, term2305245.getClass(), "diplomacyView", null);
        setField(term2305245, term2305245.getClass(), "shipView", null);
        setField(term2305245, term2305245.getClass(), "statView", null);
        setField(term2305245, term2305245.getClass(), "voteView", null);
        setField(term2305245, term2305245.getClass(), "shipDesignView", null);
        setField(term2305245, term2305245.getClass(), "galaxyConfig", null);
        setField(term2305245, term2305245.getClass(), "newsCorpView", null);
        setField(term2305245, term2305245.getClass(), "espionageView", null);
        setField(term2305245, term2305245.getClass(), "historyView", null);
        setField(term2305245, term2305245.getClass(), "optionsView", null);
        setField(term2305245, term2305245.getClass(), "realmView", null);
        setField(term2305245, term2305245.getClass(), "leaderView", null);
        setField(term2305245, term2305245.getClass(), "planetListView", null);
        setField(term2305245, term2305245.getClass(), "ambientLightsView", null);
        setField(term2305245, term2305245.getClass(), "votingSelectionView", null);
        setField(term2305245, term2305245.getClass(), "storyView", null);
        setField(term2305245, term2305245.getClass(), "endStoryView", null);
        setField(term2305245, term2305245.getClass(), "realmSetupView", null);
        setField(term2305245, term2305245.getClass(), "aiRealmSetupView", null);
        setField(term2305245, term2305245.getClass(), "governmentEditorView", null);
        setField(term2305245, term2305245.getClass(), "spaceRaceEditorView", null);
        setField(term2305245, term2305245.getClass(), "changeMessage", null);
        setField(term2305245, term2305245.getClass(), "gameFrame", null);
        setField(term2305245, term2305245.getClass(), "layeredPane", null);
        setField(term2305245, term2305245.getClass(), "configFile", null);
        setBooleanField(term2305245, term2305245.getClass(), "showMiniMapFlag", false);
        setField(term2305245, term2305245.getClass(), "saveFilename", null);
        setField(term2305245, term2305245.getClass(), "bridge", null);
        setBooleanField(term2305245, term2305245.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305245, term2305245.getClass(), "fullscreenMode", false);
        setBooleanField(term2305245, term2305245.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAITurnView", argTypes, term2305245, args);
    }

};


