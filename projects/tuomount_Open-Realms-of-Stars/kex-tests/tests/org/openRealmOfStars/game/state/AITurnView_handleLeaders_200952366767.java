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

public class AITurnView_handleLeaders_200952366767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366408;

    public AITurnView_handleLeaders_200952366767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1366408 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1366408, term1366408.getClass(), "label", null);
        setField(term1366408, term1366408.getClass(), "game", null);
        setIntField(term1366408, term1366408.getClass(), "textAnim", 0);
        setIntField(term1366408, term1366408.getClass(), "cx", 0);
        setIntField(term1366408, term1366408.getClass(), "cy", 0);
        setField(term1366408, term1366408.getClass(), "aiThread", null);
        setBooleanField(term1366408, term1366408.getClass(), "readyToMove", false);
        setField(term1366408, term1366408.getClass(), "nextState", null);
        setField(term1366408, term1366408.getClass(), "nextStateObject", null);
        setBooleanField(term1366408, term1366408.getClass(), "isAlignmentXSet", false);
        setFloatField(term1366408, term1366408.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1366408, term1366408.getClass(), "isAlignmentYSet", false);
        setFloatField(term1366408, term1366408.getClass(), "alignmentY", 0.0F);
        setField(term1366408, term1366408.getClass(), "ui", null);
        setField(term1366408, term1366408.getClass(), "listenerList", null);
        setField(term1366408, term1366408.getClass(), "clientProperties", null);
        setField(term1366408, term1366408.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1366408, term1366408.getClass(), "autoscrolls", false);
        setField(term1366408, term1366408.getClass(), "border", null);
        setIntField(term1366408, term1366408.getClass(), "flags", 0);
        setField(term1366408, term1366408.getClass(), "inputVerifier", null);
        setBooleanField(term1366408, term1366408.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1366408, term1366408.getClass(), "paintingChild", null);
        setField(term1366408, term1366408.getClass(), "popupMenu", null);
        setField(term1366408, term1366408.getClass(), "revalidateRunnableScheduled", null);
        setField(term1366408, term1366408.getClass(), "focusInputMap", null);
        setField(term1366408, term1366408.getClass(), "ancestorInputMap", null);
        setField(term1366408, term1366408.getClass(), "windowInputMap", null);
        setField(term1366408, term1366408.getClass(), "actionMap", null);
        setField(term1366408, term1366408.getClass(), "aaHint", null);
        setField(term1366408, term1366408.getClass(), "lcdRenderingHint", null);
        setField(term1366408, term1366408.getClass(), "component", null);
        setField(term1366408, term1366408.getClass(), "layoutMgr", null);
        setField(term1366408, term1366408.getClass(), "dispatcher", null);
        setField(term1366408, term1366408.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1366408, term1366408.getClass(), "focusCycleRoot", false);
        setBooleanField(term1366408, term1366408.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1366408, term1366408.getClass(), "printingThreads", null);
        setBooleanField(term1366408, term1366408.getClass(), "printing", false);
        setField(term1366408, term1366408.getClass(), "containerListener", null);
        setIntField(term1366408, term1366408.getClass(), "listeningChildren", 0);
        setIntField(term1366408, term1366408.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1366408, term1366408.getClass(), "descendantsCount", 0);
        setField(term1366408, term1366408.getClass(), "preserveBackgroundColor", null);
        setIntField(term1366408, term1366408.getClass(), "numOfHWComponents", 0);
        setIntField(term1366408, term1366408.getClass(), "numOfLWComponents", 0);
        setField(term1366408, term1366408.getClass(), "modalComp", null);
        setField(term1366408, term1366408.getClass(), "modalAppContext", null);
        setIntField(term1366408, term1366408.getClass(), "containerSerializedDataVersion", 0);
        setField(term1366408, term1366408.getClass(), "peer", null);
        setField(term1366408, term1366408.getClass(), "parent", null);
        setField(term1366408, term1366408.getClass(), "appContext", null);
        setIntField(term1366408, term1366408.getClass(), "x", 0);
        setIntField(term1366408, term1366408.getClass(), "y", 0);
        setIntField(term1366408, term1366408.getClass(), "width", 0);
        setIntField(term1366408, term1366408.getClass(), "height", 0);
        setField(term1366408, term1366408.getClass(), "foreground", null);
        setField(term1366408, term1366408.getClass(), "background", null);
        setField(term1366408, term1366408.getClass(), "font", null);
        setField(term1366408, term1366408.getClass(), "peerFont", null);
        setField(term1366408, term1366408.getClass(), "cursor", null);
        setField(term1366408, term1366408.getClass(), "locale", null);
        setField(term1366408, term1366408.getClass(), "graphicsConfig", null);
        setField(term1366408, term1366408.getClass(), "bufferStrategy", null);
        setBooleanField(term1366408, term1366408.getClass(), "ignoreRepaint", false);
        setBooleanField(term1366408, term1366408.getClass(), "visible", false);
        setBooleanField(term1366408, term1366408.getClass(), "enabled", false);
        setBooleanField(term1366408, term1366408.getClass(), "valid", false);
        setField(term1366408, term1366408.getClass(), "dropTarget", null);
        setField(term1366408, term1366408.getClass(), "popups", null);
        setField(term1366408, term1366408.getClass(), "name", null);
        setBooleanField(term1366408, term1366408.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1366408, term1366408.getClass(), "focusable", false);
        setIntField(term1366408, term1366408.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1366408, term1366408.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1366408, term1366408.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1366408, term1366408.getClass(), "acc", null);
        setField(term1366408, term1366408.getClass(), "minSize", null);
        setBooleanField(term1366408, term1366408.getClass(), "minSizeSet", false);
        setField(term1366408, term1366408.getClass(), "prefSize", null);
        setBooleanField(term1366408, term1366408.getClass(), "prefSizeSet", false);
        setField(term1366408, term1366408.getClass(), "maxSize", null);
        setBooleanField(term1366408, term1366408.getClass(), "maxSizeSet", false);
        setField(term1366408, term1366408.getClass(), "componentOrientation", null);
        setBooleanField(term1366408, term1366408.getClass(), "newEventsOnly", false);
        setField(term1366408, term1366408.getClass(), "componentListener", null);
        setField(term1366408, term1366408.getClass(), "focusListener", null);
        setField(term1366408, term1366408.getClass(), "hierarchyListener", null);
        setField(term1366408, term1366408.getClass(), "hierarchyBoundsListener", null);
        setField(term1366408, term1366408.getClass(), "keyListener", null);
        setField(term1366408, term1366408.getClass(), "mouseListener", null);
        setField(term1366408, term1366408.getClass(), "mouseMotionListener", null);
        setField(term1366408, term1366408.getClass(), "mouseWheelListener", null);
        setField(term1366408, term1366408.getClass(), "inputMethodListener", null);
        setLongField(term1366408, term1366408.getClass(), "eventMask", 0L);
        setField(term1366408, term1366408.getClass(), "changeSupport", null);
        setField(term1366408, term1366408.getClass(), "objectLock", null);
        setBooleanField(term1366408, term1366408.getClass(), "isPacked", false);
        setIntField(term1366408, term1366408.getClass(), "boundsOp", 0);
        setField(term1366408, term1366408.getClass(), "compoundShape", null);
        setField(term1366408, term1366408.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1366408, term1366408.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1366408, term1366408.getClass(), "backgroundEraseDisabled", false);
        setField(term1366408, term1366408.getClass(), "eventCache", null);
        setBooleanField(term1366408, term1366408.getClass(), "coalescingEnabled", false);
        setBooleanField(term1366408, term1366408.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1366408, term1366408.getClass(), "componentSerializedDataVersion", 0);
        setField(term1366408, term1366408.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleLeaders", argTypes, term1366408, args);
    }

};


