package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrderTableButtons_initComponents_15182411143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57583;

    public OrderTableButtons_initComponents_15182411143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57583 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.OrderTableButtons"));
        setField(term57583, term57583.getClass(), "downBtn", null);
        setField(term57583, term57583.getClass(), "jLayeredPane1", null);
        setField(term57583, term57583.getClass(), "upBtn", null);
        setBooleanField(term57583, term57583.getClass(), "isAlignmentXSet", false);
        setFloatField(term57583, term57583.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57583, term57583.getClass(), "isAlignmentYSet", false);
        setFloatField(term57583, term57583.getClass(), "alignmentY", 0.0F);
        setField(term57583, term57583.getClass(), "ui", null);
        setField(term57583, term57583.getClass(), "listenerList", null);
        setField(term57583, term57583.getClass(), "clientProperties", null);
        setField(term57583, term57583.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57583, term57583.getClass(), "autoscrolls", false);
        setField(term57583, term57583.getClass(), "border", null);
        setIntField(term57583, term57583.getClass(), "flags", 0);
        setField(term57583, term57583.getClass(), "inputVerifier", null);
        setBooleanField(term57583, term57583.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57583, term57583.getClass(), "paintingChild", null);
        setField(term57583, term57583.getClass(), "popupMenu", null);
        setField(term57583, term57583.getClass(), "revalidateRunnableScheduled", null);
        setField(term57583, term57583.getClass(), "focusInputMap", null);
        setField(term57583, term57583.getClass(), "ancestorInputMap", null);
        setField(term57583, term57583.getClass(), "windowInputMap", null);
        setField(term57583, term57583.getClass(), "actionMap", null);
        setField(term57583, term57583.getClass(), "aaHint", null);
        setField(term57583, term57583.getClass(), "lcdRenderingHint", null);
        setField(term57583, term57583.getClass(), "component", null);
        setField(term57583, term57583.getClass(), "layoutMgr", null);
        setField(term57583, term57583.getClass(), "dispatcher", null);
        setField(term57583, term57583.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57583, term57583.getClass(), "focusCycleRoot", false);
        setBooleanField(term57583, term57583.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57583, term57583.getClass(), "printingThreads", null);
        setBooleanField(term57583, term57583.getClass(), "printing", false);
        setField(term57583, term57583.getClass(), "containerListener", null);
        setIntField(term57583, term57583.getClass(), "listeningChildren", 0);
        setIntField(term57583, term57583.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57583, term57583.getClass(), "descendantsCount", 0);
        setField(term57583, term57583.getClass(), "preserveBackgroundColor", null);
        setIntField(term57583, term57583.getClass(), "numOfHWComponents", 0);
        setIntField(term57583, term57583.getClass(), "numOfLWComponents", 0);
        setField(term57583, term57583.getClass(), "modalComp", null);
        setField(term57583, term57583.getClass(), "modalAppContext", null);
        setIntField(term57583, term57583.getClass(), "containerSerializedDataVersion", 0);
        setField(term57583, term57583.getClass(), "peer", null);
        setField(term57583, term57583.getClass(), "parent", null);
        setField(term57583, term57583.getClass(), "appContext", null);
        setIntField(term57583, term57583.getClass(), "x", 0);
        setIntField(term57583, term57583.getClass(), "y", 0);
        setIntField(term57583, term57583.getClass(), "width", 0);
        setIntField(term57583, term57583.getClass(), "height", 0);
        setField(term57583, term57583.getClass(), "foreground", null);
        setField(term57583, term57583.getClass(), "background", null);
        setField(term57583, term57583.getClass(), "font", null);
        setField(term57583, term57583.getClass(), "peerFont", null);
        setField(term57583, term57583.getClass(), "cursor", null);
        setField(term57583, term57583.getClass(), "locale", null);
        setField(term57583, term57583.getClass(), "graphicsConfig", null);
        setField(term57583, term57583.getClass(), "bufferStrategy", null);
        setBooleanField(term57583, term57583.getClass(), "ignoreRepaint", false);
        setBooleanField(term57583, term57583.getClass(), "visible", false);
        setBooleanField(term57583, term57583.getClass(), "enabled", false);
        setBooleanField(term57583, term57583.getClass(), "valid", false);
        setField(term57583, term57583.getClass(), "dropTarget", null);
        setField(term57583, term57583.getClass(), "popups", null);
        setField(term57583, term57583.getClass(), "name", null);
        setBooleanField(term57583, term57583.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57583, term57583.getClass(), "focusable", false);
        setIntField(term57583, term57583.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57583, term57583.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57583, term57583.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57583, term57583.getClass(), "acc", null);
        setField(term57583, term57583.getClass(), "minSize", null);
        setBooleanField(term57583, term57583.getClass(), "minSizeSet", false);
        setField(term57583, term57583.getClass(), "prefSize", null);
        setBooleanField(term57583, term57583.getClass(), "prefSizeSet", false);
        setField(term57583, term57583.getClass(), "maxSize", null);
        setBooleanField(term57583, term57583.getClass(), "maxSizeSet", false);
        setField(term57583, term57583.getClass(), "componentOrientation", null);
        setBooleanField(term57583, term57583.getClass(), "newEventsOnly", false);
        setField(term57583, term57583.getClass(), "componentListener", null);
        setField(term57583, term57583.getClass(), "focusListener", null);
        setField(term57583, term57583.getClass(), "hierarchyListener", null);
        setField(term57583, term57583.getClass(), "hierarchyBoundsListener", null);
        setField(term57583, term57583.getClass(), "keyListener", null);
        setField(term57583, term57583.getClass(), "mouseListener", null);
        setField(term57583, term57583.getClass(), "mouseMotionListener", null);
        setField(term57583, term57583.getClass(), "mouseWheelListener", null);
        setField(term57583, term57583.getClass(), "inputMethodListener", null);
        setLongField(term57583, term57583.getClass(), "eventMask", 0L);
        setField(term57583, term57583.getClass(), "changeSupport", null);
        setField(term57583, term57583.getClass(), "objectLock", null);
        setBooleanField(term57583, term57583.getClass(), "isPacked", false);
        setIntField(term57583, term57583.getClass(), "boundsOp", 0);
        setField(term57583, term57583.getClass(), "compoundShape", null);
        setField(term57583, term57583.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57583, term57583.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57583, term57583.getClass(), "backgroundEraseDisabled", false);
        setField(term57583, term57583.getClass(), "eventCache", null);
        setBooleanField(term57583, term57583.getClass(), "coalescingEnabled", false);
        setBooleanField(term57583, term57583.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57583, term57583.getClass(), "componentSerializedDataVersion", 0);
        setField(term57583, term57583.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.OrderTableButtons");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initComponents", argTypes, term57583, args);
    }

};


