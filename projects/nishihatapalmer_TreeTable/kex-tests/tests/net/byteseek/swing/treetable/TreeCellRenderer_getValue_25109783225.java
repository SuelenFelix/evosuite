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
     Object term66512;
     Object term66563;
     Object term66565;
     Object term66567;
     Object term66569;

    public TreeCellRenderer_getValue_25109783225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66512 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term66512, term66512.getClass(), "treeTableModel", null);
        setField(term66512, term66512.getClass(), "insets", null);
        setIntField(term66512, term66512.getClass(), "pixelsPerLevel", 0);
        setField(term66512, term66512.getClass(), "expandCollapseIconRenderer", null);
        setField(term66512, term66512.getClass(), "expandedIcon", null);
        setField(term66512, term66512.getClass(), "collapsedIcon", null);
        setIntField(term66512, term66512.getClass(), "maxIconWidth", 0);
        setField(term66512, term66512.getClass(), "currentNode", null);
        setField(term66512, term66512.getClass(), "unselectedForeground", null);
        setField(term66512, term66512.getClass(), "unselectedBackground", null);
        setIntField(term66512, term66512.getClass(), "mnemonic", 0);
        setIntField(term66512, term66512.getClass(), "mnemonicIndex", 0);
        setField(term66512, term66512.getClass(), "text", null);
        setField(term66512, term66512.getClass(), "defaultIcon", null);
        setField(term66512, term66512.getClass(), "disabledIcon", null);
        setBooleanField(term66512, term66512.getClass(), "disabledIconSet", false);
        setIntField(term66512, term66512.getClass(), "verticalAlignment", 0);
        setIntField(term66512, term66512.getClass(), "horizontalAlignment", 0);
        setIntField(term66512, term66512.getClass(), "verticalTextPosition", 0);
        setIntField(term66512, term66512.getClass(), "horizontalTextPosition", 0);
        setIntField(term66512, term66512.getClass(), "iconTextGap", 0);
        setField(term66512, term66512.getClass(), "labelFor", null);
        setBooleanField(term66512, term66512.getClass(), "isAlignmentXSet", false);
        setFloatField(term66512, term66512.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66512, term66512.getClass(), "isAlignmentYSet", false);
        setFloatField(term66512, term66512.getClass(), "alignmentY", 0.0F);
        setField(term66512, term66512.getClass(), "ui", null);
        setField(term66512, term66512.getClass(), "listenerList", null);
        setField(term66512, term66512.getClass(), "clientProperties", null);
        setField(term66512, term66512.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66512, term66512.getClass(), "autoscrolls", false);
        setField(term66512, term66512.getClass(), "border", null);
        setIntField(term66512, term66512.getClass(), "flags", 0);
        setField(term66512, term66512.getClass(), "inputVerifier", null);
        setBooleanField(term66512, term66512.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66512, term66512.getClass(), "paintingChild", null);
        setField(term66512, term66512.getClass(), "popupMenu", null);
        setField(term66512, term66512.getClass(), "revalidateRunnableScheduled", null);
        setField(term66512, term66512.getClass(), "focusInputMap", null);
        setField(term66512, term66512.getClass(), "ancestorInputMap", null);
        setField(term66512, term66512.getClass(), "windowInputMap", null);
        setField(term66512, term66512.getClass(), "actionMap", null);
        setField(term66512, term66512.getClass(), "aaHint", null);
        setField(term66512, term66512.getClass(), "lcdRenderingHint", null);
        setField(term66512, term66512.getClass(), "component", null);
        setField(term66512, term66512.getClass(), "layoutMgr", null);
        setField(term66512, term66512.getClass(), "dispatcher", null);
        setField(term66512, term66512.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66512, term66512.getClass(), "focusCycleRoot", false);
        setBooleanField(term66512, term66512.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66512, term66512.getClass(), "printingThreads", null);
        setBooleanField(term66512, term66512.getClass(), "printing", false);
        setField(term66512, term66512.getClass(), "containerListener", null);
        setIntField(term66512, term66512.getClass(), "listeningChildren", 0);
        setIntField(term66512, term66512.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66512, term66512.getClass(), "descendantsCount", 0);
        setField(term66512, term66512.getClass(), "preserveBackgroundColor", null);
        setIntField(term66512, term66512.getClass(), "numOfHWComponents", 0);
        setIntField(term66512, term66512.getClass(), "numOfLWComponents", 0);
        setField(term66512, term66512.getClass(), "modalComp", null);
        setField(term66512, term66512.getClass(), "modalAppContext", null);
        setIntField(term66512, term66512.getClass(), "containerSerializedDataVersion", 0);
        setField(term66512, term66512.getClass(), "peer", null);
        setField(term66512, term66512.getClass(), "parent", null);
        setField(term66512, term66512.getClass(), "appContext", null);
        setIntField(term66512, term66512.getClass(), "x", 0);
        setIntField(term66512, term66512.getClass(), "y", 0);
        setIntField(term66512, term66512.getClass(), "width", 0);
        setIntField(term66512, term66512.getClass(), "height", 0);
        setField(term66512, term66512.getClass(), "foreground", null);
        setField(term66512, term66512.getClass(), "background", null);
        setField(term66512, term66512.getClass(), "font", null);
        setField(term66512, term66512.getClass(), "peerFont", null);
        setField(term66512, term66512.getClass(), "cursor", null);
        setField(term66512, term66512.getClass(), "locale", null);
        setField(term66512, term66512.getClass(), "graphicsConfig", null);
        setField(term66512, term66512.getClass(), "bufferStrategy", null);
        setBooleanField(term66512, term66512.getClass(), "ignoreRepaint", false);
        setBooleanField(term66512, term66512.getClass(), "visible", false);
        setBooleanField(term66512, term66512.getClass(), "enabled", false);
        setBooleanField(term66512, term66512.getClass(), "valid", false);
        setField(term66512, term66512.getClass(), "dropTarget", null);
        setField(term66512, term66512.getClass(), "popups", null);
        setField(term66512, term66512.getClass(), "name", null);
        setBooleanField(term66512, term66512.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66512, term66512.getClass(), "focusable", false);
        setIntField(term66512, term66512.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66512, term66512.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66512, term66512.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66512, term66512.getClass(), "acc", null);
        setField(term66512, term66512.getClass(), "minSize", null);
        setBooleanField(term66512, term66512.getClass(), "minSizeSet", false);
        setField(term66512, term66512.getClass(), "prefSize", null);
        setBooleanField(term66512, term66512.getClass(), "prefSizeSet", false);
        setField(term66512, term66512.getClass(), "maxSize", null);
        setBooleanField(term66512, term66512.getClass(), "maxSizeSet", false);
        setField(term66512, term66512.getClass(), "componentOrientation", null);
        setBooleanField(term66512, term66512.getClass(), "newEventsOnly", false);
        setField(term66512, term66512.getClass(), "componentListener", null);
        setField(term66512, term66512.getClass(), "focusListener", null);
        setField(term66512, term66512.getClass(), "hierarchyListener", null);
        setField(term66512, term66512.getClass(), "hierarchyBoundsListener", null);
        setField(term66512, term66512.getClass(), "keyListener", null);
        setField(term66512, term66512.getClass(), "mouseListener", null);
        setField(term66512, term66512.getClass(), "mouseMotionListener", null);
        setField(term66512, term66512.getClass(), "mouseWheelListener", null);
        setField(term66512, term66512.getClass(), "inputMethodListener", null);
        setLongField(term66512, term66512.getClass(), "eventMask", 0L);
        setField(term66512, term66512.getClass(), "changeSupport", null);
        setField(term66512, term66512.getClass(), "objectLock", null);
        setBooleanField(term66512, term66512.getClass(), "isPacked", false);
        setIntField(term66512, term66512.getClass(), "boundsOp", 0);
        setField(term66512, term66512.getClass(), "compoundShape", null);
        setField(term66512, term66512.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66512, term66512.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66512, term66512.getClass(), "backgroundEraseDisabled", false);
        setField(term66512, term66512.getClass(), "eventCache", null);
        setBooleanField(term66512, term66512.getClass(), "coalescingEnabled", false);
        setBooleanField(term66512, term66512.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66512, term66512.getClass(), "componentSerializedDataVersion", 0);
        setField(term66512, term66512.getClass(), "accessibleContext", null);
        term66563 = new Boolean(false);
        term66565 = new Boolean(false);
        term66567 = new Integer(0);
        term66569 = new Integer(0);
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
        args[2] = term66563;
        args[3] = term66565;
        args[4] = term66567;
        args[5] = term66569;
        callMethod(klass, "getValue", argTypes, term66512, args);
    }

};


