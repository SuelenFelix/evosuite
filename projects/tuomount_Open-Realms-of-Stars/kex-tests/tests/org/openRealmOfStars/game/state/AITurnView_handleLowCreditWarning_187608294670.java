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

public class AITurnView_handleLowCreditWarning_187608294670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374592;
     Object term1374637;

    public AITurnView_handleLowCreditWarning_187608294670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1374592 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1374592, term1374592.getClass(), "label", null);
        setField(term1374592, term1374592.getClass(), "game", null);
        setIntField(term1374592, term1374592.getClass(), "textAnim", 0);
        setIntField(term1374592, term1374592.getClass(), "cx", 0);
        setIntField(term1374592, term1374592.getClass(), "cy", 0);
        setField(term1374592, term1374592.getClass(), "aiThread", null);
        setBooleanField(term1374592, term1374592.getClass(), "readyToMove", false);
        setField(term1374592, term1374592.getClass(), "nextState", null);
        setField(term1374592, term1374592.getClass(), "nextStateObject", null);
        setBooleanField(term1374592, term1374592.getClass(), "isAlignmentXSet", false);
        setFloatField(term1374592, term1374592.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1374592, term1374592.getClass(), "isAlignmentYSet", false);
        setFloatField(term1374592, term1374592.getClass(), "alignmentY", 0.0F);
        setField(term1374592, term1374592.getClass(), "ui", null);
        setField(term1374592, term1374592.getClass(), "listenerList", null);
        setField(term1374592, term1374592.getClass(), "clientProperties", null);
        setField(term1374592, term1374592.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1374592, term1374592.getClass(), "autoscrolls", false);
        setField(term1374592, term1374592.getClass(), "border", null);
        setIntField(term1374592, term1374592.getClass(), "flags", 0);
        setField(term1374592, term1374592.getClass(), "inputVerifier", null);
        setBooleanField(term1374592, term1374592.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1374592, term1374592.getClass(), "paintingChild", null);
        setField(term1374592, term1374592.getClass(), "popupMenu", null);
        setField(term1374592, term1374592.getClass(), "revalidateRunnableScheduled", null);
        setField(term1374592, term1374592.getClass(), "focusInputMap", null);
        setField(term1374592, term1374592.getClass(), "ancestorInputMap", null);
        setField(term1374592, term1374592.getClass(), "windowInputMap", null);
        setField(term1374592, term1374592.getClass(), "actionMap", null);
        setField(term1374592, term1374592.getClass(), "aaHint", null);
        setField(term1374592, term1374592.getClass(), "lcdRenderingHint", null);
        setField(term1374592, term1374592.getClass(), "component", null);
        setField(term1374592, term1374592.getClass(), "layoutMgr", null);
        setField(term1374592, term1374592.getClass(), "dispatcher", null);
        setField(term1374592, term1374592.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1374592, term1374592.getClass(), "focusCycleRoot", false);
        setBooleanField(term1374592, term1374592.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1374592, term1374592.getClass(), "printingThreads", null);
        setBooleanField(term1374592, term1374592.getClass(), "printing", false);
        setField(term1374592, term1374592.getClass(), "containerListener", null);
        setIntField(term1374592, term1374592.getClass(), "listeningChildren", 0);
        setIntField(term1374592, term1374592.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1374592, term1374592.getClass(), "descendantsCount", 0);
        setField(term1374592, term1374592.getClass(), "preserveBackgroundColor", null);
        setIntField(term1374592, term1374592.getClass(), "numOfHWComponents", 0);
        setIntField(term1374592, term1374592.getClass(), "numOfLWComponents", 0);
        setField(term1374592, term1374592.getClass(), "modalComp", null);
        setField(term1374592, term1374592.getClass(), "modalAppContext", null);
        setIntField(term1374592, term1374592.getClass(), "containerSerializedDataVersion", 0);
        setField(term1374592, term1374592.getClass(), "peer", null);
        setField(term1374592, term1374592.getClass(), "parent", null);
        setField(term1374592, term1374592.getClass(), "appContext", null);
        setIntField(term1374592, term1374592.getClass(), "x", 0);
        setIntField(term1374592, term1374592.getClass(), "y", 0);
        setIntField(term1374592, term1374592.getClass(), "width", 0);
        setIntField(term1374592, term1374592.getClass(), "height", 0);
        setField(term1374592, term1374592.getClass(), "foreground", null);
        setField(term1374592, term1374592.getClass(), "background", null);
        setField(term1374592, term1374592.getClass(), "font", null);
        setField(term1374592, term1374592.getClass(), "peerFont", null);
        setField(term1374592, term1374592.getClass(), "cursor", null);
        setField(term1374592, term1374592.getClass(), "locale", null);
        setField(term1374592, term1374592.getClass(), "graphicsConfig", null);
        setField(term1374592, term1374592.getClass(), "bufferStrategy", null);
        setBooleanField(term1374592, term1374592.getClass(), "ignoreRepaint", false);
        setBooleanField(term1374592, term1374592.getClass(), "visible", false);
        setBooleanField(term1374592, term1374592.getClass(), "enabled", false);
        setBooleanField(term1374592, term1374592.getClass(), "valid", false);
        setField(term1374592, term1374592.getClass(), "dropTarget", null);
        setField(term1374592, term1374592.getClass(), "popups", null);
        setField(term1374592, term1374592.getClass(), "name", null);
        setBooleanField(term1374592, term1374592.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1374592, term1374592.getClass(), "focusable", false);
        setIntField(term1374592, term1374592.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1374592, term1374592.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1374592, term1374592.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1374592, term1374592.getClass(), "acc", null);
        setField(term1374592, term1374592.getClass(), "minSize", null);
        setBooleanField(term1374592, term1374592.getClass(), "minSizeSet", false);
        setField(term1374592, term1374592.getClass(), "prefSize", null);
        setBooleanField(term1374592, term1374592.getClass(), "prefSizeSet", false);
        setField(term1374592, term1374592.getClass(), "maxSize", null);
        setBooleanField(term1374592, term1374592.getClass(), "maxSizeSet", false);
        setField(term1374592, term1374592.getClass(), "componentOrientation", null);
        setBooleanField(term1374592, term1374592.getClass(), "newEventsOnly", false);
        setField(term1374592, term1374592.getClass(), "componentListener", null);
        setField(term1374592, term1374592.getClass(), "focusListener", null);
        setField(term1374592, term1374592.getClass(), "hierarchyListener", null);
        setField(term1374592, term1374592.getClass(), "hierarchyBoundsListener", null);
        setField(term1374592, term1374592.getClass(), "keyListener", null);
        setField(term1374592, term1374592.getClass(), "mouseListener", null);
        setField(term1374592, term1374592.getClass(), "mouseMotionListener", null);
        setField(term1374592, term1374592.getClass(), "mouseWheelListener", null);
        setField(term1374592, term1374592.getClass(), "inputMethodListener", null);
        setLongField(term1374592, term1374592.getClass(), "eventMask", 0L);
        setField(term1374592, term1374592.getClass(), "changeSupport", null);
        setField(term1374592, term1374592.getClass(), "objectLock", null);
        setBooleanField(term1374592, term1374592.getClass(), "isPacked", false);
        setIntField(term1374592, term1374592.getClass(), "boundsOp", 0);
        setField(term1374592, term1374592.getClass(), "compoundShape", null);
        setField(term1374592, term1374592.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1374592, term1374592.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1374592, term1374592.getClass(), "backgroundEraseDisabled", false);
        setField(term1374592, term1374592.getClass(), "eventCache", null);
        setBooleanField(term1374592, term1374592.getClass(), "coalescingEnabled", false);
        setBooleanField(term1374592, term1374592.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1374592, term1374592.getClass(), "componentSerializedDataVersion", 0);
        setField(term1374592, term1374592.getClass(), "accessibleContext", null);
        term1374637 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1374637;
        callMethod(klass, "handleLowCreditWarning", argTypes, term1374592, args);
    }

};


