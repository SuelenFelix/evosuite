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

public class AITurnView_findBestDestroyStarbase_165546562621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147289;

    public AITurnView_findBestDestroyStarbase_165546562621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1147289 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1147289, term1147289.getClass(), "label", null);
        setField(term1147289, term1147289.getClass(), "game", null);
        setIntField(term1147289, term1147289.getClass(), "textAnim", 0);
        setIntField(term1147289, term1147289.getClass(), "cx", 0);
        setIntField(term1147289, term1147289.getClass(), "cy", 0);
        setField(term1147289, term1147289.getClass(), "aiThread", null);
        setBooleanField(term1147289, term1147289.getClass(), "readyToMove", false);
        setField(term1147289, term1147289.getClass(), "nextState", null);
        setField(term1147289, term1147289.getClass(), "nextStateObject", null);
        setBooleanField(term1147289, term1147289.getClass(), "isAlignmentXSet", false);
        setFloatField(term1147289, term1147289.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1147289, term1147289.getClass(), "isAlignmentYSet", false);
        setFloatField(term1147289, term1147289.getClass(), "alignmentY", 0.0F);
        setField(term1147289, term1147289.getClass(), "ui", null);
        setField(term1147289, term1147289.getClass(), "listenerList", null);
        setField(term1147289, term1147289.getClass(), "clientProperties", null);
        setField(term1147289, term1147289.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1147289, term1147289.getClass(), "autoscrolls", false);
        setField(term1147289, term1147289.getClass(), "border", null);
        setIntField(term1147289, term1147289.getClass(), "flags", 0);
        setField(term1147289, term1147289.getClass(), "inputVerifier", null);
        setBooleanField(term1147289, term1147289.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1147289, term1147289.getClass(), "paintingChild", null);
        setField(term1147289, term1147289.getClass(), "popupMenu", null);
        setField(term1147289, term1147289.getClass(), "revalidateRunnableScheduled", null);
        setField(term1147289, term1147289.getClass(), "focusInputMap", null);
        setField(term1147289, term1147289.getClass(), "ancestorInputMap", null);
        setField(term1147289, term1147289.getClass(), "windowInputMap", null);
        setField(term1147289, term1147289.getClass(), "actionMap", null);
        setField(term1147289, term1147289.getClass(), "aaHint", null);
        setField(term1147289, term1147289.getClass(), "lcdRenderingHint", null);
        setField(term1147289, term1147289.getClass(), "component", null);
        setField(term1147289, term1147289.getClass(), "layoutMgr", null);
        setField(term1147289, term1147289.getClass(), "dispatcher", null);
        setField(term1147289, term1147289.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1147289, term1147289.getClass(), "focusCycleRoot", false);
        setBooleanField(term1147289, term1147289.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1147289, term1147289.getClass(), "printingThreads", null);
        setBooleanField(term1147289, term1147289.getClass(), "printing", false);
        setField(term1147289, term1147289.getClass(), "containerListener", null);
        setIntField(term1147289, term1147289.getClass(), "listeningChildren", 0);
        setIntField(term1147289, term1147289.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1147289, term1147289.getClass(), "descendantsCount", 0);
        setField(term1147289, term1147289.getClass(), "preserveBackgroundColor", null);
        setIntField(term1147289, term1147289.getClass(), "numOfHWComponents", 0);
        setIntField(term1147289, term1147289.getClass(), "numOfLWComponents", 0);
        setField(term1147289, term1147289.getClass(), "modalComp", null);
        setField(term1147289, term1147289.getClass(), "modalAppContext", null);
        setIntField(term1147289, term1147289.getClass(), "containerSerializedDataVersion", 0);
        setField(term1147289, term1147289.getClass(), "peer", null);
        setField(term1147289, term1147289.getClass(), "parent", null);
        setField(term1147289, term1147289.getClass(), "appContext", null);
        setIntField(term1147289, term1147289.getClass(), "x", 0);
        setIntField(term1147289, term1147289.getClass(), "y", 0);
        setIntField(term1147289, term1147289.getClass(), "width", 0);
        setIntField(term1147289, term1147289.getClass(), "height", 0);
        setField(term1147289, term1147289.getClass(), "foreground", null);
        setField(term1147289, term1147289.getClass(), "background", null);
        setField(term1147289, term1147289.getClass(), "font", null);
        setField(term1147289, term1147289.getClass(), "peerFont", null);
        setField(term1147289, term1147289.getClass(), "cursor", null);
        setField(term1147289, term1147289.getClass(), "locale", null);
        setField(term1147289, term1147289.getClass(), "graphicsConfig", null);
        setField(term1147289, term1147289.getClass(), "bufferStrategy", null);
        setBooleanField(term1147289, term1147289.getClass(), "ignoreRepaint", false);
        setBooleanField(term1147289, term1147289.getClass(), "visible", false);
        setBooleanField(term1147289, term1147289.getClass(), "enabled", false);
        setBooleanField(term1147289, term1147289.getClass(), "valid", false);
        setField(term1147289, term1147289.getClass(), "dropTarget", null);
        setField(term1147289, term1147289.getClass(), "popups", null);
        setField(term1147289, term1147289.getClass(), "name", null);
        setBooleanField(term1147289, term1147289.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1147289, term1147289.getClass(), "focusable", false);
        setIntField(term1147289, term1147289.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1147289, term1147289.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1147289, term1147289.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1147289, term1147289.getClass(), "acc", null);
        setField(term1147289, term1147289.getClass(), "minSize", null);
        setBooleanField(term1147289, term1147289.getClass(), "minSizeSet", false);
        setField(term1147289, term1147289.getClass(), "prefSize", null);
        setBooleanField(term1147289, term1147289.getClass(), "prefSizeSet", false);
        setField(term1147289, term1147289.getClass(), "maxSize", null);
        setBooleanField(term1147289, term1147289.getClass(), "maxSizeSet", false);
        setField(term1147289, term1147289.getClass(), "componentOrientation", null);
        setBooleanField(term1147289, term1147289.getClass(), "newEventsOnly", false);
        setField(term1147289, term1147289.getClass(), "componentListener", null);
        setField(term1147289, term1147289.getClass(), "focusListener", null);
        setField(term1147289, term1147289.getClass(), "hierarchyListener", null);
        setField(term1147289, term1147289.getClass(), "hierarchyBoundsListener", null);
        setField(term1147289, term1147289.getClass(), "keyListener", null);
        setField(term1147289, term1147289.getClass(), "mouseListener", null);
        setField(term1147289, term1147289.getClass(), "mouseMotionListener", null);
        setField(term1147289, term1147289.getClass(), "mouseWheelListener", null);
        setField(term1147289, term1147289.getClass(), "inputMethodListener", null);
        setLongField(term1147289, term1147289.getClass(), "eventMask", 0L);
        setField(term1147289, term1147289.getClass(), "changeSupport", null);
        setField(term1147289, term1147289.getClass(), "objectLock", null);
        setBooleanField(term1147289, term1147289.getClass(), "isPacked", false);
        setIntField(term1147289, term1147289.getClass(), "boundsOp", 0);
        setField(term1147289, term1147289.getClass(), "compoundShape", null);
        setField(term1147289, term1147289.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1147289, term1147289.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1147289, term1147289.getClass(), "backgroundEraseDisabled", false);
        setField(term1147289, term1147289.getClass(), "eventCache", null);
        setBooleanField(term1147289, term1147289.getClass(), "coalescingEnabled", false);
        setBooleanField(term1147289, term1147289.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1147289, term1147289.getClass(), "componentSerializedDataVersion", 0);
        setField(term1147289, term1147289.getClass(), "accessibleContext", null);
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
        callMethod(klass, "findBestDestroyStarbase", argTypes, term1147289, args);
    }

};


