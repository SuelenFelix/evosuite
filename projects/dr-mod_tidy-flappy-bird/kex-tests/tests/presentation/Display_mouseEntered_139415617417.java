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

public class Display_mouseEntered_139415617417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2188;

    public Display_mouseEntered_139415617417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2188 = newInstance(Class.forName("presentation.Display"));
        setField(term2188, term2188.getClass(), "game", null);
        setBooleanField(term2188, term2188.getClass(), "isAlignmentXSet", false);
        setFloatField(term2188, term2188.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2188, term2188.getClass(), "isAlignmentYSet", false);
        setFloatField(term2188, term2188.getClass(), "alignmentY", 0.0F);
        setField(term2188, term2188.getClass(), "ui", null);
        setField(term2188, term2188.getClass(), "listenerList", null);
        setField(term2188, term2188.getClass(), "clientProperties", null);
        setField(term2188, term2188.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2188, term2188.getClass(), "autoscrolls", false);
        setField(term2188, term2188.getClass(), "border", null);
        setIntField(term2188, term2188.getClass(), "flags", 0);
        setField(term2188, term2188.getClass(), "inputVerifier", null);
        setBooleanField(term2188, term2188.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2188, term2188.getClass(), "paintingChild", null);
        setField(term2188, term2188.getClass(), "popupMenu", null);
        setField(term2188, term2188.getClass(), "revalidateRunnableScheduled", null);
        setField(term2188, term2188.getClass(), "focusInputMap", null);
        setField(term2188, term2188.getClass(), "ancestorInputMap", null);
        setField(term2188, term2188.getClass(), "windowInputMap", null);
        setField(term2188, term2188.getClass(), "actionMap", null);
        setField(term2188, term2188.getClass(), "aaHint", null);
        setField(term2188, term2188.getClass(), "lcdRenderingHint", null);
        setField(term2188, term2188.getClass(), "component", null);
        setField(term2188, term2188.getClass(), "layoutMgr", null);
        setField(term2188, term2188.getClass(), "dispatcher", null);
        setField(term2188, term2188.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2188, term2188.getClass(), "focusCycleRoot", false);
        setBooleanField(term2188, term2188.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2188, term2188.getClass(), "printingThreads", null);
        setBooleanField(term2188, term2188.getClass(), "printing", false);
        setField(term2188, term2188.getClass(), "containerListener", null);
        setIntField(term2188, term2188.getClass(), "listeningChildren", 0);
        setIntField(term2188, term2188.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2188, term2188.getClass(), "descendantsCount", 0);
        setField(term2188, term2188.getClass(), "preserveBackgroundColor", null);
        setIntField(term2188, term2188.getClass(), "numOfHWComponents", 0);
        setIntField(term2188, term2188.getClass(), "numOfLWComponents", 0);
        setField(term2188, term2188.getClass(), "modalComp", null);
        setField(term2188, term2188.getClass(), "modalAppContext", null);
        setIntField(term2188, term2188.getClass(), "containerSerializedDataVersion", 0);
        setField(term2188, term2188.getClass(), "peer", null);
        setField(term2188, term2188.getClass(), "parent", null);
        setField(term2188, term2188.getClass(), "appContext", null);
        setIntField(term2188, term2188.getClass(), "x", 0);
        setIntField(term2188, term2188.getClass(), "y", 0);
        setIntField(term2188, term2188.getClass(), "width", 0);
        setIntField(term2188, term2188.getClass(), "height", 0);
        setField(term2188, term2188.getClass(), "foreground", null);
        setField(term2188, term2188.getClass(), "background", null);
        setField(term2188, term2188.getClass(), "font", null);
        setField(term2188, term2188.getClass(), "peerFont", null);
        setField(term2188, term2188.getClass(), "cursor", null);
        setField(term2188, term2188.getClass(), "locale", null);
        setField(term2188, term2188.getClass(), "graphicsConfig", null);
        setField(term2188, term2188.getClass(), "bufferStrategy", null);
        setBooleanField(term2188, term2188.getClass(), "ignoreRepaint", false);
        setBooleanField(term2188, term2188.getClass(), "visible", false);
        setBooleanField(term2188, term2188.getClass(), "enabled", false);
        setBooleanField(term2188, term2188.getClass(), "valid", false);
        setField(term2188, term2188.getClass(), "dropTarget", null);
        setField(term2188, term2188.getClass(), "popups", null);
        setField(term2188, term2188.getClass(), "name", null);
        setBooleanField(term2188, term2188.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2188, term2188.getClass(), "focusable", false);
        setIntField(term2188, term2188.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2188, term2188.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2188, term2188.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2188, term2188.getClass(), "acc", null);
        setField(term2188, term2188.getClass(), "minSize", null);
        setBooleanField(term2188, term2188.getClass(), "minSizeSet", false);
        setField(term2188, term2188.getClass(), "prefSize", null);
        setBooleanField(term2188, term2188.getClass(), "prefSizeSet", false);
        setField(term2188, term2188.getClass(), "maxSize", null);
        setBooleanField(term2188, term2188.getClass(), "maxSizeSet", false);
        setField(term2188, term2188.getClass(), "componentOrientation", null);
        setBooleanField(term2188, term2188.getClass(), "newEventsOnly", false);
        setField(term2188, term2188.getClass(), "componentListener", null);
        setField(term2188, term2188.getClass(), "focusListener", null);
        setField(term2188, term2188.getClass(), "hierarchyListener", null);
        setField(term2188, term2188.getClass(), "hierarchyBoundsListener", null);
        setField(term2188, term2188.getClass(), "keyListener", null);
        setField(term2188, term2188.getClass(), "mouseListener", null);
        setField(term2188, term2188.getClass(), "mouseMotionListener", null);
        setField(term2188, term2188.getClass(), "mouseWheelListener", null);
        setField(term2188, term2188.getClass(), "inputMethodListener", null);
        setLongField(term2188, term2188.getClass(), "eventMask", 0L);
        setField(term2188, term2188.getClass(), "changeSupport", null);
        setField(term2188, term2188.getClass(), "objectLock", null);
        setBooleanField(term2188, term2188.getClass(), "isPacked", false);
        setIntField(term2188, term2188.getClass(), "boundsOp", 0);
        setField(term2188, term2188.getClass(), "compoundShape", null);
        setField(term2188, term2188.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2188, term2188.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2188, term2188.getClass(), "backgroundEraseDisabled", false);
        setField(term2188, term2188.getClass(), "eventCache", null);
        setBooleanField(term2188, term2188.getClass(), "coalescingEnabled", false);
        setBooleanField(term2188, term2188.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2188, term2188.getClass(), "componentSerializedDataVersion", 0);
        setField(term2188, term2188.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseEntered", argTypes, term2188, args);
    }

};


