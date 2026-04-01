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

public class AITurnView_handlePowerHungryKill_33089080559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375084;

    public AITurnView_handlePowerHungryKill_33089080559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1375084 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1375084, term1375084.getClass(), "label", null);
        setField(term1375084, term1375084.getClass(), "game", null);
        setIntField(term1375084, term1375084.getClass(), "textAnim", 0);
        setIntField(term1375084, term1375084.getClass(), "cx", 0);
        setIntField(term1375084, term1375084.getClass(), "cy", 0);
        setField(term1375084, term1375084.getClass(), "aiThread", null);
        setBooleanField(term1375084, term1375084.getClass(), "readyToMove", false);
        setField(term1375084, term1375084.getClass(), "nextState", null);
        setField(term1375084, term1375084.getClass(), "nextStateObject", null);
        setBooleanField(term1375084, term1375084.getClass(), "isAlignmentXSet", false);
        setFloatField(term1375084, term1375084.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1375084, term1375084.getClass(), "isAlignmentYSet", false);
        setFloatField(term1375084, term1375084.getClass(), "alignmentY", 0.0F);
        setField(term1375084, term1375084.getClass(), "ui", null);
        setField(term1375084, term1375084.getClass(), "listenerList", null);
        setField(term1375084, term1375084.getClass(), "clientProperties", null);
        setField(term1375084, term1375084.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1375084, term1375084.getClass(), "autoscrolls", false);
        setField(term1375084, term1375084.getClass(), "border", null);
        setIntField(term1375084, term1375084.getClass(), "flags", 0);
        setField(term1375084, term1375084.getClass(), "inputVerifier", null);
        setBooleanField(term1375084, term1375084.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1375084, term1375084.getClass(), "paintingChild", null);
        setField(term1375084, term1375084.getClass(), "popupMenu", null);
        setField(term1375084, term1375084.getClass(), "revalidateRunnableScheduled", null);
        setField(term1375084, term1375084.getClass(), "focusInputMap", null);
        setField(term1375084, term1375084.getClass(), "ancestorInputMap", null);
        setField(term1375084, term1375084.getClass(), "windowInputMap", null);
        setField(term1375084, term1375084.getClass(), "actionMap", null);
        setField(term1375084, term1375084.getClass(), "aaHint", null);
        setField(term1375084, term1375084.getClass(), "lcdRenderingHint", null);
        setField(term1375084, term1375084.getClass(), "component", null);
        setField(term1375084, term1375084.getClass(), "layoutMgr", null);
        setField(term1375084, term1375084.getClass(), "dispatcher", null);
        setField(term1375084, term1375084.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1375084, term1375084.getClass(), "focusCycleRoot", false);
        setBooleanField(term1375084, term1375084.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1375084, term1375084.getClass(), "printingThreads", null);
        setBooleanField(term1375084, term1375084.getClass(), "printing", false);
        setField(term1375084, term1375084.getClass(), "containerListener", null);
        setIntField(term1375084, term1375084.getClass(), "listeningChildren", 0);
        setIntField(term1375084, term1375084.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1375084, term1375084.getClass(), "descendantsCount", 0);
        setField(term1375084, term1375084.getClass(), "preserveBackgroundColor", null);
        setIntField(term1375084, term1375084.getClass(), "numOfHWComponents", 0);
        setIntField(term1375084, term1375084.getClass(), "numOfLWComponents", 0);
        setField(term1375084, term1375084.getClass(), "modalComp", null);
        setField(term1375084, term1375084.getClass(), "modalAppContext", null);
        setIntField(term1375084, term1375084.getClass(), "containerSerializedDataVersion", 0);
        setField(term1375084, term1375084.getClass(), "peer", null);
        setField(term1375084, term1375084.getClass(), "parent", null);
        setField(term1375084, term1375084.getClass(), "appContext", null);
        setIntField(term1375084, term1375084.getClass(), "x", 0);
        setIntField(term1375084, term1375084.getClass(), "y", 0);
        setIntField(term1375084, term1375084.getClass(), "width", 0);
        setIntField(term1375084, term1375084.getClass(), "height", 0);
        setField(term1375084, term1375084.getClass(), "foreground", null);
        setField(term1375084, term1375084.getClass(), "background", null);
        setField(term1375084, term1375084.getClass(), "font", null);
        setField(term1375084, term1375084.getClass(), "peerFont", null);
        setField(term1375084, term1375084.getClass(), "cursor", null);
        setField(term1375084, term1375084.getClass(), "locale", null);
        setField(term1375084, term1375084.getClass(), "graphicsConfig", null);
        setField(term1375084, term1375084.getClass(), "bufferStrategy", null);
        setBooleanField(term1375084, term1375084.getClass(), "ignoreRepaint", false);
        setBooleanField(term1375084, term1375084.getClass(), "visible", false);
        setBooleanField(term1375084, term1375084.getClass(), "enabled", false);
        setBooleanField(term1375084, term1375084.getClass(), "valid", false);
        setField(term1375084, term1375084.getClass(), "dropTarget", null);
        setField(term1375084, term1375084.getClass(), "popups", null);
        setField(term1375084, term1375084.getClass(), "name", null);
        setBooleanField(term1375084, term1375084.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1375084, term1375084.getClass(), "focusable", false);
        setIntField(term1375084, term1375084.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1375084, term1375084.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1375084, term1375084.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1375084, term1375084.getClass(), "acc", null);
        setField(term1375084, term1375084.getClass(), "minSize", null);
        setBooleanField(term1375084, term1375084.getClass(), "minSizeSet", false);
        setField(term1375084, term1375084.getClass(), "prefSize", null);
        setBooleanField(term1375084, term1375084.getClass(), "prefSizeSet", false);
        setField(term1375084, term1375084.getClass(), "maxSize", null);
        setBooleanField(term1375084, term1375084.getClass(), "maxSizeSet", false);
        setField(term1375084, term1375084.getClass(), "componentOrientation", null);
        setBooleanField(term1375084, term1375084.getClass(), "newEventsOnly", false);
        setField(term1375084, term1375084.getClass(), "componentListener", null);
        setField(term1375084, term1375084.getClass(), "focusListener", null);
        setField(term1375084, term1375084.getClass(), "hierarchyListener", null);
        setField(term1375084, term1375084.getClass(), "hierarchyBoundsListener", null);
        setField(term1375084, term1375084.getClass(), "keyListener", null);
        setField(term1375084, term1375084.getClass(), "mouseListener", null);
        setField(term1375084, term1375084.getClass(), "mouseMotionListener", null);
        setField(term1375084, term1375084.getClass(), "mouseWheelListener", null);
        setField(term1375084, term1375084.getClass(), "inputMethodListener", null);
        setLongField(term1375084, term1375084.getClass(), "eventMask", 0L);
        setField(term1375084, term1375084.getClass(), "changeSupport", null);
        setField(term1375084, term1375084.getClass(), "objectLock", null);
        setBooleanField(term1375084, term1375084.getClass(), "isPacked", false);
        setIntField(term1375084, term1375084.getClass(), "boundsOp", 0);
        setField(term1375084, term1375084.getClass(), "compoundShape", null);
        setField(term1375084, term1375084.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1375084, term1375084.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1375084, term1375084.getClass(), "backgroundEraseDisabled", false);
        setField(term1375084, term1375084.getClass(), "eventCache", null);
        setBooleanField(term1375084, term1375084.getClass(), "coalescingEnabled", false);
        setBooleanField(term1375084, term1375084.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1375084, term1375084.getClass(), "componentSerializedDataVersion", 0);
        setField(term1375084, term1375084.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handlePowerHungryKill", argTypes, term1375084, args);
    }

};


