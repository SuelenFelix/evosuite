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
     Object term81051;

    public TreeCellRenderer_getNodeIndent_35083527745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81051 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term81051, term81051.getClass(), "treeTableModel", null);
        setField(term81051, term81051.getClass(), "insets", null);
        setIntField(term81051, term81051.getClass(), "pixelsPerLevel", 0);
        setField(term81051, term81051.getClass(), "expandCollapseIconRenderer", null);
        setField(term81051, term81051.getClass(), "expandedIcon", null);
        setField(term81051, term81051.getClass(), "collapsedIcon", null);
        setIntField(term81051, term81051.getClass(), "maxIconWidth", 0);
        setField(term81051, term81051.getClass(), "currentNode", null);
        setField(term81051, term81051.getClass(), "unselectedForeground", null);
        setField(term81051, term81051.getClass(), "unselectedBackground", null);
        setIntField(term81051, term81051.getClass(), "mnemonic", 0);
        setIntField(term81051, term81051.getClass(), "mnemonicIndex", 0);
        setField(term81051, term81051.getClass(), "text", null);
        setField(term81051, term81051.getClass(), "defaultIcon", null);
        setField(term81051, term81051.getClass(), "disabledIcon", null);
        setBooleanField(term81051, term81051.getClass(), "disabledIconSet", false);
        setIntField(term81051, term81051.getClass(), "verticalAlignment", 0);
        setIntField(term81051, term81051.getClass(), "horizontalAlignment", 0);
        setIntField(term81051, term81051.getClass(), "verticalTextPosition", 0);
        setIntField(term81051, term81051.getClass(), "horizontalTextPosition", 0);
        setIntField(term81051, term81051.getClass(), "iconTextGap", 0);
        setField(term81051, term81051.getClass(), "labelFor", null);
        setBooleanField(term81051, term81051.getClass(), "isAlignmentXSet", false);
        setFloatField(term81051, term81051.getClass(), "alignmentX", 0.0F);
        setBooleanField(term81051, term81051.getClass(), "isAlignmentYSet", false);
        setFloatField(term81051, term81051.getClass(), "alignmentY", 0.0F);
        setField(term81051, term81051.getClass(), "ui", null);
        setField(term81051, term81051.getClass(), "listenerList", null);
        setField(term81051, term81051.getClass(), "clientProperties", null);
        setField(term81051, term81051.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term81051, term81051.getClass(), "autoscrolls", false);
        setField(term81051, term81051.getClass(), "border", null);
        setIntField(term81051, term81051.getClass(), "flags", 0);
        setField(term81051, term81051.getClass(), "inputVerifier", null);
        setBooleanField(term81051, term81051.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term81051, term81051.getClass(), "paintingChild", null);
        setField(term81051, term81051.getClass(), "popupMenu", null);
        setField(term81051, term81051.getClass(), "revalidateRunnableScheduled", null);
        setField(term81051, term81051.getClass(), "focusInputMap", null);
        setField(term81051, term81051.getClass(), "ancestorInputMap", null);
        setField(term81051, term81051.getClass(), "windowInputMap", null);
        setField(term81051, term81051.getClass(), "actionMap", null);
        setField(term81051, term81051.getClass(), "aaHint", null);
        setField(term81051, term81051.getClass(), "lcdRenderingHint", null);
        setField(term81051, term81051.getClass(), "component", null);
        setField(term81051, term81051.getClass(), "layoutMgr", null);
        setField(term81051, term81051.getClass(), "dispatcher", null);
        setField(term81051, term81051.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81051, term81051.getClass(), "focusCycleRoot", false);
        setBooleanField(term81051, term81051.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81051, term81051.getClass(), "printingThreads", null);
        setBooleanField(term81051, term81051.getClass(), "printing", false);
        setField(term81051, term81051.getClass(), "containerListener", null);
        setIntField(term81051, term81051.getClass(), "listeningChildren", 0);
        setIntField(term81051, term81051.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81051, term81051.getClass(), "descendantsCount", 0);
        setField(term81051, term81051.getClass(), "preserveBackgroundColor", null);
        setIntField(term81051, term81051.getClass(), "numOfHWComponents", 0);
        setIntField(term81051, term81051.getClass(), "numOfLWComponents", 0);
        setField(term81051, term81051.getClass(), "modalComp", null);
        setField(term81051, term81051.getClass(), "modalAppContext", null);
        setIntField(term81051, term81051.getClass(), "containerSerializedDataVersion", 0);
        setField(term81051, term81051.getClass(), "peer", null);
        setField(term81051, term81051.getClass(), "parent", null);
        setField(term81051, term81051.getClass(), "appContext", null);
        setIntField(term81051, term81051.getClass(), "x", 0);
        setIntField(term81051, term81051.getClass(), "y", 0);
        setIntField(term81051, term81051.getClass(), "width", 0);
        setIntField(term81051, term81051.getClass(), "height", 0);
        setField(term81051, term81051.getClass(), "foreground", null);
        setField(term81051, term81051.getClass(), "background", null);
        setField(term81051, term81051.getClass(), "font", null);
        setField(term81051, term81051.getClass(), "peerFont", null);
        setField(term81051, term81051.getClass(), "cursor", null);
        setField(term81051, term81051.getClass(), "locale", null);
        setField(term81051, term81051.getClass(), "graphicsConfig", null);
        setField(term81051, term81051.getClass(), "bufferStrategy", null);
        setBooleanField(term81051, term81051.getClass(), "ignoreRepaint", false);
        setBooleanField(term81051, term81051.getClass(), "visible", false);
        setBooleanField(term81051, term81051.getClass(), "enabled", false);
        setBooleanField(term81051, term81051.getClass(), "valid", false);
        setField(term81051, term81051.getClass(), "dropTarget", null);
        setField(term81051, term81051.getClass(), "popups", null);
        setField(term81051, term81051.getClass(), "name", null);
        setBooleanField(term81051, term81051.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81051, term81051.getClass(), "focusable", false);
        setIntField(term81051, term81051.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81051, term81051.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81051, term81051.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81051, term81051.getClass(), "acc", null);
        setField(term81051, term81051.getClass(), "minSize", null);
        setBooleanField(term81051, term81051.getClass(), "minSizeSet", false);
        setField(term81051, term81051.getClass(), "prefSize", null);
        setBooleanField(term81051, term81051.getClass(), "prefSizeSet", false);
        setField(term81051, term81051.getClass(), "maxSize", null);
        setBooleanField(term81051, term81051.getClass(), "maxSizeSet", false);
        setField(term81051, term81051.getClass(), "componentOrientation", null);
        setBooleanField(term81051, term81051.getClass(), "newEventsOnly", false);
        setField(term81051, term81051.getClass(), "componentListener", null);
        setField(term81051, term81051.getClass(), "focusListener", null);
        setField(term81051, term81051.getClass(), "hierarchyListener", null);
        setField(term81051, term81051.getClass(), "hierarchyBoundsListener", null);
        setField(term81051, term81051.getClass(), "keyListener", null);
        setField(term81051, term81051.getClass(), "mouseListener", null);
        setField(term81051, term81051.getClass(), "mouseMotionListener", null);
        setField(term81051, term81051.getClass(), "mouseWheelListener", null);
        setField(term81051, term81051.getClass(), "inputMethodListener", null);
        setLongField(term81051, term81051.getClass(), "eventMask", 0L);
        setField(term81051, term81051.getClass(), "changeSupport", null);
        setField(term81051, term81051.getClass(), "objectLock", null);
        setBooleanField(term81051, term81051.getClass(), "isPacked", false);
        setIntField(term81051, term81051.getClass(), "boundsOp", 0);
        setField(term81051, term81051.getClass(), "compoundShape", null);
        setField(term81051, term81051.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81051, term81051.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81051, term81051.getClass(), "backgroundEraseDisabled", false);
        setField(term81051, term81051.getClass(), "eventCache", null);
        setBooleanField(term81051, term81051.getClass(), "coalescingEnabled", false);
        setBooleanField(term81051, term81051.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81051, term81051.getClass(), "componentSerializedDataVersion", 0);
        setField(term81051, term81051.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeIndent", argTypes, term81051, args);
    }

};


