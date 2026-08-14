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
import java.lang.Integer;

public class TreeCellRenderer_clickOnExpand_85761871739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80059;
     Object term80110;

    public TreeCellRenderer_clickOnExpand_85761871739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80059 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80059, term80059.getClass(), "treeTableModel", null);
        setField(term80059, term80059.getClass(), "insets", null);
        setIntField(term80059, term80059.getClass(), "pixelsPerLevel", 0);
        setField(term80059, term80059.getClass(), "expandCollapseIconRenderer", null);
        setField(term80059, term80059.getClass(), "expandedIcon", null);
        setField(term80059, term80059.getClass(), "collapsedIcon", null);
        setIntField(term80059, term80059.getClass(), "maxIconWidth", 0);
        setField(term80059, term80059.getClass(), "currentNode", null);
        setField(term80059, term80059.getClass(), "unselectedForeground", null);
        setField(term80059, term80059.getClass(), "unselectedBackground", null);
        setIntField(term80059, term80059.getClass(), "mnemonic", 0);
        setIntField(term80059, term80059.getClass(), "mnemonicIndex", 0);
        setField(term80059, term80059.getClass(), "text", null);
        setField(term80059, term80059.getClass(), "defaultIcon", null);
        setField(term80059, term80059.getClass(), "disabledIcon", null);
        setBooleanField(term80059, term80059.getClass(), "disabledIconSet", false);
        setIntField(term80059, term80059.getClass(), "verticalAlignment", 0);
        setIntField(term80059, term80059.getClass(), "horizontalAlignment", 0);
        setIntField(term80059, term80059.getClass(), "verticalTextPosition", 0);
        setIntField(term80059, term80059.getClass(), "horizontalTextPosition", 0);
        setIntField(term80059, term80059.getClass(), "iconTextGap", 0);
        setField(term80059, term80059.getClass(), "labelFor", null);
        setBooleanField(term80059, term80059.getClass(), "isAlignmentXSet", false);
        setFloatField(term80059, term80059.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80059, term80059.getClass(), "isAlignmentYSet", false);
        setFloatField(term80059, term80059.getClass(), "alignmentY", 0.0F);
        setField(term80059, term80059.getClass(), "ui", null);
        setField(term80059, term80059.getClass(), "listenerList", null);
        setField(term80059, term80059.getClass(), "clientProperties", null);
        setField(term80059, term80059.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80059, term80059.getClass(), "autoscrolls", false);
        setField(term80059, term80059.getClass(), "border", null);
        setIntField(term80059, term80059.getClass(), "flags", 0);
        setField(term80059, term80059.getClass(), "inputVerifier", null);
        setBooleanField(term80059, term80059.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80059, term80059.getClass(), "paintingChild", null);
        setField(term80059, term80059.getClass(), "popupMenu", null);
        setField(term80059, term80059.getClass(), "revalidateRunnableScheduled", null);
        setField(term80059, term80059.getClass(), "focusInputMap", null);
        setField(term80059, term80059.getClass(), "ancestorInputMap", null);
        setField(term80059, term80059.getClass(), "windowInputMap", null);
        setField(term80059, term80059.getClass(), "actionMap", null);
        setField(term80059, term80059.getClass(), "aaHint", null);
        setField(term80059, term80059.getClass(), "lcdRenderingHint", null);
        setField(term80059, term80059.getClass(), "component", null);
        setField(term80059, term80059.getClass(), "layoutMgr", null);
        setField(term80059, term80059.getClass(), "dispatcher", null);
        setField(term80059, term80059.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80059, term80059.getClass(), "focusCycleRoot", false);
        setBooleanField(term80059, term80059.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80059, term80059.getClass(), "printingThreads", null);
        setBooleanField(term80059, term80059.getClass(), "printing", false);
        setField(term80059, term80059.getClass(), "containerListener", null);
        setIntField(term80059, term80059.getClass(), "listeningChildren", 0);
        setIntField(term80059, term80059.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80059, term80059.getClass(), "descendantsCount", 0);
        setField(term80059, term80059.getClass(), "preserveBackgroundColor", null);
        setIntField(term80059, term80059.getClass(), "numOfHWComponents", 0);
        setIntField(term80059, term80059.getClass(), "numOfLWComponents", 0);
        setField(term80059, term80059.getClass(), "modalComp", null);
        setField(term80059, term80059.getClass(), "modalAppContext", null);
        setIntField(term80059, term80059.getClass(), "containerSerializedDataVersion", 0);
        setField(term80059, term80059.getClass(), "peer", null);
        setField(term80059, term80059.getClass(), "parent", null);
        setField(term80059, term80059.getClass(), "appContext", null);
        setIntField(term80059, term80059.getClass(), "x", 0);
        setIntField(term80059, term80059.getClass(), "y", 0);
        setIntField(term80059, term80059.getClass(), "width", 0);
        setIntField(term80059, term80059.getClass(), "height", 0);
        setField(term80059, term80059.getClass(), "foreground", null);
        setField(term80059, term80059.getClass(), "background", null);
        setField(term80059, term80059.getClass(), "font", null);
        setField(term80059, term80059.getClass(), "peerFont", null);
        setField(term80059, term80059.getClass(), "cursor", null);
        setField(term80059, term80059.getClass(), "locale", null);
        setField(term80059, term80059.getClass(), "graphicsConfig", null);
        setField(term80059, term80059.getClass(), "bufferStrategy", null);
        setBooleanField(term80059, term80059.getClass(), "ignoreRepaint", false);
        setBooleanField(term80059, term80059.getClass(), "visible", false);
        setBooleanField(term80059, term80059.getClass(), "enabled", false);
        setBooleanField(term80059, term80059.getClass(), "valid", false);
        setField(term80059, term80059.getClass(), "dropTarget", null);
        setField(term80059, term80059.getClass(), "popups", null);
        setField(term80059, term80059.getClass(), "name", null);
        setBooleanField(term80059, term80059.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80059, term80059.getClass(), "focusable", false);
        setIntField(term80059, term80059.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80059, term80059.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80059, term80059.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80059, term80059.getClass(), "acc", null);
        setField(term80059, term80059.getClass(), "minSize", null);
        setBooleanField(term80059, term80059.getClass(), "minSizeSet", false);
        setField(term80059, term80059.getClass(), "prefSize", null);
        setBooleanField(term80059, term80059.getClass(), "prefSizeSet", false);
        setField(term80059, term80059.getClass(), "maxSize", null);
        setBooleanField(term80059, term80059.getClass(), "maxSizeSet", false);
        setField(term80059, term80059.getClass(), "componentOrientation", null);
        setBooleanField(term80059, term80059.getClass(), "newEventsOnly", false);
        setField(term80059, term80059.getClass(), "componentListener", null);
        setField(term80059, term80059.getClass(), "focusListener", null);
        setField(term80059, term80059.getClass(), "hierarchyListener", null);
        setField(term80059, term80059.getClass(), "hierarchyBoundsListener", null);
        setField(term80059, term80059.getClass(), "keyListener", null);
        setField(term80059, term80059.getClass(), "mouseListener", null);
        setField(term80059, term80059.getClass(), "mouseMotionListener", null);
        setField(term80059, term80059.getClass(), "mouseWheelListener", null);
        setField(term80059, term80059.getClass(), "inputMethodListener", null);
        setLongField(term80059, term80059.getClass(), "eventMask", 0L);
        setField(term80059, term80059.getClass(), "changeSupport", null);
        setField(term80059, term80059.getClass(), "objectLock", null);
        setBooleanField(term80059, term80059.getClass(), "isPacked", false);
        setIntField(term80059, term80059.getClass(), "boundsOp", 0);
        setField(term80059, term80059.getClass(), "compoundShape", null);
        setField(term80059, term80059.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80059, term80059.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80059, term80059.getClass(), "backgroundEraseDisabled", false);
        setField(term80059, term80059.getClass(), "eventCache", null);
        setBooleanField(term80059, term80059.getClass(), "coalescingEnabled", false);
        setBooleanField(term80059, term80059.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80059, term80059.getClass(), "componentSerializedDataVersion", 0);
        setField(term80059, term80059.getClass(), "accessibleContext", null);
        term80110 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term80110;
        args[2] = null;
        callMethod(klass, "clickOnExpand", argTypes, term80059, args);
    }

};


