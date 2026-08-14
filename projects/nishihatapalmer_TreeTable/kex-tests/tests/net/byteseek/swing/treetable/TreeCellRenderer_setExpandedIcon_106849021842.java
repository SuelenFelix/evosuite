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
     Object term80216;

    public TreeCellRenderer_setExpandedIcon_106849021842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80216 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80216, term80216.getClass(), "treeTableModel", null);
        setField(term80216, term80216.getClass(), "insets", null);
        setIntField(term80216, term80216.getClass(), "pixelsPerLevel", 0);
        setField(term80216, term80216.getClass(), "expandCollapseIconRenderer", null);
        setField(term80216, term80216.getClass(), "expandedIcon", null);
        setField(term80216, term80216.getClass(), "collapsedIcon", null);
        setIntField(term80216, term80216.getClass(), "maxIconWidth", 0);
        setField(term80216, term80216.getClass(), "currentNode", null);
        setField(term80216, term80216.getClass(), "unselectedForeground", null);
        setField(term80216, term80216.getClass(), "unselectedBackground", null);
        setIntField(term80216, term80216.getClass(), "mnemonic", 0);
        setIntField(term80216, term80216.getClass(), "mnemonicIndex", 0);
        setField(term80216, term80216.getClass(), "text", null);
        setField(term80216, term80216.getClass(), "defaultIcon", null);
        setField(term80216, term80216.getClass(), "disabledIcon", null);
        setBooleanField(term80216, term80216.getClass(), "disabledIconSet", false);
        setIntField(term80216, term80216.getClass(), "verticalAlignment", 0);
        setIntField(term80216, term80216.getClass(), "horizontalAlignment", 0);
        setIntField(term80216, term80216.getClass(), "verticalTextPosition", 0);
        setIntField(term80216, term80216.getClass(), "horizontalTextPosition", 0);
        setIntField(term80216, term80216.getClass(), "iconTextGap", 0);
        setField(term80216, term80216.getClass(), "labelFor", null);
        setBooleanField(term80216, term80216.getClass(), "isAlignmentXSet", false);
        setFloatField(term80216, term80216.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80216, term80216.getClass(), "isAlignmentYSet", false);
        setFloatField(term80216, term80216.getClass(), "alignmentY", 0.0F);
        setField(term80216, term80216.getClass(), "ui", null);
        setField(term80216, term80216.getClass(), "listenerList", null);
        setField(term80216, term80216.getClass(), "clientProperties", null);
        setField(term80216, term80216.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80216, term80216.getClass(), "autoscrolls", false);
        setField(term80216, term80216.getClass(), "border", null);
        setIntField(term80216, term80216.getClass(), "flags", 0);
        setField(term80216, term80216.getClass(), "inputVerifier", null);
        setBooleanField(term80216, term80216.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80216, term80216.getClass(), "paintingChild", null);
        setField(term80216, term80216.getClass(), "popupMenu", null);
        setField(term80216, term80216.getClass(), "revalidateRunnableScheduled", null);
        setField(term80216, term80216.getClass(), "focusInputMap", null);
        setField(term80216, term80216.getClass(), "ancestorInputMap", null);
        setField(term80216, term80216.getClass(), "windowInputMap", null);
        setField(term80216, term80216.getClass(), "actionMap", null);
        setField(term80216, term80216.getClass(), "aaHint", null);
        setField(term80216, term80216.getClass(), "lcdRenderingHint", null);
        setField(term80216, term80216.getClass(), "component", null);
        setField(term80216, term80216.getClass(), "layoutMgr", null);
        setField(term80216, term80216.getClass(), "dispatcher", null);
        setField(term80216, term80216.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80216, term80216.getClass(), "focusCycleRoot", false);
        setBooleanField(term80216, term80216.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80216, term80216.getClass(), "printingThreads", null);
        setBooleanField(term80216, term80216.getClass(), "printing", false);
        setField(term80216, term80216.getClass(), "containerListener", null);
        setIntField(term80216, term80216.getClass(), "listeningChildren", 0);
        setIntField(term80216, term80216.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80216, term80216.getClass(), "descendantsCount", 0);
        setField(term80216, term80216.getClass(), "preserveBackgroundColor", null);
        setIntField(term80216, term80216.getClass(), "numOfHWComponents", 0);
        setIntField(term80216, term80216.getClass(), "numOfLWComponents", 0);
        setField(term80216, term80216.getClass(), "modalComp", null);
        setField(term80216, term80216.getClass(), "modalAppContext", null);
        setIntField(term80216, term80216.getClass(), "containerSerializedDataVersion", 0);
        setField(term80216, term80216.getClass(), "peer", null);
        setField(term80216, term80216.getClass(), "parent", null);
        setField(term80216, term80216.getClass(), "appContext", null);
        setIntField(term80216, term80216.getClass(), "x", 0);
        setIntField(term80216, term80216.getClass(), "y", 0);
        setIntField(term80216, term80216.getClass(), "width", 0);
        setIntField(term80216, term80216.getClass(), "height", 0);
        setField(term80216, term80216.getClass(), "foreground", null);
        setField(term80216, term80216.getClass(), "background", null);
        setField(term80216, term80216.getClass(), "font", null);
        setField(term80216, term80216.getClass(), "peerFont", null);
        setField(term80216, term80216.getClass(), "cursor", null);
        setField(term80216, term80216.getClass(), "locale", null);
        setField(term80216, term80216.getClass(), "graphicsConfig", null);
        setField(term80216, term80216.getClass(), "bufferStrategy", null);
        setBooleanField(term80216, term80216.getClass(), "ignoreRepaint", false);
        setBooleanField(term80216, term80216.getClass(), "visible", false);
        setBooleanField(term80216, term80216.getClass(), "enabled", false);
        setBooleanField(term80216, term80216.getClass(), "valid", false);
        setField(term80216, term80216.getClass(), "dropTarget", null);
        setField(term80216, term80216.getClass(), "popups", null);
        setField(term80216, term80216.getClass(), "name", null);
        setBooleanField(term80216, term80216.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80216, term80216.getClass(), "focusable", false);
        setIntField(term80216, term80216.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80216, term80216.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80216, term80216.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80216, term80216.getClass(), "acc", null);
        setField(term80216, term80216.getClass(), "minSize", null);
        setBooleanField(term80216, term80216.getClass(), "minSizeSet", false);
        setField(term80216, term80216.getClass(), "prefSize", null);
        setBooleanField(term80216, term80216.getClass(), "prefSizeSet", false);
        setField(term80216, term80216.getClass(), "maxSize", null);
        setBooleanField(term80216, term80216.getClass(), "maxSizeSet", false);
        setField(term80216, term80216.getClass(), "componentOrientation", null);
        setBooleanField(term80216, term80216.getClass(), "newEventsOnly", false);
        setField(term80216, term80216.getClass(), "componentListener", null);
        setField(term80216, term80216.getClass(), "focusListener", null);
        setField(term80216, term80216.getClass(), "hierarchyListener", null);
        setField(term80216, term80216.getClass(), "hierarchyBoundsListener", null);
        setField(term80216, term80216.getClass(), "keyListener", null);
        setField(term80216, term80216.getClass(), "mouseListener", null);
        setField(term80216, term80216.getClass(), "mouseMotionListener", null);
        setField(term80216, term80216.getClass(), "mouseWheelListener", null);
        setField(term80216, term80216.getClass(), "inputMethodListener", null);
        setLongField(term80216, term80216.getClass(), "eventMask", 0L);
        setField(term80216, term80216.getClass(), "changeSupport", null);
        setField(term80216, term80216.getClass(), "objectLock", null);
        setBooleanField(term80216, term80216.getClass(), "isPacked", false);
        setIntField(term80216, term80216.getClass(), "boundsOp", 0);
        setField(term80216, term80216.getClass(), "compoundShape", null);
        setField(term80216, term80216.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80216, term80216.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80216, term80216.getClass(), "backgroundEraseDisabled", false);
        setField(term80216, term80216.getClass(), "eventCache", null);
        setBooleanField(term80216, term80216.getClass(), "coalescingEnabled", false);
        setBooleanField(term80216, term80216.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80216, term80216.getClass(), "componentSerializedDataVersion", 0);
        setField(term80216, term80216.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExpandedIcon", argTypes, term80216, args);
    }

};


