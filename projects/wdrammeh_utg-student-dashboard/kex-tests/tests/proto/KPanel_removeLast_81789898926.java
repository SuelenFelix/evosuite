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

public class KPanel_removeLast_81789898926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41627;

    public KPanel_removeLast_81789898926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41627 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41627, term41627.getClass(), "reflectTheme", false);
        setBooleanField(term41627, term41627.getClass(), "isAlignmentXSet", false);
        setFloatField(term41627, term41627.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41627, term41627.getClass(), "isAlignmentYSet", false);
        setFloatField(term41627, term41627.getClass(), "alignmentY", 0.0F);
        setField(term41627, term41627.getClass(), "ui", null);
        setField(term41627, term41627.getClass(), "listenerList", null);
        setField(term41627, term41627.getClass(), "clientProperties", null);
        setField(term41627, term41627.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41627, term41627.getClass(), "autoscrolls", false);
        setField(term41627, term41627.getClass(), "border", null);
        setIntField(term41627, term41627.getClass(), "flags", 0);
        setField(term41627, term41627.getClass(), "inputVerifier", null);
        setBooleanField(term41627, term41627.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41627, term41627.getClass(), "paintingChild", null);
        setField(term41627, term41627.getClass(), "popupMenu", null);
        setField(term41627, term41627.getClass(), "revalidateRunnableScheduled", null);
        setField(term41627, term41627.getClass(), "focusInputMap", null);
        setField(term41627, term41627.getClass(), "ancestorInputMap", null);
        setField(term41627, term41627.getClass(), "windowInputMap", null);
        setField(term41627, term41627.getClass(), "actionMap", null);
        setField(term41627, term41627.getClass(), "aaHint", null);
        setField(term41627, term41627.getClass(), "lcdRenderingHint", null);
        setField(term41627, term41627.getClass(), "component", null);
        setField(term41627, term41627.getClass(), "layoutMgr", null);
        setField(term41627, term41627.getClass(), "dispatcher", null);
        setField(term41627, term41627.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41627, term41627.getClass(), "focusCycleRoot", false);
        setBooleanField(term41627, term41627.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41627, term41627.getClass(), "printingThreads", null);
        setBooleanField(term41627, term41627.getClass(), "printing", false);
        setField(term41627, term41627.getClass(), "containerListener", null);
        setIntField(term41627, term41627.getClass(), "listeningChildren", 0);
        setIntField(term41627, term41627.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41627, term41627.getClass(), "descendantsCount", 0);
        setField(term41627, term41627.getClass(), "preserveBackgroundColor", null);
        setIntField(term41627, term41627.getClass(), "numOfHWComponents", 0);
        setIntField(term41627, term41627.getClass(), "numOfLWComponents", 0);
        setField(term41627, term41627.getClass(), "modalComp", null);
        setField(term41627, term41627.getClass(), "modalAppContext", null);
        setIntField(term41627, term41627.getClass(), "containerSerializedDataVersion", 0);
        setField(term41627, term41627.getClass(), "peer", null);
        setField(term41627, term41627.getClass(), "parent", null);
        setField(term41627, term41627.getClass(), "appContext", null);
        setIntField(term41627, term41627.getClass(), "x", 0);
        setIntField(term41627, term41627.getClass(), "y", 0);
        setIntField(term41627, term41627.getClass(), "width", 0);
        setIntField(term41627, term41627.getClass(), "height", 0);
        setField(term41627, term41627.getClass(), "foreground", null);
        setField(term41627, term41627.getClass(), "background", null);
        setField(term41627, term41627.getClass(), "font", null);
        setField(term41627, term41627.getClass(), "peerFont", null);
        setField(term41627, term41627.getClass(), "cursor", null);
        setField(term41627, term41627.getClass(), "locale", null);
        setField(term41627, term41627.getClass(), "graphicsConfig", null);
        setField(term41627, term41627.getClass(), "bufferStrategy", null);
        setBooleanField(term41627, term41627.getClass(), "ignoreRepaint", false);
        setBooleanField(term41627, term41627.getClass(), "visible", false);
        setBooleanField(term41627, term41627.getClass(), "enabled", false);
        setBooleanField(term41627, term41627.getClass(), "valid", false);
        setField(term41627, term41627.getClass(), "dropTarget", null);
        setField(term41627, term41627.getClass(), "popups", null);
        setField(term41627, term41627.getClass(), "name", null);
        setBooleanField(term41627, term41627.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41627, term41627.getClass(), "focusable", false);
        setIntField(term41627, term41627.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41627, term41627.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41627, term41627.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41627, term41627.getClass(), "acc", null);
        setField(term41627, term41627.getClass(), "minSize", null);
        setBooleanField(term41627, term41627.getClass(), "minSizeSet", false);
        setField(term41627, term41627.getClass(), "prefSize", null);
        setBooleanField(term41627, term41627.getClass(), "prefSizeSet", false);
        setField(term41627, term41627.getClass(), "maxSize", null);
        setBooleanField(term41627, term41627.getClass(), "maxSizeSet", false);
        setField(term41627, term41627.getClass(), "componentOrientation", null);
        setBooleanField(term41627, term41627.getClass(), "newEventsOnly", false);
        setField(term41627, term41627.getClass(), "componentListener", null);
        setField(term41627, term41627.getClass(), "focusListener", null);
        setField(term41627, term41627.getClass(), "hierarchyListener", null);
        setField(term41627, term41627.getClass(), "hierarchyBoundsListener", null);
        setField(term41627, term41627.getClass(), "keyListener", null);
        setField(term41627, term41627.getClass(), "mouseListener", null);
        setField(term41627, term41627.getClass(), "mouseMotionListener", null);
        setField(term41627, term41627.getClass(), "mouseWheelListener", null);
        setField(term41627, term41627.getClass(), "inputMethodListener", null);
        setLongField(term41627, term41627.getClass(), "eventMask", 0L);
        setField(term41627, term41627.getClass(), "changeSupport", null);
        setField(term41627, term41627.getClass(), "objectLock", null);
        setBooleanField(term41627, term41627.getClass(), "isPacked", false);
        setIntField(term41627, term41627.getClass(), "boundsOp", 0);
        setField(term41627, term41627.getClass(), "compoundShape", null);
        setField(term41627, term41627.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41627, term41627.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41627, term41627.getClass(), "backgroundEraseDisabled", false);
        setField(term41627, term41627.getClass(), "eventCache", null);
        setBooleanField(term41627, term41627.getClass(), "coalescingEnabled", false);
        setBooleanField(term41627, term41627.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41627, term41627.getClass(), "componentSerializedDataVersion", 0);
        setField(term41627, term41627.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeLast", argTypes, term41627, args);
    }

};


