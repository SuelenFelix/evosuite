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

public class StatisticPanel_getTurnDistance_89895135422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223743;

    public StatisticPanel_getTurnDistance_89895135422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223743 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223743, term223743.getClass(), "data", null);
        setField(term223743, term223743.getClass(), "yDataNames", null);
        setIntField(term223743, term223743.getClass(), "largestY", 0);
        setIntField(term223743, term223743.getClass(), "largestX", 0);
        setIntField(term223743, term223743.getClass(), "turnDistance", 0);
        setIntField(term223743, term223743.getClass(), "victoryScoreLimit", 0);
        setField(term223743, term223743.getClass(), "playerColors", null);
        setBooleanField(term223743, term223743.getClass(), "showLastValue", false);
        setBooleanField(term223743, term223743.getClass(), "isAlignmentXSet", false);
        setFloatField(term223743, term223743.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223743, term223743.getClass(), "isAlignmentYSet", false);
        setFloatField(term223743, term223743.getClass(), "alignmentY", 0.0F);
        setField(term223743, term223743.getClass(), "ui", null);
        setField(term223743, term223743.getClass(), "listenerList", null);
        setField(term223743, term223743.getClass(), "clientProperties", null);
        setField(term223743, term223743.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223743, term223743.getClass(), "autoscrolls", false);
        setField(term223743, term223743.getClass(), "border", null);
        setIntField(term223743, term223743.getClass(), "flags", 0);
        setField(term223743, term223743.getClass(), "inputVerifier", null);
        setBooleanField(term223743, term223743.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223743, term223743.getClass(), "paintingChild", null);
        setField(term223743, term223743.getClass(), "popupMenu", null);
        setField(term223743, term223743.getClass(), "revalidateRunnableScheduled", null);
        setField(term223743, term223743.getClass(), "focusInputMap", null);
        setField(term223743, term223743.getClass(), "ancestorInputMap", null);
        setField(term223743, term223743.getClass(), "windowInputMap", null);
        setField(term223743, term223743.getClass(), "actionMap", null);
        setField(term223743, term223743.getClass(), "aaHint", null);
        setField(term223743, term223743.getClass(), "lcdRenderingHint", null);
        setField(term223743, term223743.getClass(), "component", null);
        setField(term223743, term223743.getClass(), "layoutMgr", null);
        setField(term223743, term223743.getClass(), "dispatcher", null);
        setField(term223743, term223743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223743, term223743.getClass(), "focusCycleRoot", false);
        setBooleanField(term223743, term223743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223743, term223743.getClass(), "printingThreads", null);
        setBooleanField(term223743, term223743.getClass(), "printing", false);
        setField(term223743, term223743.getClass(), "containerListener", null);
        setIntField(term223743, term223743.getClass(), "listeningChildren", 0);
        setIntField(term223743, term223743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223743, term223743.getClass(), "descendantsCount", 0);
        setField(term223743, term223743.getClass(), "preserveBackgroundColor", null);
        setIntField(term223743, term223743.getClass(), "numOfHWComponents", 0);
        setIntField(term223743, term223743.getClass(), "numOfLWComponents", 0);
        setField(term223743, term223743.getClass(), "modalComp", null);
        setField(term223743, term223743.getClass(), "modalAppContext", null);
        setIntField(term223743, term223743.getClass(), "containerSerializedDataVersion", 0);
        setField(term223743, term223743.getClass(), "peer", null);
        setField(term223743, term223743.getClass(), "parent", null);
        setField(term223743, term223743.getClass(), "appContext", null);
        setIntField(term223743, term223743.getClass(), "x", 0);
        setIntField(term223743, term223743.getClass(), "y", 0);
        setIntField(term223743, term223743.getClass(), "width", 0);
        setIntField(term223743, term223743.getClass(), "height", 0);
        setField(term223743, term223743.getClass(), "foreground", null);
        setField(term223743, term223743.getClass(), "background", null);
        setField(term223743, term223743.getClass(), "font", null);
        setField(term223743, term223743.getClass(), "peerFont", null);
        setField(term223743, term223743.getClass(), "cursor", null);
        setField(term223743, term223743.getClass(), "locale", null);
        setField(term223743, term223743.getClass(), "graphicsConfig", null);
        setField(term223743, term223743.getClass(), "bufferStrategy", null);
        setBooleanField(term223743, term223743.getClass(), "ignoreRepaint", false);
        setBooleanField(term223743, term223743.getClass(), "visible", false);
        setBooleanField(term223743, term223743.getClass(), "enabled", false);
        setBooleanField(term223743, term223743.getClass(), "valid", false);
        setField(term223743, term223743.getClass(), "dropTarget", null);
        setField(term223743, term223743.getClass(), "popups", null);
        setField(term223743, term223743.getClass(), "name", null);
        setBooleanField(term223743, term223743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223743, term223743.getClass(), "focusable", false);
        setIntField(term223743, term223743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223743, term223743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223743, term223743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223743, term223743.getClass(), "acc", null);
        setField(term223743, term223743.getClass(), "minSize", null);
        setBooleanField(term223743, term223743.getClass(), "minSizeSet", false);
        setField(term223743, term223743.getClass(), "prefSize", null);
        setBooleanField(term223743, term223743.getClass(), "prefSizeSet", false);
        setField(term223743, term223743.getClass(), "maxSize", null);
        setBooleanField(term223743, term223743.getClass(), "maxSizeSet", false);
        setField(term223743, term223743.getClass(), "componentOrientation", null);
        setBooleanField(term223743, term223743.getClass(), "newEventsOnly", false);
        setField(term223743, term223743.getClass(), "componentListener", null);
        setField(term223743, term223743.getClass(), "focusListener", null);
        setField(term223743, term223743.getClass(), "hierarchyListener", null);
        setField(term223743, term223743.getClass(), "hierarchyBoundsListener", null);
        setField(term223743, term223743.getClass(), "keyListener", null);
        setField(term223743, term223743.getClass(), "mouseListener", null);
        setField(term223743, term223743.getClass(), "mouseMotionListener", null);
        setField(term223743, term223743.getClass(), "mouseWheelListener", null);
        setField(term223743, term223743.getClass(), "inputMethodListener", null);
        setLongField(term223743, term223743.getClass(), "eventMask", 0L);
        setField(term223743, term223743.getClass(), "changeSupport", null);
        setField(term223743, term223743.getClass(), "objectLock", null);
        setBooleanField(term223743, term223743.getClass(), "isPacked", false);
        setIntField(term223743, term223743.getClass(), "boundsOp", 0);
        setField(term223743, term223743.getClass(), "compoundShape", null);
        setField(term223743, term223743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223743, term223743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223743, term223743.getClass(), "backgroundEraseDisabled", false);
        setField(term223743, term223743.getClass(), "eventCache", null);
        setBooleanField(term223743, term223743.getClass(), "coalescingEnabled", false);
        setBooleanField(term223743, term223743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223743, term223743.getClass(), "componentSerializedDataVersion", 0);
        setField(term223743, term223743.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurnDistance", argTypes, term223743, args);
    }

};


