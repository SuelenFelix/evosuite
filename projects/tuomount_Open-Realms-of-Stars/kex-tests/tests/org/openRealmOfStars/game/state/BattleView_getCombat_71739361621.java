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

public class BattleView_getCombat_71739361621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675116;

    public BattleView_getCombat_71739361621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675116 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term675116, term675116.getClass(), "mapPanel", null);
        setField(term675116, term675116.getClass(), "combat", null);
        setField(term675116, term675116.getClass(), "map", null);
        setField(term675116, term675116.getClass(), "infoPanel", null);
        setField(term675116, term675116.getClass(), "combatMapMouseListener", null);
        setIntField(term675116, term675116.getClass(), "delayCount", 0);
        setField(term675116, term675116.getClass(), "endButton", null);
        setField(term675116, term675116.getClass(), "textArea", null);
        setField(term675116, term675116.getClass(), "overloadInfo", null);
        setField(term675116, term675116.getClass(), "logArea", null);
        setField(term675116, term675116.getClass(), "textLogger", null);
        setIntField(term675116, term675116.getClass(), "loopCount", 0);
        setIntField(term675116, term675116.getClass(), "timerCount", 0);
        setField(term675116, term675116.getClass(), "autoCombatEnabled", null);
        setField(term675116, term675116.getClass(), "fastAutoCombat", null);
        setBooleanField(term675116, term675116.getClass(), "isAlignmentXSet", false);
        setFloatField(term675116, term675116.getClass(), "alignmentX", 0.0F);
        setBooleanField(term675116, term675116.getClass(), "isAlignmentYSet", false);
        setFloatField(term675116, term675116.getClass(), "alignmentY", 0.0F);
        setField(term675116, term675116.getClass(), "ui", null);
        setField(term675116, term675116.getClass(), "listenerList", null);
        setField(term675116, term675116.getClass(), "clientProperties", null);
        setField(term675116, term675116.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term675116, term675116.getClass(), "autoscrolls", false);
        setField(term675116, term675116.getClass(), "border", null);
        setIntField(term675116, term675116.getClass(), "flags", 0);
        setField(term675116, term675116.getClass(), "inputVerifier", null);
        setBooleanField(term675116, term675116.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term675116, term675116.getClass(), "paintingChild", null);
        setField(term675116, term675116.getClass(), "popupMenu", null);
        setField(term675116, term675116.getClass(), "revalidateRunnableScheduled", null);
        setField(term675116, term675116.getClass(), "focusInputMap", null);
        setField(term675116, term675116.getClass(), "ancestorInputMap", null);
        setField(term675116, term675116.getClass(), "windowInputMap", null);
        setField(term675116, term675116.getClass(), "actionMap", null);
        setField(term675116, term675116.getClass(), "aaHint", null);
        setField(term675116, term675116.getClass(), "lcdRenderingHint", null);
        setField(term675116, term675116.getClass(), "component", null);
        setField(term675116, term675116.getClass(), "layoutMgr", null);
        setField(term675116, term675116.getClass(), "dispatcher", null);
        setField(term675116, term675116.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term675116, term675116.getClass(), "focusCycleRoot", false);
        setBooleanField(term675116, term675116.getClass(), "focusTraversalPolicyProvider", false);
        setField(term675116, term675116.getClass(), "printingThreads", null);
        setBooleanField(term675116, term675116.getClass(), "printing", false);
        setField(term675116, term675116.getClass(), "containerListener", null);
        setIntField(term675116, term675116.getClass(), "listeningChildren", 0);
        setIntField(term675116, term675116.getClass(), "listeningBoundsChildren", 0);
        setIntField(term675116, term675116.getClass(), "descendantsCount", 0);
        setField(term675116, term675116.getClass(), "preserveBackgroundColor", null);
        setIntField(term675116, term675116.getClass(), "numOfHWComponents", 0);
        setIntField(term675116, term675116.getClass(), "numOfLWComponents", 0);
        setField(term675116, term675116.getClass(), "modalComp", null);
        setField(term675116, term675116.getClass(), "modalAppContext", null);
        setIntField(term675116, term675116.getClass(), "containerSerializedDataVersion", 0);
        setField(term675116, term675116.getClass(), "peer", null);
        setField(term675116, term675116.getClass(), "parent", null);
        setField(term675116, term675116.getClass(), "appContext", null);
        setIntField(term675116, term675116.getClass(), "x", 0);
        setIntField(term675116, term675116.getClass(), "y", 0);
        setIntField(term675116, term675116.getClass(), "width", 0);
        setIntField(term675116, term675116.getClass(), "height", 0);
        setField(term675116, term675116.getClass(), "foreground", null);
        setField(term675116, term675116.getClass(), "background", null);
        setField(term675116, term675116.getClass(), "font", null);
        setField(term675116, term675116.getClass(), "peerFont", null);
        setField(term675116, term675116.getClass(), "cursor", null);
        setField(term675116, term675116.getClass(), "locale", null);
        setField(term675116, term675116.getClass(), "graphicsConfig", null);
        setField(term675116, term675116.getClass(), "bufferStrategy", null);
        setBooleanField(term675116, term675116.getClass(), "ignoreRepaint", false);
        setBooleanField(term675116, term675116.getClass(), "visible", false);
        setBooleanField(term675116, term675116.getClass(), "enabled", false);
        setBooleanField(term675116, term675116.getClass(), "valid", false);
        setField(term675116, term675116.getClass(), "dropTarget", null);
        setField(term675116, term675116.getClass(), "popups", null);
        setField(term675116, term675116.getClass(), "name", null);
        setBooleanField(term675116, term675116.getClass(), "nameExplicitlySet", false);
        setBooleanField(term675116, term675116.getClass(), "focusable", false);
        setIntField(term675116, term675116.getClass(), "isFocusTraversableOverridden", 0);
        setField(term675116, term675116.getClass(), "focusTraversalKeys", null);
        setBooleanField(term675116, term675116.getClass(), "focusTraversalKeysEnabled", false);
        setField(term675116, term675116.getClass(), "acc", null);
        setField(term675116, term675116.getClass(), "minSize", null);
        setBooleanField(term675116, term675116.getClass(), "minSizeSet", false);
        setField(term675116, term675116.getClass(), "prefSize", null);
        setBooleanField(term675116, term675116.getClass(), "prefSizeSet", false);
        setField(term675116, term675116.getClass(), "maxSize", null);
        setBooleanField(term675116, term675116.getClass(), "maxSizeSet", false);
        setField(term675116, term675116.getClass(), "componentOrientation", null);
        setBooleanField(term675116, term675116.getClass(), "newEventsOnly", false);
        setField(term675116, term675116.getClass(), "componentListener", null);
        setField(term675116, term675116.getClass(), "focusListener", null);
        setField(term675116, term675116.getClass(), "hierarchyListener", null);
        setField(term675116, term675116.getClass(), "hierarchyBoundsListener", null);
        setField(term675116, term675116.getClass(), "keyListener", null);
        setField(term675116, term675116.getClass(), "mouseListener", null);
        setField(term675116, term675116.getClass(), "mouseMotionListener", null);
        setField(term675116, term675116.getClass(), "mouseWheelListener", null);
        setField(term675116, term675116.getClass(), "inputMethodListener", null);
        setLongField(term675116, term675116.getClass(), "eventMask", 0L);
        setField(term675116, term675116.getClass(), "changeSupport", null);
        setField(term675116, term675116.getClass(), "objectLock", null);
        setBooleanField(term675116, term675116.getClass(), "isPacked", false);
        setIntField(term675116, term675116.getClass(), "boundsOp", 0);
        setField(term675116, term675116.getClass(), "compoundShape", null);
        setField(term675116, term675116.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term675116, term675116.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term675116, term675116.getClass(), "backgroundEraseDisabled", false);
        setField(term675116, term675116.getClass(), "eventCache", null);
        setBooleanField(term675116, term675116.getClass(), "coalescingEnabled", false);
        setBooleanField(term675116, term675116.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term675116, term675116.getClass(), "componentSerializedDataVersion", 0);
        setField(term675116, term675116.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCombat", argTypes, term675116, args);
    }

};


