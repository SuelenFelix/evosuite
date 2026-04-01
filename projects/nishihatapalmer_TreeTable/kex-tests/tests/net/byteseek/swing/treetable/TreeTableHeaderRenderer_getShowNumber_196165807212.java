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

public class TreeTableHeaderRenderer_getShowNumber_196165807212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184776;

    public TreeTableHeaderRenderer_getShowNumber_196165807212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184776 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term184776, term184776.getClass(), "sortIconBorder", null);
        setField(term184776, term184776.getClass(), "paintLabel", null);
        setBooleanField(term184776, term184776.getClass(), "boldOnSorted", false);
        setBooleanField(term184776, term184776.getClass(), "showNumber", false);
        setField(term184776, term184776.getClass(), "sortAscendingIcon", null);
        setField(term184776, term184776.getClass(), "sortDescendingIcon", null);
        setField(term184776, term184776.getClass(), "cachedHeaderFont", null);
        setField(term184776, term184776.getClass(), "boldHeaderFont", null);
        setIntField(term184776, term184776.getClass(), "sortOrderNumber", 0);
        setField(term184776, term184776.getClass(), "sortOrder", null);
        setIntField(term184776, term184776.getClass(), "maxIconWidth", 0);
        setIntField(term184776, term184776.getClass(), "sortNumberTextWidth", 0);
        setIntField(term184776, term184776.getClass(), "mnemonic", 0);
        setIntField(term184776, term184776.getClass(), "mnemonicIndex", 0);
        setField(term184776, term184776.getClass(), "text", null);
        setField(term184776, term184776.getClass(), "defaultIcon", null);
        setField(term184776, term184776.getClass(), "disabledIcon", null);
        setBooleanField(term184776, term184776.getClass(), "disabledIconSet", false);
        setIntField(term184776, term184776.getClass(), "verticalAlignment", 0);
        setIntField(term184776, term184776.getClass(), "horizontalAlignment", 0);
        setIntField(term184776, term184776.getClass(), "verticalTextPosition", 0);
        setIntField(term184776, term184776.getClass(), "horizontalTextPosition", 0);
        setIntField(term184776, term184776.getClass(), "iconTextGap", 0);
        setField(term184776, term184776.getClass(), "labelFor", null);
        setBooleanField(term184776, term184776.getClass(), "isAlignmentXSet", false);
        setFloatField(term184776, term184776.getClass(), "alignmentX", 0.0F);
        setBooleanField(term184776, term184776.getClass(), "isAlignmentYSet", false);
        setFloatField(term184776, term184776.getClass(), "alignmentY", 0.0F);
        setField(term184776, term184776.getClass(), "ui", null);
        setField(term184776, term184776.getClass(), "listenerList", null);
        setField(term184776, term184776.getClass(), "clientProperties", null);
        setField(term184776, term184776.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term184776, term184776.getClass(), "autoscrolls", false);
        setField(term184776, term184776.getClass(), "border", null);
        setIntField(term184776, term184776.getClass(), "flags", 0);
        setField(term184776, term184776.getClass(), "inputVerifier", null);
        setBooleanField(term184776, term184776.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term184776, term184776.getClass(), "paintingChild", null);
        setField(term184776, term184776.getClass(), "popupMenu", null);
        setField(term184776, term184776.getClass(), "revalidateRunnableScheduled", null);
        setField(term184776, term184776.getClass(), "focusInputMap", null);
        setField(term184776, term184776.getClass(), "ancestorInputMap", null);
        setField(term184776, term184776.getClass(), "windowInputMap", null);
        setField(term184776, term184776.getClass(), "actionMap", null);
        setField(term184776, term184776.getClass(), "aaHint", null);
        setField(term184776, term184776.getClass(), "lcdRenderingHint", null);
        setField(term184776, term184776.getClass(), "component", null);
        setField(term184776, term184776.getClass(), "layoutMgr", null);
        setField(term184776, term184776.getClass(), "dispatcher", null);
        setField(term184776, term184776.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term184776, term184776.getClass(), "focusCycleRoot", false);
        setBooleanField(term184776, term184776.getClass(), "focusTraversalPolicyProvider", false);
        setField(term184776, term184776.getClass(), "printingThreads", null);
        setBooleanField(term184776, term184776.getClass(), "printing", false);
        setField(term184776, term184776.getClass(), "containerListener", null);
        setIntField(term184776, term184776.getClass(), "listeningChildren", 0);
        setIntField(term184776, term184776.getClass(), "listeningBoundsChildren", 0);
        setIntField(term184776, term184776.getClass(), "descendantsCount", 0);
        setField(term184776, term184776.getClass(), "preserveBackgroundColor", null);
        setIntField(term184776, term184776.getClass(), "numOfHWComponents", 0);
        setIntField(term184776, term184776.getClass(), "numOfLWComponents", 0);
        setField(term184776, term184776.getClass(), "modalComp", null);
        setField(term184776, term184776.getClass(), "modalAppContext", null);
        setIntField(term184776, term184776.getClass(), "containerSerializedDataVersion", 0);
        setField(term184776, term184776.getClass(), "peer", null);
        setField(term184776, term184776.getClass(), "parent", null);
        setField(term184776, term184776.getClass(), "appContext", null);
        setIntField(term184776, term184776.getClass(), "x", 0);
        setIntField(term184776, term184776.getClass(), "y", 0);
        setIntField(term184776, term184776.getClass(), "width", 0);
        setIntField(term184776, term184776.getClass(), "height", 0);
        setField(term184776, term184776.getClass(), "foreground", null);
        setField(term184776, term184776.getClass(), "background", null);
        setField(term184776, term184776.getClass(), "font", null);
        setField(term184776, term184776.getClass(), "peerFont", null);
        setField(term184776, term184776.getClass(), "cursor", null);
        setField(term184776, term184776.getClass(), "locale", null);
        setField(term184776, term184776.getClass(), "graphicsConfig", null);
        setField(term184776, term184776.getClass(), "bufferStrategy", null);
        setBooleanField(term184776, term184776.getClass(), "ignoreRepaint", false);
        setBooleanField(term184776, term184776.getClass(), "visible", false);
        setBooleanField(term184776, term184776.getClass(), "enabled", false);
        setBooleanField(term184776, term184776.getClass(), "valid", false);
        setField(term184776, term184776.getClass(), "dropTarget", null);
        setField(term184776, term184776.getClass(), "popups", null);
        setField(term184776, term184776.getClass(), "name", null);
        setBooleanField(term184776, term184776.getClass(), "nameExplicitlySet", false);
        setBooleanField(term184776, term184776.getClass(), "focusable", false);
        setIntField(term184776, term184776.getClass(), "isFocusTraversableOverridden", 0);
        setField(term184776, term184776.getClass(), "focusTraversalKeys", null);
        setBooleanField(term184776, term184776.getClass(), "focusTraversalKeysEnabled", false);
        setField(term184776, term184776.getClass(), "acc", null);
        setField(term184776, term184776.getClass(), "minSize", null);
        setBooleanField(term184776, term184776.getClass(), "minSizeSet", false);
        setField(term184776, term184776.getClass(), "prefSize", null);
        setBooleanField(term184776, term184776.getClass(), "prefSizeSet", false);
        setField(term184776, term184776.getClass(), "maxSize", null);
        setBooleanField(term184776, term184776.getClass(), "maxSizeSet", false);
        setField(term184776, term184776.getClass(), "componentOrientation", null);
        setBooleanField(term184776, term184776.getClass(), "newEventsOnly", false);
        setField(term184776, term184776.getClass(), "componentListener", null);
        setField(term184776, term184776.getClass(), "focusListener", null);
        setField(term184776, term184776.getClass(), "hierarchyListener", null);
        setField(term184776, term184776.getClass(), "hierarchyBoundsListener", null);
        setField(term184776, term184776.getClass(), "keyListener", null);
        setField(term184776, term184776.getClass(), "mouseListener", null);
        setField(term184776, term184776.getClass(), "mouseMotionListener", null);
        setField(term184776, term184776.getClass(), "mouseWheelListener", null);
        setField(term184776, term184776.getClass(), "inputMethodListener", null);
        setLongField(term184776, term184776.getClass(), "eventMask", 0L);
        setField(term184776, term184776.getClass(), "changeSupport", null);
        setField(term184776, term184776.getClass(), "objectLock", null);
        setBooleanField(term184776, term184776.getClass(), "isPacked", false);
        setIntField(term184776, term184776.getClass(), "boundsOp", 0);
        setField(term184776, term184776.getClass(), "compoundShape", null);
        setField(term184776, term184776.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term184776, term184776.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term184776, term184776.getClass(), "backgroundEraseDisabled", false);
        setField(term184776, term184776.getClass(), "eventCache", null);
        setBooleanField(term184776, term184776.getClass(), "coalescingEnabled", false);
        setBooleanField(term184776, term184776.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term184776, term184776.getClass(), "componentSerializedDataVersion", 0);
        setField(term184776, term184776.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShowNumber", argTypes, term184776, args);
    }

};


