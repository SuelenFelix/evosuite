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

public class Game_paint_217474234150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304852;

    public Game_paint_217474234150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304852 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304852, term2304852.getClass(), "animationTimer", null);
        setField(term2304852, term2304852.getClass(), "musicTimer", null);
        setField(term2304852, term2304852.getClass(), "starMap", null);
        setField(term2304852, term2304852.getClass(), "players", null);
        setField(term2304852, term2304852.getClass(), "gameState", null);
        setField(term2304852, term2304852.getClass(), "previousState", null);
        setField(term2304852, term2304852.getClass(), "planetView", null);
        setField(term2304852, term2304852.getClass(), "espionageMissionView", null);
        setField(term2304852, term2304852.getClass(), "planetBombingView", null);
        setField(term2304852, term2304852.getClass(), "fleetView", null);
        setField(term2304852, term2304852.getClass(), "shipUpgradeView", null);
        setField(term2304852, term2304852.getClass(), "fleetTradeView", null);
        setField(term2304852, term2304852.getClass(), "mainMenu", null);
        setField(term2304852, term2304852.getClass(), "galaxyCreationView", null);
        setField(term2304852, term2304852.getClass(), "saveGameView", null);
        setField(term2304852, term2304852.getClass(), "helpView", null);
        setField(term2304852, term2304852.getClass(), "loadGameView", null);
        setField(term2304852, term2304852.getClass(), "aiTurnView", null);
        setField(term2304852, term2304852.getClass(), "creditsView", null);
        setField(term2304852, term2304852.getClass(), "endGameView", null);
        setField(term2304852, term2304852.getClass(), "starMapView", null);
        setField(term2304852, term2304852.getClass(), "combatView", null);
        setField(term2304852, term2304852.getClass(), "researchView", null);
        setField(term2304852, term2304852.getClass(), "diplomacyView", null);
        setField(term2304852, term2304852.getClass(), "shipView", null);
        setField(term2304852, term2304852.getClass(), "statView", null);
        setField(term2304852, term2304852.getClass(), "voteView", null);
        setField(term2304852, term2304852.getClass(), "shipDesignView", null);
        setField(term2304852, term2304852.getClass(), "galaxyConfig", null);
        setField(term2304852, term2304852.getClass(), "newsCorpView", null);
        setField(term2304852, term2304852.getClass(), "espionageView", null);
        setField(term2304852, term2304852.getClass(), "historyView", null);
        setField(term2304852, term2304852.getClass(), "optionsView", null);
        setField(term2304852, term2304852.getClass(), "realmView", null);
        setField(term2304852, term2304852.getClass(), "leaderView", null);
        setField(term2304852, term2304852.getClass(), "planetListView", null);
        setField(term2304852, term2304852.getClass(), "ambientLightsView", null);
        setField(term2304852, term2304852.getClass(), "votingSelectionView", null);
        setField(term2304852, term2304852.getClass(), "storyView", null);
        setField(term2304852, term2304852.getClass(), "endStoryView", null);
        setField(term2304852, term2304852.getClass(), "realmSetupView", null);
        setField(term2304852, term2304852.getClass(), "aiRealmSetupView", null);
        setField(term2304852, term2304852.getClass(), "governmentEditorView", null);
        setField(term2304852, term2304852.getClass(), "spaceRaceEditorView", null);
        setField(term2304852, term2304852.getClass(), "changeMessage", null);
        setField(term2304852, term2304852.getClass(), "gameFrame", null);
        setField(term2304852, term2304852.getClass(), "layeredPane", null);
        setField(term2304852, term2304852.getClass(), "configFile", null);
        setBooleanField(term2304852, term2304852.getClass(), "showMiniMapFlag", false);
        setField(term2304852, term2304852.getClass(), "saveFilename", null);
        setField(term2304852, term2304852.getClass(), "bridge", null);
        setBooleanField(term2304852, term2304852.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304852, term2304852.getClass(), "fullscreenMode", false);
        setBooleanField(term2304852, term2304852.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paint", argTypes, term2304852, args);
    }

};


