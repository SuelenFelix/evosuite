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

public class TreeCellRenderer_getToolTipText_184267901723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62446;
     Object term62497;
     Object term62499;
     Object term62501;
     Object term62503;

    public TreeCellRenderer_getToolTipText_184267901723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62446 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term62446, term62446.getClass(), "treeTableModel", null);
        setField(term62446, term62446.getClass(), "insets", null);
        setIntField(term62446, term62446.getClass(), "pixelsPerLevel", 0);
        setField(term62446, term62446.getClass(), "expandCollapseIconRenderer", null);
        setField(term62446, term62446.getClass(), "expandedIcon", null);
        setField(term62446, term62446.getClass(), "collapsedIcon", null);
        setIntField(term62446, term62446.getClass(), "maxIconWidth", 0);
        setField(term62446, term62446.getClass(), "currentNode", null);
        setField(term62446, term62446.getClass(), "unselectedForeground", null);
        setField(term62446, term62446.getClass(), "unselectedBackground", null);
        setIntField(term62446, term62446.getClass(), "mnemonic", 0);
        setIntField(term62446, term62446.getClass(), "mnemonicIndex", 0);
        setField(term62446, term62446.getClass(), "text", null);
        setField(term62446, term62446.getClass(), "defaultIcon", null);
        setField(term62446, term62446.getClass(), "disabledIcon", null);
        setBooleanField(term62446, term62446.getClass(), "disabledIconSet", false);
        setIntField(term62446, term62446.getClass(), "verticalAlignment", 0);
        setIntField(term62446, term62446.getClass(), "horizontalAlignment", 0);
        setIntField(term62446, term62446.getClass(), "verticalTextPosition", 0);
        setIntField(term62446, term62446.getClass(), "horizontalTextPosition", 0);
        setIntField(term62446, term62446.getClass(), "iconTextGap", 0);
        setField(term62446, term62446.getClass(), "labelFor", null);
        setBooleanField(term62446, term62446.getClass(), "isAlignmentXSet", false);
        setFloatField(term62446, term62446.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62446, term62446.getClass(), "isAlignmentYSet", false);
        setFloatField(term62446, term62446.getClass(), "alignmentY", 0.0F);
        setField(term62446, term62446.getClass(), "ui", null);
        setField(term62446, term62446.getClass(), "listenerList", null);
        setField(term62446, term62446.getClass(), "clientProperties", null);
        setField(term62446, term62446.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62446, term62446.getClass(), "autoscrolls", false);
        setField(term62446, term62446.getClass(), "border", null);
        setIntField(term62446, term62446.getClass(), "flags", 0);
        setField(term62446, term62446.getClass(), "inputVerifier", null);
        setBooleanField(term62446, term62446.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62446, term62446.getClass(), "paintingChild", null);
        setField(term62446, term62446.getClass(), "popupMenu", null);
        setField(term62446, term62446.getClass(), "revalidateRunnableScheduled", null);
        setField(term62446, term62446.getClass(), "focusInputMap", null);
        setField(term62446, term62446.getClass(), "ancestorInputMap", null);
        setField(term62446, term62446.getClass(), "windowInputMap", null);
        setField(term62446, term62446.getClass(), "actionMap", null);
        setField(term62446, term62446.getClass(), "aaHint", null);
        setField(term62446, term62446.getClass(), "lcdRenderingHint", null);
        setField(term62446, term62446.getClass(), "component", null);
        setField(term62446, term62446.getClass(), "layoutMgr", null);
        setField(term62446, term62446.getClass(), "dispatcher", null);
        setField(term62446, term62446.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62446, term62446.getClass(), "focusCycleRoot", false);
        setBooleanField(term62446, term62446.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62446, term62446.getClass(), "printingThreads", null);
        setBooleanField(term62446, term62446.getClass(), "printing", false);
        setField(term62446, term62446.getClass(), "containerListener", null);
        setIntField(term62446, term62446.getClass(), "listeningChildren", 0);
        setIntField(term62446, term62446.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62446, term62446.getClass(), "descendantsCount", 0);
        setField(term62446, term62446.getClass(), "preserveBackgroundColor", null);
        setIntField(term62446, term62446.getClass(), "numOfHWComponents", 0);
        setIntField(term62446, term62446.getClass(), "numOfLWComponents", 0);
        setField(term62446, term62446.getClass(), "modalComp", null);
        setField(term62446, term62446.getClass(), "modalAppContext", null);
        setIntField(term62446, term62446.getClass(), "containerSerializedDataVersion", 0);
        setField(term62446, term62446.getClass(), "peer", null);
        setField(term62446, term62446.getClass(), "parent", null);
        setField(term62446, term62446.getClass(), "appContext", null);
        setIntField(term62446, term62446.getClass(), "x", 0);
        setIntField(term62446, term62446.getClass(), "y", 0);
        setIntField(term62446, term62446.getClass(), "width", 0);
        setIntField(term62446, term62446.getClass(), "height", 0);
        setField(term62446, term62446.getClass(), "foreground", null);
        setField(term62446, term62446.getClass(), "background", null);
        setField(term62446, term62446.getClass(), "font", null);
        setField(term62446, term62446.getClass(), "peerFont", null);
        setField(term62446, term62446.getClass(), "cursor", null);
        setField(term62446, term62446.getClass(), "locale", null);
        setField(term62446, term62446.getClass(), "graphicsConfig", null);
        setField(term62446, term62446.getClass(), "bufferStrategy", null);
        setBooleanField(term62446, term62446.getClass(), "ignoreRepaint", false);
        setBooleanField(term62446, term62446.getClass(), "visible", false);
        setBooleanField(term62446, term62446.getClass(), "enabled", false);
        setBooleanField(term62446, term62446.getClass(), "valid", false);
        setField(term62446, term62446.getClass(), "dropTarget", null);
        setField(term62446, term62446.getClass(), "popups", null);
        setField(term62446, term62446.getClass(), "name", null);
        setBooleanField(term62446, term62446.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62446, term62446.getClass(), "focusable", false);
        setIntField(term62446, term62446.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62446, term62446.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62446, term62446.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62446, term62446.getClass(), "acc", null);
        setField(term62446, term62446.getClass(), "minSize", null);
        setBooleanField(term62446, term62446.getClass(), "minSizeSet", false);
        setField(term62446, term62446.getClass(), "prefSize", null);
        setBooleanField(term62446, term62446.getClass(), "prefSizeSet", false);
        setField(term62446, term62446.getClass(), "maxSize", null);
        setBooleanField(term62446, term62446.getClass(), "maxSizeSet", false);
        setField(term62446, term62446.getClass(), "componentOrientation", null);
        setBooleanField(term62446, term62446.getClass(), "newEventsOnly", false);
        setField(term62446, term62446.getClass(), "componentListener", null);
        setField(term62446, term62446.getClass(), "focusListener", null);
        setField(term62446, term62446.getClass(), "hierarchyListener", null);
        setField(term62446, term62446.getClass(), "hierarchyBoundsListener", null);
        setField(term62446, term62446.getClass(), "keyListener", null);
        setField(term62446, term62446.getClass(), "mouseListener", null);
        setField(term62446, term62446.getClass(), "mouseMotionListener", null);
        setField(term62446, term62446.getClass(), "mouseWheelListener", null);
        setField(term62446, term62446.getClass(), "inputMethodListener", null);
        setLongField(term62446, term62446.getClass(), "eventMask", 0L);
        setField(term62446, term62446.getClass(), "changeSupport", null);
        setField(term62446, term62446.getClass(), "objectLock", null);
        setBooleanField(term62446, term62446.getClass(), "isPacked", false);
        setIntField(term62446, term62446.getClass(), "boundsOp", 0);
        setField(term62446, term62446.getClass(), "compoundShape", null);
        setField(term62446, term62446.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62446, term62446.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62446, term62446.getClass(), "backgroundEraseDisabled", false);
        setField(term62446, term62446.getClass(), "eventCache", null);
        setBooleanField(term62446, term62446.getClass(), "coalescingEnabled", false);
        setBooleanField(term62446, term62446.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62446, term62446.getClass(), "componentSerializedDataVersion", 0);
        setField(term62446, term62446.getClass(), "accessibleContext", null);
        term62497 = new Boolean(false);
        term62499 = new Boolean(false);
        term62501 = new Integer(0);
        term62503 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term62497;
        args[3] = term62499;
        args[4] = term62501;
        args[5] = term62503;
        callMethod(klass, "getToolTipText", argTypes, term62446, args);
    }

};


