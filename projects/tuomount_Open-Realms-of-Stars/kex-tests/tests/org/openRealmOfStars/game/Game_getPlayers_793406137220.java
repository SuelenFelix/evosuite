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

public class Game_getPlayers_793406137220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305210;

    public Game_getPlayers_793406137220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305210 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305210, term2305210.getClass(), "animationTimer", null);
        setField(term2305210, term2305210.getClass(), "musicTimer", null);
        setField(term2305210, term2305210.getClass(), "starMap", null);
        setField(term2305210, term2305210.getClass(), "players", null);
        setField(term2305210, term2305210.getClass(), "gameState", null);
        setField(term2305210, term2305210.getClass(), "previousState", null);
        setField(term2305210, term2305210.getClass(), "planetView", null);
        setField(term2305210, term2305210.getClass(), "espionageMissionView", null);
        setField(term2305210, term2305210.getClass(), "planetBombingView", null);
        setField(term2305210, term2305210.getClass(), "fleetView", null);
        setField(term2305210, term2305210.getClass(), "shipUpgradeView", null);
        setField(term2305210, term2305210.getClass(), "fleetTradeView", null);
        setField(term2305210, term2305210.getClass(), "mainMenu", null);
        setField(term2305210, term2305210.getClass(), "galaxyCreationView", null);
        setField(term2305210, term2305210.getClass(), "saveGameView", null);
        setField(term2305210, term2305210.getClass(), "helpView", null);
        setField(term2305210, term2305210.getClass(), "loadGameView", null);
        setField(term2305210, term2305210.getClass(), "aiTurnView", null);
        setField(term2305210, term2305210.getClass(), "creditsView", null);
        setField(term2305210, term2305210.getClass(), "endGameView", null);
        setField(term2305210, term2305210.getClass(), "starMapView", null);
        setField(term2305210, term2305210.getClass(), "combatView", null);
        setField(term2305210, term2305210.getClass(), "researchView", null);
        setField(term2305210, term2305210.getClass(), "diplomacyView", null);
        setField(term2305210, term2305210.getClass(), "shipView", null);
        setField(term2305210, term2305210.getClass(), "statView", null);
        setField(term2305210, term2305210.getClass(), "voteView", null);
        setField(term2305210, term2305210.getClass(), "shipDesignView", null);
        setField(term2305210, term2305210.getClass(), "galaxyConfig", null);
        setField(term2305210, term2305210.getClass(), "newsCorpView", null);
        setField(term2305210, term2305210.getClass(), "espionageView", null);
        setField(term2305210, term2305210.getClass(), "historyView", null);
        setField(term2305210, term2305210.getClass(), "optionsView", null);
        setField(term2305210, term2305210.getClass(), "realmView", null);
        setField(term2305210, term2305210.getClass(), "leaderView", null);
        setField(term2305210, term2305210.getClass(), "planetListView", null);
        setField(term2305210, term2305210.getClass(), "ambientLightsView", null);
        setField(term2305210, term2305210.getClass(), "votingSelectionView", null);
        setField(term2305210, term2305210.getClass(), "storyView", null);
        setField(term2305210, term2305210.getClass(), "endStoryView", null);
        setField(term2305210, term2305210.getClass(), "realmSetupView", null);
        setField(term2305210, term2305210.getClass(), "aiRealmSetupView", null);
        setField(term2305210, term2305210.getClass(), "governmentEditorView", null);
        setField(term2305210, term2305210.getClass(), "spaceRaceEditorView", null);
        setField(term2305210, term2305210.getClass(), "changeMessage", null);
        setField(term2305210, term2305210.getClass(), "gameFrame", null);
        setField(term2305210, term2305210.getClass(), "layeredPane", null);
        setField(term2305210, term2305210.getClass(), "configFile", null);
        setBooleanField(term2305210, term2305210.getClass(), "showMiniMapFlag", false);
        setField(term2305210, term2305210.getClass(), "saveFilename", null);
        setField(term2305210, term2305210.getClass(), "bridge", null);
        setBooleanField(term2305210, term2305210.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305210, term2305210.getClass(), "fullscreenMode", false);
        setBooleanField(term2305210, term2305210.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayers", argTypes, term2305210, args);
    }

};


