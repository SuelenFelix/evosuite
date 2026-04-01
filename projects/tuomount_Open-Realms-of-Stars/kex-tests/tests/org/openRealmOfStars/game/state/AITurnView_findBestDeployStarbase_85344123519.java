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

public class AITurnView_findBestDeployStarbase_85344123519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138831;

    public AITurnView_findBestDeployStarbase_85344123519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1138831 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1138831, term1138831.getClass(), "label", null);
        setField(term1138831, term1138831.getClass(), "game", null);
        setIntField(term1138831, term1138831.getClass(), "textAnim", 0);
        setIntField(term1138831, term1138831.getClass(), "cx", 0);
        setIntField(term1138831, term1138831.getClass(), "cy", 0);
        setField(term1138831, term1138831.getClass(), "aiThread", null);
        setBooleanField(term1138831, term1138831.getClass(), "readyToMove", false);
        setField(term1138831, term1138831.getClass(), "nextState", null);
        setField(term1138831, term1138831.getClass(), "nextStateObject", null);
        setBooleanField(term1138831, term1138831.getClass(), "isAlignmentXSet", false);
        setFloatField(term1138831, term1138831.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1138831, term1138831.getClass(), "isAlignmentYSet", false);
        setFloatField(term1138831, term1138831.getClass(), "alignmentY", 0.0F);
        setField(term1138831, term1138831.getClass(), "ui", null);
        setField(term1138831, term1138831.getClass(), "listenerList", null);
        setField(term1138831, term1138831.getClass(), "clientProperties", null);
        setField(term1138831, term1138831.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1138831, term1138831.getClass(), "autoscrolls", false);
        setField(term1138831, term1138831.getClass(), "border", null);
        setIntField(term1138831, term1138831.getClass(), "flags", 0);
        setField(term1138831, term1138831.getClass(), "inputVerifier", null);
        setBooleanField(term1138831, term1138831.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1138831, term1138831.getClass(), "paintingChild", null);
        setField(term1138831, term1138831.getClass(), "popupMenu", null);
        setField(term1138831, term1138831.getClass(), "revalidateRunnableScheduled", null);
        setField(term1138831, term1138831.getClass(), "focusInputMap", null);
        setField(term1138831, term1138831.getClass(), "ancestorInputMap", null);
        setField(term1138831, term1138831.getClass(), "windowInputMap", null);
        setField(term1138831, term1138831.getClass(), "actionMap", null);
        setField(term1138831, term1138831.getClass(), "aaHint", null);
        setField(term1138831, term1138831.getClass(), "lcdRenderingHint", null);
        setField(term1138831, term1138831.getClass(), "component", null);
        setField(term1138831, term1138831.getClass(), "layoutMgr", null);
        setField(term1138831, term1138831.getClass(), "dispatcher", null);
        setField(term1138831, term1138831.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1138831, term1138831.getClass(), "focusCycleRoot", false);
        setBooleanField(term1138831, term1138831.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1138831, term1138831.getClass(), "printingThreads", null);
        setBooleanField(term1138831, term1138831.getClass(), "printing", false);
        setField(term1138831, term1138831.getClass(), "containerListener", null);
        setIntField(term1138831, term1138831.getClass(), "listeningChildren", 0);
        setIntField(term1138831, term1138831.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1138831, term1138831.getClass(), "descendantsCount", 0);
        setField(term1138831, term1138831.getClass(), "preserveBackgroundColor", null);
        setIntField(term1138831, term1138831.getClass(), "numOfHWComponents", 0);
        setIntField(term1138831, term1138831.getClass(), "numOfLWComponents", 0);
        setField(term1138831, term1138831.getClass(), "modalComp", null);
        setField(term1138831, term1138831.getClass(), "modalAppContext", null);
        setIntField(term1138831, term1138831.getClass(), "containerSerializedDataVersion", 0);
        setField(term1138831, term1138831.getClass(), "peer", null);
        setField(term1138831, term1138831.getClass(), "parent", null);
        setField(term1138831, term1138831.getClass(), "appContext", null);
        setIntField(term1138831, term1138831.getClass(), "x", 0);
        setIntField(term1138831, term1138831.getClass(), "y", 0);
        setIntField(term1138831, term1138831.getClass(), "width", 0);
        setIntField(term1138831, term1138831.getClass(), "height", 0);
        setField(term1138831, term1138831.getClass(), "foreground", null);
        setField(term1138831, term1138831.getClass(), "background", null);
        setField(term1138831, term1138831.getClass(), "font", null);
        setField(term1138831, term1138831.getClass(), "peerFont", null);
        setField(term1138831, term1138831.getClass(), "cursor", null);
        setField(term1138831, term1138831.getClass(), "locale", null);
        setField(term1138831, term1138831.getClass(), "graphicsConfig", null);
        setField(term1138831, term1138831.getClass(), "bufferStrategy", null);
        setBooleanField(term1138831, term1138831.getClass(), "ignoreRepaint", false);
        setBooleanField(term1138831, term1138831.getClass(), "visible", false);
        setBooleanField(term1138831, term1138831.getClass(), "enabled", false);
        setBooleanField(term1138831, term1138831.getClass(), "valid", false);
        setField(term1138831, term1138831.getClass(), "dropTarget", null);
        setField(term1138831, term1138831.getClass(), "popups", null);
        setField(term1138831, term1138831.getClass(), "name", null);
        setBooleanField(term1138831, term1138831.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1138831, term1138831.getClass(), "focusable", false);
        setIntField(term1138831, term1138831.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1138831, term1138831.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1138831, term1138831.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1138831, term1138831.getClass(), "acc", null);
        setField(term1138831, term1138831.getClass(), "minSize", null);
        setBooleanField(term1138831, term1138831.getClass(), "minSizeSet", false);
        setField(term1138831, term1138831.getClass(), "prefSize", null);
        setBooleanField(term1138831, term1138831.getClass(), "prefSizeSet", false);
        setField(term1138831, term1138831.getClass(), "maxSize", null);
        setBooleanField(term1138831, term1138831.getClass(), "maxSizeSet", false);
        setField(term1138831, term1138831.getClass(), "componentOrientation", null);
        setBooleanField(term1138831, term1138831.getClass(), "newEventsOnly", false);
        setField(term1138831, term1138831.getClass(), "componentListener", null);
        setField(term1138831, term1138831.getClass(), "focusListener", null);
        setField(term1138831, term1138831.getClass(), "hierarchyListener", null);
        setField(term1138831, term1138831.getClass(), "hierarchyBoundsListener", null);
        setField(term1138831, term1138831.getClass(), "keyListener", null);
        setField(term1138831, term1138831.getClass(), "mouseListener", null);
        setField(term1138831, term1138831.getClass(), "mouseMotionListener", null);
        setField(term1138831, term1138831.getClass(), "mouseWheelListener", null);
        setField(term1138831, term1138831.getClass(), "inputMethodListener", null);
        setLongField(term1138831, term1138831.getClass(), "eventMask", 0L);
        setField(term1138831, term1138831.getClass(), "changeSupport", null);
        setField(term1138831, term1138831.getClass(), "objectLock", null);
        setBooleanField(term1138831, term1138831.getClass(), "isPacked", false);
        setIntField(term1138831, term1138831.getClass(), "boundsOp", 0);
        setField(term1138831, term1138831.getClass(), "compoundShape", null);
        setField(term1138831, term1138831.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1138831, term1138831.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1138831, term1138831.getClass(), "backgroundEraseDisabled", false);
        setField(term1138831, term1138831.getClass(), "eventCache", null);
        setBooleanField(term1138831, term1138831.getClass(), "coalescingEnabled", false);
        setBooleanField(term1138831, term1138831.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1138831, term1138831.getClass(), "componentSerializedDataVersion", 0);
        setField(term1138831, term1138831.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "findBestDeployStarbase", argTypes, term1138831, args);
    }

};


