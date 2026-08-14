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
import java.lang.Integer;

public class TreeTableHeaderRenderer_setColumnSortedProperties_28125867832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312024;
     Object term312078;

    public TreeTableHeaderRenderer_setColumnSortedProperties_28125867832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312024 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term312024, term312024.getClass(), "sortIconBorder", null);
        setField(term312024, term312024.getClass(), "paintLabel", null);
        setBooleanField(term312024, term312024.getClass(), "boldOnSorted", false);
        setBooleanField(term312024, term312024.getClass(), "showNumber", false);
        setField(term312024, term312024.getClass(), "sortAscendingIcon", null);
        setField(term312024, term312024.getClass(), "sortDescendingIcon", null);
        setField(term312024, term312024.getClass(), "cachedHeaderFont", null);
        setField(term312024, term312024.getClass(), "boldHeaderFont", null);
        setIntField(term312024, term312024.getClass(), "sortOrderNumber", 0);
        setField(term312024, term312024.getClass(), "sortOrder", null);
        setIntField(term312024, term312024.getClass(), "maxIconWidth", 0);
        setIntField(term312024, term312024.getClass(), "sortNumberTextWidth", 0);
        setIntField(term312024, term312024.getClass(), "mnemonic", 0);
        setIntField(term312024, term312024.getClass(), "mnemonicIndex", 0);
        setField(term312024, term312024.getClass(), "text", null);
        setField(term312024, term312024.getClass(), "defaultIcon", null);
        setField(term312024, term312024.getClass(), "disabledIcon", null);
        setBooleanField(term312024, term312024.getClass(), "disabledIconSet", false);
        setIntField(term312024, term312024.getClass(), "verticalAlignment", 0);
        setIntField(term312024, term312024.getClass(), "horizontalAlignment", 0);
        setIntField(term312024, term312024.getClass(), "verticalTextPosition", 0);
        setIntField(term312024, term312024.getClass(), "horizontalTextPosition", 0);
        setIntField(term312024, term312024.getClass(), "iconTextGap", 0);
        setField(term312024, term312024.getClass(), "labelFor", null);
        setBooleanField(term312024, term312024.getClass(), "isAlignmentXSet", false);
        setFloatField(term312024, term312024.getClass(), "alignmentX", 0.0F);
        setBooleanField(term312024, term312024.getClass(), "isAlignmentYSet", false);
        setFloatField(term312024, term312024.getClass(), "alignmentY", 0.0F);
        setField(term312024, term312024.getClass(), "ui", null);
        setField(term312024, term312024.getClass(), "listenerList", null);
        setField(term312024, term312024.getClass(), "clientProperties", null);
        setField(term312024, term312024.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term312024, term312024.getClass(), "autoscrolls", false);
        setField(term312024, term312024.getClass(), "border", null);
        setIntField(term312024, term312024.getClass(), "flags", 0);
        setField(term312024, term312024.getClass(), "inputVerifier", null);
        setBooleanField(term312024, term312024.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term312024, term312024.getClass(), "paintingChild", null);
        setField(term312024, term312024.getClass(), "popupMenu", null);
        setField(term312024, term312024.getClass(), "revalidateRunnableScheduled", null);
        setField(term312024, term312024.getClass(), "focusInputMap", null);
        setField(term312024, term312024.getClass(), "ancestorInputMap", null);
        setField(term312024, term312024.getClass(), "windowInputMap", null);
        setField(term312024, term312024.getClass(), "actionMap", null);
        setField(term312024, term312024.getClass(), "aaHint", null);
        setField(term312024, term312024.getClass(), "lcdRenderingHint", null);
        setField(term312024, term312024.getClass(), "component", null);
        setField(term312024, term312024.getClass(), "layoutMgr", null);
        setField(term312024, term312024.getClass(), "dispatcher", null);
        setField(term312024, term312024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term312024, term312024.getClass(), "focusCycleRoot", false);
        setBooleanField(term312024, term312024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term312024, term312024.getClass(), "printingThreads", null);
        setBooleanField(term312024, term312024.getClass(), "printing", false);
        setField(term312024, term312024.getClass(), "containerListener", null);
        setIntField(term312024, term312024.getClass(), "listeningChildren", 0);
        setIntField(term312024, term312024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term312024, term312024.getClass(), "descendantsCount", 0);
        setField(term312024, term312024.getClass(), "preserveBackgroundColor", null);
        setIntField(term312024, term312024.getClass(), "numOfHWComponents", 0);
        setIntField(term312024, term312024.getClass(), "numOfLWComponents", 0);
        setField(term312024, term312024.getClass(), "modalComp", null);
        setField(term312024, term312024.getClass(), "modalAppContext", null);
        setIntField(term312024, term312024.getClass(), "containerSerializedDataVersion", 0);
        setField(term312024, term312024.getClass(), "peer", null);
        setField(term312024, term312024.getClass(), "parent", null);
        setField(term312024, term312024.getClass(), "appContext", null);
        setIntField(term312024, term312024.getClass(), "x", 0);
        setIntField(term312024, term312024.getClass(), "y", 0);
        setIntField(term312024, term312024.getClass(), "width", 0);
        setIntField(term312024, term312024.getClass(), "height", 0);
        setField(term312024, term312024.getClass(), "foreground", null);
        setField(term312024, term312024.getClass(), "background", null);
        setField(term312024, term312024.getClass(), "font", null);
        setField(term312024, term312024.getClass(), "peerFont", null);
        setField(term312024, term312024.getClass(), "cursor", null);
        setField(term312024, term312024.getClass(), "locale", null);
        setField(term312024, term312024.getClass(), "graphicsConfig", null);
        setField(term312024, term312024.getClass(), "bufferStrategy", null);
        setBooleanField(term312024, term312024.getClass(), "ignoreRepaint", false);
        setBooleanField(term312024, term312024.getClass(), "visible", false);
        setBooleanField(term312024, term312024.getClass(), "enabled", false);
        setBooleanField(term312024, term312024.getClass(), "valid", false);
        setField(term312024, term312024.getClass(), "dropTarget", null);
        setField(term312024, term312024.getClass(), "popups", null);
        setField(term312024, term312024.getClass(), "name", null);
        setBooleanField(term312024, term312024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term312024, term312024.getClass(), "focusable", false);
        setIntField(term312024, term312024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term312024, term312024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term312024, term312024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term312024, term312024.getClass(), "acc", null);
        setField(term312024, term312024.getClass(), "minSize", null);
        setBooleanField(term312024, term312024.getClass(), "minSizeSet", false);
        setField(term312024, term312024.getClass(), "prefSize", null);
        setBooleanField(term312024, term312024.getClass(), "prefSizeSet", false);
        setField(term312024, term312024.getClass(), "maxSize", null);
        setBooleanField(term312024, term312024.getClass(), "maxSizeSet", false);
        setField(term312024, term312024.getClass(), "componentOrientation", null);
        setBooleanField(term312024, term312024.getClass(), "newEventsOnly", false);
        setField(term312024, term312024.getClass(), "componentListener", null);
        setField(term312024, term312024.getClass(), "focusListener", null);
        setField(term312024, term312024.getClass(), "hierarchyListener", null);
        setField(term312024, term312024.getClass(), "hierarchyBoundsListener", null);
        setField(term312024, term312024.getClass(), "keyListener", null);
        setField(term312024, term312024.getClass(), "mouseListener", null);
        setField(term312024, term312024.getClass(), "mouseMotionListener", null);
        setField(term312024, term312024.getClass(), "mouseWheelListener", null);
        setField(term312024, term312024.getClass(), "inputMethodListener", null);
        setLongField(term312024, term312024.getClass(), "eventMask", 0L);
        setField(term312024, term312024.getClass(), "changeSupport", null);
        setField(term312024, term312024.getClass(), "objectLock", null);
        setBooleanField(term312024, term312024.getClass(), "isPacked", false);
        setIntField(term312024, term312024.getClass(), "boundsOp", 0);
        setField(term312024, term312024.getClass(), "compoundShape", null);
        setField(term312024, term312024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term312024, term312024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term312024, term312024.getClass(), "backgroundEraseDisabled", false);
        setField(term312024, term312024.getClass(), "eventCache", null);
        setBooleanField(term312024, term312024.getClass(), "coalescingEnabled", false);
        setBooleanField(term312024, term312024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term312024, term312024.getClass(), "componentSerializedDataVersion", 0);
        setField(term312024, term312024.getClass(), "accessibleContext", null);
        term312078 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term312078;
        callMethod(klass, "setColumnSortedProperties", argTypes, term312024, args);
    }

};


