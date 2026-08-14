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
     Object term62146;

    public KScrollPane_stopAutoScrolling_11420172504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62146 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term62146, term62146.getClass(), "viewportBorder", null);
        setIntField(term62146, term62146.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term62146, term62146.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term62146, term62146.getClass(), "viewport", null);
        setField(term62146, term62146.getClass(), "verticalScrollBar", null);
        setField(term62146, term62146.getClass(), "horizontalScrollBar", null);
        setField(term62146, term62146.getClass(), "rowHeader", null);
        setField(term62146, term62146.getClass(), "columnHeader", null);
        setField(term62146, term62146.getClass(), "lowerLeft", null);
        setField(term62146, term62146.getClass(), "lowerRight", null);
        setField(term62146, term62146.getClass(), "upperLeft", null);
        setField(term62146, term62146.getClass(), "upperRight", null);
        setBooleanField(term62146, term62146.getClass(), "wheelScrollState", false);
        setBooleanField(term62146, term62146.getClass(), "isAlignmentXSet", false);
        setFloatField(term62146, term62146.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62146, term62146.getClass(), "isAlignmentYSet", false);
        setFloatField(term62146, term62146.getClass(), "alignmentY", 0.0F);
        setField(term62146, term62146.getClass(), "ui", null);
        setField(term62146, term62146.getClass(), "listenerList", null);
        setField(term62146, term62146.getClass(), "clientProperties", null);
        setField(term62146, term62146.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62146, term62146.getClass(), "autoscrolls", false);
        setField(term62146, term62146.getClass(), "border", null);
        setIntField(term62146, term62146.getClass(), "flags", 0);
        setField(term62146, term62146.getClass(), "inputVerifier", null);
        setBooleanField(term62146, term62146.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62146, term62146.getClass(), "paintingChild", null);
        setField(term62146, term62146.getClass(), "popupMenu", null);
        setField(term62146, term62146.getClass(), "revalidateRunnableScheduled", null);
        setField(term62146, term62146.getClass(), "focusInputMap", null);
        setField(term62146, term62146.getClass(), "ancestorInputMap", null);
        setField(term62146, term62146.getClass(), "windowInputMap", null);
        setField(term62146, term62146.getClass(), "actionMap", null);
        setField(term62146, term62146.getClass(), "aaHint", null);
        setField(term62146, term62146.getClass(), "lcdRenderingHint", null);
        setField(term62146, term62146.getClass(), "component", null);
        setField(term62146, term62146.getClass(), "layoutMgr", null);
        setField(term62146, term62146.getClass(), "dispatcher", null);
        setField(term62146, term62146.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62146, term62146.getClass(), "focusCycleRoot", false);
        setBooleanField(term62146, term62146.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62146, term62146.getClass(), "printingThreads", null);
        setBooleanField(term62146, term62146.getClass(), "printing", false);
        setField(term62146, term62146.getClass(), "containerListener", null);
        setIntField(term62146, term62146.getClass(), "listeningChildren", 0);
        setIntField(term62146, term62146.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62146, term62146.getClass(), "descendantsCount", 0);
        setField(term62146, term62146.getClass(), "preserveBackgroundColor", null);
        setIntField(term62146, term62146.getClass(), "numOfHWComponents", 0);
        setIntField(term62146, term62146.getClass(), "numOfLWComponents", 0);
        setField(term62146, term62146.getClass(), "modalComp", null);
        setField(term62146, term62146.getClass(), "modalAppContext", null);
        setIntField(term62146, term62146.getClass(), "containerSerializedDataVersion", 0);
        setField(term62146, term62146.getClass(), "peer", null);
        setField(term62146, term62146.getClass(), "parent", null);
        setField(term62146, term62146.getClass(), "appContext", null);
        setIntField(term62146, term62146.getClass(), "x", 0);
        setIntField(term62146, term62146.getClass(), "y", 0);
        setIntField(term62146, term62146.getClass(), "width", 0);
        setIntField(term62146, term62146.getClass(), "height", 0);
        setField(term62146, term62146.getClass(), "foreground", null);
        setField(term62146, term62146.getClass(), "background", null);
        setField(term62146, term62146.getClass(), "font", null);
        setField(term62146, term62146.getClass(), "peerFont", null);
        setField(term62146, term62146.getClass(), "cursor", null);
        setField(term62146, term62146.getClass(), "locale", null);
        setField(term62146, term62146.getClass(), "graphicsConfig", null);
        setField(term62146, term62146.getClass(), "bufferStrategy", null);
        setBooleanField(term62146, term62146.getClass(), "ignoreRepaint", false);
        setBooleanField(term62146, term62146.getClass(), "visible", false);
        setBooleanField(term62146, term62146.getClass(), "enabled", false);
        setBooleanField(term62146, term62146.getClass(), "valid", false);
        setField(term62146, term62146.getClass(), "dropTarget", null);
        setField(term62146, term62146.getClass(), "popups", null);
        setField(term62146, term62146.getClass(), "name", null);
        setBooleanField(term62146, term62146.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62146, term62146.getClass(), "focusable", false);
        setIntField(term62146, term62146.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62146, term62146.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62146, term62146.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62146, term62146.getClass(), "acc", null);
        setField(term62146, term62146.getClass(), "minSize", null);
        setBooleanField(term62146, term62146.getClass(), "minSizeSet", false);
        setField(term62146, term62146.getClass(), "prefSize", null);
        setBooleanField(term62146, term62146.getClass(), "prefSizeSet", false);
        setField(term62146, term62146.getClass(), "maxSize", null);
        setBooleanField(term62146, term62146.getClass(), "maxSizeSet", false);
        setField(term62146, term62146.getClass(), "componentOrientation", null);
        setBooleanField(term62146, term62146.getClass(), "newEventsOnly", false);
        setField(term62146, term62146.getClass(), "componentListener", null);
        setField(term62146, term62146.getClass(), "focusListener", null);
        setField(term62146, term62146.getClass(), "hierarchyListener", null);
        setField(term62146, term62146.getClass(), "hierarchyBoundsListener", null);
        setField(term62146, term62146.getClass(), "keyListener", null);
        setField(term62146, term62146.getClass(), "mouseListener", null);
        setField(term62146, term62146.getClass(), "mouseMotionListener", null);
        setField(term62146, term62146.getClass(), "mouseWheelListener", null);
        setField(term62146, term62146.getClass(), "inputMethodListener", null);
        setLongField(term62146, term62146.getClass(), "eventMask", 0L);
        setField(term62146, term62146.getClass(), "changeSupport", null);
        setField(term62146, term62146.getClass(), "objectLock", null);
        setBooleanField(term62146, term62146.getClass(), "isPacked", false);
        setIntField(term62146, term62146.getClass(), "boundsOp", 0);
        setField(term62146, term62146.getClass(), "compoundShape", null);
        setField(term62146, term62146.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62146, term62146.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62146, term62146.getClass(), "backgroundEraseDisabled", false);
        setField(term62146, term62146.getClass(), "eventCache", null);
        setBooleanField(term62146, term62146.getClass(), "coalescingEnabled", false);
        setBooleanField(term62146, term62146.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62146, term62146.getClass(), "componentSerializedDataVersion", 0);
        setField(term62146, term62146.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stopAutoScrolling", argTypes, term62146, args);
    }

};


