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

public class TopBar_setAsDefaultView_126691142513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13211;

    public TopBar_setAsDefaultView_126691142513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13211 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term13211, term13211.getClass(), "splitPanel", null);
        setBooleanField(term13211, term13211.getClass(), "splitModeOn", false);
        setField(term13211, term13211.getClass(), "viewMode", null);
        setField(term13211, term13211.getClass(), "buttonGroupViewBtn", null);
        setField(term13211, term13211.getClass(), "scrollSync", null);
        setField(term13211, term13211.getClass(), "showPreviewBtn", null);
        setField(term13211, term13211.getClass(), "showSourceBtn", null);
        setField(term13211, term13211.getClass(), "splitModeBtn", null);
        setField(term13211, term13211.getClass(), "viewModeDefault", null);
        setBooleanField(term13211, term13211.getClass(), "isAlignmentXSet", false);
        setFloatField(term13211, term13211.getClass(), "alignmentX", 0.0F);
        setBooleanField(term13211, term13211.getClass(), "isAlignmentYSet", false);
        setFloatField(term13211, term13211.getClass(), "alignmentY", 0.0F);
        setField(term13211, term13211.getClass(), "ui", null);
        setField(term13211, term13211.getClass(), "listenerList", null);
        setField(term13211, term13211.getClass(), "clientProperties", null);
        setField(term13211, term13211.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term13211, term13211.getClass(), "autoscrolls", false);
        setField(term13211, term13211.getClass(), "border", null);
        setIntField(term13211, term13211.getClass(), "flags", 0);
        setField(term13211, term13211.getClass(), "inputVerifier", null);
        setBooleanField(term13211, term13211.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term13211, term13211.getClass(), "paintingChild", null);
        setField(term13211, term13211.getClass(), "popupMenu", null);
        setField(term13211, term13211.getClass(), "revalidateRunnableScheduled", null);
        setField(term13211, term13211.getClass(), "focusInputMap", null);
        setField(term13211, term13211.getClass(), "ancestorInputMap", null);
        setField(term13211, term13211.getClass(), "windowInputMap", null);
        setField(term13211, term13211.getClass(), "actionMap", null);
        setField(term13211, term13211.getClass(), "aaHint", null);
        setField(term13211, term13211.getClass(), "lcdRenderingHint", null);
        setField(term13211, term13211.getClass(), "component", null);
        setField(term13211, term13211.getClass(), "layoutMgr", null);
        setField(term13211, term13211.getClass(), "dispatcher", null);
        setField(term13211, term13211.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term13211, term13211.getClass(), "focusCycleRoot", false);
        setBooleanField(term13211, term13211.getClass(), "focusTraversalPolicyProvider", false);
        setField(term13211, term13211.getClass(), "printingThreads", null);
        setBooleanField(term13211, term13211.getClass(), "printing", false);
        setField(term13211, term13211.getClass(), "containerListener", null);
        setIntField(term13211, term13211.getClass(), "listeningChildren", 0);
        setIntField(term13211, term13211.getClass(), "listeningBoundsChildren", 0);
        setIntField(term13211, term13211.getClass(), "descendantsCount", 0);
        setField(term13211, term13211.getClass(), "preserveBackgroundColor", null);
        setIntField(term13211, term13211.getClass(), "numOfHWComponents", 0);
        setIntField(term13211, term13211.getClass(), "numOfLWComponents", 0);
        setField(term13211, term13211.getClass(), "modalComp", null);
        setField(term13211, term13211.getClass(), "modalAppContext", null);
        setIntField(term13211, term13211.getClass(), "containerSerializedDataVersion", 0);
        setField(term13211, term13211.getClass(), "peer", null);
        setField(term13211, term13211.getClass(), "parent", null);
        setField(term13211, term13211.getClass(), "appContext", null);
        setIntField(term13211, term13211.getClass(), "x", 0);
        setIntField(term13211, term13211.getClass(), "y", 0);
        setIntField(term13211, term13211.getClass(), "width", 0);
        setIntField(term13211, term13211.getClass(), "height", 0);
        setField(term13211, term13211.getClass(), "foreground", null);
        setField(term13211, term13211.getClass(), "background", null);
        setField(term13211, term13211.getClass(), "font", null);
        setField(term13211, term13211.getClass(), "peerFont", null);
        setField(term13211, term13211.getClass(), "cursor", null);
        setField(term13211, term13211.getClass(), "locale", null);
        setField(term13211, term13211.getClass(), "graphicsConfig", null);
        setField(term13211, term13211.getClass(), "bufferStrategy", null);
        setBooleanField(term13211, term13211.getClass(), "ignoreRepaint", false);
        setBooleanField(term13211, term13211.getClass(), "visible", false);
        setBooleanField(term13211, term13211.getClass(), "enabled", false);
        setBooleanField(term13211, term13211.getClass(), "valid", false);
        setField(term13211, term13211.getClass(), "dropTarget", null);
        setField(term13211, term13211.getClass(), "popups", null);
        setField(term13211, term13211.getClass(), "name", null);
        setBooleanField(term13211, term13211.getClass(), "nameExplicitlySet", false);
        setBooleanField(term13211, term13211.getClass(), "focusable", false);
        setIntField(term13211, term13211.getClass(), "isFocusTraversableOverridden", 0);
        setField(term13211, term13211.getClass(), "focusTraversalKeys", null);
        setBooleanField(term13211, term13211.getClass(), "focusTraversalKeysEnabled", false);
        setField(term13211, term13211.getClass(), "acc", null);
        setField(term13211, term13211.getClass(), "minSize", null);
        setBooleanField(term13211, term13211.getClass(), "minSizeSet", false);
        setField(term13211, term13211.getClass(), "prefSize", null);
        setBooleanField(term13211, term13211.getClass(), "prefSizeSet", false);
        setField(term13211, term13211.getClass(), "maxSize", null);
        setBooleanField(term13211, term13211.getClass(), "maxSizeSet", false);
        setField(term13211, term13211.getClass(), "componentOrientation", null);
        setBooleanField(term13211, term13211.getClass(), "newEventsOnly", false);
        setField(term13211, term13211.getClass(), "componentListener", null);
        setField(term13211, term13211.getClass(), "focusListener", null);
        setField(term13211, term13211.getClass(), "hierarchyListener", null);
        setField(term13211, term13211.getClass(), "hierarchyBoundsListener", null);
        setField(term13211, term13211.getClass(), "keyListener", null);
        setField(term13211, term13211.getClass(), "mouseListener", null);
        setField(term13211, term13211.getClass(), "mouseMotionListener", null);
        setField(term13211, term13211.getClass(), "mouseWheelListener", null);
        setField(term13211, term13211.getClass(), "inputMethodListener", null);
        setLongField(term13211, term13211.getClass(), "eventMask", 0L);
        setField(term13211, term13211.getClass(), "changeSupport", null);
        setField(term13211, term13211.getClass(), "objectLock", null);
        setBooleanField(term13211, term13211.getClass(), "isPacked", false);
        setIntField(term13211, term13211.getClass(), "boundsOp", 0);
        setField(term13211, term13211.getClass(), "compoundShape", null);
        setField(term13211, term13211.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term13211, term13211.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term13211, term13211.getClass(), "backgroundEraseDisabled", false);
        setField(term13211, term13211.getClass(), "eventCache", null);
        setBooleanField(term13211, term13211.getClass(), "coalescingEnabled", false);
        setBooleanField(term13211, term13211.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term13211, term13211.getClass(), "componentSerializedDataVersion", 0);
        setField(term13211, term13211.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAsDefaultView", argTypes, term13211, args);
    }

};


