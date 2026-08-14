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

public class TopBar_configCheckBoxViewMode_20132711317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17111;

    public TopBar_configCheckBoxViewMode_20132711317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17111 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term17111, term17111.getClass(), "splitPanel", null);
        setBooleanField(term17111, term17111.getClass(), "splitModeOn", false);
        setField(term17111, term17111.getClass(), "viewMode", null);
        setField(term17111, term17111.getClass(), "buttonGroupViewBtn", null);
        setField(term17111, term17111.getClass(), "scrollSync", null);
        setField(term17111, term17111.getClass(), "showPreviewBtn", null);
        setField(term17111, term17111.getClass(), "showSourceBtn", null);
        setField(term17111, term17111.getClass(), "splitModeBtn", null);
        setField(term17111, term17111.getClass(), "viewModeDefault", null);
        setBooleanField(term17111, term17111.getClass(), "isAlignmentXSet", false);
        setFloatField(term17111, term17111.getClass(), "alignmentX", 0.0F);
        setBooleanField(term17111, term17111.getClass(), "isAlignmentYSet", false);
        setFloatField(term17111, term17111.getClass(), "alignmentY", 0.0F);
        setField(term17111, term17111.getClass(), "ui", null);
        setField(term17111, term17111.getClass(), "listenerList", null);
        setField(term17111, term17111.getClass(), "clientProperties", null);
        setField(term17111, term17111.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term17111, term17111.getClass(), "autoscrolls", false);
        setField(term17111, term17111.getClass(), "border", null);
        setIntField(term17111, term17111.getClass(), "flags", 0);
        setField(term17111, term17111.getClass(), "inputVerifier", null);
        setBooleanField(term17111, term17111.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term17111, term17111.getClass(), "paintingChild", null);
        setField(term17111, term17111.getClass(), "popupMenu", null);
        setField(term17111, term17111.getClass(), "revalidateRunnableScheduled", null);
        setField(term17111, term17111.getClass(), "focusInputMap", null);
        setField(term17111, term17111.getClass(), "ancestorInputMap", null);
        setField(term17111, term17111.getClass(), "windowInputMap", null);
        setField(term17111, term17111.getClass(), "actionMap", null);
        setField(term17111, term17111.getClass(), "aaHint", null);
        setField(term17111, term17111.getClass(), "lcdRenderingHint", null);
        setField(term17111, term17111.getClass(), "component", null);
        setField(term17111, term17111.getClass(), "layoutMgr", null);
        setField(term17111, term17111.getClass(), "dispatcher", null);
        setField(term17111, term17111.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term17111, term17111.getClass(), "focusCycleRoot", false);
        setBooleanField(term17111, term17111.getClass(), "focusTraversalPolicyProvider", false);
        setField(term17111, term17111.getClass(), "printingThreads", null);
        setBooleanField(term17111, term17111.getClass(), "printing", false);
        setField(term17111, term17111.getClass(), "containerListener", null);
        setIntField(term17111, term17111.getClass(), "listeningChildren", 0);
        setIntField(term17111, term17111.getClass(), "listeningBoundsChildren", 0);
        setIntField(term17111, term17111.getClass(), "descendantsCount", 0);
        setField(term17111, term17111.getClass(), "preserveBackgroundColor", null);
        setIntField(term17111, term17111.getClass(), "numOfHWComponents", 0);
        setIntField(term17111, term17111.getClass(), "numOfLWComponents", 0);
        setField(term17111, term17111.getClass(), "modalComp", null);
        setField(term17111, term17111.getClass(), "modalAppContext", null);
        setIntField(term17111, term17111.getClass(), "containerSerializedDataVersion", 0);
        setField(term17111, term17111.getClass(), "peer", null);
        setField(term17111, term17111.getClass(), "parent", null);
        setField(term17111, term17111.getClass(), "appContext", null);
        setIntField(term17111, term17111.getClass(), "x", 0);
        setIntField(term17111, term17111.getClass(), "y", 0);
        setIntField(term17111, term17111.getClass(), "width", 0);
        setIntField(term17111, term17111.getClass(), "height", 0);
        setField(term17111, term17111.getClass(), "foreground", null);
        setField(term17111, term17111.getClass(), "background", null);
        setField(term17111, term17111.getClass(), "font", null);
        setField(term17111, term17111.getClass(), "peerFont", null);
        setField(term17111, term17111.getClass(), "cursor", null);
        setField(term17111, term17111.getClass(), "locale", null);
        setField(term17111, term17111.getClass(), "graphicsConfig", null);
        setField(term17111, term17111.getClass(), "bufferStrategy", null);
        setBooleanField(term17111, term17111.getClass(), "ignoreRepaint", false);
        setBooleanField(term17111, term17111.getClass(), "visible", false);
        setBooleanField(term17111, term17111.getClass(), "enabled", false);
        setBooleanField(term17111, term17111.getClass(), "valid", false);
        setField(term17111, term17111.getClass(), "dropTarget", null);
        setField(term17111, term17111.getClass(), "popups", null);
        setField(term17111, term17111.getClass(), "name", null);
        setBooleanField(term17111, term17111.getClass(), "nameExplicitlySet", false);
        setBooleanField(term17111, term17111.getClass(), "focusable", false);
        setIntField(term17111, term17111.getClass(), "isFocusTraversableOverridden", 0);
        setField(term17111, term17111.getClass(), "focusTraversalKeys", null);
        setBooleanField(term17111, term17111.getClass(), "focusTraversalKeysEnabled", false);
        setField(term17111, term17111.getClass(), "acc", null);
        setField(term17111, term17111.getClass(), "minSize", null);
        setBooleanField(term17111, term17111.getClass(), "minSizeSet", false);
        setField(term17111, term17111.getClass(), "prefSize", null);
        setBooleanField(term17111, term17111.getClass(), "prefSizeSet", false);
        setField(term17111, term17111.getClass(), "maxSize", null);
        setBooleanField(term17111, term17111.getClass(), "maxSizeSet", false);
        setField(term17111, term17111.getClass(), "componentOrientation", null);
        setBooleanField(term17111, term17111.getClass(), "newEventsOnly", false);
        setField(term17111, term17111.getClass(), "componentListener", null);
        setField(term17111, term17111.getClass(), "focusListener", null);
        setField(term17111, term17111.getClass(), "hierarchyListener", null);
        setField(term17111, term17111.getClass(), "hierarchyBoundsListener", null);
        setField(term17111, term17111.getClass(), "keyListener", null);
        setField(term17111, term17111.getClass(), "mouseListener", null);
        setField(term17111, term17111.getClass(), "mouseMotionListener", null);
        setField(term17111, term17111.getClass(), "mouseWheelListener", null);
        setField(term17111, term17111.getClass(), "inputMethodListener", null);
        setLongField(term17111, term17111.getClass(), "eventMask", 0L);
        setField(term17111, term17111.getClass(), "changeSupport", null);
        setField(term17111, term17111.getClass(), "objectLock", null);
        setBooleanField(term17111, term17111.getClass(), "isPacked", false);
        setIntField(term17111, term17111.getClass(), "boundsOp", 0);
        setField(term17111, term17111.getClass(), "compoundShape", null);
        setField(term17111, term17111.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term17111, term17111.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term17111, term17111.getClass(), "backgroundEraseDisabled", false);
        setField(term17111, term17111.getClass(), "eventCache", null);
        setBooleanField(term17111, term17111.getClass(), "coalescingEnabled", false);
        setBooleanField(term17111, term17111.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term17111, term17111.getClass(), "componentSerializedDataVersion", 0);
        setField(term17111, term17111.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "configCheckBoxViewMode", argTypes, term17111, args);
    }

};


