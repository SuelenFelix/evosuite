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

public class KScrollPane_stopAutoScrolling_11420172504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62097;

    public KScrollPane_stopAutoScrolling_11420172504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62097 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term62097, term62097.getClass(), "viewportBorder", null);
        setIntField(term62097, term62097.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term62097, term62097.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term62097, term62097.getClass(), "viewport", null);
        setField(term62097, term62097.getClass(), "verticalScrollBar", null);
        setField(term62097, term62097.getClass(), "horizontalScrollBar", null);
        setField(term62097, term62097.getClass(), "rowHeader", null);
        setField(term62097, term62097.getClass(), "columnHeader", null);
        setField(term62097, term62097.getClass(), "lowerLeft", null);
        setField(term62097, term62097.getClass(), "lowerRight", null);
        setField(term62097, term62097.getClass(), "upperLeft", null);
        setField(term62097, term62097.getClass(), "upperRight", null);
        setBooleanField(term62097, term62097.getClass(), "wheelScrollState", false);
        setBooleanField(term62097, term62097.getClass(), "isAlignmentXSet", false);
        setFloatField(term62097, term62097.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62097, term62097.getClass(), "isAlignmentYSet", false);
        setFloatField(term62097, term62097.getClass(), "alignmentY", 0.0F);
        setField(term62097, term62097.getClass(), "ui", null);
        setField(term62097, term62097.getClass(), "listenerList", null);
        setField(term62097, term62097.getClass(), "clientProperties", null);
        setField(term62097, term62097.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62097, term62097.getClass(), "autoscrolls", false);
        setField(term62097, term62097.getClass(), "border", null);
        setIntField(term62097, term62097.getClass(), "flags", 0);
        setField(term62097, term62097.getClass(), "inputVerifier", null);
        setBooleanField(term62097, term62097.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62097, term62097.getClass(), "paintingChild", null);
        setField(term62097, term62097.getClass(), "popupMenu", null);
        setField(term62097, term62097.getClass(), "revalidateRunnableScheduled", null);
        setField(term62097, term62097.getClass(), "focusInputMap", null);
        setField(term62097, term62097.getClass(), "ancestorInputMap", null);
        setField(term62097, term62097.getClass(), "windowInputMap", null);
        setField(term62097, term62097.getClass(), "actionMap", null);
        setField(term62097, term62097.getClass(), "aaHint", null);
        setField(term62097, term62097.getClass(), "lcdRenderingHint", null);
        setField(term62097, term62097.getClass(), "component", null);
        setField(term62097, term62097.getClass(), "layoutMgr", null);
        setField(term62097, term62097.getClass(), "dispatcher", null);
        setField(term62097, term62097.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62097, term62097.getClass(), "focusCycleRoot", false);
        setBooleanField(term62097, term62097.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62097, term62097.getClass(), "printingThreads", null);
        setBooleanField(term62097, term62097.getClass(), "printing", false);
        setField(term62097, term62097.getClass(), "containerListener", null);
        setIntField(term62097, term62097.getClass(), "listeningChildren", 0);
        setIntField(term62097, term62097.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62097, term62097.getClass(), "descendantsCount", 0);
        setField(term62097, term62097.getClass(), "preserveBackgroundColor", null);
        setIntField(term62097, term62097.getClass(), "numOfHWComponents", 0);
        setIntField(term62097, term62097.getClass(), "numOfLWComponents", 0);
        setField(term62097, term62097.getClass(), "modalComp", null);
        setField(term62097, term62097.getClass(), "modalAppContext", null);
        setIntField(term62097, term62097.getClass(), "containerSerializedDataVersion", 0);
        setField(term62097, term62097.getClass(), "peer", null);
        setField(term62097, term62097.getClass(), "parent", null);
        setField(term62097, term62097.getClass(), "appContext", null);
        setIntField(term62097, term62097.getClass(), "x", 0);
        setIntField(term62097, term62097.getClass(), "y", 0);
        setIntField(term62097, term62097.getClass(), "width", 0);
        setIntField(term62097, term62097.getClass(), "height", 0);
        setField(term62097, term62097.getClass(), "foreground", null);
        setField(term62097, term62097.getClass(), "background", null);
        setField(term62097, term62097.getClass(), "font", null);
        setField(term62097, term62097.getClass(), "peerFont", null);
        setField(term62097, term62097.getClass(), "cursor", null);
        setField(term62097, term62097.getClass(), "locale", null);
        setField(term62097, term62097.getClass(), "graphicsConfig", null);
        setField(term62097, term62097.getClass(), "bufferStrategy", null);
        setBooleanField(term62097, term62097.getClass(), "ignoreRepaint", false);
        setBooleanField(term62097, term62097.getClass(), "visible", false);
        setBooleanField(term62097, term62097.getClass(), "enabled", false);
        setBooleanField(term62097, term62097.getClass(), "valid", false);
        setField(term62097, term62097.getClass(), "dropTarget", null);
        setField(term62097, term62097.getClass(), "popups", null);
        setField(term62097, term62097.getClass(), "name", null);
        setBooleanField(term62097, term62097.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62097, term62097.getClass(), "focusable", false);
        setIntField(term62097, term62097.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62097, term62097.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62097, term62097.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62097, term62097.getClass(), "acc", null);
        setField(term62097, term62097.getClass(), "minSize", null);
        setBooleanField(term62097, term62097.getClass(), "minSizeSet", false);
        setField(term62097, term62097.getClass(), "prefSize", null);
        setBooleanField(term62097, term62097.getClass(), "prefSizeSet", false);
        setField(term62097, term62097.getClass(), "maxSize", null);
        setBooleanField(term62097, term62097.getClass(), "maxSizeSet", false);
        setField(term62097, term62097.getClass(), "componentOrientation", null);
        setBooleanField(term62097, term62097.getClass(), "newEventsOnly", false);
        setField(term62097, term62097.getClass(), "componentListener", null);
        setField(term62097, term62097.getClass(), "focusListener", null);
        setField(term62097, term62097.getClass(), "hierarchyListener", null);
        setField(term62097, term62097.getClass(), "hierarchyBoundsListener", null);
        setField(term62097, term62097.getClass(), "keyListener", null);
        setField(term62097, term62097.getClass(), "mouseListener", null);
        setField(term62097, term62097.getClass(), "mouseMotionListener", null);
        setField(term62097, term62097.getClass(), "mouseWheelListener", null);
        setField(term62097, term62097.getClass(), "inputMethodListener", null);
        setLongField(term62097, term62097.getClass(), "eventMask", 0L);
        setField(term62097, term62097.getClass(), "changeSupport", null);
        setField(term62097, term62097.getClass(), "objectLock", null);
        setBooleanField(term62097, term62097.getClass(), "isPacked", false);
        setIntField(term62097, term62097.getClass(), "boundsOp", 0);
        setField(term62097, term62097.getClass(), "compoundShape", null);
        setField(term62097, term62097.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62097, term62097.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62097, term62097.getClass(), "backgroundEraseDisabled", false);
        setField(term62097, term62097.getClass(), "eventCache", null);
        setBooleanField(term62097, term62097.getClass(), "coalescingEnabled", false);
        setBooleanField(term62097, term62097.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62097, term62097.getClass(), "componentSerializedDataVersion", 0);
        setField(term62097, term62097.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stopAutoScrolling", argTypes, term62097, args);
    }

};


