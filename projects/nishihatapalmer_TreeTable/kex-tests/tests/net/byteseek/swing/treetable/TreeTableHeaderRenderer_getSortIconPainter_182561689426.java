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

public class TreeTableHeaderRenderer_getSortIconPainter_182561689426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271282;

    public TreeTableHeaderRenderer_getSortIconPainter_182561689426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271282 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term271282, term271282.getClass(), "sortIconBorder", null);
        setField(term271282, term271282.getClass(), "paintLabel", null);
        setBooleanField(term271282, term271282.getClass(), "boldOnSorted", false);
        setBooleanField(term271282, term271282.getClass(), "showNumber", false);
        setField(term271282, term271282.getClass(), "sortAscendingIcon", null);
        setField(term271282, term271282.getClass(), "sortDescendingIcon", null);
        setField(term271282, term271282.getClass(), "cachedHeaderFont", null);
        setField(term271282, term271282.getClass(), "boldHeaderFont", null);
        setIntField(term271282, term271282.getClass(), "sortOrderNumber", 0);
        setField(term271282, term271282.getClass(), "sortOrder", null);
        setIntField(term271282, term271282.getClass(), "maxIconWidth", 0);
        setIntField(term271282, term271282.getClass(), "sortNumberTextWidth", 0);
        setIntField(term271282, term271282.getClass(), "mnemonic", 0);
        setIntField(term271282, term271282.getClass(), "mnemonicIndex", 0);
        setField(term271282, term271282.getClass(), "text", null);
        setField(term271282, term271282.getClass(), "defaultIcon", null);
        setField(term271282, term271282.getClass(), "disabledIcon", null);
        setBooleanField(term271282, term271282.getClass(), "disabledIconSet", false);
        setIntField(term271282, term271282.getClass(), "verticalAlignment", 0);
        setIntField(term271282, term271282.getClass(), "horizontalAlignment", 0);
        setIntField(term271282, term271282.getClass(), "verticalTextPosition", 0);
        setIntField(term271282, term271282.getClass(), "horizontalTextPosition", 0);
        setIntField(term271282, term271282.getClass(), "iconTextGap", 0);
        setField(term271282, term271282.getClass(), "labelFor", null);
        setBooleanField(term271282, term271282.getClass(), "isAlignmentXSet", false);
        setFloatField(term271282, term271282.getClass(), "alignmentX", 0.0F);
        setBooleanField(term271282, term271282.getClass(), "isAlignmentYSet", false);
        setFloatField(term271282, term271282.getClass(), "alignmentY", 0.0F);
        setField(term271282, term271282.getClass(), "ui", null);
        setField(term271282, term271282.getClass(), "listenerList", null);
        setField(term271282, term271282.getClass(), "clientProperties", null);
        setField(term271282, term271282.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term271282, term271282.getClass(), "autoscrolls", false);
        setField(term271282, term271282.getClass(), "border", null);
        setIntField(term271282, term271282.getClass(), "flags", 0);
        setField(term271282, term271282.getClass(), "inputVerifier", null);
        setBooleanField(term271282, term271282.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term271282, term271282.getClass(), "paintingChild", null);
        setField(term271282, term271282.getClass(), "popupMenu", null);
        setField(term271282, term271282.getClass(), "revalidateRunnableScheduled", null);
        setField(term271282, term271282.getClass(), "focusInputMap", null);
        setField(term271282, term271282.getClass(), "ancestorInputMap", null);
        setField(term271282, term271282.getClass(), "windowInputMap", null);
        setField(term271282, term271282.getClass(), "actionMap", null);
        setField(term271282, term271282.getClass(), "aaHint", null);
        setField(term271282, term271282.getClass(), "lcdRenderingHint", null);
        setField(term271282, term271282.getClass(), "component", null);
        setField(term271282, term271282.getClass(), "layoutMgr", null);
        setField(term271282, term271282.getClass(), "dispatcher", null);
        setField(term271282, term271282.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term271282, term271282.getClass(), "focusCycleRoot", false);
        setBooleanField(term271282, term271282.getClass(), "focusTraversalPolicyProvider", false);
        setField(term271282, term271282.getClass(), "printingThreads", null);
        setBooleanField(term271282, term271282.getClass(), "printing", false);
        setField(term271282, term271282.getClass(), "containerListener", null);
        setIntField(term271282, term271282.getClass(), "listeningChildren", 0);
        setIntField(term271282, term271282.getClass(), "listeningBoundsChildren", 0);
        setIntField(term271282, term271282.getClass(), "descendantsCount", 0);
        setField(term271282, term271282.getClass(), "preserveBackgroundColor", null);
        setIntField(term271282, term271282.getClass(), "numOfHWComponents", 0);
        setIntField(term271282, term271282.getClass(), "numOfLWComponents", 0);
        setField(term271282, term271282.getClass(), "modalComp", null);
        setField(term271282, term271282.getClass(), "modalAppContext", null);
        setIntField(term271282, term271282.getClass(), "containerSerializedDataVersion", 0);
        setField(term271282, term271282.getClass(), "peer", null);
        setField(term271282, term271282.getClass(), "parent", null);
        setField(term271282, term271282.getClass(), "appContext", null);
        setIntField(term271282, term271282.getClass(), "x", 0);
        setIntField(term271282, term271282.getClass(), "y", 0);
        setIntField(term271282, term271282.getClass(), "width", 0);
        setIntField(term271282, term271282.getClass(), "height", 0);
        setField(term271282, term271282.getClass(), "foreground", null);
        setField(term271282, term271282.getClass(), "background", null);
        setField(term271282, term271282.getClass(), "font", null);
        setField(term271282, term271282.getClass(), "peerFont", null);
        setField(term271282, term271282.getClass(), "cursor", null);
        setField(term271282, term271282.getClass(), "locale", null);
        setField(term271282, term271282.getClass(), "graphicsConfig", null);
        setField(term271282, term271282.getClass(), "bufferStrategy", null);
        setBooleanField(term271282, term271282.getClass(), "ignoreRepaint", false);
        setBooleanField(term271282, term271282.getClass(), "visible", false);
        setBooleanField(term271282, term271282.getClass(), "enabled", false);
        setBooleanField(term271282, term271282.getClass(), "valid", false);
        setField(term271282, term271282.getClass(), "dropTarget", null);
        setField(term271282, term271282.getClass(), "popups", null);
        setField(term271282, term271282.getClass(), "name", null);
        setBooleanField(term271282, term271282.getClass(), "nameExplicitlySet", false);
        setBooleanField(term271282, term271282.getClass(), "focusable", false);
        setIntField(term271282, term271282.getClass(), "isFocusTraversableOverridden", 0);
        setField(term271282, term271282.getClass(), "focusTraversalKeys", null);
        setBooleanField(term271282, term271282.getClass(), "focusTraversalKeysEnabled", false);
        setField(term271282, term271282.getClass(), "acc", null);
        setField(term271282, term271282.getClass(), "minSize", null);
        setBooleanField(term271282, term271282.getClass(), "minSizeSet", false);
        setField(term271282, term271282.getClass(), "prefSize", null);
        setBooleanField(term271282, term271282.getClass(), "prefSizeSet", false);
        setField(term271282, term271282.getClass(), "maxSize", null);
        setBooleanField(term271282, term271282.getClass(), "maxSizeSet", false);
        setField(term271282, term271282.getClass(), "componentOrientation", null);
        setBooleanField(term271282, term271282.getClass(), "newEventsOnly", false);
        setField(term271282, term271282.getClass(), "componentListener", null);
        setField(term271282, term271282.getClass(), "focusListener", null);
        setField(term271282, term271282.getClass(), "hierarchyListener", null);
        setField(term271282, term271282.getClass(), "hierarchyBoundsListener", null);
        setField(term271282, term271282.getClass(), "keyListener", null);
        setField(term271282, term271282.getClass(), "mouseListener", null);
        setField(term271282, term271282.getClass(), "mouseMotionListener", null);
        setField(term271282, term271282.getClass(), "mouseWheelListener", null);
        setField(term271282, term271282.getClass(), "inputMethodListener", null);
        setLongField(term271282, term271282.getClass(), "eventMask", 0L);
        setField(term271282, term271282.getClass(), "changeSupport", null);
        setField(term271282, term271282.getClass(), "objectLock", null);
        setBooleanField(term271282, term271282.getClass(), "isPacked", false);
        setIntField(term271282, term271282.getClass(), "boundsOp", 0);
        setField(term271282, term271282.getClass(), "compoundShape", null);
        setField(term271282, term271282.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term271282, term271282.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term271282, term271282.getClass(), "backgroundEraseDisabled", false);
        setField(term271282, term271282.getClass(), "eventCache", null);
        setBooleanField(term271282, term271282.getClass(), "coalescingEnabled", false);
        setBooleanField(term271282, term271282.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term271282, term271282.getClass(), "componentSerializedDataVersion", 0);
        setField(term271282, term271282.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortIconPainter", argTypes, term271282, args);
    }

};


