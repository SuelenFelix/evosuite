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
     Object term344439;

    public TreeTableHeaderRenderer_setUnsortedColumnProperties_67301581936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344439 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term344439, term344439.getClass(), "sortIconBorder", null);
        setField(term344439, term344439.getClass(), "paintLabel", null);
        setBooleanField(term344439, term344439.getClass(), "boldOnSorted", false);
        setBooleanField(term344439, term344439.getClass(), "showNumber", false);
        setField(term344439, term344439.getClass(), "sortAscendingIcon", null);
        setField(term344439, term344439.getClass(), "sortDescendingIcon", null);
        setField(term344439, term344439.getClass(), "cachedHeaderFont", null);
        setField(term344439, term344439.getClass(), "boldHeaderFont", null);
        setIntField(term344439, term344439.getClass(), "sortOrderNumber", 0);
        setField(term344439, term344439.getClass(), "sortOrder", null);
        setIntField(term344439, term344439.getClass(), "maxIconWidth", 0);
        setIntField(term344439, term344439.getClass(), "sortNumberTextWidth", 0);
        setIntField(term344439, term344439.getClass(), "mnemonic", 0);
        setIntField(term344439, term344439.getClass(), "mnemonicIndex", 0);
        setField(term344439, term344439.getClass(), "text", null);
        setField(term344439, term344439.getClass(), "defaultIcon", null);
        setField(term344439, term344439.getClass(), "disabledIcon", null);
        setBooleanField(term344439, term344439.getClass(), "disabledIconSet", false);
        setIntField(term344439, term344439.getClass(), "verticalAlignment", 0);
        setIntField(term344439, term344439.getClass(), "horizontalAlignment", 0);
        setIntField(term344439, term344439.getClass(), "verticalTextPosition", 0);
        setIntField(term344439, term344439.getClass(), "horizontalTextPosition", 0);
        setIntField(term344439, term344439.getClass(), "iconTextGap", 0);
        setField(term344439, term344439.getClass(), "labelFor", null);
        setBooleanField(term344439, term344439.getClass(), "isAlignmentXSet", false);
        setFloatField(term344439, term344439.getClass(), "alignmentX", 0.0F);
        setBooleanField(term344439, term344439.getClass(), "isAlignmentYSet", false);
        setFloatField(term344439, term344439.getClass(), "alignmentY", 0.0F);
        setField(term344439, term344439.getClass(), "ui", null);
        setField(term344439, term344439.getClass(), "listenerList", null);
        setField(term344439, term344439.getClass(), "clientProperties", null);
        setField(term344439, term344439.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term344439, term344439.getClass(), "autoscrolls", false);
        setField(term344439, term344439.getClass(), "border", null);
        setIntField(term344439, term344439.getClass(), "flags", 0);
        setField(term344439, term344439.getClass(), "inputVerifier", null);
        setBooleanField(term344439, term344439.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term344439, term344439.getClass(), "paintingChild", null);
        setField(term344439, term344439.getClass(), "popupMenu", null);
        setField(term344439, term344439.getClass(), "revalidateRunnableScheduled", null);
        setField(term344439, term344439.getClass(), "focusInputMap", null);
        setField(term344439, term344439.getClass(), "ancestorInputMap", null);
        setField(term344439, term344439.getClass(), "windowInputMap", null);
        setField(term344439, term344439.getClass(), "actionMap", null);
        setField(term344439, term344439.getClass(), "aaHint", null);
        setField(term344439, term344439.getClass(), "lcdRenderingHint", null);
        setField(term344439, term344439.getClass(), "component", null);
        setField(term344439, term344439.getClass(), "layoutMgr", null);
        setField(term344439, term344439.getClass(), "dispatcher", null);
        setField(term344439, term344439.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term344439, term344439.getClass(), "focusCycleRoot", false);
        setBooleanField(term344439, term344439.getClass(), "focusTraversalPolicyProvider", false);
        setField(term344439, term344439.getClass(), "printingThreads", null);
        setBooleanField(term344439, term344439.getClass(), "printing", false);
        setField(term344439, term344439.getClass(), "containerListener", null);
        setIntField(term344439, term344439.getClass(), "listeningChildren", 0);
        setIntField(term344439, term344439.getClass(), "listeningBoundsChildren", 0);
        setIntField(term344439, term344439.getClass(), "descendantsCount", 0);
        setField(term344439, term344439.getClass(), "preserveBackgroundColor", null);
        setIntField(term344439, term344439.getClass(), "numOfHWComponents", 0);
        setIntField(term344439, term344439.getClass(), "numOfLWComponents", 0);
        setField(term344439, term344439.getClass(), "modalComp", null);
        setField(term344439, term344439.getClass(), "modalAppContext", null);
        setIntField(term344439, term344439.getClass(), "containerSerializedDataVersion", 0);
        setField(term344439, term344439.getClass(), "peer", null);
        setField(term344439, term344439.getClass(), "parent", null);
        setField(term344439, term344439.getClass(), "appContext", null);
        setIntField(term344439, term344439.getClass(), "x", 0);
        setIntField(term344439, term344439.getClass(), "y", 0);
        setIntField(term344439, term344439.getClass(), "width", 0);
        setIntField(term344439, term344439.getClass(), "height", 0);
        setField(term344439, term344439.getClass(), "foreground", null);
        setField(term344439, term344439.getClass(), "background", null);
        setField(term344439, term344439.getClass(), "font", null);
        setField(term344439, term344439.getClass(), "peerFont", null);
        setField(term344439, term344439.getClass(), "cursor", null);
        setField(term344439, term344439.getClass(), "locale", null);
        setField(term344439, term344439.getClass(), "graphicsConfig", null);
        setField(term344439, term344439.getClass(), "bufferStrategy", null);
        setBooleanField(term344439, term344439.getClass(), "ignoreRepaint", false);
        setBooleanField(term344439, term344439.getClass(), "visible", false);
        setBooleanField(term344439, term344439.getClass(), "enabled", false);
        setBooleanField(term344439, term344439.getClass(), "valid", false);
        setField(term344439, term344439.getClass(), "dropTarget", null);
        setField(term344439, term344439.getClass(), "popups", null);
        setField(term344439, term344439.getClass(), "name", null);
        setBooleanField(term344439, term344439.getClass(), "nameExplicitlySet", false);
        setBooleanField(term344439, term344439.getClass(), "focusable", false);
        setIntField(term344439, term344439.getClass(), "isFocusTraversableOverridden", 0);
        setField(term344439, term344439.getClass(), "focusTraversalKeys", null);
        setBooleanField(term344439, term344439.getClass(), "focusTraversalKeysEnabled", false);
        setField(term344439, term344439.getClass(), "acc", null);
        setField(term344439, term344439.getClass(), "minSize", null);
        setBooleanField(term344439, term344439.getClass(), "minSizeSet", false);
        setField(term344439, term344439.getClass(), "prefSize", null);
        setBooleanField(term344439, term344439.getClass(), "prefSizeSet", false);
        setField(term344439, term344439.getClass(), "maxSize", null);
        setBooleanField(term344439, term344439.getClass(), "maxSizeSet", false);
        setField(term344439, term344439.getClass(), "componentOrientation", null);
        setBooleanField(term344439, term344439.getClass(), "newEventsOnly", false);
        setField(term344439, term344439.getClass(), "componentListener", null);
        setField(term344439, term344439.getClass(), "focusListener", null);
        setField(term344439, term344439.getClass(), "hierarchyListener", null);
        setField(term344439, term344439.getClass(), "hierarchyBoundsListener", null);
        setField(term344439, term344439.getClass(), "keyListener", null);
        setField(term344439, term344439.getClass(), "mouseListener", null);
        setField(term344439, term344439.getClass(), "mouseMotionListener", null);
        setField(term344439, term344439.getClass(), "mouseWheelListener", null);
        setField(term344439, term344439.getClass(), "inputMethodListener", null);
        setLongField(term344439, term344439.getClass(), "eventMask", 0L);
        setField(term344439, term344439.getClass(), "changeSupport", null);
        setField(term344439, term344439.getClass(), "objectLock", null);
        setBooleanField(term344439, term344439.getClass(), "isPacked", false);
        setIntField(term344439, term344439.getClass(), "boundsOp", 0);
        setField(term344439, term344439.getClass(), "compoundShape", null);
        setField(term344439, term344439.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term344439, term344439.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term344439, term344439.getClass(), "backgroundEraseDisabled", false);
        setField(term344439, term344439.getClass(), "eventCache", null);
        setBooleanField(term344439, term344439.getClass(), "coalescingEnabled", false);
        setBooleanField(term344439, term344439.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term344439, term344439.getClass(), "componentSerializedDataVersion", 0);
        setField(term344439, term344439.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JTable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUnsortedColumnProperties", argTypes, term344439, args);
    }

};


