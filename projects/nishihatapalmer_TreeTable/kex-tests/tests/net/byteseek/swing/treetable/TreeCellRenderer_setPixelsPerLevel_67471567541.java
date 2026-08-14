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

public class TreeCellRenderer_setPixelsPerLevel_67471567541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80163;
     Object term80214;

    public TreeCellRenderer_setPixelsPerLevel_67471567541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80163 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80163, term80163.getClass(), "treeTableModel", null);
        setField(term80163, term80163.getClass(), "insets", null);
        setIntField(term80163, term80163.getClass(), "pixelsPerLevel", 0);
        setField(term80163, term80163.getClass(), "expandCollapseIconRenderer", null);
        setField(term80163, term80163.getClass(), "expandedIcon", null);
        setField(term80163, term80163.getClass(), "collapsedIcon", null);
        setIntField(term80163, term80163.getClass(), "maxIconWidth", 0);
        setField(term80163, term80163.getClass(), "currentNode", null);
        setField(term80163, term80163.getClass(), "unselectedForeground", null);
        setField(term80163, term80163.getClass(), "unselectedBackground", null);
        setIntField(term80163, term80163.getClass(), "mnemonic", 0);
        setIntField(term80163, term80163.getClass(), "mnemonicIndex", 0);
        setField(term80163, term80163.getClass(), "text", null);
        setField(term80163, term80163.getClass(), "defaultIcon", null);
        setField(term80163, term80163.getClass(), "disabledIcon", null);
        setBooleanField(term80163, term80163.getClass(), "disabledIconSet", false);
        setIntField(term80163, term80163.getClass(), "verticalAlignment", 0);
        setIntField(term80163, term80163.getClass(), "horizontalAlignment", 0);
        setIntField(term80163, term80163.getClass(), "verticalTextPosition", 0);
        setIntField(term80163, term80163.getClass(), "horizontalTextPosition", 0);
        setIntField(term80163, term80163.getClass(), "iconTextGap", 0);
        setField(term80163, term80163.getClass(), "labelFor", null);
        setBooleanField(term80163, term80163.getClass(), "isAlignmentXSet", false);
        setFloatField(term80163, term80163.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80163, term80163.getClass(), "isAlignmentYSet", false);
        setFloatField(term80163, term80163.getClass(), "alignmentY", 0.0F);
        setField(term80163, term80163.getClass(), "ui", null);
        setField(term80163, term80163.getClass(), "listenerList", null);
        setField(term80163, term80163.getClass(), "clientProperties", null);
        setField(term80163, term80163.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80163, term80163.getClass(), "autoscrolls", false);
        setField(term80163, term80163.getClass(), "border", null);
        setIntField(term80163, term80163.getClass(), "flags", 0);
        setField(term80163, term80163.getClass(), "inputVerifier", null);
        setBooleanField(term80163, term80163.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80163, term80163.getClass(), "paintingChild", null);
        setField(term80163, term80163.getClass(), "popupMenu", null);
        setField(term80163, term80163.getClass(), "revalidateRunnableScheduled", null);
        setField(term80163, term80163.getClass(), "focusInputMap", null);
        setField(term80163, term80163.getClass(), "ancestorInputMap", null);
        setField(term80163, term80163.getClass(), "windowInputMap", null);
        setField(term80163, term80163.getClass(), "actionMap", null);
        setField(term80163, term80163.getClass(), "aaHint", null);
        setField(term80163, term80163.getClass(), "lcdRenderingHint", null);
        setField(term80163, term80163.getClass(), "component", null);
        setField(term80163, term80163.getClass(), "layoutMgr", null);
        setField(term80163, term80163.getClass(), "dispatcher", null);
        setField(term80163, term80163.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80163, term80163.getClass(), "focusCycleRoot", false);
        setBooleanField(term80163, term80163.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80163, term80163.getClass(), "printingThreads", null);
        setBooleanField(term80163, term80163.getClass(), "printing", false);
        setField(term80163, term80163.getClass(), "containerListener", null);
        setIntField(term80163, term80163.getClass(), "listeningChildren", 0);
        setIntField(term80163, term80163.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80163, term80163.getClass(), "descendantsCount", 0);
        setField(term80163, term80163.getClass(), "preserveBackgroundColor", null);
        setIntField(term80163, term80163.getClass(), "numOfHWComponents", 0);
        setIntField(term80163, term80163.getClass(), "numOfLWComponents", 0);
        setField(term80163, term80163.getClass(), "modalComp", null);
        setField(term80163, term80163.getClass(), "modalAppContext", null);
        setIntField(term80163, term80163.getClass(), "containerSerializedDataVersion", 0);
        setField(term80163, term80163.getClass(), "peer", null);
        setField(term80163, term80163.getClass(), "parent", null);
        setField(term80163, term80163.getClass(), "appContext", null);
        setIntField(term80163, term80163.getClass(), "x", 0);
        setIntField(term80163, term80163.getClass(), "y", 0);
        setIntField(term80163, term80163.getClass(), "width", 0);
        setIntField(term80163, term80163.getClass(), "height", 0);
        setField(term80163, term80163.getClass(), "foreground", null);
        setField(term80163, term80163.getClass(), "background", null);
        setField(term80163, term80163.getClass(), "font", null);
        setField(term80163, term80163.getClass(), "peerFont", null);
        setField(term80163, term80163.getClass(), "cursor", null);
        setField(term80163, term80163.getClass(), "locale", null);
        setField(term80163, term80163.getClass(), "graphicsConfig", null);
        setField(term80163, term80163.getClass(), "bufferStrategy", null);
        setBooleanField(term80163, term80163.getClass(), "ignoreRepaint", false);
        setBooleanField(term80163, term80163.getClass(), "visible", false);
        setBooleanField(term80163, term80163.getClass(), "enabled", false);
        setBooleanField(term80163, term80163.getClass(), "valid", false);
        setField(term80163, term80163.getClass(), "dropTarget", null);
        setField(term80163, term80163.getClass(), "popups", null);
        setField(term80163, term80163.getClass(), "name", null);
        setBooleanField(term80163, term80163.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80163, term80163.getClass(), "focusable", false);
        setIntField(term80163, term80163.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80163, term80163.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80163, term80163.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80163, term80163.getClass(), "acc", null);
        setField(term80163, term80163.getClass(), "minSize", null);
        setBooleanField(term80163, term80163.getClass(), "minSizeSet", false);
        setField(term80163, term80163.getClass(), "prefSize", null);
        setBooleanField(term80163, term80163.getClass(), "prefSizeSet", false);
        setField(term80163, term80163.getClass(), "maxSize", null);
        setBooleanField(term80163, term80163.getClass(), "maxSizeSet", false);
        setField(term80163, term80163.getClass(), "componentOrientation", null);
        setBooleanField(term80163, term80163.getClass(), "newEventsOnly", false);
        setField(term80163, term80163.getClass(), "componentListener", null);
        setField(term80163, term80163.getClass(), "focusListener", null);
        setField(term80163, term80163.getClass(), "hierarchyListener", null);
        setField(term80163, term80163.getClass(), "hierarchyBoundsListener", null);
        setField(term80163, term80163.getClass(), "keyListener", null);
        setField(term80163, term80163.getClass(), "mouseListener", null);
        setField(term80163, term80163.getClass(), "mouseMotionListener", null);
        setField(term80163, term80163.getClass(), "mouseWheelListener", null);
        setField(term80163, term80163.getClass(), "inputMethodListener", null);
        setLongField(term80163, term80163.getClass(), "eventMask", 0L);
        setField(term80163, term80163.getClass(), "changeSupport", null);
        setField(term80163, term80163.getClass(), "objectLock", null);
        setBooleanField(term80163, term80163.getClass(), "isPacked", false);
        setIntField(term80163, term80163.getClass(), "boundsOp", 0);
        setField(term80163, term80163.getClass(), "compoundShape", null);
        setField(term80163, term80163.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80163, term80163.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80163, term80163.getClass(), "backgroundEraseDisabled", false);
        setField(term80163, term80163.getClass(), "eventCache", null);
        setBooleanField(term80163, term80163.getClass(), "coalescingEnabled", false);
        setBooleanField(term80163, term80163.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80163, term80163.getClass(), "componentSerializedDataVersion", 0);
        setField(term80163, term80163.getClass(), "accessibleContext", null);
        term80214 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80214;
        callMethod(klass, "setPixelsPerLevel", argTypes, term80163, args);
    }

};


