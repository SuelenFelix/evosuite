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

public class AITurnView_handleDiplomaticVotes_50522426096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378399;

    public AITurnView_handleDiplomaticVotes_50522426096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378399 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378399, term1378399.getClass(), "label", null);
        setField(term1378399, term1378399.getClass(), "game", null);
        setIntField(term1378399, term1378399.getClass(), "textAnim", 0);
        setIntField(term1378399, term1378399.getClass(), "cx", 0);
        setIntField(term1378399, term1378399.getClass(), "cy", 0);
        setField(term1378399, term1378399.getClass(), "aiThread", null);
        setBooleanField(term1378399, term1378399.getClass(), "readyToMove", false);
        setField(term1378399, term1378399.getClass(), "nextState", null);
        setField(term1378399, term1378399.getClass(), "nextStateObject", null);
        setBooleanField(term1378399, term1378399.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378399, term1378399.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378399, term1378399.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378399, term1378399.getClass(), "alignmentY", 0.0F);
        setField(term1378399, term1378399.getClass(), "ui", null);
        setField(term1378399, term1378399.getClass(), "listenerList", null);
        setField(term1378399, term1378399.getClass(), "clientProperties", null);
        setField(term1378399, term1378399.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378399, term1378399.getClass(), "autoscrolls", false);
        setField(term1378399, term1378399.getClass(), "border", null);
        setIntField(term1378399, term1378399.getClass(), "flags", 0);
        setField(term1378399, term1378399.getClass(), "inputVerifier", null);
        setBooleanField(term1378399, term1378399.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378399, term1378399.getClass(), "paintingChild", null);
        setField(term1378399, term1378399.getClass(), "popupMenu", null);
        setField(term1378399, term1378399.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378399, term1378399.getClass(), "focusInputMap", null);
        setField(term1378399, term1378399.getClass(), "ancestorInputMap", null);
        setField(term1378399, term1378399.getClass(), "windowInputMap", null);
        setField(term1378399, term1378399.getClass(), "actionMap", null);
        setField(term1378399, term1378399.getClass(), "aaHint", null);
        setField(term1378399, term1378399.getClass(), "lcdRenderingHint", null);
        setField(term1378399, term1378399.getClass(), "component", null);
        setField(term1378399, term1378399.getClass(), "layoutMgr", null);
        setField(term1378399, term1378399.getClass(), "dispatcher", null);
        setField(term1378399, term1378399.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378399, term1378399.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378399, term1378399.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378399, term1378399.getClass(), "printingThreads", null);
        setBooleanField(term1378399, term1378399.getClass(), "printing", false);
        setField(term1378399, term1378399.getClass(), "containerListener", null);
        setIntField(term1378399, term1378399.getClass(), "listeningChildren", 0);
        setIntField(term1378399, term1378399.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378399, term1378399.getClass(), "descendantsCount", 0);
        setField(term1378399, term1378399.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378399, term1378399.getClass(), "numOfHWComponents", 0);
        setIntField(term1378399, term1378399.getClass(), "numOfLWComponents", 0);
        setField(term1378399, term1378399.getClass(), "modalComp", null);
        setField(term1378399, term1378399.getClass(), "modalAppContext", null);
        setIntField(term1378399, term1378399.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378399, term1378399.getClass(), "peer", null);
        setField(term1378399, term1378399.getClass(), "parent", null);
        setField(term1378399, term1378399.getClass(), "appContext", null);
        setIntField(term1378399, term1378399.getClass(), "x", 0);
        setIntField(term1378399, term1378399.getClass(), "y", 0);
        setIntField(term1378399, term1378399.getClass(), "width", 0);
        setIntField(term1378399, term1378399.getClass(), "height", 0);
        setField(term1378399, term1378399.getClass(), "foreground", null);
        setField(term1378399, term1378399.getClass(), "background", null);
        setField(term1378399, term1378399.getClass(), "font", null);
        setField(term1378399, term1378399.getClass(), "peerFont", null);
        setField(term1378399, term1378399.getClass(), "cursor", null);
        setField(term1378399, term1378399.getClass(), "locale", null);
        setField(term1378399, term1378399.getClass(), "graphicsConfig", null);
        setField(term1378399, term1378399.getClass(), "bufferStrategy", null);
        setBooleanField(term1378399, term1378399.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378399, term1378399.getClass(), "visible", false);
        setBooleanField(term1378399, term1378399.getClass(), "enabled", false);
        setBooleanField(term1378399, term1378399.getClass(), "valid", false);
        setField(term1378399, term1378399.getClass(), "dropTarget", null);
        setField(term1378399, term1378399.getClass(), "popups", null);
        setField(term1378399, term1378399.getClass(), "name", null);
        setBooleanField(term1378399, term1378399.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378399, term1378399.getClass(), "focusable", false);
        setIntField(term1378399, term1378399.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378399, term1378399.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378399, term1378399.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378399, term1378399.getClass(), "acc", null);
        setField(term1378399, term1378399.getClass(), "minSize", null);
        setBooleanField(term1378399, term1378399.getClass(), "minSizeSet", false);
        setField(term1378399, term1378399.getClass(), "prefSize", null);
        setBooleanField(term1378399, term1378399.getClass(), "prefSizeSet", false);
        setField(term1378399, term1378399.getClass(), "maxSize", null);
        setBooleanField(term1378399, term1378399.getClass(), "maxSizeSet", false);
        setField(term1378399, term1378399.getClass(), "componentOrientation", null);
        setBooleanField(term1378399, term1378399.getClass(), "newEventsOnly", false);
        setField(term1378399, term1378399.getClass(), "componentListener", null);
        setField(term1378399, term1378399.getClass(), "focusListener", null);
        setField(term1378399, term1378399.getClass(), "hierarchyListener", null);
        setField(term1378399, term1378399.getClass(), "hierarchyBoundsListener", null);
        setField(term1378399, term1378399.getClass(), "keyListener", null);
        setField(term1378399, term1378399.getClass(), "mouseListener", null);
        setField(term1378399, term1378399.getClass(), "mouseMotionListener", null);
        setField(term1378399, term1378399.getClass(), "mouseWheelListener", null);
        setField(term1378399, term1378399.getClass(), "inputMethodListener", null);
        setLongField(term1378399, term1378399.getClass(), "eventMask", 0L);
        setField(term1378399, term1378399.getClass(), "changeSupport", null);
        setField(term1378399, term1378399.getClass(), "objectLock", null);
        setBooleanField(term1378399, term1378399.getClass(), "isPacked", false);
        setIntField(term1378399, term1378399.getClass(), "boundsOp", 0);
        setField(term1378399, term1378399.getClass(), "compoundShape", null);
        setField(term1378399, term1378399.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378399, term1378399.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378399, term1378399.getClass(), "backgroundEraseDisabled", false);
        setField(term1378399, term1378399.getClass(), "eventCache", null);
        setBooleanField(term1378399, term1378399.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378399, term1378399.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378399, term1378399.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378399, term1378399.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleDiplomaticVotes", argTypes, term1378399, args);
    }

};


