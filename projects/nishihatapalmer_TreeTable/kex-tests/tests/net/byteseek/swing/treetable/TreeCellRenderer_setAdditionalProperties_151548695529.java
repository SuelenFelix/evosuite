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

public class TreeCellRenderer_setAdditionalProperties_151548695529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74375;
     Object term74426;
     Object term74428;
     Object term74430;
     Object term74432;

    public TreeCellRenderer_setAdditionalProperties_151548695529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74375 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term74375, term74375.getClass(), "treeTableModel", null);
        setField(term74375, term74375.getClass(), "insets", null);
        setIntField(term74375, term74375.getClass(), "pixelsPerLevel", 0);
        setField(term74375, term74375.getClass(), "expandCollapseIconRenderer", null);
        setField(term74375, term74375.getClass(), "expandedIcon", null);
        setField(term74375, term74375.getClass(), "collapsedIcon", null);
        setIntField(term74375, term74375.getClass(), "maxIconWidth", 0);
        setField(term74375, term74375.getClass(), "currentNode", null);
        setField(term74375, term74375.getClass(), "unselectedForeground", null);
        setField(term74375, term74375.getClass(), "unselectedBackground", null);
        setIntField(term74375, term74375.getClass(), "mnemonic", 0);
        setIntField(term74375, term74375.getClass(), "mnemonicIndex", 0);
        setField(term74375, term74375.getClass(), "text", null);
        setField(term74375, term74375.getClass(), "defaultIcon", null);
        setField(term74375, term74375.getClass(), "disabledIcon", null);
        setBooleanField(term74375, term74375.getClass(), "disabledIconSet", false);
        setIntField(term74375, term74375.getClass(), "verticalAlignment", 0);
        setIntField(term74375, term74375.getClass(), "horizontalAlignment", 0);
        setIntField(term74375, term74375.getClass(), "verticalTextPosition", 0);
        setIntField(term74375, term74375.getClass(), "horizontalTextPosition", 0);
        setIntField(term74375, term74375.getClass(), "iconTextGap", 0);
        setField(term74375, term74375.getClass(), "labelFor", null);
        setBooleanField(term74375, term74375.getClass(), "isAlignmentXSet", false);
        setFloatField(term74375, term74375.getClass(), "alignmentX", 0.0F);
        setBooleanField(term74375, term74375.getClass(), "isAlignmentYSet", false);
        setFloatField(term74375, term74375.getClass(), "alignmentY", 0.0F);
        setField(term74375, term74375.getClass(), "ui", null);
        setField(term74375, term74375.getClass(), "listenerList", null);
        setField(term74375, term74375.getClass(), "clientProperties", null);
        setField(term74375, term74375.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term74375, term74375.getClass(), "autoscrolls", false);
        setField(term74375, term74375.getClass(), "border", null);
        setIntField(term74375, term74375.getClass(), "flags", 0);
        setField(term74375, term74375.getClass(), "inputVerifier", null);
        setBooleanField(term74375, term74375.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term74375, term74375.getClass(), "paintingChild", null);
        setField(term74375, term74375.getClass(), "popupMenu", null);
        setField(term74375, term74375.getClass(), "revalidateRunnableScheduled", null);
        setField(term74375, term74375.getClass(), "focusInputMap", null);
        setField(term74375, term74375.getClass(), "ancestorInputMap", null);
        setField(term74375, term74375.getClass(), "windowInputMap", null);
        setField(term74375, term74375.getClass(), "actionMap", null);
        setField(term74375, term74375.getClass(), "aaHint", null);
        setField(term74375, term74375.getClass(), "lcdRenderingHint", null);
        setField(term74375, term74375.getClass(), "component", null);
        setField(term74375, term74375.getClass(), "layoutMgr", null);
        setField(term74375, term74375.getClass(), "dispatcher", null);
        setField(term74375, term74375.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term74375, term74375.getClass(), "focusCycleRoot", false);
        setBooleanField(term74375, term74375.getClass(), "focusTraversalPolicyProvider", false);
        setField(term74375, term74375.getClass(), "printingThreads", null);
        setBooleanField(term74375, term74375.getClass(), "printing", false);
        setField(term74375, term74375.getClass(), "containerListener", null);
        setIntField(term74375, term74375.getClass(), "listeningChildren", 0);
        setIntField(term74375, term74375.getClass(), "listeningBoundsChildren", 0);
        setIntField(term74375, term74375.getClass(), "descendantsCount", 0);
        setField(term74375, term74375.getClass(), "preserveBackgroundColor", null);
        setIntField(term74375, term74375.getClass(), "numOfHWComponents", 0);
        setIntField(term74375, term74375.getClass(), "numOfLWComponents", 0);
        setField(term74375, term74375.getClass(), "modalComp", null);
        setField(term74375, term74375.getClass(), "modalAppContext", null);
        setIntField(term74375, term74375.getClass(), "containerSerializedDataVersion", 0);
        setField(term74375, term74375.getClass(), "peer", null);
        setField(term74375, term74375.getClass(), "parent", null);
        setField(term74375, term74375.getClass(), "appContext", null);
        setIntField(term74375, term74375.getClass(), "x", 0);
        setIntField(term74375, term74375.getClass(), "y", 0);
        setIntField(term74375, term74375.getClass(), "width", 0);
        setIntField(term74375, term74375.getClass(), "height", 0);
        setField(term74375, term74375.getClass(), "foreground", null);
        setField(term74375, term74375.getClass(), "background", null);
        setField(term74375, term74375.getClass(), "font", null);
        setField(term74375, term74375.getClass(), "peerFont", null);
        setField(term74375, term74375.getClass(), "cursor", null);
        setField(term74375, term74375.getClass(), "locale", null);
        setField(term74375, term74375.getClass(), "graphicsConfig", null);
        setField(term74375, term74375.getClass(), "bufferStrategy", null);
        setBooleanField(term74375, term74375.getClass(), "ignoreRepaint", false);
        setBooleanField(term74375, term74375.getClass(), "visible", false);
        setBooleanField(term74375, term74375.getClass(), "enabled", false);
        setBooleanField(term74375, term74375.getClass(), "valid", false);
        setField(term74375, term74375.getClass(), "dropTarget", null);
        setField(term74375, term74375.getClass(), "popups", null);
        setField(term74375, term74375.getClass(), "name", null);
        setBooleanField(term74375, term74375.getClass(), "nameExplicitlySet", false);
        setBooleanField(term74375, term74375.getClass(), "focusable", false);
        setIntField(term74375, term74375.getClass(), "isFocusTraversableOverridden", 0);
        setField(term74375, term74375.getClass(), "focusTraversalKeys", null);
        setBooleanField(term74375, term74375.getClass(), "focusTraversalKeysEnabled", false);
        setField(term74375, term74375.getClass(), "acc", null);
        setField(term74375, term74375.getClass(), "minSize", null);
        setBooleanField(term74375, term74375.getClass(), "minSizeSet", false);
        setField(term74375, term74375.getClass(), "prefSize", null);
        setBooleanField(term74375, term74375.getClass(), "prefSizeSet", false);
        setField(term74375, term74375.getClass(), "maxSize", null);
        setBooleanField(term74375, term74375.getClass(), "maxSizeSet", false);
        setField(term74375, term74375.getClass(), "componentOrientation", null);
        setBooleanField(term74375, term74375.getClass(), "newEventsOnly", false);
        setField(term74375, term74375.getClass(), "componentListener", null);
        setField(term74375, term74375.getClass(), "focusListener", null);
        setField(term74375, term74375.getClass(), "hierarchyListener", null);
        setField(term74375, term74375.getClass(), "hierarchyBoundsListener", null);
        setField(term74375, term74375.getClass(), "keyListener", null);
        setField(term74375, term74375.getClass(), "mouseListener", null);
        setField(term74375, term74375.getClass(), "mouseMotionListener", null);
        setField(term74375, term74375.getClass(), "mouseWheelListener", null);
        setField(term74375, term74375.getClass(), "inputMethodListener", null);
        setLongField(term74375, term74375.getClass(), "eventMask", 0L);
        setField(term74375, term74375.getClass(), "changeSupport", null);
        setField(term74375, term74375.getClass(), "objectLock", null);
        setBooleanField(term74375, term74375.getClass(), "isPacked", false);
        setIntField(term74375, term74375.getClass(), "boundsOp", 0);
        setField(term74375, term74375.getClass(), "compoundShape", null);
        setField(term74375, term74375.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term74375, term74375.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term74375, term74375.getClass(), "backgroundEraseDisabled", false);
        setField(term74375, term74375.getClass(), "eventCache", null);
        setBooleanField(term74375, term74375.getClass(), "coalescingEnabled", false);
        setBooleanField(term74375, term74375.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term74375, term74375.getClass(), "componentSerializedDataVersion", 0);
        setField(term74375, term74375.getClass(), "accessibleContext", null);
        term74426 = new Boolean(false);
        term74428 = new Boolean(false);
        term74430 = new Integer(0);
        term74432 = new Integer(0);
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
        args[3] = term74426;
        args[4] = term74428;
        args[5] = term74430;
        args[6] = term74432;
        callMethod(klass, "setAdditionalProperties", argTypes, term74375, args);
    }

};


