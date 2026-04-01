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

public class HistoryView_getTurn_204047915714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008982;

    public HistoryView_getTurn_204047915714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008982 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008982, term1008982.getClass(), "map", null);
        setField(term1008982, term1008982.getClass(), "mapPanel", null);
        setField(term1008982, term1008982.getClass(), "textArea", null);
        setField(term1008982, term1008982.getClass(), "turnLabel", null);
        setIntField(term1008982, term1008982.getClass(), "turnNumber", 0);
        setIntField(term1008982, term1008982.getClass(), "eventNumber", 0);
        setField(term1008982, term1008982.getClass(), "targetCoordinate", null);
        setBooleanField(term1008982, term1008982.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008982, term1008982.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008982, term1008982.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008982, term1008982.getClass(), "alignmentY", 0.0F);
        setField(term1008982, term1008982.getClass(), "ui", null);
        setField(term1008982, term1008982.getClass(), "listenerList", null);
        setField(term1008982, term1008982.getClass(), "clientProperties", null);
        setField(term1008982, term1008982.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008982, term1008982.getClass(), "autoscrolls", false);
        setField(term1008982, term1008982.getClass(), "border", null);
        setIntField(term1008982, term1008982.getClass(), "flags", 0);
        setField(term1008982, term1008982.getClass(), "inputVerifier", null);
        setBooleanField(term1008982, term1008982.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008982, term1008982.getClass(), "paintingChild", null);
        setField(term1008982, term1008982.getClass(), "popupMenu", null);
        setField(term1008982, term1008982.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008982, term1008982.getClass(), "focusInputMap", null);
        setField(term1008982, term1008982.getClass(), "ancestorInputMap", null);
        setField(term1008982, term1008982.getClass(), "windowInputMap", null);
        setField(term1008982, term1008982.getClass(), "actionMap", null);
        setField(term1008982, term1008982.getClass(), "aaHint", null);
        setField(term1008982, term1008982.getClass(), "lcdRenderingHint", null);
        setField(term1008982, term1008982.getClass(), "component", null);
        setField(term1008982, term1008982.getClass(), "layoutMgr", null);
        setField(term1008982, term1008982.getClass(), "dispatcher", null);
        setField(term1008982, term1008982.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008982, term1008982.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008982, term1008982.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008982, term1008982.getClass(), "printingThreads", null);
        setBooleanField(term1008982, term1008982.getClass(), "printing", false);
        setField(term1008982, term1008982.getClass(), "containerListener", null);
        setIntField(term1008982, term1008982.getClass(), "listeningChildren", 0);
        setIntField(term1008982, term1008982.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008982, term1008982.getClass(), "descendantsCount", 0);
        setField(term1008982, term1008982.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008982, term1008982.getClass(), "numOfHWComponents", 0);
        setIntField(term1008982, term1008982.getClass(), "numOfLWComponents", 0);
        setField(term1008982, term1008982.getClass(), "modalComp", null);
        setField(term1008982, term1008982.getClass(), "modalAppContext", null);
        setIntField(term1008982, term1008982.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008982, term1008982.getClass(), "peer", null);
        setField(term1008982, term1008982.getClass(), "parent", null);
        setField(term1008982, term1008982.getClass(), "appContext", null);
        setIntField(term1008982, term1008982.getClass(), "x", 0);
        setIntField(term1008982, term1008982.getClass(), "y", 0);
        setIntField(term1008982, term1008982.getClass(), "width", 0);
        setIntField(term1008982, term1008982.getClass(), "height", 0);
        setField(term1008982, term1008982.getClass(), "foreground", null);
        setField(term1008982, term1008982.getClass(), "background", null);
        setField(term1008982, term1008982.getClass(), "font", null);
        setField(term1008982, term1008982.getClass(), "peerFont", null);
        setField(term1008982, term1008982.getClass(), "cursor", null);
        setField(term1008982, term1008982.getClass(), "locale", null);
        setField(term1008982, term1008982.getClass(), "graphicsConfig", null);
        setField(term1008982, term1008982.getClass(), "bufferStrategy", null);
        setBooleanField(term1008982, term1008982.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008982, term1008982.getClass(), "visible", false);
        setBooleanField(term1008982, term1008982.getClass(), "enabled", false);
        setBooleanField(term1008982, term1008982.getClass(), "valid", false);
        setField(term1008982, term1008982.getClass(), "dropTarget", null);
        setField(term1008982, term1008982.getClass(), "popups", null);
        setField(term1008982, term1008982.getClass(), "name", null);
        setBooleanField(term1008982, term1008982.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008982, term1008982.getClass(), "focusable", false);
        setIntField(term1008982, term1008982.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008982, term1008982.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008982, term1008982.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008982, term1008982.getClass(), "acc", null);
        setField(term1008982, term1008982.getClass(), "minSize", null);
        setBooleanField(term1008982, term1008982.getClass(), "minSizeSet", false);
        setField(term1008982, term1008982.getClass(), "prefSize", null);
        setBooleanField(term1008982, term1008982.getClass(), "prefSizeSet", false);
        setField(term1008982, term1008982.getClass(), "maxSize", null);
        setBooleanField(term1008982, term1008982.getClass(), "maxSizeSet", false);
        setField(term1008982, term1008982.getClass(), "componentOrientation", null);
        setBooleanField(term1008982, term1008982.getClass(), "newEventsOnly", false);
        setField(term1008982, term1008982.getClass(), "componentListener", null);
        setField(term1008982, term1008982.getClass(), "focusListener", null);
        setField(term1008982, term1008982.getClass(), "hierarchyListener", null);
        setField(term1008982, term1008982.getClass(), "hierarchyBoundsListener", null);
        setField(term1008982, term1008982.getClass(), "keyListener", null);
        setField(term1008982, term1008982.getClass(), "mouseListener", null);
        setField(term1008982, term1008982.getClass(), "mouseMotionListener", null);
        setField(term1008982, term1008982.getClass(), "mouseWheelListener", null);
        setField(term1008982, term1008982.getClass(), "inputMethodListener", null);
        setLongField(term1008982, term1008982.getClass(), "eventMask", 0L);
        setField(term1008982, term1008982.getClass(), "changeSupport", null);
        setField(term1008982, term1008982.getClass(), "objectLock", null);
        setBooleanField(term1008982, term1008982.getClass(), "isPacked", false);
        setIntField(term1008982, term1008982.getClass(), "boundsOp", 0);
        setField(term1008982, term1008982.getClass(), "compoundShape", null);
        setField(term1008982, term1008982.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008982, term1008982.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008982, term1008982.getClass(), "backgroundEraseDisabled", false);
        setField(term1008982, term1008982.getClass(), "eventCache", null);
        setBooleanField(term1008982, term1008982.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008982, term1008982.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008982, term1008982.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008982, term1008982.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurn", argTypes, term1008982, args);
    }

};


