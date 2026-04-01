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
     Object term81000;

    public TreeCellRenderer_toString_154270419244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81000 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81000, term81000.getClass(), "treeTableModel", null);
        setField(term81000, term81000.getClass(), "insets", null);
        setIntField(term81000, term81000.getClass(), "pixelsPerLevel", 0);
        setField(term81000, term81000.getClass(), "expandCollapseIconRenderer", null);
        setField(term81000, term81000.getClass(), "expandedIcon", null);
        setField(term81000, term81000.getClass(), "collapsedIcon", null);
        setIntField(term81000, term81000.getClass(), "maxIconWidth", 0);
        setField(term81000, term81000.getClass(), "currentNode", null);
        setField(term81000, term81000.getClass(), "unselectedForeground", null);
        setField(term81000, term81000.getClass(), "unselectedBackground", null);
        setIntField(term81000, term81000.getClass(), "mnemonic", 0);
        setIntField(term81000, term81000.getClass(), "mnemonicIndex", 0);
        setField(term81000, term81000.getClass(), "text", null);
        setField(term81000, term81000.getClass(), "defaultIcon", null);
        setField(term81000, term81000.getClass(), "disabledIcon", null);
        setBooleanField(term81000, term81000.getClass(), "disabledIconSet", false);
        setIntField(term81000, term81000.getClass(), "verticalAlignment", 0);
        setIntField(term81000, term81000.getClass(), "horizontalAlignment", 0);
        setIntField(term81000, term81000.getClass(), "verticalTextPosition", 0);
        setIntField(term81000, term81000.getClass(), "horizontalTextPosition", 0);
        setIntField(term81000, term81000.getClass(), "iconTextGap", 0);
        setField(term81000, term81000.getClass(), "labelFor", null);
        setBooleanField(term81000, term81000.getClass(), "isAlignmentXSet", false);
        setFloatField(term81000, term81000.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81000, term81000.getClass(), "isAlignmentYSet", false);
        setFloatField(term81000, term81000.getClass(), "alignmentY", 0.0F);
        setField(term81000, term81000.getClass(), "ui", null);
        setField(term81000, term81000.getClass(), "listenerList", null);
        setField(term81000, term81000.getClass(), "clientProperties", null);
        setField(term81000, term81000.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81000, term81000.getClass(), "autoscrolls", false);
        setField(term81000, term81000.getClass(), "border", null);
        setIntField(term81000, term81000.getClass(), "flags", 0);
        setField(term81000, term81000.getClass(), "inputVerifier", null);
        setBooleanField(term81000, term81000.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81000, term81000.getClass(), "paintingChild", null);
        setField(term81000, term81000.getClass(), "popupMenu", null);
        setField(term81000, term81000.getClass(), "revalidateRunnableScheduled", null);
        setField(term81000, term81000.getClass(), "focusInputMap", null);
        setField(term81000, term81000.getClass(), "ancestorInputMap", null);
        setField(term81000, term81000.getClass(), "windowInputMap", null);
        setField(term81000, term81000.getClass(), "actionMap", null);
        setField(term81000, term81000.getClass(), "aaHint", null);
        setField(term81000, term81000.getClass(), "lcdRenderingHint", null);
        setField(term81000, term81000.getClass(), "component", null);
        setField(term81000, term81000.getClass(), "layoutMgr", null);
        setField(term81000, term81000.getClass(), "dispatcher", null);
        setField(term81000, term81000.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81000, term81000.getClass(), "focusCycleRoot", false);
        setBooleanField(term81000, term81000.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81000, term81000.getClass(), "printingThreads", null);
        setBooleanField(term81000, term81000.getClass(), "printing", false);
        setField(term81000, term81000.getClass(), "containerListener", null);
        setIntField(term81000, term81000.getClass(), "listeningChildren", 0);
        setIntField(term81000, term81000.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81000, term81000.getClass(), "descendantsCount", 0);
        setField(term81000, term81000.getClass(), "preserveBackgroundColor", null);
        setIntField(term81000, term81000.getClass(), "numOfHWComponents", 0);
        setIntField(term81000, term81000.getClass(), "numOfLWComponents", 0);
        setField(term81000, term81000.getClass(), "modalComp", null);
        setField(term81000, term81000.getClass(), "modalAppContext", null);
        setIntField(term81000, term81000.getClass(), "containerSerializedDataVersion", 0);
        setField(term81000, term81000.getClass(), "peer", null);
        setField(term81000, term81000.getClass(), "parent", null);
        setField(term81000, term81000.getClass(), "appContext", null);
        setIntField(term81000, term81000.getClass(), "x", 0);
        setIntField(term81000, term81000.getClass(), "y", 0);
        setIntField(term81000, term81000.getClass(), "width", 0);
        setIntField(term81000, term81000.getClass(), "height", 0);
        setField(term81000, term81000.getClass(), "foreground", null);
        setField(term81000, term81000.getClass(), "background", null);
        setField(term81000, term81000.getClass(), "font", null);
        setField(term81000, term81000.getClass(), "peerFont", null);
        setField(term81000, term81000.getClass(), "cursor", null);
        setField(term81000, term81000.getClass(), "locale", null);
        setField(term81000, term81000.getClass(), "graphicsConfig", null);
        setField(term81000, term81000.getClass(), "bufferStrategy", null);
        setBooleanField(term81000, term81000.getClass(), "ignoreRepaint", false);
        setBooleanField(term81000, term81000.getClass(), "visible", false);
        setBooleanField(term81000, term81000.getClass(), "enabled", false);
        setBooleanField(term81000, term81000.getClass(), "valid", false);
        setField(term81000, term81000.getClass(), "dropTarget", null);
        setField(term81000, term81000.getClass(), "popups", null);
        setField(term81000, term81000.getClass(), "name", null);
        setBooleanField(term81000, term81000.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81000, term81000.getClass(), "focusable", false);
        setIntField(term81000, term81000.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81000, term81000.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81000, term81000.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81000, term81000.getClass(), "acc", null);
        setField(term81000, term81000.getClass(), "minSize", null);
        setBooleanField(term81000, term81000.getClass(), "minSizeSet", false);
        setField(term81000, term81000.getClass(), "prefSize", null);
        setBooleanField(term81000, term81000.getClass(), "prefSizeSet", false);
        setField(term81000, term81000.getClass(), "maxSize", null);
        setBooleanField(term81000, term81000.getClass(), "maxSizeSet", false);
        setField(term81000, term81000.getClass(), "componentOrientation", null);
        setBooleanField(term81000, term81000.getClass(), "newEventsOnly", false);
        setField(term81000, term81000.getClass(), "componentListener", null);
        setField(term81000, term81000.getClass(), "focusListener", null);
        setField(term81000, term81000.getClass(), "hierarchyListener", null);
        setField(term81000, term81000.getClass(), "hierarchyBoundsListener", null);
        setField(term81000, term81000.getClass(), "keyListener", null);
        setField(term81000, term81000.getClass(), "mouseListener", null);
        setField(term81000, term81000.getClass(), "mouseMotionListener", null);
        setField(term81000, term81000.getClass(), "mouseWheelListener", null);
        setField(term81000, term81000.getClass(), "inputMethodListener", null);
        setLongField(term81000, term81000.getClass(), "eventMask", 0L);
        setField(term81000, term81000.getClass(), "changeSupport", null);
        setField(term81000, term81000.getClass(), "objectLock", null);
        setBooleanField(term81000, term81000.getClass(), "isPacked", false);
        setIntField(term81000, term81000.getClass(), "boundsOp", 0);
        setField(term81000, term81000.getClass(), "compoundShape", null);
        setField(term81000, term81000.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81000, term81000.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81000, term81000.getClass(), "backgroundEraseDisabled", false);
        setField(term81000, term81000.getClass(), "eventCache", null);
        setBooleanField(term81000, term81000.getClass(), "coalescingEnabled", false);
        setBooleanField(term81000, term81000.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81000, term81000.getClass(), "componentSerializedDataVersion", 0);
        setField(term81000, term81000.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term81000, args);
    }

};


