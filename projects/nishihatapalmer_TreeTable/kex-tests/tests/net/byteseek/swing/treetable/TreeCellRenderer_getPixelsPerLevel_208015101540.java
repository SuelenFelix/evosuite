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

public class TreeCellRenderer_getPixelsPerLevel_208015101540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80112;

    public TreeCellRenderer_getPixelsPerLevel_208015101540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80112 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80112, term80112.getClass(), "treeTableModel", null);
        setField(term80112, term80112.getClass(), "insets", null);
        setIntField(term80112, term80112.getClass(), "pixelsPerLevel", 0);
        setField(term80112, term80112.getClass(), "expandCollapseIconRenderer", null);
        setField(term80112, term80112.getClass(), "expandedIcon", null);
        setField(term80112, term80112.getClass(), "collapsedIcon", null);
        setIntField(term80112, term80112.getClass(), "maxIconWidth", 0);
        setField(term80112, term80112.getClass(), "currentNode", null);
        setField(term80112, term80112.getClass(), "unselectedForeground", null);
        setField(term80112, term80112.getClass(), "unselectedBackground", null);
        setIntField(term80112, term80112.getClass(), "mnemonic", 0);
        setIntField(term80112, term80112.getClass(), "mnemonicIndex", 0);
        setField(term80112, term80112.getClass(), "text", null);
        setField(term80112, term80112.getClass(), "defaultIcon", null);
        setField(term80112, term80112.getClass(), "disabledIcon", null);
        setBooleanField(term80112, term80112.getClass(), "disabledIconSet", false);
        setIntField(term80112, term80112.getClass(), "verticalAlignment", 0);
        setIntField(term80112, term80112.getClass(), "horizontalAlignment", 0);
        setIntField(term80112, term80112.getClass(), "verticalTextPosition", 0);
        setIntField(term80112, term80112.getClass(), "horizontalTextPosition", 0);
        setIntField(term80112, term80112.getClass(), "iconTextGap", 0);
        setField(term80112, term80112.getClass(), "labelFor", null);
        setBooleanField(term80112, term80112.getClass(), "isAlignmentXSet", false);
        setFloatField(term80112, term80112.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80112, term80112.getClass(), "isAlignmentYSet", false);
        setFloatField(term80112, term80112.getClass(), "alignmentY", 0.0F);
        setField(term80112, term80112.getClass(), "ui", null);
        setField(term80112, term80112.getClass(), "listenerList", null);
        setField(term80112, term80112.getClass(), "clientProperties", null);
        setField(term80112, term80112.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80112, term80112.getClass(), "autoscrolls", false);
        setField(term80112, term80112.getClass(), "border", null);
        setIntField(term80112, term80112.getClass(), "flags", 0);
        setField(term80112, term80112.getClass(), "inputVerifier", null);
        setBooleanField(term80112, term80112.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80112, term80112.getClass(), "paintingChild", null);
        setField(term80112, term80112.getClass(), "popupMenu", null);
        setField(term80112, term80112.getClass(), "revalidateRunnableScheduled", null);
        setField(term80112, term80112.getClass(), "focusInputMap", null);
        setField(term80112, term80112.getClass(), "ancestorInputMap", null);
        setField(term80112, term80112.getClass(), "windowInputMap", null);
        setField(term80112, term80112.getClass(), "actionMap", null);
        setField(term80112, term80112.getClass(), "aaHint", null);
        setField(term80112, term80112.getClass(), "lcdRenderingHint", null);
        setField(term80112, term80112.getClass(), "component", null);
        setField(term80112, term80112.getClass(), "layoutMgr", null);
        setField(term80112, term80112.getClass(), "dispatcher", null);
        setField(term80112, term80112.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80112, term80112.getClass(), "focusCycleRoot", false);
        setBooleanField(term80112, term80112.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80112, term80112.getClass(), "printingThreads", null);
        setBooleanField(term80112, term80112.getClass(), "printing", false);
        setField(term80112, term80112.getClass(), "containerListener", null);
        setIntField(term80112, term80112.getClass(), "listeningChildren", 0);
        setIntField(term80112, term80112.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80112, term80112.getClass(), "descendantsCount", 0);
        setField(term80112, term80112.getClass(), "preserveBackgroundColor", null);
        setIntField(term80112, term80112.getClass(), "numOfHWComponents", 0);
        setIntField(term80112, term80112.getClass(), "numOfLWComponents", 0);
        setField(term80112, term80112.getClass(), "modalComp", null);
        setField(term80112, term80112.getClass(), "modalAppContext", null);
        setIntField(term80112, term80112.getClass(), "containerSerializedDataVersion", 0);
        setField(term80112, term80112.getClass(), "peer", null);
        setField(term80112, term80112.getClass(), "parent", null);
        setField(term80112, term80112.getClass(), "appContext", null);
        setIntField(term80112, term80112.getClass(), "x", 0);
        setIntField(term80112, term80112.getClass(), "y", 0);
        setIntField(term80112, term80112.getClass(), "width", 0);
        setIntField(term80112, term80112.getClass(), "height", 0);
        setField(term80112, term80112.getClass(), "foreground", null);
        setField(term80112, term80112.getClass(), "background", null);
        setField(term80112, term80112.getClass(), "font", null);
        setField(term80112, term80112.getClass(), "peerFont", null);
        setField(term80112, term80112.getClass(), "cursor", null);
        setField(term80112, term80112.getClass(), "locale", null);
        setField(term80112, term80112.getClass(), "graphicsConfig", null);
        setField(term80112, term80112.getClass(), "bufferStrategy", null);
        setBooleanField(term80112, term80112.getClass(), "ignoreRepaint", false);
        setBooleanField(term80112, term80112.getClass(), "visible", false);
        setBooleanField(term80112, term80112.getClass(), "enabled", false);
        setBooleanField(term80112, term80112.getClass(), "valid", false);
        setField(term80112, term80112.getClass(), "dropTarget", null);
        setField(term80112, term80112.getClass(), "popups", null);
        setField(term80112, term80112.getClass(), "name", null);
        setBooleanField(term80112, term80112.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80112, term80112.getClass(), "focusable", false);
        setIntField(term80112, term80112.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80112, term80112.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80112, term80112.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80112, term80112.getClass(), "acc", null);
        setField(term80112, term80112.getClass(), "minSize", null);
        setBooleanField(term80112, term80112.getClass(), "minSizeSet", false);
        setField(term80112, term80112.getClass(), "prefSize", null);
        setBooleanField(term80112, term80112.getClass(), "prefSizeSet", false);
        setField(term80112, term80112.getClass(), "maxSize", null);
        setBooleanField(term80112, term80112.getClass(), "maxSizeSet", false);
        setField(term80112, term80112.getClass(), "componentOrientation", null);
        setBooleanField(term80112, term80112.getClass(), "newEventsOnly", false);
        setField(term80112, term80112.getClass(), "componentListener", null);
        setField(term80112, term80112.getClass(), "focusListener", null);
        setField(term80112, term80112.getClass(), "hierarchyListener", null);
        setField(term80112, term80112.getClass(), "hierarchyBoundsListener", null);
        setField(term80112, term80112.getClass(), "keyListener", null);
        setField(term80112, term80112.getClass(), "mouseListener", null);
        setField(term80112, term80112.getClass(), "mouseMotionListener", null);
        setField(term80112, term80112.getClass(), "mouseWheelListener", null);
        setField(term80112, term80112.getClass(), "inputMethodListener", null);
        setLongField(term80112, term80112.getClass(), "eventMask", 0L);
        setField(term80112, term80112.getClass(), "changeSupport", null);
        setField(term80112, term80112.getClass(), "objectLock", null);
        setBooleanField(term80112, term80112.getClass(), "isPacked", false);
        setIntField(term80112, term80112.getClass(), "boundsOp", 0);
        setField(term80112, term80112.getClass(), "compoundShape", null);
        setField(term80112, term80112.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80112, term80112.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80112, term80112.getClass(), "backgroundEraseDisabled", false);
        setField(term80112, term80112.getClass(), "eventCache", null);
        setBooleanField(term80112, term80112.getClass(), "coalescingEnabled", false);
        setBooleanField(term80112, term80112.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80112, term80112.getClass(), "componentSerializedDataVersion", 0);
        setField(term80112, term80112.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelsPerLevel", argTypes, term80112, args);
    }

};


