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
     Object term45887;
     Object term45938;
     Object term45940;
     Object term45942;

    public TreeCellRenderer_getSelectedForegroundColor_187066733815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45887 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term45887, term45887.getClass(), "treeTableModel", null);
        setField(term45887, term45887.getClass(), "insets", null);
        setIntField(term45887, term45887.getClass(), "pixelsPerLevel", 0);
        setField(term45887, term45887.getClass(), "expandCollapseIconRenderer", null);
        setField(term45887, term45887.getClass(), "expandedIcon", null);
        setField(term45887, term45887.getClass(), "collapsedIcon", null);
        setIntField(term45887, term45887.getClass(), "maxIconWidth", 0);
        setField(term45887, term45887.getClass(), "currentNode", null);
        setField(term45887, term45887.getClass(), "unselectedForeground", null);
        setField(term45887, term45887.getClass(), "unselectedBackground", null);
        setIntField(term45887, term45887.getClass(), "mnemonic", 0);
        setIntField(term45887, term45887.getClass(), "mnemonicIndex", 0);
        setField(term45887, term45887.getClass(), "text", null);
        setField(term45887, term45887.getClass(), "defaultIcon", null);
        setField(term45887, term45887.getClass(), "disabledIcon", null);
        setBooleanField(term45887, term45887.getClass(), "disabledIconSet", false);
        setIntField(term45887, term45887.getClass(), "verticalAlignment", 0);
        setIntField(term45887, term45887.getClass(), "horizontalAlignment", 0);
        setIntField(term45887, term45887.getClass(), "verticalTextPosition", 0);
        setIntField(term45887, term45887.getClass(), "horizontalTextPosition", 0);
        setIntField(term45887, term45887.getClass(), "iconTextGap", 0);
        setField(term45887, term45887.getClass(), "labelFor", null);
        setBooleanField(term45887, term45887.getClass(), "isAlignmentXSet", false);
        setFloatField(term45887, term45887.getClass(), "alignmentX", 0.0F);
        setBooleanField(term45887, term45887.getClass(), "isAlignmentYSet", false);
        setFloatField(term45887, term45887.getClass(), "alignmentY", 0.0F);
        setField(term45887, term45887.getClass(), "ui", null);
        setField(term45887, term45887.getClass(), "listenerList", null);
        setField(term45887, term45887.getClass(), "clientProperties", null);
        setField(term45887, term45887.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term45887, term45887.getClass(), "autoscrolls", false);
        setField(term45887, term45887.getClass(), "border", null);
        setIntField(term45887, term45887.getClass(), "flags", 0);
        setField(term45887, term45887.getClass(), "inputVerifier", null);
        setBooleanField(term45887, term45887.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term45887, term45887.getClass(), "paintingChild", null);
        setField(term45887, term45887.getClass(), "popupMenu", null);
        setField(term45887, term45887.getClass(), "revalidateRunnableScheduled", null);
        setField(term45887, term45887.getClass(), "focusInputMap", null);
        setField(term45887, term45887.getClass(), "ancestorInputMap", null);
        setField(term45887, term45887.getClass(), "windowInputMap", null);
        setField(term45887, term45887.getClass(), "actionMap", null);
        setField(term45887, term45887.getClass(), "aaHint", null);
        setField(term45887, term45887.getClass(), "lcdRenderingHint", null);
        setField(term45887, term45887.getClass(), "component", null);
        setField(term45887, term45887.getClass(), "layoutMgr", null);
        setField(term45887, term45887.getClass(), "dispatcher", null);
        setField(term45887, term45887.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term45887, term45887.getClass(), "focusCycleRoot", false);
        setBooleanField(term45887, term45887.getClass(), "focusTraversalPolicyProvider", false);
        setField(term45887, term45887.getClass(), "printingThreads", null);
        setBooleanField(term45887, term45887.getClass(), "printing", false);
        setField(term45887, term45887.getClass(), "containerListener", null);
        setIntField(term45887, term45887.getClass(), "listeningChildren", 0);
        setIntField(term45887, term45887.getClass(), "listeningBoundsChildren", 0);
        setIntField(term45887, term45887.getClass(), "descendantsCount", 0);
        setField(term45887, term45887.getClass(), "preserveBackgroundColor", null);
        setIntField(term45887, term45887.getClass(), "numOfHWComponents", 0);
        setIntField(term45887, term45887.getClass(), "numOfLWComponents", 0);
        setField(term45887, term45887.getClass(), "modalComp", null);
        setField(term45887, term45887.getClass(), "modalAppContext", null);
        setIntField(term45887, term45887.getClass(), "containerSerializedDataVersion", 0);
        setField(term45887, term45887.getClass(), "peer", null);
        setField(term45887, term45887.getClass(), "parent", null);
        setField(term45887, term45887.getClass(), "appContext", null);
        setIntField(term45887, term45887.getClass(), "x", 0);
        setIntField(term45887, term45887.getClass(), "y", 0);
        setIntField(term45887, term45887.getClass(), "width", 0);
        setIntField(term45887, term45887.getClass(), "height", 0);
        setField(term45887, term45887.getClass(), "foreground", null);
        setField(term45887, term45887.getClass(), "background", null);
        setField(term45887, term45887.getClass(), "font", null);
        setField(term45887, term45887.getClass(), "peerFont", null);
        setField(term45887, term45887.getClass(), "cursor", null);
        setField(term45887, term45887.getClass(), "locale", null);
        setField(term45887, term45887.getClass(), "graphicsConfig", null);
        setField(term45887, term45887.getClass(), "bufferStrategy", null);
        setBooleanField(term45887, term45887.getClass(), "ignoreRepaint", false);
        setBooleanField(term45887, term45887.getClass(), "visible", false);
        setBooleanField(term45887, term45887.getClass(), "enabled", false);
        setBooleanField(term45887, term45887.getClass(), "valid", false);
        setField(term45887, term45887.getClass(), "dropTarget", null);
        setField(term45887, term45887.getClass(), "popups", null);
        setField(term45887, term45887.getClass(), "name", null);
        setBooleanField(term45887, term45887.getClass(), "nameExplicitlySet", false);
        setBooleanField(term45887, term45887.getClass(), "focusable", false);
        setIntField(term45887, term45887.getClass(), "isFocusTraversableOverridden", 0);
        setField(term45887, term45887.getClass(), "focusTraversalKeys", null);
        setBooleanField(term45887, term45887.getClass(), "focusTraversalKeysEnabled", false);
        setField(term45887, term45887.getClass(), "acc", null);
        setField(term45887, term45887.getClass(), "minSize", null);
        setBooleanField(term45887, term45887.getClass(), "minSizeSet", false);
        setField(term45887, term45887.getClass(), "prefSize", null);
        setBooleanField(term45887, term45887.getClass(), "prefSizeSet", false);
        setField(term45887, term45887.getClass(), "maxSize", null);
        setBooleanField(term45887, term45887.getClass(), "maxSizeSet", false);
        setField(term45887, term45887.getClass(), "componentOrientation", null);
        setBooleanField(term45887, term45887.getClass(), "newEventsOnly", false);
        setField(term45887, term45887.getClass(), "componentListener", null);
        setField(term45887, term45887.getClass(), "focusListener", null);
        setField(term45887, term45887.getClass(), "hierarchyListener", null);
        setField(term45887, term45887.getClass(), "hierarchyBoundsListener", null);
        setField(term45887, term45887.getClass(), "keyListener", null);
        setField(term45887, term45887.getClass(), "mouseListener", null);
        setField(term45887, term45887.getClass(), "mouseMotionListener", null);
        setField(term45887, term45887.getClass(), "mouseWheelListener", null);
        setField(term45887, term45887.getClass(), "inputMethodListener", null);
        setLongField(term45887, term45887.getClass(), "eventMask", 0L);
        setField(term45887, term45887.getClass(), "changeSupport", null);
        setField(term45887, term45887.getClass(), "objectLock", null);
        setBooleanField(term45887, term45887.getClass(), "isPacked", false);
        setIntField(term45887, term45887.getClass(), "boundsOp", 0);
        setField(term45887, term45887.getClass(), "compoundShape", null);
        setField(term45887, term45887.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term45887, term45887.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term45887, term45887.getClass(), "backgroundEraseDisabled", false);
        setField(term45887, term45887.getClass(), "eventCache", null);
        setBooleanField(term45887, term45887.getClass(), "coalescingEnabled", false);
        setBooleanField(term45887, term45887.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term45887, term45887.getClass(), "componentSerializedDataVersion", 0);
        setField(term45887, term45887.getClass(), "accessibleContext", null);
        term45938 = new Boolean(false);
        term45940 = new Integer(0);
        term45942 = new Integer(0);
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
        args[2] = term45938;
        args[3] = term45940;
        args[4] = term45942;
        callMethod(klass, "getSelectedForegroundColor", argTypes, term45887, args);
    }

};


