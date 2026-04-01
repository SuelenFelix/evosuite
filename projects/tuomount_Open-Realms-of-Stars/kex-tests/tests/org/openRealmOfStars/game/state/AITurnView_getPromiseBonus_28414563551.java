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

public class AITurnView_getPromiseBonus_28414563551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1267206;

    public AITurnView_getPromiseBonus_28414563551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1267206 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1267206, term1267206.getClass(), "label", null);
        setField(term1267206, term1267206.getClass(), "game", null);
        setIntField(term1267206, term1267206.getClass(), "textAnim", 0);
        setIntField(term1267206, term1267206.getClass(), "cx", 0);
        setIntField(term1267206, term1267206.getClass(), "cy", 0);
        setField(term1267206, term1267206.getClass(), "aiThread", null);
        setBooleanField(term1267206, term1267206.getClass(), "readyToMove", false);
        setField(term1267206, term1267206.getClass(), "nextState", null);
        setField(term1267206, term1267206.getClass(), "nextStateObject", null);
        setBooleanField(term1267206, term1267206.getClass(), "isAlignmentXSet", false);
        setFloatField(term1267206, term1267206.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1267206, term1267206.getClass(), "isAlignmentYSet", false);
        setFloatField(term1267206, term1267206.getClass(), "alignmentY", 0.0F);
        setField(term1267206, term1267206.getClass(), "ui", null);
        setField(term1267206, term1267206.getClass(), "listenerList", null);
        setField(term1267206, term1267206.getClass(), "clientProperties", null);
        setField(term1267206, term1267206.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1267206, term1267206.getClass(), "autoscrolls", false);
        setField(term1267206, term1267206.getClass(), "border", null);
        setIntField(term1267206, term1267206.getClass(), "flags", 0);
        setField(term1267206, term1267206.getClass(), "inputVerifier", null);
        setBooleanField(term1267206, term1267206.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1267206, term1267206.getClass(), "paintingChild", null);
        setField(term1267206, term1267206.getClass(), "popupMenu", null);
        setField(term1267206, term1267206.getClass(), "revalidateRunnableScheduled", null);
        setField(term1267206, term1267206.getClass(), "focusInputMap", null);
        setField(term1267206, term1267206.getClass(), "ancestorInputMap", null);
        setField(term1267206, term1267206.getClass(), "windowInputMap", null);
        setField(term1267206, term1267206.getClass(), "actionMap", null);
        setField(term1267206, term1267206.getClass(), "aaHint", null);
        setField(term1267206, term1267206.getClass(), "lcdRenderingHint", null);
        setField(term1267206, term1267206.getClass(), "component", null);
        setField(term1267206, term1267206.getClass(), "layoutMgr", null);
        setField(term1267206, term1267206.getClass(), "dispatcher", null);
        setField(term1267206, term1267206.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1267206, term1267206.getClass(), "focusCycleRoot", false);
        setBooleanField(term1267206, term1267206.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1267206, term1267206.getClass(), "printingThreads", null);
        setBooleanField(term1267206, term1267206.getClass(), "printing", false);
        setField(term1267206, term1267206.getClass(), "containerListener", null);
        setIntField(term1267206, term1267206.getClass(), "listeningChildren", 0);
        setIntField(term1267206, term1267206.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1267206, term1267206.getClass(), "descendantsCount", 0);
        setField(term1267206, term1267206.getClass(), "preserveBackgroundColor", null);
        setIntField(term1267206, term1267206.getClass(), "numOfHWComponents", 0);
        setIntField(term1267206, term1267206.getClass(), "numOfLWComponents", 0);
        setField(term1267206, term1267206.getClass(), "modalComp", null);
        setField(term1267206, term1267206.getClass(), "modalAppContext", null);
        setIntField(term1267206, term1267206.getClass(), "containerSerializedDataVersion", 0);
        setField(term1267206, term1267206.getClass(), "peer", null);
        setField(term1267206, term1267206.getClass(), "parent", null);
        setField(term1267206, term1267206.getClass(), "appContext", null);
        setIntField(term1267206, term1267206.getClass(), "x", 0);
        setIntField(term1267206, term1267206.getClass(), "y", 0);
        setIntField(term1267206, term1267206.getClass(), "width", 0);
        setIntField(term1267206, term1267206.getClass(), "height", 0);
        setField(term1267206, term1267206.getClass(), "foreground", null);
        setField(term1267206, term1267206.getClass(), "background", null);
        setField(term1267206, term1267206.getClass(), "font", null);
        setField(term1267206, term1267206.getClass(), "peerFont", null);
        setField(term1267206, term1267206.getClass(), "cursor", null);
        setField(term1267206, term1267206.getClass(), "locale", null);
        setField(term1267206, term1267206.getClass(), "graphicsConfig", null);
        setField(term1267206, term1267206.getClass(), "bufferStrategy", null);
        setBooleanField(term1267206, term1267206.getClass(), "ignoreRepaint", false);
        setBooleanField(term1267206, term1267206.getClass(), "visible", false);
        setBooleanField(term1267206, term1267206.getClass(), "enabled", false);
        setBooleanField(term1267206, term1267206.getClass(), "valid", false);
        setField(term1267206, term1267206.getClass(), "dropTarget", null);
        setField(term1267206, term1267206.getClass(), "popups", null);
        setField(term1267206, term1267206.getClass(), "name", null);
        setBooleanField(term1267206, term1267206.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1267206, term1267206.getClass(), "focusable", false);
        setIntField(term1267206, term1267206.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1267206, term1267206.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1267206, term1267206.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1267206, term1267206.getClass(), "acc", null);
        setField(term1267206, term1267206.getClass(), "minSize", null);
        setBooleanField(term1267206, term1267206.getClass(), "minSizeSet", false);
        setField(term1267206, term1267206.getClass(), "prefSize", null);
        setBooleanField(term1267206, term1267206.getClass(), "prefSizeSet", false);
        setField(term1267206, term1267206.getClass(), "maxSize", null);
        setBooleanField(term1267206, term1267206.getClass(), "maxSizeSet", false);
        setField(term1267206, term1267206.getClass(), "componentOrientation", null);
        setBooleanField(term1267206, term1267206.getClass(), "newEventsOnly", false);
        setField(term1267206, term1267206.getClass(), "componentListener", null);
        setField(term1267206, term1267206.getClass(), "focusListener", null);
        setField(term1267206, term1267206.getClass(), "hierarchyListener", null);
        setField(term1267206, term1267206.getClass(), "hierarchyBoundsListener", null);
        setField(term1267206, term1267206.getClass(), "keyListener", null);
        setField(term1267206, term1267206.getClass(), "mouseListener", null);
        setField(term1267206, term1267206.getClass(), "mouseMotionListener", null);
        setField(term1267206, term1267206.getClass(), "mouseWheelListener", null);
        setField(term1267206, term1267206.getClass(), "inputMethodListener", null);
        setLongField(term1267206, term1267206.getClass(), "eventMask", 0L);
        setField(term1267206, term1267206.getClass(), "changeSupport", null);
        setField(term1267206, term1267206.getClass(), "objectLock", null);
        setBooleanField(term1267206, term1267206.getClass(), "isPacked", false);
        setIntField(term1267206, term1267206.getClass(), "boundsOp", 0);
        setField(term1267206, term1267206.getClass(), "compoundShape", null);
        setField(term1267206, term1267206.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1267206, term1267206.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1267206, term1267206.getClass(), "backgroundEraseDisabled", false);
        setField(term1267206, term1267206.getClass(), "eventCache", null);
        setBooleanField(term1267206, term1267206.getClass(), "coalescingEnabled", false);
        setBooleanField(term1267206, term1267206.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1267206, term1267206.getClass(), "componentSerializedDataVersion", 0);
        setField(term1267206, term1267206.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getPromiseBonus", argTypes, term1267206, args);
    }

};


