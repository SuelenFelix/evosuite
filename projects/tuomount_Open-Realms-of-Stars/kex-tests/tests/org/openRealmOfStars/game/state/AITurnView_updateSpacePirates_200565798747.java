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
import java.lang.Boolean;

public class AITurnView_updateSpacePirates_200565798747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250008;
     Object term1250053;

    public AITurnView_updateSpacePirates_200565798747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1250008 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1250008, term1250008.getClass(), "label", null);
        setField(term1250008, term1250008.getClass(), "game", null);
        setIntField(term1250008, term1250008.getClass(), "textAnim", 0);
        setIntField(term1250008, term1250008.getClass(), "cx", 0);
        setIntField(term1250008, term1250008.getClass(), "cy", 0);
        setField(term1250008, term1250008.getClass(), "aiThread", null);
        setBooleanField(term1250008, term1250008.getClass(), "readyToMove", false);
        setField(term1250008, term1250008.getClass(), "nextState", null);
        setField(term1250008, term1250008.getClass(), "nextStateObject", null);
        setBooleanField(term1250008, term1250008.getClass(), "isAlignmentXSet", false);
        setFloatField(term1250008, term1250008.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1250008, term1250008.getClass(), "isAlignmentYSet", false);
        setFloatField(term1250008, term1250008.getClass(), "alignmentY", 0.0F);
        setField(term1250008, term1250008.getClass(), "ui", null);
        setField(term1250008, term1250008.getClass(), "listenerList", null);
        setField(term1250008, term1250008.getClass(), "clientProperties", null);
        setField(term1250008, term1250008.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1250008, term1250008.getClass(), "autoscrolls", false);
        setField(term1250008, term1250008.getClass(), "border", null);
        setIntField(term1250008, term1250008.getClass(), "flags", 0);
        setField(term1250008, term1250008.getClass(), "inputVerifier", null);
        setBooleanField(term1250008, term1250008.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1250008, term1250008.getClass(), "paintingChild", null);
        setField(term1250008, term1250008.getClass(), "popupMenu", null);
        setField(term1250008, term1250008.getClass(), "revalidateRunnableScheduled", null);
        setField(term1250008, term1250008.getClass(), "focusInputMap", null);
        setField(term1250008, term1250008.getClass(), "ancestorInputMap", null);
        setField(term1250008, term1250008.getClass(), "windowInputMap", null);
        setField(term1250008, term1250008.getClass(), "actionMap", null);
        setField(term1250008, term1250008.getClass(), "aaHint", null);
        setField(term1250008, term1250008.getClass(), "lcdRenderingHint", null);
        setField(term1250008, term1250008.getClass(), "component", null);
        setField(term1250008, term1250008.getClass(), "layoutMgr", null);
        setField(term1250008, term1250008.getClass(), "dispatcher", null);
        setField(term1250008, term1250008.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1250008, term1250008.getClass(), "focusCycleRoot", false);
        setBooleanField(term1250008, term1250008.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1250008, term1250008.getClass(), "printingThreads", null);
        setBooleanField(term1250008, term1250008.getClass(), "printing", false);
        setField(term1250008, term1250008.getClass(), "containerListener", null);
        setIntField(term1250008, term1250008.getClass(), "listeningChildren", 0);
        setIntField(term1250008, term1250008.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1250008, term1250008.getClass(), "descendantsCount", 0);
        setField(term1250008, term1250008.getClass(), "preserveBackgroundColor", null);
        setIntField(term1250008, term1250008.getClass(), "numOfHWComponents", 0);
        setIntField(term1250008, term1250008.getClass(), "numOfLWComponents", 0);
        setField(term1250008, term1250008.getClass(), "modalComp", null);
        setField(term1250008, term1250008.getClass(), "modalAppContext", null);
        setIntField(term1250008, term1250008.getClass(), "containerSerializedDataVersion", 0);
        setField(term1250008, term1250008.getClass(), "peer", null);
        setField(term1250008, term1250008.getClass(), "parent", null);
        setField(term1250008, term1250008.getClass(), "appContext", null);
        setIntField(term1250008, term1250008.getClass(), "x", 0);
        setIntField(term1250008, term1250008.getClass(), "y", 0);
        setIntField(term1250008, term1250008.getClass(), "width", 0);
        setIntField(term1250008, term1250008.getClass(), "height", 0);
        setField(term1250008, term1250008.getClass(), "foreground", null);
        setField(term1250008, term1250008.getClass(), "background", null);
        setField(term1250008, term1250008.getClass(), "font", null);
        setField(term1250008, term1250008.getClass(), "peerFont", null);
        setField(term1250008, term1250008.getClass(), "cursor", null);
        setField(term1250008, term1250008.getClass(), "locale", null);
        setField(term1250008, term1250008.getClass(), "graphicsConfig", null);
        setField(term1250008, term1250008.getClass(), "bufferStrategy", null);
        setBooleanField(term1250008, term1250008.getClass(), "ignoreRepaint", false);
        setBooleanField(term1250008, term1250008.getClass(), "visible", false);
        setBooleanField(term1250008, term1250008.getClass(), "enabled", false);
        setBooleanField(term1250008, term1250008.getClass(), "valid", false);
        setField(term1250008, term1250008.getClass(), "dropTarget", null);
        setField(term1250008, term1250008.getClass(), "popups", null);
        setField(term1250008, term1250008.getClass(), "name", null);
        setBooleanField(term1250008, term1250008.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1250008, term1250008.getClass(), "focusable", false);
        setIntField(term1250008, term1250008.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1250008, term1250008.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1250008, term1250008.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1250008, term1250008.getClass(), "acc", null);
        setField(term1250008, term1250008.getClass(), "minSize", null);
        setBooleanField(term1250008, term1250008.getClass(), "minSizeSet", false);
        setField(term1250008, term1250008.getClass(), "prefSize", null);
        setBooleanField(term1250008, term1250008.getClass(), "prefSizeSet", false);
        setField(term1250008, term1250008.getClass(), "maxSize", null);
        setBooleanField(term1250008, term1250008.getClass(), "maxSizeSet", false);
        setField(term1250008, term1250008.getClass(), "componentOrientation", null);
        setBooleanField(term1250008, term1250008.getClass(), "newEventsOnly", false);
        setField(term1250008, term1250008.getClass(), "componentListener", null);
        setField(term1250008, term1250008.getClass(), "focusListener", null);
        setField(term1250008, term1250008.getClass(), "hierarchyListener", null);
        setField(term1250008, term1250008.getClass(), "hierarchyBoundsListener", null);
        setField(term1250008, term1250008.getClass(), "keyListener", null);
        setField(term1250008, term1250008.getClass(), "mouseListener", null);
        setField(term1250008, term1250008.getClass(), "mouseMotionListener", null);
        setField(term1250008, term1250008.getClass(), "mouseWheelListener", null);
        setField(term1250008, term1250008.getClass(), "inputMethodListener", null);
        setLongField(term1250008, term1250008.getClass(), "eventMask", 0L);
        setField(term1250008, term1250008.getClass(), "changeSupport", null);
        setField(term1250008, term1250008.getClass(), "objectLock", null);
        setBooleanField(term1250008, term1250008.getClass(), "isPacked", false);
        setIntField(term1250008, term1250008.getClass(), "boundsOp", 0);
        setField(term1250008, term1250008.getClass(), "compoundShape", null);
        setField(term1250008, term1250008.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1250008, term1250008.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1250008, term1250008.getClass(), "backgroundEraseDisabled", false);
        setField(term1250008, term1250008.getClass(), "eventCache", null);
        setBooleanField(term1250008, term1250008.getClass(), "coalescingEnabled", false);
        setBooleanField(term1250008, term1250008.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1250008, term1250008.getClass(), "componentSerializedDataVersion", 0);
        setField(term1250008, term1250008.getClass(), "accessibleContext", null);
        term1250053 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.PirateDifficultLevel");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1250053;
        callMethod(klass, "updateSpacePirates", argTypes, term1250008, args);
    }

};


