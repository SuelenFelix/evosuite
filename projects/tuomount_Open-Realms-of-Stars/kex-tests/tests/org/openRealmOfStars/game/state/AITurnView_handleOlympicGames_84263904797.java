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

public class AITurnView_handleOlympicGames_84263904797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378444;

    public AITurnView_handleOlympicGames_84263904797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378444 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378444, term1378444.getClass(), "label", null);
        setField(term1378444, term1378444.getClass(), "game", null);
        setIntField(term1378444, term1378444.getClass(), "textAnim", 0);
        setIntField(term1378444, term1378444.getClass(), "cx", 0);
        setIntField(term1378444, term1378444.getClass(), "cy", 0);
        setField(term1378444, term1378444.getClass(), "aiThread", null);
        setBooleanField(term1378444, term1378444.getClass(), "readyToMove", false);
        setField(term1378444, term1378444.getClass(), "nextState", null);
        setField(term1378444, term1378444.getClass(), "nextStateObject", null);
        setBooleanField(term1378444, term1378444.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378444, term1378444.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378444, term1378444.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378444, term1378444.getClass(), "alignmentY", 0.0F);
        setField(term1378444, term1378444.getClass(), "ui", null);
        setField(term1378444, term1378444.getClass(), "listenerList", null);
        setField(term1378444, term1378444.getClass(), "clientProperties", null);
        setField(term1378444, term1378444.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378444, term1378444.getClass(), "autoscrolls", false);
        setField(term1378444, term1378444.getClass(), "border", null);
        setIntField(term1378444, term1378444.getClass(), "flags", 0);
        setField(term1378444, term1378444.getClass(), "inputVerifier", null);
        setBooleanField(term1378444, term1378444.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378444, term1378444.getClass(), "paintingChild", null);
        setField(term1378444, term1378444.getClass(), "popupMenu", null);
        setField(term1378444, term1378444.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378444, term1378444.getClass(), "focusInputMap", null);
        setField(term1378444, term1378444.getClass(), "ancestorInputMap", null);
        setField(term1378444, term1378444.getClass(), "windowInputMap", null);
        setField(term1378444, term1378444.getClass(), "actionMap", null);
        setField(term1378444, term1378444.getClass(), "aaHint", null);
        setField(term1378444, term1378444.getClass(), "lcdRenderingHint", null);
        setField(term1378444, term1378444.getClass(), "component", null);
        setField(term1378444, term1378444.getClass(), "layoutMgr", null);
        setField(term1378444, term1378444.getClass(), "dispatcher", null);
        setField(term1378444, term1378444.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378444, term1378444.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378444, term1378444.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378444, term1378444.getClass(), "printingThreads", null);
        setBooleanField(term1378444, term1378444.getClass(), "printing", false);
        setField(term1378444, term1378444.getClass(), "containerListener", null);
        setIntField(term1378444, term1378444.getClass(), "listeningChildren", 0);
        setIntField(term1378444, term1378444.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378444, term1378444.getClass(), "descendantsCount", 0);
        setField(term1378444, term1378444.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378444, term1378444.getClass(), "numOfHWComponents", 0);
        setIntField(term1378444, term1378444.getClass(), "numOfLWComponents", 0);
        setField(term1378444, term1378444.getClass(), "modalComp", null);
        setField(term1378444, term1378444.getClass(), "modalAppContext", null);
        setIntField(term1378444, term1378444.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378444, term1378444.getClass(), "peer", null);
        setField(term1378444, term1378444.getClass(), "parent", null);
        setField(term1378444, term1378444.getClass(), "appContext", null);
        setIntField(term1378444, term1378444.getClass(), "x", 0);
        setIntField(term1378444, term1378444.getClass(), "y", 0);
        setIntField(term1378444, term1378444.getClass(), "width", 0);
        setIntField(term1378444, term1378444.getClass(), "height", 0);
        setField(term1378444, term1378444.getClass(), "foreground", null);
        setField(term1378444, term1378444.getClass(), "background", null);
        setField(term1378444, term1378444.getClass(), "font", null);
        setField(term1378444, term1378444.getClass(), "peerFont", null);
        setField(term1378444, term1378444.getClass(), "cursor", null);
        setField(term1378444, term1378444.getClass(), "locale", null);
        setField(term1378444, term1378444.getClass(), "graphicsConfig", null);
        setField(term1378444, term1378444.getClass(), "bufferStrategy", null);
        setBooleanField(term1378444, term1378444.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378444, term1378444.getClass(), "visible", false);
        setBooleanField(term1378444, term1378444.getClass(), "enabled", false);
        setBooleanField(term1378444, term1378444.getClass(), "valid", false);
        setField(term1378444, term1378444.getClass(), "dropTarget", null);
        setField(term1378444, term1378444.getClass(), "popups", null);
        setField(term1378444, term1378444.getClass(), "name", null);
        setBooleanField(term1378444, term1378444.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378444, term1378444.getClass(), "focusable", false);
        setIntField(term1378444, term1378444.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378444, term1378444.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378444, term1378444.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378444, term1378444.getClass(), "acc", null);
        setField(term1378444, term1378444.getClass(), "minSize", null);
        setBooleanField(term1378444, term1378444.getClass(), "minSizeSet", false);
        setField(term1378444, term1378444.getClass(), "prefSize", null);
        setBooleanField(term1378444, term1378444.getClass(), "prefSizeSet", false);
        setField(term1378444, term1378444.getClass(), "maxSize", null);
        setBooleanField(term1378444, term1378444.getClass(), "maxSizeSet", false);
        setField(term1378444, term1378444.getClass(), "componentOrientation", null);
        setBooleanField(term1378444, term1378444.getClass(), "newEventsOnly", false);
        setField(term1378444, term1378444.getClass(), "componentListener", null);
        setField(term1378444, term1378444.getClass(), "focusListener", null);
        setField(term1378444, term1378444.getClass(), "hierarchyListener", null);
        setField(term1378444, term1378444.getClass(), "hierarchyBoundsListener", null);
        setField(term1378444, term1378444.getClass(), "keyListener", null);
        setField(term1378444, term1378444.getClass(), "mouseListener", null);
        setField(term1378444, term1378444.getClass(), "mouseMotionListener", null);
        setField(term1378444, term1378444.getClass(), "mouseWheelListener", null);
        setField(term1378444, term1378444.getClass(), "inputMethodListener", null);
        setLongField(term1378444, term1378444.getClass(), "eventMask", 0L);
        setField(term1378444, term1378444.getClass(), "changeSupport", null);
        setField(term1378444, term1378444.getClass(), "objectLock", null);
        setBooleanField(term1378444, term1378444.getClass(), "isPacked", false);
        setIntField(term1378444, term1378444.getClass(), "boundsOp", 0);
        setField(term1378444, term1378444.getClass(), "compoundShape", null);
        setField(term1378444, term1378444.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378444, term1378444.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378444, term1378444.getClass(), "backgroundEraseDisabled", false);
        setField(term1378444, term1378444.getClass(), "eventCache", null);
        setBooleanField(term1378444, term1378444.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378444, term1378444.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378444, term1378444.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378444, term1378444.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleOlympicGames", argTypes, term1378444, args);
    }

};


