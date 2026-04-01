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

public class BattleView_getBottomTextArea_189256064615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674852;

    public BattleView_getBottomTextArea_189256064615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674852 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674852, term674852.getClass(), "mapPanel", null);
        setField(term674852, term674852.getClass(), "combat", null);
        setField(term674852, term674852.getClass(), "map", null);
        setField(term674852, term674852.getClass(), "infoPanel", null);
        setField(term674852, term674852.getClass(), "combatMapMouseListener", null);
        setIntField(term674852, term674852.getClass(), "delayCount", 0);
        setField(term674852, term674852.getClass(), "endButton", null);
        setField(term674852, term674852.getClass(), "textArea", null);
        setField(term674852, term674852.getClass(), "overloadInfo", null);
        setField(term674852, term674852.getClass(), "logArea", null);
        setField(term674852, term674852.getClass(), "textLogger", null);
        setIntField(term674852, term674852.getClass(), "loopCount", 0);
        setIntField(term674852, term674852.getClass(), "timerCount", 0);
        setField(term674852, term674852.getClass(), "autoCombatEnabled", null);
        setField(term674852, term674852.getClass(), "fastAutoCombat", null);
        setBooleanField(term674852, term674852.getClass(), "isAlignmentXSet", false);
        setFloatField(term674852, term674852.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674852, term674852.getClass(), "isAlignmentYSet", false);
        setFloatField(term674852, term674852.getClass(), "alignmentY", 0.0F);
        setField(term674852, term674852.getClass(), "ui", null);
        setField(term674852, term674852.getClass(), "listenerList", null);
        setField(term674852, term674852.getClass(), "clientProperties", null);
        setField(term674852, term674852.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674852, term674852.getClass(), "autoscrolls", false);
        setField(term674852, term674852.getClass(), "border", null);
        setIntField(term674852, term674852.getClass(), "flags", 0);
        setField(term674852, term674852.getClass(), "inputVerifier", null);
        setBooleanField(term674852, term674852.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674852, term674852.getClass(), "paintingChild", null);
        setField(term674852, term674852.getClass(), "popupMenu", null);
        setField(term674852, term674852.getClass(), "revalidateRunnableScheduled", null);
        setField(term674852, term674852.getClass(), "focusInputMap", null);
        setField(term674852, term674852.getClass(), "ancestorInputMap", null);
        setField(term674852, term674852.getClass(), "windowInputMap", null);
        setField(term674852, term674852.getClass(), "actionMap", null);
        setField(term674852, term674852.getClass(), "aaHint", null);
        setField(term674852, term674852.getClass(), "lcdRenderingHint", null);
        setField(term674852, term674852.getClass(), "component", null);
        setField(term674852, term674852.getClass(), "layoutMgr", null);
        setField(term674852, term674852.getClass(), "dispatcher", null);
        setField(term674852, term674852.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674852, term674852.getClass(), "focusCycleRoot", false);
        setBooleanField(term674852, term674852.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674852, term674852.getClass(), "printingThreads", null);
        setBooleanField(term674852, term674852.getClass(), "printing", false);
        setField(term674852, term674852.getClass(), "containerListener", null);
        setIntField(term674852, term674852.getClass(), "listeningChildren", 0);
        setIntField(term674852, term674852.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674852, term674852.getClass(), "descendantsCount", 0);
        setField(term674852, term674852.getClass(), "preserveBackgroundColor", null);
        setIntField(term674852, term674852.getClass(), "numOfHWComponents", 0);
        setIntField(term674852, term674852.getClass(), "numOfLWComponents", 0);
        setField(term674852, term674852.getClass(), "modalComp", null);
        setField(term674852, term674852.getClass(), "modalAppContext", null);
        setIntField(term674852, term674852.getClass(), "containerSerializedDataVersion", 0);
        setField(term674852, term674852.getClass(), "peer", null);
        setField(term674852, term674852.getClass(), "parent", null);
        setField(term674852, term674852.getClass(), "appContext", null);
        setIntField(term674852, term674852.getClass(), "x", 0);
        setIntField(term674852, term674852.getClass(), "y", 0);
        setIntField(term674852, term674852.getClass(), "width", 0);
        setIntField(term674852, term674852.getClass(), "height", 0);
        setField(term674852, term674852.getClass(), "foreground", null);
        setField(term674852, term674852.getClass(), "background", null);
        setField(term674852, term674852.getClass(), "font", null);
        setField(term674852, term674852.getClass(), "peerFont", null);
        setField(term674852, term674852.getClass(), "cursor", null);
        setField(term674852, term674852.getClass(), "locale", null);
        setField(term674852, term674852.getClass(), "graphicsConfig", null);
        setField(term674852, term674852.getClass(), "bufferStrategy", null);
        setBooleanField(term674852, term674852.getClass(), "ignoreRepaint", false);
        setBooleanField(term674852, term674852.getClass(), "visible", false);
        setBooleanField(term674852, term674852.getClass(), "enabled", false);
        setBooleanField(term674852, term674852.getClass(), "valid", false);
        setField(term674852, term674852.getClass(), "dropTarget", null);
        setField(term674852, term674852.getClass(), "popups", null);
        setField(term674852, term674852.getClass(), "name", null);
        setBooleanField(term674852, term674852.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674852, term674852.getClass(), "focusable", false);
        setIntField(term674852, term674852.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674852, term674852.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674852, term674852.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674852, term674852.getClass(), "acc", null);
        setField(term674852, term674852.getClass(), "minSize", null);
        setBooleanField(term674852, term674852.getClass(), "minSizeSet", false);
        setField(term674852, term674852.getClass(), "prefSize", null);
        setBooleanField(term674852, term674852.getClass(), "prefSizeSet", false);
        setField(term674852, term674852.getClass(), "maxSize", null);
        setBooleanField(term674852, term674852.getClass(), "maxSizeSet", false);
        setField(term674852, term674852.getClass(), "componentOrientation", null);
        setBooleanField(term674852, term674852.getClass(), "newEventsOnly", false);
        setField(term674852, term674852.getClass(), "componentListener", null);
        setField(term674852, term674852.getClass(), "focusListener", null);
        setField(term674852, term674852.getClass(), "hierarchyListener", null);
        setField(term674852, term674852.getClass(), "hierarchyBoundsListener", null);
        setField(term674852, term674852.getClass(), "keyListener", null);
        setField(term674852, term674852.getClass(), "mouseListener", null);
        setField(term674852, term674852.getClass(), "mouseMotionListener", null);
        setField(term674852, term674852.getClass(), "mouseWheelListener", null);
        setField(term674852, term674852.getClass(), "inputMethodListener", null);
        setLongField(term674852, term674852.getClass(), "eventMask", 0L);
        setField(term674852, term674852.getClass(), "changeSupport", null);
        setField(term674852, term674852.getClass(), "objectLock", null);
        setBooleanField(term674852, term674852.getClass(), "isPacked", false);
        setIntField(term674852, term674852.getClass(), "boundsOp", 0);
        setField(term674852, term674852.getClass(), "compoundShape", null);
        setField(term674852, term674852.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674852, term674852.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674852, term674852.getClass(), "backgroundEraseDisabled", false);
        setField(term674852, term674852.getClass(), "eventCache", null);
        setBooleanField(term674852, term674852.getClass(), "coalescingEnabled", false);
        setBooleanField(term674852, term674852.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674852, term674852.getClass(), "componentSerializedDataVersion", 0);
        setField(term674852, term674852.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBottomTextArea", argTypes, term674852, args);
    }

};


