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
     Object term49626;
     Object term49677;
     Object term49679;
     Object term49681;

    public TreeCellRenderer_getUnselectedForegroundColor_57018452917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49626 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term49626, term49626.getClass(), "treeTableModel", null);
        setField(term49626, term49626.getClass(), "insets", null);
        setIntField(term49626, term49626.getClass(), "pixelsPerLevel", 0);
        setField(term49626, term49626.getClass(), "expandCollapseIconRenderer", null);
        setField(term49626, term49626.getClass(), "expandedIcon", null);
        setField(term49626, term49626.getClass(), "collapsedIcon", null);
        setIntField(term49626, term49626.getClass(), "maxIconWidth", 0);
        setField(term49626, term49626.getClass(), "currentNode", null);
        setField(term49626, term49626.getClass(), "unselectedForeground", null);
        setField(term49626, term49626.getClass(), "unselectedBackground", null);
        setIntField(term49626, term49626.getClass(), "mnemonic", 0);
        setIntField(term49626, term49626.getClass(), "mnemonicIndex", 0);
        setField(term49626, term49626.getClass(), "text", null);
        setField(term49626, term49626.getClass(), "defaultIcon", null);
        setField(term49626, term49626.getClass(), "disabledIcon", null);
        setBooleanField(term49626, term49626.getClass(), "disabledIconSet", false);
        setIntField(term49626, term49626.getClass(), "verticalAlignment", 0);
        setIntField(term49626, term49626.getClass(), "horizontalAlignment", 0);
        setIntField(term49626, term49626.getClass(), "verticalTextPosition", 0);
        setIntField(term49626, term49626.getClass(), "horizontalTextPosition", 0);
        setIntField(term49626, term49626.getClass(), "iconTextGap", 0);
        setField(term49626, term49626.getClass(), "labelFor", null);
        setBooleanField(term49626, term49626.getClass(), "isAlignmentXSet", false);
        setFloatField(term49626, term49626.getClass(), "alignmentX", 0.0F);
        setBooleanField(term49626, term49626.getClass(), "isAlignmentYSet", false);
        setFloatField(term49626, term49626.getClass(), "alignmentY", 0.0F);
        setField(term49626, term49626.getClass(), "ui", null);
        setField(term49626, term49626.getClass(), "listenerList", null);
        setField(term49626, term49626.getClass(), "clientProperties", null);
        setField(term49626, term49626.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term49626, term49626.getClass(), "autoscrolls", false);
        setField(term49626, term49626.getClass(), "border", null);
        setIntField(term49626, term49626.getClass(), "flags", 0);
        setField(term49626, term49626.getClass(), "inputVerifier", null);
        setBooleanField(term49626, term49626.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term49626, term49626.getClass(), "paintingChild", null);
        setField(term49626, term49626.getClass(), "popupMenu", null);
        setField(term49626, term49626.getClass(), "revalidateRunnableScheduled", null);
        setField(term49626, term49626.getClass(), "focusInputMap", null);
        setField(term49626, term49626.getClass(), "ancestorInputMap", null);
        setField(term49626, term49626.getClass(), "windowInputMap", null);
        setField(term49626, term49626.getClass(), "actionMap", null);
        setField(term49626, term49626.getClass(), "aaHint", null);
        setField(term49626, term49626.getClass(), "lcdRenderingHint", null);
        setField(term49626, term49626.getClass(), "component", null);
        setField(term49626, term49626.getClass(), "layoutMgr", null);
        setField(term49626, term49626.getClass(), "dispatcher", null);
        setField(term49626, term49626.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term49626, term49626.getClass(), "focusCycleRoot", false);
        setBooleanField(term49626, term49626.getClass(), "focusTraversalPolicyProvider", false);
        setField(term49626, term49626.getClass(), "printingThreads", null);
        setBooleanField(term49626, term49626.getClass(), "printing", false);
        setField(term49626, term49626.getClass(), "containerListener", null);
        setIntField(term49626, term49626.getClass(), "listeningChildren", 0);
        setIntField(term49626, term49626.getClass(), "listeningBoundsChildren", 0);
        setIntField(term49626, term49626.getClass(), "descendantsCount", 0);
        setField(term49626, term49626.getClass(), "preserveBackgroundColor", null);
        setIntField(term49626, term49626.getClass(), "numOfHWComponents", 0);
        setIntField(term49626, term49626.getClass(), "numOfLWComponents", 0);
        setField(term49626, term49626.getClass(), "modalComp", null);
        setField(term49626, term49626.getClass(), "modalAppContext", null);
        setIntField(term49626, term49626.getClass(), "containerSerializedDataVersion", 0);
        setField(term49626, term49626.getClass(), "peer", null);
        setField(term49626, term49626.getClass(), "parent", null);
        setField(term49626, term49626.getClass(), "appContext", null);
        setIntField(term49626, term49626.getClass(), "x", 0);
        setIntField(term49626, term49626.getClass(), "y", 0);
        setIntField(term49626, term49626.getClass(), "width", 0);
        setIntField(term49626, term49626.getClass(), "height", 0);
        setField(term49626, term49626.getClass(), "foreground", null);
        setField(term49626, term49626.getClass(), "background", null);
        setField(term49626, term49626.getClass(), "font", null);
        setField(term49626, term49626.getClass(), "peerFont", null);
        setField(term49626, term49626.getClass(), "cursor", null);
        setField(term49626, term49626.getClass(), "locale", null);
        setField(term49626, term49626.getClass(), "graphicsConfig", null);
        setField(term49626, term49626.getClass(), "bufferStrategy", null);
        setBooleanField(term49626, term49626.getClass(), "ignoreRepaint", false);
        setBooleanField(term49626, term49626.getClass(), "visible", false);
        setBooleanField(term49626, term49626.getClass(), "enabled", false);
        setBooleanField(term49626, term49626.getClass(), "valid", false);
        setField(term49626, term49626.getClass(), "dropTarget", null);
        setField(term49626, term49626.getClass(), "popups", null);
        setField(term49626, term49626.getClass(), "name", null);
        setBooleanField(term49626, term49626.getClass(), "nameExplicitlySet", false);
        setBooleanField(term49626, term49626.getClass(), "focusable", false);
        setIntField(term49626, term49626.getClass(), "isFocusTraversableOverridden", 0);
        setField(term49626, term49626.getClass(), "focusTraversalKeys", null);
        setBooleanField(term49626, term49626.getClass(), "focusTraversalKeysEnabled", false);
        setField(term49626, term49626.getClass(), "acc", null);
        setField(term49626, term49626.getClass(), "minSize", null);
        setBooleanField(term49626, term49626.getClass(), "minSizeSet", false);
        setField(term49626, term49626.getClass(), "prefSize", null);
        setBooleanField(term49626, term49626.getClass(), "prefSizeSet", false);
        setField(term49626, term49626.getClass(), "maxSize", null);
        setBooleanField(term49626, term49626.getClass(), "maxSizeSet", false);
        setField(term49626, term49626.getClass(), "componentOrientation", null);
        setBooleanField(term49626, term49626.getClass(), "newEventsOnly", false);
        setField(term49626, term49626.getClass(), "componentListener", null);
        setField(term49626, term49626.getClass(), "focusListener", null);
        setField(term49626, term49626.getClass(), "hierarchyListener", null);
        setField(term49626, term49626.getClass(), "hierarchyBoundsListener", null);
        setField(term49626, term49626.getClass(), "keyListener", null);
        setField(term49626, term49626.getClass(), "mouseListener", null);
        setField(term49626, term49626.getClass(), "mouseMotionListener", null);
        setField(term49626, term49626.getClass(), "mouseWheelListener", null);
        setField(term49626, term49626.getClass(), "inputMethodListener", null);
        setLongField(term49626, term49626.getClass(), "eventMask", 0L);
        setField(term49626, term49626.getClass(), "changeSupport", null);
        setField(term49626, term49626.getClass(), "objectLock", null);
        setBooleanField(term49626, term49626.getClass(), "isPacked", false);
        setIntField(term49626, term49626.getClass(), "boundsOp", 0);
        setField(term49626, term49626.getClass(), "compoundShape", null);
        setField(term49626, term49626.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term49626, term49626.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term49626, term49626.getClass(), "backgroundEraseDisabled", false);
        setField(term49626, term49626.getClass(), "eventCache", null);
        setBooleanField(term49626, term49626.getClass(), "coalescingEnabled", false);
        setBooleanField(term49626, term49626.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term49626, term49626.getClass(), "componentSerializedDataVersion", 0);
        setField(term49626, term49626.getClass(), "accessibleContext", null);
        term49677 = new Boolean(false);
        term49679 = new Integer(0);
        term49681 = new Integer(0);
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
        args[2] = term49677;
        args[3] = term49679;
        args[4] = term49681;
        callMethod(klass, "getUnselectedForegroundColor", argTypes, term49626, args);
    }

};


