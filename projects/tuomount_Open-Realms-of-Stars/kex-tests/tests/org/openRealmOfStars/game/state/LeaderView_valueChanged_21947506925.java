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

public class LeaderView_valueChanged_21947506925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602262;

    public LeaderView_valueChanged_21947506925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term602262 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term602262, term602262.getClass(), "player", null);
        setField(term602262, term602262.getClass(), "map", null);
        setField(term602262, term602262.getClass(), "leaderTree", null);
        setField(term602262, term602262.getClass(), "leaderList", null);
        setField(term602262, term602262.getClass(), "credits", null);
        setField(term602262, term602262.getClass(), "planetPopulation", null);
        setField(term602262, term602262.getClass(), "infoText", null);
        setField(term602262, term602262.getClass(), "mapPanel", null);
        setField(term602262, term602262.getClass(), "trainingPlanet", null);
        setField(term602262, term602262.getClass(), "recruitBtn", null);
        setField(term602262, term602262.getClass(), "setLeaderBtn", null);
        setField(term602262, term602262.getClass(), "activePlanet", null);
        setField(term602262, term602262.getClass(), "activeFleet", null);
        setField(term602262, term602262.getClass(), "leadersInPool", null);
        setBooleanField(term602262, term602262.getClass(), "standardLeaderSelected", false);
        setBooleanField(term602262, term602262.getClass(), "isAlignmentXSet", false);
        setFloatField(term602262, term602262.getClass(), "alignmentX", 0.0F);
        setBooleanField(term602262, term602262.getClass(), "isAlignmentYSet", false);
        setFloatField(term602262, term602262.getClass(), "alignmentY", 0.0F);
        setField(term602262, term602262.getClass(), "ui", null);
        setField(term602262, term602262.getClass(), "listenerList", null);
        setField(term602262, term602262.getClass(), "clientProperties", null);
        setField(term602262, term602262.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term602262, term602262.getClass(), "autoscrolls", false);
        setField(term602262, term602262.getClass(), "border", null);
        setIntField(term602262, term602262.getClass(), "flags", 0);
        setField(term602262, term602262.getClass(), "inputVerifier", null);
        setBooleanField(term602262, term602262.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term602262, term602262.getClass(), "paintingChild", null);
        setField(term602262, term602262.getClass(), "popupMenu", null);
        setField(term602262, term602262.getClass(), "revalidateRunnableScheduled", null);
        setField(term602262, term602262.getClass(), "focusInputMap", null);
        setField(term602262, term602262.getClass(), "ancestorInputMap", null);
        setField(term602262, term602262.getClass(), "windowInputMap", null);
        setField(term602262, term602262.getClass(), "actionMap", null);
        setField(term602262, term602262.getClass(), "aaHint", null);
        setField(term602262, term602262.getClass(), "lcdRenderingHint", null);
        setField(term602262, term602262.getClass(), "component", null);
        setField(term602262, term602262.getClass(), "layoutMgr", null);
        setField(term602262, term602262.getClass(), "dispatcher", null);
        setField(term602262, term602262.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term602262, term602262.getClass(), "focusCycleRoot", false);
        setBooleanField(term602262, term602262.getClass(), "focusTraversalPolicyProvider", false);
        setField(term602262, term602262.getClass(), "printingThreads", null);
        setBooleanField(term602262, term602262.getClass(), "printing", false);
        setField(term602262, term602262.getClass(), "containerListener", null);
        setIntField(term602262, term602262.getClass(), "listeningChildren", 0);
        setIntField(term602262, term602262.getClass(), "listeningBoundsChildren", 0);
        setIntField(term602262, term602262.getClass(), "descendantsCount", 0);
        setField(term602262, term602262.getClass(), "preserveBackgroundColor", null);
        setIntField(term602262, term602262.getClass(), "numOfHWComponents", 0);
        setIntField(term602262, term602262.getClass(), "numOfLWComponents", 0);
        setField(term602262, term602262.getClass(), "modalComp", null);
        setField(term602262, term602262.getClass(), "modalAppContext", null);
        setIntField(term602262, term602262.getClass(), "containerSerializedDataVersion", 0);
        setField(term602262, term602262.getClass(), "peer", null);
        setField(term602262, term602262.getClass(), "parent", null);
        setField(term602262, term602262.getClass(), "appContext", null);
        setIntField(term602262, term602262.getClass(), "x", 0);
        setIntField(term602262, term602262.getClass(), "y", 0);
        setIntField(term602262, term602262.getClass(), "width", 0);
        setIntField(term602262, term602262.getClass(), "height", 0);
        setField(term602262, term602262.getClass(), "foreground", null);
        setField(term602262, term602262.getClass(), "background", null);
        setField(term602262, term602262.getClass(), "font", null);
        setField(term602262, term602262.getClass(), "peerFont", null);
        setField(term602262, term602262.getClass(), "cursor", null);
        setField(term602262, term602262.getClass(), "locale", null);
        setField(term602262, term602262.getClass(), "graphicsConfig", null);
        setField(term602262, term602262.getClass(), "bufferStrategy", null);
        setBooleanField(term602262, term602262.getClass(), "ignoreRepaint", false);
        setBooleanField(term602262, term602262.getClass(), "visible", false);
        setBooleanField(term602262, term602262.getClass(), "enabled", false);
        setBooleanField(term602262, term602262.getClass(), "valid", false);
        setField(term602262, term602262.getClass(), "dropTarget", null);
        setField(term602262, term602262.getClass(), "popups", null);
        setField(term602262, term602262.getClass(), "name", null);
        setBooleanField(term602262, term602262.getClass(), "nameExplicitlySet", false);
        setBooleanField(term602262, term602262.getClass(), "focusable", false);
        setIntField(term602262, term602262.getClass(), "isFocusTraversableOverridden", 0);
        setField(term602262, term602262.getClass(), "focusTraversalKeys", null);
        setBooleanField(term602262, term602262.getClass(), "focusTraversalKeysEnabled", false);
        setField(term602262, term602262.getClass(), "acc", null);
        setField(term602262, term602262.getClass(), "minSize", null);
        setBooleanField(term602262, term602262.getClass(), "minSizeSet", false);
        setField(term602262, term602262.getClass(), "prefSize", null);
        setBooleanField(term602262, term602262.getClass(), "prefSizeSet", false);
        setField(term602262, term602262.getClass(), "maxSize", null);
        setBooleanField(term602262, term602262.getClass(), "maxSizeSet", false);
        setField(term602262, term602262.getClass(), "componentOrientation", null);
        setBooleanField(term602262, term602262.getClass(), "newEventsOnly", false);
        setField(term602262, term602262.getClass(), "componentListener", null);
        setField(term602262, term602262.getClass(), "focusListener", null);
        setField(term602262, term602262.getClass(), "hierarchyListener", null);
        setField(term602262, term602262.getClass(), "hierarchyBoundsListener", null);
        setField(term602262, term602262.getClass(), "keyListener", null);
        setField(term602262, term602262.getClass(), "mouseListener", null);
        setField(term602262, term602262.getClass(), "mouseMotionListener", null);
        setField(term602262, term602262.getClass(), "mouseWheelListener", null);
        setField(term602262, term602262.getClass(), "inputMethodListener", null);
        setLongField(term602262, term602262.getClass(), "eventMask", 0L);
        setField(term602262, term602262.getClass(), "changeSupport", null);
        setField(term602262, term602262.getClass(), "objectLock", null);
        setBooleanField(term602262, term602262.getClass(), "isPacked", false);
        setIntField(term602262, term602262.getClass(), "boundsOp", 0);
        setField(term602262, term602262.getClass(), "compoundShape", null);
        setField(term602262, term602262.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term602262, term602262.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term602262, term602262.getClass(), "backgroundEraseDisabled", false);
        setField(term602262, term602262.getClass(), "eventCache", null);
        setBooleanField(term602262, term602262.getClass(), "coalescingEnabled", false);
        setBooleanField(term602262, term602262.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term602262, term602262.getClass(), "componentSerializedDataVersion", 0);
        setField(term602262, term602262.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term602262, args);
    }

};


