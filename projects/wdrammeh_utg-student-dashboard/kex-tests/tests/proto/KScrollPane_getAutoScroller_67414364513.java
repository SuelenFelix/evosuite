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

public class KScrollPane_getAutoScroller_67414364513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66255;

    public KScrollPane_getAutoScroller_67414364513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66255 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term66255, term66255.getClass(), "viewportBorder", null);
        setIntField(term66255, term66255.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term66255, term66255.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term66255, term66255.getClass(), "viewport", null);
        setField(term66255, term66255.getClass(), "verticalScrollBar", null);
        setField(term66255, term66255.getClass(), "horizontalScrollBar", null);
        setField(term66255, term66255.getClass(), "rowHeader", null);
        setField(term66255, term66255.getClass(), "columnHeader", null);
        setField(term66255, term66255.getClass(), "lowerLeft", null);
        setField(term66255, term66255.getClass(), "lowerRight", null);
        setField(term66255, term66255.getClass(), "upperLeft", null);
        setField(term66255, term66255.getClass(), "upperRight", null);
        setBooleanField(term66255, term66255.getClass(), "wheelScrollState", false);
        setBooleanField(term66255, term66255.getClass(), "isAlignmentXSet", false);
        setFloatField(term66255, term66255.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66255, term66255.getClass(), "isAlignmentYSet", false);
        setFloatField(term66255, term66255.getClass(), "alignmentY", 0.0F);
        setField(term66255, term66255.getClass(), "ui", null);
        setField(term66255, term66255.getClass(), "listenerList", null);
        setField(term66255, term66255.getClass(), "clientProperties", null);
        setField(term66255, term66255.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66255, term66255.getClass(), "autoscrolls", false);
        setField(term66255, term66255.getClass(), "border", null);
        setIntField(term66255, term66255.getClass(), "flags", 0);
        setField(term66255, term66255.getClass(), "inputVerifier", null);
        setBooleanField(term66255, term66255.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66255, term66255.getClass(), "paintingChild", null);
        setField(term66255, term66255.getClass(), "popupMenu", null);
        setField(term66255, term66255.getClass(), "revalidateRunnableScheduled", null);
        setField(term66255, term66255.getClass(), "focusInputMap", null);
        setField(term66255, term66255.getClass(), "ancestorInputMap", null);
        setField(term66255, term66255.getClass(), "windowInputMap", null);
        setField(term66255, term66255.getClass(), "actionMap", null);
        setField(term66255, term66255.getClass(), "aaHint", null);
        setField(term66255, term66255.getClass(), "lcdRenderingHint", null);
        setField(term66255, term66255.getClass(), "component", null);
        setField(term66255, term66255.getClass(), "layoutMgr", null);
        setField(term66255, term66255.getClass(), "dispatcher", null);
        setField(term66255, term66255.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66255, term66255.getClass(), "focusCycleRoot", false);
        setBooleanField(term66255, term66255.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66255, term66255.getClass(), "printingThreads", null);
        setBooleanField(term66255, term66255.getClass(), "printing", false);
        setField(term66255, term66255.getClass(), "containerListener", null);
        setIntField(term66255, term66255.getClass(), "listeningChildren", 0);
        setIntField(term66255, term66255.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66255, term66255.getClass(), "descendantsCount", 0);
        setField(term66255, term66255.getClass(), "preserveBackgroundColor", null);
        setIntField(term66255, term66255.getClass(), "numOfHWComponents", 0);
        setIntField(term66255, term66255.getClass(), "numOfLWComponents", 0);
        setField(term66255, term66255.getClass(), "modalComp", null);
        setField(term66255, term66255.getClass(), "modalAppContext", null);
        setIntField(term66255, term66255.getClass(), "containerSerializedDataVersion", 0);
        setField(term66255, term66255.getClass(), "peer", null);
        setField(term66255, term66255.getClass(), "parent", null);
        setField(term66255, term66255.getClass(), "appContext", null);
        setIntField(term66255, term66255.getClass(), "x", 0);
        setIntField(term66255, term66255.getClass(), "y", 0);
        setIntField(term66255, term66255.getClass(), "width", 0);
        setIntField(term66255, term66255.getClass(), "height", 0);
        setField(term66255, term66255.getClass(), "foreground", null);
        setField(term66255, term66255.getClass(), "background", null);
        setField(term66255, term66255.getClass(), "font", null);
        setField(term66255, term66255.getClass(), "peerFont", null);
        setField(term66255, term66255.getClass(), "cursor", null);
        setField(term66255, term66255.getClass(), "locale", null);
        setField(term66255, term66255.getClass(), "graphicsConfig", null);
        setField(term66255, term66255.getClass(), "bufferStrategy", null);
        setBooleanField(term66255, term66255.getClass(), "ignoreRepaint", false);
        setBooleanField(term66255, term66255.getClass(), "visible", false);
        setBooleanField(term66255, term66255.getClass(), "enabled", false);
        setBooleanField(term66255, term66255.getClass(), "valid", false);
        setField(term66255, term66255.getClass(), "dropTarget", null);
        setField(term66255, term66255.getClass(), "popups", null);
        setField(term66255, term66255.getClass(), "name", null);
        setBooleanField(term66255, term66255.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66255, term66255.getClass(), "focusable", false);
        setIntField(term66255, term66255.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66255, term66255.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66255, term66255.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66255, term66255.getClass(), "acc", null);
        setField(term66255, term66255.getClass(), "minSize", null);
        setBooleanField(term66255, term66255.getClass(), "minSizeSet", false);
        setField(term66255, term66255.getClass(), "prefSize", null);
        setBooleanField(term66255, term66255.getClass(), "prefSizeSet", false);
        setField(term66255, term66255.getClass(), "maxSize", null);
        setBooleanField(term66255, term66255.getClass(), "maxSizeSet", false);
        setField(term66255, term66255.getClass(), "componentOrientation", null);
        setBooleanField(term66255, term66255.getClass(), "newEventsOnly", false);
        setField(term66255, term66255.getClass(), "componentListener", null);
        setField(term66255, term66255.getClass(), "focusListener", null);
        setField(term66255, term66255.getClass(), "hierarchyListener", null);
        setField(term66255, term66255.getClass(), "hierarchyBoundsListener", null);
        setField(term66255, term66255.getClass(), "keyListener", null);
        setField(term66255, term66255.getClass(), "mouseListener", null);
        setField(term66255, term66255.getClass(), "mouseMotionListener", null);
        setField(term66255, term66255.getClass(), "mouseWheelListener", null);
        setField(term66255, term66255.getClass(), "inputMethodListener", null);
        setLongField(term66255, term66255.getClass(), "eventMask", 0L);
        setField(term66255, term66255.getClass(), "changeSupport", null);
        setField(term66255, term66255.getClass(), "objectLock", null);
        setBooleanField(term66255, term66255.getClass(), "isPacked", false);
        setIntField(term66255, term66255.getClass(), "boundsOp", 0);
        setField(term66255, term66255.getClass(), "compoundShape", null);
        setField(term66255, term66255.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66255, term66255.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66255, term66255.getClass(), "backgroundEraseDisabled", false);
        setField(term66255, term66255.getClass(), "eventCache", null);
        setBooleanField(term66255, term66255.getClass(), "coalescingEnabled", false);
        setBooleanField(term66255, term66255.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66255, term66255.getClass(), "componentSerializedDataVersion", 0);
        setField(term66255, term66255.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAutoScroller", argTypes, term66255, args);
    }

};


