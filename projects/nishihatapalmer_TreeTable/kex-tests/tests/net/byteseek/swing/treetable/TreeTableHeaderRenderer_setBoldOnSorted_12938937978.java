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

public class TreeTableHeaderRenderer_setBoldOnSorted_12938937978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159988;
     Object term160042;

    public TreeTableHeaderRenderer_setBoldOnSorted_12938937978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159988 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term159988, term159988.getClass(), "sortIconBorder", null);
        setField(term159988, term159988.getClass(), "paintLabel", null);
        setBooleanField(term159988, term159988.getClass(), "boldOnSorted", false);
        setBooleanField(term159988, term159988.getClass(), "showNumber", false);
        setField(term159988, term159988.getClass(), "sortAscendingIcon", null);
        setField(term159988, term159988.getClass(), "sortDescendingIcon", null);
        setField(term159988, term159988.getClass(), "cachedHeaderFont", null);
        setField(term159988, term159988.getClass(), "boldHeaderFont", null);
        setIntField(term159988, term159988.getClass(), "sortOrderNumber", 0);
        setField(term159988, term159988.getClass(), "sortOrder", null);
        setIntField(term159988, term159988.getClass(), "maxIconWidth", 0);
        setIntField(term159988, term159988.getClass(), "sortNumberTextWidth", 0);
        setIntField(term159988, term159988.getClass(), "mnemonic", 0);
        setIntField(term159988, term159988.getClass(), "mnemonicIndex", 0);
        setField(term159988, term159988.getClass(), "text", null);
        setField(term159988, term159988.getClass(), "defaultIcon", null);
        setField(term159988, term159988.getClass(), "disabledIcon", null);
        setBooleanField(term159988, term159988.getClass(), "disabledIconSet", false);
        setIntField(term159988, term159988.getClass(), "verticalAlignment", 0);
        setIntField(term159988, term159988.getClass(), "horizontalAlignment", 0);
        setIntField(term159988, term159988.getClass(), "verticalTextPosition", 0);
        setIntField(term159988, term159988.getClass(), "horizontalTextPosition", 0);
        setIntField(term159988, term159988.getClass(), "iconTextGap", 0);
        setField(term159988, term159988.getClass(), "labelFor", null);
        setBooleanField(term159988, term159988.getClass(), "isAlignmentXSet", false);
        setFloatField(term159988, term159988.getClass(), "alignmentX", 0.0F);
        setBooleanField(term159988, term159988.getClass(), "isAlignmentYSet", false);
        setFloatField(term159988, term159988.getClass(), "alignmentY", 0.0F);
        setField(term159988, term159988.getClass(), "ui", null);
        setField(term159988, term159988.getClass(), "listenerList", null);
        setField(term159988, term159988.getClass(), "clientProperties", null);
        setField(term159988, term159988.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term159988, term159988.getClass(), "autoscrolls", false);
        setField(term159988, term159988.getClass(), "border", null);
        setIntField(term159988, term159988.getClass(), "flags", 0);
        setField(term159988, term159988.getClass(), "inputVerifier", null);
        setBooleanField(term159988, term159988.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term159988, term159988.getClass(), "paintingChild", null);
        setField(term159988, term159988.getClass(), "popupMenu", null);
        setField(term159988, term159988.getClass(), "revalidateRunnableScheduled", null);
        setField(term159988, term159988.getClass(), "focusInputMap", null);
        setField(term159988, term159988.getClass(), "ancestorInputMap", null);
        setField(term159988, term159988.getClass(), "windowInputMap", null);
        setField(term159988, term159988.getClass(), "actionMap", null);
        setField(term159988, term159988.getClass(), "aaHint", null);
        setField(term159988, term159988.getClass(), "lcdRenderingHint", null);
        setField(term159988, term159988.getClass(), "component", null);
        setField(term159988, term159988.getClass(), "layoutMgr", null);
        setField(term159988, term159988.getClass(), "dispatcher", null);
        setField(term159988, term159988.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term159988, term159988.getClass(), "focusCycleRoot", false);
        setBooleanField(term159988, term159988.getClass(), "focusTraversalPolicyProvider", false);
        setField(term159988, term159988.getClass(), "printingThreads", null);
        setBooleanField(term159988, term159988.getClass(), "printing", false);
        setField(term159988, term159988.getClass(), "containerListener", null);
        setIntField(term159988, term159988.getClass(), "listeningChildren", 0);
        setIntField(term159988, term159988.getClass(), "listeningBoundsChildren", 0);
        setIntField(term159988, term159988.getClass(), "descendantsCount", 0);
        setField(term159988, term159988.getClass(), "preserveBackgroundColor", null);
        setIntField(term159988, term159988.getClass(), "numOfHWComponents", 0);
        setIntField(term159988, term159988.getClass(), "numOfLWComponents", 0);
        setField(term159988, term159988.getClass(), "modalComp", null);
        setField(term159988, term159988.getClass(), "modalAppContext", null);
        setIntField(term159988, term159988.getClass(), "containerSerializedDataVersion", 0);
        setField(term159988, term159988.getClass(), "peer", null);
        setField(term159988, term159988.getClass(), "parent", null);
        setField(term159988, term159988.getClass(), "appContext", null);
        setIntField(term159988, term159988.getClass(), "x", 0);
        setIntField(term159988, term159988.getClass(), "y", 0);
        setIntField(term159988, term159988.getClass(), "width", 0);
        setIntField(term159988, term159988.getClass(), "height", 0);
        setField(term159988, term159988.getClass(), "foreground", null);
        setField(term159988, term159988.getClass(), "background", null);
        setField(term159988, term159988.getClass(), "font", null);
        setField(term159988, term159988.getClass(), "peerFont", null);
        setField(term159988, term159988.getClass(), "cursor", null);
        setField(term159988, term159988.getClass(), "locale", null);
        setField(term159988, term159988.getClass(), "graphicsConfig", null);
        setField(term159988, term159988.getClass(), "bufferStrategy", null);
        setBooleanField(term159988, term159988.getClass(), "ignoreRepaint", false);
        setBooleanField(term159988, term159988.getClass(), "visible", false);
        setBooleanField(term159988, term159988.getClass(), "enabled", false);
        setBooleanField(term159988, term159988.getClass(), "valid", false);
        setField(term159988, term159988.getClass(), "dropTarget", null);
        setField(term159988, term159988.getClass(), "popups", null);
        setField(term159988, term159988.getClass(), "name", null);
        setBooleanField(term159988, term159988.getClass(), "nameExplicitlySet", false);
        setBooleanField(term159988, term159988.getClass(), "focusable", false);
        setIntField(term159988, term159988.getClass(), "isFocusTraversableOverridden", 0);
        setField(term159988, term159988.getClass(), "focusTraversalKeys", null);
        setBooleanField(term159988, term159988.getClass(), "focusTraversalKeysEnabled", false);
        setField(term159988, term159988.getClass(), "acc", null);
        setField(term159988, term159988.getClass(), "minSize", null);
        setBooleanField(term159988, term159988.getClass(), "minSizeSet", false);
        setField(term159988, term159988.getClass(), "prefSize", null);
        setBooleanField(term159988, term159988.getClass(), "prefSizeSet", false);
        setField(term159988, term159988.getClass(), "maxSize", null);
        setBooleanField(term159988, term159988.getClass(), "maxSizeSet", false);
        setField(term159988, term159988.getClass(), "componentOrientation", null);
        setBooleanField(term159988, term159988.getClass(), "newEventsOnly", false);
        setField(term159988, term159988.getClass(), "componentListener", null);
        setField(term159988, term159988.getClass(), "focusListener", null);
        setField(term159988, term159988.getClass(), "hierarchyListener", null);
        setField(term159988, term159988.getClass(), "hierarchyBoundsListener", null);
        setField(term159988, term159988.getClass(), "keyListener", null);
        setField(term159988, term159988.getClass(), "mouseListener", null);
        setField(term159988, term159988.getClass(), "mouseMotionListener", null);
        setField(term159988, term159988.getClass(), "mouseWheelListener", null);
        setField(term159988, term159988.getClass(), "inputMethodListener", null);
        setLongField(term159988, term159988.getClass(), "eventMask", 0L);
        setField(term159988, term159988.getClass(), "changeSupport", null);
        setField(term159988, term159988.getClass(), "objectLock", null);
        setBooleanField(term159988, term159988.getClass(), "isPacked", false);
        setIntField(term159988, term159988.getClass(), "boundsOp", 0);
        setField(term159988, term159988.getClass(), "compoundShape", null);
        setField(term159988, term159988.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term159988, term159988.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term159988, term159988.getClass(), "backgroundEraseDisabled", false);
        setField(term159988, term159988.getClass(), "eventCache", null);
        setBooleanField(term159988, term159988.getClass(), "coalescingEnabled", false);
        setBooleanField(term159988, term159988.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term159988, term159988.getClass(), "componentSerializedDataVersion", 0);
        setField(term159988, term159988.getClass(), "accessibleContext", null);
        term160042 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term160042;
        callMethod(klass, "setBoldOnSorted", argTypes, term159988, args);
    }

};


