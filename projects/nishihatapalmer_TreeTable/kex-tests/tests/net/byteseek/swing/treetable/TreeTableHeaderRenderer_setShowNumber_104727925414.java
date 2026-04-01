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
import java.lang.Boolean;

public class TreeTableHeaderRenderer_setShowNumber_104727925414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197181;
     Object term197235;

    public TreeTableHeaderRenderer_setShowNumber_104727925414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197181 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term197181, term197181.getClass(), "sortIconBorder", null);
        setField(term197181, term197181.getClass(), "paintLabel", null);
        setBooleanField(term197181, term197181.getClass(), "boldOnSorted", false);
        setBooleanField(term197181, term197181.getClass(), "showNumber", false);
        setField(term197181, term197181.getClass(), "sortAscendingIcon", null);
        setField(term197181, term197181.getClass(), "sortDescendingIcon", null);
        setField(term197181, term197181.getClass(), "cachedHeaderFont", null);
        setField(term197181, term197181.getClass(), "boldHeaderFont", null);
        setIntField(term197181, term197181.getClass(), "sortOrderNumber", 0);
        setField(term197181, term197181.getClass(), "sortOrder", null);
        setIntField(term197181, term197181.getClass(), "maxIconWidth", 0);
        setIntField(term197181, term197181.getClass(), "sortNumberTextWidth", 0);
        setIntField(term197181, term197181.getClass(), "mnemonic", 0);
        setIntField(term197181, term197181.getClass(), "mnemonicIndex", 0);
        setField(term197181, term197181.getClass(), "text", null);
        setField(term197181, term197181.getClass(), "defaultIcon", null);
        setField(term197181, term197181.getClass(), "disabledIcon", null);
        setBooleanField(term197181, term197181.getClass(), "disabledIconSet", false);
        setIntField(term197181, term197181.getClass(), "verticalAlignment", 0);
        setIntField(term197181, term197181.getClass(), "horizontalAlignment", 0);
        setIntField(term197181, term197181.getClass(), "verticalTextPosition", 0);
        setIntField(term197181, term197181.getClass(), "horizontalTextPosition", 0);
        setIntField(term197181, term197181.getClass(), "iconTextGap", 0);
        setField(term197181, term197181.getClass(), "labelFor", null);
        setBooleanField(term197181, term197181.getClass(), "isAlignmentXSet", false);
        setFloatField(term197181, term197181.getClass(), "alignmentX", 0.0F);
        setBooleanField(term197181, term197181.getClass(), "isAlignmentYSet", false);
        setFloatField(term197181, term197181.getClass(), "alignmentY", 0.0F);
        setField(term197181, term197181.getClass(), "ui", null);
        setField(term197181, term197181.getClass(), "listenerList", null);
        setField(term197181, term197181.getClass(), "clientProperties", null);
        setField(term197181, term197181.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term197181, term197181.getClass(), "autoscrolls", false);
        setField(term197181, term197181.getClass(), "border", null);
        setIntField(term197181, term197181.getClass(), "flags", 0);
        setField(term197181, term197181.getClass(), "inputVerifier", null);
        setBooleanField(term197181, term197181.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term197181, term197181.getClass(), "paintingChild", null);
        setField(term197181, term197181.getClass(), "popupMenu", null);
        setField(term197181, term197181.getClass(), "revalidateRunnableScheduled", null);
        setField(term197181, term197181.getClass(), "focusInputMap", null);
        setField(term197181, term197181.getClass(), "ancestorInputMap", null);
        setField(term197181, term197181.getClass(), "windowInputMap", null);
        setField(term197181, term197181.getClass(), "actionMap", null);
        setField(term197181, term197181.getClass(), "aaHint", null);
        setField(term197181, term197181.getClass(), "lcdRenderingHint", null);
        setField(term197181, term197181.getClass(), "component", null);
        setField(term197181, term197181.getClass(), "layoutMgr", null);
        setField(term197181, term197181.getClass(), "dispatcher", null);
        setField(term197181, term197181.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term197181, term197181.getClass(), "focusCycleRoot", false);
        setBooleanField(term197181, term197181.getClass(), "focusTraversalPolicyProvider", false);
        setField(term197181, term197181.getClass(), "printingThreads", null);
        setBooleanField(term197181, term197181.getClass(), "printing", false);
        setField(term197181, term197181.getClass(), "containerListener", null);
        setIntField(term197181, term197181.getClass(), "listeningChildren", 0);
        setIntField(term197181, term197181.getClass(), "listeningBoundsChildren", 0);
        setIntField(term197181, term197181.getClass(), "descendantsCount", 0);
        setField(term197181, term197181.getClass(), "preserveBackgroundColor", null);
        setIntField(term197181, term197181.getClass(), "numOfHWComponents", 0);
        setIntField(term197181, term197181.getClass(), "numOfLWComponents", 0);
        setField(term197181, term197181.getClass(), "modalComp", null);
        setField(term197181, term197181.getClass(), "modalAppContext", null);
        setIntField(term197181, term197181.getClass(), "containerSerializedDataVersion", 0);
        setField(term197181, term197181.getClass(), "peer", null);
        setField(term197181, term197181.getClass(), "parent", null);
        setField(term197181, term197181.getClass(), "appContext", null);
        setIntField(term197181, term197181.getClass(), "x", 0);
        setIntField(term197181, term197181.getClass(), "y", 0);
        setIntField(term197181, term197181.getClass(), "width", 0);
        setIntField(term197181, term197181.getClass(), "height", 0);
        setField(term197181, term197181.getClass(), "foreground", null);
        setField(term197181, term197181.getClass(), "background", null);
        setField(term197181, term197181.getClass(), "font", null);
        setField(term197181, term197181.getClass(), "peerFont", null);
        setField(term197181, term197181.getClass(), "cursor", null);
        setField(term197181, term197181.getClass(), "locale", null);
        setField(term197181, term197181.getClass(), "graphicsConfig", null);
        setField(term197181, term197181.getClass(), "bufferStrategy", null);
        setBooleanField(term197181, term197181.getClass(), "ignoreRepaint", false);
        setBooleanField(term197181, term197181.getClass(), "visible", false);
        setBooleanField(term197181, term197181.getClass(), "enabled", false);
        setBooleanField(term197181, term197181.getClass(), "valid", false);
        setField(term197181, term197181.getClass(), "dropTarget", null);
        setField(term197181, term197181.getClass(), "popups", null);
        setField(term197181, term197181.getClass(), "name", null);
        setBooleanField(term197181, term197181.getClass(), "nameExplicitlySet", false);
        setBooleanField(term197181, term197181.getClass(), "focusable", false);
        setIntField(term197181, term197181.getClass(), "isFocusTraversableOverridden", 0);
        setField(term197181, term197181.getClass(), "focusTraversalKeys", null);
        setBooleanField(term197181, term197181.getClass(), "focusTraversalKeysEnabled", false);
        setField(term197181, term197181.getClass(), "acc", null);
        setField(term197181, term197181.getClass(), "minSize", null);
        setBooleanField(term197181, term197181.getClass(), "minSizeSet", false);
        setField(term197181, term197181.getClass(), "prefSize", null);
        setBooleanField(term197181, term197181.getClass(), "prefSizeSet", false);
        setField(term197181, term197181.getClass(), "maxSize", null);
        setBooleanField(term197181, term197181.getClass(), "maxSizeSet", false);
        setField(term197181, term197181.getClass(), "componentOrientation", null);
        setBooleanField(term197181, term197181.getClass(), "newEventsOnly", false);
        setField(term197181, term197181.getClass(), "componentListener", null);
        setField(term197181, term197181.getClass(), "focusListener", null);
        setField(term197181, term197181.getClass(), "hierarchyListener", null);
        setField(term197181, term197181.getClass(), "hierarchyBoundsListener", null);
        setField(term197181, term197181.getClass(), "keyListener", null);
        setField(term197181, term197181.getClass(), "mouseListener", null);
        setField(term197181, term197181.getClass(), "mouseMotionListener", null);
        setField(term197181, term197181.getClass(), "mouseWheelListener", null);
        setField(term197181, term197181.getClass(), "inputMethodListener", null);
        setLongField(term197181, term197181.getClass(), "eventMask", 0L);
        setField(term197181, term197181.getClass(), "changeSupport", null);
        setField(term197181, term197181.getClass(), "objectLock", null);
        setBooleanField(term197181, term197181.getClass(), "isPacked", false);
        setIntField(term197181, term197181.getClass(), "boundsOp", 0);
        setField(term197181, term197181.getClass(), "compoundShape", null);
        setField(term197181, term197181.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term197181, term197181.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term197181, term197181.getClass(), "backgroundEraseDisabled", false);
        setField(term197181, term197181.getClass(), "eventCache", null);
        setBooleanField(term197181, term197181.getClass(), "coalescingEnabled", false);
        setBooleanField(term197181, term197181.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term197181, term197181.getClass(), "componentSerializedDataVersion", 0);
        setField(term197181, term197181.getClass(), "accessibleContext", null);
        term197235 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term197235;
        callMethod(klass, "setShowNumber", argTypes, term197181, args);
    }

};


