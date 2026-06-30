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

public class Display_mouseReleased_192406287816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;

    public Display_mouseReleased_192406287816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2147 = newInstance(Class.forName("presentation.Display"));
        setField(term2147, term2147.getClass(), "game", null);
        setBooleanField(term2147, term2147.getClass(), "isAlignmentXSet", false);
        setFloatField(term2147, term2147.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2147, term2147.getClass(), "isAlignmentYSet", false);
        setFloatField(term2147, term2147.getClass(), "alignmentY", 0.0F);
        setField(term2147, term2147.getClass(), "ui", null);
        setField(term2147, term2147.getClass(), "listenerList", null);
        setField(term2147, term2147.getClass(), "clientProperties", null);
        setField(term2147, term2147.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2147, term2147.getClass(), "autoscrolls", false);
        setField(term2147, term2147.getClass(), "border", null);
        setIntField(term2147, term2147.getClass(), "flags", 0);
        setField(term2147, term2147.getClass(), "inputVerifier", null);
        setBooleanField(term2147, term2147.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2147, term2147.getClass(), "paintingChild", null);
        setField(term2147, term2147.getClass(), "popupMenu", null);
        setField(term2147, term2147.getClass(), "revalidateRunnableScheduled", null);
        setField(term2147, term2147.getClass(), "focusInputMap", null);
        setField(term2147, term2147.getClass(), "ancestorInputMap", null);
        setField(term2147, term2147.getClass(), "windowInputMap", null);
        setField(term2147, term2147.getClass(), "actionMap", null);
        setField(term2147, term2147.getClass(), "aaHint", null);
        setField(term2147, term2147.getClass(), "lcdRenderingHint", null);
        setField(term2147, term2147.getClass(), "component", null);
        setField(term2147, term2147.getClass(), "layoutMgr", null);
        setField(term2147, term2147.getClass(), "dispatcher", null);
        setField(term2147, term2147.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2147, term2147.getClass(), "focusCycleRoot", false);
        setBooleanField(term2147, term2147.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2147, term2147.getClass(), "printingThreads", null);
        setBooleanField(term2147, term2147.getClass(), "printing", false);
        setField(term2147, term2147.getClass(), "containerListener", null);
        setIntField(term2147, term2147.getClass(), "listeningChildren", 0);
        setIntField(term2147, term2147.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2147, term2147.getClass(), "descendantsCount", 0);
        setField(term2147, term2147.getClass(), "preserveBackgroundColor", null);
        setIntField(term2147, term2147.getClass(), "numOfHWComponents", 0);
        setIntField(term2147, term2147.getClass(), "numOfLWComponents", 0);
        setField(term2147, term2147.getClass(), "modalComp", null);
        setField(term2147, term2147.getClass(), "modalAppContext", null);
        setIntField(term2147, term2147.getClass(), "containerSerializedDataVersion", 0);
        setField(term2147, term2147.getClass(), "peer", null);
        setField(term2147, term2147.getClass(), "parent", null);
        setField(term2147, term2147.getClass(), "appContext", null);
        setIntField(term2147, term2147.getClass(), "x", 0);
        setIntField(term2147, term2147.getClass(), "y", 0);
        setIntField(term2147, term2147.getClass(), "width", 0);
        setIntField(term2147, term2147.getClass(), "height", 0);
        setField(term2147, term2147.getClass(), "foreground", null);
        setField(term2147, term2147.getClass(), "background", null);
        setField(term2147, term2147.getClass(), "font", null);
        setField(term2147, term2147.getClass(), "peerFont", null);
        setField(term2147, term2147.getClass(), "cursor", null);
        setField(term2147, term2147.getClass(), "locale", null);
        setField(term2147, term2147.getClass(), "graphicsConfig", null);
        setField(term2147, term2147.getClass(), "bufferStrategy", null);
        setBooleanField(term2147, term2147.getClass(), "ignoreRepaint", false);
        setBooleanField(term2147, term2147.getClass(), "visible", false);
        setBooleanField(term2147, term2147.getClass(), "enabled", false);
        setBooleanField(term2147, term2147.getClass(), "valid", false);
        setField(term2147, term2147.getClass(), "dropTarget", null);
        setField(term2147, term2147.getClass(), "popups", null);
        setField(term2147, term2147.getClass(), "name", null);
        setBooleanField(term2147, term2147.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2147, term2147.getClass(), "focusable", false);
        setIntField(term2147, term2147.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2147, term2147.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2147, term2147.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2147, term2147.getClass(), "acc", null);
        setField(term2147, term2147.getClass(), "minSize", null);
        setBooleanField(term2147, term2147.getClass(), "minSizeSet", false);
        setField(term2147, term2147.getClass(), "prefSize", null);
        setBooleanField(term2147, term2147.getClass(), "prefSizeSet", false);
        setField(term2147, term2147.getClass(), "maxSize", null);
        setBooleanField(term2147, term2147.getClass(), "maxSizeSet", false);
        setField(term2147, term2147.getClass(), "componentOrientation", null);
        setBooleanField(term2147, term2147.getClass(), "newEventsOnly", false);
        setField(term2147, term2147.getClass(), "componentListener", null);
        setField(term2147, term2147.getClass(), "focusListener", null);
        setField(term2147, term2147.getClass(), "hierarchyListener", null);
        setField(term2147, term2147.getClass(), "hierarchyBoundsListener", null);
        setField(term2147, term2147.getClass(), "keyListener", null);
        setField(term2147, term2147.getClass(), "mouseListener", null);
        setField(term2147, term2147.getClass(), "mouseMotionListener", null);
        setField(term2147, term2147.getClass(), "mouseWheelListener", null);
        setField(term2147, term2147.getClass(), "inputMethodListener", null);
        setLongField(term2147, term2147.getClass(), "eventMask", 0L);
        setField(term2147, term2147.getClass(), "changeSupport", null);
        setField(term2147, term2147.getClass(), "objectLock", null);
        setBooleanField(term2147, term2147.getClass(), "isPacked", false);
        setIntField(term2147, term2147.getClass(), "boundsOp", 0);
        setField(term2147, term2147.getClass(), "compoundShape", null);
        setField(term2147, term2147.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2147, term2147.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2147, term2147.getClass(), "backgroundEraseDisabled", false);
        setField(term2147, term2147.getClass(), "eventCache", null);
        setBooleanField(term2147, term2147.getClass(), "coalescingEnabled", false);
        setBooleanField(term2147, term2147.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2147, term2147.getClass(), "componentSerializedDataVersion", 0);
        setField(term2147, term2147.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseReleased", argTypes, term2147, args);
    }

};


