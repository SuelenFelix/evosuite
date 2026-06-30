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
     Object term66914;

    public KSeparator_setPreferences_6341943213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66914 = newInstance(Class.forName("proto.KSeparator"));
        setIntField(term66914, term66914.getClass(), "orientation", 0);
        setBooleanField(term66914, term66914.getClass(), "isAlignmentXSet", false);
        setFloatField(term66914, term66914.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66914, term66914.getClass(), "isAlignmentYSet", false);
        setFloatField(term66914, term66914.getClass(), "alignmentY", 0.0F);
        setField(term66914, term66914.getClass(), "ui", null);
        setField(term66914, term66914.getClass(), "listenerList", null);
        setField(term66914, term66914.getClass(), "clientProperties", null);
        setField(term66914, term66914.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66914, term66914.getClass(), "autoscrolls", false);
        setField(term66914, term66914.getClass(), "border", null);
        setIntField(term66914, term66914.getClass(), "flags", 0);
        setField(term66914, term66914.getClass(), "inputVerifier", null);
        setBooleanField(term66914, term66914.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66914, term66914.getClass(), "paintingChild", null);
        setField(term66914, term66914.getClass(), "popupMenu", null);
        setField(term66914, term66914.getClass(), "revalidateRunnableScheduled", null);
        setField(term66914, term66914.getClass(), "focusInputMap", null);
        setField(term66914, term66914.getClass(), "ancestorInputMap", null);
        setField(term66914, term66914.getClass(), "windowInputMap", null);
        setField(term66914, term66914.getClass(), "actionMap", null);
        setField(term66914, term66914.getClass(), "aaHint", null);
        setField(term66914, term66914.getClass(), "lcdRenderingHint", null);
        setField(term66914, term66914.getClass(), "component", null);
        setField(term66914, term66914.getClass(), "layoutMgr", null);
        setField(term66914, term66914.getClass(), "dispatcher", null);
        setField(term66914, term66914.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66914, term66914.getClass(), "focusCycleRoot", false);
        setBooleanField(term66914, term66914.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66914, term66914.getClass(), "printingThreads", null);
        setBooleanField(term66914, term66914.getClass(), "printing", false);
        setField(term66914, term66914.getClass(), "containerListener", null);
        setIntField(term66914, term66914.getClass(), "listeningChildren", 0);
        setIntField(term66914, term66914.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66914, term66914.getClass(), "descendantsCount", 0);
        setField(term66914, term66914.getClass(), "preserveBackgroundColor", null);
        setIntField(term66914, term66914.getClass(), "numOfHWComponents", 0);
        setIntField(term66914, term66914.getClass(), "numOfLWComponents", 0);
        setField(term66914, term66914.getClass(), "modalComp", null);
        setField(term66914, term66914.getClass(), "modalAppContext", null);
        setIntField(term66914, term66914.getClass(), "containerSerializedDataVersion", 0);
        setField(term66914, term66914.getClass(), "peer", null);
        setField(term66914, term66914.getClass(), "parent", null);
        setField(term66914, term66914.getClass(), "appContext", null);
        setIntField(term66914, term66914.getClass(), "x", 0);
        setIntField(term66914, term66914.getClass(), "y", 0);
        setIntField(term66914, term66914.getClass(), "width", 0);
        setIntField(term66914, term66914.getClass(), "height", 0);
        setField(term66914, term66914.getClass(), "foreground", null);
        setField(term66914, term66914.getClass(), "background", null);
        setField(term66914, term66914.getClass(), "font", null);
        setField(term66914, term66914.getClass(), "peerFont", null);
        setField(term66914, term66914.getClass(), "cursor", null);
        setField(term66914, term66914.getClass(), "locale", null);
        setField(term66914, term66914.getClass(), "graphicsConfig", null);
        setField(term66914, term66914.getClass(), "bufferStrategy", null);
        setBooleanField(term66914, term66914.getClass(), "ignoreRepaint", false);
        setBooleanField(term66914, term66914.getClass(), "visible", false);
        setBooleanField(term66914, term66914.getClass(), "enabled", false);
        setBooleanField(term66914, term66914.getClass(), "valid", false);
        setField(term66914, term66914.getClass(), "dropTarget", null);
        setField(term66914, term66914.getClass(), "popups", null);
        setField(term66914, term66914.getClass(), "name", null);
        setBooleanField(term66914, term66914.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66914, term66914.getClass(), "focusable", false);
        setIntField(term66914, term66914.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66914, term66914.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66914, term66914.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66914, term66914.getClass(), "acc", null);
        setField(term66914, term66914.getClass(), "minSize", null);
        setBooleanField(term66914, term66914.getClass(), "minSizeSet", false);
        setField(term66914, term66914.getClass(), "prefSize", null);
        setBooleanField(term66914, term66914.getClass(), "prefSizeSet", false);
        setField(term66914, term66914.getClass(), "maxSize", null);
        setBooleanField(term66914, term66914.getClass(), "maxSizeSet", false);
        setField(term66914, term66914.getClass(), "componentOrientation", null);
        setBooleanField(term66914, term66914.getClass(), "newEventsOnly", false);
        setField(term66914, term66914.getClass(), "componentListener", null);
        setField(term66914, term66914.getClass(), "focusListener", null);
        setField(term66914, term66914.getClass(), "hierarchyListener", null);
        setField(term66914, term66914.getClass(), "hierarchyBoundsListener", null);
        setField(term66914, term66914.getClass(), "keyListener", null);
        setField(term66914, term66914.getClass(), "mouseListener", null);
        setField(term66914, term66914.getClass(), "mouseMotionListener", null);
        setField(term66914, term66914.getClass(), "mouseWheelListener", null);
        setField(term66914, term66914.getClass(), "inputMethodListener", null);
        setLongField(term66914, term66914.getClass(), "eventMask", 0L);
        setField(term66914, term66914.getClass(), "changeSupport", null);
        setField(term66914, term66914.getClass(), "objectLock", null);
        setBooleanField(term66914, term66914.getClass(), "isPacked", false);
        setIntField(term66914, term66914.getClass(), "boundsOp", 0);
        setField(term66914, term66914.getClass(), "compoundShape", null);
        setField(term66914, term66914.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66914, term66914.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66914, term66914.getClass(), "backgroundEraseDisabled", false);
        setField(term66914, term66914.getClass(), "eventCache", null);
        setBooleanField(term66914, term66914.getClass(), "coalescingEnabled", false);
        setBooleanField(term66914, term66914.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66914, term66914.getClass(), "componentSerializedDataVersion", 0);
        setField(term66914, term66914.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term66914, args);
    }

};


