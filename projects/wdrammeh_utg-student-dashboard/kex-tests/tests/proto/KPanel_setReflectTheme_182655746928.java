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
import java.lang.Boolean;

public class KPanel_setReflectTheme_182655746928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41711;
     Object term41753;

    public KPanel_setReflectTheme_182655746928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41711 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41711, term41711.getClass(), "reflectTheme", false);
        setBooleanField(term41711, term41711.getClass(), "isAlignmentXSet", false);
        setFloatField(term41711, term41711.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41711, term41711.getClass(), "isAlignmentYSet", false);
        setFloatField(term41711, term41711.getClass(), "alignmentY", 0.0F);
        setField(term41711, term41711.getClass(), "ui", null);
        setField(term41711, term41711.getClass(), "listenerList", null);
        setField(term41711, term41711.getClass(), "clientProperties", null);
        setField(term41711, term41711.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41711, term41711.getClass(), "autoscrolls", false);
        setField(term41711, term41711.getClass(), "border", null);
        setIntField(term41711, term41711.getClass(), "flags", 0);
        setField(term41711, term41711.getClass(), "inputVerifier", null);
        setBooleanField(term41711, term41711.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41711, term41711.getClass(), "paintingChild", null);
        setField(term41711, term41711.getClass(), "popupMenu", null);
        setField(term41711, term41711.getClass(), "revalidateRunnableScheduled", null);
        setField(term41711, term41711.getClass(), "focusInputMap", null);
        setField(term41711, term41711.getClass(), "ancestorInputMap", null);
        setField(term41711, term41711.getClass(), "windowInputMap", null);
        setField(term41711, term41711.getClass(), "actionMap", null);
        setField(term41711, term41711.getClass(), "aaHint", null);
        setField(term41711, term41711.getClass(), "lcdRenderingHint", null);
        setField(term41711, term41711.getClass(), "component", null);
        setField(term41711, term41711.getClass(), "layoutMgr", null);
        setField(term41711, term41711.getClass(), "dispatcher", null);
        setField(term41711, term41711.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41711, term41711.getClass(), "focusCycleRoot", false);
        setBooleanField(term41711, term41711.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41711, term41711.getClass(), "printingThreads", null);
        setBooleanField(term41711, term41711.getClass(), "printing", false);
        setField(term41711, term41711.getClass(), "containerListener", null);
        setIntField(term41711, term41711.getClass(), "listeningChildren", 0);
        setIntField(term41711, term41711.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41711, term41711.getClass(), "descendantsCount", 0);
        setField(term41711, term41711.getClass(), "preserveBackgroundColor", null);
        setIntField(term41711, term41711.getClass(), "numOfHWComponents", 0);
        setIntField(term41711, term41711.getClass(), "numOfLWComponents", 0);
        setField(term41711, term41711.getClass(), "modalComp", null);
        setField(term41711, term41711.getClass(), "modalAppContext", null);
        setIntField(term41711, term41711.getClass(), "containerSerializedDataVersion", 0);
        setField(term41711, term41711.getClass(), "peer", null);
        setField(term41711, term41711.getClass(), "parent", null);
        setField(term41711, term41711.getClass(), "appContext", null);
        setIntField(term41711, term41711.getClass(), "x", 0);
        setIntField(term41711, term41711.getClass(), "y", 0);
        setIntField(term41711, term41711.getClass(), "width", 0);
        setIntField(term41711, term41711.getClass(), "height", 0);
        setField(term41711, term41711.getClass(), "foreground", null);
        setField(term41711, term41711.getClass(), "background", null);
        setField(term41711, term41711.getClass(), "font", null);
        setField(term41711, term41711.getClass(), "peerFont", null);
        setField(term41711, term41711.getClass(), "cursor", null);
        setField(term41711, term41711.getClass(), "locale", null);
        setField(term41711, term41711.getClass(), "graphicsConfig", null);
        setField(term41711, term41711.getClass(), "bufferStrategy", null);
        setBooleanField(term41711, term41711.getClass(), "ignoreRepaint", false);
        setBooleanField(term41711, term41711.getClass(), "visible", false);
        setBooleanField(term41711, term41711.getClass(), "enabled", false);
        setBooleanField(term41711, term41711.getClass(), "valid", false);
        setField(term41711, term41711.getClass(), "dropTarget", null);
        setField(term41711, term41711.getClass(), "popups", null);
        setField(term41711, term41711.getClass(), "name", null);
        setBooleanField(term41711, term41711.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41711, term41711.getClass(), "focusable", false);
        setIntField(term41711, term41711.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41711, term41711.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41711, term41711.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41711, term41711.getClass(), "acc", null);
        setField(term41711, term41711.getClass(), "minSize", null);
        setBooleanField(term41711, term41711.getClass(), "minSizeSet", false);
        setField(term41711, term41711.getClass(), "prefSize", null);
        setBooleanField(term41711, term41711.getClass(), "prefSizeSet", false);
        setField(term41711, term41711.getClass(), "maxSize", null);
        setBooleanField(term41711, term41711.getClass(), "maxSizeSet", false);
        setField(term41711, term41711.getClass(), "componentOrientation", null);
        setBooleanField(term41711, term41711.getClass(), "newEventsOnly", false);
        setField(term41711, term41711.getClass(), "componentListener", null);
        setField(term41711, term41711.getClass(), "focusListener", null);
        setField(term41711, term41711.getClass(), "hierarchyListener", null);
        setField(term41711, term41711.getClass(), "hierarchyBoundsListener", null);
        setField(term41711, term41711.getClass(), "keyListener", null);
        setField(term41711, term41711.getClass(), "mouseListener", null);
        setField(term41711, term41711.getClass(), "mouseMotionListener", null);
        setField(term41711, term41711.getClass(), "mouseWheelListener", null);
        setField(term41711, term41711.getClass(), "inputMethodListener", null);
        setLongField(term41711, term41711.getClass(), "eventMask", 0L);
        setField(term41711, term41711.getClass(), "changeSupport", null);
        setField(term41711, term41711.getClass(), "objectLock", null);
        setBooleanField(term41711, term41711.getClass(), "isPacked", false);
        setIntField(term41711, term41711.getClass(), "boundsOp", 0);
        setField(term41711, term41711.getClass(), "compoundShape", null);
        setField(term41711, term41711.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41711, term41711.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41711, term41711.getClass(), "backgroundEraseDisabled", false);
        setField(term41711, term41711.getClass(), "eventCache", null);
        setBooleanField(term41711, term41711.getClass(), "coalescingEnabled", false);
        setBooleanField(term41711, term41711.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41711, term41711.getClass(), "componentSerializedDataVersion", 0);
        setField(term41711, term41711.getClass(), "accessibleContext", null);
        term41753 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term41753;
        callMethod(klass, "setReflectTheme", argTypes, term41711, args);
    }

};


