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
     Object term81102;
     Object term81153;

    public TreeCellRenderer_setNodeIndent_56354450146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81102 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81102, term81102.getClass(), "treeTableModel", null);
        setField(term81102, term81102.getClass(), "insets", null);
        setIntField(term81102, term81102.getClass(), "pixelsPerLevel", 0);
        setField(term81102, term81102.getClass(), "expandCollapseIconRenderer", null);
        setField(term81102, term81102.getClass(), "expandedIcon", null);
        setField(term81102, term81102.getClass(), "collapsedIcon", null);
        setIntField(term81102, term81102.getClass(), "maxIconWidth", 0);
        setField(term81102, term81102.getClass(), "currentNode", null);
        setField(term81102, term81102.getClass(), "unselectedForeground", null);
        setField(term81102, term81102.getClass(), "unselectedBackground", null);
        setIntField(term81102, term81102.getClass(), "mnemonic", 0);
        setIntField(term81102, term81102.getClass(), "mnemonicIndex", 0);
        setField(term81102, term81102.getClass(), "text", null);
        setField(term81102, term81102.getClass(), "defaultIcon", null);
        setField(term81102, term81102.getClass(), "disabledIcon", null);
        setBooleanField(term81102, term81102.getClass(), "disabledIconSet", false);
        setIntField(term81102, term81102.getClass(), "verticalAlignment", 0);
        setIntField(term81102, term81102.getClass(), "horizontalAlignment", 0);
        setIntField(term81102, term81102.getClass(), "verticalTextPosition", 0);
        setIntField(term81102, term81102.getClass(), "horizontalTextPosition", 0);
        setIntField(term81102, term81102.getClass(), "iconTextGap", 0);
        setField(term81102, term81102.getClass(), "labelFor", null);
        setBooleanField(term81102, term81102.getClass(), "isAlignmentXSet", false);
        setFloatField(term81102, term81102.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81102, term81102.getClass(), "isAlignmentYSet", false);
        setFloatField(term81102, term81102.getClass(), "alignmentY", 0.0F);
        setField(term81102, term81102.getClass(), "ui", null);
        setField(term81102, term81102.getClass(), "listenerList", null);
        setField(term81102, term81102.getClass(), "clientProperties", null);
        setField(term81102, term81102.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81102, term81102.getClass(), "autoscrolls", false);
        setField(term81102, term81102.getClass(), "border", null);
        setIntField(term81102, term81102.getClass(), "flags", 0);
        setField(term81102, term81102.getClass(), "inputVerifier", null);
        setBooleanField(term81102, term81102.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81102, term81102.getClass(), "paintingChild", null);
        setField(term81102, term81102.getClass(), "popupMenu", null);
        setField(term81102, term81102.getClass(), "revalidateRunnableScheduled", null);
        setField(term81102, term81102.getClass(), "focusInputMap", null);
        setField(term81102, term81102.getClass(), "ancestorInputMap", null);
        setField(term81102, term81102.getClass(), "windowInputMap", null);
        setField(term81102, term81102.getClass(), "actionMap", null);
        setField(term81102, term81102.getClass(), "aaHint", null);
        setField(term81102, term81102.getClass(), "lcdRenderingHint", null);
        setField(term81102, term81102.getClass(), "component", null);
        setField(term81102, term81102.getClass(), "layoutMgr", null);
        setField(term81102, term81102.getClass(), "dispatcher", null);
        setField(term81102, term81102.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81102, term81102.getClass(), "focusCycleRoot", false);
        setBooleanField(term81102, term81102.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81102, term81102.getClass(), "printingThreads", null);
        setBooleanField(term81102, term81102.getClass(), "printing", false);
        setField(term81102, term81102.getClass(), "containerListener", null);
        setIntField(term81102, term81102.getClass(), "listeningChildren", 0);
        setIntField(term81102, term81102.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81102, term81102.getClass(), "descendantsCount", 0);
        setField(term81102, term81102.getClass(), "preserveBackgroundColor", null);
        setIntField(term81102, term81102.getClass(), "numOfHWComponents", 0);
        setIntField(term81102, term81102.getClass(), "numOfLWComponents", 0);
        setField(term81102, term81102.getClass(), "modalComp", null);
        setField(term81102, term81102.getClass(), "modalAppContext", null);
        setIntField(term81102, term81102.getClass(), "containerSerializedDataVersion", 0);
        setField(term81102, term81102.getClass(), "peer", null);
        setField(term81102, term81102.getClass(), "parent", null);
        setField(term81102, term81102.getClass(), "appContext", null);
        setIntField(term81102, term81102.getClass(), "x", 0);
        setIntField(term81102, term81102.getClass(), "y", 0);
        setIntField(term81102, term81102.getClass(), "width", 0);
        setIntField(term81102, term81102.getClass(), "height", 0);
        setField(term81102, term81102.getClass(), "foreground", null);
        setField(term81102, term81102.getClass(), "background", null);
        setField(term81102, term81102.getClass(), "font", null);
        setField(term81102, term81102.getClass(), "peerFont", null);
        setField(term81102, term81102.getClass(), "cursor", null);
        setField(term81102, term81102.getClass(), "locale", null);
        setField(term81102, term81102.getClass(), "graphicsConfig", null);
        setField(term81102, term81102.getClass(), "bufferStrategy", null);
        setBooleanField(term81102, term81102.getClass(), "ignoreRepaint", false);
        setBooleanField(term81102, term81102.getClass(), "visible", false);
        setBooleanField(term81102, term81102.getClass(), "enabled", false);
        setBooleanField(term81102, term81102.getClass(), "valid", false);
        setField(term81102, term81102.getClass(), "dropTarget", null);
        setField(term81102, term81102.getClass(), "popups", null);
        setField(term81102, term81102.getClass(), "name", null);
        setBooleanField(term81102, term81102.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81102, term81102.getClass(), "focusable", false);
        setIntField(term81102, term81102.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81102, term81102.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81102, term81102.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81102, term81102.getClass(), "acc", null);
        setField(term81102, term81102.getClass(), "minSize", null);
        setBooleanField(term81102, term81102.getClass(), "minSizeSet", false);
        setField(term81102, term81102.getClass(), "prefSize", null);
        setBooleanField(term81102, term81102.getClass(), "prefSizeSet", false);
        setField(term81102, term81102.getClass(), "maxSize", null);
        setBooleanField(term81102, term81102.getClass(), "maxSizeSet", false);
        setField(term81102, term81102.getClass(), "componentOrientation", null);
        setBooleanField(term81102, term81102.getClass(), "newEventsOnly", false);
        setField(term81102, term81102.getClass(), "componentListener", null);
        setField(term81102, term81102.getClass(), "focusListener", null);
        setField(term81102, term81102.getClass(), "hierarchyListener", null);
        setField(term81102, term81102.getClass(), "hierarchyBoundsListener", null);
        setField(term81102, term81102.getClass(), "keyListener", null);
        setField(term81102, term81102.getClass(), "mouseListener", null);
        setField(term81102, term81102.getClass(), "mouseMotionListener", null);
        setField(term81102, term81102.getClass(), "mouseWheelListener", null);
        setField(term81102, term81102.getClass(), "inputMethodListener", null);
        setLongField(term81102, term81102.getClass(), "eventMask", 0L);
        setField(term81102, term81102.getClass(), "changeSupport", null);
        setField(term81102, term81102.getClass(), "objectLock", null);
        setBooleanField(term81102, term81102.getClass(), "isPacked", false);
        setIntField(term81102, term81102.getClass(), "boundsOp", 0);
        setField(term81102, term81102.getClass(), "compoundShape", null);
        setField(term81102, term81102.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81102, term81102.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81102, term81102.getClass(), "backgroundEraseDisabled", false);
        setField(term81102, term81102.getClass(), "eventCache", null);
        setBooleanField(term81102, term81102.getClass(), "coalescingEnabled", false);
        setBooleanField(term81102, term81102.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81102, term81102.getClass(), "componentSerializedDataVersion", 0);
        setField(term81102, term81102.getClass(), "accessibleContext", null);
        term81153 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term81153;
        callMethod(klass, "setNodeIndent", argTypes, term81102, args);
    }

};


