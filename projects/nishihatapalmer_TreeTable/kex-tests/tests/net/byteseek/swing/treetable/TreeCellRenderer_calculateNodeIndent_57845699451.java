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
     Object term80677;

    public TreeCellRenderer_calculateNodeIndent_57845699451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80677 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80677, term80677.getClass(), "treeTableModel", null);
        setField(term80677, term80677.getClass(), "insets", null);
        setIntField(term80677, term80677.getClass(), "pixelsPerLevel", 0);
        setField(term80677, term80677.getClass(), "expandCollapseIconRenderer", null);
        setField(term80677, term80677.getClass(), "expandedIcon", null);
        setField(term80677, term80677.getClass(), "collapsedIcon", null);
        setIntField(term80677, term80677.getClass(), "maxIconWidth", 0);
        setField(term80677, term80677.getClass(), "currentNode", null);
        setField(term80677, term80677.getClass(), "unselectedForeground", null);
        setField(term80677, term80677.getClass(), "unselectedBackground", null);
        setIntField(term80677, term80677.getClass(), "mnemonic", 0);
        setIntField(term80677, term80677.getClass(), "mnemonicIndex", 0);
        setField(term80677, term80677.getClass(), "text", null);
        setField(term80677, term80677.getClass(), "defaultIcon", null);
        setField(term80677, term80677.getClass(), "disabledIcon", null);
        setBooleanField(term80677, term80677.getClass(), "disabledIconSet", false);
        setIntField(term80677, term80677.getClass(), "verticalAlignment", 0);
        setIntField(term80677, term80677.getClass(), "horizontalAlignment", 0);
        setIntField(term80677, term80677.getClass(), "verticalTextPosition", 0);
        setIntField(term80677, term80677.getClass(), "horizontalTextPosition", 0);
        setIntField(term80677, term80677.getClass(), "iconTextGap", 0);
        setField(term80677, term80677.getClass(), "labelFor", null);
        setBooleanField(term80677, term80677.getClass(), "isAlignmentXSet", false);
        setFloatField(term80677, term80677.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80677, term80677.getClass(), "isAlignmentYSet", false);
        setFloatField(term80677, term80677.getClass(), "alignmentY", 0.0F);
        setField(term80677, term80677.getClass(), "ui", null);
        setField(term80677, term80677.getClass(), "listenerList", null);
        setField(term80677, term80677.getClass(), "clientProperties", null);
        setField(term80677, term80677.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80677, term80677.getClass(), "autoscrolls", false);
        setField(term80677, term80677.getClass(), "border", null);
        setIntField(term80677, term80677.getClass(), "flags", 0);
        setField(term80677, term80677.getClass(), "inputVerifier", null);
        setBooleanField(term80677, term80677.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80677, term80677.getClass(), "paintingChild", null);
        setField(term80677, term80677.getClass(), "popupMenu", null);
        setField(term80677, term80677.getClass(), "revalidateRunnableScheduled", null);
        setField(term80677, term80677.getClass(), "focusInputMap", null);
        setField(term80677, term80677.getClass(), "ancestorInputMap", null);
        setField(term80677, term80677.getClass(), "windowInputMap", null);
        setField(term80677, term80677.getClass(), "actionMap", null);
        setField(term80677, term80677.getClass(), "aaHint", null);
        setField(term80677, term80677.getClass(), "lcdRenderingHint", null);
        setField(term80677, term80677.getClass(), "component", null);
        setField(term80677, term80677.getClass(), "layoutMgr", null);
        setField(term80677, term80677.getClass(), "dispatcher", null);
        setField(term80677, term80677.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80677, term80677.getClass(), "focusCycleRoot", false);
        setBooleanField(term80677, term80677.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80677, term80677.getClass(), "printingThreads", null);
        setBooleanField(term80677, term80677.getClass(), "printing", false);
        setField(term80677, term80677.getClass(), "containerListener", null);
        setIntField(term80677, term80677.getClass(), "listeningChildren", 0);
        setIntField(term80677, term80677.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80677, term80677.getClass(), "descendantsCount", 0);
        setField(term80677, term80677.getClass(), "preserveBackgroundColor", null);
        setIntField(term80677, term80677.getClass(), "numOfHWComponents", 0);
        setIntField(term80677, term80677.getClass(), "numOfLWComponents", 0);
        setField(term80677, term80677.getClass(), "modalComp", null);
        setField(term80677, term80677.getClass(), "modalAppContext", null);
        setIntField(term80677, term80677.getClass(), "containerSerializedDataVersion", 0);
        setField(term80677, term80677.getClass(), "peer", null);
        setField(term80677, term80677.getClass(), "parent", null);
        setField(term80677, term80677.getClass(), "appContext", null);
        setIntField(term80677, term80677.getClass(), "x", 0);
        setIntField(term80677, term80677.getClass(), "y", 0);
        setIntField(term80677, term80677.getClass(), "width", 0);
        setIntField(term80677, term80677.getClass(), "height", 0);
        setField(term80677, term80677.getClass(), "foreground", null);
        setField(term80677, term80677.getClass(), "background", null);
        setField(term80677, term80677.getClass(), "font", null);
        setField(term80677, term80677.getClass(), "peerFont", null);
        setField(term80677, term80677.getClass(), "cursor", null);
        setField(term80677, term80677.getClass(), "locale", null);
        setField(term80677, term80677.getClass(), "graphicsConfig", null);
        setField(term80677, term80677.getClass(), "bufferStrategy", null);
        setBooleanField(term80677, term80677.getClass(), "ignoreRepaint", false);
        setBooleanField(term80677, term80677.getClass(), "visible", false);
        setBooleanField(term80677, term80677.getClass(), "enabled", false);
        setBooleanField(term80677, term80677.getClass(), "valid", false);
        setField(term80677, term80677.getClass(), "dropTarget", null);
        setField(term80677, term80677.getClass(), "popups", null);
        setField(term80677, term80677.getClass(), "name", null);
        setBooleanField(term80677, term80677.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80677, term80677.getClass(), "focusable", false);
        setIntField(term80677, term80677.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80677, term80677.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80677, term80677.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80677, term80677.getClass(), "acc", null);
        setField(term80677, term80677.getClass(), "minSize", null);
        setBooleanField(term80677, term80677.getClass(), "minSizeSet", false);
        setField(term80677, term80677.getClass(), "prefSize", null);
        setBooleanField(term80677, term80677.getClass(), "prefSizeSet", false);
        setField(term80677, term80677.getClass(), "maxSize", null);
        setBooleanField(term80677, term80677.getClass(), "maxSizeSet", false);
        setField(term80677, term80677.getClass(), "componentOrientation", null);
        setBooleanField(term80677, term80677.getClass(), "newEventsOnly", false);
        setField(term80677, term80677.getClass(), "componentListener", null);
        setField(term80677, term80677.getClass(), "focusListener", null);
        setField(term80677, term80677.getClass(), "hierarchyListener", null);
        setField(term80677, term80677.getClass(), "hierarchyBoundsListener", null);
        setField(term80677, term80677.getClass(), "keyListener", null);
        setField(term80677, term80677.getClass(), "mouseListener", null);
        setField(term80677, term80677.getClass(), "mouseMotionListener", null);
        setField(term80677, term80677.getClass(), "mouseWheelListener", null);
        setField(term80677, term80677.getClass(), "inputMethodListener", null);
        setLongField(term80677, term80677.getClass(), "eventMask", 0L);
        setField(term80677, term80677.getClass(), "changeSupport", null);
        setField(term80677, term80677.getClass(), "objectLock", null);
        setBooleanField(term80677, term80677.getClass(), "isPacked", false);
        setIntField(term80677, term80677.getClass(), "boundsOp", 0);
        setField(term80677, term80677.getClass(), "compoundShape", null);
        setField(term80677, term80677.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80677, term80677.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80677, term80677.getClass(), "backgroundEraseDisabled", false);
        setField(term80677, term80677.getClass(), "eventCache", null);
        setBooleanField(term80677, term80677.getClass(), "coalescingEnabled", false);
        setBooleanField(term80677, term80677.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80677, term80677.getClass(), "componentSerializedDataVersion", 0);
        setField(term80677, term80677.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "calculateNodeIndent", argTypes, term80677, args);
    }

};


