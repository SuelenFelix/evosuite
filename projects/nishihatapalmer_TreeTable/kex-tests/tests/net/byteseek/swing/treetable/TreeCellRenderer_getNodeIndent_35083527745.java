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

public class TreeCellRenderer_getNodeIndent_35083527745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80369;

    public TreeCellRenderer_getNodeIndent_35083527745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80369 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80369, term80369.getClass(), "treeTableModel", null);
        setField(term80369, term80369.getClass(), "insets", null);
        setIntField(term80369, term80369.getClass(), "pixelsPerLevel", 0);
        setField(term80369, term80369.getClass(), "expandCollapseIconRenderer", null);
        setField(term80369, term80369.getClass(), "expandedIcon", null);
        setField(term80369, term80369.getClass(), "collapsedIcon", null);
        setIntField(term80369, term80369.getClass(), "maxIconWidth", 0);
        setField(term80369, term80369.getClass(), "currentNode", null);
        setField(term80369, term80369.getClass(), "unselectedForeground", null);
        setField(term80369, term80369.getClass(), "unselectedBackground", null);
        setIntField(term80369, term80369.getClass(), "mnemonic", 0);
        setIntField(term80369, term80369.getClass(), "mnemonicIndex", 0);
        setField(term80369, term80369.getClass(), "text", null);
        setField(term80369, term80369.getClass(), "defaultIcon", null);
        setField(term80369, term80369.getClass(), "disabledIcon", null);
        setBooleanField(term80369, term80369.getClass(), "disabledIconSet", false);
        setIntField(term80369, term80369.getClass(), "verticalAlignment", 0);
        setIntField(term80369, term80369.getClass(), "horizontalAlignment", 0);
        setIntField(term80369, term80369.getClass(), "verticalTextPosition", 0);
        setIntField(term80369, term80369.getClass(), "horizontalTextPosition", 0);
        setIntField(term80369, term80369.getClass(), "iconTextGap", 0);
        setField(term80369, term80369.getClass(), "labelFor", null);
        setBooleanField(term80369, term80369.getClass(), "isAlignmentXSet", false);
        setFloatField(term80369, term80369.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80369, term80369.getClass(), "isAlignmentYSet", false);
        setFloatField(term80369, term80369.getClass(), "alignmentY", 0.0F);
        setField(term80369, term80369.getClass(), "ui", null);
        setField(term80369, term80369.getClass(), "listenerList", null);
        setField(term80369, term80369.getClass(), "clientProperties", null);
        setField(term80369, term80369.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80369, term80369.getClass(), "autoscrolls", false);
        setField(term80369, term80369.getClass(), "border", null);
        setIntField(term80369, term80369.getClass(), "flags", 0);
        setField(term80369, term80369.getClass(), "inputVerifier", null);
        setBooleanField(term80369, term80369.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80369, term80369.getClass(), "paintingChild", null);
        setField(term80369, term80369.getClass(), "popupMenu", null);
        setField(term80369, term80369.getClass(), "revalidateRunnableScheduled", null);
        setField(term80369, term80369.getClass(), "focusInputMap", null);
        setField(term80369, term80369.getClass(), "ancestorInputMap", null);
        setField(term80369, term80369.getClass(), "windowInputMap", null);
        setField(term80369, term80369.getClass(), "actionMap", null);
        setField(term80369, term80369.getClass(), "aaHint", null);
        setField(term80369, term80369.getClass(), "lcdRenderingHint", null);
        setField(term80369, term80369.getClass(), "component", null);
        setField(term80369, term80369.getClass(), "layoutMgr", null);
        setField(term80369, term80369.getClass(), "dispatcher", null);
        setField(term80369, term80369.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80369, term80369.getClass(), "focusCycleRoot", false);
        setBooleanField(term80369, term80369.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80369, term80369.getClass(), "printingThreads", null);
        setBooleanField(term80369, term80369.getClass(), "printing", false);
        setField(term80369, term80369.getClass(), "containerListener", null);
        setIntField(term80369, term80369.getClass(), "listeningChildren", 0);
        setIntField(term80369, term80369.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80369, term80369.getClass(), "descendantsCount", 0);
        setField(term80369, term80369.getClass(), "preserveBackgroundColor", null);
        setIntField(term80369, term80369.getClass(), "numOfHWComponents", 0);
        setIntField(term80369, term80369.getClass(), "numOfLWComponents", 0);
        setField(term80369, term80369.getClass(), "modalComp", null);
        setField(term80369, term80369.getClass(), "modalAppContext", null);
        setIntField(term80369, term80369.getClass(), "containerSerializedDataVersion", 0);
        setField(term80369, term80369.getClass(), "peer", null);
        setField(term80369, term80369.getClass(), "parent", null);
        setField(term80369, term80369.getClass(), "appContext", null);
        setIntField(term80369, term80369.getClass(), "x", 0);
        setIntField(term80369, term80369.getClass(), "y", 0);
        setIntField(term80369, term80369.getClass(), "width", 0);
        setIntField(term80369, term80369.getClass(), "height", 0);
        setField(term80369, term80369.getClass(), "foreground", null);
        setField(term80369, term80369.getClass(), "background", null);
        setField(term80369, term80369.getClass(), "font", null);
        setField(term80369, term80369.getClass(), "peerFont", null);
        setField(term80369, term80369.getClass(), "cursor", null);
        setField(term80369, term80369.getClass(), "locale", null);
        setField(term80369, term80369.getClass(), "graphicsConfig", null);
        setField(term80369, term80369.getClass(), "bufferStrategy", null);
        setBooleanField(term80369, term80369.getClass(), "ignoreRepaint", false);
        setBooleanField(term80369, term80369.getClass(), "visible", false);
        setBooleanField(term80369, term80369.getClass(), "enabled", false);
        setBooleanField(term80369, term80369.getClass(), "valid", false);
        setField(term80369, term80369.getClass(), "dropTarget", null);
        setField(term80369, term80369.getClass(), "popups", null);
        setField(term80369, term80369.getClass(), "name", null);
        setBooleanField(term80369, term80369.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80369, term80369.getClass(), "focusable", false);
        setIntField(term80369, term80369.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80369, term80369.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80369, term80369.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80369, term80369.getClass(), "acc", null);
        setField(term80369, term80369.getClass(), "minSize", null);
        setBooleanField(term80369, term80369.getClass(), "minSizeSet", false);
        setField(term80369, term80369.getClass(), "prefSize", null);
        setBooleanField(term80369, term80369.getClass(), "prefSizeSet", false);
        setField(term80369, term80369.getClass(), "maxSize", null);
        setBooleanField(term80369, term80369.getClass(), "maxSizeSet", false);
        setField(term80369, term80369.getClass(), "componentOrientation", null);
        setBooleanField(term80369, term80369.getClass(), "newEventsOnly", false);
        setField(term80369, term80369.getClass(), "componentListener", null);
        setField(term80369, term80369.getClass(), "focusListener", null);
        setField(term80369, term80369.getClass(), "hierarchyListener", null);
        setField(term80369, term80369.getClass(), "hierarchyBoundsListener", null);
        setField(term80369, term80369.getClass(), "keyListener", null);
        setField(term80369, term80369.getClass(), "mouseListener", null);
        setField(term80369, term80369.getClass(), "mouseMotionListener", null);
        setField(term80369, term80369.getClass(), "mouseWheelListener", null);
        setField(term80369, term80369.getClass(), "inputMethodListener", null);
        setLongField(term80369, term80369.getClass(), "eventMask", 0L);
        setField(term80369, term80369.getClass(), "changeSupport", null);
        setField(term80369, term80369.getClass(), "objectLock", null);
        setBooleanField(term80369, term80369.getClass(), "isPacked", false);
        setIntField(term80369, term80369.getClass(), "boundsOp", 0);
        setField(term80369, term80369.getClass(), "compoundShape", null);
        setField(term80369, term80369.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80369, term80369.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80369, term80369.getClass(), "backgroundEraseDisabled", false);
        setField(term80369, term80369.getClass(), "eventCache", null);
        setBooleanField(term80369, term80369.getClass(), "coalescingEnabled", false);
        setBooleanField(term80369, term80369.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80369, term80369.getClass(), "componentSerializedDataVersion", 0);
        setField(term80369, term80369.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeIndent", argTypes, term80369, args);
    }

};


