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
     Object term81308;

    public TreeCellRenderer_setMaxIconWidth_54890430250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81308 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81308, term81308.getClass(), "treeTableModel", null);
        setField(term81308, term81308.getClass(), "insets", null);
        setIntField(term81308, term81308.getClass(), "pixelsPerLevel", 0);
        setField(term81308, term81308.getClass(), "expandCollapseIconRenderer", null);
        setField(term81308, term81308.getClass(), "expandedIcon", null);
        setField(term81308, term81308.getClass(), "collapsedIcon", null);
        setIntField(term81308, term81308.getClass(), "maxIconWidth", 0);
        setField(term81308, term81308.getClass(), "currentNode", null);
        setField(term81308, term81308.getClass(), "unselectedForeground", null);
        setField(term81308, term81308.getClass(), "unselectedBackground", null);
        setIntField(term81308, term81308.getClass(), "mnemonic", 0);
        setIntField(term81308, term81308.getClass(), "mnemonicIndex", 0);
        setField(term81308, term81308.getClass(), "text", null);
        setField(term81308, term81308.getClass(), "defaultIcon", null);
        setField(term81308, term81308.getClass(), "disabledIcon", null);
        setBooleanField(term81308, term81308.getClass(), "disabledIconSet", false);
        setIntField(term81308, term81308.getClass(), "verticalAlignment", 0);
        setIntField(term81308, term81308.getClass(), "horizontalAlignment", 0);
        setIntField(term81308, term81308.getClass(), "verticalTextPosition", 0);
        setIntField(term81308, term81308.getClass(), "horizontalTextPosition", 0);
        setIntField(term81308, term81308.getClass(), "iconTextGap", 0);
        setField(term81308, term81308.getClass(), "labelFor", null);
        setBooleanField(term81308, term81308.getClass(), "isAlignmentXSet", false);
        setFloatField(term81308, term81308.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81308, term81308.getClass(), "isAlignmentYSet", false);
        setFloatField(term81308, term81308.getClass(), "alignmentY", 0.0F);
        setField(term81308, term81308.getClass(), "ui", null);
        setField(term81308, term81308.getClass(), "listenerList", null);
        setField(term81308, term81308.getClass(), "clientProperties", null);
        setField(term81308, term81308.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81308, term81308.getClass(), "autoscrolls", false);
        setField(term81308, term81308.getClass(), "border", null);
        setIntField(term81308, term81308.getClass(), "flags", 0);
        setField(term81308, term81308.getClass(), "inputVerifier", null);
        setBooleanField(term81308, term81308.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81308, term81308.getClass(), "paintingChild", null);
        setField(term81308, term81308.getClass(), "popupMenu", null);
        setField(term81308, term81308.getClass(), "revalidateRunnableScheduled", null);
        setField(term81308, term81308.getClass(), "focusInputMap", null);
        setField(term81308, term81308.getClass(), "ancestorInputMap", null);
        setField(term81308, term81308.getClass(), "windowInputMap", null);
        setField(term81308, term81308.getClass(), "actionMap", null);
        setField(term81308, term81308.getClass(), "aaHint", null);
        setField(term81308, term81308.getClass(), "lcdRenderingHint", null);
        setField(term81308, term81308.getClass(), "component", null);
        setField(term81308, term81308.getClass(), "layoutMgr", null);
        setField(term81308, term81308.getClass(), "dispatcher", null);
        setField(term81308, term81308.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81308, term81308.getClass(), "focusCycleRoot", false);
        setBooleanField(term81308, term81308.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81308, term81308.getClass(), "printingThreads", null);
        setBooleanField(term81308, term81308.getClass(), "printing", false);
        setField(term81308, term81308.getClass(), "containerListener", null);
        setIntField(term81308, term81308.getClass(), "listeningChildren", 0);
        setIntField(term81308, term81308.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81308, term81308.getClass(), "descendantsCount", 0);
        setField(term81308, term81308.getClass(), "preserveBackgroundColor", null);
        setIntField(term81308, term81308.getClass(), "numOfHWComponents", 0);
        setIntField(term81308, term81308.getClass(), "numOfLWComponents", 0);
        setField(term81308, term81308.getClass(), "modalComp", null);
        setField(term81308, term81308.getClass(), "modalAppContext", null);
        setIntField(term81308, term81308.getClass(), "containerSerializedDataVersion", 0);
        setField(term81308, term81308.getClass(), "peer", null);
        setField(term81308, term81308.getClass(), "parent", null);
        setField(term81308, term81308.getClass(), "appContext", null);
        setIntField(term81308, term81308.getClass(), "x", 0);
        setIntField(term81308, term81308.getClass(), "y", 0);
        setIntField(term81308, term81308.getClass(), "width", 0);
        setIntField(term81308, term81308.getClass(), "height", 0);
        setField(term81308, term81308.getClass(), "foreground", null);
        setField(term81308, term81308.getClass(), "background", null);
        setField(term81308, term81308.getClass(), "font", null);
        setField(term81308, term81308.getClass(), "peerFont", null);
        setField(term81308, term81308.getClass(), "cursor", null);
        setField(term81308, term81308.getClass(), "locale", null);
        setField(term81308, term81308.getClass(), "graphicsConfig", null);
        setField(term81308, term81308.getClass(), "bufferStrategy", null);
        setBooleanField(term81308, term81308.getClass(), "ignoreRepaint", false);
        setBooleanField(term81308, term81308.getClass(), "visible", false);
        setBooleanField(term81308, term81308.getClass(), "enabled", false);
        setBooleanField(term81308, term81308.getClass(), "valid", false);
        setField(term81308, term81308.getClass(), "dropTarget", null);
        setField(term81308, term81308.getClass(), "popups", null);
        setField(term81308, term81308.getClass(), "name", null);
        setBooleanField(term81308, term81308.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81308, term81308.getClass(), "focusable", false);
        setIntField(term81308, term81308.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81308, term81308.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81308, term81308.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81308, term81308.getClass(), "acc", null);
        setField(term81308, term81308.getClass(), "minSize", null);
        setBooleanField(term81308, term81308.getClass(), "minSizeSet", false);
        setField(term81308, term81308.getClass(), "prefSize", null);
        setBooleanField(term81308, term81308.getClass(), "prefSizeSet", false);
        setField(term81308, term81308.getClass(), "maxSize", null);
        setBooleanField(term81308, term81308.getClass(), "maxSizeSet", false);
        setField(term81308, term81308.getClass(), "componentOrientation", null);
        setBooleanField(term81308, term81308.getClass(), "newEventsOnly", false);
        setField(term81308, term81308.getClass(), "componentListener", null);
        setField(term81308, term81308.getClass(), "focusListener", null);
        setField(term81308, term81308.getClass(), "hierarchyListener", null);
        setField(term81308, term81308.getClass(), "hierarchyBoundsListener", null);
        setField(term81308, term81308.getClass(), "keyListener", null);
        setField(term81308, term81308.getClass(), "mouseListener", null);
        setField(term81308, term81308.getClass(), "mouseMotionListener", null);
        setField(term81308, term81308.getClass(), "mouseWheelListener", null);
        setField(term81308, term81308.getClass(), "inputMethodListener", null);
        setLongField(term81308, term81308.getClass(), "eventMask", 0L);
        setField(term81308, term81308.getClass(), "changeSupport", null);
        setField(term81308, term81308.getClass(), "objectLock", null);
        setBooleanField(term81308, term81308.getClass(), "isPacked", false);
        setIntField(term81308, term81308.getClass(), "boundsOp", 0);
        setField(term81308, term81308.getClass(), "compoundShape", null);
        setField(term81308, term81308.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81308, term81308.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81308, term81308.getClass(), "backgroundEraseDisabled", false);
        setField(term81308, term81308.getClass(), "eventCache", null);
        setBooleanField(term81308, term81308.getClass(), "coalescingEnabled", false);
        setBooleanField(term81308, term81308.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81308, term81308.getClass(), "componentSerializedDataVersion", 0);
        setField(term81308, term81308.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setMaxIconWidth", argTypes, term81308, args);
    }

};


