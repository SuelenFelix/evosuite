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
     Object term41702;

    public KPanel_removeFirst_205926585727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41702 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41702, term41702.getClass(), "reflectTheme", false);
        setBooleanField(term41702, term41702.getClass(), "isAlignmentXSet", false);
        setFloatField(term41702, term41702.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41702, term41702.getClass(), "isAlignmentYSet", false);
        setFloatField(term41702, term41702.getClass(), "alignmentY", 0.0F);
        setField(term41702, term41702.getClass(), "ui", null);
        setField(term41702, term41702.getClass(), "listenerList", null);
        setField(term41702, term41702.getClass(), "clientProperties", null);
        setField(term41702, term41702.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41702, term41702.getClass(), "autoscrolls", false);
        setField(term41702, term41702.getClass(), "border", null);
        setIntField(term41702, term41702.getClass(), "flags", 0);
        setField(term41702, term41702.getClass(), "inputVerifier", null);
        setBooleanField(term41702, term41702.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41702, term41702.getClass(), "paintingChild", null);
        setField(term41702, term41702.getClass(), "popupMenu", null);
        setField(term41702, term41702.getClass(), "revalidateRunnableScheduled", null);
        setField(term41702, term41702.getClass(), "focusInputMap", null);
        setField(term41702, term41702.getClass(), "ancestorInputMap", null);
        setField(term41702, term41702.getClass(), "windowInputMap", null);
        setField(term41702, term41702.getClass(), "actionMap", null);
        setField(term41702, term41702.getClass(), "aaHint", null);
        setField(term41702, term41702.getClass(), "lcdRenderingHint", null);
        setField(term41702, term41702.getClass(), "component", null);
        setField(term41702, term41702.getClass(), "layoutMgr", null);
        setField(term41702, term41702.getClass(), "dispatcher", null);
        setField(term41702, term41702.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41702, term41702.getClass(), "focusCycleRoot", false);
        setBooleanField(term41702, term41702.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41702, term41702.getClass(), "printingThreads", null);
        setBooleanField(term41702, term41702.getClass(), "printing", false);
        setField(term41702, term41702.getClass(), "containerListener", null);
        setIntField(term41702, term41702.getClass(), "listeningChildren", 0);
        setIntField(term41702, term41702.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41702, term41702.getClass(), "descendantsCount", 0);
        setField(term41702, term41702.getClass(), "preserveBackgroundColor", null);
        setIntField(term41702, term41702.getClass(), "numOfHWComponents", 0);
        setIntField(term41702, term41702.getClass(), "numOfLWComponents", 0);
        setField(term41702, term41702.getClass(), "modalComp", null);
        setField(term41702, term41702.getClass(), "modalAppContext", null);
        setIntField(term41702, term41702.getClass(), "containerSerializedDataVersion", 0);
        setField(term41702, term41702.getClass(), "peer", null);
        setField(term41702, term41702.getClass(), "parent", null);
        setField(term41702, term41702.getClass(), "appContext", null);
        setIntField(term41702, term41702.getClass(), "x", 0);
        setIntField(term41702, term41702.getClass(), "y", 0);
        setIntField(term41702, term41702.getClass(), "width", 0);
        setIntField(term41702, term41702.getClass(), "height", 0);
        setField(term41702, term41702.getClass(), "foreground", null);
        setField(term41702, term41702.getClass(), "background", null);
        setField(term41702, term41702.getClass(), "font", null);
        setField(term41702, term41702.getClass(), "peerFont", null);
        setField(term41702, term41702.getClass(), "cursor", null);
        setField(term41702, term41702.getClass(), "locale", null);
        setField(term41702, term41702.getClass(), "graphicsConfig", null);
        setField(term41702, term41702.getClass(), "bufferStrategy", null);
        setBooleanField(term41702, term41702.getClass(), "ignoreRepaint", false);
        setBooleanField(term41702, term41702.getClass(), "visible", false);
        setBooleanField(term41702, term41702.getClass(), "enabled", false);
        setBooleanField(term41702, term41702.getClass(), "valid", false);
        setField(term41702, term41702.getClass(), "dropTarget", null);
        setField(term41702, term41702.getClass(), "popups", null);
        setField(term41702, term41702.getClass(), "name", null);
        setBooleanField(term41702, term41702.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41702, term41702.getClass(), "focusable", false);
        setIntField(term41702, term41702.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41702, term41702.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41702, term41702.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41702, term41702.getClass(), "acc", null);
        setField(term41702, term41702.getClass(), "minSize", null);
        setBooleanField(term41702, term41702.getClass(), "minSizeSet", false);
        setField(term41702, term41702.getClass(), "prefSize", null);
        setBooleanField(term41702, term41702.getClass(), "prefSizeSet", false);
        setField(term41702, term41702.getClass(), "maxSize", null);
        setBooleanField(term41702, term41702.getClass(), "maxSizeSet", false);
        setField(term41702, term41702.getClass(), "componentOrientation", null);
        setBooleanField(term41702, term41702.getClass(), "newEventsOnly", false);
        setField(term41702, term41702.getClass(), "componentListener", null);
        setField(term41702, term41702.getClass(), "focusListener", null);
        setField(term41702, term41702.getClass(), "hierarchyListener", null);
        setField(term41702, term41702.getClass(), "hierarchyBoundsListener", null);
        setField(term41702, term41702.getClass(), "keyListener", null);
        setField(term41702, term41702.getClass(), "mouseListener", null);
        setField(term41702, term41702.getClass(), "mouseMotionListener", null);
        setField(term41702, term41702.getClass(), "mouseWheelListener", null);
        setField(term41702, term41702.getClass(), "inputMethodListener", null);
        setLongField(term41702, term41702.getClass(), "eventMask", 0L);
        setField(term41702, term41702.getClass(), "changeSupport", null);
        setField(term41702, term41702.getClass(), "objectLock", null);
        setBooleanField(term41702, term41702.getClass(), "isPacked", false);
        setIntField(term41702, term41702.getClass(), "boundsOp", 0);
        setField(term41702, term41702.getClass(), "compoundShape", null);
        setField(term41702, term41702.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41702, term41702.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41702, term41702.getClass(), "backgroundEraseDisabled", false);
        setField(term41702, term41702.getClass(), "eventCache", null);
        setBooleanField(term41702, term41702.getClass(), "coalescingEnabled", false);
        setBooleanField(term41702, term41702.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41702, term41702.getClass(), "componentSerializedDataVersion", 0);
        setField(term41702, term41702.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeFirst", argTypes, term41702, args);
    }

};


