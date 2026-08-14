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

public class TreeTableHeaderRenderer_setSortDescendingIcon_167639563220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234075;

    public TreeTableHeaderRenderer_setSortDescendingIcon_167639563220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234075 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term234075, term234075.getClass(), "sortIconBorder", null);
        setField(term234075, term234075.getClass(), "paintLabel", null);
        setBooleanField(term234075, term234075.getClass(), "boldOnSorted", false);
        setBooleanField(term234075, term234075.getClass(), "showNumber", false);
        setField(term234075, term234075.getClass(), "sortAscendingIcon", null);
        setField(term234075, term234075.getClass(), "sortDescendingIcon", null);
        setField(term234075, term234075.getClass(), "cachedHeaderFont", null);
        setField(term234075, term234075.getClass(), "boldHeaderFont", null);
        setIntField(term234075, term234075.getClass(), "sortOrderNumber", 0);
        setField(term234075, term234075.getClass(), "sortOrder", null);
        setIntField(term234075, term234075.getClass(), "maxIconWidth", 0);
        setIntField(term234075, term234075.getClass(), "sortNumberTextWidth", 0);
        setIntField(term234075, term234075.getClass(), "mnemonic", 0);
        setIntField(term234075, term234075.getClass(), "mnemonicIndex", 0);
        setField(term234075, term234075.getClass(), "text", null);
        setField(term234075, term234075.getClass(), "defaultIcon", null);
        setField(term234075, term234075.getClass(), "disabledIcon", null);
        setBooleanField(term234075, term234075.getClass(), "disabledIconSet", false);
        setIntField(term234075, term234075.getClass(), "verticalAlignment", 0);
        setIntField(term234075, term234075.getClass(), "horizontalAlignment", 0);
        setIntField(term234075, term234075.getClass(), "verticalTextPosition", 0);
        setIntField(term234075, term234075.getClass(), "horizontalTextPosition", 0);
        setIntField(term234075, term234075.getClass(), "iconTextGap", 0);
        setField(term234075, term234075.getClass(), "labelFor", null);
        setBooleanField(term234075, term234075.getClass(), "isAlignmentXSet", false);
        setFloatField(term234075, term234075.getClass(), "alignmentX", 0.0F);
        setBooleanField(term234075, term234075.getClass(), "isAlignmentYSet", false);
        setFloatField(term234075, term234075.getClass(), "alignmentY", 0.0F);
        setField(term234075, term234075.getClass(), "ui", null);
        setField(term234075, term234075.getClass(), "listenerList", null);
        setField(term234075, term234075.getClass(), "clientProperties", null);
        setField(term234075, term234075.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term234075, term234075.getClass(), "autoscrolls", false);
        setField(term234075, term234075.getClass(), "border", null);
        setIntField(term234075, term234075.getClass(), "flags", 0);
        setField(term234075, term234075.getClass(), "inputVerifier", null);
        setBooleanField(term234075, term234075.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term234075, term234075.getClass(), "paintingChild", null);
        setField(term234075, term234075.getClass(), "popupMenu", null);
        setField(term234075, term234075.getClass(), "revalidateRunnableScheduled", null);
        setField(term234075, term234075.getClass(), "focusInputMap", null);
        setField(term234075, term234075.getClass(), "ancestorInputMap", null);
        setField(term234075, term234075.getClass(), "windowInputMap", null);
        setField(term234075, term234075.getClass(), "actionMap", null);
        setField(term234075, term234075.getClass(), "aaHint", null);
        setField(term234075, term234075.getClass(), "lcdRenderingHint", null);
        setField(term234075, term234075.getClass(), "component", null);
        setField(term234075, term234075.getClass(), "layoutMgr", null);
        setField(term234075, term234075.getClass(), "dispatcher", null);
        setField(term234075, term234075.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term234075, term234075.getClass(), "focusCycleRoot", false);
        setBooleanField(term234075, term234075.getClass(), "focusTraversalPolicyProvider", false);
        setField(term234075, term234075.getClass(), "printingThreads", null);
        setBooleanField(term234075, term234075.getClass(), "printing", false);
        setField(term234075, term234075.getClass(), "containerListener", null);
        setIntField(term234075, term234075.getClass(), "listeningChildren", 0);
        setIntField(term234075, term234075.getClass(), "listeningBoundsChildren", 0);
        setIntField(term234075, term234075.getClass(), "descendantsCount", 0);
        setField(term234075, term234075.getClass(), "preserveBackgroundColor", null);
        setIntField(term234075, term234075.getClass(), "numOfHWComponents", 0);
        setIntField(term234075, term234075.getClass(), "numOfLWComponents", 0);
        setField(term234075, term234075.getClass(), "modalComp", null);
        setField(term234075, term234075.getClass(), "modalAppContext", null);
        setIntField(term234075, term234075.getClass(), "containerSerializedDataVersion", 0);
        setField(term234075, term234075.getClass(), "peer", null);
        setField(term234075, term234075.getClass(), "parent", null);
        setField(term234075, term234075.getClass(), "appContext", null);
        setIntField(term234075, term234075.getClass(), "x", 0);
        setIntField(term234075, term234075.getClass(), "y", 0);
        setIntField(term234075, term234075.getClass(), "width", 0);
        setIntField(term234075, term234075.getClass(), "height", 0);
        setField(term234075, term234075.getClass(), "foreground", null);
        setField(term234075, term234075.getClass(), "background", null);
        setField(term234075, term234075.getClass(), "font", null);
        setField(term234075, term234075.getClass(), "peerFont", null);
        setField(term234075, term234075.getClass(), "cursor", null);
        setField(term234075, term234075.getClass(), "locale", null);
        setField(term234075, term234075.getClass(), "graphicsConfig", null);
        setField(term234075, term234075.getClass(), "bufferStrategy", null);
        setBooleanField(term234075, term234075.getClass(), "ignoreRepaint", false);
        setBooleanField(term234075, term234075.getClass(), "visible", false);
        setBooleanField(term234075, term234075.getClass(), "enabled", false);
        setBooleanField(term234075, term234075.getClass(), "valid", false);
        setField(term234075, term234075.getClass(), "dropTarget", null);
        setField(term234075, term234075.getClass(), "popups", null);
        setField(term234075, term234075.getClass(), "name", null);
        setBooleanField(term234075, term234075.getClass(), "nameExplicitlySet", false);
        setBooleanField(term234075, term234075.getClass(), "focusable", false);
        setIntField(term234075, term234075.getClass(), "isFocusTraversableOverridden", 0);
        setField(term234075, term234075.getClass(), "focusTraversalKeys", null);
        setBooleanField(term234075, term234075.getClass(), "focusTraversalKeysEnabled", false);
        setField(term234075, term234075.getClass(), "acc", null);
        setField(term234075, term234075.getClass(), "minSize", null);
        setBooleanField(term234075, term234075.getClass(), "minSizeSet", false);
        setField(term234075, term234075.getClass(), "prefSize", null);
        setBooleanField(term234075, term234075.getClass(), "prefSizeSet", false);
        setField(term234075, term234075.getClass(), "maxSize", null);
        setBooleanField(term234075, term234075.getClass(), "maxSizeSet", false);
        setField(term234075, term234075.getClass(), "componentOrientation", null);
        setBooleanField(term234075, term234075.getClass(), "newEventsOnly", false);
        setField(term234075, term234075.getClass(), "componentListener", null);
        setField(term234075, term234075.getClass(), "focusListener", null);
        setField(term234075, term234075.getClass(), "hierarchyListener", null);
        setField(term234075, term234075.getClass(), "hierarchyBoundsListener", null);
        setField(term234075, term234075.getClass(), "keyListener", null);
        setField(term234075, term234075.getClass(), "mouseListener", null);
        setField(term234075, term234075.getClass(), "mouseMotionListener", null);
        setField(term234075, term234075.getClass(), "mouseWheelListener", null);
        setField(term234075, term234075.getClass(), "inputMethodListener", null);
        setLongField(term234075, term234075.getClass(), "eventMask", 0L);
        setField(term234075, term234075.getClass(), "changeSupport", null);
        setField(term234075, term234075.getClass(), "objectLock", null);
        setBooleanField(term234075, term234075.getClass(), "isPacked", false);
        setIntField(term234075, term234075.getClass(), "boundsOp", 0);
        setField(term234075, term234075.getClass(), "compoundShape", null);
        setField(term234075, term234075.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term234075, term234075.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term234075, term234075.getClass(), "backgroundEraseDisabled", false);
        setField(term234075, term234075.getClass(), "eventCache", null);
        setBooleanField(term234075, term234075.getClass(), "coalescingEnabled", false);
        setBooleanField(term234075, term234075.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term234075, term234075.getClass(), "componentSerializedDataVersion", 0);
        setField(term234075, term234075.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortDescendingIcon", argTypes, term234075, args);
    }

};


