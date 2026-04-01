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
import java.lang.Boolean;

public class Game_setResizable_1963065778145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304825;
     Object term2304830;

    public Game_setResizable_1963065778145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304825 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304825, term2304825.getClass(), "animationTimer", null);
        setField(term2304825, term2304825.getClass(), "musicTimer", null);
        setField(term2304825, term2304825.getClass(), "starMap", null);
        setField(term2304825, term2304825.getClass(), "players", null);
        setField(term2304825, term2304825.getClass(), "gameState", null);
        setField(term2304825, term2304825.getClass(), "previousState", null);
        setField(term2304825, term2304825.getClass(), "planetView", null);
        setField(term2304825, term2304825.getClass(), "espionageMissionView", null);
        setField(term2304825, term2304825.getClass(), "planetBombingView", null);
        setField(term2304825, term2304825.getClass(), "fleetView", null);
        setField(term2304825, term2304825.getClass(), "shipUpgradeView", null);
        setField(term2304825, term2304825.getClass(), "fleetTradeView", null);
        setField(term2304825, term2304825.getClass(), "mainMenu", null);
        setField(term2304825, term2304825.getClass(), "galaxyCreationView", null);
        setField(term2304825, term2304825.getClass(), "saveGameView", null);
        setField(term2304825, term2304825.getClass(), "helpView", null);
        setField(term2304825, term2304825.getClass(), "loadGameView", null);
        setField(term2304825, term2304825.getClass(), "aiTurnView", null);
        setField(term2304825, term2304825.getClass(), "creditsView", null);
        setField(term2304825, term2304825.getClass(), "endGameView", null);
        setField(term2304825, term2304825.getClass(), "starMapView", null);
        setField(term2304825, term2304825.getClass(), "combatView", null);
        setField(term2304825, term2304825.getClass(), "researchView", null);
        setField(term2304825, term2304825.getClass(), "diplomacyView", null);
        setField(term2304825, term2304825.getClass(), "shipView", null);
        setField(term2304825, term2304825.getClass(), "statView", null);
        setField(term2304825, term2304825.getClass(), "voteView", null);
        setField(term2304825, term2304825.getClass(), "shipDesignView", null);
        setField(term2304825, term2304825.getClass(), "galaxyConfig", null);
        setField(term2304825, term2304825.getClass(), "newsCorpView", null);
        setField(term2304825, term2304825.getClass(), "espionageView", null);
        setField(term2304825, term2304825.getClass(), "historyView", null);
        setField(term2304825, term2304825.getClass(), "optionsView", null);
        setField(term2304825, term2304825.getClass(), "realmView", null);
        setField(term2304825, term2304825.getClass(), "leaderView", null);
        setField(term2304825, term2304825.getClass(), "planetListView", null);
        setField(term2304825, term2304825.getClass(), "ambientLightsView", null);
        setField(term2304825, term2304825.getClass(), "votingSelectionView", null);
        setField(term2304825, term2304825.getClass(), "storyView", null);
        setField(term2304825, term2304825.getClass(), "endStoryView", null);
        setField(term2304825, term2304825.getClass(), "realmSetupView", null);
        setField(term2304825, term2304825.getClass(), "aiRealmSetupView", null);
        setField(term2304825, term2304825.getClass(), "governmentEditorView", null);
        setField(term2304825, term2304825.getClass(), "spaceRaceEditorView", null);
        setField(term2304825, term2304825.getClass(), "changeMessage", null);
        setField(term2304825, term2304825.getClass(), "gameFrame", null);
        setField(term2304825, term2304825.getClass(), "layeredPane", null);
        setField(term2304825, term2304825.getClass(), "configFile", null);
        setBooleanField(term2304825, term2304825.getClass(), "showMiniMapFlag", false);
        setField(term2304825, term2304825.getClass(), "saveFilename", null);
        setField(term2304825, term2304825.getClass(), "bridge", null);
        setBooleanField(term2304825, term2304825.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304825, term2304825.getClass(), "fullscreenMode", false);
        setBooleanField(term2304825, term2304825.getClass(), "resolutionChanged", false);
        term2304830 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2304830;
        callMethod(klass, "setResizable", argTypes, term2304825, args);
    }

};


