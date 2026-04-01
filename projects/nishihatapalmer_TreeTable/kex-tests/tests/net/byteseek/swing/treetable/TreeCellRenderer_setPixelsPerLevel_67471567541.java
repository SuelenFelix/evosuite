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
     Object term80845;
     Object term80896;

    public TreeCellRenderer_setPixelsPerLevel_67471567541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80845 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80845, term80845.getClass(), "treeTableModel", null);
        setField(term80845, term80845.getClass(), "insets", null);
        setIntField(term80845, term80845.getClass(), "pixelsPerLevel", 0);
        setField(term80845, term80845.getClass(), "expandCollapseIconRenderer", null);
        setField(term80845, term80845.getClass(), "expandedIcon", null);
        setField(term80845, term80845.getClass(), "collapsedIcon", null);
        setIntField(term80845, term80845.getClass(), "maxIconWidth", 0);
        setField(term80845, term80845.getClass(), "currentNode", null);
        setField(term80845, term80845.getClass(), "unselectedForeground", null);
        setField(term80845, term80845.getClass(), "unselectedBackground", null);
        setIntField(term80845, term80845.getClass(), "mnemonic", 0);
        setIntField(term80845, term80845.getClass(), "mnemonicIndex", 0);
        setField(term80845, term80845.getClass(), "text", null);
        setField(term80845, term80845.getClass(), "defaultIcon", null);
        setField(term80845, term80845.getClass(), "disabledIcon", null);
        setBooleanField(term80845, term80845.getClass(), "disabledIconSet", false);
        setIntField(term80845, term80845.getClass(), "verticalAlignment", 0);
        setIntField(term80845, term80845.getClass(), "horizontalAlignment", 0);
        setIntField(term80845, term80845.getClass(), "verticalTextPosition", 0);
        setIntField(term80845, term80845.getClass(), "horizontalTextPosition", 0);
        setIntField(term80845, term80845.getClass(), "iconTextGap", 0);
        setField(term80845, term80845.getClass(), "labelFor", null);
        setBooleanField(term80845, term80845.getClass(), "isAlignmentXSet", false);
        setFloatField(term80845, term80845.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80845, term80845.getClass(), "isAlignmentYSet", false);
        setFloatField(term80845, term80845.getClass(), "alignmentY", 0.0F);
        setField(term80845, term80845.getClass(), "ui", null);
        setField(term80845, term80845.getClass(), "listenerList", null);
        setField(term80845, term80845.getClass(), "clientProperties", null);
        setField(term80845, term80845.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80845, term80845.getClass(), "autoscrolls", false);
        setField(term80845, term80845.getClass(), "border", null);
        setIntField(term80845, term80845.getClass(), "flags", 0);
        setField(term80845, term80845.getClass(), "inputVerifier", null);
        setBooleanField(term80845, term80845.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80845, term80845.getClass(), "paintingChild", null);
        setField(term80845, term80845.getClass(), "popupMenu", null);
        setField(term80845, term80845.getClass(), "revalidateRunnableScheduled", null);
        setField(term80845, term80845.getClass(), "focusInputMap", null);
        setField(term80845, term80845.getClass(), "ancestorInputMap", null);
        setField(term80845, term80845.getClass(), "windowInputMap", null);
        setField(term80845, term80845.getClass(), "actionMap", null);
        setField(term80845, term80845.getClass(), "aaHint", null);
        setField(term80845, term80845.getClass(), "lcdRenderingHint", null);
        setField(term80845, term80845.getClass(), "component", null);
        setField(term80845, term80845.getClass(), "layoutMgr", null);
        setField(term80845, term80845.getClass(), "dispatcher", null);
        setField(term80845, term80845.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80845, term80845.getClass(), "focusCycleRoot", false);
        setBooleanField(term80845, term80845.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80845, term80845.getClass(), "printingThreads", null);
        setBooleanField(term80845, term80845.getClass(), "printing", false);
        setField(term80845, term80845.getClass(), "containerListener", null);
        setIntField(term80845, term80845.getClass(), "listeningChildren", 0);
        setIntField(term80845, term80845.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80845, term80845.getClass(), "descendantsCount", 0);
        setField(term80845, term80845.getClass(), "preserveBackgroundColor", null);
        setIntField(term80845, term80845.getClass(), "numOfHWComponents", 0);
        setIntField(term80845, term80845.getClass(), "numOfLWComponents", 0);
        setField(term80845, term80845.getClass(), "modalComp", null);
        setField(term80845, term80845.getClass(), "modalAppContext", null);
        setIntField(term80845, term80845.getClass(), "containerSerializedDataVersion", 0);
        setField(term80845, term80845.getClass(), "peer", null);
        setField(term80845, term80845.getClass(), "parent", null);
        setField(term80845, term80845.getClass(), "appContext", null);
        setIntField(term80845, term80845.getClass(), "x", 0);
        setIntField(term80845, term80845.getClass(), "y", 0);
        setIntField(term80845, term80845.getClass(), "width", 0);
        setIntField(term80845, term80845.getClass(), "height", 0);
        setField(term80845, term80845.getClass(), "foreground", null);
        setField(term80845, term80845.getClass(), "background", null);
        setField(term80845, term80845.getClass(), "font", null);
        setField(term80845, term80845.getClass(), "peerFont", null);
        setField(term80845, term80845.getClass(), "cursor", null);
        setField(term80845, term80845.getClass(), "locale", null);
        setField(term80845, term80845.getClass(), "graphicsConfig", null);
        setField(term80845, term80845.getClass(), "bufferStrategy", null);
        setBooleanField(term80845, term80845.getClass(), "ignoreRepaint", false);
        setBooleanField(term80845, term80845.getClass(), "visible", false);
        setBooleanField(term80845, term80845.getClass(), "enabled", false);
        setBooleanField(term80845, term80845.getClass(), "valid", false);
        setField(term80845, term80845.getClass(), "dropTarget", null);
        setField(term80845, term80845.getClass(), "popups", null);
        setField(term80845, term80845.getClass(), "name", null);
        setBooleanField(term80845, term80845.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80845, term80845.getClass(), "focusable", false);
        setIntField(term80845, term80845.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80845, term80845.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80845, term80845.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80845, term80845.getClass(), "acc", null);
        setField(term80845, term80845.getClass(), "minSize", null);
        setBooleanField(term80845, term80845.getClass(), "minSizeSet", false);
        setField(term80845, term80845.getClass(), "prefSize", null);
        setBooleanField(term80845, term80845.getClass(), "prefSizeSet", false);
        setField(term80845, term80845.getClass(), "maxSize", null);
        setBooleanField(term80845, term80845.getClass(), "maxSizeSet", false);
        setField(term80845, term80845.getClass(), "componentOrientation", null);
        setBooleanField(term80845, term80845.getClass(), "newEventsOnly", false);
        setField(term80845, term80845.getClass(), "componentListener", null);
        setField(term80845, term80845.getClass(), "focusListener", null);
        setField(term80845, term80845.getClass(), "hierarchyListener", null);
        setField(term80845, term80845.getClass(), "hierarchyBoundsListener", null);
        setField(term80845, term80845.getClass(), "keyListener", null);
        setField(term80845, term80845.getClass(), "mouseListener", null);
        setField(term80845, term80845.getClass(), "mouseMotionListener", null);
        setField(term80845, term80845.getClass(), "mouseWheelListener", null);
        setField(term80845, term80845.getClass(), "inputMethodListener", null);
        setLongField(term80845, term80845.getClass(), "eventMask", 0L);
        setField(term80845, term80845.getClass(), "changeSupport", null);
        setField(term80845, term80845.getClass(), "objectLock", null);
        setBooleanField(term80845, term80845.getClass(), "isPacked", false);
        setIntField(term80845, term80845.getClass(), "boundsOp", 0);
        setField(term80845, term80845.getClass(), "compoundShape", null);
        setField(term80845, term80845.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80845, term80845.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80845, term80845.getClass(), "backgroundEraseDisabled", false);
        setField(term80845, term80845.getClass(), "eventCache", null);
        setBooleanField(term80845, term80845.getClass(), "coalescingEnabled", false);
        setBooleanField(term80845, term80845.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80845, term80845.getClass(), "componentSerializedDataVersion", 0);
        setField(term80845, term80845.getClass(), "accessibleContext", null);
        term80896 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80896;
        callMethod(klass, "setPixelsPerLevel", argTypes, term80845, args);
    }

};


