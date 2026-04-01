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

public class Game_loadSavedGame_696680385177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304989;

    public Game_loadSavedGame_696680385177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304989 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304989, term2304989.getClass(), "animationTimer", null);
        setField(term2304989, term2304989.getClass(), "musicTimer", null);
        setField(term2304989, term2304989.getClass(), "starMap", null);
        setField(term2304989, term2304989.getClass(), "players", null);
        setField(term2304989, term2304989.getClass(), "gameState", null);
        setField(term2304989, term2304989.getClass(), "previousState", null);
        setField(term2304989, term2304989.getClass(), "planetView", null);
        setField(term2304989, term2304989.getClass(), "espionageMissionView", null);
        setField(term2304989, term2304989.getClass(), "planetBombingView", null);
        setField(term2304989, term2304989.getClass(), "fleetView", null);
        setField(term2304989, term2304989.getClass(), "shipUpgradeView", null);
        setField(term2304989, term2304989.getClass(), "fleetTradeView", null);
        setField(term2304989, term2304989.getClass(), "mainMenu", null);
        setField(term2304989, term2304989.getClass(), "galaxyCreationView", null);
        setField(term2304989, term2304989.getClass(), "saveGameView", null);
        setField(term2304989, term2304989.getClass(), "helpView", null);
        setField(term2304989, term2304989.getClass(), "loadGameView", null);
        setField(term2304989, term2304989.getClass(), "aiTurnView", null);
        setField(term2304989, term2304989.getClass(), "creditsView", null);
        setField(term2304989, term2304989.getClass(), "endGameView", null);
        setField(term2304989, term2304989.getClass(), "starMapView", null);
        setField(term2304989, term2304989.getClass(), "combatView", null);
        setField(term2304989, term2304989.getClass(), "researchView", null);
        setField(term2304989, term2304989.getClass(), "diplomacyView", null);
        setField(term2304989, term2304989.getClass(), "shipView", null);
        setField(term2304989, term2304989.getClass(), "statView", null);
        setField(term2304989, term2304989.getClass(), "voteView", null);
        setField(term2304989, term2304989.getClass(), "shipDesignView", null);
        setField(term2304989, term2304989.getClass(), "galaxyConfig", null);
        setField(term2304989, term2304989.getClass(), "newsCorpView", null);
        setField(term2304989, term2304989.getClass(), "espionageView", null);
        setField(term2304989, term2304989.getClass(), "historyView", null);
        setField(term2304989, term2304989.getClass(), "optionsView", null);
        setField(term2304989, term2304989.getClass(), "realmView", null);
        setField(term2304989, term2304989.getClass(), "leaderView", null);
        setField(term2304989, term2304989.getClass(), "planetListView", null);
        setField(term2304989, term2304989.getClass(), "ambientLightsView", null);
        setField(term2304989, term2304989.getClass(), "votingSelectionView", null);
        setField(term2304989, term2304989.getClass(), "storyView", null);
        setField(term2304989, term2304989.getClass(), "endStoryView", null);
        setField(term2304989, term2304989.getClass(), "realmSetupView", null);
        setField(term2304989, term2304989.getClass(), "aiRealmSetupView", null);
        setField(term2304989, term2304989.getClass(), "governmentEditorView", null);
        setField(term2304989, term2304989.getClass(), "spaceRaceEditorView", null);
        setField(term2304989, term2304989.getClass(), "changeMessage", null);
        setField(term2304989, term2304989.getClass(), "gameFrame", null);
        setField(term2304989, term2304989.getClass(), "layeredPane", null);
        setField(term2304989, term2304989.getClass(), "configFile", null);
        setBooleanField(term2304989, term2304989.getClass(), "showMiniMapFlag", false);
        setField(term2304989, term2304989.getClass(), "saveFilename", null);
        setField(term2304989, term2304989.getClass(), "bridge", null);
        setBooleanField(term2304989, term2304989.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304989, term2304989.getClass(), "fullscreenMode", false);
        setBooleanField(term2304989, term2304989.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadSavedGame", argTypes, term2304989, args);
    }

};


