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
     Object term41839;

    public KPanel_setPreferences_6392552731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41839 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41839, term41839.getClass(), "reflectTheme", false);
        setBooleanField(term41839, term41839.getClass(), "isAlignmentXSet", false);
        setFloatField(term41839, term41839.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41839, term41839.getClass(), "isAlignmentYSet", false);
        setFloatField(term41839, term41839.getClass(), "alignmentY", 0.0F);
        setField(term41839, term41839.getClass(), "ui", null);
        setField(term41839, term41839.getClass(), "listenerList", null);
        setField(term41839, term41839.getClass(), "clientProperties", null);
        setField(term41839, term41839.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41839, term41839.getClass(), "autoscrolls", false);
        setField(term41839, term41839.getClass(), "border", null);
        setIntField(term41839, term41839.getClass(), "flags", 0);
        setField(term41839, term41839.getClass(), "inputVerifier", null);
        setBooleanField(term41839, term41839.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41839, term41839.getClass(), "paintingChild", null);
        setField(term41839, term41839.getClass(), "popupMenu", null);
        setField(term41839, term41839.getClass(), "revalidateRunnableScheduled", null);
        setField(term41839, term41839.getClass(), "focusInputMap", null);
        setField(term41839, term41839.getClass(), "ancestorInputMap", null);
        setField(term41839, term41839.getClass(), "windowInputMap", null);
        setField(term41839, term41839.getClass(), "actionMap", null);
        setField(term41839, term41839.getClass(), "aaHint", null);
        setField(term41839, term41839.getClass(), "lcdRenderingHint", null);
        setField(term41839, term41839.getClass(), "component", null);
        setField(term41839, term41839.getClass(), "layoutMgr", null);
        setField(term41839, term41839.getClass(), "dispatcher", null);
        setField(term41839, term41839.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41839, term41839.getClass(), "focusCycleRoot", false);
        setBooleanField(term41839, term41839.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41839, term41839.getClass(), "printingThreads", null);
        setBooleanField(term41839, term41839.getClass(), "printing", false);
        setField(term41839, term41839.getClass(), "containerListener", null);
        setIntField(term41839, term41839.getClass(), "listeningChildren", 0);
        setIntField(term41839, term41839.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41839, term41839.getClass(), "descendantsCount", 0);
        setField(term41839, term41839.getClass(), "preserveBackgroundColor", null);
        setIntField(term41839, term41839.getClass(), "numOfHWComponents", 0);
        setIntField(term41839, term41839.getClass(), "numOfLWComponents", 0);
        setField(term41839, term41839.getClass(), "modalComp", null);
        setField(term41839, term41839.getClass(), "modalAppContext", null);
        setIntField(term41839, term41839.getClass(), "containerSerializedDataVersion", 0);
        setField(term41839, term41839.getClass(), "peer", null);
        setField(term41839, term41839.getClass(), "parent", null);
        setField(term41839, term41839.getClass(), "appContext", null);
        setIntField(term41839, term41839.getClass(), "x", 0);
        setIntField(term41839, term41839.getClass(), "y", 0);
        setIntField(term41839, term41839.getClass(), "width", 0);
        setIntField(term41839, term41839.getClass(), "height", 0);
        setField(term41839, term41839.getClass(), "foreground", null);
        setField(term41839, term41839.getClass(), "background", null);
        setField(term41839, term41839.getClass(), "font", null);
        setField(term41839, term41839.getClass(), "peerFont", null);
        setField(term41839, term41839.getClass(), "cursor", null);
        setField(term41839, term41839.getClass(), "locale", null);
        setField(term41839, term41839.getClass(), "graphicsConfig", null);
        setField(term41839, term41839.getClass(), "bufferStrategy", null);
        setBooleanField(term41839, term41839.getClass(), "ignoreRepaint", false);
        setBooleanField(term41839, term41839.getClass(), "visible", false);
        setBooleanField(term41839, term41839.getClass(), "enabled", false);
        setBooleanField(term41839, term41839.getClass(), "valid", false);
        setField(term41839, term41839.getClass(), "dropTarget", null);
        setField(term41839, term41839.getClass(), "popups", null);
        setField(term41839, term41839.getClass(), "name", null);
        setBooleanField(term41839, term41839.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41839, term41839.getClass(), "focusable", false);
        setIntField(term41839, term41839.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41839, term41839.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41839, term41839.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41839, term41839.getClass(), "acc", null);
        setField(term41839, term41839.getClass(), "minSize", null);
        setBooleanField(term41839, term41839.getClass(), "minSizeSet", false);
        setField(term41839, term41839.getClass(), "prefSize", null);
        setBooleanField(term41839, term41839.getClass(), "prefSizeSet", false);
        setField(term41839, term41839.getClass(), "maxSize", null);
        setBooleanField(term41839, term41839.getClass(), "maxSizeSet", false);
        setField(term41839, term41839.getClass(), "componentOrientation", null);
        setBooleanField(term41839, term41839.getClass(), "newEventsOnly", false);
        setField(term41839, term41839.getClass(), "componentListener", null);
        setField(term41839, term41839.getClass(), "focusListener", null);
        setField(term41839, term41839.getClass(), "hierarchyListener", null);
        setField(term41839, term41839.getClass(), "hierarchyBoundsListener", null);
        setField(term41839, term41839.getClass(), "keyListener", null);
        setField(term41839, term41839.getClass(), "mouseListener", null);
        setField(term41839, term41839.getClass(), "mouseMotionListener", null);
        setField(term41839, term41839.getClass(), "mouseWheelListener", null);
        setField(term41839, term41839.getClass(), "inputMethodListener", null);
        setLongField(term41839, term41839.getClass(), "eventMask", 0L);
        setField(term41839, term41839.getClass(), "changeSupport", null);
        setField(term41839, term41839.getClass(), "objectLock", null);
        setBooleanField(term41839, term41839.getClass(), "isPacked", false);
        setIntField(term41839, term41839.getClass(), "boundsOp", 0);
        setField(term41839, term41839.getClass(), "compoundShape", null);
        setField(term41839, term41839.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41839, term41839.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41839, term41839.getClass(), "backgroundEraseDisabled", false);
        setField(term41839, term41839.getClass(), "eventCache", null);
        setBooleanField(term41839, term41839.getClass(), "coalescingEnabled", false);
        setBooleanField(term41839, term41839.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41839, term41839.getClass(), "componentSerializedDataVersion", 0);
        setField(term41839, term41839.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term41839, args);
    }

};


