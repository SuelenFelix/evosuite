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

public class SplitPanel_initComponents_1420982944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63690;

    public SplitPanel_initComponents_1420982944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63690 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.SplitPanel"));
        setField(term63690, term63690.getClass(), "splitPanel", null);
        setBooleanField(term63690, term63690.getClass(), "isAlignmentXSet", false);
        setFloatField(term63690, term63690.getClass(), "alignmentX", 0.0F);
        setBooleanField(term63690, term63690.getClass(), "isAlignmentYSet", false);
        setFloatField(term63690, term63690.getClass(), "alignmentY", 0.0F);
        setField(term63690, term63690.getClass(), "ui", null);
        setField(term63690, term63690.getClass(), "listenerList", null);
        setField(term63690, term63690.getClass(), "clientProperties", null);
        setField(term63690, term63690.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term63690, term63690.getClass(), "autoscrolls", false);
        setField(term63690, term63690.getClass(), "border", null);
        setIntField(term63690, term63690.getClass(), "flags", 0);
        setField(term63690, term63690.getClass(), "inputVerifier", null);
        setBooleanField(term63690, term63690.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term63690, term63690.getClass(), "paintingChild", null);
        setField(term63690, term63690.getClass(), "popupMenu", null);
        setField(term63690, term63690.getClass(), "revalidateRunnableScheduled", null);
        setField(term63690, term63690.getClass(), "focusInputMap", null);
        setField(term63690, term63690.getClass(), "ancestorInputMap", null);
        setField(term63690, term63690.getClass(), "windowInputMap", null);
        setField(term63690, term63690.getClass(), "actionMap", null);
        setField(term63690, term63690.getClass(), "aaHint", null);
        setField(term63690, term63690.getClass(), "lcdRenderingHint", null);
        setField(term63690, term63690.getClass(), "component", null);
        setField(term63690, term63690.getClass(), "layoutMgr", null);
        setField(term63690, term63690.getClass(), "dispatcher", null);
        setField(term63690, term63690.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term63690, term63690.getClass(), "focusCycleRoot", false);
        setBooleanField(term63690, term63690.getClass(), "focusTraversalPolicyProvider", false);
        setField(term63690, term63690.getClass(), "printingThreads", null);
        setBooleanField(term63690, term63690.getClass(), "printing", false);
        setField(term63690, term63690.getClass(), "containerListener", null);
        setIntField(term63690, term63690.getClass(), "listeningChildren", 0);
        setIntField(term63690, term63690.getClass(), "listeningBoundsChildren", 0);
        setIntField(term63690, term63690.getClass(), "descendantsCount", 0);
        setField(term63690, term63690.getClass(), "preserveBackgroundColor", null);
        setIntField(term63690, term63690.getClass(), "numOfHWComponents", 0);
        setIntField(term63690, term63690.getClass(), "numOfLWComponents", 0);
        setField(term63690, term63690.getClass(), "modalComp", null);
        setField(term63690, term63690.getClass(), "modalAppContext", null);
        setIntField(term63690, term63690.getClass(), "containerSerializedDataVersion", 0);
        setField(term63690, term63690.getClass(), "peer", null);
        setField(term63690, term63690.getClass(), "parent", null);
        setField(term63690, term63690.getClass(), "appContext", null);
        setIntField(term63690, term63690.getClass(), "x", 0);
        setIntField(term63690, term63690.getClass(), "y", 0);
        setIntField(term63690, term63690.getClass(), "width", 0);
        setIntField(term63690, term63690.getClass(), "height", 0);
        setField(term63690, term63690.getClass(), "foreground", null);
        setField(term63690, term63690.getClass(), "background", null);
        setField(term63690, term63690.getClass(), "font", null);
        setField(term63690, term63690.getClass(), "peerFont", null);
        setField(term63690, term63690.getClass(), "cursor", null);
        setField(term63690, term63690.getClass(), "locale", null);
        setField(term63690, term63690.getClass(), "graphicsConfig", null);
        setField(term63690, term63690.getClass(), "bufferStrategy", null);
        setBooleanField(term63690, term63690.getClass(), "ignoreRepaint", false);
        setBooleanField(term63690, term63690.getClass(), "visible", false);
        setBooleanField(term63690, term63690.getClass(), "enabled", false);
        setBooleanField(term63690, term63690.getClass(), "valid", false);
        setField(term63690, term63690.getClass(), "dropTarget", null);
        setField(term63690, term63690.getClass(), "popups", null);
        setField(term63690, term63690.getClass(), "name", null);
        setBooleanField(term63690, term63690.getClass(), "nameExplicitlySet", false);
        setBooleanField(term63690, term63690.getClass(), "focusable", false);
        setIntField(term63690, term63690.getClass(), "isFocusTraversableOverridden", 0);
        setField(term63690, term63690.getClass(), "focusTraversalKeys", null);
        setBooleanField(term63690, term63690.getClass(), "focusTraversalKeysEnabled", false);
        setField(term63690, term63690.getClass(), "acc", null);
        setField(term63690, term63690.getClass(), "minSize", null);
        setBooleanField(term63690, term63690.getClass(), "minSizeSet", false);
        setField(term63690, term63690.getClass(), "prefSize", null);
        setBooleanField(term63690, term63690.getClass(), "prefSizeSet", false);
        setField(term63690, term63690.getClass(), "maxSize", null);
        setBooleanField(term63690, term63690.getClass(), "maxSizeSet", false);
        setField(term63690, term63690.getClass(), "componentOrientation", null);
        setBooleanField(term63690, term63690.getClass(), "newEventsOnly", false);
        setField(term63690, term63690.getClass(), "componentListener", null);
        setField(term63690, term63690.getClass(), "focusListener", null);
        setField(term63690, term63690.getClass(), "hierarchyListener", null);
        setField(term63690, term63690.getClass(), "hierarchyBoundsListener", null);
        setField(term63690, term63690.getClass(), "keyListener", null);
        setField(term63690, term63690.getClass(), "mouseListener", null);
        setField(term63690, term63690.getClass(), "mouseMotionListener", null);
        setField(term63690, term63690.getClass(), "mouseWheelListener", null);
        setField(term63690, term63690.getClass(), "inputMethodListener", null);
        setLongField(term63690, term63690.getClass(), "eventMask", 0L);
        setField(term63690, term63690.getClass(), "changeSupport", null);
        setField(term63690, term63690.getClass(), "objectLock", null);
        setBooleanField(term63690, term63690.getClass(), "isPacked", false);
        setIntField(term63690, term63690.getClass(), "boundsOp", 0);
        setField(term63690, term63690.getClass(), "compoundShape", null);
        setField(term63690, term63690.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term63690, term63690.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term63690, term63690.getClass(), "backgroundEraseDisabled", false);
        setField(term63690, term63690.getClass(), "eventCache", null);
        setBooleanField(term63690, term63690.getClass(), "coalescingEnabled", false);
        setBooleanField(term63690, term63690.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term63690, term63690.getClass(), "componentSerializedDataVersion", 0);
        setField(term63690, term63690.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.SplitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initComponents", argTypes, term63690, args);
    }

};


