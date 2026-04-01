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

public class TreeTableHeaderRenderer_updateCachedFonts_196343413040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369325;

    public TreeTableHeaderRenderer_updateCachedFonts_196343413040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369325 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term369325, term369325.getClass(), "sortIconBorder", null);
        setField(term369325, term369325.getClass(), "paintLabel", null);
        setBooleanField(term369325, term369325.getClass(), "boldOnSorted", false);
        setBooleanField(term369325, term369325.getClass(), "showNumber", false);
        setField(term369325, term369325.getClass(), "sortAscendingIcon", null);
        setField(term369325, term369325.getClass(), "sortDescendingIcon", null);
        setField(term369325, term369325.getClass(), "cachedHeaderFont", null);
        setField(term369325, term369325.getClass(), "boldHeaderFont", null);
        setIntField(term369325, term369325.getClass(), "sortOrderNumber", 0);
        setField(term369325, term369325.getClass(), "sortOrder", null);
        setIntField(term369325, term369325.getClass(), "maxIconWidth", 0);
        setIntField(term369325, term369325.getClass(), "sortNumberTextWidth", 0);
        setIntField(term369325, term369325.getClass(), "mnemonic", 0);
        setIntField(term369325, term369325.getClass(), "mnemonicIndex", 0);
        setField(term369325, term369325.getClass(), "text", null);
        setField(term369325, term369325.getClass(), "defaultIcon", null);
        setField(term369325, term369325.getClass(), "disabledIcon", null);
        setBooleanField(term369325, term369325.getClass(), "disabledIconSet", false);
        setIntField(term369325, term369325.getClass(), "verticalAlignment", 0);
        setIntField(term369325, term369325.getClass(), "horizontalAlignment", 0);
        setIntField(term369325, term369325.getClass(), "verticalTextPosition", 0);
        setIntField(term369325, term369325.getClass(), "horizontalTextPosition", 0);
        setIntField(term369325, term369325.getClass(), "iconTextGap", 0);
        setField(term369325, term369325.getClass(), "labelFor", null);
        setBooleanField(term369325, term369325.getClass(), "isAlignmentXSet", false);
        setFloatField(term369325, term369325.getClass(), "alignmentX", 0.0F);
        setBooleanField(term369325, term369325.getClass(), "isAlignmentYSet", false);
        setFloatField(term369325, term369325.getClass(), "alignmentY", 0.0F);
        setField(term369325, term369325.getClass(), "ui", null);
        setField(term369325, term369325.getClass(), "listenerList", null);
        setField(term369325, term369325.getClass(), "clientProperties", null);
        setField(term369325, term369325.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term369325, term369325.getClass(), "autoscrolls", false);
        setField(term369325, term369325.getClass(), "border", null);
        setIntField(term369325, term369325.getClass(), "flags", 0);
        setField(term369325, term369325.getClass(), "inputVerifier", null);
        setBooleanField(term369325, term369325.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term369325, term369325.getClass(), "paintingChild", null);
        setField(term369325, term369325.getClass(), "popupMenu", null);
        setField(term369325, term369325.getClass(), "revalidateRunnableScheduled", null);
        setField(term369325, term369325.getClass(), "focusInputMap", null);
        setField(term369325, term369325.getClass(), "ancestorInputMap", null);
        setField(term369325, term369325.getClass(), "windowInputMap", null);
        setField(term369325, term369325.getClass(), "actionMap", null);
        setField(term369325, term369325.getClass(), "aaHint", null);
        setField(term369325, term369325.getClass(), "lcdRenderingHint", null);
        setField(term369325, term369325.getClass(), "component", null);
        setField(term369325, term369325.getClass(), "layoutMgr", null);
        setField(term369325, term369325.getClass(), "dispatcher", null);
        setField(term369325, term369325.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term369325, term369325.getClass(), "focusCycleRoot", false);
        setBooleanField(term369325, term369325.getClass(), "focusTraversalPolicyProvider", false);
        setField(term369325, term369325.getClass(), "printingThreads", null);
        setBooleanField(term369325, term369325.getClass(), "printing", false);
        setField(term369325, term369325.getClass(), "containerListener", null);
        setIntField(term369325, term369325.getClass(), "listeningChildren", 0);
        setIntField(term369325, term369325.getClass(), "listeningBoundsChildren", 0);
        setIntField(term369325, term369325.getClass(), "descendantsCount", 0);
        setField(term369325, term369325.getClass(), "preserveBackgroundColor", null);
        setIntField(term369325, term369325.getClass(), "numOfHWComponents", 0);
        setIntField(term369325, term369325.getClass(), "numOfLWComponents", 0);
        setField(term369325, term369325.getClass(), "modalComp", null);
        setField(term369325, term369325.getClass(), "modalAppContext", null);
        setIntField(term369325, term369325.getClass(), "containerSerializedDataVersion", 0);
        setField(term369325, term369325.getClass(), "peer", null);
        setField(term369325, term369325.getClass(), "parent", null);
        setField(term369325, term369325.getClass(), "appContext", null);
        setIntField(term369325, term369325.getClass(), "x", 0);
        setIntField(term369325, term369325.getClass(), "y", 0);
        setIntField(term369325, term369325.getClass(), "width", 0);
        setIntField(term369325, term369325.getClass(), "height", 0);
        setField(term369325, term369325.getClass(), "foreground", null);
        setField(term369325, term369325.getClass(), "background", null);
        setField(term369325, term369325.getClass(), "font", null);
        setField(term369325, term369325.getClass(), "peerFont", null);
        setField(term369325, term369325.getClass(), "cursor", null);
        setField(term369325, term369325.getClass(), "locale", null);
        setField(term369325, term369325.getClass(), "graphicsConfig", null);
        setField(term369325, term369325.getClass(), "bufferStrategy", null);
        setBooleanField(term369325, term369325.getClass(), "ignoreRepaint", false);
        setBooleanField(term369325, term369325.getClass(), "visible", false);
        setBooleanField(term369325, term369325.getClass(), "enabled", false);
        setBooleanField(term369325, term369325.getClass(), "valid", false);
        setField(term369325, term369325.getClass(), "dropTarget", null);
        setField(term369325, term369325.getClass(), "popups", null);
        setField(term369325, term369325.getClass(), "name", null);
        setBooleanField(term369325, term369325.getClass(), "nameExplicitlySet", false);
        setBooleanField(term369325, term369325.getClass(), "focusable", false);
        setIntField(term369325, term369325.getClass(), "isFocusTraversableOverridden", 0);
        setField(term369325, term369325.getClass(), "focusTraversalKeys", null);
        setBooleanField(term369325, term369325.getClass(), "focusTraversalKeysEnabled", false);
        setField(term369325, term369325.getClass(), "acc", null);
        setField(term369325, term369325.getClass(), "minSize", null);
        setBooleanField(term369325, term369325.getClass(), "minSizeSet", false);
        setField(term369325, term369325.getClass(), "prefSize", null);
        setBooleanField(term369325, term369325.getClass(), "prefSizeSet", false);
        setField(term369325, term369325.getClass(), "maxSize", null);
        setBooleanField(term369325, term369325.getClass(), "maxSizeSet", false);
        setField(term369325, term369325.getClass(), "componentOrientation", null);
        setBooleanField(term369325, term369325.getClass(), "newEventsOnly", false);
        setField(term369325, term369325.getClass(), "componentListener", null);
        setField(term369325, term369325.getClass(), "focusListener", null);
        setField(term369325, term369325.getClass(), "hierarchyListener", null);
        setField(term369325, term369325.getClass(), "hierarchyBoundsListener", null);
        setField(term369325, term369325.getClass(), "keyListener", null);
        setField(term369325, term369325.getClass(), "mouseListener", null);
        setField(term369325, term369325.getClass(), "mouseMotionListener", null);
        setField(term369325, term369325.getClass(), "mouseWheelListener", null);
        setField(term369325, term369325.getClass(), "inputMethodListener", null);
        setLongField(term369325, term369325.getClass(), "eventMask", 0L);
        setField(term369325, term369325.getClass(), "changeSupport", null);
        setField(term369325, term369325.getClass(), "objectLock", null);
        setBooleanField(term369325, term369325.getClass(), "isPacked", false);
        setIntField(term369325, term369325.getClass(), "boundsOp", 0);
        setField(term369325, term369325.getClass(), "compoundShape", null);
        setField(term369325, term369325.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term369325, term369325.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term369325, term369325.getClass(), "backgroundEraseDisabled", false);
        setField(term369325, term369325.getClass(), "eventCache", null);
        setBooleanField(term369325, term369325.getClass(), "coalescingEnabled", false);
        setBooleanField(term369325, term369325.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term369325, term369325.getClass(), "componentSerializedDataVersion", 0);
        setField(term369325, term369325.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateCachedFonts", argTypes, term369325, args);
    }

};


