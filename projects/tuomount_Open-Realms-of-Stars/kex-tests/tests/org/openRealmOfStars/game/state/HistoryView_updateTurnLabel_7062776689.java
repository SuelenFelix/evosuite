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

public class HistoryView_updateTurnLabel_7062776689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008765;

    public HistoryView_updateTurnLabel_7062776689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008765 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008765, term1008765.getClass(), "map", null);
        setField(term1008765, term1008765.getClass(), "mapPanel", null);
        setField(term1008765, term1008765.getClass(), "textArea", null);
        setField(term1008765, term1008765.getClass(), "turnLabel", null);
        setIntField(term1008765, term1008765.getClass(), "turnNumber", 0);
        setIntField(term1008765, term1008765.getClass(), "eventNumber", 0);
        setField(term1008765, term1008765.getClass(), "targetCoordinate", null);
        setBooleanField(term1008765, term1008765.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008765, term1008765.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008765, term1008765.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008765, term1008765.getClass(), "alignmentY", 0.0F);
        setField(term1008765, term1008765.getClass(), "ui", null);
        setField(term1008765, term1008765.getClass(), "listenerList", null);
        setField(term1008765, term1008765.getClass(), "clientProperties", null);
        setField(term1008765, term1008765.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008765, term1008765.getClass(), "autoscrolls", false);
        setField(term1008765, term1008765.getClass(), "border", null);
        setIntField(term1008765, term1008765.getClass(), "flags", 0);
        setField(term1008765, term1008765.getClass(), "inputVerifier", null);
        setBooleanField(term1008765, term1008765.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008765, term1008765.getClass(), "paintingChild", null);
        setField(term1008765, term1008765.getClass(), "popupMenu", null);
        setField(term1008765, term1008765.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008765, term1008765.getClass(), "focusInputMap", null);
        setField(term1008765, term1008765.getClass(), "ancestorInputMap", null);
        setField(term1008765, term1008765.getClass(), "windowInputMap", null);
        setField(term1008765, term1008765.getClass(), "actionMap", null);
        setField(term1008765, term1008765.getClass(), "aaHint", null);
        setField(term1008765, term1008765.getClass(), "lcdRenderingHint", null);
        setField(term1008765, term1008765.getClass(), "component", null);
        setField(term1008765, term1008765.getClass(), "layoutMgr", null);
        setField(term1008765, term1008765.getClass(), "dispatcher", null);
        setField(term1008765, term1008765.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008765, term1008765.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008765, term1008765.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008765, term1008765.getClass(), "printingThreads", null);
        setBooleanField(term1008765, term1008765.getClass(), "printing", false);
        setField(term1008765, term1008765.getClass(), "containerListener", null);
        setIntField(term1008765, term1008765.getClass(), "listeningChildren", 0);
        setIntField(term1008765, term1008765.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008765, term1008765.getClass(), "descendantsCount", 0);
        setField(term1008765, term1008765.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008765, term1008765.getClass(), "numOfHWComponents", 0);
        setIntField(term1008765, term1008765.getClass(), "numOfLWComponents", 0);
        setField(term1008765, term1008765.getClass(), "modalComp", null);
        setField(term1008765, term1008765.getClass(), "modalAppContext", null);
        setIntField(term1008765, term1008765.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008765, term1008765.getClass(), "peer", null);
        setField(term1008765, term1008765.getClass(), "parent", null);
        setField(term1008765, term1008765.getClass(), "appContext", null);
        setIntField(term1008765, term1008765.getClass(), "x", 0);
        setIntField(term1008765, term1008765.getClass(), "y", 0);
        setIntField(term1008765, term1008765.getClass(), "width", 0);
        setIntField(term1008765, term1008765.getClass(), "height", 0);
        setField(term1008765, term1008765.getClass(), "foreground", null);
        setField(term1008765, term1008765.getClass(), "background", null);
        setField(term1008765, term1008765.getClass(), "font", null);
        setField(term1008765, term1008765.getClass(), "peerFont", null);
        setField(term1008765, term1008765.getClass(), "cursor", null);
        setField(term1008765, term1008765.getClass(), "locale", null);
        setField(term1008765, term1008765.getClass(), "graphicsConfig", null);
        setField(term1008765, term1008765.getClass(), "bufferStrategy", null);
        setBooleanField(term1008765, term1008765.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008765, term1008765.getClass(), "visible", false);
        setBooleanField(term1008765, term1008765.getClass(), "enabled", false);
        setBooleanField(term1008765, term1008765.getClass(), "valid", false);
        setField(term1008765, term1008765.getClass(), "dropTarget", null);
        setField(term1008765, term1008765.getClass(), "popups", null);
        setField(term1008765, term1008765.getClass(), "name", null);
        setBooleanField(term1008765, term1008765.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008765, term1008765.getClass(), "focusable", false);
        setIntField(term1008765, term1008765.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008765, term1008765.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008765, term1008765.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008765, term1008765.getClass(), "acc", null);
        setField(term1008765, term1008765.getClass(), "minSize", null);
        setBooleanField(term1008765, term1008765.getClass(), "minSizeSet", false);
        setField(term1008765, term1008765.getClass(), "prefSize", null);
        setBooleanField(term1008765, term1008765.getClass(), "prefSizeSet", false);
        setField(term1008765, term1008765.getClass(), "maxSize", null);
        setBooleanField(term1008765, term1008765.getClass(), "maxSizeSet", false);
        setField(term1008765, term1008765.getClass(), "componentOrientation", null);
        setBooleanField(term1008765, term1008765.getClass(), "newEventsOnly", false);
        setField(term1008765, term1008765.getClass(), "componentListener", null);
        setField(term1008765, term1008765.getClass(), "focusListener", null);
        setField(term1008765, term1008765.getClass(), "hierarchyListener", null);
        setField(term1008765, term1008765.getClass(), "hierarchyBoundsListener", null);
        setField(term1008765, term1008765.getClass(), "keyListener", null);
        setField(term1008765, term1008765.getClass(), "mouseListener", null);
        setField(term1008765, term1008765.getClass(), "mouseMotionListener", null);
        setField(term1008765, term1008765.getClass(), "mouseWheelListener", null);
        setField(term1008765, term1008765.getClass(), "inputMethodListener", null);
        setLongField(term1008765, term1008765.getClass(), "eventMask", 0L);
        setField(term1008765, term1008765.getClass(), "changeSupport", null);
        setField(term1008765, term1008765.getClass(), "objectLock", null);
        setBooleanField(term1008765, term1008765.getClass(), "isPacked", false);
        setIntField(term1008765, term1008765.getClass(), "boundsOp", 0);
        setField(term1008765, term1008765.getClass(), "compoundShape", null);
        setField(term1008765, term1008765.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008765, term1008765.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008765, term1008765.getClass(), "backgroundEraseDisabled", false);
        setField(term1008765, term1008765.getClass(), "eventCache", null);
        setBooleanField(term1008765, term1008765.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008765, term1008765.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008765, term1008765.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008765, term1008765.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateTurnLabel", argTypes, term1008765, args);
    }

};


