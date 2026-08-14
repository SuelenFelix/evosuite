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

public class StatusPanel_makeLabel_17124002178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87001;

    public StatusPanel_makeLabel_17124002178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87001 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term87001, term87001.getClass(), "carryOn", null);
        setField(term87001, term87001.getClass(), "carryOff", null);
        setField(term87001, term87001.getClass(), "zeroOn", null);
        setField(term87001, term87001.getClass(), "zeroOff", null);
        setField(term87001, term87001.getClass(), "irqOn", null);
        setField(term87001, term87001.getClass(), "irqOff", null);
        setField(term87001, term87001.getClass(), "decimalOn", null);
        setField(term87001, term87001.getClass(), "decimalOff", null);
        setField(term87001, term87001.getClass(), "breakOn", null);
        setField(term87001, term87001.getClass(), "breakOff", null);
        setField(term87001, term87001.getClass(), "overflowOn", null);
        setField(term87001, term87001.getClass(), "overflowOff", null);
        setField(term87001, term87001.getClass(), "negativeOn", null);
        setField(term87001, term87001.getClass(), "negativeOff", null);
        setField(term87001, term87001.getClass(), "carryFlagLabel", null);
        setField(term87001, term87001.getClass(), "zeroFlagLabel", null);
        setField(term87001, term87001.getClass(), "irqDisableFlagLabel", null);
        setField(term87001, term87001.getClass(), "decimalModeFlagLabel", null);
        setField(term87001, term87001.getClass(), "breakFlagLabel", null);
        setField(term87001, term87001.getClass(), "overflowFlagLabel", null);
        setField(term87001, term87001.getClass(), "negativeFlagLabel", null);
        setField(term87001, term87001.getClass(), "opcodeField", null);
        setField(term87001, term87001.getClass(), "pcField", null);
        setField(term87001, term87001.getClass(), "spField", null);
        setField(term87001, term87001.getClass(), "aField", null);
        setField(term87001, term87001.getClass(), "xField", null);
        setField(term87001, term87001.getClass(), "yField", null);
        setField(term87001, term87001.getClass(), "machine", null);
        setBooleanField(term87001, term87001.getClass(), "isAlignmentXSet", false);
        setFloatField(term87001, term87001.getClass(), "alignmentX", 0.0F);
        setBooleanField(term87001, term87001.getClass(), "isAlignmentYSet", false);
        setFloatField(term87001, term87001.getClass(), "alignmentY", 0.0F);
        setField(term87001, term87001.getClass(), "ui", null);
        setField(term87001, term87001.getClass(), "listenerList", null);
        setField(term87001, term87001.getClass(), "clientProperties", null);
        setField(term87001, term87001.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term87001, term87001.getClass(), "autoscrolls", false);
        setField(term87001, term87001.getClass(), "border", null);
        setIntField(term87001, term87001.getClass(), "flags", 0);
        setField(term87001, term87001.getClass(), "inputVerifier", null);
        setBooleanField(term87001, term87001.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term87001, term87001.getClass(), "paintingChild", null);
        setField(term87001, term87001.getClass(), "popupMenu", null);
        setField(term87001, term87001.getClass(), "revalidateRunnableScheduled", null);
        setField(term87001, term87001.getClass(), "focusInputMap", null);
        setField(term87001, term87001.getClass(), "ancestorInputMap", null);
        setField(term87001, term87001.getClass(), "windowInputMap", null);
        setField(term87001, term87001.getClass(), "actionMap", null);
        setField(term87001, term87001.getClass(), "aaHint", null);
        setField(term87001, term87001.getClass(), "lcdRenderingHint", null);
        setField(term87001, term87001.getClass(), "component", null);
        setField(term87001, term87001.getClass(), "layoutMgr", null);
        setField(term87001, term87001.getClass(), "dispatcher", null);
        setField(term87001, term87001.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term87001, term87001.getClass(), "focusCycleRoot", false);
        setBooleanField(term87001, term87001.getClass(), "focusTraversalPolicyProvider", false);
        setField(term87001, term87001.getClass(), "printingThreads", null);
        setBooleanField(term87001, term87001.getClass(), "printing", false);
        setField(term87001, term87001.getClass(), "containerListener", null);
        setIntField(term87001, term87001.getClass(), "listeningChildren", 0);
        setIntField(term87001, term87001.getClass(), "listeningBoundsChildren", 0);
        setIntField(term87001, term87001.getClass(), "descendantsCount", 0);
        setField(term87001, term87001.getClass(), "preserveBackgroundColor", null);
        setIntField(term87001, term87001.getClass(), "numOfHWComponents", 0);
        setIntField(term87001, term87001.getClass(), "numOfLWComponents", 0);
        setField(term87001, term87001.getClass(), "modalComp", null);
        setField(term87001, term87001.getClass(), "modalAppContext", null);
        setIntField(term87001, term87001.getClass(), "containerSerializedDataVersion", 0);
        setField(term87001, term87001.getClass(), "peer", null);
        setField(term87001, term87001.getClass(), "parent", null);
        setField(term87001, term87001.getClass(), "appContext", null);
        setIntField(term87001, term87001.getClass(), "x", 0);
        setIntField(term87001, term87001.getClass(), "y", 0);
        setIntField(term87001, term87001.getClass(), "width", 0);
        setIntField(term87001, term87001.getClass(), "height", 0);
        setField(term87001, term87001.getClass(), "foreground", null);
        setField(term87001, term87001.getClass(), "background", null);
        setField(term87001, term87001.getClass(), "font", null);
        setField(term87001, term87001.getClass(), "peerFont", null);
        setField(term87001, term87001.getClass(), "cursor", null);
        setField(term87001, term87001.getClass(), "locale", null);
        setField(term87001, term87001.getClass(), "graphicsConfig", null);
        setField(term87001, term87001.getClass(), "bufferStrategy", null);
        setBooleanField(term87001, term87001.getClass(), "ignoreRepaint", false);
        setBooleanField(term87001, term87001.getClass(), "visible", false);
        setBooleanField(term87001, term87001.getClass(), "enabled", false);
        setBooleanField(term87001, term87001.getClass(), "valid", false);
        setField(term87001, term87001.getClass(), "dropTarget", null);
        setField(term87001, term87001.getClass(), "popups", null);
        setField(term87001, term87001.getClass(), "name", null);
        setBooleanField(term87001, term87001.getClass(), "nameExplicitlySet", false);
        setBooleanField(term87001, term87001.getClass(), "focusable", false);
        setIntField(term87001, term87001.getClass(), "isFocusTraversableOverridden", 0);
        setField(term87001, term87001.getClass(), "focusTraversalKeys", null);
        setBooleanField(term87001, term87001.getClass(), "focusTraversalKeysEnabled", false);
        setField(term87001, term87001.getClass(), "acc", null);
        setField(term87001, term87001.getClass(), "minSize", null);
        setBooleanField(term87001, term87001.getClass(), "minSizeSet", false);
        setField(term87001, term87001.getClass(), "prefSize", null);
        setBooleanField(term87001, term87001.getClass(), "prefSizeSet", false);
        setField(term87001, term87001.getClass(), "maxSize", null);
        setBooleanField(term87001, term87001.getClass(), "maxSizeSet", false);
        setField(term87001, term87001.getClass(), "componentOrientation", null);
        setBooleanField(term87001, term87001.getClass(), "newEventsOnly", false);
        setField(term87001, term87001.getClass(), "componentListener", null);
        setField(term87001, term87001.getClass(), "focusListener", null);
        setField(term87001, term87001.getClass(), "hierarchyListener", null);
        setField(term87001, term87001.getClass(), "hierarchyBoundsListener", null);
        setField(term87001, term87001.getClass(), "keyListener", null);
        setField(term87001, term87001.getClass(), "mouseListener", null);
        setField(term87001, term87001.getClass(), "mouseMotionListener", null);
        setField(term87001, term87001.getClass(), "mouseWheelListener", null);
        setField(term87001, term87001.getClass(), "inputMethodListener", null);
        setLongField(term87001, term87001.getClass(), "eventMask", 0L);
        setField(term87001, term87001.getClass(), "changeSupport", null);
        setField(term87001, term87001.getClass(), "objectLock", null);
        setBooleanField(term87001, term87001.getClass(), "isPacked", false);
        setIntField(term87001, term87001.getClass(), "boundsOp", 0);
        setField(term87001, term87001.getClass(), "compoundShape", null);
        setField(term87001, term87001.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term87001, term87001.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term87001, term87001.getClass(), "backgroundEraseDisabled", false);
        setField(term87001, term87001.getClass(), "eventCache", null);
        setBooleanField(term87001, term87001.getClass(), "coalescingEnabled", false);
        setBooleanField(term87001, term87001.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term87001, term87001.getClass(), "componentSerializedDataVersion", 0);
        setField(term87001, term87001.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "makeLabel", argTypes, term87001, args);
    }

};


