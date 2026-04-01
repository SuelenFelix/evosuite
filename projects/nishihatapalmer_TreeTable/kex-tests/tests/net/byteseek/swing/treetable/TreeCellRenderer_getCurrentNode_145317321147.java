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

public class TreeCellRenderer_getCurrentNode_145317321147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81155;

    public TreeCellRenderer_getCurrentNode_145317321147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81155 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81155, term81155.getClass(), "treeTableModel", null);
        setField(term81155, term81155.getClass(), "insets", null);
        setIntField(term81155, term81155.getClass(), "pixelsPerLevel", 0);
        setField(term81155, term81155.getClass(), "expandCollapseIconRenderer", null);
        setField(term81155, term81155.getClass(), "expandedIcon", null);
        setField(term81155, term81155.getClass(), "collapsedIcon", null);
        setIntField(term81155, term81155.getClass(), "maxIconWidth", 0);
        setField(term81155, term81155.getClass(), "currentNode", null);
        setField(term81155, term81155.getClass(), "unselectedForeground", null);
        setField(term81155, term81155.getClass(), "unselectedBackground", null);
        setIntField(term81155, term81155.getClass(), "mnemonic", 0);
        setIntField(term81155, term81155.getClass(), "mnemonicIndex", 0);
        setField(term81155, term81155.getClass(), "text", null);
        setField(term81155, term81155.getClass(), "defaultIcon", null);
        setField(term81155, term81155.getClass(), "disabledIcon", null);
        setBooleanField(term81155, term81155.getClass(), "disabledIconSet", false);
        setIntField(term81155, term81155.getClass(), "verticalAlignment", 0);
        setIntField(term81155, term81155.getClass(), "horizontalAlignment", 0);
        setIntField(term81155, term81155.getClass(), "verticalTextPosition", 0);
        setIntField(term81155, term81155.getClass(), "horizontalTextPosition", 0);
        setIntField(term81155, term81155.getClass(), "iconTextGap", 0);
        setField(term81155, term81155.getClass(), "labelFor", null);
        setBooleanField(term81155, term81155.getClass(), "isAlignmentXSet", false);
        setFloatField(term81155, term81155.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81155, term81155.getClass(), "isAlignmentYSet", false);
        setFloatField(term81155, term81155.getClass(), "alignmentY", 0.0F);
        setField(term81155, term81155.getClass(), "ui", null);
        setField(term81155, term81155.getClass(), "listenerList", null);
        setField(term81155, term81155.getClass(), "clientProperties", null);
        setField(term81155, term81155.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81155, term81155.getClass(), "autoscrolls", false);
        setField(term81155, term81155.getClass(), "border", null);
        setIntField(term81155, term81155.getClass(), "flags", 0);
        setField(term81155, term81155.getClass(), "inputVerifier", null);
        setBooleanField(term81155, term81155.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81155, term81155.getClass(), "paintingChild", null);
        setField(term81155, term81155.getClass(), "popupMenu", null);
        setField(term81155, term81155.getClass(), "revalidateRunnableScheduled", null);
        setField(term81155, term81155.getClass(), "focusInputMap", null);
        setField(term81155, term81155.getClass(), "ancestorInputMap", null);
        setField(term81155, term81155.getClass(), "windowInputMap", null);
        setField(term81155, term81155.getClass(), "actionMap", null);
        setField(term81155, term81155.getClass(), "aaHint", null);
        setField(term81155, term81155.getClass(), "lcdRenderingHint", null);
        setField(term81155, term81155.getClass(), "component", null);
        setField(term81155, term81155.getClass(), "layoutMgr", null);
        setField(term81155, term81155.getClass(), "dispatcher", null);
        setField(term81155, term81155.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81155, term81155.getClass(), "focusCycleRoot", false);
        setBooleanField(term81155, term81155.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81155, term81155.getClass(), "printingThreads", null);
        setBooleanField(term81155, term81155.getClass(), "printing", false);
        setField(term81155, term81155.getClass(), "containerListener", null);
        setIntField(term81155, term81155.getClass(), "listeningChildren", 0);
        setIntField(term81155, term81155.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81155, term81155.getClass(), "descendantsCount", 0);
        setField(term81155, term81155.getClass(), "preserveBackgroundColor", null);
        setIntField(term81155, term81155.getClass(), "numOfHWComponents", 0);
        setIntField(term81155, term81155.getClass(), "numOfLWComponents", 0);
        setField(term81155, term81155.getClass(), "modalComp", null);
        setField(term81155, term81155.getClass(), "modalAppContext", null);
        setIntField(term81155, term81155.getClass(), "containerSerializedDataVersion", 0);
        setField(term81155, term81155.getClass(), "peer", null);
        setField(term81155, term81155.getClass(), "parent", null);
        setField(term81155, term81155.getClass(), "appContext", null);
        setIntField(term81155, term81155.getClass(), "x", 0);
        setIntField(term81155, term81155.getClass(), "y", 0);
        setIntField(term81155, term81155.getClass(), "width", 0);
        setIntField(term81155, term81155.getClass(), "height", 0);
        setField(term81155, term81155.getClass(), "foreground", null);
        setField(term81155, term81155.getClass(), "background", null);
        setField(term81155, term81155.getClass(), "font", null);
        setField(term81155, term81155.getClass(), "peerFont", null);
        setField(term81155, term81155.getClass(), "cursor", null);
        setField(term81155, term81155.getClass(), "locale", null);
        setField(term81155, term81155.getClass(), "graphicsConfig", null);
        setField(term81155, term81155.getClass(), "bufferStrategy", null);
        setBooleanField(term81155, term81155.getClass(), "ignoreRepaint", false);
        setBooleanField(term81155, term81155.getClass(), "visible", false);
        setBooleanField(term81155, term81155.getClass(), "enabled", false);
        setBooleanField(term81155, term81155.getClass(), "valid", false);
        setField(term81155, term81155.getClass(), "dropTarget", null);
        setField(term81155, term81155.getClass(), "popups", null);
        setField(term81155, term81155.getClass(), "name", null);
        setBooleanField(term81155, term81155.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81155, term81155.getClass(), "focusable", false);
        setIntField(term81155, term81155.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81155, term81155.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81155, term81155.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81155, term81155.getClass(), "acc", null);
        setField(term81155, term81155.getClass(), "minSize", null);
        setBooleanField(term81155, term81155.getClass(), "minSizeSet", false);
        setField(term81155, term81155.getClass(), "prefSize", null);
        setBooleanField(term81155, term81155.getClass(), "prefSizeSet", false);
        setField(term81155, term81155.getClass(), "maxSize", null);
        setBooleanField(term81155, term81155.getClass(), "maxSizeSet", false);
        setField(term81155, term81155.getClass(), "componentOrientation", null);
        setBooleanField(term81155, term81155.getClass(), "newEventsOnly", false);
        setField(term81155, term81155.getClass(), "componentListener", null);
        setField(term81155, term81155.getClass(), "focusListener", null);
        setField(term81155, term81155.getClass(), "hierarchyListener", null);
        setField(term81155, term81155.getClass(), "hierarchyBoundsListener", null);
        setField(term81155, term81155.getClass(), "keyListener", null);
        setField(term81155, term81155.getClass(), "mouseListener", null);
        setField(term81155, term81155.getClass(), "mouseMotionListener", null);
        setField(term81155, term81155.getClass(), "mouseWheelListener", null);
        setField(term81155, term81155.getClass(), "inputMethodListener", null);
        setLongField(term81155, term81155.getClass(), "eventMask", 0L);
        setField(term81155, term81155.getClass(), "changeSupport", null);
        setField(term81155, term81155.getClass(), "objectLock", null);
        setBooleanField(term81155, term81155.getClass(), "isPacked", false);
        setIntField(term81155, term81155.getClass(), "boundsOp", 0);
        setField(term81155, term81155.getClass(), "compoundShape", null);
        setField(term81155, term81155.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81155, term81155.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81155, term81155.getClass(), "backgroundEraseDisabled", false);
        setField(term81155, term81155.getClass(), "eventCache", null);
        setBooleanField(term81155, term81155.getClass(), "coalescingEnabled", false);
        setBooleanField(term81155, term81155.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81155, term81155.getClass(), "componentSerializedDataVersion", 0);
        setField(term81155, term81155.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentNode", argTypes, term81155, args);
    }

};


