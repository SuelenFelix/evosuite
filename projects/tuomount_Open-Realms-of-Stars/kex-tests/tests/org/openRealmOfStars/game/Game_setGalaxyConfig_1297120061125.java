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

public class Game_setGalaxyConfig_1297120061125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2285070;

    public Game_setGalaxyConfig_1297120061125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2285070 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2285070, term2285070.getClass(), "animationTimer", null);
        setField(term2285070, term2285070.getClass(), "musicTimer", null);
        setField(term2285070, term2285070.getClass(), "starMap", null);
        setField(term2285070, term2285070.getClass(), "players", null);
        setField(term2285070, term2285070.getClass(), "gameState", null);
        setField(term2285070, term2285070.getClass(), "previousState", null);
        setField(term2285070, term2285070.getClass(), "planetView", null);
        setField(term2285070, term2285070.getClass(), "espionageMissionView", null);
        setField(term2285070, term2285070.getClass(), "planetBombingView", null);
        setField(term2285070, term2285070.getClass(), "fleetView", null);
        setField(term2285070, term2285070.getClass(), "shipUpgradeView", null);
        setField(term2285070, term2285070.getClass(), "fleetTradeView", null);
        setField(term2285070, term2285070.getClass(), "mainMenu", null);
        setField(term2285070, term2285070.getClass(), "galaxyCreationView", null);
        setField(term2285070, term2285070.getClass(), "saveGameView", null);
        setField(term2285070, term2285070.getClass(), "helpView", null);
        setField(term2285070, term2285070.getClass(), "loadGameView", null);
        setField(term2285070, term2285070.getClass(), "aiTurnView", null);
        setField(term2285070, term2285070.getClass(), "creditsView", null);
        setField(term2285070, term2285070.getClass(), "endGameView", null);
        setField(term2285070, term2285070.getClass(), "starMapView", null);
        setField(term2285070, term2285070.getClass(), "combatView", null);
        setField(term2285070, term2285070.getClass(), "researchView", null);
        setField(term2285070, term2285070.getClass(), "diplomacyView", null);
        setField(term2285070, term2285070.getClass(), "shipView", null);
        setField(term2285070, term2285070.getClass(), "statView", null);
        setField(term2285070, term2285070.getClass(), "voteView", null);
        setField(term2285070, term2285070.getClass(), "shipDesignView", null);
        setField(term2285070, term2285070.getClass(), "galaxyConfig", null);
        setField(term2285070, term2285070.getClass(), "newsCorpView", null);
        setField(term2285070, term2285070.getClass(), "espionageView", null);
        setField(term2285070, term2285070.getClass(), "historyView", null);
        setField(term2285070, term2285070.getClass(), "optionsView", null);
        setField(term2285070, term2285070.getClass(), "realmView", null);
        setField(term2285070, term2285070.getClass(), "leaderView", null);
        setField(term2285070, term2285070.getClass(), "planetListView", null);
        setField(term2285070, term2285070.getClass(), "ambientLightsView", null);
        setField(term2285070, term2285070.getClass(), "votingSelectionView", null);
        setField(term2285070, term2285070.getClass(), "storyView", null);
        setField(term2285070, term2285070.getClass(), "endStoryView", null);
        setField(term2285070, term2285070.getClass(), "realmSetupView", null);
        setField(term2285070, term2285070.getClass(), "aiRealmSetupView", null);
        setField(term2285070, term2285070.getClass(), "governmentEditorView", null);
        setField(term2285070, term2285070.getClass(), "spaceRaceEditorView", null);
        setField(term2285070, term2285070.getClass(), "changeMessage", null);
        setField(term2285070, term2285070.getClass(), "gameFrame", null);
        setField(term2285070, term2285070.getClass(), "layeredPane", null);
        setField(term2285070, term2285070.getClass(), "configFile", null);
        setBooleanField(term2285070, term2285070.getClass(), "showMiniMapFlag", false);
        setField(term2285070, term2285070.getClass(), "saveFilename", null);
        setField(term2285070, term2285070.getClass(), "bridge", null);
        setBooleanField(term2285070, term2285070.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2285070, term2285070.getClass(), "fullscreenMode", false);
        setBooleanField(term2285070, term2285070.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGalaxyConfig", argTypes, term2285070, args);
    }

};


