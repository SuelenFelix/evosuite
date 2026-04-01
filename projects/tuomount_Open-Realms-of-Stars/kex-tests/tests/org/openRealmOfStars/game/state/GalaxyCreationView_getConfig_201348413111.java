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

public class GalaxyCreationView_getConfig_201348413111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363510;

    public GalaxyCreationView_getConfig_201348413111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363510 = newInstance(Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView"));
        setField(term363510, term363510.getClass(), "comboGalaxySize", null);
        setField(term363510, term363510.getClass(), "comboPlayers", null);
        setField(term363510, term363510.getClass(), "comboDifficulty", null);
        setField(term363510, term363510.getClass(), "comboPlayerPos", null);
        setField(term363510, term363510.getClass(), "comboElderTurns", null);
        setField(term363510, term363510.getClass(), "comboSunDensity", null);
        setField(term363510, term363510.getClass(), "comboPlanetaryEvent", null);
        setField(term363510, term363510.getClass(), "comboScoringVictory", null);
        setField(term363510, term363510.getClass(), "comboScoringCulture", null);
        setField(term363510, term363510.getClass(), "comboScoringDomination", null);
        setField(term363510, term363510.getClass(), "comboScoringScientific", null);
        setField(term363510, term363510.getClass(), "comboScoringDiplomatic", null);
        setField(term363510, term363510.getClass(), "comboScoringPopulation", null);
        setField(term363510, term363510.getClass(), "comboRoguePlanets", null);
        setField(term363510, term363510.getClass(), "comboSpacePirates", null);
        setField(term363510, term363510.getClass(), "comboSpacePirateDifficulty", null);
        setField(term363510, term363510.getClass(), "comboSpaceAnomalies", null);
        setField(term363510, term363510.getClass(), "comboKarmaType", null);
        setField(term363510, term363510.getClass(), "comboKarmaSpeed", null);
        setField(term363510, term363510.getClass(), "tutorialEnabled", null);
        setField(term363510, term363510.getClass(), "aiOnlyGame", null);
        setField(term363510, term363510.getClass(), "allNewsSubscribed", null);
        setField(term363510, term363510.getClass(), "config", null);
        setBooleanField(term363510, term363510.getClass(), "isAlignmentXSet", false);
        setFloatField(term363510, term363510.getClass(), "alignmentX", 0.0F);
        setBooleanField(term363510, term363510.getClass(), "isAlignmentYSet", false);
        setFloatField(term363510, term363510.getClass(), "alignmentY", 0.0F);
        setField(term363510, term363510.getClass(), "ui", null);
        setField(term363510, term363510.getClass(), "listenerList", null);
        setField(term363510, term363510.getClass(), "clientProperties", null);
        setField(term363510, term363510.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term363510, term363510.getClass(), "autoscrolls", false);
        setField(term363510, term363510.getClass(), "border", null);
        setIntField(term363510, term363510.getClass(), "flags", 0);
        setField(term363510, term363510.getClass(), "inputVerifier", null);
        setBooleanField(term363510, term363510.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term363510, term363510.getClass(), "paintingChild", null);
        setField(term363510, term363510.getClass(), "popupMenu", null);
        setField(term363510, term363510.getClass(), "revalidateRunnableScheduled", null);
        setField(term363510, term363510.getClass(), "focusInputMap", null);
        setField(term363510, term363510.getClass(), "ancestorInputMap", null);
        setField(term363510, term363510.getClass(), "windowInputMap", null);
        setField(term363510, term363510.getClass(), "actionMap", null);
        setField(term363510, term363510.getClass(), "aaHint", null);
        setField(term363510, term363510.getClass(), "lcdRenderingHint", null);
        setField(term363510, term363510.getClass(), "component", null);
        setField(term363510, term363510.getClass(), "layoutMgr", null);
        setField(term363510, term363510.getClass(), "dispatcher", null);
        setField(term363510, term363510.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term363510, term363510.getClass(), "focusCycleRoot", false);
        setBooleanField(term363510, term363510.getClass(), "focusTraversalPolicyProvider", false);
        setField(term363510, term363510.getClass(), "printingThreads", null);
        setBooleanField(term363510, term363510.getClass(), "printing", false);
        setField(term363510, term363510.getClass(), "containerListener", null);
        setIntField(term363510, term363510.getClass(), "listeningChildren", 0);
        setIntField(term363510, term363510.getClass(), "listeningBoundsChildren", 0);
        setIntField(term363510, term363510.getClass(), "descendantsCount", 0);
        setField(term363510, term363510.getClass(), "preserveBackgroundColor", null);
        setIntField(term363510, term363510.getClass(), "numOfHWComponents", 0);
        setIntField(term363510, term363510.getClass(), "numOfLWComponents", 0);
        setField(term363510, term363510.getClass(), "modalComp", null);
        setField(term363510, term363510.getClass(), "modalAppContext", null);
        setIntField(term363510, term363510.getClass(), "containerSerializedDataVersion", 0);
        setField(term363510, term363510.getClass(), "peer", null);
        setField(term363510, term363510.getClass(), "parent", null);
        setField(term363510, term363510.getClass(), "appContext", null);
        setIntField(term363510, term363510.getClass(), "x", 0);
        setIntField(term363510, term363510.getClass(), "y", 0);
        setIntField(term363510, term363510.getClass(), "width", 0);
        setIntField(term363510, term363510.getClass(), "height", 0);
        setField(term363510, term363510.getClass(), "foreground", null);
        setField(term363510, term363510.getClass(), "background", null);
        setField(term363510, term363510.getClass(), "font", null);
        setField(term363510, term363510.getClass(), "peerFont", null);
        setField(term363510, term363510.getClass(), "cursor", null);
        setField(term363510, term363510.getClass(), "locale", null);
        setField(term363510, term363510.getClass(), "graphicsConfig", null);
        setField(term363510, term363510.getClass(), "bufferStrategy", null);
        setBooleanField(term363510, term363510.getClass(), "ignoreRepaint", false);
        setBooleanField(term363510, term363510.getClass(), "visible", false);
        setBooleanField(term363510, term363510.getClass(), "enabled", false);
        setBooleanField(term363510, term363510.getClass(), "valid", false);
        setField(term363510, term363510.getClass(), "dropTarget", null);
        setField(term363510, term363510.getClass(), "popups", null);
        setField(term363510, term363510.getClass(), "name", null);
        setBooleanField(term363510, term363510.getClass(), "nameExplicitlySet", false);
        setBooleanField(term363510, term363510.getClass(), "focusable", false);
        setIntField(term363510, term363510.getClass(), "isFocusTraversableOverridden", 0);
        setField(term363510, term363510.getClass(), "focusTraversalKeys", null);
        setBooleanField(term363510, term363510.getClass(), "focusTraversalKeysEnabled", false);
        setField(term363510, term363510.getClass(), "acc", null);
        setField(term363510, term363510.getClass(), "minSize", null);
        setBooleanField(term363510, term363510.getClass(), "minSizeSet", false);
        setField(term363510, term363510.getClass(), "prefSize", null);
        setBooleanField(term363510, term363510.getClass(), "prefSizeSet", false);
        setField(term363510, term363510.getClass(), "maxSize", null);
        setBooleanField(term363510, term363510.getClass(), "maxSizeSet", false);
        setField(term363510, term363510.getClass(), "componentOrientation", null);
        setBooleanField(term363510, term363510.getClass(), "newEventsOnly", false);
        setField(term363510, term363510.getClass(), "componentListener", null);
        setField(term363510, term363510.getClass(), "focusListener", null);
        setField(term363510, term363510.getClass(), "hierarchyListener", null);
        setField(term363510, term363510.getClass(), "hierarchyBoundsListener", null);
        setField(term363510, term363510.getClass(), "keyListener", null);
        setField(term363510, term363510.getClass(), "mouseListener", null);
        setField(term363510, term363510.getClass(), "mouseMotionListener", null);
        setField(term363510, term363510.getClass(), "mouseWheelListener", null);
        setField(term363510, term363510.getClass(), "inputMethodListener", null);
        setLongField(term363510, term363510.getClass(), "eventMask", 0L);
        setField(term363510, term363510.getClass(), "changeSupport", null);
        setField(term363510, term363510.getClass(), "objectLock", null);
        setBooleanField(term363510, term363510.getClass(), "isPacked", false);
        setIntField(term363510, term363510.getClass(), "boundsOp", 0);
        setField(term363510, term363510.getClass(), "compoundShape", null);
        setField(term363510, term363510.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term363510, term363510.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term363510, term363510.getClass(), "backgroundEraseDisabled", false);
        setField(term363510, term363510.getClass(), "eventCache", null);
        setBooleanField(term363510, term363510.getClass(), "coalescingEnabled", false);
        setBooleanField(term363510, term363510.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term363510, term363510.getClass(), "componentSerializedDataVersion", 0);
        setField(term363510, term363510.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfig", argTypes, term363510, args);
    }

};


