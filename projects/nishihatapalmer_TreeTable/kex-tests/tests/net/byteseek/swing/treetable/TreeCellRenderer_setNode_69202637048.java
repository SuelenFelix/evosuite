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

public class TreeCellRenderer_setNode_69202637048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80524;

    public TreeCellRenderer_setNode_69202637048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80524 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80524, term80524.getClass(), "treeTableModel", null);
        setField(term80524, term80524.getClass(), "insets", null);
        setIntField(term80524, term80524.getClass(), "pixelsPerLevel", 0);
        setField(term80524, term80524.getClass(), "expandCollapseIconRenderer", null);
        setField(term80524, term80524.getClass(), "expandedIcon", null);
        setField(term80524, term80524.getClass(), "collapsedIcon", null);
        setIntField(term80524, term80524.getClass(), "maxIconWidth", 0);
        setField(term80524, term80524.getClass(), "currentNode", null);
        setField(term80524, term80524.getClass(), "unselectedForeground", null);
        setField(term80524, term80524.getClass(), "unselectedBackground", null);
        setIntField(term80524, term80524.getClass(), "mnemonic", 0);
        setIntField(term80524, term80524.getClass(), "mnemonicIndex", 0);
        setField(term80524, term80524.getClass(), "text", null);
        setField(term80524, term80524.getClass(), "defaultIcon", null);
        setField(term80524, term80524.getClass(), "disabledIcon", null);
        setBooleanField(term80524, term80524.getClass(), "disabledIconSet", false);
        setIntField(term80524, term80524.getClass(), "verticalAlignment", 0);
        setIntField(term80524, term80524.getClass(), "horizontalAlignment", 0);
        setIntField(term80524, term80524.getClass(), "verticalTextPosition", 0);
        setIntField(term80524, term80524.getClass(), "horizontalTextPosition", 0);
        setIntField(term80524, term80524.getClass(), "iconTextGap", 0);
        setField(term80524, term80524.getClass(), "labelFor", null);
        setBooleanField(term80524, term80524.getClass(), "isAlignmentXSet", false);
        setFloatField(term80524, term80524.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80524, term80524.getClass(), "isAlignmentYSet", false);
        setFloatField(term80524, term80524.getClass(), "alignmentY", 0.0F);
        setField(term80524, term80524.getClass(), "ui", null);
        setField(term80524, term80524.getClass(), "listenerList", null);
        setField(term80524, term80524.getClass(), "clientProperties", null);
        setField(term80524, term80524.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80524, term80524.getClass(), "autoscrolls", false);
        setField(term80524, term80524.getClass(), "border", null);
        setIntField(term80524, term80524.getClass(), "flags", 0);
        setField(term80524, term80524.getClass(), "inputVerifier", null);
        setBooleanField(term80524, term80524.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80524, term80524.getClass(), "paintingChild", null);
        setField(term80524, term80524.getClass(), "popupMenu", null);
        setField(term80524, term80524.getClass(), "revalidateRunnableScheduled", null);
        setField(term80524, term80524.getClass(), "focusInputMap", null);
        setField(term80524, term80524.getClass(), "ancestorInputMap", null);
        setField(term80524, term80524.getClass(), "windowInputMap", null);
        setField(term80524, term80524.getClass(), "actionMap", null);
        setField(term80524, term80524.getClass(), "aaHint", null);
        setField(term80524, term80524.getClass(), "lcdRenderingHint", null);
        setField(term80524, term80524.getClass(), "component", null);
        setField(term80524, term80524.getClass(), "layoutMgr", null);
        setField(term80524, term80524.getClass(), "dispatcher", null);
        setField(term80524, term80524.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80524, term80524.getClass(), "focusCycleRoot", false);
        setBooleanField(term80524, term80524.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80524, term80524.getClass(), "printingThreads", null);
        setBooleanField(term80524, term80524.getClass(), "printing", false);
        setField(term80524, term80524.getClass(), "containerListener", null);
        setIntField(term80524, term80524.getClass(), "listeningChildren", 0);
        setIntField(term80524, term80524.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80524, term80524.getClass(), "descendantsCount", 0);
        setField(term80524, term80524.getClass(), "preserveBackgroundColor", null);
        setIntField(term80524, term80524.getClass(), "numOfHWComponents", 0);
        setIntField(term80524, term80524.getClass(), "numOfLWComponents", 0);
        setField(term80524, term80524.getClass(), "modalComp", null);
        setField(term80524, term80524.getClass(), "modalAppContext", null);
        setIntField(term80524, term80524.getClass(), "containerSerializedDataVersion", 0);
        setField(term80524, term80524.getClass(), "peer", null);
        setField(term80524, term80524.getClass(), "parent", null);
        setField(term80524, term80524.getClass(), "appContext", null);
        setIntField(term80524, term80524.getClass(), "x", 0);
        setIntField(term80524, term80524.getClass(), "y", 0);
        setIntField(term80524, term80524.getClass(), "width", 0);
        setIntField(term80524, term80524.getClass(), "height", 0);
        setField(term80524, term80524.getClass(), "foreground", null);
        setField(term80524, term80524.getClass(), "background", null);
        setField(term80524, term80524.getClass(), "font", null);
        setField(term80524, term80524.getClass(), "peerFont", null);
        setField(term80524, term80524.getClass(), "cursor", null);
        setField(term80524, term80524.getClass(), "locale", null);
        setField(term80524, term80524.getClass(), "graphicsConfig", null);
        setField(term80524, term80524.getClass(), "bufferStrategy", null);
        setBooleanField(term80524, term80524.getClass(), "ignoreRepaint", false);
        setBooleanField(term80524, term80524.getClass(), "visible", false);
        setBooleanField(term80524, term80524.getClass(), "enabled", false);
        setBooleanField(term80524, term80524.getClass(), "valid", false);
        setField(term80524, term80524.getClass(), "dropTarget", null);
        setField(term80524, term80524.getClass(), "popups", null);
        setField(term80524, term80524.getClass(), "name", null);
        setBooleanField(term80524, term80524.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80524, term80524.getClass(), "focusable", false);
        setIntField(term80524, term80524.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80524, term80524.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80524, term80524.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80524, term80524.getClass(), "acc", null);
        setField(term80524, term80524.getClass(), "minSize", null);
        setBooleanField(term80524, term80524.getClass(), "minSizeSet", false);
        setField(term80524, term80524.getClass(), "prefSize", null);
        setBooleanField(term80524, term80524.getClass(), "prefSizeSet", false);
        setField(term80524, term80524.getClass(), "maxSize", null);
        setBooleanField(term80524, term80524.getClass(), "maxSizeSet", false);
        setField(term80524, term80524.getClass(), "componentOrientation", null);
        setBooleanField(term80524, term80524.getClass(), "newEventsOnly", false);
        setField(term80524, term80524.getClass(), "componentListener", null);
        setField(term80524, term80524.getClass(), "focusListener", null);
        setField(term80524, term80524.getClass(), "hierarchyListener", null);
        setField(term80524, term80524.getClass(), "hierarchyBoundsListener", null);
        setField(term80524, term80524.getClass(), "keyListener", null);
        setField(term80524, term80524.getClass(), "mouseListener", null);
        setField(term80524, term80524.getClass(), "mouseMotionListener", null);
        setField(term80524, term80524.getClass(), "mouseWheelListener", null);
        setField(term80524, term80524.getClass(), "inputMethodListener", null);
        setLongField(term80524, term80524.getClass(), "eventMask", 0L);
        setField(term80524, term80524.getClass(), "changeSupport", null);
        setField(term80524, term80524.getClass(), "objectLock", null);
        setBooleanField(term80524, term80524.getClass(), "isPacked", false);
        setIntField(term80524, term80524.getClass(), "boundsOp", 0);
        setField(term80524, term80524.getClass(), "compoundShape", null);
        setField(term80524, term80524.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80524, term80524.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80524, term80524.getClass(), "backgroundEraseDisabled", false);
        setField(term80524, term80524.getClass(), "eventCache", null);
        setBooleanField(term80524, term80524.getClass(), "coalescingEnabled", false);
        setBooleanField(term80524, term80524.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80524, term80524.getClass(), "componentSerializedDataVersion", 0);
        setField(term80524, term80524.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNode", argTypes, term80524, args);
    }

};


