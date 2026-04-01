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

public class HistoryView_getSpaceSectorOwner_13372134110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008808;

    public HistoryView_getSpaceSectorOwner_13372134110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008808 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008808, term1008808.getClass(), "map", null);
        setField(term1008808, term1008808.getClass(), "mapPanel", null);
        setField(term1008808, term1008808.getClass(), "textArea", null);
        setField(term1008808, term1008808.getClass(), "turnLabel", null);
        setIntField(term1008808, term1008808.getClass(), "turnNumber", 0);
        setIntField(term1008808, term1008808.getClass(), "eventNumber", 0);
        setField(term1008808, term1008808.getClass(), "targetCoordinate", null);
        setBooleanField(term1008808, term1008808.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008808, term1008808.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008808, term1008808.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008808, term1008808.getClass(), "alignmentY", 0.0F);
        setField(term1008808, term1008808.getClass(), "ui", null);
        setField(term1008808, term1008808.getClass(), "listenerList", null);
        setField(term1008808, term1008808.getClass(), "clientProperties", null);
        setField(term1008808, term1008808.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008808, term1008808.getClass(), "autoscrolls", false);
        setField(term1008808, term1008808.getClass(), "border", null);
        setIntField(term1008808, term1008808.getClass(), "flags", 0);
        setField(term1008808, term1008808.getClass(), "inputVerifier", null);
        setBooleanField(term1008808, term1008808.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008808, term1008808.getClass(), "paintingChild", null);
        setField(term1008808, term1008808.getClass(), "popupMenu", null);
        setField(term1008808, term1008808.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008808, term1008808.getClass(), "focusInputMap", null);
        setField(term1008808, term1008808.getClass(), "ancestorInputMap", null);
        setField(term1008808, term1008808.getClass(), "windowInputMap", null);
        setField(term1008808, term1008808.getClass(), "actionMap", null);
        setField(term1008808, term1008808.getClass(), "aaHint", null);
        setField(term1008808, term1008808.getClass(), "lcdRenderingHint", null);
        setField(term1008808, term1008808.getClass(), "component", null);
        setField(term1008808, term1008808.getClass(), "layoutMgr", null);
        setField(term1008808, term1008808.getClass(), "dispatcher", null);
        setField(term1008808, term1008808.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008808, term1008808.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008808, term1008808.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008808, term1008808.getClass(), "printingThreads", null);
        setBooleanField(term1008808, term1008808.getClass(), "printing", false);
        setField(term1008808, term1008808.getClass(), "containerListener", null);
        setIntField(term1008808, term1008808.getClass(), "listeningChildren", 0);
        setIntField(term1008808, term1008808.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008808, term1008808.getClass(), "descendantsCount", 0);
        setField(term1008808, term1008808.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008808, term1008808.getClass(), "numOfHWComponents", 0);
        setIntField(term1008808, term1008808.getClass(), "numOfLWComponents", 0);
        setField(term1008808, term1008808.getClass(), "modalComp", null);
        setField(term1008808, term1008808.getClass(), "modalAppContext", null);
        setIntField(term1008808, term1008808.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008808, term1008808.getClass(), "peer", null);
        setField(term1008808, term1008808.getClass(), "parent", null);
        setField(term1008808, term1008808.getClass(), "appContext", null);
        setIntField(term1008808, term1008808.getClass(), "x", 0);
        setIntField(term1008808, term1008808.getClass(), "y", 0);
        setIntField(term1008808, term1008808.getClass(), "width", 0);
        setIntField(term1008808, term1008808.getClass(), "height", 0);
        setField(term1008808, term1008808.getClass(), "foreground", null);
        setField(term1008808, term1008808.getClass(), "background", null);
        setField(term1008808, term1008808.getClass(), "font", null);
        setField(term1008808, term1008808.getClass(), "peerFont", null);
        setField(term1008808, term1008808.getClass(), "cursor", null);
        setField(term1008808, term1008808.getClass(), "locale", null);
        setField(term1008808, term1008808.getClass(), "graphicsConfig", null);
        setField(term1008808, term1008808.getClass(), "bufferStrategy", null);
        setBooleanField(term1008808, term1008808.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008808, term1008808.getClass(), "visible", false);
        setBooleanField(term1008808, term1008808.getClass(), "enabled", false);
        setBooleanField(term1008808, term1008808.getClass(), "valid", false);
        setField(term1008808, term1008808.getClass(), "dropTarget", null);
        setField(term1008808, term1008808.getClass(), "popups", null);
        setField(term1008808, term1008808.getClass(), "name", null);
        setBooleanField(term1008808, term1008808.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008808, term1008808.getClass(), "focusable", false);
        setIntField(term1008808, term1008808.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008808, term1008808.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008808, term1008808.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008808, term1008808.getClass(), "acc", null);
        setField(term1008808, term1008808.getClass(), "minSize", null);
        setBooleanField(term1008808, term1008808.getClass(), "minSizeSet", false);
        setField(term1008808, term1008808.getClass(), "prefSize", null);
        setBooleanField(term1008808, term1008808.getClass(), "prefSizeSet", false);
        setField(term1008808, term1008808.getClass(), "maxSize", null);
        setBooleanField(term1008808, term1008808.getClass(), "maxSizeSet", false);
        setField(term1008808, term1008808.getClass(), "componentOrientation", null);
        setBooleanField(term1008808, term1008808.getClass(), "newEventsOnly", false);
        setField(term1008808, term1008808.getClass(), "componentListener", null);
        setField(term1008808, term1008808.getClass(), "focusListener", null);
        setField(term1008808, term1008808.getClass(), "hierarchyListener", null);
        setField(term1008808, term1008808.getClass(), "hierarchyBoundsListener", null);
        setField(term1008808, term1008808.getClass(), "keyListener", null);
        setField(term1008808, term1008808.getClass(), "mouseListener", null);
        setField(term1008808, term1008808.getClass(), "mouseMotionListener", null);
        setField(term1008808, term1008808.getClass(), "mouseWheelListener", null);
        setField(term1008808, term1008808.getClass(), "inputMethodListener", null);
        setLongField(term1008808, term1008808.getClass(), "eventMask", 0L);
        setField(term1008808, term1008808.getClass(), "changeSupport", null);
        setField(term1008808, term1008808.getClass(), "objectLock", null);
        setBooleanField(term1008808, term1008808.getClass(), "isPacked", false);
        setIntField(term1008808, term1008808.getClass(), "boundsOp", 0);
        setField(term1008808, term1008808.getClass(), "compoundShape", null);
        setField(term1008808, term1008808.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008808, term1008808.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008808, term1008808.getClass(), "backgroundEraseDisabled", false);
        setField(term1008808, term1008808.getClass(), "eventCache", null);
        setBooleanField(term1008808, term1008808.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008808, term1008808.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008808, term1008808.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008808, term1008808.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSpaceSectorOwner", argTypes, term1008808, args);
    }

};


