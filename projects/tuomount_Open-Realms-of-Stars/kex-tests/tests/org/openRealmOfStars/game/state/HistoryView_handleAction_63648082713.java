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

public class HistoryView_handleAction_63648082713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008939;

    public HistoryView_handleAction_63648082713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008939 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008939, term1008939.getClass(), "map", null);
        setField(term1008939, term1008939.getClass(), "mapPanel", null);
        setField(term1008939, term1008939.getClass(), "textArea", null);
        setField(term1008939, term1008939.getClass(), "turnLabel", null);
        setIntField(term1008939, term1008939.getClass(), "turnNumber", 0);
        setIntField(term1008939, term1008939.getClass(), "eventNumber", 0);
        setField(term1008939, term1008939.getClass(), "targetCoordinate", null);
        setBooleanField(term1008939, term1008939.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008939, term1008939.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008939, term1008939.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008939, term1008939.getClass(), "alignmentY", 0.0F);
        setField(term1008939, term1008939.getClass(), "ui", null);
        setField(term1008939, term1008939.getClass(), "listenerList", null);
        setField(term1008939, term1008939.getClass(), "clientProperties", null);
        setField(term1008939, term1008939.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008939, term1008939.getClass(), "autoscrolls", false);
        setField(term1008939, term1008939.getClass(), "border", null);
        setIntField(term1008939, term1008939.getClass(), "flags", 0);
        setField(term1008939, term1008939.getClass(), "inputVerifier", null);
        setBooleanField(term1008939, term1008939.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008939, term1008939.getClass(), "paintingChild", null);
        setField(term1008939, term1008939.getClass(), "popupMenu", null);
        setField(term1008939, term1008939.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008939, term1008939.getClass(), "focusInputMap", null);
        setField(term1008939, term1008939.getClass(), "ancestorInputMap", null);
        setField(term1008939, term1008939.getClass(), "windowInputMap", null);
        setField(term1008939, term1008939.getClass(), "actionMap", null);
        setField(term1008939, term1008939.getClass(), "aaHint", null);
        setField(term1008939, term1008939.getClass(), "lcdRenderingHint", null);
        setField(term1008939, term1008939.getClass(), "component", null);
        setField(term1008939, term1008939.getClass(), "layoutMgr", null);
        setField(term1008939, term1008939.getClass(), "dispatcher", null);
        setField(term1008939, term1008939.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008939, term1008939.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008939, term1008939.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008939, term1008939.getClass(), "printingThreads", null);
        setBooleanField(term1008939, term1008939.getClass(), "printing", false);
        setField(term1008939, term1008939.getClass(), "containerListener", null);
        setIntField(term1008939, term1008939.getClass(), "listeningChildren", 0);
        setIntField(term1008939, term1008939.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008939, term1008939.getClass(), "descendantsCount", 0);
        setField(term1008939, term1008939.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008939, term1008939.getClass(), "numOfHWComponents", 0);
        setIntField(term1008939, term1008939.getClass(), "numOfLWComponents", 0);
        setField(term1008939, term1008939.getClass(), "modalComp", null);
        setField(term1008939, term1008939.getClass(), "modalAppContext", null);
        setIntField(term1008939, term1008939.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008939, term1008939.getClass(), "peer", null);
        setField(term1008939, term1008939.getClass(), "parent", null);
        setField(term1008939, term1008939.getClass(), "appContext", null);
        setIntField(term1008939, term1008939.getClass(), "x", 0);
        setIntField(term1008939, term1008939.getClass(), "y", 0);
        setIntField(term1008939, term1008939.getClass(), "width", 0);
        setIntField(term1008939, term1008939.getClass(), "height", 0);
        setField(term1008939, term1008939.getClass(), "foreground", null);
        setField(term1008939, term1008939.getClass(), "background", null);
        setField(term1008939, term1008939.getClass(), "font", null);
        setField(term1008939, term1008939.getClass(), "peerFont", null);
        setField(term1008939, term1008939.getClass(), "cursor", null);
        setField(term1008939, term1008939.getClass(), "locale", null);
        setField(term1008939, term1008939.getClass(), "graphicsConfig", null);
        setField(term1008939, term1008939.getClass(), "bufferStrategy", null);
        setBooleanField(term1008939, term1008939.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008939, term1008939.getClass(), "visible", false);
        setBooleanField(term1008939, term1008939.getClass(), "enabled", false);
        setBooleanField(term1008939, term1008939.getClass(), "valid", false);
        setField(term1008939, term1008939.getClass(), "dropTarget", null);
        setField(term1008939, term1008939.getClass(), "popups", null);
        setField(term1008939, term1008939.getClass(), "name", null);
        setBooleanField(term1008939, term1008939.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008939, term1008939.getClass(), "focusable", false);
        setIntField(term1008939, term1008939.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008939, term1008939.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008939, term1008939.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008939, term1008939.getClass(), "acc", null);
        setField(term1008939, term1008939.getClass(), "minSize", null);
        setBooleanField(term1008939, term1008939.getClass(), "minSizeSet", false);
        setField(term1008939, term1008939.getClass(), "prefSize", null);
        setBooleanField(term1008939, term1008939.getClass(), "prefSizeSet", false);
        setField(term1008939, term1008939.getClass(), "maxSize", null);
        setBooleanField(term1008939, term1008939.getClass(), "maxSizeSet", false);
        setField(term1008939, term1008939.getClass(), "componentOrientation", null);
        setBooleanField(term1008939, term1008939.getClass(), "newEventsOnly", false);
        setField(term1008939, term1008939.getClass(), "componentListener", null);
        setField(term1008939, term1008939.getClass(), "focusListener", null);
        setField(term1008939, term1008939.getClass(), "hierarchyListener", null);
        setField(term1008939, term1008939.getClass(), "hierarchyBoundsListener", null);
        setField(term1008939, term1008939.getClass(), "keyListener", null);
        setField(term1008939, term1008939.getClass(), "mouseListener", null);
        setField(term1008939, term1008939.getClass(), "mouseMotionListener", null);
        setField(term1008939, term1008939.getClass(), "mouseWheelListener", null);
        setField(term1008939, term1008939.getClass(), "inputMethodListener", null);
        setLongField(term1008939, term1008939.getClass(), "eventMask", 0L);
        setField(term1008939, term1008939.getClass(), "changeSupport", null);
        setField(term1008939, term1008939.getClass(), "objectLock", null);
        setBooleanField(term1008939, term1008939.getClass(), "isPacked", false);
        setIntField(term1008939, term1008939.getClass(), "boundsOp", 0);
        setField(term1008939, term1008939.getClass(), "compoundShape", null);
        setField(term1008939, term1008939.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008939, term1008939.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008939, term1008939.getClass(), "backgroundEraseDisabled", false);
        setField(term1008939, term1008939.getClass(), "eventCache", null);
        setBooleanField(term1008939, term1008939.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008939, term1008939.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008939, term1008939.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008939, term1008939.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1008939, args);
    }

};


