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
     Object term259200;

    public TreeTableHeaderRenderer_getSortIconBorder_74021739824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259200 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term259200, term259200.getClass(), "sortIconBorder", null);
        setField(term259200, term259200.getClass(), "paintLabel", null);
        setBooleanField(term259200, term259200.getClass(), "boldOnSorted", false);
        setBooleanField(term259200, term259200.getClass(), "showNumber", false);
        setField(term259200, term259200.getClass(), "sortAscendingIcon", null);
        setField(term259200, term259200.getClass(), "sortDescendingIcon", null);
        setField(term259200, term259200.getClass(), "cachedHeaderFont", null);
        setField(term259200, term259200.getClass(), "boldHeaderFont", null);
        setIntField(term259200, term259200.getClass(), "sortOrderNumber", 0);
        setField(term259200, term259200.getClass(), "sortOrder", null);
        setIntField(term259200, term259200.getClass(), "maxIconWidth", 0);
        setIntField(term259200, term259200.getClass(), "sortNumberTextWidth", 0);
        setIntField(term259200, term259200.getClass(), "mnemonic", 0);
        setIntField(term259200, term259200.getClass(), "mnemonicIndex", 0);
        setField(term259200, term259200.getClass(), "text", null);
        setField(term259200, term259200.getClass(), "defaultIcon", null);
        setField(term259200, term259200.getClass(), "disabledIcon", null);
        setBooleanField(term259200, term259200.getClass(), "disabledIconSet", false);
        setIntField(term259200, term259200.getClass(), "verticalAlignment", 0);
        setIntField(term259200, term259200.getClass(), "horizontalAlignment", 0);
        setIntField(term259200, term259200.getClass(), "verticalTextPosition", 0);
        setIntField(term259200, term259200.getClass(), "horizontalTextPosition", 0);
        setIntField(term259200, term259200.getClass(), "iconTextGap", 0);
        setField(term259200, term259200.getClass(), "labelFor", null);
        setBooleanField(term259200, term259200.getClass(), "isAlignmentXSet", false);
        setFloatField(term259200, term259200.getClass(), "alignmentX", 0.0F);
        setBooleanField(term259200, term259200.getClass(), "isAlignmentYSet", false);
        setFloatField(term259200, term259200.getClass(), "alignmentY", 0.0F);
        setField(term259200, term259200.getClass(), "ui", null);
        setField(term259200, term259200.getClass(), "listenerList", null);
        setField(term259200, term259200.getClass(), "clientProperties", null);
        setField(term259200, term259200.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term259200, term259200.getClass(), "autoscrolls", false);
        setField(term259200, term259200.getClass(), "border", null);
        setIntField(term259200, term259200.getClass(), "flags", 0);
        setField(term259200, term259200.getClass(), "inputVerifier", null);
        setBooleanField(term259200, term259200.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term259200, term259200.getClass(), "paintingChild", null);
        setField(term259200, term259200.getClass(), "popupMenu", null);
        setField(term259200, term259200.getClass(), "revalidateRunnableScheduled", null);
        setField(term259200, term259200.getClass(), "focusInputMap", null);
        setField(term259200, term259200.getClass(), "ancestorInputMap", null);
        setField(term259200, term259200.getClass(), "windowInputMap", null);
        setField(term259200, term259200.getClass(), "actionMap", null);
        setField(term259200, term259200.getClass(), "aaHint", null);
        setField(term259200, term259200.getClass(), "lcdRenderingHint", null);
        setField(term259200, term259200.getClass(), "component", null);
        setField(term259200, term259200.getClass(), "layoutMgr", null);
        setField(term259200, term259200.getClass(), "dispatcher", null);
        setField(term259200, term259200.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term259200, term259200.getClass(), "focusCycleRoot", false);
        setBooleanField(term259200, term259200.getClass(), "focusTraversalPolicyProvider", false);
        setField(term259200, term259200.getClass(), "printingThreads", null);
        setBooleanField(term259200, term259200.getClass(), "printing", false);
        setField(term259200, term259200.getClass(), "containerListener", null);
        setIntField(term259200, term259200.getClass(), "listeningChildren", 0);
        setIntField(term259200, term259200.getClass(), "listeningBoundsChildren", 0);
        setIntField(term259200, term259200.getClass(), "descendantsCount", 0);
        setField(term259200, term259200.getClass(), "preserveBackgroundColor", null);
        setIntField(term259200, term259200.getClass(), "numOfHWComponents", 0);
        setIntField(term259200, term259200.getClass(), "numOfLWComponents", 0);
        setField(term259200, term259200.getClass(), "modalComp", null);
        setField(term259200, term259200.getClass(), "modalAppContext", null);
        setIntField(term259200, term259200.getClass(), "containerSerializedDataVersion", 0);
        setField(term259200, term259200.getClass(), "peer", null);
        setField(term259200, term259200.getClass(), "parent", null);
        setField(term259200, term259200.getClass(), "appContext", null);
        setIntField(term259200, term259200.getClass(), "x", 0);
        setIntField(term259200, term259200.getClass(), "y", 0);
        setIntField(term259200, term259200.getClass(), "width", 0);
        setIntField(term259200, term259200.getClass(), "height", 0);
        setField(term259200, term259200.getClass(), "foreground", null);
        setField(term259200, term259200.getClass(), "background", null);
        setField(term259200, term259200.getClass(), "font", null);
        setField(term259200, term259200.getClass(), "peerFont", null);
        setField(term259200, term259200.getClass(), "cursor", null);
        setField(term259200, term259200.getClass(), "locale", null);
        setField(term259200, term259200.getClass(), "graphicsConfig", null);
        setField(term259200, term259200.getClass(), "bufferStrategy", null);
        setBooleanField(term259200, term259200.getClass(), "ignoreRepaint", false);
        setBooleanField(term259200, term259200.getClass(), "visible", false);
        setBooleanField(term259200, term259200.getClass(), "enabled", false);
        setBooleanField(term259200, term259200.getClass(), "valid", false);
        setField(term259200, term259200.getClass(), "dropTarget", null);
        setField(term259200, term259200.getClass(), "popups", null);
        setField(term259200, term259200.getClass(), "name", null);
        setBooleanField(term259200, term259200.getClass(), "nameExplicitlySet", false);
        setBooleanField(term259200, term259200.getClass(), "focusable", false);
        setIntField(term259200, term259200.getClass(), "isFocusTraversableOverridden", 0);
        setField(term259200, term259200.getClass(), "focusTraversalKeys", null);
        setBooleanField(term259200, term259200.getClass(), "focusTraversalKeysEnabled", false);
        setField(term259200, term259200.getClass(), "acc", null);
        setField(term259200, term259200.getClass(), "minSize", null);
        setBooleanField(term259200, term259200.getClass(), "minSizeSet", false);
        setField(term259200, term259200.getClass(), "prefSize", null);
        setBooleanField(term259200, term259200.getClass(), "prefSizeSet", false);
        setField(term259200, term259200.getClass(), "maxSize", null);
        setBooleanField(term259200, term259200.getClass(), "maxSizeSet", false);
        setField(term259200, term259200.getClass(), "componentOrientation", null);
        setBooleanField(term259200, term259200.getClass(), "newEventsOnly", false);
        setField(term259200, term259200.getClass(), "componentListener", null);
        setField(term259200, term259200.getClass(), "focusListener", null);
        setField(term259200, term259200.getClass(), "hierarchyListener", null);
        setField(term259200, term259200.getClass(), "hierarchyBoundsListener", null);
        setField(term259200, term259200.getClass(), "keyListener", null);
        setField(term259200, term259200.getClass(), "mouseListener", null);
        setField(term259200, term259200.getClass(), "mouseMotionListener", null);
        setField(term259200, term259200.getClass(), "mouseWheelListener", null);
        setField(term259200, term259200.getClass(), "inputMethodListener", null);
        setLongField(term259200, term259200.getClass(), "eventMask", 0L);
        setField(term259200, term259200.getClass(), "changeSupport", null);
        setField(term259200, term259200.getClass(), "objectLock", null);
        setBooleanField(term259200, term259200.getClass(), "isPacked", false);
        setIntField(term259200, term259200.getClass(), "boundsOp", 0);
        setField(term259200, term259200.getClass(), "compoundShape", null);
        setField(term259200, term259200.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term259200, term259200.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term259200, term259200.getClass(), "backgroundEraseDisabled", false);
        setField(term259200, term259200.getClass(), "eventCache", null);
        setBooleanField(term259200, term259200.getClass(), "coalescingEnabled", false);
        setBooleanField(term259200, term259200.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term259200, term259200.getClass(), "componentSerializedDataVersion", 0);
        setField(term259200, term259200.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortIconBorder", argTypes, term259200, args);
    }

};


