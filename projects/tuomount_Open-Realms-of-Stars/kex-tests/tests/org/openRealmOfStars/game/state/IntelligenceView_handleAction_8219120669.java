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

public class IntelligenceView_handleAction_8219120669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697437;

    public IntelligenceView_handleAction_8219120669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697437 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term697437, term697437.getClass(), "player", null);
        setField(term697437, term697437.getClass(), "fakeMilitarySlider", null);
        setField(term697437, term697437.getClass(), "fakeMilitaryText", null);
        setIntField(term697437, term697437.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term697437, term697437.getClass(), "isAlignmentXSet", false);
        setFloatField(term697437, term697437.getClass(), "alignmentX", 0.0F);
        setBooleanField(term697437, term697437.getClass(), "isAlignmentYSet", false);
        setFloatField(term697437, term697437.getClass(), "alignmentY", 0.0F);
        setField(term697437, term697437.getClass(), "ui", null);
        setField(term697437, term697437.getClass(), "listenerList", null);
        setField(term697437, term697437.getClass(), "clientProperties", null);
        setField(term697437, term697437.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term697437, term697437.getClass(), "autoscrolls", false);
        setField(term697437, term697437.getClass(), "border", null);
        setIntField(term697437, term697437.getClass(), "flags", 0);
        setField(term697437, term697437.getClass(), "inputVerifier", null);
        setBooleanField(term697437, term697437.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term697437, term697437.getClass(), "paintingChild", null);
        setField(term697437, term697437.getClass(), "popupMenu", null);
        setField(term697437, term697437.getClass(), "revalidateRunnableScheduled", null);
        setField(term697437, term697437.getClass(), "focusInputMap", null);
        setField(term697437, term697437.getClass(), "ancestorInputMap", null);
        setField(term697437, term697437.getClass(), "windowInputMap", null);
        setField(term697437, term697437.getClass(), "actionMap", null);
        setField(term697437, term697437.getClass(), "aaHint", null);
        setField(term697437, term697437.getClass(), "lcdRenderingHint", null);
        setField(term697437, term697437.getClass(), "component", null);
        setField(term697437, term697437.getClass(), "layoutMgr", null);
        setField(term697437, term697437.getClass(), "dispatcher", null);
        setField(term697437, term697437.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term697437, term697437.getClass(), "focusCycleRoot", false);
        setBooleanField(term697437, term697437.getClass(), "focusTraversalPolicyProvider", false);
        setField(term697437, term697437.getClass(), "printingThreads", null);
        setBooleanField(term697437, term697437.getClass(), "printing", false);
        setField(term697437, term697437.getClass(), "containerListener", null);
        setIntField(term697437, term697437.getClass(), "listeningChildren", 0);
        setIntField(term697437, term697437.getClass(), "listeningBoundsChildren", 0);
        setIntField(term697437, term697437.getClass(), "descendantsCount", 0);
        setField(term697437, term697437.getClass(), "preserveBackgroundColor", null);
        setIntField(term697437, term697437.getClass(), "numOfHWComponents", 0);
        setIntField(term697437, term697437.getClass(), "numOfLWComponents", 0);
        setField(term697437, term697437.getClass(), "modalComp", null);
        setField(term697437, term697437.getClass(), "modalAppContext", null);
        setIntField(term697437, term697437.getClass(), "containerSerializedDataVersion", 0);
        setField(term697437, term697437.getClass(), "peer", null);
        setField(term697437, term697437.getClass(), "parent", null);
        setField(term697437, term697437.getClass(), "appContext", null);
        setIntField(term697437, term697437.getClass(), "x", 0);
        setIntField(term697437, term697437.getClass(), "y", 0);
        setIntField(term697437, term697437.getClass(), "width", 0);
        setIntField(term697437, term697437.getClass(), "height", 0);
        setField(term697437, term697437.getClass(), "foreground", null);
        setField(term697437, term697437.getClass(), "background", null);
        setField(term697437, term697437.getClass(), "font", null);
        setField(term697437, term697437.getClass(), "peerFont", null);
        setField(term697437, term697437.getClass(), "cursor", null);
        setField(term697437, term697437.getClass(), "locale", null);
        setField(term697437, term697437.getClass(), "graphicsConfig", null);
        setField(term697437, term697437.getClass(), "bufferStrategy", null);
        setBooleanField(term697437, term697437.getClass(), "ignoreRepaint", false);
        setBooleanField(term697437, term697437.getClass(), "visible", false);
        setBooleanField(term697437, term697437.getClass(), "enabled", false);
        setBooleanField(term697437, term697437.getClass(), "valid", false);
        setField(term697437, term697437.getClass(), "dropTarget", null);
        setField(term697437, term697437.getClass(), "popups", null);
        setField(term697437, term697437.getClass(), "name", null);
        setBooleanField(term697437, term697437.getClass(), "nameExplicitlySet", false);
        setBooleanField(term697437, term697437.getClass(), "focusable", false);
        setIntField(term697437, term697437.getClass(), "isFocusTraversableOverridden", 0);
        setField(term697437, term697437.getClass(), "focusTraversalKeys", null);
        setBooleanField(term697437, term697437.getClass(), "focusTraversalKeysEnabled", false);
        setField(term697437, term697437.getClass(), "acc", null);
        setField(term697437, term697437.getClass(), "minSize", null);
        setBooleanField(term697437, term697437.getClass(), "minSizeSet", false);
        setField(term697437, term697437.getClass(), "prefSize", null);
        setBooleanField(term697437, term697437.getClass(), "prefSizeSet", false);
        setField(term697437, term697437.getClass(), "maxSize", null);
        setBooleanField(term697437, term697437.getClass(), "maxSizeSet", false);
        setField(term697437, term697437.getClass(), "componentOrientation", null);
        setBooleanField(term697437, term697437.getClass(), "newEventsOnly", false);
        setField(term697437, term697437.getClass(), "componentListener", null);
        setField(term697437, term697437.getClass(), "focusListener", null);
        setField(term697437, term697437.getClass(), "hierarchyListener", null);
        setField(term697437, term697437.getClass(), "hierarchyBoundsListener", null);
        setField(term697437, term697437.getClass(), "keyListener", null);
        setField(term697437, term697437.getClass(), "mouseListener", null);
        setField(term697437, term697437.getClass(), "mouseMotionListener", null);
        setField(term697437, term697437.getClass(), "mouseWheelListener", null);
        setField(term697437, term697437.getClass(), "inputMethodListener", null);
        setLongField(term697437, term697437.getClass(), "eventMask", 0L);
        setField(term697437, term697437.getClass(), "changeSupport", null);
        setField(term697437, term697437.getClass(), "objectLock", null);
        setBooleanField(term697437, term697437.getClass(), "isPacked", false);
        setIntField(term697437, term697437.getClass(), "boundsOp", 0);
        setField(term697437, term697437.getClass(), "compoundShape", null);
        setField(term697437, term697437.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term697437, term697437.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term697437, term697437.getClass(), "backgroundEraseDisabled", false);
        setField(term697437, term697437.getClass(), "eventCache", null);
        setBooleanField(term697437, term697437.getClass(), "coalescingEnabled", false);
        setBooleanField(term697437, term697437.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term697437, term697437.getClass(), "componentSerializedDataVersion", 0);
        setField(term697437, term697437.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term697437, args);
    }

};


