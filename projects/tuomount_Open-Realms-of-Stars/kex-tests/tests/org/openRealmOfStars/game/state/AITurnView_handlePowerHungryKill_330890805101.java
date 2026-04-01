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

public class AITurnView_handlePowerHungryKill_330890805101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378624;

    public AITurnView_handlePowerHungryKill_330890805101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378624 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378624, term1378624.getClass(), "label", null);
        setField(term1378624, term1378624.getClass(), "game", null);
        setIntField(term1378624, term1378624.getClass(), "textAnim", 0);
        setIntField(term1378624, term1378624.getClass(), "cx", 0);
        setIntField(term1378624, term1378624.getClass(), "cy", 0);
        setField(term1378624, term1378624.getClass(), "aiThread", null);
        setBooleanField(term1378624, term1378624.getClass(), "readyToMove", false);
        setField(term1378624, term1378624.getClass(), "nextState", null);
        setField(term1378624, term1378624.getClass(), "nextStateObject", null);
        setBooleanField(term1378624, term1378624.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378624, term1378624.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378624, term1378624.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378624, term1378624.getClass(), "alignmentY", 0.0F);
        setField(term1378624, term1378624.getClass(), "ui", null);
        setField(term1378624, term1378624.getClass(), "listenerList", null);
        setField(term1378624, term1378624.getClass(), "clientProperties", null);
        setField(term1378624, term1378624.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378624, term1378624.getClass(), "autoscrolls", false);
        setField(term1378624, term1378624.getClass(), "border", null);
        setIntField(term1378624, term1378624.getClass(), "flags", 0);
        setField(term1378624, term1378624.getClass(), "inputVerifier", null);
        setBooleanField(term1378624, term1378624.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378624, term1378624.getClass(), "paintingChild", null);
        setField(term1378624, term1378624.getClass(), "popupMenu", null);
        setField(term1378624, term1378624.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378624, term1378624.getClass(), "focusInputMap", null);
        setField(term1378624, term1378624.getClass(), "ancestorInputMap", null);
        setField(term1378624, term1378624.getClass(), "windowInputMap", null);
        setField(term1378624, term1378624.getClass(), "actionMap", null);
        setField(term1378624, term1378624.getClass(), "aaHint", null);
        setField(term1378624, term1378624.getClass(), "lcdRenderingHint", null);
        setField(term1378624, term1378624.getClass(), "component", null);
        setField(term1378624, term1378624.getClass(), "layoutMgr", null);
        setField(term1378624, term1378624.getClass(), "dispatcher", null);
        setField(term1378624, term1378624.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378624, term1378624.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378624, term1378624.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378624, term1378624.getClass(), "printingThreads", null);
        setBooleanField(term1378624, term1378624.getClass(), "printing", false);
        setField(term1378624, term1378624.getClass(), "containerListener", null);
        setIntField(term1378624, term1378624.getClass(), "listeningChildren", 0);
        setIntField(term1378624, term1378624.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378624, term1378624.getClass(), "descendantsCount", 0);
        setField(term1378624, term1378624.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378624, term1378624.getClass(), "numOfHWComponents", 0);
        setIntField(term1378624, term1378624.getClass(), "numOfLWComponents", 0);
        setField(term1378624, term1378624.getClass(), "modalComp", null);
        setField(term1378624, term1378624.getClass(), "modalAppContext", null);
        setIntField(term1378624, term1378624.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378624, term1378624.getClass(), "peer", null);
        setField(term1378624, term1378624.getClass(), "parent", null);
        setField(term1378624, term1378624.getClass(), "appContext", null);
        setIntField(term1378624, term1378624.getClass(), "x", 0);
        setIntField(term1378624, term1378624.getClass(), "y", 0);
        setIntField(term1378624, term1378624.getClass(), "width", 0);
        setIntField(term1378624, term1378624.getClass(), "height", 0);
        setField(term1378624, term1378624.getClass(), "foreground", null);
        setField(term1378624, term1378624.getClass(), "background", null);
        setField(term1378624, term1378624.getClass(), "font", null);
        setField(term1378624, term1378624.getClass(), "peerFont", null);
        setField(term1378624, term1378624.getClass(), "cursor", null);
        setField(term1378624, term1378624.getClass(), "locale", null);
        setField(term1378624, term1378624.getClass(), "graphicsConfig", null);
        setField(term1378624, term1378624.getClass(), "bufferStrategy", null);
        setBooleanField(term1378624, term1378624.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378624, term1378624.getClass(), "visible", false);
        setBooleanField(term1378624, term1378624.getClass(), "enabled", false);
        setBooleanField(term1378624, term1378624.getClass(), "valid", false);
        setField(term1378624, term1378624.getClass(), "dropTarget", null);
        setField(term1378624, term1378624.getClass(), "popups", null);
        setField(term1378624, term1378624.getClass(), "name", null);
        setBooleanField(term1378624, term1378624.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378624, term1378624.getClass(), "focusable", false);
        setIntField(term1378624, term1378624.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378624, term1378624.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378624, term1378624.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378624, term1378624.getClass(), "acc", null);
        setField(term1378624, term1378624.getClass(), "minSize", null);
        setBooleanField(term1378624, term1378624.getClass(), "minSizeSet", false);
        setField(term1378624, term1378624.getClass(), "prefSize", null);
        setBooleanField(term1378624, term1378624.getClass(), "prefSizeSet", false);
        setField(term1378624, term1378624.getClass(), "maxSize", null);
        setBooleanField(term1378624, term1378624.getClass(), "maxSizeSet", false);
        setField(term1378624, term1378624.getClass(), "componentOrientation", null);
        setBooleanField(term1378624, term1378624.getClass(), "newEventsOnly", false);
        setField(term1378624, term1378624.getClass(), "componentListener", null);
        setField(term1378624, term1378624.getClass(), "focusListener", null);
        setField(term1378624, term1378624.getClass(), "hierarchyListener", null);
        setField(term1378624, term1378624.getClass(), "hierarchyBoundsListener", null);
        setField(term1378624, term1378624.getClass(), "keyListener", null);
        setField(term1378624, term1378624.getClass(), "mouseListener", null);
        setField(term1378624, term1378624.getClass(), "mouseMotionListener", null);
        setField(term1378624, term1378624.getClass(), "mouseWheelListener", null);
        setField(term1378624, term1378624.getClass(), "inputMethodListener", null);
        setLongField(term1378624, term1378624.getClass(), "eventMask", 0L);
        setField(term1378624, term1378624.getClass(), "changeSupport", null);
        setField(term1378624, term1378624.getClass(), "objectLock", null);
        setBooleanField(term1378624, term1378624.getClass(), "isPacked", false);
        setIntField(term1378624, term1378624.getClass(), "boundsOp", 0);
        setField(term1378624, term1378624.getClass(), "compoundShape", null);
        setField(term1378624, term1378624.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378624, term1378624.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378624, term1378624.getClass(), "backgroundEraseDisabled", false);
        setField(term1378624, term1378624.getClass(), "eventCache", null);
        setBooleanField(term1378624, term1378624.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378624, term1378624.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378624, term1378624.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378624, term1378624.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "handlePowerHungryKill", argTypes, term1378624, args);
    }

};


