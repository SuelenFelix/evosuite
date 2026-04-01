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
     Object term80949;

    public TreeCellRenderer_setCollapsedIcon_5300619243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80949 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer"));
        setField(term80949, term80949.getClass(), "treeTableModel", null);
        setField(term80949, term80949.getClass(), "insets", null);
        setIntField(term80949, term80949.getClass(), "pixelsPerLevel", 0);
        setField(term80949, term80949.getClass(), "expandCollapseIconRenderer", null);
        setField(term80949, term80949.getClass(), "expandedIcon", null);
        setField(term80949, term80949.getClass(), "collapsedIcon", null);
        setIntField(term80949, term80949.getClass(), "maxIconWidth", 0);
        setField(term80949, term80949.getClass(), "currentNode", null);
        setField(term80949, term80949.getClass(), "unselectedForeground", null);
        setField(term80949, term80949.getClass(), "unselectedBackground", null);
        setIntField(term80949, term80949.getClass(), "mnemonic", 0);
        setIntField(term80949, term80949.getClass(), "mnemonicIndex", 0);
        setField(term80949, term80949.getClass(), "text", null);
        setField(term80949, term80949.getClass(), "defaultIcon", null);
        setField(term80949, term80949.getClass(), "disabledIcon", null);
        setBooleanField(term80949, term80949.getClass(), "disabledIconSet", false);
        setIntField(term80949, term80949.getClass(), "verticalAlignment", 0);
        setIntField(term80949, term80949.getClass(), "horizontalAlignment", 0);
        setIntField(term80949, term80949.getClass(), "verticalTextPosition", 0);
        setIntField(term80949, term80949.getClass(), "horizontalTextPosition", 0);
        setIntField(term80949, term80949.getClass(), "iconTextGap", 0);
        setField(term80949, term80949.getClass(), "labelFor", null);
        setBooleanField(term80949, term80949.getClass(), "isAlignmentXSet", false);
        setFloatField(term80949, term80949.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80949, term80949.getClass(), "isAlignmentYSet", false);
        setFloatField(term80949, term80949.getClass(), "alignmentY", 0.0F);
        setField(term80949, term80949.getClass(), "ui", null);
        setField(term80949, term80949.getClass(), "listenerList", null);
        setField(term80949, term80949.getClass(), "clientProperties", null);
        setField(term80949, term80949.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80949, term80949.getClass(), "autoscrolls", false);
        setField(term80949, term80949.getClass(), "border", null);
        setIntField(term80949, term80949.getClass(), "flags", 0);
        setField(term80949, term80949.getClass(), "inputVerifier", null);
        setBooleanField(term80949, term80949.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80949, term80949.getClass(), "paintingChild", null);
        setField(term80949, term80949.getClass(), "popupMenu", null);
        setField(term80949, term80949.getClass(), "revalidateRunnableScheduled", null);
        setField(term80949, term80949.getClass(), "focusInputMap", null);
        setField(term80949, term80949.getClass(), "ancestorInputMap", null);
        setField(term80949, term80949.getClass(), "windowInputMap", null);
        setField(term80949, term80949.getClass(), "actionMap", null);
        setField(term80949, term80949.getClass(), "aaHint", null);
        setField(term80949, term80949.getClass(), "lcdRenderingHint", null);
        setField(term80949, term80949.getClass(), "component", null);
        setField(term80949, term80949.getClass(), "layoutMgr", null);
        setField(term80949, term80949.getClass(), "dispatcher", null);
        setField(term80949, term80949.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80949, term80949.getClass(), "focusCycleRoot", false);
        setBooleanField(term80949, term80949.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80949, term80949.getClass(), "printingThreads", null);
        setBooleanField(term80949, term80949.getClass(), "printing", false);
        setField(term80949, term80949.getClass(), "containerListener", null);
        setIntField(term80949, term80949.getClass(), "listeningChildren", 0);
        setIntField(term80949, term80949.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80949, term80949.getClass(), "descendantsCount", 0);
        setField(term80949, term80949.getClass(), "preserveBackgroundColor", null);
        setIntField(term80949, term80949.getClass(), "numOfHWComponents", 0);
        setIntField(term80949, term80949.getClass(), "numOfLWComponents", 0);
        setField(term80949, term80949.getClass(), "modalComp", null);
        setField(term80949, term80949.getClass(), "modalAppContext", null);
        setIntField(term80949, term80949.getClass(), "containerSerializedDataVersion", 0);
        setField(term80949, term80949.getClass(), "peer", null);
        setField(term80949, term80949.getClass(), "parent", null);
        setField(term80949, term80949.getClass(), "appContext", null);
        setIntField(term80949, term80949.getClass(), "x", 0);
        setIntField(term80949, term80949.getClass(), "y", 0);
        setIntField(term80949, term80949.getClass(), "width", 0);
        setIntField(term80949, term80949.getClass(), "height", 0);
        setField(term80949, term80949.getClass(), "foreground", null);
        setField(term80949, term80949.getClass(), "background", null);
        setField(term80949, term80949.getClass(), "font", null);
        setField(term80949, term80949.getClass(), "peerFont", null);
        setField(term80949, term80949.getClass(), "cursor", null);
        setField(term80949, term80949.getClass(), "locale", null);
        setField(term80949, term80949.getClass(), "graphicsConfig", null);
        setField(term80949, term80949.getClass(), "bufferStrategy", null);
        setBooleanField(term80949, term80949.getClass(), "ignoreRepaint", false);
        setBooleanField(term80949, term80949.getClass(), "visible", false);
        setBooleanField(term80949, term80949.getClass(), "enabled", false);
        setBooleanField(term80949, term80949.getClass(), "valid", false);
        setField(term80949, term80949.getClass(), "dropTarget", null);
        setField(term80949, term80949.getClass(), "popups", null);
        setField(term80949, term80949.getClass(), "name", null);
        setBooleanField(term80949, term80949.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80949, term80949.getClass(), "focusable", false);
        setIntField(term80949, term80949.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80949, term80949.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80949, term80949.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80949, term80949.getClass(), "acc", null);
        setField(term80949, term80949.getClass(), "minSize", null);
        setBooleanField(term80949, term80949.getClass(), "minSizeSet", false);
        setField(term80949, term80949.getClass(), "prefSize", null);
        setBooleanField(term80949, term80949.getClass(), "prefSizeSet", false);
        setField(term80949, term80949.getClass(), "maxSize", null);
        setBooleanField(term80949, term80949.getClass(), "maxSizeSet", false);
        setField(term80949, term80949.getClass(), "componentOrientation", null);
        setBooleanField(term80949, term80949.getClass(), "newEventsOnly", false);
        setField(term80949, term80949.getClass(), "componentListener", null);
        setField(term80949, term80949.getClass(), "focusListener", null);
        setField(term80949, term80949.getClass(), "hierarchyListener", null);
        setField(term80949, term80949.getClass(), "hierarchyBoundsListener", null);
        setField(term80949, term80949.getClass(), "keyListener", null);
        setField(term80949, term80949.getClass(), "mouseListener", null);
        setField(term80949, term80949.getClass(), "mouseMotionListener", null);
        setField(term80949, term80949.getClass(), "mouseWheelListener", null);
        setField(term80949, term80949.getClass(), "inputMethodListener", null);
        setLongField(term80949, term80949.getClass(), "eventMask", 0L);
        setField(term80949, term80949.getClass(), "changeSupport", null);
        setField(term80949, term80949.getClass(), "objectLock", null);
        setBooleanField(term80949, term80949.getClass(), "isPacked", false);
        setIntField(term80949, term80949.getClass(), "boundsOp", 0);
        setField(term80949, term80949.getClass(), "compoundShape", null);
        setField(term80949, term80949.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80949, term80949.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80949, term80949.getClass(), "backgroundEraseDisabled", false);
        setField(term80949, term80949.getClass(), "eventCache", null);
        setBooleanField(term80949, term80949.getClass(), "coalescingEnabled", false);
        setBooleanField(term80949, term80949.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80949, term80949.getClass(), "componentSerializedDataVersion", 0);
        setField(term80949, term80949.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCollapsedIcon", argTypes, term80949, args);
    }

};


