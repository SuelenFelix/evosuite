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
     Object term80741;
     Object term80792;

    public TreeCellRenderer_clickOnExpand_85761871739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80741 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80741, term80741.getClass(), "treeTableModel", null);
        setField(term80741, term80741.getClass(), "insets", null);
        setIntField(term80741, term80741.getClass(), "pixelsPerLevel", 0);
        setField(term80741, term80741.getClass(), "expandCollapseIconRenderer", null);
        setField(term80741, term80741.getClass(), "expandedIcon", null);
        setField(term80741, term80741.getClass(), "collapsedIcon", null);
        setIntField(term80741, term80741.getClass(), "maxIconWidth", 0);
        setField(term80741, term80741.getClass(), "currentNode", null);
        setField(term80741, term80741.getClass(), "unselectedForeground", null);
        setField(term80741, term80741.getClass(), "unselectedBackground", null);
        setIntField(term80741, term80741.getClass(), "mnemonic", 0);
        setIntField(term80741, term80741.getClass(), "mnemonicIndex", 0);
        setField(term80741, term80741.getClass(), "text", null);
        setField(term80741, term80741.getClass(), "defaultIcon", null);
        setField(term80741, term80741.getClass(), "disabledIcon", null);
        setBooleanField(term80741, term80741.getClass(), "disabledIconSet", false);
        setIntField(term80741, term80741.getClass(), "verticalAlignment", 0);
        setIntField(term80741, term80741.getClass(), "horizontalAlignment", 0);
        setIntField(term80741, term80741.getClass(), "verticalTextPosition", 0);
        setIntField(term80741, term80741.getClass(), "horizontalTextPosition", 0);
        setIntField(term80741, term80741.getClass(), "iconTextGap", 0);
        setField(term80741, term80741.getClass(), "labelFor", null);
        setBooleanField(term80741, term80741.getClass(), "isAlignmentXSet", false);
        setFloatField(term80741, term80741.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80741, term80741.getClass(), "isAlignmentYSet", false);
        setFloatField(term80741, term80741.getClass(), "alignmentY", 0.0F);
        setField(term80741, term80741.getClass(), "ui", null);
        setField(term80741, term80741.getClass(), "listenerList", null);
        setField(term80741, term80741.getClass(), "clientProperties", null);
        setField(term80741, term80741.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80741, term80741.getClass(), "autoscrolls", false);
        setField(term80741, term80741.getClass(), "border", null);
        setIntField(term80741, term80741.getClass(), "flags", 0);
        setField(term80741, term80741.getClass(), "inputVerifier", null);
        setBooleanField(term80741, term80741.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80741, term80741.getClass(), "paintingChild", null);
        setField(term80741, term80741.getClass(), "popupMenu", null);
        setField(term80741, term80741.getClass(), "revalidateRunnableScheduled", null);
        setField(term80741, term80741.getClass(), "focusInputMap", null);
        setField(term80741, term80741.getClass(), "ancestorInputMap", null);
        setField(term80741, term80741.getClass(), "windowInputMap", null);
        setField(term80741, term80741.getClass(), "actionMap", null);
        setField(term80741, term80741.getClass(), "aaHint", null);
        setField(term80741, term80741.getClass(), "lcdRenderingHint", null);
        setField(term80741, term80741.getClass(), "component", null);
        setField(term80741, term80741.getClass(), "layoutMgr", null);
        setField(term80741, term80741.getClass(), "dispatcher", null);
        setField(term80741, term80741.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80741, term80741.getClass(), "focusCycleRoot", false);
        setBooleanField(term80741, term80741.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80741, term80741.getClass(), "printingThreads", null);
        setBooleanField(term80741, term80741.getClass(), "printing", false);
        setField(term80741, term80741.getClass(), "containerListener", null);
        setIntField(term80741, term80741.getClass(), "listeningChildren", 0);
        setIntField(term80741, term80741.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80741, term80741.getClass(), "descendantsCount", 0);
        setField(term80741, term80741.getClass(), "preserveBackgroundColor", null);
        setIntField(term80741, term80741.getClass(), "numOfHWComponents", 0);
        setIntField(term80741, term80741.getClass(), "numOfLWComponents", 0);
        setField(term80741, term80741.getClass(), "modalComp", null);
        setField(term80741, term80741.getClass(), "modalAppContext", null);
        setIntField(term80741, term80741.getClass(), "containerSerializedDataVersion", 0);
        setField(term80741, term80741.getClass(), "peer", null);
        setField(term80741, term80741.getClass(), "parent", null);
        setField(term80741, term80741.getClass(), "appContext", null);
        setIntField(term80741, term80741.getClass(), "x", 0);
        setIntField(term80741, term80741.getClass(), "y", 0);
        setIntField(term80741, term80741.getClass(), "width", 0);
        setIntField(term80741, term80741.getClass(), "height", 0);
        setField(term80741, term80741.getClass(), "foreground", null);
        setField(term80741, term80741.getClass(), "background", null);
        setField(term80741, term80741.getClass(), "font", null);
        setField(term80741, term80741.getClass(), "peerFont", null);
        setField(term80741, term80741.getClass(), "cursor", null);
        setField(term80741, term80741.getClass(), "locale", null);
        setField(term80741, term80741.getClass(), "graphicsConfig", null);
        setField(term80741, term80741.getClass(), "bufferStrategy", null);
        setBooleanField(term80741, term80741.getClass(), "ignoreRepaint", false);
        setBooleanField(term80741, term80741.getClass(), "visible", false);
        setBooleanField(term80741, term80741.getClass(), "enabled", false);
        setBooleanField(term80741, term80741.getClass(), "valid", false);
        setField(term80741, term80741.getClass(), "dropTarget", null);
        setField(term80741, term80741.getClass(), "popups", null);
        setField(term80741, term80741.getClass(), "name", null);
        setBooleanField(term80741, term80741.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80741, term80741.getClass(), "focusable", false);
        setIntField(term80741, term80741.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80741, term80741.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80741, term80741.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80741, term80741.getClass(), "acc", null);
        setField(term80741, term80741.getClass(), "minSize", null);
        setBooleanField(term80741, term80741.getClass(), "minSizeSet", false);
        setField(term80741, term80741.getClass(), "prefSize", null);
        setBooleanField(term80741, term80741.getClass(), "prefSizeSet", false);
        setField(term80741, term80741.getClass(), "maxSize", null);
        setBooleanField(term80741, term80741.getClass(), "maxSizeSet", false);
        setField(term80741, term80741.getClass(), "componentOrientation", null);
        setBooleanField(term80741, term80741.getClass(), "newEventsOnly", false);
        setField(term80741, term80741.getClass(), "componentListener", null);
        setField(term80741, term80741.getClass(), "focusListener", null);
        setField(term80741, term80741.getClass(), "hierarchyListener", null);
        setField(term80741, term80741.getClass(), "hierarchyBoundsListener", null);
        setField(term80741, term80741.getClass(), "keyListener", null);
        setField(term80741, term80741.getClass(), "mouseListener", null);
        setField(term80741, term80741.getClass(), "mouseMotionListener", null);
        setField(term80741, term80741.getClass(), "mouseWheelListener", null);
        setField(term80741, term80741.getClass(), "inputMethodListener", null);
        setLongField(term80741, term80741.getClass(), "eventMask", 0L);
        setField(term80741, term80741.getClass(), "changeSupport", null);
        setField(term80741, term80741.getClass(), "objectLock", null);
        setBooleanField(term80741, term80741.getClass(), "isPacked", false);
        setIntField(term80741, term80741.getClass(), "boundsOp", 0);
        setField(term80741, term80741.getClass(), "compoundShape", null);
        setField(term80741, term80741.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80741, term80741.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80741, term80741.getClass(), "backgroundEraseDisabled", false);
        setField(term80741, term80741.getClass(), "eventCache", null);
        setBooleanField(term80741, term80741.getClass(), "coalescingEnabled", false);
        setBooleanField(term80741, term80741.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80741, term80741.getClass(), "componentSerializedDataVersion", 0);
        setField(term80741, term80741.getClass(), "accessibleContext", null);
        term80792 = new Integer(0);
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
        args[1] = term80792;
        args[2] = null;
        callMethod(klass, "clickOnExpand", argTypes, term80741, args);
    }

};


