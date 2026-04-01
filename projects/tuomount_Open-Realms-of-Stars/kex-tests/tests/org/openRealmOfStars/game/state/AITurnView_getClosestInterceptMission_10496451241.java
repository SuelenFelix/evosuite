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

public class AITurnView_getClosestInterceptMission_10496451241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1224020;

    public AITurnView_getClosestInterceptMission_10496451241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1224020 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1224020, term1224020.getClass(), "label", null);
        setField(term1224020, term1224020.getClass(), "game", null);
        setIntField(term1224020, term1224020.getClass(), "textAnim", 0);
        setIntField(term1224020, term1224020.getClass(), "cx", 0);
        setIntField(term1224020, term1224020.getClass(), "cy", 0);
        setField(term1224020, term1224020.getClass(), "aiThread", null);
        setBooleanField(term1224020, term1224020.getClass(), "readyToMove", false);
        setField(term1224020, term1224020.getClass(), "nextState", null);
        setField(term1224020, term1224020.getClass(), "nextStateObject", null);
        setBooleanField(term1224020, term1224020.getClass(), "isAlignmentXSet", false);
        setFloatField(term1224020, term1224020.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1224020, term1224020.getClass(), "isAlignmentYSet", false);
        setFloatField(term1224020, term1224020.getClass(), "alignmentY", 0.0F);
        setField(term1224020, term1224020.getClass(), "ui", null);
        setField(term1224020, term1224020.getClass(), "listenerList", null);
        setField(term1224020, term1224020.getClass(), "clientProperties", null);
        setField(term1224020, term1224020.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1224020, term1224020.getClass(), "autoscrolls", false);
        setField(term1224020, term1224020.getClass(), "border", null);
        setIntField(term1224020, term1224020.getClass(), "flags", 0);
        setField(term1224020, term1224020.getClass(), "inputVerifier", null);
        setBooleanField(term1224020, term1224020.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1224020, term1224020.getClass(), "paintingChild", null);
        setField(term1224020, term1224020.getClass(), "popupMenu", null);
        setField(term1224020, term1224020.getClass(), "revalidateRunnableScheduled", null);
        setField(term1224020, term1224020.getClass(), "focusInputMap", null);
        setField(term1224020, term1224020.getClass(), "ancestorInputMap", null);
        setField(term1224020, term1224020.getClass(), "windowInputMap", null);
        setField(term1224020, term1224020.getClass(), "actionMap", null);
        setField(term1224020, term1224020.getClass(), "aaHint", null);
        setField(term1224020, term1224020.getClass(), "lcdRenderingHint", null);
        setField(term1224020, term1224020.getClass(), "component", null);
        setField(term1224020, term1224020.getClass(), "layoutMgr", null);
        setField(term1224020, term1224020.getClass(), "dispatcher", null);
        setField(term1224020, term1224020.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1224020, term1224020.getClass(), "focusCycleRoot", false);
        setBooleanField(term1224020, term1224020.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1224020, term1224020.getClass(), "printingThreads", null);
        setBooleanField(term1224020, term1224020.getClass(), "printing", false);
        setField(term1224020, term1224020.getClass(), "containerListener", null);
        setIntField(term1224020, term1224020.getClass(), "listeningChildren", 0);
        setIntField(term1224020, term1224020.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1224020, term1224020.getClass(), "descendantsCount", 0);
        setField(term1224020, term1224020.getClass(), "preserveBackgroundColor", null);
        setIntField(term1224020, term1224020.getClass(), "numOfHWComponents", 0);
        setIntField(term1224020, term1224020.getClass(), "numOfLWComponents", 0);
        setField(term1224020, term1224020.getClass(), "modalComp", null);
        setField(term1224020, term1224020.getClass(), "modalAppContext", null);
        setIntField(term1224020, term1224020.getClass(), "containerSerializedDataVersion", 0);
        setField(term1224020, term1224020.getClass(), "peer", null);
        setField(term1224020, term1224020.getClass(), "parent", null);
        setField(term1224020, term1224020.getClass(), "appContext", null);
        setIntField(term1224020, term1224020.getClass(), "x", 0);
        setIntField(term1224020, term1224020.getClass(), "y", 0);
        setIntField(term1224020, term1224020.getClass(), "width", 0);
        setIntField(term1224020, term1224020.getClass(), "height", 0);
        setField(term1224020, term1224020.getClass(), "foreground", null);
        setField(term1224020, term1224020.getClass(), "background", null);
        setField(term1224020, term1224020.getClass(), "font", null);
        setField(term1224020, term1224020.getClass(), "peerFont", null);
        setField(term1224020, term1224020.getClass(), "cursor", null);
        setField(term1224020, term1224020.getClass(), "locale", null);
        setField(term1224020, term1224020.getClass(), "graphicsConfig", null);
        setField(term1224020, term1224020.getClass(), "bufferStrategy", null);
        setBooleanField(term1224020, term1224020.getClass(), "ignoreRepaint", false);
        setBooleanField(term1224020, term1224020.getClass(), "visible", false);
        setBooleanField(term1224020, term1224020.getClass(), "enabled", false);
        setBooleanField(term1224020, term1224020.getClass(), "valid", false);
        setField(term1224020, term1224020.getClass(), "dropTarget", null);
        setField(term1224020, term1224020.getClass(), "popups", null);
        setField(term1224020, term1224020.getClass(), "name", null);
        setBooleanField(term1224020, term1224020.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1224020, term1224020.getClass(), "focusable", false);
        setIntField(term1224020, term1224020.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1224020, term1224020.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1224020, term1224020.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1224020, term1224020.getClass(), "acc", null);
        setField(term1224020, term1224020.getClass(), "minSize", null);
        setBooleanField(term1224020, term1224020.getClass(), "minSizeSet", false);
        setField(term1224020, term1224020.getClass(), "prefSize", null);
        setBooleanField(term1224020, term1224020.getClass(), "prefSizeSet", false);
        setField(term1224020, term1224020.getClass(), "maxSize", null);
        setBooleanField(term1224020, term1224020.getClass(), "maxSizeSet", false);
        setField(term1224020, term1224020.getClass(), "componentOrientation", null);
        setBooleanField(term1224020, term1224020.getClass(), "newEventsOnly", false);
        setField(term1224020, term1224020.getClass(), "componentListener", null);
        setField(term1224020, term1224020.getClass(), "focusListener", null);
        setField(term1224020, term1224020.getClass(), "hierarchyListener", null);
        setField(term1224020, term1224020.getClass(), "hierarchyBoundsListener", null);
        setField(term1224020, term1224020.getClass(), "keyListener", null);
        setField(term1224020, term1224020.getClass(), "mouseListener", null);
        setField(term1224020, term1224020.getClass(), "mouseMotionListener", null);
        setField(term1224020, term1224020.getClass(), "mouseWheelListener", null);
        setField(term1224020, term1224020.getClass(), "inputMethodListener", null);
        setLongField(term1224020, term1224020.getClass(), "eventMask", 0L);
        setField(term1224020, term1224020.getClass(), "changeSupport", null);
        setField(term1224020, term1224020.getClass(), "objectLock", null);
        setBooleanField(term1224020, term1224020.getClass(), "isPacked", false);
        setIntField(term1224020, term1224020.getClass(), "boundsOp", 0);
        setField(term1224020, term1224020.getClass(), "compoundShape", null);
        setField(term1224020, term1224020.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1224020, term1224020.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1224020, term1224020.getClass(), "backgroundEraseDisabled", false);
        setField(term1224020, term1224020.getClass(), "eventCache", null);
        setBooleanField(term1224020, term1224020.getClass(), "coalescingEnabled", false);
        setBooleanField(term1224020, term1224020.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1224020, term1224020.getClass(), "componentSerializedDataVersion", 0);
        setField(term1224020, term1224020.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getClosestInterceptMission", argTypes, term1224020, args);
    }

};


