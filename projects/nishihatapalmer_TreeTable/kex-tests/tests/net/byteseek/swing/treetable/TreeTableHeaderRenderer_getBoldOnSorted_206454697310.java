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

public class TreeTableHeaderRenderer_getBoldOnSorted_206454697310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172371;

    public TreeTableHeaderRenderer_getBoldOnSorted_206454697310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172371 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term172371, term172371.getClass(), "sortIconBorder", null);
        setField(term172371, term172371.getClass(), "paintLabel", null);
        setBooleanField(term172371, term172371.getClass(), "boldOnSorted", false);
        setBooleanField(term172371, term172371.getClass(), "showNumber", false);
        setField(term172371, term172371.getClass(), "sortAscendingIcon", null);
        setField(term172371, term172371.getClass(), "sortDescendingIcon", null);
        setField(term172371, term172371.getClass(), "cachedHeaderFont", null);
        setField(term172371, term172371.getClass(), "boldHeaderFont", null);
        setIntField(term172371, term172371.getClass(), "sortOrderNumber", 0);
        setField(term172371, term172371.getClass(), "sortOrder", null);
        setIntField(term172371, term172371.getClass(), "maxIconWidth", 0);
        setIntField(term172371, term172371.getClass(), "sortNumberTextWidth", 0);
        setIntField(term172371, term172371.getClass(), "mnemonic", 0);
        setIntField(term172371, term172371.getClass(), "mnemonicIndex", 0);
        setField(term172371, term172371.getClass(), "text", null);
        setField(term172371, term172371.getClass(), "defaultIcon", null);
        setField(term172371, term172371.getClass(), "disabledIcon", null);
        setBooleanField(term172371, term172371.getClass(), "disabledIconSet", false);
        setIntField(term172371, term172371.getClass(), "verticalAlignment", 0);
        setIntField(term172371, term172371.getClass(), "horizontalAlignment", 0);
        setIntField(term172371, term172371.getClass(), "verticalTextPosition", 0);
        setIntField(term172371, term172371.getClass(), "horizontalTextPosition", 0);
        setIntField(term172371, term172371.getClass(), "iconTextGap", 0);
        setField(term172371, term172371.getClass(), "labelFor", null);
        setBooleanField(term172371, term172371.getClass(), "isAlignmentXSet", false);
        setFloatField(term172371, term172371.getClass(), "alignmentX", 0.0F);
        setBooleanField(term172371, term172371.getClass(), "isAlignmentYSet", false);
        setFloatField(term172371, term172371.getClass(), "alignmentY", 0.0F);
        setField(term172371, term172371.getClass(), "ui", null);
        setField(term172371, term172371.getClass(), "listenerList", null);
        setField(term172371, term172371.getClass(), "clientProperties", null);
        setField(term172371, term172371.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term172371, term172371.getClass(), "autoscrolls", false);
        setField(term172371, term172371.getClass(), "border", null);
        setIntField(term172371, term172371.getClass(), "flags", 0);
        setField(term172371, term172371.getClass(), "inputVerifier", null);
        setBooleanField(term172371, term172371.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term172371, term172371.getClass(), "paintingChild", null);
        setField(term172371, term172371.getClass(), "popupMenu", null);
        setField(term172371, term172371.getClass(), "revalidateRunnableScheduled", null);
        setField(term172371, term172371.getClass(), "focusInputMap", null);
        setField(term172371, term172371.getClass(), "ancestorInputMap", null);
        setField(term172371, term172371.getClass(), "windowInputMap", null);
        setField(term172371, term172371.getClass(), "actionMap", null);
        setField(term172371, term172371.getClass(), "aaHint", null);
        setField(term172371, term172371.getClass(), "lcdRenderingHint", null);
        setField(term172371, term172371.getClass(), "component", null);
        setField(term172371, term172371.getClass(), "layoutMgr", null);
        setField(term172371, term172371.getClass(), "dispatcher", null);
        setField(term172371, term172371.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term172371, term172371.getClass(), "focusCycleRoot", false);
        setBooleanField(term172371, term172371.getClass(), "focusTraversalPolicyProvider", false);
        setField(term172371, term172371.getClass(), "printingThreads", null);
        setBooleanField(term172371, term172371.getClass(), "printing", false);
        setField(term172371, term172371.getClass(), "containerListener", null);
        setIntField(term172371, term172371.getClass(), "listeningChildren", 0);
        setIntField(term172371, term172371.getClass(), "listeningBoundsChildren", 0);
        setIntField(term172371, term172371.getClass(), "descendantsCount", 0);
        setField(term172371, term172371.getClass(), "preserveBackgroundColor", null);
        setIntField(term172371, term172371.getClass(), "numOfHWComponents", 0);
        setIntField(term172371, term172371.getClass(), "numOfLWComponents", 0);
        setField(term172371, term172371.getClass(), "modalComp", null);
        setField(term172371, term172371.getClass(), "modalAppContext", null);
        setIntField(term172371, term172371.getClass(), "containerSerializedDataVersion", 0);
        setField(term172371, term172371.getClass(), "peer", null);
        setField(term172371, term172371.getClass(), "parent", null);
        setField(term172371, term172371.getClass(), "appContext", null);
        setIntField(term172371, term172371.getClass(), "x", 0);
        setIntField(term172371, term172371.getClass(), "y", 0);
        setIntField(term172371, term172371.getClass(), "width", 0);
        setIntField(term172371, term172371.getClass(), "height", 0);
        setField(term172371, term172371.getClass(), "foreground", null);
        setField(term172371, term172371.getClass(), "background", null);
        setField(term172371, term172371.getClass(), "font", null);
        setField(term172371, term172371.getClass(), "peerFont", null);
        setField(term172371, term172371.getClass(), "cursor", null);
        setField(term172371, term172371.getClass(), "locale", null);
        setField(term172371, term172371.getClass(), "graphicsConfig", null);
        setField(term172371, term172371.getClass(), "bufferStrategy", null);
        setBooleanField(term172371, term172371.getClass(), "ignoreRepaint", false);
        setBooleanField(term172371, term172371.getClass(), "visible", false);
        setBooleanField(term172371, term172371.getClass(), "enabled", false);
        setBooleanField(term172371, term172371.getClass(), "valid", false);
        setField(term172371, term172371.getClass(), "dropTarget", null);
        setField(term172371, term172371.getClass(), "popups", null);
        setField(term172371, term172371.getClass(), "name", null);
        setBooleanField(term172371, term172371.getClass(), "nameExplicitlySet", false);
        setBooleanField(term172371, term172371.getClass(), "focusable", false);
        setIntField(term172371, term172371.getClass(), "isFocusTraversableOverridden", 0);
        setField(term172371, term172371.getClass(), "focusTraversalKeys", null);
        setBooleanField(term172371, term172371.getClass(), "focusTraversalKeysEnabled", false);
        setField(term172371, term172371.getClass(), "acc", null);
        setField(term172371, term172371.getClass(), "minSize", null);
        setBooleanField(term172371, term172371.getClass(), "minSizeSet", false);
        setField(term172371, term172371.getClass(), "prefSize", null);
        setBooleanField(term172371, term172371.getClass(), "prefSizeSet", false);
        setField(term172371, term172371.getClass(), "maxSize", null);
        setBooleanField(term172371, term172371.getClass(), "maxSizeSet", false);
        setField(term172371, term172371.getClass(), "componentOrientation", null);
        setBooleanField(term172371, term172371.getClass(), "newEventsOnly", false);
        setField(term172371, term172371.getClass(), "componentListener", null);
        setField(term172371, term172371.getClass(), "focusListener", null);
        setField(term172371, term172371.getClass(), "hierarchyListener", null);
        setField(term172371, term172371.getClass(), "hierarchyBoundsListener", null);
        setField(term172371, term172371.getClass(), "keyListener", null);
        setField(term172371, term172371.getClass(), "mouseListener", null);
        setField(term172371, term172371.getClass(), "mouseMotionListener", null);
        setField(term172371, term172371.getClass(), "mouseWheelListener", null);
        setField(term172371, term172371.getClass(), "inputMethodListener", null);
        setLongField(term172371, term172371.getClass(), "eventMask", 0L);
        setField(term172371, term172371.getClass(), "changeSupport", null);
        setField(term172371, term172371.getClass(), "objectLock", null);
        setBooleanField(term172371, term172371.getClass(), "isPacked", false);
        setIntField(term172371, term172371.getClass(), "boundsOp", 0);
        setField(term172371, term172371.getClass(), "compoundShape", null);
        setField(term172371, term172371.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term172371, term172371.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term172371, term172371.getClass(), "backgroundEraseDisabled", false);
        setField(term172371, term172371.getClass(), "eventCache", null);
        setBooleanField(term172371, term172371.getClass(), "coalescingEnabled", false);
        setBooleanField(term172371, term172371.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term172371, term172371.getClass(), "componentSerializedDataVersion", 0);
        setField(term172371, term172371.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoldOnSorted", argTypes, term172371, args);
    }

};


