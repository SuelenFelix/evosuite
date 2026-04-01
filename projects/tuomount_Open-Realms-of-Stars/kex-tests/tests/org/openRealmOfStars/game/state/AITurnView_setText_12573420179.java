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

public class AITurnView_setText_12573420179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377632;

    public AITurnView_setText_12573420179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377632 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377632, term1377632.getClass(), "label", null);
        setField(term1377632, term1377632.getClass(), "game", null);
        setIntField(term1377632, term1377632.getClass(), "textAnim", 0);
        setIntField(term1377632, term1377632.getClass(), "cx", 0);
        setIntField(term1377632, term1377632.getClass(), "cy", 0);
        setField(term1377632, term1377632.getClass(), "aiThread", null);
        setBooleanField(term1377632, term1377632.getClass(), "readyToMove", false);
        setField(term1377632, term1377632.getClass(), "nextState", null);
        setField(term1377632, term1377632.getClass(), "nextStateObject", null);
        setBooleanField(term1377632, term1377632.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377632, term1377632.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377632, term1377632.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377632, term1377632.getClass(), "alignmentY", 0.0F);
        setField(term1377632, term1377632.getClass(), "ui", null);
        setField(term1377632, term1377632.getClass(), "listenerList", null);
        setField(term1377632, term1377632.getClass(), "clientProperties", null);
        setField(term1377632, term1377632.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377632, term1377632.getClass(), "autoscrolls", false);
        setField(term1377632, term1377632.getClass(), "border", null);
        setIntField(term1377632, term1377632.getClass(), "flags", 0);
        setField(term1377632, term1377632.getClass(), "inputVerifier", null);
        setBooleanField(term1377632, term1377632.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377632, term1377632.getClass(), "paintingChild", null);
        setField(term1377632, term1377632.getClass(), "popupMenu", null);
        setField(term1377632, term1377632.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377632, term1377632.getClass(), "focusInputMap", null);
        setField(term1377632, term1377632.getClass(), "ancestorInputMap", null);
        setField(term1377632, term1377632.getClass(), "windowInputMap", null);
        setField(term1377632, term1377632.getClass(), "actionMap", null);
        setField(term1377632, term1377632.getClass(), "aaHint", null);
        setField(term1377632, term1377632.getClass(), "lcdRenderingHint", null);
        setField(term1377632, term1377632.getClass(), "component", null);
        setField(term1377632, term1377632.getClass(), "layoutMgr", null);
        setField(term1377632, term1377632.getClass(), "dispatcher", null);
        setField(term1377632, term1377632.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377632, term1377632.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377632, term1377632.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377632, term1377632.getClass(), "printingThreads", null);
        setBooleanField(term1377632, term1377632.getClass(), "printing", false);
        setField(term1377632, term1377632.getClass(), "containerListener", null);
        setIntField(term1377632, term1377632.getClass(), "listeningChildren", 0);
        setIntField(term1377632, term1377632.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377632, term1377632.getClass(), "descendantsCount", 0);
        setField(term1377632, term1377632.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377632, term1377632.getClass(), "numOfHWComponents", 0);
        setIntField(term1377632, term1377632.getClass(), "numOfLWComponents", 0);
        setField(term1377632, term1377632.getClass(), "modalComp", null);
        setField(term1377632, term1377632.getClass(), "modalAppContext", null);
        setIntField(term1377632, term1377632.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377632, term1377632.getClass(), "peer", null);
        setField(term1377632, term1377632.getClass(), "parent", null);
        setField(term1377632, term1377632.getClass(), "appContext", null);
        setIntField(term1377632, term1377632.getClass(), "x", 0);
        setIntField(term1377632, term1377632.getClass(), "y", 0);
        setIntField(term1377632, term1377632.getClass(), "width", 0);
        setIntField(term1377632, term1377632.getClass(), "height", 0);
        setField(term1377632, term1377632.getClass(), "foreground", null);
        setField(term1377632, term1377632.getClass(), "background", null);
        setField(term1377632, term1377632.getClass(), "font", null);
        setField(term1377632, term1377632.getClass(), "peerFont", null);
        setField(term1377632, term1377632.getClass(), "cursor", null);
        setField(term1377632, term1377632.getClass(), "locale", null);
        setField(term1377632, term1377632.getClass(), "graphicsConfig", null);
        setField(term1377632, term1377632.getClass(), "bufferStrategy", null);
        setBooleanField(term1377632, term1377632.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377632, term1377632.getClass(), "visible", false);
        setBooleanField(term1377632, term1377632.getClass(), "enabled", false);
        setBooleanField(term1377632, term1377632.getClass(), "valid", false);
        setField(term1377632, term1377632.getClass(), "dropTarget", null);
        setField(term1377632, term1377632.getClass(), "popups", null);
        setField(term1377632, term1377632.getClass(), "name", null);
        setBooleanField(term1377632, term1377632.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377632, term1377632.getClass(), "focusable", false);
        setIntField(term1377632, term1377632.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377632, term1377632.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377632, term1377632.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377632, term1377632.getClass(), "acc", null);
        setField(term1377632, term1377632.getClass(), "minSize", null);
        setBooleanField(term1377632, term1377632.getClass(), "minSizeSet", false);
        setField(term1377632, term1377632.getClass(), "prefSize", null);
        setBooleanField(term1377632, term1377632.getClass(), "prefSizeSet", false);
        setField(term1377632, term1377632.getClass(), "maxSize", null);
        setBooleanField(term1377632, term1377632.getClass(), "maxSizeSet", false);
        setField(term1377632, term1377632.getClass(), "componentOrientation", null);
        setBooleanField(term1377632, term1377632.getClass(), "newEventsOnly", false);
        setField(term1377632, term1377632.getClass(), "componentListener", null);
        setField(term1377632, term1377632.getClass(), "focusListener", null);
        setField(term1377632, term1377632.getClass(), "hierarchyListener", null);
        setField(term1377632, term1377632.getClass(), "hierarchyBoundsListener", null);
        setField(term1377632, term1377632.getClass(), "keyListener", null);
        setField(term1377632, term1377632.getClass(), "mouseListener", null);
        setField(term1377632, term1377632.getClass(), "mouseMotionListener", null);
        setField(term1377632, term1377632.getClass(), "mouseWheelListener", null);
        setField(term1377632, term1377632.getClass(), "inputMethodListener", null);
        setLongField(term1377632, term1377632.getClass(), "eventMask", 0L);
        setField(term1377632, term1377632.getClass(), "changeSupport", null);
        setField(term1377632, term1377632.getClass(), "objectLock", null);
        setBooleanField(term1377632, term1377632.getClass(), "isPacked", false);
        setIntField(term1377632, term1377632.getClass(), "boundsOp", 0);
        setField(term1377632, term1377632.getClass(), "compoundShape", null);
        setField(term1377632, term1377632.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377632, term1377632.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377632, term1377632.getClass(), "backgroundEraseDisabled", false);
        setField(term1377632, term1377632.getClass(), "eventCache", null);
        setBooleanField(term1377632, term1377632.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377632, term1377632.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377632, term1377632.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377632, term1377632.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term1377632, args);
    }

};


