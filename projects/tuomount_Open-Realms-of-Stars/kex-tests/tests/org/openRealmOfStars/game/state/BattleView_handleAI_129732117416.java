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

public class BattleView_handleAI_129732117416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674896;

    public BattleView_handleAI_129732117416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674896 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674896, term674896.getClass(), "mapPanel", null);
        setField(term674896, term674896.getClass(), "combat", null);
        setField(term674896, term674896.getClass(), "map", null);
        setField(term674896, term674896.getClass(), "infoPanel", null);
        setField(term674896, term674896.getClass(), "combatMapMouseListener", null);
        setIntField(term674896, term674896.getClass(), "delayCount", 0);
        setField(term674896, term674896.getClass(), "endButton", null);
        setField(term674896, term674896.getClass(), "textArea", null);
        setField(term674896, term674896.getClass(), "overloadInfo", null);
        setField(term674896, term674896.getClass(), "logArea", null);
        setField(term674896, term674896.getClass(), "textLogger", null);
        setIntField(term674896, term674896.getClass(), "loopCount", 0);
        setIntField(term674896, term674896.getClass(), "timerCount", 0);
        setField(term674896, term674896.getClass(), "autoCombatEnabled", null);
        setField(term674896, term674896.getClass(), "fastAutoCombat", null);
        setBooleanField(term674896, term674896.getClass(), "isAlignmentXSet", false);
        setFloatField(term674896, term674896.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674896, term674896.getClass(), "isAlignmentYSet", false);
        setFloatField(term674896, term674896.getClass(), "alignmentY", 0.0F);
        setField(term674896, term674896.getClass(), "ui", null);
        setField(term674896, term674896.getClass(), "listenerList", null);
        setField(term674896, term674896.getClass(), "clientProperties", null);
        setField(term674896, term674896.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674896, term674896.getClass(), "autoscrolls", false);
        setField(term674896, term674896.getClass(), "border", null);
        setIntField(term674896, term674896.getClass(), "flags", 0);
        setField(term674896, term674896.getClass(), "inputVerifier", null);
        setBooleanField(term674896, term674896.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674896, term674896.getClass(), "paintingChild", null);
        setField(term674896, term674896.getClass(), "popupMenu", null);
        setField(term674896, term674896.getClass(), "revalidateRunnableScheduled", null);
        setField(term674896, term674896.getClass(), "focusInputMap", null);
        setField(term674896, term674896.getClass(), "ancestorInputMap", null);
        setField(term674896, term674896.getClass(), "windowInputMap", null);
        setField(term674896, term674896.getClass(), "actionMap", null);
        setField(term674896, term674896.getClass(), "aaHint", null);
        setField(term674896, term674896.getClass(), "lcdRenderingHint", null);
        setField(term674896, term674896.getClass(), "component", null);
        setField(term674896, term674896.getClass(), "layoutMgr", null);
        setField(term674896, term674896.getClass(), "dispatcher", null);
        setField(term674896, term674896.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674896, term674896.getClass(), "focusCycleRoot", false);
        setBooleanField(term674896, term674896.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674896, term674896.getClass(), "printingThreads", null);
        setBooleanField(term674896, term674896.getClass(), "printing", false);
        setField(term674896, term674896.getClass(), "containerListener", null);
        setIntField(term674896, term674896.getClass(), "listeningChildren", 0);
        setIntField(term674896, term674896.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674896, term674896.getClass(), "descendantsCount", 0);
        setField(term674896, term674896.getClass(), "preserveBackgroundColor", null);
        setIntField(term674896, term674896.getClass(), "numOfHWComponents", 0);
        setIntField(term674896, term674896.getClass(), "numOfLWComponents", 0);
        setField(term674896, term674896.getClass(), "modalComp", null);
        setField(term674896, term674896.getClass(), "modalAppContext", null);
        setIntField(term674896, term674896.getClass(), "containerSerializedDataVersion", 0);
        setField(term674896, term674896.getClass(), "peer", null);
        setField(term674896, term674896.getClass(), "parent", null);
        setField(term674896, term674896.getClass(), "appContext", null);
        setIntField(term674896, term674896.getClass(), "x", 0);
        setIntField(term674896, term674896.getClass(), "y", 0);
        setIntField(term674896, term674896.getClass(), "width", 0);
        setIntField(term674896, term674896.getClass(), "height", 0);
        setField(term674896, term674896.getClass(), "foreground", null);
        setField(term674896, term674896.getClass(), "background", null);
        setField(term674896, term674896.getClass(), "font", null);
        setField(term674896, term674896.getClass(), "peerFont", null);
        setField(term674896, term674896.getClass(), "cursor", null);
        setField(term674896, term674896.getClass(), "locale", null);
        setField(term674896, term674896.getClass(), "graphicsConfig", null);
        setField(term674896, term674896.getClass(), "bufferStrategy", null);
        setBooleanField(term674896, term674896.getClass(), "ignoreRepaint", false);
        setBooleanField(term674896, term674896.getClass(), "visible", false);
        setBooleanField(term674896, term674896.getClass(), "enabled", false);
        setBooleanField(term674896, term674896.getClass(), "valid", false);
        setField(term674896, term674896.getClass(), "dropTarget", null);
        setField(term674896, term674896.getClass(), "popups", null);
        setField(term674896, term674896.getClass(), "name", null);
        setBooleanField(term674896, term674896.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674896, term674896.getClass(), "focusable", false);
        setIntField(term674896, term674896.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674896, term674896.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674896, term674896.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674896, term674896.getClass(), "acc", null);
        setField(term674896, term674896.getClass(), "minSize", null);
        setBooleanField(term674896, term674896.getClass(), "minSizeSet", false);
        setField(term674896, term674896.getClass(), "prefSize", null);
        setBooleanField(term674896, term674896.getClass(), "prefSizeSet", false);
        setField(term674896, term674896.getClass(), "maxSize", null);
        setBooleanField(term674896, term674896.getClass(), "maxSizeSet", false);
        setField(term674896, term674896.getClass(), "componentOrientation", null);
        setBooleanField(term674896, term674896.getClass(), "newEventsOnly", false);
        setField(term674896, term674896.getClass(), "componentListener", null);
        setField(term674896, term674896.getClass(), "focusListener", null);
        setField(term674896, term674896.getClass(), "hierarchyListener", null);
        setField(term674896, term674896.getClass(), "hierarchyBoundsListener", null);
        setField(term674896, term674896.getClass(), "keyListener", null);
        setField(term674896, term674896.getClass(), "mouseListener", null);
        setField(term674896, term674896.getClass(), "mouseMotionListener", null);
        setField(term674896, term674896.getClass(), "mouseWheelListener", null);
        setField(term674896, term674896.getClass(), "inputMethodListener", null);
        setLongField(term674896, term674896.getClass(), "eventMask", 0L);
        setField(term674896, term674896.getClass(), "changeSupport", null);
        setField(term674896, term674896.getClass(), "objectLock", null);
        setBooleanField(term674896, term674896.getClass(), "isPacked", false);
        setIntField(term674896, term674896.getClass(), "boundsOp", 0);
        setField(term674896, term674896.getClass(), "compoundShape", null);
        setField(term674896, term674896.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674896, term674896.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674896, term674896.getClass(), "backgroundEraseDisabled", false);
        setField(term674896, term674896.getClass(), "eventCache", null);
        setBooleanField(term674896, term674896.getClass(), "coalescingEnabled", false);
        setBooleanField(term674896, term674896.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674896, term674896.getClass(), "componentSerializedDataVersion", 0);
        setField(term674896, term674896.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleAI", argTypes, term674896, args);
    }

};


