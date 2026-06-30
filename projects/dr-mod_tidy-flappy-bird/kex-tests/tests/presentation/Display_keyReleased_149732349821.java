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

public class Display_keyReleased_149732349821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2352;

    public Display_keyReleased_149732349821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2352 = newInstance(Class.forName("presentation.Display"));
        setField(term2352, term2352.getClass(), "game", null);
        setBooleanField(term2352, term2352.getClass(), "isAlignmentXSet", false);
        setFloatField(term2352, term2352.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2352, term2352.getClass(), "isAlignmentYSet", false);
        setFloatField(term2352, term2352.getClass(), "alignmentY", 0.0F);
        setField(term2352, term2352.getClass(), "ui", null);
        setField(term2352, term2352.getClass(), "listenerList", null);
        setField(term2352, term2352.getClass(), "clientProperties", null);
        setField(term2352, term2352.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2352, term2352.getClass(), "autoscrolls", false);
        setField(term2352, term2352.getClass(), "border", null);
        setIntField(term2352, term2352.getClass(), "flags", 0);
        setField(term2352, term2352.getClass(), "inputVerifier", null);
        setBooleanField(term2352, term2352.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2352, term2352.getClass(), "paintingChild", null);
        setField(term2352, term2352.getClass(), "popupMenu", null);
        setField(term2352, term2352.getClass(), "revalidateRunnableScheduled", null);
        setField(term2352, term2352.getClass(), "focusInputMap", null);
        setField(term2352, term2352.getClass(), "ancestorInputMap", null);
        setField(term2352, term2352.getClass(), "windowInputMap", null);
        setField(term2352, term2352.getClass(), "actionMap", null);
        setField(term2352, term2352.getClass(), "aaHint", null);
        setField(term2352, term2352.getClass(), "lcdRenderingHint", null);
        setField(term2352, term2352.getClass(), "component", null);
        setField(term2352, term2352.getClass(), "layoutMgr", null);
        setField(term2352, term2352.getClass(), "dispatcher", null);
        setField(term2352, term2352.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2352, term2352.getClass(), "focusCycleRoot", false);
        setBooleanField(term2352, term2352.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2352, term2352.getClass(), "printingThreads", null);
        setBooleanField(term2352, term2352.getClass(), "printing", false);
        setField(term2352, term2352.getClass(), "containerListener", null);
        setIntField(term2352, term2352.getClass(), "listeningChildren", 0);
        setIntField(term2352, term2352.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2352, term2352.getClass(), "descendantsCount", 0);
        setField(term2352, term2352.getClass(), "preserveBackgroundColor", null);
        setIntField(term2352, term2352.getClass(), "numOfHWComponents", 0);
        setIntField(term2352, term2352.getClass(), "numOfLWComponents", 0);
        setField(term2352, term2352.getClass(), "modalComp", null);
        setField(term2352, term2352.getClass(), "modalAppContext", null);
        setIntField(term2352, term2352.getClass(), "containerSerializedDataVersion", 0);
        setField(term2352, term2352.getClass(), "peer", null);
        setField(term2352, term2352.getClass(), "parent", null);
        setField(term2352, term2352.getClass(), "appContext", null);
        setIntField(term2352, term2352.getClass(), "x", 0);
        setIntField(term2352, term2352.getClass(), "y", 0);
        setIntField(term2352, term2352.getClass(), "width", 0);
        setIntField(term2352, term2352.getClass(), "height", 0);
        setField(term2352, term2352.getClass(), "foreground", null);
        setField(term2352, term2352.getClass(), "background", null);
        setField(term2352, term2352.getClass(), "font", null);
        setField(term2352, term2352.getClass(), "peerFont", null);
        setField(term2352, term2352.getClass(), "cursor", null);
        setField(term2352, term2352.getClass(), "locale", null);
        setField(term2352, term2352.getClass(), "graphicsConfig", null);
        setField(term2352, term2352.getClass(), "bufferStrategy", null);
        setBooleanField(term2352, term2352.getClass(), "ignoreRepaint", false);
        setBooleanField(term2352, term2352.getClass(), "visible", false);
        setBooleanField(term2352, term2352.getClass(), "enabled", false);
        setBooleanField(term2352, term2352.getClass(), "valid", false);
        setField(term2352, term2352.getClass(), "dropTarget", null);
        setField(term2352, term2352.getClass(), "popups", null);
        setField(term2352, term2352.getClass(), "name", null);
        setBooleanField(term2352, term2352.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2352, term2352.getClass(), "focusable", false);
        setIntField(term2352, term2352.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2352, term2352.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2352, term2352.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2352, term2352.getClass(), "acc", null);
        setField(term2352, term2352.getClass(), "minSize", null);
        setBooleanField(term2352, term2352.getClass(), "minSizeSet", false);
        setField(term2352, term2352.getClass(), "prefSize", null);
        setBooleanField(term2352, term2352.getClass(), "prefSizeSet", false);
        setField(term2352, term2352.getClass(), "maxSize", null);
        setBooleanField(term2352, term2352.getClass(), "maxSizeSet", false);
        setField(term2352, term2352.getClass(), "componentOrientation", null);
        setBooleanField(term2352, term2352.getClass(), "newEventsOnly", false);
        setField(term2352, term2352.getClass(), "componentListener", null);
        setField(term2352, term2352.getClass(), "focusListener", null);
        setField(term2352, term2352.getClass(), "hierarchyListener", null);
        setField(term2352, term2352.getClass(), "hierarchyBoundsListener", null);
        setField(term2352, term2352.getClass(), "keyListener", null);
        setField(term2352, term2352.getClass(), "mouseListener", null);
        setField(term2352, term2352.getClass(), "mouseMotionListener", null);
        setField(term2352, term2352.getClass(), "mouseWheelListener", null);
        setField(term2352, term2352.getClass(), "inputMethodListener", null);
        setLongField(term2352, term2352.getClass(), "eventMask", 0L);
        setField(term2352, term2352.getClass(), "changeSupport", null);
        setField(term2352, term2352.getClass(), "objectLock", null);
        setBooleanField(term2352, term2352.getClass(), "isPacked", false);
        setIntField(term2352, term2352.getClass(), "boundsOp", 0);
        setField(term2352, term2352.getClass(), "compoundShape", null);
        setField(term2352, term2352.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2352, term2352.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2352, term2352.getClass(), "backgroundEraseDisabled", false);
        setField(term2352, term2352.getClass(), "eventCache", null);
        setBooleanField(term2352, term2352.getClass(), "coalescingEnabled", false);
        setBooleanField(term2352, term2352.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2352, term2352.getClass(), "componentSerializedDataVersion", 0);
        setField(term2352, term2352.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyReleased", argTypes, term2352, args);
    }

};


