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

public class TreeCellRenderer_setMaxIconWidth_54890430250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80626;

    public TreeCellRenderer_setMaxIconWidth_54890430250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80626 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80626, term80626.getClass(), "treeTableModel", null);
        setField(term80626, term80626.getClass(), "insets", null);
        setIntField(term80626, term80626.getClass(), "pixelsPerLevel", 0);
        setField(term80626, term80626.getClass(), "expandCollapseIconRenderer", null);
        setField(term80626, term80626.getClass(), "expandedIcon", null);
        setField(term80626, term80626.getClass(), "collapsedIcon", null);
        setIntField(term80626, term80626.getClass(), "maxIconWidth", 0);
        setField(term80626, term80626.getClass(), "currentNode", null);
        setField(term80626, term80626.getClass(), "unselectedForeground", null);
        setField(term80626, term80626.getClass(), "unselectedBackground", null);
        setIntField(term80626, term80626.getClass(), "mnemonic", 0);
        setIntField(term80626, term80626.getClass(), "mnemonicIndex", 0);
        setField(term80626, term80626.getClass(), "text", null);
        setField(term80626, term80626.getClass(), "defaultIcon", null);
        setField(term80626, term80626.getClass(), "disabledIcon", null);
        setBooleanField(term80626, term80626.getClass(), "disabledIconSet", false);
        setIntField(term80626, term80626.getClass(), "verticalAlignment", 0);
        setIntField(term80626, term80626.getClass(), "horizontalAlignment", 0);
        setIntField(term80626, term80626.getClass(), "verticalTextPosition", 0);
        setIntField(term80626, term80626.getClass(), "horizontalTextPosition", 0);
        setIntField(term80626, term80626.getClass(), "iconTextGap", 0);
        setField(term80626, term80626.getClass(), "labelFor", null);
        setBooleanField(term80626, term80626.getClass(), "isAlignmentXSet", false);
        setFloatField(term80626, term80626.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80626, term80626.getClass(), "isAlignmentYSet", false);
        setFloatField(term80626, term80626.getClass(), "alignmentY", 0.0F);
        setField(term80626, term80626.getClass(), "ui", null);
        setField(term80626, term80626.getClass(), "listenerList", null);
        setField(term80626, term80626.getClass(), "clientProperties", null);
        setField(term80626, term80626.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80626, term80626.getClass(), "autoscrolls", false);
        setField(term80626, term80626.getClass(), "border", null);
        setIntField(term80626, term80626.getClass(), "flags", 0);
        setField(term80626, term80626.getClass(), "inputVerifier", null);
        setBooleanField(term80626, term80626.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80626, term80626.getClass(), "paintingChild", null);
        setField(term80626, term80626.getClass(), "popupMenu", null);
        setField(term80626, term80626.getClass(), "revalidateRunnableScheduled", null);
        setField(term80626, term80626.getClass(), "focusInputMap", null);
        setField(term80626, term80626.getClass(), "ancestorInputMap", null);
        setField(term80626, term80626.getClass(), "windowInputMap", null);
        setField(term80626, term80626.getClass(), "actionMap", null);
        setField(term80626, term80626.getClass(), "aaHint", null);
        setField(term80626, term80626.getClass(), "lcdRenderingHint", null);
        setField(term80626, term80626.getClass(), "component", null);
        setField(term80626, term80626.getClass(), "layoutMgr", null);
        setField(term80626, term80626.getClass(), "dispatcher", null);
        setField(term80626, term80626.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80626, term80626.getClass(), "focusCycleRoot", false);
        setBooleanField(term80626, term80626.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80626, term80626.getClass(), "printingThreads", null);
        setBooleanField(term80626, term80626.getClass(), "printing", false);
        setField(term80626, term80626.getClass(), "containerListener", null);
        setIntField(term80626, term80626.getClass(), "listeningChildren", 0);
        setIntField(term80626, term80626.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80626, term80626.getClass(), "descendantsCount", 0);
        setField(term80626, term80626.getClass(), "preserveBackgroundColor", null);
        setIntField(term80626, term80626.getClass(), "numOfHWComponents", 0);
        setIntField(term80626, term80626.getClass(), "numOfLWComponents", 0);
        setField(term80626, term80626.getClass(), "modalComp", null);
        setField(term80626, term80626.getClass(), "modalAppContext", null);
        setIntField(term80626, term80626.getClass(), "containerSerializedDataVersion", 0);
        setField(term80626, term80626.getClass(), "peer", null);
        setField(term80626, term80626.getClass(), "parent", null);
        setField(term80626, term80626.getClass(), "appContext", null);
        setIntField(term80626, term80626.getClass(), "x", 0);
        setIntField(term80626, term80626.getClass(), "y", 0);
        setIntField(term80626, term80626.getClass(), "width", 0);
        setIntField(term80626, term80626.getClass(), "height", 0);
        setField(term80626, term80626.getClass(), "foreground", null);
        setField(term80626, term80626.getClass(), "background", null);
        setField(term80626, term80626.getClass(), "font", null);
        setField(term80626, term80626.getClass(), "peerFont", null);
        setField(term80626, term80626.getClass(), "cursor", null);
        setField(term80626, term80626.getClass(), "locale", null);
        setField(term80626, term80626.getClass(), "graphicsConfig", null);
        setField(term80626, term80626.getClass(), "bufferStrategy", null);
        setBooleanField(term80626, term80626.getClass(), "ignoreRepaint", false);
        setBooleanField(term80626, term80626.getClass(), "visible", false);
        setBooleanField(term80626, term80626.getClass(), "enabled", false);
        setBooleanField(term80626, term80626.getClass(), "valid", false);
        setField(term80626, term80626.getClass(), "dropTarget", null);
        setField(term80626, term80626.getClass(), "popups", null);
        setField(term80626, term80626.getClass(), "name", null);
        setBooleanField(term80626, term80626.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80626, term80626.getClass(), "focusable", false);
        setIntField(term80626, term80626.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80626, term80626.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80626, term80626.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80626, term80626.getClass(), "acc", null);
        setField(term80626, term80626.getClass(), "minSize", null);
        setBooleanField(term80626, term80626.getClass(), "minSizeSet", false);
        setField(term80626, term80626.getClass(), "prefSize", null);
        setBooleanField(term80626, term80626.getClass(), "prefSizeSet", false);
        setField(term80626, term80626.getClass(), "maxSize", null);
        setBooleanField(term80626, term80626.getClass(), "maxSizeSet", false);
        setField(term80626, term80626.getClass(), "componentOrientation", null);
        setBooleanField(term80626, term80626.getClass(), "newEventsOnly", false);
        setField(term80626, term80626.getClass(), "componentListener", null);
        setField(term80626, term80626.getClass(), "focusListener", null);
        setField(term80626, term80626.getClass(), "hierarchyListener", null);
        setField(term80626, term80626.getClass(), "hierarchyBoundsListener", null);
        setField(term80626, term80626.getClass(), "keyListener", null);
        setField(term80626, term80626.getClass(), "mouseListener", null);
        setField(term80626, term80626.getClass(), "mouseMotionListener", null);
        setField(term80626, term80626.getClass(), "mouseWheelListener", null);
        setField(term80626, term80626.getClass(), "inputMethodListener", null);
        setLongField(term80626, term80626.getClass(), "eventMask", 0L);
        setField(term80626, term80626.getClass(), "changeSupport", null);
        setField(term80626, term80626.getClass(), "objectLock", null);
        setBooleanField(term80626, term80626.getClass(), "isPacked", false);
        setIntField(term80626, term80626.getClass(), "boundsOp", 0);
        setField(term80626, term80626.getClass(), "compoundShape", null);
        setField(term80626, term80626.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80626, term80626.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80626, term80626.getClass(), "backgroundEraseDisabled", false);
        setField(term80626, term80626.getClass(), "eventCache", null);
        setBooleanField(term80626, term80626.getClass(), "coalescingEnabled", false);
        setBooleanField(term80626, term80626.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80626, term80626.getClass(), "componentSerializedDataVersion", 0);
        setField(term80626, term80626.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setMaxIconWidth", argTypes, term80626, args);
    }

};


