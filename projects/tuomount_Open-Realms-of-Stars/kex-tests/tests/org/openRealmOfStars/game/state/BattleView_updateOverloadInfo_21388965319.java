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

public class BattleView_updateOverloadInfo_21388965319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675028;

    public BattleView_updateOverloadInfo_21388965319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675028 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term675028, term675028.getClass(), "mapPanel", null);
        setField(term675028, term675028.getClass(), "combat", null);
        setField(term675028, term675028.getClass(), "map", null);
        setField(term675028, term675028.getClass(), "infoPanel", null);
        setField(term675028, term675028.getClass(), "combatMapMouseListener", null);
        setIntField(term675028, term675028.getClass(), "delayCount", 0);
        setField(term675028, term675028.getClass(), "endButton", null);
        setField(term675028, term675028.getClass(), "textArea", null);
        setField(term675028, term675028.getClass(), "overloadInfo", null);
        setField(term675028, term675028.getClass(), "logArea", null);
        setField(term675028, term675028.getClass(), "textLogger", null);
        setIntField(term675028, term675028.getClass(), "loopCount", 0);
        setIntField(term675028, term675028.getClass(), "timerCount", 0);
        setField(term675028, term675028.getClass(), "autoCombatEnabled", null);
        setField(term675028, term675028.getClass(), "fastAutoCombat", null);
        setBooleanField(term675028, term675028.getClass(), "isAlignmentXSet", false);
        setFloatField(term675028, term675028.getClass(), "alignmentX", 0.0F);
        setBooleanField(term675028, term675028.getClass(), "isAlignmentYSet", false);
        setFloatField(term675028, term675028.getClass(), "alignmentY", 0.0F);
        setField(term675028, term675028.getClass(), "ui", null);
        setField(term675028, term675028.getClass(), "listenerList", null);
        setField(term675028, term675028.getClass(), "clientProperties", null);
        setField(term675028, term675028.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term675028, term675028.getClass(), "autoscrolls", false);
        setField(term675028, term675028.getClass(), "border", null);
        setIntField(term675028, term675028.getClass(), "flags", 0);
        setField(term675028, term675028.getClass(), "inputVerifier", null);
        setBooleanField(term675028, term675028.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term675028, term675028.getClass(), "paintingChild", null);
        setField(term675028, term675028.getClass(), "popupMenu", null);
        setField(term675028, term675028.getClass(), "revalidateRunnableScheduled", null);
        setField(term675028, term675028.getClass(), "focusInputMap", null);
        setField(term675028, term675028.getClass(), "ancestorInputMap", null);
        setField(term675028, term675028.getClass(), "windowInputMap", null);
        setField(term675028, term675028.getClass(), "actionMap", null);
        setField(term675028, term675028.getClass(), "aaHint", null);
        setField(term675028, term675028.getClass(), "lcdRenderingHint", null);
        setField(term675028, term675028.getClass(), "component", null);
        setField(term675028, term675028.getClass(), "layoutMgr", null);
        setField(term675028, term675028.getClass(), "dispatcher", null);
        setField(term675028, term675028.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term675028, term675028.getClass(), "focusCycleRoot", false);
        setBooleanField(term675028, term675028.getClass(), "focusTraversalPolicyProvider", false);
        setField(term675028, term675028.getClass(), "printingThreads", null);
        setBooleanField(term675028, term675028.getClass(), "printing", false);
        setField(term675028, term675028.getClass(), "containerListener", null);
        setIntField(term675028, term675028.getClass(), "listeningChildren", 0);
        setIntField(term675028, term675028.getClass(), "listeningBoundsChildren", 0);
        setIntField(term675028, term675028.getClass(), "descendantsCount", 0);
        setField(term675028, term675028.getClass(), "preserveBackgroundColor", null);
        setIntField(term675028, term675028.getClass(), "numOfHWComponents", 0);
        setIntField(term675028, term675028.getClass(), "numOfLWComponents", 0);
        setField(term675028, term675028.getClass(), "modalComp", null);
        setField(term675028, term675028.getClass(), "modalAppContext", null);
        setIntField(term675028, term675028.getClass(), "containerSerializedDataVersion", 0);
        setField(term675028, term675028.getClass(), "peer", null);
        setField(term675028, term675028.getClass(), "parent", null);
        setField(term675028, term675028.getClass(), "appContext", null);
        setIntField(term675028, term675028.getClass(), "x", 0);
        setIntField(term675028, term675028.getClass(), "y", 0);
        setIntField(term675028, term675028.getClass(), "width", 0);
        setIntField(term675028, term675028.getClass(), "height", 0);
        setField(term675028, term675028.getClass(), "foreground", null);
        setField(term675028, term675028.getClass(), "background", null);
        setField(term675028, term675028.getClass(), "font", null);
        setField(term675028, term675028.getClass(), "peerFont", null);
        setField(term675028, term675028.getClass(), "cursor", null);
        setField(term675028, term675028.getClass(), "locale", null);
        setField(term675028, term675028.getClass(), "graphicsConfig", null);
        setField(term675028, term675028.getClass(), "bufferStrategy", null);
        setBooleanField(term675028, term675028.getClass(), "ignoreRepaint", false);
        setBooleanField(term675028, term675028.getClass(), "visible", false);
        setBooleanField(term675028, term675028.getClass(), "enabled", false);
        setBooleanField(term675028, term675028.getClass(), "valid", false);
        setField(term675028, term675028.getClass(), "dropTarget", null);
        setField(term675028, term675028.getClass(), "popups", null);
        setField(term675028, term675028.getClass(), "name", null);
        setBooleanField(term675028, term675028.getClass(), "nameExplicitlySet", false);
        setBooleanField(term675028, term675028.getClass(), "focusable", false);
        setIntField(term675028, term675028.getClass(), "isFocusTraversableOverridden", 0);
        setField(term675028, term675028.getClass(), "focusTraversalKeys", null);
        setBooleanField(term675028, term675028.getClass(), "focusTraversalKeysEnabled", false);
        setField(term675028, term675028.getClass(), "acc", null);
        setField(term675028, term675028.getClass(), "minSize", null);
        setBooleanField(term675028, term675028.getClass(), "minSizeSet", false);
        setField(term675028, term675028.getClass(), "prefSize", null);
        setBooleanField(term675028, term675028.getClass(), "prefSizeSet", false);
        setField(term675028, term675028.getClass(), "maxSize", null);
        setBooleanField(term675028, term675028.getClass(), "maxSizeSet", false);
        setField(term675028, term675028.getClass(), "componentOrientation", null);
        setBooleanField(term675028, term675028.getClass(), "newEventsOnly", false);
        setField(term675028, term675028.getClass(), "componentListener", null);
        setField(term675028, term675028.getClass(), "focusListener", null);
        setField(term675028, term675028.getClass(), "hierarchyListener", null);
        setField(term675028, term675028.getClass(), "hierarchyBoundsListener", null);
        setField(term675028, term675028.getClass(), "keyListener", null);
        setField(term675028, term675028.getClass(), "mouseListener", null);
        setField(term675028, term675028.getClass(), "mouseMotionListener", null);
        setField(term675028, term675028.getClass(), "mouseWheelListener", null);
        setField(term675028, term675028.getClass(), "inputMethodListener", null);
        setLongField(term675028, term675028.getClass(), "eventMask", 0L);
        setField(term675028, term675028.getClass(), "changeSupport", null);
        setField(term675028, term675028.getClass(), "objectLock", null);
        setBooleanField(term675028, term675028.getClass(), "isPacked", false);
        setIntField(term675028, term675028.getClass(), "boundsOp", 0);
        setField(term675028, term675028.getClass(), "compoundShape", null);
        setField(term675028, term675028.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term675028, term675028.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term675028, term675028.getClass(), "backgroundEraseDisabled", false);
        setField(term675028, term675028.getClass(), "eventCache", null);
        setBooleanField(term675028, term675028.getClass(), "coalescingEnabled", false);
        setBooleanField(term675028, term675028.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term675028, term675028.getClass(), "componentSerializedDataVersion", 0);
        setField(term675028, term675028.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateOverloadInfo", argTypes, term675028, args);
    }

};


