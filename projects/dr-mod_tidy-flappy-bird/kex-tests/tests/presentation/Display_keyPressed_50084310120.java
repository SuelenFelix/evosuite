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

public class Display_keyPressed_50084310120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2311;

    public Display_keyPressed_50084310120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2311 = newInstance(Class.forName("presentation.Display"));
        setField(term2311, term2311.getClass(), "game", null);
        setBooleanField(term2311, term2311.getClass(), "isAlignmentXSet", false);
        setFloatField(term2311, term2311.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2311, term2311.getClass(), "isAlignmentYSet", false);
        setFloatField(term2311, term2311.getClass(), "alignmentY", 0.0F);
        setField(term2311, term2311.getClass(), "ui", null);
        setField(term2311, term2311.getClass(), "listenerList", null);
        setField(term2311, term2311.getClass(), "clientProperties", null);
        setField(term2311, term2311.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2311, term2311.getClass(), "autoscrolls", false);
        setField(term2311, term2311.getClass(), "border", null);
        setIntField(term2311, term2311.getClass(), "flags", 0);
        setField(term2311, term2311.getClass(), "inputVerifier", null);
        setBooleanField(term2311, term2311.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2311, term2311.getClass(), "paintingChild", null);
        setField(term2311, term2311.getClass(), "popupMenu", null);
        setField(term2311, term2311.getClass(), "revalidateRunnableScheduled", null);
        setField(term2311, term2311.getClass(), "focusInputMap", null);
        setField(term2311, term2311.getClass(), "ancestorInputMap", null);
        setField(term2311, term2311.getClass(), "windowInputMap", null);
        setField(term2311, term2311.getClass(), "actionMap", null);
        setField(term2311, term2311.getClass(), "aaHint", null);
        setField(term2311, term2311.getClass(), "lcdRenderingHint", null);
        setField(term2311, term2311.getClass(), "component", null);
        setField(term2311, term2311.getClass(), "layoutMgr", null);
        setField(term2311, term2311.getClass(), "dispatcher", null);
        setField(term2311, term2311.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2311, term2311.getClass(), "focusCycleRoot", false);
        setBooleanField(term2311, term2311.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2311, term2311.getClass(), "printingThreads", null);
        setBooleanField(term2311, term2311.getClass(), "printing", false);
        setField(term2311, term2311.getClass(), "containerListener", null);
        setIntField(term2311, term2311.getClass(), "listeningChildren", 0);
        setIntField(term2311, term2311.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2311, term2311.getClass(), "descendantsCount", 0);
        setField(term2311, term2311.getClass(), "preserveBackgroundColor", null);
        setIntField(term2311, term2311.getClass(), "numOfHWComponents", 0);
        setIntField(term2311, term2311.getClass(), "numOfLWComponents", 0);
        setField(term2311, term2311.getClass(), "modalComp", null);
        setField(term2311, term2311.getClass(), "modalAppContext", null);
        setIntField(term2311, term2311.getClass(), "containerSerializedDataVersion", 0);
        setField(term2311, term2311.getClass(), "peer", null);
        setField(term2311, term2311.getClass(), "parent", null);
        setField(term2311, term2311.getClass(), "appContext", null);
        setIntField(term2311, term2311.getClass(), "x", 0);
        setIntField(term2311, term2311.getClass(), "y", 0);
        setIntField(term2311, term2311.getClass(), "width", 0);
        setIntField(term2311, term2311.getClass(), "height", 0);
        setField(term2311, term2311.getClass(), "foreground", null);
        setField(term2311, term2311.getClass(), "background", null);
        setField(term2311, term2311.getClass(), "font", null);
        setField(term2311, term2311.getClass(), "peerFont", null);
        setField(term2311, term2311.getClass(), "cursor", null);
        setField(term2311, term2311.getClass(), "locale", null);
        setField(term2311, term2311.getClass(), "graphicsConfig", null);
        setField(term2311, term2311.getClass(), "bufferStrategy", null);
        setBooleanField(term2311, term2311.getClass(), "ignoreRepaint", false);
        setBooleanField(term2311, term2311.getClass(), "visible", false);
        setBooleanField(term2311, term2311.getClass(), "enabled", false);
        setBooleanField(term2311, term2311.getClass(), "valid", false);
        setField(term2311, term2311.getClass(), "dropTarget", null);
        setField(term2311, term2311.getClass(), "popups", null);
        setField(term2311, term2311.getClass(), "name", null);
        setBooleanField(term2311, term2311.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2311, term2311.getClass(), "focusable", false);
        setIntField(term2311, term2311.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2311, term2311.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2311, term2311.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2311, term2311.getClass(), "acc", null);
        setField(term2311, term2311.getClass(), "minSize", null);
        setBooleanField(term2311, term2311.getClass(), "minSizeSet", false);
        setField(term2311, term2311.getClass(), "prefSize", null);
        setBooleanField(term2311, term2311.getClass(), "prefSizeSet", false);
        setField(term2311, term2311.getClass(), "maxSize", null);
        setBooleanField(term2311, term2311.getClass(), "maxSizeSet", false);
        setField(term2311, term2311.getClass(), "componentOrientation", null);
        setBooleanField(term2311, term2311.getClass(), "newEventsOnly", false);
        setField(term2311, term2311.getClass(), "componentListener", null);
        setField(term2311, term2311.getClass(), "focusListener", null);
        setField(term2311, term2311.getClass(), "hierarchyListener", null);
        setField(term2311, term2311.getClass(), "hierarchyBoundsListener", null);
        setField(term2311, term2311.getClass(), "keyListener", null);
        setField(term2311, term2311.getClass(), "mouseListener", null);
        setField(term2311, term2311.getClass(), "mouseMotionListener", null);
        setField(term2311, term2311.getClass(), "mouseWheelListener", null);
        setField(term2311, term2311.getClass(), "inputMethodListener", null);
        setLongField(term2311, term2311.getClass(), "eventMask", 0L);
        setField(term2311, term2311.getClass(), "changeSupport", null);
        setField(term2311, term2311.getClass(), "objectLock", null);
        setBooleanField(term2311, term2311.getClass(), "isPacked", false);
        setIntField(term2311, term2311.getClass(), "boundsOp", 0);
        setField(term2311, term2311.getClass(), "compoundShape", null);
        setField(term2311, term2311.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2311, term2311.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2311, term2311.getClass(), "backgroundEraseDisabled", false);
        setField(term2311, term2311.getClass(), "eventCache", null);
        setBooleanField(term2311, term2311.getClass(), "coalescingEnabled", false);
        setBooleanField(term2311, term2311.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2311, term2311.getClass(), "componentSerializedDataVersion", 0);
        setField(term2311, term2311.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyPressed", argTypes, term2311, args);
    }

};


