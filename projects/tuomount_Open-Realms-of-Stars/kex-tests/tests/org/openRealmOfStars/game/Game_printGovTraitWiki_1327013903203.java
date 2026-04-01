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

public class Game_printGovTraitWiki_1327013903203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305123;

    public Game_printGovTraitWiki_1327013903203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305123 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305123, term2305123.getClass(), "animationTimer", null);
        setField(term2305123, term2305123.getClass(), "musicTimer", null);
        setField(term2305123, term2305123.getClass(), "starMap", null);
        setField(term2305123, term2305123.getClass(), "players", null);
        setField(term2305123, term2305123.getClass(), "gameState", null);
        setField(term2305123, term2305123.getClass(), "previousState", null);
        setField(term2305123, term2305123.getClass(), "planetView", null);
        setField(term2305123, term2305123.getClass(), "espionageMissionView", null);
        setField(term2305123, term2305123.getClass(), "planetBombingView", null);
        setField(term2305123, term2305123.getClass(), "fleetView", null);
        setField(term2305123, term2305123.getClass(), "shipUpgradeView", null);
        setField(term2305123, term2305123.getClass(), "fleetTradeView", null);
        setField(term2305123, term2305123.getClass(), "mainMenu", null);
        setField(term2305123, term2305123.getClass(), "galaxyCreationView", null);
        setField(term2305123, term2305123.getClass(), "saveGameView", null);
        setField(term2305123, term2305123.getClass(), "helpView", null);
        setField(term2305123, term2305123.getClass(), "loadGameView", null);
        setField(term2305123, term2305123.getClass(), "aiTurnView", null);
        setField(term2305123, term2305123.getClass(), "creditsView", null);
        setField(term2305123, term2305123.getClass(), "endGameView", null);
        setField(term2305123, term2305123.getClass(), "starMapView", null);
        setField(term2305123, term2305123.getClass(), "combatView", null);
        setField(term2305123, term2305123.getClass(), "researchView", null);
        setField(term2305123, term2305123.getClass(), "diplomacyView", null);
        setField(term2305123, term2305123.getClass(), "shipView", null);
        setField(term2305123, term2305123.getClass(), "statView", null);
        setField(term2305123, term2305123.getClass(), "voteView", null);
        setField(term2305123, term2305123.getClass(), "shipDesignView", null);
        setField(term2305123, term2305123.getClass(), "galaxyConfig", null);
        setField(term2305123, term2305123.getClass(), "newsCorpView", null);
        setField(term2305123, term2305123.getClass(), "espionageView", null);
        setField(term2305123, term2305123.getClass(), "historyView", null);
        setField(term2305123, term2305123.getClass(), "optionsView", null);
        setField(term2305123, term2305123.getClass(), "realmView", null);
        setField(term2305123, term2305123.getClass(), "leaderView", null);
        setField(term2305123, term2305123.getClass(), "planetListView", null);
        setField(term2305123, term2305123.getClass(), "ambientLightsView", null);
        setField(term2305123, term2305123.getClass(), "votingSelectionView", null);
        setField(term2305123, term2305123.getClass(), "storyView", null);
        setField(term2305123, term2305123.getClass(), "endStoryView", null);
        setField(term2305123, term2305123.getClass(), "realmSetupView", null);
        setField(term2305123, term2305123.getClass(), "aiRealmSetupView", null);
        setField(term2305123, term2305123.getClass(), "governmentEditorView", null);
        setField(term2305123, term2305123.getClass(), "spaceRaceEditorView", null);
        setField(term2305123, term2305123.getClass(), "changeMessage", null);
        setField(term2305123, term2305123.getClass(), "gameFrame", null);
        setField(term2305123, term2305123.getClass(), "layeredPane", null);
        setField(term2305123, term2305123.getClass(), "configFile", null);
        setBooleanField(term2305123, term2305123.getClass(), "showMiniMapFlag", false);
        setField(term2305123, term2305123.getClass(), "saveFilename", null);
        setField(term2305123, term2305123.getClass(), "bridge", null);
        setBooleanField(term2305123, term2305123.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305123, term2305123.getClass(), "fullscreenMode", false);
        setBooleanField(term2305123, term2305123.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "printGovTraitWiki", argTypes, term2305123, args);
    }

};


