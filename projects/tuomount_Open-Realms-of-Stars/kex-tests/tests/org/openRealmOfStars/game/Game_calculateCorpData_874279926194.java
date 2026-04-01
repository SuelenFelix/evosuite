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

public class Game_calculateCorpData_874279926194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305076;

    public Game_calculateCorpData_874279926194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305076 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305076, term2305076.getClass(), "animationTimer", null);
        setField(term2305076, term2305076.getClass(), "musicTimer", null);
        setField(term2305076, term2305076.getClass(), "starMap", null);
        setField(term2305076, term2305076.getClass(), "players", null);
        setField(term2305076, term2305076.getClass(), "gameState", null);
        setField(term2305076, term2305076.getClass(), "previousState", null);
        setField(term2305076, term2305076.getClass(), "planetView", null);
        setField(term2305076, term2305076.getClass(), "espionageMissionView", null);
        setField(term2305076, term2305076.getClass(), "planetBombingView", null);
        setField(term2305076, term2305076.getClass(), "fleetView", null);
        setField(term2305076, term2305076.getClass(), "shipUpgradeView", null);
        setField(term2305076, term2305076.getClass(), "fleetTradeView", null);
        setField(term2305076, term2305076.getClass(), "mainMenu", null);
        setField(term2305076, term2305076.getClass(), "galaxyCreationView", null);
        setField(term2305076, term2305076.getClass(), "saveGameView", null);
        setField(term2305076, term2305076.getClass(), "helpView", null);
        setField(term2305076, term2305076.getClass(), "loadGameView", null);
        setField(term2305076, term2305076.getClass(), "aiTurnView", null);
        setField(term2305076, term2305076.getClass(), "creditsView", null);
        setField(term2305076, term2305076.getClass(), "endGameView", null);
        setField(term2305076, term2305076.getClass(), "starMapView", null);
        setField(term2305076, term2305076.getClass(), "combatView", null);
        setField(term2305076, term2305076.getClass(), "researchView", null);
        setField(term2305076, term2305076.getClass(), "diplomacyView", null);
        setField(term2305076, term2305076.getClass(), "shipView", null);
        setField(term2305076, term2305076.getClass(), "statView", null);
        setField(term2305076, term2305076.getClass(), "voteView", null);
        setField(term2305076, term2305076.getClass(), "shipDesignView", null);
        setField(term2305076, term2305076.getClass(), "galaxyConfig", null);
        setField(term2305076, term2305076.getClass(), "newsCorpView", null);
        setField(term2305076, term2305076.getClass(), "espionageView", null);
        setField(term2305076, term2305076.getClass(), "historyView", null);
        setField(term2305076, term2305076.getClass(), "optionsView", null);
        setField(term2305076, term2305076.getClass(), "realmView", null);
        setField(term2305076, term2305076.getClass(), "leaderView", null);
        setField(term2305076, term2305076.getClass(), "planetListView", null);
        setField(term2305076, term2305076.getClass(), "ambientLightsView", null);
        setField(term2305076, term2305076.getClass(), "votingSelectionView", null);
        setField(term2305076, term2305076.getClass(), "storyView", null);
        setField(term2305076, term2305076.getClass(), "endStoryView", null);
        setField(term2305076, term2305076.getClass(), "realmSetupView", null);
        setField(term2305076, term2305076.getClass(), "aiRealmSetupView", null);
        setField(term2305076, term2305076.getClass(), "governmentEditorView", null);
        setField(term2305076, term2305076.getClass(), "spaceRaceEditorView", null);
        setField(term2305076, term2305076.getClass(), "changeMessage", null);
        setField(term2305076, term2305076.getClass(), "gameFrame", null);
        setField(term2305076, term2305076.getClass(), "layeredPane", null);
        setField(term2305076, term2305076.getClass(), "configFile", null);
        setBooleanField(term2305076, term2305076.getClass(), "showMiniMapFlag", false);
        setField(term2305076, term2305076.getClass(), "saveFilename", null);
        setField(term2305076, term2305076.getClass(), "bridge", null);
        setBooleanField(term2305076, term2305076.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305076, term2305076.getClass(), "fullscreenMode", false);
        setBooleanField(term2305076, term2305076.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsCorpData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "calculateCorpData", argTypes, term2305076, args);
    }

};


