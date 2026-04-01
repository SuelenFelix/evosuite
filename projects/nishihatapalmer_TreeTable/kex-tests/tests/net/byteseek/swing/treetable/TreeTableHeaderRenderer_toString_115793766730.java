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

public class TreeTableHeaderRenderer_toString_115793766730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296453;

    public TreeTableHeaderRenderer_toString_115793766730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296453 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term296453, term296453.getClass(), "sortIconBorder", null);
        setField(term296453, term296453.getClass(), "paintLabel", null);
        setBooleanField(term296453, term296453.getClass(), "boldOnSorted", false);
        setBooleanField(term296453, term296453.getClass(), "showNumber", false);
        setField(term296453, term296453.getClass(), "sortAscendingIcon", null);
        setField(term296453, term296453.getClass(), "sortDescendingIcon", null);
        setField(term296453, term296453.getClass(), "cachedHeaderFont", null);
        setField(term296453, term296453.getClass(), "boldHeaderFont", null);
        setIntField(term296453, term296453.getClass(), "sortOrderNumber", 0);
        setField(term296453, term296453.getClass(), "sortOrder", null);
        setIntField(term296453, term296453.getClass(), "maxIconWidth", 0);
        setIntField(term296453, term296453.getClass(), "sortNumberTextWidth", 0);
        setIntField(term296453, term296453.getClass(), "mnemonic", 0);
        setIntField(term296453, term296453.getClass(), "mnemonicIndex", 0);
        setField(term296453, term296453.getClass(), "text", null);
        setField(term296453, term296453.getClass(), "defaultIcon", null);
        setField(term296453, term296453.getClass(), "disabledIcon", null);
        setBooleanField(term296453, term296453.getClass(), "disabledIconSet", false);
        setIntField(term296453, term296453.getClass(), "verticalAlignment", 0);
        setIntField(term296453, term296453.getClass(), "horizontalAlignment", 0);
        setIntField(term296453, term296453.getClass(), "verticalTextPosition", 0);
        setIntField(term296453, term296453.getClass(), "horizontalTextPosition", 0);
        setIntField(term296453, term296453.getClass(), "iconTextGap", 0);
        setField(term296453, term296453.getClass(), "labelFor", null);
        setBooleanField(term296453, term296453.getClass(), "isAlignmentXSet", false);
        setFloatField(term296453, term296453.getClass(), "alignmentX", 0.0F);
        setBooleanField(term296453, term296453.getClass(), "isAlignmentYSet", false);
        setFloatField(term296453, term296453.getClass(), "alignmentY", 0.0F);
        setField(term296453, term296453.getClass(), "ui", null);
        setField(term296453, term296453.getClass(), "listenerList", null);
        setField(term296453, term296453.getClass(), "clientProperties", null);
        setField(term296453, term296453.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term296453, term296453.getClass(), "autoscrolls", false);
        setField(term296453, term296453.getClass(), "border", null);
        setIntField(term296453, term296453.getClass(), "flags", 0);
        setField(term296453, term296453.getClass(), "inputVerifier", null);
        setBooleanField(term296453, term296453.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term296453, term296453.getClass(), "paintingChild", null);
        setField(term296453, term296453.getClass(), "popupMenu", null);
        setField(term296453, term296453.getClass(), "revalidateRunnableScheduled", null);
        setField(term296453, term296453.getClass(), "focusInputMap", null);
        setField(term296453, term296453.getClass(), "ancestorInputMap", null);
        setField(term296453, term296453.getClass(), "windowInputMap", null);
        setField(term296453, term296453.getClass(), "actionMap", null);
        setField(term296453, term296453.getClass(), "aaHint", null);
        setField(term296453, term296453.getClass(), "lcdRenderingHint", null);
        setField(term296453, term296453.getClass(), "component", null);
        setField(term296453, term296453.getClass(), "layoutMgr", null);
        setField(term296453, term296453.getClass(), "dispatcher", null);
        setField(term296453, term296453.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term296453, term296453.getClass(), "focusCycleRoot", false);
        setBooleanField(term296453, term296453.getClass(), "focusTraversalPolicyProvider", false);
        setField(term296453, term296453.getClass(), "printingThreads", null);
        setBooleanField(term296453, term296453.getClass(), "printing", false);
        setField(term296453, term296453.getClass(), "containerListener", null);
        setIntField(term296453, term296453.getClass(), "listeningChildren", 0);
        setIntField(term296453, term296453.getClass(), "listeningBoundsChildren", 0);
        setIntField(term296453, term296453.getClass(), "descendantsCount", 0);
        setField(term296453, term296453.getClass(), "preserveBackgroundColor", null);
        setIntField(term296453, term296453.getClass(), "numOfHWComponents", 0);
        setIntField(term296453, term296453.getClass(), "numOfLWComponents", 0);
        setField(term296453, term296453.getClass(), "modalComp", null);
        setField(term296453, term296453.getClass(), "modalAppContext", null);
        setIntField(term296453, term296453.getClass(), "containerSerializedDataVersion", 0);
        setField(term296453, term296453.getClass(), "peer", null);
        setField(term296453, term296453.getClass(), "parent", null);
        setField(term296453, term296453.getClass(), "appContext", null);
        setIntField(term296453, term296453.getClass(), "x", 0);
        setIntField(term296453, term296453.getClass(), "y", 0);
        setIntField(term296453, term296453.getClass(), "width", 0);
        setIntField(term296453, term296453.getClass(), "height", 0);
        setField(term296453, term296453.getClass(), "foreground", null);
        setField(term296453, term296453.getClass(), "background", null);
        setField(term296453, term296453.getClass(), "font", null);
        setField(term296453, term296453.getClass(), "peerFont", null);
        setField(term296453, term296453.getClass(), "cursor", null);
        setField(term296453, term296453.getClass(), "locale", null);
        setField(term296453, term296453.getClass(), "graphicsConfig", null);
        setField(term296453, term296453.getClass(), "bufferStrategy", null);
        setBooleanField(term296453, term296453.getClass(), "ignoreRepaint", false);
        setBooleanField(term296453, term296453.getClass(), "visible", false);
        setBooleanField(term296453, term296453.getClass(), "enabled", false);
        setBooleanField(term296453, term296453.getClass(), "valid", false);
        setField(term296453, term296453.getClass(), "dropTarget", null);
        setField(term296453, term296453.getClass(), "popups", null);
        setField(term296453, term296453.getClass(), "name", null);
        setBooleanField(term296453, term296453.getClass(), "nameExplicitlySet", false);
        setBooleanField(term296453, term296453.getClass(), "focusable", false);
        setIntField(term296453, term296453.getClass(), "isFocusTraversableOverridden", 0);
        setField(term296453, term296453.getClass(), "focusTraversalKeys", null);
        setBooleanField(term296453, term296453.getClass(), "focusTraversalKeysEnabled", false);
        setField(term296453, term296453.getClass(), "acc", null);
        setField(term296453, term296453.getClass(), "minSize", null);
        setBooleanField(term296453, term296453.getClass(), "minSizeSet", false);
        setField(term296453, term296453.getClass(), "prefSize", null);
        setBooleanField(term296453, term296453.getClass(), "prefSizeSet", false);
        setField(term296453, term296453.getClass(), "maxSize", null);
        setBooleanField(term296453, term296453.getClass(), "maxSizeSet", false);
        setField(term296453, term296453.getClass(), "componentOrientation", null);
        setBooleanField(term296453, term296453.getClass(), "newEventsOnly", false);
        setField(term296453, term296453.getClass(), "componentListener", null);
        setField(term296453, term296453.getClass(), "focusListener", null);
        setField(term296453, term296453.getClass(), "hierarchyListener", null);
        setField(term296453, term296453.getClass(), "hierarchyBoundsListener", null);
        setField(term296453, term296453.getClass(), "keyListener", null);
        setField(term296453, term296453.getClass(), "mouseListener", null);
        setField(term296453, term296453.getClass(), "mouseMotionListener", null);
        setField(term296453, term296453.getClass(), "mouseWheelListener", null);
        setField(term296453, term296453.getClass(), "inputMethodListener", null);
        setLongField(term296453, term296453.getClass(), "eventMask", 0L);
        setField(term296453, term296453.getClass(), "changeSupport", null);
        setField(term296453, term296453.getClass(), "objectLock", null);
        setBooleanField(term296453, term296453.getClass(), "isPacked", false);
        setIntField(term296453, term296453.getClass(), "boundsOp", 0);
        setField(term296453, term296453.getClass(), "compoundShape", null);
        setField(term296453, term296453.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term296453, term296453.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term296453, term296453.getClass(), "backgroundEraseDisabled", false);
        setField(term296453, term296453.getClass(), "eventCache", null);
        setBooleanField(term296453, term296453.getClass(), "coalescingEnabled", false);
        setBooleanField(term296453, term296453.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term296453, term296453.getClass(), "componentSerializedDataVersion", 0);
        setField(term296453, term296453.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term296453, args);
    }

};


