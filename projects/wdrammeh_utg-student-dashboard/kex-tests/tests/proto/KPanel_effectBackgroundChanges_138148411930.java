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
     Object term41797;

    public KPanel_effectBackgroundChanges_138148411930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41797 = newInstance(Class.forName("proto.KPanel"));
        setBooleanField(term41797, term41797.getClass(), "reflectTheme", false);
        setBooleanField(term41797, term41797.getClass(), "isAlignmentXSet", false);
        setFloatField(term41797, term41797.getClass(), "alignmentX", 0.0F);
        setBooleanField(term41797, term41797.getClass(), "isAlignmentYSet", false);
        setFloatField(term41797, term41797.getClass(), "alignmentY", 0.0F);
        setField(term41797, term41797.getClass(), "ui", null);
        setField(term41797, term41797.getClass(), "listenerList", null);
        setField(term41797, term41797.getClass(), "clientProperties", null);
        setField(term41797, term41797.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term41797, term41797.getClass(), "autoscrolls", false);
        setField(term41797, term41797.getClass(), "border", null);
        setIntField(term41797, term41797.getClass(), "flags", 0);
        setField(term41797, term41797.getClass(), "inputVerifier", null);
        setBooleanField(term41797, term41797.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term41797, term41797.getClass(), "paintingChild", null);
        setField(term41797, term41797.getClass(), "popupMenu", null);
        setField(term41797, term41797.getClass(), "revalidateRunnableScheduled", null);
        setField(term41797, term41797.getClass(), "focusInputMap", null);
        setField(term41797, term41797.getClass(), "ancestorInputMap", null);
        setField(term41797, term41797.getClass(), "windowInputMap", null);
        setField(term41797, term41797.getClass(), "actionMap", null);
        setField(term41797, term41797.getClass(), "aaHint", null);
        setField(term41797, term41797.getClass(), "lcdRenderingHint", null);
        setField(term41797, term41797.getClass(), "component", null);
        setField(term41797, term41797.getClass(), "layoutMgr", null);
        setField(term41797, term41797.getClass(), "dispatcher", null);
        setField(term41797, term41797.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term41797, term41797.getClass(), "focusCycleRoot", false);
        setBooleanField(term41797, term41797.getClass(), "focusTraversalPolicyProvider", false);
        setField(term41797, term41797.getClass(), "printingThreads", null);
        setBooleanField(term41797, term41797.getClass(), "printing", false);
        setField(term41797, term41797.getClass(), "containerListener", null);
        setIntField(term41797, term41797.getClass(), "listeningChildren", 0);
        setIntField(term41797, term41797.getClass(), "listeningBoundsChildren", 0);
        setIntField(term41797, term41797.getClass(), "descendantsCount", 0);
        setField(term41797, term41797.getClass(), "preserveBackgroundColor", null);
        setIntField(term41797, term41797.getClass(), "numOfHWComponents", 0);
        setIntField(term41797, term41797.getClass(), "numOfLWComponents", 0);
        setField(term41797, term41797.getClass(), "modalComp", null);
        setField(term41797, term41797.getClass(), "modalAppContext", null);
        setIntField(term41797, term41797.getClass(), "containerSerializedDataVersion", 0);
        setField(term41797, term41797.getClass(), "peer", null);
        setField(term41797, term41797.getClass(), "parent", null);
        setField(term41797, term41797.getClass(), "appContext", null);
        setIntField(term41797, term41797.getClass(), "x", 0);
        setIntField(term41797, term41797.getClass(), "y", 0);
        setIntField(term41797, term41797.getClass(), "width", 0);
        setIntField(term41797, term41797.getClass(), "height", 0);
        setField(term41797, term41797.getClass(), "foreground", null);
        setField(term41797, term41797.getClass(), "background", null);
        setField(term41797, term41797.getClass(), "font", null);
        setField(term41797, term41797.getClass(), "peerFont", null);
        setField(term41797, term41797.getClass(), "cursor", null);
        setField(term41797, term41797.getClass(), "locale", null);
        setField(term41797, term41797.getClass(), "graphicsConfig", null);
        setField(term41797, term41797.getClass(), "bufferStrategy", null);
        setBooleanField(term41797, term41797.getClass(), "ignoreRepaint", false);
        setBooleanField(term41797, term41797.getClass(), "visible", false);
        setBooleanField(term41797, term41797.getClass(), "enabled", false);
        setBooleanField(term41797, term41797.getClass(), "valid", false);
        setField(term41797, term41797.getClass(), "dropTarget", null);
        setField(term41797, term41797.getClass(), "popups", null);
        setField(term41797, term41797.getClass(), "name", null);
        setBooleanField(term41797, term41797.getClass(), "nameExplicitlySet", false);
        setBooleanField(term41797, term41797.getClass(), "focusable", false);
        setIntField(term41797, term41797.getClass(), "isFocusTraversableOverridden", 0);
        setField(term41797, term41797.getClass(), "focusTraversalKeys", null);
        setBooleanField(term41797, term41797.getClass(), "focusTraversalKeysEnabled", false);
        setField(term41797, term41797.getClass(), "acc", null);
        setField(term41797, term41797.getClass(), "minSize", null);
        setBooleanField(term41797, term41797.getClass(), "minSizeSet", false);
        setField(term41797, term41797.getClass(), "prefSize", null);
        setBooleanField(term41797, term41797.getClass(), "prefSizeSet", false);
        setField(term41797, term41797.getClass(), "maxSize", null);
        setBooleanField(term41797, term41797.getClass(), "maxSizeSet", false);
        setField(term41797, term41797.getClass(), "componentOrientation", null);
        setBooleanField(term41797, term41797.getClass(), "newEventsOnly", false);
        setField(term41797, term41797.getClass(), "componentListener", null);
        setField(term41797, term41797.getClass(), "focusListener", null);
        setField(term41797, term41797.getClass(), "hierarchyListener", null);
        setField(term41797, term41797.getClass(), "hierarchyBoundsListener", null);
        setField(term41797, term41797.getClass(), "keyListener", null);
        setField(term41797, term41797.getClass(), "mouseListener", null);
        setField(term41797, term41797.getClass(), "mouseMotionListener", null);
        setField(term41797, term41797.getClass(), "mouseWheelListener", null);
        setField(term41797, term41797.getClass(), "inputMethodListener", null);
        setLongField(term41797, term41797.getClass(), "eventMask", 0L);
        setField(term41797, term41797.getClass(), "changeSupport", null);
        setField(term41797, term41797.getClass(), "objectLock", null);
        setBooleanField(term41797, term41797.getClass(), "isPacked", false);
        setIntField(term41797, term41797.getClass(), "boundsOp", 0);
        setField(term41797, term41797.getClass(), "compoundShape", null);
        setField(term41797, term41797.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term41797, term41797.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term41797, term41797.getClass(), "backgroundEraseDisabled", false);
        setField(term41797, term41797.getClass(), "eventCache", null);
        setBooleanField(term41797, term41797.getClass(), "coalescingEnabled", false);
        setBooleanField(term41797, term41797.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term41797, term41797.getClass(), "componentSerializedDataVersion", 0);
        setField(term41797, term41797.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectBackgroundChanges", argTypes, term41797, args);
    }

};


