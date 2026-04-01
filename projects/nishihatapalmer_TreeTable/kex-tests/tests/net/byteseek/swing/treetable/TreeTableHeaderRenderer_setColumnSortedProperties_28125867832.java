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
     Object term312066;
     Object term312120;

    public TreeTableHeaderRenderer_setColumnSortedProperties_28125867832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312066 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term312066, term312066.getClass(), "sortIconBorder", null);
        setField(term312066, term312066.getClass(), "paintLabel", null);
        setBooleanField(term312066, term312066.getClass(), "boldOnSorted", false);
        setBooleanField(term312066, term312066.getClass(), "showNumber", false);
        setField(term312066, term312066.getClass(), "sortAscendingIcon", null);
        setField(term312066, term312066.getClass(), "sortDescendingIcon", null);
        setField(term312066, term312066.getClass(), "cachedHeaderFont", null);
        setField(term312066, term312066.getClass(), "boldHeaderFont", null);
        setIntField(term312066, term312066.getClass(), "sortOrderNumber", 0);
        setField(term312066, term312066.getClass(), "sortOrder", null);
        setIntField(term312066, term312066.getClass(), "maxIconWidth", 0);
        setIntField(term312066, term312066.getClass(), "sortNumberTextWidth", 0);
        setIntField(term312066, term312066.getClass(), "mnemonic", 0);
        setIntField(term312066, term312066.getClass(), "mnemonicIndex", 0);
        setField(term312066, term312066.getClass(), "text", null);
        setField(term312066, term312066.getClass(), "defaultIcon", null);
        setField(term312066, term312066.getClass(), "disabledIcon", null);
        setBooleanField(term312066, term312066.getClass(), "disabledIconSet", false);
        setIntField(term312066, term312066.getClass(), "verticalAlignment", 0);
        setIntField(term312066, term312066.getClass(), "horizontalAlignment", 0);
        setIntField(term312066, term312066.getClass(), "verticalTextPosition", 0);
        setIntField(term312066, term312066.getClass(), "horizontalTextPosition", 0);
        setIntField(term312066, term312066.getClass(), "iconTextGap", 0);
        setField(term312066, term312066.getClass(), "labelFor", null);
        setBooleanField(term312066, term312066.getClass(), "isAlignmentXSet", false);
        setFloatField(term312066, term312066.getClass(), "alignmentX", 0.0F);
        setBooleanField(term312066, term312066.getClass(), "isAlignmentYSet", false);
        setFloatField(term312066, term312066.getClass(), "alignmentY", 0.0F);
        setField(term312066, term312066.getClass(), "ui", null);
        setField(term312066, term312066.getClass(), "listenerList", null);
        setField(term312066, term312066.getClass(), "clientProperties", null);
        setField(term312066, term312066.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term312066, term312066.getClass(), "autoscrolls", false);
        setField(term312066, term312066.getClass(), "border", null);
        setIntField(term312066, term312066.getClass(), "flags", 0);
        setField(term312066, term312066.getClass(), "inputVerifier", null);
        setBooleanField(term312066, term312066.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term312066, term312066.getClass(), "paintingChild", null);
        setField(term312066, term312066.getClass(), "popupMenu", null);
        setField(term312066, term312066.getClass(), "revalidateRunnableScheduled", null);
        setField(term312066, term312066.getClass(), "focusInputMap", null);
        setField(term312066, term312066.getClass(), "ancestorInputMap", null);
        setField(term312066, term312066.getClass(), "windowInputMap", null);
        setField(term312066, term312066.getClass(), "actionMap", null);
        setField(term312066, term312066.getClass(), "aaHint", null);
        setField(term312066, term312066.getClass(), "lcdRenderingHint", null);
        setField(term312066, term312066.getClass(), "component", null);
        setField(term312066, term312066.getClass(), "layoutMgr", null);
        setField(term312066, term312066.getClass(), "dispatcher", null);
        setField(term312066, term312066.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term312066, term312066.getClass(), "focusCycleRoot", false);
        setBooleanField(term312066, term312066.getClass(), "focusTraversalPolicyProvider", false);
        setField(term312066, term312066.getClass(), "printingThreads", null);
        setBooleanField(term312066, term312066.getClass(), "printing", false);
        setField(term312066, term312066.getClass(), "containerListener", null);
        setIntField(term312066, term312066.getClass(), "listeningChildren", 0);
        setIntField(term312066, term312066.getClass(), "listeningBoundsChildren", 0);
        setIntField(term312066, term312066.getClass(), "descendantsCount", 0);
        setField(term312066, term312066.getClass(), "preserveBackgroundColor", null);
        setIntField(term312066, term312066.getClass(), "numOfHWComponents", 0);
        setIntField(term312066, term312066.getClass(), "numOfLWComponents", 0);
        setField(term312066, term312066.getClass(), "modalComp", null);
        setField(term312066, term312066.getClass(), "modalAppContext", null);
        setIntField(term312066, term312066.getClass(), "containerSerializedDataVersion", 0);
        setField(term312066, term312066.getClass(), "peer", null);
        setField(term312066, term312066.getClass(), "parent", null);
        setField(term312066, term312066.getClass(), "appContext", null);
        setIntField(term312066, term312066.getClass(), "x", 0);
        setIntField(term312066, term312066.getClass(), "y", 0);
        setIntField(term312066, term312066.getClass(), "width", 0);
        setIntField(term312066, term312066.getClass(), "height", 0);
        setField(term312066, term312066.getClass(), "foreground", null);
        setField(term312066, term312066.getClass(), "background", null);
        setField(term312066, term312066.getClass(), "font", null);
        setField(term312066, term312066.getClass(), "peerFont", null);
        setField(term312066, term312066.getClass(), "cursor", null);
        setField(term312066, term312066.getClass(), "locale", null);
        setField(term312066, term312066.getClass(), "graphicsConfig", null);
        setField(term312066, term312066.getClass(), "bufferStrategy", null);
        setBooleanField(term312066, term312066.getClass(), "ignoreRepaint", false);
        setBooleanField(term312066, term312066.getClass(), "visible", false);
        setBooleanField(term312066, term312066.getClass(), "enabled", false);
        setBooleanField(term312066, term312066.getClass(), "valid", false);
        setField(term312066, term312066.getClass(), "dropTarget", null);
        setField(term312066, term312066.getClass(), "popups", null);
        setField(term312066, term312066.getClass(), "name", null);
        setBooleanField(term312066, term312066.getClass(), "nameExplicitlySet", false);
        setBooleanField(term312066, term312066.getClass(), "focusable", false);
        setIntField(term312066, term312066.getClass(), "isFocusTraversableOverridden", 0);
        setField(term312066, term312066.getClass(), "focusTraversalKeys", null);
        setBooleanField(term312066, term312066.getClass(), "focusTraversalKeysEnabled", false);
        setField(term312066, term312066.getClass(), "acc", null);
        setField(term312066, term312066.getClass(), "minSize", null);
        setBooleanField(term312066, term312066.getClass(), "minSizeSet", false);
        setField(term312066, term312066.getClass(), "prefSize", null);
        setBooleanField(term312066, term312066.getClass(), "prefSizeSet", false);
        setField(term312066, term312066.getClass(), "maxSize", null);
        setBooleanField(term312066, term312066.getClass(), "maxSizeSet", false);
        setField(term312066, term312066.getClass(), "componentOrientation", null);
        setBooleanField(term312066, term312066.getClass(), "newEventsOnly", false);
        setField(term312066, term312066.getClass(), "componentListener", null);
        setField(term312066, term312066.getClass(), "focusListener", null);
        setField(term312066, term312066.getClass(), "hierarchyListener", null);
        setField(term312066, term312066.getClass(), "hierarchyBoundsListener", null);
        setField(term312066, term312066.getClass(), "keyListener", null);
        setField(term312066, term312066.getClass(), "mouseListener", null);
        setField(term312066, term312066.getClass(), "mouseMotionListener", null);
        setField(term312066, term312066.getClass(), "mouseWheelListener", null);
        setField(term312066, term312066.getClass(), "inputMethodListener", null);
        setLongField(term312066, term312066.getClass(), "eventMask", 0L);
        setField(term312066, term312066.getClass(), "changeSupport", null);
        setField(term312066, term312066.getClass(), "objectLock", null);
        setBooleanField(term312066, term312066.getClass(), "isPacked", false);
        setIntField(term312066, term312066.getClass(), "boundsOp", 0);
        setField(term312066, term312066.getClass(), "compoundShape", null);
        setField(term312066, term312066.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term312066, term312066.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term312066, term312066.getClass(), "backgroundEraseDisabled", false);
        setField(term312066, term312066.getClass(), "eventCache", null);
        setBooleanField(term312066, term312066.getClass(), "coalescingEnabled", false);
        setBooleanField(term312066, term312066.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term312066, term312066.getClass(), "componentSerializedDataVersion", 0);
        setField(term312066, term312066.getClass(), "accessibleContext", null);
        term312120 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term312120;
        callMethod(klass, "setColumnSortedProperties", argTypes, term312066, args);
    }

};


