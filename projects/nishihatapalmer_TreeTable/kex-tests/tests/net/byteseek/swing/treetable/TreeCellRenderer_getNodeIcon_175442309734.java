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
     Object term79680;
     Object term79731;
     Object term79733;
     Object term79735;
     Object term79737;

    public TreeCellRenderer_getNodeIcon_175442309734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79680 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term79680, term79680.getClass(), "treeTableModel", null);
        setField(term79680, term79680.getClass(), "insets", null);
        setIntField(term79680, term79680.getClass(), "pixelsPerLevel", 0);
        setField(term79680, term79680.getClass(), "expandCollapseIconRenderer", null);
        setField(term79680, term79680.getClass(), "expandedIcon", null);
        setField(term79680, term79680.getClass(), "collapsedIcon", null);
        setIntField(term79680, term79680.getClass(), "maxIconWidth", 0);
        setField(term79680, term79680.getClass(), "currentNode", null);
        setField(term79680, term79680.getClass(), "unselectedForeground", null);
        setField(term79680, term79680.getClass(), "unselectedBackground", null);
        setIntField(term79680, term79680.getClass(), "mnemonic", 0);
        setIntField(term79680, term79680.getClass(), "mnemonicIndex", 0);
        setField(term79680, term79680.getClass(), "text", null);
        setField(term79680, term79680.getClass(), "defaultIcon", null);
        setField(term79680, term79680.getClass(), "disabledIcon", null);
        setBooleanField(term79680, term79680.getClass(), "disabledIconSet", false);
        setIntField(term79680, term79680.getClass(), "verticalAlignment", 0);
        setIntField(term79680, term79680.getClass(), "horizontalAlignment", 0);
        setIntField(term79680, term79680.getClass(), "verticalTextPosition", 0);
        setIntField(term79680, term79680.getClass(), "horizontalTextPosition", 0);
        setIntField(term79680, term79680.getClass(), "iconTextGap", 0);
        setField(term79680, term79680.getClass(), "labelFor", null);
        setBooleanField(term79680, term79680.getClass(), "isAlignmentXSet", false);
        setFloatField(term79680, term79680.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79680, term79680.getClass(), "isAlignmentYSet", false);
        setFloatField(term79680, term79680.getClass(), "alignmentY", 0.0F);
        setField(term79680, term79680.getClass(), "ui", null);
        setField(term79680, term79680.getClass(), "listenerList", null);
        setField(term79680, term79680.getClass(), "clientProperties", null);
        setField(term79680, term79680.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79680, term79680.getClass(), "autoscrolls", false);
        setField(term79680, term79680.getClass(), "border", null);
        setIntField(term79680, term79680.getClass(), "flags", 0);
        setField(term79680, term79680.getClass(), "inputVerifier", null);
        setBooleanField(term79680, term79680.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79680, term79680.getClass(), "paintingChild", null);
        setField(term79680, term79680.getClass(), "popupMenu", null);
        setField(term79680, term79680.getClass(), "revalidateRunnableScheduled", null);
        setField(term79680, term79680.getClass(), "focusInputMap", null);
        setField(term79680, term79680.getClass(), "ancestorInputMap", null);
        setField(term79680, term79680.getClass(), "windowInputMap", null);
        setField(term79680, term79680.getClass(), "actionMap", null);
        setField(term79680, term79680.getClass(), "aaHint", null);
        setField(term79680, term79680.getClass(), "lcdRenderingHint", null);
        setField(term79680, term79680.getClass(), "component", null);
        setField(term79680, term79680.getClass(), "layoutMgr", null);
        setField(term79680, term79680.getClass(), "dispatcher", null);
        setField(term79680, term79680.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79680, term79680.getClass(), "focusCycleRoot", false);
        setBooleanField(term79680, term79680.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79680, term79680.getClass(), "printingThreads", null);
        setBooleanField(term79680, term79680.getClass(), "printing", false);
        setField(term79680, term79680.getClass(), "containerListener", null);
        setIntField(term79680, term79680.getClass(), "listeningChildren", 0);
        setIntField(term79680, term79680.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79680, term79680.getClass(), "descendantsCount", 0);
        setField(term79680, term79680.getClass(), "preserveBackgroundColor", null);
        setIntField(term79680, term79680.getClass(), "numOfHWComponents", 0);
        setIntField(term79680, term79680.getClass(), "numOfLWComponents", 0);
        setField(term79680, term79680.getClass(), "modalComp", null);
        setField(term79680, term79680.getClass(), "modalAppContext", null);
        setIntField(term79680, term79680.getClass(), "containerSerializedDataVersion", 0);
        setField(term79680, term79680.getClass(), "peer", null);
        setField(term79680, term79680.getClass(), "parent", null);
        setField(term79680, term79680.getClass(), "appContext", null);
        setIntField(term79680, term79680.getClass(), "x", 0);
        setIntField(term79680, term79680.getClass(), "y", 0);
        setIntField(term79680, term79680.getClass(), "width", 0);
        setIntField(term79680, term79680.getClass(), "height", 0);
        setField(term79680, term79680.getClass(), "foreground", null);
        setField(term79680, term79680.getClass(), "background", null);
        setField(term79680, term79680.getClass(), "font", null);
        setField(term79680, term79680.getClass(), "peerFont", null);
        setField(term79680, term79680.getClass(), "cursor", null);
        setField(term79680, term79680.getClass(), "locale", null);
        setField(term79680, term79680.getClass(), "graphicsConfig", null);
        setField(term79680, term79680.getClass(), "bufferStrategy", null);
        setBooleanField(term79680, term79680.getClass(), "ignoreRepaint", false);
        setBooleanField(term79680, term79680.getClass(), "visible", false);
        setBooleanField(term79680, term79680.getClass(), "enabled", false);
        setBooleanField(term79680, term79680.getClass(), "valid", false);
        setField(term79680, term79680.getClass(), "dropTarget", null);
        setField(term79680, term79680.getClass(), "popups", null);
        setField(term79680, term79680.getClass(), "name", null);
        setBooleanField(term79680, term79680.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79680, term79680.getClass(), "focusable", false);
        setIntField(term79680, term79680.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79680, term79680.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79680, term79680.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79680, term79680.getClass(), "acc", null);
        setField(term79680, term79680.getClass(), "minSize", null);
        setBooleanField(term79680, term79680.getClass(), "minSizeSet", false);
        setField(term79680, term79680.getClass(), "prefSize", null);
        setBooleanField(term79680, term79680.getClass(), "prefSizeSet", false);
        setField(term79680, term79680.getClass(), "maxSize", null);
        setBooleanField(term79680, term79680.getClass(), "maxSizeSet", false);
        setField(term79680, term79680.getClass(), "componentOrientation", null);
        setBooleanField(term79680, term79680.getClass(), "newEventsOnly", false);
        setField(term79680, term79680.getClass(), "componentListener", null);
        setField(term79680, term79680.getClass(), "focusListener", null);
        setField(term79680, term79680.getClass(), "hierarchyListener", null);
        setField(term79680, term79680.getClass(), "hierarchyBoundsListener", null);
        setField(term79680, term79680.getClass(), "keyListener", null);
        setField(term79680, term79680.getClass(), "mouseListener", null);
        setField(term79680, term79680.getClass(), "mouseMotionListener", null);
        setField(term79680, term79680.getClass(), "mouseWheelListener", null);
        setField(term79680, term79680.getClass(), "inputMethodListener", null);
        setLongField(term79680, term79680.getClass(), "eventMask", 0L);
        setField(term79680, term79680.getClass(), "changeSupport", null);
        setField(term79680, term79680.getClass(), "objectLock", null);
        setBooleanField(term79680, term79680.getClass(), "isPacked", false);
        setIntField(term79680, term79680.getClass(), "boundsOp", 0);
        setField(term79680, term79680.getClass(), "compoundShape", null);
        setField(term79680, term79680.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79680, term79680.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79680, term79680.getClass(), "backgroundEraseDisabled", false);
        setField(term79680, term79680.getClass(), "eventCache", null);
        setBooleanField(term79680, term79680.getClass(), "coalescingEnabled", false);
        setBooleanField(term79680, term79680.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79680, term79680.getClass(), "componentSerializedDataVersion", 0);
        setField(term79680, term79680.getClass(), "accessibleContext", null);
        term79731 = new Boolean(false);
        term79733 = new Boolean(false);
        term79735 = new Integer(0);
        term79737 = new Integer(0);
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
        args[3] = term79731;
        args[4] = term79733;
        args[5] = term79735;
        args[6] = term79737;
        callMethod(klass, "getNodeIcon", argTypes, term79680, args);
    }

};


