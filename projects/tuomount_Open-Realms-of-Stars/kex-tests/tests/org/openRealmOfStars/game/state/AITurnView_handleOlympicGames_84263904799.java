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

public class AITurnView_handleOlympicGames_84263904799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418763;

    public AITurnView_handleOlympicGames_84263904799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418763 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418763, term1418763.getClass(), "label", null);
        setField(term1418763, term1418763.getClass(), "game", null);
        setIntField(term1418763, term1418763.getClass(), "textAnim", 0);
        setIntField(term1418763, term1418763.getClass(), "cx", 0);
        setIntField(term1418763, term1418763.getClass(), "cy", 0);
        setField(term1418763, term1418763.getClass(), "aiThread", null);
        setBooleanField(term1418763, term1418763.getClass(), "readyToMove", false);
        setField(term1418763, term1418763.getClass(), "nextState", null);
        setField(term1418763, term1418763.getClass(), "nextStateObject", null);
        setBooleanField(term1418763, term1418763.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418763, term1418763.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418763, term1418763.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418763, term1418763.getClass(), "alignmentY", 0.0F);
        setField(term1418763, term1418763.getClass(), "ui", null);
        setField(term1418763, term1418763.getClass(), "listenerList", null);
        setField(term1418763, term1418763.getClass(), "clientProperties", null);
        setField(term1418763, term1418763.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418763, term1418763.getClass(), "autoscrolls", false);
        setField(term1418763, term1418763.getClass(), "border", null);
        setIntField(term1418763, term1418763.getClass(), "flags", 0);
        setField(term1418763, term1418763.getClass(), "inputVerifier", null);
        setBooleanField(term1418763, term1418763.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418763, term1418763.getClass(), "paintingChild", null);
        setField(term1418763, term1418763.getClass(), "popupMenu", null);
        setField(term1418763, term1418763.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418763, term1418763.getClass(), "focusInputMap", null);
        setField(term1418763, term1418763.getClass(), "ancestorInputMap", null);
        setField(term1418763, term1418763.getClass(), "windowInputMap", null);
        setField(term1418763, term1418763.getClass(), "actionMap", null);
        setField(term1418763, term1418763.getClass(), "aaHint", null);
        setField(term1418763, term1418763.getClass(), "lcdRenderingHint", null);
        setField(term1418763, term1418763.getClass(), "component", null);
        setField(term1418763, term1418763.getClass(), "layoutMgr", null);
        setField(term1418763, term1418763.getClass(), "dispatcher", null);
        setField(term1418763, term1418763.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418763, term1418763.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418763, term1418763.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418763, term1418763.getClass(), "printingThreads", null);
        setBooleanField(term1418763, term1418763.getClass(), "printing", false);
        setField(term1418763, term1418763.getClass(), "containerListener", null);
        setIntField(term1418763, term1418763.getClass(), "listeningChildren", 0);
        setIntField(term1418763, term1418763.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418763, term1418763.getClass(), "descendantsCount", 0);
        setField(term1418763, term1418763.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418763, term1418763.getClass(), "numOfHWComponents", 0);
        setIntField(term1418763, term1418763.getClass(), "numOfLWComponents", 0);
        setField(term1418763, term1418763.getClass(), "modalComp", null);
        setField(term1418763, term1418763.getClass(), "modalAppContext", null);
        setIntField(term1418763, term1418763.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418763, term1418763.getClass(), "peer", null);
        setField(term1418763, term1418763.getClass(), "parent", null);
        setField(term1418763, term1418763.getClass(), "appContext", null);
        setIntField(term1418763, term1418763.getClass(), "x", 0);
        setIntField(term1418763, term1418763.getClass(), "y", 0);
        setIntField(term1418763, term1418763.getClass(), "width", 0);
        setIntField(term1418763, term1418763.getClass(), "height", 0);
        setField(term1418763, term1418763.getClass(), "foreground", null);
        setField(term1418763, term1418763.getClass(), "background", null);
        setField(term1418763, term1418763.getClass(), "font", null);
        setField(term1418763, term1418763.getClass(), "peerFont", null);
        setField(term1418763, term1418763.getClass(), "cursor", null);
        setField(term1418763, term1418763.getClass(), "locale", null);
        setField(term1418763, term1418763.getClass(), "graphicsConfig", null);
        setField(term1418763, term1418763.getClass(), "bufferStrategy", null);
        setBooleanField(term1418763, term1418763.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418763, term1418763.getClass(), "visible", false);
        setBooleanField(term1418763, term1418763.getClass(), "enabled", false);
        setBooleanField(term1418763, term1418763.getClass(), "valid", false);
        setField(term1418763, term1418763.getClass(), "dropTarget", null);
        setField(term1418763, term1418763.getClass(), "popups", null);
        setField(term1418763, term1418763.getClass(), "name", null);
        setBooleanField(term1418763, term1418763.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418763, term1418763.getClass(), "focusable", false);
        setIntField(term1418763, term1418763.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418763, term1418763.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418763, term1418763.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418763, term1418763.getClass(), "acc", null);
        setField(term1418763, term1418763.getClass(), "minSize", null);
        setBooleanField(term1418763, term1418763.getClass(), "minSizeSet", false);
        setField(term1418763, term1418763.getClass(), "prefSize", null);
        setBooleanField(term1418763, term1418763.getClass(), "prefSizeSet", false);
        setField(term1418763, term1418763.getClass(), "maxSize", null);
        setBooleanField(term1418763, term1418763.getClass(), "maxSizeSet", false);
        setField(term1418763, term1418763.getClass(), "componentOrientation", null);
        setBooleanField(term1418763, term1418763.getClass(), "newEventsOnly", false);
        setField(term1418763, term1418763.getClass(), "componentListener", null);
        setField(term1418763, term1418763.getClass(), "focusListener", null);
        setField(term1418763, term1418763.getClass(), "hierarchyListener", null);
        setField(term1418763, term1418763.getClass(), "hierarchyBoundsListener", null);
        setField(term1418763, term1418763.getClass(), "keyListener", null);
        setField(term1418763, term1418763.getClass(), "mouseListener", null);
        setField(term1418763, term1418763.getClass(), "mouseMotionListener", null);
        setField(term1418763, term1418763.getClass(), "mouseWheelListener", null);
        setField(term1418763, term1418763.getClass(), "inputMethodListener", null);
        setLongField(term1418763, term1418763.getClass(), "eventMask", 0L);
        setField(term1418763, term1418763.getClass(), "changeSupport", null);
        setField(term1418763, term1418763.getClass(), "objectLock", null);
        setBooleanField(term1418763, term1418763.getClass(), "isPacked", false);
        setIntField(term1418763, term1418763.getClass(), "boundsOp", 0);
        setField(term1418763, term1418763.getClass(), "compoundShape", null);
        setField(term1418763, term1418763.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418763, term1418763.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418763, term1418763.getClass(), "backgroundEraseDisabled", false);
        setField(term1418763, term1418763.getClass(), "eventCache", null);
        setBooleanField(term1418763, term1418763.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418763, term1418763.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418763, term1418763.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418763, term1418763.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleOlympicGames", argTypes, term1418763, args);
    }

};


