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
     Object term284086;

    public TreeTableHeaderRenderer_setMaxIconWidth_93367082728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284086 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term284086, term284086.getClass(), "sortIconBorder", null);
        setField(term284086, term284086.getClass(), "paintLabel", null);
        setBooleanField(term284086, term284086.getClass(), "boldOnSorted", false);
        setBooleanField(term284086, term284086.getClass(), "showNumber", false);
        setField(term284086, term284086.getClass(), "sortAscendingIcon", null);
        setField(term284086, term284086.getClass(), "sortDescendingIcon", null);
        setField(term284086, term284086.getClass(), "cachedHeaderFont", null);
        setField(term284086, term284086.getClass(), "boldHeaderFont", null);
        setIntField(term284086, term284086.getClass(), "sortOrderNumber", 0);
        setField(term284086, term284086.getClass(), "sortOrder", null);
        setIntField(term284086, term284086.getClass(), "maxIconWidth", 0);
        setIntField(term284086, term284086.getClass(), "sortNumberTextWidth", 0);
        setIntField(term284086, term284086.getClass(), "mnemonic", 0);
        setIntField(term284086, term284086.getClass(), "mnemonicIndex", 0);
        setField(term284086, term284086.getClass(), "text", null);
        setField(term284086, term284086.getClass(), "defaultIcon", null);
        setField(term284086, term284086.getClass(), "disabledIcon", null);
        setBooleanField(term284086, term284086.getClass(), "disabledIconSet", false);
        setIntField(term284086, term284086.getClass(), "verticalAlignment", 0);
        setIntField(term284086, term284086.getClass(), "horizontalAlignment", 0);
        setIntField(term284086, term284086.getClass(), "verticalTextPosition", 0);
        setIntField(term284086, term284086.getClass(), "horizontalTextPosition", 0);
        setIntField(term284086, term284086.getClass(), "iconTextGap", 0);
        setField(term284086, term284086.getClass(), "labelFor", null);
        setBooleanField(term284086, term284086.getClass(), "isAlignmentXSet", false);
        setFloatField(term284086, term284086.getClass(), "alignmentX", 0.0F);
        setBooleanField(term284086, term284086.getClass(), "isAlignmentYSet", false);
        setFloatField(term284086, term284086.getClass(), "alignmentY", 0.0F);
        setField(term284086, term284086.getClass(), "ui", null);
        setField(term284086, term284086.getClass(), "listenerList", null);
        setField(term284086, term284086.getClass(), "clientProperties", null);
        setField(term284086, term284086.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term284086, term284086.getClass(), "autoscrolls", false);
        setField(term284086, term284086.getClass(), "border", null);
        setIntField(term284086, term284086.getClass(), "flags", 0);
        setField(term284086, term284086.getClass(), "inputVerifier", null);
        setBooleanField(term284086, term284086.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term284086, term284086.getClass(), "paintingChild", null);
        setField(term284086, term284086.getClass(), "popupMenu", null);
        setField(term284086, term284086.getClass(), "revalidateRunnableScheduled", null);
        setField(term284086, term284086.getClass(), "focusInputMap", null);
        setField(term284086, term284086.getClass(), "ancestorInputMap", null);
        setField(term284086, term284086.getClass(), "windowInputMap", null);
        setField(term284086, term284086.getClass(), "actionMap", null);
        setField(term284086, term284086.getClass(), "aaHint", null);
        setField(term284086, term284086.getClass(), "lcdRenderingHint", null);
        setField(term284086, term284086.getClass(), "component", null);
        setField(term284086, term284086.getClass(), "layoutMgr", null);
        setField(term284086, term284086.getClass(), "dispatcher", null);
        setField(term284086, term284086.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term284086, term284086.getClass(), "focusCycleRoot", false);
        setBooleanField(term284086, term284086.getClass(), "focusTraversalPolicyProvider", false);
        setField(term284086, term284086.getClass(), "printingThreads", null);
        setBooleanField(term284086, term284086.getClass(), "printing", false);
        setField(term284086, term284086.getClass(), "containerListener", null);
        setIntField(term284086, term284086.getClass(), "listeningChildren", 0);
        setIntField(term284086, term284086.getClass(), "listeningBoundsChildren", 0);
        setIntField(term284086, term284086.getClass(), "descendantsCount", 0);
        setField(term284086, term284086.getClass(), "preserveBackgroundColor", null);
        setIntField(term284086, term284086.getClass(), "numOfHWComponents", 0);
        setIntField(term284086, term284086.getClass(), "numOfLWComponents", 0);
        setField(term284086, term284086.getClass(), "modalComp", null);
        setField(term284086, term284086.getClass(), "modalAppContext", null);
        setIntField(term284086, term284086.getClass(), "containerSerializedDataVersion", 0);
        setField(term284086, term284086.getClass(), "peer", null);
        setField(term284086, term284086.getClass(), "parent", null);
        setField(term284086, term284086.getClass(), "appContext", null);
        setIntField(term284086, term284086.getClass(), "x", 0);
        setIntField(term284086, term284086.getClass(), "y", 0);
        setIntField(term284086, term284086.getClass(), "width", 0);
        setIntField(term284086, term284086.getClass(), "height", 0);
        setField(term284086, term284086.getClass(), "foreground", null);
        setField(term284086, term284086.getClass(), "background", null);
        setField(term284086, term284086.getClass(), "font", null);
        setField(term284086, term284086.getClass(), "peerFont", null);
        setField(term284086, term284086.getClass(), "cursor", null);
        setField(term284086, term284086.getClass(), "locale", null);
        setField(term284086, term284086.getClass(), "graphicsConfig", null);
        setField(term284086, term284086.getClass(), "bufferStrategy", null);
        setBooleanField(term284086, term284086.getClass(), "ignoreRepaint", false);
        setBooleanField(term284086, term284086.getClass(), "visible", false);
        setBooleanField(term284086, term284086.getClass(), "enabled", false);
        setBooleanField(term284086, term284086.getClass(), "valid", false);
        setField(term284086, term284086.getClass(), "dropTarget", null);
        setField(term284086, term284086.getClass(), "popups", null);
        setField(term284086, term284086.getClass(), "name", null);
        setBooleanField(term284086, term284086.getClass(), "nameExplicitlySet", false);
        setBooleanField(term284086, term284086.getClass(), "focusable", false);
        setIntField(term284086, term284086.getClass(), "isFocusTraversableOverridden", 0);
        setField(term284086, term284086.getClass(), "focusTraversalKeys", null);
        setBooleanField(term284086, term284086.getClass(), "focusTraversalKeysEnabled", false);
        setField(term284086, term284086.getClass(), "acc", null);
        setField(term284086, term284086.getClass(), "minSize", null);
        setBooleanField(term284086, term284086.getClass(), "minSizeSet", false);
        setField(term284086, term284086.getClass(), "prefSize", null);
        setBooleanField(term284086, term284086.getClass(), "prefSizeSet", false);
        setField(term284086, term284086.getClass(), "maxSize", null);
        setBooleanField(term284086, term284086.getClass(), "maxSizeSet", false);
        setField(term284086, term284086.getClass(), "componentOrientation", null);
        setBooleanField(term284086, term284086.getClass(), "newEventsOnly", false);
        setField(term284086, term284086.getClass(), "componentListener", null);
        setField(term284086, term284086.getClass(), "focusListener", null);
        setField(term284086, term284086.getClass(), "hierarchyListener", null);
        setField(term284086, term284086.getClass(), "hierarchyBoundsListener", null);
        setField(term284086, term284086.getClass(), "keyListener", null);
        setField(term284086, term284086.getClass(), "mouseListener", null);
        setField(term284086, term284086.getClass(), "mouseMotionListener", null);
        setField(term284086, term284086.getClass(), "mouseWheelListener", null);
        setField(term284086, term284086.getClass(), "inputMethodListener", null);
        setLongField(term284086, term284086.getClass(), "eventMask", 0L);
        setField(term284086, term284086.getClass(), "changeSupport", null);
        setField(term284086, term284086.getClass(), "objectLock", null);
        setBooleanField(term284086, term284086.getClass(), "isPacked", false);
        setIntField(term284086, term284086.getClass(), "boundsOp", 0);
        setField(term284086, term284086.getClass(), "compoundShape", null);
        setField(term284086, term284086.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term284086, term284086.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term284086, term284086.getClass(), "backgroundEraseDisabled", false);
        setField(term284086, term284086.getClass(), "eventCache", null);
        setBooleanField(term284086, term284086.getClass(), "coalescingEnabled", false);
        setBooleanField(term284086, term284086.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term284086, term284086.getClass(), "componentSerializedDataVersion", 0);
        setField(term284086, term284086.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setMaxIconWidth", argTypes, term284086, args);
    }

};


