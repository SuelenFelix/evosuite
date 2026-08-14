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
     Object term369218;

    public TreeTableHeaderRenderer_updateCachedFonts_196343413040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369218 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer"));
        setField(term369218, term369218.getClass(), "sortIconBorder", null);
        setField(term369218, term369218.getClass(), "paintLabel", null);
        setBooleanField(term369218, term369218.getClass(), "boldOnSorted", false);
        setBooleanField(term369218, term369218.getClass(), "showNumber", false);
        setField(term369218, term369218.getClass(), "sortAscendingIcon", null);
        setField(term369218, term369218.getClass(), "sortDescendingIcon", null);
        setField(term369218, term369218.getClass(), "cachedHeaderFont", null);
        setField(term369218, term369218.getClass(), "boldHeaderFont", null);
        setIntField(term369218, term369218.getClass(), "sortOrderNumber", 0);
        setField(term369218, term369218.getClass(), "sortOrder", null);
        setIntField(term369218, term369218.getClass(), "maxIconWidth", 0);
        setIntField(term369218, term369218.getClass(), "sortNumberTextWidth", 0);
        setIntField(term369218, term369218.getClass(), "mnemonic", 0);
        setIntField(term369218, term369218.getClass(), "mnemonicIndex", 0);
        setField(term369218, term369218.getClass(), "text", null);
        setField(term369218, term369218.getClass(), "defaultIcon", null);
        setField(term369218, term369218.getClass(), "disabledIcon", null);
        setBooleanField(term369218, term369218.getClass(), "disabledIconSet", false);
        setIntField(term369218, term369218.getClass(), "verticalAlignment", 0);
        setIntField(term369218, term369218.getClass(), "horizontalAlignment", 0);
        setIntField(term369218, term369218.getClass(), "verticalTextPosition", 0);
        setIntField(term369218, term369218.getClass(), "horizontalTextPosition", 0);
        setIntField(term369218, term369218.getClass(), "iconTextGap", 0);
        setField(term369218, term369218.getClass(), "labelFor", null);
        setBooleanField(term369218, term369218.getClass(), "isAlignmentXSet", false);
        setFloatField(term369218, term369218.getClass(), "alignmentX", 0.0F);
        setBooleanField(term369218, term369218.getClass(), "isAlignmentYSet", false);
        setFloatField(term369218, term369218.getClass(), "alignmentY", 0.0F);
        setField(term369218, term369218.getClass(), "ui", null);
        setField(term369218, term369218.getClass(), "listenerList", null);
        setField(term369218, term369218.getClass(), "clientProperties", null);
        setField(term369218, term369218.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term369218, term369218.getClass(), "autoscrolls", false);
        setField(term369218, term369218.getClass(), "border", null);
        setIntField(term369218, term369218.getClass(), "flags", 0);
        setField(term369218, term369218.getClass(), "inputVerifier", null);
        setBooleanField(term369218, term369218.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term369218, term369218.getClass(), "paintingChild", null);
        setField(term369218, term369218.getClass(), "popupMenu", null);
        setField(term369218, term369218.getClass(), "revalidateRunnableScheduled", null);
        setField(term369218, term369218.getClass(), "focusInputMap", null);
        setField(term369218, term369218.getClass(), "ancestorInputMap", null);
        setField(term369218, term369218.getClass(), "windowInputMap", null);
        setField(term369218, term369218.getClass(), "actionMap", null);
        setField(term369218, term369218.getClass(), "aaHint", null);
        setField(term369218, term369218.getClass(), "lcdRenderingHint", null);
        setField(term369218, term369218.getClass(), "component", null);
        setField(term369218, term369218.getClass(), "layoutMgr", null);
        setField(term369218, term369218.getClass(), "dispatcher", null);
        setField(term369218, term369218.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term369218, term369218.getClass(), "focusCycleRoot", false);
        setBooleanField(term369218, term369218.getClass(), "focusTraversalPolicyProvider", false);
        setField(term369218, term369218.getClass(), "printingThreads", null);
        setBooleanField(term369218, term369218.getClass(), "printing", false);
        setField(term369218, term369218.getClass(), "containerListener", null);
        setIntField(term369218, term369218.getClass(), "listeningChildren", 0);
        setIntField(term369218, term369218.getClass(), "listeningBoundsChildren", 0);
        setIntField(term369218, term369218.getClass(), "descendantsCount", 0);
        setField(term369218, term369218.getClass(), "preserveBackgroundColor", null);
        setIntField(term369218, term369218.getClass(), "numOfHWComponents", 0);
        setIntField(term369218, term369218.getClass(), "numOfLWComponents", 0);
        setField(term369218, term369218.getClass(), "modalComp", null);
        setField(term369218, term369218.getClass(), "modalAppContext", null);
        setIntField(term369218, term369218.getClass(), "containerSerializedDataVersion", 0);
        setField(term369218, term369218.getClass(), "peer", null);
        setField(term369218, term369218.getClass(), "parent", null);
        setField(term369218, term369218.getClass(), "appContext", null);
        setIntField(term369218, term369218.getClass(), "x", 0);
        setIntField(term369218, term369218.getClass(), "y", 0);
        setIntField(term369218, term369218.getClass(), "width", 0);
        setIntField(term369218, term369218.getClass(), "height", 0);
        setField(term369218, term369218.getClass(), "foreground", null);
        setField(term369218, term369218.getClass(), "background", null);
        setField(term369218, term369218.getClass(), "font", null);
        setField(term369218, term369218.getClass(), "peerFont", null);
        setField(term369218, term369218.getClass(), "cursor", null);
        setField(term369218, term369218.getClass(), "locale", null);
        setField(term369218, term369218.getClass(), "graphicsConfig", null);
        setField(term369218, term369218.getClass(), "bufferStrategy", null);
        setBooleanField(term369218, term369218.getClass(), "ignoreRepaint", false);
        setBooleanField(term369218, term369218.getClass(), "visible", false);
        setBooleanField(term369218, term369218.getClass(), "enabled", false);
        setBooleanField(term369218, term369218.getClass(), "valid", false);
        setField(term369218, term369218.getClass(), "dropTarget", null);
        setField(term369218, term369218.getClass(), "popups", null);
        setField(term369218, term369218.getClass(), "name", null);
        setBooleanField(term369218, term369218.getClass(), "nameExplicitlySet", false);
        setBooleanField(term369218, term369218.getClass(), "focusable", false);
        setIntField(term369218, term369218.getClass(), "isFocusTraversableOverridden", 0);
        setField(term369218, term369218.getClass(), "focusTraversalKeys", null);
        setBooleanField(term369218, term369218.getClass(), "focusTraversalKeysEnabled", false);
        setField(term369218, term369218.getClass(), "acc", null);
        setField(term369218, term369218.getClass(), "minSize", null);
        setBooleanField(term369218, term369218.getClass(), "minSizeSet", false);
        setField(term369218, term369218.getClass(), "prefSize", null);
        setBooleanField(term369218, term369218.getClass(), "prefSizeSet", false);
        setField(term369218, term369218.getClass(), "maxSize", null);
        setBooleanField(term369218, term369218.getClass(), "maxSizeSet", false);
        setField(term369218, term369218.getClass(), "componentOrientation", null);
        setBooleanField(term369218, term369218.getClass(), "newEventsOnly", false);
        setField(term369218, term369218.getClass(), "componentListener", null);
        setField(term369218, term369218.getClass(), "focusListener", null);
        setField(term369218, term369218.getClass(), "hierarchyListener", null);
        setField(term369218, term369218.getClass(), "hierarchyBoundsListener", null);
        setField(term369218, term369218.getClass(), "keyListener", null);
        setField(term369218, term369218.getClass(), "mouseListener", null);
        setField(term369218, term369218.getClass(), "mouseMotionListener", null);
        setField(term369218, term369218.getClass(), "mouseWheelListener", null);
        setField(term369218, term369218.getClass(), "inputMethodListener", null);
        setLongField(term369218, term369218.getClass(), "eventMask", 0L);
        setField(term369218, term369218.getClass(), "changeSupport", null);
        setField(term369218, term369218.getClass(), "objectLock", null);
        setBooleanField(term369218, term369218.getClass(), "isPacked", false);
        setIntField(term369218, term369218.getClass(), "boundsOp", 0);
        setField(term369218, term369218.getClass(), "compoundShape", null);
        setField(term369218, term369218.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term369218, term369218.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term369218, term369218.getClass(), "backgroundEraseDisabled", false);
        setField(term369218, term369218.getClass(), "eventCache", null);
        setBooleanField(term369218, term369218.getClass(), "coalescingEnabled", false);
        setBooleanField(term369218, term369218.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term369218, term369218.getClass(), "componentSerializedDataVersion", 0);
        setField(term369218, term369218.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updateCachedFonts", argTypes, term369218, args);
    }

};


