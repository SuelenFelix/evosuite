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

public class TreeCellRenderer_getTableCellRendererComponent_21226851292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33732;
     Object term33783;
     Object term33785;
     Object term33787;
     Object term33789;

    public TreeCellRenderer_getTableCellRendererComponent_21226851292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33732 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term33732, term33732.getClass(), "treeTableModel", null);
        setField(term33732, term33732.getClass(), "insets", null);
        setIntField(term33732, term33732.getClass(), "pixelsPerLevel", 0);
        setField(term33732, term33732.getClass(), "expandCollapseIconRenderer", null);
        setField(term33732, term33732.getClass(), "expandedIcon", null);
        setField(term33732, term33732.getClass(), "collapsedIcon", null);
        setIntField(term33732, term33732.getClass(), "maxIconWidth", 0);
        setField(term33732, term33732.getClass(), "currentNode", null);
        setField(term33732, term33732.getClass(), "unselectedForeground", null);
        setField(term33732, term33732.getClass(), "unselectedBackground", null);
        setIntField(term33732, term33732.getClass(), "mnemonic", 0);
        setIntField(term33732, term33732.getClass(), "mnemonicIndex", 0);
        setField(term33732, term33732.getClass(), "text", null);
        setField(term33732, term33732.getClass(), "defaultIcon", null);
        setField(term33732, term33732.getClass(), "disabledIcon", null);
        setBooleanField(term33732, term33732.getClass(), "disabledIconSet", false);
        setIntField(term33732, term33732.getClass(), "verticalAlignment", 0);
        setIntField(term33732, term33732.getClass(), "horizontalAlignment", 0);
        setIntField(term33732, term33732.getClass(), "verticalTextPosition", 0);
        setIntField(term33732, term33732.getClass(), "horizontalTextPosition", 0);
        setIntField(term33732, term33732.getClass(), "iconTextGap", 0);
        setField(term33732, term33732.getClass(), "labelFor", null);
        setBooleanField(term33732, term33732.getClass(), "isAlignmentXSet", false);
        setFloatField(term33732, term33732.getClass(), "alignmentX", 0.0F);
        setBooleanField(term33732, term33732.getClass(), "isAlignmentYSet", false);
        setFloatField(term33732, term33732.getClass(), "alignmentY", 0.0F);
        setField(term33732, term33732.getClass(), "ui", null);
        setField(term33732, term33732.getClass(), "listenerList", null);
        setField(term33732, term33732.getClass(), "clientProperties", null);
        setField(term33732, term33732.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term33732, term33732.getClass(), "autoscrolls", false);
        setField(term33732, term33732.getClass(), "border", null);
        setIntField(term33732, term33732.getClass(), "flags", 0);
        setField(term33732, term33732.getClass(), "inputVerifier", null);
        setBooleanField(term33732, term33732.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term33732, term33732.getClass(), "paintingChild", null);
        setField(term33732, term33732.getClass(), "popupMenu", null);
        setField(term33732, term33732.getClass(), "revalidateRunnableScheduled", null);
        setField(term33732, term33732.getClass(), "focusInputMap", null);
        setField(term33732, term33732.getClass(), "ancestorInputMap", null);
        setField(term33732, term33732.getClass(), "windowInputMap", null);
        setField(term33732, term33732.getClass(), "actionMap", null);
        setField(term33732, term33732.getClass(), "aaHint", null);
        setField(term33732, term33732.getClass(), "lcdRenderingHint", null);
        setField(term33732, term33732.getClass(), "component", null);
        setField(term33732, term33732.getClass(), "layoutMgr", null);
        setField(term33732, term33732.getClass(), "dispatcher", null);
        setField(term33732, term33732.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33732, term33732.getClass(), "focusCycleRoot", false);
        setBooleanField(term33732, term33732.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33732, term33732.getClass(), "printingThreads", null);
        setBooleanField(term33732, term33732.getClass(), "printing", false);
        setField(term33732, term33732.getClass(), "containerListener", null);
        setIntField(term33732, term33732.getClass(), "listeningChildren", 0);
        setIntField(term33732, term33732.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33732, term33732.getClass(), "descendantsCount", 0);
        setField(term33732, term33732.getClass(), "preserveBackgroundColor", null);
        setIntField(term33732, term33732.getClass(), "numOfHWComponents", 0);
        setIntField(term33732, term33732.getClass(), "numOfLWComponents", 0);
        setField(term33732, term33732.getClass(), "modalComp", null);
        setField(term33732, term33732.getClass(), "modalAppContext", null);
        setIntField(term33732, term33732.getClass(), "containerSerializedDataVersion", 0);
        setField(term33732, term33732.getClass(), "peer", null);
        setField(term33732, term33732.getClass(), "parent", null);
        setField(term33732, term33732.getClass(), "appContext", null);
        setIntField(term33732, term33732.getClass(), "x", 0);
        setIntField(term33732, term33732.getClass(), "y", 0);
        setIntField(term33732, term33732.getClass(), "width", 0);
        setIntField(term33732, term33732.getClass(), "height", 0);
        setField(term33732, term33732.getClass(), "foreground", null);
        setField(term33732, term33732.getClass(), "background", null);
        setField(term33732, term33732.getClass(), "font", null);
        setField(term33732, term33732.getClass(), "peerFont", null);
        setField(term33732, term33732.getClass(), "cursor", null);
        setField(term33732, term33732.getClass(), "locale", null);
        setField(term33732, term33732.getClass(), "graphicsConfig", null);
        setField(term33732, term33732.getClass(), "bufferStrategy", null);
        setBooleanField(term33732, term33732.getClass(), "ignoreRepaint", false);
        setBooleanField(term33732, term33732.getClass(), "visible", false);
        setBooleanField(term33732, term33732.getClass(), "enabled", false);
        setBooleanField(term33732, term33732.getClass(), "valid", false);
        setField(term33732, term33732.getClass(), "dropTarget", null);
        setField(term33732, term33732.getClass(), "popups", null);
        setField(term33732, term33732.getClass(), "name", null);
        setBooleanField(term33732, term33732.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33732, term33732.getClass(), "focusable", false);
        setIntField(term33732, term33732.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33732, term33732.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33732, term33732.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33732, term33732.getClass(), "acc", null);
        setField(term33732, term33732.getClass(), "minSize", null);
        setBooleanField(term33732, term33732.getClass(), "minSizeSet", false);
        setField(term33732, term33732.getClass(), "prefSize", null);
        setBooleanField(term33732, term33732.getClass(), "prefSizeSet", false);
        setField(term33732, term33732.getClass(), "maxSize", null);
        setBooleanField(term33732, term33732.getClass(), "maxSizeSet", false);
        setField(term33732, term33732.getClass(), "componentOrientation", null);
        setBooleanField(term33732, term33732.getClass(), "newEventsOnly", false);
        setField(term33732, term33732.getClass(), "componentListener", null);
        setField(term33732, term33732.getClass(), "focusListener", null);
        setField(term33732, term33732.getClass(), "hierarchyListener", null);
        setField(term33732, term33732.getClass(), "hierarchyBoundsListener", null);
        setField(term33732, term33732.getClass(), "keyListener", null);
        setField(term33732, term33732.getClass(), "mouseListener", null);
        setField(term33732, term33732.getClass(), "mouseMotionListener", null);
        setField(term33732, term33732.getClass(), "mouseWheelListener", null);
        setField(term33732, term33732.getClass(), "inputMethodListener", null);
        setLongField(term33732, term33732.getClass(), "eventMask", 0L);
        setField(term33732, term33732.getClass(), "changeSupport", null);
        setField(term33732, term33732.getClass(), "objectLock", null);
        setBooleanField(term33732, term33732.getClass(), "isPacked", false);
        setIntField(term33732, term33732.getClass(), "boundsOp", 0);
        setField(term33732, term33732.getClass(), "compoundShape", null);
        setField(term33732, term33732.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33732, term33732.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33732, term33732.getClass(), "backgroundEraseDisabled", false);
        setField(term33732, term33732.getClass(), "eventCache", null);
        setBooleanField(term33732, term33732.getClass(), "coalescingEnabled", false);
        setBooleanField(term33732, term33732.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33732, term33732.getClass(), "componentSerializedDataVersion", 0);
        setField(term33732, term33732.getClass(), "accessibleContext", null);
        term33783 = new Boolean(false);
        term33785 = new Boolean(false);
        term33787 = new Integer(0);
        term33789 = new Integer(0);
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
        args[2] = term33783;
        args[3] = term33785;
        args[4] = term33787;
        args[5] = term33789;
        callMethod(klass, "getTableCellRendererComponent", argTypes, term33732, args);
    }

};


