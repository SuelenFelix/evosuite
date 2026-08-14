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
     Object term80008;

    public TreeCellRenderer_getPreferredSize_156402918738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80008 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80008, term80008.getClass(), "treeTableModel", null);
        setField(term80008, term80008.getClass(), "insets", null);
        setIntField(term80008, term80008.getClass(), "pixelsPerLevel", 0);
        setField(term80008, term80008.getClass(), "expandCollapseIconRenderer", null);
        setField(term80008, term80008.getClass(), "expandedIcon", null);
        setField(term80008, term80008.getClass(), "collapsedIcon", null);
        setIntField(term80008, term80008.getClass(), "maxIconWidth", 0);
        setField(term80008, term80008.getClass(), "currentNode", null);
        setField(term80008, term80008.getClass(), "unselectedForeground", null);
        setField(term80008, term80008.getClass(), "unselectedBackground", null);
        setIntField(term80008, term80008.getClass(), "mnemonic", 0);
        setIntField(term80008, term80008.getClass(), "mnemonicIndex", 0);
        setField(term80008, term80008.getClass(), "text", null);
        setField(term80008, term80008.getClass(), "defaultIcon", null);
        setField(term80008, term80008.getClass(), "disabledIcon", null);
        setBooleanField(term80008, term80008.getClass(), "disabledIconSet", false);
        setIntField(term80008, term80008.getClass(), "verticalAlignment", 0);
        setIntField(term80008, term80008.getClass(), "horizontalAlignment", 0);
        setIntField(term80008, term80008.getClass(), "verticalTextPosition", 0);
        setIntField(term80008, term80008.getClass(), "horizontalTextPosition", 0);
        setIntField(term80008, term80008.getClass(), "iconTextGap", 0);
        setField(term80008, term80008.getClass(), "labelFor", null);
        setBooleanField(term80008, term80008.getClass(), "isAlignmentXSet", false);
        setFloatField(term80008, term80008.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80008, term80008.getClass(), "isAlignmentYSet", false);
        setFloatField(term80008, term80008.getClass(), "alignmentY", 0.0F);
        setField(term80008, term80008.getClass(), "ui", null);
        setField(term80008, term80008.getClass(), "listenerList", null);
        setField(term80008, term80008.getClass(), "clientProperties", null);
        setField(term80008, term80008.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80008, term80008.getClass(), "autoscrolls", false);
        setField(term80008, term80008.getClass(), "border", null);
        setIntField(term80008, term80008.getClass(), "flags", 0);
        setField(term80008, term80008.getClass(), "inputVerifier", null);
        setBooleanField(term80008, term80008.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80008, term80008.getClass(), "paintingChild", null);
        setField(term80008, term80008.getClass(), "popupMenu", null);
        setField(term80008, term80008.getClass(), "revalidateRunnableScheduled", null);
        setField(term80008, term80008.getClass(), "focusInputMap", null);
        setField(term80008, term80008.getClass(), "ancestorInputMap", null);
        setField(term80008, term80008.getClass(), "windowInputMap", null);
        setField(term80008, term80008.getClass(), "actionMap", null);
        setField(term80008, term80008.getClass(), "aaHint", null);
        setField(term80008, term80008.getClass(), "lcdRenderingHint", null);
        setField(term80008, term80008.getClass(), "component", null);
        setField(term80008, term80008.getClass(), "layoutMgr", null);
        setField(term80008, term80008.getClass(), "dispatcher", null);
        setField(term80008, term80008.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80008, term80008.getClass(), "focusCycleRoot", false);
        setBooleanField(term80008, term80008.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80008, term80008.getClass(), "printingThreads", null);
        setBooleanField(term80008, term80008.getClass(), "printing", false);
        setField(term80008, term80008.getClass(), "containerListener", null);
        setIntField(term80008, term80008.getClass(), "listeningChildren", 0);
        setIntField(term80008, term80008.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80008, term80008.getClass(), "descendantsCount", 0);
        setField(term80008, term80008.getClass(), "preserveBackgroundColor", null);
        setIntField(term80008, term80008.getClass(), "numOfHWComponents", 0);
        setIntField(term80008, term80008.getClass(), "numOfLWComponents", 0);
        setField(term80008, term80008.getClass(), "modalComp", null);
        setField(term80008, term80008.getClass(), "modalAppContext", null);
        setIntField(term80008, term80008.getClass(), "containerSerializedDataVersion", 0);
        setField(term80008, term80008.getClass(), "peer", null);
        setField(term80008, term80008.getClass(), "parent", null);
        setField(term80008, term80008.getClass(), "appContext", null);
        setIntField(term80008, term80008.getClass(), "x", 0);
        setIntField(term80008, term80008.getClass(), "y", 0);
        setIntField(term80008, term80008.getClass(), "width", 0);
        setIntField(term80008, term80008.getClass(), "height", 0);
        setField(term80008, term80008.getClass(), "foreground", null);
        setField(term80008, term80008.getClass(), "background", null);
        setField(term80008, term80008.getClass(), "font", null);
        setField(term80008, term80008.getClass(), "peerFont", null);
        setField(term80008, term80008.getClass(), "cursor", null);
        setField(term80008, term80008.getClass(), "locale", null);
        setField(term80008, term80008.getClass(), "graphicsConfig", null);
        setField(term80008, term80008.getClass(), "bufferStrategy", null);
        setBooleanField(term80008, term80008.getClass(), "ignoreRepaint", false);
        setBooleanField(term80008, term80008.getClass(), "visible", false);
        setBooleanField(term80008, term80008.getClass(), "enabled", false);
        setBooleanField(term80008, term80008.getClass(), "valid", false);
        setField(term80008, term80008.getClass(), "dropTarget", null);
        setField(term80008, term80008.getClass(), "popups", null);
        setField(term80008, term80008.getClass(), "name", null);
        setBooleanField(term80008, term80008.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80008, term80008.getClass(), "focusable", false);
        setIntField(term80008, term80008.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80008, term80008.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80008, term80008.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80008, term80008.getClass(), "acc", null);
        setField(term80008, term80008.getClass(), "minSize", null);
        setBooleanField(term80008, term80008.getClass(), "minSizeSet", false);
        setField(term80008, term80008.getClass(), "prefSize", null);
        setBooleanField(term80008, term80008.getClass(), "prefSizeSet", false);
        setField(term80008, term80008.getClass(), "maxSize", null);
        setBooleanField(term80008, term80008.getClass(), "maxSizeSet", false);
        setField(term80008, term80008.getClass(), "componentOrientation", null);
        setBooleanField(term80008, term80008.getClass(), "newEventsOnly", false);
        setField(term80008, term80008.getClass(), "componentListener", null);
        setField(term80008, term80008.getClass(), "focusListener", null);
        setField(term80008, term80008.getClass(), "hierarchyListener", null);
        setField(term80008, term80008.getClass(), "hierarchyBoundsListener", null);
        setField(term80008, term80008.getClass(), "keyListener", null);
        setField(term80008, term80008.getClass(), "mouseListener", null);
        setField(term80008, term80008.getClass(), "mouseMotionListener", null);
        setField(term80008, term80008.getClass(), "mouseWheelListener", null);
        setField(term80008, term80008.getClass(), "inputMethodListener", null);
        setLongField(term80008, term80008.getClass(), "eventMask", 0L);
        setField(term80008, term80008.getClass(), "changeSupport", null);
        setField(term80008, term80008.getClass(), "objectLock", null);
        setBooleanField(term80008, term80008.getClass(), "isPacked", false);
        setIntField(term80008, term80008.getClass(), "boundsOp", 0);
        setField(term80008, term80008.getClass(), "compoundShape", null);
        setField(term80008, term80008.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80008, term80008.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80008, term80008.getClass(), "backgroundEraseDisabled", false);
        setField(term80008, term80008.getClass(), "eventCache", null);
        setBooleanField(term80008, term80008.getClass(), "coalescingEnabled", false);
        setBooleanField(term80008, term80008.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80008, term80008.getClass(), "componentSerializedDataVersion", 0);
        setField(term80008, term80008.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreferredSize", argTypes, term80008, args);
    }

};


