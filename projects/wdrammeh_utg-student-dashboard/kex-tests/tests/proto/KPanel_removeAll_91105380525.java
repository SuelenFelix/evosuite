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

public class KPanel_removeAll_91105380525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41585;

    public KPanel_removeAll_91105380525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41585 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41585, term41585.getClass(), "reflectTheme", false);
        setBooleanField(term41585, term41585.getClass(), "isAlignmentXSet", false);
        setFloatField(term41585, term41585.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41585, term41585.getClass(), "isAlignmentYSet", false);
        setFloatField(term41585, term41585.getClass(), "alignmentY", 0.0F);
        setField(term41585, term41585.getClass(), "ui", null);
        setField(term41585, term41585.getClass(), "listenerList", null);
        setField(term41585, term41585.getClass(), "clientProperties", null);
        setField(term41585, term41585.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41585, term41585.getClass(), "autoscrolls", false);
        setField(term41585, term41585.getClass(), "border", null);
        setIntField(term41585, term41585.getClass(), "flags", 0);
        setField(term41585, term41585.getClass(), "inputVerifier", null);
        setBooleanField(term41585, term41585.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41585, term41585.getClass(), "paintingChild", null);
        setField(term41585, term41585.getClass(), "popupMenu", null);
        setField(term41585, term41585.getClass(), "revalidateRunnableScheduled", null);
        setField(term41585, term41585.getClass(), "focusInputMap", null);
        setField(term41585, term41585.getClass(), "ancestorInputMap", null);
        setField(term41585, term41585.getClass(), "windowInputMap", null);
        setField(term41585, term41585.getClass(), "actionMap", null);
        setField(term41585, term41585.getClass(), "aaHint", null);
        setField(term41585, term41585.getClass(), "lcdRenderingHint", null);
        setField(term41585, term41585.getClass(), "component", null);
        setField(term41585, term41585.getClass(), "layoutMgr", null);
        setField(term41585, term41585.getClass(), "dispatcher", null);
        setField(term41585, term41585.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41585, term41585.getClass(), "focusCycleRoot", false);
        setBooleanField(term41585, term41585.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41585, term41585.getClass(), "printingThreads", null);
        setBooleanField(term41585, term41585.getClass(), "printing", false);
        setField(term41585, term41585.getClass(), "containerListener", null);
        setIntField(term41585, term41585.getClass(), "listeningChildren", 0);
        setIntField(term41585, term41585.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41585, term41585.getClass(), "descendantsCount", 0);
        setField(term41585, term41585.getClass(), "preserveBackgroundColor", null);
        setIntField(term41585, term41585.getClass(), "numOfHWComponents", 0);
        setIntField(term41585, term41585.getClass(), "numOfLWComponents", 0);
        setField(term41585, term41585.getClass(), "modalComp", null);
        setField(term41585, term41585.getClass(), "modalAppContext", null);
        setIntField(term41585, term41585.getClass(), "containerSerializedDataVersion", 0);
        setField(term41585, term41585.getClass(), "peer", null);
        setField(term41585, term41585.getClass(), "parent", null);
        setField(term41585, term41585.getClass(), "appContext", null);
        setIntField(term41585, term41585.getClass(), "x", 0);
        setIntField(term41585, term41585.getClass(), "y", 0);
        setIntField(term41585, term41585.getClass(), "width", 0);
        setIntField(term41585, term41585.getClass(), "height", 0);
        setField(term41585, term41585.getClass(), "foreground", null);
        setField(term41585, term41585.getClass(), "background", null);
        setField(term41585, term41585.getClass(), "font", null);
        setField(term41585, term41585.getClass(), "peerFont", null);
        setField(term41585, term41585.getClass(), "cursor", null);
        setField(term41585, term41585.getClass(), "locale", null);
        setField(term41585, term41585.getClass(), "graphicsConfig", null);
        setField(term41585, term41585.getClass(), "bufferStrategy", null);
        setBooleanField(term41585, term41585.getClass(), "ignoreRepaint", false);
        setBooleanField(term41585, term41585.getClass(), "visible", false);
        setBooleanField(term41585, term41585.getClass(), "enabled", false);
        setBooleanField(term41585, term41585.getClass(), "valid", false);
        setField(term41585, term41585.getClass(), "dropTarget", null);
        setField(term41585, term41585.getClass(), "popups", null);
        setField(term41585, term41585.getClass(), "name", null);
        setBooleanField(term41585, term41585.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41585, term41585.getClass(), "focusable", false);
        setIntField(term41585, term41585.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41585, term41585.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41585, term41585.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41585, term41585.getClass(), "acc", null);
        setField(term41585, term41585.getClass(), "minSize", null);
        setBooleanField(term41585, term41585.getClass(), "minSizeSet", false);
        setField(term41585, term41585.getClass(), "prefSize", null);
        setBooleanField(term41585, term41585.getClass(), "prefSizeSet", false);
        setField(term41585, term41585.getClass(), "maxSize", null);
        setBooleanField(term41585, term41585.getClass(), "maxSizeSet", false);
        setField(term41585, term41585.getClass(), "componentOrientation", null);
        setBooleanField(term41585, term41585.getClass(), "newEventsOnly", false);
        setField(term41585, term41585.getClass(), "componentListener", null);
        setField(term41585, term41585.getClass(), "focusListener", null);
        setField(term41585, term41585.getClass(), "hierarchyListener", null);
        setField(term41585, term41585.getClass(), "hierarchyBoundsListener", null);
        setField(term41585, term41585.getClass(), "keyListener", null);
        setField(term41585, term41585.getClass(), "mouseListener", null);
        setField(term41585, term41585.getClass(), "mouseMotionListener", null);
        setField(term41585, term41585.getClass(), "mouseWheelListener", null);
        setField(term41585, term41585.getClass(), "inputMethodListener", null);
        setLongField(term41585, term41585.getClass(), "eventMask", 0L);
        setField(term41585, term41585.getClass(), "changeSupport", null);
        setField(term41585, term41585.getClass(), "objectLock", null);
        setBooleanField(term41585, term41585.getClass(), "isPacked", false);
        setIntField(term41585, term41585.getClass(), "boundsOp", 0);
        setField(term41585, term41585.getClass(), "compoundShape", null);
        setField(term41585, term41585.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41585, term41585.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41585, term41585.getClass(), "backgroundEraseDisabled", false);
        setField(term41585, term41585.getClass(), "eventCache", null);
        setBooleanField(term41585, term41585.getClass(), "coalescingEnabled", false);
        setBooleanField(term41585, term41585.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41585, term41585.getClass(), "componentSerializedDataVersion", 0);
        setField(term41585, term41585.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeAll", argTypes, term41585, args);
    }

};


