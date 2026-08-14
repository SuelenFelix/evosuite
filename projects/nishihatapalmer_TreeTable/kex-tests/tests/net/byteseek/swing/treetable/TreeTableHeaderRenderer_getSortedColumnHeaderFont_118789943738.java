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

public class TreeTableHeaderRenderer_getSortedColumnHeaderFont_118789943738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356719;

    public TreeTableHeaderRenderer_getSortedColumnHeaderFont_118789943738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356719 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term356719, term356719.getClass(), "sortIconBorder", null);
        setField(term356719, term356719.getClass(), "paintLabel", null);
        setBooleanField(term356719, term356719.getClass(), "boldOnSorted", false);
        setBooleanField(term356719, term356719.getClass(), "showNumber", false);
        setField(term356719, term356719.getClass(), "sortAscendingIcon", null);
        setField(term356719, term356719.getClass(), "sortDescendingIcon", null);
        setField(term356719, term356719.getClass(), "cachedHeaderFont", null);
        setField(term356719, term356719.getClass(), "boldHeaderFont", null);
        setIntField(term356719, term356719.getClass(), "sortOrderNumber", 0);
        setField(term356719, term356719.getClass(), "sortOrder", null);
        setIntField(term356719, term356719.getClass(), "maxIconWidth", 0);
        setIntField(term356719, term356719.getClass(), "sortNumberTextWidth", 0);
        setIntField(term356719, term356719.getClass(), "mnemonic", 0);
        setIntField(term356719, term356719.getClass(), "mnemonicIndex", 0);
        setField(term356719, term356719.getClass(), "text", null);
        setField(term356719, term356719.getClass(), "defaultIcon", null);
        setField(term356719, term356719.getClass(), "disabledIcon", null);
        setBooleanField(term356719, term356719.getClass(), "disabledIconSet", false);
        setIntField(term356719, term356719.getClass(), "verticalAlignment", 0);
        setIntField(term356719, term356719.getClass(), "horizontalAlignment", 0);
        setIntField(term356719, term356719.getClass(), "verticalTextPosition", 0);
        setIntField(term356719, term356719.getClass(), "horizontalTextPosition", 0);
        setIntField(term356719, term356719.getClass(), "iconTextGap", 0);
        setField(term356719, term356719.getClass(), "labelFor", null);
        setBooleanField(term356719, term356719.getClass(), "isAlignmentXSet", false);
        setFloatField(term356719, term356719.getClass(), "alignmentX", 0.0F);
        setBooleanField(term356719, term356719.getClass(), "isAlignmentYSet", false);
        setFloatField(term356719, term356719.getClass(), "alignmentY", 0.0F);
        setField(term356719, term356719.getClass(), "ui", null);
        setField(term356719, term356719.getClass(), "listenerList", null);
        setField(term356719, term356719.getClass(), "clientProperties", null);
        setField(term356719, term356719.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term356719, term356719.getClass(), "autoscrolls", false);
        setField(term356719, term356719.getClass(), "border", null);
        setIntField(term356719, term356719.getClass(), "flags", 0);
        setField(term356719, term356719.getClass(), "inputVerifier", null);
        setBooleanField(term356719, term356719.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term356719, term356719.getClass(), "paintingChild", null);
        setField(term356719, term356719.getClass(), "popupMenu", null);
        setField(term356719, term356719.getClass(), "revalidateRunnableScheduled", null);
        setField(term356719, term356719.getClass(), "focusInputMap", null);
        setField(term356719, term356719.getClass(), "ancestorInputMap", null);
        setField(term356719, term356719.getClass(), "windowInputMap", null);
        setField(term356719, term356719.getClass(), "actionMap", null);
        setField(term356719, term356719.getClass(), "aaHint", null);
        setField(term356719, term356719.getClass(), "lcdRenderingHint", null);
        setField(term356719, term356719.getClass(), "component", null);
        setField(term356719, term356719.getClass(), "layoutMgr", null);
        setField(term356719, term356719.getClass(), "dispatcher", null);
        setField(term356719, term356719.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term356719, term356719.getClass(), "focusCycleRoot", false);
        setBooleanField(term356719, term356719.getClass(), "focusTraversalPolicyProvider", false);
        setField(term356719, term356719.getClass(), "printingThreads", null);
        setBooleanField(term356719, term356719.getClass(), "printing", false);
        setField(term356719, term356719.getClass(), "containerListener", null);
        setIntField(term356719, term356719.getClass(), "listeningChildren", 0);
        setIntField(term356719, term356719.getClass(), "listeningBoundsChildren", 0);
        setIntField(term356719, term356719.getClass(), "descendantsCount", 0);
        setField(term356719, term356719.getClass(), "preserveBackgroundColor", null);
        setIntField(term356719, term356719.getClass(), "numOfHWComponents", 0);
        setIntField(term356719, term356719.getClass(), "numOfLWComponents", 0);
        setField(term356719, term356719.getClass(), "modalComp", null);
        setField(term356719, term356719.getClass(), "modalAppContext", null);
        setIntField(term356719, term356719.getClass(), "containerSerializedDataVersion", 0);
        setField(term356719, term356719.getClass(), "peer", null);
        setField(term356719, term356719.getClass(), "parent", null);
        setField(term356719, term356719.getClass(), "appContext", null);
        setIntField(term356719, term356719.getClass(), "x", 0);
        setIntField(term356719, term356719.getClass(), "y", 0);
        setIntField(term356719, term356719.getClass(), "width", 0);
        setIntField(term356719, term356719.getClass(), "height", 0);
        setField(term356719, term356719.getClass(), "foreground", null);
        setField(term356719, term356719.getClass(), "background", null);
        setField(term356719, term356719.getClass(), "font", null);
        setField(term356719, term356719.getClass(), "peerFont", null);
        setField(term356719, term356719.getClass(), "cursor", null);
        setField(term356719, term356719.getClass(), "locale", null);
        setField(term356719, term356719.getClass(), "graphicsConfig", null);
        setField(term356719, term356719.getClass(), "bufferStrategy", null);
        setBooleanField(term356719, term356719.getClass(), "ignoreRepaint", false);
        setBooleanField(term356719, term356719.getClass(), "visible", false);
        setBooleanField(term356719, term356719.getClass(), "enabled", false);
        setBooleanField(term356719, term356719.getClass(), "valid", false);
        setField(term356719, term356719.getClass(), "dropTarget", null);
        setField(term356719, term356719.getClass(), "popups", null);
        setField(term356719, term356719.getClass(), "name", null);
        setBooleanField(term356719, term356719.getClass(), "nameExplicitlySet", false);
        setBooleanField(term356719, term356719.getClass(), "focusable", false);
        setIntField(term356719, term356719.getClass(), "isFocusTraversableOverridden", 0);
        setField(term356719, term356719.getClass(), "focusTraversalKeys", null);
        setBooleanField(term356719, term356719.getClass(), "focusTraversalKeysEnabled", false);
        setField(term356719, term356719.getClass(), "acc", null);
        setField(term356719, term356719.getClass(), "minSize", null);
        setBooleanField(term356719, term356719.getClass(), "minSizeSet", false);
        setField(term356719, term356719.getClass(), "prefSize", null);
        setBooleanField(term356719, term356719.getClass(), "prefSizeSet", false);
        setField(term356719, term356719.getClass(), "maxSize", null);
        setBooleanField(term356719, term356719.getClass(), "maxSizeSet", false);
        setField(term356719, term356719.getClass(), "componentOrientation", null);
        setBooleanField(term356719, term356719.getClass(), "newEventsOnly", false);
        setField(term356719, term356719.getClass(), "componentListener", null);
        setField(term356719, term356719.getClass(), "focusListener", null);
        setField(term356719, term356719.getClass(), "hierarchyListener", null);
        setField(term356719, term356719.getClass(), "hierarchyBoundsListener", null);
        setField(term356719, term356719.getClass(), "keyListener", null);
        setField(term356719, term356719.getClass(), "mouseListener", null);
        setField(term356719, term356719.getClass(), "mouseMotionListener", null);
        setField(term356719, term356719.getClass(), "mouseWheelListener", null);
        setField(term356719, term356719.getClass(), "inputMethodListener", null);
        setLongField(term356719, term356719.getClass(), "eventMask", 0L);
        setField(term356719, term356719.getClass(), "changeSupport", null);
        setField(term356719, term356719.getClass(), "objectLock", null);
        setBooleanField(term356719, term356719.getClass(), "isPacked", false);
        setIntField(term356719, term356719.getClass(), "boundsOp", 0);
        setField(term356719, term356719.getClass(), "compoundShape", null);
        setField(term356719, term356719.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term356719, term356719.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term356719, term356719.getClass(), "backgroundEraseDisabled", false);
        setField(term356719, term356719.getClass(), "eventCache", null);
        setBooleanField(term356719, term356719.getClass(), "coalescingEnabled", false);
        setBooleanField(term356719, term356719.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term356719, term356719.getClass(), "componentSerializedDataVersion", 0);
        setField(term356719, term356719.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSortedColumnHeaderFont", argTypes, term356719, args);
    }

};


