package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GalaxyCreationView_createRealmSetupPanel_11570778648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363387;

    public GalaxyCreationView_createRealmSetupPanel_11570778648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363387 = newInstance(Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView"));
        setField(term363387, term363387.getClass(), "comboGalaxySize", null);
        setField(term363387, term363387.getClass(), "comboPlayers", null);
        setField(term363387, term363387.getClass(), "comboDifficulty", null);
        setField(term363387, term363387.getClass(), "comboPlayerPos", null);
        setField(term363387, term363387.getClass(), "comboElderTurns", null);
        setField(term363387, term363387.getClass(), "comboSunDensity", null);
        setField(term363387, term363387.getClass(), "comboPlanetaryEvent", null);
        setField(term363387, term363387.getClass(), "comboScoringVictory", null);
        setField(term363387, term363387.getClass(), "comboScoringCulture", null);
        setField(term363387, term363387.getClass(), "comboScoringDomination", null);
        setField(term363387, term363387.getClass(), "comboScoringScientific", null);
        setField(term363387, term363387.getClass(), "comboScoringDiplomatic", null);
        setField(term363387, term363387.getClass(), "comboScoringPopulation", null);
        setField(term363387, term363387.getClass(), "comboRoguePlanets", null);
        setField(term363387, term363387.getClass(), "comboSpacePirates", null);
        setField(term363387, term363387.getClass(), "comboSpacePirateDifficulty", null);
        setField(term363387, term363387.getClass(), "comboSpaceAnomalies", null);
        setField(term363387, term363387.getClass(), "comboKarmaType", null);
        setField(term363387, term363387.getClass(), "comboKarmaSpeed", null);
        setField(term363387, term363387.getClass(), "tutorialEnabled", null);
        setField(term363387, term363387.getClass(), "aiOnlyGame", null);
        setField(term363387, term363387.getClass(), "allNewsSubscribed", null);
        setField(term363387, term363387.getClass(), "config", null);
        setBooleanField(term363387, term363387.getClass(), "isAlignmentXSet", false);
        setFloatField(term363387, term363387.getClass(), "alignmentX", 0.0F);
        setBooleanField(term363387, term363387.getClass(), "isAlignmentYSet", false);
        setFloatField(term363387, term363387.getClass(), "alignmentY", 0.0F);
        setField(term363387, term363387.getClass(), "ui", null);
        setField(term363387, term363387.getClass(), "listenerList", null);
        setField(term363387, term363387.getClass(), "clientProperties", null);
        setField(term363387, term363387.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term363387, term363387.getClass(), "autoscrolls", false);
        setField(term363387, term363387.getClass(), "border", null);
        setIntField(term363387, term363387.getClass(), "flags", 0);
        setField(term363387, term363387.getClass(), "inputVerifier", null);
        setBooleanField(term363387, term363387.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term363387, term363387.getClass(), "paintingChild", null);
        setField(term363387, term363387.getClass(), "popupMenu", null);
        setField(term363387, term363387.getClass(), "revalidateRunnableScheduled", null);
        setField(term363387, term363387.getClass(), "focusInputMap", null);
        setField(term363387, term363387.getClass(), "ancestorInputMap", null);
        setField(term363387, term363387.getClass(), "windowInputMap", null);
        setField(term363387, term363387.getClass(), "actionMap", null);
        setField(term363387, term363387.getClass(), "aaHint", null);
        setField(term363387, term363387.getClass(), "lcdRenderingHint", null);
        setField(term363387, term363387.getClass(), "component", null);
        setField(term363387, term363387.getClass(), "layoutMgr", null);
        setField(term363387, term363387.getClass(), "dispatcher", null);
        setField(term363387, term363387.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term363387, term363387.getClass(), "focusCycleRoot", false);
        setBooleanField(term363387, term363387.getClass(), "focusTraversalPolicyProvider", false);
        setField(term363387, term363387.getClass(), "printingThreads", null);
        setBooleanField(term363387, term363387.getClass(), "printing", false);
        setField(term363387, term363387.getClass(), "containerListener", null);
        setIntField(term363387, term363387.getClass(), "listeningChildren", 0);
        setIntField(term363387, term363387.getClass(), "listeningBoundsChildren", 0);
        setIntField(term363387, term363387.getClass(), "descendantsCount", 0);
        setField(term363387, term363387.getClass(), "preserveBackgroundColor", null);
        setIntField(term363387, term363387.getClass(), "numOfHWComponents", 0);
        setIntField(term363387, term363387.getClass(), "numOfLWComponents", 0);
        setField(term363387, term363387.getClass(), "modalComp", null);
        setField(term363387, term363387.getClass(), "modalAppContext", null);
        setIntField(term363387, term363387.getClass(), "containerSerializedDataVersion", 0);
        setField(term363387, term363387.getClass(), "peer", null);
        setField(term363387, term363387.getClass(), "parent", null);
        setField(term363387, term363387.getClass(), "appContext", null);
        setIntField(term363387, term363387.getClass(), "x", 0);
        setIntField(term363387, term363387.getClass(), "y", 0);
        setIntField(term363387, term363387.getClass(), "width", 0);
        setIntField(term363387, term363387.getClass(), "height", 0);
        setField(term363387, term363387.getClass(), "foreground", null);
        setField(term363387, term363387.getClass(), "background", null);
        setField(term363387, term363387.getClass(), "font", null);
        setField(term363387, term363387.getClass(), "peerFont", null);
        setField(term363387, term363387.getClass(), "cursor", null);
        setField(term363387, term363387.getClass(), "locale", null);
        setField(term363387, term363387.getClass(), "graphicsConfig", null);
        setField(term363387, term363387.getClass(), "bufferStrategy", null);
        setBooleanField(term363387, term363387.getClass(), "ignoreRepaint", false);
        setBooleanField(term363387, term363387.getClass(), "visible", false);
        setBooleanField(term363387, term363387.getClass(), "enabled", false);
        setBooleanField(term363387, term363387.getClass(), "valid", false);
        setField(term363387, term363387.getClass(), "dropTarget", null);
        setField(term363387, term363387.getClass(), "popups", null);
        setField(term363387, term363387.getClass(), "name", null);
        setBooleanField(term363387, term363387.getClass(), "nameExplicitlySet", false);
        setBooleanField(term363387, term363387.getClass(), "focusable", false);
        setIntField(term363387, term363387.getClass(), "isFocusTraversableOverridden", 0);
        setField(term363387, term363387.getClass(), "focusTraversalKeys", null);
        setBooleanField(term363387, term363387.getClass(), "focusTraversalKeysEnabled", false);
        setField(term363387, term363387.getClass(), "acc", null);
        setField(term363387, term363387.getClass(), "minSize", null);
        setBooleanField(term363387, term363387.getClass(), "minSizeSet", false);
        setField(term363387, term363387.getClass(), "prefSize", null);
        setBooleanField(term363387, term363387.getClass(), "prefSizeSet", false);
        setField(term363387, term363387.getClass(), "maxSize", null);
        setBooleanField(term363387, term363387.getClass(), "maxSizeSet", false);
        setField(term363387, term363387.getClass(), "componentOrientation", null);
        setBooleanField(term363387, term363387.getClass(), "newEventsOnly", false);
        setField(term363387, term363387.getClass(), "componentListener", null);
        setField(term363387, term363387.getClass(), "focusListener", null);
        setField(term363387, term363387.getClass(), "hierarchyListener", null);
        setField(term363387, term363387.getClass(), "hierarchyBoundsListener", null);
        setField(term363387, term363387.getClass(), "keyListener", null);
        setField(term363387, term363387.getClass(), "mouseListener", null);
        setField(term363387, term363387.getClass(), "mouseMotionListener", null);
        setField(term363387, term363387.getClass(), "mouseWheelListener", null);
        setField(term363387, term363387.getClass(), "inputMethodListener", null);
        setLongField(term363387, term363387.getClass(), "eventMask", 0L);
        setField(term363387, term363387.getClass(), "changeSupport", null);
        setField(term363387, term363387.getClass(), "objectLock", null);
        setBooleanField(term363387, term363387.getClass(), "isPacked", false);
        setIntField(term363387, term363387.getClass(), "boundsOp", 0);
        setField(term363387, term363387.getClass(), "compoundShape", null);
        setField(term363387, term363387.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term363387, term363387.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term363387, term363387.getClass(), "backgroundEraseDisabled", false);
        setField(term363387, term363387.getClass(), "eventCache", null);
        setBooleanField(term363387, term363387.getClass(), "coalescingEnabled", false);
        setBooleanField(term363387, term363387.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term363387, term363387.getClass(), "componentSerializedDataVersion", 0);
        setField(term363387, term363387.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createRealmSetupPanel", argTypes, term363387, args);
    }

};


