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
     Object term328256;
     Object term328310;

    public TreeTableHeaderRenderer_setSortedColumnProperties_85471194634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328256 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term328256, term328256.getClass(), "sortIconBorder", null);
        setField(term328256, term328256.getClass(), "paintLabel", null);
        setBooleanField(term328256, term328256.getClass(), "boldOnSorted", false);
        setBooleanField(term328256, term328256.getClass(), "showNumber", false);
        setField(term328256, term328256.getClass(), "sortAscendingIcon", null);
        setField(term328256, term328256.getClass(), "sortDescendingIcon", null);
        setField(term328256, term328256.getClass(), "cachedHeaderFont", null);
        setField(term328256, term328256.getClass(), "boldHeaderFont", null);
        setIntField(term328256, term328256.getClass(), "sortOrderNumber", 0);
        setField(term328256, term328256.getClass(), "sortOrder", null);
        setIntField(term328256, term328256.getClass(), "maxIconWidth", 0);
        setIntField(term328256, term328256.getClass(), "sortNumberTextWidth", 0);
        setIntField(term328256, term328256.getClass(), "mnemonic", 0);
        setIntField(term328256, term328256.getClass(), "mnemonicIndex", 0);
        setField(term328256, term328256.getClass(), "text", null);
        setField(term328256, term328256.getClass(), "defaultIcon", null);
        setField(term328256, term328256.getClass(), "disabledIcon", null);
        setBooleanField(term328256, term328256.getClass(), "disabledIconSet", false);
        setIntField(term328256, term328256.getClass(), "verticalAlignment", 0);
        setIntField(term328256, term328256.getClass(), "horizontalAlignment", 0);
        setIntField(term328256, term328256.getClass(), "verticalTextPosition", 0);
        setIntField(term328256, term328256.getClass(), "horizontalTextPosition", 0);
        setIntField(term328256, term328256.getClass(), "iconTextGap", 0);
        setField(term328256, term328256.getClass(), "labelFor", null);
        setBooleanField(term328256, term328256.getClass(), "isAlignmentXSet", false);
        setFloatField(term328256, term328256.getClass(), "alignmentX", 0.0F);
        setBooleanField(term328256, term328256.getClass(), "isAlignmentYSet", false);
        setFloatField(term328256, term328256.getClass(), "alignmentY", 0.0F);
        setField(term328256, term328256.getClass(), "ui", null);
        setField(term328256, term328256.getClass(), "listenerList", null);
        setField(term328256, term328256.getClass(), "clientProperties", null);
        setField(term328256, term328256.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term328256, term328256.getClass(), "autoscrolls", false);
        setField(term328256, term328256.getClass(), "border", null);
        setIntField(term328256, term328256.getClass(), "flags", 0);
        setField(term328256, term328256.getClass(), "inputVerifier", null);
        setBooleanField(term328256, term328256.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term328256, term328256.getClass(), "paintingChild", null);
        setField(term328256, term328256.getClass(), "popupMenu", null);
        setField(term328256, term328256.getClass(), "revalidateRunnableScheduled", null);
        setField(term328256, term328256.getClass(), "focusInputMap", null);
        setField(term328256, term328256.getClass(), "ancestorInputMap", null);
        setField(term328256, term328256.getClass(), "windowInputMap", null);
        setField(term328256, term328256.getClass(), "actionMap", null);
        setField(term328256, term328256.getClass(), "aaHint", null);
        setField(term328256, term328256.getClass(), "lcdRenderingHint", null);
        setField(term328256, term328256.getClass(), "component", null);
        setField(term328256, term328256.getClass(), "layoutMgr", null);
        setField(term328256, term328256.getClass(), "dispatcher", null);
        setField(term328256, term328256.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term328256, term328256.getClass(), "focusCycleRoot", false);
        setBooleanField(term328256, term328256.getClass(), "focusTraversalPolicyProvider", false);
        setField(term328256, term328256.getClass(), "printingThreads", null);
        setBooleanField(term328256, term328256.getClass(), "printing", false);
        setField(term328256, term328256.getClass(), "containerListener", null);
        setIntField(term328256, term328256.getClass(), "listeningChildren", 0);
        setIntField(term328256, term328256.getClass(), "listeningBoundsChildren", 0);
        setIntField(term328256, term328256.getClass(), "descendantsCount", 0);
        setField(term328256, term328256.getClass(), "preserveBackgroundColor", null);
        setIntField(term328256, term328256.getClass(), "numOfHWComponents", 0);
        setIntField(term328256, term328256.getClass(), "numOfLWComponents", 0);
        setField(term328256, term328256.getClass(), "modalComp", null);
        setField(term328256, term328256.getClass(), "modalAppContext", null);
        setIntField(term328256, term328256.getClass(), "containerSerializedDataVersion", 0);
        setField(term328256, term328256.getClass(), "peer", null);
        setField(term328256, term328256.getClass(), "parent", null);
        setField(term328256, term328256.getClass(), "appContext", null);
        setIntField(term328256, term328256.getClass(), "x", 0);
        setIntField(term328256, term328256.getClass(), "y", 0);
        setIntField(term328256, term328256.getClass(), "width", 0);
        setIntField(term328256, term328256.getClass(), "height", 0);
        setField(term328256, term328256.getClass(), "foreground", null);
        setField(term328256, term328256.getClass(), "background", null);
        setField(term328256, term328256.getClass(), "font", null);
        setField(term328256, term328256.getClass(), "peerFont", null);
        setField(term328256, term328256.getClass(), "cursor", null);
        setField(term328256, term328256.getClass(), "locale", null);
        setField(term328256, term328256.getClass(), "graphicsConfig", null);
        setField(term328256, term328256.getClass(), "bufferStrategy", null);
        setBooleanField(term328256, term328256.getClass(), "ignoreRepaint", false);
        setBooleanField(term328256, term328256.getClass(), "visible", false);
        setBooleanField(term328256, term328256.getClass(), "enabled", false);
        setBooleanField(term328256, term328256.getClass(), "valid", false);
        setField(term328256, term328256.getClass(), "dropTarget", null);
        setField(term328256, term328256.getClass(), "popups", null);
        setField(term328256, term328256.getClass(), "name", null);
        setBooleanField(term328256, term328256.getClass(), "nameExplicitlySet", false);
        setBooleanField(term328256, term328256.getClass(), "focusable", false);
        setIntField(term328256, term328256.getClass(), "isFocusTraversableOverridden", 0);
        setField(term328256, term328256.getClass(), "focusTraversalKeys", null);
        setBooleanField(term328256, term328256.getClass(), "focusTraversalKeysEnabled", false);
        setField(term328256, term328256.getClass(), "acc", null);
        setField(term328256, term328256.getClass(), "minSize", null);
        setBooleanField(term328256, term328256.getClass(), "minSizeSet", false);
        setField(term328256, term328256.getClass(), "prefSize", null);
        setBooleanField(term328256, term328256.getClass(), "prefSizeSet", false);
        setField(term328256, term328256.getClass(), "maxSize", null);
        setBooleanField(term328256, term328256.getClass(), "maxSizeSet", false);
        setField(term328256, term328256.getClass(), "componentOrientation", null);
        setBooleanField(term328256, term328256.getClass(), "newEventsOnly", false);
        setField(term328256, term328256.getClass(), "componentListener", null);
        setField(term328256, term328256.getClass(), "focusListener", null);
        setField(term328256, term328256.getClass(), "hierarchyListener", null);
        setField(term328256, term328256.getClass(), "hierarchyBoundsListener", null);
        setField(term328256, term328256.getClass(), "keyListener", null);
        setField(term328256, term328256.getClass(), "mouseListener", null);
        setField(term328256, term328256.getClass(), "mouseMotionListener", null);
        setField(term328256, term328256.getClass(), "mouseWheelListener", null);
        setField(term328256, term328256.getClass(), "inputMethodListener", null);
        setLongField(term328256, term328256.getClass(), "eventMask", 0L);
        setField(term328256, term328256.getClass(), "changeSupport", null);
        setField(term328256, term328256.getClass(), "objectLock", null);
        setBooleanField(term328256, term328256.getClass(), "isPacked", false);
        setIntField(term328256, term328256.getClass(), "boundsOp", 0);
        setField(term328256, term328256.getClass(), "compoundShape", null);
        setField(term328256, term328256.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term328256, term328256.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term328256, term328256.getClass(), "backgroundEraseDisabled", false);
        setField(term328256, term328256.getClass(), "eventCache", null);
        setBooleanField(term328256, term328256.getClass(), "coalescingEnabled", false);
        setBooleanField(term328256, term328256.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term328256, term328256.getClass(), "componentSerializedDataVersion", 0);
        setField(term328256, term328256.getClass(), "accessibleContext", null);
        term328310 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term328310;
        callMethod(klass, "setSortedColumnProperties", argTypes, term328256, args);
    }

};


