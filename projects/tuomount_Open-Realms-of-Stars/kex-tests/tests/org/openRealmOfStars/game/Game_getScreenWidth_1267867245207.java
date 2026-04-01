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

public class Game_getScreenWidth_1267867245207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305143;

    public Game_getScreenWidth_1267867245207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305143 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305143, term2305143.getClass(), "animationTimer", null);
        setField(term2305143, term2305143.getClass(), "musicTimer", null);
        setField(term2305143, term2305143.getClass(), "starMap", null);
        setField(term2305143, term2305143.getClass(), "players", null);
        setField(term2305143, term2305143.getClass(), "gameState", null);
        setField(term2305143, term2305143.getClass(), "previousState", null);
        setField(term2305143, term2305143.getClass(), "planetView", null);
        setField(term2305143, term2305143.getClass(), "espionageMissionView", null);
        setField(term2305143, term2305143.getClass(), "planetBombingView", null);
        setField(term2305143, term2305143.getClass(), "fleetView", null);
        setField(term2305143, term2305143.getClass(), "shipUpgradeView", null);
        setField(term2305143, term2305143.getClass(), "fleetTradeView", null);
        setField(term2305143, term2305143.getClass(), "mainMenu", null);
        setField(term2305143, term2305143.getClass(), "galaxyCreationView", null);
        setField(term2305143, term2305143.getClass(), "saveGameView", null);
        setField(term2305143, term2305143.getClass(), "helpView", null);
        setField(term2305143, term2305143.getClass(), "loadGameView", null);
        setField(term2305143, term2305143.getClass(), "aiTurnView", null);
        setField(term2305143, term2305143.getClass(), "creditsView", null);
        setField(term2305143, term2305143.getClass(), "endGameView", null);
        setField(term2305143, term2305143.getClass(), "starMapView", null);
        setField(term2305143, term2305143.getClass(), "combatView", null);
        setField(term2305143, term2305143.getClass(), "researchView", null);
        setField(term2305143, term2305143.getClass(), "diplomacyView", null);
        setField(term2305143, term2305143.getClass(), "shipView", null);
        setField(term2305143, term2305143.getClass(), "statView", null);
        setField(term2305143, term2305143.getClass(), "voteView", null);
        setField(term2305143, term2305143.getClass(), "shipDesignView", null);
        setField(term2305143, term2305143.getClass(), "galaxyConfig", null);
        setField(term2305143, term2305143.getClass(), "newsCorpView", null);
        setField(term2305143, term2305143.getClass(), "espionageView", null);
        setField(term2305143, term2305143.getClass(), "historyView", null);
        setField(term2305143, term2305143.getClass(), "optionsView", null);
        setField(term2305143, term2305143.getClass(), "realmView", null);
        setField(term2305143, term2305143.getClass(), "leaderView", null);
        setField(term2305143, term2305143.getClass(), "planetListView", null);
        setField(term2305143, term2305143.getClass(), "ambientLightsView", null);
        setField(term2305143, term2305143.getClass(), "votingSelectionView", null);
        setField(term2305143, term2305143.getClass(), "storyView", null);
        setField(term2305143, term2305143.getClass(), "endStoryView", null);
        setField(term2305143, term2305143.getClass(), "realmSetupView", null);
        setField(term2305143, term2305143.getClass(), "aiRealmSetupView", null);
        setField(term2305143, term2305143.getClass(), "governmentEditorView", null);
        setField(term2305143, term2305143.getClass(), "spaceRaceEditorView", null);
        setField(term2305143, term2305143.getClass(), "changeMessage", null);
        setField(term2305143, term2305143.getClass(), "gameFrame", null);
        setField(term2305143, term2305143.getClass(), "layeredPane", null);
        setField(term2305143, term2305143.getClass(), "configFile", null);
        setBooleanField(term2305143, term2305143.getClass(), "showMiniMapFlag", false);
        setField(term2305143, term2305143.getClass(), "saveFilename", null);
        setField(term2305143, term2305143.getClass(), "bridge", null);
        setBooleanField(term2305143, term2305143.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305143, term2305143.getClass(), "fullscreenMode", false);
        setBooleanField(term2305143, term2305143.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScreenWidth", argTypes, term2305143, args);
    }

};


