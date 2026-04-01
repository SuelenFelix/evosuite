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

public class Game_showStatView_1922907079164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304922;

    public Game_showStatView_1922907079164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304922 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304922, term2304922.getClass(), "animationTimer", null);
        setField(term2304922, term2304922.getClass(), "musicTimer", null);
        setField(term2304922, term2304922.getClass(), "starMap", null);
        setField(term2304922, term2304922.getClass(), "players", null);
        setField(term2304922, term2304922.getClass(), "gameState", null);
        setField(term2304922, term2304922.getClass(), "previousState", null);
        setField(term2304922, term2304922.getClass(), "planetView", null);
        setField(term2304922, term2304922.getClass(), "espionageMissionView", null);
        setField(term2304922, term2304922.getClass(), "planetBombingView", null);
        setField(term2304922, term2304922.getClass(), "fleetView", null);
        setField(term2304922, term2304922.getClass(), "shipUpgradeView", null);
        setField(term2304922, term2304922.getClass(), "fleetTradeView", null);
        setField(term2304922, term2304922.getClass(), "mainMenu", null);
        setField(term2304922, term2304922.getClass(), "galaxyCreationView", null);
        setField(term2304922, term2304922.getClass(), "saveGameView", null);
        setField(term2304922, term2304922.getClass(), "helpView", null);
        setField(term2304922, term2304922.getClass(), "loadGameView", null);
        setField(term2304922, term2304922.getClass(), "aiTurnView", null);
        setField(term2304922, term2304922.getClass(), "creditsView", null);
        setField(term2304922, term2304922.getClass(), "endGameView", null);
        setField(term2304922, term2304922.getClass(), "starMapView", null);
        setField(term2304922, term2304922.getClass(), "combatView", null);
        setField(term2304922, term2304922.getClass(), "researchView", null);
        setField(term2304922, term2304922.getClass(), "diplomacyView", null);
        setField(term2304922, term2304922.getClass(), "shipView", null);
        setField(term2304922, term2304922.getClass(), "statView", null);
        setField(term2304922, term2304922.getClass(), "voteView", null);
        setField(term2304922, term2304922.getClass(), "shipDesignView", null);
        setField(term2304922, term2304922.getClass(), "galaxyConfig", null);
        setField(term2304922, term2304922.getClass(), "newsCorpView", null);
        setField(term2304922, term2304922.getClass(), "espionageView", null);
        setField(term2304922, term2304922.getClass(), "historyView", null);
        setField(term2304922, term2304922.getClass(), "optionsView", null);
        setField(term2304922, term2304922.getClass(), "realmView", null);
        setField(term2304922, term2304922.getClass(), "leaderView", null);
        setField(term2304922, term2304922.getClass(), "planetListView", null);
        setField(term2304922, term2304922.getClass(), "ambientLightsView", null);
        setField(term2304922, term2304922.getClass(), "votingSelectionView", null);
        setField(term2304922, term2304922.getClass(), "storyView", null);
        setField(term2304922, term2304922.getClass(), "endStoryView", null);
        setField(term2304922, term2304922.getClass(), "realmSetupView", null);
        setField(term2304922, term2304922.getClass(), "aiRealmSetupView", null);
        setField(term2304922, term2304922.getClass(), "governmentEditorView", null);
        setField(term2304922, term2304922.getClass(), "spaceRaceEditorView", null);
        setField(term2304922, term2304922.getClass(), "changeMessage", null);
        setField(term2304922, term2304922.getClass(), "gameFrame", null);
        setField(term2304922, term2304922.getClass(), "layeredPane", null);
        setField(term2304922, term2304922.getClass(), "configFile", null);
        setBooleanField(term2304922, term2304922.getClass(), "showMiniMapFlag", false);
        setField(term2304922, term2304922.getClass(), "saveFilename", null);
        setField(term2304922, term2304922.getClass(), "bridge", null);
        setBooleanField(term2304922, term2304922.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304922, term2304922.getClass(), "fullscreenMode", false);
        setBooleanField(term2304922, term2304922.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showStatView", argTypes, term2304922, args);
    }

};


