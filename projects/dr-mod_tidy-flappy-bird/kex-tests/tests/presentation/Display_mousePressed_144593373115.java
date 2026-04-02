package presentation;

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
import static presentation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Display_mousePressed_144593373115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2106;

    public Display_mousePressed_144593373115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2106 = newInstance(Class.forName("presentation.Display"));
        setField(term2106, term2106.getClass(), "game", null);
        setBooleanField(term2106, term2106.getClass(), "isAlignmentXSet", false);
        setFloatField(term2106, term2106.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2106, term2106.getClass(), "isAlignmentYSet", false);
        setFloatField(term2106, term2106.getClass(), "alignmentY", 0.0F);
        setField(term2106, term2106.getClass(), "ui", null);
        setField(term2106, term2106.getClass(), "listenerList", null);
        setField(term2106, term2106.getClass(), "clientProperties", null);
        setField(term2106, term2106.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2106, term2106.getClass(), "autoscrolls", false);
        setField(term2106, term2106.getClass(), "border", null);
        setIntField(term2106, term2106.getClass(), "flags", 0);
        setField(term2106, term2106.getClass(), "inputVerifier", null);
        setBooleanField(term2106, term2106.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2106, term2106.getClass(), "paintingChild", null);
        setField(term2106, term2106.getClass(), "popupMenu", null);
        setField(term2106, term2106.getClass(), "revalidateRunnableScheduled", null);
        setField(term2106, term2106.getClass(), "focusInputMap", null);
        setField(term2106, term2106.getClass(), "ancestorInputMap", null);
        setField(term2106, term2106.getClass(), "windowInputMap", null);
        setField(term2106, term2106.getClass(), "actionMap", null);
        setField(term2106, term2106.getClass(), "aaHint", null);
        setField(term2106, term2106.getClass(), "lcdRenderingHint", null);
        setField(term2106, term2106.getClass(), "component", null);
        setField(term2106, term2106.getClass(), "layoutMgr", null);
        setField(term2106, term2106.getClass(), "dispatcher", null);
        setField(term2106, term2106.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2106, term2106.getClass(), "focusCycleRoot", false);
        setBooleanField(term2106, term2106.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2106, term2106.getClass(), "printingThreads", null);
        setBooleanField(term2106, term2106.getClass(), "printing", false);
        setField(term2106, term2106.getClass(), "containerListener", null);
        setIntField(term2106, term2106.getClass(), "listeningChildren", 0);
        setIntField(term2106, term2106.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2106, term2106.getClass(), "descendantsCount", 0);
        setField(term2106, term2106.getClass(), "preserveBackgroundColor", null);
        setIntField(term2106, term2106.getClass(), "numOfHWComponents", 0);
        setIntField(term2106, term2106.getClass(), "numOfLWComponents", 0);
        setField(term2106, term2106.getClass(), "modalComp", null);
        setField(term2106, term2106.getClass(), "modalAppContext", null);
        setIntField(term2106, term2106.getClass(), "containerSerializedDataVersion", 0);
        setField(term2106, term2106.getClass(), "peer", null);
        setField(term2106, term2106.getClass(), "parent", null);
        setField(term2106, term2106.getClass(), "appContext", null);
        setIntField(term2106, term2106.getClass(), "x", 0);
        setIntField(term2106, term2106.getClass(), "y", 0);
        setIntField(term2106, term2106.getClass(), "width", 0);
        setIntField(term2106, term2106.getClass(), "height", 0);
        setField(term2106, term2106.getClass(), "foreground", null);
        setField(term2106, term2106.getClass(), "background", null);
        setField(term2106, term2106.getClass(), "font", null);
        setField(term2106, term2106.getClass(), "peerFont", null);
        setField(term2106, term2106.getClass(), "cursor", null);
        setField(term2106, term2106.getClass(), "locale", null);
        setField(term2106, term2106.getClass(), "graphicsConfig", null);
        setField(term2106, term2106.getClass(), "bufferStrategy", null);
        setBooleanField(term2106, term2106.getClass(), "ignoreRepaint", false);
        setBooleanField(term2106, term2106.getClass(), "visible", false);
        setBooleanField(term2106, term2106.getClass(), "enabled", false);
        setBooleanField(term2106, term2106.getClass(), "valid", false);
        setField(term2106, term2106.getClass(), "dropTarget", null);
        setField(term2106, term2106.getClass(), "popups", null);
        setField(term2106, term2106.getClass(), "name", null);
        setBooleanField(term2106, term2106.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2106, term2106.getClass(), "focusable", false);
        setIntField(term2106, term2106.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2106, term2106.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2106, term2106.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2106, term2106.getClass(), "acc", null);
        setField(term2106, term2106.getClass(), "minSize", null);
        setBooleanField(term2106, term2106.getClass(), "minSizeSet", false);
        setField(term2106, term2106.getClass(), "prefSize", null);
        setBooleanField(term2106, term2106.getClass(), "prefSizeSet", false);
        setField(term2106, term2106.getClass(), "maxSize", null);
        setBooleanField(term2106, term2106.getClass(), "maxSizeSet", false);
        setField(term2106, term2106.getClass(), "componentOrientation", null);
        setBooleanField(term2106, term2106.getClass(), "newEventsOnly", false);
        setField(term2106, term2106.getClass(), "componentListener", null);
        setField(term2106, term2106.getClass(), "focusListener", null);
        setField(term2106, term2106.getClass(), "hierarchyListener", null);
        setField(term2106, term2106.getClass(), "hierarchyBoundsListener", null);
        setField(term2106, term2106.getClass(), "keyListener", null);
        setField(term2106, term2106.getClass(), "mouseListener", null);
        setField(term2106, term2106.getClass(), "mouseMotionListener", null);
        setField(term2106, term2106.getClass(), "mouseWheelListener", null);
        setField(term2106, term2106.getClass(), "inputMethodListener", null);
        setLongField(term2106, term2106.getClass(), "eventMask", 0L);
        setField(term2106, term2106.getClass(), "changeSupport", null);
        setField(term2106, term2106.getClass(), "objectLock", null);
        setBooleanField(term2106, term2106.getClass(), "isPacked", false);
        setIntField(term2106, term2106.getClass(), "boundsOp", 0);
        setField(term2106, term2106.getClass(), "compoundShape", null);
        setField(term2106, term2106.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2106, term2106.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2106, term2106.getClass(), "backgroundEraseDisabled", false);
        setField(term2106, term2106.getClass(), "eventCache", null);
        setBooleanField(term2106, term2106.getClass(), "coalescingEnabled", false);
        setBooleanField(term2106, term2106.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2106, term2106.getClass(), "componentSerializedDataVersion", 0);
        setField(term2106, term2106.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mousePressed", argTypes, term2106, args);
    }

};


