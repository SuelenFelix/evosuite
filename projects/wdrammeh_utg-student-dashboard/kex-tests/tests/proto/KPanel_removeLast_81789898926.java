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
     Object term41660;

    public KPanel_removeLast_81789898926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41660 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41660, term41660.getClass(), "reflectTheme", false);
        setBooleanField(term41660, term41660.getClass(), "isAlignmentXSet", false);
        setFloatField(term41660, term41660.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41660, term41660.getClass(), "isAlignmentYSet", false);
        setFloatField(term41660, term41660.getClass(), "alignmentY", 0.0F);
        setField(term41660, term41660.getClass(), "ui", null);
        setField(term41660, term41660.getClass(), "listenerList", null);
        setField(term41660, term41660.getClass(), "clientProperties", null);
        setField(term41660, term41660.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41660, term41660.getClass(), "autoscrolls", false);
        setField(term41660, term41660.getClass(), "border", null);
        setIntField(term41660, term41660.getClass(), "flags", 0);
        setField(term41660, term41660.getClass(), "inputVerifier", null);
        setBooleanField(term41660, term41660.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41660, term41660.getClass(), "paintingChild", null);
        setField(term41660, term41660.getClass(), "popupMenu", null);
        setField(term41660, term41660.getClass(), "revalidateRunnableScheduled", null);
        setField(term41660, term41660.getClass(), "focusInputMap", null);
        setField(term41660, term41660.getClass(), "ancestorInputMap", null);
        setField(term41660, term41660.getClass(), "windowInputMap", null);
        setField(term41660, term41660.getClass(), "actionMap", null);
        setField(term41660, term41660.getClass(), "aaHint", null);
        setField(term41660, term41660.getClass(), "lcdRenderingHint", null);
        setField(term41660, term41660.getClass(), "component", null);
        setField(term41660, term41660.getClass(), "layoutMgr", null);
        setField(term41660, term41660.getClass(), "dispatcher", null);
        setField(term41660, term41660.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41660, term41660.getClass(), "focusCycleRoot", false);
        setBooleanField(term41660, term41660.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41660, term41660.getClass(), "printingThreads", null);
        setBooleanField(term41660, term41660.getClass(), "printing", false);
        setField(term41660, term41660.getClass(), "containerListener", null);
        setIntField(term41660, term41660.getClass(), "listeningChildren", 0);
        setIntField(term41660, term41660.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41660, term41660.getClass(), "descendantsCount", 0);
        setField(term41660, term41660.getClass(), "preserveBackgroundColor", null);
        setIntField(term41660, term41660.getClass(), "numOfHWComponents", 0);
        setIntField(term41660, term41660.getClass(), "numOfLWComponents", 0);
        setField(term41660, term41660.getClass(), "modalComp", null);
        setField(term41660, term41660.getClass(), "modalAppContext", null);
        setIntField(term41660, term41660.getClass(), "containerSerializedDataVersion", 0);
        setField(term41660, term41660.getClass(), "peer", null);
        setField(term41660, term41660.getClass(), "parent", null);
        setField(term41660, term41660.getClass(), "appContext", null);
        setIntField(term41660, term41660.getClass(), "x", 0);
        setIntField(term41660, term41660.getClass(), "y", 0);
        setIntField(term41660, term41660.getClass(), "width", 0);
        setIntField(term41660, term41660.getClass(), "height", 0);
        setField(term41660, term41660.getClass(), "foreground", null);
        setField(term41660, term41660.getClass(), "background", null);
        setField(term41660, term41660.getClass(), "font", null);
        setField(term41660, term41660.getClass(), "peerFont", null);
        setField(term41660, term41660.getClass(), "cursor", null);
        setField(term41660, term41660.getClass(), "locale", null);
        setField(term41660, term41660.getClass(), "graphicsConfig", null);
        setField(term41660, term41660.getClass(), "bufferStrategy", null);
        setBooleanField(term41660, term41660.getClass(), "ignoreRepaint", false);
        setBooleanField(term41660, term41660.getClass(), "visible", false);
        setBooleanField(term41660, term41660.getClass(), "enabled", false);
        setBooleanField(term41660, term41660.getClass(), "valid", false);
        setField(term41660, term41660.getClass(), "dropTarget", null);
        setField(term41660, term41660.getClass(), "popups", null);
        setField(term41660, term41660.getClass(), "name", null);
        setBooleanField(term41660, term41660.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41660, term41660.getClass(), "focusable", false);
        setIntField(term41660, term41660.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41660, term41660.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41660, term41660.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41660, term41660.getClass(), "acc", null);
        setField(term41660, term41660.getClass(), "minSize", null);
        setBooleanField(term41660, term41660.getClass(), "minSizeSet", false);
        setField(term41660, term41660.getClass(), "prefSize", null);
        setBooleanField(term41660, term41660.getClass(), "prefSizeSet", false);
        setField(term41660, term41660.getClass(), "maxSize", null);
        setBooleanField(term41660, term41660.getClass(), "maxSizeSet", false);
        setField(term41660, term41660.getClass(), "componentOrientation", null);
        setBooleanField(term41660, term41660.getClass(), "newEventsOnly", false);
        setField(term41660, term41660.getClass(), "componentListener", null);
        setField(term41660, term41660.getClass(), "focusListener", null);
        setField(term41660, term41660.getClass(), "hierarchyListener", null);
        setField(term41660, term41660.getClass(), "hierarchyBoundsListener", null);
        setField(term41660, term41660.getClass(), "keyListener", null);
        setField(term41660, term41660.getClass(), "mouseListener", null);
        setField(term41660, term41660.getClass(), "mouseMotionListener", null);
        setField(term41660, term41660.getClass(), "mouseWheelListener", null);
        setField(term41660, term41660.getClass(), "inputMethodListener", null);
        setLongField(term41660, term41660.getClass(), "eventMask", 0L);
        setField(term41660, term41660.getClass(), "changeSupport", null);
        setField(term41660, term41660.getClass(), "objectLock", null);
        setBooleanField(term41660, term41660.getClass(), "isPacked", false);
        setIntField(term41660, term41660.getClass(), "boundsOp", 0);
        setField(term41660, term41660.getClass(), "compoundShape", null);
        setField(term41660, term41660.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41660, term41660.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41660, term41660.getClass(), "backgroundEraseDisabled", false);
        setField(term41660, term41660.getClass(), "eventCache", null);
        setBooleanField(term41660, term41660.getClass(), "coalescingEnabled", false);
        setBooleanField(term41660, term41660.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41660, term41660.getClass(), "componentSerializedDataVersion", 0);
        setField(term41660, term41660.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeLast", argTypes, term41660, args);
    }

};


