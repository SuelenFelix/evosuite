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
import java.lang.Integer;

public class StatusPanel_iconForFlag_5446181046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83925;
     Object term83966;
     Object term83968;

    public StatusPanel_iconForFlag_5446181046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83925 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term83925, term83925.getClass(), "carryOn", null);
        setField(term83925, term83925.getClass(), "carryOff", null);
        setField(term83925, term83925.getClass(), "zeroOn", null);
        setField(term83925, term83925.getClass(), "zeroOff", null);
        setField(term83925, term83925.getClass(), "irqOn", null);
        setField(term83925, term83925.getClass(), "irqOff", null);
        setField(term83925, term83925.getClass(), "decimalOn", null);
        setField(term83925, term83925.getClass(), "decimalOff", null);
        setField(term83925, term83925.getClass(), "breakOn", null);
        setField(term83925, term83925.getClass(), "breakOff", null);
        setField(term83925, term83925.getClass(), "overflowOn", null);
        setField(term83925, term83925.getClass(), "overflowOff", null);
        setField(term83925, term83925.getClass(), "negativeOn", null);
        setField(term83925, term83925.getClass(), "negativeOff", null);
        setField(term83925, term83925.getClass(), "carryFlagLabel", null);
        setField(term83925, term83925.getClass(), "zeroFlagLabel", null);
        setField(term83925, term83925.getClass(), "irqDisableFlagLabel", null);
        setField(term83925, term83925.getClass(), "decimalModeFlagLabel", null);
        setField(term83925, term83925.getClass(), "breakFlagLabel", null);
        setField(term83925, term83925.getClass(), "overflowFlagLabel", null);
        setField(term83925, term83925.getClass(), "negativeFlagLabel", null);
        setField(term83925, term83925.getClass(), "opcodeField", null);
        setField(term83925, term83925.getClass(), "pcField", null);
        setField(term83925, term83925.getClass(), "spField", null);
        setField(term83925, term83925.getClass(), "aField", null);
        setField(term83925, term83925.getClass(), "xField", null);
        setField(term83925, term83925.getClass(), "yField", null);
        setField(term83925, term83925.getClass(), "machine", null);
        setBooleanField(term83925, term83925.getClass(), "isAlignmentXSet", false);
        setFloatField(term83925, term83925.getClass(), "alignmentX", 0.0F);
        setBooleanField(term83925, term83925.getClass(), "isAlignmentYSet", false);
        setFloatField(term83925, term83925.getClass(), "alignmentY", 0.0F);
        setField(term83925, term83925.getClass(), "ui", null);
        setField(term83925, term83925.getClass(), "listenerList", null);
        setField(term83925, term83925.getClass(), "clientProperties", null);
        setField(term83925, term83925.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term83925, term83925.getClass(), "autoscrolls", false);
        setField(term83925, term83925.getClass(), "border", null);
        setIntField(term83925, term83925.getClass(), "flags", 0);
        setField(term83925, term83925.getClass(), "inputVerifier", null);
        setBooleanField(term83925, term83925.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term83925, term83925.getClass(), "paintingChild", null);
        setField(term83925, term83925.getClass(), "popupMenu", null);
        setField(term83925, term83925.getClass(), "revalidateRunnableScheduled", null);
        setField(term83925, term83925.getClass(), "focusInputMap", null);
        setField(term83925, term83925.getClass(), "ancestorInputMap", null);
        setField(term83925, term83925.getClass(), "windowInputMap", null);
        setField(term83925, term83925.getClass(), "actionMap", null);
        setField(term83925, term83925.getClass(), "aaHint", null);
        setField(term83925, term83925.getClass(), "lcdRenderingHint", null);
        setField(term83925, term83925.getClass(), "component", null);
        setField(term83925, term83925.getClass(), "layoutMgr", null);
        setField(term83925, term83925.getClass(), "dispatcher", null);
        setField(term83925, term83925.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term83925, term83925.getClass(), "focusCycleRoot", false);
        setBooleanField(term83925, term83925.getClass(), "focusTraversalPolicyProvider", false);
        setField(term83925, term83925.getClass(), "printingThreads", null);
        setBooleanField(term83925, term83925.getClass(), "printing", false);
        setField(term83925, term83925.getClass(), "containerListener", null);
        setIntField(term83925, term83925.getClass(), "listeningChildren", 0);
        setIntField(term83925, term83925.getClass(), "listeningBoundsChildren", 0);
        setIntField(term83925, term83925.getClass(), "descendantsCount", 0);
        setField(term83925, term83925.getClass(), "preserveBackgroundColor", null);
        setIntField(term83925, term83925.getClass(), "numOfHWComponents", 0);
        setIntField(term83925, term83925.getClass(), "numOfLWComponents", 0);
        setField(term83925, term83925.getClass(), "modalComp", null);
        setField(term83925, term83925.getClass(), "modalAppContext", null);
        setIntField(term83925, term83925.getClass(), "containerSerializedDataVersion", 0);
        setField(term83925, term83925.getClass(), "peer", null);
        setField(term83925, term83925.getClass(), "parent", null);
        setField(term83925, term83925.getClass(), "appContext", null);
        setIntField(term83925, term83925.getClass(), "x", 0);
        setIntField(term83925, term83925.getClass(), "y", 0);
        setIntField(term83925, term83925.getClass(), "width", 0);
        setIntField(term83925, term83925.getClass(), "height", 0);
        setField(term83925, term83925.getClass(), "foreground", null);
        setField(term83925, term83925.getClass(), "background", null);
        setField(term83925, term83925.getClass(), "font", null);
        setField(term83925, term83925.getClass(), "peerFont", null);
        setField(term83925, term83925.getClass(), "cursor", null);
        setField(term83925, term83925.getClass(), "locale", null);
        setField(term83925, term83925.getClass(), "graphicsConfig", null);
        setField(term83925, term83925.getClass(), "bufferStrategy", null);
        setBooleanField(term83925, term83925.getClass(), "ignoreRepaint", false);
        setBooleanField(term83925, term83925.getClass(), "visible", false);
        setBooleanField(term83925, term83925.getClass(), "enabled", false);
        setBooleanField(term83925, term83925.getClass(), "valid", false);
        setField(term83925, term83925.getClass(), "dropTarget", null);
        setField(term83925, term83925.getClass(), "popups", null);
        setField(term83925, term83925.getClass(), "name", null);
        setBooleanField(term83925, term83925.getClass(), "nameExplicitlySet", false);
        setBooleanField(term83925, term83925.getClass(), "focusable", false);
        setIntField(term83925, term83925.getClass(), "isFocusTraversableOverridden", 0);
        setField(term83925, term83925.getClass(), "focusTraversalKeys", null);
        setBooleanField(term83925, term83925.getClass(), "focusTraversalKeysEnabled", false);
        setField(term83925, term83925.getClass(), "acc", null);
        setField(term83925, term83925.getClass(), "minSize", null);
        setBooleanField(term83925, term83925.getClass(), "minSizeSet", false);
        setField(term83925, term83925.getClass(), "prefSize", null);
        setBooleanField(term83925, term83925.getClass(), "prefSizeSet", false);
        setField(term83925, term83925.getClass(), "maxSize", null);
        setBooleanField(term83925, term83925.getClass(), "maxSizeSet", false);
        setField(term83925, term83925.getClass(), "componentOrientation", null);
        setBooleanField(term83925, term83925.getClass(), "newEventsOnly", false);
        setField(term83925, term83925.getClass(), "componentListener", null);
        setField(term83925, term83925.getClass(), "focusListener", null);
        setField(term83925, term83925.getClass(), "hierarchyListener", null);
        setField(term83925, term83925.getClass(), "hierarchyBoundsListener", null);
        setField(term83925, term83925.getClass(), "keyListener", null);
        setField(term83925, term83925.getClass(), "mouseListener", null);
        setField(term83925, term83925.getClass(), "mouseMotionListener", null);
        setField(term83925, term83925.getClass(), "mouseWheelListener", null);
        setField(term83925, term83925.getClass(), "inputMethodListener", null);
        setLongField(term83925, term83925.getClass(), "eventMask", 0L);
        setField(term83925, term83925.getClass(), "changeSupport", null);
        setField(term83925, term83925.getClass(), "objectLock", null);
        setBooleanField(term83925, term83925.getClass(), "isPacked", false);
        setIntField(term83925, term83925.getClass(), "boundsOp", 0);
        setField(term83925, term83925.getClass(), "compoundShape", null);
        setField(term83925, term83925.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term83925, term83925.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term83925, term83925.getClass(), "backgroundEraseDisabled", false);
        setField(term83925, term83925.getClass(), "eventCache", null);
        setBooleanField(term83925, term83925.getClass(), "coalescingEnabled", false);
        setBooleanField(term83925, term83925.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term83925, term83925.getClass(), "componentSerializedDataVersion", 0);
        setField(term83925, term83925.getClass(), "accessibleContext", null);
        term83966 = new Integer(0);
        term83968 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term83966;
        args[1] = term83968;
        callMethod(klass, "iconForFlag", argTypes, term83925, args);
    }

};


