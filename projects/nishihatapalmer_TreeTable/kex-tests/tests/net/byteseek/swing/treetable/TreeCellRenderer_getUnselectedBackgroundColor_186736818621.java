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
     Object term57585;
     Object term57636;
     Object term57638;
     Object term57640;

    public TreeCellRenderer_getUnselectedBackgroundColor_186736818621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57585 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term57585, term57585.getClass(), "treeTableModel", null);
        setField(term57585, term57585.getClass(), "insets", null);
        setIntField(term57585, term57585.getClass(), "pixelsPerLevel", 0);
        setField(term57585, term57585.getClass(), "expandCollapseIconRenderer", null);
        setField(term57585, term57585.getClass(), "expandedIcon", null);
        setField(term57585, term57585.getClass(), "collapsedIcon", null);
        setIntField(term57585, term57585.getClass(), "maxIconWidth", 0);
        setField(term57585, term57585.getClass(), "currentNode", null);
        setField(term57585, term57585.getClass(), "unselectedForeground", null);
        setField(term57585, term57585.getClass(), "unselectedBackground", null);
        setIntField(term57585, term57585.getClass(), "mnemonic", 0);
        setIntField(term57585, term57585.getClass(), "mnemonicIndex", 0);
        setField(term57585, term57585.getClass(), "text", null);
        setField(term57585, term57585.getClass(), "defaultIcon", null);
        setField(term57585, term57585.getClass(), "disabledIcon", null);
        setBooleanField(term57585, term57585.getClass(), "disabledIconSet", false);
        setIntField(term57585, term57585.getClass(), "verticalAlignment", 0);
        setIntField(term57585, term57585.getClass(), "horizontalAlignment", 0);
        setIntField(term57585, term57585.getClass(), "verticalTextPosition", 0);
        setIntField(term57585, term57585.getClass(), "horizontalTextPosition", 0);
        setIntField(term57585, term57585.getClass(), "iconTextGap", 0);
        setField(term57585, term57585.getClass(), "labelFor", null);
        setBooleanField(term57585, term57585.getClass(), "isAlignmentXSet", false);
        setFloatField(term57585, term57585.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57585, term57585.getClass(), "isAlignmentYSet", false);
        setFloatField(term57585, term57585.getClass(), "alignmentY", 0.0F);
        setField(term57585, term57585.getClass(), "ui", null);
        setField(term57585, term57585.getClass(), "listenerList", null);
        setField(term57585, term57585.getClass(), "clientProperties", null);
        setField(term57585, term57585.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57585, term57585.getClass(), "autoscrolls", false);
        setField(term57585, term57585.getClass(), "border", null);
        setIntField(term57585, term57585.getClass(), "flags", 0);
        setField(term57585, term57585.getClass(), "inputVerifier", null);
        setBooleanField(term57585, term57585.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57585, term57585.getClass(), "paintingChild", null);
        setField(term57585, term57585.getClass(), "popupMenu", null);
        setField(term57585, term57585.getClass(), "revalidateRunnableScheduled", null);
        setField(term57585, term57585.getClass(), "focusInputMap", null);
        setField(term57585, term57585.getClass(), "ancestorInputMap", null);
        setField(term57585, term57585.getClass(), "windowInputMap", null);
        setField(term57585, term57585.getClass(), "actionMap", null);
        setField(term57585, term57585.getClass(), "aaHint", null);
        setField(term57585, term57585.getClass(), "lcdRenderingHint", null);
        setField(term57585, term57585.getClass(), "component", null);
        setField(term57585, term57585.getClass(), "layoutMgr", null);
        setField(term57585, term57585.getClass(), "dispatcher", null);
        setField(term57585, term57585.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57585, term57585.getClass(), "focusCycleRoot", false);
        setBooleanField(term57585, term57585.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57585, term57585.getClass(), "printingThreads", null);
        setBooleanField(term57585, term57585.getClass(), "printing", false);
        setField(term57585, term57585.getClass(), "containerListener", null);
        setIntField(term57585, term57585.getClass(), "listeningChildren", 0);
        setIntField(term57585, term57585.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57585, term57585.getClass(), "descendantsCount", 0);
        setField(term57585, term57585.getClass(), "preserveBackgroundColor", null);
        setIntField(term57585, term57585.getClass(), "numOfHWComponents", 0);
        setIntField(term57585, term57585.getClass(), "numOfLWComponents", 0);
        setField(term57585, term57585.getClass(), "modalComp", null);
        setField(term57585, term57585.getClass(), "modalAppContext", null);
        setIntField(term57585, term57585.getClass(), "containerSerializedDataVersion", 0);
        setField(term57585, term57585.getClass(), "peer", null);
        setField(term57585, term57585.getClass(), "parent", null);
        setField(term57585, term57585.getClass(), "appContext", null);
        setIntField(term57585, term57585.getClass(), "x", 0);
        setIntField(term57585, term57585.getClass(), "y", 0);
        setIntField(term57585, term57585.getClass(), "width", 0);
        setIntField(term57585, term57585.getClass(), "height", 0);
        setField(term57585, term57585.getClass(), "foreground", null);
        setField(term57585, term57585.getClass(), "background", null);
        setField(term57585, term57585.getClass(), "font", null);
        setField(term57585, term57585.getClass(), "peerFont", null);
        setField(term57585, term57585.getClass(), "cursor", null);
        setField(term57585, term57585.getClass(), "locale", null);
        setField(term57585, term57585.getClass(), "graphicsConfig", null);
        setField(term57585, term57585.getClass(), "bufferStrategy", null);
        setBooleanField(term57585, term57585.getClass(), "ignoreRepaint", false);
        setBooleanField(term57585, term57585.getClass(), "visible", false);
        setBooleanField(term57585, term57585.getClass(), "enabled", false);
        setBooleanField(term57585, term57585.getClass(), "valid", false);
        setField(term57585, term57585.getClass(), "dropTarget", null);
        setField(term57585, term57585.getClass(), "popups", null);
        setField(term57585, term57585.getClass(), "name", null);
        setBooleanField(term57585, term57585.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57585, term57585.getClass(), "focusable", false);
        setIntField(term57585, term57585.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57585, term57585.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57585, term57585.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57585, term57585.getClass(), "acc", null);
        setField(term57585, term57585.getClass(), "minSize", null);
        setBooleanField(term57585, term57585.getClass(), "minSizeSet", false);
        setField(term57585, term57585.getClass(), "prefSize", null);
        setBooleanField(term57585, term57585.getClass(), "prefSizeSet", false);
        setField(term57585, term57585.getClass(), "maxSize", null);
        setBooleanField(term57585, term57585.getClass(), "maxSizeSet", false);
        setField(term57585, term57585.getClass(), "componentOrientation", null);
        setBooleanField(term57585, term57585.getClass(), "newEventsOnly", false);
        setField(term57585, term57585.getClass(), "componentListener", null);
        setField(term57585, term57585.getClass(), "focusListener", null);
        setField(term57585, term57585.getClass(), "hierarchyListener", null);
        setField(term57585, term57585.getClass(), "hierarchyBoundsListener", null);
        setField(term57585, term57585.getClass(), "keyListener", null);
        setField(term57585, term57585.getClass(), "mouseListener", null);
        setField(term57585, term57585.getClass(), "mouseMotionListener", null);
        setField(term57585, term57585.getClass(), "mouseWheelListener", null);
        setField(term57585, term57585.getClass(), "inputMethodListener", null);
        setLongField(term57585, term57585.getClass(), "eventMask", 0L);
        setField(term57585, term57585.getClass(), "changeSupport", null);
        setField(term57585, term57585.getClass(), "objectLock", null);
        setBooleanField(term57585, term57585.getClass(), "isPacked", false);
        setIntField(term57585, term57585.getClass(), "boundsOp", 0);
        setField(term57585, term57585.getClass(), "compoundShape", null);
        setField(term57585, term57585.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57585, term57585.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57585, term57585.getClass(), "backgroundEraseDisabled", false);
        setField(term57585, term57585.getClass(), "eventCache", null);
        setBooleanField(term57585, term57585.getClass(), "coalescingEnabled", false);
        setBooleanField(term57585, term57585.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57585, term57585.getClass(), "componentSerializedDataVersion", 0);
        setField(term57585, term57585.getClass(), "accessibleContext", null);
        term57636 = new Boolean(false);
        term57638 = new Integer(0);
        term57640 = new Integer(0);
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
        args[2] = term57636;
        args[3] = term57638;
        args[4] = term57640;
        callMethod(klass, "getUnselectedBackgroundColor", argTypes, term57585, args);
    }

};


