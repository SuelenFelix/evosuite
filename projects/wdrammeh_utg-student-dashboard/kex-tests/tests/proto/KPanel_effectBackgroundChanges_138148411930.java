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

public class KPanel_effectBackgroundChanges_138148411930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41830;

    public KPanel_effectBackgroundChanges_138148411930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41830 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41830, term41830.getClass(), "reflectTheme", false);
        setBooleanField(term41830, term41830.getClass(), "isAlignmentXSet", false);
        setFloatField(term41830, term41830.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41830, term41830.getClass(), "isAlignmentYSet", false);
        setFloatField(term41830, term41830.getClass(), "alignmentY", 0.0F);
        setField(term41830, term41830.getClass(), "ui", null);
        setField(term41830, term41830.getClass(), "listenerList", null);
        setField(term41830, term41830.getClass(), "clientProperties", null);
        setField(term41830, term41830.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41830, term41830.getClass(), "autoscrolls", false);
        setField(term41830, term41830.getClass(), "border", null);
        setIntField(term41830, term41830.getClass(), "flags", 0);
        setField(term41830, term41830.getClass(), "inputVerifier", null);
        setBooleanField(term41830, term41830.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41830, term41830.getClass(), "paintingChild", null);
        setField(term41830, term41830.getClass(), "popupMenu", null);
        setField(term41830, term41830.getClass(), "revalidateRunnableScheduled", null);
        setField(term41830, term41830.getClass(), "focusInputMap", null);
        setField(term41830, term41830.getClass(), "ancestorInputMap", null);
        setField(term41830, term41830.getClass(), "windowInputMap", null);
        setField(term41830, term41830.getClass(), "actionMap", null);
        setField(term41830, term41830.getClass(), "aaHint", null);
        setField(term41830, term41830.getClass(), "lcdRenderingHint", null);
        setField(term41830, term41830.getClass(), "component", null);
        setField(term41830, term41830.getClass(), "layoutMgr", null);
        setField(term41830, term41830.getClass(), "dispatcher", null);
        setField(term41830, term41830.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41830, term41830.getClass(), "focusCycleRoot", false);
        setBooleanField(term41830, term41830.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41830, term41830.getClass(), "printingThreads", null);
        setBooleanField(term41830, term41830.getClass(), "printing", false);
        setField(term41830, term41830.getClass(), "containerListener", null);
        setIntField(term41830, term41830.getClass(), "listeningChildren", 0);
        setIntField(term41830, term41830.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41830, term41830.getClass(), "descendantsCount", 0);
        setField(term41830, term41830.getClass(), "preserveBackgroundColor", null);
        setIntField(term41830, term41830.getClass(), "numOfHWComponents", 0);
        setIntField(term41830, term41830.getClass(), "numOfLWComponents", 0);
        setField(term41830, term41830.getClass(), "modalComp", null);
        setField(term41830, term41830.getClass(), "modalAppContext", null);
        setIntField(term41830, term41830.getClass(), "containerSerializedDataVersion", 0);
        setField(term41830, term41830.getClass(), "peer", null);
        setField(term41830, term41830.getClass(), "parent", null);
        setField(term41830, term41830.getClass(), "appContext", null);
        setIntField(term41830, term41830.getClass(), "x", 0);
        setIntField(term41830, term41830.getClass(), "y", 0);
        setIntField(term41830, term41830.getClass(), "width", 0);
        setIntField(term41830, term41830.getClass(), "height", 0);
        setField(term41830, term41830.getClass(), "foreground", null);
        setField(term41830, term41830.getClass(), "background", null);
        setField(term41830, term41830.getClass(), "font", null);
        setField(term41830, term41830.getClass(), "peerFont", null);
        setField(term41830, term41830.getClass(), "cursor", null);
        setField(term41830, term41830.getClass(), "locale", null);
        setField(term41830, term41830.getClass(), "graphicsConfig", null);
        setField(term41830, term41830.getClass(), "bufferStrategy", null);
        setBooleanField(term41830, term41830.getClass(), "ignoreRepaint", false);
        setBooleanField(term41830, term41830.getClass(), "visible", false);
        setBooleanField(term41830, term41830.getClass(), "enabled", false);
        setBooleanField(term41830, term41830.getClass(), "valid", false);
        setField(term41830, term41830.getClass(), "dropTarget", null);
        setField(term41830, term41830.getClass(), "popups", null);
        setField(term41830, term41830.getClass(), "name", null);
        setBooleanField(term41830, term41830.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41830, term41830.getClass(), "focusable", false);
        setIntField(term41830, term41830.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41830, term41830.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41830, term41830.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41830, term41830.getClass(), "acc", null);
        setField(term41830, term41830.getClass(), "minSize", null);
        setBooleanField(term41830, term41830.getClass(), "minSizeSet", false);
        setField(term41830, term41830.getClass(), "prefSize", null);
        setBooleanField(term41830, term41830.getClass(), "prefSizeSet", false);
        setField(term41830, term41830.getClass(), "maxSize", null);
        setBooleanField(term41830, term41830.getClass(), "maxSizeSet", false);
        setField(term41830, term41830.getClass(), "componentOrientation", null);
        setBooleanField(term41830, term41830.getClass(), "newEventsOnly", false);
        setField(term41830, term41830.getClass(), "componentListener", null);
        setField(term41830, term41830.getClass(), "focusListener", null);
        setField(term41830, term41830.getClass(), "hierarchyListener", null);
        setField(term41830, term41830.getClass(), "hierarchyBoundsListener", null);
        setField(term41830, term41830.getClass(), "keyListener", null);
        setField(term41830, term41830.getClass(), "mouseListener", null);
        setField(term41830, term41830.getClass(), "mouseMotionListener", null);
        setField(term41830, term41830.getClass(), "mouseWheelListener", null);
        setField(term41830, term41830.getClass(), "inputMethodListener", null);
        setLongField(term41830, term41830.getClass(), "eventMask", 0L);
        setField(term41830, term41830.getClass(), "changeSupport", null);
        setField(term41830, term41830.getClass(), "objectLock", null);
        setBooleanField(term41830, term41830.getClass(), "isPacked", false);
        setIntField(term41830, term41830.getClass(), "boundsOp", 0);
        setField(term41830, term41830.getClass(), "compoundShape", null);
        setField(term41830, term41830.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41830, term41830.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41830, term41830.getClass(), "backgroundEraseDisabled", false);
        setField(term41830, term41830.getClass(), "eventCache", null);
        setBooleanField(term41830, term41830.getClass(), "coalescingEnabled", false);
        setBooleanField(term41830, term41830.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41830, term41830.getClass(), "componentSerializedDataVersion", 0);
        setField(term41830, term41830.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectBackgroundChanges", argTypes, term41830, args);
    }

};


