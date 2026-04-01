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

public class TreeCellRenderer_getSelectedBackgroundColor_56688537719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54086;
     Object term54137;
     Object term54139;
     Object term54141;

    public TreeCellRenderer_getSelectedBackgroundColor_56688537719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54086 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term54086, term54086.getClass(), "treeTableModel", null);
        setField(term54086, term54086.getClass(), "insets", null);
        setIntField(term54086, term54086.getClass(), "pixelsPerLevel", 0);
        setField(term54086, term54086.getClass(), "expandCollapseIconRenderer", null);
        setField(term54086, term54086.getClass(), "expandedIcon", null);
        setField(term54086, term54086.getClass(), "collapsedIcon", null);
        setIntField(term54086, term54086.getClass(), "maxIconWidth", 0);
        setField(term54086, term54086.getClass(), "currentNode", null);
        setField(term54086, term54086.getClass(), "unselectedForeground", null);
        setField(term54086, term54086.getClass(), "unselectedBackground", null);
        setIntField(term54086, term54086.getClass(), "mnemonic", 0);
        setIntField(term54086, term54086.getClass(), "mnemonicIndex", 0);
        setField(term54086, term54086.getClass(), "text", null);
        setField(term54086, term54086.getClass(), "defaultIcon", null);
        setField(term54086, term54086.getClass(), "disabledIcon", null);
        setBooleanField(term54086, term54086.getClass(), "disabledIconSet", false);
        setIntField(term54086, term54086.getClass(), "verticalAlignment", 0);
        setIntField(term54086, term54086.getClass(), "horizontalAlignment", 0);
        setIntField(term54086, term54086.getClass(), "verticalTextPosition", 0);
        setIntField(term54086, term54086.getClass(), "horizontalTextPosition", 0);
        setIntField(term54086, term54086.getClass(), "iconTextGap", 0);
        setField(term54086, term54086.getClass(), "labelFor", null);
        setBooleanField(term54086, term54086.getClass(), "isAlignmentXSet", false);
        setFloatField(term54086, term54086.getClass(), "alignmentX", 0.0F);
        setBooleanField(term54086, term54086.getClass(), "isAlignmentYSet", false);
        setFloatField(term54086, term54086.getClass(), "alignmentY", 0.0F);
        setField(term54086, term54086.getClass(), "ui", null);
        setField(term54086, term54086.getClass(), "listenerList", null);
        setField(term54086, term54086.getClass(), "clientProperties", null);
        setField(term54086, term54086.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term54086, term54086.getClass(), "autoscrolls", false);
        setField(term54086, term54086.getClass(), "border", null);
        setIntField(term54086, term54086.getClass(), "flags", 0);
        setField(term54086, term54086.getClass(), "inputVerifier", null);
        setBooleanField(term54086, term54086.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term54086, term54086.getClass(), "paintingChild", null);
        setField(term54086, term54086.getClass(), "popupMenu", null);
        setField(term54086, term54086.getClass(), "revalidateRunnableScheduled", null);
        setField(term54086, term54086.getClass(), "focusInputMap", null);
        setField(term54086, term54086.getClass(), "ancestorInputMap", null);
        setField(term54086, term54086.getClass(), "windowInputMap", null);
        setField(term54086, term54086.getClass(), "actionMap", null);
        setField(term54086, term54086.getClass(), "aaHint", null);
        setField(term54086, term54086.getClass(), "lcdRenderingHint", null);
        setField(term54086, term54086.getClass(), "component", null);
        setField(term54086, term54086.getClass(), "layoutMgr", null);
        setField(term54086, term54086.getClass(), "dispatcher", null);
        setField(term54086, term54086.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term54086, term54086.getClass(), "focusCycleRoot", false);
        setBooleanField(term54086, term54086.getClass(), "focusTraversalPolicyProvider", false);
        setField(term54086, term54086.getClass(), "printingThreads", null);
        setBooleanField(term54086, term54086.getClass(), "printing", false);
        setField(term54086, term54086.getClass(), "containerListener", null);
        setIntField(term54086, term54086.getClass(), "listeningChildren", 0);
        setIntField(term54086, term54086.getClass(), "listeningBoundsChildren", 0);
        setIntField(term54086, term54086.getClass(), "descendantsCount", 0);
        setField(term54086, term54086.getClass(), "preserveBackgroundColor", null);
        setIntField(term54086, term54086.getClass(), "numOfHWComponents", 0);
        setIntField(term54086, term54086.getClass(), "numOfLWComponents", 0);
        setField(term54086, term54086.getClass(), "modalComp", null);
        setField(term54086, term54086.getClass(), "modalAppContext", null);
        setIntField(term54086, term54086.getClass(), "containerSerializedDataVersion", 0);
        setField(term54086, term54086.getClass(), "peer", null);
        setField(term54086, term54086.getClass(), "parent", null);
        setField(term54086, term54086.getClass(), "appContext", null);
        setIntField(term54086, term54086.getClass(), "x", 0);
        setIntField(term54086, term54086.getClass(), "y", 0);
        setIntField(term54086, term54086.getClass(), "width", 0);
        setIntField(term54086, term54086.getClass(), "height", 0);
        setField(term54086, term54086.getClass(), "foreground", null);
        setField(term54086, term54086.getClass(), "background", null);
        setField(term54086, term54086.getClass(), "font", null);
        setField(term54086, term54086.getClass(), "peerFont", null);
        setField(term54086, term54086.getClass(), "cursor", null);
        setField(term54086, term54086.getClass(), "locale", null);
        setField(term54086, term54086.getClass(), "graphicsConfig", null);
        setField(term54086, term54086.getClass(), "bufferStrategy", null);
        setBooleanField(term54086, term54086.getClass(), "ignoreRepaint", false);
        setBooleanField(term54086, term54086.getClass(), "visible", false);
        setBooleanField(term54086, term54086.getClass(), "enabled", false);
        setBooleanField(term54086, term54086.getClass(), "valid", false);
        setField(term54086, term54086.getClass(), "dropTarget", null);
        setField(term54086, term54086.getClass(), "popups", null);
        setField(term54086, term54086.getClass(), "name", null);
        setBooleanField(term54086, term54086.getClass(), "nameExplicitlySet", false);
        setBooleanField(term54086, term54086.getClass(), "focusable", false);
        setIntField(term54086, term54086.getClass(), "isFocusTraversableOverridden", 0);
        setField(term54086, term54086.getClass(), "focusTraversalKeys", null);
        setBooleanField(term54086, term54086.getClass(), "focusTraversalKeysEnabled", false);
        setField(term54086, term54086.getClass(), "acc", null);
        setField(term54086, term54086.getClass(), "minSize", null);
        setBooleanField(term54086, term54086.getClass(), "minSizeSet", false);
        setField(term54086, term54086.getClass(), "prefSize", null);
        setBooleanField(term54086, term54086.getClass(), "prefSizeSet", false);
        setField(term54086, term54086.getClass(), "maxSize", null);
        setBooleanField(term54086, term54086.getClass(), "maxSizeSet", false);
        setField(term54086, term54086.getClass(), "componentOrientation", null);
        setBooleanField(term54086, term54086.getClass(), "newEventsOnly", false);
        setField(term54086, term54086.getClass(), "componentListener", null);
        setField(term54086, term54086.getClass(), "focusListener", null);
        setField(term54086, term54086.getClass(), "hierarchyListener", null);
        setField(term54086, term54086.getClass(), "hierarchyBoundsListener", null);
        setField(term54086, term54086.getClass(), "keyListener", null);
        setField(term54086, term54086.getClass(), "mouseListener", null);
        setField(term54086, term54086.getClass(), "mouseMotionListener", null);
        setField(term54086, term54086.getClass(), "mouseWheelListener", null);
        setField(term54086, term54086.getClass(), "inputMethodListener", null);
        setLongField(term54086, term54086.getClass(), "eventMask", 0L);
        setField(term54086, term54086.getClass(), "changeSupport", null);
        setField(term54086, term54086.getClass(), "objectLock", null);
        setBooleanField(term54086, term54086.getClass(), "isPacked", false);
        setIntField(term54086, term54086.getClass(), "boundsOp", 0);
        setField(term54086, term54086.getClass(), "compoundShape", null);
        setField(term54086, term54086.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term54086, term54086.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term54086, term54086.getClass(), "backgroundEraseDisabled", false);
        setField(term54086, term54086.getClass(), "eventCache", null);
        setBooleanField(term54086, term54086.getClass(), "coalescingEnabled", false);
        setBooleanField(term54086, term54086.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term54086, term54086.getClass(), "componentSerializedDataVersion", 0);
        setField(term54086, term54086.getClass(), "accessibleContext", null);
        term54137 = new Boolean(false);
        term54139 = new Integer(0);
        term54141 = new Integer(0);
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
        args[2] = term54137;
        args[3] = term54139;
        args[4] = term54141;
        callMethod(klass, "getSelectedBackgroundColor", argTypes, term54086, args);
    }

};


