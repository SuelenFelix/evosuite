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
     Object term81206;

    public TreeCellRenderer_setNode_69202637048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81206 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81206, term81206.getClass(), "treeTableModel", null);
        setField(term81206, term81206.getClass(), "insets", null);
        setIntField(term81206, term81206.getClass(), "pixelsPerLevel", 0);
        setField(term81206, term81206.getClass(), "expandCollapseIconRenderer", null);
        setField(term81206, term81206.getClass(), "expandedIcon", null);
        setField(term81206, term81206.getClass(), "collapsedIcon", null);
        setIntField(term81206, term81206.getClass(), "maxIconWidth", 0);
        setField(term81206, term81206.getClass(), "currentNode", null);
        setField(term81206, term81206.getClass(), "unselectedForeground", null);
        setField(term81206, term81206.getClass(), "unselectedBackground", null);
        setIntField(term81206, term81206.getClass(), "mnemonic", 0);
        setIntField(term81206, term81206.getClass(), "mnemonicIndex", 0);
        setField(term81206, term81206.getClass(), "text", null);
        setField(term81206, term81206.getClass(), "defaultIcon", null);
        setField(term81206, term81206.getClass(), "disabledIcon", null);
        setBooleanField(term81206, term81206.getClass(), "disabledIconSet", false);
        setIntField(term81206, term81206.getClass(), "verticalAlignment", 0);
        setIntField(term81206, term81206.getClass(), "horizontalAlignment", 0);
        setIntField(term81206, term81206.getClass(), "verticalTextPosition", 0);
        setIntField(term81206, term81206.getClass(), "horizontalTextPosition", 0);
        setIntField(term81206, term81206.getClass(), "iconTextGap", 0);
        setField(term81206, term81206.getClass(), "labelFor", null);
        setBooleanField(term81206, term81206.getClass(), "isAlignmentXSet", false);
        setFloatField(term81206, term81206.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81206, term81206.getClass(), "isAlignmentYSet", false);
        setFloatField(term81206, term81206.getClass(), "alignmentY", 0.0F);
        setField(term81206, term81206.getClass(), "ui", null);
        setField(term81206, term81206.getClass(), "listenerList", null);
        setField(term81206, term81206.getClass(), "clientProperties", null);
        setField(term81206, term81206.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81206, term81206.getClass(), "autoscrolls", false);
        setField(term81206, term81206.getClass(), "border", null);
        setIntField(term81206, term81206.getClass(), "flags", 0);
        setField(term81206, term81206.getClass(), "inputVerifier", null);
        setBooleanField(term81206, term81206.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81206, term81206.getClass(), "paintingChild", null);
        setField(term81206, term81206.getClass(), "popupMenu", null);
        setField(term81206, term81206.getClass(), "revalidateRunnableScheduled", null);
        setField(term81206, term81206.getClass(), "focusInputMap", null);
        setField(term81206, term81206.getClass(), "ancestorInputMap", null);
        setField(term81206, term81206.getClass(), "windowInputMap", null);
        setField(term81206, term81206.getClass(), "actionMap", null);
        setField(term81206, term81206.getClass(), "aaHint", null);
        setField(term81206, term81206.getClass(), "lcdRenderingHint", null);
        setField(term81206, term81206.getClass(), "component", null);
        setField(term81206, term81206.getClass(), "layoutMgr", null);
        setField(term81206, term81206.getClass(), "dispatcher", null);
        setField(term81206, term81206.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81206, term81206.getClass(), "focusCycleRoot", false);
        setBooleanField(term81206, term81206.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81206, term81206.getClass(), "printingThreads", null);
        setBooleanField(term81206, term81206.getClass(), "printing", false);
        setField(term81206, term81206.getClass(), "containerListener", null);
        setIntField(term81206, term81206.getClass(), "listeningChildren", 0);
        setIntField(term81206, term81206.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81206, term81206.getClass(), "descendantsCount", 0);
        setField(term81206, term81206.getClass(), "preserveBackgroundColor", null);
        setIntField(term81206, term81206.getClass(), "numOfHWComponents", 0);
        setIntField(term81206, term81206.getClass(), "numOfLWComponents", 0);
        setField(term81206, term81206.getClass(), "modalComp", null);
        setField(term81206, term81206.getClass(), "modalAppContext", null);
        setIntField(term81206, term81206.getClass(), "containerSerializedDataVersion", 0);
        setField(term81206, term81206.getClass(), "peer", null);
        setField(term81206, term81206.getClass(), "parent", null);
        setField(term81206, term81206.getClass(), "appContext", null);
        setIntField(term81206, term81206.getClass(), "x", 0);
        setIntField(term81206, term81206.getClass(), "y", 0);
        setIntField(term81206, term81206.getClass(), "width", 0);
        setIntField(term81206, term81206.getClass(), "height", 0);
        setField(term81206, term81206.getClass(), "foreground", null);
        setField(term81206, term81206.getClass(), "background", null);
        setField(term81206, term81206.getClass(), "font", null);
        setField(term81206, term81206.getClass(), "peerFont", null);
        setField(term81206, term81206.getClass(), "cursor", null);
        setField(term81206, term81206.getClass(), "locale", null);
        setField(term81206, term81206.getClass(), "graphicsConfig", null);
        setField(term81206, term81206.getClass(), "bufferStrategy", null);
        setBooleanField(term81206, term81206.getClass(), "ignoreRepaint", false);
        setBooleanField(term81206, term81206.getClass(), "visible", false);
        setBooleanField(term81206, term81206.getClass(), "enabled", false);
        setBooleanField(term81206, term81206.getClass(), "valid", false);
        setField(term81206, term81206.getClass(), "dropTarget", null);
        setField(term81206, term81206.getClass(), "popups", null);
        setField(term81206, term81206.getClass(), "name", null);
        setBooleanField(term81206, term81206.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81206, term81206.getClass(), "focusable", false);
        setIntField(term81206, term81206.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81206, term81206.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81206, term81206.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81206, term81206.getClass(), "acc", null);
        setField(term81206, term81206.getClass(), "minSize", null);
        setBooleanField(term81206, term81206.getClass(), "minSizeSet", false);
        setField(term81206, term81206.getClass(), "prefSize", null);
        setBooleanField(term81206, term81206.getClass(), "prefSizeSet", false);
        setField(term81206, term81206.getClass(), "maxSize", null);
        setBooleanField(term81206, term81206.getClass(), "maxSizeSet", false);
        setField(term81206, term81206.getClass(), "componentOrientation", null);
        setBooleanField(term81206, term81206.getClass(), "newEventsOnly", false);
        setField(term81206, term81206.getClass(), "componentListener", null);
        setField(term81206, term81206.getClass(), "focusListener", null);
        setField(term81206, term81206.getClass(), "hierarchyListener", null);
        setField(term81206, term81206.getClass(), "hierarchyBoundsListener", null);
        setField(term81206, term81206.getClass(), "keyListener", null);
        setField(term81206, term81206.getClass(), "mouseListener", null);
        setField(term81206, term81206.getClass(), "mouseMotionListener", null);
        setField(term81206, term81206.getClass(), "mouseWheelListener", null);
        setField(term81206, term81206.getClass(), "inputMethodListener", null);
        setLongField(term81206, term81206.getClass(), "eventMask", 0L);
        setField(term81206, term81206.getClass(), "changeSupport", null);
        setField(term81206, term81206.getClass(), "objectLock", null);
        setBooleanField(term81206, term81206.getClass(), "isPacked", false);
        setIntField(term81206, term81206.getClass(), "boundsOp", 0);
        setField(term81206, term81206.getClass(), "compoundShape", null);
        setField(term81206, term81206.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81206, term81206.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81206, term81206.getClass(), "backgroundEraseDisabled", false);
        setField(term81206, term81206.getClass(), "eventCache", null);
        setBooleanField(term81206, term81206.getClass(), "coalescingEnabled", false);
        setBooleanField(term81206, term81206.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81206, term81206.getClass(), "componentSerializedDataVersion", 0);
        setField(term81206, term81206.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNode", argTypes, term81206, args);
    }

};


