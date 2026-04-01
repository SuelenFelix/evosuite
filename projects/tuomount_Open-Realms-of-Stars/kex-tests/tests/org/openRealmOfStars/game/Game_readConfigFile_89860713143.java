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

public class Game_readConfigFile_89860713143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304815;

    public Game_readConfigFile_89860713143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304815 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304815, term2304815.getClass(), "animationTimer", null);
        setField(term2304815, term2304815.getClass(), "musicTimer", null);
        setField(term2304815, term2304815.getClass(), "starMap", null);
        setField(term2304815, term2304815.getClass(), "players", null);
        setField(term2304815, term2304815.getClass(), "gameState", null);
        setField(term2304815, term2304815.getClass(), "previousState", null);
        setField(term2304815, term2304815.getClass(), "planetView", null);
        setField(term2304815, term2304815.getClass(), "espionageMissionView", null);
        setField(term2304815, term2304815.getClass(), "planetBombingView", null);
        setField(term2304815, term2304815.getClass(), "fleetView", null);
        setField(term2304815, term2304815.getClass(), "shipUpgradeView", null);
        setField(term2304815, term2304815.getClass(), "fleetTradeView", null);
        setField(term2304815, term2304815.getClass(), "mainMenu", null);
        setField(term2304815, term2304815.getClass(), "galaxyCreationView", null);
        setField(term2304815, term2304815.getClass(), "saveGameView", null);
        setField(term2304815, term2304815.getClass(), "helpView", null);
        setField(term2304815, term2304815.getClass(), "loadGameView", null);
        setField(term2304815, term2304815.getClass(), "aiTurnView", null);
        setField(term2304815, term2304815.getClass(), "creditsView", null);
        setField(term2304815, term2304815.getClass(), "endGameView", null);
        setField(term2304815, term2304815.getClass(), "starMapView", null);
        setField(term2304815, term2304815.getClass(), "combatView", null);
        setField(term2304815, term2304815.getClass(), "researchView", null);
        setField(term2304815, term2304815.getClass(), "diplomacyView", null);
        setField(term2304815, term2304815.getClass(), "shipView", null);
        setField(term2304815, term2304815.getClass(), "statView", null);
        setField(term2304815, term2304815.getClass(), "voteView", null);
        setField(term2304815, term2304815.getClass(), "shipDesignView", null);
        setField(term2304815, term2304815.getClass(), "galaxyConfig", null);
        setField(term2304815, term2304815.getClass(), "newsCorpView", null);
        setField(term2304815, term2304815.getClass(), "espionageView", null);
        setField(term2304815, term2304815.getClass(), "historyView", null);
        setField(term2304815, term2304815.getClass(), "optionsView", null);
        setField(term2304815, term2304815.getClass(), "realmView", null);
        setField(term2304815, term2304815.getClass(), "leaderView", null);
        setField(term2304815, term2304815.getClass(), "planetListView", null);
        setField(term2304815, term2304815.getClass(), "ambientLightsView", null);
        setField(term2304815, term2304815.getClass(), "votingSelectionView", null);
        setField(term2304815, term2304815.getClass(), "storyView", null);
        setField(term2304815, term2304815.getClass(), "endStoryView", null);
        setField(term2304815, term2304815.getClass(), "realmSetupView", null);
        setField(term2304815, term2304815.getClass(), "aiRealmSetupView", null);
        setField(term2304815, term2304815.getClass(), "governmentEditorView", null);
        setField(term2304815, term2304815.getClass(), "spaceRaceEditorView", null);
        setField(term2304815, term2304815.getClass(), "changeMessage", null);
        setField(term2304815, term2304815.getClass(), "gameFrame", null);
        setField(term2304815, term2304815.getClass(), "layeredPane", null);
        setField(term2304815, term2304815.getClass(), "configFile", null);
        setBooleanField(term2304815, term2304815.getClass(), "showMiniMapFlag", false);
        setField(term2304815, term2304815.getClass(), "saveFilename", null);
        setField(term2304815, term2304815.getClass(), "bridge", null);
        setBooleanField(term2304815, term2304815.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304815, term2304815.getClass(), "fullscreenMode", false);
        setBooleanField(term2304815, term2304815.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readConfigFile", argTypes, term2304815, args);
    }

};


