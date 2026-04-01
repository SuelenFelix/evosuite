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
     Object term209593;

    public TreeTableHeaderRenderer_setSortAscendingIcon_5312180816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209593 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term209593, term209593.getClass(), "sortIconBorder", null);
        setField(term209593, term209593.getClass(), "paintLabel", null);
        setBooleanField(term209593, term209593.getClass(), "boldOnSorted", false);
        setBooleanField(term209593, term209593.getClass(), "showNumber", false);
        setField(term209593, term209593.getClass(), "sortAscendingIcon", null);
        setField(term209593, term209593.getClass(), "sortDescendingIcon", null);
        setField(term209593, term209593.getClass(), "cachedHeaderFont", null);
        setField(term209593, term209593.getClass(), "boldHeaderFont", null);
        setIntField(term209593, term209593.getClass(), "sortOrderNumber", 0);
        setField(term209593, term209593.getClass(), "sortOrder", null);
        setIntField(term209593, term209593.getClass(), "maxIconWidth", 0);
        setIntField(term209593, term209593.getClass(), "sortNumberTextWidth", 0);
        setIntField(term209593, term209593.getClass(), "mnemonic", 0);
        setIntField(term209593, term209593.getClass(), "mnemonicIndex", 0);
        setField(term209593, term209593.getClass(), "text", null);
        setField(term209593, term209593.getClass(), "defaultIcon", null);
        setField(term209593, term209593.getClass(), "disabledIcon", null);
        setBooleanField(term209593, term209593.getClass(), "disabledIconSet", false);
        setIntField(term209593, term209593.getClass(), "verticalAlignment", 0);
        setIntField(term209593, term209593.getClass(), "horizontalAlignment", 0);
        setIntField(term209593, term209593.getClass(), "verticalTextPosition", 0);
        setIntField(term209593, term209593.getClass(), "horizontalTextPosition", 0);
        setIntField(term209593, term209593.getClass(), "iconTextGap", 0);
        setField(term209593, term209593.getClass(), "labelFor", null);
        setBooleanField(term209593, term209593.getClass(), "isAlignmentXSet", false);
        setFloatField(term209593, term209593.getClass(), "alignmentX", 0.0F);
        setBooleanField(term209593, term209593.getClass(), "isAlignmentYSet", false);
        setFloatField(term209593, term209593.getClass(), "alignmentY", 0.0F);
        setField(term209593, term209593.getClass(), "ui", null);
        setField(term209593, term209593.getClass(), "listenerList", null);
        setField(term209593, term209593.getClass(), "clientProperties", null);
        setField(term209593, term209593.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term209593, term209593.getClass(), "autoscrolls", false);
        setField(term209593, term209593.getClass(), "border", null);
        setIntField(term209593, term209593.getClass(), "flags", 0);
        setField(term209593, term209593.getClass(), "inputVerifier", null);
        setBooleanField(term209593, term209593.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term209593, term209593.getClass(), "paintingChild", null);
        setField(term209593, term209593.getClass(), "popupMenu", null);
        setField(term209593, term209593.getClass(), "revalidateRunnableScheduled", null);
        setField(term209593, term209593.getClass(), "focusInputMap", null);
        setField(term209593, term209593.getClass(), "ancestorInputMap", null);
        setField(term209593, term209593.getClass(), "windowInputMap", null);
        setField(term209593, term209593.getClass(), "actionMap", null);
        setField(term209593, term209593.getClass(), "aaHint", null);
        setField(term209593, term209593.getClass(), "lcdRenderingHint", null);
        setField(term209593, term209593.getClass(), "component", null);
        setField(term209593, term209593.getClass(), "layoutMgr", null);
        setField(term209593, term209593.getClass(), "dispatcher", null);
        setField(term209593, term209593.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term209593, term209593.getClass(), "focusCycleRoot", false);
        setBooleanField(term209593, term209593.getClass(), "focusTraversalPolicyProvider", false);
        setField(term209593, term209593.getClass(), "printingThreads", null);
        setBooleanField(term209593, term209593.getClass(), "printing", false);
        setField(term209593, term209593.getClass(), "containerListener", null);
        setIntField(term209593, term209593.getClass(), "listeningChildren", 0);
        setIntField(term209593, term209593.getClass(), "listeningBoundsChildren", 0);
        setIntField(term209593, term209593.getClass(), "descendantsCount", 0);
        setField(term209593, term209593.getClass(), "preserveBackgroundColor", null);
        setIntField(term209593, term209593.getClass(), "numOfHWComponents", 0);
        setIntField(term209593, term209593.getClass(), "numOfLWComponents", 0);
        setField(term209593, term209593.getClass(), "modalComp", null);
        setField(term209593, term209593.getClass(), "modalAppContext", null);
        setIntField(term209593, term209593.getClass(), "containerSerializedDataVersion", 0);
        setField(term209593, term209593.getClass(), "peer", null);
        setField(term209593, term209593.getClass(), "parent", null);
        setField(term209593, term209593.getClass(), "appContext", null);
        setIntField(term209593, term209593.getClass(), "x", 0);
        setIntField(term209593, term209593.getClass(), "y", 0);
        setIntField(term209593, term209593.getClass(), "width", 0);
        setIntField(term209593, term209593.getClass(), "height", 0);
        setField(term209593, term209593.getClass(), "foreground", null);
        setField(term209593, term209593.getClass(), "background", null);
        setField(term209593, term209593.getClass(), "font", null);
        setField(term209593, term209593.getClass(), "peerFont", null);
        setField(term209593, term209593.getClass(), "cursor", null);
        setField(term209593, term209593.getClass(), "locale", null);
        setField(term209593, term209593.getClass(), "graphicsConfig", null);
        setField(term209593, term209593.getClass(), "bufferStrategy", null);
        setBooleanField(term209593, term209593.getClass(), "ignoreRepaint", false);
        setBooleanField(term209593, term209593.getClass(), "visible", false);
        setBooleanField(term209593, term209593.getClass(), "enabled", false);
        setBooleanField(term209593, term209593.getClass(), "valid", false);
        setField(term209593, term209593.getClass(), "dropTarget", null);
        setField(term209593, term209593.getClass(), "popups", null);
        setField(term209593, term209593.getClass(), "name", null);
        setBooleanField(term209593, term209593.getClass(), "nameExplicitlySet", false);
        setBooleanField(term209593, term209593.getClass(), "focusable", false);
        setIntField(term209593, term209593.getClass(), "isFocusTraversableOverridden", 0);
        setField(term209593, term209593.getClass(), "focusTraversalKeys", null);
        setBooleanField(term209593, term209593.getClass(), "focusTraversalKeysEnabled", false);
        setField(term209593, term209593.getClass(), "acc", null);
        setField(term209593, term209593.getClass(), "minSize", null);
        setBooleanField(term209593, term209593.getClass(), "minSizeSet", false);
        setField(term209593, term209593.getClass(), "prefSize", null);
        setBooleanField(term209593, term209593.getClass(), "prefSizeSet", false);
        setField(term209593, term209593.getClass(), "maxSize", null);
        setBooleanField(term209593, term209593.getClass(), "maxSizeSet", false);
        setField(term209593, term209593.getClass(), "componentOrientation", null);
        setBooleanField(term209593, term209593.getClass(), "newEventsOnly", false);
        setField(term209593, term209593.getClass(), "componentListener", null);
        setField(term209593, term209593.getClass(), "focusListener", null);
        setField(term209593, term209593.getClass(), "hierarchyListener", null);
        setField(term209593, term209593.getClass(), "hierarchyBoundsListener", null);
        setField(term209593, term209593.getClass(), "keyListener", null);
        setField(term209593, term209593.getClass(), "mouseListener", null);
        setField(term209593, term209593.getClass(), "mouseMotionListener", null);
        setField(term209593, term209593.getClass(), "mouseWheelListener", null);
        setField(term209593, term209593.getClass(), "inputMethodListener", null);
        setLongField(term209593, term209593.getClass(), "eventMask", 0L);
        setField(term209593, term209593.getClass(), "changeSupport", null);
        setField(term209593, term209593.getClass(), "objectLock", null);
        setBooleanField(term209593, term209593.getClass(), "isPacked", false);
        setIntField(term209593, term209593.getClass(), "boundsOp", 0);
        setField(term209593, term209593.getClass(), "compoundShape", null);
        setField(term209593, term209593.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term209593, term209593.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term209593, term209593.getClass(), "backgroundEraseDisabled", false);
        setField(term209593, term209593.getClass(), "eventCache", null);
        setBooleanField(term209593, term209593.getClass(), "coalescingEnabled", false);
        setBooleanField(term209593, term209593.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term209593, term209593.getClass(), "componentSerializedDataVersion", 0);
        setField(term209593, term209593.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortAscendingIcon", argTypes, term209593, args);
    }

};


