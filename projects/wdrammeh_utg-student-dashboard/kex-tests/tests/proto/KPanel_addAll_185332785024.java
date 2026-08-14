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

public class KPanel_addAll_185332785024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41576;

    public KPanel_addAll_185332785024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41576 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41576, term41576.getClass(), "reflectTheme", false);
        setBooleanField(term41576, term41576.getClass(), "isAlignmentXSet", false);
        setFloatField(term41576, term41576.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41576, term41576.getClass(), "isAlignmentYSet", false);
        setFloatField(term41576, term41576.getClass(), "alignmentY", 0.0F);
        setField(term41576, term41576.getClass(), "ui", null);
        setField(term41576, term41576.getClass(), "listenerList", null);
        setField(term41576, term41576.getClass(), "clientProperties", null);
        setField(term41576, term41576.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41576, term41576.getClass(), "autoscrolls", false);
        setField(term41576, term41576.getClass(), "border", null);
        setIntField(term41576, term41576.getClass(), "flags", 0);
        setField(term41576, term41576.getClass(), "inputVerifier", null);
        setBooleanField(term41576, term41576.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41576, term41576.getClass(), "paintingChild", null);
        setField(term41576, term41576.getClass(), "popupMenu", null);
        setField(term41576, term41576.getClass(), "revalidateRunnableScheduled", null);
        setField(term41576, term41576.getClass(), "focusInputMap", null);
        setField(term41576, term41576.getClass(), "ancestorInputMap", null);
        setField(term41576, term41576.getClass(), "windowInputMap", null);
        setField(term41576, term41576.getClass(), "actionMap", null);
        setField(term41576, term41576.getClass(), "aaHint", null);
        setField(term41576, term41576.getClass(), "lcdRenderingHint", null);
        setField(term41576, term41576.getClass(), "component", null);
        setField(term41576, term41576.getClass(), "layoutMgr", null);
        setField(term41576, term41576.getClass(), "dispatcher", null);
        setField(term41576, term41576.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41576, term41576.getClass(), "focusCycleRoot", false);
        setBooleanField(term41576, term41576.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41576, term41576.getClass(), "printingThreads", null);
        setBooleanField(term41576, term41576.getClass(), "printing", false);
        setField(term41576, term41576.getClass(), "containerListener", null);
        setIntField(term41576, term41576.getClass(), "listeningChildren", 0);
        setIntField(term41576, term41576.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41576, term41576.getClass(), "descendantsCount", 0);
        setField(term41576, term41576.getClass(), "preserveBackgroundColor", null);
        setIntField(term41576, term41576.getClass(), "numOfHWComponents", 0);
        setIntField(term41576, term41576.getClass(), "numOfLWComponents", 0);
        setField(term41576, term41576.getClass(), "modalComp", null);
        setField(term41576, term41576.getClass(), "modalAppContext", null);
        setIntField(term41576, term41576.getClass(), "containerSerializedDataVersion", 0);
        setField(term41576, term41576.getClass(), "peer", null);
        setField(term41576, term41576.getClass(), "parent", null);
        setField(term41576, term41576.getClass(), "appContext", null);
        setIntField(term41576, term41576.getClass(), "x", 0);
        setIntField(term41576, term41576.getClass(), "y", 0);
        setIntField(term41576, term41576.getClass(), "width", 0);
        setIntField(term41576, term41576.getClass(), "height", 0);
        setField(term41576, term41576.getClass(), "foreground", null);
        setField(term41576, term41576.getClass(), "background", null);
        setField(term41576, term41576.getClass(), "font", null);
        setField(term41576, term41576.getClass(), "peerFont", null);
        setField(term41576, term41576.getClass(), "cursor", null);
        setField(term41576, term41576.getClass(), "locale", null);
        setField(term41576, term41576.getClass(), "graphicsConfig", null);
        setField(term41576, term41576.getClass(), "bufferStrategy", null);
        setBooleanField(term41576, term41576.getClass(), "ignoreRepaint", false);
        setBooleanField(term41576, term41576.getClass(), "visible", false);
        setBooleanField(term41576, term41576.getClass(), "enabled", false);
        setBooleanField(term41576, term41576.getClass(), "valid", false);
        setField(term41576, term41576.getClass(), "dropTarget", null);
        setField(term41576, term41576.getClass(), "popups", null);
        setField(term41576, term41576.getClass(), "name", null);
        setBooleanField(term41576, term41576.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41576, term41576.getClass(), "focusable", false);
        setIntField(term41576, term41576.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41576, term41576.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41576, term41576.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41576, term41576.getClass(), "acc", null);
        setField(term41576, term41576.getClass(), "minSize", null);
        setBooleanField(term41576, term41576.getClass(), "minSizeSet", false);
        setField(term41576, term41576.getClass(), "prefSize", null);
        setBooleanField(term41576, term41576.getClass(), "prefSizeSet", false);
        setField(term41576, term41576.getClass(), "maxSize", null);
        setBooleanField(term41576, term41576.getClass(), "maxSizeSet", false);
        setField(term41576, term41576.getClass(), "componentOrientation", null);
        setBooleanField(term41576, term41576.getClass(), "newEventsOnly", false);
        setField(term41576, term41576.getClass(), "componentListener", null);
        setField(term41576, term41576.getClass(), "focusListener", null);
        setField(term41576, term41576.getClass(), "hierarchyListener", null);
        setField(term41576, term41576.getClass(), "hierarchyBoundsListener", null);
        setField(term41576, term41576.getClass(), "keyListener", null);
        setField(term41576, term41576.getClass(), "mouseListener", null);
        setField(term41576, term41576.getClass(), "mouseMotionListener", null);
        setField(term41576, term41576.getClass(), "mouseWheelListener", null);
        setField(term41576, term41576.getClass(), "inputMethodListener", null);
        setLongField(term41576, term41576.getClass(), "eventMask", 0L);
        setField(term41576, term41576.getClass(), "changeSupport", null);
        setField(term41576, term41576.getClass(), "objectLock", null);
        setBooleanField(term41576, term41576.getClass(), "isPacked", false);
        setIntField(term41576, term41576.getClass(), "boundsOp", 0);
        setField(term41576, term41576.getClass(), "compoundShape", null);
        setField(term41576, term41576.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41576, term41576.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41576, term41576.getClass(), "backgroundEraseDisabled", false);
        setField(term41576, term41576.getClass(), "eventCache", null);
        setBooleanField(term41576, term41576.getClass(), "coalescingEnabled", false);
        setBooleanField(term41576, term41576.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41576, term41576.getClass(), "componentSerializedDataVersion", 0);
        setField(term41576, term41576.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAll", argTypes, term41576, args);
    }

};


