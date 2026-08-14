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

public class TopBar_showSourceBtnActionPerformed_5840799555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5260;

    public TopBar_showSourceBtnActionPerformed_5840799555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5260 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term5260, term5260.getClass(), "splitPanel", null);
        setBooleanField(term5260, term5260.getClass(), "splitModeOn", false);
        setField(term5260, term5260.getClass(), "viewMode", null);
        setField(term5260, term5260.getClass(), "buttonGroupViewBtn", null);
        setField(term5260, term5260.getClass(), "scrollSync", null);
        setField(term5260, term5260.getClass(), "showPreviewBtn", null);
        setField(term5260, term5260.getClass(), "showSourceBtn", null);
        setField(term5260, term5260.getClass(), "splitModeBtn", null);
        setField(term5260, term5260.getClass(), "viewModeDefault", null);
        setBooleanField(term5260, term5260.getClass(), "isAlignmentXSet", false);
        setFloatField(term5260, term5260.getClass(), "alignmentX", 0.0F);
        setBooleanField(term5260, term5260.getClass(), "isAlignmentYSet", false);
        setFloatField(term5260, term5260.getClass(), "alignmentY", 0.0F);
        setField(term5260, term5260.getClass(), "ui", null);
        setField(term5260, term5260.getClass(), "listenerList", null);
        setField(term5260, term5260.getClass(), "clientProperties", null);
        setField(term5260, term5260.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term5260, term5260.getClass(), "autoscrolls", false);
        setField(term5260, term5260.getClass(), "border", null);
        setIntField(term5260, term5260.getClass(), "flags", 0);
        setField(term5260, term5260.getClass(), "inputVerifier", null);
        setBooleanField(term5260, term5260.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term5260, term5260.getClass(), "paintingChild", null);
        setField(term5260, term5260.getClass(), "popupMenu", null);
        setField(term5260, term5260.getClass(), "revalidateRunnableScheduled", null);
        setField(term5260, term5260.getClass(), "focusInputMap", null);
        setField(term5260, term5260.getClass(), "ancestorInputMap", null);
        setField(term5260, term5260.getClass(), "windowInputMap", null);
        setField(term5260, term5260.getClass(), "actionMap", null);
        setField(term5260, term5260.getClass(), "aaHint", null);
        setField(term5260, term5260.getClass(), "lcdRenderingHint", null);
        setField(term5260, term5260.getClass(), "component", null);
        setField(term5260, term5260.getClass(), "layoutMgr", null);
        setField(term5260, term5260.getClass(), "dispatcher", null);
        setField(term5260, term5260.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term5260, term5260.getClass(), "focusCycleRoot", false);
        setBooleanField(term5260, term5260.getClass(), "focusTraversalPolicyProvider", false);
        setField(term5260, term5260.getClass(), "printingThreads", null);
        setBooleanField(term5260, term5260.getClass(), "printing", false);
        setField(term5260, term5260.getClass(), "containerListener", null);
        setIntField(term5260, term5260.getClass(), "listeningChildren", 0);
        setIntField(term5260, term5260.getClass(), "listeningBoundsChildren", 0);
        setIntField(term5260, term5260.getClass(), "descendantsCount", 0);
        setField(term5260, term5260.getClass(), "preserveBackgroundColor", null);
        setIntField(term5260, term5260.getClass(), "numOfHWComponents", 0);
        setIntField(term5260, term5260.getClass(), "numOfLWComponents", 0);
        setField(term5260, term5260.getClass(), "modalComp", null);
        setField(term5260, term5260.getClass(), "modalAppContext", null);
        setIntField(term5260, term5260.getClass(), "containerSerializedDataVersion", 0);
        setField(term5260, term5260.getClass(), "peer", null);
        setField(term5260, term5260.getClass(), "parent", null);
        setField(term5260, term5260.getClass(), "appContext", null);
        setIntField(term5260, term5260.getClass(), "x", 0);
        setIntField(term5260, term5260.getClass(), "y", 0);
        setIntField(term5260, term5260.getClass(), "width", 0);
        setIntField(term5260, term5260.getClass(), "height", 0);
        setField(term5260, term5260.getClass(), "foreground", null);
        setField(term5260, term5260.getClass(), "background", null);
        setField(term5260, term5260.getClass(), "font", null);
        setField(term5260, term5260.getClass(), "peerFont", null);
        setField(term5260, term5260.getClass(), "cursor", null);
        setField(term5260, term5260.getClass(), "locale", null);
        setField(term5260, term5260.getClass(), "graphicsConfig", null);
        setField(term5260, term5260.getClass(), "bufferStrategy", null);
        setBooleanField(term5260, term5260.getClass(), "ignoreRepaint", false);
        setBooleanField(term5260, term5260.getClass(), "visible", false);
        setBooleanField(term5260, term5260.getClass(), "enabled", false);
        setBooleanField(term5260, term5260.getClass(), "valid", false);
        setField(term5260, term5260.getClass(), "dropTarget", null);
        setField(term5260, term5260.getClass(), "popups", null);
        setField(term5260, term5260.getClass(), "name", null);
        setBooleanField(term5260, term5260.getClass(), "nameExplicitlySet", false);
        setBooleanField(term5260, term5260.getClass(), "focusable", false);
        setIntField(term5260, term5260.getClass(), "isFocusTraversableOverridden", 0);
        setField(term5260, term5260.getClass(), "focusTraversalKeys", null);
        setBooleanField(term5260, term5260.getClass(), "focusTraversalKeysEnabled", false);
        setField(term5260, term5260.getClass(), "acc", null);
        setField(term5260, term5260.getClass(), "minSize", null);
        setBooleanField(term5260, term5260.getClass(), "minSizeSet", false);
        setField(term5260, term5260.getClass(), "prefSize", null);
        setBooleanField(term5260, term5260.getClass(), "prefSizeSet", false);
        setField(term5260, term5260.getClass(), "maxSize", null);
        setBooleanField(term5260, term5260.getClass(), "maxSizeSet", false);
        setField(term5260, term5260.getClass(), "componentOrientation", null);
        setBooleanField(term5260, term5260.getClass(), "newEventsOnly", false);
        setField(term5260, term5260.getClass(), "componentListener", null);
        setField(term5260, term5260.getClass(), "focusListener", null);
        setField(term5260, term5260.getClass(), "hierarchyListener", null);
        setField(term5260, term5260.getClass(), "hierarchyBoundsListener", null);
        setField(term5260, term5260.getClass(), "keyListener", null);
        setField(term5260, term5260.getClass(), "mouseListener", null);
        setField(term5260, term5260.getClass(), "mouseMotionListener", null);
        setField(term5260, term5260.getClass(), "mouseWheelListener", null);
        setField(term5260, term5260.getClass(), "inputMethodListener", null);
        setLongField(term5260, term5260.getClass(), "eventMask", 0L);
        setField(term5260, term5260.getClass(), "changeSupport", null);
        setField(term5260, term5260.getClass(), "objectLock", null);
        setBooleanField(term5260, term5260.getClass(), "isPacked", false);
        setIntField(term5260, term5260.getClass(), "boundsOp", 0);
        setField(term5260, term5260.getClass(), "compoundShape", null);
        setField(term5260, term5260.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term5260, term5260.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term5260, term5260.getClass(), "backgroundEraseDisabled", false);
        setField(term5260, term5260.getClass(), "eventCache", null);
        setBooleanField(term5260, term5260.getClass(), "coalescingEnabled", false);
        setBooleanField(term5260, term5260.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term5260, term5260.getClass(), "componentSerializedDataVersion", 0);
        setField(term5260, term5260.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showSourceBtnActionPerformed", argTypes, term5260, args);
    }

};


