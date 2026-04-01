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

public class BattleView_handleActions_131215363220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675072;

    public BattleView_handleActions_131215363220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675072 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term675072, term675072.getClass(), "mapPanel", null);
        setField(term675072, term675072.getClass(), "combat", null);
        setField(term675072, term675072.getClass(), "map", null);
        setField(term675072, term675072.getClass(), "infoPanel", null);
        setField(term675072, term675072.getClass(), "combatMapMouseListener", null);
        setIntField(term675072, term675072.getClass(), "delayCount", 0);
        setField(term675072, term675072.getClass(), "endButton", null);
        setField(term675072, term675072.getClass(), "textArea", null);
        setField(term675072, term675072.getClass(), "overloadInfo", null);
        setField(term675072, term675072.getClass(), "logArea", null);
        setField(term675072, term675072.getClass(), "textLogger", null);
        setIntField(term675072, term675072.getClass(), "loopCount", 0);
        setIntField(term675072, term675072.getClass(), "timerCount", 0);
        setField(term675072, term675072.getClass(), "autoCombatEnabled", null);
        setField(term675072, term675072.getClass(), "fastAutoCombat", null);
        setBooleanField(term675072, term675072.getClass(), "isAlignmentXSet", false);
        setFloatField(term675072, term675072.getClass(), "alignmentX", 0.0F);
        setBooleanField(term675072, term675072.getClass(), "isAlignmentYSet", false);
        setFloatField(term675072, term675072.getClass(), "alignmentY", 0.0F);
        setField(term675072, term675072.getClass(), "ui", null);
        setField(term675072, term675072.getClass(), "listenerList", null);
        setField(term675072, term675072.getClass(), "clientProperties", null);
        setField(term675072, term675072.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term675072, term675072.getClass(), "autoscrolls", false);
        setField(term675072, term675072.getClass(), "border", null);
        setIntField(term675072, term675072.getClass(), "flags", 0);
        setField(term675072, term675072.getClass(), "inputVerifier", null);
        setBooleanField(term675072, term675072.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term675072, term675072.getClass(), "paintingChild", null);
        setField(term675072, term675072.getClass(), "popupMenu", null);
        setField(term675072, term675072.getClass(), "revalidateRunnableScheduled", null);
        setField(term675072, term675072.getClass(), "focusInputMap", null);
        setField(term675072, term675072.getClass(), "ancestorInputMap", null);
        setField(term675072, term675072.getClass(), "windowInputMap", null);
        setField(term675072, term675072.getClass(), "actionMap", null);
        setField(term675072, term675072.getClass(), "aaHint", null);
        setField(term675072, term675072.getClass(), "lcdRenderingHint", null);
        setField(term675072, term675072.getClass(), "component", null);
        setField(term675072, term675072.getClass(), "layoutMgr", null);
        setField(term675072, term675072.getClass(), "dispatcher", null);
        setField(term675072, term675072.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term675072, term675072.getClass(), "focusCycleRoot", false);
        setBooleanField(term675072, term675072.getClass(), "focusTraversalPolicyProvider", false);
        setField(term675072, term675072.getClass(), "printingThreads", null);
        setBooleanField(term675072, term675072.getClass(), "printing", false);
        setField(term675072, term675072.getClass(), "containerListener", null);
        setIntField(term675072, term675072.getClass(), "listeningChildren", 0);
        setIntField(term675072, term675072.getClass(), "listeningBoundsChildren", 0);
        setIntField(term675072, term675072.getClass(), "descendantsCount", 0);
        setField(term675072, term675072.getClass(), "preserveBackgroundColor", null);
        setIntField(term675072, term675072.getClass(), "numOfHWComponents", 0);
        setIntField(term675072, term675072.getClass(), "numOfLWComponents", 0);
        setField(term675072, term675072.getClass(), "modalComp", null);
        setField(term675072, term675072.getClass(), "modalAppContext", null);
        setIntField(term675072, term675072.getClass(), "containerSerializedDataVersion", 0);
        setField(term675072, term675072.getClass(), "peer", null);
        setField(term675072, term675072.getClass(), "parent", null);
        setField(term675072, term675072.getClass(), "appContext", null);
        setIntField(term675072, term675072.getClass(), "x", 0);
        setIntField(term675072, term675072.getClass(), "y", 0);
        setIntField(term675072, term675072.getClass(), "width", 0);
        setIntField(term675072, term675072.getClass(), "height", 0);
        setField(term675072, term675072.getClass(), "foreground", null);
        setField(term675072, term675072.getClass(), "background", null);
        setField(term675072, term675072.getClass(), "font", null);
        setField(term675072, term675072.getClass(), "peerFont", null);
        setField(term675072, term675072.getClass(), "cursor", null);
        setField(term675072, term675072.getClass(), "locale", null);
        setField(term675072, term675072.getClass(), "graphicsConfig", null);
        setField(term675072, term675072.getClass(), "bufferStrategy", null);
        setBooleanField(term675072, term675072.getClass(), "ignoreRepaint", false);
        setBooleanField(term675072, term675072.getClass(), "visible", false);
        setBooleanField(term675072, term675072.getClass(), "enabled", false);
        setBooleanField(term675072, term675072.getClass(), "valid", false);
        setField(term675072, term675072.getClass(), "dropTarget", null);
        setField(term675072, term675072.getClass(), "popups", null);
        setField(term675072, term675072.getClass(), "name", null);
        setBooleanField(term675072, term675072.getClass(), "nameExplicitlySet", false);
        setBooleanField(term675072, term675072.getClass(), "focusable", false);
        setIntField(term675072, term675072.getClass(), "isFocusTraversableOverridden", 0);
        setField(term675072, term675072.getClass(), "focusTraversalKeys", null);
        setBooleanField(term675072, term675072.getClass(), "focusTraversalKeysEnabled", false);
        setField(term675072, term675072.getClass(), "acc", null);
        setField(term675072, term675072.getClass(), "minSize", null);
        setBooleanField(term675072, term675072.getClass(), "minSizeSet", false);
        setField(term675072, term675072.getClass(), "prefSize", null);
        setBooleanField(term675072, term675072.getClass(), "prefSizeSet", false);
        setField(term675072, term675072.getClass(), "maxSize", null);
        setBooleanField(term675072, term675072.getClass(), "maxSizeSet", false);
        setField(term675072, term675072.getClass(), "componentOrientation", null);
        setBooleanField(term675072, term675072.getClass(), "newEventsOnly", false);
        setField(term675072, term675072.getClass(), "componentListener", null);
        setField(term675072, term675072.getClass(), "focusListener", null);
        setField(term675072, term675072.getClass(), "hierarchyListener", null);
        setField(term675072, term675072.getClass(), "hierarchyBoundsListener", null);
        setField(term675072, term675072.getClass(), "keyListener", null);
        setField(term675072, term675072.getClass(), "mouseListener", null);
        setField(term675072, term675072.getClass(), "mouseMotionListener", null);
        setField(term675072, term675072.getClass(), "mouseWheelListener", null);
        setField(term675072, term675072.getClass(), "inputMethodListener", null);
        setLongField(term675072, term675072.getClass(), "eventMask", 0L);
        setField(term675072, term675072.getClass(), "changeSupport", null);
        setField(term675072, term675072.getClass(), "objectLock", null);
        setBooleanField(term675072, term675072.getClass(), "isPacked", false);
        setIntField(term675072, term675072.getClass(), "boundsOp", 0);
        setField(term675072, term675072.getClass(), "compoundShape", null);
        setField(term675072, term675072.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term675072, term675072.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term675072, term675072.getClass(), "backgroundEraseDisabled", false);
        setField(term675072, term675072.getClass(), "eventCache", null);
        setBooleanField(term675072, term675072.getClass(), "coalescingEnabled", false);
        setBooleanField(term675072, term675072.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term675072, term675072.getClass(), "componentSerializedDataVersion", 0);
        setField(term675072, term675072.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term675072, args);
    }

};


