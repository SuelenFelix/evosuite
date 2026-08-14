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

public class TreeTableHeaderRenderer_setUnsortedColumnProperties_67301581936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344284;

    public TreeTableHeaderRenderer_setUnsortedColumnProperties_67301581936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344284 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term344284, term344284.getClass(), "sortIconBorder", null);
        setField(term344284, term344284.getClass(), "paintLabel", null);
        setBooleanField(term344284, term344284.getClass(), "boldOnSorted", false);
        setBooleanField(term344284, term344284.getClass(), "showNumber", false);
        setField(term344284, term344284.getClass(), "sortAscendingIcon", null);
        setField(term344284, term344284.getClass(), "sortDescendingIcon", null);
        setField(term344284, term344284.getClass(), "cachedHeaderFont", null);
        setField(term344284, term344284.getClass(), "boldHeaderFont", null);
        setIntField(term344284, term344284.getClass(), "sortOrderNumber", 0);
        setField(term344284, term344284.getClass(), "sortOrder", null);
        setIntField(term344284, term344284.getClass(), "maxIconWidth", 0);
        setIntField(term344284, term344284.getClass(), "sortNumberTextWidth", 0);
        setIntField(term344284, term344284.getClass(), "mnemonic", 0);
        setIntField(term344284, term344284.getClass(), "mnemonicIndex", 0);
        setField(term344284, term344284.getClass(), "text", null);
        setField(term344284, term344284.getClass(), "defaultIcon", null);
        setField(term344284, term344284.getClass(), "disabledIcon", null);
        setBooleanField(term344284, term344284.getClass(), "disabledIconSet", false);
        setIntField(term344284, term344284.getClass(), "verticalAlignment", 0);
        setIntField(term344284, term344284.getClass(), "horizontalAlignment", 0);
        setIntField(term344284, term344284.getClass(), "verticalTextPosition", 0);
        setIntField(term344284, term344284.getClass(), "horizontalTextPosition", 0);
        setIntField(term344284, term344284.getClass(), "iconTextGap", 0);
        setField(term344284, term344284.getClass(), "labelFor", null);
        setBooleanField(term344284, term344284.getClass(), "isAlignmentXSet", false);
        setFloatField(term344284, term344284.getClass(), "alignmentX", 0.0F);
        setBooleanField(term344284, term344284.getClass(), "isAlignmentYSet", false);
        setFloatField(term344284, term344284.getClass(), "alignmentY", 0.0F);
        setField(term344284, term344284.getClass(), "ui", null);
        setField(term344284, term344284.getClass(), "listenerList", null);
        setField(term344284, term344284.getClass(), "clientProperties", null);
        setField(term344284, term344284.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term344284, term344284.getClass(), "autoscrolls", false);
        setField(term344284, term344284.getClass(), "border", null);
        setIntField(term344284, term344284.getClass(), "flags", 0);
        setField(term344284, term344284.getClass(), "inputVerifier", null);
        setBooleanField(term344284, term344284.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term344284, term344284.getClass(), "paintingChild", null);
        setField(term344284, term344284.getClass(), "popupMenu", null);
        setField(term344284, term344284.getClass(), "revalidateRunnableScheduled", null);
        setField(term344284, term344284.getClass(), "focusInputMap", null);
        setField(term344284, term344284.getClass(), "ancestorInputMap", null);
        setField(term344284, term344284.getClass(), "windowInputMap", null);
        setField(term344284, term344284.getClass(), "actionMap", null);
        setField(term344284, term344284.getClass(), "aaHint", null);
        setField(term344284, term344284.getClass(), "lcdRenderingHint", null);
        setField(term344284, term344284.getClass(), "component", null);
        setField(term344284, term344284.getClass(), "layoutMgr", null);
        setField(term344284, term344284.getClass(), "dispatcher", null);
        setField(term344284, term344284.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term344284, term344284.getClass(), "focusCycleRoot", false);
        setBooleanField(term344284, term344284.getClass(), "focusTraversalPolicyProvider", false);
        setField(term344284, term344284.getClass(), "printingThreads", null);
        setBooleanField(term344284, term344284.getClass(), "printing", false);
        setField(term344284, term344284.getClass(), "containerListener", null);
        setIntField(term344284, term344284.getClass(), "listeningChildren", 0);
        setIntField(term344284, term344284.getClass(), "listeningBoundsChildren", 0);
        setIntField(term344284, term344284.getClass(), "descendantsCount", 0);
        setField(term344284, term344284.getClass(), "preserveBackgroundColor", null);
        setIntField(term344284, term344284.getClass(), "numOfHWComponents", 0);
        setIntField(term344284, term344284.getClass(), "numOfLWComponents", 0);
        setField(term344284, term344284.getClass(), "modalComp", null);
        setField(term344284, term344284.getClass(), "modalAppContext", null);
        setIntField(term344284, term344284.getClass(), "containerSerializedDataVersion", 0);
        setField(term344284, term344284.getClass(), "peer", null);
        setField(term344284, term344284.getClass(), "parent", null);
        setField(term344284, term344284.getClass(), "appContext", null);
        setIntField(term344284, term344284.getClass(), "x", 0);
        setIntField(term344284, term344284.getClass(), "y", 0);
        setIntField(term344284, term344284.getClass(), "width", 0);
        setIntField(term344284, term344284.getClass(), "height", 0);
        setField(term344284, term344284.getClass(), "foreground", null);
        setField(term344284, term344284.getClass(), "background", null);
        setField(term344284, term344284.getClass(), "font", null);
        setField(term344284, term344284.getClass(), "peerFont", null);
        setField(term344284, term344284.getClass(), "cursor", null);
        setField(term344284, term344284.getClass(), "locale", null);
        setField(term344284, term344284.getClass(), "graphicsConfig", null);
        setField(term344284, term344284.getClass(), "bufferStrategy", null);
        setBooleanField(term344284, term344284.getClass(), "ignoreRepaint", false);
        setBooleanField(term344284, term344284.getClass(), "visible", false);
        setBooleanField(term344284, term344284.getClass(), "enabled", false);
        setBooleanField(term344284, term344284.getClass(), "valid", false);
        setField(term344284, term344284.getClass(), "dropTarget", null);
        setField(term344284, term344284.getClass(), "popups", null);
        setField(term344284, term344284.getClass(), "name", null);
        setBooleanField(term344284, term344284.getClass(), "nameExplicitlySet", false);
        setBooleanField(term344284, term344284.getClass(), "focusable", false);
        setIntField(term344284, term344284.getClass(), "isFocusTraversableOverridden", 0);
        setField(term344284, term344284.getClass(), "focusTraversalKeys", null);
        setBooleanField(term344284, term344284.getClass(), "focusTraversalKeysEnabled", false);
        setField(term344284, term344284.getClass(), "acc", null);
        setField(term344284, term344284.getClass(), "minSize", null);
        setBooleanField(term344284, term344284.getClass(), "minSizeSet", false);
        setField(term344284, term344284.getClass(), "prefSize", null);
        setBooleanField(term344284, term344284.getClass(), "prefSizeSet", false);
        setField(term344284, term344284.getClass(), "maxSize", null);
        setBooleanField(term344284, term344284.getClass(), "maxSizeSet", false);
        setField(term344284, term344284.getClass(), "componentOrientation", null);
        setBooleanField(term344284, term344284.getClass(), "newEventsOnly", false);
        setField(term344284, term344284.getClass(), "componentListener", null);
        setField(term344284, term344284.getClass(), "focusListener", null);
        setField(term344284, term344284.getClass(), "hierarchyListener", null);
        setField(term344284, term344284.getClass(), "hierarchyBoundsListener", null);
        setField(term344284, term344284.getClass(), "keyListener", null);
        setField(term344284, term344284.getClass(), "mouseListener", null);
        setField(term344284, term344284.getClass(), "mouseMotionListener", null);
        setField(term344284, term344284.getClass(), "mouseWheelListener", null);
        setField(term344284, term344284.getClass(), "inputMethodListener", null);
        setLongField(term344284, term344284.getClass(), "eventMask", 0L);
        setField(term344284, term344284.getClass(), "changeSupport", null);
        setField(term344284, term344284.getClass(), "objectLock", null);
        setBooleanField(term344284, term344284.getClass(), "isPacked", false);
        setIntField(term344284, term344284.getClass(), "boundsOp", 0);
        setField(term344284, term344284.getClass(), "compoundShape", null);
        setField(term344284, term344284.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term344284, term344284.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term344284, term344284.getClass(), "backgroundEraseDisabled", false);
        setField(term344284, term344284.getClass(), "eventCache", null);
        setBooleanField(term344284, term344284.getClass(), "coalescingEnabled", false);
        setBooleanField(term344284, term344284.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term344284, term344284.getClass(), "componentSerializedDataVersion", 0);
        setField(term344284, term344284.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JTable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUnsortedColumnProperties", argTypes, term344284, args);
    }

};


