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

public class IntelligenceView_handleAction_8219120668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648450;

    public IntelligenceView_handleAction_8219120668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648450 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term648450, term648450.getClass(), "player", null);
        setField(term648450, term648450.getClass(), "fakeMilitarySlider", null);
        setField(term648450, term648450.getClass(), "fakeMilitaryText", null);
        setIntField(term648450, term648450.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term648450, term648450.getClass(), "isAlignmentXSet", false);
        setFloatField(term648450, term648450.getClass(), "alignmentX", 0.0F);
        setBooleanField(term648450, term648450.getClass(), "isAlignmentYSet", false);
        setFloatField(term648450, term648450.getClass(), "alignmentY", 0.0F);
        setField(term648450, term648450.getClass(), "ui", null);
        setField(term648450, term648450.getClass(), "listenerList", null);
        setField(term648450, term648450.getClass(), "clientProperties", null);
        setField(term648450, term648450.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term648450, term648450.getClass(), "autoscrolls", false);
        setField(term648450, term648450.getClass(), "border", null);
        setIntField(term648450, term648450.getClass(), "flags", 0);
        setField(term648450, term648450.getClass(), "inputVerifier", null);
        setBooleanField(term648450, term648450.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term648450, term648450.getClass(), "paintingChild", null);
        setField(term648450, term648450.getClass(), "popupMenu", null);
        setField(term648450, term648450.getClass(), "revalidateRunnableScheduled", null);
        setField(term648450, term648450.getClass(), "focusInputMap", null);
        setField(term648450, term648450.getClass(), "ancestorInputMap", null);
        setField(term648450, term648450.getClass(), "windowInputMap", null);
        setField(term648450, term648450.getClass(), "actionMap", null);
        setField(term648450, term648450.getClass(), "aaHint", null);
        setField(term648450, term648450.getClass(), "lcdRenderingHint", null);
        setField(term648450, term648450.getClass(), "component", null);
        setField(term648450, term648450.getClass(), "layoutMgr", null);
        setField(term648450, term648450.getClass(), "dispatcher", null);
        setField(term648450, term648450.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term648450, term648450.getClass(), "focusCycleRoot", false);
        setBooleanField(term648450, term648450.getClass(), "focusTraversalPolicyProvider", false);
        setField(term648450, term648450.getClass(), "printingThreads", null);
        setBooleanField(term648450, term648450.getClass(), "printing", false);
        setField(term648450, term648450.getClass(), "containerListener", null);
        setIntField(term648450, term648450.getClass(), "listeningChildren", 0);
        setIntField(term648450, term648450.getClass(), "listeningBoundsChildren", 0);
        setIntField(term648450, term648450.getClass(), "descendantsCount", 0);
        setField(term648450, term648450.getClass(), "preserveBackgroundColor", null);
        setIntField(term648450, term648450.getClass(), "numOfHWComponents", 0);
        setIntField(term648450, term648450.getClass(), "numOfLWComponents", 0);
        setField(term648450, term648450.getClass(), "modalComp", null);
        setField(term648450, term648450.getClass(), "modalAppContext", null);
        setIntField(term648450, term648450.getClass(), "containerSerializedDataVersion", 0);
        setField(term648450, term648450.getClass(), "peer", null);
        setField(term648450, term648450.getClass(), "parent", null);
        setField(term648450, term648450.getClass(), "appContext", null);
        setIntField(term648450, term648450.getClass(), "x", 0);
        setIntField(term648450, term648450.getClass(), "y", 0);
        setIntField(term648450, term648450.getClass(), "width", 0);
        setIntField(term648450, term648450.getClass(), "height", 0);
        setField(term648450, term648450.getClass(), "foreground", null);
        setField(term648450, term648450.getClass(), "background", null);
        setField(term648450, term648450.getClass(), "font", null);
        setField(term648450, term648450.getClass(), "peerFont", null);
        setField(term648450, term648450.getClass(), "cursor", null);
        setField(term648450, term648450.getClass(), "locale", null);
        setField(term648450, term648450.getClass(), "graphicsConfig", null);
        setField(term648450, term648450.getClass(), "bufferStrategy", null);
        setBooleanField(term648450, term648450.getClass(), "ignoreRepaint", false);
        setBooleanField(term648450, term648450.getClass(), "visible", false);
        setBooleanField(term648450, term648450.getClass(), "enabled", false);
        setBooleanField(term648450, term648450.getClass(), "valid", false);
        setField(term648450, term648450.getClass(), "dropTarget", null);
        setField(term648450, term648450.getClass(), "popups", null);
        setField(term648450, term648450.getClass(), "name", null);
        setBooleanField(term648450, term648450.getClass(), "nameExplicitlySet", false);
        setBooleanField(term648450, term648450.getClass(), "focusable", false);
        setIntField(term648450, term648450.getClass(), "isFocusTraversableOverridden", 0);
        setField(term648450, term648450.getClass(), "focusTraversalKeys", null);
        setBooleanField(term648450, term648450.getClass(), "focusTraversalKeysEnabled", false);
        setField(term648450, term648450.getClass(), "acc", null);
        setField(term648450, term648450.getClass(), "minSize", null);
        setBooleanField(term648450, term648450.getClass(), "minSizeSet", false);
        setField(term648450, term648450.getClass(), "prefSize", null);
        setBooleanField(term648450, term648450.getClass(), "prefSizeSet", false);
        setField(term648450, term648450.getClass(), "maxSize", null);
        setBooleanField(term648450, term648450.getClass(), "maxSizeSet", false);
        setField(term648450, term648450.getClass(), "componentOrientation", null);
        setBooleanField(term648450, term648450.getClass(), "newEventsOnly", false);
        setField(term648450, term648450.getClass(), "componentListener", null);
        setField(term648450, term648450.getClass(), "focusListener", null);
        setField(term648450, term648450.getClass(), "hierarchyListener", null);
        setField(term648450, term648450.getClass(), "hierarchyBoundsListener", null);
        setField(term648450, term648450.getClass(), "keyListener", null);
        setField(term648450, term648450.getClass(), "mouseListener", null);
        setField(term648450, term648450.getClass(), "mouseMotionListener", null);
        setField(term648450, term648450.getClass(), "mouseWheelListener", null);
        setField(term648450, term648450.getClass(), "inputMethodListener", null);
        setLongField(term648450, term648450.getClass(), "eventMask", 0L);
        setField(term648450, term648450.getClass(), "changeSupport", null);
        setField(term648450, term648450.getClass(), "objectLock", null);
        setBooleanField(term648450, term648450.getClass(), "isPacked", false);
        setIntField(term648450, term648450.getClass(), "boundsOp", 0);
        setField(term648450, term648450.getClass(), "compoundShape", null);
        setField(term648450, term648450.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term648450, term648450.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term648450, term648450.getClass(), "backgroundEraseDisabled", false);
        setField(term648450, term648450.getClass(), "eventCache", null);
        setBooleanField(term648450, term648450.getClass(), "coalescingEnabled", false);
        setBooleanField(term648450, term648450.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term648450, term648450.getClass(), "componentSerializedDataVersion", 0);
        setField(term648450, term648450.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term648450, args);
    }

};


