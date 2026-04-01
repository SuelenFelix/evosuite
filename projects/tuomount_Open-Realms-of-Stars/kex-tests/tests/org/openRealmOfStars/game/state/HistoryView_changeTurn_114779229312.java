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
import java.lang.Boolean;

public class HistoryView_changeTurn_114779229312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008894;
     Object term1008937;

    public HistoryView_changeTurn_114779229312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008894 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008894, term1008894.getClass(), "map", null);
        setField(term1008894, term1008894.getClass(), "mapPanel", null);
        setField(term1008894, term1008894.getClass(), "textArea", null);
        setField(term1008894, term1008894.getClass(), "turnLabel", null);
        setIntField(term1008894, term1008894.getClass(), "turnNumber", 0);
        setIntField(term1008894, term1008894.getClass(), "eventNumber", 0);
        setField(term1008894, term1008894.getClass(), "targetCoordinate", null);
        setBooleanField(term1008894, term1008894.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008894, term1008894.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008894, term1008894.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008894, term1008894.getClass(), "alignmentY", 0.0F);
        setField(term1008894, term1008894.getClass(), "ui", null);
        setField(term1008894, term1008894.getClass(), "listenerList", null);
        setField(term1008894, term1008894.getClass(), "clientProperties", null);
        setField(term1008894, term1008894.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008894, term1008894.getClass(), "autoscrolls", false);
        setField(term1008894, term1008894.getClass(), "border", null);
        setIntField(term1008894, term1008894.getClass(), "flags", 0);
        setField(term1008894, term1008894.getClass(), "inputVerifier", null);
        setBooleanField(term1008894, term1008894.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008894, term1008894.getClass(), "paintingChild", null);
        setField(term1008894, term1008894.getClass(), "popupMenu", null);
        setField(term1008894, term1008894.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008894, term1008894.getClass(), "focusInputMap", null);
        setField(term1008894, term1008894.getClass(), "ancestorInputMap", null);
        setField(term1008894, term1008894.getClass(), "windowInputMap", null);
        setField(term1008894, term1008894.getClass(), "actionMap", null);
        setField(term1008894, term1008894.getClass(), "aaHint", null);
        setField(term1008894, term1008894.getClass(), "lcdRenderingHint", null);
        setField(term1008894, term1008894.getClass(), "component", null);
        setField(term1008894, term1008894.getClass(), "layoutMgr", null);
        setField(term1008894, term1008894.getClass(), "dispatcher", null);
        setField(term1008894, term1008894.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008894, term1008894.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008894, term1008894.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008894, term1008894.getClass(), "printingThreads", null);
        setBooleanField(term1008894, term1008894.getClass(), "printing", false);
        setField(term1008894, term1008894.getClass(), "containerListener", null);
        setIntField(term1008894, term1008894.getClass(), "listeningChildren", 0);
        setIntField(term1008894, term1008894.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008894, term1008894.getClass(), "descendantsCount", 0);
        setField(term1008894, term1008894.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008894, term1008894.getClass(), "numOfHWComponents", 0);
        setIntField(term1008894, term1008894.getClass(), "numOfLWComponents", 0);
        setField(term1008894, term1008894.getClass(), "modalComp", null);
        setField(term1008894, term1008894.getClass(), "modalAppContext", null);
        setIntField(term1008894, term1008894.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008894, term1008894.getClass(), "peer", null);
        setField(term1008894, term1008894.getClass(), "parent", null);
        setField(term1008894, term1008894.getClass(), "appContext", null);
        setIntField(term1008894, term1008894.getClass(), "x", 0);
        setIntField(term1008894, term1008894.getClass(), "y", 0);
        setIntField(term1008894, term1008894.getClass(), "width", 0);
        setIntField(term1008894, term1008894.getClass(), "height", 0);
        setField(term1008894, term1008894.getClass(), "foreground", null);
        setField(term1008894, term1008894.getClass(), "background", null);
        setField(term1008894, term1008894.getClass(), "font", null);
        setField(term1008894, term1008894.getClass(), "peerFont", null);
        setField(term1008894, term1008894.getClass(), "cursor", null);
        setField(term1008894, term1008894.getClass(), "locale", null);
        setField(term1008894, term1008894.getClass(), "graphicsConfig", null);
        setField(term1008894, term1008894.getClass(), "bufferStrategy", null);
        setBooleanField(term1008894, term1008894.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008894, term1008894.getClass(), "visible", false);
        setBooleanField(term1008894, term1008894.getClass(), "enabled", false);
        setBooleanField(term1008894, term1008894.getClass(), "valid", false);
        setField(term1008894, term1008894.getClass(), "dropTarget", null);
        setField(term1008894, term1008894.getClass(), "popups", null);
        setField(term1008894, term1008894.getClass(), "name", null);
        setBooleanField(term1008894, term1008894.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008894, term1008894.getClass(), "focusable", false);
        setIntField(term1008894, term1008894.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008894, term1008894.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008894, term1008894.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008894, term1008894.getClass(), "acc", null);
        setField(term1008894, term1008894.getClass(), "minSize", null);
        setBooleanField(term1008894, term1008894.getClass(), "minSizeSet", false);
        setField(term1008894, term1008894.getClass(), "prefSize", null);
        setBooleanField(term1008894, term1008894.getClass(), "prefSizeSet", false);
        setField(term1008894, term1008894.getClass(), "maxSize", null);
        setBooleanField(term1008894, term1008894.getClass(), "maxSizeSet", false);
        setField(term1008894, term1008894.getClass(), "componentOrientation", null);
        setBooleanField(term1008894, term1008894.getClass(), "newEventsOnly", false);
        setField(term1008894, term1008894.getClass(), "componentListener", null);
        setField(term1008894, term1008894.getClass(), "focusListener", null);
        setField(term1008894, term1008894.getClass(), "hierarchyListener", null);
        setField(term1008894, term1008894.getClass(), "hierarchyBoundsListener", null);
        setField(term1008894, term1008894.getClass(), "keyListener", null);
        setField(term1008894, term1008894.getClass(), "mouseListener", null);
        setField(term1008894, term1008894.getClass(), "mouseMotionListener", null);
        setField(term1008894, term1008894.getClass(), "mouseWheelListener", null);
        setField(term1008894, term1008894.getClass(), "inputMethodListener", null);
        setLongField(term1008894, term1008894.getClass(), "eventMask", 0L);
        setField(term1008894, term1008894.getClass(), "changeSupport", null);
        setField(term1008894, term1008894.getClass(), "objectLock", null);
        setBooleanField(term1008894, term1008894.getClass(), "isPacked", false);
        setIntField(term1008894, term1008894.getClass(), "boundsOp", 0);
        setField(term1008894, term1008894.getClass(), "compoundShape", null);
        setField(term1008894, term1008894.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008894, term1008894.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008894, term1008894.getClass(), "backgroundEraseDisabled", false);
        setField(term1008894, term1008894.getClass(), "eventCache", null);
        setBooleanField(term1008894, term1008894.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008894, term1008894.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008894, term1008894.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008894, term1008894.getClass(), "accessibleContext", null);
        term1008937 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1008937;
        callMethod(klass, "changeTurn", argTypes, term1008894, args);
    }

};


