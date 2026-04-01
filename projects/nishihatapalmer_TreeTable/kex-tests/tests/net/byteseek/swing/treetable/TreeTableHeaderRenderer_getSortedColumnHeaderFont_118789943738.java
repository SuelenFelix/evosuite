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

public class TreeTableHeaderRenderer_getSortedColumnHeaderFont_118789943738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356879;

    public TreeTableHeaderRenderer_getSortedColumnHeaderFont_118789943738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356879 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term356879, term356879.getClass(), "sortIconBorder", null);
        setField(term356879, term356879.getClass(), "paintLabel", null);
        setBooleanField(term356879, term356879.getClass(), "boldOnSorted", false);
        setBooleanField(term356879, term356879.getClass(), "showNumber", false);
        setField(term356879, term356879.getClass(), "sortAscendingIcon", null);
        setField(term356879, term356879.getClass(), "sortDescendingIcon", null);
        setField(term356879, term356879.getClass(), "cachedHeaderFont", null);
        setField(term356879, term356879.getClass(), "boldHeaderFont", null);
        setIntField(term356879, term356879.getClass(), "sortOrderNumber", 0);
        setField(term356879, term356879.getClass(), "sortOrder", null);
        setIntField(term356879, term356879.getClass(), "maxIconWidth", 0);
        setIntField(term356879, term356879.getClass(), "sortNumberTextWidth", 0);
        setIntField(term356879, term356879.getClass(), "mnemonic", 0);
        setIntField(term356879, term356879.getClass(), "mnemonicIndex", 0);
        setField(term356879, term356879.getClass(), "text", null);
        setField(term356879, term356879.getClass(), "defaultIcon", null);
        setField(term356879, term356879.getClass(), "disabledIcon", null);
        setBooleanField(term356879, term356879.getClass(), "disabledIconSet", false);
        setIntField(term356879, term356879.getClass(), "verticalAlignment", 0);
        setIntField(term356879, term356879.getClass(), "horizontalAlignment", 0);
        setIntField(term356879, term356879.getClass(), "verticalTextPosition", 0);
        setIntField(term356879, term356879.getClass(), "horizontalTextPosition", 0);
        setIntField(term356879, term356879.getClass(), "iconTextGap", 0);
        setField(term356879, term356879.getClass(), "labelFor", null);
        setBooleanField(term356879, term356879.getClass(), "isAlignmentXSet", false);
        setFloatField(term356879, term356879.getClass(), "alignmentX", 0.0F);
        setBooleanField(term356879, term356879.getClass(), "isAlignmentYSet", false);
        setFloatField(term356879, term356879.getClass(), "alignmentY", 0.0F);
        setField(term356879, term356879.getClass(), "ui", null);
        setField(term356879, term356879.getClass(), "listenerList", null);
        setField(term356879, term356879.getClass(), "clientProperties", null);
        setField(term356879, term356879.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term356879, term356879.getClass(), "autoscrolls", false);
        setField(term356879, term356879.getClass(), "border", null);
        setIntField(term356879, term356879.getClass(), "flags", 0);
        setField(term356879, term356879.getClass(), "inputVerifier", null);
        setBooleanField(term356879, term356879.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term356879, term356879.getClass(), "paintingChild", null);
        setField(term356879, term356879.getClass(), "popupMenu", null);
        setField(term356879, term356879.getClass(), "revalidateRunnableScheduled", null);
        setField(term356879, term356879.getClass(), "focusInputMap", null);
        setField(term356879, term356879.getClass(), "ancestorInputMap", null);
        setField(term356879, term356879.getClass(), "windowInputMap", null);
        setField(term356879, term356879.getClass(), "actionMap", null);
        setField(term356879, term356879.getClass(), "aaHint", null);
        setField(term356879, term356879.getClass(), "lcdRenderingHint", null);
        setField(term356879, term356879.getClass(), "component", null);
        setField(term356879, term356879.getClass(), "layoutMgr", null);
        setField(term356879, term356879.getClass(), "dispatcher", null);
        setField(term356879, term356879.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term356879, term356879.getClass(), "focusCycleRoot", false);
        setBooleanField(term356879, term356879.getClass(), "focusTraversalPolicyProvider", false);
        setField(term356879, term356879.getClass(), "printingThreads", null);
        setBooleanField(term356879, term356879.getClass(), "printing", false);
        setField(term356879, term356879.getClass(), "containerListener", null);
        setIntField(term356879, term356879.getClass(), "listeningChildren", 0);
        setIntField(term356879, term356879.getClass(), "listeningBoundsChildren", 0);
        setIntField(term356879, term356879.getClass(), "descendantsCount", 0);
        setField(term356879, term356879.getClass(), "preserveBackgroundColor", null);
        setIntField(term356879, term356879.getClass(), "numOfHWComponents", 0);
        setIntField(term356879, term356879.getClass(), "numOfLWComponents", 0);
        setField(term356879, term356879.getClass(), "modalComp", null);
        setField(term356879, term356879.getClass(), "modalAppContext", null);
        setIntField(term356879, term356879.getClass(), "containerSerializedDataVersion", 0);
        setField(term356879, term356879.getClass(), "peer", null);
        setField(term356879, term356879.getClass(), "parent", null);
        setField(term356879, term356879.getClass(), "appContext", null);
        setIntField(term356879, term356879.getClass(), "x", 0);
        setIntField(term356879, term356879.getClass(), "y", 0);
        setIntField(term356879, term356879.getClass(), "width", 0);
        setIntField(term356879, term356879.getClass(), "height", 0);
        setField(term356879, term356879.getClass(), "foreground", null);
        setField(term356879, term356879.getClass(), "background", null);
        setField(term356879, term356879.getClass(), "font", null);
        setField(term356879, term356879.getClass(), "peerFont", null);
        setField(term356879, term356879.getClass(), "cursor", null);
        setField(term356879, term356879.getClass(), "locale", null);
        setField(term356879, term356879.getClass(), "graphicsConfig", null);
        setField(term356879, term356879.getClass(), "bufferStrategy", null);
        setBooleanField(term356879, term356879.getClass(), "ignoreRepaint", false);
        setBooleanField(term356879, term356879.getClass(), "visible", false);
        setBooleanField(term356879, term356879.getClass(), "enabled", false);
        setBooleanField(term356879, term356879.getClass(), "valid", false);
        setField(term356879, term356879.getClass(), "dropTarget", null);
        setField(term356879, term356879.getClass(), "popups", null);
        setField(term356879, term356879.getClass(), "name", null);
        setBooleanField(term356879, term356879.getClass(), "nameExplicitlySet", false);
        setBooleanField(term356879, term356879.getClass(), "focusable", false);
        setIntField(term356879, term356879.getClass(), "isFocusTraversableOverridden", 0);
        setField(term356879, term356879.getClass(), "focusTraversalKeys", null);
        setBooleanField(term356879, term356879.getClass(), "focusTraversalKeysEnabled", false);
        setField(term356879, term356879.getClass(), "acc", null);
        setField(term356879, term356879.getClass(), "minSize", null);
        setBooleanField(term356879, term356879.getClass(), "minSizeSet", false);
        setField(term356879, term356879.getClass(), "prefSize", null);
        setBooleanField(term356879, term356879.getClass(), "prefSizeSet", false);
        setField(term356879, term356879.getClass(), "maxSize", null);
        setBooleanField(term356879, term356879.getClass(), "maxSizeSet", false);
        setField(term356879, term356879.getClass(), "componentOrientation", null);
        setBooleanField(term356879, term356879.getClass(), "newEventsOnly", false);
        setField(term356879, term356879.getClass(), "componentListener", null);
        setField(term356879, term356879.getClass(), "focusListener", null);
        setField(term356879, term356879.getClass(), "hierarchyListener", null);
        setField(term356879, term356879.getClass(), "hierarchyBoundsListener", null);
        setField(term356879, term356879.getClass(), "keyListener", null);
        setField(term356879, term356879.getClass(), "mouseListener", null);
        setField(term356879, term356879.getClass(), "mouseMotionListener", null);
        setField(term356879, term356879.getClass(), "mouseWheelListener", null);
        setField(term356879, term356879.getClass(), "inputMethodListener", null);
        setLongField(term356879, term356879.getClass(), "eventMask", 0L);
        setField(term356879, term356879.getClass(), "changeSupport", null);
        setField(term356879, term356879.getClass(), "objectLock", null);
        setBooleanField(term356879, term356879.getClass(), "isPacked", false);
        setIntField(term356879, term356879.getClass(), "boundsOp", 0);
        setField(term356879, term356879.getClass(), "compoundShape", null);
        setField(term356879, term356879.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term356879, term356879.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term356879, term356879.getClass(), "backgroundEraseDisabled", false);
        setField(term356879, term356879.getClass(), "eventCache", null);
        setBooleanField(term356879, term356879.getClass(), "coalescingEnabled", false);
        setBooleanField(term356879, term356879.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term356879, term356879.getClass(), "componentSerializedDataVersion", 0);
        setField(term356879, term356879.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSortedColumnHeaderFont", argTypes, term356879, args);
    }

};


