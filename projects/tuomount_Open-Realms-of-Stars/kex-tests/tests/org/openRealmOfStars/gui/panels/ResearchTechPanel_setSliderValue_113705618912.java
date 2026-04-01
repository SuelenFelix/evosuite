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
import java.lang.Integer;

public class ResearchTechPanel_setSliderValue_113705618912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134222;
     Object term134263;

    public ResearchTechPanel_setSliderValue_113705618912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134222 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134222, term134222.getClass(), "btnMinus", null);
        setField(term134222, term134222.getClass(), "btnPlus", null);
        setField(term134222, term134222.getClass(), "label", null);
        setField(term134222, term134222.getClass(), "lvlLabel", null);
        setField(term134222, term134222.getClass(), "btnUpgrade", null);
        setField(term134222, term134222.getClass(), "slider", null);
        setBooleanField(term134222, term134222.getClass(), "isAlignmentXSet", false);
        setFloatField(term134222, term134222.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134222, term134222.getClass(), "isAlignmentYSet", false);
        setFloatField(term134222, term134222.getClass(), "alignmentY", 0.0F);
        setField(term134222, term134222.getClass(), "ui", null);
        setField(term134222, term134222.getClass(), "listenerList", null);
        setField(term134222, term134222.getClass(), "clientProperties", null);
        setField(term134222, term134222.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134222, term134222.getClass(), "autoscrolls", false);
        setField(term134222, term134222.getClass(), "border", null);
        setIntField(term134222, term134222.getClass(), "flags", 0);
        setField(term134222, term134222.getClass(), "inputVerifier", null);
        setBooleanField(term134222, term134222.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134222, term134222.getClass(), "paintingChild", null);
        setField(term134222, term134222.getClass(), "popupMenu", null);
        setField(term134222, term134222.getClass(), "revalidateRunnableScheduled", null);
        setField(term134222, term134222.getClass(), "focusInputMap", null);
        setField(term134222, term134222.getClass(), "ancestorInputMap", null);
        setField(term134222, term134222.getClass(), "windowInputMap", null);
        setField(term134222, term134222.getClass(), "actionMap", null);
        setField(term134222, term134222.getClass(), "aaHint", null);
        setField(term134222, term134222.getClass(), "lcdRenderingHint", null);
        setField(term134222, term134222.getClass(), "component", null);
        setField(term134222, term134222.getClass(), "layoutMgr", null);
        setField(term134222, term134222.getClass(), "dispatcher", null);
        setField(term134222, term134222.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134222, term134222.getClass(), "focusCycleRoot", false);
        setBooleanField(term134222, term134222.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134222, term134222.getClass(), "printingThreads", null);
        setBooleanField(term134222, term134222.getClass(), "printing", false);
        setField(term134222, term134222.getClass(), "containerListener", null);
        setIntField(term134222, term134222.getClass(), "listeningChildren", 0);
        setIntField(term134222, term134222.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134222, term134222.getClass(), "descendantsCount", 0);
        setField(term134222, term134222.getClass(), "preserveBackgroundColor", null);
        setIntField(term134222, term134222.getClass(), "numOfHWComponents", 0);
        setIntField(term134222, term134222.getClass(), "numOfLWComponents", 0);
        setField(term134222, term134222.getClass(), "modalComp", null);
        setField(term134222, term134222.getClass(), "modalAppContext", null);
        setIntField(term134222, term134222.getClass(), "containerSerializedDataVersion", 0);
        setField(term134222, term134222.getClass(), "peer", null);
        setField(term134222, term134222.getClass(), "parent", null);
        setField(term134222, term134222.getClass(), "appContext", null);
        setIntField(term134222, term134222.getClass(), "x", 0);
        setIntField(term134222, term134222.getClass(), "y", 0);
        setIntField(term134222, term134222.getClass(), "width", 0);
        setIntField(term134222, term134222.getClass(), "height", 0);
        setField(term134222, term134222.getClass(), "foreground", null);
        setField(term134222, term134222.getClass(), "background", null);
        setField(term134222, term134222.getClass(), "font", null);
        setField(term134222, term134222.getClass(), "peerFont", null);
        setField(term134222, term134222.getClass(), "cursor", null);
        setField(term134222, term134222.getClass(), "locale", null);
        setField(term134222, term134222.getClass(), "graphicsConfig", null);
        setField(term134222, term134222.getClass(), "bufferStrategy", null);
        setBooleanField(term134222, term134222.getClass(), "ignoreRepaint", false);
        setBooleanField(term134222, term134222.getClass(), "visible", false);
        setBooleanField(term134222, term134222.getClass(), "enabled", false);
        setBooleanField(term134222, term134222.getClass(), "valid", false);
        setField(term134222, term134222.getClass(), "dropTarget", null);
        setField(term134222, term134222.getClass(), "popups", null);
        setField(term134222, term134222.getClass(), "name", null);
        setBooleanField(term134222, term134222.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134222, term134222.getClass(), "focusable", false);
        setIntField(term134222, term134222.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134222, term134222.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134222, term134222.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134222, term134222.getClass(), "acc", null);
        setField(term134222, term134222.getClass(), "minSize", null);
        setBooleanField(term134222, term134222.getClass(), "minSizeSet", false);
        setField(term134222, term134222.getClass(), "prefSize", null);
        setBooleanField(term134222, term134222.getClass(), "prefSizeSet", false);
        setField(term134222, term134222.getClass(), "maxSize", null);
        setBooleanField(term134222, term134222.getClass(), "maxSizeSet", false);
        setField(term134222, term134222.getClass(), "componentOrientation", null);
        setBooleanField(term134222, term134222.getClass(), "newEventsOnly", false);
        setField(term134222, term134222.getClass(), "componentListener", null);
        setField(term134222, term134222.getClass(), "focusListener", null);
        setField(term134222, term134222.getClass(), "hierarchyListener", null);
        setField(term134222, term134222.getClass(), "hierarchyBoundsListener", null);
        setField(term134222, term134222.getClass(), "keyListener", null);
        setField(term134222, term134222.getClass(), "mouseListener", null);
        setField(term134222, term134222.getClass(), "mouseMotionListener", null);
        setField(term134222, term134222.getClass(), "mouseWheelListener", null);
        setField(term134222, term134222.getClass(), "inputMethodListener", null);
        setLongField(term134222, term134222.getClass(), "eventMask", 0L);
        setField(term134222, term134222.getClass(), "changeSupport", null);
        setField(term134222, term134222.getClass(), "objectLock", null);
        setBooleanField(term134222, term134222.getClass(), "isPacked", false);
        setIntField(term134222, term134222.getClass(), "boundsOp", 0);
        setField(term134222, term134222.getClass(), "compoundShape", null);
        setField(term134222, term134222.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134222, term134222.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134222, term134222.getClass(), "backgroundEraseDisabled", false);
        setField(term134222, term134222.getClass(), "eventCache", null);
        setBooleanField(term134222, term134222.getClass(), "coalescingEnabled", false);
        setBooleanField(term134222, term134222.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134222, term134222.getClass(), "componentSerializedDataVersion", 0);
        setField(term134222, term134222.getClass(), "accessibleContext", null);
        term134263 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term134263;
        callMethod(klass, "setSliderValue", argTypes, term134222, args);
    }

};


