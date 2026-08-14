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

public class TreeTableHeaderRenderer_setSortAscendingIcon_5312180816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209205;

    public TreeTableHeaderRenderer_setSortAscendingIcon_5312180816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209205 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term209205, term209205.getClass(), "sortIconBorder", null);
        setField(term209205, term209205.getClass(), "paintLabel", null);
        setBooleanField(term209205, term209205.getClass(), "boldOnSorted", false);
        setBooleanField(term209205, term209205.getClass(), "showNumber", false);
        setField(term209205, term209205.getClass(), "sortAscendingIcon", null);
        setField(term209205, term209205.getClass(), "sortDescendingIcon", null);
        setField(term209205, term209205.getClass(), "cachedHeaderFont", null);
        setField(term209205, term209205.getClass(), "boldHeaderFont", null);
        setIntField(term209205, term209205.getClass(), "sortOrderNumber", 0);
        setField(term209205, term209205.getClass(), "sortOrder", null);
        setIntField(term209205, term209205.getClass(), "maxIconWidth", 0);
        setIntField(term209205, term209205.getClass(), "sortNumberTextWidth", 0);
        setIntField(term209205, term209205.getClass(), "mnemonic", 0);
        setIntField(term209205, term209205.getClass(), "mnemonicIndex", 0);
        setField(term209205, term209205.getClass(), "text", null);
        setField(term209205, term209205.getClass(), "defaultIcon", null);
        setField(term209205, term209205.getClass(), "disabledIcon", null);
        setBooleanField(term209205, term209205.getClass(), "disabledIconSet", false);
        setIntField(term209205, term209205.getClass(), "verticalAlignment", 0);
        setIntField(term209205, term209205.getClass(), "horizontalAlignment", 0);
        setIntField(term209205, term209205.getClass(), "verticalTextPosition", 0);
        setIntField(term209205, term209205.getClass(), "horizontalTextPosition", 0);
        setIntField(term209205, term209205.getClass(), "iconTextGap", 0);
        setField(term209205, term209205.getClass(), "labelFor", null);
        setBooleanField(term209205, term209205.getClass(), "isAlignmentXSet", false);
        setFloatField(term209205, term209205.getClass(), "alignmentX", 0.0F);
        setBooleanField(term209205, term209205.getClass(), "isAlignmentYSet", false);
        setFloatField(term209205, term209205.getClass(), "alignmentY", 0.0F);
        setField(term209205, term209205.getClass(), "ui", null);
        setField(term209205, term209205.getClass(), "listenerList", null);
        setField(term209205, term209205.getClass(), "clientProperties", null);
        setField(term209205, term209205.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term209205, term209205.getClass(), "autoscrolls", false);
        setField(term209205, term209205.getClass(), "border", null);
        setIntField(term209205, term209205.getClass(), "flags", 0);
        setField(term209205, term209205.getClass(), "inputVerifier", null);
        setBooleanField(term209205, term209205.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term209205, term209205.getClass(), "paintingChild", null);
        setField(term209205, term209205.getClass(), "popupMenu", null);
        setField(term209205, term209205.getClass(), "revalidateRunnableScheduled", null);
        setField(term209205, term209205.getClass(), "focusInputMap", null);
        setField(term209205, term209205.getClass(), "ancestorInputMap", null);
        setField(term209205, term209205.getClass(), "windowInputMap", null);
        setField(term209205, term209205.getClass(), "actionMap", null);
        setField(term209205, term209205.getClass(), "aaHint", null);
        setField(term209205, term209205.getClass(), "lcdRenderingHint", null);
        setField(term209205, term209205.getClass(), "component", null);
        setField(term209205, term209205.getClass(), "layoutMgr", null);
        setField(term209205, term209205.getClass(), "dispatcher", null);
        setField(term209205, term209205.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term209205, term209205.getClass(), "focusCycleRoot", false);
        setBooleanField(term209205, term209205.getClass(), "focusTraversalPolicyProvider", false);
        setField(term209205, term209205.getClass(), "printingThreads", null);
        setBooleanField(term209205, term209205.getClass(), "printing", false);
        setField(term209205, term209205.getClass(), "containerListener", null);
        setIntField(term209205, term209205.getClass(), "listeningChildren", 0);
        setIntField(term209205, term209205.getClass(), "listeningBoundsChildren", 0);
        setIntField(term209205, term209205.getClass(), "descendantsCount", 0);
        setField(term209205, term209205.getClass(), "preserveBackgroundColor", null);
        setIntField(term209205, term209205.getClass(), "numOfHWComponents", 0);
        setIntField(term209205, term209205.getClass(), "numOfLWComponents", 0);
        setField(term209205, term209205.getClass(), "modalComp", null);
        setField(term209205, term209205.getClass(), "modalAppContext", null);
        setIntField(term209205, term209205.getClass(), "containerSerializedDataVersion", 0);
        setField(term209205, term209205.getClass(), "peer", null);
        setField(term209205, term209205.getClass(), "parent", null);
        setField(term209205, term209205.getClass(), "appContext", null);
        setIntField(term209205, term209205.getClass(), "x", 0);
        setIntField(term209205, term209205.getClass(), "y", 0);
        setIntField(term209205, term209205.getClass(), "width", 0);
        setIntField(term209205, term209205.getClass(), "height", 0);
        setField(term209205, term209205.getClass(), "foreground", null);
        setField(term209205, term209205.getClass(), "background", null);
        setField(term209205, term209205.getClass(), "font", null);
        setField(term209205, term209205.getClass(), "peerFont", null);
        setField(term209205, term209205.getClass(), "cursor", null);
        setField(term209205, term209205.getClass(), "locale", null);
        setField(term209205, term209205.getClass(), "graphicsConfig", null);
        setField(term209205, term209205.getClass(), "bufferStrategy", null);
        setBooleanField(term209205, term209205.getClass(), "ignoreRepaint", false);
        setBooleanField(term209205, term209205.getClass(), "visible", false);
        setBooleanField(term209205, term209205.getClass(), "enabled", false);
        setBooleanField(term209205, term209205.getClass(), "valid", false);
        setField(term209205, term209205.getClass(), "dropTarget", null);
        setField(term209205, term209205.getClass(), "popups", null);
        setField(term209205, term209205.getClass(), "name", null);
        setBooleanField(term209205, term209205.getClass(), "nameExplicitlySet", false);
        setBooleanField(term209205, term209205.getClass(), "focusable", false);
        setIntField(term209205, term209205.getClass(), "isFocusTraversableOverridden", 0);
        setField(term209205, term209205.getClass(), "focusTraversalKeys", null);
        setBooleanField(term209205, term209205.getClass(), "focusTraversalKeysEnabled", false);
        setField(term209205, term209205.getClass(), "acc", null);
        setField(term209205, term209205.getClass(), "minSize", null);
        setBooleanField(term209205, term209205.getClass(), "minSizeSet", false);
        setField(term209205, term209205.getClass(), "prefSize", null);
        setBooleanField(term209205, term209205.getClass(), "prefSizeSet", false);
        setField(term209205, term209205.getClass(), "maxSize", null);
        setBooleanField(term209205, term209205.getClass(), "maxSizeSet", false);
        setField(term209205, term209205.getClass(), "componentOrientation", null);
        setBooleanField(term209205, term209205.getClass(), "newEventsOnly", false);
        setField(term209205, term209205.getClass(), "componentListener", null);
        setField(term209205, term209205.getClass(), "focusListener", null);
        setField(term209205, term209205.getClass(), "hierarchyListener", null);
        setField(term209205, term209205.getClass(), "hierarchyBoundsListener", null);
        setField(term209205, term209205.getClass(), "keyListener", null);
        setField(term209205, term209205.getClass(), "mouseListener", null);
        setField(term209205, term209205.getClass(), "mouseMotionListener", null);
        setField(term209205, term209205.getClass(), "mouseWheelListener", null);
        setField(term209205, term209205.getClass(), "inputMethodListener", null);
        setLongField(term209205, term209205.getClass(), "eventMask", 0L);
        setField(term209205, term209205.getClass(), "changeSupport", null);
        setField(term209205, term209205.getClass(), "objectLock", null);
        setBooleanField(term209205, term209205.getClass(), "isPacked", false);
        setIntField(term209205, term209205.getClass(), "boundsOp", 0);
        setField(term209205, term209205.getClass(), "compoundShape", null);
        setField(term209205, term209205.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term209205, term209205.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term209205, term209205.getClass(), "backgroundEraseDisabled", false);
        setField(term209205, term209205.getClass(), "eventCache", null);
        setBooleanField(term209205, term209205.getClass(), "coalescingEnabled", false);
        setBooleanField(term209205, term209205.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term209205, term209205.getClass(), "componentSerializedDataVersion", 0);
        setField(term209205, term209205.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortAscendingIcon", argTypes, term209205, args);
    }

};


