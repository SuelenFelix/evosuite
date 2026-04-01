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

public class AITurnView_calculateAttackRendevuezSector_18381376716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065600;
     Object term1065645;
     Object term1065647;

    public AITurnView_calculateAttackRendevuezSector_18381376716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1065600 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1065600, term1065600.getClass(), "label", null);
        setField(term1065600, term1065600.getClass(), "game", null);
        setIntField(term1065600, term1065600.getClass(), "textAnim", 0);
        setIntField(term1065600, term1065600.getClass(), "cx", 0);
        setIntField(term1065600, term1065600.getClass(), "cy", 0);
        setField(term1065600, term1065600.getClass(), "aiThread", null);
        setBooleanField(term1065600, term1065600.getClass(), "readyToMove", false);
        setField(term1065600, term1065600.getClass(), "nextState", null);
        setField(term1065600, term1065600.getClass(), "nextStateObject", null);
        setBooleanField(term1065600, term1065600.getClass(), "isAlignmentXSet", false);
        setFloatField(term1065600, term1065600.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1065600, term1065600.getClass(), "isAlignmentYSet", false);
        setFloatField(term1065600, term1065600.getClass(), "alignmentY", 0.0F);
        setField(term1065600, term1065600.getClass(), "ui", null);
        setField(term1065600, term1065600.getClass(), "listenerList", null);
        setField(term1065600, term1065600.getClass(), "clientProperties", null);
        setField(term1065600, term1065600.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1065600, term1065600.getClass(), "autoscrolls", false);
        setField(term1065600, term1065600.getClass(), "border", null);
        setIntField(term1065600, term1065600.getClass(), "flags", 0);
        setField(term1065600, term1065600.getClass(), "inputVerifier", null);
        setBooleanField(term1065600, term1065600.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1065600, term1065600.getClass(), "paintingChild", null);
        setField(term1065600, term1065600.getClass(), "popupMenu", null);
        setField(term1065600, term1065600.getClass(), "revalidateRunnableScheduled", null);
        setField(term1065600, term1065600.getClass(), "focusInputMap", null);
        setField(term1065600, term1065600.getClass(), "ancestorInputMap", null);
        setField(term1065600, term1065600.getClass(), "windowInputMap", null);
        setField(term1065600, term1065600.getClass(), "actionMap", null);
        setField(term1065600, term1065600.getClass(), "aaHint", null);
        setField(term1065600, term1065600.getClass(), "lcdRenderingHint", null);
        setField(term1065600, term1065600.getClass(), "component", null);
        setField(term1065600, term1065600.getClass(), "layoutMgr", null);
        setField(term1065600, term1065600.getClass(), "dispatcher", null);
        setField(term1065600, term1065600.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1065600, term1065600.getClass(), "focusCycleRoot", false);
        setBooleanField(term1065600, term1065600.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1065600, term1065600.getClass(), "printingThreads", null);
        setBooleanField(term1065600, term1065600.getClass(), "printing", false);
        setField(term1065600, term1065600.getClass(), "containerListener", null);
        setIntField(term1065600, term1065600.getClass(), "listeningChildren", 0);
        setIntField(term1065600, term1065600.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1065600, term1065600.getClass(), "descendantsCount", 0);
        setField(term1065600, term1065600.getClass(), "preserveBackgroundColor", null);
        setIntField(term1065600, term1065600.getClass(), "numOfHWComponents", 0);
        setIntField(term1065600, term1065600.getClass(), "numOfLWComponents", 0);
        setField(term1065600, term1065600.getClass(), "modalComp", null);
        setField(term1065600, term1065600.getClass(), "modalAppContext", null);
        setIntField(term1065600, term1065600.getClass(), "containerSerializedDataVersion", 0);
        setField(term1065600, term1065600.getClass(), "peer", null);
        setField(term1065600, term1065600.getClass(), "parent", null);
        setField(term1065600, term1065600.getClass(), "appContext", null);
        setIntField(term1065600, term1065600.getClass(), "x", 0);
        setIntField(term1065600, term1065600.getClass(), "y", 0);
        setIntField(term1065600, term1065600.getClass(), "width", 0);
        setIntField(term1065600, term1065600.getClass(), "height", 0);
        setField(term1065600, term1065600.getClass(), "foreground", null);
        setField(term1065600, term1065600.getClass(), "background", null);
        setField(term1065600, term1065600.getClass(), "font", null);
        setField(term1065600, term1065600.getClass(), "peerFont", null);
        setField(term1065600, term1065600.getClass(), "cursor", null);
        setField(term1065600, term1065600.getClass(), "locale", null);
        setField(term1065600, term1065600.getClass(), "graphicsConfig", null);
        setField(term1065600, term1065600.getClass(), "bufferStrategy", null);
        setBooleanField(term1065600, term1065600.getClass(), "ignoreRepaint", false);
        setBooleanField(term1065600, term1065600.getClass(), "visible", false);
        setBooleanField(term1065600, term1065600.getClass(), "enabled", false);
        setBooleanField(term1065600, term1065600.getClass(), "valid", false);
        setField(term1065600, term1065600.getClass(), "dropTarget", null);
        setField(term1065600, term1065600.getClass(), "popups", null);
        setField(term1065600, term1065600.getClass(), "name", null);
        setBooleanField(term1065600, term1065600.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1065600, term1065600.getClass(), "focusable", false);
        setIntField(term1065600, term1065600.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1065600, term1065600.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1065600, term1065600.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1065600, term1065600.getClass(), "acc", null);
        setField(term1065600, term1065600.getClass(), "minSize", null);
        setBooleanField(term1065600, term1065600.getClass(), "minSizeSet", false);
        setField(term1065600, term1065600.getClass(), "prefSize", null);
        setBooleanField(term1065600, term1065600.getClass(), "prefSizeSet", false);
        setField(term1065600, term1065600.getClass(), "maxSize", null);
        setBooleanField(term1065600, term1065600.getClass(), "maxSizeSet", false);
        setField(term1065600, term1065600.getClass(), "componentOrientation", null);
        setBooleanField(term1065600, term1065600.getClass(), "newEventsOnly", false);
        setField(term1065600, term1065600.getClass(), "componentListener", null);
        setField(term1065600, term1065600.getClass(), "focusListener", null);
        setField(term1065600, term1065600.getClass(), "hierarchyListener", null);
        setField(term1065600, term1065600.getClass(), "hierarchyBoundsListener", null);
        setField(term1065600, term1065600.getClass(), "keyListener", null);
        setField(term1065600, term1065600.getClass(), "mouseListener", null);
        setField(term1065600, term1065600.getClass(), "mouseMotionListener", null);
        setField(term1065600, term1065600.getClass(), "mouseWheelListener", null);
        setField(term1065600, term1065600.getClass(), "inputMethodListener", null);
        setLongField(term1065600, term1065600.getClass(), "eventMask", 0L);
        setField(term1065600, term1065600.getClass(), "changeSupport", null);
        setField(term1065600, term1065600.getClass(), "objectLock", null);
        setBooleanField(term1065600, term1065600.getClass(), "isPacked", false);
        setIntField(term1065600, term1065600.getClass(), "boundsOp", 0);
        setField(term1065600, term1065600.getClass(), "compoundShape", null);
        setField(term1065600, term1065600.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1065600, term1065600.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1065600, term1065600.getClass(), "backgroundEraseDisabled", false);
        setField(term1065600, term1065600.getClass(), "eventCache", null);
        setBooleanField(term1065600, term1065600.getClass(), "coalescingEnabled", false);
        setBooleanField(term1065600, term1065600.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1065600, term1065600.getClass(), "componentSerializedDataVersion", 0);
        setField(term1065600, term1065600.getClass(), "accessibleContext", null);
        term1065645 = new Integer(0);
        term1065647 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1065645;
        args[2] = term1065647;
        callMethod(klass, "calculateAttackRendevuezSector", argTypes, term1065600, args);
    }

};


