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

public class TreeCellRenderer_getPreferredSize_156402918738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80690;

    public TreeCellRenderer_getPreferredSize_156402918738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80690 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80690, term80690.getClass(), "treeTableModel", null);
        setField(term80690, term80690.getClass(), "insets", null);
        setIntField(term80690, term80690.getClass(), "pixelsPerLevel", 0);
        setField(term80690, term80690.getClass(), "expandCollapseIconRenderer", null);
        setField(term80690, term80690.getClass(), "expandedIcon", null);
        setField(term80690, term80690.getClass(), "collapsedIcon", null);
        setIntField(term80690, term80690.getClass(), "maxIconWidth", 0);
        setField(term80690, term80690.getClass(), "currentNode", null);
        setField(term80690, term80690.getClass(), "unselectedForeground", null);
        setField(term80690, term80690.getClass(), "unselectedBackground", null);
        setIntField(term80690, term80690.getClass(), "mnemonic", 0);
        setIntField(term80690, term80690.getClass(), "mnemonicIndex", 0);
        setField(term80690, term80690.getClass(), "text", null);
        setField(term80690, term80690.getClass(), "defaultIcon", null);
        setField(term80690, term80690.getClass(), "disabledIcon", null);
        setBooleanField(term80690, term80690.getClass(), "disabledIconSet", false);
        setIntField(term80690, term80690.getClass(), "verticalAlignment", 0);
        setIntField(term80690, term80690.getClass(), "horizontalAlignment", 0);
        setIntField(term80690, term80690.getClass(), "verticalTextPosition", 0);
        setIntField(term80690, term80690.getClass(), "horizontalTextPosition", 0);
        setIntField(term80690, term80690.getClass(), "iconTextGap", 0);
        setField(term80690, term80690.getClass(), "labelFor", null);
        setBooleanField(term80690, term80690.getClass(), "isAlignmentXSet", false);
        setFloatField(term80690, term80690.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80690, term80690.getClass(), "isAlignmentYSet", false);
        setFloatField(term80690, term80690.getClass(), "alignmentY", 0.0F);
        setField(term80690, term80690.getClass(), "ui", null);
        setField(term80690, term80690.getClass(), "listenerList", null);
        setField(term80690, term80690.getClass(), "clientProperties", null);
        setField(term80690, term80690.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80690, term80690.getClass(), "autoscrolls", false);
        setField(term80690, term80690.getClass(), "border", null);
        setIntField(term80690, term80690.getClass(), "flags", 0);
        setField(term80690, term80690.getClass(), "inputVerifier", null);
        setBooleanField(term80690, term80690.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80690, term80690.getClass(), "paintingChild", null);
        setField(term80690, term80690.getClass(), "popupMenu", null);
        setField(term80690, term80690.getClass(), "revalidateRunnableScheduled", null);
        setField(term80690, term80690.getClass(), "focusInputMap", null);
        setField(term80690, term80690.getClass(), "ancestorInputMap", null);
        setField(term80690, term80690.getClass(), "windowInputMap", null);
        setField(term80690, term80690.getClass(), "actionMap", null);
        setField(term80690, term80690.getClass(), "aaHint", null);
        setField(term80690, term80690.getClass(), "lcdRenderingHint", null);
        setField(term80690, term80690.getClass(), "component", null);
        setField(term80690, term80690.getClass(), "layoutMgr", null);
        setField(term80690, term80690.getClass(), "dispatcher", null);
        setField(term80690, term80690.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80690, term80690.getClass(), "focusCycleRoot", false);
        setBooleanField(term80690, term80690.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80690, term80690.getClass(), "printingThreads", null);
        setBooleanField(term80690, term80690.getClass(), "printing", false);
        setField(term80690, term80690.getClass(), "containerListener", null);
        setIntField(term80690, term80690.getClass(), "listeningChildren", 0);
        setIntField(term80690, term80690.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80690, term80690.getClass(), "descendantsCount", 0);
        setField(term80690, term80690.getClass(), "preserveBackgroundColor", null);
        setIntField(term80690, term80690.getClass(), "numOfHWComponents", 0);
        setIntField(term80690, term80690.getClass(), "numOfLWComponents", 0);
        setField(term80690, term80690.getClass(), "modalComp", null);
        setField(term80690, term80690.getClass(), "modalAppContext", null);
        setIntField(term80690, term80690.getClass(), "containerSerializedDataVersion", 0);
        setField(term80690, term80690.getClass(), "peer", null);
        setField(term80690, term80690.getClass(), "parent", null);
        setField(term80690, term80690.getClass(), "appContext", null);
        setIntField(term80690, term80690.getClass(), "x", 0);
        setIntField(term80690, term80690.getClass(), "y", 0);
        setIntField(term80690, term80690.getClass(), "width", 0);
        setIntField(term80690, term80690.getClass(), "height", 0);
        setField(term80690, term80690.getClass(), "foreground", null);
        setField(term80690, term80690.getClass(), "background", null);
        setField(term80690, term80690.getClass(), "font", null);
        setField(term80690, term80690.getClass(), "peerFont", null);
        setField(term80690, term80690.getClass(), "cursor", null);
        setField(term80690, term80690.getClass(), "locale", null);
        setField(term80690, term80690.getClass(), "graphicsConfig", null);
        setField(term80690, term80690.getClass(), "bufferStrategy", null);
        setBooleanField(term80690, term80690.getClass(), "ignoreRepaint", false);
        setBooleanField(term80690, term80690.getClass(), "visible", false);
        setBooleanField(term80690, term80690.getClass(), "enabled", false);
        setBooleanField(term80690, term80690.getClass(), "valid", false);
        setField(term80690, term80690.getClass(), "dropTarget", null);
        setField(term80690, term80690.getClass(), "popups", null);
        setField(term80690, term80690.getClass(), "name", null);
        setBooleanField(term80690, term80690.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80690, term80690.getClass(), "focusable", false);
        setIntField(term80690, term80690.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80690, term80690.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80690, term80690.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80690, term80690.getClass(), "acc", null);
        setField(term80690, term80690.getClass(), "minSize", null);
        setBooleanField(term80690, term80690.getClass(), "minSizeSet", false);
        setField(term80690, term80690.getClass(), "prefSize", null);
        setBooleanField(term80690, term80690.getClass(), "prefSizeSet", false);
        setField(term80690, term80690.getClass(), "maxSize", null);
        setBooleanField(term80690, term80690.getClass(), "maxSizeSet", false);
        setField(term80690, term80690.getClass(), "componentOrientation", null);
        setBooleanField(term80690, term80690.getClass(), "newEventsOnly", false);
        setField(term80690, term80690.getClass(), "componentListener", null);
        setField(term80690, term80690.getClass(), "focusListener", null);
        setField(term80690, term80690.getClass(), "hierarchyListener", null);
        setField(term80690, term80690.getClass(), "hierarchyBoundsListener", null);
        setField(term80690, term80690.getClass(), "keyListener", null);
        setField(term80690, term80690.getClass(), "mouseListener", null);
        setField(term80690, term80690.getClass(), "mouseMotionListener", null);
        setField(term80690, term80690.getClass(), "mouseWheelListener", null);
        setField(term80690, term80690.getClass(), "inputMethodListener", null);
        setLongField(term80690, term80690.getClass(), "eventMask", 0L);
        setField(term80690, term80690.getClass(), "changeSupport", null);
        setField(term80690, term80690.getClass(), "objectLock", null);
        setBooleanField(term80690, term80690.getClass(), "isPacked", false);
        setIntField(term80690, term80690.getClass(), "boundsOp", 0);
        setField(term80690, term80690.getClass(), "compoundShape", null);
        setField(term80690, term80690.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80690, term80690.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80690, term80690.getClass(), "backgroundEraseDisabled", false);
        setField(term80690, term80690.getClass(), "eventCache", null);
        setBooleanField(term80690, term80690.getClass(), "coalescingEnabled", false);
        setBooleanField(term80690, term80690.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80690, term80690.getClass(), "componentSerializedDataVersion", 0);
        setField(term80690, term80690.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreferredSize", argTypes, term80690, args);
    }

};


