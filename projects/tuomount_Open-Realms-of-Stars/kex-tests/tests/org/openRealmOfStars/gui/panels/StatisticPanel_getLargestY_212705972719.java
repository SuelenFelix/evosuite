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

public class StatisticPanel_getLargestY_212705972719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223603;

    public StatisticPanel_getLargestY_212705972719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223603 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223603, term223603.getClass(), "data", null);
        setField(term223603, term223603.getClass(), "yDataNames", null);
        setIntField(term223603, term223603.getClass(), "largestY", 0);
        setIntField(term223603, term223603.getClass(), "largestX", 0);
        setIntField(term223603, term223603.getClass(), "turnDistance", 0);
        setIntField(term223603, term223603.getClass(), "victoryScoreLimit", 0);
        setField(term223603, term223603.getClass(), "playerColors", null);
        setBooleanField(term223603, term223603.getClass(), "showLastValue", false);
        setBooleanField(term223603, term223603.getClass(), "isAlignmentXSet", false);
        setFloatField(term223603, term223603.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223603, term223603.getClass(), "isAlignmentYSet", false);
        setFloatField(term223603, term223603.getClass(), "alignmentY", 0.0F);
        setField(term223603, term223603.getClass(), "ui", null);
        setField(term223603, term223603.getClass(), "listenerList", null);
        setField(term223603, term223603.getClass(), "clientProperties", null);
        setField(term223603, term223603.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223603, term223603.getClass(), "autoscrolls", false);
        setField(term223603, term223603.getClass(), "border", null);
        setIntField(term223603, term223603.getClass(), "flags", 0);
        setField(term223603, term223603.getClass(), "inputVerifier", null);
        setBooleanField(term223603, term223603.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223603, term223603.getClass(), "paintingChild", null);
        setField(term223603, term223603.getClass(), "popupMenu", null);
        setField(term223603, term223603.getClass(), "revalidateRunnableScheduled", null);
        setField(term223603, term223603.getClass(), "focusInputMap", null);
        setField(term223603, term223603.getClass(), "ancestorInputMap", null);
        setField(term223603, term223603.getClass(), "windowInputMap", null);
        setField(term223603, term223603.getClass(), "actionMap", null);
        setField(term223603, term223603.getClass(), "aaHint", null);
        setField(term223603, term223603.getClass(), "lcdRenderingHint", null);
        setField(term223603, term223603.getClass(), "component", null);
        setField(term223603, term223603.getClass(), "layoutMgr", null);
        setField(term223603, term223603.getClass(), "dispatcher", null);
        setField(term223603, term223603.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223603, term223603.getClass(), "focusCycleRoot", false);
        setBooleanField(term223603, term223603.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223603, term223603.getClass(), "printingThreads", null);
        setBooleanField(term223603, term223603.getClass(), "printing", false);
        setField(term223603, term223603.getClass(), "containerListener", null);
        setIntField(term223603, term223603.getClass(), "listeningChildren", 0);
        setIntField(term223603, term223603.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223603, term223603.getClass(), "descendantsCount", 0);
        setField(term223603, term223603.getClass(), "preserveBackgroundColor", null);
        setIntField(term223603, term223603.getClass(), "numOfHWComponents", 0);
        setIntField(term223603, term223603.getClass(), "numOfLWComponents", 0);
        setField(term223603, term223603.getClass(), "modalComp", null);
        setField(term223603, term223603.getClass(), "modalAppContext", null);
        setIntField(term223603, term223603.getClass(), "containerSerializedDataVersion", 0);
        setField(term223603, term223603.getClass(), "peer", null);
        setField(term223603, term223603.getClass(), "parent", null);
        setField(term223603, term223603.getClass(), "appContext", null);
        setIntField(term223603, term223603.getClass(), "x", 0);
        setIntField(term223603, term223603.getClass(), "y", 0);
        setIntField(term223603, term223603.getClass(), "width", 0);
        setIntField(term223603, term223603.getClass(), "height", 0);
        setField(term223603, term223603.getClass(), "foreground", null);
        setField(term223603, term223603.getClass(), "background", null);
        setField(term223603, term223603.getClass(), "font", null);
        setField(term223603, term223603.getClass(), "peerFont", null);
        setField(term223603, term223603.getClass(), "cursor", null);
        setField(term223603, term223603.getClass(), "locale", null);
        setField(term223603, term223603.getClass(), "graphicsConfig", null);
        setField(term223603, term223603.getClass(), "bufferStrategy", null);
        setBooleanField(term223603, term223603.getClass(), "ignoreRepaint", false);
        setBooleanField(term223603, term223603.getClass(), "visible", false);
        setBooleanField(term223603, term223603.getClass(), "enabled", false);
        setBooleanField(term223603, term223603.getClass(), "valid", false);
        setField(term223603, term223603.getClass(), "dropTarget", null);
        setField(term223603, term223603.getClass(), "popups", null);
        setField(term223603, term223603.getClass(), "name", null);
        setBooleanField(term223603, term223603.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223603, term223603.getClass(), "focusable", false);
        setIntField(term223603, term223603.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223603, term223603.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223603, term223603.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223603, term223603.getClass(), "acc", null);
        setField(term223603, term223603.getClass(), "minSize", null);
        setBooleanField(term223603, term223603.getClass(), "minSizeSet", false);
        setField(term223603, term223603.getClass(), "prefSize", null);
        setBooleanField(term223603, term223603.getClass(), "prefSizeSet", false);
        setField(term223603, term223603.getClass(), "maxSize", null);
        setBooleanField(term223603, term223603.getClass(), "maxSizeSet", false);
        setField(term223603, term223603.getClass(), "componentOrientation", null);
        setBooleanField(term223603, term223603.getClass(), "newEventsOnly", false);
        setField(term223603, term223603.getClass(), "componentListener", null);
        setField(term223603, term223603.getClass(), "focusListener", null);
        setField(term223603, term223603.getClass(), "hierarchyListener", null);
        setField(term223603, term223603.getClass(), "hierarchyBoundsListener", null);
        setField(term223603, term223603.getClass(), "keyListener", null);
        setField(term223603, term223603.getClass(), "mouseListener", null);
        setField(term223603, term223603.getClass(), "mouseMotionListener", null);
        setField(term223603, term223603.getClass(), "mouseWheelListener", null);
        setField(term223603, term223603.getClass(), "inputMethodListener", null);
        setLongField(term223603, term223603.getClass(), "eventMask", 0L);
        setField(term223603, term223603.getClass(), "changeSupport", null);
        setField(term223603, term223603.getClass(), "objectLock", null);
        setBooleanField(term223603, term223603.getClass(), "isPacked", false);
        setIntField(term223603, term223603.getClass(), "boundsOp", 0);
        setField(term223603, term223603.getClass(), "compoundShape", null);
        setField(term223603, term223603.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223603, term223603.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223603, term223603.getClass(), "backgroundEraseDisabled", false);
        setField(term223603, term223603.getClass(), "eventCache", null);
        setBooleanField(term223603, term223603.getClass(), "coalescingEnabled", false);
        setBooleanField(term223603, term223603.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223603, term223603.getClass(), "componentSerializedDataVersion", 0);
        setField(term223603, term223603.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLargestY", argTypes, term223603, args);
    }

};


