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
     Object term184420;

    public TreeTableHeaderRenderer_getShowNumber_196165807212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184420 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term184420, term184420.getClass(), "sortIconBorder", null);
        setField(term184420, term184420.getClass(), "paintLabel", null);
        setBooleanField(term184420, term184420.getClass(), "boldOnSorted", false);
        setBooleanField(term184420, term184420.getClass(), "showNumber", false);
        setField(term184420, term184420.getClass(), "sortAscendingIcon", null);
        setField(term184420, term184420.getClass(), "sortDescendingIcon", null);
        setField(term184420, term184420.getClass(), "cachedHeaderFont", null);
        setField(term184420, term184420.getClass(), "boldHeaderFont", null);
        setIntField(term184420, term184420.getClass(), "sortOrderNumber", 0);
        setField(term184420, term184420.getClass(), "sortOrder", null);
        setIntField(term184420, term184420.getClass(), "maxIconWidth", 0);
        setIntField(term184420, term184420.getClass(), "sortNumberTextWidth", 0);
        setIntField(term184420, term184420.getClass(), "mnemonic", 0);
        setIntField(term184420, term184420.getClass(), "mnemonicIndex", 0);
        setField(term184420, term184420.getClass(), "text", null);
        setField(term184420, term184420.getClass(), "defaultIcon", null);
        setField(term184420, term184420.getClass(), "disabledIcon", null);
        setBooleanField(term184420, term184420.getClass(), "disabledIconSet", false);
        setIntField(term184420, term184420.getClass(), "verticalAlignment", 0);
        setIntField(term184420, term184420.getClass(), "horizontalAlignment", 0);
        setIntField(term184420, term184420.getClass(), "verticalTextPosition", 0);
        setIntField(term184420, term184420.getClass(), "horizontalTextPosition", 0);
        setIntField(term184420, term184420.getClass(), "iconTextGap", 0);
        setField(term184420, term184420.getClass(), "labelFor", null);
        setBooleanField(term184420, term184420.getClass(), "isAlignmentXSet", false);
        setFloatField(term184420, term184420.getClass(), "alignmentX", 0.0F);
        setBooleanField(term184420, term184420.getClass(), "isAlignmentYSet", false);
        setFloatField(term184420, term184420.getClass(), "alignmentY", 0.0F);
        setField(term184420, term184420.getClass(), "ui", null);
        setField(term184420, term184420.getClass(), "listenerList", null);
        setField(term184420, term184420.getClass(), "clientProperties", null);
        setField(term184420, term184420.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term184420, term184420.getClass(), "autoscrolls", false);
        setField(term184420, term184420.getClass(), "border", null);
        setIntField(term184420, term184420.getClass(), "flags", 0);
        setField(term184420, term184420.getClass(), "inputVerifier", null);
        setBooleanField(term184420, term184420.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term184420, term184420.getClass(), "paintingChild", null);
        setField(term184420, term184420.getClass(), "popupMenu", null);
        setField(term184420, term184420.getClass(), "revalidateRunnableScheduled", null);
        setField(term184420, term184420.getClass(), "focusInputMap", null);
        setField(term184420, term184420.getClass(), "ancestorInputMap", null);
        setField(term184420, term184420.getClass(), "windowInputMap", null);
        setField(term184420, term184420.getClass(), "actionMap", null);
        setField(term184420, term184420.getClass(), "aaHint", null);
        setField(term184420, term184420.getClass(), "lcdRenderingHint", null);
        setField(term184420, term184420.getClass(), "component", null);
        setField(term184420, term184420.getClass(), "layoutMgr", null);
        setField(term184420, term184420.getClass(), "dispatcher", null);
        setField(term184420, term184420.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term184420, term184420.getClass(), "focusCycleRoot", false);
        setBooleanField(term184420, term184420.getClass(), "focusTraversalPolicyProvider", false);
        setField(term184420, term184420.getClass(), "printingThreads", null);
        setBooleanField(term184420, term184420.getClass(), "printing", false);
        setField(term184420, term184420.getClass(), "containerListener", null);
        setIntField(term184420, term184420.getClass(), "listeningChildren", 0);
        setIntField(term184420, term184420.getClass(), "listeningBoundsChildren", 0);
        setIntField(term184420, term184420.getClass(), "descendantsCount", 0);
        setField(term184420, term184420.getClass(), "preserveBackgroundColor", null);
        setIntField(term184420, term184420.getClass(), "numOfHWComponents", 0);
        setIntField(term184420, term184420.getClass(), "numOfLWComponents", 0);
        setField(term184420, term184420.getClass(), "modalComp", null);
        setField(term184420, term184420.getClass(), "modalAppContext", null);
        setIntField(term184420, term184420.getClass(), "containerSerializedDataVersion", 0);
        setField(term184420, term184420.getClass(), "peer", null);
        setField(term184420, term184420.getClass(), "parent", null);
        setField(term184420, term184420.getClass(), "appContext", null);
        setIntField(term184420, term184420.getClass(), "x", 0);
        setIntField(term184420, term184420.getClass(), "y", 0);
        setIntField(term184420, term184420.getClass(), "width", 0);
        setIntField(term184420, term184420.getClass(), "height", 0);
        setField(term184420, term184420.getClass(), "foreground", null);
        setField(term184420, term184420.getClass(), "background", null);
        setField(term184420, term184420.getClass(), "font", null);
        setField(term184420, term184420.getClass(), "peerFont", null);
        setField(term184420, term184420.getClass(), "cursor", null);
        setField(term184420, term184420.getClass(), "locale", null);
        setField(term184420, term184420.getClass(), "graphicsConfig", null);
        setField(term184420, term184420.getClass(), "bufferStrategy", null);
        setBooleanField(term184420, term184420.getClass(), "ignoreRepaint", false);
        setBooleanField(term184420, term184420.getClass(), "visible", false);
        setBooleanField(term184420, term184420.getClass(), "enabled", false);
        setBooleanField(term184420, term184420.getClass(), "valid", false);
        setField(term184420, term184420.getClass(), "dropTarget", null);
        setField(term184420, term184420.getClass(), "popups", null);
        setField(term184420, term184420.getClass(), "name", null);
        setBooleanField(term184420, term184420.getClass(), "nameExplicitlySet", false);
        setBooleanField(term184420, term184420.getClass(), "focusable", false);
        setIntField(term184420, term184420.getClass(), "isFocusTraversableOverridden", 0);
        setField(term184420, term184420.getClass(), "focusTraversalKeys", null);
        setBooleanField(term184420, term184420.getClass(), "focusTraversalKeysEnabled", false);
        setField(term184420, term184420.getClass(), "acc", null);
        setField(term184420, term184420.getClass(), "minSize", null);
        setBooleanField(term184420, term184420.getClass(), "minSizeSet", false);
        setField(term184420, term184420.getClass(), "prefSize", null);
        setBooleanField(term184420, term184420.getClass(), "prefSizeSet", false);
        setField(term184420, term184420.getClass(), "maxSize", null);
        setBooleanField(term184420, term184420.getClass(), "maxSizeSet", false);
        setField(term184420, term184420.getClass(), "componentOrientation", null);
        setBooleanField(term184420, term184420.getClass(), "newEventsOnly", false);
        setField(term184420, term184420.getClass(), "componentListener", null);
        setField(term184420, term184420.getClass(), "focusListener", null);
        setField(term184420, term184420.getClass(), "hierarchyListener", null);
        setField(term184420, term184420.getClass(), "hierarchyBoundsListener", null);
        setField(term184420, term184420.getClass(), "keyListener", null);
        setField(term184420, term184420.getClass(), "mouseListener", null);
        setField(term184420, term184420.getClass(), "mouseMotionListener", null);
        setField(term184420, term184420.getClass(), "mouseWheelListener", null);
        setField(term184420, term184420.getClass(), "inputMethodListener", null);
        setLongField(term184420, term184420.getClass(), "eventMask", 0L);
        setField(term184420, term184420.getClass(), "changeSupport", null);
        setField(term184420, term184420.getClass(), "objectLock", null);
        setBooleanField(term184420, term184420.getClass(), "isPacked", false);
        setIntField(term184420, term184420.getClass(), "boundsOp", 0);
        setField(term184420, term184420.getClass(), "compoundShape", null);
        setField(term184420, term184420.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term184420, term184420.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term184420, term184420.getClass(), "backgroundEraseDisabled", false);
        setField(term184420, term184420.getClass(), "eventCache", null);
        setBooleanField(term184420, term184420.getClass(), "coalescingEnabled", false);
        setBooleanField(term184420, term184420.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term184420, term184420.getClass(), "componentSerializedDataVersion", 0);
        setField(term184420, term184420.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShowNumber", argTypes, term184420, args);
    }

};


