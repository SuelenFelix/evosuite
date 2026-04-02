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

public class Display_mouseExited_113902499018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229;

    public Display_mouseExited_113902499018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2229 = newInstance(Class.forName("presentation.Display"));
        setField(term2229, term2229.getClass(), "game", null);
        setBooleanField(term2229, term2229.getClass(), "isAlignmentXSet", false);
        setFloatField(term2229, term2229.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2229, term2229.getClass(), "isAlignmentYSet", false);
        setFloatField(term2229, term2229.getClass(), "alignmentY", 0.0F);
        setField(term2229, term2229.getClass(), "ui", null);
        setField(term2229, term2229.getClass(), "listenerList", null);
        setField(term2229, term2229.getClass(), "clientProperties", null);
        setField(term2229, term2229.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2229, term2229.getClass(), "autoscrolls", false);
        setField(term2229, term2229.getClass(), "border", null);
        setIntField(term2229, term2229.getClass(), "flags", 0);
        setField(term2229, term2229.getClass(), "inputVerifier", null);
        setBooleanField(term2229, term2229.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2229, term2229.getClass(), "paintingChild", null);
        setField(term2229, term2229.getClass(), "popupMenu", null);
        setField(term2229, term2229.getClass(), "revalidateRunnableScheduled", null);
        setField(term2229, term2229.getClass(), "focusInputMap", null);
        setField(term2229, term2229.getClass(), "ancestorInputMap", null);
        setField(term2229, term2229.getClass(), "windowInputMap", null);
        setField(term2229, term2229.getClass(), "actionMap", null);
        setField(term2229, term2229.getClass(), "aaHint", null);
        setField(term2229, term2229.getClass(), "lcdRenderingHint", null);
        setField(term2229, term2229.getClass(), "component", null);
        setField(term2229, term2229.getClass(), "layoutMgr", null);
        setField(term2229, term2229.getClass(), "dispatcher", null);
        setField(term2229, term2229.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2229, term2229.getClass(), "focusCycleRoot", false);
        setBooleanField(term2229, term2229.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2229, term2229.getClass(), "printingThreads", null);
        setBooleanField(term2229, term2229.getClass(), "printing", false);
        setField(term2229, term2229.getClass(), "containerListener", null);
        setIntField(term2229, term2229.getClass(), "listeningChildren", 0);
        setIntField(term2229, term2229.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2229, term2229.getClass(), "descendantsCount", 0);
        setField(term2229, term2229.getClass(), "preserveBackgroundColor", null);
        setIntField(term2229, term2229.getClass(), "numOfHWComponents", 0);
        setIntField(term2229, term2229.getClass(), "numOfLWComponents", 0);
        setField(term2229, term2229.getClass(), "modalComp", null);
        setField(term2229, term2229.getClass(), "modalAppContext", null);
        setIntField(term2229, term2229.getClass(), "containerSerializedDataVersion", 0);
        setField(term2229, term2229.getClass(), "peer", null);
        setField(term2229, term2229.getClass(), "parent", null);
        setField(term2229, term2229.getClass(), "appContext", null);
        setIntField(term2229, term2229.getClass(), "x", 0);
        setIntField(term2229, term2229.getClass(), "y", 0);
        setIntField(term2229, term2229.getClass(), "width", 0);
        setIntField(term2229, term2229.getClass(), "height", 0);
        setField(term2229, term2229.getClass(), "foreground", null);
        setField(term2229, term2229.getClass(), "background", null);
        setField(term2229, term2229.getClass(), "font", null);
        setField(term2229, term2229.getClass(), "peerFont", null);
        setField(term2229, term2229.getClass(), "cursor", null);
        setField(term2229, term2229.getClass(), "locale", null);
        setField(term2229, term2229.getClass(), "graphicsConfig", null);
        setField(term2229, term2229.getClass(), "bufferStrategy", null);
        setBooleanField(term2229, term2229.getClass(), "ignoreRepaint", false);
        setBooleanField(term2229, term2229.getClass(), "visible", false);
        setBooleanField(term2229, term2229.getClass(), "enabled", false);
        setBooleanField(term2229, term2229.getClass(), "valid", false);
        setField(term2229, term2229.getClass(), "dropTarget", null);
        setField(term2229, term2229.getClass(), "popups", null);
        setField(term2229, term2229.getClass(), "name", null);
        setBooleanField(term2229, term2229.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2229, term2229.getClass(), "focusable", false);
        setIntField(term2229, term2229.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2229, term2229.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2229, term2229.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2229, term2229.getClass(), "acc", null);
        setField(term2229, term2229.getClass(), "minSize", null);
        setBooleanField(term2229, term2229.getClass(), "minSizeSet", false);
        setField(term2229, term2229.getClass(), "prefSize", null);
        setBooleanField(term2229, term2229.getClass(), "prefSizeSet", false);
        setField(term2229, term2229.getClass(), "maxSize", null);
        setBooleanField(term2229, term2229.getClass(), "maxSizeSet", false);
        setField(term2229, term2229.getClass(), "componentOrientation", null);
        setBooleanField(term2229, term2229.getClass(), "newEventsOnly", false);
        setField(term2229, term2229.getClass(), "componentListener", null);
        setField(term2229, term2229.getClass(), "focusListener", null);
        setField(term2229, term2229.getClass(), "hierarchyListener", null);
        setField(term2229, term2229.getClass(), "hierarchyBoundsListener", null);
        setField(term2229, term2229.getClass(), "keyListener", null);
        setField(term2229, term2229.getClass(), "mouseListener", null);
        setField(term2229, term2229.getClass(), "mouseMotionListener", null);
        setField(term2229, term2229.getClass(), "mouseWheelListener", null);
        setField(term2229, term2229.getClass(), "inputMethodListener", null);
        setLongField(term2229, term2229.getClass(), "eventMask", 0L);
        setField(term2229, term2229.getClass(), "changeSupport", null);
        setField(term2229, term2229.getClass(), "objectLock", null);
        setBooleanField(term2229, term2229.getClass(), "isPacked", false);
        setIntField(term2229, term2229.getClass(), "boundsOp", 0);
        setField(term2229, term2229.getClass(), "compoundShape", null);
        setField(term2229, term2229.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2229, term2229.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2229, term2229.getClass(), "backgroundEraseDisabled", false);
        setField(term2229, term2229.getClass(), "eventCache", null);
        setBooleanField(term2229, term2229.getClass(), "coalescingEnabled", false);
        setBooleanField(term2229, term2229.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2229, term2229.getClass(), "componentSerializedDataVersion", 0);
        setField(term2229, term2229.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseExited", argTypes, term2229, args);
    }

};


