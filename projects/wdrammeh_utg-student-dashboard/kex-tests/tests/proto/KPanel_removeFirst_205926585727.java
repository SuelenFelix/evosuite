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

public class KPanel_removeFirst_205926585727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41669;

    public KPanel_removeFirst_205926585727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41669 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41669, term41669.getClass(), "reflectTheme", false);
        setBooleanField(term41669, term41669.getClass(), "isAlignmentXSet", false);
        setFloatField(term41669, term41669.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41669, term41669.getClass(), "isAlignmentYSet", false);
        setFloatField(term41669, term41669.getClass(), "alignmentY", 0.0F);
        setField(term41669, term41669.getClass(), "ui", null);
        setField(term41669, term41669.getClass(), "listenerList", null);
        setField(term41669, term41669.getClass(), "clientProperties", null);
        setField(term41669, term41669.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41669, term41669.getClass(), "autoscrolls", false);
        setField(term41669, term41669.getClass(), "border", null);
        setIntField(term41669, term41669.getClass(), "flags", 0);
        setField(term41669, term41669.getClass(), "inputVerifier", null);
        setBooleanField(term41669, term41669.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41669, term41669.getClass(), "paintingChild", null);
        setField(term41669, term41669.getClass(), "popupMenu", null);
        setField(term41669, term41669.getClass(), "revalidateRunnableScheduled", null);
        setField(term41669, term41669.getClass(), "focusInputMap", null);
        setField(term41669, term41669.getClass(), "ancestorInputMap", null);
        setField(term41669, term41669.getClass(), "windowInputMap", null);
        setField(term41669, term41669.getClass(), "actionMap", null);
        setField(term41669, term41669.getClass(), "aaHint", null);
        setField(term41669, term41669.getClass(), "lcdRenderingHint", null);
        setField(term41669, term41669.getClass(), "component", null);
        setField(term41669, term41669.getClass(), "layoutMgr", null);
        setField(term41669, term41669.getClass(), "dispatcher", null);
        setField(term41669, term41669.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41669, term41669.getClass(), "focusCycleRoot", false);
        setBooleanField(term41669, term41669.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41669, term41669.getClass(), "printingThreads", null);
        setBooleanField(term41669, term41669.getClass(), "printing", false);
        setField(term41669, term41669.getClass(), "containerListener", null);
        setIntField(term41669, term41669.getClass(), "listeningChildren", 0);
        setIntField(term41669, term41669.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41669, term41669.getClass(), "descendantsCount", 0);
        setField(term41669, term41669.getClass(), "preserveBackgroundColor", null);
        setIntField(term41669, term41669.getClass(), "numOfHWComponents", 0);
        setIntField(term41669, term41669.getClass(), "numOfLWComponents", 0);
        setField(term41669, term41669.getClass(), "modalComp", null);
        setField(term41669, term41669.getClass(), "modalAppContext", null);
        setIntField(term41669, term41669.getClass(), "containerSerializedDataVersion", 0);
        setField(term41669, term41669.getClass(), "peer", null);
        setField(term41669, term41669.getClass(), "parent", null);
        setField(term41669, term41669.getClass(), "appContext", null);
        setIntField(term41669, term41669.getClass(), "x", 0);
        setIntField(term41669, term41669.getClass(), "y", 0);
        setIntField(term41669, term41669.getClass(), "width", 0);
        setIntField(term41669, term41669.getClass(), "height", 0);
        setField(term41669, term41669.getClass(), "foreground", null);
        setField(term41669, term41669.getClass(), "background", null);
        setField(term41669, term41669.getClass(), "font", null);
        setField(term41669, term41669.getClass(), "peerFont", null);
        setField(term41669, term41669.getClass(), "cursor", null);
        setField(term41669, term41669.getClass(), "locale", null);
        setField(term41669, term41669.getClass(), "graphicsConfig", null);
        setField(term41669, term41669.getClass(), "bufferStrategy", null);
        setBooleanField(term41669, term41669.getClass(), "ignoreRepaint", false);
        setBooleanField(term41669, term41669.getClass(), "visible", false);
        setBooleanField(term41669, term41669.getClass(), "enabled", false);
        setBooleanField(term41669, term41669.getClass(), "valid", false);
        setField(term41669, term41669.getClass(), "dropTarget", null);
        setField(term41669, term41669.getClass(), "popups", null);
        setField(term41669, term41669.getClass(), "name", null);
        setBooleanField(term41669, term41669.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41669, term41669.getClass(), "focusable", false);
        setIntField(term41669, term41669.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41669, term41669.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41669, term41669.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41669, term41669.getClass(), "acc", null);
        setField(term41669, term41669.getClass(), "minSize", null);
        setBooleanField(term41669, term41669.getClass(), "minSizeSet", false);
        setField(term41669, term41669.getClass(), "prefSize", null);
        setBooleanField(term41669, term41669.getClass(), "prefSizeSet", false);
        setField(term41669, term41669.getClass(), "maxSize", null);
        setBooleanField(term41669, term41669.getClass(), "maxSizeSet", false);
        setField(term41669, term41669.getClass(), "componentOrientation", null);
        setBooleanField(term41669, term41669.getClass(), "newEventsOnly", false);
        setField(term41669, term41669.getClass(), "componentListener", null);
        setField(term41669, term41669.getClass(), "focusListener", null);
        setField(term41669, term41669.getClass(), "hierarchyListener", null);
        setField(term41669, term41669.getClass(), "hierarchyBoundsListener", null);
        setField(term41669, term41669.getClass(), "keyListener", null);
        setField(term41669, term41669.getClass(), "mouseListener", null);
        setField(term41669, term41669.getClass(), "mouseMotionListener", null);
        setField(term41669, term41669.getClass(), "mouseWheelListener", null);
        setField(term41669, term41669.getClass(), "inputMethodListener", null);
        setLongField(term41669, term41669.getClass(), "eventMask", 0L);
        setField(term41669, term41669.getClass(), "changeSupport", null);
        setField(term41669, term41669.getClass(), "objectLock", null);
        setBooleanField(term41669, term41669.getClass(), "isPacked", false);
        setIntField(term41669, term41669.getClass(), "boundsOp", 0);
        setField(term41669, term41669.getClass(), "compoundShape", null);
        setField(term41669, term41669.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41669, term41669.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41669, term41669.getClass(), "backgroundEraseDisabled", false);
        setField(term41669, term41669.getClass(), "eventCache", null);
        setBooleanField(term41669, term41669.getClass(), "coalescingEnabled", false);
        setBooleanField(term41669, term41669.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41669, term41669.getClass(), "componentSerializedDataVersion", 0);
        setField(term41669, term41669.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeFirst", argTypes, term41669, args);
    }

};


