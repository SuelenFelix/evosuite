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

public class TreeCellRenderer_calculateNodeIndent_57845699451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81359;

    public TreeCellRenderer_calculateNodeIndent_57845699451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81359 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81359, term81359.getClass(), "treeTableModel", null);
        setField(term81359, term81359.getClass(), "insets", null);
        setIntField(term81359, term81359.getClass(), "pixelsPerLevel", 0);
        setField(term81359, term81359.getClass(), "expandCollapseIconRenderer", null);
        setField(term81359, term81359.getClass(), "expandedIcon", null);
        setField(term81359, term81359.getClass(), "collapsedIcon", null);
        setIntField(term81359, term81359.getClass(), "maxIconWidth", 0);
        setField(term81359, term81359.getClass(), "currentNode", null);
        setField(term81359, term81359.getClass(), "unselectedForeground", null);
        setField(term81359, term81359.getClass(), "unselectedBackground", null);
        setIntField(term81359, term81359.getClass(), "mnemonic", 0);
        setIntField(term81359, term81359.getClass(), "mnemonicIndex", 0);
        setField(term81359, term81359.getClass(), "text", null);
        setField(term81359, term81359.getClass(), "defaultIcon", null);
        setField(term81359, term81359.getClass(), "disabledIcon", null);
        setBooleanField(term81359, term81359.getClass(), "disabledIconSet", false);
        setIntField(term81359, term81359.getClass(), "verticalAlignment", 0);
        setIntField(term81359, term81359.getClass(), "horizontalAlignment", 0);
        setIntField(term81359, term81359.getClass(), "verticalTextPosition", 0);
        setIntField(term81359, term81359.getClass(), "horizontalTextPosition", 0);
        setIntField(term81359, term81359.getClass(), "iconTextGap", 0);
        setField(term81359, term81359.getClass(), "labelFor", null);
        setBooleanField(term81359, term81359.getClass(), "isAlignmentXSet", false);
        setFloatField(term81359, term81359.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81359, term81359.getClass(), "isAlignmentYSet", false);
        setFloatField(term81359, term81359.getClass(), "alignmentY", 0.0F);
        setField(term81359, term81359.getClass(), "ui", null);
        setField(term81359, term81359.getClass(), "listenerList", null);
        setField(term81359, term81359.getClass(), "clientProperties", null);
        setField(term81359, term81359.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81359, term81359.getClass(), "autoscrolls", false);
        setField(term81359, term81359.getClass(), "border", null);
        setIntField(term81359, term81359.getClass(), "flags", 0);
        setField(term81359, term81359.getClass(), "inputVerifier", null);
        setBooleanField(term81359, term81359.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81359, term81359.getClass(), "paintingChild", null);
        setField(term81359, term81359.getClass(), "popupMenu", null);
        setField(term81359, term81359.getClass(), "revalidateRunnableScheduled", null);
        setField(term81359, term81359.getClass(), "focusInputMap", null);
        setField(term81359, term81359.getClass(), "ancestorInputMap", null);
        setField(term81359, term81359.getClass(), "windowInputMap", null);
        setField(term81359, term81359.getClass(), "actionMap", null);
        setField(term81359, term81359.getClass(), "aaHint", null);
        setField(term81359, term81359.getClass(), "lcdRenderingHint", null);
        setField(term81359, term81359.getClass(), "component", null);
        setField(term81359, term81359.getClass(), "layoutMgr", null);
        setField(term81359, term81359.getClass(), "dispatcher", null);
        setField(term81359, term81359.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81359, term81359.getClass(), "focusCycleRoot", false);
        setBooleanField(term81359, term81359.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81359, term81359.getClass(), "printingThreads", null);
        setBooleanField(term81359, term81359.getClass(), "printing", false);
        setField(term81359, term81359.getClass(), "containerListener", null);
        setIntField(term81359, term81359.getClass(), "listeningChildren", 0);
        setIntField(term81359, term81359.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81359, term81359.getClass(), "descendantsCount", 0);
        setField(term81359, term81359.getClass(), "preserveBackgroundColor", null);
        setIntField(term81359, term81359.getClass(), "numOfHWComponents", 0);
        setIntField(term81359, term81359.getClass(), "numOfLWComponents", 0);
        setField(term81359, term81359.getClass(), "modalComp", null);
        setField(term81359, term81359.getClass(), "modalAppContext", null);
        setIntField(term81359, term81359.getClass(), "containerSerializedDataVersion", 0);
        setField(term81359, term81359.getClass(), "peer", null);
        setField(term81359, term81359.getClass(), "parent", null);
        setField(term81359, term81359.getClass(), "appContext", null);
        setIntField(term81359, term81359.getClass(), "x", 0);
        setIntField(term81359, term81359.getClass(), "y", 0);
        setIntField(term81359, term81359.getClass(), "width", 0);
        setIntField(term81359, term81359.getClass(), "height", 0);
        setField(term81359, term81359.getClass(), "foreground", null);
        setField(term81359, term81359.getClass(), "background", null);
        setField(term81359, term81359.getClass(), "font", null);
        setField(term81359, term81359.getClass(), "peerFont", null);
        setField(term81359, term81359.getClass(), "cursor", null);
        setField(term81359, term81359.getClass(), "locale", null);
        setField(term81359, term81359.getClass(), "graphicsConfig", null);
        setField(term81359, term81359.getClass(), "bufferStrategy", null);
        setBooleanField(term81359, term81359.getClass(), "ignoreRepaint", false);
        setBooleanField(term81359, term81359.getClass(), "visible", false);
        setBooleanField(term81359, term81359.getClass(), "enabled", false);
        setBooleanField(term81359, term81359.getClass(), "valid", false);
        setField(term81359, term81359.getClass(), "dropTarget", null);
        setField(term81359, term81359.getClass(), "popups", null);
        setField(term81359, term81359.getClass(), "name", null);
        setBooleanField(term81359, term81359.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81359, term81359.getClass(), "focusable", false);
        setIntField(term81359, term81359.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81359, term81359.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81359, term81359.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81359, term81359.getClass(), "acc", null);
        setField(term81359, term81359.getClass(), "minSize", null);
        setBooleanField(term81359, term81359.getClass(), "minSizeSet", false);
        setField(term81359, term81359.getClass(), "prefSize", null);
        setBooleanField(term81359, term81359.getClass(), "prefSizeSet", false);
        setField(term81359, term81359.getClass(), "maxSize", null);
        setBooleanField(term81359, term81359.getClass(), "maxSizeSet", false);
        setField(term81359, term81359.getClass(), "componentOrientation", null);
        setBooleanField(term81359, term81359.getClass(), "newEventsOnly", false);
        setField(term81359, term81359.getClass(), "componentListener", null);
        setField(term81359, term81359.getClass(), "focusListener", null);
        setField(term81359, term81359.getClass(), "hierarchyListener", null);
        setField(term81359, term81359.getClass(), "hierarchyBoundsListener", null);
        setField(term81359, term81359.getClass(), "keyListener", null);
        setField(term81359, term81359.getClass(), "mouseListener", null);
        setField(term81359, term81359.getClass(), "mouseMotionListener", null);
        setField(term81359, term81359.getClass(), "mouseWheelListener", null);
        setField(term81359, term81359.getClass(), "inputMethodListener", null);
        setLongField(term81359, term81359.getClass(), "eventMask", 0L);
        setField(term81359, term81359.getClass(), "changeSupport", null);
        setField(term81359, term81359.getClass(), "objectLock", null);
        setBooleanField(term81359, term81359.getClass(), "isPacked", false);
        setIntField(term81359, term81359.getClass(), "boundsOp", 0);
        setField(term81359, term81359.getClass(), "compoundShape", null);
        setField(term81359, term81359.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81359, term81359.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81359, term81359.getClass(), "backgroundEraseDisabled", false);
        setField(term81359, term81359.getClass(), "eventCache", null);
        setBooleanField(term81359, term81359.getClass(), "coalescingEnabled", false);
        setBooleanField(term81359, term81359.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81359, term81359.getClass(), "componentSerializedDataVersion", 0);
        setField(term81359, term81359.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "calculateNodeIndent", argTypes, term81359, args);
    }

};


