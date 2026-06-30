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
     Object term41543;

    public KPanel_addAll_185332785024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41543 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41543, term41543.getClass(), "reflectTheme", false);
        setBooleanField(term41543, term41543.getClass(), "isAlignmentXSet", false);
        setFloatField(term41543, term41543.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41543, term41543.getClass(), "isAlignmentYSet", false);
        setFloatField(term41543, term41543.getClass(), "alignmentY", 0.0F);
        setField(term41543, term41543.getClass(), "ui", null);
        setField(term41543, term41543.getClass(), "listenerList", null);
        setField(term41543, term41543.getClass(), "clientProperties", null);
        setField(term41543, term41543.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41543, term41543.getClass(), "autoscrolls", false);
        setField(term41543, term41543.getClass(), "border", null);
        setIntField(term41543, term41543.getClass(), "flags", 0);
        setField(term41543, term41543.getClass(), "inputVerifier", null);
        setBooleanField(term41543, term41543.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41543, term41543.getClass(), "paintingChild", null);
        setField(term41543, term41543.getClass(), "popupMenu", null);
        setField(term41543, term41543.getClass(), "revalidateRunnableScheduled", null);
        setField(term41543, term41543.getClass(), "focusInputMap", null);
        setField(term41543, term41543.getClass(), "ancestorInputMap", null);
        setField(term41543, term41543.getClass(), "windowInputMap", null);
        setField(term41543, term41543.getClass(), "actionMap", null);
        setField(term41543, term41543.getClass(), "aaHint", null);
        setField(term41543, term41543.getClass(), "lcdRenderingHint", null);
        setField(term41543, term41543.getClass(), "component", null);
        setField(term41543, term41543.getClass(), "layoutMgr", null);
        setField(term41543, term41543.getClass(), "dispatcher", null);
        setField(term41543, term41543.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41543, term41543.getClass(), "focusCycleRoot", false);
        setBooleanField(term41543, term41543.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41543, term41543.getClass(), "printingThreads", null);
        setBooleanField(term41543, term41543.getClass(), "printing", false);
        setField(term41543, term41543.getClass(), "containerListener", null);
        setIntField(term41543, term41543.getClass(), "listeningChildren", 0);
        setIntField(term41543, term41543.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41543, term41543.getClass(), "descendantsCount", 0);
        setField(term41543, term41543.getClass(), "preserveBackgroundColor", null);
        setIntField(term41543, term41543.getClass(), "numOfHWComponents", 0);
        setIntField(term41543, term41543.getClass(), "numOfLWComponents", 0);
        setField(term41543, term41543.getClass(), "modalComp", null);
        setField(term41543, term41543.getClass(), "modalAppContext", null);
        setIntField(term41543, term41543.getClass(), "containerSerializedDataVersion", 0);
        setField(term41543, term41543.getClass(), "peer", null);
        setField(term41543, term41543.getClass(), "parent", null);
        setField(term41543, term41543.getClass(), "appContext", null);
        setIntField(term41543, term41543.getClass(), "x", 0);
        setIntField(term41543, term41543.getClass(), "y", 0);
        setIntField(term41543, term41543.getClass(), "width", 0);
        setIntField(term41543, term41543.getClass(), "height", 0);
        setField(term41543, term41543.getClass(), "foreground", null);
        setField(term41543, term41543.getClass(), "background", null);
        setField(term41543, term41543.getClass(), "font", null);
        setField(term41543, term41543.getClass(), "peerFont", null);
        setField(term41543, term41543.getClass(), "cursor", null);
        setField(term41543, term41543.getClass(), "locale", null);
        setField(term41543, term41543.getClass(), "graphicsConfig", null);
        setField(term41543, term41543.getClass(), "bufferStrategy", null);
        setBooleanField(term41543, term41543.getClass(), "ignoreRepaint", false);
        setBooleanField(term41543, term41543.getClass(), "visible", false);
        setBooleanField(term41543, term41543.getClass(), "enabled", false);
        setBooleanField(term41543, term41543.getClass(), "valid", false);
        setField(term41543, term41543.getClass(), "dropTarget", null);
        setField(term41543, term41543.getClass(), "popups", null);
        setField(term41543, term41543.getClass(), "name", null);
        setBooleanField(term41543, term41543.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41543, term41543.getClass(), "focusable", false);
        setIntField(term41543, term41543.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41543, term41543.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41543, term41543.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41543, term41543.getClass(), "acc", null);
        setField(term41543, term41543.getClass(), "minSize", null);
        setBooleanField(term41543, term41543.getClass(), "minSizeSet", false);
        setField(term41543, term41543.getClass(), "prefSize", null);
        setBooleanField(term41543, term41543.getClass(), "prefSizeSet", false);
        setField(term41543, term41543.getClass(), "maxSize", null);
        setBooleanField(term41543, term41543.getClass(), "maxSizeSet", false);
        setField(term41543, term41543.getClass(), "componentOrientation", null);
        setBooleanField(term41543, term41543.getClass(), "newEventsOnly", false);
        setField(term41543, term41543.getClass(), "componentListener", null);
        setField(term41543, term41543.getClass(), "focusListener", null);
        setField(term41543, term41543.getClass(), "hierarchyListener", null);
        setField(term41543, term41543.getClass(), "hierarchyBoundsListener", null);
        setField(term41543, term41543.getClass(), "keyListener", null);
        setField(term41543, term41543.getClass(), "mouseListener", null);
        setField(term41543, term41543.getClass(), "mouseMotionListener", null);
        setField(term41543, term41543.getClass(), "mouseWheelListener", null);
        setField(term41543, term41543.getClass(), "inputMethodListener", null);
        setLongField(term41543, term41543.getClass(), "eventMask", 0L);
        setField(term41543, term41543.getClass(), "changeSupport", null);
        setField(term41543, term41543.getClass(), "objectLock", null);
        setBooleanField(term41543, term41543.getClass(), "isPacked", false);
        setIntField(term41543, term41543.getClass(), "boundsOp", 0);
        setField(term41543, term41543.getClass(), "compoundShape", null);
        setField(term41543, term41543.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41543, term41543.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41543, term41543.getClass(), "backgroundEraseDisabled", false);
        setField(term41543, term41543.getClass(), "eventCache", null);
        setBooleanField(term41543, term41543.getClass(), "coalescingEnabled", false);
        setBooleanField(term41543, term41543.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41543, term41543.getClass(), "componentSerializedDataVersion", 0);
        setField(term41543, term41543.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.Component"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAll", argTypes, term41543, args);
    }

};


