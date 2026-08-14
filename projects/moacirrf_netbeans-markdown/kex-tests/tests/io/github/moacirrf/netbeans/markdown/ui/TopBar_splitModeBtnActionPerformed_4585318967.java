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

public class TopBar_splitModeBtnActionPerformed_4585318967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7302;

    public TopBar_splitModeBtnActionPerformed_4585318967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7302 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term7302, term7302.getClass(), "splitPanel", null);
        setBooleanField(term7302, term7302.getClass(), "splitModeOn", false);
        setField(term7302, term7302.getClass(), "viewMode", null);
        setField(term7302, term7302.getClass(), "buttonGroupViewBtn", null);
        setField(term7302, term7302.getClass(), "scrollSync", null);
        setField(term7302, term7302.getClass(), "showPreviewBtn", null);
        setField(term7302, term7302.getClass(), "showSourceBtn", null);
        setField(term7302, term7302.getClass(), "splitModeBtn", null);
        setField(term7302, term7302.getClass(), "viewModeDefault", null);
        setBooleanField(term7302, term7302.getClass(), "isAlignmentXSet", false);
        setFloatField(term7302, term7302.getClass(), "alignmentX", 0.0F);
        setBooleanField(term7302, term7302.getClass(), "isAlignmentYSet", false);
        setFloatField(term7302, term7302.getClass(), "alignmentY", 0.0F);
        setField(term7302, term7302.getClass(), "ui", null);
        setField(term7302, term7302.getClass(), "listenerList", null);
        setField(term7302, term7302.getClass(), "clientProperties", null);
        setField(term7302, term7302.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term7302, term7302.getClass(), "autoscrolls", false);
        setField(term7302, term7302.getClass(), "border", null);
        setIntField(term7302, term7302.getClass(), "flags", 0);
        setField(term7302, term7302.getClass(), "inputVerifier", null);
        setBooleanField(term7302, term7302.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term7302, term7302.getClass(), "paintingChild", null);
        setField(term7302, term7302.getClass(), "popupMenu", null);
        setField(term7302, term7302.getClass(), "revalidateRunnableScheduled", null);
        setField(term7302, term7302.getClass(), "focusInputMap", null);
        setField(term7302, term7302.getClass(), "ancestorInputMap", null);
        setField(term7302, term7302.getClass(), "windowInputMap", null);
        setField(term7302, term7302.getClass(), "actionMap", null);
        setField(term7302, term7302.getClass(), "aaHint", null);
        setField(term7302, term7302.getClass(), "lcdRenderingHint", null);
        setField(term7302, term7302.getClass(), "component", null);
        setField(term7302, term7302.getClass(), "layoutMgr", null);
        setField(term7302, term7302.getClass(), "dispatcher", null);
        setField(term7302, term7302.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7302, term7302.getClass(), "focusCycleRoot", false);
        setBooleanField(term7302, term7302.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7302, term7302.getClass(), "printingThreads", null);
        setBooleanField(term7302, term7302.getClass(), "printing", false);
        setField(term7302, term7302.getClass(), "containerListener", null);
        setIntField(term7302, term7302.getClass(), "listeningChildren", 0);
        setIntField(term7302, term7302.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7302, term7302.getClass(), "descendantsCount", 0);
        setField(term7302, term7302.getClass(), "preserveBackgroundColor", null);
        setIntField(term7302, term7302.getClass(), "numOfHWComponents", 0);
        setIntField(term7302, term7302.getClass(), "numOfLWComponents", 0);
        setField(term7302, term7302.getClass(), "modalComp", null);
        setField(term7302, term7302.getClass(), "modalAppContext", null);
        setIntField(term7302, term7302.getClass(), "containerSerializedDataVersion", 0);
        setField(term7302, term7302.getClass(), "peer", null);
        setField(term7302, term7302.getClass(), "parent", null);
        setField(term7302, term7302.getClass(), "appContext", null);
        setIntField(term7302, term7302.getClass(), "x", 0);
        setIntField(term7302, term7302.getClass(), "y", 0);
        setIntField(term7302, term7302.getClass(), "width", 0);
        setIntField(term7302, term7302.getClass(), "height", 0);
        setField(term7302, term7302.getClass(), "foreground", null);
        setField(term7302, term7302.getClass(), "background", null);
        setField(term7302, term7302.getClass(), "font", null);
        setField(term7302, term7302.getClass(), "peerFont", null);
        setField(term7302, term7302.getClass(), "cursor", null);
        setField(term7302, term7302.getClass(), "locale", null);
        setField(term7302, term7302.getClass(), "graphicsConfig", null);
        setField(term7302, term7302.getClass(), "bufferStrategy", null);
        setBooleanField(term7302, term7302.getClass(), "ignoreRepaint", false);
        setBooleanField(term7302, term7302.getClass(), "visible", false);
        setBooleanField(term7302, term7302.getClass(), "enabled", false);
        setBooleanField(term7302, term7302.getClass(), "valid", false);
        setField(term7302, term7302.getClass(), "dropTarget", null);
        setField(term7302, term7302.getClass(), "popups", null);
        setField(term7302, term7302.getClass(), "name", null);
        setBooleanField(term7302, term7302.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7302, term7302.getClass(), "focusable", false);
        setIntField(term7302, term7302.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7302, term7302.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7302, term7302.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7302, term7302.getClass(), "acc", null);
        setField(term7302, term7302.getClass(), "minSize", null);
        setBooleanField(term7302, term7302.getClass(), "minSizeSet", false);
        setField(term7302, term7302.getClass(), "prefSize", null);
        setBooleanField(term7302, term7302.getClass(), "prefSizeSet", false);
        setField(term7302, term7302.getClass(), "maxSize", null);
        setBooleanField(term7302, term7302.getClass(), "maxSizeSet", false);
        setField(term7302, term7302.getClass(), "componentOrientation", null);
        setBooleanField(term7302, term7302.getClass(), "newEventsOnly", false);
        setField(term7302, term7302.getClass(), "componentListener", null);
        setField(term7302, term7302.getClass(), "focusListener", null);
        setField(term7302, term7302.getClass(), "hierarchyListener", null);
        setField(term7302, term7302.getClass(), "hierarchyBoundsListener", null);
        setField(term7302, term7302.getClass(), "keyListener", null);
        setField(term7302, term7302.getClass(), "mouseListener", null);
        setField(term7302, term7302.getClass(), "mouseMotionListener", null);
        setField(term7302, term7302.getClass(), "mouseWheelListener", null);
        setField(term7302, term7302.getClass(), "inputMethodListener", null);
        setLongField(term7302, term7302.getClass(), "eventMask", 0L);
        setField(term7302, term7302.getClass(), "changeSupport", null);
        setField(term7302, term7302.getClass(), "objectLock", null);
        setBooleanField(term7302, term7302.getClass(), "isPacked", false);
        setIntField(term7302, term7302.getClass(), "boundsOp", 0);
        setField(term7302, term7302.getClass(), "compoundShape", null);
        setField(term7302, term7302.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7302, term7302.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7302, term7302.getClass(), "backgroundEraseDisabled", false);
        setField(term7302, term7302.getClass(), "eventCache", null);
        setBooleanField(term7302, term7302.getClass(), "coalescingEnabled", false);
        setBooleanField(term7302, term7302.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7302, term7302.getClass(), "componentSerializedDataVersion", 0);
        setField(term7302, term7302.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "splitModeBtnActionPerformed", argTypes, term7302, args);
    }

};


