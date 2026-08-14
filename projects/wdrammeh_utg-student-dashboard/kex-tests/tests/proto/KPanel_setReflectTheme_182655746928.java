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
     Object term41744;
     Object term41786;

    public KPanel_setReflectTheme_182655746928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41744 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41744, term41744.getClass(), "reflectTheme", false);
        setBooleanField(term41744, term41744.getClass(), "isAlignmentXSet", false);
        setFloatField(term41744, term41744.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41744, term41744.getClass(), "isAlignmentYSet", false);
        setFloatField(term41744, term41744.getClass(), "alignmentY", 0.0F);
        setField(term41744, term41744.getClass(), "ui", null);
        setField(term41744, term41744.getClass(), "listenerList", null);
        setField(term41744, term41744.getClass(), "clientProperties", null);
        setField(term41744, term41744.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41744, term41744.getClass(), "autoscrolls", false);
        setField(term41744, term41744.getClass(), "border", null);
        setIntField(term41744, term41744.getClass(), "flags", 0);
        setField(term41744, term41744.getClass(), "inputVerifier", null);
        setBooleanField(term41744, term41744.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41744, term41744.getClass(), "paintingChild", null);
        setField(term41744, term41744.getClass(), "popupMenu", null);
        setField(term41744, term41744.getClass(), "revalidateRunnableScheduled", null);
        setField(term41744, term41744.getClass(), "focusInputMap", null);
        setField(term41744, term41744.getClass(), "ancestorInputMap", null);
        setField(term41744, term41744.getClass(), "windowInputMap", null);
        setField(term41744, term41744.getClass(), "actionMap", null);
        setField(term41744, term41744.getClass(), "aaHint", null);
        setField(term41744, term41744.getClass(), "lcdRenderingHint", null);
        setField(term41744, term41744.getClass(), "component", null);
        setField(term41744, term41744.getClass(), "layoutMgr", null);
        setField(term41744, term41744.getClass(), "dispatcher", null);
        setField(term41744, term41744.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41744, term41744.getClass(), "focusCycleRoot", false);
        setBooleanField(term41744, term41744.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41744, term41744.getClass(), "printingThreads", null);
        setBooleanField(term41744, term41744.getClass(), "printing", false);
        setField(term41744, term41744.getClass(), "containerListener", null);
        setIntField(term41744, term41744.getClass(), "listeningChildren", 0);
        setIntField(term41744, term41744.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41744, term41744.getClass(), "descendantsCount", 0);
        setField(term41744, term41744.getClass(), "preserveBackgroundColor", null);
        setIntField(term41744, term41744.getClass(), "numOfHWComponents", 0);
        setIntField(term41744, term41744.getClass(), "numOfLWComponents", 0);
        setField(term41744, term41744.getClass(), "modalComp", null);
        setField(term41744, term41744.getClass(), "modalAppContext", null);
        setIntField(term41744, term41744.getClass(), "containerSerializedDataVersion", 0);
        setField(term41744, term41744.getClass(), "peer", null);
        setField(term41744, term41744.getClass(), "parent", null);
        setField(term41744, term41744.getClass(), "appContext", null);
        setIntField(term41744, term41744.getClass(), "x", 0);
        setIntField(term41744, term41744.getClass(), "y", 0);
        setIntField(term41744, term41744.getClass(), "width", 0);
        setIntField(term41744, term41744.getClass(), "height", 0);
        setField(term41744, term41744.getClass(), "foreground", null);
        setField(term41744, term41744.getClass(), "background", null);
        setField(term41744, term41744.getClass(), "font", null);
        setField(term41744, term41744.getClass(), "peerFont", null);
        setField(term41744, term41744.getClass(), "cursor", null);
        setField(term41744, term41744.getClass(), "locale", null);
        setField(term41744, term41744.getClass(), "graphicsConfig", null);
        setField(term41744, term41744.getClass(), "bufferStrategy", null);
        setBooleanField(term41744, term41744.getClass(), "ignoreRepaint", false);
        setBooleanField(term41744, term41744.getClass(), "visible", false);
        setBooleanField(term41744, term41744.getClass(), "enabled", false);
        setBooleanField(term41744, term41744.getClass(), "valid", false);
        setField(term41744, term41744.getClass(), "dropTarget", null);
        setField(term41744, term41744.getClass(), "popups", null);
        setField(term41744, term41744.getClass(), "name", null);
        setBooleanField(term41744, term41744.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41744, term41744.getClass(), "focusable", false);
        setIntField(term41744, term41744.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41744, term41744.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41744, term41744.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41744, term41744.getClass(), "acc", null);
        setField(term41744, term41744.getClass(), "minSize", null);
        setBooleanField(term41744, term41744.getClass(), "minSizeSet", false);
        setField(term41744, term41744.getClass(), "prefSize", null);
        setBooleanField(term41744, term41744.getClass(), "prefSizeSet", false);
        setField(term41744, term41744.getClass(), "maxSize", null);
        setBooleanField(term41744, term41744.getClass(), "maxSizeSet", false);
        setField(term41744, term41744.getClass(), "componentOrientation", null);
        setBooleanField(term41744, term41744.getClass(), "newEventsOnly", false);
        setField(term41744, term41744.getClass(), "componentListener", null);
        setField(term41744, term41744.getClass(), "focusListener", null);
        setField(term41744, term41744.getClass(), "hierarchyListener", null);
        setField(term41744, term41744.getClass(), "hierarchyBoundsListener", null);
        setField(term41744, term41744.getClass(), "keyListener", null);
        setField(term41744, term41744.getClass(), "mouseListener", null);
        setField(term41744, term41744.getClass(), "mouseMotionListener", null);
        setField(term41744, term41744.getClass(), "mouseWheelListener", null);
        setField(term41744, term41744.getClass(), "inputMethodListener", null);
        setLongField(term41744, term41744.getClass(), "eventMask", 0L);
        setField(term41744, term41744.getClass(), "changeSupport", null);
        setField(term41744, term41744.getClass(), "objectLock", null);
        setBooleanField(term41744, term41744.getClass(), "isPacked", false);
        setIntField(term41744, term41744.getClass(), "boundsOp", 0);
        setField(term41744, term41744.getClass(), "compoundShape", null);
        setField(term41744, term41744.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41744, term41744.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41744, term41744.getClass(), "backgroundEraseDisabled", false);
        setField(term41744, term41744.getClass(), "eventCache", null);
        setBooleanField(term41744, term41744.getClass(), "coalescingEnabled", false);
        setBooleanField(term41744, term41744.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41744, term41744.getClass(), "componentSerializedDataVersion", 0);
        setField(term41744, term41744.getClass(), "accessibleContext", null);
        term41786 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term41786;
        callMethod(klass, "setReflectTheme", argTypes, term41744, args);
    }

};


