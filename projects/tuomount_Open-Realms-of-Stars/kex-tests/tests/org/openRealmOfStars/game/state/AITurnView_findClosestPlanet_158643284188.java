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

public class AITurnView_findClosestPlanet_158643284188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378037;

    public AITurnView_findClosestPlanet_158643284188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378037 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378037, term1378037.getClass(), "label", null);
        setField(term1378037, term1378037.getClass(), "game", null);
        setIntField(term1378037, term1378037.getClass(), "textAnim", 0);
        setIntField(term1378037, term1378037.getClass(), "cx", 0);
        setIntField(term1378037, term1378037.getClass(), "cy", 0);
        setField(term1378037, term1378037.getClass(), "aiThread", null);
        setBooleanField(term1378037, term1378037.getClass(), "readyToMove", false);
        setField(term1378037, term1378037.getClass(), "nextState", null);
        setField(term1378037, term1378037.getClass(), "nextStateObject", null);
        setBooleanField(term1378037, term1378037.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378037, term1378037.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378037, term1378037.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378037, term1378037.getClass(), "alignmentY", 0.0F);
        setField(term1378037, term1378037.getClass(), "ui", null);
        setField(term1378037, term1378037.getClass(), "listenerList", null);
        setField(term1378037, term1378037.getClass(), "clientProperties", null);
        setField(term1378037, term1378037.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378037, term1378037.getClass(), "autoscrolls", false);
        setField(term1378037, term1378037.getClass(), "border", null);
        setIntField(term1378037, term1378037.getClass(), "flags", 0);
        setField(term1378037, term1378037.getClass(), "inputVerifier", null);
        setBooleanField(term1378037, term1378037.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378037, term1378037.getClass(), "paintingChild", null);
        setField(term1378037, term1378037.getClass(), "popupMenu", null);
        setField(term1378037, term1378037.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378037, term1378037.getClass(), "focusInputMap", null);
        setField(term1378037, term1378037.getClass(), "ancestorInputMap", null);
        setField(term1378037, term1378037.getClass(), "windowInputMap", null);
        setField(term1378037, term1378037.getClass(), "actionMap", null);
        setField(term1378037, term1378037.getClass(), "aaHint", null);
        setField(term1378037, term1378037.getClass(), "lcdRenderingHint", null);
        setField(term1378037, term1378037.getClass(), "component", null);
        setField(term1378037, term1378037.getClass(), "layoutMgr", null);
        setField(term1378037, term1378037.getClass(), "dispatcher", null);
        setField(term1378037, term1378037.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378037, term1378037.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378037, term1378037.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378037, term1378037.getClass(), "printingThreads", null);
        setBooleanField(term1378037, term1378037.getClass(), "printing", false);
        setField(term1378037, term1378037.getClass(), "containerListener", null);
        setIntField(term1378037, term1378037.getClass(), "listeningChildren", 0);
        setIntField(term1378037, term1378037.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378037, term1378037.getClass(), "descendantsCount", 0);
        setField(term1378037, term1378037.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378037, term1378037.getClass(), "numOfHWComponents", 0);
        setIntField(term1378037, term1378037.getClass(), "numOfLWComponents", 0);
        setField(term1378037, term1378037.getClass(), "modalComp", null);
        setField(term1378037, term1378037.getClass(), "modalAppContext", null);
        setIntField(term1378037, term1378037.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378037, term1378037.getClass(), "peer", null);
        setField(term1378037, term1378037.getClass(), "parent", null);
        setField(term1378037, term1378037.getClass(), "appContext", null);
        setIntField(term1378037, term1378037.getClass(), "x", 0);
        setIntField(term1378037, term1378037.getClass(), "y", 0);
        setIntField(term1378037, term1378037.getClass(), "width", 0);
        setIntField(term1378037, term1378037.getClass(), "height", 0);
        setField(term1378037, term1378037.getClass(), "foreground", null);
        setField(term1378037, term1378037.getClass(), "background", null);
        setField(term1378037, term1378037.getClass(), "font", null);
        setField(term1378037, term1378037.getClass(), "peerFont", null);
        setField(term1378037, term1378037.getClass(), "cursor", null);
        setField(term1378037, term1378037.getClass(), "locale", null);
        setField(term1378037, term1378037.getClass(), "graphicsConfig", null);
        setField(term1378037, term1378037.getClass(), "bufferStrategy", null);
        setBooleanField(term1378037, term1378037.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378037, term1378037.getClass(), "visible", false);
        setBooleanField(term1378037, term1378037.getClass(), "enabled", false);
        setBooleanField(term1378037, term1378037.getClass(), "valid", false);
        setField(term1378037, term1378037.getClass(), "dropTarget", null);
        setField(term1378037, term1378037.getClass(), "popups", null);
        setField(term1378037, term1378037.getClass(), "name", null);
        setBooleanField(term1378037, term1378037.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378037, term1378037.getClass(), "focusable", false);
        setIntField(term1378037, term1378037.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378037, term1378037.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378037, term1378037.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378037, term1378037.getClass(), "acc", null);
        setField(term1378037, term1378037.getClass(), "minSize", null);
        setBooleanField(term1378037, term1378037.getClass(), "minSizeSet", false);
        setField(term1378037, term1378037.getClass(), "prefSize", null);
        setBooleanField(term1378037, term1378037.getClass(), "prefSizeSet", false);
        setField(term1378037, term1378037.getClass(), "maxSize", null);
        setBooleanField(term1378037, term1378037.getClass(), "maxSizeSet", false);
        setField(term1378037, term1378037.getClass(), "componentOrientation", null);
        setBooleanField(term1378037, term1378037.getClass(), "newEventsOnly", false);
        setField(term1378037, term1378037.getClass(), "componentListener", null);
        setField(term1378037, term1378037.getClass(), "focusListener", null);
        setField(term1378037, term1378037.getClass(), "hierarchyListener", null);
        setField(term1378037, term1378037.getClass(), "hierarchyBoundsListener", null);
        setField(term1378037, term1378037.getClass(), "keyListener", null);
        setField(term1378037, term1378037.getClass(), "mouseListener", null);
        setField(term1378037, term1378037.getClass(), "mouseMotionListener", null);
        setField(term1378037, term1378037.getClass(), "mouseWheelListener", null);
        setField(term1378037, term1378037.getClass(), "inputMethodListener", null);
        setLongField(term1378037, term1378037.getClass(), "eventMask", 0L);
        setField(term1378037, term1378037.getClass(), "changeSupport", null);
        setField(term1378037, term1378037.getClass(), "objectLock", null);
        setBooleanField(term1378037, term1378037.getClass(), "isPacked", false);
        setIntField(term1378037, term1378037.getClass(), "boundsOp", 0);
        setField(term1378037, term1378037.getClass(), "compoundShape", null);
        setField(term1378037, term1378037.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378037, term1378037.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378037, term1378037.getClass(), "backgroundEraseDisabled", false);
        setField(term1378037, term1378037.getClass(), "eventCache", null);
        setBooleanField(term1378037, term1378037.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378037, term1378037.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378037, term1378037.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378037, term1378037.getClass(), "accessibleContext", null);
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
        callMethod(klass, "findClosestPlanet", argTypes, term1378037, args);
    }

};


