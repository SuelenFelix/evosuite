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

public class Game_getGameState_1044874489222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305220;

    public Game_getGameState_1044874489222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305220 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305220, term2305220.getClass(), "animationTimer", null);
        setField(term2305220, term2305220.getClass(), "musicTimer", null);
        setField(term2305220, term2305220.getClass(), "starMap", null);
        setField(term2305220, term2305220.getClass(), "players", null);
        setField(term2305220, term2305220.getClass(), "gameState", null);
        setField(term2305220, term2305220.getClass(), "previousState", null);
        setField(term2305220, term2305220.getClass(), "planetView", null);
        setField(term2305220, term2305220.getClass(), "espionageMissionView", null);
        setField(term2305220, term2305220.getClass(), "planetBombingView", null);
        setField(term2305220, term2305220.getClass(), "fleetView", null);
        setField(term2305220, term2305220.getClass(), "shipUpgradeView", null);
        setField(term2305220, term2305220.getClass(), "fleetTradeView", null);
        setField(term2305220, term2305220.getClass(), "mainMenu", null);
        setField(term2305220, term2305220.getClass(), "galaxyCreationView", null);
        setField(term2305220, term2305220.getClass(), "saveGameView", null);
        setField(term2305220, term2305220.getClass(), "helpView", null);
        setField(term2305220, term2305220.getClass(), "loadGameView", null);
        setField(term2305220, term2305220.getClass(), "aiTurnView", null);
        setField(term2305220, term2305220.getClass(), "creditsView", null);
        setField(term2305220, term2305220.getClass(), "endGameView", null);
        setField(term2305220, term2305220.getClass(), "starMapView", null);
        setField(term2305220, term2305220.getClass(), "combatView", null);
        setField(term2305220, term2305220.getClass(), "researchView", null);
        setField(term2305220, term2305220.getClass(), "diplomacyView", null);
        setField(term2305220, term2305220.getClass(), "shipView", null);
        setField(term2305220, term2305220.getClass(), "statView", null);
        setField(term2305220, term2305220.getClass(), "voteView", null);
        setField(term2305220, term2305220.getClass(), "shipDesignView", null);
        setField(term2305220, term2305220.getClass(), "galaxyConfig", null);
        setField(term2305220, term2305220.getClass(), "newsCorpView", null);
        setField(term2305220, term2305220.getClass(), "espionageView", null);
        setField(term2305220, term2305220.getClass(), "historyView", null);
        setField(term2305220, term2305220.getClass(), "optionsView", null);
        setField(term2305220, term2305220.getClass(), "realmView", null);
        setField(term2305220, term2305220.getClass(), "leaderView", null);
        setField(term2305220, term2305220.getClass(), "planetListView", null);
        setField(term2305220, term2305220.getClass(), "ambientLightsView", null);
        setField(term2305220, term2305220.getClass(), "votingSelectionView", null);
        setField(term2305220, term2305220.getClass(), "storyView", null);
        setField(term2305220, term2305220.getClass(), "endStoryView", null);
        setField(term2305220, term2305220.getClass(), "realmSetupView", null);
        setField(term2305220, term2305220.getClass(), "aiRealmSetupView", null);
        setField(term2305220, term2305220.getClass(), "governmentEditorView", null);
        setField(term2305220, term2305220.getClass(), "spaceRaceEditorView", null);
        setField(term2305220, term2305220.getClass(), "changeMessage", null);
        setField(term2305220, term2305220.getClass(), "gameFrame", null);
        setField(term2305220, term2305220.getClass(), "layeredPane", null);
        setField(term2305220, term2305220.getClass(), "configFile", null);
        setBooleanField(term2305220, term2305220.getClass(), "showMiniMapFlag", false);
        setField(term2305220, term2305220.getClass(), "saveFilename", null);
        setField(term2305220, term2305220.getClass(), "bridge", null);
        setBooleanField(term2305220, term2305220.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305220, term2305220.getClass(), "fullscreenMode", false);
        setBooleanField(term2305220, term2305220.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameState", argTypes, term2305220, args);
    }

};


