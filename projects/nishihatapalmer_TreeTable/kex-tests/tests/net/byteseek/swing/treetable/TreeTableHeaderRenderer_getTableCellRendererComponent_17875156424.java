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
     Object term135112;
     Object term135166;
     Object term135168;
     Object term135170;
     Object term135172;

    public TreeTableHeaderRenderer_getTableCellRendererComponent_17875156424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135112 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term135112, term135112.getClass(), "sortIconBorder", null);
        setField(term135112, term135112.getClass(), "paintLabel", null);
        setBooleanField(term135112, term135112.getClass(), "boldOnSorted", false);
        setBooleanField(term135112, term135112.getClass(), "showNumber", false);
        setField(term135112, term135112.getClass(), "sortAscendingIcon", null);
        setField(term135112, term135112.getClass(), "sortDescendingIcon", null);
        setField(term135112, term135112.getClass(), "cachedHeaderFont", null);
        setField(term135112, term135112.getClass(), "boldHeaderFont", null);
        setIntField(term135112, term135112.getClass(), "sortOrderNumber", 0);
        setField(term135112, term135112.getClass(), "sortOrder", null);
        setIntField(term135112, term135112.getClass(), "maxIconWidth", 0);
        setIntField(term135112, term135112.getClass(), "sortNumberTextWidth", 0);
        setIntField(term135112, term135112.getClass(), "mnemonic", 0);
        setIntField(term135112, term135112.getClass(), "mnemonicIndex", 0);
        setField(term135112, term135112.getClass(), "text", null);
        setField(term135112, term135112.getClass(), "defaultIcon", null);
        setField(term135112, term135112.getClass(), "disabledIcon", null);
        setBooleanField(term135112, term135112.getClass(), "disabledIconSet", false);
        setIntField(term135112, term135112.getClass(), "verticalAlignment", 0);
        setIntField(term135112, term135112.getClass(), "horizontalAlignment", 0);
        setIntField(term135112, term135112.getClass(), "verticalTextPosition", 0);
        setIntField(term135112, term135112.getClass(), "horizontalTextPosition", 0);
        setIntField(term135112, term135112.getClass(), "iconTextGap", 0);
        setField(term135112, term135112.getClass(), "labelFor", null);
        setBooleanField(term135112, term135112.getClass(), "isAlignmentXSet", false);
        setFloatField(term135112, term135112.getClass(), "alignmentX", 0.0F);
        setBooleanField(term135112, term135112.getClass(), "isAlignmentYSet", false);
        setFloatField(term135112, term135112.getClass(), "alignmentY", 0.0F);
        setField(term135112, term135112.getClass(), "ui", null);
        setField(term135112, term135112.getClass(), "listenerList", null);
        setField(term135112, term135112.getClass(), "clientProperties", null);
        setField(term135112, term135112.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term135112, term135112.getClass(), "autoscrolls", false);
        setField(term135112, term135112.getClass(), "border", null);
        setIntField(term135112, term135112.getClass(), "flags", 0);
        setField(term135112, term135112.getClass(), "inputVerifier", null);
        setBooleanField(term135112, term135112.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term135112, term135112.getClass(), "paintingChild", null);
        setField(term135112, term135112.getClass(), "popupMenu", null);
        setField(term135112, term135112.getClass(), "revalidateRunnableScheduled", null);
        setField(term135112, term135112.getClass(), "focusInputMap", null);
        setField(term135112, term135112.getClass(), "ancestorInputMap", null);
        setField(term135112, term135112.getClass(), "windowInputMap", null);
        setField(term135112, term135112.getClass(), "actionMap", null);
        setField(term135112, term135112.getClass(), "aaHint", null);
        setField(term135112, term135112.getClass(), "lcdRenderingHint", null);
        setField(term135112, term135112.getClass(), "component", null);
        setField(term135112, term135112.getClass(), "layoutMgr", null);
        setField(term135112, term135112.getClass(), "dispatcher", null);
        setField(term135112, term135112.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term135112, term135112.getClass(), "focusCycleRoot", false);
        setBooleanField(term135112, term135112.getClass(), "focusTraversalPolicyProvider", false);
        setField(term135112, term135112.getClass(), "printingThreads", null);
        setBooleanField(term135112, term135112.getClass(), "printing", false);
        setField(term135112, term135112.getClass(), "containerListener", null);
        setIntField(term135112, term135112.getClass(), "listeningChildren", 0);
        setIntField(term135112, term135112.getClass(), "listeningBoundsChildren", 0);
        setIntField(term135112, term135112.getClass(), "descendantsCount", 0);
        setField(term135112, term135112.getClass(), "preserveBackgroundColor", null);
        setIntField(term135112, term135112.getClass(), "numOfHWComponents", 0);
        setIntField(term135112, term135112.getClass(), "numOfLWComponents", 0);
        setField(term135112, term135112.getClass(), "modalComp", null);
        setField(term135112, term135112.getClass(), "modalAppContext", null);
        setIntField(term135112, term135112.getClass(), "containerSerializedDataVersion", 0);
        setField(term135112, term135112.getClass(), "peer", null);
        setField(term135112, term135112.getClass(), "parent", null);
        setField(term135112, term135112.getClass(), "appContext", null);
        setIntField(term135112, term135112.getClass(), "x", 0);
        setIntField(term135112, term135112.getClass(), "y", 0);
        setIntField(term135112, term135112.getClass(), "width", 0);
        setIntField(term135112, term135112.getClass(), "height", 0);
        setField(term135112, term135112.getClass(), "foreground", null);
        setField(term135112, term135112.getClass(), "background", null);
        setField(term135112, term135112.getClass(), "font", null);
        setField(term135112, term135112.getClass(), "peerFont", null);
        setField(term135112, term135112.getClass(), "cursor", null);
        setField(term135112, term135112.getClass(), "locale", null);
        setField(term135112, term135112.getClass(), "graphicsConfig", null);
        setField(term135112, term135112.getClass(), "bufferStrategy", null);
        setBooleanField(term135112, term135112.getClass(), "ignoreRepaint", false);
        setBooleanField(term135112, term135112.getClass(), "visible", false);
        setBooleanField(term135112, term135112.getClass(), "enabled", false);
        setBooleanField(term135112, term135112.getClass(), "valid", false);
        setField(term135112, term135112.getClass(), "dropTarget", null);
        setField(term135112, term135112.getClass(), "popups", null);
        setField(term135112, term135112.getClass(), "name", null);
        setBooleanField(term135112, term135112.getClass(), "nameExplicitlySet", false);
        setBooleanField(term135112, term135112.getClass(), "focusable", false);
        setIntField(term135112, term135112.getClass(), "isFocusTraversableOverridden", 0);
        setField(term135112, term135112.getClass(), "focusTraversalKeys", null);
        setBooleanField(term135112, term135112.getClass(), "focusTraversalKeysEnabled", false);
        setField(term135112, term135112.getClass(), "acc", null);
        setField(term135112, term135112.getClass(), "minSize", null);
        setBooleanField(term135112, term135112.getClass(), "minSizeSet", false);
        setField(term135112, term135112.getClass(), "prefSize", null);
        setBooleanField(term135112, term135112.getClass(), "prefSizeSet", false);
        setField(term135112, term135112.getClass(), "maxSize", null);
        setBooleanField(term135112, term135112.getClass(), "maxSizeSet", false);
        setField(term135112, term135112.getClass(), "componentOrientation", null);
        setBooleanField(term135112, term135112.getClass(), "newEventsOnly", false);
        setField(term135112, term135112.getClass(), "componentListener", null);
        setField(term135112, term135112.getClass(), "focusListener", null);
        setField(term135112, term135112.getClass(), "hierarchyListener", null);
        setField(term135112, term135112.getClass(), "hierarchyBoundsListener", null);
        setField(term135112, term135112.getClass(), "keyListener", null);
        setField(term135112, term135112.getClass(), "mouseListener", null);
        setField(term135112, term135112.getClass(), "mouseMotionListener", null);
        setField(term135112, term135112.getClass(), "mouseWheelListener", null);
        setField(term135112, term135112.getClass(), "inputMethodListener", null);
        setLongField(term135112, term135112.getClass(), "eventMask", 0L);
        setField(term135112, term135112.getClass(), "changeSupport", null);
        setField(term135112, term135112.getClass(), "objectLock", null);
        setBooleanField(term135112, term135112.getClass(), "isPacked", false);
        setIntField(term135112, term135112.getClass(), "boundsOp", 0);
        setField(term135112, term135112.getClass(), "compoundShape", null);
        setField(term135112, term135112.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term135112, term135112.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term135112, term135112.getClass(), "backgroundEraseDisabled", false);
        setField(term135112, term135112.getClass(), "eventCache", null);
        setBooleanField(term135112, term135112.getClass(), "coalescingEnabled", false);
        setBooleanField(term135112, term135112.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term135112, term135112.getClass(), "componentSerializedDataVersion", 0);
        setField(term135112, term135112.getClass(), "accessibleContext", null);
        term135166 = new Boolean(false);
        term135168 = new Boolean(false);
        term135170 = new Integer(0);
        term135172 = new Integer(0);
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
        args[2] = term135166;
        args[3] = term135168;
        args[4] = term135170;
        args[5] = term135172;
        callMethod(klass, "getTableCellRendererComponent", argTypes, term135112, args);
    }

};


