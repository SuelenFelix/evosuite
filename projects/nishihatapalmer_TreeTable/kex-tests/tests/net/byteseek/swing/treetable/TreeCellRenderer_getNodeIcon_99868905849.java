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

public class TreeCellRenderer_getNodeIcon_99868905849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80575;

    public TreeCellRenderer_getNodeIcon_99868905849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80575 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80575, term80575.getClass(), "treeTableModel", null);
        setField(term80575, term80575.getClass(), "insets", null);
        setIntField(term80575, term80575.getClass(), "pixelsPerLevel", 0);
        setField(term80575, term80575.getClass(), "expandCollapseIconRenderer", null);
        setField(term80575, term80575.getClass(), "expandedIcon", null);
        setField(term80575, term80575.getClass(), "collapsedIcon", null);
        setIntField(term80575, term80575.getClass(), "maxIconWidth", 0);
        setField(term80575, term80575.getClass(), "currentNode", null);
        setField(term80575, term80575.getClass(), "unselectedForeground", null);
        setField(term80575, term80575.getClass(), "unselectedBackground", null);
        setIntField(term80575, term80575.getClass(), "mnemonic", 0);
        setIntField(term80575, term80575.getClass(), "mnemonicIndex", 0);
        setField(term80575, term80575.getClass(), "text", null);
        setField(term80575, term80575.getClass(), "defaultIcon", null);
        setField(term80575, term80575.getClass(), "disabledIcon", null);
        setBooleanField(term80575, term80575.getClass(), "disabledIconSet", false);
        setIntField(term80575, term80575.getClass(), "verticalAlignment", 0);
        setIntField(term80575, term80575.getClass(), "horizontalAlignment", 0);
        setIntField(term80575, term80575.getClass(), "verticalTextPosition", 0);
        setIntField(term80575, term80575.getClass(), "horizontalTextPosition", 0);
        setIntField(term80575, term80575.getClass(), "iconTextGap", 0);
        setField(term80575, term80575.getClass(), "labelFor", null);
        setBooleanField(term80575, term80575.getClass(), "isAlignmentXSet", false);
        setFloatField(term80575, term80575.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80575, term80575.getClass(), "isAlignmentYSet", false);
        setFloatField(term80575, term80575.getClass(), "alignmentY", 0.0F);
        setField(term80575, term80575.getClass(), "ui", null);
        setField(term80575, term80575.getClass(), "listenerList", null);
        setField(term80575, term80575.getClass(), "clientProperties", null);
        setField(term80575, term80575.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80575, term80575.getClass(), "autoscrolls", false);
        setField(term80575, term80575.getClass(), "border", null);
        setIntField(term80575, term80575.getClass(), "flags", 0);
        setField(term80575, term80575.getClass(), "inputVerifier", null);
        setBooleanField(term80575, term80575.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80575, term80575.getClass(), "paintingChild", null);
        setField(term80575, term80575.getClass(), "popupMenu", null);
        setField(term80575, term80575.getClass(), "revalidateRunnableScheduled", null);
        setField(term80575, term80575.getClass(), "focusInputMap", null);
        setField(term80575, term80575.getClass(), "ancestorInputMap", null);
        setField(term80575, term80575.getClass(), "windowInputMap", null);
        setField(term80575, term80575.getClass(), "actionMap", null);
        setField(term80575, term80575.getClass(), "aaHint", null);
        setField(term80575, term80575.getClass(), "lcdRenderingHint", null);
        setField(term80575, term80575.getClass(), "component", null);
        setField(term80575, term80575.getClass(), "layoutMgr", null);
        setField(term80575, term80575.getClass(), "dispatcher", null);
        setField(term80575, term80575.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80575, term80575.getClass(), "focusCycleRoot", false);
        setBooleanField(term80575, term80575.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80575, term80575.getClass(), "printingThreads", null);
        setBooleanField(term80575, term80575.getClass(), "printing", false);
        setField(term80575, term80575.getClass(), "containerListener", null);
        setIntField(term80575, term80575.getClass(), "listeningChildren", 0);
        setIntField(term80575, term80575.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80575, term80575.getClass(), "descendantsCount", 0);
        setField(term80575, term80575.getClass(), "preserveBackgroundColor", null);
        setIntField(term80575, term80575.getClass(), "numOfHWComponents", 0);
        setIntField(term80575, term80575.getClass(), "numOfLWComponents", 0);
        setField(term80575, term80575.getClass(), "modalComp", null);
        setField(term80575, term80575.getClass(), "modalAppContext", null);
        setIntField(term80575, term80575.getClass(), "containerSerializedDataVersion", 0);
        setField(term80575, term80575.getClass(), "peer", null);
        setField(term80575, term80575.getClass(), "parent", null);
        setField(term80575, term80575.getClass(), "appContext", null);
        setIntField(term80575, term80575.getClass(), "x", 0);
        setIntField(term80575, term80575.getClass(), "y", 0);
        setIntField(term80575, term80575.getClass(), "width", 0);
        setIntField(term80575, term80575.getClass(), "height", 0);
        setField(term80575, term80575.getClass(), "foreground", null);
        setField(term80575, term80575.getClass(), "background", null);
        setField(term80575, term80575.getClass(), "font", null);
        setField(term80575, term80575.getClass(), "peerFont", null);
        setField(term80575, term80575.getClass(), "cursor", null);
        setField(term80575, term80575.getClass(), "locale", null);
        setField(term80575, term80575.getClass(), "graphicsConfig", null);
        setField(term80575, term80575.getClass(), "bufferStrategy", null);
        setBooleanField(term80575, term80575.getClass(), "ignoreRepaint", false);
        setBooleanField(term80575, term80575.getClass(), "visible", false);
        setBooleanField(term80575, term80575.getClass(), "enabled", false);
        setBooleanField(term80575, term80575.getClass(), "valid", false);
        setField(term80575, term80575.getClass(), "dropTarget", null);
        setField(term80575, term80575.getClass(), "popups", null);
        setField(term80575, term80575.getClass(), "name", null);
        setBooleanField(term80575, term80575.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80575, term80575.getClass(), "focusable", false);
        setIntField(term80575, term80575.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80575, term80575.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80575, term80575.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80575, term80575.getClass(), "acc", null);
        setField(term80575, term80575.getClass(), "minSize", null);
        setBooleanField(term80575, term80575.getClass(), "minSizeSet", false);
        setField(term80575, term80575.getClass(), "prefSize", null);
        setBooleanField(term80575, term80575.getClass(), "prefSizeSet", false);
        setField(term80575, term80575.getClass(), "maxSize", null);
        setBooleanField(term80575, term80575.getClass(), "maxSizeSet", false);
        setField(term80575, term80575.getClass(), "componentOrientation", null);
        setBooleanField(term80575, term80575.getClass(), "newEventsOnly", false);
        setField(term80575, term80575.getClass(), "componentListener", null);
        setField(term80575, term80575.getClass(), "focusListener", null);
        setField(term80575, term80575.getClass(), "hierarchyListener", null);
        setField(term80575, term80575.getClass(), "hierarchyBoundsListener", null);
        setField(term80575, term80575.getClass(), "keyListener", null);
        setField(term80575, term80575.getClass(), "mouseListener", null);
        setField(term80575, term80575.getClass(), "mouseMotionListener", null);
        setField(term80575, term80575.getClass(), "mouseWheelListener", null);
        setField(term80575, term80575.getClass(), "inputMethodListener", null);
        setLongField(term80575, term80575.getClass(), "eventMask", 0L);
        setField(term80575, term80575.getClass(), "changeSupport", null);
        setField(term80575, term80575.getClass(), "objectLock", null);
        setBooleanField(term80575, term80575.getClass(), "isPacked", false);
        setIntField(term80575, term80575.getClass(), "boundsOp", 0);
        setField(term80575, term80575.getClass(), "compoundShape", null);
        setField(term80575, term80575.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80575, term80575.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80575, term80575.getClass(), "backgroundEraseDisabled", false);
        setField(term80575, term80575.getClass(), "eventCache", null);
        setBooleanField(term80575, term80575.getClass(), "coalescingEnabled", false);
        setBooleanField(term80575, term80575.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80575, term80575.getClass(), "componentSerializedDataVersion", 0);
        setField(term80575, term80575.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeIcon", argTypes, term80575, args);
    }

};


