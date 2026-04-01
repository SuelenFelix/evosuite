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

public class AITurnView_calculateCorruptionLevel_604400732102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378669;

    public AITurnView_calculateCorruptionLevel_604400732102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378669 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378669, term1378669.getClass(), "label", null);
        setField(term1378669, term1378669.getClass(), "game", null);
        setIntField(term1378669, term1378669.getClass(), "textAnim", 0);
        setIntField(term1378669, term1378669.getClass(), "cx", 0);
        setIntField(term1378669, term1378669.getClass(), "cy", 0);
        setField(term1378669, term1378669.getClass(), "aiThread", null);
        setBooleanField(term1378669, term1378669.getClass(), "readyToMove", false);
        setField(term1378669, term1378669.getClass(), "nextState", null);
        setField(term1378669, term1378669.getClass(), "nextStateObject", null);
        setBooleanField(term1378669, term1378669.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378669, term1378669.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378669, term1378669.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378669, term1378669.getClass(), "alignmentY", 0.0F);
        setField(term1378669, term1378669.getClass(), "ui", null);
        setField(term1378669, term1378669.getClass(), "listenerList", null);
        setField(term1378669, term1378669.getClass(), "clientProperties", null);
        setField(term1378669, term1378669.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378669, term1378669.getClass(), "autoscrolls", false);
        setField(term1378669, term1378669.getClass(), "border", null);
        setIntField(term1378669, term1378669.getClass(), "flags", 0);
        setField(term1378669, term1378669.getClass(), "inputVerifier", null);
        setBooleanField(term1378669, term1378669.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378669, term1378669.getClass(), "paintingChild", null);
        setField(term1378669, term1378669.getClass(), "popupMenu", null);
        setField(term1378669, term1378669.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378669, term1378669.getClass(), "focusInputMap", null);
        setField(term1378669, term1378669.getClass(), "ancestorInputMap", null);
        setField(term1378669, term1378669.getClass(), "windowInputMap", null);
        setField(term1378669, term1378669.getClass(), "actionMap", null);
        setField(term1378669, term1378669.getClass(), "aaHint", null);
        setField(term1378669, term1378669.getClass(), "lcdRenderingHint", null);
        setField(term1378669, term1378669.getClass(), "component", null);
        setField(term1378669, term1378669.getClass(), "layoutMgr", null);
        setField(term1378669, term1378669.getClass(), "dispatcher", null);
        setField(term1378669, term1378669.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378669, term1378669.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378669, term1378669.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378669, term1378669.getClass(), "printingThreads", null);
        setBooleanField(term1378669, term1378669.getClass(), "printing", false);
        setField(term1378669, term1378669.getClass(), "containerListener", null);
        setIntField(term1378669, term1378669.getClass(), "listeningChildren", 0);
        setIntField(term1378669, term1378669.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378669, term1378669.getClass(), "descendantsCount", 0);
        setField(term1378669, term1378669.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378669, term1378669.getClass(), "numOfHWComponents", 0);
        setIntField(term1378669, term1378669.getClass(), "numOfLWComponents", 0);
        setField(term1378669, term1378669.getClass(), "modalComp", null);
        setField(term1378669, term1378669.getClass(), "modalAppContext", null);
        setIntField(term1378669, term1378669.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378669, term1378669.getClass(), "peer", null);
        setField(term1378669, term1378669.getClass(), "parent", null);
        setField(term1378669, term1378669.getClass(), "appContext", null);
        setIntField(term1378669, term1378669.getClass(), "x", 0);
        setIntField(term1378669, term1378669.getClass(), "y", 0);
        setIntField(term1378669, term1378669.getClass(), "width", 0);
        setIntField(term1378669, term1378669.getClass(), "height", 0);
        setField(term1378669, term1378669.getClass(), "foreground", null);
        setField(term1378669, term1378669.getClass(), "background", null);
        setField(term1378669, term1378669.getClass(), "font", null);
        setField(term1378669, term1378669.getClass(), "peerFont", null);
        setField(term1378669, term1378669.getClass(), "cursor", null);
        setField(term1378669, term1378669.getClass(), "locale", null);
        setField(term1378669, term1378669.getClass(), "graphicsConfig", null);
        setField(term1378669, term1378669.getClass(), "bufferStrategy", null);
        setBooleanField(term1378669, term1378669.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378669, term1378669.getClass(), "visible", false);
        setBooleanField(term1378669, term1378669.getClass(), "enabled", false);
        setBooleanField(term1378669, term1378669.getClass(), "valid", false);
        setField(term1378669, term1378669.getClass(), "dropTarget", null);
        setField(term1378669, term1378669.getClass(), "popups", null);
        setField(term1378669, term1378669.getClass(), "name", null);
        setBooleanField(term1378669, term1378669.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378669, term1378669.getClass(), "focusable", false);
        setIntField(term1378669, term1378669.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378669, term1378669.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378669, term1378669.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378669, term1378669.getClass(), "acc", null);
        setField(term1378669, term1378669.getClass(), "minSize", null);
        setBooleanField(term1378669, term1378669.getClass(), "minSizeSet", false);
        setField(term1378669, term1378669.getClass(), "prefSize", null);
        setBooleanField(term1378669, term1378669.getClass(), "prefSizeSet", false);
        setField(term1378669, term1378669.getClass(), "maxSize", null);
        setBooleanField(term1378669, term1378669.getClass(), "maxSizeSet", false);
        setField(term1378669, term1378669.getClass(), "componentOrientation", null);
        setBooleanField(term1378669, term1378669.getClass(), "newEventsOnly", false);
        setField(term1378669, term1378669.getClass(), "componentListener", null);
        setField(term1378669, term1378669.getClass(), "focusListener", null);
        setField(term1378669, term1378669.getClass(), "hierarchyListener", null);
        setField(term1378669, term1378669.getClass(), "hierarchyBoundsListener", null);
        setField(term1378669, term1378669.getClass(), "keyListener", null);
        setField(term1378669, term1378669.getClass(), "mouseListener", null);
        setField(term1378669, term1378669.getClass(), "mouseMotionListener", null);
        setField(term1378669, term1378669.getClass(), "mouseWheelListener", null);
        setField(term1378669, term1378669.getClass(), "inputMethodListener", null);
        setLongField(term1378669, term1378669.getClass(), "eventMask", 0L);
        setField(term1378669, term1378669.getClass(), "changeSupport", null);
        setField(term1378669, term1378669.getClass(), "objectLock", null);
        setBooleanField(term1378669, term1378669.getClass(), "isPacked", false);
        setIntField(term1378669, term1378669.getClass(), "boundsOp", 0);
        setField(term1378669, term1378669.getClass(), "compoundShape", null);
        setField(term1378669, term1378669.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378669, term1378669.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378669, term1378669.getClass(), "backgroundEraseDisabled", false);
        setField(term1378669, term1378669.getClass(), "eventCache", null);
        setBooleanField(term1378669, term1378669.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378669, term1378669.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378669, term1378669.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378669, term1378669.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateCorruptionLevel", argTypes, term1378669, args);
    }

};


