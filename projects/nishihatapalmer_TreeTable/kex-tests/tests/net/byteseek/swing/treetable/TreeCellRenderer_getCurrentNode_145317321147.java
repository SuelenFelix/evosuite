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
     Object term80473;

    public TreeCellRenderer_getCurrentNode_145317321147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80473 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80473, term80473.getClass(), "treeTableModel", null);
        setField(term80473, term80473.getClass(), "insets", null);
        setIntField(term80473, term80473.getClass(), "pixelsPerLevel", 0);
        setField(term80473, term80473.getClass(), "expandCollapseIconRenderer", null);
        setField(term80473, term80473.getClass(), "expandedIcon", null);
        setField(term80473, term80473.getClass(), "collapsedIcon", null);
        setIntField(term80473, term80473.getClass(), "maxIconWidth", 0);
        setField(term80473, term80473.getClass(), "currentNode", null);
        setField(term80473, term80473.getClass(), "unselectedForeground", null);
        setField(term80473, term80473.getClass(), "unselectedBackground", null);
        setIntField(term80473, term80473.getClass(), "mnemonic", 0);
        setIntField(term80473, term80473.getClass(), "mnemonicIndex", 0);
        setField(term80473, term80473.getClass(), "text", null);
        setField(term80473, term80473.getClass(), "defaultIcon", null);
        setField(term80473, term80473.getClass(), "disabledIcon", null);
        setBooleanField(term80473, term80473.getClass(), "disabledIconSet", false);
        setIntField(term80473, term80473.getClass(), "verticalAlignment", 0);
        setIntField(term80473, term80473.getClass(), "horizontalAlignment", 0);
        setIntField(term80473, term80473.getClass(), "verticalTextPosition", 0);
        setIntField(term80473, term80473.getClass(), "horizontalTextPosition", 0);
        setIntField(term80473, term80473.getClass(), "iconTextGap", 0);
        setField(term80473, term80473.getClass(), "labelFor", null);
        setBooleanField(term80473, term80473.getClass(), "isAlignmentXSet", false);
        setFloatField(term80473, term80473.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80473, term80473.getClass(), "isAlignmentYSet", false);
        setFloatField(term80473, term80473.getClass(), "alignmentY", 0.0F);
        setField(term80473, term80473.getClass(), "ui", null);
        setField(term80473, term80473.getClass(), "listenerList", null);
        setField(term80473, term80473.getClass(), "clientProperties", null);
        setField(term80473, term80473.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80473, term80473.getClass(), "autoscrolls", false);
        setField(term80473, term80473.getClass(), "border", null);
        setIntField(term80473, term80473.getClass(), "flags", 0);
        setField(term80473, term80473.getClass(), "inputVerifier", null);
        setBooleanField(term80473, term80473.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80473, term80473.getClass(), "paintingChild", null);
        setField(term80473, term80473.getClass(), "popupMenu", null);
        setField(term80473, term80473.getClass(), "revalidateRunnableScheduled", null);
        setField(term80473, term80473.getClass(), "focusInputMap", null);
        setField(term80473, term80473.getClass(), "ancestorInputMap", null);
        setField(term80473, term80473.getClass(), "windowInputMap", null);
        setField(term80473, term80473.getClass(), "actionMap", null);
        setField(term80473, term80473.getClass(), "aaHint", null);
        setField(term80473, term80473.getClass(), "lcdRenderingHint", null);
        setField(term80473, term80473.getClass(), "component", null);
        setField(term80473, term80473.getClass(), "layoutMgr", null);
        setField(term80473, term80473.getClass(), "dispatcher", null);
        setField(term80473, term80473.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80473, term80473.getClass(), "focusCycleRoot", false);
        setBooleanField(term80473, term80473.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80473, term80473.getClass(), "printingThreads", null);
        setBooleanField(term80473, term80473.getClass(), "printing", false);
        setField(term80473, term80473.getClass(), "containerListener", null);
        setIntField(term80473, term80473.getClass(), "listeningChildren", 0);
        setIntField(term80473, term80473.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80473, term80473.getClass(), "descendantsCount", 0);
        setField(term80473, term80473.getClass(), "preserveBackgroundColor", null);
        setIntField(term80473, term80473.getClass(), "numOfHWComponents", 0);
        setIntField(term80473, term80473.getClass(), "numOfLWComponents", 0);
        setField(term80473, term80473.getClass(), "modalComp", null);
        setField(term80473, term80473.getClass(), "modalAppContext", null);
        setIntField(term80473, term80473.getClass(), "containerSerializedDataVersion", 0);
        setField(term80473, term80473.getClass(), "peer", null);
        setField(term80473, term80473.getClass(), "parent", null);
        setField(term80473, term80473.getClass(), "appContext", null);
        setIntField(term80473, term80473.getClass(), "x", 0);
        setIntField(term80473, term80473.getClass(), "y", 0);
        setIntField(term80473, term80473.getClass(), "width", 0);
        setIntField(term80473, term80473.getClass(), "height", 0);
        setField(term80473, term80473.getClass(), "foreground", null);
        setField(term80473, term80473.getClass(), "background", null);
        setField(term80473, term80473.getClass(), "font", null);
        setField(term80473, term80473.getClass(), "peerFont", null);
        setField(term80473, term80473.getClass(), "cursor", null);
        setField(term80473, term80473.getClass(), "locale", null);
        setField(term80473, term80473.getClass(), "graphicsConfig", null);
        setField(term80473, term80473.getClass(), "bufferStrategy", null);
        setBooleanField(term80473, term80473.getClass(), "ignoreRepaint", false);
        setBooleanField(term80473, term80473.getClass(), "visible", false);
        setBooleanField(term80473, term80473.getClass(), "enabled", false);
        setBooleanField(term80473, term80473.getClass(), "valid", false);
        setField(term80473, term80473.getClass(), "dropTarget", null);
        setField(term80473, term80473.getClass(), "popups", null);
        setField(term80473, term80473.getClass(), "name", null);
        setBooleanField(term80473, term80473.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80473, term80473.getClass(), "focusable", false);
        setIntField(term80473, term80473.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80473, term80473.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80473, term80473.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80473, term80473.getClass(), "acc", null);
        setField(term80473, term80473.getClass(), "minSize", null);
        setBooleanField(term80473, term80473.getClass(), "minSizeSet", false);
        setField(term80473, term80473.getClass(), "prefSize", null);
        setBooleanField(term80473, term80473.getClass(), "prefSizeSet", false);
        setField(term80473, term80473.getClass(), "maxSize", null);
        setBooleanField(term80473, term80473.getClass(), "maxSizeSet", false);
        setField(term80473, term80473.getClass(), "componentOrientation", null);
        setBooleanField(term80473, term80473.getClass(), "newEventsOnly", false);
        setField(term80473, term80473.getClass(), "componentListener", null);
        setField(term80473, term80473.getClass(), "focusListener", null);
        setField(term80473, term80473.getClass(), "hierarchyListener", null);
        setField(term80473, term80473.getClass(), "hierarchyBoundsListener", null);
        setField(term80473, term80473.getClass(), "keyListener", null);
        setField(term80473, term80473.getClass(), "mouseListener", null);
        setField(term80473, term80473.getClass(), "mouseMotionListener", null);
        setField(term80473, term80473.getClass(), "mouseWheelListener", null);
        setField(term80473, term80473.getClass(), "inputMethodListener", null);
        setLongField(term80473, term80473.getClass(), "eventMask", 0L);
        setField(term80473, term80473.getClass(), "changeSupport", null);
        setField(term80473, term80473.getClass(), "objectLock", null);
        setBooleanField(term80473, term80473.getClass(), "isPacked", false);
        setIntField(term80473, term80473.getClass(), "boundsOp", 0);
        setField(term80473, term80473.getClass(), "compoundShape", null);
        setField(term80473, term80473.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80473, term80473.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80473, term80473.getClass(), "backgroundEraseDisabled", false);
        setField(term80473, term80473.getClass(), "eventCache", null);
        setBooleanField(term80473, term80473.getClass(), "coalescingEnabled", false);
        setBooleanField(term80473, term80473.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80473, term80473.getClass(), "componentSerializedDataVersion", 0);
        setField(term80473, term80473.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentNode", argTypes, term80473, args);
    }

};


