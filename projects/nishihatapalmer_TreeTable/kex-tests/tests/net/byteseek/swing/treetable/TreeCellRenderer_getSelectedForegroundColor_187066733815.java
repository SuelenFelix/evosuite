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

public class TreeCellRenderer_getSelectedForegroundColor_187066733815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45573;
     Object term45624;
     Object term45626;
     Object term45628;

    public TreeCellRenderer_getSelectedForegroundColor_187066733815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45573 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term45573, term45573.getClass(), "treeTableModel", null);
        setField(term45573, term45573.getClass(), "insets", null);
        setIntField(term45573, term45573.getClass(), "pixelsPerLevel", 0);
        setField(term45573, term45573.getClass(), "expandCollapseIconRenderer", null);
        setField(term45573, term45573.getClass(), "expandedIcon", null);
        setField(term45573, term45573.getClass(), "collapsedIcon", null);
        setIntField(term45573, term45573.getClass(), "maxIconWidth", 0);
        setField(term45573, term45573.getClass(), "currentNode", null);
        setField(term45573, term45573.getClass(), "unselectedForeground", null);
        setField(term45573, term45573.getClass(), "unselectedBackground", null);
        setIntField(term45573, term45573.getClass(), "mnemonic", 0);
        setIntField(term45573, term45573.getClass(), "mnemonicIndex", 0);
        setField(term45573, term45573.getClass(), "text", null);
        setField(term45573, term45573.getClass(), "defaultIcon", null);
        setField(term45573, term45573.getClass(), "disabledIcon", null);
        setBooleanField(term45573, term45573.getClass(), "disabledIconSet", false);
        setIntField(term45573, term45573.getClass(), "verticalAlignment", 0);
        setIntField(term45573, term45573.getClass(), "horizontalAlignment", 0);
        setIntField(term45573, term45573.getClass(), "verticalTextPosition", 0);
        setIntField(term45573, term45573.getClass(), "horizontalTextPosition", 0);
        setIntField(term45573, term45573.getClass(), "iconTextGap", 0);
        setField(term45573, term45573.getClass(), "labelFor", null);
        setBooleanField(term45573, term45573.getClass(), "isAlignmentXSet", false);
        setFloatField(term45573, term45573.getClass(), "alignmentX", 0.0F);
        setBooleanField(term45573, term45573.getClass(), "isAlignmentYSet", false);
        setFloatField(term45573, term45573.getClass(), "alignmentY", 0.0F);
        setField(term45573, term45573.getClass(), "ui", null);
        setField(term45573, term45573.getClass(), "listenerList", null);
        setField(term45573, term45573.getClass(), "clientProperties", null);
        setField(term45573, term45573.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term45573, term45573.getClass(), "autoscrolls", false);
        setField(term45573, term45573.getClass(), "border", null);
        setIntField(term45573, term45573.getClass(), "flags", 0);
        setField(term45573, term45573.getClass(), "inputVerifier", null);
        setBooleanField(term45573, term45573.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term45573, term45573.getClass(), "paintingChild", null);
        setField(term45573, term45573.getClass(), "popupMenu", null);
        setField(term45573, term45573.getClass(), "revalidateRunnableScheduled", null);
        setField(term45573, term45573.getClass(), "focusInputMap", null);
        setField(term45573, term45573.getClass(), "ancestorInputMap", null);
        setField(term45573, term45573.getClass(), "windowInputMap", null);
        setField(term45573, term45573.getClass(), "actionMap", null);
        setField(term45573, term45573.getClass(), "aaHint", null);
        setField(term45573, term45573.getClass(), "lcdRenderingHint", null);
        setField(term45573, term45573.getClass(), "component", null);
        setField(term45573, term45573.getClass(), "layoutMgr", null);
        setField(term45573, term45573.getClass(), "dispatcher", null);
        setField(term45573, term45573.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term45573, term45573.getClass(), "focusCycleRoot", false);
        setBooleanField(term45573, term45573.getClass(), "focusTraversalPolicyProvider", false);
        setField(term45573, term45573.getClass(), "printingThreads", null);
        setBooleanField(term45573, term45573.getClass(), "printing", false);
        setField(term45573, term45573.getClass(), "containerListener", null);
        setIntField(term45573, term45573.getClass(), "listeningChildren", 0);
        setIntField(term45573, term45573.getClass(), "listeningBoundsChildren", 0);
        setIntField(term45573, term45573.getClass(), "descendantsCount", 0);
        setField(term45573, term45573.getClass(), "preserveBackgroundColor", null);
        setIntField(term45573, term45573.getClass(), "numOfHWComponents", 0);
        setIntField(term45573, term45573.getClass(), "numOfLWComponents", 0);
        setField(term45573, term45573.getClass(), "modalComp", null);
        setField(term45573, term45573.getClass(), "modalAppContext", null);
        setIntField(term45573, term45573.getClass(), "containerSerializedDataVersion", 0);
        setField(term45573, term45573.getClass(), "peer", null);
        setField(term45573, term45573.getClass(), "parent", null);
        setField(term45573, term45573.getClass(), "appContext", null);
        setIntField(term45573, term45573.getClass(), "x", 0);
        setIntField(term45573, term45573.getClass(), "y", 0);
        setIntField(term45573, term45573.getClass(), "width", 0);
        setIntField(term45573, term45573.getClass(), "height", 0);
        setField(term45573, term45573.getClass(), "foreground", null);
        setField(term45573, term45573.getClass(), "background", null);
        setField(term45573, term45573.getClass(), "font", null);
        setField(term45573, term45573.getClass(), "peerFont", null);
        setField(term45573, term45573.getClass(), "cursor", null);
        setField(term45573, term45573.getClass(), "locale", null);
        setField(term45573, term45573.getClass(), "graphicsConfig", null);
        setField(term45573, term45573.getClass(), "bufferStrategy", null);
        setBooleanField(term45573, term45573.getClass(), "ignoreRepaint", false);
        setBooleanField(term45573, term45573.getClass(), "visible", false);
        setBooleanField(term45573, term45573.getClass(), "enabled", false);
        setBooleanField(term45573, term45573.getClass(), "valid", false);
        setField(term45573, term45573.getClass(), "dropTarget", null);
        setField(term45573, term45573.getClass(), "popups", null);
        setField(term45573, term45573.getClass(), "name", null);
        setBooleanField(term45573, term45573.getClass(), "nameExplicitlySet", false);
        setBooleanField(term45573, term45573.getClass(), "focusable", false);
        setIntField(term45573, term45573.getClass(), "isFocusTraversableOverridden", 0);
        setField(term45573, term45573.getClass(), "focusTraversalKeys", null);
        setBooleanField(term45573, term45573.getClass(), "focusTraversalKeysEnabled", false);
        setField(term45573, term45573.getClass(), "acc", null);
        setField(term45573, term45573.getClass(), "minSize", null);
        setBooleanField(term45573, term45573.getClass(), "minSizeSet", false);
        setField(term45573, term45573.getClass(), "prefSize", null);
        setBooleanField(term45573, term45573.getClass(), "prefSizeSet", false);
        setField(term45573, term45573.getClass(), "maxSize", null);
        setBooleanField(term45573, term45573.getClass(), "maxSizeSet", false);
        setField(term45573, term45573.getClass(), "componentOrientation", null);
        setBooleanField(term45573, term45573.getClass(), "newEventsOnly", false);
        setField(term45573, term45573.getClass(), "componentListener", null);
        setField(term45573, term45573.getClass(), "focusListener", null);
        setField(term45573, term45573.getClass(), "hierarchyListener", null);
        setField(term45573, term45573.getClass(), "hierarchyBoundsListener", null);
        setField(term45573, term45573.getClass(), "keyListener", null);
        setField(term45573, term45573.getClass(), "mouseListener", null);
        setField(term45573, term45573.getClass(), "mouseMotionListener", null);
        setField(term45573, term45573.getClass(), "mouseWheelListener", null);
        setField(term45573, term45573.getClass(), "inputMethodListener", null);
        setLongField(term45573, term45573.getClass(), "eventMask", 0L);
        setField(term45573, term45573.getClass(), "changeSupport", null);
        setField(term45573, term45573.getClass(), "objectLock", null);
        setBooleanField(term45573, term45573.getClass(), "isPacked", false);
        setIntField(term45573, term45573.getClass(), "boundsOp", 0);
        setField(term45573, term45573.getClass(), "compoundShape", null);
        setField(term45573, term45573.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term45573, term45573.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term45573, term45573.getClass(), "backgroundEraseDisabled", false);
        setField(term45573, term45573.getClass(), "eventCache", null);
        setBooleanField(term45573, term45573.getClass(), "coalescingEnabled", false);
        setBooleanField(term45573, term45573.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term45573, term45573.getClass(), "componentSerializedDataVersion", 0);
        setField(term45573, term45573.getClass(), "accessibleContext", null);
        term45624 = new Boolean(false);
        term45626 = new Integer(0);
        term45628 = new Integer(0);
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
        args[2] = term45624;
        args[3] = term45626;
        args[4] = term45628;
        callMethod(klass, "getSelectedForegroundColor", argTypes, term45573, args);
    }

};


