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

public class Display_keyTyped_140782000519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2270;

    public Display_keyTyped_140782000519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2270 = newInstance(Class.forName("presentation.Display"));
        setField(term2270, term2270.getClass(), "game", null);
        setBooleanField(term2270, term2270.getClass(), "isAlignmentXSet", false);
        setFloatField(term2270, term2270.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2270, term2270.getClass(), "isAlignmentYSet", false);
        setFloatField(term2270, term2270.getClass(), "alignmentY", 0.0F);
        setField(term2270, term2270.getClass(), "ui", null);
        setField(term2270, term2270.getClass(), "listenerList", null);
        setField(term2270, term2270.getClass(), "clientProperties", null);
        setField(term2270, term2270.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2270, term2270.getClass(), "autoscrolls", false);
        setField(term2270, term2270.getClass(), "border", null);
        setIntField(term2270, term2270.getClass(), "flags", 0);
        setField(term2270, term2270.getClass(), "inputVerifier", null);
        setBooleanField(term2270, term2270.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2270, term2270.getClass(), "paintingChild", null);
        setField(term2270, term2270.getClass(), "popupMenu", null);
        setField(term2270, term2270.getClass(), "revalidateRunnableScheduled", null);
        setField(term2270, term2270.getClass(), "focusInputMap", null);
        setField(term2270, term2270.getClass(), "ancestorInputMap", null);
        setField(term2270, term2270.getClass(), "windowInputMap", null);
        setField(term2270, term2270.getClass(), "actionMap", null);
        setField(term2270, term2270.getClass(), "aaHint", null);
        setField(term2270, term2270.getClass(), "lcdRenderingHint", null);
        setField(term2270, term2270.getClass(), "component", null);
        setField(term2270, term2270.getClass(), "layoutMgr", null);
        setField(term2270, term2270.getClass(), "dispatcher", null);
        setField(term2270, term2270.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2270, term2270.getClass(), "focusCycleRoot", false);
        setBooleanField(term2270, term2270.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2270, term2270.getClass(), "printingThreads", null);
        setBooleanField(term2270, term2270.getClass(), "printing", false);
        setField(term2270, term2270.getClass(), "containerListener", null);
        setIntField(term2270, term2270.getClass(), "listeningChildren", 0);
        setIntField(term2270, term2270.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2270, term2270.getClass(), "descendantsCount", 0);
        setField(term2270, term2270.getClass(), "preserveBackgroundColor", null);
        setIntField(term2270, term2270.getClass(), "numOfHWComponents", 0);
        setIntField(term2270, term2270.getClass(), "numOfLWComponents", 0);
        setField(term2270, term2270.getClass(), "modalComp", null);
        setField(term2270, term2270.getClass(), "modalAppContext", null);
        setIntField(term2270, term2270.getClass(), "containerSerializedDataVersion", 0);
        setField(term2270, term2270.getClass(), "peer", null);
        setField(term2270, term2270.getClass(), "parent", null);
        setField(term2270, term2270.getClass(), "appContext", null);
        setIntField(term2270, term2270.getClass(), "x", 0);
        setIntField(term2270, term2270.getClass(), "y", 0);
        setIntField(term2270, term2270.getClass(), "width", 0);
        setIntField(term2270, term2270.getClass(), "height", 0);
        setField(term2270, term2270.getClass(), "foreground", null);
        setField(term2270, term2270.getClass(), "background", null);
        setField(term2270, term2270.getClass(), "font", null);
        setField(term2270, term2270.getClass(), "peerFont", null);
        setField(term2270, term2270.getClass(), "cursor", null);
        setField(term2270, term2270.getClass(), "locale", null);
        setField(term2270, term2270.getClass(), "graphicsConfig", null);
        setField(term2270, term2270.getClass(), "bufferStrategy", null);
        setBooleanField(term2270, term2270.getClass(), "ignoreRepaint", false);
        setBooleanField(term2270, term2270.getClass(), "visible", false);
        setBooleanField(term2270, term2270.getClass(), "enabled", false);
        setBooleanField(term2270, term2270.getClass(), "valid", false);
        setField(term2270, term2270.getClass(), "dropTarget", null);
        setField(term2270, term2270.getClass(), "popups", null);
        setField(term2270, term2270.getClass(), "name", null);
        setBooleanField(term2270, term2270.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2270, term2270.getClass(), "focusable", false);
        setIntField(term2270, term2270.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2270, term2270.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2270, term2270.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2270, term2270.getClass(), "acc", null);
        setField(term2270, term2270.getClass(), "minSize", null);
        setBooleanField(term2270, term2270.getClass(), "minSizeSet", false);
        setField(term2270, term2270.getClass(), "prefSize", null);
        setBooleanField(term2270, term2270.getClass(), "prefSizeSet", false);
        setField(term2270, term2270.getClass(), "maxSize", null);
        setBooleanField(term2270, term2270.getClass(), "maxSizeSet", false);
        setField(term2270, term2270.getClass(), "componentOrientation", null);
        setBooleanField(term2270, term2270.getClass(), "newEventsOnly", false);
        setField(term2270, term2270.getClass(), "componentListener", null);
        setField(term2270, term2270.getClass(), "focusListener", null);
        setField(term2270, term2270.getClass(), "hierarchyListener", null);
        setField(term2270, term2270.getClass(), "hierarchyBoundsListener", null);
        setField(term2270, term2270.getClass(), "keyListener", null);
        setField(term2270, term2270.getClass(), "mouseListener", null);
        setField(term2270, term2270.getClass(), "mouseMotionListener", null);
        setField(term2270, term2270.getClass(), "mouseWheelListener", null);
        setField(term2270, term2270.getClass(), "inputMethodListener", null);
        setLongField(term2270, term2270.getClass(), "eventMask", 0L);
        setField(term2270, term2270.getClass(), "changeSupport", null);
        setField(term2270, term2270.getClass(), "objectLock", null);
        setBooleanField(term2270, term2270.getClass(), "isPacked", false);
        setIntField(term2270, term2270.getClass(), "boundsOp", 0);
        setField(term2270, term2270.getClass(), "compoundShape", null);
        setField(term2270, term2270.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2270, term2270.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2270, term2270.getClass(), "backgroundEraseDisabled", false);
        setField(term2270, term2270.getClass(), "eventCache", null);
        setBooleanField(term2270, term2270.getClass(), "coalescingEnabled", false);
        setBooleanField(term2270, term2270.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2270, term2270.getClass(), "componentSerializedDataVersion", 0);
        setField(term2270, term2270.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyTyped", argTypes, term2270, args);
    }

};


