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
     Object term147569;

    public TreeTableHeaderRenderer_setBorder_9087887896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147569 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term147569, term147569.getClass(), "sortIconBorder", null);
        setField(term147569, term147569.getClass(), "paintLabel", null);
        setBooleanField(term147569, term147569.getClass(), "boldOnSorted", false);
        setBooleanField(term147569, term147569.getClass(), "showNumber", false);
        setField(term147569, term147569.getClass(), "sortAscendingIcon", null);
        setField(term147569, term147569.getClass(), "sortDescendingIcon", null);
        setField(term147569, term147569.getClass(), "cachedHeaderFont", null);
        setField(term147569, term147569.getClass(), "boldHeaderFont", null);
        setIntField(term147569, term147569.getClass(), "sortOrderNumber", 0);
        setField(term147569, term147569.getClass(), "sortOrder", null);
        setIntField(term147569, term147569.getClass(), "maxIconWidth", 0);
        setIntField(term147569, term147569.getClass(), "sortNumberTextWidth", 0);
        setIntField(term147569, term147569.getClass(), "mnemonic", 0);
        setIntField(term147569, term147569.getClass(), "mnemonicIndex", 0);
        setField(term147569, term147569.getClass(), "text", null);
        setField(term147569, term147569.getClass(), "defaultIcon", null);
        setField(term147569, term147569.getClass(), "disabledIcon", null);
        setBooleanField(term147569, term147569.getClass(), "disabledIconSet", false);
        setIntField(term147569, term147569.getClass(), "verticalAlignment", 0);
        setIntField(term147569, term147569.getClass(), "horizontalAlignment", 0);
        setIntField(term147569, term147569.getClass(), "verticalTextPosition", 0);
        setIntField(term147569, term147569.getClass(), "horizontalTextPosition", 0);
        setIntField(term147569, term147569.getClass(), "iconTextGap", 0);
        setField(term147569, term147569.getClass(), "labelFor", null);
        setBooleanField(term147569, term147569.getClass(), "isAlignmentXSet", false);
        setFloatField(term147569, term147569.getClass(), "alignmentX", 0.0F);
        setBooleanField(term147569, term147569.getClass(), "isAlignmentYSet", false);
        setFloatField(term147569, term147569.getClass(), "alignmentY", 0.0F);
        setField(term147569, term147569.getClass(), "ui", null);
        setField(term147569, term147569.getClass(), "listenerList", null);
        setField(term147569, term147569.getClass(), "clientProperties", null);
        setField(term147569, term147569.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term147569, term147569.getClass(), "autoscrolls", false);
        setField(term147569, term147569.getClass(), "border", null);
        setIntField(term147569, term147569.getClass(), "flags", 0);
        setField(term147569, term147569.getClass(), "inputVerifier", null);
        setBooleanField(term147569, term147569.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term147569, term147569.getClass(), "paintingChild", null);
        setField(term147569, term147569.getClass(), "popupMenu", null);
        setField(term147569, term147569.getClass(), "revalidateRunnableScheduled", null);
        setField(term147569, term147569.getClass(), "focusInputMap", null);
        setField(term147569, term147569.getClass(), "ancestorInputMap", null);
        setField(term147569, term147569.getClass(), "windowInputMap", null);
        setField(term147569, term147569.getClass(), "actionMap", null);
        setField(term147569, term147569.getClass(), "aaHint", null);
        setField(term147569, term147569.getClass(), "lcdRenderingHint", null);
        setField(term147569, term147569.getClass(), "component", null);
        setField(term147569, term147569.getClass(), "layoutMgr", null);
        setField(term147569, term147569.getClass(), "dispatcher", null);
        setField(term147569, term147569.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term147569, term147569.getClass(), "focusCycleRoot", false);
        setBooleanField(term147569, term147569.getClass(), "focusTraversalPolicyProvider", false);
        setField(term147569, term147569.getClass(), "printingThreads", null);
        setBooleanField(term147569, term147569.getClass(), "printing", false);
        setField(term147569, term147569.getClass(), "containerListener", null);
        setIntField(term147569, term147569.getClass(), "listeningChildren", 0);
        setIntField(term147569, term147569.getClass(), "listeningBoundsChildren", 0);
        setIntField(term147569, term147569.getClass(), "descendantsCount", 0);
        setField(term147569, term147569.getClass(), "preserveBackgroundColor", null);
        setIntField(term147569, term147569.getClass(), "numOfHWComponents", 0);
        setIntField(term147569, term147569.getClass(), "numOfLWComponents", 0);
        setField(term147569, term147569.getClass(), "modalComp", null);
        setField(term147569, term147569.getClass(), "modalAppContext", null);
        setIntField(term147569, term147569.getClass(), "containerSerializedDataVersion", 0);
        setField(term147569, term147569.getClass(), "peer", null);
        setField(term147569, term147569.getClass(), "parent", null);
        setField(term147569, term147569.getClass(), "appContext", null);
        setIntField(term147569, term147569.getClass(), "x", 0);
        setIntField(term147569, term147569.getClass(), "y", 0);
        setIntField(term147569, term147569.getClass(), "width", 0);
        setIntField(term147569, term147569.getClass(), "height", 0);
        setField(term147569, term147569.getClass(), "foreground", null);
        setField(term147569, term147569.getClass(), "background", null);
        setField(term147569, term147569.getClass(), "font", null);
        setField(term147569, term147569.getClass(), "peerFont", null);
        setField(term147569, term147569.getClass(), "cursor", null);
        setField(term147569, term147569.getClass(), "locale", null);
        setField(term147569, term147569.getClass(), "graphicsConfig", null);
        setField(term147569, term147569.getClass(), "bufferStrategy", null);
        setBooleanField(term147569, term147569.getClass(), "ignoreRepaint", false);
        setBooleanField(term147569, term147569.getClass(), "visible", false);
        setBooleanField(term147569, term147569.getClass(), "enabled", false);
        setBooleanField(term147569, term147569.getClass(), "valid", false);
        setField(term147569, term147569.getClass(), "dropTarget", null);
        setField(term147569, term147569.getClass(), "popups", null);
        setField(term147569, term147569.getClass(), "name", null);
        setBooleanField(term147569, term147569.getClass(), "nameExplicitlySet", false);
        setBooleanField(term147569, term147569.getClass(), "focusable", false);
        setIntField(term147569, term147569.getClass(), "isFocusTraversableOverridden", 0);
        setField(term147569, term147569.getClass(), "focusTraversalKeys", null);
        setBooleanField(term147569, term147569.getClass(), "focusTraversalKeysEnabled", false);
        setField(term147569, term147569.getClass(), "acc", null);
        setField(term147569, term147569.getClass(), "minSize", null);
        setBooleanField(term147569, term147569.getClass(), "minSizeSet", false);
        setField(term147569, term147569.getClass(), "prefSize", null);
        setBooleanField(term147569, term147569.getClass(), "prefSizeSet", false);
        setField(term147569, term147569.getClass(), "maxSize", null);
        setBooleanField(term147569, term147569.getClass(), "maxSizeSet", false);
        setField(term147569, term147569.getClass(), "componentOrientation", null);
        setBooleanField(term147569, term147569.getClass(), "newEventsOnly", false);
        setField(term147569, term147569.getClass(), "componentListener", null);
        setField(term147569, term147569.getClass(), "focusListener", null);
        setField(term147569, term147569.getClass(), "hierarchyListener", null);
        setField(term147569, term147569.getClass(), "hierarchyBoundsListener", null);
        setField(term147569, term147569.getClass(), "keyListener", null);
        setField(term147569, term147569.getClass(), "mouseListener", null);
        setField(term147569, term147569.getClass(), "mouseMotionListener", null);
        setField(term147569, term147569.getClass(), "mouseWheelListener", null);
        setField(term147569, term147569.getClass(), "inputMethodListener", null);
        setLongField(term147569, term147569.getClass(), "eventMask", 0L);
        setField(term147569, term147569.getClass(), "changeSupport", null);
        setField(term147569, term147569.getClass(), "objectLock", null);
        setBooleanField(term147569, term147569.getClass(), "isPacked", false);
        setIntField(term147569, term147569.getClass(), "boundsOp", 0);
        setField(term147569, term147569.getClass(), "compoundShape", null);
        setField(term147569, term147569.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term147569, term147569.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term147569, term147569.getClass(), "backgroundEraseDisabled", false);
        setField(term147569, term147569.getClass(), "eventCache", null);
        setBooleanField(term147569, term147569.getClass(), "coalescingEnabled", false);
        setBooleanField(term147569, term147569.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term147569, term147569.getClass(), "componentSerializedDataVersion", 0);
        setField(term147569, term147569.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.border.Border");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBorder", argTypes, term147569, args);
    }

};


