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

public class AITurnView_handleRecruitableLeaders_1707318613103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378714;

    public AITurnView_handleRecruitableLeaders_1707318613103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378714 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378714, term1378714.getClass(), "label", null);
        setField(term1378714, term1378714.getClass(), "game", null);
        setIntField(term1378714, term1378714.getClass(), "textAnim", 0);
        setIntField(term1378714, term1378714.getClass(), "cx", 0);
        setIntField(term1378714, term1378714.getClass(), "cy", 0);
        setField(term1378714, term1378714.getClass(), "aiThread", null);
        setBooleanField(term1378714, term1378714.getClass(), "readyToMove", false);
        setField(term1378714, term1378714.getClass(), "nextState", null);
        setField(term1378714, term1378714.getClass(), "nextStateObject", null);
        setBooleanField(term1378714, term1378714.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378714, term1378714.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378714, term1378714.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378714, term1378714.getClass(), "alignmentY", 0.0F);
        setField(term1378714, term1378714.getClass(), "ui", null);
        setField(term1378714, term1378714.getClass(), "listenerList", null);
        setField(term1378714, term1378714.getClass(), "clientProperties", null);
        setField(term1378714, term1378714.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378714, term1378714.getClass(), "autoscrolls", false);
        setField(term1378714, term1378714.getClass(), "border", null);
        setIntField(term1378714, term1378714.getClass(), "flags", 0);
        setField(term1378714, term1378714.getClass(), "inputVerifier", null);
        setBooleanField(term1378714, term1378714.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378714, term1378714.getClass(), "paintingChild", null);
        setField(term1378714, term1378714.getClass(), "popupMenu", null);
        setField(term1378714, term1378714.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378714, term1378714.getClass(), "focusInputMap", null);
        setField(term1378714, term1378714.getClass(), "ancestorInputMap", null);
        setField(term1378714, term1378714.getClass(), "windowInputMap", null);
        setField(term1378714, term1378714.getClass(), "actionMap", null);
        setField(term1378714, term1378714.getClass(), "aaHint", null);
        setField(term1378714, term1378714.getClass(), "lcdRenderingHint", null);
        setField(term1378714, term1378714.getClass(), "component", null);
        setField(term1378714, term1378714.getClass(), "layoutMgr", null);
        setField(term1378714, term1378714.getClass(), "dispatcher", null);
        setField(term1378714, term1378714.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378714, term1378714.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378714, term1378714.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378714, term1378714.getClass(), "printingThreads", null);
        setBooleanField(term1378714, term1378714.getClass(), "printing", false);
        setField(term1378714, term1378714.getClass(), "containerListener", null);
        setIntField(term1378714, term1378714.getClass(), "listeningChildren", 0);
        setIntField(term1378714, term1378714.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378714, term1378714.getClass(), "descendantsCount", 0);
        setField(term1378714, term1378714.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378714, term1378714.getClass(), "numOfHWComponents", 0);
        setIntField(term1378714, term1378714.getClass(), "numOfLWComponents", 0);
        setField(term1378714, term1378714.getClass(), "modalComp", null);
        setField(term1378714, term1378714.getClass(), "modalAppContext", null);
        setIntField(term1378714, term1378714.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378714, term1378714.getClass(), "peer", null);
        setField(term1378714, term1378714.getClass(), "parent", null);
        setField(term1378714, term1378714.getClass(), "appContext", null);
        setIntField(term1378714, term1378714.getClass(), "x", 0);
        setIntField(term1378714, term1378714.getClass(), "y", 0);
        setIntField(term1378714, term1378714.getClass(), "width", 0);
        setIntField(term1378714, term1378714.getClass(), "height", 0);
        setField(term1378714, term1378714.getClass(), "foreground", null);
        setField(term1378714, term1378714.getClass(), "background", null);
        setField(term1378714, term1378714.getClass(), "font", null);
        setField(term1378714, term1378714.getClass(), "peerFont", null);
        setField(term1378714, term1378714.getClass(), "cursor", null);
        setField(term1378714, term1378714.getClass(), "locale", null);
        setField(term1378714, term1378714.getClass(), "graphicsConfig", null);
        setField(term1378714, term1378714.getClass(), "bufferStrategy", null);
        setBooleanField(term1378714, term1378714.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378714, term1378714.getClass(), "visible", false);
        setBooleanField(term1378714, term1378714.getClass(), "enabled", false);
        setBooleanField(term1378714, term1378714.getClass(), "valid", false);
        setField(term1378714, term1378714.getClass(), "dropTarget", null);
        setField(term1378714, term1378714.getClass(), "popups", null);
        setField(term1378714, term1378714.getClass(), "name", null);
        setBooleanField(term1378714, term1378714.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378714, term1378714.getClass(), "focusable", false);
        setIntField(term1378714, term1378714.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378714, term1378714.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378714, term1378714.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378714, term1378714.getClass(), "acc", null);
        setField(term1378714, term1378714.getClass(), "minSize", null);
        setBooleanField(term1378714, term1378714.getClass(), "minSizeSet", false);
        setField(term1378714, term1378714.getClass(), "prefSize", null);
        setBooleanField(term1378714, term1378714.getClass(), "prefSizeSet", false);
        setField(term1378714, term1378714.getClass(), "maxSize", null);
        setBooleanField(term1378714, term1378714.getClass(), "maxSizeSet", false);
        setField(term1378714, term1378714.getClass(), "componentOrientation", null);
        setBooleanField(term1378714, term1378714.getClass(), "newEventsOnly", false);
        setField(term1378714, term1378714.getClass(), "componentListener", null);
        setField(term1378714, term1378714.getClass(), "focusListener", null);
        setField(term1378714, term1378714.getClass(), "hierarchyListener", null);
        setField(term1378714, term1378714.getClass(), "hierarchyBoundsListener", null);
        setField(term1378714, term1378714.getClass(), "keyListener", null);
        setField(term1378714, term1378714.getClass(), "mouseListener", null);
        setField(term1378714, term1378714.getClass(), "mouseMotionListener", null);
        setField(term1378714, term1378714.getClass(), "mouseWheelListener", null);
        setField(term1378714, term1378714.getClass(), "inputMethodListener", null);
        setLongField(term1378714, term1378714.getClass(), "eventMask", 0L);
        setField(term1378714, term1378714.getClass(), "changeSupport", null);
        setField(term1378714, term1378714.getClass(), "objectLock", null);
        setBooleanField(term1378714, term1378714.getClass(), "isPacked", false);
        setIntField(term1378714, term1378714.getClass(), "boundsOp", 0);
        setField(term1378714, term1378714.getClass(), "compoundShape", null);
        setField(term1378714, term1378714.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378714, term1378714.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378714, term1378714.getClass(), "backgroundEraseDisabled", false);
        setField(term1378714, term1378714.getClass(), "eventCache", null);
        setBooleanField(term1378714, term1378714.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378714, term1378714.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378714, term1378714.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378714, term1378714.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleRecruitableLeaders", argTypes, term1378714, args);
    }

};


