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

public class TreeCellRenderer_getUnselectedForegroundColor_57018452917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50021;
     Object term50072;
     Object term50074;
     Object term50076;

    public TreeCellRenderer_getUnselectedForegroundColor_57018452917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50021 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term50021, term50021.getClass(), "treeTableModel", null);
        setField(term50021, term50021.getClass(), "insets", null);
        setIntField(term50021, term50021.getClass(), "pixelsPerLevel", 0);
        setField(term50021, term50021.getClass(), "expandCollapseIconRenderer", null);
        setField(term50021, term50021.getClass(), "expandedIcon", null);
        setField(term50021, term50021.getClass(), "collapsedIcon", null);
        setIntField(term50021, term50021.getClass(), "maxIconWidth", 0);
        setField(term50021, term50021.getClass(), "currentNode", null);
        setField(term50021, term50021.getClass(), "unselectedForeground", null);
        setField(term50021, term50021.getClass(), "unselectedBackground", null);
        setIntField(term50021, term50021.getClass(), "mnemonic", 0);
        setIntField(term50021, term50021.getClass(), "mnemonicIndex", 0);
        setField(term50021, term50021.getClass(), "text", null);
        setField(term50021, term50021.getClass(), "defaultIcon", null);
        setField(term50021, term50021.getClass(), "disabledIcon", null);
        setBooleanField(term50021, term50021.getClass(), "disabledIconSet", false);
        setIntField(term50021, term50021.getClass(), "verticalAlignment", 0);
        setIntField(term50021, term50021.getClass(), "horizontalAlignment", 0);
        setIntField(term50021, term50021.getClass(), "verticalTextPosition", 0);
        setIntField(term50021, term50021.getClass(), "horizontalTextPosition", 0);
        setIntField(term50021, term50021.getClass(), "iconTextGap", 0);
        setField(term50021, term50021.getClass(), "labelFor", null);
        setBooleanField(term50021, term50021.getClass(), "isAlignmentXSet", false);
        setFloatField(term50021, term50021.getClass(), "alignmentX", 0.0F);
        setBooleanField(term50021, term50021.getClass(), "isAlignmentYSet", false);
        setFloatField(term50021, term50021.getClass(), "alignmentY", 0.0F);
        setField(term50021, term50021.getClass(), "ui", null);
        setField(term50021, term50021.getClass(), "listenerList", null);
        setField(term50021, term50021.getClass(), "clientProperties", null);
        setField(term50021, term50021.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term50021, term50021.getClass(), "autoscrolls", false);
        setField(term50021, term50021.getClass(), "border", null);
        setIntField(term50021, term50021.getClass(), "flags", 0);
        setField(term50021, term50021.getClass(), "inputVerifier", null);
        setBooleanField(term50021, term50021.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term50021, term50021.getClass(), "paintingChild", null);
        setField(term50021, term50021.getClass(), "popupMenu", null);
        setField(term50021, term50021.getClass(), "revalidateRunnableScheduled", null);
        setField(term50021, term50021.getClass(), "focusInputMap", null);
        setField(term50021, term50021.getClass(), "ancestorInputMap", null);
        setField(term50021, term50021.getClass(), "windowInputMap", null);
        setField(term50021, term50021.getClass(), "actionMap", null);
        setField(term50021, term50021.getClass(), "aaHint", null);
        setField(term50021, term50021.getClass(), "lcdRenderingHint", null);
        setField(term50021, term50021.getClass(), "component", null);
        setField(term50021, term50021.getClass(), "layoutMgr", null);
        setField(term50021, term50021.getClass(), "dispatcher", null);
        setField(term50021, term50021.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term50021, term50021.getClass(), "focusCycleRoot", false);
        setBooleanField(term50021, term50021.getClass(), "focusTraversalPolicyProvider", false);
        setField(term50021, term50021.getClass(), "printingThreads", null);
        setBooleanField(term50021, term50021.getClass(), "printing", false);
        setField(term50021, term50021.getClass(), "containerListener", null);
        setIntField(term50021, term50021.getClass(), "listeningChildren", 0);
        setIntField(term50021, term50021.getClass(), "listeningBoundsChildren", 0);
        setIntField(term50021, term50021.getClass(), "descendantsCount", 0);
        setField(term50021, term50021.getClass(), "preserveBackgroundColor", null);
        setIntField(term50021, term50021.getClass(), "numOfHWComponents", 0);
        setIntField(term50021, term50021.getClass(), "numOfLWComponents", 0);
        setField(term50021, term50021.getClass(), "modalComp", null);
        setField(term50021, term50021.getClass(), "modalAppContext", null);
        setIntField(term50021, term50021.getClass(), "containerSerializedDataVersion", 0);
        setField(term50021, term50021.getClass(), "peer", null);
        setField(term50021, term50021.getClass(), "parent", null);
        setField(term50021, term50021.getClass(), "appContext", null);
        setIntField(term50021, term50021.getClass(), "x", 0);
        setIntField(term50021, term50021.getClass(), "y", 0);
        setIntField(term50021, term50021.getClass(), "width", 0);
        setIntField(term50021, term50021.getClass(), "height", 0);
        setField(term50021, term50021.getClass(), "foreground", null);
        setField(term50021, term50021.getClass(), "background", null);
        setField(term50021, term50021.getClass(), "font", null);
        setField(term50021, term50021.getClass(), "peerFont", null);
        setField(term50021, term50021.getClass(), "cursor", null);
        setField(term50021, term50021.getClass(), "locale", null);
        setField(term50021, term50021.getClass(), "graphicsConfig", null);
        setField(term50021, term50021.getClass(), "bufferStrategy", null);
        setBooleanField(term50021, term50021.getClass(), "ignoreRepaint", false);
        setBooleanField(term50021, term50021.getClass(), "visible", false);
        setBooleanField(term50021, term50021.getClass(), "enabled", false);
        setBooleanField(term50021, term50021.getClass(), "valid", false);
        setField(term50021, term50021.getClass(), "dropTarget", null);
        setField(term50021, term50021.getClass(), "popups", null);
        setField(term50021, term50021.getClass(), "name", null);
        setBooleanField(term50021, term50021.getClass(), "nameExplicitlySet", false);
        setBooleanField(term50021, term50021.getClass(), "focusable", false);
        setIntField(term50021, term50021.getClass(), "isFocusTraversableOverridden", 0);
        setField(term50021, term50021.getClass(), "focusTraversalKeys", null);
        setBooleanField(term50021, term50021.getClass(), "focusTraversalKeysEnabled", false);
        setField(term50021, term50021.getClass(), "acc", null);
        setField(term50021, term50021.getClass(), "minSize", null);
        setBooleanField(term50021, term50021.getClass(), "minSizeSet", false);
        setField(term50021, term50021.getClass(), "prefSize", null);
        setBooleanField(term50021, term50021.getClass(), "prefSizeSet", false);
        setField(term50021, term50021.getClass(), "maxSize", null);
        setBooleanField(term50021, term50021.getClass(), "maxSizeSet", false);
        setField(term50021, term50021.getClass(), "componentOrientation", null);
        setBooleanField(term50021, term50021.getClass(), "newEventsOnly", false);
        setField(term50021, term50021.getClass(), "componentListener", null);
        setField(term50021, term50021.getClass(), "focusListener", null);
        setField(term50021, term50021.getClass(), "hierarchyListener", null);
        setField(term50021, term50021.getClass(), "hierarchyBoundsListener", null);
        setField(term50021, term50021.getClass(), "keyListener", null);
        setField(term50021, term50021.getClass(), "mouseListener", null);
        setField(term50021, term50021.getClass(), "mouseMotionListener", null);
        setField(term50021, term50021.getClass(), "mouseWheelListener", null);
        setField(term50021, term50021.getClass(), "inputMethodListener", null);
        setLongField(term50021, term50021.getClass(), "eventMask", 0L);
        setField(term50021, term50021.getClass(), "changeSupport", null);
        setField(term50021, term50021.getClass(), "objectLock", null);
        setBooleanField(term50021, term50021.getClass(), "isPacked", false);
        setIntField(term50021, term50021.getClass(), "boundsOp", 0);
        setField(term50021, term50021.getClass(), "compoundShape", null);
        setField(term50021, term50021.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term50021, term50021.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term50021, term50021.getClass(), "backgroundEraseDisabled", false);
        setField(term50021, term50021.getClass(), "eventCache", null);
        setBooleanField(term50021, term50021.getClass(), "coalescingEnabled", false);
        setBooleanField(term50021, term50021.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term50021, term50021.getClass(), "componentSerializedDataVersion", 0);
        setField(term50021, term50021.getClass(), "accessibleContext", null);
        term50072 = new Boolean(false);
        term50074 = new Integer(0);
        term50076 = new Integer(0);
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
        args[2] = term50072;
        args[3] = term50074;
        args[4] = term50076;
        callMethod(klass, "getUnselectedForegroundColor", argTypes, term50021, args);
    }

};


