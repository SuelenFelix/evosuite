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
     Object term61726;
     Object term61777;
     Object term61779;
     Object term61781;
     Object term61783;

    public TreeCellRenderer_getToolTipText_184267901723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61726 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term61726, term61726.getClass(), "treeTableModel", null);
        setField(term61726, term61726.getClass(), "insets", null);
        setIntField(term61726, term61726.getClass(), "pixelsPerLevel", 0);
        setField(term61726, term61726.getClass(), "expandCollapseIconRenderer", null);
        setField(term61726, term61726.getClass(), "expandedIcon", null);
        setField(term61726, term61726.getClass(), "collapsedIcon", null);
        setIntField(term61726, term61726.getClass(), "maxIconWidth", 0);
        setField(term61726, term61726.getClass(), "currentNode", null);
        setField(term61726, term61726.getClass(), "unselectedForeground", null);
        setField(term61726, term61726.getClass(), "unselectedBackground", null);
        setIntField(term61726, term61726.getClass(), "mnemonic", 0);
        setIntField(term61726, term61726.getClass(), "mnemonicIndex", 0);
        setField(term61726, term61726.getClass(), "text", null);
        setField(term61726, term61726.getClass(), "defaultIcon", null);
        setField(term61726, term61726.getClass(), "disabledIcon", null);
        setBooleanField(term61726, term61726.getClass(), "disabledIconSet", false);
        setIntField(term61726, term61726.getClass(), "verticalAlignment", 0);
        setIntField(term61726, term61726.getClass(), "horizontalAlignment", 0);
        setIntField(term61726, term61726.getClass(), "verticalTextPosition", 0);
        setIntField(term61726, term61726.getClass(), "horizontalTextPosition", 0);
        setIntField(term61726, term61726.getClass(), "iconTextGap", 0);
        setField(term61726, term61726.getClass(), "labelFor", null);
        setBooleanField(term61726, term61726.getClass(), "isAlignmentXSet", false);
        setFloatField(term61726, term61726.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61726, term61726.getClass(), "isAlignmentYSet", false);
        setFloatField(term61726, term61726.getClass(), "alignmentY", 0.0F);
        setField(term61726, term61726.getClass(), "ui", null);
        setField(term61726, term61726.getClass(), "listenerList", null);
        setField(term61726, term61726.getClass(), "clientProperties", null);
        setField(term61726, term61726.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61726, term61726.getClass(), "autoscrolls", false);
        setField(term61726, term61726.getClass(), "border", null);
        setIntField(term61726, term61726.getClass(), "flags", 0);
        setField(term61726, term61726.getClass(), "inputVerifier", null);
        setBooleanField(term61726, term61726.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61726, term61726.getClass(), "paintingChild", null);
        setField(term61726, term61726.getClass(), "popupMenu", null);
        setField(term61726, term61726.getClass(), "revalidateRunnableScheduled", null);
        setField(term61726, term61726.getClass(), "focusInputMap", null);
        setField(term61726, term61726.getClass(), "ancestorInputMap", null);
        setField(term61726, term61726.getClass(), "windowInputMap", null);
        setField(term61726, term61726.getClass(), "actionMap", null);
        setField(term61726, term61726.getClass(), "aaHint", null);
        setField(term61726, term61726.getClass(), "lcdRenderingHint", null);
        setField(term61726, term61726.getClass(), "component", null);
        setField(term61726, term61726.getClass(), "layoutMgr", null);
        setField(term61726, term61726.getClass(), "dispatcher", null);
        setField(term61726, term61726.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61726, term61726.getClass(), "focusCycleRoot", false);
        setBooleanField(term61726, term61726.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61726, term61726.getClass(), "printingThreads", null);
        setBooleanField(term61726, term61726.getClass(), "printing", false);
        setField(term61726, term61726.getClass(), "containerListener", null);
        setIntField(term61726, term61726.getClass(), "listeningChildren", 0);
        setIntField(term61726, term61726.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61726, term61726.getClass(), "descendantsCount", 0);
        setField(term61726, term61726.getClass(), "preserveBackgroundColor", null);
        setIntField(term61726, term61726.getClass(), "numOfHWComponents", 0);
        setIntField(term61726, term61726.getClass(), "numOfLWComponents", 0);
        setField(term61726, term61726.getClass(), "modalComp", null);
        setField(term61726, term61726.getClass(), "modalAppContext", null);
        setIntField(term61726, term61726.getClass(), "containerSerializedDataVersion", 0);
        setField(term61726, term61726.getClass(), "peer", null);
        setField(term61726, term61726.getClass(), "parent", null);
        setField(term61726, term61726.getClass(), "appContext", null);
        setIntField(term61726, term61726.getClass(), "x", 0);
        setIntField(term61726, term61726.getClass(), "y", 0);
        setIntField(term61726, term61726.getClass(), "width", 0);
        setIntField(term61726, term61726.getClass(), "height", 0);
        setField(term61726, term61726.getClass(), "foreground", null);
        setField(term61726, term61726.getClass(), "background", null);
        setField(term61726, term61726.getClass(), "font", null);
        setField(term61726, term61726.getClass(), "peerFont", null);
        setField(term61726, term61726.getClass(), "cursor", null);
        setField(term61726, term61726.getClass(), "locale", null);
        setField(term61726, term61726.getClass(), "graphicsConfig", null);
        setField(term61726, term61726.getClass(), "bufferStrategy", null);
        setBooleanField(term61726, term61726.getClass(), "ignoreRepaint", false);
        setBooleanField(term61726, term61726.getClass(), "visible", false);
        setBooleanField(term61726, term61726.getClass(), "enabled", false);
        setBooleanField(term61726, term61726.getClass(), "valid", false);
        setField(term61726, term61726.getClass(), "dropTarget", null);
        setField(term61726, term61726.getClass(), "popups", null);
        setField(term61726, term61726.getClass(), "name", null);
        setBooleanField(term61726, term61726.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61726, term61726.getClass(), "focusable", false);
        setIntField(term61726, term61726.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61726, term61726.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61726, term61726.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61726, term61726.getClass(), "acc", null);
        setField(term61726, term61726.getClass(), "minSize", null);
        setBooleanField(term61726, term61726.getClass(), "minSizeSet", false);
        setField(term61726, term61726.getClass(), "prefSize", null);
        setBooleanField(term61726, term61726.getClass(), "prefSizeSet", false);
        setField(term61726, term61726.getClass(), "maxSize", null);
        setBooleanField(term61726, term61726.getClass(), "maxSizeSet", false);
        setField(term61726, term61726.getClass(), "componentOrientation", null);
        setBooleanField(term61726, term61726.getClass(), "newEventsOnly", false);
        setField(term61726, term61726.getClass(), "componentListener", null);
        setField(term61726, term61726.getClass(), "focusListener", null);
        setField(term61726, term61726.getClass(), "hierarchyListener", null);
        setField(term61726, term61726.getClass(), "hierarchyBoundsListener", null);
        setField(term61726, term61726.getClass(), "keyListener", null);
        setField(term61726, term61726.getClass(), "mouseListener", null);
        setField(term61726, term61726.getClass(), "mouseMotionListener", null);
        setField(term61726, term61726.getClass(), "mouseWheelListener", null);
        setField(term61726, term61726.getClass(), "inputMethodListener", null);
        setLongField(term61726, term61726.getClass(), "eventMask", 0L);
        setField(term61726, term61726.getClass(), "changeSupport", null);
        setField(term61726, term61726.getClass(), "objectLock", null);
        setBooleanField(term61726, term61726.getClass(), "isPacked", false);
        setIntField(term61726, term61726.getClass(), "boundsOp", 0);
        setField(term61726, term61726.getClass(), "compoundShape", null);
        setField(term61726, term61726.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61726, term61726.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61726, term61726.getClass(), "backgroundEraseDisabled", false);
        setField(term61726, term61726.getClass(), "eventCache", null);
        setBooleanField(term61726, term61726.getClass(), "coalescingEnabled", false);
        setBooleanField(term61726, term61726.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61726, term61726.getClass(), "componentSerializedDataVersion", 0);
        setField(term61726, term61726.getClass(), "accessibleContext", null);
        term61777 = new Boolean(false);
        term61779 = new Boolean(false);
        term61781 = new Integer(0);
        term61783 = new Integer(0);
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
        args[2] = term61777;
        args[3] = term61779;
        args[4] = term61781;
        args[5] = term61783;
        callMethod(klass, "getToolTipText", argTypes, term61726, args);
    }

};


