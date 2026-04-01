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

public class Game_showSpaceRaceEditor_905883466169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304947;

    public Game_showSpaceRaceEditor_905883466169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304947 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304947, term2304947.getClass(), "animationTimer", null);
        setField(term2304947, term2304947.getClass(), "musicTimer", null);
        setField(term2304947, term2304947.getClass(), "starMap", null);
        setField(term2304947, term2304947.getClass(), "players", null);
        setField(term2304947, term2304947.getClass(), "gameState", null);
        setField(term2304947, term2304947.getClass(), "previousState", null);
        setField(term2304947, term2304947.getClass(), "planetView", null);
        setField(term2304947, term2304947.getClass(), "espionageMissionView", null);
        setField(term2304947, term2304947.getClass(), "planetBombingView", null);
        setField(term2304947, term2304947.getClass(), "fleetView", null);
        setField(term2304947, term2304947.getClass(), "shipUpgradeView", null);
        setField(term2304947, term2304947.getClass(), "fleetTradeView", null);
        setField(term2304947, term2304947.getClass(), "mainMenu", null);
        setField(term2304947, term2304947.getClass(), "galaxyCreationView", null);
        setField(term2304947, term2304947.getClass(), "saveGameView", null);
        setField(term2304947, term2304947.getClass(), "helpView", null);
        setField(term2304947, term2304947.getClass(), "loadGameView", null);
        setField(term2304947, term2304947.getClass(), "aiTurnView", null);
        setField(term2304947, term2304947.getClass(), "creditsView", null);
        setField(term2304947, term2304947.getClass(), "endGameView", null);
        setField(term2304947, term2304947.getClass(), "starMapView", null);
        setField(term2304947, term2304947.getClass(), "combatView", null);
        setField(term2304947, term2304947.getClass(), "researchView", null);
        setField(term2304947, term2304947.getClass(), "diplomacyView", null);
        setField(term2304947, term2304947.getClass(), "shipView", null);
        setField(term2304947, term2304947.getClass(), "statView", null);
        setField(term2304947, term2304947.getClass(), "voteView", null);
        setField(term2304947, term2304947.getClass(), "shipDesignView", null);
        setField(term2304947, term2304947.getClass(), "galaxyConfig", null);
        setField(term2304947, term2304947.getClass(), "newsCorpView", null);
        setField(term2304947, term2304947.getClass(), "espionageView", null);
        setField(term2304947, term2304947.getClass(), "historyView", null);
        setField(term2304947, term2304947.getClass(), "optionsView", null);
        setField(term2304947, term2304947.getClass(), "realmView", null);
        setField(term2304947, term2304947.getClass(), "leaderView", null);
        setField(term2304947, term2304947.getClass(), "planetListView", null);
        setField(term2304947, term2304947.getClass(), "ambientLightsView", null);
        setField(term2304947, term2304947.getClass(), "votingSelectionView", null);
        setField(term2304947, term2304947.getClass(), "storyView", null);
        setField(term2304947, term2304947.getClass(), "endStoryView", null);
        setField(term2304947, term2304947.getClass(), "realmSetupView", null);
        setField(term2304947, term2304947.getClass(), "aiRealmSetupView", null);
        setField(term2304947, term2304947.getClass(), "governmentEditorView", null);
        setField(term2304947, term2304947.getClass(), "spaceRaceEditorView", null);
        setField(term2304947, term2304947.getClass(), "changeMessage", null);
        setField(term2304947, term2304947.getClass(), "gameFrame", null);
        setField(term2304947, term2304947.getClass(), "layeredPane", null);
        setField(term2304947, term2304947.getClass(), "configFile", null);
        setBooleanField(term2304947, term2304947.getClass(), "showMiniMapFlag", false);
        setField(term2304947, term2304947.getClass(), "saveFilename", null);
        setField(term2304947, term2304947.getClass(), "bridge", null);
        setBooleanField(term2304947, term2304947.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304947, term2304947.getClass(), "fullscreenMode", false);
        setBooleanField(term2304947, term2304947.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showSpaceRaceEditor", argTypes, term2304947, args);
    }

};


