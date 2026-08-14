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

public class StatusPanel_updateState_5488227824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80931;

    public StatusPanel_updateState_5488227824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80931 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term80931, term80931.getClass(), "carryOn", null);
        setField(term80931, term80931.getClass(), "carryOff", null);
        setField(term80931, term80931.getClass(), "zeroOn", null);
        setField(term80931, term80931.getClass(), "zeroOff", null);
        setField(term80931, term80931.getClass(), "irqOn", null);
        setField(term80931, term80931.getClass(), "irqOff", null);
        setField(term80931, term80931.getClass(), "decimalOn", null);
        setField(term80931, term80931.getClass(), "decimalOff", null);
        setField(term80931, term80931.getClass(), "breakOn", null);
        setField(term80931, term80931.getClass(), "breakOff", null);
        setField(term80931, term80931.getClass(), "overflowOn", null);
        setField(term80931, term80931.getClass(), "overflowOff", null);
        setField(term80931, term80931.getClass(), "negativeOn", null);
        setField(term80931, term80931.getClass(), "negativeOff", null);
        setField(term80931, term80931.getClass(), "carryFlagLabel", null);
        setField(term80931, term80931.getClass(), "zeroFlagLabel", null);
        setField(term80931, term80931.getClass(), "irqDisableFlagLabel", null);
        setField(term80931, term80931.getClass(), "decimalModeFlagLabel", null);
        setField(term80931, term80931.getClass(), "breakFlagLabel", null);
        setField(term80931, term80931.getClass(), "overflowFlagLabel", null);
        setField(term80931, term80931.getClass(), "negativeFlagLabel", null);
        setField(term80931, term80931.getClass(), "opcodeField", null);
        setField(term80931, term80931.getClass(), "pcField", null);
        setField(term80931, term80931.getClass(), "spField", null);
        setField(term80931, term80931.getClass(), "aField", null);
        setField(term80931, term80931.getClass(), "xField", null);
        setField(term80931, term80931.getClass(), "yField", null);
        setField(term80931, term80931.getClass(), "machine", null);
        setBooleanField(term80931, term80931.getClass(), "isAlignmentXSet", false);
        setFloatField(term80931, term80931.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80931, term80931.getClass(), "isAlignmentYSet", false);
        setFloatField(term80931, term80931.getClass(), "alignmentY", 0.0F);
        setField(term80931, term80931.getClass(), "ui", null);
        setField(term80931, term80931.getClass(), "listenerList", null);
        setField(term80931, term80931.getClass(), "clientProperties", null);
        setField(term80931, term80931.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80931, term80931.getClass(), "autoscrolls", false);
        setField(term80931, term80931.getClass(), "border", null);
        setIntField(term80931, term80931.getClass(), "flags", 0);
        setField(term80931, term80931.getClass(), "inputVerifier", null);
        setBooleanField(term80931, term80931.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80931, term80931.getClass(), "paintingChild", null);
        setField(term80931, term80931.getClass(), "popupMenu", null);
        setField(term80931, term80931.getClass(), "revalidateRunnableScheduled", null);
        setField(term80931, term80931.getClass(), "focusInputMap", null);
        setField(term80931, term80931.getClass(), "ancestorInputMap", null);
        setField(term80931, term80931.getClass(), "windowInputMap", null);
        setField(term80931, term80931.getClass(), "actionMap", null);
        setField(term80931, term80931.getClass(), "aaHint", null);
        setField(term80931, term80931.getClass(), "lcdRenderingHint", null);
        setField(term80931, term80931.getClass(), "component", null);
        setField(term80931, term80931.getClass(), "layoutMgr", null);
        setField(term80931, term80931.getClass(), "dispatcher", null);
        setField(term80931, term80931.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80931, term80931.getClass(), "focusCycleRoot", false);
        setBooleanField(term80931, term80931.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80931, term80931.getClass(), "printingThreads", null);
        setBooleanField(term80931, term80931.getClass(), "printing", false);
        setField(term80931, term80931.getClass(), "containerListener", null);
        setIntField(term80931, term80931.getClass(), "listeningChildren", 0);
        setIntField(term80931, term80931.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80931, term80931.getClass(), "descendantsCount", 0);
        setField(term80931, term80931.getClass(), "preserveBackgroundColor", null);
        setIntField(term80931, term80931.getClass(), "numOfHWComponents", 0);
        setIntField(term80931, term80931.getClass(), "numOfLWComponents", 0);
        setField(term80931, term80931.getClass(), "modalComp", null);
        setField(term80931, term80931.getClass(), "modalAppContext", null);
        setIntField(term80931, term80931.getClass(), "containerSerializedDataVersion", 0);
        setField(term80931, term80931.getClass(), "peer", null);
        setField(term80931, term80931.getClass(), "parent", null);
        setField(term80931, term80931.getClass(), "appContext", null);
        setIntField(term80931, term80931.getClass(), "x", 0);
        setIntField(term80931, term80931.getClass(), "y", 0);
        setIntField(term80931, term80931.getClass(), "width", 0);
        setIntField(term80931, term80931.getClass(), "height", 0);
        setField(term80931, term80931.getClass(), "foreground", null);
        setField(term80931, term80931.getClass(), "background", null);
        setField(term80931, term80931.getClass(), "font", null);
        setField(term80931, term80931.getClass(), "peerFont", null);
        setField(term80931, term80931.getClass(), "cursor", null);
        setField(term80931, term80931.getClass(), "locale", null);
        setField(term80931, term80931.getClass(), "graphicsConfig", null);
        setField(term80931, term80931.getClass(), "bufferStrategy", null);
        setBooleanField(term80931, term80931.getClass(), "ignoreRepaint", false);
        setBooleanField(term80931, term80931.getClass(), "visible", false);
        setBooleanField(term80931, term80931.getClass(), "enabled", false);
        setBooleanField(term80931, term80931.getClass(), "valid", false);
        setField(term80931, term80931.getClass(), "dropTarget", null);
        setField(term80931, term80931.getClass(), "popups", null);
        setField(term80931, term80931.getClass(), "name", null);
        setBooleanField(term80931, term80931.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80931, term80931.getClass(), "focusable", false);
        setIntField(term80931, term80931.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80931, term80931.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80931, term80931.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80931, term80931.getClass(), "acc", null);
        setField(term80931, term80931.getClass(), "minSize", null);
        setBooleanField(term80931, term80931.getClass(), "minSizeSet", false);
        setField(term80931, term80931.getClass(), "prefSize", null);
        setBooleanField(term80931, term80931.getClass(), "prefSizeSet", false);
        setField(term80931, term80931.getClass(), "maxSize", null);
        setBooleanField(term80931, term80931.getClass(), "maxSizeSet", false);
        setField(term80931, term80931.getClass(), "componentOrientation", null);
        setBooleanField(term80931, term80931.getClass(), "newEventsOnly", false);
        setField(term80931, term80931.getClass(), "componentListener", null);
        setField(term80931, term80931.getClass(), "focusListener", null);
        setField(term80931, term80931.getClass(), "hierarchyListener", null);
        setField(term80931, term80931.getClass(), "hierarchyBoundsListener", null);
        setField(term80931, term80931.getClass(), "keyListener", null);
        setField(term80931, term80931.getClass(), "mouseListener", null);
        setField(term80931, term80931.getClass(), "mouseMotionListener", null);
        setField(term80931, term80931.getClass(), "mouseWheelListener", null);
        setField(term80931, term80931.getClass(), "inputMethodListener", null);
        setLongField(term80931, term80931.getClass(), "eventMask", 0L);
        setField(term80931, term80931.getClass(), "changeSupport", null);
        setField(term80931, term80931.getClass(), "objectLock", null);
        setBooleanField(term80931, term80931.getClass(), "isPacked", false);
        setIntField(term80931, term80931.getClass(), "boundsOp", 0);
        setField(term80931, term80931.getClass(), "compoundShape", null);
        setField(term80931, term80931.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80931, term80931.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80931, term80931.getClass(), "backgroundEraseDisabled", false);
        setField(term80931, term80931.getClass(), "eventCache", null);
        setBooleanField(term80931, term80931.getClass(), "coalescingEnabled", false);
        setBooleanField(term80931, term80931.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80931, term80931.getClass(), "componentSerializedDataVersion", 0);
        setField(term80931, term80931.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateState", argTypes, term80931, args);
    }

};


