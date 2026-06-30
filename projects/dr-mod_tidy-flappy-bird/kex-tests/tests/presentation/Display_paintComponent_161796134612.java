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

public class Display_paintComponent_161796134612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1983;

    public Display_paintComponent_161796134612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1983 = newInstance(Class.forName("presentation.Display"));
        setField(term1983, term1983.getClass(), "game", null);
        setBooleanField(term1983, term1983.getClass(), "isAlignmentXSet", false);
        setFloatField(term1983, term1983.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1983, term1983.getClass(), "isAlignmentYSet", false);
        setFloatField(term1983, term1983.getClass(), "alignmentY", 0.0F);
        setField(term1983, term1983.getClass(), "ui", null);
        setField(term1983, term1983.getClass(), "listenerList", null);
        setField(term1983, term1983.getClass(), "clientProperties", null);
        setField(term1983, term1983.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1983, term1983.getClass(), "autoscrolls", false);
        setField(term1983, term1983.getClass(), "border", null);
        setIntField(term1983, term1983.getClass(), "flags", 0);
        setField(term1983, term1983.getClass(), "inputVerifier", null);
        setBooleanField(term1983, term1983.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1983, term1983.getClass(), "paintingChild", null);
        setField(term1983, term1983.getClass(), "popupMenu", null);
        setField(term1983, term1983.getClass(), "revalidateRunnableScheduled", null);
        setField(term1983, term1983.getClass(), "focusInputMap", null);
        setField(term1983, term1983.getClass(), "ancestorInputMap", null);
        setField(term1983, term1983.getClass(), "windowInputMap", null);
        setField(term1983, term1983.getClass(), "actionMap", null);
        setField(term1983, term1983.getClass(), "aaHint", null);
        setField(term1983, term1983.getClass(), "lcdRenderingHint", null);
        setField(term1983, term1983.getClass(), "component", null);
        setField(term1983, term1983.getClass(), "layoutMgr", null);
        setField(term1983, term1983.getClass(), "dispatcher", null);
        setField(term1983, term1983.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1983, term1983.getClass(), "focusCycleRoot", false);
        setBooleanField(term1983, term1983.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1983, term1983.getClass(), "printingThreads", null);
        setBooleanField(term1983, term1983.getClass(), "printing", false);
        setField(term1983, term1983.getClass(), "containerListener", null);
        setIntField(term1983, term1983.getClass(), "listeningChildren", 0);
        setIntField(term1983, term1983.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1983, term1983.getClass(), "descendantsCount", 0);
        setField(term1983, term1983.getClass(), "preserveBackgroundColor", null);
        setIntField(term1983, term1983.getClass(), "numOfHWComponents", 0);
        setIntField(term1983, term1983.getClass(), "numOfLWComponents", 0);
        setField(term1983, term1983.getClass(), "modalComp", null);
        setField(term1983, term1983.getClass(), "modalAppContext", null);
        setIntField(term1983, term1983.getClass(), "containerSerializedDataVersion", 0);
        setField(term1983, term1983.getClass(), "peer", null);
        setField(term1983, term1983.getClass(), "parent", null);
        setField(term1983, term1983.getClass(), "appContext", null);
        setIntField(term1983, term1983.getClass(), "x", 0);
        setIntField(term1983, term1983.getClass(), "y", 0);
        setIntField(term1983, term1983.getClass(), "width", 0);
        setIntField(term1983, term1983.getClass(), "height", 0);
        setField(term1983, term1983.getClass(), "foreground", null);
        setField(term1983, term1983.getClass(), "background", null);
        setField(term1983, term1983.getClass(), "font", null);
        setField(term1983, term1983.getClass(), "peerFont", null);
        setField(term1983, term1983.getClass(), "cursor", null);
        setField(term1983, term1983.getClass(), "locale", null);
        setField(term1983, term1983.getClass(), "graphicsConfig", null);
        setField(term1983, term1983.getClass(), "bufferStrategy", null);
        setBooleanField(term1983, term1983.getClass(), "ignoreRepaint", false);
        setBooleanField(term1983, term1983.getClass(), "visible", false);
        setBooleanField(term1983, term1983.getClass(), "enabled", false);
        setBooleanField(term1983, term1983.getClass(), "valid", false);
        setField(term1983, term1983.getClass(), "dropTarget", null);
        setField(term1983, term1983.getClass(), "popups", null);
        setField(term1983, term1983.getClass(), "name", null);
        setBooleanField(term1983, term1983.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1983, term1983.getClass(), "focusable", false);
        setIntField(term1983, term1983.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1983, term1983.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1983, term1983.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1983, term1983.getClass(), "acc", null);
        setField(term1983, term1983.getClass(), "minSize", null);
        setBooleanField(term1983, term1983.getClass(), "minSizeSet", false);
        setField(term1983, term1983.getClass(), "prefSize", null);
        setBooleanField(term1983, term1983.getClass(), "prefSizeSet", false);
        setField(term1983, term1983.getClass(), "maxSize", null);
        setBooleanField(term1983, term1983.getClass(), "maxSizeSet", false);
        setField(term1983, term1983.getClass(), "componentOrientation", null);
        setBooleanField(term1983, term1983.getClass(), "newEventsOnly", false);
        setField(term1983, term1983.getClass(), "componentListener", null);
        setField(term1983, term1983.getClass(), "focusListener", null);
        setField(term1983, term1983.getClass(), "hierarchyListener", null);
        setField(term1983, term1983.getClass(), "hierarchyBoundsListener", null);
        setField(term1983, term1983.getClass(), "keyListener", null);
        setField(term1983, term1983.getClass(), "mouseListener", null);
        setField(term1983, term1983.getClass(), "mouseMotionListener", null);
        setField(term1983, term1983.getClass(), "mouseWheelListener", null);
        setField(term1983, term1983.getClass(), "inputMethodListener", null);
        setLongField(term1983, term1983.getClass(), "eventMask", 0L);
        setField(term1983, term1983.getClass(), "changeSupport", null);
        setField(term1983, term1983.getClass(), "objectLock", null);
        setBooleanField(term1983, term1983.getClass(), "isPacked", false);
        setIntField(term1983, term1983.getClass(), "boundsOp", 0);
        setField(term1983, term1983.getClass(), "compoundShape", null);
        setField(term1983, term1983.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1983, term1983.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1983, term1983.getClass(), "backgroundEraseDisabled", false);
        setField(term1983, term1983.getClass(), "eventCache", null);
        setBooleanField(term1983, term1983.getClass(), "coalescingEnabled", false);
        setBooleanField(term1983, term1983.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1983, term1983.getClass(), "componentSerializedDataVersion", 0);
        setField(term1983, term1983.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term1983, args);
    }

};


