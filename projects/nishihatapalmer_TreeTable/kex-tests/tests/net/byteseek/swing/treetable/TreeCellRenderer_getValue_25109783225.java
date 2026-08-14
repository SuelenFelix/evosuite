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

public class TreeCellRenderer_getValue_25109783225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66007;
     Object term66058;
     Object term66060;
     Object term66062;
     Object term66064;

    public TreeCellRenderer_getValue_25109783225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66007 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term66007, term66007.getClass(), "treeTableModel", null);
        setField(term66007, term66007.getClass(), "insets", null);
        setIntField(term66007, term66007.getClass(), "pixelsPerLevel", 0);
        setField(term66007, term66007.getClass(), "expandCollapseIconRenderer", null);
        setField(term66007, term66007.getClass(), "expandedIcon", null);
        setField(term66007, term66007.getClass(), "collapsedIcon", null);
        setIntField(term66007, term66007.getClass(), "maxIconWidth", 0);
        setField(term66007, term66007.getClass(), "currentNode", null);
        setField(term66007, term66007.getClass(), "unselectedForeground", null);
        setField(term66007, term66007.getClass(), "unselectedBackground", null);
        setIntField(term66007, term66007.getClass(), "mnemonic", 0);
        setIntField(term66007, term66007.getClass(), "mnemonicIndex", 0);
        setField(term66007, term66007.getClass(), "text", null);
        setField(term66007, term66007.getClass(), "defaultIcon", null);
        setField(term66007, term66007.getClass(), "disabledIcon", null);
        setBooleanField(term66007, term66007.getClass(), "disabledIconSet", false);
        setIntField(term66007, term66007.getClass(), "verticalAlignment", 0);
        setIntField(term66007, term66007.getClass(), "horizontalAlignment", 0);
        setIntField(term66007, term66007.getClass(), "verticalTextPosition", 0);
        setIntField(term66007, term66007.getClass(), "horizontalTextPosition", 0);
        setIntField(term66007, term66007.getClass(), "iconTextGap", 0);
        setField(term66007, term66007.getClass(), "labelFor", null);
        setBooleanField(term66007, term66007.getClass(), "isAlignmentXSet", false);
        setFloatField(term66007, term66007.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66007, term66007.getClass(), "isAlignmentYSet", false);
        setFloatField(term66007, term66007.getClass(), "alignmentY", 0.0F);
        setField(term66007, term66007.getClass(), "ui", null);
        setField(term66007, term66007.getClass(), "listenerList", null);
        setField(term66007, term66007.getClass(), "clientProperties", null);
        setField(term66007, term66007.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66007, term66007.getClass(), "autoscrolls", false);
        setField(term66007, term66007.getClass(), "border", null);
        setIntField(term66007, term66007.getClass(), "flags", 0);
        setField(term66007, term66007.getClass(), "inputVerifier", null);
        setBooleanField(term66007, term66007.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66007, term66007.getClass(), "paintingChild", null);
        setField(term66007, term66007.getClass(), "popupMenu", null);
        setField(term66007, term66007.getClass(), "revalidateRunnableScheduled", null);
        setField(term66007, term66007.getClass(), "focusInputMap", null);
        setField(term66007, term66007.getClass(), "ancestorInputMap", null);
        setField(term66007, term66007.getClass(), "windowInputMap", null);
        setField(term66007, term66007.getClass(), "actionMap", null);
        setField(term66007, term66007.getClass(), "aaHint", null);
        setField(term66007, term66007.getClass(), "lcdRenderingHint", null);
        setField(term66007, term66007.getClass(), "component", null);
        setField(term66007, term66007.getClass(), "layoutMgr", null);
        setField(term66007, term66007.getClass(), "dispatcher", null);
        setField(term66007, term66007.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66007, term66007.getClass(), "focusCycleRoot", false);
        setBooleanField(term66007, term66007.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66007, term66007.getClass(), "printingThreads", null);
        setBooleanField(term66007, term66007.getClass(), "printing", false);
        setField(term66007, term66007.getClass(), "containerListener", null);
        setIntField(term66007, term66007.getClass(), "listeningChildren", 0);
        setIntField(term66007, term66007.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66007, term66007.getClass(), "descendantsCount", 0);
        setField(term66007, term66007.getClass(), "preserveBackgroundColor", null);
        setIntField(term66007, term66007.getClass(), "numOfHWComponents", 0);
        setIntField(term66007, term66007.getClass(), "numOfLWComponents", 0);
        setField(term66007, term66007.getClass(), "modalComp", null);
        setField(term66007, term66007.getClass(), "modalAppContext", null);
        setIntField(term66007, term66007.getClass(), "containerSerializedDataVersion", 0);
        setField(term66007, term66007.getClass(), "peer", null);
        setField(term66007, term66007.getClass(), "parent", null);
        setField(term66007, term66007.getClass(), "appContext", null);
        setIntField(term66007, term66007.getClass(), "x", 0);
        setIntField(term66007, term66007.getClass(), "y", 0);
        setIntField(term66007, term66007.getClass(), "width", 0);
        setIntField(term66007, term66007.getClass(), "height", 0);
        setField(term66007, term66007.getClass(), "foreground", null);
        setField(term66007, term66007.getClass(), "background", null);
        setField(term66007, term66007.getClass(), "font", null);
        setField(term66007, term66007.getClass(), "peerFont", null);
        setField(term66007, term66007.getClass(), "cursor", null);
        setField(term66007, term66007.getClass(), "locale", null);
        setField(term66007, term66007.getClass(), "graphicsConfig", null);
        setField(term66007, term66007.getClass(), "bufferStrategy", null);
        setBooleanField(term66007, term66007.getClass(), "ignoreRepaint", false);
        setBooleanField(term66007, term66007.getClass(), "visible", false);
        setBooleanField(term66007, term66007.getClass(), "enabled", false);
        setBooleanField(term66007, term66007.getClass(), "valid", false);
        setField(term66007, term66007.getClass(), "dropTarget", null);
        setField(term66007, term66007.getClass(), "popups", null);
        setField(term66007, term66007.getClass(), "name", null);
        setBooleanField(term66007, term66007.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66007, term66007.getClass(), "focusable", false);
        setIntField(term66007, term66007.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66007, term66007.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66007, term66007.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66007, term66007.getClass(), "acc", null);
        setField(term66007, term66007.getClass(), "minSize", null);
        setBooleanField(term66007, term66007.getClass(), "minSizeSet", false);
        setField(term66007, term66007.getClass(), "prefSize", null);
        setBooleanField(term66007, term66007.getClass(), "prefSizeSet", false);
        setField(term66007, term66007.getClass(), "maxSize", null);
        setBooleanField(term66007, term66007.getClass(), "maxSizeSet", false);
        setField(term66007, term66007.getClass(), "componentOrientation", null);
        setBooleanField(term66007, term66007.getClass(), "newEventsOnly", false);
        setField(term66007, term66007.getClass(), "componentListener", null);
        setField(term66007, term66007.getClass(), "focusListener", null);
        setField(term66007, term66007.getClass(), "hierarchyListener", null);
        setField(term66007, term66007.getClass(), "hierarchyBoundsListener", null);
        setField(term66007, term66007.getClass(), "keyListener", null);
        setField(term66007, term66007.getClass(), "mouseListener", null);
        setField(term66007, term66007.getClass(), "mouseMotionListener", null);
        setField(term66007, term66007.getClass(), "mouseWheelListener", null);
        setField(term66007, term66007.getClass(), "inputMethodListener", null);
        setLongField(term66007, term66007.getClass(), "eventMask", 0L);
        setField(term66007, term66007.getClass(), "changeSupport", null);
        setField(term66007, term66007.getClass(), "objectLock", null);
        setBooleanField(term66007, term66007.getClass(), "isPacked", false);
        setIntField(term66007, term66007.getClass(), "boundsOp", 0);
        setField(term66007, term66007.getClass(), "compoundShape", null);
        setField(term66007, term66007.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66007, term66007.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66007, term66007.getClass(), "backgroundEraseDisabled", false);
        setField(term66007, term66007.getClass(), "eventCache", null);
        setBooleanField(term66007, term66007.getClass(), "coalescingEnabled", false);
        setBooleanField(term66007, term66007.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66007, term66007.getClass(), "componentSerializedDataVersion", 0);
        setField(term66007, term66007.getClass(), "accessibleContext", null);
        term66058 = new Boolean(false);
        term66060 = new Boolean(false);
        term66062 = new Integer(0);
        term66064 = new Integer(0);
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
        args[2] = term66058;
        args[3] = term66060;
        args[4] = term66062;
        args[5] = term66064;
        callMethod(klass, "getValue", argTypes, term66007, args);
    }

};


