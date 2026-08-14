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

public class TreeTableHeaderRenderer_getBoldOnSorted_206454697310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172030;

    public TreeTableHeaderRenderer_getBoldOnSorted_206454697310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172030 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term172030, term172030.getClass(), "sortIconBorder", null);
        setField(term172030, term172030.getClass(), "paintLabel", null);
        setBooleanField(term172030, term172030.getClass(), "boldOnSorted", false);
        setBooleanField(term172030, term172030.getClass(), "showNumber", false);
        setField(term172030, term172030.getClass(), "sortAscendingIcon", null);
        setField(term172030, term172030.getClass(), "sortDescendingIcon", null);
        setField(term172030, term172030.getClass(), "cachedHeaderFont", null);
        setField(term172030, term172030.getClass(), "boldHeaderFont", null);
        setIntField(term172030, term172030.getClass(), "sortOrderNumber", 0);
        setField(term172030, term172030.getClass(), "sortOrder", null);
        setIntField(term172030, term172030.getClass(), "maxIconWidth", 0);
        setIntField(term172030, term172030.getClass(), "sortNumberTextWidth", 0);
        setIntField(term172030, term172030.getClass(), "mnemonic", 0);
        setIntField(term172030, term172030.getClass(), "mnemonicIndex", 0);
        setField(term172030, term172030.getClass(), "text", null);
        setField(term172030, term172030.getClass(), "defaultIcon", null);
        setField(term172030, term172030.getClass(), "disabledIcon", null);
        setBooleanField(term172030, term172030.getClass(), "disabledIconSet", false);
        setIntField(term172030, term172030.getClass(), "verticalAlignment", 0);
        setIntField(term172030, term172030.getClass(), "horizontalAlignment", 0);
        setIntField(term172030, term172030.getClass(), "verticalTextPosition", 0);
        setIntField(term172030, term172030.getClass(), "horizontalTextPosition", 0);
        setIntField(term172030, term172030.getClass(), "iconTextGap", 0);
        setField(term172030, term172030.getClass(), "labelFor", null);
        setBooleanField(term172030, term172030.getClass(), "isAlignmentXSet", false);
        setFloatField(term172030, term172030.getClass(), "alignmentX", 0.0F);
        setBooleanField(term172030, term172030.getClass(), "isAlignmentYSet", false);
        setFloatField(term172030, term172030.getClass(), "alignmentY", 0.0F);
        setField(term172030, term172030.getClass(), "ui", null);
        setField(term172030, term172030.getClass(), "listenerList", null);
        setField(term172030, term172030.getClass(), "clientProperties", null);
        setField(term172030, term172030.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term172030, term172030.getClass(), "autoscrolls", false);
        setField(term172030, term172030.getClass(), "border", null);
        setIntField(term172030, term172030.getClass(), "flags", 0);
        setField(term172030, term172030.getClass(), "inputVerifier", null);
        setBooleanField(term172030, term172030.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term172030, term172030.getClass(), "paintingChild", null);
        setField(term172030, term172030.getClass(), "popupMenu", null);
        setField(term172030, term172030.getClass(), "revalidateRunnableScheduled", null);
        setField(term172030, term172030.getClass(), "focusInputMap", null);
        setField(term172030, term172030.getClass(), "ancestorInputMap", null);
        setField(term172030, term172030.getClass(), "windowInputMap", null);
        setField(term172030, term172030.getClass(), "actionMap", null);
        setField(term172030, term172030.getClass(), "aaHint", null);
        setField(term172030, term172030.getClass(), "lcdRenderingHint", null);
        setField(term172030, term172030.getClass(), "component", null);
        setField(term172030, term172030.getClass(), "layoutMgr", null);
        setField(term172030, term172030.getClass(), "dispatcher", null);
        setField(term172030, term172030.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term172030, term172030.getClass(), "focusCycleRoot", false);
        setBooleanField(term172030, term172030.getClass(), "focusTraversalPolicyProvider", false);
        setField(term172030, term172030.getClass(), "printingThreads", null);
        setBooleanField(term172030, term172030.getClass(), "printing", false);
        setField(term172030, term172030.getClass(), "containerListener", null);
        setIntField(term172030, term172030.getClass(), "listeningChildren", 0);
        setIntField(term172030, term172030.getClass(), "listeningBoundsChildren", 0);
        setIntField(term172030, term172030.getClass(), "descendantsCount", 0);
        setField(term172030, term172030.getClass(), "preserveBackgroundColor", null);
        setIntField(term172030, term172030.getClass(), "numOfHWComponents", 0);
        setIntField(term172030, term172030.getClass(), "numOfLWComponents", 0);
        setField(term172030, term172030.getClass(), "modalComp", null);
        setField(term172030, term172030.getClass(), "modalAppContext", null);
        setIntField(term172030, term172030.getClass(), "containerSerializedDataVersion", 0);
        setField(term172030, term172030.getClass(), "peer", null);
        setField(term172030, term172030.getClass(), "parent", null);
        setField(term172030, term172030.getClass(), "appContext", null);
        setIntField(term172030, term172030.getClass(), "x", 0);
        setIntField(term172030, term172030.getClass(), "y", 0);
        setIntField(term172030, term172030.getClass(), "width", 0);
        setIntField(term172030, term172030.getClass(), "height", 0);
        setField(term172030, term172030.getClass(), "foreground", null);
        setField(term172030, term172030.getClass(), "background", null);
        setField(term172030, term172030.getClass(), "font", null);
        setField(term172030, term172030.getClass(), "peerFont", null);
        setField(term172030, term172030.getClass(), "cursor", null);
        setField(term172030, term172030.getClass(), "locale", null);
        setField(term172030, term172030.getClass(), "graphicsConfig", null);
        setField(term172030, term172030.getClass(), "bufferStrategy", null);
        setBooleanField(term172030, term172030.getClass(), "ignoreRepaint", false);
        setBooleanField(term172030, term172030.getClass(), "visible", false);
        setBooleanField(term172030, term172030.getClass(), "enabled", false);
        setBooleanField(term172030, term172030.getClass(), "valid", false);
        setField(term172030, term172030.getClass(), "dropTarget", null);
        setField(term172030, term172030.getClass(), "popups", null);
        setField(term172030, term172030.getClass(), "name", null);
        setBooleanField(term172030, term172030.getClass(), "nameExplicitlySet", false);
        setBooleanField(term172030, term172030.getClass(), "focusable", false);
        setIntField(term172030, term172030.getClass(), "isFocusTraversableOverridden", 0);
        setField(term172030, term172030.getClass(), "focusTraversalKeys", null);
        setBooleanField(term172030, term172030.getClass(), "focusTraversalKeysEnabled", false);
        setField(term172030, term172030.getClass(), "acc", null);
        setField(term172030, term172030.getClass(), "minSize", null);
        setBooleanField(term172030, term172030.getClass(), "minSizeSet", false);
        setField(term172030, term172030.getClass(), "prefSize", null);
        setBooleanField(term172030, term172030.getClass(), "prefSizeSet", false);
        setField(term172030, term172030.getClass(), "maxSize", null);
        setBooleanField(term172030, term172030.getClass(), "maxSizeSet", false);
        setField(term172030, term172030.getClass(), "componentOrientation", null);
        setBooleanField(term172030, term172030.getClass(), "newEventsOnly", false);
        setField(term172030, term172030.getClass(), "componentListener", null);
        setField(term172030, term172030.getClass(), "focusListener", null);
        setField(term172030, term172030.getClass(), "hierarchyListener", null);
        setField(term172030, term172030.getClass(), "hierarchyBoundsListener", null);
        setField(term172030, term172030.getClass(), "keyListener", null);
        setField(term172030, term172030.getClass(), "mouseListener", null);
        setField(term172030, term172030.getClass(), "mouseMotionListener", null);
        setField(term172030, term172030.getClass(), "mouseWheelListener", null);
        setField(term172030, term172030.getClass(), "inputMethodListener", null);
        setLongField(term172030, term172030.getClass(), "eventMask", 0L);
        setField(term172030, term172030.getClass(), "changeSupport", null);
        setField(term172030, term172030.getClass(), "objectLock", null);
        setBooleanField(term172030, term172030.getClass(), "isPacked", false);
        setIntField(term172030, term172030.getClass(), "boundsOp", 0);
        setField(term172030, term172030.getClass(), "compoundShape", null);
        setField(term172030, term172030.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term172030, term172030.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term172030, term172030.getClass(), "backgroundEraseDisabled", false);
        setField(term172030, term172030.getClass(), "eventCache", null);
        setBooleanField(term172030, term172030.getClass(), "coalescingEnabled", false);
        setBooleanField(term172030, term172030.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term172030, term172030.getClass(), "componentSerializedDataVersion", 0);
        setField(term172030, term172030.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoldOnSorted", argTypes, term172030, args);
    }

};


