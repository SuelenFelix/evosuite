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

public class AITurnView_getClosestInterceptMission_10496451239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1275281;

    public AITurnView_getClosestInterceptMission_10496451239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1275281 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1275281, term1275281.getClass(), "label", null);
        setField(term1275281, term1275281.getClass(), "game", null);
        setIntField(term1275281, term1275281.getClass(), "textAnim", 0);
        setIntField(term1275281, term1275281.getClass(), "cx", 0);
        setIntField(term1275281, term1275281.getClass(), "cy", 0);
        setField(term1275281, term1275281.getClass(), "aiThread", null);
        setBooleanField(term1275281, term1275281.getClass(), "readyToMove", false);
        setField(term1275281, term1275281.getClass(), "nextState", null);
        setField(term1275281, term1275281.getClass(), "nextStateObject", null);
        setBooleanField(term1275281, term1275281.getClass(), "isAlignmentXSet", false);
        setFloatField(term1275281, term1275281.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1275281, term1275281.getClass(), "isAlignmentYSet", false);
        setFloatField(term1275281, term1275281.getClass(), "alignmentY", 0.0F);
        setField(term1275281, term1275281.getClass(), "ui", null);
        setField(term1275281, term1275281.getClass(), "listenerList", null);
        setField(term1275281, term1275281.getClass(), "clientProperties", null);
        setField(term1275281, term1275281.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1275281, term1275281.getClass(), "autoscrolls", false);
        setField(term1275281, term1275281.getClass(), "border", null);
        setIntField(term1275281, term1275281.getClass(), "flags", 0);
        setField(term1275281, term1275281.getClass(), "inputVerifier", null);
        setBooleanField(term1275281, term1275281.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1275281, term1275281.getClass(), "paintingChild", null);
        setField(term1275281, term1275281.getClass(), "popupMenu", null);
        setField(term1275281, term1275281.getClass(), "revalidateRunnableScheduled", null);
        setField(term1275281, term1275281.getClass(), "focusInputMap", null);
        setField(term1275281, term1275281.getClass(), "ancestorInputMap", null);
        setField(term1275281, term1275281.getClass(), "windowInputMap", null);
        setField(term1275281, term1275281.getClass(), "actionMap", null);
        setField(term1275281, term1275281.getClass(), "aaHint", null);
        setField(term1275281, term1275281.getClass(), "lcdRenderingHint", null);
        setField(term1275281, term1275281.getClass(), "component", null);
        setField(term1275281, term1275281.getClass(), "layoutMgr", null);
        setField(term1275281, term1275281.getClass(), "dispatcher", null);
        setField(term1275281, term1275281.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1275281, term1275281.getClass(), "focusCycleRoot", false);
        setBooleanField(term1275281, term1275281.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1275281, term1275281.getClass(), "printingThreads", null);
        setBooleanField(term1275281, term1275281.getClass(), "printing", false);
        setField(term1275281, term1275281.getClass(), "containerListener", null);
        setIntField(term1275281, term1275281.getClass(), "listeningChildren", 0);
        setIntField(term1275281, term1275281.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1275281, term1275281.getClass(), "descendantsCount", 0);
        setField(term1275281, term1275281.getClass(), "preserveBackgroundColor", null);
        setIntField(term1275281, term1275281.getClass(), "numOfHWComponents", 0);
        setIntField(term1275281, term1275281.getClass(), "numOfLWComponents", 0);
        setField(term1275281, term1275281.getClass(), "modalComp", null);
        setField(term1275281, term1275281.getClass(), "modalAppContext", null);
        setIntField(term1275281, term1275281.getClass(), "containerSerializedDataVersion", 0);
        setField(term1275281, term1275281.getClass(), "peer", null);
        setField(term1275281, term1275281.getClass(), "parent", null);
        setField(term1275281, term1275281.getClass(), "appContext", null);
        setIntField(term1275281, term1275281.getClass(), "x", 0);
        setIntField(term1275281, term1275281.getClass(), "y", 0);
        setIntField(term1275281, term1275281.getClass(), "width", 0);
        setIntField(term1275281, term1275281.getClass(), "height", 0);
        setField(term1275281, term1275281.getClass(), "foreground", null);
        setField(term1275281, term1275281.getClass(), "background", null);
        setField(term1275281, term1275281.getClass(), "font", null);
        setField(term1275281, term1275281.getClass(), "peerFont", null);
        setField(term1275281, term1275281.getClass(), "cursor", null);
        setField(term1275281, term1275281.getClass(), "locale", null);
        setField(term1275281, term1275281.getClass(), "graphicsConfig", null);
        setField(term1275281, term1275281.getClass(), "bufferStrategy", null);
        setBooleanField(term1275281, term1275281.getClass(), "ignoreRepaint", false);
        setBooleanField(term1275281, term1275281.getClass(), "visible", false);
        setBooleanField(term1275281, term1275281.getClass(), "enabled", false);
        setBooleanField(term1275281, term1275281.getClass(), "valid", false);
        setField(term1275281, term1275281.getClass(), "dropTarget", null);
        setField(term1275281, term1275281.getClass(), "popups", null);
        setField(term1275281, term1275281.getClass(), "name", null);
        setBooleanField(term1275281, term1275281.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1275281, term1275281.getClass(), "focusable", false);
        setIntField(term1275281, term1275281.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1275281, term1275281.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1275281, term1275281.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1275281, term1275281.getClass(), "acc", null);
        setField(term1275281, term1275281.getClass(), "minSize", null);
        setBooleanField(term1275281, term1275281.getClass(), "minSizeSet", false);
        setField(term1275281, term1275281.getClass(), "prefSize", null);
        setBooleanField(term1275281, term1275281.getClass(), "prefSizeSet", false);
        setField(term1275281, term1275281.getClass(), "maxSize", null);
        setBooleanField(term1275281, term1275281.getClass(), "maxSizeSet", false);
        setField(term1275281, term1275281.getClass(), "componentOrientation", null);
        setBooleanField(term1275281, term1275281.getClass(), "newEventsOnly", false);
        setField(term1275281, term1275281.getClass(), "componentListener", null);
        setField(term1275281, term1275281.getClass(), "focusListener", null);
        setField(term1275281, term1275281.getClass(), "hierarchyListener", null);
        setField(term1275281, term1275281.getClass(), "hierarchyBoundsListener", null);
        setField(term1275281, term1275281.getClass(), "keyListener", null);
        setField(term1275281, term1275281.getClass(), "mouseListener", null);
        setField(term1275281, term1275281.getClass(), "mouseMotionListener", null);
        setField(term1275281, term1275281.getClass(), "mouseWheelListener", null);
        setField(term1275281, term1275281.getClass(), "inputMethodListener", null);
        setLongField(term1275281, term1275281.getClass(), "eventMask", 0L);
        setField(term1275281, term1275281.getClass(), "changeSupport", null);
        setField(term1275281, term1275281.getClass(), "objectLock", null);
        setBooleanField(term1275281, term1275281.getClass(), "isPacked", false);
        setIntField(term1275281, term1275281.getClass(), "boundsOp", 0);
        setField(term1275281, term1275281.getClass(), "compoundShape", null);
        setField(term1275281, term1275281.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1275281, term1275281.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1275281, term1275281.getClass(), "backgroundEraseDisabled", false);
        setField(term1275281, term1275281.getClass(), "eventCache", null);
        setBooleanField(term1275281, term1275281.getClass(), "coalescingEnabled", false);
        setBooleanField(term1275281, term1275281.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1275281, term1275281.getClass(), "componentSerializedDataVersion", 0);
        setField(term1275281, term1275281.getClass(), "accessibleContext", null);
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
        callMethod(klass, "getClosestInterceptMission", argTypes, term1275281, args);
    }

};


