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

public class TopBar_scrollSyncActionPerformed_42437671911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11298;

    public TopBar_scrollSyncActionPerformed_42437671911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11298 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term11298, term11298.getClass(), "splitPanel", null);
        setBooleanField(term11298, term11298.getClass(), "splitModeOn", false);
        setField(term11298, term11298.getClass(), "viewMode", null);
        setField(term11298, term11298.getClass(), "buttonGroupViewBtn", null);
        setField(term11298, term11298.getClass(), "scrollSync", null);
        setField(term11298, term11298.getClass(), "showPreviewBtn", null);
        setField(term11298, term11298.getClass(), "showSourceBtn", null);
        setField(term11298, term11298.getClass(), "splitModeBtn", null);
        setField(term11298, term11298.getClass(), "viewModeDefault", null);
        setBooleanField(term11298, term11298.getClass(), "isAlignmentXSet", false);
        setFloatField(term11298, term11298.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11298, term11298.getClass(), "isAlignmentYSet", false);
        setFloatField(term11298, term11298.getClass(), "alignmentY", 0.0F);
        setField(term11298, term11298.getClass(), "ui", null);
        setField(term11298, term11298.getClass(), "listenerList", null);
        setField(term11298, term11298.getClass(), "clientProperties", null);
        setField(term11298, term11298.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11298, term11298.getClass(), "autoscrolls", false);
        setField(term11298, term11298.getClass(), "border", null);
        setIntField(term11298, term11298.getClass(), "flags", 0);
        setField(term11298, term11298.getClass(), "inputVerifier", null);
        setBooleanField(term11298, term11298.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11298, term11298.getClass(), "paintingChild", null);
        setField(term11298, term11298.getClass(), "popupMenu", null);
        setField(term11298, term11298.getClass(), "revalidateRunnableScheduled", null);
        setField(term11298, term11298.getClass(), "focusInputMap", null);
        setField(term11298, term11298.getClass(), "ancestorInputMap", null);
        setField(term11298, term11298.getClass(), "windowInputMap", null);
        setField(term11298, term11298.getClass(), "actionMap", null);
        setField(term11298, term11298.getClass(), "aaHint", null);
        setField(term11298, term11298.getClass(), "lcdRenderingHint", null);
        setField(term11298, term11298.getClass(), "component", null);
        setField(term11298, term11298.getClass(), "layoutMgr", null);
        setField(term11298, term11298.getClass(), "dispatcher", null);
        setField(term11298, term11298.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11298, term11298.getClass(), "focusCycleRoot", false);
        setBooleanField(term11298, term11298.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11298, term11298.getClass(), "printingThreads", null);
        setBooleanField(term11298, term11298.getClass(), "printing", false);
        setField(term11298, term11298.getClass(), "containerListener", null);
        setIntField(term11298, term11298.getClass(), "listeningChildren", 0);
        setIntField(term11298, term11298.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11298, term11298.getClass(), "descendantsCount", 0);
        setField(term11298, term11298.getClass(), "preserveBackgroundColor", null);
        setIntField(term11298, term11298.getClass(), "numOfHWComponents", 0);
        setIntField(term11298, term11298.getClass(), "numOfLWComponents", 0);
        setField(term11298, term11298.getClass(), "modalComp", null);
        setField(term11298, term11298.getClass(), "modalAppContext", null);
        setIntField(term11298, term11298.getClass(), "containerSerializedDataVersion", 0);
        setField(term11298, term11298.getClass(), "peer", null);
        setField(term11298, term11298.getClass(), "parent", null);
        setField(term11298, term11298.getClass(), "appContext", null);
        setIntField(term11298, term11298.getClass(), "x", 0);
        setIntField(term11298, term11298.getClass(), "y", 0);
        setIntField(term11298, term11298.getClass(), "width", 0);
        setIntField(term11298, term11298.getClass(), "height", 0);
        setField(term11298, term11298.getClass(), "foreground", null);
        setField(term11298, term11298.getClass(), "background", null);
        setField(term11298, term11298.getClass(), "font", null);
        setField(term11298, term11298.getClass(), "peerFont", null);
        setField(term11298, term11298.getClass(), "cursor", null);
        setField(term11298, term11298.getClass(), "locale", null);
        setField(term11298, term11298.getClass(), "graphicsConfig", null);
        setField(term11298, term11298.getClass(), "bufferStrategy", null);
        setBooleanField(term11298, term11298.getClass(), "ignoreRepaint", false);
        setBooleanField(term11298, term11298.getClass(), "visible", false);
        setBooleanField(term11298, term11298.getClass(), "enabled", false);
        setBooleanField(term11298, term11298.getClass(), "valid", false);
        setField(term11298, term11298.getClass(), "dropTarget", null);
        setField(term11298, term11298.getClass(), "popups", null);
        setField(term11298, term11298.getClass(), "name", null);
        setBooleanField(term11298, term11298.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11298, term11298.getClass(), "focusable", false);
        setIntField(term11298, term11298.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11298, term11298.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11298, term11298.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11298, term11298.getClass(), "acc", null);
        setField(term11298, term11298.getClass(), "minSize", null);
        setBooleanField(term11298, term11298.getClass(), "minSizeSet", false);
        setField(term11298, term11298.getClass(), "prefSize", null);
        setBooleanField(term11298, term11298.getClass(), "prefSizeSet", false);
        setField(term11298, term11298.getClass(), "maxSize", null);
        setBooleanField(term11298, term11298.getClass(), "maxSizeSet", false);
        setField(term11298, term11298.getClass(), "componentOrientation", null);
        setBooleanField(term11298, term11298.getClass(), "newEventsOnly", false);
        setField(term11298, term11298.getClass(), "componentListener", null);
        setField(term11298, term11298.getClass(), "focusListener", null);
        setField(term11298, term11298.getClass(), "hierarchyListener", null);
        setField(term11298, term11298.getClass(), "hierarchyBoundsListener", null);
        setField(term11298, term11298.getClass(), "keyListener", null);
        setField(term11298, term11298.getClass(), "mouseListener", null);
        setField(term11298, term11298.getClass(), "mouseMotionListener", null);
        setField(term11298, term11298.getClass(), "mouseWheelListener", null);
        setField(term11298, term11298.getClass(), "inputMethodListener", null);
        setLongField(term11298, term11298.getClass(), "eventMask", 0L);
        setField(term11298, term11298.getClass(), "changeSupport", null);
        setField(term11298, term11298.getClass(), "objectLock", null);
        setBooleanField(term11298, term11298.getClass(), "isPacked", false);
        setIntField(term11298, term11298.getClass(), "boundsOp", 0);
        setField(term11298, term11298.getClass(), "compoundShape", null);
        setField(term11298, term11298.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11298, term11298.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11298, term11298.getClass(), "backgroundEraseDisabled", false);
        setField(term11298, term11298.getClass(), "eventCache", null);
        setBooleanField(term11298, term11298.getClass(), "coalescingEnabled", false);
        setBooleanField(term11298, term11298.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11298, term11298.getClass(), "componentSerializedDataVersion", 0);
        setField(term11298, term11298.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "scrollSyncActionPerformed", argTypes, term11298, args);
    }

};


