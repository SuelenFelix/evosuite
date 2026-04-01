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

public class BattleView_initBattleView_173468555613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674764;

    public BattleView_initBattleView_173468555613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674764 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674764, term674764.getClass(), "mapPanel", null);
        setField(term674764, term674764.getClass(), "combat", null);
        setField(term674764, term674764.getClass(), "map", null);
        setField(term674764, term674764.getClass(), "infoPanel", null);
        setField(term674764, term674764.getClass(), "combatMapMouseListener", null);
        setIntField(term674764, term674764.getClass(), "delayCount", 0);
        setField(term674764, term674764.getClass(), "endButton", null);
        setField(term674764, term674764.getClass(), "textArea", null);
        setField(term674764, term674764.getClass(), "overloadInfo", null);
        setField(term674764, term674764.getClass(), "logArea", null);
        setField(term674764, term674764.getClass(), "textLogger", null);
        setIntField(term674764, term674764.getClass(), "loopCount", 0);
        setIntField(term674764, term674764.getClass(), "timerCount", 0);
        setField(term674764, term674764.getClass(), "autoCombatEnabled", null);
        setField(term674764, term674764.getClass(), "fastAutoCombat", null);
        setBooleanField(term674764, term674764.getClass(), "isAlignmentXSet", false);
        setFloatField(term674764, term674764.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674764, term674764.getClass(), "isAlignmentYSet", false);
        setFloatField(term674764, term674764.getClass(), "alignmentY", 0.0F);
        setField(term674764, term674764.getClass(), "ui", null);
        setField(term674764, term674764.getClass(), "listenerList", null);
        setField(term674764, term674764.getClass(), "clientProperties", null);
        setField(term674764, term674764.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674764, term674764.getClass(), "autoscrolls", false);
        setField(term674764, term674764.getClass(), "border", null);
        setIntField(term674764, term674764.getClass(), "flags", 0);
        setField(term674764, term674764.getClass(), "inputVerifier", null);
        setBooleanField(term674764, term674764.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674764, term674764.getClass(), "paintingChild", null);
        setField(term674764, term674764.getClass(), "popupMenu", null);
        setField(term674764, term674764.getClass(), "revalidateRunnableScheduled", null);
        setField(term674764, term674764.getClass(), "focusInputMap", null);
        setField(term674764, term674764.getClass(), "ancestorInputMap", null);
        setField(term674764, term674764.getClass(), "windowInputMap", null);
        setField(term674764, term674764.getClass(), "actionMap", null);
        setField(term674764, term674764.getClass(), "aaHint", null);
        setField(term674764, term674764.getClass(), "lcdRenderingHint", null);
        setField(term674764, term674764.getClass(), "component", null);
        setField(term674764, term674764.getClass(), "layoutMgr", null);
        setField(term674764, term674764.getClass(), "dispatcher", null);
        setField(term674764, term674764.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674764, term674764.getClass(), "focusCycleRoot", false);
        setBooleanField(term674764, term674764.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674764, term674764.getClass(), "printingThreads", null);
        setBooleanField(term674764, term674764.getClass(), "printing", false);
        setField(term674764, term674764.getClass(), "containerListener", null);
        setIntField(term674764, term674764.getClass(), "listeningChildren", 0);
        setIntField(term674764, term674764.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674764, term674764.getClass(), "descendantsCount", 0);
        setField(term674764, term674764.getClass(), "preserveBackgroundColor", null);
        setIntField(term674764, term674764.getClass(), "numOfHWComponents", 0);
        setIntField(term674764, term674764.getClass(), "numOfLWComponents", 0);
        setField(term674764, term674764.getClass(), "modalComp", null);
        setField(term674764, term674764.getClass(), "modalAppContext", null);
        setIntField(term674764, term674764.getClass(), "containerSerializedDataVersion", 0);
        setField(term674764, term674764.getClass(), "peer", null);
        setField(term674764, term674764.getClass(), "parent", null);
        setField(term674764, term674764.getClass(), "appContext", null);
        setIntField(term674764, term674764.getClass(), "x", 0);
        setIntField(term674764, term674764.getClass(), "y", 0);
        setIntField(term674764, term674764.getClass(), "width", 0);
        setIntField(term674764, term674764.getClass(), "height", 0);
        setField(term674764, term674764.getClass(), "foreground", null);
        setField(term674764, term674764.getClass(), "background", null);
        setField(term674764, term674764.getClass(), "font", null);
        setField(term674764, term674764.getClass(), "peerFont", null);
        setField(term674764, term674764.getClass(), "cursor", null);
        setField(term674764, term674764.getClass(), "locale", null);
        setField(term674764, term674764.getClass(), "graphicsConfig", null);
        setField(term674764, term674764.getClass(), "bufferStrategy", null);
        setBooleanField(term674764, term674764.getClass(), "ignoreRepaint", false);
        setBooleanField(term674764, term674764.getClass(), "visible", false);
        setBooleanField(term674764, term674764.getClass(), "enabled", false);
        setBooleanField(term674764, term674764.getClass(), "valid", false);
        setField(term674764, term674764.getClass(), "dropTarget", null);
        setField(term674764, term674764.getClass(), "popups", null);
        setField(term674764, term674764.getClass(), "name", null);
        setBooleanField(term674764, term674764.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674764, term674764.getClass(), "focusable", false);
        setIntField(term674764, term674764.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674764, term674764.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674764, term674764.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674764, term674764.getClass(), "acc", null);
        setField(term674764, term674764.getClass(), "minSize", null);
        setBooleanField(term674764, term674764.getClass(), "minSizeSet", false);
        setField(term674764, term674764.getClass(), "prefSize", null);
        setBooleanField(term674764, term674764.getClass(), "prefSizeSet", false);
        setField(term674764, term674764.getClass(), "maxSize", null);
        setBooleanField(term674764, term674764.getClass(), "maxSizeSet", false);
        setField(term674764, term674764.getClass(), "componentOrientation", null);
        setBooleanField(term674764, term674764.getClass(), "newEventsOnly", false);
        setField(term674764, term674764.getClass(), "componentListener", null);
        setField(term674764, term674764.getClass(), "focusListener", null);
        setField(term674764, term674764.getClass(), "hierarchyListener", null);
        setField(term674764, term674764.getClass(), "hierarchyBoundsListener", null);
        setField(term674764, term674764.getClass(), "keyListener", null);
        setField(term674764, term674764.getClass(), "mouseListener", null);
        setField(term674764, term674764.getClass(), "mouseMotionListener", null);
        setField(term674764, term674764.getClass(), "mouseWheelListener", null);
        setField(term674764, term674764.getClass(), "inputMethodListener", null);
        setLongField(term674764, term674764.getClass(), "eventMask", 0L);
        setField(term674764, term674764.getClass(), "changeSupport", null);
        setField(term674764, term674764.getClass(), "objectLock", null);
        setBooleanField(term674764, term674764.getClass(), "isPacked", false);
        setIntField(term674764, term674764.getClass(), "boundsOp", 0);
        setField(term674764, term674764.getClass(), "compoundShape", null);
        setField(term674764, term674764.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674764, term674764.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674764, term674764.getClass(), "backgroundEraseDisabled", false);
        setField(term674764, term674764.getClass(), "eventCache", null);
        setBooleanField(term674764, term674764.getClass(), "coalescingEnabled", false);
        setBooleanField(term674764, term674764.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674764, term674764.getClass(), "componentSerializedDataVersion", 0);
        setField(term674764, term674764.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initBattleView", argTypes, term674764, args);
    }

};


