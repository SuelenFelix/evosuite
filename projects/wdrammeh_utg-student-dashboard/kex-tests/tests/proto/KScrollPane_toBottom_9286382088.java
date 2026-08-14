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

public class KScrollPane_toBottom_9286382088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64812;

    public KScrollPane_toBottom_9286382088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64812 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term64812, term64812.getClass(), "viewportBorder", null);
        setIntField(term64812, term64812.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term64812, term64812.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term64812, term64812.getClass(), "viewport", null);
        setField(term64812, term64812.getClass(), "verticalScrollBar", null);
        setField(term64812, term64812.getClass(), "horizontalScrollBar", null);
        setField(term64812, term64812.getClass(), "rowHeader", null);
        setField(term64812, term64812.getClass(), "columnHeader", null);
        setField(term64812, term64812.getClass(), "lowerLeft", null);
        setField(term64812, term64812.getClass(), "lowerRight", null);
        setField(term64812, term64812.getClass(), "upperLeft", null);
        setField(term64812, term64812.getClass(), "upperRight", null);
        setBooleanField(term64812, term64812.getClass(), "wheelScrollState", false);
        setBooleanField(term64812, term64812.getClass(), "isAlignmentXSet", false);
        setFloatField(term64812, term64812.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64812, term64812.getClass(), "isAlignmentYSet", false);
        setFloatField(term64812, term64812.getClass(), "alignmentY", 0.0F);
        setField(term64812, term64812.getClass(), "ui", null);
        setField(term64812, term64812.getClass(), "listenerList", null);
        setField(term64812, term64812.getClass(), "clientProperties", null);
        setField(term64812, term64812.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64812, term64812.getClass(), "autoscrolls", false);
        setField(term64812, term64812.getClass(), "border", null);
        setIntField(term64812, term64812.getClass(), "flags", 0);
        setField(term64812, term64812.getClass(), "inputVerifier", null);
        setBooleanField(term64812, term64812.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64812, term64812.getClass(), "paintingChild", null);
        setField(term64812, term64812.getClass(), "popupMenu", null);
        setField(term64812, term64812.getClass(), "revalidateRunnableScheduled", null);
        setField(term64812, term64812.getClass(), "focusInputMap", null);
        setField(term64812, term64812.getClass(), "ancestorInputMap", null);
        setField(term64812, term64812.getClass(), "windowInputMap", null);
        setField(term64812, term64812.getClass(), "actionMap", null);
        setField(term64812, term64812.getClass(), "aaHint", null);
        setField(term64812, term64812.getClass(), "lcdRenderingHint", null);
        setField(term64812, term64812.getClass(), "component", null);
        setField(term64812, term64812.getClass(), "layoutMgr", null);
        setField(term64812, term64812.getClass(), "dispatcher", null);
        setField(term64812, term64812.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64812, term64812.getClass(), "focusCycleRoot", false);
        setBooleanField(term64812, term64812.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64812, term64812.getClass(), "printingThreads", null);
        setBooleanField(term64812, term64812.getClass(), "printing", false);
        setField(term64812, term64812.getClass(), "containerListener", null);
        setIntField(term64812, term64812.getClass(), "listeningChildren", 0);
        setIntField(term64812, term64812.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64812, term64812.getClass(), "descendantsCount", 0);
        setField(term64812, term64812.getClass(), "preserveBackgroundColor", null);
        setIntField(term64812, term64812.getClass(), "numOfHWComponents", 0);
        setIntField(term64812, term64812.getClass(), "numOfLWComponents", 0);
        setField(term64812, term64812.getClass(), "modalComp", null);
        setField(term64812, term64812.getClass(), "modalAppContext", null);
        setIntField(term64812, term64812.getClass(), "containerSerializedDataVersion", 0);
        setField(term64812, term64812.getClass(), "peer", null);
        setField(term64812, term64812.getClass(), "parent", null);
        setField(term64812, term64812.getClass(), "appContext", null);
        setIntField(term64812, term64812.getClass(), "x", 0);
        setIntField(term64812, term64812.getClass(), "y", 0);
        setIntField(term64812, term64812.getClass(), "width", 0);
        setIntField(term64812, term64812.getClass(), "height", 0);
        setField(term64812, term64812.getClass(), "foreground", null);
        setField(term64812, term64812.getClass(), "background", null);
        setField(term64812, term64812.getClass(), "font", null);
        setField(term64812, term64812.getClass(), "peerFont", null);
        setField(term64812, term64812.getClass(), "cursor", null);
        setField(term64812, term64812.getClass(), "locale", null);
        setField(term64812, term64812.getClass(), "graphicsConfig", null);
        setField(term64812, term64812.getClass(), "bufferStrategy", null);
        setBooleanField(term64812, term64812.getClass(), "ignoreRepaint", false);
        setBooleanField(term64812, term64812.getClass(), "visible", false);
        setBooleanField(term64812, term64812.getClass(), "enabled", false);
        setBooleanField(term64812, term64812.getClass(), "valid", false);
        setField(term64812, term64812.getClass(), "dropTarget", null);
        setField(term64812, term64812.getClass(), "popups", null);
        setField(term64812, term64812.getClass(), "name", null);
        setBooleanField(term64812, term64812.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64812, term64812.getClass(), "focusable", false);
        setIntField(term64812, term64812.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64812, term64812.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64812, term64812.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64812, term64812.getClass(), "acc", null);
        setField(term64812, term64812.getClass(), "minSize", null);
        setBooleanField(term64812, term64812.getClass(), "minSizeSet", false);
        setField(term64812, term64812.getClass(), "prefSize", null);
        setBooleanField(term64812, term64812.getClass(), "prefSizeSet", false);
        setField(term64812, term64812.getClass(), "maxSize", null);
        setBooleanField(term64812, term64812.getClass(), "maxSizeSet", false);
        setField(term64812, term64812.getClass(), "componentOrientation", null);
        setBooleanField(term64812, term64812.getClass(), "newEventsOnly", false);
        setField(term64812, term64812.getClass(), "componentListener", null);
        setField(term64812, term64812.getClass(), "focusListener", null);
        setField(term64812, term64812.getClass(), "hierarchyListener", null);
        setField(term64812, term64812.getClass(), "hierarchyBoundsListener", null);
        setField(term64812, term64812.getClass(), "keyListener", null);
        setField(term64812, term64812.getClass(), "mouseListener", null);
        setField(term64812, term64812.getClass(), "mouseMotionListener", null);
        setField(term64812, term64812.getClass(), "mouseWheelListener", null);
        setField(term64812, term64812.getClass(), "inputMethodListener", null);
        setLongField(term64812, term64812.getClass(), "eventMask", 0L);
        setField(term64812, term64812.getClass(), "changeSupport", null);
        setField(term64812, term64812.getClass(), "objectLock", null);
        setBooleanField(term64812, term64812.getClass(), "isPacked", false);
        setIntField(term64812, term64812.getClass(), "boundsOp", 0);
        setField(term64812, term64812.getClass(), "compoundShape", null);
        setField(term64812, term64812.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64812, term64812.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64812, term64812.getClass(), "backgroundEraseDisabled", false);
        setField(term64812, term64812.getClass(), "eventCache", null);
        setBooleanField(term64812, term64812.getClass(), "coalescingEnabled", false);
        setBooleanField(term64812, term64812.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64812, term64812.getClass(), "componentSerializedDataVersion", 0);
        setField(term64812, term64812.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBottom", argTypes, term64812, args);
    }

};


