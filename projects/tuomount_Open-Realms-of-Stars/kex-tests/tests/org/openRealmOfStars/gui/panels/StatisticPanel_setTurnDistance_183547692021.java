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

public class StatisticPanel_setTurnDistance_183547692021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223695;
     Object term223741;

    public StatisticPanel_setTurnDistance_183547692021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223695 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223695, term223695.getClass(), "data", null);
        setField(term223695, term223695.getClass(), "yDataNames", null);
        setIntField(term223695, term223695.getClass(), "largestY", 0);
        setIntField(term223695, term223695.getClass(), "largestX", 0);
        setIntField(term223695, term223695.getClass(), "turnDistance", 0);
        setIntField(term223695, term223695.getClass(), "victoryScoreLimit", 0);
        setField(term223695, term223695.getClass(), "playerColors", null);
        setBooleanField(term223695, term223695.getClass(), "showLastValue", false);
        setBooleanField(term223695, term223695.getClass(), "isAlignmentXSet", false);
        setFloatField(term223695, term223695.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223695, term223695.getClass(), "isAlignmentYSet", false);
        setFloatField(term223695, term223695.getClass(), "alignmentY", 0.0F);
        setField(term223695, term223695.getClass(), "ui", null);
        setField(term223695, term223695.getClass(), "listenerList", null);
        setField(term223695, term223695.getClass(), "clientProperties", null);
        setField(term223695, term223695.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223695, term223695.getClass(), "autoscrolls", false);
        setField(term223695, term223695.getClass(), "border", null);
        setIntField(term223695, term223695.getClass(), "flags", 0);
        setField(term223695, term223695.getClass(), "inputVerifier", null);
        setBooleanField(term223695, term223695.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223695, term223695.getClass(), "paintingChild", null);
        setField(term223695, term223695.getClass(), "popupMenu", null);
        setField(term223695, term223695.getClass(), "revalidateRunnableScheduled", null);
        setField(term223695, term223695.getClass(), "focusInputMap", null);
        setField(term223695, term223695.getClass(), "ancestorInputMap", null);
        setField(term223695, term223695.getClass(), "windowInputMap", null);
        setField(term223695, term223695.getClass(), "actionMap", null);
        setField(term223695, term223695.getClass(), "aaHint", null);
        setField(term223695, term223695.getClass(), "lcdRenderingHint", null);
        setField(term223695, term223695.getClass(), "component", null);
        setField(term223695, term223695.getClass(), "layoutMgr", null);
        setField(term223695, term223695.getClass(), "dispatcher", null);
        setField(term223695, term223695.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223695, term223695.getClass(), "focusCycleRoot", false);
        setBooleanField(term223695, term223695.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223695, term223695.getClass(), "printingThreads", null);
        setBooleanField(term223695, term223695.getClass(), "printing", false);
        setField(term223695, term223695.getClass(), "containerListener", null);
        setIntField(term223695, term223695.getClass(), "listeningChildren", 0);
        setIntField(term223695, term223695.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223695, term223695.getClass(), "descendantsCount", 0);
        setField(term223695, term223695.getClass(), "preserveBackgroundColor", null);
        setIntField(term223695, term223695.getClass(), "numOfHWComponents", 0);
        setIntField(term223695, term223695.getClass(), "numOfLWComponents", 0);
        setField(term223695, term223695.getClass(), "modalComp", null);
        setField(term223695, term223695.getClass(), "modalAppContext", null);
        setIntField(term223695, term223695.getClass(), "containerSerializedDataVersion", 0);
        setField(term223695, term223695.getClass(), "peer", null);
        setField(term223695, term223695.getClass(), "parent", null);
        setField(term223695, term223695.getClass(), "appContext", null);
        setIntField(term223695, term223695.getClass(), "x", 0);
        setIntField(term223695, term223695.getClass(), "y", 0);
        setIntField(term223695, term223695.getClass(), "width", 0);
        setIntField(term223695, term223695.getClass(), "height", 0);
        setField(term223695, term223695.getClass(), "foreground", null);
        setField(term223695, term223695.getClass(), "background", null);
        setField(term223695, term223695.getClass(), "font", null);
        setField(term223695, term223695.getClass(), "peerFont", null);
        setField(term223695, term223695.getClass(), "cursor", null);
        setField(term223695, term223695.getClass(), "locale", null);
        setField(term223695, term223695.getClass(), "graphicsConfig", null);
        setField(term223695, term223695.getClass(), "bufferStrategy", null);
        setBooleanField(term223695, term223695.getClass(), "ignoreRepaint", false);
        setBooleanField(term223695, term223695.getClass(), "visible", false);
        setBooleanField(term223695, term223695.getClass(), "enabled", false);
        setBooleanField(term223695, term223695.getClass(), "valid", false);
        setField(term223695, term223695.getClass(), "dropTarget", null);
        setField(term223695, term223695.getClass(), "popups", null);
        setField(term223695, term223695.getClass(), "name", null);
        setBooleanField(term223695, term223695.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223695, term223695.getClass(), "focusable", false);
        setIntField(term223695, term223695.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223695, term223695.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223695, term223695.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223695, term223695.getClass(), "acc", null);
        setField(term223695, term223695.getClass(), "minSize", null);
        setBooleanField(term223695, term223695.getClass(), "minSizeSet", false);
        setField(term223695, term223695.getClass(), "prefSize", null);
        setBooleanField(term223695, term223695.getClass(), "prefSizeSet", false);
        setField(term223695, term223695.getClass(), "maxSize", null);
        setBooleanField(term223695, term223695.getClass(), "maxSizeSet", false);
        setField(term223695, term223695.getClass(), "componentOrientation", null);
        setBooleanField(term223695, term223695.getClass(), "newEventsOnly", false);
        setField(term223695, term223695.getClass(), "componentListener", null);
        setField(term223695, term223695.getClass(), "focusListener", null);
        setField(term223695, term223695.getClass(), "hierarchyListener", null);
        setField(term223695, term223695.getClass(), "hierarchyBoundsListener", null);
        setField(term223695, term223695.getClass(), "keyListener", null);
        setField(term223695, term223695.getClass(), "mouseListener", null);
        setField(term223695, term223695.getClass(), "mouseMotionListener", null);
        setField(term223695, term223695.getClass(), "mouseWheelListener", null);
        setField(term223695, term223695.getClass(), "inputMethodListener", null);
        setLongField(term223695, term223695.getClass(), "eventMask", 0L);
        setField(term223695, term223695.getClass(), "changeSupport", null);
        setField(term223695, term223695.getClass(), "objectLock", null);
        setBooleanField(term223695, term223695.getClass(), "isPacked", false);
        setIntField(term223695, term223695.getClass(), "boundsOp", 0);
        setField(term223695, term223695.getClass(), "compoundShape", null);
        setField(term223695, term223695.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223695, term223695.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223695, term223695.getClass(), "backgroundEraseDisabled", false);
        setField(term223695, term223695.getClass(), "eventCache", null);
        setBooleanField(term223695, term223695.getClass(), "coalescingEnabled", false);
        setBooleanField(term223695, term223695.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223695, term223695.getClass(), "componentSerializedDataVersion", 0);
        setField(term223695, term223695.getClass(), "accessibleContext", null);
        term223741 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term223741;
        callMethod(klass, "setTurnDistance", argTypes, term223695, args);
    }

};


