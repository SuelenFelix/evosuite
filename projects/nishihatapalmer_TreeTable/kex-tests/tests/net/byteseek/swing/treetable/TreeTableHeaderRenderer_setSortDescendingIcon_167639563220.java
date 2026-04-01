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

public class TreeTableHeaderRenderer_setSortDescendingIcon_167639563220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234421;

    public TreeTableHeaderRenderer_setSortDescendingIcon_167639563220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234421 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term234421, term234421.getClass(), "sortIconBorder", null);
        setField(term234421, term234421.getClass(), "paintLabel", null);
        setBooleanField(term234421, term234421.getClass(), "boldOnSorted", false);
        setBooleanField(term234421, term234421.getClass(), "showNumber", false);
        setField(term234421, term234421.getClass(), "sortAscendingIcon", null);
        setField(term234421, term234421.getClass(), "sortDescendingIcon", null);
        setField(term234421, term234421.getClass(), "cachedHeaderFont", null);
        setField(term234421, term234421.getClass(), "boldHeaderFont", null);
        setIntField(term234421, term234421.getClass(), "sortOrderNumber", 0);
        setField(term234421, term234421.getClass(), "sortOrder", null);
        setIntField(term234421, term234421.getClass(), "maxIconWidth", 0);
        setIntField(term234421, term234421.getClass(), "sortNumberTextWidth", 0);
        setIntField(term234421, term234421.getClass(), "mnemonic", 0);
        setIntField(term234421, term234421.getClass(), "mnemonicIndex", 0);
        setField(term234421, term234421.getClass(), "text", null);
        setField(term234421, term234421.getClass(), "defaultIcon", null);
        setField(term234421, term234421.getClass(), "disabledIcon", null);
        setBooleanField(term234421, term234421.getClass(), "disabledIconSet", false);
        setIntField(term234421, term234421.getClass(), "verticalAlignment", 0);
        setIntField(term234421, term234421.getClass(), "horizontalAlignment", 0);
        setIntField(term234421, term234421.getClass(), "verticalTextPosition", 0);
        setIntField(term234421, term234421.getClass(), "horizontalTextPosition", 0);
        setIntField(term234421, term234421.getClass(), "iconTextGap", 0);
        setField(term234421, term234421.getClass(), "labelFor", null);
        setBooleanField(term234421, term234421.getClass(), "isAlignmentXSet", false);
        setFloatField(term234421, term234421.getClass(), "alignmentX", 0.0F);
        setBooleanField(term234421, term234421.getClass(), "isAlignmentYSet", false);
        setFloatField(term234421, term234421.getClass(), "alignmentY", 0.0F);
        setField(term234421, term234421.getClass(), "ui", null);
        setField(term234421, term234421.getClass(), "listenerList", null);
        setField(term234421, term234421.getClass(), "clientProperties", null);
        setField(term234421, term234421.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term234421, term234421.getClass(), "autoscrolls", false);
        setField(term234421, term234421.getClass(), "border", null);
        setIntField(term234421, term234421.getClass(), "flags", 0);
        setField(term234421, term234421.getClass(), "inputVerifier", null);
        setBooleanField(term234421, term234421.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term234421, term234421.getClass(), "paintingChild", null);
        setField(term234421, term234421.getClass(), "popupMenu", null);
        setField(term234421, term234421.getClass(), "revalidateRunnableScheduled", null);
        setField(term234421, term234421.getClass(), "focusInputMap", null);
        setField(term234421, term234421.getClass(), "ancestorInputMap", null);
        setField(term234421, term234421.getClass(), "windowInputMap", null);
        setField(term234421, term234421.getClass(), "actionMap", null);
        setField(term234421, term234421.getClass(), "aaHint", null);
        setField(term234421, term234421.getClass(), "lcdRenderingHint", null);
        setField(term234421, term234421.getClass(), "component", null);
        setField(term234421, term234421.getClass(), "layoutMgr", null);
        setField(term234421, term234421.getClass(), "dispatcher", null);
        setField(term234421, term234421.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term234421, term234421.getClass(), "focusCycleRoot", false);
        setBooleanField(term234421, term234421.getClass(), "focusTraversalPolicyProvider", false);
        setField(term234421, term234421.getClass(), "printingThreads", null);
        setBooleanField(term234421, term234421.getClass(), "printing", false);
        setField(term234421, term234421.getClass(), "containerListener", null);
        setIntField(term234421, term234421.getClass(), "listeningChildren", 0);
        setIntField(term234421, term234421.getClass(), "listeningBoundsChildren", 0);
        setIntField(term234421, term234421.getClass(), "descendantsCount", 0);
        setField(term234421, term234421.getClass(), "preserveBackgroundColor", null);
        setIntField(term234421, term234421.getClass(), "numOfHWComponents", 0);
        setIntField(term234421, term234421.getClass(), "numOfLWComponents", 0);
        setField(term234421, term234421.getClass(), "modalComp", null);
        setField(term234421, term234421.getClass(), "modalAppContext", null);
        setIntField(term234421, term234421.getClass(), "containerSerializedDataVersion", 0);
        setField(term234421, term234421.getClass(), "peer", null);
        setField(term234421, term234421.getClass(), "parent", null);
        setField(term234421, term234421.getClass(), "appContext", null);
        setIntField(term234421, term234421.getClass(), "x", 0);
        setIntField(term234421, term234421.getClass(), "y", 0);
        setIntField(term234421, term234421.getClass(), "width", 0);
        setIntField(term234421, term234421.getClass(), "height", 0);
        setField(term234421, term234421.getClass(), "foreground", null);
        setField(term234421, term234421.getClass(), "background", null);
        setField(term234421, term234421.getClass(), "font", null);
        setField(term234421, term234421.getClass(), "peerFont", null);
        setField(term234421, term234421.getClass(), "cursor", null);
        setField(term234421, term234421.getClass(), "locale", null);
        setField(term234421, term234421.getClass(), "graphicsConfig", null);
        setField(term234421, term234421.getClass(), "bufferStrategy", null);
        setBooleanField(term234421, term234421.getClass(), "ignoreRepaint", false);
        setBooleanField(term234421, term234421.getClass(), "visible", false);
        setBooleanField(term234421, term234421.getClass(), "enabled", false);
        setBooleanField(term234421, term234421.getClass(), "valid", false);
        setField(term234421, term234421.getClass(), "dropTarget", null);
        setField(term234421, term234421.getClass(), "popups", null);
        setField(term234421, term234421.getClass(), "name", null);
        setBooleanField(term234421, term234421.getClass(), "nameExplicitlySet", false);
        setBooleanField(term234421, term234421.getClass(), "focusable", false);
        setIntField(term234421, term234421.getClass(), "isFocusTraversableOverridden", 0);
        setField(term234421, term234421.getClass(), "focusTraversalKeys", null);
        setBooleanField(term234421, term234421.getClass(), "focusTraversalKeysEnabled", false);
        setField(term234421, term234421.getClass(), "acc", null);
        setField(term234421, term234421.getClass(), "minSize", null);
        setBooleanField(term234421, term234421.getClass(), "minSizeSet", false);
        setField(term234421, term234421.getClass(), "prefSize", null);
        setBooleanField(term234421, term234421.getClass(), "prefSizeSet", false);
        setField(term234421, term234421.getClass(), "maxSize", null);
        setBooleanField(term234421, term234421.getClass(), "maxSizeSet", false);
        setField(term234421, term234421.getClass(), "componentOrientation", null);
        setBooleanField(term234421, term234421.getClass(), "newEventsOnly", false);
        setField(term234421, term234421.getClass(), "componentListener", null);
        setField(term234421, term234421.getClass(), "focusListener", null);
        setField(term234421, term234421.getClass(), "hierarchyListener", null);
        setField(term234421, term234421.getClass(), "hierarchyBoundsListener", null);
        setField(term234421, term234421.getClass(), "keyListener", null);
        setField(term234421, term234421.getClass(), "mouseListener", null);
        setField(term234421, term234421.getClass(), "mouseMotionListener", null);
        setField(term234421, term234421.getClass(), "mouseWheelListener", null);
        setField(term234421, term234421.getClass(), "inputMethodListener", null);
        setLongField(term234421, term234421.getClass(), "eventMask", 0L);
        setField(term234421, term234421.getClass(), "changeSupport", null);
        setField(term234421, term234421.getClass(), "objectLock", null);
        setBooleanField(term234421, term234421.getClass(), "isPacked", false);
        setIntField(term234421, term234421.getClass(), "boundsOp", 0);
        setField(term234421, term234421.getClass(), "compoundShape", null);
        setField(term234421, term234421.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term234421, term234421.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term234421, term234421.getClass(), "backgroundEraseDisabled", false);
        setField(term234421, term234421.getClass(), "eventCache", null);
        setBooleanField(term234421, term234421.getClass(), "coalescingEnabled", false);
        setBooleanField(term234421, term234421.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term234421, term234421.getClass(), "componentSerializedDataVersion", 0);
        setField(term234421, term234421.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortDescendingIcon", argTypes, term234421, args);
    }

};


