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

public class IntelligenceView_getPlayer_7150801723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682504;

    public IntelligenceView_getPlayer_7150801723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term682504 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term682504, term682504.getClass(), "player", null);
        setField(term682504, term682504.getClass(), "fakeMilitarySlider", null);
        setField(term682504, term682504.getClass(), "fakeMilitaryText", null);
        setIntField(term682504, term682504.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term682504, term682504.getClass(), "isAlignmentXSet", false);
        setFloatField(term682504, term682504.getClass(), "alignmentX", 0.0F);
        setBooleanField(term682504, term682504.getClass(), "isAlignmentYSet", false);
        setFloatField(term682504, term682504.getClass(), "alignmentY", 0.0F);
        setField(term682504, term682504.getClass(), "ui", null);
        setField(term682504, term682504.getClass(), "listenerList", null);
        setField(term682504, term682504.getClass(), "clientProperties", null);
        setField(term682504, term682504.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term682504, term682504.getClass(), "autoscrolls", false);
        setField(term682504, term682504.getClass(), "border", null);
        setIntField(term682504, term682504.getClass(), "flags", 0);
        setField(term682504, term682504.getClass(), "inputVerifier", null);
        setBooleanField(term682504, term682504.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term682504, term682504.getClass(), "paintingChild", null);
        setField(term682504, term682504.getClass(), "popupMenu", null);
        setField(term682504, term682504.getClass(), "revalidateRunnableScheduled", null);
        setField(term682504, term682504.getClass(), "focusInputMap", null);
        setField(term682504, term682504.getClass(), "ancestorInputMap", null);
        setField(term682504, term682504.getClass(), "windowInputMap", null);
        setField(term682504, term682504.getClass(), "actionMap", null);
        setField(term682504, term682504.getClass(), "aaHint", null);
        setField(term682504, term682504.getClass(), "lcdRenderingHint", null);
        setField(term682504, term682504.getClass(), "component", null);
        setField(term682504, term682504.getClass(), "layoutMgr", null);
        setField(term682504, term682504.getClass(), "dispatcher", null);
        setField(term682504, term682504.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term682504, term682504.getClass(), "focusCycleRoot", false);
        setBooleanField(term682504, term682504.getClass(), "focusTraversalPolicyProvider", false);
        setField(term682504, term682504.getClass(), "printingThreads", null);
        setBooleanField(term682504, term682504.getClass(), "printing", false);
        setField(term682504, term682504.getClass(), "containerListener", null);
        setIntField(term682504, term682504.getClass(), "listeningChildren", 0);
        setIntField(term682504, term682504.getClass(), "listeningBoundsChildren", 0);
        setIntField(term682504, term682504.getClass(), "descendantsCount", 0);
        setField(term682504, term682504.getClass(), "preserveBackgroundColor", null);
        setIntField(term682504, term682504.getClass(), "numOfHWComponents", 0);
        setIntField(term682504, term682504.getClass(), "numOfLWComponents", 0);
        setField(term682504, term682504.getClass(), "modalComp", null);
        setField(term682504, term682504.getClass(), "modalAppContext", null);
        setIntField(term682504, term682504.getClass(), "containerSerializedDataVersion", 0);
        setField(term682504, term682504.getClass(), "peer", null);
        setField(term682504, term682504.getClass(), "parent", null);
        setField(term682504, term682504.getClass(), "appContext", null);
        setIntField(term682504, term682504.getClass(), "x", 0);
        setIntField(term682504, term682504.getClass(), "y", 0);
        setIntField(term682504, term682504.getClass(), "width", 0);
        setIntField(term682504, term682504.getClass(), "height", 0);
        setField(term682504, term682504.getClass(), "foreground", null);
        setField(term682504, term682504.getClass(), "background", null);
        setField(term682504, term682504.getClass(), "font", null);
        setField(term682504, term682504.getClass(), "peerFont", null);
        setField(term682504, term682504.getClass(), "cursor", null);
        setField(term682504, term682504.getClass(), "locale", null);
        setField(term682504, term682504.getClass(), "graphicsConfig", null);
        setField(term682504, term682504.getClass(), "bufferStrategy", null);
        setBooleanField(term682504, term682504.getClass(), "ignoreRepaint", false);
        setBooleanField(term682504, term682504.getClass(), "visible", false);
        setBooleanField(term682504, term682504.getClass(), "enabled", false);
        setBooleanField(term682504, term682504.getClass(), "valid", false);
        setField(term682504, term682504.getClass(), "dropTarget", null);
        setField(term682504, term682504.getClass(), "popups", null);
        setField(term682504, term682504.getClass(), "name", null);
        setBooleanField(term682504, term682504.getClass(), "nameExplicitlySet", false);
        setBooleanField(term682504, term682504.getClass(), "focusable", false);
        setIntField(term682504, term682504.getClass(), "isFocusTraversableOverridden", 0);
        setField(term682504, term682504.getClass(), "focusTraversalKeys", null);
        setBooleanField(term682504, term682504.getClass(), "focusTraversalKeysEnabled", false);
        setField(term682504, term682504.getClass(), "acc", null);
        setField(term682504, term682504.getClass(), "minSize", null);
        setBooleanField(term682504, term682504.getClass(), "minSizeSet", false);
        setField(term682504, term682504.getClass(), "prefSize", null);
        setBooleanField(term682504, term682504.getClass(), "prefSizeSet", false);
        setField(term682504, term682504.getClass(), "maxSize", null);
        setBooleanField(term682504, term682504.getClass(), "maxSizeSet", false);
        setField(term682504, term682504.getClass(), "componentOrientation", null);
        setBooleanField(term682504, term682504.getClass(), "newEventsOnly", false);
        setField(term682504, term682504.getClass(), "componentListener", null);
        setField(term682504, term682504.getClass(), "focusListener", null);
        setField(term682504, term682504.getClass(), "hierarchyListener", null);
        setField(term682504, term682504.getClass(), "hierarchyBoundsListener", null);
        setField(term682504, term682504.getClass(), "keyListener", null);
        setField(term682504, term682504.getClass(), "mouseListener", null);
        setField(term682504, term682504.getClass(), "mouseMotionListener", null);
        setField(term682504, term682504.getClass(), "mouseWheelListener", null);
        setField(term682504, term682504.getClass(), "inputMethodListener", null);
        setLongField(term682504, term682504.getClass(), "eventMask", 0L);
        setField(term682504, term682504.getClass(), "changeSupport", null);
        setField(term682504, term682504.getClass(), "objectLock", null);
        setBooleanField(term682504, term682504.getClass(), "isPacked", false);
        setIntField(term682504, term682504.getClass(), "boundsOp", 0);
        setField(term682504, term682504.getClass(), "compoundShape", null);
        setField(term682504, term682504.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term682504, term682504.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term682504, term682504.getClass(), "backgroundEraseDisabled", false);
        setField(term682504, term682504.getClass(), "eventCache", null);
        setBooleanField(term682504, term682504.getClass(), "coalescingEnabled", false);
        setBooleanField(term682504, term682504.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term682504, term682504.getClass(), "componentSerializedDataVersion", 0);
        setField(term682504, term682504.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer", argTypes, term682504, args);
    }

};


