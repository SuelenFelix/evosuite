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

public class KPanel_isReflectTheme_209669748329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41755;

    public KPanel_isReflectTheme_209669748329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41755 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41755, term41755.getClass(), "reflectTheme", false);
        setBooleanField(term41755, term41755.getClass(), "isAlignmentXSet", false);
        setFloatField(term41755, term41755.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41755, term41755.getClass(), "isAlignmentYSet", false);
        setFloatField(term41755, term41755.getClass(), "alignmentY", 0.0F);
        setField(term41755, term41755.getClass(), "ui", null);
        setField(term41755, term41755.getClass(), "listenerList", null);
        setField(term41755, term41755.getClass(), "clientProperties", null);
        setField(term41755, term41755.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41755, term41755.getClass(), "autoscrolls", false);
        setField(term41755, term41755.getClass(), "border", null);
        setIntField(term41755, term41755.getClass(), "flags", 0);
        setField(term41755, term41755.getClass(), "inputVerifier", null);
        setBooleanField(term41755, term41755.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41755, term41755.getClass(), "paintingChild", null);
        setField(term41755, term41755.getClass(), "popupMenu", null);
        setField(term41755, term41755.getClass(), "revalidateRunnableScheduled", null);
        setField(term41755, term41755.getClass(), "focusInputMap", null);
        setField(term41755, term41755.getClass(), "ancestorInputMap", null);
        setField(term41755, term41755.getClass(), "windowInputMap", null);
        setField(term41755, term41755.getClass(), "actionMap", null);
        setField(term41755, term41755.getClass(), "aaHint", null);
        setField(term41755, term41755.getClass(), "lcdRenderingHint", null);
        setField(term41755, term41755.getClass(), "component", null);
        setField(term41755, term41755.getClass(), "layoutMgr", null);
        setField(term41755, term41755.getClass(), "dispatcher", null);
        setField(term41755, term41755.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41755, term41755.getClass(), "focusCycleRoot", false);
        setBooleanField(term41755, term41755.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41755, term41755.getClass(), "printingThreads", null);
        setBooleanField(term41755, term41755.getClass(), "printing", false);
        setField(term41755, term41755.getClass(), "containerListener", null);
        setIntField(term41755, term41755.getClass(), "listeningChildren", 0);
        setIntField(term41755, term41755.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41755, term41755.getClass(), "descendantsCount", 0);
        setField(term41755, term41755.getClass(), "preserveBackgroundColor", null);
        setIntField(term41755, term41755.getClass(), "numOfHWComponents", 0);
        setIntField(term41755, term41755.getClass(), "numOfLWComponents", 0);
        setField(term41755, term41755.getClass(), "modalComp", null);
        setField(term41755, term41755.getClass(), "modalAppContext", null);
        setIntField(term41755, term41755.getClass(), "containerSerializedDataVersion", 0);
        setField(term41755, term41755.getClass(), "peer", null);
        setField(term41755, term41755.getClass(), "parent", null);
        setField(term41755, term41755.getClass(), "appContext", null);
        setIntField(term41755, term41755.getClass(), "x", 0);
        setIntField(term41755, term41755.getClass(), "y", 0);
        setIntField(term41755, term41755.getClass(), "width", 0);
        setIntField(term41755, term41755.getClass(), "height", 0);
        setField(term41755, term41755.getClass(), "foreground", null);
        setField(term41755, term41755.getClass(), "background", null);
        setField(term41755, term41755.getClass(), "font", null);
        setField(term41755, term41755.getClass(), "peerFont", null);
        setField(term41755, term41755.getClass(), "cursor", null);
        setField(term41755, term41755.getClass(), "locale", null);
        setField(term41755, term41755.getClass(), "graphicsConfig", null);
        setField(term41755, term41755.getClass(), "bufferStrategy", null);
        setBooleanField(term41755, term41755.getClass(), "ignoreRepaint", false);
        setBooleanField(term41755, term41755.getClass(), "visible", false);
        setBooleanField(term41755, term41755.getClass(), "enabled", false);
        setBooleanField(term41755, term41755.getClass(), "valid", false);
        setField(term41755, term41755.getClass(), "dropTarget", null);
        setField(term41755, term41755.getClass(), "popups", null);
        setField(term41755, term41755.getClass(), "name", null);
        setBooleanField(term41755, term41755.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41755, term41755.getClass(), "focusable", false);
        setIntField(term41755, term41755.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41755, term41755.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41755, term41755.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41755, term41755.getClass(), "acc", null);
        setField(term41755, term41755.getClass(), "minSize", null);
        setBooleanField(term41755, term41755.getClass(), "minSizeSet", false);
        setField(term41755, term41755.getClass(), "prefSize", null);
        setBooleanField(term41755, term41755.getClass(), "prefSizeSet", false);
        setField(term41755, term41755.getClass(), "maxSize", null);
        setBooleanField(term41755, term41755.getClass(), "maxSizeSet", false);
        setField(term41755, term41755.getClass(), "componentOrientation", null);
        setBooleanField(term41755, term41755.getClass(), "newEventsOnly", false);
        setField(term41755, term41755.getClass(), "componentListener", null);
        setField(term41755, term41755.getClass(), "focusListener", null);
        setField(term41755, term41755.getClass(), "hierarchyListener", null);
        setField(term41755, term41755.getClass(), "hierarchyBoundsListener", null);
        setField(term41755, term41755.getClass(), "keyListener", null);
        setField(term41755, term41755.getClass(), "mouseListener", null);
        setField(term41755, term41755.getClass(), "mouseMotionListener", null);
        setField(term41755, term41755.getClass(), "mouseWheelListener", null);
        setField(term41755, term41755.getClass(), "inputMethodListener", null);
        setLongField(term41755, term41755.getClass(), "eventMask", 0L);
        setField(term41755, term41755.getClass(), "changeSupport", null);
        setField(term41755, term41755.getClass(), "objectLock", null);
        setBooleanField(term41755, term41755.getClass(), "isPacked", false);
        setIntField(term41755, term41755.getClass(), "boundsOp", 0);
        setField(term41755, term41755.getClass(), "compoundShape", null);
        setField(term41755, term41755.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41755, term41755.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41755, term41755.getClass(), "backgroundEraseDisabled", false);
        setField(term41755, term41755.getClass(), "eventCache", null);
        setBooleanField(term41755, term41755.getClass(), "coalescingEnabled", false);
        setBooleanField(term41755, term41755.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41755, term41755.getClass(), "componentSerializedDataVersion", 0);
        setField(term41755, term41755.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReflectTheme", argTypes, term41755, args);
    }

};


