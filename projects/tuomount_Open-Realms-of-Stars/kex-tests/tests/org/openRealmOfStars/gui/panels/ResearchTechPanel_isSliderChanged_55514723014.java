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

public class ResearchTechPanel_isSliderChanged_55514723014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134306;

    public ResearchTechPanel_isSliderChanged_55514723014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134306 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134306, term134306.getClass(), "btnMinus", null);
        setField(term134306, term134306.getClass(), "btnPlus", null);
        setField(term134306, term134306.getClass(), "label", null);
        setField(term134306, term134306.getClass(), "lvlLabel", null);
        setField(term134306, term134306.getClass(), "btnUpgrade", null);
        setField(term134306, term134306.getClass(), "slider", null);
        setBooleanField(term134306, term134306.getClass(), "isAlignmentXSet", false);
        setFloatField(term134306, term134306.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134306, term134306.getClass(), "isAlignmentYSet", false);
        setFloatField(term134306, term134306.getClass(), "alignmentY", 0.0F);
        setField(term134306, term134306.getClass(), "ui", null);
        setField(term134306, term134306.getClass(), "listenerList", null);
        setField(term134306, term134306.getClass(), "clientProperties", null);
        setField(term134306, term134306.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134306, term134306.getClass(), "autoscrolls", false);
        setField(term134306, term134306.getClass(), "border", null);
        setIntField(term134306, term134306.getClass(), "flags", 0);
        setField(term134306, term134306.getClass(), "inputVerifier", null);
        setBooleanField(term134306, term134306.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134306, term134306.getClass(), "paintingChild", null);
        setField(term134306, term134306.getClass(), "popupMenu", null);
        setField(term134306, term134306.getClass(), "revalidateRunnableScheduled", null);
        setField(term134306, term134306.getClass(), "focusInputMap", null);
        setField(term134306, term134306.getClass(), "ancestorInputMap", null);
        setField(term134306, term134306.getClass(), "windowInputMap", null);
        setField(term134306, term134306.getClass(), "actionMap", null);
        setField(term134306, term134306.getClass(), "aaHint", null);
        setField(term134306, term134306.getClass(), "lcdRenderingHint", null);
        setField(term134306, term134306.getClass(), "component", null);
        setField(term134306, term134306.getClass(), "layoutMgr", null);
        setField(term134306, term134306.getClass(), "dispatcher", null);
        setField(term134306, term134306.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134306, term134306.getClass(), "focusCycleRoot", false);
        setBooleanField(term134306, term134306.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134306, term134306.getClass(), "printingThreads", null);
        setBooleanField(term134306, term134306.getClass(), "printing", false);
        setField(term134306, term134306.getClass(), "containerListener", null);
        setIntField(term134306, term134306.getClass(), "listeningChildren", 0);
        setIntField(term134306, term134306.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134306, term134306.getClass(), "descendantsCount", 0);
        setField(term134306, term134306.getClass(), "preserveBackgroundColor", null);
        setIntField(term134306, term134306.getClass(), "numOfHWComponents", 0);
        setIntField(term134306, term134306.getClass(), "numOfLWComponents", 0);
        setField(term134306, term134306.getClass(), "modalComp", null);
        setField(term134306, term134306.getClass(), "modalAppContext", null);
        setIntField(term134306, term134306.getClass(), "containerSerializedDataVersion", 0);
        setField(term134306, term134306.getClass(), "peer", null);
        setField(term134306, term134306.getClass(), "parent", null);
        setField(term134306, term134306.getClass(), "appContext", null);
        setIntField(term134306, term134306.getClass(), "x", 0);
        setIntField(term134306, term134306.getClass(), "y", 0);
        setIntField(term134306, term134306.getClass(), "width", 0);
        setIntField(term134306, term134306.getClass(), "height", 0);
        setField(term134306, term134306.getClass(), "foreground", null);
        setField(term134306, term134306.getClass(), "background", null);
        setField(term134306, term134306.getClass(), "font", null);
        setField(term134306, term134306.getClass(), "peerFont", null);
        setField(term134306, term134306.getClass(), "cursor", null);
        setField(term134306, term134306.getClass(), "locale", null);
        setField(term134306, term134306.getClass(), "graphicsConfig", null);
        setField(term134306, term134306.getClass(), "bufferStrategy", null);
        setBooleanField(term134306, term134306.getClass(), "ignoreRepaint", false);
        setBooleanField(term134306, term134306.getClass(), "visible", false);
        setBooleanField(term134306, term134306.getClass(), "enabled", false);
        setBooleanField(term134306, term134306.getClass(), "valid", false);
        setField(term134306, term134306.getClass(), "dropTarget", null);
        setField(term134306, term134306.getClass(), "popups", null);
        setField(term134306, term134306.getClass(), "name", null);
        setBooleanField(term134306, term134306.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134306, term134306.getClass(), "focusable", false);
        setIntField(term134306, term134306.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134306, term134306.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134306, term134306.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134306, term134306.getClass(), "acc", null);
        setField(term134306, term134306.getClass(), "minSize", null);
        setBooleanField(term134306, term134306.getClass(), "minSizeSet", false);
        setField(term134306, term134306.getClass(), "prefSize", null);
        setBooleanField(term134306, term134306.getClass(), "prefSizeSet", false);
        setField(term134306, term134306.getClass(), "maxSize", null);
        setBooleanField(term134306, term134306.getClass(), "maxSizeSet", false);
        setField(term134306, term134306.getClass(), "componentOrientation", null);
        setBooleanField(term134306, term134306.getClass(), "newEventsOnly", false);
        setField(term134306, term134306.getClass(), "componentListener", null);
        setField(term134306, term134306.getClass(), "focusListener", null);
        setField(term134306, term134306.getClass(), "hierarchyListener", null);
        setField(term134306, term134306.getClass(), "hierarchyBoundsListener", null);
        setField(term134306, term134306.getClass(), "keyListener", null);
        setField(term134306, term134306.getClass(), "mouseListener", null);
        setField(term134306, term134306.getClass(), "mouseMotionListener", null);
        setField(term134306, term134306.getClass(), "mouseWheelListener", null);
        setField(term134306, term134306.getClass(), "inputMethodListener", null);
        setLongField(term134306, term134306.getClass(), "eventMask", 0L);
        setField(term134306, term134306.getClass(), "changeSupport", null);
        setField(term134306, term134306.getClass(), "objectLock", null);
        setBooleanField(term134306, term134306.getClass(), "isPacked", false);
        setIntField(term134306, term134306.getClass(), "boundsOp", 0);
        setField(term134306, term134306.getClass(), "compoundShape", null);
        setField(term134306, term134306.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134306, term134306.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134306, term134306.getClass(), "backgroundEraseDisabled", false);
        setField(term134306, term134306.getClass(), "eventCache", null);
        setBooleanField(term134306, term134306.getClass(), "coalescingEnabled", false);
        setBooleanField(term134306, term134306.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134306, term134306.getClass(), "componentSerializedDataVersion", 0);
        setField(term134306, term134306.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSliderChanged", argTypes, term134306, args);
    }

};


