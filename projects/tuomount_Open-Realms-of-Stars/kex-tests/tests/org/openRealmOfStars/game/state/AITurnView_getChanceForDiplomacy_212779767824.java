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
import java.lang.Integer;

public class AITurnView_getChanceForDiplomacy_212779767824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158276;
     Object term1158321;
     Object term1158323;

    public AITurnView_getChanceForDiplomacy_212779767824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1158276 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1158276, term1158276.getClass(), "label", null);
        setField(term1158276, term1158276.getClass(), "game", null);
        setIntField(term1158276, term1158276.getClass(), "textAnim", 0);
        setIntField(term1158276, term1158276.getClass(), "cx", 0);
        setIntField(term1158276, term1158276.getClass(), "cy", 0);
        setField(term1158276, term1158276.getClass(), "aiThread", null);
        setBooleanField(term1158276, term1158276.getClass(), "readyToMove", false);
        setField(term1158276, term1158276.getClass(), "nextState", null);
        setField(term1158276, term1158276.getClass(), "nextStateObject", null);
        setBooleanField(term1158276, term1158276.getClass(), "isAlignmentXSet", false);
        setFloatField(term1158276, term1158276.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1158276, term1158276.getClass(), "isAlignmentYSet", false);
        setFloatField(term1158276, term1158276.getClass(), "alignmentY", 0.0F);
        setField(term1158276, term1158276.getClass(), "ui", null);
        setField(term1158276, term1158276.getClass(), "listenerList", null);
        setField(term1158276, term1158276.getClass(), "clientProperties", null);
        setField(term1158276, term1158276.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1158276, term1158276.getClass(), "autoscrolls", false);
        setField(term1158276, term1158276.getClass(), "border", null);
        setIntField(term1158276, term1158276.getClass(), "flags", 0);
        setField(term1158276, term1158276.getClass(), "inputVerifier", null);
        setBooleanField(term1158276, term1158276.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1158276, term1158276.getClass(), "paintingChild", null);
        setField(term1158276, term1158276.getClass(), "popupMenu", null);
        setField(term1158276, term1158276.getClass(), "revalidateRunnableScheduled", null);
        setField(term1158276, term1158276.getClass(), "focusInputMap", null);
        setField(term1158276, term1158276.getClass(), "ancestorInputMap", null);
        setField(term1158276, term1158276.getClass(), "windowInputMap", null);
        setField(term1158276, term1158276.getClass(), "actionMap", null);
        setField(term1158276, term1158276.getClass(), "aaHint", null);
        setField(term1158276, term1158276.getClass(), "lcdRenderingHint", null);
        setField(term1158276, term1158276.getClass(), "component", null);
        setField(term1158276, term1158276.getClass(), "layoutMgr", null);
        setField(term1158276, term1158276.getClass(), "dispatcher", null);
        setField(term1158276, term1158276.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1158276, term1158276.getClass(), "focusCycleRoot", false);
        setBooleanField(term1158276, term1158276.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1158276, term1158276.getClass(), "printingThreads", null);
        setBooleanField(term1158276, term1158276.getClass(), "printing", false);
        setField(term1158276, term1158276.getClass(), "containerListener", null);
        setIntField(term1158276, term1158276.getClass(), "listeningChildren", 0);
        setIntField(term1158276, term1158276.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1158276, term1158276.getClass(), "descendantsCount", 0);
        setField(term1158276, term1158276.getClass(), "preserveBackgroundColor", null);
        setIntField(term1158276, term1158276.getClass(), "numOfHWComponents", 0);
        setIntField(term1158276, term1158276.getClass(), "numOfLWComponents", 0);
        setField(term1158276, term1158276.getClass(), "modalComp", null);
        setField(term1158276, term1158276.getClass(), "modalAppContext", null);
        setIntField(term1158276, term1158276.getClass(), "containerSerializedDataVersion", 0);
        setField(term1158276, term1158276.getClass(), "peer", null);
        setField(term1158276, term1158276.getClass(), "parent", null);
        setField(term1158276, term1158276.getClass(), "appContext", null);
        setIntField(term1158276, term1158276.getClass(), "x", 0);
        setIntField(term1158276, term1158276.getClass(), "y", 0);
        setIntField(term1158276, term1158276.getClass(), "width", 0);
        setIntField(term1158276, term1158276.getClass(), "height", 0);
        setField(term1158276, term1158276.getClass(), "foreground", null);
        setField(term1158276, term1158276.getClass(), "background", null);
        setField(term1158276, term1158276.getClass(), "font", null);
        setField(term1158276, term1158276.getClass(), "peerFont", null);
        setField(term1158276, term1158276.getClass(), "cursor", null);
        setField(term1158276, term1158276.getClass(), "locale", null);
        setField(term1158276, term1158276.getClass(), "graphicsConfig", null);
        setField(term1158276, term1158276.getClass(), "bufferStrategy", null);
        setBooleanField(term1158276, term1158276.getClass(), "ignoreRepaint", false);
        setBooleanField(term1158276, term1158276.getClass(), "visible", false);
        setBooleanField(term1158276, term1158276.getClass(), "enabled", false);
        setBooleanField(term1158276, term1158276.getClass(), "valid", false);
        setField(term1158276, term1158276.getClass(), "dropTarget", null);
        setField(term1158276, term1158276.getClass(), "popups", null);
        setField(term1158276, term1158276.getClass(), "name", null);
        setBooleanField(term1158276, term1158276.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1158276, term1158276.getClass(), "focusable", false);
        setIntField(term1158276, term1158276.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1158276, term1158276.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1158276, term1158276.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1158276, term1158276.getClass(), "acc", null);
        setField(term1158276, term1158276.getClass(), "minSize", null);
        setBooleanField(term1158276, term1158276.getClass(), "minSizeSet", false);
        setField(term1158276, term1158276.getClass(), "prefSize", null);
        setBooleanField(term1158276, term1158276.getClass(), "prefSizeSet", false);
        setField(term1158276, term1158276.getClass(), "maxSize", null);
        setBooleanField(term1158276, term1158276.getClass(), "maxSizeSet", false);
        setField(term1158276, term1158276.getClass(), "componentOrientation", null);
        setBooleanField(term1158276, term1158276.getClass(), "newEventsOnly", false);
        setField(term1158276, term1158276.getClass(), "componentListener", null);
        setField(term1158276, term1158276.getClass(), "focusListener", null);
        setField(term1158276, term1158276.getClass(), "hierarchyListener", null);
        setField(term1158276, term1158276.getClass(), "hierarchyBoundsListener", null);
        setField(term1158276, term1158276.getClass(), "keyListener", null);
        setField(term1158276, term1158276.getClass(), "mouseListener", null);
        setField(term1158276, term1158276.getClass(), "mouseMotionListener", null);
        setField(term1158276, term1158276.getClass(), "mouseWheelListener", null);
        setField(term1158276, term1158276.getClass(), "inputMethodListener", null);
        setLongField(term1158276, term1158276.getClass(), "eventMask", 0L);
        setField(term1158276, term1158276.getClass(), "changeSupport", null);
        setField(term1158276, term1158276.getClass(), "objectLock", null);
        setBooleanField(term1158276, term1158276.getClass(), "isPacked", false);
        setIntField(term1158276, term1158276.getClass(), "boundsOp", 0);
        setField(term1158276, term1158276.getClass(), "compoundShape", null);
        setField(term1158276, term1158276.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1158276, term1158276.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1158276, term1158276.getClass(), "backgroundEraseDisabled", false);
        setField(term1158276, term1158276.getClass(), "eventCache", null);
        setBooleanField(term1158276, term1158276.getClass(), "coalescingEnabled", false);
        setBooleanField(term1158276, term1158276.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1158276, term1158276.getClass(), "componentSerializedDataVersion", 0);
        setField(term1158276, term1158276.getClass(), "accessibleContext", null);
        term1158321 = new Boolean(false);
        term1158323 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1158321;
        args[1] = null;
        args[2] = term1158323;
        callMethod(klass, "getChanceForDiplomacy", argTypes, term1158276, args);
    }

};


