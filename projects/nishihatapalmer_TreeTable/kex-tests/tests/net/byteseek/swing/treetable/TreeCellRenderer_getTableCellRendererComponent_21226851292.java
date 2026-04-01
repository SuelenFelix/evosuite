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
     Object term33836;
     Object term33887;
     Object term33889;
     Object term33891;
     Object term33893;

    public TreeCellRenderer_getTableCellRendererComponent_21226851292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33836 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term33836, term33836.getClass(), "treeTableModel", null);
        setField(term33836, term33836.getClass(), "insets", null);
        setIntField(term33836, term33836.getClass(), "pixelsPerLevel", 0);
        setField(term33836, term33836.getClass(), "expandCollapseIconRenderer", null);
        setField(term33836, term33836.getClass(), "expandedIcon", null);
        setField(term33836, term33836.getClass(), "collapsedIcon", null);
        setIntField(term33836, term33836.getClass(), "maxIconWidth", 0);
        setField(term33836, term33836.getClass(), "currentNode", null);
        setField(term33836, term33836.getClass(), "unselectedForeground", null);
        setField(term33836, term33836.getClass(), "unselectedBackground", null);
        setIntField(term33836, term33836.getClass(), "mnemonic", 0);
        setIntField(term33836, term33836.getClass(), "mnemonicIndex", 0);
        setField(term33836, term33836.getClass(), "text", null);
        setField(term33836, term33836.getClass(), "defaultIcon", null);
        setField(term33836, term33836.getClass(), "disabledIcon", null);
        setBooleanField(term33836, term33836.getClass(), "disabledIconSet", false);
        setIntField(term33836, term33836.getClass(), "verticalAlignment", 0);
        setIntField(term33836, term33836.getClass(), "horizontalAlignment", 0);
        setIntField(term33836, term33836.getClass(), "verticalTextPosition", 0);
        setIntField(term33836, term33836.getClass(), "horizontalTextPosition", 0);
        setIntField(term33836, term33836.getClass(), "iconTextGap", 0);
        setField(term33836, term33836.getClass(), "labelFor", null);
        setBooleanField(term33836, term33836.getClass(), "isAlignmentXSet", false);
        setFloatField(term33836, term33836.getClass(), "alignmentX", 0.0F);
        setBooleanField(term33836, term33836.getClass(), "isAlignmentYSet", false);
        setFloatField(term33836, term33836.getClass(), "alignmentY", 0.0F);
        setField(term33836, term33836.getClass(), "ui", null);
        setField(term33836, term33836.getClass(), "listenerList", null);
        setField(term33836, term33836.getClass(), "clientProperties", null);
        setField(term33836, term33836.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term33836, term33836.getClass(), "autoscrolls", false);
        setField(term33836, term33836.getClass(), "border", null);
        setIntField(term33836, term33836.getClass(), "flags", 0);
        setField(term33836, term33836.getClass(), "inputVerifier", null);
        setBooleanField(term33836, term33836.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term33836, term33836.getClass(), "paintingChild", null);
        setField(term33836, term33836.getClass(), "popupMenu", null);
        setField(term33836, term33836.getClass(), "revalidateRunnableScheduled", null);
        setField(term33836, term33836.getClass(), "focusInputMap", null);
        setField(term33836, term33836.getClass(), "ancestorInputMap", null);
        setField(term33836, term33836.getClass(), "windowInputMap", null);
        setField(term33836, term33836.getClass(), "actionMap", null);
        setField(term33836, term33836.getClass(), "aaHint", null);
        setField(term33836, term33836.getClass(), "lcdRenderingHint", null);
        setField(term33836, term33836.getClass(), "component", null);
        setField(term33836, term33836.getClass(), "layoutMgr", null);
        setField(term33836, term33836.getClass(), "dispatcher", null);
        setField(term33836, term33836.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33836, term33836.getClass(), "focusCycleRoot", false);
        setBooleanField(term33836, term33836.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33836, term33836.getClass(), "printingThreads", null);
        setBooleanField(term33836, term33836.getClass(), "printing", false);
        setField(term33836, term33836.getClass(), "containerListener", null);
        setIntField(term33836, term33836.getClass(), "listeningChildren", 0);
        setIntField(term33836, term33836.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33836, term33836.getClass(), "descendantsCount", 0);
        setField(term33836, term33836.getClass(), "preserveBackgroundColor", null);
        setIntField(term33836, term33836.getClass(), "numOfHWComponents", 0);
        setIntField(term33836, term33836.getClass(), "numOfLWComponents", 0);
        setField(term33836, term33836.getClass(), "modalComp", null);
        setField(term33836, term33836.getClass(), "modalAppContext", null);
        setIntField(term33836, term33836.getClass(), "containerSerializedDataVersion", 0);
        setField(term33836, term33836.getClass(), "peer", null);
        setField(term33836, term33836.getClass(), "parent", null);
        setField(term33836, term33836.getClass(), "appContext", null);
        setIntField(term33836, term33836.getClass(), "x", 0);
        setIntField(term33836, term33836.getClass(), "y", 0);
        setIntField(term33836, term33836.getClass(), "width", 0);
        setIntField(term33836, term33836.getClass(), "height", 0);
        setField(term33836, term33836.getClass(), "foreground", null);
        setField(term33836, term33836.getClass(), "background", null);
        setField(term33836, term33836.getClass(), "font", null);
        setField(term33836, term33836.getClass(), "peerFont", null);
        setField(term33836, term33836.getClass(), "cursor", null);
        setField(term33836, term33836.getClass(), "locale", null);
        setField(term33836, term33836.getClass(), "graphicsConfig", null);
        setField(term33836, term33836.getClass(), "bufferStrategy", null);
        setBooleanField(term33836, term33836.getClass(), "ignoreRepaint", false);
        setBooleanField(term33836, term33836.getClass(), "visible", false);
        setBooleanField(term33836, term33836.getClass(), "enabled", false);
        setBooleanField(term33836, term33836.getClass(), "valid", false);
        setField(term33836, term33836.getClass(), "dropTarget", null);
        setField(term33836, term33836.getClass(), "popups", null);
        setField(term33836, term33836.getClass(), "name", null);
        setBooleanField(term33836, term33836.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33836, term33836.getClass(), "focusable", false);
        setIntField(term33836, term33836.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33836, term33836.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33836, term33836.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33836, term33836.getClass(), "acc", null);
        setField(term33836, term33836.getClass(), "minSize", null);
        setBooleanField(term33836, term33836.getClass(), "minSizeSet", false);
        setField(term33836, term33836.getClass(), "prefSize", null);
        setBooleanField(term33836, term33836.getClass(), "prefSizeSet", false);
        setField(term33836, term33836.getClass(), "maxSize", null);
        setBooleanField(term33836, term33836.getClass(), "maxSizeSet", false);
        setField(term33836, term33836.getClass(), "componentOrientation", null);
        setBooleanField(term33836, term33836.getClass(), "newEventsOnly", false);
        setField(term33836, term33836.getClass(), "componentListener", null);
        setField(term33836, term33836.getClass(), "focusListener", null);
        setField(term33836, term33836.getClass(), "hierarchyListener", null);
        setField(term33836, term33836.getClass(), "hierarchyBoundsListener", null);
        setField(term33836, term33836.getClass(), "keyListener", null);
        setField(term33836, term33836.getClass(), "mouseListener", null);
        setField(term33836, term33836.getClass(), "mouseMotionListener", null);
        setField(term33836, term33836.getClass(), "mouseWheelListener", null);
        setField(term33836, term33836.getClass(), "inputMethodListener", null);
        setLongField(term33836, term33836.getClass(), "eventMask", 0L);
        setField(term33836, term33836.getClass(), "changeSupport", null);
        setField(term33836, term33836.getClass(), "objectLock", null);
        setBooleanField(term33836, term33836.getClass(), "isPacked", false);
        setIntField(term33836, term33836.getClass(), "boundsOp", 0);
        setField(term33836, term33836.getClass(), "compoundShape", null);
        setField(term33836, term33836.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33836, term33836.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33836, term33836.getClass(), "backgroundEraseDisabled", false);
        setField(term33836, term33836.getClass(), "eventCache", null);
        setBooleanField(term33836, term33836.getClass(), "coalescingEnabled", false);
        setBooleanField(term33836, term33836.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33836, term33836.getClass(), "componentSerializedDataVersion", 0);
        setField(term33836, term33836.getClass(), "accessibleContext", null);
        term33887 = new Boolean(false);
        term33889 = new Boolean(false);
        term33891 = new Integer(0);
        term33893 = new Integer(0);
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
        args[2] = term33887;
        args[3] = term33889;
        args[4] = term33891;
        args[5] = term33893;
        callMethod(klass, "getTableCellRendererComponent", argTypes, term33836, args);
    }

};


