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

public class TopBar_showPreviewBtnActionPerformed_8753767949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9268;

    public TopBar_showPreviewBtnActionPerformed_8753767949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9268 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term9268, term9268.getClass(), "splitPanel", null);
        setBooleanField(term9268, term9268.getClass(), "splitModeOn", false);
        setField(term9268, term9268.getClass(), "viewMode", null);
        setField(term9268, term9268.getClass(), "buttonGroupViewBtn", null);
        setField(term9268, term9268.getClass(), "scrollSync", null);
        setField(term9268, term9268.getClass(), "showPreviewBtn", null);
        setField(term9268, term9268.getClass(), "showSourceBtn", null);
        setField(term9268, term9268.getClass(), "splitModeBtn", null);
        setField(term9268, term9268.getClass(), "viewModeDefault", null);
        setBooleanField(term9268, term9268.getClass(), "isAlignmentXSet", false);
        setFloatField(term9268, term9268.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9268, term9268.getClass(), "isAlignmentYSet", false);
        setFloatField(term9268, term9268.getClass(), "alignmentY", 0.0F);
        setField(term9268, term9268.getClass(), "ui", null);
        setField(term9268, term9268.getClass(), "listenerList", null);
        setField(term9268, term9268.getClass(), "clientProperties", null);
        setField(term9268, term9268.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9268, term9268.getClass(), "autoscrolls", false);
        setField(term9268, term9268.getClass(), "border", null);
        setIntField(term9268, term9268.getClass(), "flags", 0);
        setField(term9268, term9268.getClass(), "inputVerifier", null);
        setBooleanField(term9268, term9268.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9268, term9268.getClass(), "paintingChild", null);
        setField(term9268, term9268.getClass(), "popupMenu", null);
        setField(term9268, term9268.getClass(), "revalidateRunnableScheduled", null);
        setField(term9268, term9268.getClass(), "focusInputMap", null);
        setField(term9268, term9268.getClass(), "ancestorInputMap", null);
        setField(term9268, term9268.getClass(), "windowInputMap", null);
        setField(term9268, term9268.getClass(), "actionMap", null);
        setField(term9268, term9268.getClass(), "aaHint", null);
        setField(term9268, term9268.getClass(), "lcdRenderingHint", null);
        setField(term9268, term9268.getClass(), "component", null);
        setField(term9268, term9268.getClass(), "layoutMgr", null);
        setField(term9268, term9268.getClass(), "dispatcher", null);
        setField(term9268, term9268.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9268, term9268.getClass(), "focusCycleRoot", false);
        setBooleanField(term9268, term9268.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9268, term9268.getClass(), "printingThreads", null);
        setBooleanField(term9268, term9268.getClass(), "printing", false);
        setField(term9268, term9268.getClass(), "containerListener", null);
        setIntField(term9268, term9268.getClass(), "listeningChildren", 0);
        setIntField(term9268, term9268.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9268, term9268.getClass(), "descendantsCount", 0);
        setField(term9268, term9268.getClass(), "preserveBackgroundColor", null);
        setIntField(term9268, term9268.getClass(), "numOfHWComponents", 0);
        setIntField(term9268, term9268.getClass(), "numOfLWComponents", 0);
        setField(term9268, term9268.getClass(), "modalComp", null);
        setField(term9268, term9268.getClass(), "modalAppContext", null);
        setIntField(term9268, term9268.getClass(), "containerSerializedDataVersion", 0);
        setField(term9268, term9268.getClass(), "peer", null);
        setField(term9268, term9268.getClass(), "parent", null);
        setField(term9268, term9268.getClass(), "appContext", null);
        setIntField(term9268, term9268.getClass(), "x", 0);
        setIntField(term9268, term9268.getClass(), "y", 0);
        setIntField(term9268, term9268.getClass(), "width", 0);
        setIntField(term9268, term9268.getClass(), "height", 0);
        setField(term9268, term9268.getClass(), "foreground", null);
        setField(term9268, term9268.getClass(), "background", null);
        setField(term9268, term9268.getClass(), "font", null);
        setField(term9268, term9268.getClass(), "peerFont", null);
        setField(term9268, term9268.getClass(), "cursor", null);
        setField(term9268, term9268.getClass(), "locale", null);
        setField(term9268, term9268.getClass(), "graphicsConfig", null);
        setField(term9268, term9268.getClass(), "bufferStrategy", null);
        setBooleanField(term9268, term9268.getClass(), "ignoreRepaint", false);
        setBooleanField(term9268, term9268.getClass(), "visible", false);
        setBooleanField(term9268, term9268.getClass(), "enabled", false);
        setBooleanField(term9268, term9268.getClass(), "valid", false);
        setField(term9268, term9268.getClass(), "dropTarget", null);
        setField(term9268, term9268.getClass(), "popups", null);
        setField(term9268, term9268.getClass(), "name", null);
        setBooleanField(term9268, term9268.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9268, term9268.getClass(), "focusable", false);
        setIntField(term9268, term9268.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9268, term9268.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9268, term9268.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9268, term9268.getClass(), "acc", null);
        setField(term9268, term9268.getClass(), "minSize", null);
        setBooleanField(term9268, term9268.getClass(), "minSizeSet", false);
        setField(term9268, term9268.getClass(), "prefSize", null);
        setBooleanField(term9268, term9268.getClass(), "prefSizeSet", false);
        setField(term9268, term9268.getClass(), "maxSize", null);
        setBooleanField(term9268, term9268.getClass(), "maxSizeSet", false);
        setField(term9268, term9268.getClass(), "componentOrientation", null);
        setBooleanField(term9268, term9268.getClass(), "newEventsOnly", false);
        setField(term9268, term9268.getClass(), "componentListener", null);
        setField(term9268, term9268.getClass(), "focusListener", null);
        setField(term9268, term9268.getClass(), "hierarchyListener", null);
        setField(term9268, term9268.getClass(), "hierarchyBoundsListener", null);
        setField(term9268, term9268.getClass(), "keyListener", null);
        setField(term9268, term9268.getClass(), "mouseListener", null);
        setField(term9268, term9268.getClass(), "mouseMotionListener", null);
        setField(term9268, term9268.getClass(), "mouseWheelListener", null);
        setField(term9268, term9268.getClass(), "inputMethodListener", null);
        setLongField(term9268, term9268.getClass(), "eventMask", 0L);
        setField(term9268, term9268.getClass(), "changeSupport", null);
        setField(term9268, term9268.getClass(), "objectLock", null);
        setBooleanField(term9268, term9268.getClass(), "isPacked", false);
        setIntField(term9268, term9268.getClass(), "boundsOp", 0);
        setField(term9268, term9268.getClass(), "compoundShape", null);
        setField(term9268, term9268.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9268, term9268.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9268, term9268.getClass(), "backgroundEraseDisabled", false);
        setField(term9268, term9268.getClass(), "eventCache", null);
        setBooleanField(term9268, term9268.getClass(), "coalescingEnabled", false);
        setBooleanField(term9268, term9268.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9268, term9268.getClass(), "componentSerializedDataVersion", 0);
        setField(term9268, term9268.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showPreviewBtnActionPerformed", argTypes, term9268, args);
    }

};


