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

public class StatisticPanel_getLargestX_212706068820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223649;

    public StatisticPanel_getLargestX_212706068820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223649 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223649, term223649.getClass(), "data", null);
        setField(term223649, term223649.getClass(), "yDataNames", null);
        setIntField(term223649, term223649.getClass(), "largestY", 0);
        setIntField(term223649, term223649.getClass(), "largestX", 0);
        setIntField(term223649, term223649.getClass(), "turnDistance", 0);
        setIntField(term223649, term223649.getClass(), "victoryScoreLimit", 0);
        setField(term223649, term223649.getClass(), "playerColors", null);
        setBooleanField(term223649, term223649.getClass(), "showLastValue", false);
        setBooleanField(term223649, term223649.getClass(), "isAlignmentXSet", false);
        setFloatField(term223649, term223649.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223649, term223649.getClass(), "isAlignmentYSet", false);
        setFloatField(term223649, term223649.getClass(), "alignmentY", 0.0F);
        setField(term223649, term223649.getClass(), "ui", null);
        setField(term223649, term223649.getClass(), "listenerList", null);
        setField(term223649, term223649.getClass(), "clientProperties", null);
        setField(term223649, term223649.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223649, term223649.getClass(), "autoscrolls", false);
        setField(term223649, term223649.getClass(), "border", null);
        setIntField(term223649, term223649.getClass(), "flags", 0);
        setField(term223649, term223649.getClass(), "inputVerifier", null);
        setBooleanField(term223649, term223649.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223649, term223649.getClass(), "paintingChild", null);
        setField(term223649, term223649.getClass(), "popupMenu", null);
        setField(term223649, term223649.getClass(), "revalidateRunnableScheduled", null);
        setField(term223649, term223649.getClass(), "focusInputMap", null);
        setField(term223649, term223649.getClass(), "ancestorInputMap", null);
        setField(term223649, term223649.getClass(), "windowInputMap", null);
        setField(term223649, term223649.getClass(), "actionMap", null);
        setField(term223649, term223649.getClass(), "aaHint", null);
        setField(term223649, term223649.getClass(), "lcdRenderingHint", null);
        setField(term223649, term223649.getClass(), "component", null);
        setField(term223649, term223649.getClass(), "layoutMgr", null);
        setField(term223649, term223649.getClass(), "dispatcher", null);
        setField(term223649, term223649.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223649, term223649.getClass(), "focusCycleRoot", false);
        setBooleanField(term223649, term223649.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223649, term223649.getClass(), "printingThreads", null);
        setBooleanField(term223649, term223649.getClass(), "printing", false);
        setField(term223649, term223649.getClass(), "containerListener", null);
        setIntField(term223649, term223649.getClass(), "listeningChildren", 0);
        setIntField(term223649, term223649.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223649, term223649.getClass(), "descendantsCount", 0);
        setField(term223649, term223649.getClass(), "preserveBackgroundColor", null);
        setIntField(term223649, term223649.getClass(), "numOfHWComponents", 0);
        setIntField(term223649, term223649.getClass(), "numOfLWComponents", 0);
        setField(term223649, term223649.getClass(), "modalComp", null);
        setField(term223649, term223649.getClass(), "modalAppContext", null);
        setIntField(term223649, term223649.getClass(), "containerSerializedDataVersion", 0);
        setField(term223649, term223649.getClass(), "peer", null);
        setField(term223649, term223649.getClass(), "parent", null);
        setField(term223649, term223649.getClass(), "appContext", null);
        setIntField(term223649, term223649.getClass(), "x", 0);
        setIntField(term223649, term223649.getClass(), "y", 0);
        setIntField(term223649, term223649.getClass(), "width", 0);
        setIntField(term223649, term223649.getClass(), "height", 0);
        setField(term223649, term223649.getClass(), "foreground", null);
        setField(term223649, term223649.getClass(), "background", null);
        setField(term223649, term223649.getClass(), "font", null);
        setField(term223649, term223649.getClass(), "peerFont", null);
        setField(term223649, term223649.getClass(), "cursor", null);
        setField(term223649, term223649.getClass(), "locale", null);
        setField(term223649, term223649.getClass(), "graphicsConfig", null);
        setField(term223649, term223649.getClass(), "bufferStrategy", null);
        setBooleanField(term223649, term223649.getClass(), "ignoreRepaint", false);
        setBooleanField(term223649, term223649.getClass(), "visible", false);
        setBooleanField(term223649, term223649.getClass(), "enabled", false);
        setBooleanField(term223649, term223649.getClass(), "valid", false);
        setField(term223649, term223649.getClass(), "dropTarget", null);
        setField(term223649, term223649.getClass(), "popups", null);
        setField(term223649, term223649.getClass(), "name", null);
        setBooleanField(term223649, term223649.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223649, term223649.getClass(), "focusable", false);
        setIntField(term223649, term223649.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223649, term223649.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223649, term223649.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223649, term223649.getClass(), "acc", null);
        setField(term223649, term223649.getClass(), "minSize", null);
        setBooleanField(term223649, term223649.getClass(), "minSizeSet", false);
        setField(term223649, term223649.getClass(), "prefSize", null);
        setBooleanField(term223649, term223649.getClass(), "prefSizeSet", false);
        setField(term223649, term223649.getClass(), "maxSize", null);
        setBooleanField(term223649, term223649.getClass(), "maxSizeSet", false);
        setField(term223649, term223649.getClass(), "componentOrientation", null);
        setBooleanField(term223649, term223649.getClass(), "newEventsOnly", false);
        setField(term223649, term223649.getClass(), "componentListener", null);
        setField(term223649, term223649.getClass(), "focusListener", null);
        setField(term223649, term223649.getClass(), "hierarchyListener", null);
        setField(term223649, term223649.getClass(), "hierarchyBoundsListener", null);
        setField(term223649, term223649.getClass(), "keyListener", null);
        setField(term223649, term223649.getClass(), "mouseListener", null);
        setField(term223649, term223649.getClass(), "mouseMotionListener", null);
        setField(term223649, term223649.getClass(), "mouseWheelListener", null);
        setField(term223649, term223649.getClass(), "inputMethodListener", null);
        setLongField(term223649, term223649.getClass(), "eventMask", 0L);
        setField(term223649, term223649.getClass(), "changeSupport", null);
        setField(term223649, term223649.getClass(), "objectLock", null);
        setBooleanField(term223649, term223649.getClass(), "isPacked", false);
        setIntField(term223649, term223649.getClass(), "boundsOp", 0);
        setField(term223649, term223649.getClass(), "compoundShape", null);
        setField(term223649, term223649.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223649, term223649.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223649, term223649.getClass(), "backgroundEraseDisabled", false);
        setField(term223649, term223649.getClass(), "eventCache", null);
        setBooleanField(term223649, term223649.getClass(), "coalescingEnabled", false);
        setBooleanField(term223649, term223649.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223649, term223649.getClass(), "componentSerializedDataVersion", 0);
        setField(term223649, term223649.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLargestX", argTypes, term223649, args);
    }

};


