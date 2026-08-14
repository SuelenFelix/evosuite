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
     Object term69880;
     Object term69931;
     Object term69933;
     Object term69935;
     Object term69937;

    public TreeCellRenderer_getFont_35663657227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69880 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term69880, term69880.getClass(), "treeTableModel", null);
        setField(term69880, term69880.getClass(), "insets", null);
        setIntField(term69880, term69880.getClass(), "pixelsPerLevel", 0);
        setField(term69880, term69880.getClass(), "expandCollapseIconRenderer", null);
        setField(term69880, term69880.getClass(), "expandedIcon", null);
        setField(term69880, term69880.getClass(), "collapsedIcon", null);
        setIntField(term69880, term69880.getClass(), "maxIconWidth", 0);
        setField(term69880, term69880.getClass(), "currentNode", null);
        setField(term69880, term69880.getClass(), "unselectedForeground", null);
        setField(term69880, term69880.getClass(), "unselectedBackground", null);
        setIntField(term69880, term69880.getClass(), "mnemonic", 0);
        setIntField(term69880, term69880.getClass(), "mnemonicIndex", 0);
        setField(term69880, term69880.getClass(), "text", null);
        setField(term69880, term69880.getClass(), "defaultIcon", null);
        setField(term69880, term69880.getClass(), "disabledIcon", null);
        setBooleanField(term69880, term69880.getClass(), "disabledIconSet", false);
        setIntField(term69880, term69880.getClass(), "verticalAlignment", 0);
        setIntField(term69880, term69880.getClass(), "horizontalAlignment", 0);
        setIntField(term69880, term69880.getClass(), "verticalTextPosition", 0);
        setIntField(term69880, term69880.getClass(), "horizontalTextPosition", 0);
        setIntField(term69880, term69880.getClass(), "iconTextGap", 0);
        setField(term69880, term69880.getClass(), "labelFor", null);
        setBooleanField(term69880, term69880.getClass(), "isAlignmentXSet", false);
        setFloatField(term69880, term69880.getClass(), "alignmentX", 0.0F);
        setBooleanField(term69880, term69880.getClass(), "isAlignmentYSet", false);
        setFloatField(term69880, term69880.getClass(), "alignmentY", 0.0F);
        setField(term69880, term69880.getClass(), "ui", null);
        setField(term69880, term69880.getClass(), "listenerList", null);
        setField(term69880, term69880.getClass(), "clientProperties", null);
        setField(term69880, term69880.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term69880, term69880.getClass(), "autoscrolls", false);
        setField(term69880, term69880.getClass(), "border", null);
        setIntField(term69880, term69880.getClass(), "flags", 0);
        setField(term69880, term69880.getClass(), "inputVerifier", null);
        setBooleanField(term69880, term69880.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term69880, term69880.getClass(), "paintingChild", null);
        setField(term69880, term69880.getClass(), "popupMenu", null);
        setField(term69880, term69880.getClass(), "revalidateRunnableScheduled", null);
        setField(term69880, term69880.getClass(), "focusInputMap", null);
        setField(term69880, term69880.getClass(), "ancestorInputMap", null);
        setField(term69880, term69880.getClass(), "windowInputMap", null);
        setField(term69880, term69880.getClass(), "actionMap", null);
        setField(term69880, term69880.getClass(), "aaHint", null);
        setField(term69880, term69880.getClass(), "lcdRenderingHint", null);
        setField(term69880, term69880.getClass(), "component", null);
        setField(term69880, term69880.getClass(), "layoutMgr", null);
        setField(term69880, term69880.getClass(), "dispatcher", null);
        setField(term69880, term69880.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term69880, term69880.getClass(), "focusCycleRoot", false);
        setBooleanField(term69880, term69880.getClass(), "focusTraversalPolicyProvider", false);
        setField(term69880, term69880.getClass(), "printingThreads", null);
        setBooleanField(term69880, term69880.getClass(), "printing", false);
        setField(term69880, term69880.getClass(), "containerListener", null);
        setIntField(term69880, term69880.getClass(), "listeningChildren", 0);
        setIntField(term69880, term69880.getClass(), "listeningBoundsChildren", 0);
        setIntField(term69880, term69880.getClass(), "descendantsCount", 0);
        setField(term69880, term69880.getClass(), "preserveBackgroundColor", null);
        setIntField(term69880, term69880.getClass(), "numOfHWComponents", 0);
        setIntField(term69880, term69880.getClass(), "numOfLWComponents", 0);
        setField(term69880, term69880.getClass(), "modalComp", null);
        setField(term69880, term69880.getClass(), "modalAppContext", null);
        setIntField(term69880, term69880.getClass(), "containerSerializedDataVersion", 0);
        setField(term69880, term69880.getClass(), "peer", null);
        setField(term69880, term69880.getClass(), "parent", null);
        setField(term69880, term69880.getClass(), "appContext", null);
        setIntField(term69880, term69880.getClass(), "x", 0);
        setIntField(term69880, term69880.getClass(), "y", 0);
        setIntField(term69880, term69880.getClass(), "width", 0);
        setIntField(term69880, term69880.getClass(), "height", 0);
        setField(term69880, term69880.getClass(), "foreground", null);
        setField(term69880, term69880.getClass(), "background", null);
        setField(term69880, term69880.getClass(), "font", null);
        setField(term69880, term69880.getClass(), "peerFont", null);
        setField(term69880, term69880.getClass(), "cursor", null);
        setField(term69880, term69880.getClass(), "locale", null);
        setField(term69880, term69880.getClass(), "graphicsConfig", null);
        setField(term69880, term69880.getClass(), "bufferStrategy", null);
        setBooleanField(term69880, term69880.getClass(), "ignoreRepaint", false);
        setBooleanField(term69880, term69880.getClass(), "visible", false);
        setBooleanField(term69880, term69880.getClass(), "enabled", false);
        setBooleanField(term69880, term69880.getClass(), "valid", false);
        setField(term69880, term69880.getClass(), "dropTarget", null);
        setField(term69880, term69880.getClass(), "popups", null);
        setField(term69880, term69880.getClass(), "name", null);
        setBooleanField(term69880, term69880.getClass(), "nameExplicitlySet", false);
        setBooleanField(term69880, term69880.getClass(), "focusable", false);
        setIntField(term69880, term69880.getClass(), "isFocusTraversableOverridden", 0);
        setField(term69880, term69880.getClass(), "focusTraversalKeys", null);
        setBooleanField(term69880, term69880.getClass(), "focusTraversalKeysEnabled", false);
        setField(term69880, term69880.getClass(), "acc", null);
        setField(term69880, term69880.getClass(), "minSize", null);
        setBooleanField(term69880, term69880.getClass(), "minSizeSet", false);
        setField(term69880, term69880.getClass(), "prefSize", null);
        setBooleanField(term69880, term69880.getClass(), "prefSizeSet", false);
        setField(term69880, term69880.getClass(), "maxSize", null);
        setBooleanField(term69880, term69880.getClass(), "maxSizeSet", false);
        setField(term69880, term69880.getClass(), "componentOrientation", null);
        setBooleanField(term69880, term69880.getClass(), "newEventsOnly", false);
        setField(term69880, term69880.getClass(), "componentListener", null);
        setField(term69880, term69880.getClass(), "focusListener", null);
        setField(term69880, term69880.getClass(), "hierarchyListener", null);
        setField(term69880, term69880.getClass(), "hierarchyBoundsListener", null);
        setField(term69880, term69880.getClass(), "keyListener", null);
        setField(term69880, term69880.getClass(), "mouseListener", null);
        setField(term69880, term69880.getClass(), "mouseMotionListener", null);
        setField(term69880, term69880.getClass(), "mouseWheelListener", null);
        setField(term69880, term69880.getClass(), "inputMethodListener", null);
        setLongField(term69880, term69880.getClass(), "eventMask", 0L);
        setField(term69880, term69880.getClass(), "changeSupport", null);
        setField(term69880, term69880.getClass(), "objectLock", null);
        setBooleanField(term69880, term69880.getClass(), "isPacked", false);
        setIntField(term69880, term69880.getClass(), "boundsOp", 0);
        setField(term69880, term69880.getClass(), "compoundShape", null);
        setField(term69880, term69880.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term69880, term69880.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term69880, term69880.getClass(), "backgroundEraseDisabled", false);
        setField(term69880, term69880.getClass(), "eventCache", null);
        setBooleanField(term69880, term69880.getClass(), "coalescingEnabled", false);
        setBooleanField(term69880, term69880.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term69880, term69880.getClass(), "componentSerializedDataVersion", 0);
        setField(term69880, term69880.getClass(), "accessibleContext", null);
        term69931 = new Boolean(false);
        term69933 = new Boolean(false);
        term69935 = new Integer(0);
        term69937 = new Integer(0);
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
        args[2] = term69931;
        args[3] = term69933;
        args[4] = term69935;
        args[5] = term69937;
        callMethod(klass, "getFont", argTypes, term69880, args);
    }

};


