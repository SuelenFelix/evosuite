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
import java.lang.Boolean;

public class TreeTableHeaderRenderer_setBoldOnSorted_12938937978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159631;
     Object term159685;

    public TreeTableHeaderRenderer_setBoldOnSorted_12938937978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159631 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term159631, term159631.getClass(), "sortIconBorder", null);
        setField(term159631, term159631.getClass(), "paintLabel", null);
        setBooleanField(term159631, term159631.getClass(), "boldOnSorted", false);
        setBooleanField(term159631, term159631.getClass(), "showNumber", false);
        setField(term159631, term159631.getClass(), "sortAscendingIcon", null);
        setField(term159631, term159631.getClass(), "sortDescendingIcon", null);
        setField(term159631, term159631.getClass(), "cachedHeaderFont", null);
        setField(term159631, term159631.getClass(), "boldHeaderFont", null);
        setIntField(term159631, term159631.getClass(), "sortOrderNumber", 0);
        setField(term159631, term159631.getClass(), "sortOrder", null);
        setIntField(term159631, term159631.getClass(), "maxIconWidth", 0);
        setIntField(term159631, term159631.getClass(), "sortNumberTextWidth", 0);
        setIntField(term159631, term159631.getClass(), "mnemonic", 0);
        setIntField(term159631, term159631.getClass(), "mnemonicIndex", 0);
        setField(term159631, term159631.getClass(), "text", null);
        setField(term159631, term159631.getClass(), "defaultIcon", null);
        setField(term159631, term159631.getClass(), "disabledIcon", null);
        setBooleanField(term159631, term159631.getClass(), "disabledIconSet", false);
        setIntField(term159631, term159631.getClass(), "verticalAlignment", 0);
        setIntField(term159631, term159631.getClass(), "horizontalAlignment", 0);
        setIntField(term159631, term159631.getClass(), "verticalTextPosition", 0);
        setIntField(term159631, term159631.getClass(), "horizontalTextPosition", 0);
        setIntField(term159631, term159631.getClass(), "iconTextGap", 0);
        setField(term159631, term159631.getClass(), "labelFor", null);
        setBooleanField(term159631, term159631.getClass(), "isAlignmentXSet", false);
        setFloatField(term159631, term159631.getClass(), "alignmentX", 0.0F);
        setBooleanField(term159631, term159631.getClass(), "isAlignmentYSet", false);
        setFloatField(term159631, term159631.getClass(), "alignmentY", 0.0F);
        setField(term159631, term159631.getClass(), "ui", null);
        setField(term159631, term159631.getClass(), "listenerList", null);
        setField(term159631, term159631.getClass(), "clientProperties", null);
        setField(term159631, term159631.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term159631, term159631.getClass(), "autoscrolls", false);
        setField(term159631, term159631.getClass(), "border", null);
        setIntField(term159631, term159631.getClass(), "flags", 0);
        setField(term159631, term159631.getClass(), "inputVerifier", null);
        setBooleanField(term159631, term159631.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term159631, term159631.getClass(), "paintingChild", null);
        setField(term159631, term159631.getClass(), "popupMenu", null);
        setField(term159631, term159631.getClass(), "revalidateRunnableScheduled", null);
        setField(term159631, term159631.getClass(), "focusInputMap", null);
        setField(term159631, term159631.getClass(), "ancestorInputMap", null);
        setField(term159631, term159631.getClass(), "windowInputMap", null);
        setField(term159631, term159631.getClass(), "actionMap", null);
        setField(term159631, term159631.getClass(), "aaHint", null);
        setField(term159631, term159631.getClass(), "lcdRenderingHint", null);
        setField(term159631, term159631.getClass(), "component", null);
        setField(term159631, term159631.getClass(), "layoutMgr", null);
        setField(term159631, term159631.getClass(), "dispatcher", null);
        setField(term159631, term159631.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term159631, term159631.getClass(), "focusCycleRoot", false);
        setBooleanField(term159631, term159631.getClass(), "focusTraversalPolicyProvider", false);
        setField(term159631, term159631.getClass(), "printingThreads", null);
        setBooleanField(term159631, term159631.getClass(), "printing", false);
        setField(term159631, term159631.getClass(), "containerListener", null);
        setIntField(term159631, term159631.getClass(), "listeningChildren", 0);
        setIntField(term159631, term159631.getClass(), "listeningBoundsChildren", 0);
        setIntField(term159631, term159631.getClass(), "descendantsCount", 0);
        setField(term159631, term159631.getClass(), "preserveBackgroundColor", null);
        setIntField(term159631, term159631.getClass(), "numOfHWComponents", 0);
        setIntField(term159631, term159631.getClass(), "numOfLWComponents", 0);
        setField(term159631, term159631.getClass(), "modalComp", null);
        setField(term159631, term159631.getClass(), "modalAppContext", null);
        setIntField(term159631, term159631.getClass(), "containerSerializedDataVersion", 0);
        setField(term159631, term159631.getClass(), "peer", null);
        setField(term159631, term159631.getClass(), "parent", null);
        setField(term159631, term159631.getClass(), "appContext", null);
        setIntField(term159631, term159631.getClass(), "x", 0);
        setIntField(term159631, term159631.getClass(), "y", 0);
        setIntField(term159631, term159631.getClass(), "width", 0);
        setIntField(term159631, term159631.getClass(), "height", 0);
        setField(term159631, term159631.getClass(), "foreground", null);
        setField(term159631, term159631.getClass(), "background", null);
        setField(term159631, term159631.getClass(), "font", null);
        setField(term159631, term159631.getClass(), "peerFont", null);
        setField(term159631, term159631.getClass(), "cursor", null);
        setField(term159631, term159631.getClass(), "locale", null);
        setField(term159631, term159631.getClass(), "graphicsConfig", null);
        setField(term159631, term159631.getClass(), "bufferStrategy", null);
        setBooleanField(term159631, term159631.getClass(), "ignoreRepaint", false);
        setBooleanField(term159631, term159631.getClass(), "visible", false);
        setBooleanField(term159631, term159631.getClass(), "enabled", false);
        setBooleanField(term159631, term159631.getClass(), "valid", false);
        setField(term159631, term159631.getClass(), "dropTarget", null);
        setField(term159631, term159631.getClass(), "popups", null);
        setField(term159631, term159631.getClass(), "name", null);
        setBooleanField(term159631, term159631.getClass(), "nameExplicitlySet", false);
        setBooleanField(term159631, term159631.getClass(), "focusable", false);
        setIntField(term159631, term159631.getClass(), "isFocusTraversableOverridden", 0);
        setField(term159631, term159631.getClass(), "focusTraversalKeys", null);
        setBooleanField(term159631, term159631.getClass(), "focusTraversalKeysEnabled", false);
        setField(term159631, term159631.getClass(), "acc", null);
        setField(term159631, term159631.getClass(), "minSize", null);
        setBooleanField(term159631, term159631.getClass(), "minSizeSet", false);
        setField(term159631, term159631.getClass(), "prefSize", null);
        setBooleanField(term159631, term159631.getClass(), "prefSizeSet", false);
        setField(term159631, term159631.getClass(), "maxSize", null);
        setBooleanField(term159631, term159631.getClass(), "maxSizeSet", false);
        setField(term159631, term159631.getClass(), "componentOrientation", null);
        setBooleanField(term159631, term159631.getClass(), "newEventsOnly", false);
        setField(term159631, term159631.getClass(), "componentListener", null);
        setField(term159631, term159631.getClass(), "focusListener", null);
        setField(term159631, term159631.getClass(), "hierarchyListener", null);
        setField(term159631, term159631.getClass(), "hierarchyBoundsListener", null);
        setField(term159631, term159631.getClass(), "keyListener", null);
        setField(term159631, term159631.getClass(), "mouseListener", null);
        setField(term159631, term159631.getClass(), "mouseMotionListener", null);
        setField(term159631, term159631.getClass(), "mouseWheelListener", null);
        setField(term159631, term159631.getClass(), "inputMethodListener", null);
        setLongField(term159631, term159631.getClass(), "eventMask", 0L);
        setField(term159631, term159631.getClass(), "changeSupport", null);
        setField(term159631, term159631.getClass(), "objectLock", null);
        setBooleanField(term159631, term159631.getClass(), "isPacked", false);
        setIntField(term159631, term159631.getClass(), "boundsOp", 0);
        setField(term159631, term159631.getClass(), "compoundShape", null);
        setField(term159631, term159631.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term159631, term159631.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term159631, term159631.getClass(), "backgroundEraseDisabled", false);
        setField(term159631, term159631.getClass(), "eventCache", null);
        setBooleanField(term159631, term159631.getClass(), "coalescingEnabled", false);
        setBooleanField(term159631, term159631.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term159631, term159631.getClass(), "componentSerializedDataVersion", 0);
        setField(term159631, term159631.getClass(), "accessibleContext", null);
        term159685 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term159685;
        callMethod(klass, "setBoldOnSorted", argTypes, term159631, args);
    }

};


