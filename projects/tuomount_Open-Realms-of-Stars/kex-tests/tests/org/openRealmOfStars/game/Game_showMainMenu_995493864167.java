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

public class Game_showMainMenu_995493864167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304937;

    public Game_showMainMenu_995493864167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304937 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304937, term2304937.getClass(), "animationTimer", null);
        setField(term2304937, term2304937.getClass(), "musicTimer", null);
        setField(term2304937, term2304937.getClass(), "starMap", null);
        setField(term2304937, term2304937.getClass(), "players", null);
        setField(term2304937, term2304937.getClass(), "gameState", null);
        setField(term2304937, term2304937.getClass(), "previousState", null);
        setField(term2304937, term2304937.getClass(), "planetView", null);
        setField(term2304937, term2304937.getClass(), "espionageMissionView", null);
        setField(term2304937, term2304937.getClass(), "planetBombingView", null);
        setField(term2304937, term2304937.getClass(), "fleetView", null);
        setField(term2304937, term2304937.getClass(), "shipUpgradeView", null);
        setField(term2304937, term2304937.getClass(), "fleetTradeView", null);
        setField(term2304937, term2304937.getClass(), "mainMenu", null);
        setField(term2304937, term2304937.getClass(), "galaxyCreationView", null);
        setField(term2304937, term2304937.getClass(), "saveGameView", null);
        setField(term2304937, term2304937.getClass(), "helpView", null);
        setField(term2304937, term2304937.getClass(), "loadGameView", null);
        setField(term2304937, term2304937.getClass(), "aiTurnView", null);
        setField(term2304937, term2304937.getClass(), "creditsView", null);
        setField(term2304937, term2304937.getClass(), "endGameView", null);
        setField(term2304937, term2304937.getClass(), "starMapView", null);
        setField(term2304937, term2304937.getClass(), "combatView", null);
        setField(term2304937, term2304937.getClass(), "researchView", null);
        setField(term2304937, term2304937.getClass(), "diplomacyView", null);
        setField(term2304937, term2304937.getClass(), "shipView", null);
        setField(term2304937, term2304937.getClass(), "statView", null);
        setField(term2304937, term2304937.getClass(), "voteView", null);
        setField(term2304937, term2304937.getClass(), "shipDesignView", null);
        setField(term2304937, term2304937.getClass(), "galaxyConfig", null);
        setField(term2304937, term2304937.getClass(), "newsCorpView", null);
        setField(term2304937, term2304937.getClass(), "espionageView", null);
        setField(term2304937, term2304937.getClass(), "historyView", null);
        setField(term2304937, term2304937.getClass(), "optionsView", null);
        setField(term2304937, term2304937.getClass(), "realmView", null);
        setField(term2304937, term2304937.getClass(), "leaderView", null);
        setField(term2304937, term2304937.getClass(), "planetListView", null);
        setField(term2304937, term2304937.getClass(), "ambientLightsView", null);
        setField(term2304937, term2304937.getClass(), "votingSelectionView", null);
        setField(term2304937, term2304937.getClass(), "storyView", null);
        setField(term2304937, term2304937.getClass(), "endStoryView", null);
        setField(term2304937, term2304937.getClass(), "realmSetupView", null);
        setField(term2304937, term2304937.getClass(), "aiRealmSetupView", null);
        setField(term2304937, term2304937.getClass(), "governmentEditorView", null);
        setField(term2304937, term2304937.getClass(), "spaceRaceEditorView", null);
        setField(term2304937, term2304937.getClass(), "changeMessage", null);
        setField(term2304937, term2304937.getClass(), "gameFrame", null);
        setField(term2304937, term2304937.getClass(), "layeredPane", null);
        setField(term2304937, term2304937.getClass(), "configFile", null);
        setBooleanField(term2304937, term2304937.getClass(), "showMiniMapFlag", false);
        setField(term2304937, term2304937.getClass(), "saveFilename", null);
        setField(term2304937, term2304937.getClass(), "bridge", null);
        setBooleanField(term2304937, term2304937.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304937, term2304937.getClass(), "fullscreenMode", false);
        setBooleanField(term2304937, term2304937.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showMainMenu", argTypes, term2304937, args);
    }

};


