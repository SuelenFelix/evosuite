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

public class StatisticPanel_getFullText_154562943116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223463;
     Object term223509;

    public StatisticPanel_getFullText_154562943116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223463 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223463, term223463.getClass(), "data", null);
        setField(term223463, term223463.getClass(), "yDataNames", null);
        setIntField(term223463, term223463.getClass(), "largestY", 0);
        setIntField(term223463, term223463.getClass(), "largestX", 0);
        setIntField(term223463, term223463.getClass(), "turnDistance", 0);
        setIntField(term223463, term223463.getClass(), "victoryScoreLimit", 0);
        setField(term223463, term223463.getClass(), "playerColors", null);
        setBooleanField(term223463, term223463.getClass(), "showLastValue", false);
        setBooleanField(term223463, term223463.getClass(), "isAlignmentXSet", false);
        setFloatField(term223463, term223463.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223463, term223463.getClass(), "isAlignmentYSet", false);
        setFloatField(term223463, term223463.getClass(), "alignmentY", 0.0F);
        setField(term223463, term223463.getClass(), "ui", null);
        setField(term223463, term223463.getClass(), "listenerList", null);
        setField(term223463, term223463.getClass(), "clientProperties", null);
        setField(term223463, term223463.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223463, term223463.getClass(), "autoscrolls", false);
        setField(term223463, term223463.getClass(), "border", null);
        setIntField(term223463, term223463.getClass(), "flags", 0);
        setField(term223463, term223463.getClass(), "inputVerifier", null);
        setBooleanField(term223463, term223463.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223463, term223463.getClass(), "paintingChild", null);
        setField(term223463, term223463.getClass(), "popupMenu", null);
        setField(term223463, term223463.getClass(), "revalidateRunnableScheduled", null);
        setField(term223463, term223463.getClass(), "focusInputMap", null);
        setField(term223463, term223463.getClass(), "ancestorInputMap", null);
        setField(term223463, term223463.getClass(), "windowInputMap", null);
        setField(term223463, term223463.getClass(), "actionMap", null);
        setField(term223463, term223463.getClass(), "aaHint", null);
        setField(term223463, term223463.getClass(), "lcdRenderingHint", null);
        setField(term223463, term223463.getClass(), "component", null);
        setField(term223463, term223463.getClass(), "layoutMgr", null);
        setField(term223463, term223463.getClass(), "dispatcher", null);
        setField(term223463, term223463.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223463, term223463.getClass(), "focusCycleRoot", false);
        setBooleanField(term223463, term223463.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223463, term223463.getClass(), "printingThreads", null);
        setBooleanField(term223463, term223463.getClass(), "printing", false);
        setField(term223463, term223463.getClass(), "containerListener", null);
        setIntField(term223463, term223463.getClass(), "listeningChildren", 0);
        setIntField(term223463, term223463.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223463, term223463.getClass(), "descendantsCount", 0);
        setField(term223463, term223463.getClass(), "preserveBackgroundColor", null);
        setIntField(term223463, term223463.getClass(), "numOfHWComponents", 0);
        setIntField(term223463, term223463.getClass(), "numOfLWComponents", 0);
        setField(term223463, term223463.getClass(), "modalComp", null);
        setField(term223463, term223463.getClass(), "modalAppContext", null);
        setIntField(term223463, term223463.getClass(), "containerSerializedDataVersion", 0);
        setField(term223463, term223463.getClass(), "peer", null);
        setField(term223463, term223463.getClass(), "parent", null);
        setField(term223463, term223463.getClass(), "appContext", null);
        setIntField(term223463, term223463.getClass(), "x", 0);
        setIntField(term223463, term223463.getClass(), "y", 0);
        setIntField(term223463, term223463.getClass(), "width", 0);
        setIntField(term223463, term223463.getClass(), "height", 0);
        setField(term223463, term223463.getClass(), "foreground", null);
        setField(term223463, term223463.getClass(), "background", null);
        setField(term223463, term223463.getClass(), "font", null);
        setField(term223463, term223463.getClass(), "peerFont", null);
        setField(term223463, term223463.getClass(), "cursor", null);
        setField(term223463, term223463.getClass(), "locale", null);
        setField(term223463, term223463.getClass(), "graphicsConfig", null);
        setField(term223463, term223463.getClass(), "bufferStrategy", null);
        setBooleanField(term223463, term223463.getClass(), "ignoreRepaint", false);
        setBooleanField(term223463, term223463.getClass(), "visible", false);
        setBooleanField(term223463, term223463.getClass(), "enabled", false);
        setBooleanField(term223463, term223463.getClass(), "valid", false);
        setField(term223463, term223463.getClass(), "dropTarget", null);
        setField(term223463, term223463.getClass(), "popups", null);
        setField(term223463, term223463.getClass(), "name", null);
        setBooleanField(term223463, term223463.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223463, term223463.getClass(), "focusable", false);
        setIntField(term223463, term223463.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223463, term223463.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223463, term223463.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223463, term223463.getClass(), "acc", null);
        setField(term223463, term223463.getClass(), "minSize", null);
        setBooleanField(term223463, term223463.getClass(), "minSizeSet", false);
        setField(term223463, term223463.getClass(), "prefSize", null);
        setBooleanField(term223463, term223463.getClass(), "prefSizeSet", false);
        setField(term223463, term223463.getClass(), "maxSize", null);
        setBooleanField(term223463, term223463.getClass(), "maxSizeSet", false);
        setField(term223463, term223463.getClass(), "componentOrientation", null);
        setBooleanField(term223463, term223463.getClass(), "newEventsOnly", false);
        setField(term223463, term223463.getClass(), "componentListener", null);
        setField(term223463, term223463.getClass(), "focusListener", null);
        setField(term223463, term223463.getClass(), "hierarchyListener", null);
        setField(term223463, term223463.getClass(), "hierarchyBoundsListener", null);
        setField(term223463, term223463.getClass(), "keyListener", null);
        setField(term223463, term223463.getClass(), "mouseListener", null);
        setField(term223463, term223463.getClass(), "mouseMotionListener", null);
        setField(term223463, term223463.getClass(), "mouseWheelListener", null);
        setField(term223463, term223463.getClass(), "inputMethodListener", null);
        setLongField(term223463, term223463.getClass(), "eventMask", 0L);
        setField(term223463, term223463.getClass(), "changeSupport", null);
        setField(term223463, term223463.getClass(), "objectLock", null);
        setBooleanField(term223463, term223463.getClass(), "isPacked", false);
        setIntField(term223463, term223463.getClass(), "boundsOp", 0);
        setField(term223463, term223463.getClass(), "compoundShape", null);
        setField(term223463, term223463.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223463, term223463.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223463, term223463.getClass(), "backgroundEraseDisabled", false);
        setField(term223463, term223463.getClass(), "eventCache", null);
        setBooleanField(term223463, term223463.getClass(), "coalescingEnabled", false);
        setBooleanField(term223463, term223463.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223463, term223463.getClass(), "componentSerializedDataVersion", 0);
        setField(term223463, term223463.getClass(), "accessibleContext", null);
        term223509 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term223509;
        callMethod(klass, "getFullText", argTypes, term223463, args);
    }

};


