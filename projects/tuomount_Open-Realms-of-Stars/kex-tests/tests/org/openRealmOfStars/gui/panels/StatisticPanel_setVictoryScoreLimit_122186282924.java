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

public class StatisticPanel_setVictoryScoreLimit_122186282924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223835;
     Object term223881;

    public StatisticPanel_setVictoryScoreLimit_122186282924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223835 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223835, term223835.getClass(), "data", null);
        setField(term223835, term223835.getClass(), "yDataNames", null);
        setIntField(term223835, term223835.getClass(), "largestY", 0);
        setIntField(term223835, term223835.getClass(), "largestX", 0);
        setIntField(term223835, term223835.getClass(), "turnDistance", 0);
        setIntField(term223835, term223835.getClass(), "victoryScoreLimit", 0);
        setField(term223835, term223835.getClass(), "playerColors", null);
        setBooleanField(term223835, term223835.getClass(), "showLastValue", false);
        setBooleanField(term223835, term223835.getClass(), "isAlignmentXSet", false);
        setFloatField(term223835, term223835.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223835, term223835.getClass(), "isAlignmentYSet", false);
        setFloatField(term223835, term223835.getClass(), "alignmentY", 0.0F);
        setField(term223835, term223835.getClass(), "ui", null);
        setField(term223835, term223835.getClass(), "listenerList", null);
        setField(term223835, term223835.getClass(), "clientProperties", null);
        setField(term223835, term223835.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223835, term223835.getClass(), "autoscrolls", false);
        setField(term223835, term223835.getClass(), "border", null);
        setIntField(term223835, term223835.getClass(), "flags", 0);
        setField(term223835, term223835.getClass(), "inputVerifier", null);
        setBooleanField(term223835, term223835.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223835, term223835.getClass(), "paintingChild", null);
        setField(term223835, term223835.getClass(), "popupMenu", null);
        setField(term223835, term223835.getClass(), "revalidateRunnableScheduled", null);
        setField(term223835, term223835.getClass(), "focusInputMap", null);
        setField(term223835, term223835.getClass(), "ancestorInputMap", null);
        setField(term223835, term223835.getClass(), "windowInputMap", null);
        setField(term223835, term223835.getClass(), "actionMap", null);
        setField(term223835, term223835.getClass(), "aaHint", null);
        setField(term223835, term223835.getClass(), "lcdRenderingHint", null);
        setField(term223835, term223835.getClass(), "component", null);
        setField(term223835, term223835.getClass(), "layoutMgr", null);
        setField(term223835, term223835.getClass(), "dispatcher", null);
        setField(term223835, term223835.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223835, term223835.getClass(), "focusCycleRoot", false);
        setBooleanField(term223835, term223835.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223835, term223835.getClass(), "printingThreads", null);
        setBooleanField(term223835, term223835.getClass(), "printing", false);
        setField(term223835, term223835.getClass(), "containerListener", null);
        setIntField(term223835, term223835.getClass(), "listeningChildren", 0);
        setIntField(term223835, term223835.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223835, term223835.getClass(), "descendantsCount", 0);
        setField(term223835, term223835.getClass(), "preserveBackgroundColor", null);
        setIntField(term223835, term223835.getClass(), "numOfHWComponents", 0);
        setIntField(term223835, term223835.getClass(), "numOfLWComponents", 0);
        setField(term223835, term223835.getClass(), "modalComp", null);
        setField(term223835, term223835.getClass(), "modalAppContext", null);
        setIntField(term223835, term223835.getClass(), "containerSerializedDataVersion", 0);
        setField(term223835, term223835.getClass(), "peer", null);
        setField(term223835, term223835.getClass(), "parent", null);
        setField(term223835, term223835.getClass(), "appContext", null);
        setIntField(term223835, term223835.getClass(), "x", 0);
        setIntField(term223835, term223835.getClass(), "y", 0);
        setIntField(term223835, term223835.getClass(), "width", 0);
        setIntField(term223835, term223835.getClass(), "height", 0);
        setField(term223835, term223835.getClass(), "foreground", null);
        setField(term223835, term223835.getClass(), "background", null);
        setField(term223835, term223835.getClass(), "font", null);
        setField(term223835, term223835.getClass(), "peerFont", null);
        setField(term223835, term223835.getClass(), "cursor", null);
        setField(term223835, term223835.getClass(), "locale", null);
        setField(term223835, term223835.getClass(), "graphicsConfig", null);
        setField(term223835, term223835.getClass(), "bufferStrategy", null);
        setBooleanField(term223835, term223835.getClass(), "ignoreRepaint", false);
        setBooleanField(term223835, term223835.getClass(), "visible", false);
        setBooleanField(term223835, term223835.getClass(), "enabled", false);
        setBooleanField(term223835, term223835.getClass(), "valid", false);
        setField(term223835, term223835.getClass(), "dropTarget", null);
        setField(term223835, term223835.getClass(), "popups", null);
        setField(term223835, term223835.getClass(), "name", null);
        setBooleanField(term223835, term223835.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223835, term223835.getClass(), "focusable", false);
        setIntField(term223835, term223835.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223835, term223835.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223835, term223835.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223835, term223835.getClass(), "acc", null);
        setField(term223835, term223835.getClass(), "minSize", null);
        setBooleanField(term223835, term223835.getClass(), "minSizeSet", false);
        setField(term223835, term223835.getClass(), "prefSize", null);
        setBooleanField(term223835, term223835.getClass(), "prefSizeSet", false);
        setField(term223835, term223835.getClass(), "maxSize", null);
        setBooleanField(term223835, term223835.getClass(), "maxSizeSet", false);
        setField(term223835, term223835.getClass(), "componentOrientation", null);
        setBooleanField(term223835, term223835.getClass(), "newEventsOnly", false);
        setField(term223835, term223835.getClass(), "componentListener", null);
        setField(term223835, term223835.getClass(), "focusListener", null);
        setField(term223835, term223835.getClass(), "hierarchyListener", null);
        setField(term223835, term223835.getClass(), "hierarchyBoundsListener", null);
        setField(term223835, term223835.getClass(), "keyListener", null);
        setField(term223835, term223835.getClass(), "mouseListener", null);
        setField(term223835, term223835.getClass(), "mouseMotionListener", null);
        setField(term223835, term223835.getClass(), "mouseWheelListener", null);
        setField(term223835, term223835.getClass(), "inputMethodListener", null);
        setLongField(term223835, term223835.getClass(), "eventMask", 0L);
        setField(term223835, term223835.getClass(), "changeSupport", null);
        setField(term223835, term223835.getClass(), "objectLock", null);
        setBooleanField(term223835, term223835.getClass(), "isPacked", false);
        setIntField(term223835, term223835.getClass(), "boundsOp", 0);
        setField(term223835, term223835.getClass(), "compoundShape", null);
        setField(term223835, term223835.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223835, term223835.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223835, term223835.getClass(), "backgroundEraseDisabled", false);
        setField(term223835, term223835.getClass(), "eventCache", null);
        setBooleanField(term223835, term223835.getClass(), "coalescingEnabled", false);
        setBooleanField(term223835, term223835.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223835, term223835.getClass(), "componentSerializedDataVersion", 0);
        setField(term223835, term223835.getClass(), "accessibleContext", null);
        term223881 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term223881;
        callMethod(klass, "setVictoryScoreLimit", argTypes, term223835, args);
    }

};


