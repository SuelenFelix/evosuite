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

public class KScrollPane_toTop_645648206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63469;

    public KScrollPane_toTop_645648206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63469 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term63469, term63469.getClass(), "viewportBorder", null);
        setIntField(term63469, term63469.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term63469, term63469.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term63469, term63469.getClass(), "viewport", null);
        setField(term63469, term63469.getClass(), "verticalScrollBar", null);
        setField(term63469, term63469.getClass(), "horizontalScrollBar", null);
        setField(term63469, term63469.getClass(), "rowHeader", null);
        setField(term63469, term63469.getClass(), "columnHeader", null);
        setField(term63469, term63469.getClass(), "lowerLeft", null);
        setField(term63469, term63469.getClass(), "lowerRight", null);
        setField(term63469, term63469.getClass(), "upperLeft", null);
        setField(term63469, term63469.getClass(), "upperRight", null);
        setBooleanField(term63469, term63469.getClass(), "wheelScrollState", false);
        setBooleanField(term63469, term63469.getClass(), "isAlignmentXSet", false);
        setFloatField(term63469, term63469.getClass(), "alignmentX", 0.0F);
        setBooleanField(term63469, term63469.getClass(), "isAlignmentYSet", false);
        setFloatField(term63469, term63469.getClass(), "alignmentY", 0.0F);
        setField(term63469, term63469.getClass(), "ui", null);
        setField(term63469, term63469.getClass(), "listenerList", null);
        setField(term63469, term63469.getClass(), "clientProperties", null);
        setField(term63469, term63469.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term63469, term63469.getClass(), "autoscrolls", false);
        setField(term63469, term63469.getClass(), "border", null);
        setIntField(term63469, term63469.getClass(), "flags", 0);
        setField(term63469, term63469.getClass(), "inputVerifier", null);
        setBooleanField(term63469, term63469.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term63469, term63469.getClass(), "paintingChild", null);
        setField(term63469, term63469.getClass(), "popupMenu", null);
        setField(term63469, term63469.getClass(), "revalidateRunnableScheduled", null);
        setField(term63469, term63469.getClass(), "focusInputMap", null);
        setField(term63469, term63469.getClass(), "ancestorInputMap", null);
        setField(term63469, term63469.getClass(), "windowInputMap", null);
        setField(term63469, term63469.getClass(), "actionMap", null);
        setField(term63469, term63469.getClass(), "aaHint", null);
        setField(term63469, term63469.getClass(), "lcdRenderingHint", null);
        setField(term63469, term63469.getClass(), "component", null);
        setField(term63469, term63469.getClass(), "layoutMgr", null);
        setField(term63469, term63469.getClass(), "dispatcher", null);
        setField(term63469, term63469.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term63469, term63469.getClass(), "focusCycleRoot", false);
        setBooleanField(term63469, term63469.getClass(), "focusTraversalPolicyProvider", false);
        setField(term63469, term63469.getClass(), "printingThreads", null);
        setBooleanField(term63469, term63469.getClass(), "printing", false);
        setField(term63469, term63469.getClass(), "containerListener", null);
        setIntField(term63469, term63469.getClass(), "listeningChildren", 0);
        setIntField(term63469, term63469.getClass(), "listeningBoundsChildren", 0);
        setIntField(term63469, term63469.getClass(), "descendantsCount", 0);
        setField(term63469, term63469.getClass(), "preserveBackgroundColor", null);
        setIntField(term63469, term63469.getClass(), "numOfHWComponents", 0);
        setIntField(term63469, term63469.getClass(), "numOfLWComponents", 0);
        setField(term63469, term63469.getClass(), "modalComp", null);
        setField(term63469, term63469.getClass(), "modalAppContext", null);
        setIntField(term63469, term63469.getClass(), "containerSerializedDataVersion", 0);
        setField(term63469, term63469.getClass(), "peer", null);
        setField(term63469, term63469.getClass(), "parent", null);
        setField(term63469, term63469.getClass(), "appContext", null);
        setIntField(term63469, term63469.getClass(), "x", 0);
        setIntField(term63469, term63469.getClass(), "y", 0);
        setIntField(term63469, term63469.getClass(), "width", 0);
        setIntField(term63469, term63469.getClass(), "height", 0);
        setField(term63469, term63469.getClass(), "foreground", null);
        setField(term63469, term63469.getClass(), "background", null);
        setField(term63469, term63469.getClass(), "font", null);
        setField(term63469, term63469.getClass(), "peerFont", null);
        setField(term63469, term63469.getClass(), "cursor", null);
        setField(term63469, term63469.getClass(), "locale", null);
        setField(term63469, term63469.getClass(), "graphicsConfig", null);
        setField(term63469, term63469.getClass(), "bufferStrategy", null);
        setBooleanField(term63469, term63469.getClass(), "ignoreRepaint", false);
        setBooleanField(term63469, term63469.getClass(), "visible", false);
        setBooleanField(term63469, term63469.getClass(), "enabled", false);
        setBooleanField(term63469, term63469.getClass(), "valid", false);
        setField(term63469, term63469.getClass(), "dropTarget", null);
        setField(term63469, term63469.getClass(), "popups", null);
        setField(term63469, term63469.getClass(), "name", null);
        setBooleanField(term63469, term63469.getClass(), "nameExplicitlySet", false);
        setBooleanField(term63469, term63469.getClass(), "focusable", false);
        setIntField(term63469, term63469.getClass(), "isFocusTraversableOverridden", 0);
        setField(term63469, term63469.getClass(), "focusTraversalKeys", null);
        setBooleanField(term63469, term63469.getClass(), "focusTraversalKeysEnabled", false);
        setField(term63469, term63469.getClass(), "acc", null);
        setField(term63469, term63469.getClass(), "minSize", null);
        setBooleanField(term63469, term63469.getClass(), "minSizeSet", false);
        setField(term63469, term63469.getClass(), "prefSize", null);
        setBooleanField(term63469, term63469.getClass(), "prefSizeSet", false);
        setField(term63469, term63469.getClass(), "maxSize", null);
        setBooleanField(term63469, term63469.getClass(), "maxSizeSet", false);
        setField(term63469, term63469.getClass(), "componentOrientation", null);
        setBooleanField(term63469, term63469.getClass(), "newEventsOnly", false);
        setField(term63469, term63469.getClass(), "componentListener", null);
        setField(term63469, term63469.getClass(), "focusListener", null);
        setField(term63469, term63469.getClass(), "hierarchyListener", null);
        setField(term63469, term63469.getClass(), "hierarchyBoundsListener", null);
        setField(term63469, term63469.getClass(), "keyListener", null);
        setField(term63469, term63469.getClass(), "mouseListener", null);
        setField(term63469, term63469.getClass(), "mouseMotionListener", null);
        setField(term63469, term63469.getClass(), "mouseWheelListener", null);
        setField(term63469, term63469.getClass(), "inputMethodListener", null);
        setLongField(term63469, term63469.getClass(), "eventMask", 0L);
        setField(term63469, term63469.getClass(), "changeSupport", null);
        setField(term63469, term63469.getClass(), "objectLock", null);
        setBooleanField(term63469, term63469.getClass(), "isPacked", false);
        setIntField(term63469, term63469.getClass(), "boundsOp", 0);
        setField(term63469, term63469.getClass(), "compoundShape", null);
        setField(term63469, term63469.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term63469, term63469.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term63469, term63469.getClass(), "backgroundEraseDisabled", false);
        setField(term63469, term63469.getClass(), "eventCache", null);
        setBooleanField(term63469, term63469.getClass(), "coalescingEnabled", false);
        setBooleanField(term63469, term63469.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term63469, term63469.getClass(), "componentSerializedDataVersion", 0);
        setField(term63469, term63469.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toTop", argTypes, term63469, args);
    }

};


