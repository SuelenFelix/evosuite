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
import java.lang.Integer;

public class TreeCellRenderer_setNodeIndent_56354450146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80420;
     Object term80471;

    public TreeCellRenderer_setNodeIndent_56354450146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80420 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80420, term80420.getClass(), "treeTableModel", null);
        setField(term80420, term80420.getClass(), "insets", null);
        setIntField(term80420, term80420.getClass(), "pixelsPerLevel", 0);
        setField(term80420, term80420.getClass(), "expandCollapseIconRenderer", null);
        setField(term80420, term80420.getClass(), "expandedIcon", null);
        setField(term80420, term80420.getClass(), "collapsedIcon", null);
        setIntField(term80420, term80420.getClass(), "maxIconWidth", 0);
        setField(term80420, term80420.getClass(), "currentNode", null);
        setField(term80420, term80420.getClass(), "unselectedForeground", null);
        setField(term80420, term80420.getClass(), "unselectedBackground", null);
        setIntField(term80420, term80420.getClass(), "mnemonic", 0);
        setIntField(term80420, term80420.getClass(), "mnemonicIndex", 0);
        setField(term80420, term80420.getClass(), "text", null);
        setField(term80420, term80420.getClass(), "defaultIcon", null);
        setField(term80420, term80420.getClass(), "disabledIcon", null);
        setBooleanField(term80420, term80420.getClass(), "disabledIconSet", false);
        setIntField(term80420, term80420.getClass(), "verticalAlignment", 0);
        setIntField(term80420, term80420.getClass(), "horizontalAlignment", 0);
        setIntField(term80420, term80420.getClass(), "verticalTextPosition", 0);
        setIntField(term80420, term80420.getClass(), "horizontalTextPosition", 0);
        setIntField(term80420, term80420.getClass(), "iconTextGap", 0);
        setField(term80420, term80420.getClass(), "labelFor", null);
        setBooleanField(term80420, term80420.getClass(), "isAlignmentXSet", false);
        setFloatField(term80420, term80420.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80420, term80420.getClass(), "isAlignmentYSet", false);
        setFloatField(term80420, term80420.getClass(), "alignmentY", 0.0F);
        setField(term80420, term80420.getClass(), "ui", null);
        setField(term80420, term80420.getClass(), "listenerList", null);
        setField(term80420, term80420.getClass(), "clientProperties", null);
        setField(term80420, term80420.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80420, term80420.getClass(), "autoscrolls", false);
        setField(term80420, term80420.getClass(), "border", null);
        setIntField(term80420, term80420.getClass(), "flags", 0);
        setField(term80420, term80420.getClass(), "inputVerifier", null);
        setBooleanField(term80420, term80420.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80420, term80420.getClass(), "paintingChild", null);
        setField(term80420, term80420.getClass(), "popupMenu", null);
        setField(term80420, term80420.getClass(), "revalidateRunnableScheduled", null);
        setField(term80420, term80420.getClass(), "focusInputMap", null);
        setField(term80420, term80420.getClass(), "ancestorInputMap", null);
        setField(term80420, term80420.getClass(), "windowInputMap", null);
        setField(term80420, term80420.getClass(), "actionMap", null);
        setField(term80420, term80420.getClass(), "aaHint", null);
        setField(term80420, term80420.getClass(), "lcdRenderingHint", null);
        setField(term80420, term80420.getClass(), "component", null);
        setField(term80420, term80420.getClass(), "layoutMgr", null);
        setField(term80420, term80420.getClass(), "dispatcher", null);
        setField(term80420, term80420.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80420, term80420.getClass(), "focusCycleRoot", false);
        setBooleanField(term80420, term80420.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80420, term80420.getClass(), "printingThreads", null);
        setBooleanField(term80420, term80420.getClass(), "printing", false);
        setField(term80420, term80420.getClass(), "containerListener", null);
        setIntField(term80420, term80420.getClass(), "listeningChildren", 0);
        setIntField(term80420, term80420.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80420, term80420.getClass(), "descendantsCount", 0);
        setField(term80420, term80420.getClass(), "preserveBackgroundColor", null);
        setIntField(term80420, term80420.getClass(), "numOfHWComponents", 0);
        setIntField(term80420, term80420.getClass(), "numOfLWComponents", 0);
        setField(term80420, term80420.getClass(), "modalComp", null);
        setField(term80420, term80420.getClass(), "modalAppContext", null);
        setIntField(term80420, term80420.getClass(), "containerSerializedDataVersion", 0);
        setField(term80420, term80420.getClass(), "peer", null);
        setField(term80420, term80420.getClass(), "parent", null);
        setField(term80420, term80420.getClass(), "appContext", null);
        setIntField(term80420, term80420.getClass(), "x", 0);
        setIntField(term80420, term80420.getClass(), "y", 0);
        setIntField(term80420, term80420.getClass(), "width", 0);
        setIntField(term80420, term80420.getClass(), "height", 0);
        setField(term80420, term80420.getClass(), "foreground", null);
        setField(term80420, term80420.getClass(), "background", null);
        setField(term80420, term80420.getClass(), "font", null);
        setField(term80420, term80420.getClass(), "peerFont", null);
        setField(term80420, term80420.getClass(), "cursor", null);
        setField(term80420, term80420.getClass(), "locale", null);
        setField(term80420, term80420.getClass(), "graphicsConfig", null);
        setField(term80420, term80420.getClass(), "bufferStrategy", null);
        setBooleanField(term80420, term80420.getClass(), "ignoreRepaint", false);
        setBooleanField(term80420, term80420.getClass(), "visible", false);
        setBooleanField(term80420, term80420.getClass(), "enabled", false);
        setBooleanField(term80420, term80420.getClass(), "valid", false);
        setField(term80420, term80420.getClass(), "dropTarget", null);
        setField(term80420, term80420.getClass(), "popups", null);
        setField(term80420, term80420.getClass(), "name", null);
        setBooleanField(term80420, term80420.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80420, term80420.getClass(), "focusable", false);
        setIntField(term80420, term80420.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80420, term80420.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80420, term80420.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80420, term80420.getClass(), "acc", null);
        setField(term80420, term80420.getClass(), "minSize", null);
        setBooleanField(term80420, term80420.getClass(), "minSizeSet", false);
        setField(term80420, term80420.getClass(), "prefSize", null);
        setBooleanField(term80420, term80420.getClass(), "prefSizeSet", false);
        setField(term80420, term80420.getClass(), "maxSize", null);
        setBooleanField(term80420, term80420.getClass(), "maxSizeSet", false);
        setField(term80420, term80420.getClass(), "componentOrientation", null);
        setBooleanField(term80420, term80420.getClass(), "newEventsOnly", false);
        setField(term80420, term80420.getClass(), "componentListener", null);
        setField(term80420, term80420.getClass(), "focusListener", null);
        setField(term80420, term80420.getClass(), "hierarchyListener", null);
        setField(term80420, term80420.getClass(), "hierarchyBoundsListener", null);
        setField(term80420, term80420.getClass(), "keyListener", null);
        setField(term80420, term80420.getClass(), "mouseListener", null);
        setField(term80420, term80420.getClass(), "mouseMotionListener", null);
        setField(term80420, term80420.getClass(), "mouseWheelListener", null);
        setField(term80420, term80420.getClass(), "inputMethodListener", null);
        setLongField(term80420, term80420.getClass(), "eventMask", 0L);
        setField(term80420, term80420.getClass(), "changeSupport", null);
        setField(term80420, term80420.getClass(), "objectLock", null);
        setBooleanField(term80420, term80420.getClass(), "isPacked", false);
        setIntField(term80420, term80420.getClass(), "boundsOp", 0);
        setField(term80420, term80420.getClass(), "compoundShape", null);
        setField(term80420, term80420.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80420, term80420.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80420, term80420.getClass(), "backgroundEraseDisabled", false);
        setField(term80420, term80420.getClass(), "eventCache", null);
        setBooleanField(term80420, term80420.getClass(), "coalescingEnabled", false);
        setBooleanField(term80420, term80420.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80420, term80420.getClass(), "componentSerializedDataVersion", 0);
        setField(term80420, term80420.getClass(), "accessibleContext", null);
        term80471 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80471;
        callMethod(klass, "setNodeIndent", argTypes, term80420, args);
    }

};


