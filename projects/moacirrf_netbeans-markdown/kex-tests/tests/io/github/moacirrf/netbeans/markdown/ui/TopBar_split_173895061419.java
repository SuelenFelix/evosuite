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

public class TopBar_split_173895061419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19045;

    public TopBar_split_173895061419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19045 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term19045, term19045.getClass(), "splitPanel", null);
        setBooleanField(term19045, term19045.getClass(), "splitModeOn", false);
        setField(term19045, term19045.getClass(), "viewMode", null);
        setField(term19045, term19045.getClass(), "buttonGroupViewBtn", null);
        setField(term19045, term19045.getClass(), "scrollSync", null);
        setField(term19045, term19045.getClass(), "showPreviewBtn", null);
        setField(term19045, term19045.getClass(), "showSourceBtn", null);
        setField(term19045, term19045.getClass(), "splitModeBtn", null);
        setField(term19045, term19045.getClass(), "viewModeDefault", null);
        setBooleanField(term19045, term19045.getClass(), "isAlignmentXSet", false);
        setFloatField(term19045, term19045.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19045, term19045.getClass(), "isAlignmentYSet", false);
        setFloatField(term19045, term19045.getClass(), "alignmentY", 0.0F);
        setField(term19045, term19045.getClass(), "ui", null);
        setField(term19045, term19045.getClass(), "listenerList", null);
        setField(term19045, term19045.getClass(), "clientProperties", null);
        setField(term19045, term19045.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19045, term19045.getClass(), "autoscrolls", false);
        setField(term19045, term19045.getClass(), "border", null);
        setIntField(term19045, term19045.getClass(), "flags", 0);
        setField(term19045, term19045.getClass(), "inputVerifier", null);
        setBooleanField(term19045, term19045.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19045, term19045.getClass(), "paintingChild", null);
        setField(term19045, term19045.getClass(), "popupMenu", null);
        setField(term19045, term19045.getClass(), "revalidateRunnableScheduled", null);
        setField(term19045, term19045.getClass(), "focusInputMap", null);
        setField(term19045, term19045.getClass(), "ancestorInputMap", null);
        setField(term19045, term19045.getClass(), "windowInputMap", null);
        setField(term19045, term19045.getClass(), "actionMap", null);
        setField(term19045, term19045.getClass(), "aaHint", null);
        setField(term19045, term19045.getClass(), "lcdRenderingHint", null);
        setField(term19045, term19045.getClass(), "component", null);
        setField(term19045, term19045.getClass(), "layoutMgr", null);
        setField(term19045, term19045.getClass(), "dispatcher", null);
        setField(term19045, term19045.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19045, term19045.getClass(), "focusCycleRoot", false);
        setBooleanField(term19045, term19045.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19045, term19045.getClass(), "printingThreads", null);
        setBooleanField(term19045, term19045.getClass(), "printing", false);
        setField(term19045, term19045.getClass(), "containerListener", null);
        setIntField(term19045, term19045.getClass(), "listeningChildren", 0);
        setIntField(term19045, term19045.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19045, term19045.getClass(), "descendantsCount", 0);
        setField(term19045, term19045.getClass(), "preserveBackgroundColor", null);
        setIntField(term19045, term19045.getClass(), "numOfHWComponents", 0);
        setIntField(term19045, term19045.getClass(), "numOfLWComponents", 0);
        setField(term19045, term19045.getClass(), "modalComp", null);
        setField(term19045, term19045.getClass(), "modalAppContext", null);
        setIntField(term19045, term19045.getClass(), "containerSerializedDataVersion", 0);
        setField(term19045, term19045.getClass(), "peer", null);
        setField(term19045, term19045.getClass(), "parent", null);
        setField(term19045, term19045.getClass(), "appContext", null);
        setIntField(term19045, term19045.getClass(), "x", 0);
        setIntField(term19045, term19045.getClass(), "y", 0);
        setIntField(term19045, term19045.getClass(), "width", 0);
        setIntField(term19045, term19045.getClass(), "height", 0);
        setField(term19045, term19045.getClass(), "foreground", null);
        setField(term19045, term19045.getClass(), "background", null);
        setField(term19045, term19045.getClass(), "font", null);
        setField(term19045, term19045.getClass(), "peerFont", null);
        setField(term19045, term19045.getClass(), "cursor", null);
        setField(term19045, term19045.getClass(), "locale", null);
        setField(term19045, term19045.getClass(), "graphicsConfig", null);
        setField(term19045, term19045.getClass(), "bufferStrategy", null);
        setBooleanField(term19045, term19045.getClass(), "ignoreRepaint", false);
        setBooleanField(term19045, term19045.getClass(), "visible", false);
        setBooleanField(term19045, term19045.getClass(), "enabled", false);
        setBooleanField(term19045, term19045.getClass(), "valid", false);
        setField(term19045, term19045.getClass(), "dropTarget", null);
        setField(term19045, term19045.getClass(), "popups", null);
        setField(term19045, term19045.getClass(), "name", null);
        setBooleanField(term19045, term19045.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19045, term19045.getClass(), "focusable", false);
        setIntField(term19045, term19045.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19045, term19045.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19045, term19045.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19045, term19045.getClass(), "acc", null);
        setField(term19045, term19045.getClass(), "minSize", null);
        setBooleanField(term19045, term19045.getClass(), "minSizeSet", false);
        setField(term19045, term19045.getClass(), "prefSize", null);
        setBooleanField(term19045, term19045.getClass(), "prefSizeSet", false);
        setField(term19045, term19045.getClass(), "maxSize", null);
        setBooleanField(term19045, term19045.getClass(), "maxSizeSet", false);
        setField(term19045, term19045.getClass(), "componentOrientation", null);
        setBooleanField(term19045, term19045.getClass(), "newEventsOnly", false);
        setField(term19045, term19045.getClass(), "componentListener", null);
        setField(term19045, term19045.getClass(), "focusListener", null);
        setField(term19045, term19045.getClass(), "hierarchyListener", null);
        setField(term19045, term19045.getClass(), "hierarchyBoundsListener", null);
        setField(term19045, term19045.getClass(), "keyListener", null);
        setField(term19045, term19045.getClass(), "mouseListener", null);
        setField(term19045, term19045.getClass(), "mouseMotionListener", null);
        setField(term19045, term19045.getClass(), "mouseWheelListener", null);
        setField(term19045, term19045.getClass(), "inputMethodListener", null);
        setLongField(term19045, term19045.getClass(), "eventMask", 0L);
        setField(term19045, term19045.getClass(), "changeSupport", null);
        setField(term19045, term19045.getClass(), "objectLock", null);
        setBooleanField(term19045, term19045.getClass(), "isPacked", false);
        setIntField(term19045, term19045.getClass(), "boundsOp", 0);
        setField(term19045, term19045.getClass(), "compoundShape", null);
        setField(term19045, term19045.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19045, term19045.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19045, term19045.getClass(), "backgroundEraseDisabled", false);
        setField(term19045, term19045.getClass(), "eventCache", null);
        setBooleanField(term19045, term19045.getClass(), "coalescingEnabled", false);
        setBooleanField(term19045, term19045.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19045, term19045.getClass(), "componentSerializedDataVersion", 0);
        setField(term19045, term19045.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "split", argTypes, term19045, args);
    }

};


