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

public class TreeTableHeaderRenderer_setSortedColumnProperties_85471194634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328451;
     Object term328505;

    public TreeTableHeaderRenderer_setSortedColumnProperties_85471194634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328451 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term328451, term328451.getClass(), "sortIconBorder", null);
        setField(term328451, term328451.getClass(), "paintLabel", null);
        setBooleanField(term328451, term328451.getClass(), "boldOnSorted", false);
        setBooleanField(term328451, term328451.getClass(), "showNumber", false);
        setField(term328451, term328451.getClass(), "sortAscendingIcon", null);
        setField(term328451, term328451.getClass(), "sortDescendingIcon", null);
        setField(term328451, term328451.getClass(), "cachedHeaderFont", null);
        setField(term328451, term328451.getClass(), "boldHeaderFont", null);
        setIntField(term328451, term328451.getClass(), "sortOrderNumber", 0);
        setField(term328451, term328451.getClass(), "sortOrder", null);
        setIntField(term328451, term328451.getClass(), "maxIconWidth", 0);
        setIntField(term328451, term328451.getClass(), "sortNumberTextWidth", 0);
        setIntField(term328451, term328451.getClass(), "mnemonic", 0);
        setIntField(term328451, term328451.getClass(), "mnemonicIndex", 0);
        setField(term328451, term328451.getClass(), "text", null);
        setField(term328451, term328451.getClass(), "defaultIcon", null);
        setField(term328451, term328451.getClass(), "disabledIcon", null);
        setBooleanField(term328451, term328451.getClass(), "disabledIconSet", false);
        setIntField(term328451, term328451.getClass(), "verticalAlignment", 0);
        setIntField(term328451, term328451.getClass(), "horizontalAlignment", 0);
        setIntField(term328451, term328451.getClass(), "verticalTextPosition", 0);
        setIntField(term328451, term328451.getClass(), "horizontalTextPosition", 0);
        setIntField(term328451, term328451.getClass(), "iconTextGap", 0);
        setField(term328451, term328451.getClass(), "labelFor", null);
        setBooleanField(term328451, term328451.getClass(), "isAlignmentXSet", false);
        setFloatField(term328451, term328451.getClass(), "alignmentX", 0.0F);
        setBooleanField(term328451, term328451.getClass(), "isAlignmentYSet", false);
        setFloatField(term328451, term328451.getClass(), "alignmentY", 0.0F);
        setField(term328451, term328451.getClass(), "ui", null);
        setField(term328451, term328451.getClass(), "listenerList", null);
        setField(term328451, term328451.getClass(), "clientProperties", null);
        setField(term328451, term328451.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term328451, term328451.getClass(), "autoscrolls", false);
        setField(term328451, term328451.getClass(), "border", null);
        setIntField(term328451, term328451.getClass(), "flags", 0);
        setField(term328451, term328451.getClass(), "inputVerifier", null);
        setBooleanField(term328451, term328451.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term328451, term328451.getClass(), "paintingChild", null);
        setField(term328451, term328451.getClass(), "popupMenu", null);
        setField(term328451, term328451.getClass(), "revalidateRunnableScheduled", null);
        setField(term328451, term328451.getClass(), "focusInputMap", null);
        setField(term328451, term328451.getClass(), "ancestorInputMap", null);
        setField(term328451, term328451.getClass(), "windowInputMap", null);
        setField(term328451, term328451.getClass(), "actionMap", null);
        setField(term328451, term328451.getClass(), "aaHint", null);
        setField(term328451, term328451.getClass(), "lcdRenderingHint", null);
        setField(term328451, term328451.getClass(), "component", null);
        setField(term328451, term328451.getClass(), "layoutMgr", null);
        setField(term328451, term328451.getClass(), "dispatcher", null);
        setField(term328451, term328451.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term328451, term328451.getClass(), "focusCycleRoot", false);
        setBooleanField(term328451, term328451.getClass(), "focusTraversalPolicyProvider", false);
        setField(term328451, term328451.getClass(), "printingThreads", null);
        setBooleanField(term328451, term328451.getClass(), "printing", false);
        setField(term328451, term328451.getClass(), "containerListener", null);
        setIntField(term328451, term328451.getClass(), "listeningChildren", 0);
        setIntField(term328451, term328451.getClass(), "listeningBoundsChildren", 0);
        setIntField(term328451, term328451.getClass(), "descendantsCount", 0);
        setField(term328451, term328451.getClass(), "preserveBackgroundColor", null);
        setIntField(term328451, term328451.getClass(), "numOfHWComponents", 0);
        setIntField(term328451, term328451.getClass(), "numOfLWComponents", 0);
        setField(term328451, term328451.getClass(), "modalComp", null);
        setField(term328451, term328451.getClass(), "modalAppContext", null);
        setIntField(term328451, term328451.getClass(), "containerSerializedDataVersion", 0);
        setField(term328451, term328451.getClass(), "peer", null);
        setField(term328451, term328451.getClass(), "parent", null);
        setField(term328451, term328451.getClass(), "appContext", null);
        setIntField(term328451, term328451.getClass(), "x", 0);
        setIntField(term328451, term328451.getClass(), "y", 0);
        setIntField(term328451, term328451.getClass(), "width", 0);
        setIntField(term328451, term328451.getClass(), "height", 0);
        setField(term328451, term328451.getClass(), "foreground", null);
        setField(term328451, term328451.getClass(), "background", null);
        setField(term328451, term328451.getClass(), "font", null);
        setField(term328451, term328451.getClass(), "peerFont", null);
        setField(term328451, term328451.getClass(), "cursor", null);
        setField(term328451, term328451.getClass(), "locale", null);
        setField(term328451, term328451.getClass(), "graphicsConfig", null);
        setField(term328451, term328451.getClass(), "bufferStrategy", null);
        setBooleanField(term328451, term328451.getClass(), "ignoreRepaint", false);
        setBooleanField(term328451, term328451.getClass(), "visible", false);
        setBooleanField(term328451, term328451.getClass(), "enabled", false);
        setBooleanField(term328451, term328451.getClass(), "valid", false);
        setField(term328451, term328451.getClass(), "dropTarget", null);
        setField(term328451, term328451.getClass(), "popups", null);
        setField(term328451, term328451.getClass(), "name", null);
        setBooleanField(term328451, term328451.getClass(), "nameExplicitlySet", false);
        setBooleanField(term328451, term328451.getClass(), "focusable", false);
        setIntField(term328451, term328451.getClass(), "isFocusTraversableOverridden", 0);
        setField(term328451, term328451.getClass(), "focusTraversalKeys", null);
        setBooleanField(term328451, term328451.getClass(), "focusTraversalKeysEnabled", false);
        setField(term328451, term328451.getClass(), "acc", null);
        setField(term328451, term328451.getClass(), "minSize", null);
        setBooleanField(term328451, term328451.getClass(), "minSizeSet", false);
        setField(term328451, term328451.getClass(), "prefSize", null);
        setBooleanField(term328451, term328451.getClass(), "prefSizeSet", false);
        setField(term328451, term328451.getClass(), "maxSize", null);
        setBooleanField(term328451, term328451.getClass(), "maxSizeSet", false);
        setField(term328451, term328451.getClass(), "componentOrientation", null);
        setBooleanField(term328451, term328451.getClass(), "newEventsOnly", false);
        setField(term328451, term328451.getClass(), "componentListener", null);
        setField(term328451, term328451.getClass(), "focusListener", null);
        setField(term328451, term328451.getClass(), "hierarchyListener", null);
        setField(term328451, term328451.getClass(), "hierarchyBoundsListener", null);
        setField(term328451, term328451.getClass(), "keyListener", null);
        setField(term328451, term328451.getClass(), "mouseListener", null);
        setField(term328451, term328451.getClass(), "mouseMotionListener", null);
        setField(term328451, term328451.getClass(), "mouseWheelListener", null);
        setField(term328451, term328451.getClass(), "inputMethodListener", null);
        setLongField(term328451, term328451.getClass(), "eventMask", 0L);
        setField(term328451, term328451.getClass(), "changeSupport", null);
        setField(term328451, term328451.getClass(), "objectLock", null);
        setBooleanField(term328451, term328451.getClass(), "isPacked", false);
        setIntField(term328451, term328451.getClass(), "boundsOp", 0);
        setField(term328451, term328451.getClass(), "compoundShape", null);
        setField(term328451, term328451.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term328451, term328451.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term328451, term328451.getClass(), "backgroundEraseDisabled", false);
        setField(term328451, term328451.getClass(), "eventCache", null);
        setBooleanField(term328451, term328451.getClass(), "coalescingEnabled", false);
        setBooleanField(term328451, term328451.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term328451, term328451.getClass(), "componentSerializedDataVersion", 0);
        setField(term328451, term328451.getClass(), "accessibleContext", null);
        term328505 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term328505;
        callMethod(klass, "setSortedColumnProperties", argTypes, term328451, args);
    }

};


