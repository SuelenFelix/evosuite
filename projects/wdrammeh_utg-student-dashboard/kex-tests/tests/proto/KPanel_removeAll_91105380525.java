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
     Object term41618;

    public KPanel_removeAll_91105380525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41618 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41618, term41618.getClass(), "reflectTheme", false);
        setBooleanField(term41618, term41618.getClass(), "isAlignmentXSet", false);
        setFloatField(term41618, term41618.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41618, term41618.getClass(), "isAlignmentYSet", false);
        setFloatField(term41618, term41618.getClass(), "alignmentY", 0.0F);
        setField(term41618, term41618.getClass(), "ui", null);
        setField(term41618, term41618.getClass(), "listenerList", null);
        setField(term41618, term41618.getClass(), "clientProperties", null);
        setField(term41618, term41618.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41618, term41618.getClass(), "autoscrolls", false);
        setField(term41618, term41618.getClass(), "border", null);
        setIntField(term41618, term41618.getClass(), "flags", 0);
        setField(term41618, term41618.getClass(), "inputVerifier", null);
        setBooleanField(term41618, term41618.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41618, term41618.getClass(), "paintingChild", null);
        setField(term41618, term41618.getClass(), "popupMenu", null);
        setField(term41618, term41618.getClass(), "revalidateRunnableScheduled", null);
        setField(term41618, term41618.getClass(), "focusInputMap", null);
        setField(term41618, term41618.getClass(), "ancestorInputMap", null);
        setField(term41618, term41618.getClass(), "windowInputMap", null);
        setField(term41618, term41618.getClass(), "actionMap", null);
        setField(term41618, term41618.getClass(), "aaHint", null);
        setField(term41618, term41618.getClass(), "lcdRenderingHint", null);
        setField(term41618, term41618.getClass(), "component", null);
        setField(term41618, term41618.getClass(), "layoutMgr", null);
        setField(term41618, term41618.getClass(), "dispatcher", null);
        setField(term41618, term41618.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41618, term41618.getClass(), "focusCycleRoot", false);
        setBooleanField(term41618, term41618.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41618, term41618.getClass(), "printingThreads", null);
        setBooleanField(term41618, term41618.getClass(), "printing", false);
        setField(term41618, term41618.getClass(), "containerListener", null);
        setIntField(term41618, term41618.getClass(), "listeningChildren", 0);
        setIntField(term41618, term41618.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41618, term41618.getClass(), "descendantsCount", 0);
        setField(term41618, term41618.getClass(), "preserveBackgroundColor", null);
        setIntField(term41618, term41618.getClass(), "numOfHWComponents", 0);
        setIntField(term41618, term41618.getClass(), "numOfLWComponents", 0);
        setField(term41618, term41618.getClass(), "modalComp", null);
        setField(term41618, term41618.getClass(), "modalAppContext", null);
        setIntField(term41618, term41618.getClass(), "containerSerializedDataVersion", 0);
        setField(term41618, term41618.getClass(), "peer", null);
        setField(term41618, term41618.getClass(), "parent", null);
        setField(term41618, term41618.getClass(), "appContext", null);
        setIntField(term41618, term41618.getClass(), "x", 0);
        setIntField(term41618, term41618.getClass(), "y", 0);
        setIntField(term41618, term41618.getClass(), "width", 0);
        setIntField(term41618, term41618.getClass(), "height", 0);
        setField(term41618, term41618.getClass(), "foreground", null);
        setField(term41618, term41618.getClass(), "background", null);
        setField(term41618, term41618.getClass(), "font", null);
        setField(term41618, term41618.getClass(), "peerFont", null);
        setField(term41618, term41618.getClass(), "cursor", null);
        setField(term41618, term41618.getClass(), "locale", null);
        setField(term41618, term41618.getClass(), "graphicsConfig", null);
        setField(term41618, term41618.getClass(), "bufferStrategy", null);
        setBooleanField(term41618, term41618.getClass(), "ignoreRepaint", false);
        setBooleanField(term41618, term41618.getClass(), "visible", false);
        setBooleanField(term41618, term41618.getClass(), "enabled", false);
        setBooleanField(term41618, term41618.getClass(), "valid", false);
        setField(term41618, term41618.getClass(), "dropTarget", null);
        setField(term41618, term41618.getClass(), "popups", null);
        setField(term41618, term41618.getClass(), "name", null);
        setBooleanField(term41618, term41618.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41618, term41618.getClass(), "focusable", false);
        setIntField(term41618, term41618.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41618, term41618.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41618, term41618.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41618, term41618.getClass(), "acc", null);
        setField(term41618, term41618.getClass(), "minSize", null);
        setBooleanField(term41618, term41618.getClass(), "minSizeSet", false);
        setField(term41618, term41618.getClass(), "prefSize", null);
        setBooleanField(term41618, term41618.getClass(), "prefSizeSet", false);
        setField(term41618, term41618.getClass(), "maxSize", null);
        setBooleanField(term41618, term41618.getClass(), "maxSizeSet", false);
        setField(term41618, term41618.getClass(), "componentOrientation", null);
        setBooleanField(term41618, term41618.getClass(), "newEventsOnly", false);
        setField(term41618, term41618.getClass(), "componentListener", null);
        setField(term41618, term41618.getClass(), "focusListener", null);
        setField(term41618, term41618.getClass(), "hierarchyListener", null);
        setField(term41618, term41618.getClass(), "hierarchyBoundsListener", null);
        setField(term41618, term41618.getClass(), "keyListener", null);
        setField(term41618, term41618.getClass(), "mouseListener", null);
        setField(term41618, term41618.getClass(), "mouseMotionListener", null);
        setField(term41618, term41618.getClass(), "mouseWheelListener", null);
        setField(term41618, term41618.getClass(), "inputMethodListener", null);
        setLongField(term41618, term41618.getClass(), "eventMask", 0L);
        setField(term41618, term41618.getClass(), "changeSupport", null);
        setField(term41618, term41618.getClass(), "objectLock", null);
        setBooleanField(term41618, term41618.getClass(), "isPacked", false);
        setIntField(term41618, term41618.getClass(), "boundsOp", 0);
        setField(term41618, term41618.getClass(), "compoundShape", null);
        setField(term41618, term41618.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41618, term41618.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41618, term41618.getClass(), "backgroundEraseDisabled", false);
        setField(term41618, term41618.getClass(), "eventCache", null);
        setBooleanField(term41618, term41618.getClass(), "coalescingEnabled", false);
        setBooleanField(term41618, term41618.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41618, term41618.getClass(), "componentSerializedDataVersion", 0);
        setField(term41618, term41618.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeAll", argTypes, term41618, args);
    }

};


