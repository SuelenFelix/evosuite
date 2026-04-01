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

public class Game_showFleetUpgradeView_165349805155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304877;

    public Game_showFleetUpgradeView_165349805155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304877 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304877, term2304877.getClass(), "animationTimer", null);
        setField(term2304877, term2304877.getClass(), "musicTimer", null);
        setField(term2304877, term2304877.getClass(), "starMap", null);
        setField(term2304877, term2304877.getClass(), "players", null);
        setField(term2304877, term2304877.getClass(), "gameState", null);
        setField(term2304877, term2304877.getClass(), "previousState", null);
        setField(term2304877, term2304877.getClass(), "planetView", null);
        setField(term2304877, term2304877.getClass(), "espionageMissionView", null);
        setField(term2304877, term2304877.getClass(), "planetBombingView", null);
        setField(term2304877, term2304877.getClass(), "fleetView", null);
        setField(term2304877, term2304877.getClass(), "shipUpgradeView", null);
        setField(term2304877, term2304877.getClass(), "fleetTradeView", null);
        setField(term2304877, term2304877.getClass(), "mainMenu", null);
        setField(term2304877, term2304877.getClass(), "galaxyCreationView", null);
        setField(term2304877, term2304877.getClass(), "saveGameView", null);
        setField(term2304877, term2304877.getClass(), "helpView", null);
        setField(term2304877, term2304877.getClass(), "loadGameView", null);
        setField(term2304877, term2304877.getClass(), "aiTurnView", null);
        setField(term2304877, term2304877.getClass(), "creditsView", null);
        setField(term2304877, term2304877.getClass(), "endGameView", null);
        setField(term2304877, term2304877.getClass(), "starMapView", null);
        setField(term2304877, term2304877.getClass(), "combatView", null);
        setField(term2304877, term2304877.getClass(), "researchView", null);
        setField(term2304877, term2304877.getClass(), "diplomacyView", null);
        setField(term2304877, term2304877.getClass(), "shipView", null);
        setField(term2304877, term2304877.getClass(), "statView", null);
        setField(term2304877, term2304877.getClass(), "voteView", null);
        setField(term2304877, term2304877.getClass(), "shipDesignView", null);
        setField(term2304877, term2304877.getClass(), "galaxyConfig", null);
        setField(term2304877, term2304877.getClass(), "newsCorpView", null);
        setField(term2304877, term2304877.getClass(), "espionageView", null);
        setField(term2304877, term2304877.getClass(), "historyView", null);
        setField(term2304877, term2304877.getClass(), "optionsView", null);
        setField(term2304877, term2304877.getClass(), "realmView", null);
        setField(term2304877, term2304877.getClass(), "leaderView", null);
        setField(term2304877, term2304877.getClass(), "planetListView", null);
        setField(term2304877, term2304877.getClass(), "ambientLightsView", null);
        setField(term2304877, term2304877.getClass(), "votingSelectionView", null);
        setField(term2304877, term2304877.getClass(), "storyView", null);
        setField(term2304877, term2304877.getClass(), "endStoryView", null);
        setField(term2304877, term2304877.getClass(), "realmSetupView", null);
        setField(term2304877, term2304877.getClass(), "aiRealmSetupView", null);
        setField(term2304877, term2304877.getClass(), "governmentEditorView", null);
        setField(term2304877, term2304877.getClass(), "spaceRaceEditorView", null);
        setField(term2304877, term2304877.getClass(), "changeMessage", null);
        setField(term2304877, term2304877.getClass(), "gameFrame", null);
        setField(term2304877, term2304877.getClass(), "layeredPane", null);
        setField(term2304877, term2304877.getClass(), "configFile", null);
        setBooleanField(term2304877, term2304877.getClass(), "showMiniMapFlag", false);
        setField(term2304877, term2304877.getClass(), "saveFilename", null);
        setField(term2304877, term2304877.getClass(), "bridge", null);
        setBooleanField(term2304877, term2304877.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304877, term2304877.getClass(), "fullscreenMode", false);
        setBooleanField(term2304877, term2304877.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showFleetUpgradeView", argTypes, term2304877, args);
    }

};


