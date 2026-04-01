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

public class StatisticPanel_setYDataNames_115163252214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223371;

    public StatisticPanel_setYDataNames_115163252214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223371 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223371, term223371.getClass(), "data", null);
        setField(term223371, term223371.getClass(), "yDataNames", null);
        setIntField(term223371, term223371.getClass(), "largestY", 0);
        setIntField(term223371, term223371.getClass(), "largestX", 0);
        setIntField(term223371, term223371.getClass(), "turnDistance", 0);
        setIntField(term223371, term223371.getClass(), "victoryScoreLimit", 0);
        setField(term223371, term223371.getClass(), "playerColors", null);
        setBooleanField(term223371, term223371.getClass(), "showLastValue", false);
        setBooleanField(term223371, term223371.getClass(), "isAlignmentXSet", false);
        setFloatField(term223371, term223371.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223371, term223371.getClass(), "isAlignmentYSet", false);
        setFloatField(term223371, term223371.getClass(), "alignmentY", 0.0F);
        setField(term223371, term223371.getClass(), "ui", null);
        setField(term223371, term223371.getClass(), "listenerList", null);
        setField(term223371, term223371.getClass(), "clientProperties", null);
        setField(term223371, term223371.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223371, term223371.getClass(), "autoscrolls", false);
        setField(term223371, term223371.getClass(), "border", null);
        setIntField(term223371, term223371.getClass(), "flags", 0);
        setField(term223371, term223371.getClass(), "inputVerifier", null);
        setBooleanField(term223371, term223371.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223371, term223371.getClass(), "paintingChild", null);
        setField(term223371, term223371.getClass(), "popupMenu", null);
        setField(term223371, term223371.getClass(), "revalidateRunnableScheduled", null);
        setField(term223371, term223371.getClass(), "focusInputMap", null);
        setField(term223371, term223371.getClass(), "ancestorInputMap", null);
        setField(term223371, term223371.getClass(), "windowInputMap", null);
        setField(term223371, term223371.getClass(), "actionMap", null);
        setField(term223371, term223371.getClass(), "aaHint", null);
        setField(term223371, term223371.getClass(), "lcdRenderingHint", null);
        setField(term223371, term223371.getClass(), "component", null);
        setField(term223371, term223371.getClass(), "layoutMgr", null);
        setField(term223371, term223371.getClass(), "dispatcher", null);
        setField(term223371, term223371.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223371, term223371.getClass(), "focusCycleRoot", false);
        setBooleanField(term223371, term223371.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223371, term223371.getClass(), "printingThreads", null);
        setBooleanField(term223371, term223371.getClass(), "printing", false);
        setField(term223371, term223371.getClass(), "containerListener", null);
        setIntField(term223371, term223371.getClass(), "listeningChildren", 0);
        setIntField(term223371, term223371.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223371, term223371.getClass(), "descendantsCount", 0);
        setField(term223371, term223371.getClass(), "preserveBackgroundColor", null);
        setIntField(term223371, term223371.getClass(), "numOfHWComponents", 0);
        setIntField(term223371, term223371.getClass(), "numOfLWComponents", 0);
        setField(term223371, term223371.getClass(), "modalComp", null);
        setField(term223371, term223371.getClass(), "modalAppContext", null);
        setIntField(term223371, term223371.getClass(), "containerSerializedDataVersion", 0);
        setField(term223371, term223371.getClass(), "peer", null);
        setField(term223371, term223371.getClass(), "parent", null);
        setField(term223371, term223371.getClass(), "appContext", null);
        setIntField(term223371, term223371.getClass(), "x", 0);
        setIntField(term223371, term223371.getClass(), "y", 0);
        setIntField(term223371, term223371.getClass(), "width", 0);
        setIntField(term223371, term223371.getClass(), "height", 0);
        setField(term223371, term223371.getClass(), "foreground", null);
        setField(term223371, term223371.getClass(), "background", null);
        setField(term223371, term223371.getClass(), "font", null);
        setField(term223371, term223371.getClass(), "peerFont", null);
        setField(term223371, term223371.getClass(), "cursor", null);
        setField(term223371, term223371.getClass(), "locale", null);
        setField(term223371, term223371.getClass(), "graphicsConfig", null);
        setField(term223371, term223371.getClass(), "bufferStrategy", null);
        setBooleanField(term223371, term223371.getClass(), "ignoreRepaint", false);
        setBooleanField(term223371, term223371.getClass(), "visible", false);
        setBooleanField(term223371, term223371.getClass(), "enabled", false);
        setBooleanField(term223371, term223371.getClass(), "valid", false);
        setField(term223371, term223371.getClass(), "dropTarget", null);
        setField(term223371, term223371.getClass(), "popups", null);
        setField(term223371, term223371.getClass(), "name", null);
        setBooleanField(term223371, term223371.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223371, term223371.getClass(), "focusable", false);
        setIntField(term223371, term223371.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223371, term223371.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223371, term223371.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223371, term223371.getClass(), "acc", null);
        setField(term223371, term223371.getClass(), "minSize", null);
        setBooleanField(term223371, term223371.getClass(), "minSizeSet", false);
        setField(term223371, term223371.getClass(), "prefSize", null);
        setBooleanField(term223371, term223371.getClass(), "prefSizeSet", false);
        setField(term223371, term223371.getClass(), "maxSize", null);
        setBooleanField(term223371, term223371.getClass(), "maxSizeSet", false);
        setField(term223371, term223371.getClass(), "componentOrientation", null);
        setBooleanField(term223371, term223371.getClass(), "newEventsOnly", false);
        setField(term223371, term223371.getClass(), "componentListener", null);
        setField(term223371, term223371.getClass(), "focusListener", null);
        setField(term223371, term223371.getClass(), "hierarchyListener", null);
        setField(term223371, term223371.getClass(), "hierarchyBoundsListener", null);
        setField(term223371, term223371.getClass(), "keyListener", null);
        setField(term223371, term223371.getClass(), "mouseListener", null);
        setField(term223371, term223371.getClass(), "mouseMotionListener", null);
        setField(term223371, term223371.getClass(), "mouseWheelListener", null);
        setField(term223371, term223371.getClass(), "inputMethodListener", null);
        setLongField(term223371, term223371.getClass(), "eventMask", 0L);
        setField(term223371, term223371.getClass(), "changeSupport", null);
        setField(term223371, term223371.getClass(), "objectLock", null);
        setBooleanField(term223371, term223371.getClass(), "isPacked", false);
        setIntField(term223371, term223371.getClass(), "boundsOp", 0);
        setField(term223371, term223371.getClass(), "compoundShape", null);
        setField(term223371, term223371.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223371, term223371.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223371, term223371.getClass(), "backgroundEraseDisabled", false);
        setField(term223371, term223371.getClass(), "eventCache", null);
        setBooleanField(term223371, term223371.getClass(), "coalescingEnabled", false);
        setBooleanField(term223371, term223371.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223371, term223371.getClass(), "componentSerializedDataVersion", 0);
        setField(term223371, term223371.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setYDataNames", argTypes, term223371, args);
    }

};


