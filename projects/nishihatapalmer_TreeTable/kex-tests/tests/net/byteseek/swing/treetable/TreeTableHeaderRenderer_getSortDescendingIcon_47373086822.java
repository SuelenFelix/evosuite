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

public class TreeTableHeaderRenderer_getSortDescendingIcon_47373086822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246496;

    public TreeTableHeaderRenderer_getSortDescendingIcon_47373086822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246496 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term246496, term246496.getClass(), "sortIconBorder", null);
        setField(term246496, term246496.getClass(), "paintLabel", null);
        setBooleanField(term246496, term246496.getClass(), "boldOnSorted", false);
        setBooleanField(term246496, term246496.getClass(), "showNumber", false);
        setField(term246496, term246496.getClass(), "sortAscendingIcon", null);
        setField(term246496, term246496.getClass(), "sortDescendingIcon", null);
        setField(term246496, term246496.getClass(), "cachedHeaderFont", null);
        setField(term246496, term246496.getClass(), "boldHeaderFont", null);
        setIntField(term246496, term246496.getClass(), "sortOrderNumber", 0);
        setField(term246496, term246496.getClass(), "sortOrder", null);
        setIntField(term246496, term246496.getClass(), "maxIconWidth", 0);
        setIntField(term246496, term246496.getClass(), "sortNumberTextWidth", 0);
        setIntField(term246496, term246496.getClass(), "mnemonic", 0);
        setIntField(term246496, term246496.getClass(), "mnemonicIndex", 0);
        setField(term246496, term246496.getClass(), "text", null);
        setField(term246496, term246496.getClass(), "defaultIcon", null);
        setField(term246496, term246496.getClass(), "disabledIcon", null);
        setBooleanField(term246496, term246496.getClass(), "disabledIconSet", false);
        setIntField(term246496, term246496.getClass(), "verticalAlignment", 0);
        setIntField(term246496, term246496.getClass(), "horizontalAlignment", 0);
        setIntField(term246496, term246496.getClass(), "verticalTextPosition", 0);
        setIntField(term246496, term246496.getClass(), "horizontalTextPosition", 0);
        setIntField(term246496, term246496.getClass(), "iconTextGap", 0);
        setField(term246496, term246496.getClass(), "labelFor", null);
        setBooleanField(term246496, term246496.getClass(), "isAlignmentXSet", false);
        setFloatField(term246496, term246496.getClass(), "alignmentX", 0.0F);
        setBooleanField(term246496, term246496.getClass(), "isAlignmentYSet", false);
        setFloatField(term246496, term246496.getClass(), "alignmentY", 0.0F);
        setField(term246496, term246496.getClass(), "ui", null);
        setField(term246496, term246496.getClass(), "listenerList", null);
        setField(term246496, term246496.getClass(), "clientProperties", null);
        setField(term246496, term246496.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term246496, term246496.getClass(), "autoscrolls", false);
        setField(term246496, term246496.getClass(), "border", null);
        setIntField(term246496, term246496.getClass(), "flags", 0);
        setField(term246496, term246496.getClass(), "inputVerifier", null);
        setBooleanField(term246496, term246496.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term246496, term246496.getClass(), "paintingChild", null);
        setField(term246496, term246496.getClass(), "popupMenu", null);
        setField(term246496, term246496.getClass(), "revalidateRunnableScheduled", null);
        setField(term246496, term246496.getClass(), "focusInputMap", null);
        setField(term246496, term246496.getClass(), "ancestorInputMap", null);
        setField(term246496, term246496.getClass(), "windowInputMap", null);
        setField(term246496, term246496.getClass(), "actionMap", null);
        setField(term246496, term246496.getClass(), "aaHint", null);
        setField(term246496, term246496.getClass(), "lcdRenderingHint", null);
        setField(term246496, term246496.getClass(), "component", null);
        setField(term246496, term246496.getClass(), "layoutMgr", null);
        setField(term246496, term246496.getClass(), "dispatcher", null);
        setField(term246496, term246496.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term246496, term246496.getClass(), "focusCycleRoot", false);
        setBooleanField(term246496, term246496.getClass(), "focusTraversalPolicyProvider", false);
        setField(term246496, term246496.getClass(), "printingThreads", null);
        setBooleanField(term246496, term246496.getClass(), "printing", false);
        setField(term246496, term246496.getClass(), "containerListener", null);
        setIntField(term246496, term246496.getClass(), "listeningChildren", 0);
        setIntField(term246496, term246496.getClass(), "listeningBoundsChildren", 0);
        setIntField(term246496, term246496.getClass(), "descendantsCount", 0);
        setField(term246496, term246496.getClass(), "preserveBackgroundColor", null);
        setIntField(term246496, term246496.getClass(), "numOfHWComponents", 0);
        setIntField(term246496, term246496.getClass(), "numOfLWComponents", 0);
        setField(term246496, term246496.getClass(), "modalComp", null);
        setField(term246496, term246496.getClass(), "modalAppContext", null);
        setIntField(term246496, term246496.getClass(), "containerSerializedDataVersion", 0);
        setField(term246496, term246496.getClass(), "peer", null);
        setField(term246496, term246496.getClass(), "parent", null);
        setField(term246496, term246496.getClass(), "appContext", null);
        setIntField(term246496, term246496.getClass(), "x", 0);
        setIntField(term246496, term246496.getClass(), "y", 0);
        setIntField(term246496, term246496.getClass(), "width", 0);
        setIntField(term246496, term246496.getClass(), "height", 0);
        setField(term246496, term246496.getClass(), "foreground", null);
        setField(term246496, term246496.getClass(), "background", null);
        setField(term246496, term246496.getClass(), "font", null);
        setField(term246496, term246496.getClass(), "peerFont", null);
        setField(term246496, term246496.getClass(), "cursor", null);
        setField(term246496, term246496.getClass(), "locale", null);
        setField(term246496, term246496.getClass(), "graphicsConfig", null);
        setField(term246496, term246496.getClass(), "bufferStrategy", null);
        setBooleanField(term246496, term246496.getClass(), "ignoreRepaint", false);
        setBooleanField(term246496, term246496.getClass(), "visible", false);
        setBooleanField(term246496, term246496.getClass(), "enabled", false);
        setBooleanField(term246496, term246496.getClass(), "valid", false);
        setField(term246496, term246496.getClass(), "dropTarget", null);
        setField(term246496, term246496.getClass(), "popups", null);
        setField(term246496, term246496.getClass(), "name", null);
        setBooleanField(term246496, term246496.getClass(), "nameExplicitlySet", false);
        setBooleanField(term246496, term246496.getClass(), "focusable", false);
        setIntField(term246496, term246496.getClass(), "isFocusTraversableOverridden", 0);
        setField(term246496, term246496.getClass(), "focusTraversalKeys", null);
        setBooleanField(term246496, term246496.getClass(), "focusTraversalKeysEnabled", false);
        setField(term246496, term246496.getClass(), "acc", null);
        setField(term246496, term246496.getClass(), "minSize", null);
        setBooleanField(term246496, term246496.getClass(), "minSizeSet", false);
        setField(term246496, term246496.getClass(), "prefSize", null);
        setBooleanField(term246496, term246496.getClass(), "prefSizeSet", false);
        setField(term246496, term246496.getClass(), "maxSize", null);
        setBooleanField(term246496, term246496.getClass(), "maxSizeSet", false);
        setField(term246496, term246496.getClass(), "componentOrientation", null);
        setBooleanField(term246496, term246496.getClass(), "newEventsOnly", false);
        setField(term246496, term246496.getClass(), "componentListener", null);
        setField(term246496, term246496.getClass(), "focusListener", null);
        setField(term246496, term246496.getClass(), "hierarchyListener", null);
        setField(term246496, term246496.getClass(), "hierarchyBoundsListener", null);
        setField(term246496, term246496.getClass(), "keyListener", null);
        setField(term246496, term246496.getClass(), "mouseListener", null);
        setField(term246496, term246496.getClass(), "mouseMotionListener", null);
        setField(term246496, term246496.getClass(), "mouseWheelListener", null);
        setField(term246496, term246496.getClass(), "inputMethodListener", null);
        setLongField(term246496, term246496.getClass(), "eventMask", 0L);
        setField(term246496, term246496.getClass(), "changeSupport", null);
        setField(term246496, term246496.getClass(), "objectLock", null);
        setBooleanField(term246496, term246496.getClass(), "isPacked", false);
        setIntField(term246496, term246496.getClass(), "boundsOp", 0);
        setField(term246496, term246496.getClass(), "compoundShape", null);
        setField(term246496, term246496.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term246496, term246496.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term246496, term246496.getClass(), "backgroundEraseDisabled", false);
        setField(term246496, term246496.getClass(), "eventCache", null);
        setBooleanField(term246496, term246496.getClass(), "coalescingEnabled", false);
        setBooleanField(term246496, term246496.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term246496, term246496.getClass(), "componentSerializedDataVersion", 0);
        setField(term246496, term246496.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortDescendingIcon", argTypes, term246496, args);
    }

};


