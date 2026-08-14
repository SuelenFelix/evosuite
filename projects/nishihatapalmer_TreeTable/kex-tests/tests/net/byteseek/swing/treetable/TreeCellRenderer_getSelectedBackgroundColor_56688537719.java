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

public class TreeCellRenderer_getSelectedBackgroundColor_56688537719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53605;
     Object term53656;
     Object term53658;
     Object term53660;

    public TreeCellRenderer_getSelectedBackgroundColor_56688537719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53605 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term53605, term53605.getClass(), "treeTableModel", null);
        setField(term53605, term53605.getClass(), "insets", null);
        setIntField(term53605, term53605.getClass(), "pixelsPerLevel", 0);
        setField(term53605, term53605.getClass(), "expandCollapseIconRenderer", null);
        setField(term53605, term53605.getClass(), "expandedIcon", null);
        setField(term53605, term53605.getClass(), "collapsedIcon", null);
        setIntField(term53605, term53605.getClass(), "maxIconWidth", 0);
        setField(term53605, term53605.getClass(), "currentNode", null);
        setField(term53605, term53605.getClass(), "unselectedForeground", null);
        setField(term53605, term53605.getClass(), "unselectedBackground", null);
        setIntField(term53605, term53605.getClass(), "mnemonic", 0);
        setIntField(term53605, term53605.getClass(), "mnemonicIndex", 0);
        setField(term53605, term53605.getClass(), "text", null);
        setField(term53605, term53605.getClass(), "defaultIcon", null);
        setField(term53605, term53605.getClass(), "disabledIcon", null);
        setBooleanField(term53605, term53605.getClass(), "disabledIconSet", false);
        setIntField(term53605, term53605.getClass(), "verticalAlignment", 0);
        setIntField(term53605, term53605.getClass(), "horizontalAlignment", 0);
        setIntField(term53605, term53605.getClass(), "verticalTextPosition", 0);
        setIntField(term53605, term53605.getClass(), "horizontalTextPosition", 0);
        setIntField(term53605, term53605.getClass(), "iconTextGap", 0);
        setField(term53605, term53605.getClass(), "labelFor", null);
        setBooleanField(term53605, term53605.getClass(), "isAlignmentXSet", false);
        setFloatField(term53605, term53605.getClass(), "alignmentX", 0.0F);
        setBooleanField(term53605, term53605.getClass(), "isAlignmentYSet", false);
        setFloatField(term53605, term53605.getClass(), "alignmentY", 0.0F);
        setField(term53605, term53605.getClass(), "ui", null);
        setField(term53605, term53605.getClass(), "listenerList", null);
        setField(term53605, term53605.getClass(), "clientProperties", null);
        setField(term53605, term53605.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term53605, term53605.getClass(), "autoscrolls", false);
        setField(term53605, term53605.getClass(), "border", null);
        setIntField(term53605, term53605.getClass(), "flags", 0);
        setField(term53605, term53605.getClass(), "inputVerifier", null);
        setBooleanField(term53605, term53605.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term53605, term53605.getClass(), "paintingChild", null);
        setField(term53605, term53605.getClass(), "popupMenu", null);
        setField(term53605, term53605.getClass(), "revalidateRunnableScheduled", null);
        setField(term53605, term53605.getClass(), "focusInputMap", null);
        setField(term53605, term53605.getClass(), "ancestorInputMap", null);
        setField(term53605, term53605.getClass(), "windowInputMap", null);
        setField(term53605, term53605.getClass(), "actionMap", null);
        setField(term53605, term53605.getClass(), "aaHint", null);
        setField(term53605, term53605.getClass(), "lcdRenderingHint", null);
        setField(term53605, term53605.getClass(), "component", null);
        setField(term53605, term53605.getClass(), "layoutMgr", null);
        setField(term53605, term53605.getClass(), "dispatcher", null);
        setField(term53605, term53605.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term53605, term53605.getClass(), "focusCycleRoot", false);
        setBooleanField(term53605, term53605.getClass(), "focusTraversalPolicyProvider", false);
        setField(term53605, term53605.getClass(), "printingThreads", null);
        setBooleanField(term53605, term53605.getClass(), "printing", false);
        setField(term53605, term53605.getClass(), "containerListener", null);
        setIntField(term53605, term53605.getClass(), "listeningChildren", 0);
        setIntField(term53605, term53605.getClass(), "listeningBoundsChildren", 0);
        setIntField(term53605, term53605.getClass(), "descendantsCount", 0);
        setField(term53605, term53605.getClass(), "preserveBackgroundColor", null);
        setIntField(term53605, term53605.getClass(), "numOfHWComponents", 0);
        setIntField(term53605, term53605.getClass(), "numOfLWComponents", 0);
        setField(term53605, term53605.getClass(), "modalComp", null);
        setField(term53605, term53605.getClass(), "modalAppContext", null);
        setIntField(term53605, term53605.getClass(), "containerSerializedDataVersion", 0);
        setField(term53605, term53605.getClass(), "peer", null);
        setField(term53605, term53605.getClass(), "parent", null);
        setField(term53605, term53605.getClass(), "appContext", null);
        setIntField(term53605, term53605.getClass(), "x", 0);
        setIntField(term53605, term53605.getClass(), "y", 0);
        setIntField(term53605, term53605.getClass(), "width", 0);
        setIntField(term53605, term53605.getClass(), "height", 0);
        setField(term53605, term53605.getClass(), "foreground", null);
        setField(term53605, term53605.getClass(), "background", null);
        setField(term53605, term53605.getClass(), "font", null);
        setField(term53605, term53605.getClass(), "peerFont", null);
        setField(term53605, term53605.getClass(), "cursor", null);
        setField(term53605, term53605.getClass(), "locale", null);
        setField(term53605, term53605.getClass(), "graphicsConfig", null);
        setField(term53605, term53605.getClass(), "bufferStrategy", null);
        setBooleanField(term53605, term53605.getClass(), "ignoreRepaint", false);
        setBooleanField(term53605, term53605.getClass(), "visible", false);
        setBooleanField(term53605, term53605.getClass(), "enabled", false);
        setBooleanField(term53605, term53605.getClass(), "valid", false);
        setField(term53605, term53605.getClass(), "dropTarget", null);
        setField(term53605, term53605.getClass(), "popups", null);
        setField(term53605, term53605.getClass(), "name", null);
        setBooleanField(term53605, term53605.getClass(), "nameExplicitlySet", false);
        setBooleanField(term53605, term53605.getClass(), "focusable", false);
        setIntField(term53605, term53605.getClass(), "isFocusTraversableOverridden", 0);
        setField(term53605, term53605.getClass(), "focusTraversalKeys", null);
        setBooleanField(term53605, term53605.getClass(), "focusTraversalKeysEnabled", false);
        setField(term53605, term53605.getClass(), "acc", null);
        setField(term53605, term53605.getClass(), "minSize", null);
        setBooleanField(term53605, term53605.getClass(), "minSizeSet", false);
        setField(term53605, term53605.getClass(), "prefSize", null);
        setBooleanField(term53605, term53605.getClass(), "prefSizeSet", false);
        setField(term53605, term53605.getClass(), "maxSize", null);
        setBooleanField(term53605, term53605.getClass(), "maxSizeSet", false);
        setField(term53605, term53605.getClass(), "componentOrientation", null);
        setBooleanField(term53605, term53605.getClass(), "newEventsOnly", false);
        setField(term53605, term53605.getClass(), "componentListener", null);
        setField(term53605, term53605.getClass(), "focusListener", null);
        setField(term53605, term53605.getClass(), "hierarchyListener", null);
        setField(term53605, term53605.getClass(), "hierarchyBoundsListener", null);
        setField(term53605, term53605.getClass(), "keyListener", null);
        setField(term53605, term53605.getClass(), "mouseListener", null);
        setField(term53605, term53605.getClass(), "mouseMotionListener", null);
        setField(term53605, term53605.getClass(), "mouseWheelListener", null);
        setField(term53605, term53605.getClass(), "inputMethodListener", null);
        setLongField(term53605, term53605.getClass(), "eventMask", 0L);
        setField(term53605, term53605.getClass(), "changeSupport", null);
        setField(term53605, term53605.getClass(), "objectLock", null);
        setBooleanField(term53605, term53605.getClass(), "isPacked", false);
        setIntField(term53605, term53605.getClass(), "boundsOp", 0);
        setField(term53605, term53605.getClass(), "compoundShape", null);
        setField(term53605, term53605.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term53605, term53605.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term53605, term53605.getClass(), "backgroundEraseDisabled", false);
        setField(term53605, term53605.getClass(), "eventCache", null);
        setBooleanField(term53605, term53605.getClass(), "coalescingEnabled", false);
        setBooleanField(term53605, term53605.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term53605, term53605.getClass(), "componentSerializedDataVersion", 0);
        setField(term53605, term53605.getClass(), "accessibleContext", null);
        term53656 = new Boolean(false);
        term53658 = new Integer(0);
        term53660 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term53656;
        args[3] = term53658;
        args[4] = term53660;
        callMethod(klass, "getSelectedBackgroundColor", argTypes, term53605, args);
    }

};


