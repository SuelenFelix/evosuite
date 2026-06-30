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

public class Display_mouseClicked_179377053014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2065;

    public Display_mouseClicked_179377053014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2065 = newInstance(Class.forName("presentation.Display"));
        setField(term2065, term2065.getClass(), "game", null);
        setBooleanField(term2065, term2065.getClass(), "isAlignmentXSet", false);
        setFloatField(term2065, term2065.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2065, term2065.getClass(), "isAlignmentYSet", false);
        setFloatField(term2065, term2065.getClass(), "alignmentY", 0.0F);
        setField(term2065, term2065.getClass(), "ui", null);
        setField(term2065, term2065.getClass(), "listenerList", null);
        setField(term2065, term2065.getClass(), "clientProperties", null);
        setField(term2065, term2065.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2065, term2065.getClass(), "autoscrolls", false);
        setField(term2065, term2065.getClass(), "border", null);
        setIntField(term2065, term2065.getClass(), "flags", 0);
        setField(term2065, term2065.getClass(), "inputVerifier", null);
        setBooleanField(term2065, term2065.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2065, term2065.getClass(), "paintingChild", null);
        setField(term2065, term2065.getClass(), "popupMenu", null);
        setField(term2065, term2065.getClass(), "revalidateRunnableScheduled", null);
        setField(term2065, term2065.getClass(), "focusInputMap", null);
        setField(term2065, term2065.getClass(), "ancestorInputMap", null);
        setField(term2065, term2065.getClass(), "windowInputMap", null);
        setField(term2065, term2065.getClass(), "actionMap", null);
        setField(term2065, term2065.getClass(), "aaHint", null);
        setField(term2065, term2065.getClass(), "lcdRenderingHint", null);
        setField(term2065, term2065.getClass(), "component", null);
        setField(term2065, term2065.getClass(), "layoutMgr", null);
        setField(term2065, term2065.getClass(), "dispatcher", null);
        setField(term2065, term2065.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2065, term2065.getClass(), "focusCycleRoot", false);
        setBooleanField(term2065, term2065.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2065, term2065.getClass(), "printingThreads", null);
        setBooleanField(term2065, term2065.getClass(), "printing", false);
        setField(term2065, term2065.getClass(), "containerListener", null);
        setIntField(term2065, term2065.getClass(), "listeningChildren", 0);
        setIntField(term2065, term2065.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2065, term2065.getClass(), "descendantsCount", 0);
        setField(term2065, term2065.getClass(), "preserveBackgroundColor", null);
        setIntField(term2065, term2065.getClass(), "numOfHWComponents", 0);
        setIntField(term2065, term2065.getClass(), "numOfLWComponents", 0);
        setField(term2065, term2065.getClass(), "modalComp", null);
        setField(term2065, term2065.getClass(), "modalAppContext", null);
        setIntField(term2065, term2065.getClass(), "containerSerializedDataVersion", 0);
        setField(term2065, term2065.getClass(), "peer", null);
        setField(term2065, term2065.getClass(), "parent", null);
        setField(term2065, term2065.getClass(), "appContext", null);
        setIntField(term2065, term2065.getClass(), "x", 0);
        setIntField(term2065, term2065.getClass(), "y", 0);
        setIntField(term2065, term2065.getClass(), "width", 0);
        setIntField(term2065, term2065.getClass(), "height", 0);
        setField(term2065, term2065.getClass(), "foreground", null);
        setField(term2065, term2065.getClass(), "background", null);
        setField(term2065, term2065.getClass(), "font", null);
        setField(term2065, term2065.getClass(), "peerFont", null);
        setField(term2065, term2065.getClass(), "cursor", null);
        setField(term2065, term2065.getClass(), "locale", null);
        setField(term2065, term2065.getClass(), "graphicsConfig", null);
        setField(term2065, term2065.getClass(), "bufferStrategy", null);
        setBooleanField(term2065, term2065.getClass(), "ignoreRepaint", false);
        setBooleanField(term2065, term2065.getClass(), "visible", false);
        setBooleanField(term2065, term2065.getClass(), "enabled", false);
        setBooleanField(term2065, term2065.getClass(), "valid", false);
        setField(term2065, term2065.getClass(), "dropTarget", null);
        setField(term2065, term2065.getClass(), "popups", null);
        setField(term2065, term2065.getClass(), "name", null);
        setBooleanField(term2065, term2065.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2065, term2065.getClass(), "focusable", false);
        setIntField(term2065, term2065.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2065, term2065.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2065, term2065.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2065, term2065.getClass(), "acc", null);
        setField(term2065, term2065.getClass(), "minSize", null);
        setBooleanField(term2065, term2065.getClass(), "minSizeSet", false);
        setField(term2065, term2065.getClass(), "prefSize", null);
        setBooleanField(term2065, term2065.getClass(), "prefSizeSet", false);
        setField(term2065, term2065.getClass(), "maxSize", null);
        setBooleanField(term2065, term2065.getClass(), "maxSizeSet", false);
        setField(term2065, term2065.getClass(), "componentOrientation", null);
        setBooleanField(term2065, term2065.getClass(), "newEventsOnly", false);
        setField(term2065, term2065.getClass(), "componentListener", null);
        setField(term2065, term2065.getClass(), "focusListener", null);
        setField(term2065, term2065.getClass(), "hierarchyListener", null);
        setField(term2065, term2065.getClass(), "hierarchyBoundsListener", null);
        setField(term2065, term2065.getClass(), "keyListener", null);
        setField(term2065, term2065.getClass(), "mouseListener", null);
        setField(term2065, term2065.getClass(), "mouseMotionListener", null);
        setField(term2065, term2065.getClass(), "mouseWheelListener", null);
        setField(term2065, term2065.getClass(), "inputMethodListener", null);
        setLongField(term2065, term2065.getClass(), "eventMask", 0L);
        setField(term2065, term2065.getClass(), "changeSupport", null);
        setField(term2065, term2065.getClass(), "objectLock", null);
        setBooleanField(term2065, term2065.getClass(), "isPacked", false);
        setIntField(term2065, term2065.getClass(), "boundsOp", 0);
        setField(term2065, term2065.getClass(), "compoundShape", null);
        setField(term2065, term2065.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2065, term2065.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2065, term2065.getClass(), "backgroundEraseDisabled", false);
        setField(term2065, term2065.getClass(), "eventCache", null);
        setBooleanField(term2065, term2065.getClass(), "coalescingEnabled", false);
        setBooleanField(term2065, term2065.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2065, term2065.getClass(), "componentSerializedDataVersion", 0);
        setField(term2065, term2065.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseClicked", argTypes, term2065, args);
    }

};


