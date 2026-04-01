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

public class TreeCellRenderer_getFont_35663657227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70512;
     Object term70563;
     Object term70565;
     Object term70567;
     Object term70569;

    public TreeCellRenderer_getFont_35663657227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70512 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term70512, term70512.getClass(), "treeTableModel", null);
        setField(term70512, term70512.getClass(), "insets", null);
        setIntField(term70512, term70512.getClass(), "pixelsPerLevel", 0);
        setField(term70512, term70512.getClass(), "expandCollapseIconRenderer", null);
        setField(term70512, term70512.getClass(), "expandedIcon", null);
        setField(term70512, term70512.getClass(), "collapsedIcon", null);
        setIntField(term70512, term70512.getClass(), "maxIconWidth", 0);
        setField(term70512, term70512.getClass(), "currentNode", null);
        setField(term70512, term70512.getClass(), "unselectedForeground", null);
        setField(term70512, term70512.getClass(), "unselectedBackground", null);
        setIntField(term70512, term70512.getClass(), "mnemonic", 0);
        setIntField(term70512, term70512.getClass(), "mnemonicIndex", 0);
        setField(term70512, term70512.getClass(), "text", null);
        setField(term70512, term70512.getClass(), "defaultIcon", null);
        setField(term70512, term70512.getClass(), "disabledIcon", null);
        setBooleanField(term70512, term70512.getClass(), "disabledIconSet", false);
        setIntField(term70512, term70512.getClass(), "verticalAlignment", 0);
        setIntField(term70512, term70512.getClass(), "horizontalAlignment", 0);
        setIntField(term70512, term70512.getClass(), "verticalTextPosition", 0);
        setIntField(term70512, term70512.getClass(), "horizontalTextPosition", 0);
        setIntField(term70512, term70512.getClass(), "iconTextGap", 0);
        setField(term70512, term70512.getClass(), "labelFor", null);
        setBooleanField(term70512, term70512.getClass(), "isAlignmentXSet", false);
        setFloatField(term70512, term70512.getClass(), "alignmentX", 0.0F);
        setBooleanField(term70512, term70512.getClass(), "isAlignmentYSet", false);
        setFloatField(term70512, term70512.getClass(), "alignmentY", 0.0F);
        setField(term70512, term70512.getClass(), "ui", null);
        setField(term70512, term70512.getClass(), "listenerList", null);
        setField(term70512, term70512.getClass(), "clientProperties", null);
        setField(term70512, term70512.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term70512, term70512.getClass(), "autoscrolls", false);
        setField(term70512, term70512.getClass(), "border", null);
        setIntField(term70512, term70512.getClass(), "flags", 0);
        setField(term70512, term70512.getClass(), "inputVerifier", null);
        setBooleanField(term70512, term70512.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term70512, term70512.getClass(), "paintingChild", null);
        setField(term70512, term70512.getClass(), "popupMenu", null);
        setField(term70512, term70512.getClass(), "revalidateRunnableScheduled", null);
        setField(term70512, term70512.getClass(), "focusInputMap", null);
        setField(term70512, term70512.getClass(), "ancestorInputMap", null);
        setField(term70512, term70512.getClass(), "windowInputMap", null);
        setField(term70512, term70512.getClass(), "actionMap", null);
        setField(term70512, term70512.getClass(), "aaHint", null);
        setField(term70512, term70512.getClass(), "lcdRenderingHint", null);
        setField(term70512, term70512.getClass(), "component", null);
        setField(term70512, term70512.getClass(), "layoutMgr", null);
        setField(term70512, term70512.getClass(), "dispatcher", null);
        setField(term70512, term70512.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term70512, term70512.getClass(), "focusCycleRoot", false);
        setBooleanField(term70512, term70512.getClass(), "focusTraversalPolicyProvider", false);
        setField(term70512, term70512.getClass(), "printingThreads", null);
        setBooleanField(term70512, term70512.getClass(), "printing", false);
        setField(term70512, term70512.getClass(), "containerListener", null);
        setIntField(term70512, term70512.getClass(), "listeningChildren", 0);
        setIntField(term70512, term70512.getClass(), "listeningBoundsChildren", 0);
        setIntField(term70512, term70512.getClass(), "descendantsCount", 0);
        setField(term70512, term70512.getClass(), "preserveBackgroundColor", null);
        setIntField(term70512, term70512.getClass(), "numOfHWComponents", 0);
        setIntField(term70512, term70512.getClass(), "numOfLWComponents", 0);
        setField(term70512, term70512.getClass(), "modalComp", null);
        setField(term70512, term70512.getClass(), "modalAppContext", null);
        setIntField(term70512, term70512.getClass(), "containerSerializedDataVersion", 0);
        setField(term70512, term70512.getClass(), "peer", null);
        setField(term70512, term70512.getClass(), "parent", null);
        setField(term70512, term70512.getClass(), "appContext", null);
        setIntField(term70512, term70512.getClass(), "x", 0);
        setIntField(term70512, term70512.getClass(), "y", 0);
        setIntField(term70512, term70512.getClass(), "width", 0);
        setIntField(term70512, term70512.getClass(), "height", 0);
        setField(term70512, term70512.getClass(), "foreground", null);
        setField(term70512, term70512.getClass(), "background", null);
        setField(term70512, term70512.getClass(), "font", null);
        setField(term70512, term70512.getClass(), "peerFont", null);
        setField(term70512, term70512.getClass(), "cursor", null);
        setField(term70512, term70512.getClass(), "locale", null);
        setField(term70512, term70512.getClass(), "graphicsConfig", null);
        setField(term70512, term70512.getClass(), "bufferStrategy", null);
        setBooleanField(term70512, term70512.getClass(), "ignoreRepaint", false);
        setBooleanField(term70512, term70512.getClass(), "visible", false);
        setBooleanField(term70512, term70512.getClass(), "enabled", false);
        setBooleanField(term70512, term70512.getClass(), "valid", false);
        setField(term70512, term70512.getClass(), "dropTarget", null);
        setField(term70512, term70512.getClass(), "popups", null);
        setField(term70512, term70512.getClass(), "name", null);
        setBooleanField(term70512, term70512.getClass(), "nameExplicitlySet", false);
        setBooleanField(term70512, term70512.getClass(), "focusable", false);
        setIntField(term70512, term70512.getClass(), "isFocusTraversableOverridden", 0);
        setField(term70512, term70512.getClass(), "focusTraversalKeys", null);
        setBooleanField(term70512, term70512.getClass(), "focusTraversalKeysEnabled", false);
        setField(term70512, term70512.getClass(), "acc", null);
        setField(term70512, term70512.getClass(), "minSize", null);
        setBooleanField(term70512, term70512.getClass(), "minSizeSet", false);
        setField(term70512, term70512.getClass(), "prefSize", null);
        setBooleanField(term70512, term70512.getClass(), "prefSizeSet", false);
        setField(term70512, term70512.getClass(), "maxSize", null);
        setBooleanField(term70512, term70512.getClass(), "maxSizeSet", false);
        setField(term70512, term70512.getClass(), "componentOrientation", null);
        setBooleanField(term70512, term70512.getClass(), "newEventsOnly", false);
        setField(term70512, term70512.getClass(), "componentListener", null);
        setField(term70512, term70512.getClass(), "focusListener", null);
        setField(term70512, term70512.getClass(), "hierarchyListener", null);
        setField(term70512, term70512.getClass(), "hierarchyBoundsListener", null);
        setField(term70512, term70512.getClass(), "keyListener", null);
        setField(term70512, term70512.getClass(), "mouseListener", null);
        setField(term70512, term70512.getClass(), "mouseMotionListener", null);
        setField(term70512, term70512.getClass(), "mouseWheelListener", null);
        setField(term70512, term70512.getClass(), "inputMethodListener", null);
        setLongField(term70512, term70512.getClass(), "eventMask", 0L);
        setField(term70512, term70512.getClass(), "changeSupport", null);
        setField(term70512, term70512.getClass(), "objectLock", null);
        setBooleanField(term70512, term70512.getClass(), "isPacked", false);
        setIntField(term70512, term70512.getClass(), "boundsOp", 0);
        setField(term70512, term70512.getClass(), "compoundShape", null);
        setField(term70512, term70512.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term70512, term70512.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term70512, term70512.getClass(), "backgroundEraseDisabled", false);
        setField(term70512, term70512.getClass(), "eventCache", null);
        setBooleanField(term70512, term70512.getClass(), "coalescingEnabled", false);
        setBooleanField(term70512, term70512.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term70512, term70512.getClass(), "componentSerializedDataVersion", 0);
        setField(term70512, term70512.getClass(), "accessibleContext", null);
        term70563 = new Boolean(false);
        term70565 = new Boolean(false);
        term70567 = new Integer(0);
        term70569 = new Integer(0);
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
        args[2] = term70563;
        args[3] = term70565;
        args[4] = term70567;
        args[5] = term70569;
        callMethod(klass, "getFont", argTypes, term70512, args);
    }

};


