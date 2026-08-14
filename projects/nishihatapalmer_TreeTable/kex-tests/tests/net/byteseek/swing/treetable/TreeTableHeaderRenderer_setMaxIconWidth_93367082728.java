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

public class TreeTableHeaderRenderer_setMaxIconWidth_93367082728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283638;

    public TreeTableHeaderRenderer_setMaxIconWidth_93367082728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283638 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term283638, term283638.getClass(), "sortIconBorder", null);
        setField(term283638, term283638.getClass(), "paintLabel", null);
        setBooleanField(term283638, term283638.getClass(), "boldOnSorted", false);
        setBooleanField(term283638, term283638.getClass(), "showNumber", false);
        setField(term283638, term283638.getClass(), "sortAscendingIcon", null);
        setField(term283638, term283638.getClass(), "sortDescendingIcon", null);
        setField(term283638, term283638.getClass(), "cachedHeaderFont", null);
        setField(term283638, term283638.getClass(), "boldHeaderFont", null);
        setIntField(term283638, term283638.getClass(), "sortOrderNumber", 0);
        setField(term283638, term283638.getClass(), "sortOrder", null);
        setIntField(term283638, term283638.getClass(), "maxIconWidth", 0);
        setIntField(term283638, term283638.getClass(), "sortNumberTextWidth", 0);
        setIntField(term283638, term283638.getClass(), "mnemonic", 0);
        setIntField(term283638, term283638.getClass(), "mnemonicIndex", 0);
        setField(term283638, term283638.getClass(), "text", null);
        setField(term283638, term283638.getClass(), "defaultIcon", null);
        setField(term283638, term283638.getClass(), "disabledIcon", null);
        setBooleanField(term283638, term283638.getClass(), "disabledIconSet", false);
        setIntField(term283638, term283638.getClass(), "verticalAlignment", 0);
        setIntField(term283638, term283638.getClass(), "horizontalAlignment", 0);
        setIntField(term283638, term283638.getClass(), "verticalTextPosition", 0);
        setIntField(term283638, term283638.getClass(), "horizontalTextPosition", 0);
        setIntField(term283638, term283638.getClass(), "iconTextGap", 0);
        setField(term283638, term283638.getClass(), "labelFor", null);
        setBooleanField(term283638, term283638.getClass(), "isAlignmentXSet", false);
        setFloatField(term283638, term283638.getClass(), "alignmentX", 0.0F);
        setBooleanField(term283638, term283638.getClass(), "isAlignmentYSet", false);
        setFloatField(term283638, term283638.getClass(), "alignmentY", 0.0F);
        setField(term283638, term283638.getClass(), "ui", null);
        setField(term283638, term283638.getClass(), "listenerList", null);
        setField(term283638, term283638.getClass(), "clientProperties", null);
        setField(term283638, term283638.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term283638, term283638.getClass(), "autoscrolls", false);
        setField(term283638, term283638.getClass(), "border", null);
        setIntField(term283638, term283638.getClass(), "flags", 0);
        setField(term283638, term283638.getClass(), "inputVerifier", null);
        setBooleanField(term283638, term283638.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term283638, term283638.getClass(), "paintingChild", null);
        setField(term283638, term283638.getClass(), "popupMenu", null);
        setField(term283638, term283638.getClass(), "revalidateRunnableScheduled", null);
        setField(term283638, term283638.getClass(), "focusInputMap", null);
        setField(term283638, term283638.getClass(), "ancestorInputMap", null);
        setField(term283638, term283638.getClass(), "windowInputMap", null);
        setField(term283638, term283638.getClass(), "actionMap", null);
        setField(term283638, term283638.getClass(), "aaHint", null);
        setField(term283638, term283638.getClass(), "lcdRenderingHint", null);
        setField(term283638, term283638.getClass(), "component", null);
        setField(term283638, term283638.getClass(), "layoutMgr", null);
        setField(term283638, term283638.getClass(), "dispatcher", null);
        setField(term283638, term283638.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term283638, term283638.getClass(), "focusCycleRoot", false);
        setBooleanField(term283638, term283638.getClass(), "focusTraversalPolicyProvider", false);
        setField(term283638, term283638.getClass(), "printingThreads", null);
        setBooleanField(term283638, term283638.getClass(), "printing", false);
        setField(term283638, term283638.getClass(), "containerListener", null);
        setIntField(term283638, term283638.getClass(), "listeningChildren", 0);
        setIntField(term283638, term283638.getClass(), "listeningBoundsChildren", 0);
        setIntField(term283638, term283638.getClass(), "descendantsCount", 0);
        setField(term283638, term283638.getClass(), "preserveBackgroundColor", null);
        setIntField(term283638, term283638.getClass(), "numOfHWComponents", 0);
        setIntField(term283638, term283638.getClass(), "numOfLWComponents", 0);
        setField(term283638, term283638.getClass(), "modalComp", null);
        setField(term283638, term283638.getClass(), "modalAppContext", null);
        setIntField(term283638, term283638.getClass(), "containerSerializedDataVersion", 0);
        setField(term283638, term283638.getClass(), "peer", null);
        setField(term283638, term283638.getClass(), "parent", null);
        setField(term283638, term283638.getClass(), "appContext", null);
        setIntField(term283638, term283638.getClass(), "x", 0);
        setIntField(term283638, term283638.getClass(), "y", 0);
        setIntField(term283638, term283638.getClass(), "width", 0);
        setIntField(term283638, term283638.getClass(), "height", 0);
        setField(term283638, term283638.getClass(), "foreground", null);
        setField(term283638, term283638.getClass(), "background", null);
        setField(term283638, term283638.getClass(), "font", null);
        setField(term283638, term283638.getClass(), "peerFont", null);
        setField(term283638, term283638.getClass(), "cursor", null);
        setField(term283638, term283638.getClass(), "locale", null);
        setField(term283638, term283638.getClass(), "graphicsConfig", null);
        setField(term283638, term283638.getClass(), "bufferStrategy", null);
        setBooleanField(term283638, term283638.getClass(), "ignoreRepaint", false);
        setBooleanField(term283638, term283638.getClass(), "visible", false);
        setBooleanField(term283638, term283638.getClass(), "enabled", false);
        setBooleanField(term283638, term283638.getClass(), "valid", false);
        setField(term283638, term283638.getClass(), "dropTarget", null);
        setField(term283638, term283638.getClass(), "popups", null);
        setField(term283638, term283638.getClass(), "name", null);
        setBooleanField(term283638, term283638.getClass(), "nameExplicitlySet", false);
        setBooleanField(term283638, term283638.getClass(), "focusable", false);
        setIntField(term283638, term283638.getClass(), "isFocusTraversableOverridden", 0);
        setField(term283638, term283638.getClass(), "focusTraversalKeys", null);
        setBooleanField(term283638, term283638.getClass(), "focusTraversalKeysEnabled", false);
        setField(term283638, term283638.getClass(), "acc", null);
        setField(term283638, term283638.getClass(), "minSize", null);
        setBooleanField(term283638, term283638.getClass(), "minSizeSet", false);
        setField(term283638, term283638.getClass(), "prefSize", null);
        setBooleanField(term283638, term283638.getClass(), "prefSizeSet", false);
        setField(term283638, term283638.getClass(), "maxSize", null);
        setBooleanField(term283638, term283638.getClass(), "maxSizeSet", false);
        setField(term283638, term283638.getClass(), "componentOrientation", null);
        setBooleanField(term283638, term283638.getClass(), "newEventsOnly", false);
        setField(term283638, term283638.getClass(), "componentListener", null);
        setField(term283638, term283638.getClass(), "focusListener", null);
        setField(term283638, term283638.getClass(), "hierarchyListener", null);
        setField(term283638, term283638.getClass(), "hierarchyBoundsListener", null);
        setField(term283638, term283638.getClass(), "keyListener", null);
        setField(term283638, term283638.getClass(), "mouseListener", null);
        setField(term283638, term283638.getClass(), "mouseMotionListener", null);
        setField(term283638, term283638.getClass(), "mouseWheelListener", null);
        setField(term283638, term283638.getClass(), "inputMethodListener", null);
        setLongField(term283638, term283638.getClass(), "eventMask", 0L);
        setField(term283638, term283638.getClass(), "changeSupport", null);
        setField(term283638, term283638.getClass(), "objectLock", null);
        setBooleanField(term283638, term283638.getClass(), "isPacked", false);
        setIntField(term283638, term283638.getClass(), "boundsOp", 0);
        setField(term283638, term283638.getClass(), "compoundShape", null);
        setField(term283638, term283638.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term283638, term283638.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term283638, term283638.getClass(), "backgroundEraseDisabled", false);
        setField(term283638, term283638.getClass(), "eventCache", null);
        setBooleanField(term283638, term283638.getClass(), "coalescingEnabled", false);
        setBooleanField(term283638, term283638.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term283638, term283638.getClass(), "componentSerializedDataVersion", 0);
        setField(term283638, term283638.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setMaxIconWidth", argTypes, term283638, args);
    }

};


