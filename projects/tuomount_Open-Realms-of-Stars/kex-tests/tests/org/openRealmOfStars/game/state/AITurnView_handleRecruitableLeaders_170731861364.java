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

public class AITurnView_handleRecruitableLeaders_170731861364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1398166;

    public AITurnView_handleRecruitableLeaders_170731861364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1398166 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1398166, term1398166.getClass(), "label", null);
        setField(term1398166, term1398166.getClass(), "game", null);
        setIntField(term1398166, term1398166.getClass(), "textAnim", 0);
        setIntField(term1398166, term1398166.getClass(), "cx", 0);
        setIntField(term1398166, term1398166.getClass(), "cy", 0);
        setField(term1398166, term1398166.getClass(), "aiThread", null);
        setBooleanField(term1398166, term1398166.getClass(), "readyToMove", false);
        setField(term1398166, term1398166.getClass(), "nextState", null);
        setField(term1398166, term1398166.getClass(), "nextStateObject", null);
        setBooleanField(term1398166, term1398166.getClass(), "isAlignmentXSet", false);
        setFloatField(term1398166, term1398166.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1398166, term1398166.getClass(), "isAlignmentYSet", false);
        setFloatField(term1398166, term1398166.getClass(), "alignmentY", 0.0F);
        setField(term1398166, term1398166.getClass(), "ui", null);
        setField(term1398166, term1398166.getClass(), "listenerList", null);
        setField(term1398166, term1398166.getClass(), "clientProperties", null);
        setField(term1398166, term1398166.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1398166, term1398166.getClass(), "autoscrolls", false);
        setField(term1398166, term1398166.getClass(), "border", null);
        setIntField(term1398166, term1398166.getClass(), "flags", 0);
        setField(term1398166, term1398166.getClass(), "inputVerifier", null);
        setBooleanField(term1398166, term1398166.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1398166, term1398166.getClass(), "paintingChild", null);
        setField(term1398166, term1398166.getClass(), "popupMenu", null);
        setField(term1398166, term1398166.getClass(), "revalidateRunnableScheduled", null);
        setField(term1398166, term1398166.getClass(), "focusInputMap", null);
        setField(term1398166, term1398166.getClass(), "ancestorInputMap", null);
        setField(term1398166, term1398166.getClass(), "windowInputMap", null);
        setField(term1398166, term1398166.getClass(), "actionMap", null);
        setField(term1398166, term1398166.getClass(), "aaHint", null);
        setField(term1398166, term1398166.getClass(), "lcdRenderingHint", null);
        setField(term1398166, term1398166.getClass(), "component", null);
        setField(term1398166, term1398166.getClass(), "layoutMgr", null);
        setField(term1398166, term1398166.getClass(), "dispatcher", null);
        setField(term1398166, term1398166.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1398166, term1398166.getClass(), "focusCycleRoot", false);
        setBooleanField(term1398166, term1398166.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1398166, term1398166.getClass(), "printingThreads", null);
        setBooleanField(term1398166, term1398166.getClass(), "printing", false);
        setField(term1398166, term1398166.getClass(), "containerListener", null);
        setIntField(term1398166, term1398166.getClass(), "listeningChildren", 0);
        setIntField(term1398166, term1398166.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1398166, term1398166.getClass(), "descendantsCount", 0);
        setField(term1398166, term1398166.getClass(), "preserveBackgroundColor", null);
        setIntField(term1398166, term1398166.getClass(), "numOfHWComponents", 0);
        setIntField(term1398166, term1398166.getClass(), "numOfLWComponents", 0);
        setField(term1398166, term1398166.getClass(), "modalComp", null);
        setField(term1398166, term1398166.getClass(), "modalAppContext", null);
        setIntField(term1398166, term1398166.getClass(), "containerSerializedDataVersion", 0);
        setField(term1398166, term1398166.getClass(), "peer", null);
        setField(term1398166, term1398166.getClass(), "parent", null);
        setField(term1398166, term1398166.getClass(), "appContext", null);
        setIntField(term1398166, term1398166.getClass(), "x", 0);
        setIntField(term1398166, term1398166.getClass(), "y", 0);
        setIntField(term1398166, term1398166.getClass(), "width", 0);
        setIntField(term1398166, term1398166.getClass(), "height", 0);
        setField(term1398166, term1398166.getClass(), "foreground", null);
        setField(term1398166, term1398166.getClass(), "background", null);
        setField(term1398166, term1398166.getClass(), "font", null);
        setField(term1398166, term1398166.getClass(), "peerFont", null);
        setField(term1398166, term1398166.getClass(), "cursor", null);
        setField(term1398166, term1398166.getClass(), "locale", null);
        setField(term1398166, term1398166.getClass(), "graphicsConfig", null);
        setField(term1398166, term1398166.getClass(), "bufferStrategy", null);
        setBooleanField(term1398166, term1398166.getClass(), "ignoreRepaint", false);
        setBooleanField(term1398166, term1398166.getClass(), "visible", false);
        setBooleanField(term1398166, term1398166.getClass(), "enabled", false);
        setBooleanField(term1398166, term1398166.getClass(), "valid", false);
        setField(term1398166, term1398166.getClass(), "dropTarget", null);
        setField(term1398166, term1398166.getClass(), "popups", null);
        setField(term1398166, term1398166.getClass(), "name", null);
        setBooleanField(term1398166, term1398166.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1398166, term1398166.getClass(), "focusable", false);
        setIntField(term1398166, term1398166.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1398166, term1398166.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1398166, term1398166.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1398166, term1398166.getClass(), "acc", null);
        setField(term1398166, term1398166.getClass(), "minSize", null);
        setBooleanField(term1398166, term1398166.getClass(), "minSizeSet", false);
        setField(term1398166, term1398166.getClass(), "prefSize", null);
        setBooleanField(term1398166, term1398166.getClass(), "prefSizeSet", false);
        setField(term1398166, term1398166.getClass(), "maxSize", null);
        setBooleanField(term1398166, term1398166.getClass(), "maxSizeSet", false);
        setField(term1398166, term1398166.getClass(), "componentOrientation", null);
        setBooleanField(term1398166, term1398166.getClass(), "newEventsOnly", false);
        setField(term1398166, term1398166.getClass(), "componentListener", null);
        setField(term1398166, term1398166.getClass(), "focusListener", null);
        setField(term1398166, term1398166.getClass(), "hierarchyListener", null);
        setField(term1398166, term1398166.getClass(), "hierarchyBoundsListener", null);
        setField(term1398166, term1398166.getClass(), "keyListener", null);
        setField(term1398166, term1398166.getClass(), "mouseListener", null);
        setField(term1398166, term1398166.getClass(), "mouseMotionListener", null);
        setField(term1398166, term1398166.getClass(), "mouseWheelListener", null);
        setField(term1398166, term1398166.getClass(), "inputMethodListener", null);
        setLongField(term1398166, term1398166.getClass(), "eventMask", 0L);
        setField(term1398166, term1398166.getClass(), "changeSupport", null);
        setField(term1398166, term1398166.getClass(), "objectLock", null);
        setBooleanField(term1398166, term1398166.getClass(), "isPacked", false);
        setIntField(term1398166, term1398166.getClass(), "boundsOp", 0);
        setField(term1398166, term1398166.getClass(), "compoundShape", null);
        setField(term1398166, term1398166.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1398166, term1398166.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1398166, term1398166.getClass(), "backgroundEraseDisabled", false);
        setField(term1398166, term1398166.getClass(), "eventCache", null);
        setBooleanField(term1398166, term1398166.getClass(), "coalescingEnabled", false);
        setBooleanField(term1398166, term1398166.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1398166, term1398166.getClass(), "componentSerializedDataVersion", 0);
        setField(term1398166, term1398166.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleRecruitableLeaders", argTypes, term1398166, args);
    }

};


