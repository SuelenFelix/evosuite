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

public class TreeCellRenderer_calculateNodeIndent_212031213511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40969;
     Object term41020;
     Object term41022;
     Object term41024;
     Object term41026;

    public TreeCellRenderer_calculateNodeIndent_212031213511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40969 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term40969, term40969.getClass(), "treeTableModel", null);
        setField(term40969, term40969.getClass(), "insets", null);
        setIntField(term40969, term40969.getClass(), "pixelsPerLevel", 0);
        setField(term40969, term40969.getClass(), "expandCollapseIconRenderer", null);
        setField(term40969, term40969.getClass(), "expandedIcon", null);
        setField(term40969, term40969.getClass(), "collapsedIcon", null);
        setIntField(term40969, term40969.getClass(), "maxIconWidth", 0);
        setField(term40969, term40969.getClass(), "currentNode", null);
        setField(term40969, term40969.getClass(), "unselectedForeground", null);
        setField(term40969, term40969.getClass(), "unselectedBackground", null);
        setIntField(term40969, term40969.getClass(), "mnemonic", 0);
        setIntField(term40969, term40969.getClass(), "mnemonicIndex", 0);
        setField(term40969, term40969.getClass(), "text", null);
        setField(term40969, term40969.getClass(), "defaultIcon", null);
        setField(term40969, term40969.getClass(), "disabledIcon", null);
        setBooleanField(term40969, term40969.getClass(), "disabledIconSet", false);
        setIntField(term40969, term40969.getClass(), "verticalAlignment", 0);
        setIntField(term40969, term40969.getClass(), "horizontalAlignment", 0);
        setIntField(term40969, term40969.getClass(), "verticalTextPosition", 0);
        setIntField(term40969, term40969.getClass(), "horizontalTextPosition", 0);
        setIntField(term40969, term40969.getClass(), "iconTextGap", 0);
        setField(term40969, term40969.getClass(), "labelFor", null);
        setBooleanField(term40969, term40969.getClass(), "isAlignmentXSet", false);
        setFloatField(term40969, term40969.getClass(), "alignmentX", 0.0F);
        setBooleanField(term40969, term40969.getClass(), "isAlignmentYSet", false);
        setFloatField(term40969, term40969.getClass(), "alignmentY", 0.0F);
        setField(term40969, term40969.getClass(), "ui", null);
        setField(term40969, term40969.getClass(), "listenerList", null);
        setField(term40969, term40969.getClass(), "clientProperties", null);
        setField(term40969, term40969.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term40969, term40969.getClass(), "autoscrolls", false);
        setField(term40969, term40969.getClass(), "border", null);
        setIntField(term40969, term40969.getClass(), "flags", 0);
        setField(term40969, term40969.getClass(), "inputVerifier", null);
        setBooleanField(term40969, term40969.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term40969, term40969.getClass(), "paintingChild", null);
        setField(term40969, term40969.getClass(), "popupMenu", null);
        setField(term40969, term40969.getClass(), "revalidateRunnableScheduled", null);
        setField(term40969, term40969.getClass(), "focusInputMap", null);
        setField(term40969, term40969.getClass(), "ancestorInputMap", null);
        setField(term40969, term40969.getClass(), "windowInputMap", null);
        setField(term40969, term40969.getClass(), "actionMap", null);
        setField(term40969, term40969.getClass(), "aaHint", null);
        setField(term40969, term40969.getClass(), "lcdRenderingHint", null);
        setField(term40969, term40969.getClass(), "component", null);
        setField(term40969, term40969.getClass(), "layoutMgr", null);
        setField(term40969, term40969.getClass(), "dispatcher", null);
        setField(term40969, term40969.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term40969, term40969.getClass(), "focusCycleRoot", false);
        setBooleanField(term40969, term40969.getClass(), "focusTraversalPolicyProvider", false);
        setField(term40969, term40969.getClass(), "printingThreads", null);
        setBooleanField(term40969, term40969.getClass(), "printing", false);
        setField(term40969, term40969.getClass(), "containerListener", null);
        setIntField(term40969, term40969.getClass(), "listeningChildren", 0);
        setIntField(term40969, term40969.getClass(), "listeningBoundsChildren", 0);
        setIntField(term40969, term40969.getClass(), "descendantsCount", 0);
        setField(term40969, term40969.getClass(), "preserveBackgroundColor", null);
        setIntField(term40969, term40969.getClass(), "numOfHWComponents", 0);
        setIntField(term40969, term40969.getClass(), "numOfLWComponents", 0);
        setField(term40969, term40969.getClass(), "modalComp", null);
        setField(term40969, term40969.getClass(), "modalAppContext", null);
        setIntField(term40969, term40969.getClass(), "containerSerializedDataVersion", 0);
        setField(term40969, term40969.getClass(), "peer", null);
        setField(term40969, term40969.getClass(), "parent", null);
        setField(term40969, term40969.getClass(), "appContext", null);
        setIntField(term40969, term40969.getClass(), "x", 0);
        setIntField(term40969, term40969.getClass(), "y", 0);
        setIntField(term40969, term40969.getClass(), "width", 0);
        setIntField(term40969, term40969.getClass(), "height", 0);
        setField(term40969, term40969.getClass(), "foreground", null);
        setField(term40969, term40969.getClass(), "background", null);
        setField(term40969, term40969.getClass(), "font", null);
        setField(term40969, term40969.getClass(), "peerFont", null);
        setField(term40969, term40969.getClass(), "cursor", null);
        setField(term40969, term40969.getClass(), "locale", null);
        setField(term40969, term40969.getClass(), "graphicsConfig", null);
        setField(term40969, term40969.getClass(), "bufferStrategy", null);
        setBooleanField(term40969, term40969.getClass(), "ignoreRepaint", false);
        setBooleanField(term40969, term40969.getClass(), "visible", false);
        setBooleanField(term40969, term40969.getClass(), "enabled", false);
        setBooleanField(term40969, term40969.getClass(), "valid", false);
        setField(term40969, term40969.getClass(), "dropTarget", null);
        setField(term40969, term40969.getClass(), "popups", null);
        setField(term40969, term40969.getClass(), "name", null);
        setBooleanField(term40969, term40969.getClass(), "nameExplicitlySet", false);
        setBooleanField(term40969, term40969.getClass(), "focusable", false);
        setIntField(term40969, term40969.getClass(), "isFocusTraversableOverridden", 0);
        setField(term40969, term40969.getClass(), "focusTraversalKeys", null);
        setBooleanField(term40969, term40969.getClass(), "focusTraversalKeysEnabled", false);
        setField(term40969, term40969.getClass(), "acc", null);
        setField(term40969, term40969.getClass(), "minSize", null);
        setBooleanField(term40969, term40969.getClass(), "minSizeSet", false);
        setField(term40969, term40969.getClass(), "prefSize", null);
        setBooleanField(term40969, term40969.getClass(), "prefSizeSet", false);
        setField(term40969, term40969.getClass(), "maxSize", null);
        setBooleanField(term40969, term40969.getClass(), "maxSizeSet", false);
        setField(term40969, term40969.getClass(), "componentOrientation", null);
        setBooleanField(term40969, term40969.getClass(), "newEventsOnly", false);
        setField(term40969, term40969.getClass(), "componentListener", null);
        setField(term40969, term40969.getClass(), "focusListener", null);
        setField(term40969, term40969.getClass(), "hierarchyListener", null);
        setField(term40969, term40969.getClass(), "hierarchyBoundsListener", null);
        setField(term40969, term40969.getClass(), "keyListener", null);
        setField(term40969, term40969.getClass(), "mouseListener", null);
        setField(term40969, term40969.getClass(), "mouseMotionListener", null);
        setField(term40969, term40969.getClass(), "mouseWheelListener", null);
        setField(term40969, term40969.getClass(), "inputMethodListener", null);
        setLongField(term40969, term40969.getClass(), "eventMask", 0L);
        setField(term40969, term40969.getClass(), "changeSupport", null);
        setField(term40969, term40969.getClass(), "objectLock", null);
        setBooleanField(term40969, term40969.getClass(), "isPacked", false);
        setIntField(term40969, term40969.getClass(), "boundsOp", 0);
        setField(term40969, term40969.getClass(), "compoundShape", null);
        setField(term40969, term40969.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term40969, term40969.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term40969, term40969.getClass(), "backgroundEraseDisabled", false);
        setField(term40969, term40969.getClass(), "eventCache", null);
        setBooleanField(term40969, term40969.getClass(), "coalescingEnabled", false);
        setBooleanField(term40969, term40969.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term40969, term40969.getClass(), "componentSerializedDataVersion", 0);
        setField(term40969, term40969.getClass(), "accessibleContext", null);
        term41020 = new Boolean(false);
        term41022 = new Boolean(false);
        term41024 = new Integer(0);
        term41026 = new Integer(0);
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
        args[3] = term41020;
        args[4] = term41022;
        args[5] = term41024;
        args[6] = term41026;
        callMethod(klass, "calculateNodeIndent", argTypes, term40969, args);
    }

};


