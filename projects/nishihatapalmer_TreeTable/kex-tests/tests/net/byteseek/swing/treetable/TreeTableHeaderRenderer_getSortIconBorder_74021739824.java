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

public class TreeTableHeaderRenderer_getSortIconBorder_74021739824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258900;

    public TreeTableHeaderRenderer_getSortIconBorder_74021739824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258900 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term258900, term258900.getClass(), "sortIconBorder", null);
        setField(term258900, term258900.getClass(), "paintLabel", null);
        setBooleanField(term258900, term258900.getClass(), "boldOnSorted", false);
        setBooleanField(term258900, term258900.getClass(), "showNumber", false);
        setField(term258900, term258900.getClass(), "sortAscendingIcon", null);
        setField(term258900, term258900.getClass(), "sortDescendingIcon", null);
        setField(term258900, term258900.getClass(), "cachedHeaderFont", null);
        setField(term258900, term258900.getClass(), "boldHeaderFont", null);
        setIntField(term258900, term258900.getClass(), "sortOrderNumber", 0);
        setField(term258900, term258900.getClass(), "sortOrder", null);
        setIntField(term258900, term258900.getClass(), "maxIconWidth", 0);
        setIntField(term258900, term258900.getClass(), "sortNumberTextWidth", 0);
        setIntField(term258900, term258900.getClass(), "mnemonic", 0);
        setIntField(term258900, term258900.getClass(), "mnemonicIndex", 0);
        setField(term258900, term258900.getClass(), "text", null);
        setField(term258900, term258900.getClass(), "defaultIcon", null);
        setField(term258900, term258900.getClass(), "disabledIcon", null);
        setBooleanField(term258900, term258900.getClass(), "disabledIconSet", false);
        setIntField(term258900, term258900.getClass(), "verticalAlignment", 0);
        setIntField(term258900, term258900.getClass(), "horizontalAlignment", 0);
        setIntField(term258900, term258900.getClass(), "verticalTextPosition", 0);
        setIntField(term258900, term258900.getClass(), "horizontalTextPosition", 0);
        setIntField(term258900, term258900.getClass(), "iconTextGap", 0);
        setField(term258900, term258900.getClass(), "labelFor", null);
        setBooleanField(term258900, term258900.getClass(), "isAlignmentXSet", false);
        setFloatField(term258900, term258900.getClass(), "alignmentX", 0.0F);
        setBooleanField(term258900, term258900.getClass(), "isAlignmentYSet", false);
        setFloatField(term258900, term258900.getClass(), "alignmentY", 0.0F);
        setField(term258900, term258900.getClass(), "ui", null);
        setField(term258900, term258900.getClass(), "listenerList", null);
        setField(term258900, term258900.getClass(), "clientProperties", null);
        setField(term258900, term258900.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term258900, term258900.getClass(), "autoscrolls", false);
        setField(term258900, term258900.getClass(), "border", null);
        setIntField(term258900, term258900.getClass(), "flags", 0);
        setField(term258900, term258900.getClass(), "inputVerifier", null);
        setBooleanField(term258900, term258900.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term258900, term258900.getClass(), "paintingChild", null);
        setField(term258900, term258900.getClass(), "popupMenu", null);
        setField(term258900, term258900.getClass(), "revalidateRunnableScheduled", null);
        setField(term258900, term258900.getClass(), "focusInputMap", null);
        setField(term258900, term258900.getClass(), "ancestorInputMap", null);
        setField(term258900, term258900.getClass(), "windowInputMap", null);
        setField(term258900, term258900.getClass(), "actionMap", null);
        setField(term258900, term258900.getClass(), "aaHint", null);
        setField(term258900, term258900.getClass(), "lcdRenderingHint", null);
        setField(term258900, term258900.getClass(), "component", null);
        setField(term258900, term258900.getClass(), "layoutMgr", null);
        setField(term258900, term258900.getClass(), "dispatcher", null);
        setField(term258900, term258900.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term258900, term258900.getClass(), "focusCycleRoot", false);
        setBooleanField(term258900, term258900.getClass(), "focusTraversalPolicyProvider", false);
        setField(term258900, term258900.getClass(), "printingThreads", null);
        setBooleanField(term258900, term258900.getClass(), "printing", false);
        setField(term258900, term258900.getClass(), "containerListener", null);
        setIntField(term258900, term258900.getClass(), "listeningChildren", 0);
        setIntField(term258900, term258900.getClass(), "listeningBoundsChildren", 0);
        setIntField(term258900, term258900.getClass(), "descendantsCount", 0);
        setField(term258900, term258900.getClass(), "preserveBackgroundColor", null);
        setIntField(term258900, term258900.getClass(), "numOfHWComponents", 0);
        setIntField(term258900, term258900.getClass(), "numOfLWComponents", 0);
        setField(term258900, term258900.getClass(), "modalComp", null);
        setField(term258900, term258900.getClass(), "modalAppContext", null);
        setIntField(term258900, term258900.getClass(), "containerSerializedDataVersion", 0);
        setField(term258900, term258900.getClass(), "peer", null);
        setField(term258900, term258900.getClass(), "parent", null);
        setField(term258900, term258900.getClass(), "appContext", null);
        setIntField(term258900, term258900.getClass(), "x", 0);
        setIntField(term258900, term258900.getClass(), "y", 0);
        setIntField(term258900, term258900.getClass(), "width", 0);
        setIntField(term258900, term258900.getClass(), "height", 0);
        setField(term258900, term258900.getClass(), "foreground", null);
        setField(term258900, term258900.getClass(), "background", null);
        setField(term258900, term258900.getClass(), "font", null);
        setField(term258900, term258900.getClass(), "peerFont", null);
        setField(term258900, term258900.getClass(), "cursor", null);
        setField(term258900, term258900.getClass(), "locale", null);
        setField(term258900, term258900.getClass(), "graphicsConfig", null);
        setField(term258900, term258900.getClass(), "bufferStrategy", null);
        setBooleanField(term258900, term258900.getClass(), "ignoreRepaint", false);
        setBooleanField(term258900, term258900.getClass(), "visible", false);
        setBooleanField(term258900, term258900.getClass(), "enabled", false);
        setBooleanField(term258900, term258900.getClass(), "valid", false);
        setField(term258900, term258900.getClass(), "dropTarget", null);
        setField(term258900, term258900.getClass(), "popups", null);
        setField(term258900, term258900.getClass(), "name", null);
        setBooleanField(term258900, term258900.getClass(), "nameExplicitlySet", false);
        setBooleanField(term258900, term258900.getClass(), "focusable", false);
        setIntField(term258900, term258900.getClass(), "isFocusTraversableOverridden", 0);
        setField(term258900, term258900.getClass(), "focusTraversalKeys", null);
        setBooleanField(term258900, term258900.getClass(), "focusTraversalKeysEnabled", false);
        setField(term258900, term258900.getClass(), "acc", null);
        setField(term258900, term258900.getClass(), "minSize", null);
        setBooleanField(term258900, term258900.getClass(), "minSizeSet", false);
        setField(term258900, term258900.getClass(), "prefSize", null);
        setBooleanField(term258900, term258900.getClass(), "prefSizeSet", false);
        setField(term258900, term258900.getClass(), "maxSize", null);
        setBooleanField(term258900, term258900.getClass(), "maxSizeSet", false);
        setField(term258900, term258900.getClass(), "componentOrientation", null);
        setBooleanField(term258900, term258900.getClass(), "newEventsOnly", false);
        setField(term258900, term258900.getClass(), "componentListener", null);
        setField(term258900, term258900.getClass(), "focusListener", null);
        setField(term258900, term258900.getClass(), "hierarchyListener", null);
        setField(term258900, term258900.getClass(), "hierarchyBoundsListener", null);
        setField(term258900, term258900.getClass(), "keyListener", null);
        setField(term258900, term258900.getClass(), "mouseListener", null);
        setField(term258900, term258900.getClass(), "mouseMotionListener", null);
        setField(term258900, term258900.getClass(), "mouseWheelListener", null);
        setField(term258900, term258900.getClass(), "inputMethodListener", null);
        setLongField(term258900, term258900.getClass(), "eventMask", 0L);
        setField(term258900, term258900.getClass(), "changeSupport", null);
        setField(term258900, term258900.getClass(), "objectLock", null);
        setBooleanField(term258900, term258900.getClass(), "isPacked", false);
        setIntField(term258900, term258900.getClass(), "boundsOp", 0);
        setField(term258900, term258900.getClass(), "compoundShape", null);
        setField(term258900, term258900.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term258900, term258900.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term258900, term258900.getClass(), "backgroundEraseDisabled", false);
        setField(term258900, term258900.getClass(), "eventCache", null);
        setBooleanField(term258900, term258900.getClass(), "coalescingEnabled", false);
        setBooleanField(term258900, term258900.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term258900, term258900.getClass(), "componentSerializedDataVersion", 0);
        setField(term258900, term258900.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortIconBorder", argTypes, term258900, args);
    }

};


