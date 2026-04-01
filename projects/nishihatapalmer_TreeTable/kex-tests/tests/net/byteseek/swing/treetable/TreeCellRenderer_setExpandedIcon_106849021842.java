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

public class TreeCellRenderer_setExpandedIcon_106849021842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80898;

    public TreeCellRenderer_setExpandedIcon_106849021842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80898 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80898, term80898.getClass(), "treeTableModel", null);
        setField(term80898, term80898.getClass(), "insets", null);
        setIntField(term80898, term80898.getClass(), "pixelsPerLevel", 0);
        setField(term80898, term80898.getClass(), "expandCollapseIconRenderer", null);
        setField(term80898, term80898.getClass(), "expandedIcon", null);
        setField(term80898, term80898.getClass(), "collapsedIcon", null);
        setIntField(term80898, term80898.getClass(), "maxIconWidth", 0);
        setField(term80898, term80898.getClass(), "currentNode", null);
        setField(term80898, term80898.getClass(), "unselectedForeground", null);
        setField(term80898, term80898.getClass(), "unselectedBackground", null);
        setIntField(term80898, term80898.getClass(), "mnemonic", 0);
        setIntField(term80898, term80898.getClass(), "mnemonicIndex", 0);
        setField(term80898, term80898.getClass(), "text", null);
        setField(term80898, term80898.getClass(), "defaultIcon", null);
        setField(term80898, term80898.getClass(), "disabledIcon", null);
        setBooleanField(term80898, term80898.getClass(), "disabledIconSet", false);
        setIntField(term80898, term80898.getClass(), "verticalAlignment", 0);
        setIntField(term80898, term80898.getClass(), "horizontalAlignment", 0);
        setIntField(term80898, term80898.getClass(), "verticalTextPosition", 0);
        setIntField(term80898, term80898.getClass(), "horizontalTextPosition", 0);
        setIntField(term80898, term80898.getClass(), "iconTextGap", 0);
        setField(term80898, term80898.getClass(), "labelFor", null);
        setBooleanField(term80898, term80898.getClass(), "isAlignmentXSet", false);
        setFloatField(term80898, term80898.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80898, term80898.getClass(), "isAlignmentYSet", false);
        setFloatField(term80898, term80898.getClass(), "alignmentY", 0.0F);
        setField(term80898, term80898.getClass(), "ui", null);
        setField(term80898, term80898.getClass(), "listenerList", null);
        setField(term80898, term80898.getClass(), "clientProperties", null);
        setField(term80898, term80898.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80898, term80898.getClass(), "autoscrolls", false);
        setField(term80898, term80898.getClass(), "border", null);
        setIntField(term80898, term80898.getClass(), "flags", 0);
        setField(term80898, term80898.getClass(), "inputVerifier", null);
        setBooleanField(term80898, term80898.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80898, term80898.getClass(), "paintingChild", null);
        setField(term80898, term80898.getClass(), "popupMenu", null);
        setField(term80898, term80898.getClass(), "revalidateRunnableScheduled", null);
        setField(term80898, term80898.getClass(), "focusInputMap", null);
        setField(term80898, term80898.getClass(), "ancestorInputMap", null);
        setField(term80898, term80898.getClass(), "windowInputMap", null);
        setField(term80898, term80898.getClass(), "actionMap", null);
        setField(term80898, term80898.getClass(), "aaHint", null);
        setField(term80898, term80898.getClass(), "lcdRenderingHint", null);
        setField(term80898, term80898.getClass(), "component", null);
        setField(term80898, term80898.getClass(), "layoutMgr", null);
        setField(term80898, term80898.getClass(), "dispatcher", null);
        setField(term80898, term80898.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80898, term80898.getClass(), "focusCycleRoot", false);
        setBooleanField(term80898, term80898.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80898, term80898.getClass(), "printingThreads", null);
        setBooleanField(term80898, term80898.getClass(), "printing", false);
        setField(term80898, term80898.getClass(), "containerListener", null);
        setIntField(term80898, term80898.getClass(), "listeningChildren", 0);
        setIntField(term80898, term80898.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80898, term80898.getClass(), "descendantsCount", 0);
        setField(term80898, term80898.getClass(), "preserveBackgroundColor", null);
        setIntField(term80898, term80898.getClass(), "numOfHWComponents", 0);
        setIntField(term80898, term80898.getClass(), "numOfLWComponents", 0);
        setField(term80898, term80898.getClass(), "modalComp", null);
        setField(term80898, term80898.getClass(), "modalAppContext", null);
        setIntField(term80898, term80898.getClass(), "containerSerializedDataVersion", 0);
        setField(term80898, term80898.getClass(), "peer", null);
        setField(term80898, term80898.getClass(), "parent", null);
        setField(term80898, term80898.getClass(), "appContext", null);
        setIntField(term80898, term80898.getClass(), "x", 0);
        setIntField(term80898, term80898.getClass(), "y", 0);
        setIntField(term80898, term80898.getClass(), "width", 0);
        setIntField(term80898, term80898.getClass(), "height", 0);
        setField(term80898, term80898.getClass(), "foreground", null);
        setField(term80898, term80898.getClass(), "background", null);
        setField(term80898, term80898.getClass(), "font", null);
        setField(term80898, term80898.getClass(), "peerFont", null);
        setField(term80898, term80898.getClass(), "cursor", null);
        setField(term80898, term80898.getClass(), "locale", null);
        setField(term80898, term80898.getClass(), "graphicsConfig", null);
        setField(term80898, term80898.getClass(), "bufferStrategy", null);
        setBooleanField(term80898, term80898.getClass(), "ignoreRepaint", false);
        setBooleanField(term80898, term80898.getClass(), "visible", false);
        setBooleanField(term80898, term80898.getClass(), "enabled", false);
        setBooleanField(term80898, term80898.getClass(), "valid", false);
        setField(term80898, term80898.getClass(), "dropTarget", null);
        setField(term80898, term80898.getClass(), "popups", null);
        setField(term80898, term80898.getClass(), "name", null);
        setBooleanField(term80898, term80898.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80898, term80898.getClass(), "focusable", false);
        setIntField(term80898, term80898.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80898, term80898.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80898, term80898.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80898, term80898.getClass(), "acc", null);
        setField(term80898, term80898.getClass(), "minSize", null);
        setBooleanField(term80898, term80898.getClass(), "minSizeSet", false);
        setField(term80898, term80898.getClass(), "prefSize", null);
        setBooleanField(term80898, term80898.getClass(), "prefSizeSet", false);
        setField(term80898, term80898.getClass(), "maxSize", null);
        setBooleanField(term80898, term80898.getClass(), "maxSizeSet", false);
        setField(term80898, term80898.getClass(), "componentOrientation", null);
        setBooleanField(term80898, term80898.getClass(), "newEventsOnly", false);
        setField(term80898, term80898.getClass(), "componentListener", null);
        setField(term80898, term80898.getClass(), "focusListener", null);
        setField(term80898, term80898.getClass(), "hierarchyListener", null);
        setField(term80898, term80898.getClass(), "hierarchyBoundsListener", null);
        setField(term80898, term80898.getClass(), "keyListener", null);
        setField(term80898, term80898.getClass(), "mouseListener", null);
        setField(term80898, term80898.getClass(), "mouseMotionListener", null);
        setField(term80898, term80898.getClass(), "mouseWheelListener", null);
        setField(term80898, term80898.getClass(), "inputMethodListener", null);
        setLongField(term80898, term80898.getClass(), "eventMask", 0L);
        setField(term80898, term80898.getClass(), "changeSupport", null);
        setField(term80898, term80898.getClass(), "objectLock", null);
        setBooleanField(term80898, term80898.getClass(), "isPacked", false);
        setIntField(term80898, term80898.getClass(), "boundsOp", 0);
        setField(term80898, term80898.getClass(), "compoundShape", null);
        setField(term80898, term80898.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80898, term80898.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80898, term80898.getClass(), "backgroundEraseDisabled", false);
        setField(term80898, term80898.getClass(), "eventCache", null);
        setBooleanField(term80898, term80898.getClass(), "coalescingEnabled", false);
        setBooleanField(term80898, term80898.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80898, term80898.getClass(), "componentSerializedDataVersion", 0);
        setField(term80898, term80898.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExpandedIcon", argTypes, term80898, args);
    }

};


