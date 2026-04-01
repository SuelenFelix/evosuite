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

public class Game_actionPerformedMenus_247457214214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305180;

    public Game_actionPerformedMenus_247457214214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305180 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305180, term2305180.getClass(), "animationTimer", null);
        setField(term2305180, term2305180.getClass(), "musicTimer", null);
        setField(term2305180, term2305180.getClass(), "starMap", null);
        setField(term2305180, term2305180.getClass(), "players", null);
        setField(term2305180, term2305180.getClass(), "gameState", null);
        setField(term2305180, term2305180.getClass(), "previousState", null);
        setField(term2305180, term2305180.getClass(), "planetView", null);
        setField(term2305180, term2305180.getClass(), "espionageMissionView", null);
        setField(term2305180, term2305180.getClass(), "planetBombingView", null);
        setField(term2305180, term2305180.getClass(), "fleetView", null);
        setField(term2305180, term2305180.getClass(), "shipUpgradeView", null);
        setField(term2305180, term2305180.getClass(), "fleetTradeView", null);
        setField(term2305180, term2305180.getClass(), "mainMenu", null);
        setField(term2305180, term2305180.getClass(), "galaxyCreationView", null);
        setField(term2305180, term2305180.getClass(), "saveGameView", null);
        setField(term2305180, term2305180.getClass(), "helpView", null);
        setField(term2305180, term2305180.getClass(), "loadGameView", null);
        setField(term2305180, term2305180.getClass(), "aiTurnView", null);
        setField(term2305180, term2305180.getClass(), "creditsView", null);
        setField(term2305180, term2305180.getClass(), "endGameView", null);
        setField(term2305180, term2305180.getClass(), "starMapView", null);
        setField(term2305180, term2305180.getClass(), "combatView", null);
        setField(term2305180, term2305180.getClass(), "researchView", null);
        setField(term2305180, term2305180.getClass(), "diplomacyView", null);
        setField(term2305180, term2305180.getClass(), "shipView", null);
        setField(term2305180, term2305180.getClass(), "statView", null);
        setField(term2305180, term2305180.getClass(), "voteView", null);
        setField(term2305180, term2305180.getClass(), "shipDesignView", null);
        setField(term2305180, term2305180.getClass(), "galaxyConfig", null);
        setField(term2305180, term2305180.getClass(), "newsCorpView", null);
        setField(term2305180, term2305180.getClass(), "espionageView", null);
        setField(term2305180, term2305180.getClass(), "historyView", null);
        setField(term2305180, term2305180.getClass(), "optionsView", null);
        setField(term2305180, term2305180.getClass(), "realmView", null);
        setField(term2305180, term2305180.getClass(), "leaderView", null);
        setField(term2305180, term2305180.getClass(), "planetListView", null);
        setField(term2305180, term2305180.getClass(), "ambientLightsView", null);
        setField(term2305180, term2305180.getClass(), "votingSelectionView", null);
        setField(term2305180, term2305180.getClass(), "storyView", null);
        setField(term2305180, term2305180.getClass(), "endStoryView", null);
        setField(term2305180, term2305180.getClass(), "realmSetupView", null);
        setField(term2305180, term2305180.getClass(), "aiRealmSetupView", null);
        setField(term2305180, term2305180.getClass(), "governmentEditorView", null);
        setField(term2305180, term2305180.getClass(), "spaceRaceEditorView", null);
        setField(term2305180, term2305180.getClass(), "changeMessage", null);
        setField(term2305180, term2305180.getClass(), "gameFrame", null);
        setField(term2305180, term2305180.getClass(), "layeredPane", null);
        setField(term2305180, term2305180.getClass(), "configFile", null);
        setBooleanField(term2305180, term2305180.getClass(), "showMiniMapFlag", false);
        setField(term2305180, term2305180.getClass(), "saveFilename", null);
        setField(term2305180, term2305180.getClass(), "bridge", null);
        setBooleanField(term2305180, term2305180.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305180, term2305180.getClass(), "fullscreenMode", false);
        setBooleanField(term2305180, term2305180.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformedMenus", argTypes, term2305180, args);
    }

};


