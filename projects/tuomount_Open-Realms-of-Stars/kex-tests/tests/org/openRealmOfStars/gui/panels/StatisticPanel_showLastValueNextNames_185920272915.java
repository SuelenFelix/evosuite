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

public class StatisticPanel_showLastValueNextNames_185920272915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223417;

    public StatisticPanel_showLastValueNextNames_185920272915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223417 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223417, term223417.getClass(), "data", null);
        setField(term223417, term223417.getClass(), "yDataNames", null);
        setIntField(term223417, term223417.getClass(), "largestY", 0);
        setIntField(term223417, term223417.getClass(), "largestX", 0);
        setIntField(term223417, term223417.getClass(), "turnDistance", 0);
        setIntField(term223417, term223417.getClass(), "victoryScoreLimit", 0);
        setField(term223417, term223417.getClass(), "playerColors", null);
        setBooleanField(term223417, term223417.getClass(), "showLastValue", false);
        setBooleanField(term223417, term223417.getClass(), "isAlignmentXSet", false);
        setFloatField(term223417, term223417.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223417, term223417.getClass(), "isAlignmentYSet", false);
        setFloatField(term223417, term223417.getClass(), "alignmentY", 0.0F);
        setField(term223417, term223417.getClass(), "ui", null);
        setField(term223417, term223417.getClass(), "listenerList", null);
        setField(term223417, term223417.getClass(), "clientProperties", null);
        setField(term223417, term223417.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223417, term223417.getClass(), "autoscrolls", false);
        setField(term223417, term223417.getClass(), "border", null);
        setIntField(term223417, term223417.getClass(), "flags", 0);
        setField(term223417, term223417.getClass(), "inputVerifier", null);
        setBooleanField(term223417, term223417.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223417, term223417.getClass(), "paintingChild", null);
        setField(term223417, term223417.getClass(), "popupMenu", null);
        setField(term223417, term223417.getClass(), "revalidateRunnableScheduled", null);
        setField(term223417, term223417.getClass(), "focusInputMap", null);
        setField(term223417, term223417.getClass(), "ancestorInputMap", null);
        setField(term223417, term223417.getClass(), "windowInputMap", null);
        setField(term223417, term223417.getClass(), "actionMap", null);
        setField(term223417, term223417.getClass(), "aaHint", null);
        setField(term223417, term223417.getClass(), "lcdRenderingHint", null);
        setField(term223417, term223417.getClass(), "component", null);
        setField(term223417, term223417.getClass(), "layoutMgr", null);
        setField(term223417, term223417.getClass(), "dispatcher", null);
        setField(term223417, term223417.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223417, term223417.getClass(), "focusCycleRoot", false);
        setBooleanField(term223417, term223417.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223417, term223417.getClass(), "printingThreads", null);
        setBooleanField(term223417, term223417.getClass(), "printing", false);
        setField(term223417, term223417.getClass(), "containerListener", null);
        setIntField(term223417, term223417.getClass(), "listeningChildren", 0);
        setIntField(term223417, term223417.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223417, term223417.getClass(), "descendantsCount", 0);
        setField(term223417, term223417.getClass(), "preserveBackgroundColor", null);
        setIntField(term223417, term223417.getClass(), "numOfHWComponents", 0);
        setIntField(term223417, term223417.getClass(), "numOfLWComponents", 0);
        setField(term223417, term223417.getClass(), "modalComp", null);
        setField(term223417, term223417.getClass(), "modalAppContext", null);
        setIntField(term223417, term223417.getClass(), "containerSerializedDataVersion", 0);
        setField(term223417, term223417.getClass(), "peer", null);
        setField(term223417, term223417.getClass(), "parent", null);
        setField(term223417, term223417.getClass(), "appContext", null);
        setIntField(term223417, term223417.getClass(), "x", 0);
        setIntField(term223417, term223417.getClass(), "y", 0);
        setIntField(term223417, term223417.getClass(), "width", 0);
        setIntField(term223417, term223417.getClass(), "height", 0);
        setField(term223417, term223417.getClass(), "foreground", null);
        setField(term223417, term223417.getClass(), "background", null);
        setField(term223417, term223417.getClass(), "font", null);
        setField(term223417, term223417.getClass(), "peerFont", null);
        setField(term223417, term223417.getClass(), "cursor", null);
        setField(term223417, term223417.getClass(), "locale", null);
        setField(term223417, term223417.getClass(), "graphicsConfig", null);
        setField(term223417, term223417.getClass(), "bufferStrategy", null);
        setBooleanField(term223417, term223417.getClass(), "ignoreRepaint", false);
        setBooleanField(term223417, term223417.getClass(), "visible", false);
        setBooleanField(term223417, term223417.getClass(), "enabled", false);
        setBooleanField(term223417, term223417.getClass(), "valid", false);
        setField(term223417, term223417.getClass(), "dropTarget", null);
        setField(term223417, term223417.getClass(), "popups", null);
        setField(term223417, term223417.getClass(), "name", null);
        setBooleanField(term223417, term223417.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223417, term223417.getClass(), "focusable", false);
        setIntField(term223417, term223417.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223417, term223417.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223417, term223417.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223417, term223417.getClass(), "acc", null);
        setField(term223417, term223417.getClass(), "minSize", null);
        setBooleanField(term223417, term223417.getClass(), "minSizeSet", false);
        setField(term223417, term223417.getClass(), "prefSize", null);
        setBooleanField(term223417, term223417.getClass(), "prefSizeSet", false);
        setField(term223417, term223417.getClass(), "maxSize", null);
        setBooleanField(term223417, term223417.getClass(), "maxSizeSet", false);
        setField(term223417, term223417.getClass(), "componentOrientation", null);
        setBooleanField(term223417, term223417.getClass(), "newEventsOnly", false);
        setField(term223417, term223417.getClass(), "componentListener", null);
        setField(term223417, term223417.getClass(), "focusListener", null);
        setField(term223417, term223417.getClass(), "hierarchyListener", null);
        setField(term223417, term223417.getClass(), "hierarchyBoundsListener", null);
        setField(term223417, term223417.getClass(), "keyListener", null);
        setField(term223417, term223417.getClass(), "mouseListener", null);
        setField(term223417, term223417.getClass(), "mouseMotionListener", null);
        setField(term223417, term223417.getClass(), "mouseWheelListener", null);
        setField(term223417, term223417.getClass(), "inputMethodListener", null);
        setLongField(term223417, term223417.getClass(), "eventMask", 0L);
        setField(term223417, term223417.getClass(), "changeSupport", null);
        setField(term223417, term223417.getClass(), "objectLock", null);
        setBooleanField(term223417, term223417.getClass(), "isPacked", false);
        setIntField(term223417, term223417.getClass(), "boundsOp", 0);
        setField(term223417, term223417.getClass(), "compoundShape", null);
        setField(term223417, term223417.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223417, term223417.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223417, term223417.getClass(), "backgroundEraseDisabled", false);
        setField(term223417, term223417.getClass(), "eventCache", null);
        setBooleanField(term223417, term223417.getClass(), "coalescingEnabled", false);
        setBooleanField(term223417, term223417.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223417, term223417.getClass(), "componentSerializedDataVersion", 0);
        setField(term223417, term223417.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showLastValueNextNames", argTypes, term223417, args);
    }

};


