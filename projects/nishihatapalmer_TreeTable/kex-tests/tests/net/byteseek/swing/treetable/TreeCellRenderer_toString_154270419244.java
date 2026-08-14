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

public class TreeCellRenderer_toString_154270419244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80318;

    public TreeCellRenderer_toString_154270419244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80318 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80318, term80318.getClass(), "treeTableModel", null);
        setField(term80318, term80318.getClass(), "insets", null);
        setIntField(term80318, term80318.getClass(), "pixelsPerLevel", 0);
        setField(term80318, term80318.getClass(), "expandCollapseIconRenderer", null);
        setField(term80318, term80318.getClass(), "expandedIcon", null);
        setField(term80318, term80318.getClass(), "collapsedIcon", null);
        setIntField(term80318, term80318.getClass(), "maxIconWidth", 0);
        setField(term80318, term80318.getClass(), "currentNode", null);
        setField(term80318, term80318.getClass(), "unselectedForeground", null);
        setField(term80318, term80318.getClass(), "unselectedBackground", null);
        setIntField(term80318, term80318.getClass(), "mnemonic", 0);
        setIntField(term80318, term80318.getClass(), "mnemonicIndex", 0);
        setField(term80318, term80318.getClass(), "text", null);
        setField(term80318, term80318.getClass(), "defaultIcon", null);
        setField(term80318, term80318.getClass(), "disabledIcon", null);
        setBooleanField(term80318, term80318.getClass(), "disabledIconSet", false);
        setIntField(term80318, term80318.getClass(), "verticalAlignment", 0);
        setIntField(term80318, term80318.getClass(), "horizontalAlignment", 0);
        setIntField(term80318, term80318.getClass(), "verticalTextPosition", 0);
        setIntField(term80318, term80318.getClass(), "horizontalTextPosition", 0);
        setIntField(term80318, term80318.getClass(), "iconTextGap", 0);
        setField(term80318, term80318.getClass(), "labelFor", null);
        setBooleanField(term80318, term80318.getClass(), "isAlignmentXSet", false);
        setFloatField(term80318, term80318.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80318, term80318.getClass(), "isAlignmentYSet", false);
        setFloatField(term80318, term80318.getClass(), "alignmentY", 0.0F);
        setField(term80318, term80318.getClass(), "ui", null);
        setField(term80318, term80318.getClass(), "listenerList", null);
        setField(term80318, term80318.getClass(), "clientProperties", null);
        setField(term80318, term80318.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80318, term80318.getClass(), "autoscrolls", false);
        setField(term80318, term80318.getClass(), "border", null);
        setIntField(term80318, term80318.getClass(), "flags", 0);
        setField(term80318, term80318.getClass(), "inputVerifier", null);
        setBooleanField(term80318, term80318.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80318, term80318.getClass(), "paintingChild", null);
        setField(term80318, term80318.getClass(), "popupMenu", null);
        setField(term80318, term80318.getClass(), "revalidateRunnableScheduled", null);
        setField(term80318, term80318.getClass(), "focusInputMap", null);
        setField(term80318, term80318.getClass(), "ancestorInputMap", null);
        setField(term80318, term80318.getClass(), "windowInputMap", null);
        setField(term80318, term80318.getClass(), "actionMap", null);
        setField(term80318, term80318.getClass(), "aaHint", null);
        setField(term80318, term80318.getClass(), "lcdRenderingHint", null);
        setField(term80318, term80318.getClass(), "component", null);
        setField(term80318, term80318.getClass(), "layoutMgr", null);
        setField(term80318, term80318.getClass(), "dispatcher", null);
        setField(term80318, term80318.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80318, term80318.getClass(), "focusCycleRoot", false);
        setBooleanField(term80318, term80318.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80318, term80318.getClass(), "printingThreads", null);
        setBooleanField(term80318, term80318.getClass(), "printing", false);
        setField(term80318, term80318.getClass(), "containerListener", null);
        setIntField(term80318, term80318.getClass(), "listeningChildren", 0);
        setIntField(term80318, term80318.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80318, term80318.getClass(), "descendantsCount", 0);
        setField(term80318, term80318.getClass(), "preserveBackgroundColor", null);
        setIntField(term80318, term80318.getClass(), "numOfHWComponents", 0);
        setIntField(term80318, term80318.getClass(), "numOfLWComponents", 0);
        setField(term80318, term80318.getClass(), "modalComp", null);
        setField(term80318, term80318.getClass(), "modalAppContext", null);
        setIntField(term80318, term80318.getClass(), "containerSerializedDataVersion", 0);
        setField(term80318, term80318.getClass(), "peer", null);
        setField(term80318, term80318.getClass(), "parent", null);
        setField(term80318, term80318.getClass(), "appContext", null);
        setIntField(term80318, term80318.getClass(), "x", 0);
        setIntField(term80318, term80318.getClass(), "y", 0);
        setIntField(term80318, term80318.getClass(), "width", 0);
        setIntField(term80318, term80318.getClass(), "height", 0);
        setField(term80318, term80318.getClass(), "foreground", null);
        setField(term80318, term80318.getClass(), "background", null);
        setField(term80318, term80318.getClass(), "font", null);
        setField(term80318, term80318.getClass(), "peerFont", null);
        setField(term80318, term80318.getClass(), "cursor", null);
        setField(term80318, term80318.getClass(), "locale", null);
        setField(term80318, term80318.getClass(), "graphicsConfig", null);
        setField(term80318, term80318.getClass(), "bufferStrategy", null);
        setBooleanField(term80318, term80318.getClass(), "ignoreRepaint", false);
        setBooleanField(term80318, term80318.getClass(), "visible", false);
        setBooleanField(term80318, term80318.getClass(), "enabled", false);
        setBooleanField(term80318, term80318.getClass(), "valid", false);
        setField(term80318, term80318.getClass(), "dropTarget", null);
        setField(term80318, term80318.getClass(), "popups", null);
        setField(term80318, term80318.getClass(), "name", null);
        setBooleanField(term80318, term80318.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80318, term80318.getClass(), "focusable", false);
        setIntField(term80318, term80318.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80318, term80318.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80318, term80318.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80318, term80318.getClass(), "acc", null);
        setField(term80318, term80318.getClass(), "minSize", null);
        setBooleanField(term80318, term80318.getClass(), "minSizeSet", false);
        setField(term80318, term80318.getClass(), "prefSize", null);
        setBooleanField(term80318, term80318.getClass(), "prefSizeSet", false);
        setField(term80318, term80318.getClass(), "maxSize", null);
        setBooleanField(term80318, term80318.getClass(), "maxSizeSet", false);
        setField(term80318, term80318.getClass(), "componentOrientation", null);
        setBooleanField(term80318, term80318.getClass(), "newEventsOnly", false);
        setField(term80318, term80318.getClass(), "componentListener", null);
        setField(term80318, term80318.getClass(), "focusListener", null);
        setField(term80318, term80318.getClass(), "hierarchyListener", null);
        setField(term80318, term80318.getClass(), "hierarchyBoundsListener", null);
        setField(term80318, term80318.getClass(), "keyListener", null);
        setField(term80318, term80318.getClass(), "mouseListener", null);
        setField(term80318, term80318.getClass(), "mouseMotionListener", null);
        setField(term80318, term80318.getClass(), "mouseWheelListener", null);
        setField(term80318, term80318.getClass(), "inputMethodListener", null);
        setLongField(term80318, term80318.getClass(), "eventMask", 0L);
        setField(term80318, term80318.getClass(), "changeSupport", null);
        setField(term80318, term80318.getClass(), "objectLock", null);
        setBooleanField(term80318, term80318.getClass(), "isPacked", false);
        setIntField(term80318, term80318.getClass(), "boundsOp", 0);
        setField(term80318, term80318.getClass(), "compoundShape", null);
        setField(term80318, term80318.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80318, term80318.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80318, term80318.getClass(), "backgroundEraseDisabled", false);
        setField(term80318, term80318.getClass(), "eventCache", null);
        setBooleanField(term80318, term80318.getClass(), "coalescingEnabled", false);
        setBooleanField(term80318, term80318.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80318, term80318.getClass(), "componentSerializedDataVersion", 0);
        setField(term80318, term80318.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term80318, args);
    }

};


