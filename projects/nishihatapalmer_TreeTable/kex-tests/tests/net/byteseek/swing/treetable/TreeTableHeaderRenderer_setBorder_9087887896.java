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

public class TreeTableHeaderRenderer_setBorder_9087887896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147249;

    public TreeTableHeaderRenderer_setBorder_9087887896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147249 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term147249, term147249.getClass(), "sortIconBorder", null);
        setField(term147249, term147249.getClass(), "paintLabel", null);
        setBooleanField(term147249, term147249.getClass(), "boldOnSorted", false);
        setBooleanField(term147249, term147249.getClass(), "showNumber", false);
        setField(term147249, term147249.getClass(), "sortAscendingIcon", null);
        setField(term147249, term147249.getClass(), "sortDescendingIcon", null);
        setField(term147249, term147249.getClass(), "cachedHeaderFont", null);
        setField(term147249, term147249.getClass(), "boldHeaderFont", null);
        setIntField(term147249, term147249.getClass(), "sortOrderNumber", 0);
        setField(term147249, term147249.getClass(), "sortOrder", null);
        setIntField(term147249, term147249.getClass(), "maxIconWidth", 0);
        setIntField(term147249, term147249.getClass(), "sortNumberTextWidth", 0);
        setIntField(term147249, term147249.getClass(), "mnemonic", 0);
        setIntField(term147249, term147249.getClass(), "mnemonicIndex", 0);
        setField(term147249, term147249.getClass(), "text", null);
        setField(term147249, term147249.getClass(), "defaultIcon", null);
        setField(term147249, term147249.getClass(), "disabledIcon", null);
        setBooleanField(term147249, term147249.getClass(), "disabledIconSet", false);
        setIntField(term147249, term147249.getClass(), "verticalAlignment", 0);
        setIntField(term147249, term147249.getClass(), "horizontalAlignment", 0);
        setIntField(term147249, term147249.getClass(), "verticalTextPosition", 0);
        setIntField(term147249, term147249.getClass(), "horizontalTextPosition", 0);
        setIntField(term147249, term147249.getClass(), "iconTextGap", 0);
        setField(term147249, term147249.getClass(), "labelFor", null);
        setBooleanField(term147249, term147249.getClass(), "isAlignmentXSet", false);
        setFloatField(term147249, term147249.getClass(), "alignmentX", 0.0F);
        setBooleanField(term147249, term147249.getClass(), "isAlignmentYSet", false);
        setFloatField(term147249, term147249.getClass(), "alignmentY", 0.0F);
        setField(term147249, term147249.getClass(), "ui", null);
        setField(term147249, term147249.getClass(), "listenerList", null);
        setField(term147249, term147249.getClass(), "clientProperties", null);
        setField(term147249, term147249.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term147249, term147249.getClass(), "autoscrolls", false);
        setField(term147249, term147249.getClass(), "border", null);
        setIntField(term147249, term147249.getClass(), "flags", 0);
        setField(term147249, term147249.getClass(), "inputVerifier", null);
        setBooleanField(term147249, term147249.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term147249, term147249.getClass(), "paintingChild", null);
        setField(term147249, term147249.getClass(), "popupMenu", null);
        setField(term147249, term147249.getClass(), "revalidateRunnableScheduled", null);
        setField(term147249, term147249.getClass(), "focusInputMap", null);
        setField(term147249, term147249.getClass(), "ancestorInputMap", null);
        setField(term147249, term147249.getClass(), "windowInputMap", null);
        setField(term147249, term147249.getClass(), "actionMap", null);
        setField(term147249, term147249.getClass(), "aaHint", null);
        setField(term147249, term147249.getClass(), "lcdRenderingHint", null);
        setField(term147249, term147249.getClass(), "component", null);
        setField(term147249, term147249.getClass(), "layoutMgr", null);
        setField(term147249, term147249.getClass(), "dispatcher", null);
        setField(term147249, term147249.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term147249, term147249.getClass(), "focusCycleRoot", false);
        setBooleanField(term147249, term147249.getClass(), "focusTraversalPolicyProvider", false);
        setField(term147249, term147249.getClass(), "printingThreads", null);
        setBooleanField(term147249, term147249.getClass(), "printing", false);
        setField(term147249, term147249.getClass(), "containerListener", null);
        setIntField(term147249, term147249.getClass(), "listeningChildren", 0);
        setIntField(term147249, term147249.getClass(), "listeningBoundsChildren", 0);
        setIntField(term147249, term147249.getClass(), "descendantsCount", 0);
        setField(term147249, term147249.getClass(), "preserveBackgroundColor", null);
        setIntField(term147249, term147249.getClass(), "numOfHWComponents", 0);
        setIntField(term147249, term147249.getClass(), "numOfLWComponents", 0);
        setField(term147249, term147249.getClass(), "modalComp", null);
        setField(term147249, term147249.getClass(), "modalAppContext", null);
        setIntField(term147249, term147249.getClass(), "containerSerializedDataVersion", 0);
        setField(term147249, term147249.getClass(), "peer", null);
        setField(term147249, term147249.getClass(), "parent", null);
        setField(term147249, term147249.getClass(), "appContext", null);
        setIntField(term147249, term147249.getClass(), "x", 0);
        setIntField(term147249, term147249.getClass(), "y", 0);
        setIntField(term147249, term147249.getClass(), "width", 0);
        setIntField(term147249, term147249.getClass(), "height", 0);
        setField(term147249, term147249.getClass(), "foreground", null);
        setField(term147249, term147249.getClass(), "background", null);
        setField(term147249, term147249.getClass(), "font", null);
        setField(term147249, term147249.getClass(), "peerFont", null);
        setField(term147249, term147249.getClass(), "cursor", null);
        setField(term147249, term147249.getClass(), "locale", null);
        setField(term147249, term147249.getClass(), "graphicsConfig", null);
        setField(term147249, term147249.getClass(), "bufferStrategy", null);
        setBooleanField(term147249, term147249.getClass(), "ignoreRepaint", false);
        setBooleanField(term147249, term147249.getClass(), "visible", false);
        setBooleanField(term147249, term147249.getClass(), "enabled", false);
        setBooleanField(term147249, term147249.getClass(), "valid", false);
        setField(term147249, term147249.getClass(), "dropTarget", null);
        setField(term147249, term147249.getClass(), "popups", null);
        setField(term147249, term147249.getClass(), "name", null);
        setBooleanField(term147249, term147249.getClass(), "nameExplicitlySet", false);
        setBooleanField(term147249, term147249.getClass(), "focusable", false);
        setIntField(term147249, term147249.getClass(), "isFocusTraversableOverridden", 0);
        setField(term147249, term147249.getClass(), "focusTraversalKeys", null);
        setBooleanField(term147249, term147249.getClass(), "focusTraversalKeysEnabled", false);
        setField(term147249, term147249.getClass(), "acc", null);
        setField(term147249, term147249.getClass(), "minSize", null);
        setBooleanField(term147249, term147249.getClass(), "minSizeSet", false);
        setField(term147249, term147249.getClass(), "prefSize", null);
        setBooleanField(term147249, term147249.getClass(), "prefSizeSet", false);
        setField(term147249, term147249.getClass(), "maxSize", null);
        setBooleanField(term147249, term147249.getClass(), "maxSizeSet", false);
        setField(term147249, term147249.getClass(), "componentOrientation", null);
        setBooleanField(term147249, term147249.getClass(), "newEventsOnly", false);
        setField(term147249, term147249.getClass(), "componentListener", null);
        setField(term147249, term147249.getClass(), "focusListener", null);
        setField(term147249, term147249.getClass(), "hierarchyListener", null);
        setField(term147249, term147249.getClass(), "hierarchyBoundsListener", null);
        setField(term147249, term147249.getClass(), "keyListener", null);
        setField(term147249, term147249.getClass(), "mouseListener", null);
        setField(term147249, term147249.getClass(), "mouseMotionListener", null);
        setField(term147249, term147249.getClass(), "mouseWheelListener", null);
        setField(term147249, term147249.getClass(), "inputMethodListener", null);
        setLongField(term147249, term147249.getClass(), "eventMask", 0L);
        setField(term147249, term147249.getClass(), "changeSupport", null);
        setField(term147249, term147249.getClass(), "objectLock", null);
        setBooleanField(term147249, term147249.getClass(), "isPacked", false);
        setIntField(term147249, term147249.getClass(), "boundsOp", 0);
        setField(term147249, term147249.getClass(), "compoundShape", null);
        setField(term147249, term147249.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term147249, term147249.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term147249, term147249.getClass(), "backgroundEraseDisabled", false);
        setField(term147249, term147249.getClass(), "eventCache", null);
        setBooleanField(term147249, term147249.getClass(), "coalescingEnabled", false);
        setBooleanField(term147249, term147249.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term147249, term147249.getClass(), "componentSerializedDataVersion", 0);
        setField(term147249, term147249.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.border.Border");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBorder", argTypes, term147249, args);
    }

};


