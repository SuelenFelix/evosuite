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

public class TopBar_onlyPreview_62282104821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21136;

    public TopBar_onlyPreview_62282104821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21136 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term21136, term21136.getClass(), "splitPanel", null);
        setBooleanField(term21136, term21136.getClass(), "splitModeOn", false);
        setField(term21136, term21136.getClass(), "viewMode", null);
        setField(term21136, term21136.getClass(), "buttonGroupViewBtn", null);
        setField(term21136, term21136.getClass(), "scrollSync", null);
        setField(term21136, term21136.getClass(), "showPreviewBtn", null);
        setField(term21136, term21136.getClass(), "showSourceBtn", null);
        setField(term21136, term21136.getClass(), "splitModeBtn", null);
        setField(term21136, term21136.getClass(), "viewModeDefault", null);
        setBooleanField(term21136, term21136.getClass(), "isAlignmentXSet", false);
        setFloatField(term21136, term21136.getClass(), "alignmentX", 0.0F);
        setBooleanField(term21136, term21136.getClass(), "isAlignmentYSet", false);
        setFloatField(term21136, term21136.getClass(), "alignmentY", 0.0F);
        setField(term21136, term21136.getClass(), "ui", null);
        setField(term21136, term21136.getClass(), "listenerList", null);
        setField(term21136, term21136.getClass(), "clientProperties", null);
        setField(term21136, term21136.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term21136, term21136.getClass(), "autoscrolls", false);
        setField(term21136, term21136.getClass(), "border", null);
        setIntField(term21136, term21136.getClass(), "flags", 0);
        setField(term21136, term21136.getClass(), "inputVerifier", null);
        setBooleanField(term21136, term21136.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term21136, term21136.getClass(), "paintingChild", null);
        setField(term21136, term21136.getClass(), "popupMenu", null);
        setField(term21136, term21136.getClass(), "revalidateRunnableScheduled", null);
        setField(term21136, term21136.getClass(), "focusInputMap", null);
        setField(term21136, term21136.getClass(), "ancestorInputMap", null);
        setField(term21136, term21136.getClass(), "windowInputMap", null);
        setField(term21136, term21136.getClass(), "actionMap", null);
        setField(term21136, term21136.getClass(), "aaHint", null);
        setField(term21136, term21136.getClass(), "lcdRenderingHint", null);
        setField(term21136, term21136.getClass(), "component", null);
        setField(term21136, term21136.getClass(), "layoutMgr", null);
        setField(term21136, term21136.getClass(), "dispatcher", null);
        setField(term21136, term21136.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term21136, term21136.getClass(), "focusCycleRoot", false);
        setBooleanField(term21136, term21136.getClass(), "focusTraversalPolicyProvider", false);
        setField(term21136, term21136.getClass(), "printingThreads", null);
        setBooleanField(term21136, term21136.getClass(), "printing", false);
        setField(term21136, term21136.getClass(), "containerListener", null);
        setIntField(term21136, term21136.getClass(), "listeningChildren", 0);
        setIntField(term21136, term21136.getClass(), "listeningBoundsChildren", 0);
        setIntField(term21136, term21136.getClass(), "descendantsCount", 0);
        setField(term21136, term21136.getClass(), "preserveBackgroundColor", null);
        setIntField(term21136, term21136.getClass(), "numOfHWComponents", 0);
        setIntField(term21136, term21136.getClass(), "numOfLWComponents", 0);
        setField(term21136, term21136.getClass(), "modalComp", null);
        setField(term21136, term21136.getClass(), "modalAppContext", null);
        setIntField(term21136, term21136.getClass(), "containerSerializedDataVersion", 0);
        setField(term21136, term21136.getClass(), "peer", null);
        setField(term21136, term21136.getClass(), "parent", null);
        setField(term21136, term21136.getClass(), "appContext", null);
        setIntField(term21136, term21136.getClass(), "x", 0);
        setIntField(term21136, term21136.getClass(), "y", 0);
        setIntField(term21136, term21136.getClass(), "width", 0);
        setIntField(term21136, term21136.getClass(), "height", 0);
        setField(term21136, term21136.getClass(), "foreground", null);
        setField(term21136, term21136.getClass(), "background", null);
        setField(term21136, term21136.getClass(), "font", null);
        setField(term21136, term21136.getClass(), "peerFont", null);
        setField(term21136, term21136.getClass(), "cursor", null);
        setField(term21136, term21136.getClass(), "locale", null);
        setField(term21136, term21136.getClass(), "graphicsConfig", null);
        setField(term21136, term21136.getClass(), "bufferStrategy", null);
        setBooleanField(term21136, term21136.getClass(), "ignoreRepaint", false);
        setBooleanField(term21136, term21136.getClass(), "visible", false);
        setBooleanField(term21136, term21136.getClass(), "enabled", false);
        setBooleanField(term21136, term21136.getClass(), "valid", false);
        setField(term21136, term21136.getClass(), "dropTarget", null);
        setField(term21136, term21136.getClass(), "popups", null);
        setField(term21136, term21136.getClass(), "name", null);
        setBooleanField(term21136, term21136.getClass(), "nameExplicitlySet", false);
        setBooleanField(term21136, term21136.getClass(), "focusable", false);
        setIntField(term21136, term21136.getClass(), "isFocusTraversableOverridden", 0);
        setField(term21136, term21136.getClass(), "focusTraversalKeys", null);
        setBooleanField(term21136, term21136.getClass(), "focusTraversalKeysEnabled", false);
        setField(term21136, term21136.getClass(), "acc", null);
        setField(term21136, term21136.getClass(), "minSize", null);
        setBooleanField(term21136, term21136.getClass(), "minSizeSet", false);
        setField(term21136, term21136.getClass(), "prefSize", null);
        setBooleanField(term21136, term21136.getClass(), "prefSizeSet", false);
        setField(term21136, term21136.getClass(), "maxSize", null);
        setBooleanField(term21136, term21136.getClass(), "maxSizeSet", false);
        setField(term21136, term21136.getClass(), "componentOrientation", null);
        setBooleanField(term21136, term21136.getClass(), "newEventsOnly", false);
        setField(term21136, term21136.getClass(), "componentListener", null);
        setField(term21136, term21136.getClass(), "focusListener", null);
        setField(term21136, term21136.getClass(), "hierarchyListener", null);
        setField(term21136, term21136.getClass(), "hierarchyBoundsListener", null);
        setField(term21136, term21136.getClass(), "keyListener", null);
        setField(term21136, term21136.getClass(), "mouseListener", null);
        setField(term21136, term21136.getClass(), "mouseMotionListener", null);
        setField(term21136, term21136.getClass(), "mouseWheelListener", null);
        setField(term21136, term21136.getClass(), "inputMethodListener", null);
        setLongField(term21136, term21136.getClass(), "eventMask", 0L);
        setField(term21136, term21136.getClass(), "changeSupport", null);
        setField(term21136, term21136.getClass(), "objectLock", null);
        setBooleanField(term21136, term21136.getClass(), "isPacked", false);
        setIntField(term21136, term21136.getClass(), "boundsOp", 0);
        setField(term21136, term21136.getClass(), "compoundShape", null);
        setField(term21136, term21136.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term21136, term21136.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term21136, term21136.getClass(), "backgroundEraseDisabled", false);
        setField(term21136, term21136.getClass(), "eventCache", null);
        setBooleanField(term21136, term21136.getClass(), "coalescingEnabled", false);
        setBooleanField(term21136, term21136.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term21136, term21136.getClass(), "componentSerializedDataVersion", 0);
        setField(term21136, term21136.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onlyPreview", argTypes, term21136, args);
    }

};


