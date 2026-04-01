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
import java.lang.Integer;

public class AITurnView_updateSpacePirates_200565699549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1258823;
     Object term1258868;

    public AITurnView_updateSpacePirates_200565699549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1258823 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1258823, term1258823.getClass(), "label", null);
        setField(term1258823, term1258823.getClass(), "game", null);
        setIntField(term1258823, term1258823.getClass(), "textAnim", 0);
        setIntField(term1258823, term1258823.getClass(), "cx", 0);
        setIntField(term1258823, term1258823.getClass(), "cy", 0);
        setField(term1258823, term1258823.getClass(), "aiThread", null);
        setBooleanField(term1258823, term1258823.getClass(), "readyToMove", false);
        setField(term1258823, term1258823.getClass(), "nextState", null);
        setField(term1258823, term1258823.getClass(), "nextStateObject", null);
        setBooleanField(term1258823, term1258823.getClass(), "isAlignmentXSet", false);
        setFloatField(term1258823, term1258823.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1258823, term1258823.getClass(), "isAlignmentYSet", false);
        setFloatField(term1258823, term1258823.getClass(), "alignmentY", 0.0F);
        setField(term1258823, term1258823.getClass(), "ui", null);
        setField(term1258823, term1258823.getClass(), "listenerList", null);
        setField(term1258823, term1258823.getClass(), "clientProperties", null);
        setField(term1258823, term1258823.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1258823, term1258823.getClass(), "autoscrolls", false);
        setField(term1258823, term1258823.getClass(), "border", null);
        setIntField(term1258823, term1258823.getClass(), "flags", 0);
        setField(term1258823, term1258823.getClass(), "inputVerifier", null);
        setBooleanField(term1258823, term1258823.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1258823, term1258823.getClass(), "paintingChild", null);
        setField(term1258823, term1258823.getClass(), "popupMenu", null);
        setField(term1258823, term1258823.getClass(), "revalidateRunnableScheduled", null);
        setField(term1258823, term1258823.getClass(), "focusInputMap", null);
        setField(term1258823, term1258823.getClass(), "ancestorInputMap", null);
        setField(term1258823, term1258823.getClass(), "windowInputMap", null);
        setField(term1258823, term1258823.getClass(), "actionMap", null);
        setField(term1258823, term1258823.getClass(), "aaHint", null);
        setField(term1258823, term1258823.getClass(), "lcdRenderingHint", null);
        setField(term1258823, term1258823.getClass(), "component", null);
        setField(term1258823, term1258823.getClass(), "layoutMgr", null);
        setField(term1258823, term1258823.getClass(), "dispatcher", null);
        setField(term1258823, term1258823.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1258823, term1258823.getClass(), "focusCycleRoot", false);
        setBooleanField(term1258823, term1258823.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1258823, term1258823.getClass(), "printingThreads", null);
        setBooleanField(term1258823, term1258823.getClass(), "printing", false);
        setField(term1258823, term1258823.getClass(), "containerListener", null);
        setIntField(term1258823, term1258823.getClass(), "listeningChildren", 0);
        setIntField(term1258823, term1258823.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1258823, term1258823.getClass(), "descendantsCount", 0);
        setField(term1258823, term1258823.getClass(), "preserveBackgroundColor", null);
        setIntField(term1258823, term1258823.getClass(), "numOfHWComponents", 0);
        setIntField(term1258823, term1258823.getClass(), "numOfLWComponents", 0);
        setField(term1258823, term1258823.getClass(), "modalComp", null);
        setField(term1258823, term1258823.getClass(), "modalAppContext", null);
        setIntField(term1258823, term1258823.getClass(), "containerSerializedDataVersion", 0);
        setField(term1258823, term1258823.getClass(), "peer", null);
        setField(term1258823, term1258823.getClass(), "parent", null);
        setField(term1258823, term1258823.getClass(), "appContext", null);
        setIntField(term1258823, term1258823.getClass(), "x", 0);
        setIntField(term1258823, term1258823.getClass(), "y", 0);
        setIntField(term1258823, term1258823.getClass(), "width", 0);
        setIntField(term1258823, term1258823.getClass(), "height", 0);
        setField(term1258823, term1258823.getClass(), "foreground", null);
        setField(term1258823, term1258823.getClass(), "background", null);
        setField(term1258823, term1258823.getClass(), "font", null);
        setField(term1258823, term1258823.getClass(), "peerFont", null);
        setField(term1258823, term1258823.getClass(), "cursor", null);
        setField(term1258823, term1258823.getClass(), "locale", null);
        setField(term1258823, term1258823.getClass(), "graphicsConfig", null);
        setField(term1258823, term1258823.getClass(), "bufferStrategy", null);
        setBooleanField(term1258823, term1258823.getClass(), "ignoreRepaint", false);
        setBooleanField(term1258823, term1258823.getClass(), "visible", false);
        setBooleanField(term1258823, term1258823.getClass(), "enabled", false);
        setBooleanField(term1258823, term1258823.getClass(), "valid", false);
        setField(term1258823, term1258823.getClass(), "dropTarget", null);
        setField(term1258823, term1258823.getClass(), "popups", null);
        setField(term1258823, term1258823.getClass(), "name", null);
        setBooleanField(term1258823, term1258823.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1258823, term1258823.getClass(), "focusable", false);
        setIntField(term1258823, term1258823.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1258823, term1258823.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1258823, term1258823.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1258823, term1258823.getClass(), "acc", null);
        setField(term1258823, term1258823.getClass(), "minSize", null);
        setBooleanField(term1258823, term1258823.getClass(), "minSizeSet", false);
        setField(term1258823, term1258823.getClass(), "prefSize", null);
        setBooleanField(term1258823, term1258823.getClass(), "prefSizeSet", false);
        setField(term1258823, term1258823.getClass(), "maxSize", null);
        setBooleanField(term1258823, term1258823.getClass(), "maxSizeSet", false);
        setField(term1258823, term1258823.getClass(), "componentOrientation", null);
        setBooleanField(term1258823, term1258823.getClass(), "newEventsOnly", false);
        setField(term1258823, term1258823.getClass(), "componentListener", null);
        setField(term1258823, term1258823.getClass(), "focusListener", null);
        setField(term1258823, term1258823.getClass(), "hierarchyListener", null);
        setField(term1258823, term1258823.getClass(), "hierarchyBoundsListener", null);
        setField(term1258823, term1258823.getClass(), "keyListener", null);
        setField(term1258823, term1258823.getClass(), "mouseListener", null);
        setField(term1258823, term1258823.getClass(), "mouseMotionListener", null);
        setField(term1258823, term1258823.getClass(), "mouseWheelListener", null);
        setField(term1258823, term1258823.getClass(), "inputMethodListener", null);
        setLongField(term1258823, term1258823.getClass(), "eventMask", 0L);
        setField(term1258823, term1258823.getClass(), "changeSupport", null);
        setField(term1258823, term1258823.getClass(), "objectLock", null);
        setBooleanField(term1258823, term1258823.getClass(), "isPacked", false);
        setIntField(term1258823, term1258823.getClass(), "boundsOp", 0);
        setField(term1258823, term1258823.getClass(), "compoundShape", null);
        setField(term1258823, term1258823.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1258823, term1258823.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1258823, term1258823.getClass(), "backgroundEraseDisabled", false);
        setField(term1258823, term1258823.getClass(), "eventCache", null);
        setBooleanField(term1258823, term1258823.getClass(), "coalescingEnabled", false);
        setBooleanField(term1258823, term1258823.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1258823, term1258823.getClass(), "componentSerializedDataVersion", 0);
        setField(term1258823, term1258823.getClass(), "accessibleContext", null);
        term1258868 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.PirateDifficultLevel");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1258868;
        callMethod(klass, "updateSpacePirates", argTypes, term1258823, args);
    }

};


