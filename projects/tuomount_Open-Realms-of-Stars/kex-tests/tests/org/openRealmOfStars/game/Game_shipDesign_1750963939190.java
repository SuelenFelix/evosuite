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

public class Game_shipDesign_1750963939190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305054;

    public Game_shipDesign_1750963939190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305054 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305054, term2305054.getClass(), "animationTimer", null);
        setField(term2305054, term2305054.getClass(), "musicTimer", null);
        setField(term2305054, term2305054.getClass(), "starMap", null);
        setField(term2305054, term2305054.getClass(), "players", null);
        setField(term2305054, term2305054.getClass(), "gameState", null);
        setField(term2305054, term2305054.getClass(), "previousState", null);
        setField(term2305054, term2305054.getClass(), "planetView", null);
        setField(term2305054, term2305054.getClass(), "espionageMissionView", null);
        setField(term2305054, term2305054.getClass(), "planetBombingView", null);
        setField(term2305054, term2305054.getClass(), "fleetView", null);
        setField(term2305054, term2305054.getClass(), "shipUpgradeView", null);
        setField(term2305054, term2305054.getClass(), "fleetTradeView", null);
        setField(term2305054, term2305054.getClass(), "mainMenu", null);
        setField(term2305054, term2305054.getClass(), "galaxyCreationView", null);
        setField(term2305054, term2305054.getClass(), "saveGameView", null);
        setField(term2305054, term2305054.getClass(), "helpView", null);
        setField(term2305054, term2305054.getClass(), "loadGameView", null);
        setField(term2305054, term2305054.getClass(), "aiTurnView", null);
        setField(term2305054, term2305054.getClass(), "creditsView", null);
        setField(term2305054, term2305054.getClass(), "endGameView", null);
        setField(term2305054, term2305054.getClass(), "starMapView", null);
        setField(term2305054, term2305054.getClass(), "combatView", null);
        setField(term2305054, term2305054.getClass(), "researchView", null);
        setField(term2305054, term2305054.getClass(), "diplomacyView", null);
        setField(term2305054, term2305054.getClass(), "shipView", null);
        setField(term2305054, term2305054.getClass(), "statView", null);
        setField(term2305054, term2305054.getClass(), "voteView", null);
        setField(term2305054, term2305054.getClass(), "shipDesignView", null);
        setField(term2305054, term2305054.getClass(), "galaxyConfig", null);
        setField(term2305054, term2305054.getClass(), "newsCorpView", null);
        setField(term2305054, term2305054.getClass(), "espionageView", null);
        setField(term2305054, term2305054.getClass(), "historyView", null);
        setField(term2305054, term2305054.getClass(), "optionsView", null);
        setField(term2305054, term2305054.getClass(), "realmView", null);
        setField(term2305054, term2305054.getClass(), "leaderView", null);
        setField(term2305054, term2305054.getClass(), "planetListView", null);
        setField(term2305054, term2305054.getClass(), "ambientLightsView", null);
        setField(term2305054, term2305054.getClass(), "votingSelectionView", null);
        setField(term2305054, term2305054.getClass(), "storyView", null);
        setField(term2305054, term2305054.getClass(), "endStoryView", null);
        setField(term2305054, term2305054.getClass(), "realmSetupView", null);
        setField(term2305054, term2305054.getClass(), "aiRealmSetupView", null);
        setField(term2305054, term2305054.getClass(), "governmentEditorView", null);
        setField(term2305054, term2305054.getClass(), "spaceRaceEditorView", null);
        setField(term2305054, term2305054.getClass(), "changeMessage", null);
        setField(term2305054, term2305054.getClass(), "gameFrame", null);
        setField(term2305054, term2305054.getClass(), "layeredPane", null);
        setField(term2305054, term2305054.getClass(), "configFile", null);
        setBooleanField(term2305054, term2305054.getClass(), "showMiniMapFlag", false);
        setField(term2305054, term2305054.getClass(), "saveFilename", null);
        setField(term2305054, term2305054.getClass(), "bridge", null);
        setBooleanField(term2305054, term2305054.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305054, term2305054.getClass(), "fullscreenMode", false);
        setBooleanField(term2305054, term2305054.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "shipDesign", argTypes, term2305054, args);
    }

};


