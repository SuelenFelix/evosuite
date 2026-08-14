package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Integer;

public class TreeCellRenderer_getNodeIcon_175442309734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79043;
     Object term79094;
     Object term79096;
     Object term79098;
     Object term79100;

    public TreeCellRenderer_getNodeIcon_175442309734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79043 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term79043, term79043.getClass(), "treeTableModel", null);
        setField(term79043, term79043.getClass(), "insets", null);
        setIntField(term79043, term79043.getClass(), "pixelsPerLevel", 0);
        setField(term79043, term79043.getClass(), "expandCollapseIconRenderer", null);
        setField(term79043, term79043.getClass(), "expandedIcon", null);
        setField(term79043, term79043.getClass(), "collapsedIcon", null);
        setIntField(term79043, term79043.getClass(), "maxIconWidth", 0);
        setField(term79043, term79043.getClass(), "currentNode", null);
        setField(term79043, term79043.getClass(), "unselectedForeground", null);
        setField(term79043, term79043.getClass(), "unselectedBackground", null);
        setIntField(term79043, term79043.getClass(), "mnemonic", 0);
        setIntField(term79043, term79043.getClass(), "mnemonicIndex", 0);
        setField(term79043, term79043.getClass(), "text", null);
        setField(term79043, term79043.getClass(), "defaultIcon", null);
        setField(term79043, term79043.getClass(), "disabledIcon", null);
        setBooleanField(term79043, term79043.getClass(), "disabledIconSet", false);
        setIntField(term79043, term79043.getClass(), "verticalAlignment", 0);
        setIntField(term79043, term79043.getClass(), "horizontalAlignment", 0);
        setIntField(term79043, term79043.getClass(), "verticalTextPosition", 0);
        setIntField(term79043, term79043.getClass(), "horizontalTextPosition", 0);
        setIntField(term79043, term79043.getClass(), "iconTextGap", 0);
        setField(term79043, term79043.getClass(), "labelFor", null);
        setBooleanField(term79043, term79043.getClass(), "isAlignmentXSet", false);
        setFloatField(term79043, term79043.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79043, term79043.getClass(), "isAlignmentYSet", false);
        setFloatField(term79043, term79043.getClass(), "alignmentY", 0.0F);
        setField(term79043, term79043.getClass(), "ui", null);
        setField(term79043, term79043.getClass(), "listenerList", null);
        setField(term79043, term79043.getClass(), "clientProperties", null);
        setField(term79043, term79043.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79043, term79043.getClass(), "autoscrolls", false);
        setField(term79043, term79043.getClass(), "border", null);
        setIntField(term79043, term79043.getClass(), "flags", 0);
        setField(term79043, term79043.getClass(), "inputVerifier", null);
        setBooleanField(term79043, term79043.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79043, term79043.getClass(), "paintingChild", null);
        setField(term79043, term79043.getClass(), "popupMenu", null);
        setField(term79043, term79043.getClass(), "revalidateRunnableScheduled", null);
        setField(term79043, term79043.getClass(), "focusInputMap", null);
        setField(term79043, term79043.getClass(), "ancestorInputMap", null);
        setField(term79043, term79043.getClass(), "windowInputMap", null);
        setField(term79043, term79043.getClass(), "actionMap", null);
        setField(term79043, term79043.getClass(), "aaHint", null);
        setField(term79043, term79043.getClass(), "lcdRenderingHint", null);
        setField(term79043, term79043.getClass(), "component", null);
        setField(term79043, term79043.getClass(), "layoutMgr", null);
        setField(term79043, term79043.getClass(), "dispatcher", null);
        setField(term79043, term79043.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79043, term79043.getClass(), "focusCycleRoot", false);
        setBooleanField(term79043, term79043.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79043, term79043.getClass(), "printingThreads", null);
        setBooleanField(term79043, term79043.getClass(), "printing", false);
        setField(term79043, term79043.getClass(), "containerListener", null);
        setIntField(term79043, term79043.getClass(), "listeningChildren", 0);
        setIntField(term79043, term79043.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79043, term79043.getClass(), "descendantsCount", 0);
        setField(term79043, term79043.getClass(), "preserveBackgroundColor", null);
        setIntField(term79043, term79043.getClass(), "numOfHWComponents", 0);
        setIntField(term79043, term79043.getClass(), "numOfLWComponents", 0);
        setField(term79043, term79043.getClass(), "modalComp", null);
        setField(term79043, term79043.getClass(), "modalAppContext", null);
        setIntField(term79043, term79043.getClass(), "containerSerializedDataVersion", 0);
        setField(term79043, term79043.getClass(), "peer", null);
        setField(term79043, term79043.getClass(), "parent", null);
        setField(term79043, term79043.getClass(), "appContext", null);
        setIntField(term79043, term79043.getClass(), "x", 0);
        setIntField(term79043, term79043.getClass(), "y", 0);
        setIntField(term79043, term79043.getClass(), "width", 0);
        setIntField(term79043, term79043.getClass(), "height", 0);
        setField(term79043, term79043.getClass(), "foreground", null);
        setField(term79043, term79043.getClass(), "background", null);
        setField(term79043, term79043.getClass(), "font", null);
        setField(term79043, term79043.getClass(), "peerFont", null);
        setField(term79043, term79043.getClass(), "cursor", null);
        setField(term79043, term79043.getClass(), "locale", null);
        setField(term79043, term79043.getClass(), "graphicsConfig", null);
        setField(term79043, term79043.getClass(), "bufferStrategy", null);
        setBooleanField(term79043, term79043.getClass(), "ignoreRepaint", false);
        setBooleanField(term79043, term79043.getClass(), "visible", false);
        setBooleanField(term79043, term79043.getClass(), "enabled", false);
        setBooleanField(term79043, term79043.getClass(), "valid", false);
        setField(term79043, term79043.getClass(), "dropTarget", null);
        setField(term79043, term79043.getClass(), "popups", null);
        setField(term79043, term79043.getClass(), "name", null);
        setBooleanField(term79043, term79043.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79043, term79043.getClass(), "focusable", false);
        setIntField(term79043, term79043.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79043, term79043.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79043, term79043.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79043, term79043.getClass(), "acc", null);
        setField(term79043, term79043.getClass(), "minSize", null);
        setBooleanField(term79043, term79043.getClass(), "minSizeSet", false);
        setField(term79043, term79043.getClass(), "prefSize", null);
        setBooleanField(term79043, term79043.getClass(), "prefSizeSet", false);
        setField(term79043, term79043.getClass(), "maxSize", null);
        setBooleanField(term79043, term79043.getClass(), "maxSizeSet", false);
        setField(term79043, term79043.getClass(), "componentOrientation", null);
        setBooleanField(term79043, term79043.getClass(), "newEventsOnly", false);
        setField(term79043, term79043.getClass(), "componentListener", null);
        setField(term79043, term79043.getClass(), "focusListener", null);
        setField(term79043, term79043.getClass(), "hierarchyListener", null);
        setField(term79043, term79043.getClass(), "hierarchyBoundsListener", null);
        setField(term79043, term79043.getClass(), "keyListener", null);
        setField(term79043, term79043.getClass(), "mouseListener", null);
        setField(term79043, term79043.getClass(), "mouseMotionListener", null);
        setField(term79043, term79043.getClass(), "mouseWheelListener", null);
        setField(term79043, term79043.getClass(), "inputMethodListener", null);
        setLongField(term79043, term79043.getClass(), "eventMask", 0L);
        setField(term79043, term79043.getClass(), "changeSupport", null);
        setField(term79043, term79043.getClass(), "objectLock", null);
        setBooleanField(term79043, term79043.getClass(), "isPacked", false);
        setIntField(term79043, term79043.getClass(), "boundsOp", 0);
        setField(term79043, term79043.getClass(), "compoundShape", null);
        setField(term79043, term79043.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79043, term79043.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79043, term79043.getClass(), "backgroundEraseDisabled", false);
        setField(term79043, term79043.getClass(), "eventCache", null);
        setBooleanField(term79043, term79043.getClass(), "coalescingEnabled", false);
        setBooleanField(term79043, term79043.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79043, term79043.getClass(), "componentSerializedDataVersion", 0);
        setField(term79043, term79043.getClass(), "accessibleContext", null);
        term79094 = new Boolean(false);
        term79096 = new Boolean(false);
        term79098 = new Integer(0);
        term79100 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.JTable");
        argTypes[2] = Class.forName("java.lang.Object");
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term79094;
        args[4] = term79096;
        args[5] = term79098;
        args[6] = term79100;
        callMethod(klass, "getNodeIcon", argTypes, term79043, args);
    }

};


