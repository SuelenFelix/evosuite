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

public class AITurnView_findClosestCoordinate_13285231283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377812;

    public AITurnView_findClosestCoordinate_13285231283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377812 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377812, term1377812.getClass(), "label", null);
        setField(term1377812, term1377812.getClass(), "game", null);
        setIntField(term1377812, term1377812.getClass(), "textAnim", 0);
        setIntField(term1377812, term1377812.getClass(), "cx", 0);
        setIntField(term1377812, term1377812.getClass(), "cy", 0);
        setField(term1377812, term1377812.getClass(), "aiThread", null);
        setBooleanField(term1377812, term1377812.getClass(), "readyToMove", false);
        setField(term1377812, term1377812.getClass(), "nextState", null);
        setField(term1377812, term1377812.getClass(), "nextStateObject", null);
        setBooleanField(term1377812, term1377812.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377812, term1377812.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377812, term1377812.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377812, term1377812.getClass(), "alignmentY", 0.0F);
        setField(term1377812, term1377812.getClass(), "ui", null);
        setField(term1377812, term1377812.getClass(), "listenerList", null);
        setField(term1377812, term1377812.getClass(), "clientProperties", null);
        setField(term1377812, term1377812.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377812, term1377812.getClass(), "autoscrolls", false);
        setField(term1377812, term1377812.getClass(), "border", null);
        setIntField(term1377812, term1377812.getClass(), "flags", 0);
        setField(term1377812, term1377812.getClass(), "inputVerifier", null);
        setBooleanField(term1377812, term1377812.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377812, term1377812.getClass(), "paintingChild", null);
        setField(term1377812, term1377812.getClass(), "popupMenu", null);
        setField(term1377812, term1377812.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377812, term1377812.getClass(), "focusInputMap", null);
        setField(term1377812, term1377812.getClass(), "ancestorInputMap", null);
        setField(term1377812, term1377812.getClass(), "windowInputMap", null);
        setField(term1377812, term1377812.getClass(), "actionMap", null);
        setField(term1377812, term1377812.getClass(), "aaHint", null);
        setField(term1377812, term1377812.getClass(), "lcdRenderingHint", null);
        setField(term1377812, term1377812.getClass(), "component", null);
        setField(term1377812, term1377812.getClass(), "layoutMgr", null);
        setField(term1377812, term1377812.getClass(), "dispatcher", null);
        setField(term1377812, term1377812.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377812, term1377812.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377812, term1377812.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377812, term1377812.getClass(), "printingThreads", null);
        setBooleanField(term1377812, term1377812.getClass(), "printing", false);
        setField(term1377812, term1377812.getClass(), "containerListener", null);
        setIntField(term1377812, term1377812.getClass(), "listeningChildren", 0);
        setIntField(term1377812, term1377812.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377812, term1377812.getClass(), "descendantsCount", 0);
        setField(term1377812, term1377812.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377812, term1377812.getClass(), "numOfHWComponents", 0);
        setIntField(term1377812, term1377812.getClass(), "numOfLWComponents", 0);
        setField(term1377812, term1377812.getClass(), "modalComp", null);
        setField(term1377812, term1377812.getClass(), "modalAppContext", null);
        setIntField(term1377812, term1377812.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377812, term1377812.getClass(), "peer", null);
        setField(term1377812, term1377812.getClass(), "parent", null);
        setField(term1377812, term1377812.getClass(), "appContext", null);
        setIntField(term1377812, term1377812.getClass(), "x", 0);
        setIntField(term1377812, term1377812.getClass(), "y", 0);
        setIntField(term1377812, term1377812.getClass(), "width", 0);
        setIntField(term1377812, term1377812.getClass(), "height", 0);
        setField(term1377812, term1377812.getClass(), "foreground", null);
        setField(term1377812, term1377812.getClass(), "background", null);
        setField(term1377812, term1377812.getClass(), "font", null);
        setField(term1377812, term1377812.getClass(), "peerFont", null);
        setField(term1377812, term1377812.getClass(), "cursor", null);
        setField(term1377812, term1377812.getClass(), "locale", null);
        setField(term1377812, term1377812.getClass(), "graphicsConfig", null);
        setField(term1377812, term1377812.getClass(), "bufferStrategy", null);
        setBooleanField(term1377812, term1377812.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377812, term1377812.getClass(), "visible", false);
        setBooleanField(term1377812, term1377812.getClass(), "enabled", false);
        setBooleanField(term1377812, term1377812.getClass(), "valid", false);
        setField(term1377812, term1377812.getClass(), "dropTarget", null);
        setField(term1377812, term1377812.getClass(), "popups", null);
        setField(term1377812, term1377812.getClass(), "name", null);
        setBooleanField(term1377812, term1377812.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377812, term1377812.getClass(), "focusable", false);
        setIntField(term1377812, term1377812.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377812, term1377812.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377812, term1377812.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377812, term1377812.getClass(), "acc", null);
        setField(term1377812, term1377812.getClass(), "minSize", null);
        setBooleanField(term1377812, term1377812.getClass(), "minSizeSet", false);
        setField(term1377812, term1377812.getClass(), "prefSize", null);
        setBooleanField(term1377812, term1377812.getClass(), "prefSizeSet", false);
        setField(term1377812, term1377812.getClass(), "maxSize", null);
        setBooleanField(term1377812, term1377812.getClass(), "maxSizeSet", false);
        setField(term1377812, term1377812.getClass(), "componentOrientation", null);
        setBooleanField(term1377812, term1377812.getClass(), "newEventsOnly", false);
        setField(term1377812, term1377812.getClass(), "componentListener", null);
        setField(term1377812, term1377812.getClass(), "focusListener", null);
        setField(term1377812, term1377812.getClass(), "hierarchyListener", null);
        setField(term1377812, term1377812.getClass(), "hierarchyBoundsListener", null);
        setField(term1377812, term1377812.getClass(), "keyListener", null);
        setField(term1377812, term1377812.getClass(), "mouseListener", null);
        setField(term1377812, term1377812.getClass(), "mouseMotionListener", null);
        setField(term1377812, term1377812.getClass(), "mouseWheelListener", null);
        setField(term1377812, term1377812.getClass(), "inputMethodListener", null);
        setLongField(term1377812, term1377812.getClass(), "eventMask", 0L);
        setField(term1377812, term1377812.getClass(), "changeSupport", null);
        setField(term1377812, term1377812.getClass(), "objectLock", null);
        setBooleanField(term1377812, term1377812.getClass(), "isPacked", false);
        setIntField(term1377812, term1377812.getClass(), "boundsOp", 0);
        setField(term1377812, term1377812.getClass(), "compoundShape", null);
        setField(term1377812, term1377812.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377812, term1377812.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377812, term1377812.getClass(), "backgroundEraseDisabled", false);
        setField(term1377812, term1377812.getClass(), "eventCache", null);
        setBooleanField(term1377812, term1377812.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377812, term1377812.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377812, term1377812.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377812, term1377812.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "findClosestCoordinate", argTypes, term1377812, args);
    }

};


