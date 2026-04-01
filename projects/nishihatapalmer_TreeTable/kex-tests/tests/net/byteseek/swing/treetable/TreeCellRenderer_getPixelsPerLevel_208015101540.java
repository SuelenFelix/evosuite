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
     Object term80794;

    public TreeCellRenderer_getPixelsPerLevel_208015101540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80794 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80794, term80794.getClass(), "treeTableModel", null);
        setField(term80794, term80794.getClass(), "insets", null);
        setIntField(term80794, term80794.getClass(), "pixelsPerLevel", 0);
        setField(term80794, term80794.getClass(), "expandCollapseIconRenderer", null);
        setField(term80794, term80794.getClass(), "expandedIcon", null);
        setField(term80794, term80794.getClass(), "collapsedIcon", null);
        setIntField(term80794, term80794.getClass(), "maxIconWidth", 0);
        setField(term80794, term80794.getClass(), "currentNode", null);
        setField(term80794, term80794.getClass(), "unselectedForeground", null);
        setField(term80794, term80794.getClass(), "unselectedBackground", null);
        setIntField(term80794, term80794.getClass(), "mnemonic", 0);
        setIntField(term80794, term80794.getClass(), "mnemonicIndex", 0);
        setField(term80794, term80794.getClass(), "text", null);
        setField(term80794, term80794.getClass(), "defaultIcon", null);
        setField(term80794, term80794.getClass(), "disabledIcon", null);
        setBooleanField(term80794, term80794.getClass(), "disabledIconSet", false);
        setIntField(term80794, term80794.getClass(), "verticalAlignment", 0);
        setIntField(term80794, term80794.getClass(), "horizontalAlignment", 0);
        setIntField(term80794, term80794.getClass(), "verticalTextPosition", 0);
        setIntField(term80794, term80794.getClass(), "horizontalTextPosition", 0);
        setIntField(term80794, term80794.getClass(), "iconTextGap", 0);
        setField(term80794, term80794.getClass(), "labelFor", null);
        setBooleanField(term80794, term80794.getClass(), "isAlignmentXSet", false);
        setFloatField(term80794, term80794.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80794, term80794.getClass(), "isAlignmentYSet", false);
        setFloatField(term80794, term80794.getClass(), "alignmentY", 0.0F);
        setField(term80794, term80794.getClass(), "ui", null);
        setField(term80794, term80794.getClass(), "listenerList", null);
        setField(term80794, term80794.getClass(), "clientProperties", null);
        setField(term80794, term80794.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80794, term80794.getClass(), "autoscrolls", false);
        setField(term80794, term80794.getClass(), "border", null);
        setIntField(term80794, term80794.getClass(), "flags", 0);
        setField(term80794, term80794.getClass(), "inputVerifier", null);
        setBooleanField(term80794, term80794.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80794, term80794.getClass(), "paintingChild", null);
        setField(term80794, term80794.getClass(), "popupMenu", null);
        setField(term80794, term80794.getClass(), "revalidateRunnableScheduled", null);
        setField(term80794, term80794.getClass(), "focusInputMap", null);
        setField(term80794, term80794.getClass(), "ancestorInputMap", null);
        setField(term80794, term80794.getClass(), "windowInputMap", null);
        setField(term80794, term80794.getClass(), "actionMap", null);
        setField(term80794, term80794.getClass(), "aaHint", null);
        setField(term80794, term80794.getClass(), "lcdRenderingHint", null);
        setField(term80794, term80794.getClass(), "component", null);
        setField(term80794, term80794.getClass(), "layoutMgr", null);
        setField(term80794, term80794.getClass(), "dispatcher", null);
        setField(term80794, term80794.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80794, term80794.getClass(), "focusCycleRoot", false);
        setBooleanField(term80794, term80794.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80794, term80794.getClass(), "printingThreads", null);
        setBooleanField(term80794, term80794.getClass(), "printing", false);
        setField(term80794, term80794.getClass(), "containerListener", null);
        setIntField(term80794, term80794.getClass(), "listeningChildren", 0);
        setIntField(term80794, term80794.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80794, term80794.getClass(), "descendantsCount", 0);
        setField(term80794, term80794.getClass(), "preserveBackgroundColor", null);
        setIntField(term80794, term80794.getClass(), "numOfHWComponents", 0);
        setIntField(term80794, term80794.getClass(), "numOfLWComponents", 0);
        setField(term80794, term80794.getClass(), "modalComp", null);
        setField(term80794, term80794.getClass(), "modalAppContext", null);
        setIntField(term80794, term80794.getClass(), "containerSerializedDataVersion", 0);
        setField(term80794, term80794.getClass(), "peer", null);
        setField(term80794, term80794.getClass(), "parent", null);
        setField(term80794, term80794.getClass(), "appContext", null);
        setIntField(term80794, term80794.getClass(), "x", 0);
        setIntField(term80794, term80794.getClass(), "y", 0);
        setIntField(term80794, term80794.getClass(), "width", 0);
        setIntField(term80794, term80794.getClass(), "height", 0);
        setField(term80794, term80794.getClass(), "foreground", null);
        setField(term80794, term80794.getClass(), "background", null);
        setField(term80794, term80794.getClass(), "font", null);
        setField(term80794, term80794.getClass(), "peerFont", null);
        setField(term80794, term80794.getClass(), "cursor", null);
        setField(term80794, term80794.getClass(), "locale", null);
        setField(term80794, term80794.getClass(), "graphicsConfig", null);
        setField(term80794, term80794.getClass(), "bufferStrategy", null);
        setBooleanField(term80794, term80794.getClass(), "ignoreRepaint", false);
        setBooleanField(term80794, term80794.getClass(), "visible", false);
        setBooleanField(term80794, term80794.getClass(), "enabled", false);
        setBooleanField(term80794, term80794.getClass(), "valid", false);
        setField(term80794, term80794.getClass(), "dropTarget", null);
        setField(term80794, term80794.getClass(), "popups", null);
        setField(term80794, term80794.getClass(), "name", null);
        setBooleanField(term80794, term80794.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80794, term80794.getClass(), "focusable", false);
        setIntField(term80794, term80794.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80794, term80794.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80794, term80794.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80794, term80794.getClass(), "acc", null);
        setField(term80794, term80794.getClass(), "minSize", null);
        setBooleanField(term80794, term80794.getClass(), "minSizeSet", false);
        setField(term80794, term80794.getClass(), "prefSize", null);
        setBooleanField(term80794, term80794.getClass(), "prefSizeSet", false);
        setField(term80794, term80794.getClass(), "maxSize", null);
        setBooleanField(term80794, term80794.getClass(), "maxSizeSet", false);
        setField(term80794, term80794.getClass(), "componentOrientation", null);
        setBooleanField(term80794, term80794.getClass(), "newEventsOnly", false);
        setField(term80794, term80794.getClass(), "componentListener", null);
        setField(term80794, term80794.getClass(), "focusListener", null);
        setField(term80794, term80794.getClass(), "hierarchyListener", null);
        setField(term80794, term80794.getClass(), "hierarchyBoundsListener", null);
        setField(term80794, term80794.getClass(), "keyListener", null);
        setField(term80794, term80794.getClass(), "mouseListener", null);
        setField(term80794, term80794.getClass(), "mouseMotionListener", null);
        setField(term80794, term80794.getClass(), "mouseWheelListener", null);
        setField(term80794, term80794.getClass(), "inputMethodListener", null);
        setLongField(term80794, term80794.getClass(), "eventMask", 0L);
        setField(term80794, term80794.getClass(), "changeSupport", null);
        setField(term80794, term80794.getClass(), "objectLock", null);
        setBooleanField(term80794, term80794.getClass(), "isPacked", false);
        setIntField(term80794, term80794.getClass(), "boundsOp", 0);
        setField(term80794, term80794.getClass(), "compoundShape", null);
        setField(term80794, term80794.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80794, term80794.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80794, term80794.getClass(), "backgroundEraseDisabled", false);
        setField(term80794, term80794.getClass(), "eventCache", null);
        setBooleanField(term80794, term80794.getClass(), "coalescingEnabled", false);
        setBooleanField(term80794, term80794.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80794, term80794.getClass(), "componentSerializedDataVersion", 0);
        setField(term80794, term80794.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPixelsPerLevel", argTypes, term80794, args);
    }

};


