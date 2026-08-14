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

public class TopBar_initComponents_15525964783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3227;

    public TopBar_initComponents_15525964783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3227 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term3227, term3227.getClass(), "splitPanel", null);
        setBooleanField(term3227, term3227.getClass(), "splitModeOn", false);
        setField(term3227, term3227.getClass(), "viewMode", null);
        setField(term3227, term3227.getClass(), "buttonGroupViewBtn", null);
        setField(term3227, term3227.getClass(), "scrollSync", null);
        setField(term3227, term3227.getClass(), "showPreviewBtn", null);
        setField(term3227, term3227.getClass(), "showSourceBtn", null);
        setField(term3227, term3227.getClass(), "splitModeBtn", null);
        setField(term3227, term3227.getClass(), "viewModeDefault", null);
        setBooleanField(term3227, term3227.getClass(), "isAlignmentXSet", false);
        setFloatField(term3227, term3227.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3227, term3227.getClass(), "isAlignmentYSet", false);
        setFloatField(term3227, term3227.getClass(), "alignmentY", 0.0F);
        setField(term3227, term3227.getClass(), "ui", null);
        setField(term3227, term3227.getClass(), "listenerList", null);
        setField(term3227, term3227.getClass(), "clientProperties", null);
        setField(term3227, term3227.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3227, term3227.getClass(), "autoscrolls", false);
        setField(term3227, term3227.getClass(), "border", null);
        setIntField(term3227, term3227.getClass(), "flags", 0);
        setField(term3227, term3227.getClass(), "inputVerifier", null);
        setBooleanField(term3227, term3227.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3227, term3227.getClass(), "paintingChild", null);
        setField(term3227, term3227.getClass(), "popupMenu", null);
        setField(term3227, term3227.getClass(), "revalidateRunnableScheduled", null);
        setField(term3227, term3227.getClass(), "focusInputMap", null);
        setField(term3227, term3227.getClass(), "ancestorInputMap", null);
        setField(term3227, term3227.getClass(), "windowInputMap", null);
        setField(term3227, term3227.getClass(), "actionMap", null);
        setField(term3227, term3227.getClass(), "aaHint", null);
        setField(term3227, term3227.getClass(), "lcdRenderingHint", null);
        setField(term3227, term3227.getClass(), "component", null);
        setField(term3227, term3227.getClass(), "layoutMgr", null);
        setField(term3227, term3227.getClass(), "dispatcher", null);
        setField(term3227, term3227.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3227, term3227.getClass(), "focusCycleRoot", false);
        setBooleanField(term3227, term3227.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3227, term3227.getClass(), "printingThreads", null);
        setBooleanField(term3227, term3227.getClass(), "printing", false);
        setField(term3227, term3227.getClass(), "containerListener", null);
        setIntField(term3227, term3227.getClass(), "listeningChildren", 0);
        setIntField(term3227, term3227.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3227, term3227.getClass(), "descendantsCount", 0);
        setField(term3227, term3227.getClass(), "preserveBackgroundColor", null);
        setIntField(term3227, term3227.getClass(), "numOfHWComponents", 0);
        setIntField(term3227, term3227.getClass(), "numOfLWComponents", 0);
        setField(term3227, term3227.getClass(), "modalComp", null);
        setField(term3227, term3227.getClass(), "modalAppContext", null);
        setIntField(term3227, term3227.getClass(), "containerSerializedDataVersion", 0);
        setField(term3227, term3227.getClass(), "peer", null);
        setField(term3227, term3227.getClass(), "parent", null);
        setField(term3227, term3227.getClass(), "appContext", null);
        setIntField(term3227, term3227.getClass(), "x", 0);
        setIntField(term3227, term3227.getClass(), "y", 0);
        setIntField(term3227, term3227.getClass(), "width", 0);
        setIntField(term3227, term3227.getClass(), "height", 0);
        setField(term3227, term3227.getClass(), "foreground", null);
        setField(term3227, term3227.getClass(), "background", null);
        setField(term3227, term3227.getClass(), "font", null);
        setField(term3227, term3227.getClass(), "peerFont", null);
        setField(term3227, term3227.getClass(), "cursor", null);
        setField(term3227, term3227.getClass(), "locale", null);
        setField(term3227, term3227.getClass(), "graphicsConfig", null);
        setField(term3227, term3227.getClass(), "bufferStrategy", null);
        setBooleanField(term3227, term3227.getClass(), "ignoreRepaint", false);
        setBooleanField(term3227, term3227.getClass(), "visible", false);
        setBooleanField(term3227, term3227.getClass(), "enabled", false);
        setBooleanField(term3227, term3227.getClass(), "valid", false);
        setField(term3227, term3227.getClass(), "dropTarget", null);
        setField(term3227, term3227.getClass(), "popups", null);
        setField(term3227, term3227.getClass(), "name", null);
        setBooleanField(term3227, term3227.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3227, term3227.getClass(), "focusable", false);
        setIntField(term3227, term3227.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3227, term3227.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3227, term3227.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3227, term3227.getClass(), "acc", null);
        setField(term3227, term3227.getClass(), "minSize", null);
        setBooleanField(term3227, term3227.getClass(), "minSizeSet", false);
        setField(term3227, term3227.getClass(), "prefSize", null);
        setBooleanField(term3227, term3227.getClass(), "prefSizeSet", false);
        setField(term3227, term3227.getClass(), "maxSize", null);
        setBooleanField(term3227, term3227.getClass(), "maxSizeSet", false);
        setField(term3227, term3227.getClass(), "componentOrientation", null);
        setBooleanField(term3227, term3227.getClass(), "newEventsOnly", false);
        setField(term3227, term3227.getClass(), "componentListener", null);
        setField(term3227, term3227.getClass(), "focusListener", null);
        setField(term3227, term3227.getClass(), "hierarchyListener", null);
        setField(term3227, term3227.getClass(), "hierarchyBoundsListener", null);
        setField(term3227, term3227.getClass(), "keyListener", null);
        setField(term3227, term3227.getClass(), "mouseListener", null);
        setField(term3227, term3227.getClass(), "mouseMotionListener", null);
        setField(term3227, term3227.getClass(), "mouseWheelListener", null);
        setField(term3227, term3227.getClass(), "inputMethodListener", null);
        setLongField(term3227, term3227.getClass(), "eventMask", 0L);
        setField(term3227, term3227.getClass(), "changeSupport", null);
        setField(term3227, term3227.getClass(), "objectLock", null);
        setBooleanField(term3227, term3227.getClass(), "isPacked", false);
        setIntField(term3227, term3227.getClass(), "boundsOp", 0);
        setField(term3227, term3227.getClass(), "compoundShape", null);
        setField(term3227, term3227.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3227, term3227.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3227, term3227.getClass(), "backgroundEraseDisabled", false);
        setField(term3227, term3227.getClass(), "eventCache", null);
        setBooleanField(term3227, term3227.getClass(), "coalescingEnabled", false);
        setBooleanField(term3227, term3227.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3227, term3227.getClass(), "componentSerializedDataVersion", 0);
        setField(term3227, term3227.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initComponents", argTypes, term3227, args);
    }

};


