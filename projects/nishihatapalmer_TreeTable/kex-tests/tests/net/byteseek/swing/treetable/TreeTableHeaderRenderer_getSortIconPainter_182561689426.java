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
     Object term271632;

    public TreeTableHeaderRenderer_getSortIconPainter_182561689426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271632 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term271632, term271632.getClass(), "sortIconBorder", null);
        setField(term271632, term271632.getClass(), "paintLabel", null);
        setBooleanField(term271632, term271632.getClass(), "boldOnSorted", false);
        setBooleanField(term271632, term271632.getClass(), "showNumber", false);
        setField(term271632, term271632.getClass(), "sortAscendingIcon", null);
        setField(term271632, term271632.getClass(), "sortDescendingIcon", null);
        setField(term271632, term271632.getClass(), "cachedHeaderFont", null);
        setField(term271632, term271632.getClass(), "boldHeaderFont", null);
        setIntField(term271632, term271632.getClass(), "sortOrderNumber", 0);
        setField(term271632, term271632.getClass(), "sortOrder", null);
        setIntField(term271632, term271632.getClass(), "maxIconWidth", 0);
        setIntField(term271632, term271632.getClass(), "sortNumberTextWidth", 0);
        setIntField(term271632, term271632.getClass(), "mnemonic", 0);
        setIntField(term271632, term271632.getClass(), "mnemonicIndex", 0);
        setField(term271632, term271632.getClass(), "text", null);
        setField(term271632, term271632.getClass(), "defaultIcon", null);
        setField(term271632, term271632.getClass(), "disabledIcon", null);
        setBooleanField(term271632, term271632.getClass(), "disabledIconSet", false);
        setIntField(term271632, term271632.getClass(), "verticalAlignment", 0);
        setIntField(term271632, term271632.getClass(), "horizontalAlignment", 0);
        setIntField(term271632, term271632.getClass(), "verticalTextPosition", 0);
        setIntField(term271632, term271632.getClass(), "horizontalTextPosition", 0);
        setIntField(term271632, term271632.getClass(), "iconTextGap", 0);
        setField(term271632, term271632.getClass(), "labelFor", null);
        setBooleanField(term271632, term271632.getClass(), "isAlignmentXSet", false);
        setFloatField(term271632, term271632.getClass(), "alignmentX", 0.0F);
        setBooleanField(term271632, term271632.getClass(), "isAlignmentYSet", false);
        setFloatField(term271632, term271632.getClass(), "alignmentY", 0.0F);
        setField(term271632, term271632.getClass(), "ui", null);
        setField(term271632, term271632.getClass(), "listenerList", null);
        setField(term271632, term271632.getClass(), "clientProperties", null);
        setField(term271632, term271632.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term271632, term271632.getClass(), "autoscrolls", false);
        setField(term271632, term271632.getClass(), "border", null);
        setIntField(term271632, term271632.getClass(), "flags", 0);
        setField(term271632, term271632.getClass(), "inputVerifier", null);
        setBooleanField(term271632, term271632.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term271632, term271632.getClass(), "paintingChild", null);
        setField(term271632, term271632.getClass(), "popupMenu", null);
        setField(term271632, term271632.getClass(), "revalidateRunnableScheduled", null);
        setField(term271632, term271632.getClass(), "focusInputMap", null);
        setField(term271632, term271632.getClass(), "ancestorInputMap", null);
        setField(term271632, term271632.getClass(), "windowInputMap", null);
        setField(term271632, term271632.getClass(), "actionMap", null);
        setField(term271632, term271632.getClass(), "aaHint", null);
        setField(term271632, term271632.getClass(), "lcdRenderingHint", null);
        setField(term271632, term271632.getClass(), "component", null);
        setField(term271632, term271632.getClass(), "layoutMgr", null);
        setField(term271632, term271632.getClass(), "dispatcher", null);
        setField(term271632, term271632.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term271632, term271632.getClass(), "focusCycleRoot", false);
        setBooleanField(term271632, term271632.getClass(), "focusTraversalPolicyProvider", false);
        setField(term271632, term271632.getClass(), "printingThreads", null);
        setBooleanField(term271632, term271632.getClass(), "printing", false);
        setField(term271632, term271632.getClass(), "containerListener", null);
        setIntField(term271632, term271632.getClass(), "listeningChildren", 0);
        setIntField(term271632, term271632.getClass(), "listeningBoundsChildren", 0);
        setIntField(term271632, term271632.getClass(), "descendantsCount", 0);
        setField(term271632, term271632.getClass(), "preserveBackgroundColor", null);
        setIntField(term271632, term271632.getClass(), "numOfHWComponents", 0);
        setIntField(term271632, term271632.getClass(), "numOfLWComponents", 0);
        setField(term271632, term271632.getClass(), "modalComp", null);
        setField(term271632, term271632.getClass(), "modalAppContext", null);
        setIntField(term271632, term271632.getClass(), "containerSerializedDataVersion", 0);
        setField(term271632, term271632.getClass(), "peer", null);
        setField(term271632, term271632.getClass(), "parent", null);
        setField(term271632, term271632.getClass(), "appContext", null);
        setIntField(term271632, term271632.getClass(), "x", 0);
        setIntField(term271632, term271632.getClass(), "y", 0);
        setIntField(term271632, term271632.getClass(), "width", 0);
        setIntField(term271632, term271632.getClass(), "height", 0);
        setField(term271632, term271632.getClass(), "foreground", null);
        setField(term271632, term271632.getClass(), "background", null);
        setField(term271632, term271632.getClass(), "font", null);
        setField(term271632, term271632.getClass(), "peerFont", null);
        setField(term271632, term271632.getClass(), "cursor", null);
        setField(term271632, term271632.getClass(), "locale", null);
        setField(term271632, term271632.getClass(), "graphicsConfig", null);
        setField(term271632, term271632.getClass(), "bufferStrategy", null);
        setBooleanField(term271632, term271632.getClass(), "ignoreRepaint", false);
        setBooleanField(term271632, term271632.getClass(), "visible", false);
        setBooleanField(term271632, term271632.getClass(), "enabled", false);
        setBooleanField(term271632, term271632.getClass(), "valid", false);
        setField(term271632, term271632.getClass(), "dropTarget", null);
        setField(term271632, term271632.getClass(), "popups", null);
        setField(term271632, term271632.getClass(), "name", null);
        setBooleanField(term271632, term271632.getClass(), "nameExplicitlySet", false);
        setBooleanField(term271632, term271632.getClass(), "focusable", false);
        setIntField(term271632, term271632.getClass(), "isFocusTraversableOverridden", 0);
        setField(term271632, term271632.getClass(), "focusTraversalKeys", null);
        setBooleanField(term271632, term271632.getClass(), "focusTraversalKeysEnabled", false);
        setField(term271632, term271632.getClass(), "acc", null);
        setField(term271632, term271632.getClass(), "minSize", null);
        setBooleanField(term271632, term271632.getClass(), "minSizeSet", false);
        setField(term271632, term271632.getClass(), "prefSize", null);
        setBooleanField(term271632, term271632.getClass(), "prefSizeSet", false);
        setField(term271632, term271632.getClass(), "maxSize", null);
        setBooleanField(term271632, term271632.getClass(), "maxSizeSet", false);
        setField(term271632, term271632.getClass(), "componentOrientation", null);
        setBooleanField(term271632, term271632.getClass(), "newEventsOnly", false);
        setField(term271632, term271632.getClass(), "componentListener", null);
        setField(term271632, term271632.getClass(), "focusListener", null);
        setField(term271632, term271632.getClass(), "hierarchyListener", null);
        setField(term271632, term271632.getClass(), "hierarchyBoundsListener", null);
        setField(term271632, term271632.getClass(), "keyListener", null);
        setField(term271632, term271632.getClass(), "mouseListener", null);
        setField(term271632, term271632.getClass(), "mouseMotionListener", null);
        setField(term271632, term271632.getClass(), "mouseWheelListener", null);
        setField(term271632, term271632.getClass(), "inputMethodListener", null);
        setLongField(term271632, term271632.getClass(), "eventMask", 0L);
        setField(term271632, term271632.getClass(), "changeSupport", null);
        setField(term271632, term271632.getClass(), "objectLock", null);
        setBooleanField(term271632, term271632.getClass(), "isPacked", false);
        setIntField(term271632, term271632.getClass(), "boundsOp", 0);
        setField(term271632, term271632.getClass(), "compoundShape", null);
        setField(term271632, term271632.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term271632, term271632.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term271632, term271632.getClass(), "backgroundEraseDisabled", false);
        setField(term271632, term271632.getClass(), "eventCache", null);
        setBooleanField(term271632, term271632.getClass(), "coalescingEnabled", false);
        setBooleanField(term271632, term271632.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term271632, term271632.getClass(), "componentSerializedDataVersion", 0);
        setField(term271632, term271632.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortIconPainter", argTypes, term271632, args);
    }

};


