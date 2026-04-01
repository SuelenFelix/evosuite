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
     Object term81257;

    public TreeCellRenderer_getNodeIcon_99868905849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81257 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81257, term81257.getClass(), "treeTableModel", null);
        setField(term81257, term81257.getClass(), "insets", null);
        setIntField(term81257, term81257.getClass(), "pixelsPerLevel", 0);
        setField(term81257, term81257.getClass(), "expandCollapseIconRenderer", null);
        setField(term81257, term81257.getClass(), "expandedIcon", null);
        setField(term81257, term81257.getClass(), "collapsedIcon", null);
        setIntField(term81257, term81257.getClass(), "maxIconWidth", 0);
        setField(term81257, term81257.getClass(), "currentNode", null);
        setField(term81257, term81257.getClass(), "unselectedForeground", null);
        setField(term81257, term81257.getClass(), "unselectedBackground", null);
        setIntField(term81257, term81257.getClass(), "mnemonic", 0);
        setIntField(term81257, term81257.getClass(), "mnemonicIndex", 0);
        setField(term81257, term81257.getClass(), "text", null);
        setField(term81257, term81257.getClass(), "defaultIcon", null);
        setField(term81257, term81257.getClass(), "disabledIcon", null);
        setBooleanField(term81257, term81257.getClass(), "disabledIconSet", false);
        setIntField(term81257, term81257.getClass(), "verticalAlignment", 0);
        setIntField(term81257, term81257.getClass(), "horizontalAlignment", 0);
        setIntField(term81257, term81257.getClass(), "verticalTextPosition", 0);
        setIntField(term81257, term81257.getClass(), "horizontalTextPosition", 0);
        setIntField(term81257, term81257.getClass(), "iconTextGap", 0);
        setField(term81257, term81257.getClass(), "labelFor", null);
        setBooleanField(term81257, term81257.getClass(), "isAlignmentXSet", false);
        setFloatField(term81257, term81257.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81257, term81257.getClass(), "isAlignmentYSet", false);
        setFloatField(term81257, term81257.getClass(), "alignmentY", 0.0F);
        setField(term81257, term81257.getClass(), "ui", null);
        setField(term81257, term81257.getClass(), "listenerList", null);
        setField(term81257, term81257.getClass(), "clientProperties", null);
        setField(term81257, term81257.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81257, term81257.getClass(), "autoscrolls", false);
        setField(term81257, term81257.getClass(), "border", null);
        setIntField(term81257, term81257.getClass(), "flags", 0);
        setField(term81257, term81257.getClass(), "inputVerifier", null);
        setBooleanField(term81257, term81257.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81257, term81257.getClass(), "paintingChild", null);
        setField(term81257, term81257.getClass(), "popupMenu", null);
        setField(term81257, term81257.getClass(), "revalidateRunnableScheduled", null);
        setField(term81257, term81257.getClass(), "focusInputMap", null);
        setField(term81257, term81257.getClass(), "ancestorInputMap", null);
        setField(term81257, term81257.getClass(), "windowInputMap", null);
        setField(term81257, term81257.getClass(), "actionMap", null);
        setField(term81257, term81257.getClass(), "aaHint", null);
        setField(term81257, term81257.getClass(), "lcdRenderingHint", null);
        setField(term81257, term81257.getClass(), "component", null);
        setField(term81257, term81257.getClass(), "layoutMgr", null);
        setField(term81257, term81257.getClass(), "dispatcher", null);
        setField(term81257, term81257.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81257, term81257.getClass(), "focusCycleRoot", false);
        setBooleanField(term81257, term81257.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81257, term81257.getClass(), "printingThreads", null);
        setBooleanField(term81257, term81257.getClass(), "printing", false);
        setField(term81257, term81257.getClass(), "containerListener", null);
        setIntField(term81257, term81257.getClass(), "listeningChildren", 0);
        setIntField(term81257, term81257.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81257, term81257.getClass(), "descendantsCount", 0);
        setField(term81257, term81257.getClass(), "preserveBackgroundColor", null);
        setIntField(term81257, term81257.getClass(), "numOfHWComponents", 0);
        setIntField(term81257, term81257.getClass(), "numOfLWComponents", 0);
        setField(term81257, term81257.getClass(), "modalComp", null);
        setField(term81257, term81257.getClass(), "modalAppContext", null);
        setIntField(term81257, term81257.getClass(), "containerSerializedDataVersion", 0);
        setField(term81257, term81257.getClass(), "peer", null);
        setField(term81257, term81257.getClass(), "parent", null);
        setField(term81257, term81257.getClass(), "appContext", null);
        setIntField(term81257, term81257.getClass(), "x", 0);
        setIntField(term81257, term81257.getClass(), "y", 0);
        setIntField(term81257, term81257.getClass(), "width", 0);
        setIntField(term81257, term81257.getClass(), "height", 0);
        setField(term81257, term81257.getClass(), "foreground", null);
        setField(term81257, term81257.getClass(), "background", null);
        setField(term81257, term81257.getClass(), "font", null);
        setField(term81257, term81257.getClass(), "peerFont", null);
        setField(term81257, term81257.getClass(), "cursor", null);
        setField(term81257, term81257.getClass(), "locale", null);
        setField(term81257, term81257.getClass(), "graphicsConfig", null);
        setField(term81257, term81257.getClass(), "bufferStrategy", null);
        setBooleanField(term81257, term81257.getClass(), "ignoreRepaint", false);
        setBooleanField(term81257, term81257.getClass(), "visible", false);
        setBooleanField(term81257, term81257.getClass(), "enabled", false);
        setBooleanField(term81257, term81257.getClass(), "valid", false);
        setField(term81257, term81257.getClass(), "dropTarget", null);
        setField(term81257, term81257.getClass(), "popups", null);
        setField(term81257, term81257.getClass(), "name", null);
        setBooleanField(term81257, term81257.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81257, term81257.getClass(), "focusable", false);
        setIntField(term81257, term81257.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81257, term81257.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81257, term81257.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81257, term81257.getClass(), "acc", null);
        setField(term81257, term81257.getClass(), "minSize", null);
        setBooleanField(term81257, term81257.getClass(), "minSizeSet", false);
        setField(term81257, term81257.getClass(), "prefSize", null);
        setBooleanField(term81257, term81257.getClass(), "prefSizeSet", false);
        setField(term81257, term81257.getClass(), "maxSize", null);
        setBooleanField(term81257, term81257.getClass(), "maxSizeSet", false);
        setField(term81257, term81257.getClass(), "componentOrientation", null);
        setBooleanField(term81257, term81257.getClass(), "newEventsOnly", false);
        setField(term81257, term81257.getClass(), "componentListener", null);
        setField(term81257, term81257.getClass(), "focusListener", null);
        setField(term81257, term81257.getClass(), "hierarchyListener", null);
        setField(term81257, term81257.getClass(), "hierarchyBoundsListener", null);
        setField(term81257, term81257.getClass(), "keyListener", null);
        setField(term81257, term81257.getClass(), "mouseListener", null);
        setField(term81257, term81257.getClass(), "mouseMotionListener", null);
        setField(term81257, term81257.getClass(), "mouseWheelListener", null);
        setField(term81257, term81257.getClass(), "inputMethodListener", null);
        setLongField(term81257, term81257.getClass(), "eventMask", 0L);
        setField(term81257, term81257.getClass(), "changeSupport", null);
        setField(term81257, term81257.getClass(), "objectLock", null);
        setBooleanField(term81257, term81257.getClass(), "isPacked", false);
        setIntField(term81257, term81257.getClass(), "boundsOp", 0);
        setField(term81257, term81257.getClass(), "compoundShape", null);
        setField(term81257, term81257.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81257, term81257.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81257, term81257.getClass(), "backgroundEraseDisabled", false);
        setField(term81257, term81257.getClass(), "eventCache", null);
        setBooleanField(term81257, term81257.getClass(), "coalescingEnabled", false);
        setBooleanField(term81257, term81257.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81257, term81257.getClass(), "componentSerializedDataVersion", 0);
        setField(term81257, term81257.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeIcon", argTypes, term81257, args);
    }

};


