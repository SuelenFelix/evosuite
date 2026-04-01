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

public class Game_isImprovedParallax_1978876572229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305255;

    public Game_isImprovedParallax_1978876572229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305255 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305255, term2305255.getClass(), "animationTimer", null);
        setField(term2305255, term2305255.getClass(), "musicTimer", null);
        setField(term2305255, term2305255.getClass(), "starMap", null);
        setField(term2305255, term2305255.getClass(), "players", null);
        setField(term2305255, term2305255.getClass(), "gameState", null);
        setField(term2305255, term2305255.getClass(), "previousState", null);
        setField(term2305255, term2305255.getClass(), "planetView", null);
        setField(term2305255, term2305255.getClass(), "espionageMissionView", null);
        setField(term2305255, term2305255.getClass(), "planetBombingView", null);
        setField(term2305255, term2305255.getClass(), "fleetView", null);
        setField(term2305255, term2305255.getClass(), "shipUpgradeView", null);
        setField(term2305255, term2305255.getClass(), "fleetTradeView", null);
        setField(term2305255, term2305255.getClass(), "mainMenu", null);
        setField(term2305255, term2305255.getClass(), "galaxyCreationView", null);
        setField(term2305255, term2305255.getClass(), "saveGameView", null);
        setField(term2305255, term2305255.getClass(), "helpView", null);
        setField(term2305255, term2305255.getClass(), "loadGameView", null);
        setField(term2305255, term2305255.getClass(), "aiTurnView", null);
        setField(term2305255, term2305255.getClass(), "creditsView", null);
        setField(term2305255, term2305255.getClass(), "endGameView", null);
        setField(term2305255, term2305255.getClass(), "starMapView", null);
        setField(term2305255, term2305255.getClass(), "combatView", null);
        setField(term2305255, term2305255.getClass(), "researchView", null);
        setField(term2305255, term2305255.getClass(), "diplomacyView", null);
        setField(term2305255, term2305255.getClass(), "shipView", null);
        setField(term2305255, term2305255.getClass(), "statView", null);
        setField(term2305255, term2305255.getClass(), "voteView", null);
        setField(term2305255, term2305255.getClass(), "shipDesignView", null);
        setField(term2305255, term2305255.getClass(), "galaxyConfig", null);
        setField(term2305255, term2305255.getClass(), "newsCorpView", null);
        setField(term2305255, term2305255.getClass(), "espionageView", null);
        setField(term2305255, term2305255.getClass(), "historyView", null);
        setField(term2305255, term2305255.getClass(), "optionsView", null);
        setField(term2305255, term2305255.getClass(), "realmView", null);
        setField(term2305255, term2305255.getClass(), "leaderView", null);
        setField(term2305255, term2305255.getClass(), "planetListView", null);
        setField(term2305255, term2305255.getClass(), "ambientLightsView", null);
        setField(term2305255, term2305255.getClass(), "votingSelectionView", null);
        setField(term2305255, term2305255.getClass(), "storyView", null);
        setField(term2305255, term2305255.getClass(), "endStoryView", null);
        setField(term2305255, term2305255.getClass(), "realmSetupView", null);
        setField(term2305255, term2305255.getClass(), "aiRealmSetupView", null);
        setField(term2305255, term2305255.getClass(), "governmentEditorView", null);
        setField(term2305255, term2305255.getClass(), "spaceRaceEditorView", null);
        setField(term2305255, term2305255.getClass(), "changeMessage", null);
        setField(term2305255, term2305255.getClass(), "gameFrame", null);
        setField(term2305255, term2305255.getClass(), "layeredPane", null);
        setField(term2305255, term2305255.getClass(), "configFile", null);
        setBooleanField(term2305255, term2305255.getClass(), "showMiniMapFlag", false);
        setField(term2305255, term2305255.getClass(), "saveFilename", null);
        setField(term2305255, term2305255.getClass(), "bridge", null);
        setBooleanField(term2305255, term2305255.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305255, term2305255.getClass(), "fullscreenMode", false);
        setBooleanField(term2305255, term2305255.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isImprovedParallax", argTypes, term2305255, args);
    }

};


