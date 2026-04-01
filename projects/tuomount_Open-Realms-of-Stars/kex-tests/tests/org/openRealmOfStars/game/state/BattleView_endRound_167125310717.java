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

public class BattleView_endRound_167125310717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674940;

    public BattleView_endRound_167125310717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674940 = newInstance(Class.forName("org.openRealmOfStars.game.state.BattleView"));
        setField(term674940, term674940.getClass(), "mapPanel", null);
        setField(term674940, term674940.getClass(), "combat", null);
        setField(term674940, term674940.getClass(), "map", null);
        setField(term674940, term674940.getClass(), "infoPanel", null);
        setField(term674940, term674940.getClass(), "combatMapMouseListener", null);
        setIntField(term674940, term674940.getClass(), "delayCount", 0);
        setField(term674940, term674940.getClass(), "endButton", null);
        setField(term674940, term674940.getClass(), "textArea", null);
        setField(term674940, term674940.getClass(), "overloadInfo", null);
        setField(term674940, term674940.getClass(), "logArea", null);
        setField(term674940, term674940.getClass(), "textLogger", null);
        setIntField(term674940, term674940.getClass(), "loopCount", 0);
        setIntField(term674940, term674940.getClass(), "timerCount", 0);
        setField(term674940, term674940.getClass(), "autoCombatEnabled", null);
        setField(term674940, term674940.getClass(), "fastAutoCombat", null);
        setBooleanField(term674940, term674940.getClass(), "isAlignmentXSet", false);
        setFloatField(term674940, term674940.getClass(), "alignmentX", 0.0F);
        setBooleanField(term674940, term674940.getClass(), "isAlignmentYSet", false);
        setFloatField(term674940, term674940.getClass(), "alignmentY", 0.0F);
        setField(term674940, term674940.getClass(), "ui", null);
        setField(term674940, term674940.getClass(), "listenerList", null);
        setField(term674940, term674940.getClass(), "clientProperties", null);
        setField(term674940, term674940.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term674940, term674940.getClass(), "autoscrolls", false);
        setField(term674940, term674940.getClass(), "border", null);
        setIntField(term674940, term674940.getClass(), "flags", 0);
        setField(term674940, term674940.getClass(), "inputVerifier", null);
        setBooleanField(term674940, term674940.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term674940, term674940.getClass(), "paintingChild", null);
        setField(term674940, term674940.getClass(), "popupMenu", null);
        setField(term674940, term674940.getClass(), "revalidateRunnableScheduled", null);
        setField(term674940, term674940.getClass(), "focusInputMap", null);
        setField(term674940, term674940.getClass(), "ancestorInputMap", null);
        setField(term674940, term674940.getClass(), "windowInputMap", null);
        setField(term674940, term674940.getClass(), "actionMap", null);
        setField(term674940, term674940.getClass(), "aaHint", null);
        setField(term674940, term674940.getClass(), "lcdRenderingHint", null);
        setField(term674940, term674940.getClass(), "component", null);
        setField(term674940, term674940.getClass(), "layoutMgr", null);
        setField(term674940, term674940.getClass(), "dispatcher", null);
        setField(term674940, term674940.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term674940, term674940.getClass(), "focusCycleRoot", false);
        setBooleanField(term674940, term674940.getClass(), "focusTraversalPolicyProvider", false);
        setField(term674940, term674940.getClass(), "printingThreads", null);
        setBooleanField(term674940, term674940.getClass(), "printing", false);
        setField(term674940, term674940.getClass(), "containerListener", null);
        setIntField(term674940, term674940.getClass(), "listeningChildren", 0);
        setIntField(term674940, term674940.getClass(), "listeningBoundsChildren", 0);
        setIntField(term674940, term674940.getClass(), "descendantsCount", 0);
        setField(term674940, term674940.getClass(), "preserveBackgroundColor", null);
        setIntField(term674940, term674940.getClass(), "numOfHWComponents", 0);
        setIntField(term674940, term674940.getClass(), "numOfLWComponents", 0);
        setField(term674940, term674940.getClass(), "modalComp", null);
        setField(term674940, term674940.getClass(), "modalAppContext", null);
        setIntField(term674940, term674940.getClass(), "containerSerializedDataVersion", 0);
        setField(term674940, term674940.getClass(), "peer", null);
        setField(term674940, term674940.getClass(), "parent", null);
        setField(term674940, term674940.getClass(), "appContext", null);
        setIntField(term674940, term674940.getClass(), "x", 0);
        setIntField(term674940, term674940.getClass(), "y", 0);
        setIntField(term674940, term674940.getClass(), "width", 0);
        setIntField(term674940, term674940.getClass(), "height", 0);
        setField(term674940, term674940.getClass(), "foreground", null);
        setField(term674940, term674940.getClass(), "background", null);
        setField(term674940, term674940.getClass(), "font", null);
        setField(term674940, term674940.getClass(), "peerFont", null);
        setField(term674940, term674940.getClass(), "cursor", null);
        setField(term674940, term674940.getClass(), "locale", null);
        setField(term674940, term674940.getClass(), "graphicsConfig", null);
        setField(term674940, term674940.getClass(), "bufferStrategy", null);
        setBooleanField(term674940, term674940.getClass(), "ignoreRepaint", false);
        setBooleanField(term674940, term674940.getClass(), "visible", false);
        setBooleanField(term674940, term674940.getClass(), "enabled", false);
        setBooleanField(term674940, term674940.getClass(), "valid", false);
        setField(term674940, term674940.getClass(), "dropTarget", null);
        setField(term674940, term674940.getClass(), "popups", null);
        setField(term674940, term674940.getClass(), "name", null);
        setBooleanField(term674940, term674940.getClass(), "nameExplicitlySet", false);
        setBooleanField(term674940, term674940.getClass(), "focusable", false);
        setIntField(term674940, term674940.getClass(), "isFocusTraversableOverridden", 0);
        setField(term674940, term674940.getClass(), "focusTraversalKeys", null);
        setBooleanField(term674940, term674940.getClass(), "focusTraversalKeysEnabled", false);
        setField(term674940, term674940.getClass(), "acc", null);
        setField(term674940, term674940.getClass(), "minSize", null);
        setBooleanField(term674940, term674940.getClass(), "minSizeSet", false);
        setField(term674940, term674940.getClass(), "prefSize", null);
        setBooleanField(term674940, term674940.getClass(), "prefSizeSet", false);
        setField(term674940, term674940.getClass(), "maxSize", null);
        setBooleanField(term674940, term674940.getClass(), "maxSizeSet", false);
        setField(term674940, term674940.getClass(), "componentOrientation", null);
        setBooleanField(term674940, term674940.getClass(), "newEventsOnly", false);
        setField(term674940, term674940.getClass(), "componentListener", null);
        setField(term674940, term674940.getClass(), "focusListener", null);
        setField(term674940, term674940.getClass(), "hierarchyListener", null);
        setField(term674940, term674940.getClass(), "hierarchyBoundsListener", null);
        setField(term674940, term674940.getClass(), "keyListener", null);
        setField(term674940, term674940.getClass(), "mouseListener", null);
        setField(term674940, term674940.getClass(), "mouseMotionListener", null);
        setField(term674940, term674940.getClass(), "mouseWheelListener", null);
        setField(term674940, term674940.getClass(), "inputMethodListener", null);
        setLongField(term674940, term674940.getClass(), "eventMask", 0L);
        setField(term674940, term674940.getClass(), "changeSupport", null);
        setField(term674940, term674940.getClass(), "objectLock", null);
        setBooleanField(term674940, term674940.getClass(), "isPacked", false);
        setIntField(term674940, term674940.getClass(), "boundsOp", 0);
        setField(term674940, term674940.getClass(), "compoundShape", null);
        setField(term674940, term674940.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term674940, term674940.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term674940, term674940.getClass(), "backgroundEraseDisabled", false);
        setField(term674940, term674940.getClass(), "eventCache", null);
        setBooleanField(term674940, term674940.getClass(), "coalescingEnabled", false);
        setBooleanField(term674940, term674940.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term674940, term674940.getClass(), "componentSerializedDataVersion", 0);
        setField(term674940, term674940.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.BattleView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "endRound", argTypes, term674940, args);
    }

};


