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

public class AITurnView_handleDiplomaticVotes_50522426098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418718;

    public AITurnView_handleDiplomaticVotes_50522426098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418718 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418718, term1418718.getClass(), "label", null);
        setField(term1418718, term1418718.getClass(), "game", null);
        setIntField(term1418718, term1418718.getClass(), "textAnim", 0);
        setIntField(term1418718, term1418718.getClass(), "cx", 0);
        setIntField(term1418718, term1418718.getClass(), "cy", 0);
        setField(term1418718, term1418718.getClass(), "aiThread", null);
        setBooleanField(term1418718, term1418718.getClass(), "readyToMove", false);
        setField(term1418718, term1418718.getClass(), "nextState", null);
        setField(term1418718, term1418718.getClass(), "nextStateObject", null);
        setBooleanField(term1418718, term1418718.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418718, term1418718.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418718, term1418718.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418718, term1418718.getClass(), "alignmentY", 0.0F);
        setField(term1418718, term1418718.getClass(), "ui", null);
        setField(term1418718, term1418718.getClass(), "listenerList", null);
        setField(term1418718, term1418718.getClass(), "clientProperties", null);
        setField(term1418718, term1418718.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418718, term1418718.getClass(), "autoscrolls", false);
        setField(term1418718, term1418718.getClass(), "border", null);
        setIntField(term1418718, term1418718.getClass(), "flags", 0);
        setField(term1418718, term1418718.getClass(), "inputVerifier", null);
        setBooleanField(term1418718, term1418718.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418718, term1418718.getClass(), "paintingChild", null);
        setField(term1418718, term1418718.getClass(), "popupMenu", null);
        setField(term1418718, term1418718.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418718, term1418718.getClass(), "focusInputMap", null);
        setField(term1418718, term1418718.getClass(), "ancestorInputMap", null);
        setField(term1418718, term1418718.getClass(), "windowInputMap", null);
        setField(term1418718, term1418718.getClass(), "actionMap", null);
        setField(term1418718, term1418718.getClass(), "aaHint", null);
        setField(term1418718, term1418718.getClass(), "lcdRenderingHint", null);
        setField(term1418718, term1418718.getClass(), "component", null);
        setField(term1418718, term1418718.getClass(), "layoutMgr", null);
        setField(term1418718, term1418718.getClass(), "dispatcher", null);
        setField(term1418718, term1418718.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418718, term1418718.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418718, term1418718.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418718, term1418718.getClass(), "printingThreads", null);
        setBooleanField(term1418718, term1418718.getClass(), "printing", false);
        setField(term1418718, term1418718.getClass(), "containerListener", null);
        setIntField(term1418718, term1418718.getClass(), "listeningChildren", 0);
        setIntField(term1418718, term1418718.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418718, term1418718.getClass(), "descendantsCount", 0);
        setField(term1418718, term1418718.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418718, term1418718.getClass(), "numOfHWComponents", 0);
        setIntField(term1418718, term1418718.getClass(), "numOfLWComponents", 0);
        setField(term1418718, term1418718.getClass(), "modalComp", null);
        setField(term1418718, term1418718.getClass(), "modalAppContext", null);
        setIntField(term1418718, term1418718.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418718, term1418718.getClass(), "peer", null);
        setField(term1418718, term1418718.getClass(), "parent", null);
        setField(term1418718, term1418718.getClass(), "appContext", null);
        setIntField(term1418718, term1418718.getClass(), "x", 0);
        setIntField(term1418718, term1418718.getClass(), "y", 0);
        setIntField(term1418718, term1418718.getClass(), "width", 0);
        setIntField(term1418718, term1418718.getClass(), "height", 0);
        setField(term1418718, term1418718.getClass(), "foreground", null);
        setField(term1418718, term1418718.getClass(), "background", null);
        setField(term1418718, term1418718.getClass(), "font", null);
        setField(term1418718, term1418718.getClass(), "peerFont", null);
        setField(term1418718, term1418718.getClass(), "cursor", null);
        setField(term1418718, term1418718.getClass(), "locale", null);
        setField(term1418718, term1418718.getClass(), "graphicsConfig", null);
        setField(term1418718, term1418718.getClass(), "bufferStrategy", null);
        setBooleanField(term1418718, term1418718.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418718, term1418718.getClass(), "visible", false);
        setBooleanField(term1418718, term1418718.getClass(), "enabled", false);
        setBooleanField(term1418718, term1418718.getClass(), "valid", false);
        setField(term1418718, term1418718.getClass(), "dropTarget", null);
        setField(term1418718, term1418718.getClass(), "popups", null);
        setField(term1418718, term1418718.getClass(), "name", null);
        setBooleanField(term1418718, term1418718.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418718, term1418718.getClass(), "focusable", false);
        setIntField(term1418718, term1418718.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418718, term1418718.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418718, term1418718.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418718, term1418718.getClass(), "acc", null);
        setField(term1418718, term1418718.getClass(), "minSize", null);
        setBooleanField(term1418718, term1418718.getClass(), "minSizeSet", false);
        setField(term1418718, term1418718.getClass(), "prefSize", null);
        setBooleanField(term1418718, term1418718.getClass(), "prefSizeSet", false);
        setField(term1418718, term1418718.getClass(), "maxSize", null);
        setBooleanField(term1418718, term1418718.getClass(), "maxSizeSet", false);
        setField(term1418718, term1418718.getClass(), "componentOrientation", null);
        setBooleanField(term1418718, term1418718.getClass(), "newEventsOnly", false);
        setField(term1418718, term1418718.getClass(), "componentListener", null);
        setField(term1418718, term1418718.getClass(), "focusListener", null);
        setField(term1418718, term1418718.getClass(), "hierarchyListener", null);
        setField(term1418718, term1418718.getClass(), "hierarchyBoundsListener", null);
        setField(term1418718, term1418718.getClass(), "keyListener", null);
        setField(term1418718, term1418718.getClass(), "mouseListener", null);
        setField(term1418718, term1418718.getClass(), "mouseMotionListener", null);
        setField(term1418718, term1418718.getClass(), "mouseWheelListener", null);
        setField(term1418718, term1418718.getClass(), "inputMethodListener", null);
        setLongField(term1418718, term1418718.getClass(), "eventMask", 0L);
        setField(term1418718, term1418718.getClass(), "changeSupport", null);
        setField(term1418718, term1418718.getClass(), "objectLock", null);
        setBooleanField(term1418718, term1418718.getClass(), "isPacked", false);
        setIntField(term1418718, term1418718.getClass(), "boundsOp", 0);
        setField(term1418718, term1418718.getClass(), "compoundShape", null);
        setField(term1418718, term1418718.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418718, term1418718.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418718, term1418718.getClass(), "backgroundEraseDisabled", false);
        setField(term1418718, term1418718.getClass(), "eventCache", null);
        setBooleanField(term1418718, term1418718.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418718, term1418718.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418718, term1418718.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418718, term1418718.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleDiplomaticVotes", argTypes, term1418718, args);
    }

};


