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

public class StatisticPanel_getWidestDataName_187916758117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223511;

    public StatisticPanel_getWidestDataName_187916758117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223511 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223511, term223511.getClass(), "data", null);
        setField(term223511, term223511.getClass(), "yDataNames", null);
        setIntField(term223511, term223511.getClass(), "largestY", 0);
        setIntField(term223511, term223511.getClass(), "largestX", 0);
        setIntField(term223511, term223511.getClass(), "turnDistance", 0);
        setIntField(term223511, term223511.getClass(), "victoryScoreLimit", 0);
        setField(term223511, term223511.getClass(), "playerColors", null);
        setBooleanField(term223511, term223511.getClass(), "showLastValue", false);
        setBooleanField(term223511, term223511.getClass(), "isAlignmentXSet", false);
        setFloatField(term223511, term223511.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223511, term223511.getClass(), "isAlignmentYSet", false);
        setFloatField(term223511, term223511.getClass(), "alignmentY", 0.0F);
        setField(term223511, term223511.getClass(), "ui", null);
        setField(term223511, term223511.getClass(), "listenerList", null);
        setField(term223511, term223511.getClass(), "clientProperties", null);
        setField(term223511, term223511.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223511, term223511.getClass(), "autoscrolls", false);
        setField(term223511, term223511.getClass(), "border", null);
        setIntField(term223511, term223511.getClass(), "flags", 0);
        setField(term223511, term223511.getClass(), "inputVerifier", null);
        setBooleanField(term223511, term223511.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223511, term223511.getClass(), "paintingChild", null);
        setField(term223511, term223511.getClass(), "popupMenu", null);
        setField(term223511, term223511.getClass(), "revalidateRunnableScheduled", null);
        setField(term223511, term223511.getClass(), "focusInputMap", null);
        setField(term223511, term223511.getClass(), "ancestorInputMap", null);
        setField(term223511, term223511.getClass(), "windowInputMap", null);
        setField(term223511, term223511.getClass(), "actionMap", null);
        setField(term223511, term223511.getClass(), "aaHint", null);
        setField(term223511, term223511.getClass(), "lcdRenderingHint", null);
        setField(term223511, term223511.getClass(), "component", null);
        setField(term223511, term223511.getClass(), "layoutMgr", null);
        setField(term223511, term223511.getClass(), "dispatcher", null);
        setField(term223511, term223511.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223511, term223511.getClass(), "focusCycleRoot", false);
        setBooleanField(term223511, term223511.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223511, term223511.getClass(), "printingThreads", null);
        setBooleanField(term223511, term223511.getClass(), "printing", false);
        setField(term223511, term223511.getClass(), "containerListener", null);
        setIntField(term223511, term223511.getClass(), "listeningChildren", 0);
        setIntField(term223511, term223511.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223511, term223511.getClass(), "descendantsCount", 0);
        setField(term223511, term223511.getClass(), "preserveBackgroundColor", null);
        setIntField(term223511, term223511.getClass(), "numOfHWComponents", 0);
        setIntField(term223511, term223511.getClass(), "numOfLWComponents", 0);
        setField(term223511, term223511.getClass(), "modalComp", null);
        setField(term223511, term223511.getClass(), "modalAppContext", null);
        setIntField(term223511, term223511.getClass(), "containerSerializedDataVersion", 0);
        setField(term223511, term223511.getClass(), "peer", null);
        setField(term223511, term223511.getClass(), "parent", null);
        setField(term223511, term223511.getClass(), "appContext", null);
        setIntField(term223511, term223511.getClass(), "x", 0);
        setIntField(term223511, term223511.getClass(), "y", 0);
        setIntField(term223511, term223511.getClass(), "width", 0);
        setIntField(term223511, term223511.getClass(), "height", 0);
        setField(term223511, term223511.getClass(), "foreground", null);
        setField(term223511, term223511.getClass(), "background", null);
        setField(term223511, term223511.getClass(), "font", null);
        setField(term223511, term223511.getClass(), "peerFont", null);
        setField(term223511, term223511.getClass(), "cursor", null);
        setField(term223511, term223511.getClass(), "locale", null);
        setField(term223511, term223511.getClass(), "graphicsConfig", null);
        setField(term223511, term223511.getClass(), "bufferStrategy", null);
        setBooleanField(term223511, term223511.getClass(), "ignoreRepaint", false);
        setBooleanField(term223511, term223511.getClass(), "visible", false);
        setBooleanField(term223511, term223511.getClass(), "enabled", false);
        setBooleanField(term223511, term223511.getClass(), "valid", false);
        setField(term223511, term223511.getClass(), "dropTarget", null);
        setField(term223511, term223511.getClass(), "popups", null);
        setField(term223511, term223511.getClass(), "name", null);
        setBooleanField(term223511, term223511.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223511, term223511.getClass(), "focusable", false);
        setIntField(term223511, term223511.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223511, term223511.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223511, term223511.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223511, term223511.getClass(), "acc", null);
        setField(term223511, term223511.getClass(), "minSize", null);
        setBooleanField(term223511, term223511.getClass(), "minSizeSet", false);
        setField(term223511, term223511.getClass(), "prefSize", null);
        setBooleanField(term223511, term223511.getClass(), "prefSizeSet", false);
        setField(term223511, term223511.getClass(), "maxSize", null);
        setBooleanField(term223511, term223511.getClass(), "maxSizeSet", false);
        setField(term223511, term223511.getClass(), "componentOrientation", null);
        setBooleanField(term223511, term223511.getClass(), "newEventsOnly", false);
        setField(term223511, term223511.getClass(), "componentListener", null);
        setField(term223511, term223511.getClass(), "focusListener", null);
        setField(term223511, term223511.getClass(), "hierarchyListener", null);
        setField(term223511, term223511.getClass(), "hierarchyBoundsListener", null);
        setField(term223511, term223511.getClass(), "keyListener", null);
        setField(term223511, term223511.getClass(), "mouseListener", null);
        setField(term223511, term223511.getClass(), "mouseMotionListener", null);
        setField(term223511, term223511.getClass(), "mouseWheelListener", null);
        setField(term223511, term223511.getClass(), "inputMethodListener", null);
        setLongField(term223511, term223511.getClass(), "eventMask", 0L);
        setField(term223511, term223511.getClass(), "changeSupport", null);
        setField(term223511, term223511.getClass(), "objectLock", null);
        setBooleanField(term223511, term223511.getClass(), "isPacked", false);
        setIntField(term223511, term223511.getClass(), "boundsOp", 0);
        setField(term223511, term223511.getClass(), "compoundShape", null);
        setField(term223511, term223511.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223511, term223511.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223511, term223511.getClass(), "backgroundEraseDisabled", false);
        setField(term223511, term223511.getClass(), "eventCache", null);
        setBooleanField(term223511, term223511.getClass(), "coalescingEnabled", false);
        setBooleanField(term223511, term223511.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223511, term223511.getClass(), "componentSerializedDataVersion", 0);
        setField(term223511, term223511.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWidestDataName", argTypes, term223511, args);
    }

};


