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

public class StatisticPanel_setData_55303382418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223557;

    public StatisticPanel_setData_55303382418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223557 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223557, term223557.getClass(), "data", null);
        setField(term223557, term223557.getClass(), "yDataNames", null);
        setIntField(term223557, term223557.getClass(), "largestY", 0);
        setIntField(term223557, term223557.getClass(), "largestX", 0);
        setIntField(term223557, term223557.getClass(), "turnDistance", 0);
        setIntField(term223557, term223557.getClass(), "victoryScoreLimit", 0);
        setField(term223557, term223557.getClass(), "playerColors", null);
        setBooleanField(term223557, term223557.getClass(), "showLastValue", false);
        setBooleanField(term223557, term223557.getClass(), "isAlignmentXSet", false);
        setFloatField(term223557, term223557.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223557, term223557.getClass(), "isAlignmentYSet", false);
        setFloatField(term223557, term223557.getClass(), "alignmentY", 0.0F);
        setField(term223557, term223557.getClass(), "ui", null);
        setField(term223557, term223557.getClass(), "listenerList", null);
        setField(term223557, term223557.getClass(), "clientProperties", null);
        setField(term223557, term223557.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223557, term223557.getClass(), "autoscrolls", false);
        setField(term223557, term223557.getClass(), "border", null);
        setIntField(term223557, term223557.getClass(), "flags", 0);
        setField(term223557, term223557.getClass(), "inputVerifier", null);
        setBooleanField(term223557, term223557.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223557, term223557.getClass(), "paintingChild", null);
        setField(term223557, term223557.getClass(), "popupMenu", null);
        setField(term223557, term223557.getClass(), "revalidateRunnableScheduled", null);
        setField(term223557, term223557.getClass(), "focusInputMap", null);
        setField(term223557, term223557.getClass(), "ancestorInputMap", null);
        setField(term223557, term223557.getClass(), "windowInputMap", null);
        setField(term223557, term223557.getClass(), "actionMap", null);
        setField(term223557, term223557.getClass(), "aaHint", null);
        setField(term223557, term223557.getClass(), "lcdRenderingHint", null);
        setField(term223557, term223557.getClass(), "component", null);
        setField(term223557, term223557.getClass(), "layoutMgr", null);
        setField(term223557, term223557.getClass(), "dispatcher", null);
        setField(term223557, term223557.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223557, term223557.getClass(), "focusCycleRoot", false);
        setBooleanField(term223557, term223557.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223557, term223557.getClass(), "printingThreads", null);
        setBooleanField(term223557, term223557.getClass(), "printing", false);
        setField(term223557, term223557.getClass(), "containerListener", null);
        setIntField(term223557, term223557.getClass(), "listeningChildren", 0);
        setIntField(term223557, term223557.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223557, term223557.getClass(), "descendantsCount", 0);
        setField(term223557, term223557.getClass(), "preserveBackgroundColor", null);
        setIntField(term223557, term223557.getClass(), "numOfHWComponents", 0);
        setIntField(term223557, term223557.getClass(), "numOfLWComponents", 0);
        setField(term223557, term223557.getClass(), "modalComp", null);
        setField(term223557, term223557.getClass(), "modalAppContext", null);
        setIntField(term223557, term223557.getClass(), "containerSerializedDataVersion", 0);
        setField(term223557, term223557.getClass(), "peer", null);
        setField(term223557, term223557.getClass(), "parent", null);
        setField(term223557, term223557.getClass(), "appContext", null);
        setIntField(term223557, term223557.getClass(), "x", 0);
        setIntField(term223557, term223557.getClass(), "y", 0);
        setIntField(term223557, term223557.getClass(), "width", 0);
        setIntField(term223557, term223557.getClass(), "height", 0);
        setField(term223557, term223557.getClass(), "foreground", null);
        setField(term223557, term223557.getClass(), "background", null);
        setField(term223557, term223557.getClass(), "font", null);
        setField(term223557, term223557.getClass(), "peerFont", null);
        setField(term223557, term223557.getClass(), "cursor", null);
        setField(term223557, term223557.getClass(), "locale", null);
        setField(term223557, term223557.getClass(), "graphicsConfig", null);
        setField(term223557, term223557.getClass(), "bufferStrategy", null);
        setBooleanField(term223557, term223557.getClass(), "ignoreRepaint", false);
        setBooleanField(term223557, term223557.getClass(), "visible", false);
        setBooleanField(term223557, term223557.getClass(), "enabled", false);
        setBooleanField(term223557, term223557.getClass(), "valid", false);
        setField(term223557, term223557.getClass(), "dropTarget", null);
        setField(term223557, term223557.getClass(), "popups", null);
        setField(term223557, term223557.getClass(), "name", null);
        setBooleanField(term223557, term223557.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223557, term223557.getClass(), "focusable", false);
        setIntField(term223557, term223557.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223557, term223557.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223557, term223557.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223557, term223557.getClass(), "acc", null);
        setField(term223557, term223557.getClass(), "minSize", null);
        setBooleanField(term223557, term223557.getClass(), "minSizeSet", false);
        setField(term223557, term223557.getClass(), "prefSize", null);
        setBooleanField(term223557, term223557.getClass(), "prefSizeSet", false);
        setField(term223557, term223557.getClass(), "maxSize", null);
        setBooleanField(term223557, term223557.getClass(), "maxSizeSet", false);
        setField(term223557, term223557.getClass(), "componentOrientation", null);
        setBooleanField(term223557, term223557.getClass(), "newEventsOnly", false);
        setField(term223557, term223557.getClass(), "componentListener", null);
        setField(term223557, term223557.getClass(), "focusListener", null);
        setField(term223557, term223557.getClass(), "hierarchyListener", null);
        setField(term223557, term223557.getClass(), "hierarchyBoundsListener", null);
        setField(term223557, term223557.getClass(), "keyListener", null);
        setField(term223557, term223557.getClass(), "mouseListener", null);
        setField(term223557, term223557.getClass(), "mouseMotionListener", null);
        setField(term223557, term223557.getClass(), "mouseWheelListener", null);
        setField(term223557, term223557.getClass(), "inputMethodListener", null);
        setLongField(term223557, term223557.getClass(), "eventMask", 0L);
        setField(term223557, term223557.getClass(), "changeSupport", null);
        setField(term223557, term223557.getClass(), "objectLock", null);
        setBooleanField(term223557, term223557.getClass(), "isPacked", false);
        setIntField(term223557, term223557.getClass(), "boundsOp", 0);
        setField(term223557, term223557.getClass(), "compoundShape", null);
        setField(term223557, term223557.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223557, term223557.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223557, term223557.getClass(), "backgroundEraseDisabled", false);
        setField(term223557, term223557.getClass(), "eventCache", null);
        setBooleanField(term223557, term223557.getClass(), "coalescingEnabled", false);
        setBooleanField(term223557, term223557.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223557, term223557.getClass(), "componentSerializedDataVersion", 0);
        setField(term223557, term223557.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setData", argTypes, term223557, args);
    }

};


