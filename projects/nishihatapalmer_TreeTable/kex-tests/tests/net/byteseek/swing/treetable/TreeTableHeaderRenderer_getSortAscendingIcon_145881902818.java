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

public class TreeTableHeaderRenderer_getSortAscendingIcon_145881902818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221662;

    public TreeTableHeaderRenderer_getSortAscendingIcon_145881902818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221662 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term221662, term221662.getClass(), "sortIconBorder", null);
        setField(term221662, term221662.getClass(), "paintLabel", null);
        setBooleanField(term221662, term221662.getClass(), "boldOnSorted", false);
        setBooleanField(term221662, term221662.getClass(), "showNumber", false);
        setField(term221662, term221662.getClass(), "sortAscendingIcon", null);
        setField(term221662, term221662.getClass(), "sortDescendingIcon", null);
        setField(term221662, term221662.getClass(), "cachedHeaderFont", null);
        setField(term221662, term221662.getClass(), "boldHeaderFont", null);
        setIntField(term221662, term221662.getClass(), "sortOrderNumber", 0);
        setField(term221662, term221662.getClass(), "sortOrder", null);
        setIntField(term221662, term221662.getClass(), "maxIconWidth", 0);
        setIntField(term221662, term221662.getClass(), "sortNumberTextWidth", 0);
        setIntField(term221662, term221662.getClass(), "mnemonic", 0);
        setIntField(term221662, term221662.getClass(), "mnemonicIndex", 0);
        setField(term221662, term221662.getClass(), "text", null);
        setField(term221662, term221662.getClass(), "defaultIcon", null);
        setField(term221662, term221662.getClass(), "disabledIcon", null);
        setBooleanField(term221662, term221662.getClass(), "disabledIconSet", false);
        setIntField(term221662, term221662.getClass(), "verticalAlignment", 0);
        setIntField(term221662, term221662.getClass(), "horizontalAlignment", 0);
        setIntField(term221662, term221662.getClass(), "verticalTextPosition", 0);
        setIntField(term221662, term221662.getClass(), "horizontalTextPosition", 0);
        setIntField(term221662, term221662.getClass(), "iconTextGap", 0);
        setField(term221662, term221662.getClass(), "labelFor", null);
        setBooleanField(term221662, term221662.getClass(), "isAlignmentXSet", false);
        setFloatField(term221662, term221662.getClass(), "alignmentX", 0.0F);
        setBooleanField(term221662, term221662.getClass(), "isAlignmentYSet", false);
        setFloatField(term221662, term221662.getClass(), "alignmentY", 0.0F);
        setField(term221662, term221662.getClass(), "ui", null);
        setField(term221662, term221662.getClass(), "listenerList", null);
        setField(term221662, term221662.getClass(), "clientProperties", null);
        setField(term221662, term221662.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term221662, term221662.getClass(), "autoscrolls", false);
        setField(term221662, term221662.getClass(), "border", null);
        setIntField(term221662, term221662.getClass(), "flags", 0);
        setField(term221662, term221662.getClass(), "inputVerifier", null);
        setBooleanField(term221662, term221662.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term221662, term221662.getClass(), "paintingChild", null);
        setField(term221662, term221662.getClass(), "popupMenu", null);
        setField(term221662, term221662.getClass(), "revalidateRunnableScheduled", null);
        setField(term221662, term221662.getClass(), "focusInputMap", null);
        setField(term221662, term221662.getClass(), "ancestorInputMap", null);
        setField(term221662, term221662.getClass(), "windowInputMap", null);
        setField(term221662, term221662.getClass(), "actionMap", null);
        setField(term221662, term221662.getClass(), "aaHint", null);
        setField(term221662, term221662.getClass(), "lcdRenderingHint", null);
        setField(term221662, term221662.getClass(), "component", null);
        setField(term221662, term221662.getClass(), "layoutMgr", null);
        setField(term221662, term221662.getClass(), "dispatcher", null);
        setField(term221662, term221662.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term221662, term221662.getClass(), "focusCycleRoot", false);
        setBooleanField(term221662, term221662.getClass(), "focusTraversalPolicyProvider", false);
        setField(term221662, term221662.getClass(), "printingThreads", null);
        setBooleanField(term221662, term221662.getClass(), "printing", false);
        setField(term221662, term221662.getClass(), "containerListener", null);
        setIntField(term221662, term221662.getClass(), "listeningChildren", 0);
        setIntField(term221662, term221662.getClass(), "listeningBoundsChildren", 0);
        setIntField(term221662, term221662.getClass(), "descendantsCount", 0);
        setField(term221662, term221662.getClass(), "preserveBackgroundColor", null);
        setIntField(term221662, term221662.getClass(), "numOfHWComponents", 0);
        setIntField(term221662, term221662.getClass(), "numOfLWComponents", 0);
        setField(term221662, term221662.getClass(), "modalComp", null);
        setField(term221662, term221662.getClass(), "modalAppContext", null);
        setIntField(term221662, term221662.getClass(), "containerSerializedDataVersion", 0);
        setField(term221662, term221662.getClass(), "peer", null);
        setField(term221662, term221662.getClass(), "parent", null);
        setField(term221662, term221662.getClass(), "appContext", null);
        setIntField(term221662, term221662.getClass(), "x", 0);
        setIntField(term221662, term221662.getClass(), "y", 0);
        setIntField(term221662, term221662.getClass(), "width", 0);
        setIntField(term221662, term221662.getClass(), "height", 0);
        setField(term221662, term221662.getClass(), "foreground", null);
        setField(term221662, term221662.getClass(), "background", null);
        setField(term221662, term221662.getClass(), "font", null);
        setField(term221662, term221662.getClass(), "peerFont", null);
        setField(term221662, term221662.getClass(), "cursor", null);
        setField(term221662, term221662.getClass(), "locale", null);
        setField(term221662, term221662.getClass(), "graphicsConfig", null);
        setField(term221662, term221662.getClass(), "bufferStrategy", null);
        setBooleanField(term221662, term221662.getClass(), "ignoreRepaint", false);
        setBooleanField(term221662, term221662.getClass(), "visible", false);
        setBooleanField(term221662, term221662.getClass(), "enabled", false);
        setBooleanField(term221662, term221662.getClass(), "valid", false);
        setField(term221662, term221662.getClass(), "dropTarget", null);
        setField(term221662, term221662.getClass(), "popups", null);
        setField(term221662, term221662.getClass(), "name", null);
        setBooleanField(term221662, term221662.getClass(), "nameExplicitlySet", false);
        setBooleanField(term221662, term221662.getClass(), "focusable", false);
        setIntField(term221662, term221662.getClass(), "isFocusTraversableOverridden", 0);
        setField(term221662, term221662.getClass(), "focusTraversalKeys", null);
        setBooleanField(term221662, term221662.getClass(), "focusTraversalKeysEnabled", false);
        setField(term221662, term221662.getClass(), "acc", null);
        setField(term221662, term221662.getClass(), "minSize", null);
        setBooleanField(term221662, term221662.getClass(), "minSizeSet", false);
        setField(term221662, term221662.getClass(), "prefSize", null);
        setBooleanField(term221662, term221662.getClass(), "prefSizeSet", false);
        setField(term221662, term221662.getClass(), "maxSize", null);
        setBooleanField(term221662, term221662.getClass(), "maxSizeSet", false);
        setField(term221662, term221662.getClass(), "componentOrientation", null);
        setBooleanField(term221662, term221662.getClass(), "newEventsOnly", false);
        setField(term221662, term221662.getClass(), "componentListener", null);
        setField(term221662, term221662.getClass(), "focusListener", null);
        setField(term221662, term221662.getClass(), "hierarchyListener", null);
        setField(term221662, term221662.getClass(), "hierarchyBoundsListener", null);
        setField(term221662, term221662.getClass(), "keyListener", null);
        setField(term221662, term221662.getClass(), "mouseListener", null);
        setField(term221662, term221662.getClass(), "mouseMotionListener", null);
        setField(term221662, term221662.getClass(), "mouseWheelListener", null);
        setField(term221662, term221662.getClass(), "inputMethodListener", null);
        setLongField(term221662, term221662.getClass(), "eventMask", 0L);
        setField(term221662, term221662.getClass(), "changeSupport", null);
        setField(term221662, term221662.getClass(), "objectLock", null);
        setBooleanField(term221662, term221662.getClass(), "isPacked", false);
        setIntField(term221662, term221662.getClass(), "boundsOp", 0);
        setField(term221662, term221662.getClass(), "compoundShape", null);
        setField(term221662, term221662.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term221662, term221662.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term221662, term221662.getClass(), "backgroundEraseDisabled", false);
        setField(term221662, term221662.getClass(), "eventCache", null);
        setBooleanField(term221662, term221662.getClass(), "coalescingEnabled", false);
        setBooleanField(term221662, term221662.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term221662, term221662.getClass(), "componentSerializedDataVersion", 0);
        setField(term221662, term221662.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortAscendingIcon", argTypes, term221662, args);
    }

};


