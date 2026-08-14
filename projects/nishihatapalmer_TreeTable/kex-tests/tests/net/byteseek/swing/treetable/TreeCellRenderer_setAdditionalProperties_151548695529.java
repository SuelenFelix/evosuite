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

public class TreeCellRenderer_setAdditionalProperties_151548695529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73772;
     Object term73823;
     Object term73825;
     Object term73827;
     Object term73829;

    public TreeCellRenderer_setAdditionalProperties_151548695529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73772 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term73772, term73772.getClass(), "treeTableModel", null);
        setField(term73772, term73772.getClass(), "insets", null);
        setIntField(term73772, term73772.getClass(), "pixelsPerLevel", 0);
        setField(term73772, term73772.getClass(), "expandCollapseIconRenderer", null);
        setField(term73772, term73772.getClass(), "expandedIcon", null);
        setField(term73772, term73772.getClass(), "collapsedIcon", null);
        setIntField(term73772, term73772.getClass(), "maxIconWidth", 0);
        setField(term73772, term73772.getClass(), "currentNode", null);
        setField(term73772, term73772.getClass(), "unselectedForeground", null);
        setField(term73772, term73772.getClass(), "unselectedBackground", null);
        setIntField(term73772, term73772.getClass(), "mnemonic", 0);
        setIntField(term73772, term73772.getClass(), "mnemonicIndex", 0);
        setField(term73772, term73772.getClass(), "text", null);
        setField(term73772, term73772.getClass(), "defaultIcon", null);
        setField(term73772, term73772.getClass(), "disabledIcon", null);
        setBooleanField(term73772, term73772.getClass(), "disabledIconSet", false);
        setIntField(term73772, term73772.getClass(), "verticalAlignment", 0);
        setIntField(term73772, term73772.getClass(), "horizontalAlignment", 0);
        setIntField(term73772, term73772.getClass(), "verticalTextPosition", 0);
        setIntField(term73772, term73772.getClass(), "horizontalTextPosition", 0);
        setIntField(term73772, term73772.getClass(), "iconTextGap", 0);
        setField(term73772, term73772.getClass(), "labelFor", null);
        setBooleanField(term73772, term73772.getClass(), "isAlignmentXSet", false);
        setFloatField(term73772, term73772.getClass(), "alignmentX", 0.0F);
        setBooleanField(term73772, term73772.getClass(), "isAlignmentYSet", false);
        setFloatField(term73772, term73772.getClass(), "alignmentY", 0.0F);
        setField(term73772, term73772.getClass(), "ui", null);
        setField(term73772, term73772.getClass(), "listenerList", null);
        setField(term73772, term73772.getClass(), "clientProperties", null);
        setField(term73772, term73772.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term73772, term73772.getClass(), "autoscrolls", false);
        setField(term73772, term73772.getClass(), "border", null);
        setIntField(term73772, term73772.getClass(), "flags", 0);
        setField(term73772, term73772.getClass(), "inputVerifier", null);
        setBooleanField(term73772, term73772.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term73772, term73772.getClass(), "paintingChild", null);
        setField(term73772, term73772.getClass(), "popupMenu", null);
        setField(term73772, term73772.getClass(), "revalidateRunnableScheduled", null);
        setField(term73772, term73772.getClass(), "focusInputMap", null);
        setField(term73772, term73772.getClass(), "ancestorInputMap", null);
        setField(term73772, term73772.getClass(), "windowInputMap", null);
        setField(term73772, term73772.getClass(), "actionMap", null);
        setField(term73772, term73772.getClass(), "aaHint", null);
        setField(term73772, term73772.getClass(), "lcdRenderingHint", null);
        setField(term73772, term73772.getClass(), "component", null);
        setField(term73772, term73772.getClass(), "layoutMgr", null);
        setField(term73772, term73772.getClass(), "dispatcher", null);
        setField(term73772, term73772.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term73772, term73772.getClass(), "focusCycleRoot", false);
        setBooleanField(term73772, term73772.getClass(), "focusTraversalPolicyProvider", false);
        setField(term73772, term73772.getClass(), "printingThreads", null);
        setBooleanField(term73772, term73772.getClass(), "printing", false);
        setField(term73772, term73772.getClass(), "containerListener", null);
        setIntField(term73772, term73772.getClass(), "listeningChildren", 0);
        setIntField(term73772, term73772.getClass(), "listeningBoundsChildren", 0);
        setIntField(term73772, term73772.getClass(), "descendantsCount", 0);
        setField(term73772, term73772.getClass(), "preserveBackgroundColor", null);
        setIntField(term73772, term73772.getClass(), "numOfHWComponents", 0);
        setIntField(term73772, term73772.getClass(), "numOfLWComponents", 0);
        setField(term73772, term73772.getClass(), "modalComp", null);
        setField(term73772, term73772.getClass(), "modalAppContext", null);
        setIntField(term73772, term73772.getClass(), "containerSerializedDataVersion", 0);
        setField(term73772, term73772.getClass(), "peer", null);
        setField(term73772, term73772.getClass(), "parent", null);
        setField(term73772, term73772.getClass(), "appContext", null);
        setIntField(term73772, term73772.getClass(), "x", 0);
        setIntField(term73772, term73772.getClass(), "y", 0);
        setIntField(term73772, term73772.getClass(), "width", 0);
        setIntField(term73772, term73772.getClass(), "height", 0);
        setField(term73772, term73772.getClass(), "foreground", null);
        setField(term73772, term73772.getClass(), "background", null);
        setField(term73772, term73772.getClass(), "font", null);
        setField(term73772, term73772.getClass(), "peerFont", null);
        setField(term73772, term73772.getClass(), "cursor", null);
        setField(term73772, term73772.getClass(), "locale", null);
        setField(term73772, term73772.getClass(), "graphicsConfig", null);
        setField(term73772, term73772.getClass(), "bufferStrategy", null);
        setBooleanField(term73772, term73772.getClass(), "ignoreRepaint", false);
        setBooleanField(term73772, term73772.getClass(), "visible", false);
        setBooleanField(term73772, term73772.getClass(), "enabled", false);
        setBooleanField(term73772, term73772.getClass(), "valid", false);
        setField(term73772, term73772.getClass(), "dropTarget", null);
        setField(term73772, term73772.getClass(), "popups", null);
        setField(term73772, term73772.getClass(), "name", null);
        setBooleanField(term73772, term73772.getClass(), "nameExplicitlySet", false);
        setBooleanField(term73772, term73772.getClass(), "focusable", false);
        setIntField(term73772, term73772.getClass(), "isFocusTraversableOverridden", 0);
        setField(term73772, term73772.getClass(), "focusTraversalKeys", null);
        setBooleanField(term73772, term73772.getClass(), "focusTraversalKeysEnabled", false);
        setField(term73772, term73772.getClass(), "acc", null);
        setField(term73772, term73772.getClass(), "minSize", null);
        setBooleanField(term73772, term73772.getClass(), "minSizeSet", false);
        setField(term73772, term73772.getClass(), "prefSize", null);
        setBooleanField(term73772, term73772.getClass(), "prefSizeSet", false);
        setField(term73772, term73772.getClass(), "maxSize", null);
        setBooleanField(term73772, term73772.getClass(), "maxSizeSet", false);
        setField(term73772, term73772.getClass(), "componentOrientation", null);
        setBooleanField(term73772, term73772.getClass(), "newEventsOnly", false);
        setField(term73772, term73772.getClass(), "componentListener", null);
        setField(term73772, term73772.getClass(), "focusListener", null);
        setField(term73772, term73772.getClass(), "hierarchyListener", null);
        setField(term73772, term73772.getClass(), "hierarchyBoundsListener", null);
        setField(term73772, term73772.getClass(), "keyListener", null);
        setField(term73772, term73772.getClass(), "mouseListener", null);
        setField(term73772, term73772.getClass(), "mouseMotionListener", null);
        setField(term73772, term73772.getClass(), "mouseWheelListener", null);
        setField(term73772, term73772.getClass(), "inputMethodListener", null);
        setLongField(term73772, term73772.getClass(), "eventMask", 0L);
        setField(term73772, term73772.getClass(), "changeSupport", null);
        setField(term73772, term73772.getClass(), "objectLock", null);
        setBooleanField(term73772, term73772.getClass(), "isPacked", false);
        setIntField(term73772, term73772.getClass(), "boundsOp", 0);
        setField(term73772, term73772.getClass(), "compoundShape", null);
        setField(term73772, term73772.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term73772, term73772.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term73772, term73772.getClass(), "backgroundEraseDisabled", false);
        setField(term73772, term73772.getClass(), "eventCache", null);
        setBooleanField(term73772, term73772.getClass(), "coalescingEnabled", false);
        setBooleanField(term73772, term73772.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term73772, term73772.getClass(), "componentSerializedDataVersion", 0);
        setField(term73772, term73772.getClass(), "accessibleContext", null);
        term73823 = new Boolean(false);
        term73825 = new Boolean(false);
        term73827 = new Integer(0);
        term73829 = new Integer(0);
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
        args[3] = term73823;
        args[4] = term73825;
        args[5] = term73827;
        args[6] = term73829;
        callMethod(klass, "setAdditionalProperties", argTypes, term73772, args);
    }

};


