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

public class StatusPanel_getHexVal_116610581112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93759;

    public StatusPanel_getHexVal_116610581112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93759 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term93759, term93759.getClass(), "carryOn", null);
        setField(term93759, term93759.getClass(), "carryOff", null);
        setField(term93759, term93759.getClass(), "zeroOn", null);
        setField(term93759, term93759.getClass(), "zeroOff", null);
        setField(term93759, term93759.getClass(), "irqOn", null);
        setField(term93759, term93759.getClass(), "irqOff", null);
        setField(term93759, term93759.getClass(), "decimalOn", null);
        setField(term93759, term93759.getClass(), "decimalOff", null);
        setField(term93759, term93759.getClass(), "breakOn", null);
        setField(term93759, term93759.getClass(), "breakOff", null);
        setField(term93759, term93759.getClass(), "overflowOn", null);
        setField(term93759, term93759.getClass(), "overflowOff", null);
        setField(term93759, term93759.getClass(), "negativeOn", null);
        setField(term93759, term93759.getClass(), "negativeOff", null);
        setField(term93759, term93759.getClass(), "carryFlagLabel", null);
        setField(term93759, term93759.getClass(), "zeroFlagLabel", null);
        setField(term93759, term93759.getClass(), "irqDisableFlagLabel", null);
        setField(term93759, term93759.getClass(), "decimalModeFlagLabel", null);
        setField(term93759, term93759.getClass(), "breakFlagLabel", null);
        setField(term93759, term93759.getClass(), "overflowFlagLabel", null);
        setField(term93759, term93759.getClass(), "negativeFlagLabel", null);
        setField(term93759, term93759.getClass(), "opcodeField", null);
        setField(term93759, term93759.getClass(), "pcField", null);
        setField(term93759, term93759.getClass(), "spField", null);
        setField(term93759, term93759.getClass(), "aField", null);
        setField(term93759, term93759.getClass(), "xField", null);
        setField(term93759, term93759.getClass(), "yField", null);
        setField(term93759, term93759.getClass(), "machine", null);
        setBooleanField(term93759, term93759.getClass(), "isAlignmentXSet", false);
        setFloatField(term93759, term93759.getClass(), "alignmentX", 0.0F);
        setBooleanField(term93759, term93759.getClass(), "isAlignmentYSet", false);
        setFloatField(term93759, term93759.getClass(), "alignmentY", 0.0F);
        setField(term93759, term93759.getClass(), "ui", null);
        setField(term93759, term93759.getClass(), "listenerList", null);
        setField(term93759, term93759.getClass(), "clientProperties", null);
        setField(term93759, term93759.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term93759, term93759.getClass(), "autoscrolls", false);
        setField(term93759, term93759.getClass(), "border", null);
        setIntField(term93759, term93759.getClass(), "flags", 0);
        setField(term93759, term93759.getClass(), "inputVerifier", null);
        setBooleanField(term93759, term93759.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term93759, term93759.getClass(), "paintingChild", null);
        setField(term93759, term93759.getClass(), "popupMenu", null);
        setField(term93759, term93759.getClass(), "revalidateRunnableScheduled", null);
        setField(term93759, term93759.getClass(), "focusInputMap", null);
        setField(term93759, term93759.getClass(), "ancestorInputMap", null);
        setField(term93759, term93759.getClass(), "windowInputMap", null);
        setField(term93759, term93759.getClass(), "actionMap", null);
        setField(term93759, term93759.getClass(), "aaHint", null);
        setField(term93759, term93759.getClass(), "lcdRenderingHint", null);
        setField(term93759, term93759.getClass(), "component", null);
        setField(term93759, term93759.getClass(), "layoutMgr", null);
        setField(term93759, term93759.getClass(), "dispatcher", null);
        setField(term93759, term93759.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term93759, term93759.getClass(), "focusCycleRoot", false);
        setBooleanField(term93759, term93759.getClass(), "focusTraversalPolicyProvider", false);
        setField(term93759, term93759.getClass(), "printingThreads", null);
        setBooleanField(term93759, term93759.getClass(), "printing", false);
        setField(term93759, term93759.getClass(), "containerListener", null);
        setIntField(term93759, term93759.getClass(), "listeningChildren", 0);
        setIntField(term93759, term93759.getClass(), "listeningBoundsChildren", 0);
        setIntField(term93759, term93759.getClass(), "descendantsCount", 0);
        setField(term93759, term93759.getClass(), "preserveBackgroundColor", null);
        setIntField(term93759, term93759.getClass(), "numOfHWComponents", 0);
        setIntField(term93759, term93759.getClass(), "numOfLWComponents", 0);
        setField(term93759, term93759.getClass(), "modalComp", null);
        setField(term93759, term93759.getClass(), "modalAppContext", null);
        setIntField(term93759, term93759.getClass(), "containerSerializedDataVersion", 0);
        setField(term93759, term93759.getClass(), "peer", null);
        setField(term93759, term93759.getClass(), "parent", null);
        setField(term93759, term93759.getClass(), "appContext", null);
        setIntField(term93759, term93759.getClass(), "x", 0);
        setIntField(term93759, term93759.getClass(), "y", 0);
        setIntField(term93759, term93759.getClass(), "width", 0);
        setIntField(term93759, term93759.getClass(), "height", 0);
        setField(term93759, term93759.getClass(), "foreground", null);
        setField(term93759, term93759.getClass(), "background", null);
        setField(term93759, term93759.getClass(), "font", null);
        setField(term93759, term93759.getClass(), "peerFont", null);
        setField(term93759, term93759.getClass(), "cursor", null);
        setField(term93759, term93759.getClass(), "locale", null);
        setField(term93759, term93759.getClass(), "graphicsConfig", null);
        setField(term93759, term93759.getClass(), "bufferStrategy", null);
        setBooleanField(term93759, term93759.getClass(), "ignoreRepaint", false);
        setBooleanField(term93759, term93759.getClass(), "visible", false);
        setBooleanField(term93759, term93759.getClass(), "enabled", false);
        setBooleanField(term93759, term93759.getClass(), "valid", false);
        setField(term93759, term93759.getClass(), "dropTarget", null);
        setField(term93759, term93759.getClass(), "popups", null);
        setField(term93759, term93759.getClass(), "name", null);
        setBooleanField(term93759, term93759.getClass(), "nameExplicitlySet", false);
        setBooleanField(term93759, term93759.getClass(), "focusable", false);
        setIntField(term93759, term93759.getClass(), "isFocusTraversableOverridden", 0);
        setField(term93759, term93759.getClass(), "focusTraversalKeys", null);
        setBooleanField(term93759, term93759.getClass(), "focusTraversalKeysEnabled", false);
        setField(term93759, term93759.getClass(), "acc", null);
        setField(term93759, term93759.getClass(), "minSize", null);
        setBooleanField(term93759, term93759.getClass(), "minSizeSet", false);
        setField(term93759, term93759.getClass(), "prefSize", null);
        setBooleanField(term93759, term93759.getClass(), "prefSizeSet", false);
        setField(term93759, term93759.getClass(), "maxSize", null);
        setBooleanField(term93759, term93759.getClass(), "maxSizeSet", false);
        setField(term93759, term93759.getClass(), "componentOrientation", null);
        setBooleanField(term93759, term93759.getClass(), "newEventsOnly", false);
        setField(term93759, term93759.getClass(), "componentListener", null);
        setField(term93759, term93759.getClass(), "focusListener", null);
        setField(term93759, term93759.getClass(), "hierarchyListener", null);
        setField(term93759, term93759.getClass(), "hierarchyBoundsListener", null);
        setField(term93759, term93759.getClass(), "keyListener", null);
        setField(term93759, term93759.getClass(), "mouseListener", null);
        setField(term93759, term93759.getClass(), "mouseMotionListener", null);
        setField(term93759, term93759.getClass(), "mouseWheelListener", null);
        setField(term93759, term93759.getClass(), "inputMethodListener", null);
        setLongField(term93759, term93759.getClass(), "eventMask", 0L);
        setField(term93759, term93759.getClass(), "changeSupport", null);
        setField(term93759, term93759.getClass(), "objectLock", null);
        setBooleanField(term93759, term93759.getClass(), "isPacked", false);
        setIntField(term93759, term93759.getClass(), "boundsOp", 0);
        setField(term93759, term93759.getClass(), "compoundShape", null);
        setField(term93759, term93759.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term93759, term93759.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term93759, term93759.getClass(), "backgroundEraseDisabled", false);
        setField(term93759, term93759.getClass(), "eventCache", null);
        setBooleanField(term93759, term93759.getClass(), "coalescingEnabled", false);
        setBooleanField(term93759, term93759.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term93759, term93759.getClass(), "componentSerializedDataVersion", 0);
        setField(term93759, term93759.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JTextField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getHexVal", argTypes, term93759, args);
    }

};


