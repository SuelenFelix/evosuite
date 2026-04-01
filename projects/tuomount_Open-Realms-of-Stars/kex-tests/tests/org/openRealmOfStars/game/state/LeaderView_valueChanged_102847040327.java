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

public class LeaderView_valueChanged_102847040327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608853;

    public LeaderView_valueChanged_102847040327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608853 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term608853, term608853.getClass(), "player", null);
        setField(term608853, term608853.getClass(), "map", null);
        setField(term608853, term608853.getClass(), "leaderTree", null);
        setField(term608853, term608853.getClass(), "leaderList", null);
        setField(term608853, term608853.getClass(), "credits", null);
        setField(term608853, term608853.getClass(), "planetPopulation", null);
        setField(term608853, term608853.getClass(), "infoText", null);
        setField(term608853, term608853.getClass(), "mapPanel", null);
        setField(term608853, term608853.getClass(), "trainingPlanet", null);
        setField(term608853, term608853.getClass(), "recruitBtn", null);
        setField(term608853, term608853.getClass(), "setLeaderBtn", null);
        setField(term608853, term608853.getClass(), "activePlanet", null);
        setField(term608853, term608853.getClass(), "activeFleet", null);
        setField(term608853, term608853.getClass(), "leadersInPool", null);
        setBooleanField(term608853, term608853.getClass(), "standardLeaderSelected", false);
        setBooleanField(term608853, term608853.getClass(), "isAlignmentXSet", false);
        setFloatField(term608853, term608853.getClass(), "alignmentX", 0.0F);
        setBooleanField(term608853, term608853.getClass(), "isAlignmentYSet", false);
        setFloatField(term608853, term608853.getClass(), "alignmentY", 0.0F);
        setField(term608853, term608853.getClass(), "ui", null);
        setField(term608853, term608853.getClass(), "listenerList", null);
        setField(term608853, term608853.getClass(), "clientProperties", null);
        setField(term608853, term608853.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term608853, term608853.getClass(), "autoscrolls", false);
        setField(term608853, term608853.getClass(), "border", null);
        setIntField(term608853, term608853.getClass(), "flags", 0);
        setField(term608853, term608853.getClass(), "inputVerifier", null);
        setBooleanField(term608853, term608853.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term608853, term608853.getClass(), "paintingChild", null);
        setField(term608853, term608853.getClass(), "popupMenu", null);
        setField(term608853, term608853.getClass(), "revalidateRunnableScheduled", null);
        setField(term608853, term608853.getClass(), "focusInputMap", null);
        setField(term608853, term608853.getClass(), "ancestorInputMap", null);
        setField(term608853, term608853.getClass(), "windowInputMap", null);
        setField(term608853, term608853.getClass(), "actionMap", null);
        setField(term608853, term608853.getClass(), "aaHint", null);
        setField(term608853, term608853.getClass(), "lcdRenderingHint", null);
        setField(term608853, term608853.getClass(), "component", null);
        setField(term608853, term608853.getClass(), "layoutMgr", null);
        setField(term608853, term608853.getClass(), "dispatcher", null);
        setField(term608853, term608853.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term608853, term608853.getClass(), "focusCycleRoot", false);
        setBooleanField(term608853, term608853.getClass(), "focusTraversalPolicyProvider", false);
        setField(term608853, term608853.getClass(), "printingThreads", null);
        setBooleanField(term608853, term608853.getClass(), "printing", false);
        setField(term608853, term608853.getClass(), "containerListener", null);
        setIntField(term608853, term608853.getClass(), "listeningChildren", 0);
        setIntField(term608853, term608853.getClass(), "listeningBoundsChildren", 0);
        setIntField(term608853, term608853.getClass(), "descendantsCount", 0);
        setField(term608853, term608853.getClass(), "preserveBackgroundColor", null);
        setIntField(term608853, term608853.getClass(), "numOfHWComponents", 0);
        setIntField(term608853, term608853.getClass(), "numOfLWComponents", 0);
        setField(term608853, term608853.getClass(), "modalComp", null);
        setField(term608853, term608853.getClass(), "modalAppContext", null);
        setIntField(term608853, term608853.getClass(), "containerSerializedDataVersion", 0);
        setField(term608853, term608853.getClass(), "peer", null);
        setField(term608853, term608853.getClass(), "parent", null);
        setField(term608853, term608853.getClass(), "appContext", null);
        setIntField(term608853, term608853.getClass(), "x", 0);
        setIntField(term608853, term608853.getClass(), "y", 0);
        setIntField(term608853, term608853.getClass(), "width", 0);
        setIntField(term608853, term608853.getClass(), "height", 0);
        setField(term608853, term608853.getClass(), "foreground", null);
        setField(term608853, term608853.getClass(), "background", null);
        setField(term608853, term608853.getClass(), "font", null);
        setField(term608853, term608853.getClass(), "peerFont", null);
        setField(term608853, term608853.getClass(), "cursor", null);
        setField(term608853, term608853.getClass(), "locale", null);
        setField(term608853, term608853.getClass(), "graphicsConfig", null);
        setField(term608853, term608853.getClass(), "bufferStrategy", null);
        setBooleanField(term608853, term608853.getClass(), "ignoreRepaint", false);
        setBooleanField(term608853, term608853.getClass(), "visible", false);
        setBooleanField(term608853, term608853.getClass(), "enabled", false);
        setBooleanField(term608853, term608853.getClass(), "valid", false);
        setField(term608853, term608853.getClass(), "dropTarget", null);
        setField(term608853, term608853.getClass(), "popups", null);
        setField(term608853, term608853.getClass(), "name", null);
        setBooleanField(term608853, term608853.getClass(), "nameExplicitlySet", false);
        setBooleanField(term608853, term608853.getClass(), "focusable", false);
        setIntField(term608853, term608853.getClass(), "isFocusTraversableOverridden", 0);
        setField(term608853, term608853.getClass(), "focusTraversalKeys", null);
        setBooleanField(term608853, term608853.getClass(), "focusTraversalKeysEnabled", false);
        setField(term608853, term608853.getClass(), "acc", null);
        setField(term608853, term608853.getClass(), "minSize", null);
        setBooleanField(term608853, term608853.getClass(), "minSizeSet", false);
        setField(term608853, term608853.getClass(), "prefSize", null);
        setBooleanField(term608853, term608853.getClass(), "prefSizeSet", false);
        setField(term608853, term608853.getClass(), "maxSize", null);
        setBooleanField(term608853, term608853.getClass(), "maxSizeSet", false);
        setField(term608853, term608853.getClass(), "componentOrientation", null);
        setBooleanField(term608853, term608853.getClass(), "newEventsOnly", false);
        setField(term608853, term608853.getClass(), "componentListener", null);
        setField(term608853, term608853.getClass(), "focusListener", null);
        setField(term608853, term608853.getClass(), "hierarchyListener", null);
        setField(term608853, term608853.getClass(), "hierarchyBoundsListener", null);
        setField(term608853, term608853.getClass(), "keyListener", null);
        setField(term608853, term608853.getClass(), "mouseListener", null);
        setField(term608853, term608853.getClass(), "mouseMotionListener", null);
        setField(term608853, term608853.getClass(), "mouseWheelListener", null);
        setField(term608853, term608853.getClass(), "inputMethodListener", null);
        setLongField(term608853, term608853.getClass(), "eventMask", 0L);
        setField(term608853, term608853.getClass(), "changeSupport", null);
        setField(term608853, term608853.getClass(), "objectLock", null);
        setBooleanField(term608853, term608853.getClass(), "isPacked", false);
        setIntField(term608853, term608853.getClass(), "boundsOp", 0);
        setField(term608853, term608853.getClass(), "compoundShape", null);
        setField(term608853, term608853.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term608853, term608853.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term608853, term608853.getClass(), "backgroundEraseDisabled", false);
        setField(term608853, term608853.getClass(), "eventCache", null);
        setBooleanField(term608853, term608853.getClass(), "coalescingEnabled", false);
        setBooleanField(term608853, term608853.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term608853, term608853.getClass(), "componentSerializedDataVersion", 0);
        setField(term608853, term608853.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term608853, args);
    }

};


