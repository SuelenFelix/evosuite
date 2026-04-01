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

public class BattleView_updatePanels_135346843014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674808;

    public BattleView_updatePanels_135346843014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674808 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674808, term674808.getClass(), "mapPanel", null);
        setField(term674808, term674808.getClass(), "combat", null);
        setField(term674808, term674808.getClass(), "map", null);
        setField(term674808, term674808.getClass(), "infoPanel", null);
        setField(term674808, term674808.getClass(), "combatMapMouseListener", null);
        setIntField(term674808, term674808.getClass(), "delayCount", 0);
        setField(term674808, term674808.getClass(), "endButton", null);
        setField(term674808, term674808.getClass(), "textArea", null);
        setField(term674808, term674808.getClass(), "overloadInfo", null);
        setField(term674808, term674808.getClass(), "logArea", null);
        setField(term674808, term674808.getClass(), "textLogger", null);
        setIntField(term674808, term674808.getClass(), "loopCount", 0);
        setIntField(term674808, term674808.getClass(), "timerCount", 0);
        setField(term674808, term674808.getClass(), "autoCombatEnabled", null);
        setField(term674808, term674808.getClass(), "fastAutoCombat", null);
        setBooleanField(term674808, term674808.getClass(), "isAlignmentXSet", false);
        setFloatField(term674808, term674808.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674808, term674808.getClass(), "isAlignmentYSet", false);
        setFloatField(term674808, term674808.getClass(), "alignmentY", 0.0F);
        setField(term674808, term674808.getClass(), "ui", null);
        setField(term674808, term674808.getClass(), "listenerList", null);
        setField(term674808, term674808.getClass(), "clientProperties", null);
        setField(term674808, term674808.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674808, term674808.getClass(), "autoscrolls", false);
        setField(term674808, term674808.getClass(), "border", null);
        setIntField(term674808, term674808.getClass(), "flags", 0);
        setField(term674808, term674808.getClass(), "inputVerifier", null);
        setBooleanField(term674808, term674808.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674808, term674808.getClass(), "paintingChild", null);
        setField(term674808, term674808.getClass(), "popupMenu", null);
        setField(term674808, term674808.getClass(), "revalidateRunnableScheduled", null);
        setField(term674808, term674808.getClass(), "focusInputMap", null);
        setField(term674808, term674808.getClass(), "ancestorInputMap", null);
        setField(term674808, term674808.getClass(), "windowInputMap", null);
        setField(term674808, term674808.getClass(), "actionMap", null);
        setField(term674808, term674808.getClass(), "aaHint", null);
        setField(term674808, term674808.getClass(), "lcdRenderingHint", null);
        setField(term674808, term674808.getClass(), "component", null);
        setField(term674808, term674808.getClass(), "layoutMgr", null);
        setField(term674808, term674808.getClass(), "dispatcher", null);
        setField(term674808, term674808.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674808, term674808.getClass(), "focusCycleRoot", false);
        setBooleanField(term674808, term674808.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674808, term674808.getClass(), "printingThreads", null);
        setBooleanField(term674808, term674808.getClass(), "printing", false);
        setField(term674808, term674808.getClass(), "containerListener", null);
        setIntField(term674808, term674808.getClass(), "listeningChildren", 0);
        setIntField(term674808, term674808.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674808, term674808.getClass(), "descendantsCount", 0);
        setField(term674808, term674808.getClass(), "preserveBackgroundColor", null);
        setIntField(term674808, term674808.getClass(), "numOfHWComponents", 0);
        setIntField(term674808, term674808.getClass(), "numOfLWComponents", 0);
        setField(term674808, term674808.getClass(), "modalComp", null);
        setField(term674808, term674808.getClass(), "modalAppContext", null);
        setIntField(term674808, term674808.getClass(), "containerSerializedDataVersion", 0);
        setField(term674808, term674808.getClass(), "peer", null);
        setField(term674808, term674808.getClass(), "parent", null);
        setField(term674808, term674808.getClass(), "appContext", null);
        setIntField(term674808, term674808.getClass(), "x", 0);
        setIntField(term674808, term674808.getClass(), "y", 0);
        setIntField(term674808, term674808.getClass(), "width", 0);
        setIntField(term674808, term674808.getClass(), "height", 0);
        setField(term674808, term674808.getClass(), "foreground", null);
        setField(term674808, term674808.getClass(), "background", null);
        setField(term674808, term674808.getClass(), "font", null);
        setField(term674808, term674808.getClass(), "peerFont", null);
        setField(term674808, term674808.getClass(), "cursor", null);
        setField(term674808, term674808.getClass(), "locale", null);
        setField(term674808, term674808.getClass(), "graphicsConfig", null);
        setField(term674808, term674808.getClass(), "bufferStrategy", null);
        setBooleanField(term674808, term674808.getClass(), "ignoreRepaint", false);
        setBooleanField(term674808, term674808.getClass(), "visible", false);
        setBooleanField(term674808, term674808.getClass(), "enabled", false);
        setBooleanField(term674808, term674808.getClass(), "valid", false);
        setField(term674808, term674808.getClass(), "dropTarget", null);
        setField(term674808, term674808.getClass(), "popups", null);
        setField(term674808, term674808.getClass(), "name", null);
        setBooleanField(term674808, term674808.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674808, term674808.getClass(), "focusable", false);
        setIntField(term674808, term674808.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674808, term674808.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674808, term674808.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674808, term674808.getClass(), "acc", null);
        setField(term674808, term674808.getClass(), "minSize", null);
        setBooleanField(term674808, term674808.getClass(), "minSizeSet", false);
        setField(term674808, term674808.getClass(), "prefSize", null);
        setBooleanField(term674808, term674808.getClass(), "prefSizeSet", false);
        setField(term674808, term674808.getClass(), "maxSize", null);
        setBooleanField(term674808, term674808.getClass(), "maxSizeSet", false);
        setField(term674808, term674808.getClass(), "componentOrientation", null);
        setBooleanField(term674808, term674808.getClass(), "newEventsOnly", false);
        setField(term674808, term674808.getClass(), "componentListener", null);
        setField(term674808, term674808.getClass(), "focusListener", null);
        setField(term674808, term674808.getClass(), "hierarchyListener", null);
        setField(term674808, term674808.getClass(), "hierarchyBoundsListener", null);
        setField(term674808, term674808.getClass(), "keyListener", null);
        setField(term674808, term674808.getClass(), "mouseListener", null);
        setField(term674808, term674808.getClass(), "mouseMotionListener", null);
        setField(term674808, term674808.getClass(), "mouseWheelListener", null);
        setField(term674808, term674808.getClass(), "inputMethodListener", null);
        setLongField(term674808, term674808.getClass(), "eventMask", 0L);
        setField(term674808, term674808.getClass(), "changeSupport", null);
        setField(term674808, term674808.getClass(), "objectLock", null);
        setBooleanField(term674808, term674808.getClass(), "isPacked", false);
        setIntField(term674808, term674808.getClass(), "boundsOp", 0);
        setField(term674808, term674808.getClass(), "compoundShape", null);
        setField(term674808, term674808.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674808, term674808.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674808, term674808.getClass(), "backgroundEraseDisabled", false);
        setField(term674808, term674808.getClass(), "eventCache", null);
        setBooleanField(term674808, term674808.getClass(), "coalescingEnabled", false);
        setBooleanField(term674808, term674808.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674808, term674808.getClass(), "componentSerializedDataVersion", 0);
        setField(term674808, term674808.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanels", argTypes, term674808, args);
    }

};


