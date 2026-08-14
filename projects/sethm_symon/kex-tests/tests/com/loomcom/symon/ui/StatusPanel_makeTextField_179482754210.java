package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class StatusPanel_makeTextField_179482754210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90126;
     Object term90167;

    public StatusPanel_makeTextField_179482754210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90126 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term90126, term90126.getClass(), "carryOn", null);
        setField(term90126, term90126.getClass(), "carryOff", null);
        setField(term90126, term90126.getClass(), "zeroOn", null);
        setField(term90126, term90126.getClass(), "zeroOff", null);
        setField(term90126, term90126.getClass(), "irqOn", null);
        setField(term90126, term90126.getClass(), "irqOff", null);
        setField(term90126, term90126.getClass(), "decimalOn", null);
        setField(term90126, term90126.getClass(), "decimalOff", null);
        setField(term90126, term90126.getClass(), "breakOn", null);
        setField(term90126, term90126.getClass(), "breakOff", null);
        setField(term90126, term90126.getClass(), "overflowOn", null);
        setField(term90126, term90126.getClass(), "overflowOff", null);
        setField(term90126, term90126.getClass(), "negativeOn", null);
        setField(term90126, term90126.getClass(), "negativeOff", null);
        setField(term90126, term90126.getClass(), "carryFlagLabel", null);
        setField(term90126, term90126.getClass(), "zeroFlagLabel", null);
        setField(term90126, term90126.getClass(), "irqDisableFlagLabel", null);
        setField(term90126, term90126.getClass(), "decimalModeFlagLabel", null);
        setField(term90126, term90126.getClass(), "breakFlagLabel", null);
        setField(term90126, term90126.getClass(), "overflowFlagLabel", null);
        setField(term90126, term90126.getClass(), "negativeFlagLabel", null);
        setField(term90126, term90126.getClass(), "opcodeField", null);
        setField(term90126, term90126.getClass(), "pcField", null);
        setField(term90126, term90126.getClass(), "spField", null);
        setField(term90126, term90126.getClass(), "aField", null);
        setField(term90126, term90126.getClass(), "xField", null);
        setField(term90126, term90126.getClass(), "yField", null);
        setField(term90126, term90126.getClass(), "machine", null);
        setBooleanField(term90126, term90126.getClass(), "isAlignmentXSet", false);
        setFloatField(term90126, term90126.getClass(), "alignmentX", 0.0F);
        setBooleanField(term90126, term90126.getClass(), "isAlignmentYSet", false);
        setFloatField(term90126, term90126.getClass(), "alignmentY", 0.0F);
        setField(term90126, term90126.getClass(), "ui", null);
        setField(term90126, term90126.getClass(), "listenerList", null);
        setField(term90126, term90126.getClass(), "clientProperties", null);
        setField(term90126, term90126.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term90126, term90126.getClass(), "autoscrolls", false);
        setField(term90126, term90126.getClass(), "border", null);
        setIntField(term90126, term90126.getClass(), "flags", 0);
        setField(term90126, term90126.getClass(), "inputVerifier", null);
        setBooleanField(term90126, term90126.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term90126, term90126.getClass(), "paintingChild", null);
        setField(term90126, term90126.getClass(), "popupMenu", null);
        setField(term90126, term90126.getClass(), "revalidateRunnableScheduled", null);
        setField(term90126, term90126.getClass(), "focusInputMap", null);
        setField(term90126, term90126.getClass(), "ancestorInputMap", null);
        setField(term90126, term90126.getClass(), "windowInputMap", null);
        setField(term90126, term90126.getClass(), "actionMap", null);
        setField(term90126, term90126.getClass(), "aaHint", null);
        setField(term90126, term90126.getClass(), "lcdRenderingHint", null);
        setField(term90126, term90126.getClass(), "component", null);
        setField(term90126, term90126.getClass(), "layoutMgr", null);
        setField(term90126, term90126.getClass(), "dispatcher", null);
        setField(term90126, term90126.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term90126, term90126.getClass(), "focusCycleRoot", false);
        setBooleanField(term90126, term90126.getClass(), "focusTraversalPolicyProvider", false);
        setField(term90126, term90126.getClass(), "printingThreads", null);
        setBooleanField(term90126, term90126.getClass(), "printing", false);
        setField(term90126, term90126.getClass(), "containerListener", null);
        setIntField(term90126, term90126.getClass(), "listeningChildren", 0);
        setIntField(term90126, term90126.getClass(), "listeningBoundsChildren", 0);
        setIntField(term90126, term90126.getClass(), "descendantsCount", 0);
        setField(term90126, term90126.getClass(), "preserveBackgroundColor", null);
        setIntField(term90126, term90126.getClass(), "numOfHWComponents", 0);
        setIntField(term90126, term90126.getClass(), "numOfLWComponents", 0);
        setField(term90126, term90126.getClass(), "modalComp", null);
        setField(term90126, term90126.getClass(), "modalAppContext", null);
        setIntField(term90126, term90126.getClass(), "containerSerializedDataVersion", 0);
        setField(term90126, term90126.getClass(), "peer", null);
        setField(term90126, term90126.getClass(), "parent", null);
        setField(term90126, term90126.getClass(), "appContext", null);
        setIntField(term90126, term90126.getClass(), "x", 0);
        setIntField(term90126, term90126.getClass(), "y", 0);
        setIntField(term90126, term90126.getClass(), "width", 0);
        setIntField(term90126, term90126.getClass(), "height", 0);
        setField(term90126, term90126.getClass(), "foreground", null);
        setField(term90126, term90126.getClass(), "background", null);
        setField(term90126, term90126.getClass(), "font", null);
        setField(term90126, term90126.getClass(), "peerFont", null);
        setField(term90126, term90126.getClass(), "cursor", null);
        setField(term90126, term90126.getClass(), "locale", null);
        setField(term90126, term90126.getClass(), "graphicsConfig", null);
        setField(term90126, term90126.getClass(), "bufferStrategy", null);
        setBooleanField(term90126, term90126.getClass(), "ignoreRepaint", false);
        setBooleanField(term90126, term90126.getClass(), "visible", false);
        setBooleanField(term90126, term90126.getClass(), "enabled", false);
        setBooleanField(term90126, term90126.getClass(), "valid", false);
        setField(term90126, term90126.getClass(), "dropTarget", null);
        setField(term90126, term90126.getClass(), "popups", null);
        setField(term90126, term90126.getClass(), "name", null);
        setBooleanField(term90126, term90126.getClass(), "nameExplicitlySet", false);
        setBooleanField(term90126, term90126.getClass(), "focusable", false);
        setIntField(term90126, term90126.getClass(), "isFocusTraversableOverridden", 0);
        setField(term90126, term90126.getClass(), "focusTraversalKeys", null);
        setBooleanField(term90126, term90126.getClass(), "focusTraversalKeysEnabled", false);
        setField(term90126, term90126.getClass(), "acc", null);
        setField(term90126, term90126.getClass(), "minSize", null);
        setBooleanField(term90126, term90126.getClass(), "minSizeSet", false);
        setField(term90126, term90126.getClass(), "prefSize", null);
        setBooleanField(term90126, term90126.getClass(), "prefSizeSet", false);
        setField(term90126, term90126.getClass(), "maxSize", null);
        setBooleanField(term90126, term90126.getClass(), "maxSizeSet", false);
        setField(term90126, term90126.getClass(), "componentOrientation", null);
        setBooleanField(term90126, term90126.getClass(), "newEventsOnly", false);
        setField(term90126, term90126.getClass(), "componentListener", null);
        setField(term90126, term90126.getClass(), "focusListener", null);
        setField(term90126, term90126.getClass(), "hierarchyListener", null);
        setField(term90126, term90126.getClass(), "hierarchyBoundsListener", null);
        setField(term90126, term90126.getClass(), "keyListener", null);
        setField(term90126, term90126.getClass(), "mouseListener", null);
        setField(term90126, term90126.getClass(), "mouseMotionListener", null);
        setField(term90126, term90126.getClass(), "mouseWheelListener", null);
        setField(term90126, term90126.getClass(), "inputMethodListener", null);
        setLongField(term90126, term90126.getClass(), "eventMask", 0L);
        setField(term90126, term90126.getClass(), "changeSupport", null);
        setField(term90126, term90126.getClass(), "objectLock", null);
        setBooleanField(term90126, term90126.getClass(), "isPacked", false);
        setIntField(term90126, term90126.getClass(), "boundsOp", 0);
        setField(term90126, term90126.getClass(), "compoundShape", null);
        setField(term90126, term90126.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term90126, term90126.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term90126, term90126.getClass(), "backgroundEraseDisabled", false);
        setField(term90126, term90126.getClass(), "eventCache", null);
        setBooleanField(term90126, term90126.getClass(), "coalescingEnabled", false);
        setBooleanField(term90126, term90126.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term90126, term90126.getClass(), "componentSerializedDataVersion", 0);
        setField(term90126, term90126.getClass(), "accessibleContext", null);
        term90167 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term90167;
        callMethod(klass, "makeTextField", argTypes, term90126, args);
    }

};


