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
import java.lang.Integer;

public class MemoryWindow_MemoryTableCellRenderer_getTableCellRendererComponent_11771306512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4699;
     Object term4748;
     Object term4750;
     Object term4752;
     Object term4754;

    public MemoryWindow_MemoryTableCellRenderer_getTableCellRendererComponent_11771306512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4699 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableCellRenderer"));
        setField(term4699, term4699.getClass(), "unselectedForeground", null);
        setField(term4699, term4699.getClass(), "unselectedBackground", null);
        setIntField(term4699, term4699.getClass(), "mnemonic", 0);
        setIntField(term4699, term4699.getClass(), "mnemonicIndex", 0);
        setField(term4699, term4699.getClass(), "text", null);
        setField(term4699, term4699.getClass(), "defaultIcon", null);
        setField(term4699, term4699.getClass(), "disabledIcon", null);
        setBooleanField(term4699, term4699.getClass(), "disabledIconSet", false);
        setIntField(term4699, term4699.getClass(), "verticalAlignment", 0);
        setIntField(term4699, term4699.getClass(), "horizontalAlignment", 0);
        setIntField(term4699, term4699.getClass(), "verticalTextPosition", 0);
        setIntField(term4699, term4699.getClass(), "horizontalTextPosition", 0);
        setIntField(term4699, term4699.getClass(), "iconTextGap", 0);
        setField(term4699, term4699.getClass(), "labelFor", null);
        setBooleanField(term4699, term4699.getClass(), "isAlignmentXSet", false);
        setFloatField(term4699, term4699.getClass(), "alignmentX", 0.0F);
        setBooleanField(term4699, term4699.getClass(), "isAlignmentYSet", false);
        setFloatField(term4699, term4699.getClass(), "alignmentY", 0.0F);
        setField(term4699, term4699.getClass(), "ui", null);
        setField(term4699, term4699.getClass(), "listenerList", null);
        setField(term4699, term4699.getClass(), "clientProperties", null);
        setField(term4699, term4699.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term4699, term4699.getClass(), "autoscrolls", false);
        setField(term4699, term4699.getClass(), "border", null);
        setIntField(term4699, term4699.getClass(), "flags", 0);
        setField(term4699, term4699.getClass(), "inputVerifier", null);
        setBooleanField(term4699, term4699.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term4699, term4699.getClass(), "paintingChild", null);
        setField(term4699, term4699.getClass(), "popupMenu", null);
        setField(term4699, term4699.getClass(), "revalidateRunnableScheduled", null);
        setField(term4699, term4699.getClass(), "focusInputMap", null);
        setField(term4699, term4699.getClass(), "ancestorInputMap", null);
        setField(term4699, term4699.getClass(), "windowInputMap", null);
        setField(term4699, term4699.getClass(), "actionMap", null);
        setField(term4699, term4699.getClass(), "aaHint", null);
        setField(term4699, term4699.getClass(), "lcdRenderingHint", null);
        setField(term4699, term4699.getClass(), "component", null);
        setField(term4699, term4699.getClass(), "layoutMgr", null);
        setField(term4699, term4699.getClass(), "dispatcher", null);
        setField(term4699, term4699.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4699, term4699.getClass(), "focusCycleRoot", false);
        setBooleanField(term4699, term4699.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4699, term4699.getClass(), "printingThreads", null);
        setBooleanField(term4699, term4699.getClass(), "printing", false);
        setField(term4699, term4699.getClass(), "containerListener", null);
        setIntField(term4699, term4699.getClass(), "listeningChildren", 0);
        setIntField(term4699, term4699.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4699, term4699.getClass(), "descendantsCount", 0);
        setField(term4699, term4699.getClass(), "preserveBackgroundColor", null);
        setIntField(term4699, term4699.getClass(), "numOfHWComponents", 0);
        setIntField(term4699, term4699.getClass(), "numOfLWComponents", 0);
        setField(term4699, term4699.getClass(), "modalComp", null);
        setField(term4699, term4699.getClass(), "modalAppContext", null);
        setIntField(term4699, term4699.getClass(), "containerSerializedDataVersion", 0);
        setField(term4699, term4699.getClass(), "peer", null);
        setField(term4699, term4699.getClass(), "parent", null);
        setField(term4699, term4699.getClass(), "appContext", null);
        setIntField(term4699, term4699.getClass(), "x", 0);
        setIntField(term4699, term4699.getClass(), "y", 0);
        setIntField(term4699, term4699.getClass(), "width", 0);
        setIntField(term4699, term4699.getClass(), "height", 0);
        setField(term4699, term4699.getClass(), "foreground", null);
        setField(term4699, term4699.getClass(), "background", null);
        setField(term4699, term4699.getClass(), "font", null);
        setField(term4699, term4699.getClass(), "peerFont", null);
        setField(term4699, term4699.getClass(), "cursor", null);
        setField(term4699, term4699.getClass(), "locale", null);
        setField(term4699, term4699.getClass(), "graphicsConfig", null);
        setField(term4699, term4699.getClass(), "bufferStrategy", null);
        setBooleanField(term4699, term4699.getClass(), "ignoreRepaint", false);
        setBooleanField(term4699, term4699.getClass(), "visible", false);
        setBooleanField(term4699, term4699.getClass(), "enabled", false);
        setBooleanField(term4699, term4699.getClass(), "valid", false);
        setField(term4699, term4699.getClass(), "dropTarget", null);
        setField(term4699, term4699.getClass(), "popups", null);
        setField(term4699, term4699.getClass(), "name", null);
        setBooleanField(term4699, term4699.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4699, term4699.getClass(), "focusable", false);
        setIntField(term4699, term4699.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4699, term4699.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4699, term4699.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4699, term4699.getClass(), "acc", null);
        setField(term4699, term4699.getClass(), "minSize", null);
        setBooleanField(term4699, term4699.getClass(), "minSizeSet", false);
        setField(term4699, term4699.getClass(), "prefSize", null);
        setBooleanField(term4699, term4699.getClass(), "prefSizeSet", false);
        setField(term4699, term4699.getClass(), "maxSize", null);
        setBooleanField(term4699, term4699.getClass(), "maxSizeSet", false);
        setField(term4699, term4699.getClass(), "componentOrientation", null);
        setBooleanField(term4699, term4699.getClass(), "newEventsOnly", false);
        setField(term4699, term4699.getClass(), "componentListener", null);
        setField(term4699, term4699.getClass(), "focusListener", null);
        setField(term4699, term4699.getClass(), "hierarchyListener", null);
        setField(term4699, term4699.getClass(), "hierarchyBoundsListener", null);
        setField(term4699, term4699.getClass(), "keyListener", null);
        setField(term4699, term4699.getClass(), "mouseListener", null);
        setField(term4699, term4699.getClass(), "mouseMotionListener", null);
        setField(term4699, term4699.getClass(), "mouseWheelListener", null);
        setField(term4699, term4699.getClass(), "inputMethodListener", null);
        setLongField(term4699, term4699.getClass(), "eventMask", 0L);
        setField(term4699, term4699.getClass(), "changeSupport", null);
        setField(term4699, term4699.getClass(), "objectLock", null);
        setBooleanField(term4699, term4699.getClass(), "isPacked", false);
        setIntField(term4699, term4699.getClass(), "boundsOp", 0);
        setField(term4699, term4699.getClass(), "compoundShape", null);
        setField(term4699, term4699.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4699, term4699.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4699, term4699.getClass(), "backgroundEraseDisabled", false);
        setField(term4699, term4699.getClass(), "eventCache", null);
        setBooleanField(term4699, term4699.getClass(), "coalescingEnabled", false);
        setBooleanField(term4699, term4699.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4699, term4699.getClass(), "componentSerializedDataVersion", 0);
        setField(term4699, term4699.getClass(), "accessibleContext", null);
        term4748 = new Boolean(false);
        term4750 = new Boolean(false);
        term4752 = new Integer(0);
        term4754 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableCellRenderer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term4748;
        args[3] = term4750;
        args[4] = term4752;
        args[5] = term4754;
        callMethod(klass, "getTableCellRendererComponent", argTypes, term4699, args);
    }

};


