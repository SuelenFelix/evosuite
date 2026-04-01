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
     Object term221996;

    public TreeTableHeaderRenderer_getSortAscendingIcon_145881902818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221996 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term221996, term221996.getClass(), "sortIconBorder", null);
        setField(term221996, term221996.getClass(), "paintLabel", null);
        setBooleanField(term221996, term221996.getClass(), "boldOnSorted", false);
        setBooleanField(term221996, term221996.getClass(), "showNumber", false);
        setField(term221996, term221996.getClass(), "sortAscendingIcon", null);
        setField(term221996, term221996.getClass(), "sortDescendingIcon", null);
        setField(term221996, term221996.getClass(), "cachedHeaderFont", null);
        setField(term221996, term221996.getClass(), "boldHeaderFont", null);
        setIntField(term221996, term221996.getClass(), "sortOrderNumber", 0);
        setField(term221996, term221996.getClass(), "sortOrder", null);
        setIntField(term221996, term221996.getClass(), "maxIconWidth", 0);
        setIntField(term221996, term221996.getClass(), "sortNumberTextWidth", 0);
        setIntField(term221996, term221996.getClass(), "mnemonic", 0);
        setIntField(term221996, term221996.getClass(), "mnemonicIndex", 0);
        setField(term221996, term221996.getClass(), "text", null);
        setField(term221996, term221996.getClass(), "defaultIcon", null);
        setField(term221996, term221996.getClass(), "disabledIcon", null);
        setBooleanField(term221996, term221996.getClass(), "disabledIconSet", false);
        setIntField(term221996, term221996.getClass(), "verticalAlignment", 0);
        setIntField(term221996, term221996.getClass(), "horizontalAlignment", 0);
        setIntField(term221996, term221996.getClass(), "verticalTextPosition", 0);
        setIntField(term221996, term221996.getClass(), "horizontalTextPosition", 0);
        setIntField(term221996, term221996.getClass(), "iconTextGap", 0);
        setField(term221996, term221996.getClass(), "labelFor", null);
        setBooleanField(term221996, term221996.getClass(), "isAlignmentXSet", false);
        setFloatField(term221996, term221996.getClass(), "alignmentX", 0.0F);
        setBooleanField(term221996, term221996.getClass(), "isAlignmentYSet", false);
        setFloatField(term221996, term221996.getClass(), "alignmentY", 0.0F);
        setField(term221996, term221996.getClass(), "ui", null);
        setField(term221996, term221996.getClass(), "listenerList", null);
        setField(term221996, term221996.getClass(), "clientProperties", null);
        setField(term221996, term221996.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term221996, term221996.getClass(), "autoscrolls", false);
        setField(term221996, term221996.getClass(), "border", null);
        setIntField(term221996, term221996.getClass(), "flags", 0);
        setField(term221996, term221996.getClass(), "inputVerifier", null);
        setBooleanField(term221996, term221996.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term221996, term221996.getClass(), "paintingChild", null);
        setField(term221996, term221996.getClass(), "popupMenu", null);
        setField(term221996, term221996.getClass(), "revalidateRunnableScheduled", null);
        setField(term221996, term221996.getClass(), "focusInputMap", null);
        setField(term221996, term221996.getClass(), "ancestorInputMap", null);
        setField(term221996, term221996.getClass(), "windowInputMap", null);
        setField(term221996, term221996.getClass(), "actionMap", null);
        setField(term221996, term221996.getClass(), "aaHint", null);
        setField(term221996, term221996.getClass(), "lcdRenderingHint", null);
        setField(term221996, term221996.getClass(), "component", null);
        setField(term221996, term221996.getClass(), "layoutMgr", null);
        setField(term221996, term221996.getClass(), "dispatcher", null);
        setField(term221996, term221996.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term221996, term221996.getClass(), "focusCycleRoot", false);
        setBooleanField(term221996, term221996.getClass(), "focusTraversalPolicyProvider", false);
        setField(term221996, term221996.getClass(), "printingThreads", null);
        setBooleanField(term221996, term221996.getClass(), "printing", false);
        setField(term221996, term221996.getClass(), "containerListener", null);
        setIntField(term221996, term221996.getClass(), "listeningChildren", 0);
        setIntField(term221996, term221996.getClass(), "listeningBoundsChildren", 0);
        setIntField(term221996, term221996.getClass(), "descendantsCount", 0);
        setField(term221996, term221996.getClass(), "preserveBackgroundColor", null);
        setIntField(term221996, term221996.getClass(), "numOfHWComponents", 0);
        setIntField(term221996, term221996.getClass(), "numOfLWComponents", 0);
        setField(term221996, term221996.getClass(), "modalComp", null);
        setField(term221996, term221996.getClass(), "modalAppContext", null);
        setIntField(term221996, term221996.getClass(), "containerSerializedDataVersion", 0);
        setField(term221996, term221996.getClass(), "peer", null);
        setField(term221996, term221996.getClass(), "parent", null);
        setField(term221996, term221996.getClass(), "appContext", null);
        setIntField(term221996, term221996.getClass(), "x", 0);
        setIntField(term221996, term221996.getClass(), "y", 0);
        setIntField(term221996, term221996.getClass(), "width", 0);
        setIntField(term221996, term221996.getClass(), "height", 0);
        setField(term221996, term221996.getClass(), "foreground", null);
        setField(term221996, term221996.getClass(), "background", null);
        setField(term221996, term221996.getClass(), "font", null);
        setField(term221996, term221996.getClass(), "peerFont", null);
        setField(term221996, term221996.getClass(), "cursor", null);
        setField(term221996, term221996.getClass(), "locale", null);
        setField(term221996, term221996.getClass(), "graphicsConfig", null);
        setField(term221996, term221996.getClass(), "bufferStrategy", null);
        setBooleanField(term221996, term221996.getClass(), "ignoreRepaint", false);
        setBooleanField(term221996, term221996.getClass(), "visible", false);
        setBooleanField(term221996, term221996.getClass(), "enabled", false);
        setBooleanField(term221996, term221996.getClass(), "valid", false);
        setField(term221996, term221996.getClass(), "dropTarget", null);
        setField(term221996, term221996.getClass(), "popups", null);
        setField(term221996, term221996.getClass(), "name", null);
        setBooleanField(term221996, term221996.getClass(), "nameExplicitlySet", false);
        setBooleanField(term221996, term221996.getClass(), "focusable", false);
        setIntField(term221996, term221996.getClass(), "isFocusTraversableOverridden", 0);
        setField(term221996, term221996.getClass(), "focusTraversalKeys", null);
        setBooleanField(term221996, term221996.getClass(), "focusTraversalKeysEnabled", false);
        setField(term221996, term221996.getClass(), "acc", null);
        setField(term221996, term221996.getClass(), "minSize", null);
        setBooleanField(term221996, term221996.getClass(), "minSizeSet", false);
        setField(term221996, term221996.getClass(), "prefSize", null);
        setBooleanField(term221996, term221996.getClass(), "prefSizeSet", false);
        setField(term221996, term221996.getClass(), "maxSize", null);
        setBooleanField(term221996, term221996.getClass(), "maxSizeSet", false);
        setField(term221996, term221996.getClass(), "componentOrientation", null);
        setBooleanField(term221996, term221996.getClass(), "newEventsOnly", false);
        setField(term221996, term221996.getClass(), "componentListener", null);
        setField(term221996, term221996.getClass(), "focusListener", null);
        setField(term221996, term221996.getClass(), "hierarchyListener", null);
        setField(term221996, term221996.getClass(), "hierarchyBoundsListener", null);
        setField(term221996, term221996.getClass(), "keyListener", null);
        setField(term221996, term221996.getClass(), "mouseListener", null);
        setField(term221996, term221996.getClass(), "mouseMotionListener", null);
        setField(term221996, term221996.getClass(), "mouseWheelListener", null);
        setField(term221996, term221996.getClass(), "inputMethodListener", null);
        setLongField(term221996, term221996.getClass(), "eventMask", 0L);
        setField(term221996, term221996.getClass(), "changeSupport", null);
        setField(term221996, term221996.getClass(), "objectLock", null);
        setBooleanField(term221996, term221996.getClass(), "isPacked", false);
        setIntField(term221996, term221996.getClass(), "boundsOp", 0);
        setField(term221996, term221996.getClass(), "compoundShape", null);
        setField(term221996, term221996.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term221996, term221996.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term221996, term221996.getClass(), "backgroundEraseDisabled", false);
        setField(term221996, term221996.getClass(), "eventCache", null);
        setBooleanField(term221996, term221996.getClass(), "coalescingEnabled", false);
        setBooleanField(term221996, term221996.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term221996, term221996.getClass(), "componentSerializedDataVersion", 0);
        setField(term221996, term221996.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortAscendingIcon", argTypes, term221996, args);
    }

};


