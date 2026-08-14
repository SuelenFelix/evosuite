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
import java.lang.Integer;

public class TreeTableHeaderRenderer_getTableCellRendererComponent_17875156424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134764;
     Object term134818;
     Object term134820;
     Object term134822;
     Object term134824;

    public TreeTableHeaderRenderer_getTableCellRendererComponent_17875156424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134764 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term134764, term134764.getClass(), "sortIconBorder", null);
        setField(term134764, term134764.getClass(), "paintLabel", null);
        setBooleanField(term134764, term134764.getClass(), "boldOnSorted", false);
        setBooleanField(term134764, term134764.getClass(), "showNumber", false);
        setField(term134764, term134764.getClass(), "sortAscendingIcon", null);
        setField(term134764, term134764.getClass(), "sortDescendingIcon", null);
        setField(term134764, term134764.getClass(), "cachedHeaderFont", null);
        setField(term134764, term134764.getClass(), "boldHeaderFont", null);
        setIntField(term134764, term134764.getClass(), "sortOrderNumber", 0);
        setField(term134764, term134764.getClass(), "sortOrder", null);
        setIntField(term134764, term134764.getClass(), "maxIconWidth", 0);
        setIntField(term134764, term134764.getClass(), "sortNumberTextWidth", 0);
        setIntField(term134764, term134764.getClass(), "mnemonic", 0);
        setIntField(term134764, term134764.getClass(), "mnemonicIndex", 0);
        setField(term134764, term134764.getClass(), "text", null);
        setField(term134764, term134764.getClass(), "defaultIcon", null);
        setField(term134764, term134764.getClass(), "disabledIcon", null);
        setBooleanField(term134764, term134764.getClass(), "disabledIconSet", false);
        setIntField(term134764, term134764.getClass(), "verticalAlignment", 0);
        setIntField(term134764, term134764.getClass(), "horizontalAlignment", 0);
        setIntField(term134764, term134764.getClass(), "verticalTextPosition", 0);
        setIntField(term134764, term134764.getClass(), "horizontalTextPosition", 0);
        setIntField(term134764, term134764.getClass(), "iconTextGap", 0);
        setField(term134764, term134764.getClass(), "labelFor", null);
        setBooleanField(term134764, term134764.getClass(), "isAlignmentXSet", false);
        setFloatField(term134764, term134764.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134764, term134764.getClass(), "isAlignmentYSet", false);
        setFloatField(term134764, term134764.getClass(), "alignmentY", 0.0F);
        setField(term134764, term134764.getClass(), "ui", null);
        setField(term134764, term134764.getClass(), "listenerList", null);
        setField(term134764, term134764.getClass(), "clientProperties", null);
        setField(term134764, term134764.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134764, term134764.getClass(), "autoscrolls", false);
        setField(term134764, term134764.getClass(), "border", null);
        setIntField(term134764, term134764.getClass(), "flags", 0);
        setField(term134764, term134764.getClass(), "inputVerifier", null);
        setBooleanField(term134764, term134764.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134764, term134764.getClass(), "paintingChild", null);
        setField(term134764, term134764.getClass(), "popupMenu", null);
        setField(term134764, term134764.getClass(), "revalidateRunnableScheduled", null);
        setField(term134764, term134764.getClass(), "focusInputMap", null);
        setField(term134764, term134764.getClass(), "ancestorInputMap", null);
        setField(term134764, term134764.getClass(), "windowInputMap", null);
        setField(term134764, term134764.getClass(), "actionMap", null);
        setField(term134764, term134764.getClass(), "aaHint", null);
        setField(term134764, term134764.getClass(), "lcdRenderingHint", null);
        setField(term134764, term134764.getClass(), "component", null);
        setField(term134764, term134764.getClass(), "layoutMgr", null);
        setField(term134764, term134764.getClass(), "dispatcher", null);
        setField(term134764, term134764.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134764, term134764.getClass(), "focusCycleRoot", false);
        setBooleanField(term134764, term134764.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134764, term134764.getClass(), "printingThreads", null);
        setBooleanField(term134764, term134764.getClass(), "printing", false);
        setField(term134764, term134764.getClass(), "containerListener", null);
        setIntField(term134764, term134764.getClass(), "listeningChildren", 0);
        setIntField(term134764, term134764.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134764, term134764.getClass(), "descendantsCount", 0);
        setField(term134764, term134764.getClass(), "preserveBackgroundColor", null);
        setIntField(term134764, term134764.getClass(), "numOfHWComponents", 0);
        setIntField(term134764, term134764.getClass(), "numOfLWComponents", 0);
        setField(term134764, term134764.getClass(), "modalComp", null);
        setField(term134764, term134764.getClass(), "modalAppContext", null);
        setIntField(term134764, term134764.getClass(), "containerSerializedDataVersion", 0);
        setField(term134764, term134764.getClass(), "peer", null);
        setField(term134764, term134764.getClass(), "parent", null);
        setField(term134764, term134764.getClass(), "appContext", null);
        setIntField(term134764, term134764.getClass(), "x", 0);
        setIntField(term134764, term134764.getClass(), "y", 0);
        setIntField(term134764, term134764.getClass(), "width", 0);
        setIntField(term134764, term134764.getClass(), "height", 0);
        setField(term134764, term134764.getClass(), "foreground", null);
        setField(term134764, term134764.getClass(), "background", null);
        setField(term134764, term134764.getClass(), "font", null);
        setField(term134764, term134764.getClass(), "peerFont", null);
        setField(term134764, term134764.getClass(), "cursor", null);
        setField(term134764, term134764.getClass(), "locale", null);
        setField(term134764, term134764.getClass(), "graphicsConfig", null);
        setField(term134764, term134764.getClass(), "bufferStrategy", null);
        setBooleanField(term134764, term134764.getClass(), "ignoreRepaint", false);
        setBooleanField(term134764, term134764.getClass(), "visible", false);
        setBooleanField(term134764, term134764.getClass(), "enabled", false);
        setBooleanField(term134764, term134764.getClass(), "valid", false);
        setField(term134764, term134764.getClass(), "dropTarget", null);
        setField(term134764, term134764.getClass(), "popups", null);
        setField(term134764, term134764.getClass(), "name", null);
        setBooleanField(term134764, term134764.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134764, term134764.getClass(), "focusable", false);
        setIntField(term134764, term134764.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134764, term134764.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134764, term134764.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134764, term134764.getClass(), "acc", null);
        setField(term134764, term134764.getClass(), "minSize", null);
        setBooleanField(term134764, term134764.getClass(), "minSizeSet", false);
        setField(term134764, term134764.getClass(), "prefSize", null);
        setBooleanField(term134764, term134764.getClass(), "prefSizeSet", false);
        setField(term134764, term134764.getClass(), "maxSize", null);
        setBooleanField(term134764, term134764.getClass(), "maxSizeSet", false);
        setField(term134764, term134764.getClass(), "componentOrientation", null);
        setBooleanField(term134764, term134764.getClass(), "newEventsOnly", false);
        setField(term134764, term134764.getClass(), "componentListener", null);
        setField(term134764, term134764.getClass(), "focusListener", null);
        setField(term134764, term134764.getClass(), "hierarchyListener", null);
        setField(term134764, term134764.getClass(), "hierarchyBoundsListener", null);
        setField(term134764, term134764.getClass(), "keyListener", null);
        setField(term134764, term134764.getClass(), "mouseListener", null);
        setField(term134764, term134764.getClass(), "mouseMotionListener", null);
        setField(term134764, term134764.getClass(), "mouseWheelListener", null);
        setField(term134764, term134764.getClass(), "inputMethodListener", null);
        setLongField(term134764, term134764.getClass(), "eventMask", 0L);
        setField(term134764, term134764.getClass(), "changeSupport", null);
        setField(term134764, term134764.getClass(), "objectLock", null);
        setBooleanField(term134764, term134764.getClass(), "isPacked", false);
        setIntField(term134764, term134764.getClass(), "boundsOp", 0);
        setField(term134764, term134764.getClass(), "compoundShape", null);
        setField(term134764, term134764.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134764, term134764.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134764, term134764.getClass(), "backgroundEraseDisabled", false);
        setField(term134764, term134764.getClass(), "eventCache", null);
        setBooleanField(term134764, term134764.getClass(), "coalescingEnabled", false);
        setBooleanField(term134764, term134764.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134764, term134764.getClass(), "componentSerializedDataVersion", 0);
        setField(term134764, term134764.getClass(), "accessibleContext", null);
        term134818 = new Boolean(false);
        term134820 = new Boolean(false);
        term134822 = new Integer(0);
        term134824 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = boolean.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term134818;
        args[3] = term134820;
        args[4] = term134822;
        args[5] = term134824;
        callMethod(klass, "getTableCellRendererComponent", argTypes, term134764, args);
    }

};


