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

public class TreeTableHeaderRenderer_setShowNumber_104727925414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196820;
     Object term196874;

    public TreeTableHeaderRenderer_setShowNumber_104727925414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196820 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term196820, term196820.getClass(), "sortIconBorder", null);
        setField(term196820, term196820.getClass(), "paintLabel", null);
        setBooleanField(term196820, term196820.getClass(), "boldOnSorted", false);
        setBooleanField(term196820, term196820.getClass(), "showNumber", false);
        setField(term196820, term196820.getClass(), "sortAscendingIcon", null);
        setField(term196820, term196820.getClass(), "sortDescendingIcon", null);
        setField(term196820, term196820.getClass(), "cachedHeaderFont", null);
        setField(term196820, term196820.getClass(), "boldHeaderFont", null);
        setIntField(term196820, term196820.getClass(), "sortOrderNumber", 0);
        setField(term196820, term196820.getClass(), "sortOrder", null);
        setIntField(term196820, term196820.getClass(), "maxIconWidth", 0);
        setIntField(term196820, term196820.getClass(), "sortNumberTextWidth", 0);
        setIntField(term196820, term196820.getClass(), "mnemonic", 0);
        setIntField(term196820, term196820.getClass(), "mnemonicIndex", 0);
        setField(term196820, term196820.getClass(), "text", null);
        setField(term196820, term196820.getClass(), "defaultIcon", null);
        setField(term196820, term196820.getClass(), "disabledIcon", null);
        setBooleanField(term196820, term196820.getClass(), "disabledIconSet", false);
        setIntField(term196820, term196820.getClass(), "verticalAlignment", 0);
        setIntField(term196820, term196820.getClass(), "horizontalAlignment", 0);
        setIntField(term196820, term196820.getClass(), "verticalTextPosition", 0);
        setIntField(term196820, term196820.getClass(), "horizontalTextPosition", 0);
        setIntField(term196820, term196820.getClass(), "iconTextGap", 0);
        setField(term196820, term196820.getClass(), "labelFor", null);
        setBooleanField(term196820, term196820.getClass(), "isAlignmentXSet", false);
        setFloatField(term196820, term196820.getClass(), "alignmentX", 0.0F);
        setBooleanField(term196820, term196820.getClass(), "isAlignmentYSet", false);
        setFloatField(term196820, term196820.getClass(), "alignmentY", 0.0F);
        setField(term196820, term196820.getClass(), "ui", null);
        setField(term196820, term196820.getClass(), "listenerList", null);
        setField(term196820, term196820.getClass(), "clientProperties", null);
        setField(term196820, term196820.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term196820, term196820.getClass(), "autoscrolls", false);
        setField(term196820, term196820.getClass(), "border", null);
        setIntField(term196820, term196820.getClass(), "flags", 0);
        setField(term196820, term196820.getClass(), "inputVerifier", null);
        setBooleanField(term196820, term196820.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term196820, term196820.getClass(), "paintingChild", null);
        setField(term196820, term196820.getClass(), "popupMenu", null);
        setField(term196820, term196820.getClass(), "revalidateRunnableScheduled", null);
        setField(term196820, term196820.getClass(), "focusInputMap", null);
        setField(term196820, term196820.getClass(), "ancestorInputMap", null);
        setField(term196820, term196820.getClass(), "windowInputMap", null);
        setField(term196820, term196820.getClass(), "actionMap", null);
        setField(term196820, term196820.getClass(), "aaHint", null);
        setField(term196820, term196820.getClass(), "lcdRenderingHint", null);
        setField(term196820, term196820.getClass(), "component", null);
        setField(term196820, term196820.getClass(), "layoutMgr", null);
        setField(term196820, term196820.getClass(), "dispatcher", null);
        setField(term196820, term196820.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term196820, term196820.getClass(), "focusCycleRoot", false);
        setBooleanField(term196820, term196820.getClass(), "focusTraversalPolicyProvider", false);
        setField(term196820, term196820.getClass(), "printingThreads", null);
        setBooleanField(term196820, term196820.getClass(), "printing", false);
        setField(term196820, term196820.getClass(), "containerListener", null);
        setIntField(term196820, term196820.getClass(), "listeningChildren", 0);
        setIntField(term196820, term196820.getClass(), "listeningBoundsChildren", 0);
        setIntField(term196820, term196820.getClass(), "descendantsCount", 0);
        setField(term196820, term196820.getClass(), "preserveBackgroundColor", null);
        setIntField(term196820, term196820.getClass(), "numOfHWComponents", 0);
        setIntField(term196820, term196820.getClass(), "numOfLWComponents", 0);
        setField(term196820, term196820.getClass(), "modalComp", null);
        setField(term196820, term196820.getClass(), "modalAppContext", null);
        setIntField(term196820, term196820.getClass(), "containerSerializedDataVersion", 0);
        setField(term196820, term196820.getClass(), "peer", null);
        setField(term196820, term196820.getClass(), "parent", null);
        setField(term196820, term196820.getClass(), "appContext", null);
        setIntField(term196820, term196820.getClass(), "x", 0);
        setIntField(term196820, term196820.getClass(), "y", 0);
        setIntField(term196820, term196820.getClass(), "width", 0);
        setIntField(term196820, term196820.getClass(), "height", 0);
        setField(term196820, term196820.getClass(), "foreground", null);
        setField(term196820, term196820.getClass(), "background", null);
        setField(term196820, term196820.getClass(), "font", null);
        setField(term196820, term196820.getClass(), "peerFont", null);
        setField(term196820, term196820.getClass(), "cursor", null);
        setField(term196820, term196820.getClass(), "locale", null);
        setField(term196820, term196820.getClass(), "graphicsConfig", null);
        setField(term196820, term196820.getClass(), "bufferStrategy", null);
        setBooleanField(term196820, term196820.getClass(), "ignoreRepaint", false);
        setBooleanField(term196820, term196820.getClass(), "visible", false);
        setBooleanField(term196820, term196820.getClass(), "enabled", false);
        setBooleanField(term196820, term196820.getClass(), "valid", false);
        setField(term196820, term196820.getClass(), "dropTarget", null);
        setField(term196820, term196820.getClass(), "popups", null);
        setField(term196820, term196820.getClass(), "name", null);
        setBooleanField(term196820, term196820.getClass(), "nameExplicitlySet", false);
        setBooleanField(term196820, term196820.getClass(), "focusable", false);
        setIntField(term196820, term196820.getClass(), "isFocusTraversableOverridden", 0);
        setField(term196820, term196820.getClass(), "focusTraversalKeys", null);
        setBooleanField(term196820, term196820.getClass(), "focusTraversalKeysEnabled", false);
        setField(term196820, term196820.getClass(), "acc", null);
        setField(term196820, term196820.getClass(), "minSize", null);
        setBooleanField(term196820, term196820.getClass(), "minSizeSet", false);
        setField(term196820, term196820.getClass(), "prefSize", null);
        setBooleanField(term196820, term196820.getClass(), "prefSizeSet", false);
        setField(term196820, term196820.getClass(), "maxSize", null);
        setBooleanField(term196820, term196820.getClass(), "maxSizeSet", false);
        setField(term196820, term196820.getClass(), "componentOrientation", null);
        setBooleanField(term196820, term196820.getClass(), "newEventsOnly", false);
        setField(term196820, term196820.getClass(), "componentListener", null);
        setField(term196820, term196820.getClass(), "focusListener", null);
        setField(term196820, term196820.getClass(), "hierarchyListener", null);
        setField(term196820, term196820.getClass(), "hierarchyBoundsListener", null);
        setField(term196820, term196820.getClass(), "keyListener", null);
        setField(term196820, term196820.getClass(), "mouseListener", null);
        setField(term196820, term196820.getClass(), "mouseMotionListener", null);
        setField(term196820, term196820.getClass(), "mouseWheelListener", null);
        setField(term196820, term196820.getClass(), "inputMethodListener", null);
        setLongField(term196820, term196820.getClass(), "eventMask", 0L);
        setField(term196820, term196820.getClass(), "changeSupport", null);
        setField(term196820, term196820.getClass(), "objectLock", null);
        setBooleanField(term196820, term196820.getClass(), "isPacked", false);
        setIntField(term196820, term196820.getClass(), "boundsOp", 0);
        setField(term196820, term196820.getClass(), "compoundShape", null);
        setField(term196820, term196820.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term196820, term196820.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term196820, term196820.getClass(), "backgroundEraseDisabled", false);
        setField(term196820, term196820.getClass(), "eventCache", null);
        setBooleanField(term196820, term196820.getClass(), "coalescingEnabled", false);
        setBooleanField(term196820, term196820.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term196820, term196820.getClass(), "componentSerializedDataVersion", 0);
        setField(term196820, term196820.getClass(), "accessibleContext", null);
        term196874 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term196874;
        callMethod(klass, "setShowNumber", argTypes, term196820, args);
    }

};


