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

public class TreeCellRenderer_getUnselectedBackgroundColor_186736818621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58142;
     Object term58193;
     Object term58195;
     Object term58197;

    public TreeCellRenderer_getUnselectedBackgroundColor_186736818621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58142 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term58142, term58142.getClass(), "treeTableModel", null);
        setField(term58142, term58142.getClass(), "insets", null);
        setIntField(term58142, term58142.getClass(), "pixelsPerLevel", 0);
        setField(term58142, term58142.getClass(), "expandCollapseIconRenderer", null);
        setField(term58142, term58142.getClass(), "expandedIcon", null);
        setField(term58142, term58142.getClass(), "collapsedIcon", null);
        setIntField(term58142, term58142.getClass(), "maxIconWidth", 0);
        setField(term58142, term58142.getClass(), "currentNode", null);
        setField(term58142, term58142.getClass(), "unselectedForeground", null);
        setField(term58142, term58142.getClass(), "unselectedBackground", null);
        setIntField(term58142, term58142.getClass(), "mnemonic", 0);
        setIntField(term58142, term58142.getClass(), "mnemonicIndex", 0);
        setField(term58142, term58142.getClass(), "text", null);
        setField(term58142, term58142.getClass(), "defaultIcon", null);
        setField(term58142, term58142.getClass(), "disabledIcon", null);
        setBooleanField(term58142, term58142.getClass(), "disabledIconSet", false);
        setIntField(term58142, term58142.getClass(), "verticalAlignment", 0);
        setIntField(term58142, term58142.getClass(), "horizontalAlignment", 0);
        setIntField(term58142, term58142.getClass(), "verticalTextPosition", 0);
        setIntField(term58142, term58142.getClass(), "horizontalTextPosition", 0);
        setIntField(term58142, term58142.getClass(), "iconTextGap", 0);
        setField(term58142, term58142.getClass(), "labelFor", null);
        setBooleanField(term58142, term58142.getClass(), "isAlignmentXSet", false);
        setFloatField(term58142, term58142.getClass(), "alignmentX", 0.0F);
        setBooleanField(term58142, term58142.getClass(), "isAlignmentYSet", false);
        setFloatField(term58142, term58142.getClass(), "alignmentY", 0.0F);
        setField(term58142, term58142.getClass(), "ui", null);
        setField(term58142, term58142.getClass(), "listenerList", null);
        setField(term58142, term58142.getClass(), "clientProperties", null);
        setField(term58142, term58142.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term58142, term58142.getClass(), "autoscrolls", false);
        setField(term58142, term58142.getClass(), "border", null);
        setIntField(term58142, term58142.getClass(), "flags", 0);
        setField(term58142, term58142.getClass(), "inputVerifier", null);
        setBooleanField(term58142, term58142.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term58142, term58142.getClass(), "paintingChild", null);
        setField(term58142, term58142.getClass(), "popupMenu", null);
        setField(term58142, term58142.getClass(), "revalidateRunnableScheduled", null);
        setField(term58142, term58142.getClass(), "focusInputMap", null);
        setField(term58142, term58142.getClass(), "ancestorInputMap", null);
        setField(term58142, term58142.getClass(), "windowInputMap", null);
        setField(term58142, term58142.getClass(), "actionMap", null);
        setField(term58142, term58142.getClass(), "aaHint", null);
        setField(term58142, term58142.getClass(), "lcdRenderingHint", null);
        setField(term58142, term58142.getClass(), "component", null);
        setField(term58142, term58142.getClass(), "layoutMgr", null);
        setField(term58142, term58142.getClass(), "dispatcher", null);
        setField(term58142, term58142.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term58142, term58142.getClass(), "focusCycleRoot", false);
        setBooleanField(term58142, term58142.getClass(), "focusTraversalPolicyProvider", false);
        setField(term58142, term58142.getClass(), "printingThreads", null);
        setBooleanField(term58142, term58142.getClass(), "printing", false);
        setField(term58142, term58142.getClass(), "containerListener", null);
        setIntField(term58142, term58142.getClass(), "listeningChildren", 0);
        setIntField(term58142, term58142.getClass(), "listeningBoundsChildren", 0);
        setIntField(term58142, term58142.getClass(), "descendantsCount", 0);
        setField(term58142, term58142.getClass(), "preserveBackgroundColor", null);
        setIntField(term58142, term58142.getClass(), "numOfHWComponents", 0);
        setIntField(term58142, term58142.getClass(), "numOfLWComponents", 0);
        setField(term58142, term58142.getClass(), "modalComp", null);
        setField(term58142, term58142.getClass(), "modalAppContext", null);
        setIntField(term58142, term58142.getClass(), "containerSerializedDataVersion", 0);
        setField(term58142, term58142.getClass(), "peer", null);
        setField(term58142, term58142.getClass(), "parent", null);
        setField(term58142, term58142.getClass(), "appContext", null);
        setIntField(term58142, term58142.getClass(), "x", 0);
        setIntField(term58142, term58142.getClass(), "y", 0);
        setIntField(term58142, term58142.getClass(), "width", 0);
        setIntField(term58142, term58142.getClass(), "height", 0);
        setField(term58142, term58142.getClass(), "foreground", null);
        setField(term58142, term58142.getClass(), "background", null);
        setField(term58142, term58142.getClass(), "font", null);
        setField(term58142, term58142.getClass(), "peerFont", null);
        setField(term58142, term58142.getClass(), "cursor", null);
        setField(term58142, term58142.getClass(), "locale", null);
        setField(term58142, term58142.getClass(), "graphicsConfig", null);
        setField(term58142, term58142.getClass(), "bufferStrategy", null);
        setBooleanField(term58142, term58142.getClass(), "ignoreRepaint", false);
        setBooleanField(term58142, term58142.getClass(), "visible", false);
        setBooleanField(term58142, term58142.getClass(), "enabled", false);
        setBooleanField(term58142, term58142.getClass(), "valid", false);
        setField(term58142, term58142.getClass(), "dropTarget", null);
        setField(term58142, term58142.getClass(), "popups", null);
        setField(term58142, term58142.getClass(), "name", null);
        setBooleanField(term58142, term58142.getClass(), "nameExplicitlySet", false);
        setBooleanField(term58142, term58142.getClass(), "focusable", false);
        setIntField(term58142, term58142.getClass(), "isFocusTraversableOverridden", 0);
        setField(term58142, term58142.getClass(), "focusTraversalKeys", null);
        setBooleanField(term58142, term58142.getClass(), "focusTraversalKeysEnabled", false);
        setField(term58142, term58142.getClass(), "acc", null);
        setField(term58142, term58142.getClass(), "minSize", null);
        setBooleanField(term58142, term58142.getClass(), "minSizeSet", false);
        setField(term58142, term58142.getClass(), "prefSize", null);
        setBooleanField(term58142, term58142.getClass(), "prefSizeSet", false);
        setField(term58142, term58142.getClass(), "maxSize", null);
        setBooleanField(term58142, term58142.getClass(), "maxSizeSet", false);
        setField(term58142, term58142.getClass(), "componentOrientation", null);
        setBooleanField(term58142, term58142.getClass(), "newEventsOnly", false);
        setField(term58142, term58142.getClass(), "componentListener", null);
        setField(term58142, term58142.getClass(), "focusListener", null);
        setField(term58142, term58142.getClass(), "hierarchyListener", null);
        setField(term58142, term58142.getClass(), "hierarchyBoundsListener", null);
        setField(term58142, term58142.getClass(), "keyListener", null);
        setField(term58142, term58142.getClass(), "mouseListener", null);
        setField(term58142, term58142.getClass(), "mouseMotionListener", null);
        setField(term58142, term58142.getClass(), "mouseWheelListener", null);
        setField(term58142, term58142.getClass(), "inputMethodListener", null);
        setLongField(term58142, term58142.getClass(), "eventMask", 0L);
        setField(term58142, term58142.getClass(), "changeSupport", null);
        setField(term58142, term58142.getClass(), "objectLock", null);
        setBooleanField(term58142, term58142.getClass(), "isPacked", false);
        setIntField(term58142, term58142.getClass(), "boundsOp", 0);
        setField(term58142, term58142.getClass(), "compoundShape", null);
        setField(term58142, term58142.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term58142, term58142.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term58142, term58142.getClass(), "backgroundEraseDisabled", false);
        setField(term58142, term58142.getClass(), "eventCache", null);
        setBooleanField(term58142, term58142.getClass(), "coalescingEnabled", false);
        setBooleanField(term58142, term58142.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term58142, term58142.getClass(), "componentSerializedDataVersion", 0);
        setField(term58142, term58142.getClass(), "accessibleContext", null);
        term58193 = new Boolean(false);
        term58195 = new Integer(0);
        term58197 = new Integer(0);
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
        args[2] = term58193;
        args[3] = term58195;
        args[4] = term58197;
        callMethod(klass, "getUnselectedBackgroundColor", argTypes, term58142, args);
    }

};


