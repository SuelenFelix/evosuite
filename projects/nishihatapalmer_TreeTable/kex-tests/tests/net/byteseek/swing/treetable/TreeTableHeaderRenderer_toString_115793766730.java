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
     Object term296030;

    public TreeTableHeaderRenderer_toString_115793766730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296030 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term296030, term296030.getClass(), "sortIconBorder", null);
        setField(term296030, term296030.getClass(), "paintLabel", null);
        setBooleanField(term296030, term296030.getClass(), "boldOnSorted", false);
        setBooleanField(term296030, term296030.getClass(), "showNumber", false);
        setField(term296030, term296030.getClass(), "sortAscendingIcon", null);
        setField(term296030, term296030.getClass(), "sortDescendingIcon", null);
        setField(term296030, term296030.getClass(), "cachedHeaderFont", null);
        setField(term296030, term296030.getClass(), "boldHeaderFont", null);
        setIntField(term296030, term296030.getClass(), "sortOrderNumber", 0);
        setField(term296030, term296030.getClass(), "sortOrder", null);
        setIntField(term296030, term296030.getClass(), "maxIconWidth", 0);
        setIntField(term296030, term296030.getClass(), "sortNumberTextWidth", 0);
        setIntField(term296030, term296030.getClass(), "mnemonic", 0);
        setIntField(term296030, term296030.getClass(), "mnemonicIndex", 0);
        setField(term296030, term296030.getClass(), "text", null);
        setField(term296030, term296030.getClass(), "defaultIcon", null);
        setField(term296030, term296030.getClass(), "disabledIcon", null);
        setBooleanField(term296030, term296030.getClass(), "disabledIconSet", false);
        setIntField(term296030, term296030.getClass(), "verticalAlignment", 0);
        setIntField(term296030, term296030.getClass(), "horizontalAlignment", 0);
        setIntField(term296030, term296030.getClass(), "verticalTextPosition", 0);
        setIntField(term296030, term296030.getClass(), "horizontalTextPosition", 0);
        setIntField(term296030, term296030.getClass(), "iconTextGap", 0);
        setField(term296030, term296030.getClass(), "labelFor", null);
        setBooleanField(term296030, term296030.getClass(), "isAlignmentXSet", false);
        setFloatField(term296030, term296030.getClass(), "alignmentX", 0.0F);
        setBooleanField(term296030, term296030.getClass(), "isAlignmentYSet", false);
        setFloatField(term296030, term296030.getClass(), "alignmentY", 0.0F);
        setField(term296030, term296030.getClass(), "ui", null);
        setField(term296030, term296030.getClass(), "listenerList", null);
        setField(term296030, term296030.getClass(), "clientProperties", null);
        setField(term296030, term296030.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term296030, term296030.getClass(), "autoscrolls", false);
        setField(term296030, term296030.getClass(), "border", null);
        setIntField(term296030, term296030.getClass(), "flags", 0);
        setField(term296030, term296030.getClass(), "inputVerifier", null);
        setBooleanField(term296030, term296030.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term296030, term296030.getClass(), "paintingChild", null);
        setField(term296030, term296030.getClass(), "popupMenu", null);
        setField(term296030, term296030.getClass(), "revalidateRunnableScheduled", null);
        setField(term296030, term296030.getClass(), "focusInputMap", null);
        setField(term296030, term296030.getClass(), "ancestorInputMap", null);
        setField(term296030, term296030.getClass(), "windowInputMap", null);
        setField(term296030, term296030.getClass(), "actionMap", null);
        setField(term296030, term296030.getClass(), "aaHint", null);
        setField(term296030, term296030.getClass(), "lcdRenderingHint", null);
        setField(term296030, term296030.getClass(), "component", null);
        setField(term296030, term296030.getClass(), "layoutMgr", null);
        setField(term296030, term296030.getClass(), "dispatcher", null);
        setField(term296030, term296030.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term296030, term296030.getClass(), "focusCycleRoot", false);
        setBooleanField(term296030, term296030.getClass(), "focusTraversalPolicyProvider", false);
        setField(term296030, term296030.getClass(), "printingThreads", null);
        setBooleanField(term296030, term296030.getClass(), "printing", false);
        setField(term296030, term296030.getClass(), "containerListener", null);
        setIntField(term296030, term296030.getClass(), "listeningChildren", 0);
        setIntField(term296030, term296030.getClass(), "listeningBoundsChildren", 0);
        setIntField(term296030, term296030.getClass(), "descendantsCount", 0);
        setField(term296030, term296030.getClass(), "preserveBackgroundColor", null);
        setIntField(term296030, term296030.getClass(), "numOfHWComponents", 0);
        setIntField(term296030, term296030.getClass(), "numOfLWComponents", 0);
        setField(term296030, term296030.getClass(), "modalComp", null);
        setField(term296030, term296030.getClass(), "modalAppContext", null);
        setIntField(term296030, term296030.getClass(), "containerSerializedDataVersion", 0);
        setField(term296030, term296030.getClass(), "peer", null);
        setField(term296030, term296030.getClass(), "parent", null);
        setField(term296030, term296030.getClass(), "appContext", null);
        setIntField(term296030, term296030.getClass(), "x", 0);
        setIntField(term296030, term296030.getClass(), "y", 0);
        setIntField(term296030, term296030.getClass(), "width", 0);
        setIntField(term296030, term296030.getClass(), "height", 0);
        setField(term296030, term296030.getClass(), "foreground", null);
        setField(term296030, term296030.getClass(), "background", null);
        setField(term296030, term296030.getClass(), "font", null);
        setField(term296030, term296030.getClass(), "peerFont", null);
        setField(term296030, term296030.getClass(), "cursor", null);
        setField(term296030, term296030.getClass(), "locale", null);
        setField(term296030, term296030.getClass(), "graphicsConfig", null);
        setField(term296030, term296030.getClass(), "bufferStrategy", null);
        setBooleanField(term296030, term296030.getClass(), "ignoreRepaint", false);
        setBooleanField(term296030, term296030.getClass(), "visible", false);
        setBooleanField(term296030, term296030.getClass(), "enabled", false);
        setBooleanField(term296030, term296030.getClass(), "valid", false);
        setField(term296030, term296030.getClass(), "dropTarget", null);
        setField(term296030, term296030.getClass(), "popups", null);
        setField(term296030, term296030.getClass(), "name", null);
        setBooleanField(term296030, term296030.getClass(), "nameExplicitlySet", false);
        setBooleanField(term296030, term296030.getClass(), "focusable", false);
        setIntField(term296030, term296030.getClass(), "isFocusTraversableOverridden", 0);
        setField(term296030, term296030.getClass(), "focusTraversalKeys", null);
        setBooleanField(term296030, term296030.getClass(), "focusTraversalKeysEnabled", false);
        setField(term296030, term296030.getClass(), "acc", null);
        setField(term296030, term296030.getClass(), "minSize", null);
        setBooleanField(term296030, term296030.getClass(), "minSizeSet", false);
        setField(term296030, term296030.getClass(), "prefSize", null);
        setBooleanField(term296030, term296030.getClass(), "prefSizeSet", false);
        setField(term296030, term296030.getClass(), "maxSize", null);
        setBooleanField(term296030, term296030.getClass(), "maxSizeSet", false);
        setField(term296030, term296030.getClass(), "componentOrientation", null);
        setBooleanField(term296030, term296030.getClass(), "newEventsOnly", false);
        setField(term296030, term296030.getClass(), "componentListener", null);
        setField(term296030, term296030.getClass(), "focusListener", null);
        setField(term296030, term296030.getClass(), "hierarchyListener", null);
        setField(term296030, term296030.getClass(), "hierarchyBoundsListener", null);
        setField(term296030, term296030.getClass(), "keyListener", null);
        setField(term296030, term296030.getClass(), "mouseListener", null);
        setField(term296030, term296030.getClass(), "mouseMotionListener", null);
        setField(term296030, term296030.getClass(), "mouseWheelListener", null);
        setField(term296030, term296030.getClass(), "inputMethodListener", null);
        setLongField(term296030, term296030.getClass(), "eventMask", 0L);
        setField(term296030, term296030.getClass(), "changeSupport", null);
        setField(term296030, term296030.getClass(), "objectLock", null);
        setBooleanField(term296030, term296030.getClass(), "isPacked", false);
        setIntField(term296030, term296030.getClass(), "boundsOp", 0);
        setField(term296030, term296030.getClass(), "compoundShape", null);
        setField(term296030, term296030.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term296030, term296030.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term296030, term296030.getClass(), "backgroundEraseDisabled", false);
        setField(term296030, term296030.getClass(), "eventCache", null);
        setBooleanField(term296030, term296030.getClass(), "coalescingEnabled", false);
        setBooleanField(term296030, term296030.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term296030, term296030.getClass(), "componentSerializedDataVersion", 0);
        setField(term296030, term296030.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term296030, args);
    }

};


