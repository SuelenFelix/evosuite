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
     Object term246817;

    public TreeTableHeaderRenderer_getSortDescendingIcon_47373086822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246817 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term246817, term246817.getClass(), "sortIconBorder", null);
        setField(term246817, term246817.getClass(), "paintLabel", null);
        setBooleanField(term246817, term246817.getClass(), "boldOnSorted", false);
        setBooleanField(term246817, term246817.getClass(), "showNumber", false);
        setField(term246817, term246817.getClass(), "sortAscendingIcon", null);
        setField(term246817, term246817.getClass(), "sortDescendingIcon", null);
        setField(term246817, term246817.getClass(), "cachedHeaderFont", null);
        setField(term246817, term246817.getClass(), "boldHeaderFont", null);
        setIntField(term246817, term246817.getClass(), "sortOrderNumber", 0);
        setField(term246817, term246817.getClass(), "sortOrder", null);
        setIntField(term246817, term246817.getClass(), "maxIconWidth", 0);
        setIntField(term246817, term246817.getClass(), "sortNumberTextWidth", 0);
        setIntField(term246817, term246817.getClass(), "mnemonic", 0);
        setIntField(term246817, term246817.getClass(), "mnemonicIndex", 0);
        setField(term246817, term246817.getClass(), "text", null);
        setField(term246817, term246817.getClass(), "defaultIcon", null);
        setField(term246817, term246817.getClass(), "disabledIcon", null);
        setBooleanField(term246817, term246817.getClass(), "disabledIconSet", false);
        setIntField(term246817, term246817.getClass(), "verticalAlignment", 0);
        setIntField(term246817, term246817.getClass(), "horizontalAlignment", 0);
        setIntField(term246817, term246817.getClass(), "verticalTextPosition", 0);
        setIntField(term246817, term246817.getClass(), "horizontalTextPosition", 0);
        setIntField(term246817, term246817.getClass(), "iconTextGap", 0);
        setField(term246817, term246817.getClass(), "labelFor", null);
        setBooleanField(term246817, term246817.getClass(), "isAlignmentXSet", false);
        setFloatField(term246817, term246817.getClass(), "alignmentX", 0.0F);
        setBooleanField(term246817, term246817.getClass(), "isAlignmentYSet", false);
        setFloatField(term246817, term246817.getClass(), "alignmentY", 0.0F);
        setField(term246817, term246817.getClass(), "ui", null);
        setField(term246817, term246817.getClass(), "listenerList", null);
        setField(term246817, term246817.getClass(), "clientProperties", null);
        setField(term246817, term246817.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term246817, term246817.getClass(), "autoscrolls", false);
        setField(term246817, term246817.getClass(), "border", null);
        setIntField(term246817, term246817.getClass(), "flags", 0);
        setField(term246817, term246817.getClass(), "inputVerifier", null);
        setBooleanField(term246817, term246817.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term246817, term246817.getClass(), "paintingChild", null);
        setField(term246817, term246817.getClass(), "popupMenu", null);
        setField(term246817, term246817.getClass(), "revalidateRunnableScheduled", null);
        setField(term246817, term246817.getClass(), "focusInputMap", null);
        setField(term246817, term246817.getClass(), "ancestorInputMap", null);
        setField(term246817, term246817.getClass(), "windowInputMap", null);
        setField(term246817, term246817.getClass(), "actionMap", null);
        setField(term246817, term246817.getClass(), "aaHint", null);
        setField(term246817, term246817.getClass(), "lcdRenderingHint", null);
        setField(term246817, term246817.getClass(), "component", null);
        setField(term246817, term246817.getClass(), "layoutMgr", null);
        setField(term246817, term246817.getClass(), "dispatcher", null);
        setField(term246817, term246817.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term246817, term246817.getClass(), "focusCycleRoot", false);
        setBooleanField(term246817, term246817.getClass(), "focusTraversalPolicyProvider", false);
        setField(term246817, term246817.getClass(), "printingThreads", null);
        setBooleanField(term246817, term246817.getClass(), "printing", false);
        setField(term246817, term246817.getClass(), "containerListener", null);
        setIntField(term246817, term246817.getClass(), "listeningChildren", 0);
        setIntField(term246817, term246817.getClass(), "listeningBoundsChildren", 0);
        setIntField(term246817, term246817.getClass(), "descendantsCount", 0);
        setField(term246817, term246817.getClass(), "preserveBackgroundColor", null);
        setIntField(term246817, term246817.getClass(), "numOfHWComponents", 0);
        setIntField(term246817, term246817.getClass(), "numOfLWComponents", 0);
        setField(term246817, term246817.getClass(), "modalComp", null);
        setField(term246817, term246817.getClass(), "modalAppContext", null);
        setIntField(term246817, term246817.getClass(), "containerSerializedDataVersion", 0);
        setField(term246817, term246817.getClass(), "peer", null);
        setField(term246817, term246817.getClass(), "parent", null);
        setField(term246817, term246817.getClass(), "appContext", null);
        setIntField(term246817, term246817.getClass(), "x", 0);
        setIntField(term246817, term246817.getClass(), "y", 0);
        setIntField(term246817, term246817.getClass(), "width", 0);
        setIntField(term246817, term246817.getClass(), "height", 0);
        setField(term246817, term246817.getClass(), "foreground", null);
        setField(term246817, term246817.getClass(), "background", null);
        setField(term246817, term246817.getClass(), "font", null);
        setField(term246817, term246817.getClass(), "peerFont", null);
        setField(term246817, term246817.getClass(), "cursor", null);
        setField(term246817, term246817.getClass(), "locale", null);
        setField(term246817, term246817.getClass(), "graphicsConfig", null);
        setField(term246817, term246817.getClass(), "bufferStrategy", null);
        setBooleanField(term246817, term246817.getClass(), "ignoreRepaint", false);
        setBooleanField(term246817, term246817.getClass(), "visible", false);
        setBooleanField(term246817, term246817.getClass(), "enabled", false);
        setBooleanField(term246817, term246817.getClass(), "valid", false);
        setField(term246817, term246817.getClass(), "dropTarget", null);
        setField(term246817, term246817.getClass(), "popups", null);
        setField(term246817, term246817.getClass(), "name", null);
        setBooleanField(term246817, term246817.getClass(), "nameExplicitlySet", false);
        setBooleanField(term246817, term246817.getClass(), "focusable", false);
        setIntField(term246817, term246817.getClass(), "isFocusTraversableOverridden", 0);
        setField(term246817, term246817.getClass(), "focusTraversalKeys", null);
        setBooleanField(term246817, term246817.getClass(), "focusTraversalKeysEnabled", false);
        setField(term246817, term246817.getClass(), "acc", null);
        setField(term246817, term246817.getClass(), "minSize", null);
        setBooleanField(term246817, term246817.getClass(), "minSizeSet", false);
        setField(term246817, term246817.getClass(), "prefSize", null);
        setBooleanField(term246817, term246817.getClass(), "prefSizeSet", false);
        setField(term246817, term246817.getClass(), "maxSize", null);
        setBooleanField(term246817, term246817.getClass(), "maxSizeSet", false);
        setField(term246817, term246817.getClass(), "componentOrientation", null);
        setBooleanField(term246817, term246817.getClass(), "newEventsOnly", false);
        setField(term246817, term246817.getClass(), "componentListener", null);
        setField(term246817, term246817.getClass(), "focusListener", null);
        setField(term246817, term246817.getClass(), "hierarchyListener", null);
        setField(term246817, term246817.getClass(), "hierarchyBoundsListener", null);
        setField(term246817, term246817.getClass(), "keyListener", null);
        setField(term246817, term246817.getClass(), "mouseListener", null);
        setField(term246817, term246817.getClass(), "mouseMotionListener", null);
        setField(term246817, term246817.getClass(), "mouseWheelListener", null);
        setField(term246817, term246817.getClass(), "inputMethodListener", null);
        setLongField(term246817, term246817.getClass(), "eventMask", 0L);
        setField(term246817, term246817.getClass(), "changeSupport", null);
        setField(term246817, term246817.getClass(), "objectLock", null);
        setBooleanField(term246817, term246817.getClass(), "isPacked", false);
        setIntField(term246817, term246817.getClass(), "boundsOp", 0);
        setField(term246817, term246817.getClass(), "compoundShape", null);
        setField(term246817, term246817.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term246817, term246817.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term246817, term246817.getClass(), "backgroundEraseDisabled", false);
        setField(term246817, term246817.getClass(), "eventCache", null);
        setBooleanField(term246817, term246817.getClass(), "coalescingEnabled", false);
        setBooleanField(term246817, term246817.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term246817, term246817.getClass(), "componentSerializedDataVersion", 0);
        setField(term246817, term246817.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortDescendingIcon", argTypes, term246817, args);
    }

};


