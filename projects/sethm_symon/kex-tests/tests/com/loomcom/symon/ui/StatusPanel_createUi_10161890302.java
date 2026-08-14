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

public class StatusPanel_createUi_10161890302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77904;

    public StatusPanel_createUi_10161890302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77904 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel"));
        setField(term77904, term77904.getClass(), "carryOn", null);
        setField(term77904, term77904.getClass(), "carryOff", null);
        setField(term77904, term77904.getClass(), "zeroOn", null);
        setField(term77904, term77904.getClass(), "zeroOff", null);
        setField(term77904, term77904.getClass(), "irqOn", null);
        setField(term77904, term77904.getClass(), "irqOff", null);
        setField(term77904, term77904.getClass(), "decimalOn", null);
        setField(term77904, term77904.getClass(), "decimalOff", null);
        setField(term77904, term77904.getClass(), "breakOn", null);
        setField(term77904, term77904.getClass(), "breakOff", null);
        setField(term77904, term77904.getClass(), "overflowOn", null);
        setField(term77904, term77904.getClass(), "overflowOff", null);
        setField(term77904, term77904.getClass(), "negativeOn", null);
        setField(term77904, term77904.getClass(), "negativeOff", null);
        setField(term77904, term77904.getClass(), "carryFlagLabel", null);
        setField(term77904, term77904.getClass(), "zeroFlagLabel", null);
        setField(term77904, term77904.getClass(), "irqDisableFlagLabel", null);
        setField(term77904, term77904.getClass(), "decimalModeFlagLabel", null);
        setField(term77904, term77904.getClass(), "breakFlagLabel", null);
        setField(term77904, term77904.getClass(), "overflowFlagLabel", null);
        setField(term77904, term77904.getClass(), "negativeFlagLabel", null);
        setField(term77904, term77904.getClass(), "opcodeField", null);
        setField(term77904, term77904.getClass(), "pcField", null);
        setField(term77904, term77904.getClass(), "spField", null);
        setField(term77904, term77904.getClass(), "aField", null);
        setField(term77904, term77904.getClass(), "xField", null);
        setField(term77904, term77904.getClass(), "yField", null);
        setField(term77904, term77904.getClass(), "machine", null);
        setBooleanField(term77904, term77904.getClass(), "isAlignmentXSet", false);
        setFloatField(term77904, term77904.getClass(), "alignmentX", 0.0F);
        setBooleanField(term77904, term77904.getClass(), "isAlignmentYSet", false);
        setFloatField(term77904, term77904.getClass(), "alignmentY", 0.0F);
        setField(term77904, term77904.getClass(), "ui", null);
        setField(term77904, term77904.getClass(), "listenerList", null);
        setField(term77904, term77904.getClass(), "clientProperties", null);
        setField(term77904, term77904.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term77904, term77904.getClass(), "autoscrolls", false);
        setField(term77904, term77904.getClass(), "border", null);
        setIntField(term77904, term77904.getClass(), "flags", 0);
        setField(term77904, term77904.getClass(), "inputVerifier", null);
        setBooleanField(term77904, term77904.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term77904, term77904.getClass(), "paintingChild", null);
        setField(term77904, term77904.getClass(), "popupMenu", null);
        setField(term77904, term77904.getClass(), "revalidateRunnableScheduled", null);
        setField(term77904, term77904.getClass(), "focusInputMap", null);
        setField(term77904, term77904.getClass(), "ancestorInputMap", null);
        setField(term77904, term77904.getClass(), "windowInputMap", null);
        setField(term77904, term77904.getClass(), "actionMap", null);
        setField(term77904, term77904.getClass(), "aaHint", null);
        setField(term77904, term77904.getClass(), "lcdRenderingHint", null);
        setField(term77904, term77904.getClass(), "component", null);
        setField(term77904, term77904.getClass(), "layoutMgr", null);
        setField(term77904, term77904.getClass(), "dispatcher", null);
        setField(term77904, term77904.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term77904, term77904.getClass(), "focusCycleRoot", false);
        setBooleanField(term77904, term77904.getClass(), "focusTraversalPolicyProvider", false);
        setField(term77904, term77904.getClass(), "printingThreads", null);
        setBooleanField(term77904, term77904.getClass(), "printing", false);
        setField(term77904, term77904.getClass(), "containerListener", null);
        setIntField(term77904, term77904.getClass(), "listeningChildren", 0);
        setIntField(term77904, term77904.getClass(), "listeningBoundsChildren", 0);
        setIntField(term77904, term77904.getClass(), "descendantsCount", 0);
        setField(term77904, term77904.getClass(), "preserveBackgroundColor", null);
        setIntField(term77904, term77904.getClass(), "numOfHWComponents", 0);
        setIntField(term77904, term77904.getClass(), "numOfLWComponents", 0);
        setField(term77904, term77904.getClass(), "modalComp", null);
        setField(term77904, term77904.getClass(), "modalAppContext", null);
        setIntField(term77904, term77904.getClass(), "containerSerializedDataVersion", 0);
        setField(term77904, term77904.getClass(), "peer", null);
        setField(term77904, term77904.getClass(), "parent", null);
        setField(term77904, term77904.getClass(), "appContext", null);
        setIntField(term77904, term77904.getClass(), "x", 0);
        setIntField(term77904, term77904.getClass(), "y", 0);
        setIntField(term77904, term77904.getClass(), "width", 0);
        setIntField(term77904, term77904.getClass(), "height", 0);
        setField(term77904, term77904.getClass(), "foreground", null);
        setField(term77904, term77904.getClass(), "background", null);
        setField(term77904, term77904.getClass(), "font", null);
        setField(term77904, term77904.getClass(), "peerFont", null);
        setField(term77904, term77904.getClass(), "cursor", null);
        setField(term77904, term77904.getClass(), "locale", null);
        setField(term77904, term77904.getClass(), "graphicsConfig", null);
        setField(term77904, term77904.getClass(), "bufferStrategy", null);
        setBooleanField(term77904, term77904.getClass(), "ignoreRepaint", false);
        setBooleanField(term77904, term77904.getClass(), "visible", false);
        setBooleanField(term77904, term77904.getClass(), "enabled", false);
        setBooleanField(term77904, term77904.getClass(), "valid", false);
        setField(term77904, term77904.getClass(), "dropTarget", null);
        setField(term77904, term77904.getClass(), "popups", null);
        setField(term77904, term77904.getClass(), "name", null);
        setBooleanField(term77904, term77904.getClass(), "nameExplicitlySet", false);
        setBooleanField(term77904, term77904.getClass(), "focusable", false);
        setIntField(term77904, term77904.getClass(), "isFocusTraversableOverridden", 0);
        setField(term77904, term77904.getClass(), "focusTraversalKeys", null);
        setBooleanField(term77904, term77904.getClass(), "focusTraversalKeysEnabled", false);
        setField(term77904, term77904.getClass(), "acc", null);
        setField(term77904, term77904.getClass(), "minSize", null);
        setBooleanField(term77904, term77904.getClass(), "minSizeSet", false);
        setField(term77904, term77904.getClass(), "prefSize", null);
        setBooleanField(term77904, term77904.getClass(), "prefSizeSet", false);
        setField(term77904, term77904.getClass(), "maxSize", null);
        setBooleanField(term77904, term77904.getClass(), "maxSizeSet", false);
        setField(term77904, term77904.getClass(), "componentOrientation", null);
        setBooleanField(term77904, term77904.getClass(), "newEventsOnly", false);
        setField(term77904, term77904.getClass(), "componentListener", null);
        setField(term77904, term77904.getClass(), "focusListener", null);
        setField(term77904, term77904.getClass(), "hierarchyListener", null);
        setField(term77904, term77904.getClass(), "hierarchyBoundsListener", null);
        setField(term77904, term77904.getClass(), "keyListener", null);
        setField(term77904, term77904.getClass(), "mouseListener", null);
        setField(term77904, term77904.getClass(), "mouseMotionListener", null);
        setField(term77904, term77904.getClass(), "mouseWheelListener", null);
        setField(term77904, term77904.getClass(), "inputMethodListener", null);
        setLongField(term77904, term77904.getClass(), "eventMask", 0L);
        setField(term77904, term77904.getClass(), "changeSupport", null);
        setField(term77904, term77904.getClass(), "objectLock", null);
        setBooleanField(term77904, term77904.getClass(), "isPacked", false);
        setIntField(term77904, term77904.getClass(), "boundsOp", 0);
        setField(term77904, term77904.getClass(), "compoundShape", null);
        setField(term77904, term77904.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term77904, term77904.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term77904, term77904.getClass(), "backgroundEraseDisabled", false);
        setField(term77904, term77904.getClass(), "eventCache", null);
        setBooleanField(term77904, term77904.getClass(), "coalescingEnabled", false);
        setBooleanField(term77904, term77904.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term77904, term77904.getClass(), "componentSerializedDataVersion", 0);
        setField(term77904, term77904.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUi", argTypes, term77904, args);
    }

};


