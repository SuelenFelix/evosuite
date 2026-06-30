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
     Object term66206;

    public KScrollPane_getAutoScroller_67414364513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66206 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term66206, term66206.getClass(), "viewportBorder", null);
        setIntField(term66206, term66206.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term66206, term66206.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term66206, term66206.getClass(), "viewport", null);
        setField(term66206, term66206.getClass(), "verticalScrollBar", null);
        setField(term66206, term66206.getClass(), "horizontalScrollBar", null);
        setField(term66206, term66206.getClass(), "rowHeader", null);
        setField(term66206, term66206.getClass(), "columnHeader", null);
        setField(term66206, term66206.getClass(), "lowerLeft", null);
        setField(term66206, term66206.getClass(), "lowerRight", null);
        setField(term66206, term66206.getClass(), "upperLeft", null);
        setField(term66206, term66206.getClass(), "upperRight", null);
        setBooleanField(term66206, term66206.getClass(), "wheelScrollState", false);
        setBooleanField(term66206, term66206.getClass(), "isAlignmentXSet", false);
        setFloatField(term66206, term66206.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66206, term66206.getClass(), "isAlignmentYSet", false);
        setFloatField(term66206, term66206.getClass(), "alignmentY", 0.0F);
        setField(term66206, term66206.getClass(), "ui", null);
        setField(term66206, term66206.getClass(), "listenerList", null);
        setField(term66206, term66206.getClass(), "clientProperties", null);
        setField(term66206, term66206.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66206, term66206.getClass(), "autoscrolls", false);
        setField(term66206, term66206.getClass(), "border", null);
        setIntField(term66206, term66206.getClass(), "flags", 0);
        setField(term66206, term66206.getClass(), "inputVerifier", null);
        setBooleanField(term66206, term66206.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66206, term66206.getClass(), "paintingChild", null);
        setField(term66206, term66206.getClass(), "popupMenu", null);
        setField(term66206, term66206.getClass(), "revalidateRunnableScheduled", null);
        setField(term66206, term66206.getClass(), "focusInputMap", null);
        setField(term66206, term66206.getClass(), "ancestorInputMap", null);
        setField(term66206, term66206.getClass(), "windowInputMap", null);
        setField(term66206, term66206.getClass(), "actionMap", null);
        setField(term66206, term66206.getClass(), "aaHint", null);
        setField(term66206, term66206.getClass(), "lcdRenderingHint", null);
        setField(term66206, term66206.getClass(), "component", null);
        setField(term66206, term66206.getClass(), "layoutMgr", null);
        setField(term66206, term66206.getClass(), "dispatcher", null);
        setField(term66206, term66206.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66206, term66206.getClass(), "focusCycleRoot", false);
        setBooleanField(term66206, term66206.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66206, term66206.getClass(), "printingThreads", null);
        setBooleanField(term66206, term66206.getClass(), "printing", false);
        setField(term66206, term66206.getClass(), "containerListener", null);
        setIntField(term66206, term66206.getClass(), "listeningChildren", 0);
        setIntField(term66206, term66206.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66206, term66206.getClass(), "descendantsCount", 0);
        setField(term66206, term66206.getClass(), "preserveBackgroundColor", null);
        setIntField(term66206, term66206.getClass(), "numOfHWComponents", 0);
        setIntField(term66206, term66206.getClass(), "numOfLWComponents", 0);
        setField(term66206, term66206.getClass(), "modalComp", null);
        setField(term66206, term66206.getClass(), "modalAppContext", null);
        setIntField(term66206, term66206.getClass(), "containerSerializedDataVersion", 0);
        setField(term66206, term66206.getClass(), "peer", null);
        setField(term66206, term66206.getClass(), "parent", null);
        setField(term66206, term66206.getClass(), "appContext", null);
        setIntField(term66206, term66206.getClass(), "x", 0);
        setIntField(term66206, term66206.getClass(), "y", 0);
        setIntField(term66206, term66206.getClass(), "width", 0);
        setIntField(term66206, term66206.getClass(), "height", 0);
        setField(term66206, term66206.getClass(), "foreground", null);
        setField(term66206, term66206.getClass(), "background", null);
        setField(term66206, term66206.getClass(), "font", null);
        setField(term66206, term66206.getClass(), "peerFont", null);
        setField(term66206, term66206.getClass(), "cursor", null);
        setField(term66206, term66206.getClass(), "locale", null);
        setField(term66206, term66206.getClass(), "graphicsConfig", null);
        setField(term66206, term66206.getClass(), "bufferStrategy", null);
        setBooleanField(term66206, term66206.getClass(), "ignoreRepaint", false);
        setBooleanField(term66206, term66206.getClass(), "visible", false);
        setBooleanField(term66206, term66206.getClass(), "enabled", false);
        setBooleanField(term66206, term66206.getClass(), "valid", false);
        setField(term66206, term66206.getClass(), "dropTarget", null);
        setField(term66206, term66206.getClass(), "popups", null);
        setField(term66206, term66206.getClass(), "name", null);
        setBooleanField(term66206, term66206.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66206, term66206.getClass(), "focusable", false);
        setIntField(term66206, term66206.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66206, term66206.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66206, term66206.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66206, term66206.getClass(), "acc", null);
        setField(term66206, term66206.getClass(), "minSize", null);
        setBooleanField(term66206, term66206.getClass(), "minSizeSet", false);
        setField(term66206, term66206.getClass(), "prefSize", null);
        setBooleanField(term66206, term66206.getClass(), "prefSizeSet", false);
        setField(term66206, term66206.getClass(), "maxSize", null);
        setBooleanField(term66206, term66206.getClass(), "maxSizeSet", false);
        setField(term66206, term66206.getClass(), "componentOrientation", null);
        setBooleanField(term66206, term66206.getClass(), "newEventsOnly", false);
        setField(term66206, term66206.getClass(), "componentListener", null);
        setField(term66206, term66206.getClass(), "focusListener", null);
        setField(term66206, term66206.getClass(), "hierarchyListener", null);
        setField(term66206, term66206.getClass(), "hierarchyBoundsListener", null);
        setField(term66206, term66206.getClass(), "keyListener", null);
        setField(term66206, term66206.getClass(), "mouseListener", null);
        setField(term66206, term66206.getClass(), "mouseMotionListener", null);
        setField(term66206, term66206.getClass(), "mouseWheelListener", null);
        setField(term66206, term66206.getClass(), "inputMethodListener", null);
        setLongField(term66206, term66206.getClass(), "eventMask", 0L);
        setField(term66206, term66206.getClass(), "changeSupport", null);
        setField(term66206, term66206.getClass(), "objectLock", null);
        setBooleanField(term66206, term66206.getClass(), "isPacked", false);
        setIntField(term66206, term66206.getClass(), "boundsOp", 0);
        setField(term66206, term66206.getClass(), "compoundShape", null);
        setField(term66206, term66206.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66206, term66206.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66206, term66206.getClass(), "backgroundEraseDisabled", false);
        setField(term66206, term66206.getClass(), "eventCache", null);
        setBooleanField(term66206, term66206.getClass(), "coalescingEnabled", false);
        setBooleanField(term66206, term66206.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66206, term66206.getClass(), "componentSerializedDataVersion", 0);
        setField(term66206, term66206.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getAutoScroller", argTypes, term66206, args);
    }

};


