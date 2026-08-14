package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KSeparator_setPreferences_6341943213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66963;

    public KSeparator_setPreferences_6341943213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66963 = newInstance(Class.forName("proto.KSeparator"));
        setIntField(term66963, term66963.getClass(), "orientation", 0);
        setBooleanField(term66963, term66963.getClass(), "isAlignmentXSet", false);
        setFloatField(term66963, term66963.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66963, term66963.getClass(), "isAlignmentYSet", false);
        setFloatField(term66963, term66963.getClass(), "alignmentY", 0.0F);
        setField(term66963, term66963.getClass(), "ui", null);
        setField(term66963, term66963.getClass(), "listenerList", null);
        setField(term66963, term66963.getClass(), "clientProperties", null);
        setField(term66963, term66963.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66963, term66963.getClass(), "autoscrolls", false);
        setField(term66963, term66963.getClass(), "border", null);
        setIntField(term66963, term66963.getClass(), "flags", 0);
        setField(term66963, term66963.getClass(), "inputVerifier", null);
        setBooleanField(term66963, term66963.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66963, term66963.getClass(), "paintingChild", null);
        setField(term66963, term66963.getClass(), "popupMenu", null);
        setField(term66963, term66963.getClass(), "revalidateRunnableScheduled", null);
        setField(term66963, term66963.getClass(), "focusInputMap", null);
        setField(term66963, term66963.getClass(), "ancestorInputMap", null);
        setField(term66963, term66963.getClass(), "windowInputMap", null);
        setField(term66963, term66963.getClass(), "actionMap", null);
        setField(term66963, term66963.getClass(), "aaHint", null);
        setField(term66963, term66963.getClass(), "lcdRenderingHint", null);
        setField(term66963, term66963.getClass(), "component", null);
        setField(term66963, term66963.getClass(), "layoutMgr", null);
        setField(term66963, term66963.getClass(), "dispatcher", null);
        setField(term66963, term66963.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66963, term66963.getClass(), "focusCycleRoot", false);
        setBooleanField(term66963, term66963.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66963, term66963.getClass(), "printingThreads", null);
        setBooleanField(term66963, term66963.getClass(), "printing", false);
        setField(term66963, term66963.getClass(), "containerListener", null);
        setIntField(term66963, term66963.getClass(), "listeningChildren", 0);
        setIntField(term66963, term66963.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66963, term66963.getClass(), "descendantsCount", 0);
        setField(term66963, term66963.getClass(), "preserveBackgroundColor", null);
        setIntField(term66963, term66963.getClass(), "numOfHWComponents", 0);
        setIntField(term66963, term66963.getClass(), "numOfLWComponents", 0);
        setField(term66963, term66963.getClass(), "modalComp", null);
        setField(term66963, term66963.getClass(), "modalAppContext", null);
        setIntField(term66963, term66963.getClass(), "containerSerializedDataVersion", 0);
        setField(term66963, term66963.getClass(), "peer", null);
        setField(term66963, term66963.getClass(), "parent", null);
        setField(term66963, term66963.getClass(), "appContext", null);
        setIntField(term66963, term66963.getClass(), "x", 0);
        setIntField(term66963, term66963.getClass(), "y", 0);
        setIntField(term66963, term66963.getClass(), "width", 0);
        setIntField(term66963, term66963.getClass(), "height", 0);
        setField(term66963, term66963.getClass(), "foreground", null);
        setField(term66963, term66963.getClass(), "background", null);
        setField(term66963, term66963.getClass(), "font", null);
        setField(term66963, term66963.getClass(), "peerFont", null);
        setField(term66963, term66963.getClass(), "cursor", null);
        setField(term66963, term66963.getClass(), "locale", null);
        setField(term66963, term66963.getClass(), "graphicsConfig", null);
        setField(term66963, term66963.getClass(), "bufferStrategy", null);
        setBooleanField(term66963, term66963.getClass(), "ignoreRepaint", false);
        setBooleanField(term66963, term66963.getClass(), "visible", false);
        setBooleanField(term66963, term66963.getClass(), "enabled", false);
        setBooleanField(term66963, term66963.getClass(), "valid", false);
        setField(term66963, term66963.getClass(), "dropTarget", null);
        setField(term66963, term66963.getClass(), "popups", null);
        setField(term66963, term66963.getClass(), "name", null);
        setBooleanField(term66963, term66963.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66963, term66963.getClass(), "focusable", false);
        setIntField(term66963, term66963.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66963, term66963.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66963, term66963.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66963, term66963.getClass(), "acc", null);
        setField(term66963, term66963.getClass(), "minSize", null);
        setBooleanField(term66963, term66963.getClass(), "minSizeSet", false);
        setField(term66963, term66963.getClass(), "prefSize", null);
        setBooleanField(term66963, term66963.getClass(), "prefSizeSet", false);
        setField(term66963, term66963.getClass(), "maxSize", null);
        setBooleanField(term66963, term66963.getClass(), "maxSizeSet", false);
        setField(term66963, term66963.getClass(), "componentOrientation", null);
        setBooleanField(term66963, term66963.getClass(), "newEventsOnly", false);
        setField(term66963, term66963.getClass(), "componentListener", null);
        setField(term66963, term66963.getClass(), "focusListener", null);
        setField(term66963, term66963.getClass(), "hierarchyListener", null);
        setField(term66963, term66963.getClass(), "hierarchyBoundsListener", null);
        setField(term66963, term66963.getClass(), "keyListener", null);
        setField(term66963, term66963.getClass(), "mouseListener", null);
        setField(term66963, term66963.getClass(), "mouseMotionListener", null);
        setField(term66963, term66963.getClass(), "mouseWheelListener", null);
        setField(term66963, term66963.getClass(), "inputMethodListener", null);
        setLongField(term66963, term66963.getClass(), "eventMask", 0L);
        setField(term66963, term66963.getClass(), "changeSupport", null);
        setField(term66963, term66963.getClass(), "objectLock", null);
        setBooleanField(term66963, term66963.getClass(), "isPacked", false);
        setIntField(term66963, term66963.getClass(), "boundsOp", 0);
        setField(term66963, term66963.getClass(), "compoundShape", null);
        setField(term66963, term66963.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66963, term66963.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66963, term66963.getClass(), "backgroundEraseDisabled", false);
        setField(term66963, term66963.getClass(), "eventCache", null);
        setBooleanField(term66963, term66963.getClass(), "coalescingEnabled", false);
        setBooleanField(term66963, term66963.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66963, term66963.getClass(), "componentSerializedDataVersion", 0);
        setField(term66963, term66963.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term66963, args);
    }

};


