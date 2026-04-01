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

public class BattleView_isCombatEnded_209508016218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674984;

    public BattleView_isCombatEnded_209508016218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674984 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674984, term674984.getClass(), "mapPanel", null);
        setField(term674984, term674984.getClass(), "combat", null);
        setField(term674984, term674984.getClass(), "map", null);
        setField(term674984, term674984.getClass(), "infoPanel", null);
        setField(term674984, term674984.getClass(), "combatMapMouseListener", null);
        setIntField(term674984, term674984.getClass(), "delayCount", 0);
        setField(term674984, term674984.getClass(), "endButton", null);
        setField(term674984, term674984.getClass(), "textArea", null);
        setField(term674984, term674984.getClass(), "overloadInfo", null);
        setField(term674984, term674984.getClass(), "logArea", null);
        setField(term674984, term674984.getClass(), "textLogger", null);
        setIntField(term674984, term674984.getClass(), "loopCount", 0);
        setIntField(term674984, term674984.getClass(), "timerCount", 0);
        setField(term674984, term674984.getClass(), "autoCombatEnabled", null);
        setField(term674984, term674984.getClass(), "fastAutoCombat", null);
        setBooleanField(term674984, term674984.getClass(), "isAlignmentXSet", false);
        setFloatField(term674984, term674984.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674984, term674984.getClass(), "isAlignmentYSet", false);
        setFloatField(term674984, term674984.getClass(), "alignmentY", 0.0F);
        setField(term674984, term674984.getClass(), "ui", null);
        setField(term674984, term674984.getClass(), "listenerList", null);
        setField(term674984, term674984.getClass(), "clientProperties", null);
        setField(term674984, term674984.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674984, term674984.getClass(), "autoscrolls", false);
        setField(term674984, term674984.getClass(), "border", null);
        setIntField(term674984, term674984.getClass(), "flags", 0);
        setField(term674984, term674984.getClass(), "inputVerifier", null);
        setBooleanField(term674984, term674984.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674984, term674984.getClass(), "paintingChild", null);
        setField(term674984, term674984.getClass(), "popupMenu", null);
        setField(term674984, term674984.getClass(), "revalidateRunnableScheduled", null);
        setField(term674984, term674984.getClass(), "focusInputMap", null);
        setField(term674984, term674984.getClass(), "ancestorInputMap", null);
        setField(term674984, term674984.getClass(), "windowInputMap", null);
        setField(term674984, term674984.getClass(), "actionMap", null);
        setField(term674984, term674984.getClass(), "aaHint", null);
        setField(term674984, term674984.getClass(), "lcdRenderingHint", null);
        setField(term674984, term674984.getClass(), "component", null);
        setField(term674984, term674984.getClass(), "layoutMgr", null);
        setField(term674984, term674984.getClass(), "dispatcher", null);
        setField(term674984, term674984.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674984, term674984.getClass(), "focusCycleRoot", false);
        setBooleanField(term674984, term674984.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674984, term674984.getClass(), "printingThreads", null);
        setBooleanField(term674984, term674984.getClass(), "printing", false);
        setField(term674984, term674984.getClass(), "containerListener", null);
        setIntField(term674984, term674984.getClass(), "listeningChildren", 0);
        setIntField(term674984, term674984.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674984, term674984.getClass(), "descendantsCount", 0);
        setField(term674984, term674984.getClass(), "preserveBackgroundColor", null);
        setIntField(term674984, term674984.getClass(), "numOfHWComponents", 0);
        setIntField(term674984, term674984.getClass(), "numOfLWComponents", 0);
        setField(term674984, term674984.getClass(), "modalComp", null);
        setField(term674984, term674984.getClass(), "modalAppContext", null);
        setIntField(term674984, term674984.getClass(), "containerSerializedDataVersion", 0);
        setField(term674984, term674984.getClass(), "peer", null);
        setField(term674984, term674984.getClass(), "parent", null);
        setField(term674984, term674984.getClass(), "appContext", null);
        setIntField(term674984, term674984.getClass(), "x", 0);
        setIntField(term674984, term674984.getClass(), "y", 0);
        setIntField(term674984, term674984.getClass(), "width", 0);
        setIntField(term674984, term674984.getClass(), "height", 0);
        setField(term674984, term674984.getClass(), "foreground", null);
        setField(term674984, term674984.getClass(), "background", null);
        setField(term674984, term674984.getClass(), "font", null);
        setField(term674984, term674984.getClass(), "peerFont", null);
        setField(term674984, term674984.getClass(), "cursor", null);
        setField(term674984, term674984.getClass(), "locale", null);
        setField(term674984, term674984.getClass(), "graphicsConfig", null);
        setField(term674984, term674984.getClass(), "bufferStrategy", null);
        setBooleanField(term674984, term674984.getClass(), "ignoreRepaint", false);
        setBooleanField(term674984, term674984.getClass(), "visible", false);
        setBooleanField(term674984, term674984.getClass(), "enabled", false);
        setBooleanField(term674984, term674984.getClass(), "valid", false);
        setField(term674984, term674984.getClass(), "dropTarget", null);
        setField(term674984, term674984.getClass(), "popups", null);
        setField(term674984, term674984.getClass(), "name", null);
        setBooleanField(term674984, term674984.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674984, term674984.getClass(), "focusable", false);
        setIntField(term674984, term674984.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674984, term674984.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674984, term674984.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674984, term674984.getClass(), "acc", null);
        setField(term674984, term674984.getClass(), "minSize", null);
        setBooleanField(term674984, term674984.getClass(), "minSizeSet", false);
        setField(term674984, term674984.getClass(), "prefSize", null);
        setBooleanField(term674984, term674984.getClass(), "prefSizeSet", false);
        setField(term674984, term674984.getClass(), "maxSize", null);
        setBooleanField(term674984, term674984.getClass(), "maxSizeSet", false);
        setField(term674984, term674984.getClass(), "componentOrientation", null);
        setBooleanField(term674984, term674984.getClass(), "newEventsOnly", false);
        setField(term674984, term674984.getClass(), "componentListener", null);
        setField(term674984, term674984.getClass(), "focusListener", null);
        setField(term674984, term674984.getClass(), "hierarchyListener", null);
        setField(term674984, term674984.getClass(), "hierarchyBoundsListener", null);
        setField(term674984, term674984.getClass(), "keyListener", null);
        setField(term674984, term674984.getClass(), "mouseListener", null);
        setField(term674984, term674984.getClass(), "mouseMotionListener", null);
        setField(term674984, term674984.getClass(), "mouseWheelListener", null);
        setField(term674984, term674984.getClass(), "inputMethodListener", null);
        setLongField(term674984, term674984.getClass(), "eventMask", 0L);
        setField(term674984, term674984.getClass(), "changeSupport", null);
        setField(term674984, term674984.getClass(), "objectLock", null);
        setBooleanField(term674984, term674984.getClass(), "isPacked", false);
        setIntField(term674984, term674984.getClass(), "boundsOp", 0);
        setField(term674984, term674984.getClass(), "compoundShape", null);
        setField(term674984, term674984.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674984, term674984.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674984, term674984.getClass(), "backgroundEraseDisabled", false);
        setField(term674984, term674984.getClass(), "eventCache", null);
        setBooleanField(term674984, term674984.getClass(), "coalescingEnabled", false);
        setBooleanField(term674984, term674984.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674984, term674984.getClass(), "componentSerializedDataVersion", 0);
        setField(term674984, term674984.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCombatEnded", argTypes, term674984, args);
    }

};


