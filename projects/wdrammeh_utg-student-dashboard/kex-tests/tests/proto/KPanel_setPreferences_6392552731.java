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

public class KPanel_setPreferences_6392552731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41872;

    public KPanel_setPreferences_6392552731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41872 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41872, term41872.getClass(), "reflectTheme", false);
        setBooleanField(term41872, term41872.getClass(), "isAlignmentXSet", false);
        setFloatField(term41872, term41872.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41872, term41872.getClass(), "isAlignmentYSet", false);
        setFloatField(term41872, term41872.getClass(), "alignmentY", 0.0F);
        setField(term41872, term41872.getClass(), "ui", null);
        setField(term41872, term41872.getClass(), "listenerList", null);
        setField(term41872, term41872.getClass(), "clientProperties", null);
        setField(term41872, term41872.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41872, term41872.getClass(), "autoscrolls", false);
        setField(term41872, term41872.getClass(), "border", null);
        setIntField(term41872, term41872.getClass(), "flags", 0);
        setField(term41872, term41872.getClass(), "inputVerifier", null);
        setBooleanField(term41872, term41872.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41872, term41872.getClass(), "paintingChild", null);
        setField(term41872, term41872.getClass(), "popupMenu", null);
        setField(term41872, term41872.getClass(), "revalidateRunnableScheduled", null);
        setField(term41872, term41872.getClass(), "focusInputMap", null);
        setField(term41872, term41872.getClass(), "ancestorInputMap", null);
        setField(term41872, term41872.getClass(), "windowInputMap", null);
        setField(term41872, term41872.getClass(), "actionMap", null);
        setField(term41872, term41872.getClass(), "aaHint", null);
        setField(term41872, term41872.getClass(), "lcdRenderingHint", null);
        setField(term41872, term41872.getClass(), "component", null);
        setField(term41872, term41872.getClass(), "layoutMgr", null);
        setField(term41872, term41872.getClass(), "dispatcher", null);
        setField(term41872, term41872.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41872, term41872.getClass(), "focusCycleRoot", false);
        setBooleanField(term41872, term41872.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41872, term41872.getClass(), "printingThreads", null);
        setBooleanField(term41872, term41872.getClass(), "printing", false);
        setField(term41872, term41872.getClass(), "containerListener", null);
        setIntField(term41872, term41872.getClass(), "listeningChildren", 0);
        setIntField(term41872, term41872.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41872, term41872.getClass(), "descendantsCount", 0);
        setField(term41872, term41872.getClass(), "preserveBackgroundColor", null);
        setIntField(term41872, term41872.getClass(), "numOfHWComponents", 0);
        setIntField(term41872, term41872.getClass(), "numOfLWComponents", 0);
        setField(term41872, term41872.getClass(), "modalComp", null);
        setField(term41872, term41872.getClass(), "modalAppContext", null);
        setIntField(term41872, term41872.getClass(), "containerSerializedDataVersion", 0);
        setField(term41872, term41872.getClass(), "peer", null);
        setField(term41872, term41872.getClass(), "parent", null);
        setField(term41872, term41872.getClass(), "appContext", null);
        setIntField(term41872, term41872.getClass(), "x", 0);
        setIntField(term41872, term41872.getClass(), "y", 0);
        setIntField(term41872, term41872.getClass(), "width", 0);
        setIntField(term41872, term41872.getClass(), "height", 0);
        setField(term41872, term41872.getClass(), "foreground", null);
        setField(term41872, term41872.getClass(), "background", null);
        setField(term41872, term41872.getClass(), "font", null);
        setField(term41872, term41872.getClass(), "peerFont", null);
        setField(term41872, term41872.getClass(), "cursor", null);
        setField(term41872, term41872.getClass(), "locale", null);
        setField(term41872, term41872.getClass(), "graphicsConfig", null);
        setField(term41872, term41872.getClass(), "bufferStrategy", null);
        setBooleanField(term41872, term41872.getClass(), "ignoreRepaint", false);
        setBooleanField(term41872, term41872.getClass(), "visible", false);
        setBooleanField(term41872, term41872.getClass(), "enabled", false);
        setBooleanField(term41872, term41872.getClass(), "valid", false);
        setField(term41872, term41872.getClass(), "dropTarget", null);
        setField(term41872, term41872.getClass(), "popups", null);
        setField(term41872, term41872.getClass(), "name", null);
        setBooleanField(term41872, term41872.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41872, term41872.getClass(), "focusable", false);
        setIntField(term41872, term41872.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41872, term41872.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41872, term41872.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41872, term41872.getClass(), "acc", null);
        setField(term41872, term41872.getClass(), "minSize", null);
        setBooleanField(term41872, term41872.getClass(), "minSizeSet", false);
        setField(term41872, term41872.getClass(), "prefSize", null);
        setBooleanField(term41872, term41872.getClass(), "prefSizeSet", false);
        setField(term41872, term41872.getClass(), "maxSize", null);
        setBooleanField(term41872, term41872.getClass(), "maxSizeSet", false);
        setField(term41872, term41872.getClass(), "componentOrientation", null);
        setBooleanField(term41872, term41872.getClass(), "newEventsOnly", false);
        setField(term41872, term41872.getClass(), "componentListener", null);
        setField(term41872, term41872.getClass(), "focusListener", null);
        setField(term41872, term41872.getClass(), "hierarchyListener", null);
        setField(term41872, term41872.getClass(), "hierarchyBoundsListener", null);
        setField(term41872, term41872.getClass(), "keyListener", null);
        setField(term41872, term41872.getClass(), "mouseListener", null);
        setField(term41872, term41872.getClass(), "mouseMotionListener", null);
        setField(term41872, term41872.getClass(), "mouseWheelListener", null);
        setField(term41872, term41872.getClass(), "inputMethodListener", null);
        setLongField(term41872, term41872.getClass(), "eventMask", 0L);
        setField(term41872, term41872.getClass(), "changeSupport", null);
        setField(term41872, term41872.getClass(), "objectLock", null);
        setBooleanField(term41872, term41872.getClass(), "isPacked", false);
        setIntField(term41872, term41872.getClass(), "boundsOp", 0);
        setField(term41872, term41872.getClass(), "compoundShape", null);
        setField(term41872, term41872.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41872, term41872.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41872, term41872.getClass(), "backgroundEraseDisabled", false);
        setField(term41872, term41872.getClass(), "eventCache", null);
        setBooleanField(term41872, term41872.getClass(), "coalescingEnabled", false);
        setBooleanField(term41872, term41872.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41872, term41872.getClass(), "componentSerializedDataVersion", 0);
        setField(term41872, term41872.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term41872, args);
    }

};


