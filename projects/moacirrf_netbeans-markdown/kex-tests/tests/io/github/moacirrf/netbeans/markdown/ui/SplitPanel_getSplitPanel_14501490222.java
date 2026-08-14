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

public class SplitPanel_getSplitPanel_14501490222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62429;

    public SplitPanel_getSplitPanel_14501490222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62429 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.SplitPanel"));
        setField(term62429, term62429.getClass(), "splitPanel", null);
        setBooleanField(term62429, term62429.getClass(), "isAlignmentXSet", false);
        setFloatField(term62429, term62429.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62429, term62429.getClass(), "isAlignmentYSet", false);
        setFloatField(term62429, term62429.getClass(), "alignmentY", 0.0F);
        setField(term62429, term62429.getClass(), "ui", null);
        setField(term62429, term62429.getClass(), "listenerList", null);
        setField(term62429, term62429.getClass(), "clientProperties", null);
        setField(term62429, term62429.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62429, term62429.getClass(), "autoscrolls", false);
        setField(term62429, term62429.getClass(), "border", null);
        setIntField(term62429, term62429.getClass(), "flags", 0);
        setField(term62429, term62429.getClass(), "inputVerifier", null);
        setBooleanField(term62429, term62429.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62429, term62429.getClass(), "paintingChild", null);
        setField(term62429, term62429.getClass(), "popupMenu", null);
        setField(term62429, term62429.getClass(), "revalidateRunnableScheduled", null);
        setField(term62429, term62429.getClass(), "focusInputMap", null);
        setField(term62429, term62429.getClass(), "ancestorInputMap", null);
        setField(term62429, term62429.getClass(), "windowInputMap", null);
        setField(term62429, term62429.getClass(), "actionMap", null);
        setField(term62429, term62429.getClass(), "aaHint", null);
        setField(term62429, term62429.getClass(), "lcdRenderingHint", null);
        setField(term62429, term62429.getClass(), "component", null);
        setField(term62429, term62429.getClass(), "layoutMgr", null);
        setField(term62429, term62429.getClass(), "dispatcher", null);
        setField(term62429, term62429.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62429, term62429.getClass(), "focusCycleRoot", false);
        setBooleanField(term62429, term62429.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62429, term62429.getClass(), "printingThreads", null);
        setBooleanField(term62429, term62429.getClass(), "printing", false);
        setField(term62429, term62429.getClass(), "containerListener", null);
        setIntField(term62429, term62429.getClass(), "listeningChildren", 0);
        setIntField(term62429, term62429.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62429, term62429.getClass(), "descendantsCount", 0);
        setField(term62429, term62429.getClass(), "preserveBackgroundColor", null);
        setIntField(term62429, term62429.getClass(), "numOfHWComponents", 0);
        setIntField(term62429, term62429.getClass(), "numOfLWComponents", 0);
        setField(term62429, term62429.getClass(), "modalComp", null);
        setField(term62429, term62429.getClass(), "modalAppContext", null);
        setIntField(term62429, term62429.getClass(), "containerSerializedDataVersion", 0);
        setField(term62429, term62429.getClass(), "peer", null);
        setField(term62429, term62429.getClass(), "parent", null);
        setField(term62429, term62429.getClass(), "appContext", null);
        setIntField(term62429, term62429.getClass(), "x", 0);
        setIntField(term62429, term62429.getClass(), "y", 0);
        setIntField(term62429, term62429.getClass(), "width", 0);
        setIntField(term62429, term62429.getClass(), "height", 0);
        setField(term62429, term62429.getClass(), "foreground", null);
        setField(term62429, term62429.getClass(), "background", null);
        setField(term62429, term62429.getClass(), "font", null);
        setField(term62429, term62429.getClass(), "peerFont", null);
        setField(term62429, term62429.getClass(), "cursor", null);
        setField(term62429, term62429.getClass(), "locale", null);
        setField(term62429, term62429.getClass(), "graphicsConfig", null);
        setField(term62429, term62429.getClass(), "bufferStrategy", null);
        setBooleanField(term62429, term62429.getClass(), "ignoreRepaint", false);
        setBooleanField(term62429, term62429.getClass(), "visible", false);
        setBooleanField(term62429, term62429.getClass(), "enabled", false);
        setBooleanField(term62429, term62429.getClass(), "valid", false);
        setField(term62429, term62429.getClass(), "dropTarget", null);
        setField(term62429, term62429.getClass(), "popups", null);
        setField(term62429, term62429.getClass(), "name", null);
        setBooleanField(term62429, term62429.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62429, term62429.getClass(), "focusable", false);
        setIntField(term62429, term62429.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62429, term62429.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62429, term62429.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62429, term62429.getClass(), "acc", null);
        setField(term62429, term62429.getClass(), "minSize", null);
        setBooleanField(term62429, term62429.getClass(), "minSizeSet", false);
        setField(term62429, term62429.getClass(), "prefSize", null);
        setBooleanField(term62429, term62429.getClass(), "prefSizeSet", false);
        setField(term62429, term62429.getClass(), "maxSize", null);
        setBooleanField(term62429, term62429.getClass(), "maxSizeSet", false);
        setField(term62429, term62429.getClass(), "componentOrientation", null);
        setBooleanField(term62429, term62429.getClass(), "newEventsOnly", false);
        setField(term62429, term62429.getClass(), "componentListener", null);
        setField(term62429, term62429.getClass(), "focusListener", null);
        setField(term62429, term62429.getClass(), "hierarchyListener", null);
        setField(term62429, term62429.getClass(), "hierarchyBoundsListener", null);
        setField(term62429, term62429.getClass(), "keyListener", null);
        setField(term62429, term62429.getClass(), "mouseListener", null);
        setField(term62429, term62429.getClass(), "mouseMotionListener", null);
        setField(term62429, term62429.getClass(), "mouseWheelListener", null);
        setField(term62429, term62429.getClass(), "inputMethodListener", null);
        setLongField(term62429, term62429.getClass(), "eventMask", 0L);
        setField(term62429, term62429.getClass(), "changeSupport", null);
        setField(term62429, term62429.getClass(), "objectLock", null);
        setBooleanField(term62429, term62429.getClass(), "isPacked", false);
        setIntField(term62429, term62429.getClass(), "boundsOp", 0);
        setField(term62429, term62429.getClass(), "compoundShape", null);
        setField(term62429, term62429.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62429, term62429.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62429, term62429.getClass(), "backgroundEraseDisabled", false);
        setField(term62429, term62429.getClass(), "eventCache", null);
        setBooleanField(term62429, term62429.getClass(), "coalescingEnabled", false);
        setBooleanField(term62429, term62429.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62429, term62429.getClass(), "componentSerializedDataVersion", 0);
        setField(term62429, term62429.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.SplitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSplitPanel", argTypes, term62429, args);
    }

};


