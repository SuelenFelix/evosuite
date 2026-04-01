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

public class HistoryView_getEventNumber_58879476715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009025;

    public HistoryView_getEventNumber_58879476715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1009025 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1009025, term1009025.getClass(), "map", null);
        setField(term1009025, term1009025.getClass(), "mapPanel", null);
        setField(term1009025, term1009025.getClass(), "textArea", null);
        setField(term1009025, term1009025.getClass(), "turnLabel", null);
        setIntField(term1009025, term1009025.getClass(), "turnNumber", 0);
        setIntField(term1009025, term1009025.getClass(), "eventNumber", 0);
        setField(term1009025, term1009025.getClass(), "targetCoordinate", null);
        setBooleanField(term1009025, term1009025.getClass(), "isAlignmentXSet", false);
        setFloatField(term1009025, term1009025.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1009025, term1009025.getClass(), "isAlignmentYSet", false);
        setFloatField(term1009025, term1009025.getClass(), "alignmentY", 0.0F);
        setField(term1009025, term1009025.getClass(), "ui", null);
        setField(term1009025, term1009025.getClass(), "listenerList", null);
        setField(term1009025, term1009025.getClass(), "clientProperties", null);
        setField(term1009025, term1009025.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1009025, term1009025.getClass(), "autoscrolls", false);
        setField(term1009025, term1009025.getClass(), "border", null);
        setIntField(term1009025, term1009025.getClass(), "flags", 0);
        setField(term1009025, term1009025.getClass(), "inputVerifier", null);
        setBooleanField(term1009025, term1009025.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1009025, term1009025.getClass(), "paintingChild", null);
        setField(term1009025, term1009025.getClass(), "popupMenu", null);
        setField(term1009025, term1009025.getClass(), "revalidateRunnableScheduled", null);
        setField(term1009025, term1009025.getClass(), "focusInputMap", null);
        setField(term1009025, term1009025.getClass(), "ancestorInputMap", null);
        setField(term1009025, term1009025.getClass(), "windowInputMap", null);
        setField(term1009025, term1009025.getClass(), "actionMap", null);
        setField(term1009025, term1009025.getClass(), "aaHint", null);
        setField(term1009025, term1009025.getClass(), "lcdRenderingHint", null);
        setField(term1009025, term1009025.getClass(), "component", null);
        setField(term1009025, term1009025.getClass(), "layoutMgr", null);
        setField(term1009025, term1009025.getClass(), "dispatcher", null);
        setField(term1009025, term1009025.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1009025, term1009025.getClass(), "focusCycleRoot", false);
        setBooleanField(term1009025, term1009025.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1009025, term1009025.getClass(), "printingThreads", null);
        setBooleanField(term1009025, term1009025.getClass(), "printing", false);
        setField(term1009025, term1009025.getClass(), "containerListener", null);
        setIntField(term1009025, term1009025.getClass(), "listeningChildren", 0);
        setIntField(term1009025, term1009025.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1009025, term1009025.getClass(), "descendantsCount", 0);
        setField(term1009025, term1009025.getClass(), "preserveBackgroundColor", null);
        setIntField(term1009025, term1009025.getClass(), "numOfHWComponents", 0);
        setIntField(term1009025, term1009025.getClass(), "numOfLWComponents", 0);
        setField(term1009025, term1009025.getClass(), "modalComp", null);
        setField(term1009025, term1009025.getClass(), "modalAppContext", null);
        setIntField(term1009025, term1009025.getClass(), "containerSerializedDataVersion", 0);
        setField(term1009025, term1009025.getClass(), "peer", null);
        setField(term1009025, term1009025.getClass(), "parent", null);
        setField(term1009025, term1009025.getClass(), "appContext", null);
        setIntField(term1009025, term1009025.getClass(), "x", 0);
        setIntField(term1009025, term1009025.getClass(), "y", 0);
        setIntField(term1009025, term1009025.getClass(), "width", 0);
        setIntField(term1009025, term1009025.getClass(), "height", 0);
        setField(term1009025, term1009025.getClass(), "foreground", null);
        setField(term1009025, term1009025.getClass(), "background", null);
        setField(term1009025, term1009025.getClass(), "font", null);
        setField(term1009025, term1009025.getClass(), "peerFont", null);
        setField(term1009025, term1009025.getClass(), "cursor", null);
        setField(term1009025, term1009025.getClass(), "locale", null);
        setField(term1009025, term1009025.getClass(), "graphicsConfig", null);
        setField(term1009025, term1009025.getClass(), "bufferStrategy", null);
        setBooleanField(term1009025, term1009025.getClass(), "ignoreRepaint", false);
        setBooleanField(term1009025, term1009025.getClass(), "visible", false);
        setBooleanField(term1009025, term1009025.getClass(), "enabled", false);
        setBooleanField(term1009025, term1009025.getClass(), "valid", false);
        setField(term1009025, term1009025.getClass(), "dropTarget", null);
        setField(term1009025, term1009025.getClass(), "popups", null);
        setField(term1009025, term1009025.getClass(), "name", null);
        setBooleanField(term1009025, term1009025.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1009025, term1009025.getClass(), "focusable", false);
        setIntField(term1009025, term1009025.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1009025, term1009025.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1009025, term1009025.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1009025, term1009025.getClass(), "acc", null);
        setField(term1009025, term1009025.getClass(), "minSize", null);
        setBooleanField(term1009025, term1009025.getClass(), "minSizeSet", false);
        setField(term1009025, term1009025.getClass(), "prefSize", null);
        setBooleanField(term1009025, term1009025.getClass(), "prefSizeSet", false);
        setField(term1009025, term1009025.getClass(), "maxSize", null);
        setBooleanField(term1009025, term1009025.getClass(), "maxSizeSet", false);
        setField(term1009025, term1009025.getClass(), "componentOrientation", null);
        setBooleanField(term1009025, term1009025.getClass(), "newEventsOnly", false);
        setField(term1009025, term1009025.getClass(), "componentListener", null);
        setField(term1009025, term1009025.getClass(), "focusListener", null);
        setField(term1009025, term1009025.getClass(), "hierarchyListener", null);
        setField(term1009025, term1009025.getClass(), "hierarchyBoundsListener", null);
        setField(term1009025, term1009025.getClass(), "keyListener", null);
        setField(term1009025, term1009025.getClass(), "mouseListener", null);
        setField(term1009025, term1009025.getClass(), "mouseMotionListener", null);
        setField(term1009025, term1009025.getClass(), "mouseWheelListener", null);
        setField(term1009025, term1009025.getClass(), "inputMethodListener", null);
        setLongField(term1009025, term1009025.getClass(), "eventMask", 0L);
        setField(term1009025, term1009025.getClass(), "changeSupport", null);
        setField(term1009025, term1009025.getClass(), "objectLock", null);
        setBooleanField(term1009025, term1009025.getClass(), "isPacked", false);
        setIntField(term1009025, term1009025.getClass(), "boundsOp", 0);
        setField(term1009025, term1009025.getClass(), "compoundShape", null);
        setField(term1009025, term1009025.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1009025, term1009025.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1009025, term1009025.getClass(), "backgroundEraseDisabled", false);
        setField(term1009025, term1009025.getClass(), "eventCache", null);
        setBooleanField(term1009025, term1009025.getClass(), "coalescingEnabled", false);
        setBooleanField(term1009025, term1009025.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1009025, term1009025.getClass(), "componentSerializedDataVersion", 0);
        setField(term1009025, term1009025.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventNumber", argTypes, term1009025, args);
    }

};


