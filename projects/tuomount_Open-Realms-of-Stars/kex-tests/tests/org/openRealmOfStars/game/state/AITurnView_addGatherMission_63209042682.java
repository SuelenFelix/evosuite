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

public class AITurnView_addGatherMission_63209042682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377767;

    public AITurnView_addGatherMission_63209042682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377767 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377767, term1377767.getClass(), "label", null);
        setField(term1377767, term1377767.getClass(), "game", null);
        setIntField(term1377767, term1377767.getClass(), "textAnim", 0);
        setIntField(term1377767, term1377767.getClass(), "cx", 0);
        setIntField(term1377767, term1377767.getClass(), "cy", 0);
        setField(term1377767, term1377767.getClass(), "aiThread", null);
        setBooleanField(term1377767, term1377767.getClass(), "readyToMove", false);
        setField(term1377767, term1377767.getClass(), "nextState", null);
        setField(term1377767, term1377767.getClass(), "nextStateObject", null);
        setBooleanField(term1377767, term1377767.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377767, term1377767.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377767, term1377767.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377767, term1377767.getClass(), "alignmentY", 0.0F);
        setField(term1377767, term1377767.getClass(), "ui", null);
        setField(term1377767, term1377767.getClass(), "listenerList", null);
        setField(term1377767, term1377767.getClass(), "clientProperties", null);
        setField(term1377767, term1377767.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377767, term1377767.getClass(), "autoscrolls", false);
        setField(term1377767, term1377767.getClass(), "border", null);
        setIntField(term1377767, term1377767.getClass(), "flags", 0);
        setField(term1377767, term1377767.getClass(), "inputVerifier", null);
        setBooleanField(term1377767, term1377767.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377767, term1377767.getClass(), "paintingChild", null);
        setField(term1377767, term1377767.getClass(), "popupMenu", null);
        setField(term1377767, term1377767.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377767, term1377767.getClass(), "focusInputMap", null);
        setField(term1377767, term1377767.getClass(), "ancestorInputMap", null);
        setField(term1377767, term1377767.getClass(), "windowInputMap", null);
        setField(term1377767, term1377767.getClass(), "actionMap", null);
        setField(term1377767, term1377767.getClass(), "aaHint", null);
        setField(term1377767, term1377767.getClass(), "lcdRenderingHint", null);
        setField(term1377767, term1377767.getClass(), "component", null);
        setField(term1377767, term1377767.getClass(), "layoutMgr", null);
        setField(term1377767, term1377767.getClass(), "dispatcher", null);
        setField(term1377767, term1377767.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377767, term1377767.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377767, term1377767.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377767, term1377767.getClass(), "printingThreads", null);
        setBooleanField(term1377767, term1377767.getClass(), "printing", false);
        setField(term1377767, term1377767.getClass(), "containerListener", null);
        setIntField(term1377767, term1377767.getClass(), "listeningChildren", 0);
        setIntField(term1377767, term1377767.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377767, term1377767.getClass(), "descendantsCount", 0);
        setField(term1377767, term1377767.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377767, term1377767.getClass(), "numOfHWComponents", 0);
        setIntField(term1377767, term1377767.getClass(), "numOfLWComponents", 0);
        setField(term1377767, term1377767.getClass(), "modalComp", null);
        setField(term1377767, term1377767.getClass(), "modalAppContext", null);
        setIntField(term1377767, term1377767.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377767, term1377767.getClass(), "peer", null);
        setField(term1377767, term1377767.getClass(), "parent", null);
        setField(term1377767, term1377767.getClass(), "appContext", null);
        setIntField(term1377767, term1377767.getClass(), "x", 0);
        setIntField(term1377767, term1377767.getClass(), "y", 0);
        setIntField(term1377767, term1377767.getClass(), "width", 0);
        setIntField(term1377767, term1377767.getClass(), "height", 0);
        setField(term1377767, term1377767.getClass(), "foreground", null);
        setField(term1377767, term1377767.getClass(), "background", null);
        setField(term1377767, term1377767.getClass(), "font", null);
        setField(term1377767, term1377767.getClass(), "peerFont", null);
        setField(term1377767, term1377767.getClass(), "cursor", null);
        setField(term1377767, term1377767.getClass(), "locale", null);
        setField(term1377767, term1377767.getClass(), "graphicsConfig", null);
        setField(term1377767, term1377767.getClass(), "bufferStrategy", null);
        setBooleanField(term1377767, term1377767.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377767, term1377767.getClass(), "visible", false);
        setBooleanField(term1377767, term1377767.getClass(), "enabled", false);
        setBooleanField(term1377767, term1377767.getClass(), "valid", false);
        setField(term1377767, term1377767.getClass(), "dropTarget", null);
        setField(term1377767, term1377767.getClass(), "popups", null);
        setField(term1377767, term1377767.getClass(), "name", null);
        setBooleanField(term1377767, term1377767.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377767, term1377767.getClass(), "focusable", false);
        setIntField(term1377767, term1377767.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377767, term1377767.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377767, term1377767.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377767, term1377767.getClass(), "acc", null);
        setField(term1377767, term1377767.getClass(), "minSize", null);
        setBooleanField(term1377767, term1377767.getClass(), "minSizeSet", false);
        setField(term1377767, term1377767.getClass(), "prefSize", null);
        setBooleanField(term1377767, term1377767.getClass(), "prefSizeSet", false);
        setField(term1377767, term1377767.getClass(), "maxSize", null);
        setBooleanField(term1377767, term1377767.getClass(), "maxSizeSet", false);
        setField(term1377767, term1377767.getClass(), "componentOrientation", null);
        setBooleanField(term1377767, term1377767.getClass(), "newEventsOnly", false);
        setField(term1377767, term1377767.getClass(), "componentListener", null);
        setField(term1377767, term1377767.getClass(), "focusListener", null);
        setField(term1377767, term1377767.getClass(), "hierarchyListener", null);
        setField(term1377767, term1377767.getClass(), "hierarchyBoundsListener", null);
        setField(term1377767, term1377767.getClass(), "keyListener", null);
        setField(term1377767, term1377767.getClass(), "mouseListener", null);
        setField(term1377767, term1377767.getClass(), "mouseMotionListener", null);
        setField(term1377767, term1377767.getClass(), "mouseWheelListener", null);
        setField(term1377767, term1377767.getClass(), "inputMethodListener", null);
        setLongField(term1377767, term1377767.getClass(), "eventMask", 0L);
        setField(term1377767, term1377767.getClass(), "changeSupport", null);
        setField(term1377767, term1377767.getClass(), "objectLock", null);
        setBooleanField(term1377767, term1377767.getClass(), "isPacked", false);
        setIntField(term1377767, term1377767.getClass(), "boundsOp", 0);
        setField(term1377767, term1377767.getClass(), "compoundShape", null);
        setField(term1377767, term1377767.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377767, term1377767.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377767, term1377767.getClass(), "backgroundEraseDisabled", false);
        setField(term1377767, term1377767.getClass(), "eventCache", null);
        setBooleanField(term1377767, term1377767.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377767, term1377767.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377767, term1377767.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377767, term1377767.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addGatherMission", argTypes, term1377767, args);
    }

};


