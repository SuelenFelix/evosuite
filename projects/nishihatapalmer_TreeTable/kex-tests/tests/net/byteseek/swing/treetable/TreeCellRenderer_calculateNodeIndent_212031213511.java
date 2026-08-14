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
     Object term40662;
     Object term40713;
     Object term40715;
     Object term40717;
     Object term40719;

    public TreeCellRenderer_calculateNodeIndent_212031213511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40662 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term40662, term40662.getClass(), "treeTableModel", null);
        setField(term40662, term40662.getClass(), "insets", null);
        setIntField(term40662, term40662.getClass(), "pixelsPerLevel", 0);
        setField(term40662, term40662.getClass(), "expandCollapseIconRenderer", null);
        setField(term40662, term40662.getClass(), "expandedIcon", null);
        setField(term40662, term40662.getClass(), "collapsedIcon", null);
        setIntField(term40662, term40662.getClass(), "maxIconWidth", 0);
        setField(term40662, term40662.getClass(), "currentNode", null);
        setField(term40662, term40662.getClass(), "unselectedForeground", null);
        setField(term40662, term40662.getClass(), "unselectedBackground", null);
        setIntField(term40662, term40662.getClass(), "mnemonic", 0);
        setIntField(term40662, term40662.getClass(), "mnemonicIndex", 0);
        setField(term40662, term40662.getClass(), "text", null);
        setField(term40662, term40662.getClass(), "defaultIcon", null);
        setField(term40662, term40662.getClass(), "disabledIcon", null);
        setBooleanField(term40662, term40662.getClass(), "disabledIconSet", false);
        setIntField(term40662, term40662.getClass(), "verticalAlignment", 0);
        setIntField(term40662, term40662.getClass(), "horizontalAlignment", 0);
        setIntField(term40662, term40662.getClass(), "verticalTextPosition", 0);
        setIntField(term40662, term40662.getClass(), "horizontalTextPosition", 0);
        setIntField(term40662, term40662.getClass(), "iconTextGap", 0);
        setField(term40662, term40662.getClass(), "labelFor", null);
        setBooleanField(term40662, term40662.getClass(), "isAlignmentXSet", false);
        setFloatField(term40662, term40662.getClass(), "alignmentX", 0.0F);
        setBooleanField(term40662, term40662.getClass(), "isAlignmentYSet", false);
        setFloatField(term40662, term40662.getClass(), "alignmentY", 0.0F);
        setField(term40662, term40662.getClass(), "ui", null);
        setField(term40662, term40662.getClass(), "listenerList", null);
        setField(term40662, term40662.getClass(), "clientProperties", null);
        setField(term40662, term40662.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term40662, term40662.getClass(), "autoscrolls", false);
        setField(term40662, term40662.getClass(), "border", null);
        setIntField(term40662, term40662.getClass(), "flags", 0);
        setField(term40662, term40662.getClass(), "inputVerifier", null);
        setBooleanField(term40662, term40662.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term40662, term40662.getClass(), "paintingChild", null);
        setField(term40662, term40662.getClass(), "popupMenu", null);
        setField(term40662, term40662.getClass(), "revalidateRunnableScheduled", null);
        setField(term40662, term40662.getClass(), "focusInputMap", null);
        setField(term40662, term40662.getClass(), "ancestorInputMap", null);
        setField(term40662, term40662.getClass(), "windowInputMap", null);
        setField(term40662, term40662.getClass(), "actionMap", null);
        setField(term40662, term40662.getClass(), "aaHint", null);
        setField(term40662, term40662.getClass(), "lcdRenderingHint", null);
        setField(term40662, term40662.getClass(), "component", null);
        setField(term40662, term40662.getClass(), "layoutMgr", null);
        setField(term40662, term40662.getClass(), "dispatcher", null);
        setField(term40662, term40662.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term40662, term40662.getClass(), "focusCycleRoot", false);
        setBooleanField(term40662, term40662.getClass(), "focusTraversalPolicyProvider", false);
        setField(term40662, term40662.getClass(), "printingThreads", null);
        setBooleanField(term40662, term40662.getClass(), "printing", false);
        setField(term40662, term40662.getClass(), "containerListener", null);
        setIntField(term40662, term40662.getClass(), "listeningChildren", 0);
        setIntField(term40662, term40662.getClass(), "listeningBoundsChildren", 0);
        setIntField(term40662, term40662.getClass(), "descendantsCount", 0);
        setField(term40662, term40662.getClass(), "preserveBackgroundColor", null);
        setIntField(term40662, term40662.getClass(), "numOfHWComponents", 0);
        setIntField(term40662, term40662.getClass(), "numOfLWComponents", 0);
        setField(term40662, term40662.getClass(), "modalComp", null);
        setField(term40662, term40662.getClass(), "modalAppContext", null);
        setIntField(term40662, term40662.getClass(), "containerSerializedDataVersion", 0);
        setField(term40662, term40662.getClass(), "peer", null);
        setField(term40662, term40662.getClass(), "parent", null);
        setField(term40662, term40662.getClass(), "appContext", null);
        setIntField(term40662, term40662.getClass(), "x", 0);
        setIntField(term40662, term40662.getClass(), "y", 0);
        setIntField(term40662, term40662.getClass(), "width", 0);
        setIntField(term40662, term40662.getClass(), "height", 0);
        setField(term40662, term40662.getClass(), "foreground", null);
        setField(term40662, term40662.getClass(), "background", null);
        setField(term40662, term40662.getClass(), "font", null);
        setField(term40662, term40662.getClass(), "peerFont", null);
        setField(term40662, term40662.getClass(), "cursor", null);
        setField(term40662, term40662.getClass(), "locale", null);
        setField(term40662, term40662.getClass(), "graphicsConfig", null);
        setField(term40662, term40662.getClass(), "bufferStrategy", null);
        setBooleanField(term40662, term40662.getClass(), "ignoreRepaint", false);
        setBooleanField(term40662, term40662.getClass(), "visible", false);
        setBooleanField(term40662, term40662.getClass(), "enabled", false);
        setBooleanField(term40662, term40662.getClass(), "valid", false);
        setField(term40662, term40662.getClass(), "dropTarget", null);
        setField(term40662, term40662.getClass(), "popups", null);
        setField(term40662, term40662.getClass(), "name", null);
        setBooleanField(term40662, term40662.getClass(), "nameExplicitlySet", false);
        setBooleanField(term40662, term40662.getClass(), "focusable", false);
        setIntField(term40662, term40662.getClass(), "isFocusTraversableOverridden", 0);
        setField(term40662, term40662.getClass(), "focusTraversalKeys", null);
        setBooleanField(term40662, term40662.getClass(), "focusTraversalKeysEnabled", false);
        setField(term40662, term40662.getClass(), "acc", null);
        setField(term40662, term40662.getClass(), "minSize", null);
        setBooleanField(term40662, term40662.getClass(), "minSizeSet", false);
        setField(term40662, term40662.getClass(), "prefSize", null);
        setBooleanField(term40662, term40662.getClass(), "prefSizeSet", false);
        setField(term40662, term40662.getClass(), "maxSize", null);
        setBooleanField(term40662, term40662.getClass(), "maxSizeSet", false);
        setField(term40662, term40662.getClass(), "componentOrientation", null);
        setBooleanField(term40662, term40662.getClass(), "newEventsOnly", false);
        setField(term40662, term40662.getClass(), "componentListener", null);
        setField(term40662, term40662.getClass(), "focusListener", null);
        setField(term40662, term40662.getClass(), "hierarchyListener", null);
        setField(term40662, term40662.getClass(), "hierarchyBoundsListener", null);
        setField(term40662, term40662.getClass(), "keyListener", null);
        setField(term40662, term40662.getClass(), "mouseListener", null);
        setField(term40662, term40662.getClass(), "mouseMotionListener", null);
        setField(term40662, term40662.getClass(), "mouseWheelListener", null);
        setField(term40662, term40662.getClass(), "inputMethodListener", null);
        setLongField(term40662, term40662.getClass(), "eventMask", 0L);
        setField(term40662, term40662.getClass(), "changeSupport", null);
        setField(term40662, term40662.getClass(), "objectLock", null);
        setBooleanField(term40662, term40662.getClass(), "isPacked", false);
        setIntField(term40662, term40662.getClass(), "boundsOp", 0);
        setField(term40662, term40662.getClass(), "compoundShape", null);
        setField(term40662, term40662.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term40662, term40662.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term40662, term40662.getClass(), "backgroundEraseDisabled", false);
        setField(term40662, term40662.getClass(), "eventCache", null);
        setBooleanField(term40662, term40662.getClass(), "coalescingEnabled", false);
        setBooleanField(term40662, term40662.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term40662, term40662.getClass(), "componentSerializedDataVersion", 0);
        setField(term40662, term40662.getClass(), "accessibleContext", null);
        term40713 = new Boolean(false);
        term40715 = new Boolean(false);
        term40717 = new Integer(0);
        term40719 = new Integer(0);
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
        args[3] = term40713;
        args[4] = term40715;
        args[5] = term40717;
        args[6] = term40719;
        callMethod(klass, "calculateNodeIndent", argTypes, term40662, args);
    }

};


