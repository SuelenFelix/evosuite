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

public class AITurnView_isThreaded_656785452108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378939;

    public AITurnView_isThreaded_656785452108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378939 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378939, term1378939.getClass(), "label", null);
        setField(term1378939, term1378939.getClass(), "game", null);
        setIntField(term1378939, term1378939.getClass(), "textAnim", 0);
        setIntField(term1378939, term1378939.getClass(), "cx", 0);
        setIntField(term1378939, term1378939.getClass(), "cy", 0);
        setField(term1378939, term1378939.getClass(), "aiThread", null);
        setBooleanField(term1378939, term1378939.getClass(), "readyToMove", false);
        setField(term1378939, term1378939.getClass(), "nextState", null);
        setField(term1378939, term1378939.getClass(), "nextStateObject", null);
        setBooleanField(term1378939, term1378939.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378939, term1378939.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378939, term1378939.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378939, term1378939.getClass(), "alignmentY", 0.0F);
        setField(term1378939, term1378939.getClass(), "ui", null);
        setField(term1378939, term1378939.getClass(), "listenerList", null);
        setField(term1378939, term1378939.getClass(), "clientProperties", null);
        setField(term1378939, term1378939.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378939, term1378939.getClass(), "autoscrolls", false);
        setField(term1378939, term1378939.getClass(), "border", null);
        setIntField(term1378939, term1378939.getClass(), "flags", 0);
        setField(term1378939, term1378939.getClass(), "inputVerifier", null);
        setBooleanField(term1378939, term1378939.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378939, term1378939.getClass(), "paintingChild", null);
        setField(term1378939, term1378939.getClass(), "popupMenu", null);
        setField(term1378939, term1378939.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378939, term1378939.getClass(), "focusInputMap", null);
        setField(term1378939, term1378939.getClass(), "ancestorInputMap", null);
        setField(term1378939, term1378939.getClass(), "windowInputMap", null);
        setField(term1378939, term1378939.getClass(), "actionMap", null);
        setField(term1378939, term1378939.getClass(), "aaHint", null);
        setField(term1378939, term1378939.getClass(), "lcdRenderingHint", null);
        setField(term1378939, term1378939.getClass(), "component", null);
        setField(term1378939, term1378939.getClass(), "layoutMgr", null);
        setField(term1378939, term1378939.getClass(), "dispatcher", null);
        setField(term1378939, term1378939.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378939, term1378939.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378939, term1378939.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378939, term1378939.getClass(), "printingThreads", null);
        setBooleanField(term1378939, term1378939.getClass(), "printing", false);
        setField(term1378939, term1378939.getClass(), "containerListener", null);
        setIntField(term1378939, term1378939.getClass(), "listeningChildren", 0);
        setIntField(term1378939, term1378939.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378939, term1378939.getClass(), "descendantsCount", 0);
        setField(term1378939, term1378939.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378939, term1378939.getClass(), "numOfHWComponents", 0);
        setIntField(term1378939, term1378939.getClass(), "numOfLWComponents", 0);
        setField(term1378939, term1378939.getClass(), "modalComp", null);
        setField(term1378939, term1378939.getClass(), "modalAppContext", null);
        setIntField(term1378939, term1378939.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378939, term1378939.getClass(), "peer", null);
        setField(term1378939, term1378939.getClass(), "parent", null);
        setField(term1378939, term1378939.getClass(), "appContext", null);
        setIntField(term1378939, term1378939.getClass(), "x", 0);
        setIntField(term1378939, term1378939.getClass(), "y", 0);
        setIntField(term1378939, term1378939.getClass(), "width", 0);
        setIntField(term1378939, term1378939.getClass(), "height", 0);
        setField(term1378939, term1378939.getClass(), "foreground", null);
        setField(term1378939, term1378939.getClass(), "background", null);
        setField(term1378939, term1378939.getClass(), "font", null);
        setField(term1378939, term1378939.getClass(), "peerFont", null);
        setField(term1378939, term1378939.getClass(), "cursor", null);
        setField(term1378939, term1378939.getClass(), "locale", null);
        setField(term1378939, term1378939.getClass(), "graphicsConfig", null);
        setField(term1378939, term1378939.getClass(), "bufferStrategy", null);
        setBooleanField(term1378939, term1378939.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378939, term1378939.getClass(), "visible", false);
        setBooleanField(term1378939, term1378939.getClass(), "enabled", false);
        setBooleanField(term1378939, term1378939.getClass(), "valid", false);
        setField(term1378939, term1378939.getClass(), "dropTarget", null);
        setField(term1378939, term1378939.getClass(), "popups", null);
        setField(term1378939, term1378939.getClass(), "name", null);
        setBooleanField(term1378939, term1378939.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378939, term1378939.getClass(), "focusable", false);
        setIntField(term1378939, term1378939.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378939, term1378939.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378939, term1378939.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378939, term1378939.getClass(), "acc", null);
        setField(term1378939, term1378939.getClass(), "minSize", null);
        setBooleanField(term1378939, term1378939.getClass(), "minSizeSet", false);
        setField(term1378939, term1378939.getClass(), "prefSize", null);
        setBooleanField(term1378939, term1378939.getClass(), "prefSizeSet", false);
        setField(term1378939, term1378939.getClass(), "maxSize", null);
        setBooleanField(term1378939, term1378939.getClass(), "maxSizeSet", false);
        setField(term1378939, term1378939.getClass(), "componentOrientation", null);
        setBooleanField(term1378939, term1378939.getClass(), "newEventsOnly", false);
        setField(term1378939, term1378939.getClass(), "componentListener", null);
        setField(term1378939, term1378939.getClass(), "focusListener", null);
        setField(term1378939, term1378939.getClass(), "hierarchyListener", null);
        setField(term1378939, term1378939.getClass(), "hierarchyBoundsListener", null);
        setField(term1378939, term1378939.getClass(), "keyListener", null);
        setField(term1378939, term1378939.getClass(), "mouseListener", null);
        setField(term1378939, term1378939.getClass(), "mouseMotionListener", null);
        setField(term1378939, term1378939.getClass(), "mouseWheelListener", null);
        setField(term1378939, term1378939.getClass(), "inputMethodListener", null);
        setLongField(term1378939, term1378939.getClass(), "eventMask", 0L);
        setField(term1378939, term1378939.getClass(), "changeSupport", null);
        setField(term1378939, term1378939.getClass(), "objectLock", null);
        setBooleanField(term1378939, term1378939.getClass(), "isPacked", false);
        setIntField(term1378939, term1378939.getClass(), "boundsOp", 0);
        setField(term1378939, term1378939.getClass(), "compoundShape", null);
        setField(term1378939, term1378939.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378939, term1378939.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378939, term1378939.getClass(), "backgroundEraseDisabled", false);
        setField(term1378939, term1378939.getClass(), "eventCache", null);
        setBooleanField(term1378939, term1378939.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378939, term1378939.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378939, term1378939.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378939, term1378939.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isThreaded", argTypes, term1378939, args);
    }

};


