package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TopBar_paintComponent_120887426023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23007;

    public TopBar_paintComponent_120887426023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23007 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term23007, term23007.getClass(), "splitPanel", null);
        setBooleanField(term23007, term23007.getClass(), "splitModeOn", false);
        setField(term23007, term23007.getClass(), "viewMode", null);
        setField(term23007, term23007.getClass(), "buttonGroupViewBtn", null);
        setField(term23007, term23007.getClass(), "scrollSync", null);
        setField(term23007, term23007.getClass(), "showPreviewBtn", null);
        setField(term23007, term23007.getClass(), "showSourceBtn", null);
        setField(term23007, term23007.getClass(), "splitModeBtn", null);
        setField(term23007, term23007.getClass(), "viewModeDefault", null);
        setBooleanField(term23007, term23007.getClass(), "isAlignmentXSet", false);
        setFloatField(term23007, term23007.getClass(), "alignmentX", 0.0F);
        setBooleanField(term23007, term23007.getClass(), "isAlignmentYSet", false);
        setFloatField(term23007, term23007.getClass(), "alignmentY", 0.0F);
        setField(term23007, term23007.getClass(), "ui", null);
        setField(term23007, term23007.getClass(), "listenerList", null);
        setField(term23007, term23007.getClass(), "clientProperties", null);
        setField(term23007, term23007.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term23007, term23007.getClass(), "autoscrolls", false);
        setField(term23007, term23007.getClass(), "border", null);
        setIntField(term23007, term23007.getClass(), "flags", 0);
        setField(term23007, term23007.getClass(), "inputVerifier", null);
        setBooleanField(term23007, term23007.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term23007, term23007.getClass(), "paintingChild", null);
        setField(term23007, term23007.getClass(), "popupMenu", null);
        setField(term23007, term23007.getClass(), "revalidateRunnableScheduled", null);
        setField(term23007, term23007.getClass(), "focusInputMap", null);
        setField(term23007, term23007.getClass(), "ancestorInputMap", null);
        setField(term23007, term23007.getClass(), "windowInputMap", null);
        setField(term23007, term23007.getClass(), "actionMap", null);
        setField(term23007, term23007.getClass(), "aaHint", null);
        setField(term23007, term23007.getClass(), "lcdRenderingHint", null);
        setField(term23007, term23007.getClass(), "component", null);
        setField(term23007, term23007.getClass(), "layoutMgr", null);
        setField(term23007, term23007.getClass(), "dispatcher", null);
        setField(term23007, term23007.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term23007, term23007.getClass(), "focusCycleRoot", false);
        setBooleanField(term23007, term23007.getClass(), "focusTraversalPolicyProvider", false);
        setField(term23007, term23007.getClass(), "printingThreads", null);
        setBooleanField(term23007, term23007.getClass(), "printing", false);
        setField(term23007, term23007.getClass(), "containerListener", null);
        setIntField(term23007, term23007.getClass(), "listeningChildren", 0);
        setIntField(term23007, term23007.getClass(), "listeningBoundsChildren", 0);
        setIntField(term23007, term23007.getClass(), "descendantsCount", 0);
        setField(term23007, term23007.getClass(), "preserveBackgroundColor", null);
        setIntField(term23007, term23007.getClass(), "numOfHWComponents", 0);
        setIntField(term23007, term23007.getClass(), "numOfLWComponents", 0);
        setField(term23007, term23007.getClass(), "modalComp", null);
        setField(term23007, term23007.getClass(), "modalAppContext", null);
        setIntField(term23007, term23007.getClass(), "containerSerializedDataVersion", 0);
        setField(term23007, term23007.getClass(), "peer", null);
        setField(term23007, term23007.getClass(), "parent", null);
        setField(term23007, term23007.getClass(), "appContext", null);
        setIntField(term23007, term23007.getClass(), "x", 0);
        setIntField(term23007, term23007.getClass(), "y", 0);
        setIntField(term23007, term23007.getClass(), "width", 0);
        setIntField(term23007, term23007.getClass(), "height", 0);
        setField(term23007, term23007.getClass(), "foreground", null);
        setField(term23007, term23007.getClass(), "background", null);
        setField(term23007, term23007.getClass(), "font", null);
        setField(term23007, term23007.getClass(), "peerFont", null);
        setField(term23007, term23007.getClass(), "cursor", null);
        setField(term23007, term23007.getClass(), "locale", null);
        setField(term23007, term23007.getClass(), "graphicsConfig", null);
        setField(term23007, term23007.getClass(), "bufferStrategy", null);
        setBooleanField(term23007, term23007.getClass(), "ignoreRepaint", false);
        setBooleanField(term23007, term23007.getClass(), "visible", false);
        setBooleanField(term23007, term23007.getClass(), "enabled", false);
        setBooleanField(term23007, term23007.getClass(), "valid", false);
        setField(term23007, term23007.getClass(), "dropTarget", null);
        setField(term23007, term23007.getClass(), "popups", null);
        setField(term23007, term23007.getClass(), "name", null);
        setBooleanField(term23007, term23007.getClass(), "nameExplicitlySet", false);
        setBooleanField(term23007, term23007.getClass(), "focusable", false);
        setIntField(term23007, term23007.getClass(), "isFocusTraversableOverridden", 0);
        setField(term23007, term23007.getClass(), "focusTraversalKeys", null);
        setBooleanField(term23007, term23007.getClass(), "focusTraversalKeysEnabled", false);
        setField(term23007, term23007.getClass(), "acc", null);
        setField(term23007, term23007.getClass(), "minSize", null);
        setBooleanField(term23007, term23007.getClass(), "minSizeSet", false);
        setField(term23007, term23007.getClass(), "prefSize", null);
        setBooleanField(term23007, term23007.getClass(), "prefSizeSet", false);
        setField(term23007, term23007.getClass(), "maxSize", null);
        setBooleanField(term23007, term23007.getClass(), "maxSizeSet", false);
        setField(term23007, term23007.getClass(), "componentOrientation", null);
        setBooleanField(term23007, term23007.getClass(), "newEventsOnly", false);
        setField(term23007, term23007.getClass(), "componentListener", null);
        setField(term23007, term23007.getClass(), "focusListener", null);
        setField(term23007, term23007.getClass(), "hierarchyListener", null);
        setField(term23007, term23007.getClass(), "hierarchyBoundsListener", null);
        setField(term23007, term23007.getClass(), "keyListener", null);
        setField(term23007, term23007.getClass(), "mouseListener", null);
        setField(term23007, term23007.getClass(), "mouseMotionListener", null);
        setField(term23007, term23007.getClass(), "mouseWheelListener", null);
        setField(term23007, term23007.getClass(), "inputMethodListener", null);
        setLongField(term23007, term23007.getClass(), "eventMask", 0L);
        setField(term23007, term23007.getClass(), "changeSupport", null);
        setField(term23007, term23007.getClass(), "objectLock", null);
        setBooleanField(term23007, term23007.getClass(), "isPacked", false);
        setIntField(term23007, term23007.getClass(), "boundsOp", 0);
        setField(term23007, term23007.getClass(), "compoundShape", null);
        setField(term23007, term23007.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term23007, term23007.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term23007, term23007.getClass(), "backgroundEraseDisabled", false);
        setField(term23007, term23007.getClass(), "eventCache", null);
        setBooleanField(term23007, term23007.getClass(), "coalescingEnabled", false);
        setBooleanField(term23007, term23007.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term23007, term23007.getClass(), "componentSerializedDataVersion", 0);
        setField(term23007, term23007.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term23007, args);
    }

};


