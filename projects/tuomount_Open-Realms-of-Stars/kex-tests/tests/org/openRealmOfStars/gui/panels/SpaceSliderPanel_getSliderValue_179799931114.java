package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpaceSliderPanel_getSliderValue_179799931114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10096;

    public SpaceSliderPanel_getSliderValue_179799931114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10096 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10096, term10096.getClass(), "btnMinus", null);
        setField(term10096, term10096.getClass(), "btnPlus", null);
        setField(term10096, term10096.getClass(), "label", null);
        setField(term10096, term10096.getClass(), "slider", null);
        setBooleanField(term10096, term10096.getClass(), "isAlignmentXSet", false);
        setFloatField(term10096, term10096.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10096, term10096.getClass(), "isAlignmentYSet", false);
        setFloatField(term10096, term10096.getClass(), "alignmentY", 0.0F);
        setField(term10096, term10096.getClass(), "ui", null);
        setField(term10096, term10096.getClass(), "listenerList", null);
        setField(term10096, term10096.getClass(), "clientProperties", null);
        setField(term10096, term10096.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10096, term10096.getClass(), "autoscrolls", false);
        setField(term10096, term10096.getClass(), "border", null);
        setIntField(term10096, term10096.getClass(), "flags", 0);
        setField(term10096, term10096.getClass(), "inputVerifier", null);
        setBooleanField(term10096, term10096.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10096, term10096.getClass(), "paintingChild", null);
        setField(term10096, term10096.getClass(), "popupMenu", null);
        setField(term10096, term10096.getClass(), "revalidateRunnableScheduled", null);
        setField(term10096, term10096.getClass(), "focusInputMap", null);
        setField(term10096, term10096.getClass(), "ancestorInputMap", null);
        setField(term10096, term10096.getClass(), "windowInputMap", null);
        setField(term10096, term10096.getClass(), "actionMap", null);
        setField(term10096, term10096.getClass(), "aaHint", null);
        setField(term10096, term10096.getClass(), "lcdRenderingHint", null);
        setField(term10096, term10096.getClass(), "component", null);
        setField(term10096, term10096.getClass(), "layoutMgr", null);
        setField(term10096, term10096.getClass(), "dispatcher", null);
        setField(term10096, term10096.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10096, term10096.getClass(), "focusCycleRoot", false);
        setBooleanField(term10096, term10096.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10096, term10096.getClass(), "printingThreads", null);
        setBooleanField(term10096, term10096.getClass(), "printing", false);
        setField(term10096, term10096.getClass(), "containerListener", null);
        setIntField(term10096, term10096.getClass(), "listeningChildren", 0);
        setIntField(term10096, term10096.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10096, term10096.getClass(), "descendantsCount", 0);
        setField(term10096, term10096.getClass(), "preserveBackgroundColor", null);
        setIntField(term10096, term10096.getClass(), "numOfHWComponents", 0);
        setIntField(term10096, term10096.getClass(), "numOfLWComponents", 0);
        setField(term10096, term10096.getClass(), "modalComp", null);
        setField(term10096, term10096.getClass(), "modalAppContext", null);
        setIntField(term10096, term10096.getClass(), "containerSerializedDataVersion", 0);
        setField(term10096, term10096.getClass(), "peer", null);
        setField(term10096, term10096.getClass(), "parent", null);
        setField(term10096, term10096.getClass(), "appContext", null);
        setIntField(term10096, term10096.getClass(), "x", 0);
        setIntField(term10096, term10096.getClass(), "y", 0);
        setIntField(term10096, term10096.getClass(), "width", 0);
        setIntField(term10096, term10096.getClass(), "height", 0);
        setField(term10096, term10096.getClass(), "foreground", null);
        setField(term10096, term10096.getClass(), "background", null);
        setField(term10096, term10096.getClass(), "font", null);
        setField(term10096, term10096.getClass(), "peerFont", null);
        setField(term10096, term10096.getClass(), "cursor", null);
        setField(term10096, term10096.getClass(), "locale", null);
        setField(term10096, term10096.getClass(), "graphicsConfig", null);
        setField(term10096, term10096.getClass(), "bufferStrategy", null);
        setBooleanField(term10096, term10096.getClass(), "ignoreRepaint", false);
        setBooleanField(term10096, term10096.getClass(), "visible", false);
        setBooleanField(term10096, term10096.getClass(), "enabled", false);
        setBooleanField(term10096, term10096.getClass(), "valid", false);
        setField(term10096, term10096.getClass(), "dropTarget", null);
        setField(term10096, term10096.getClass(), "popups", null);
        setField(term10096, term10096.getClass(), "name", null);
        setBooleanField(term10096, term10096.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10096, term10096.getClass(), "focusable", false);
        setIntField(term10096, term10096.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10096, term10096.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10096, term10096.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10096, term10096.getClass(), "acc", null);
        setField(term10096, term10096.getClass(), "minSize", null);
        setBooleanField(term10096, term10096.getClass(), "minSizeSet", false);
        setField(term10096, term10096.getClass(), "prefSize", null);
        setBooleanField(term10096, term10096.getClass(), "prefSizeSet", false);
        setField(term10096, term10096.getClass(), "maxSize", null);
        setBooleanField(term10096, term10096.getClass(), "maxSizeSet", false);
        setField(term10096, term10096.getClass(), "componentOrientation", null);
        setBooleanField(term10096, term10096.getClass(), "newEventsOnly", false);
        setField(term10096, term10096.getClass(), "componentListener", null);
        setField(term10096, term10096.getClass(), "focusListener", null);
        setField(term10096, term10096.getClass(), "hierarchyListener", null);
        setField(term10096, term10096.getClass(), "hierarchyBoundsListener", null);
        setField(term10096, term10096.getClass(), "keyListener", null);
        setField(term10096, term10096.getClass(), "mouseListener", null);
        setField(term10096, term10096.getClass(), "mouseMotionListener", null);
        setField(term10096, term10096.getClass(), "mouseWheelListener", null);
        setField(term10096, term10096.getClass(), "inputMethodListener", null);
        setLongField(term10096, term10096.getClass(), "eventMask", 0L);
        setField(term10096, term10096.getClass(), "changeSupport", null);
        setField(term10096, term10096.getClass(), "objectLock", null);
        setBooleanField(term10096, term10096.getClass(), "isPacked", false);
        setIntField(term10096, term10096.getClass(), "boundsOp", 0);
        setField(term10096, term10096.getClass(), "compoundShape", null);
        setField(term10096, term10096.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10096, term10096.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10096, term10096.getClass(), "backgroundEraseDisabled", false);
        setField(term10096, term10096.getClass(), "eventCache", null);
        setBooleanField(term10096, term10096.getClass(), "coalescingEnabled", false);
        setBooleanField(term10096, term10096.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10096, term10096.getClass(), "componentSerializedDataVersion", 0);
        setField(term10096, term10096.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderValue", argTypes, term10096, args);
    }

};


