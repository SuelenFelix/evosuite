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

public class TreeCellRenderer_setCollapsedIcon_5300619243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80267;

    public TreeCellRenderer_setCollapsedIcon_5300619243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80267 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80267, term80267.getClass(), "treeTableModel", null);
        setField(term80267, term80267.getClass(), "insets", null);
        setIntField(term80267, term80267.getClass(), "pixelsPerLevel", 0);
        setField(term80267, term80267.getClass(), "expandCollapseIconRenderer", null);
        setField(term80267, term80267.getClass(), "expandedIcon", null);
        setField(term80267, term80267.getClass(), "collapsedIcon", null);
        setIntField(term80267, term80267.getClass(), "maxIconWidth", 0);
        setField(term80267, term80267.getClass(), "currentNode", null);
        setField(term80267, term80267.getClass(), "unselectedForeground", null);
        setField(term80267, term80267.getClass(), "unselectedBackground", null);
        setIntField(term80267, term80267.getClass(), "mnemonic", 0);
        setIntField(term80267, term80267.getClass(), "mnemonicIndex", 0);
        setField(term80267, term80267.getClass(), "text", null);
        setField(term80267, term80267.getClass(), "defaultIcon", null);
        setField(term80267, term80267.getClass(), "disabledIcon", null);
        setBooleanField(term80267, term80267.getClass(), "disabledIconSet", false);
        setIntField(term80267, term80267.getClass(), "verticalAlignment", 0);
        setIntField(term80267, term80267.getClass(), "horizontalAlignment", 0);
        setIntField(term80267, term80267.getClass(), "verticalTextPosition", 0);
        setIntField(term80267, term80267.getClass(), "horizontalTextPosition", 0);
        setIntField(term80267, term80267.getClass(), "iconTextGap", 0);
        setField(term80267, term80267.getClass(), "labelFor", null);
        setBooleanField(term80267, term80267.getClass(), "isAlignmentXSet", false);
        setFloatField(term80267, term80267.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80267, term80267.getClass(), "isAlignmentYSet", false);
        setFloatField(term80267, term80267.getClass(), "alignmentY", 0.0F);
        setField(term80267, term80267.getClass(), "ui", null);
        setField(term80267, term80267.getClass(), "listenerList", null);
        setField(term80267, term80267.getClass(), "clientProperties", null);
        setField(term80267, term80267.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80267, term80267.getClass(), "autoscrolls", false);
        setField(term80267, term80267.getClass(), "border", null);
        setIntField(term80267, term80267.getClass(), "flags", 0);
        setField(term80267, term80267.getClass(), "inputVerifier", null);
        setBooleanField(term80267, term80267.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80267, term80267.getClass(), "paintingChild", null);
        setField(term80267, term80267.getClass(), "popupMenu", null);
        setField(term80267, term80267.getClass(), "revalidateRunnableScheduled", null);
        setField(term80267, term80267.getClass(), "focusInputMap", null);
        setField(term80267, term80267.getClass(), "ancestorInputMap", null);
        setField(term80267, term80267.getClass(), "windowInputMap", null);
        setField(term80267, term80267.getClass(), "actionMap", null);
        setField(term80267, term80267.getClass(), "aaHint", null);
        setField(term80267, term80267.getClass(), "lcdRenderingHint", null);
        setField(term80267, term80267.getClass(), "component", null);
        setField(term80267, term80267.getClass(), "layoutMgr", null);
        setField(term80267, term80267.getClass(), "dispatcher", null);
        setField(term80267, term80267.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80267, term80267.getClass(), "focusCycleRoot", false);
        setBooleanField(term80267, term80267.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80267, term80267.getClass(), "printingThreads", null);
        setBooleanField(term80267, term80267.getClass(), "printing", false);
        setField(term80267, term80267.getClass(), "containerListener", null);
        setIntField(term80267, term80267.getClass(), "listeningChildren", 0);
        setIntField(term80267, term80267.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80267, term80267.getClass(), "descendantsCount", 0);
        setField(term80267, term80267.getClass(), "preserveBackgroundColor", null);
        setIntField(term80267, term80267.getClass(), "numOfHWComponents", 0);
        setIntField(term80267, term80267.getClass(), "numOfLWComponents", 0);
        setField(term80267, term80267.getClass(), "modalComp", null);
        setField(term80267, term80267.getClass(), "modalAppContext", null);
        setIntField(term80267, term80267.getClass(), "containerSerializedDataVersion", 0);
        setField(term80267, term80267.getClass(), "peer", null);
        setField(term80267, term80267.getClass(), "parent", null);
        setField(term80267, term80267.getClass(), "appContext", null);
        setIntField(term80267, term80267.getClass(), "x", 0);
        setIntField(term80267, term80267.getClass(), "y", 0);
        setIntField(term80267, term80267.getClass(), "width", 0);
        setIntField(term80267, term80267.getClass(), "height", 0);
        setField(term80267, term80267.getClass(), "foreground", null);
        setField(term80267, term80267.getClass(), "background", null);
        setField(term80267, term80267.getClass(), "font", null);
        setField(term80267, term80267.getClass(), "peerFont", null);
        setField(term80267, term80267.getClass(), "cursor", null);
        setField(term80267, term80267.getClass(), "locale", null);
        setField(term80267, term80267.getClass(), "graphicsConfig", null);
        setField(term80267, term80267.getClass(), "bufferStrategy", null);
        setBooleanField(term80267, term80267.getClass(), "ignoreRepaint", false);
        setBooleanField(term80267, term80267.getClass(), "visible", false);
        setBooleanField(term80267, term80267.getClass(), "enabled", false);
        setBooleanField(term80267, term80267.getClass(), "valid", false);
        setField(term80267, term80267.getClass(), "dropTarget", null);
        setField(term80267, term80267.getClass(), "popups", null);
        setField(term80267, term80267.getClass(), "name", null);
        setBooleanField(term80267, term80267.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80267, term80267.getClass(), "focusable", false);
        setIntField(term80267, term80267.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80267, term80267.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80267, term80267.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80267, term80267.getClass(), "acc", null);
        setField(term80267, term80267.getClass(), "minSize", null);
        setBooleanField(term80267, term80267.getClass(), "minSizeSet", false);
        setField(term80267, term80267.getClass(), "prefSize", null);
        setBooleanField(term80267, term80267.getClass(), "prefSizeSet", false);
        setField(term80267, term80267.getClass(), "maxSize", null);
        setBooleanField(term80267, term80267.getClass(), "maxSizeSet", false);
        setField(term80267, term80267.getClass(), "componentOrientation", null);
        setBooleanField(term80267, term80267.getClass(), "newEventsOnly", false);
        setField(term80267, term80267.getClass(), "componentListener", null);
        setField(term80267, term80267.getClass(), "focusListener", null);
        setField(term80267, term80267.getClass(), "hierarchyListener", null);
        setField(term80267, term80267.getClass(), "hierarchyBoundsListener", null);
        setField(term80267, term80267.getClass(), "keyListener", null);
        setField(term80267, term80267.getClass(), "mouseListener", null);
        setField(term80267, term80267.getClass(), "mouseMotionListener", null);
        setField(term80267, term80267.getClass(), "mouseWheelListener", null);
        setField(term80267, term80267.getClass(), "inputMethodListener", null);
        setLongField(term80267, term80267.getClass(), "eventMask", 0L);
        setField(term80267, term80267.getClass(), "changeSupport", null);
        setField(term80267, term80267.getClass(), "objectLock", null);
        setBooleanField(term80267, term80267.getClass(), "isPacked", false);
        setIntField(term80267, term80267.getClass(), "boundsOp", 0);
        setField(term80267, term80267.getClass(), "compoundShape", null);
        setField(term80267, term80267.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80267, term80267.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80267, term80267.getClass(), "backgroundEraseDisabled", false);
        setField(term80267, term80267.getClass(), "eventCache", null);
        setBooleanField(term80267, term80267.getClass(), "coalescingEnabled", false);
        setBooleanField(term80267, term80267.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80267, term80267.getClass(), "componentSerializedDataVersion", 0);
        setField(term80267, term80267.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCollapsedIcon", argTypes, term80267, args);
    }

};


