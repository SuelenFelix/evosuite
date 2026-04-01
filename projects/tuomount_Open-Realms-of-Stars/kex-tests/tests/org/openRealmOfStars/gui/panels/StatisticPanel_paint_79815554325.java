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

public class StatisticPanel_paint_79815554325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223883;

    public StatisticPanel_paint_79815554325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223883 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223883, term223883.getClass(), "data", null);
        setField(term223883, term223883.getClass(), "yDataNames", null);
        setIntField(term223883, term223883.getClass(), "largestY", 0);
        setIntField(term223883, term223883.getClass(), "largestX", 0);
        setIntField(term223883, term223883.getClass(), "turnDistance", 0);
        setIntField(term223883, term223883.getClass(), "victoryScoreLimit", 0);
        setField(term223883, term223883.getClass(), "playerColors", null);
        setBooleanField(term223883, term223883.getClass(), "showLastValue", false);
        setBooleanField(term223883, term223883.getClass(), "isAlignmentXSet", false);
        setFloatField(term223883, term223883.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223883, term223883.getClass(), "isAlignmentYSet", false);
        setFloatField(term223883, term223883.getClass(), "alignmentY", 0.0F);
        setField(term223883, term223883.getClass(), "ui", null);
        setField(term223883, term223883.getClass(), "listenerList", null);
        setField(term223883, term223883.getClass(), "clientProperties", null);
        setField(term223883, term223883.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223883, term223883.getClass(), "autoscrolls", false);
        setField(term223883, term223883.getClass(), "border", null);
        setIntField(term223883, term223883.getClass(), "flags", 0);
        setField(term223883, term223883.getClass(), "inputVerifier", null);
        setBooleanField(term223883, term223883.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223883, term223883.getClass(), "paintingChild", null);
        setField(term223883, term223883.getClass(), "popupMenu", null);
        setField(term223883, term223883.getClass(), "revalidateRunnableScheduled", null);
        setField(term223883, term223883.getClass(), "focusInputMap", null);
        setField(term223883, term223883.getClass(), "ancestorInputMap", null);
        setField(term223883, term223883.getClass(), "windowInputMap", null);
        setField(term223883, term223883.getClass(), "actionMap", null);
        setField(term223883, term223883.getClass(), "aaHint", null);
        setField(term223883, term223883.getClass(), "lcdRenderingHint", null);
        setField(term223883, term223883.getClass(), "component", null);
        setField(term223883, term223883.getClass(), "layoutMgr", null);
        setField(term223883, term223883.getClass(), "dispatcher", null);
        setField(term223883, term223883.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223883, term223883.getClass(), "focusCycleRoot", false);
        setBooleanField(term223883, term223883.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223883, term223883.getClass(), "printingThreads", null);
        setBooleanField(term223883, term223883.getClass(), "printing", false);
        setField(term223883, term223883.getClass(), "containerListener", null);
        setIntField(term223883, term223883.getClass(), "listeningChildren", 0);
        setIntField(term223883, term223883.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223883, term223883.getClass(), "descendantsCount", 0);
        setField(term223883, term223883.getClass(), "preserveBackgroundColor", null);
        setIntField(term223883, term223883.getClass(), "numOfHWComponents", 0);
        setIntField(term223883, term223883.getClass(), "numOfLWComponents", 0);
        setField(term223883, term223883.getClass(), "modalComp", null);
        setField(term223883, term223883.getClass(), "modalAppContext", null);
        setIntField(term223883, term223883.getClass(), "containerSerializedDataVersion", 0);
        setField(term223883, term223883.getClass(), "peer", null);
        setField(term223883, term223883.getClass(), "parent", null);
        setField(term223883, term223883.getClass(), "appContext", null);
        setIntField(term223883, term223883.getClass(), "x", 0);
        setIntField(term223883, term223883.getClass(), "y", 0);
        setIntField(term223883, term223883.getClass(), "width", 0);
        setIntField(term223883, term223883.getClass(), "height", 0);
        setField(term223883, term223883.getClass(), "foreground", null);
        setField(term223883, term223883.getClass(), "background", null);
        setField(term223883, term223883.getClass(), "font", null);
        setField(term223883, term223883.getClass(), "peerFont", null);
        setField(term223883, term223883.getClass(), "cursor", null);
        setField(term223883, term223883.getClass(), "locale", null);
        setField(term223883, term223883.getClass(), "graphicsConfig", null);
        setField(term223883, term223883.getClass(), "bufferStrategy", null);
        setBooleanField(term223883, term223883.getClass(), "ignoreRepaint", false);
        setBooleanField(term223883, term223883.getClass(), "visible", false);
        setBooleanField(term223883, term223883.getClass(), "enabled", false);
        setBooleanField(term223883, term223883.getClass(), "valid", false);
        setField(term223883, term223883.getClass(), "dropTarget", null);
        setField(term223883, term223883.getClass(), "popups", null);
        setField(term223883, term223883.getClass(), "name", null);
        setBooleanField(term223883, term223883.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223883, term223883.getClass(), "focusable", false);
        setIntField(term223883, term223883.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223883, term223883.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223883, term223883.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223883, term223883.getClass(), "acc", null);
        setField(term223883, term223883.getClass(), "minSize", null);
        setBooleanField(term223883, term223883.getClass(), "minSizeSet", false);
        setField(term223883, term223883.getClass(), "prefSize", null);
        setBooleanField(term223883, term223883.getClass(), "prefSizeSet", false);
        setField(term223883, term223883.getClass(), "maxSize", null);
        setBooleanField(term223883, term223883.getClass(), "maxSizeSet", false);
        setField(term223883, term223883.getClass(), "componentOrientation", null);
        setBooleanField(term223883, term223883.getClass(), "newEventsOnly", false);
        setField(term223883, term223883.getClass(), "componentListener", null);
        setField(term223883, term223883.getClass(), "focusListener", null);
        setField(term223883, term223883.getClass(), "hierarchyListener", null);
        setField(term223883, term223883.getClass(), "hierarchyBoundsListener", null);
        setField(term223883, term223883.getClass(), "keyListener", null);
        setField(term223883, term223883.getClass(), "mouseListener", null);
        setField(term223883, term223883.getClass(), "mouseMotionListener", null);
        setField(term223883, term223883.getClass(), "mouseWheelListener", null);
        setField(term223883, term223883.getClass(), "inputMethodListener", null);
        setLongField(term223883, term223883.getClass(), "eventMask", 0L);
        setField(term223883, term223883.getClass(), "changeSupport", null);
        setField(term223883, term223883.getClass(), "objectLock", null);
        setBooleanField(term223883, term223883.getClass(), "isPacked", false);
        setIntField(term223883, term223883.getClass(), "boundsOp", 0);
        setField(term223883, term223883.getClass(), "compoundShape", null);
        setField(term223883, term223883.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223883, term223883.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223883, term223883.getClass(), "backgroundEraseDisabled", false);
        setField(term223883, term223883.getClass(), "eventCache", null);
        setBooleanField(term223883, term223883.getClass(), "coalescingEnabled", false);
        setBooleanField(term223883, term223883.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223883, term223883.getClass(), "componentSerializedDataVersion", 0);
        setField(term223883, term223883.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paint", argTypes, term223883, args);
    }

};


