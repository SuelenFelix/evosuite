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

public class Game_handleCommandStarmapNextTarget_1800934350215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305185;

    public Game_handleCommandStarmapNextTarget_1800934350215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305185 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305185, term2305185.getClass(), "animationTimer", null);
        setField(term2305185, term2305185.getClass(), "musicTimer", null);
        setField(term2305185, term2305185.getClass(), "starMap", null);
        setField(term2305185, term2305185.getClass(), "players", null);
        setField(term2305185, term2305185.getClass(), "gameState", null);
        setField(term2305185, term2305185.getClass(), "previousState", null);
        setField(term2305185, term2305185.getClass(), "planetView", null);
        setField(term2305185, term2305185.getClass(), "espionageMissionView", null);
        setField(term2305185, term2305185.getClass(), "planetBombingView", null);
        setField(term2305185, term2305185.getClass(), "fleetView", null);
        setField(term2305185, term2305185.getClass(), "shipUpgradeView", null);
        setField(term2305185, term2305185.getClass(), "fleetTradeView", null);
        setField(term2305185, term2305185.getClass(), "mainMenu", null);
        setField(term2305185, term2305185.getClass(), "galaxyCreationView", null);
        setField(term2305185, term2305185.getClass(), "saveGameView", null);
        setField(term2305185, term2305185.getClass(), "helpView", null);
        setField(term2305185, term2305185.getClass(), "loadGameView", null);
        setField(term2305185, term2305185.getClass(), "aiTurnView", null);
        setField(term2305185, term2305185.getClass(), "creditsView", null);
        setField(term2305185, term2305185.getClass(), "endGameView", null);
        setField(term2305185, term2305185.getClass(), "starMapView", null);
        setField(term2305185, term2305185.getClass(), "combatView", null);
        setField(term2305185, term2305185.getClass(), "researchView", null);
        setField(term2305185, term2305185.getClass(), "diplomacyView", null);
        setField(term2305185, term2305185.getClass(), "shipView", null);
        setField(term2305185, term2305185.getClass(), "statView", null);
        setField(term2305185, term2305185.getClass(), "voteView", null);
        setField(term2305185, term2305185.getClass(), "shipDesignView", null);
        setField(term2305185, term2305185.getClass(), "galaxyConfig", null);
        setField(term2305185, term2305185.getClass(), "newsCorpView", null);
        setField(term2305185, term2305185.getClass(), "espionageView", null);
        setField(term2305185, term2305185.getClass(), "historyView", null);
        setField(term2305185, term2305185.getClass(), "optionsView", null);
        setField(term2305185, term2305185.getClass(), "realmView", null);
        setField(term2305185, term2305185.getClass(), "leaderView", null);
        setField(term2305185, term2305185.getClass(), "planetListView", null);
        setField(term2305185, term2305185.getClass(), "ambientLightsView", null);
        setField(term2305185, term2305185.getClass(), "votingSelectionView", null);
        setField(term2305185, term2305185.getClass(), "storyView", null);
        setField(term2305185, term2305185.getClass(), "endStoryView", null);
        setField(term2305185, term2305185.getClass(), "realmSetupView", null);
        setField(term2305185, term2305185.getClass(), "aiRealmSetupView", null);
        setField(term2305185, term2305185.getClass(), "governmentEditorView", null);
        setField(term2305185, term2305185.getClass(), "spaceRaceEditorView", null);
        setField(term2305185, term2305185.getClass(), "changeMessage", null);
        setField(term2305185, term2305185.getClass(), "gameFrame", null);
        setField(term2305185, term2305185.getClass(), "layeredPane", null);
        setField(term2305185, term2305185.getClass(), "configFile", null);
        setBooleanField(term2305185, term2305185.getClass(), "showMiniMapFlag", false);
        setField(term2305185, term2305185.getClass(), "saveFilename", null);
        setField(term2305185, term2305185.getClass(), "bridge", null);
        setBooleanField(term2305185, term2305185.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305185, term2305185.getClass(), "fullscreenMode", false);
        setBooleanField(term2305185, term2305185.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleCommandStarmapNextTarget", argTypes, term2305185, args);
    }

};


