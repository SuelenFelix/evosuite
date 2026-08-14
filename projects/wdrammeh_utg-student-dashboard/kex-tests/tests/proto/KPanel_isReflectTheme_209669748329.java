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
     Object term41788;

    public KPanel_isReflectTheme_209669748329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41788 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41788, term41788.getClass(), "reflectTheme", false);
        setBooleanField(term41788, term41788.getClass(), "isAlignmentXSet", false);
        setFloatField(term41788, term41788.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41788, term41788.getClass(), "isAlignmentYSet", false);
        setFloatField(term41788, term41788.getClass(), "alignmentY", 0.0F);
        setField(term41788, term41788.getClass(), "ui", null);
        setField(term41788, term41788.getClass(), "listenerList", null);
        setField(term41788, term41788.getClass(), "clientProperties", null);
        setField(term41788, term41788.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41788, term41788.getClass(), "autoscrolls", false);
        setField(term41788, term41788.getClass(), "border", null);
        setIntField(term41788, term41788.getClass(), "flags", 0);
        setField(term41788, term41788.getClass(), "inputVerifier", null);
        setBooleanField(term41788, term41788.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41788, term41788.getClass(), "paintingChild", null);
        setField(term41788, term41788.getClass(), "popupMenu", null);
        setField(term41788, term41788.getClass(), "revalidateRunnableScheduled", null);
        setField(term41788, term41788.getClass(), "focusInputMap", null);
        setField(term41788, term41788.getClass(), "ancestorInputMap", null);
        setField(term41788, term41788.getClass(), "windowInputMap", null);
        setField(term41788, term41788.getClass(), "actionMap", null);
        setField(term41788, term41788.getClass(), "aaHint", null);
        setField(term41788, term41788.getClass(), "lcdRenderingHint", null);
        setField(term41788, term41788.getClass(), "component", null);
        setField(term41788, term41788.getClass(), "layoutMgr", null);
        setField(term41788, term41788.getClass(), "dispatcher", null);
        setField(term41788, term41788.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41788, term41788.getClass(), "focusCycleRoot", false);
        setBooleanField(term41788, term41788.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41788, term41788.getClass(), "printingThreads", null);
        setBooleanField(term41788, term41788.getClass(), "printing", false);
        setField(term41788, term41788.getClass(), "containerListener", null);
        setIntField(term41788, term41788.getClass(), "listeningChildren", 0);
        setIntField(term41788, term41788.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41788, term41788.getClass(), "descendantsCount", 0);
        setField(term41788, term41788.getClass(), "preserveBackgroundColor", null);
        setIntField(term41788, term41788.getClass(), "numOfHWComponents", 0);
        setIntField(term41788, term41788.getClass(), "numOfLWComponents", 0);
        setField(term41788, term41788.getClass(), "modalComp", null);
        setField(term41788, term41788.getClass(), "modalAppContext", null);
        setIntField(term41788, term41788.getClass(), "containerSerializedDataVersion", 0);
        setField(term41788, term41788.getClass(), "peer", null);
        setField(term41788, term41788.getClass(), "parent", null);
        setField(term41788, term41788.getClass(), "appContext", null);
        setIntField(term41788, term41788.getClass(), "x", 0);
        setIntField(term41788, term41788.getClass(), "y", 0);
        setIntField(term41788, term41788.getClass(), "width", 0);
        setIntField(term41788, term41788.getClass(), "height", 0);
        setField(term41788, term41788.getClass(), "foreground", null);
        setField(term41788, term41788.getClass(), "background", null);
        setField(term41788, term41788.getClass(), "font", null);
        setField(term41788, term41788.getClass(), "peerFont", null);
        setField(term41788, term41788.getClass(), "cursor", null);
        setField(term41788, term41788.getClass(), "locale", null);
        setField(term41788, term41788.getClass(), "graphicsConfig", null);
        setField(term41788, term41788.getClass(), "bufferStrategy", null);
        setBooleanField(term41788, term41788.getClass(), "ignoreRepaint", false);
        setBooleanField(term41788, term41788.getClass(), "visible", false);
        setBooleanField(term41788, term41788.getClass(), "enabled", false);
        setBooleanField(term41788, term41788.getClass(), "valid", false);
        setField(term41788, term41788.getClass(), "dropTarget", null);
        setField(term41788, term41788.getClass(), "popups", null);
        setField(term41788, term41788.getClass(), "name", null);
        setBooleanField(term41788, term41788.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41788, term41788.getClass(), "focusable", false);
        setIntField(term41788, term41788.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41788, term41788.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41788, term41788.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41788, term41788.getClass(), "acc", null);
        setField(term41788, term41788.getClass(), "minSize", null);
        setBooleanField(term41788, term41788.getClass(), "minSizeSet", false);
        setField(term41788, term41788.getClass(), "prefSize", null);
        setBooleanField(term41788, term41788.getClass(), "prefSizeSet", false);
        setField(term41788, term41788.getClass(), "maxSize", null);
        setBooleanField(term41788, term41788.getClass(), "maxSizeSet", false);
        setField(term41788, term41788.getClass(), "componentOrientation", null);
        setBooleanField(term41788, term41788.getClass(), "newEventsOnly", false);
        setField(term41788, term41788.getClass(), "componentListener", null);
        setField(term41788, term41788.getClass(), "focusListener", null);
        setField(term41788, term41788.getClass(), "hierarchyListener", null);
        setField(term41788, term41788.getClass(), "hierarchyBoundsListener", null);
        setField(term41788, term41788.getClass(), "keyListener", null);
        setField(term41788, term41788.getClass(), "mouseListener", null);
        setField(term41788, term41788.getClass(), "mouseMotionListener", null);
        setField(term41788, term41788.getClass(), "mouseWheelListener", null);
        setField(term41788, term41788.getClass(), "inputMethodListener", null);
        setLongField(term41788, term41788.getClass(), "eventMask", 0L);
        setField(term41788, term41788.getClass(), "changeSupport", null);
        setField(term41788, term41788.getClass(), "objectLock", null);
        setBooleanField(term41788, term41788.getClass(), "isPacked", false);
        setIntField(term41788, term41788.getClass(), "boundsOp", 0);
        setField(term41788, term41788.getClass(), "compoundShape", null);
        setField(term41788, term41788.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41788, term41788.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41788, term41788.getClass(), "backgroundEraseDisabled", false);
        setField(term41788, term41788.getClass(), "eventCache", null);
        setBooleanField(term41788, term41788.getClass(), "coalescingEnabled", false);
        setBooleanField(term41788, term41788.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41788, term41788.getClass(), "componentSerializedDataVersion", 0);
        setField(term41788, term41788.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReflectTheme", argTypes, term41788, args);
    }

};


