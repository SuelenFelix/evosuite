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
     Object term64763;

    public KScrollPane_toBottom_9286382088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64763 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term64763, term64763.getClass(), "viewportBorder", null);
        setIntField(term64763, term64763.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term64763, term64763.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term64763, term64763.getClass(), "viewport", null);
        setField(term64763, term64763.getClass(), "verticalScrollBar", null);
        setField(term64763, term64763.getClass(), "horizontalScrollBar", null);
        setField(term64763, term64763.getClass(), "rowHeader", null);
        setField(term64763, term64763.getClass(), "columnHeader", null);
        setField(term64763, term64763.getClass(), "lowerLeft", null);
        setField(term64763, term64763.getClass(), "lowerRight", null);
        setField(term64763, term64763.getClass(), "upperLeft", null);
        setField(term64763, term64763.getClass(), "upperRight", null);
        setBooleanField(term64763, term64763.getClass(), "wheelScrollState", false);
        setBooleanField(term64763, term64763.getClass(), "isAlignmentXSet", false);
        setFloatField(term64763, term64763.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64763, term64763.getClass(), "isAlignmentYSet", false);
        setFloatField(term64763, term64763.getClass(), "alignmentY", 0.0F);
        setField(term64763, term64763.getClass(), "ui", null);
        setField(term64763, term64763.getClass(), "listenerList", null);
        setField(term64763, term64763.getClass(), "clientProperties", null);
        setField(term64763, term64763.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64763, term64763.getClass(), "autoscrolls", false);
        setField(term64763, term64763.getClass(), "border", null);
        setIntField(term64763, term64763.getClass(), "flags", 0);
        setField(term64763, term64763.getClass(), "inputVerifier", null);
        setBooleanField(term64763, term64763.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64763, term64763.getClass(), "paintingChild", null);
        setField(term64763, term64763.getClass(), "popupMenu", null);
        setField(term64763, term64763.getClass(), "revalidateRunnableScheduled", null);
        setField(term64763, term64763.getClass(), "focusInputMap", null);
        setField(term64763, term64763.getClass(), "ancestorInputMap", null);
        setField(term64763, term64763.getClass(), "windowInputMap", null);
        setField(term64763, term64763.getClass(), "actionMap", null);
        setField(term64763, term64763.getClass(), "aaHint", null);
        setField(term64763, term64763.getClass(), "lcdRenderingHint", null);
        setField(term64763, term64763.getClass(), "component", null);
        setField(term64763, term64763.getClass(), "layoutMgr", null);
        setField(term64763, term64763.getClass(), "dispatcher", null);
        setField(term64763, term64763.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64763, term64763.getClass(), "focusCycleRoot", false);
        setBooleanField(term64763, term64763.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64763, term64763.getClass(), "printingThreads", null);
        setBooleanField(term64763, term64763.getClass(), "printing", false);
        setField(term64763, term64763.getClass(), "containerListener", null);
        setIntField(term64763, term64763.getClass(), "listeningChildren", 0);
        setIntField(term64763, term64763.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64763, term64763.getClass(), "descendantsCount", 0);
        setField(term64763, term64763.getClass(), "preserveBackgroundColor", null);
        setIntField(term64763, term64763.getClass(), "numOfHWComponents", 0);
        setIntField(term64763, term64763.getClass(), "numOfLWComponents", 0);
        setField(term64763, term64763.getClass(), "modalComp", null);
        setField(term64763, term64763.getClass(), "modalAppContext", null);
        setIntField(term64763, term64763.getClass(), "containerSerializedDataVersion", 0);
        setField(term64763, term64763.getClass(), "peer", null);
        setField(term64763, term64763.getClass(), "parent", null);
        setField(term64763, term64763.getClass(), "appContext", null);
        setIntField(term64763, term64763.getClass(), "x", 0);
        setIntField(term64763, term64763.getClass(), "y", 0);
        setIntField(term64763, term64763.getClass(), "width", 0);
        setIntField(term64763, term64763.getClass(), "height", 0);
        setField(term64763, term64763.getClass(), "foreground", null);
        setField(term64763, term64763.getClass(), "background", null);
        setField(term64763, term64763.getClass(), "font", null);
        setField(term64763, term64763.getClass(), "peerFont", null);
        setField(term64763, term64763.getClass(), "cursor", null);
        setField(term64763, term64763.getClass(), "locale", null);
        setField(term64763, term64763.getClass(), "graphicsConfig", null);
        setField(term64763, term64763.getClass(), "bufferStrategy", null);
        setBooleanField(term64763, term64763.getClass(), "ignoreRepaint", false);
        setBooleanField(term64763, term64763.getClass(), "visible", false);
        setBooleanField(term64763, term64763.getClass(), "enabled", false);
        setBooleanField(term64763, term64763.getClass(), "valid", false);
        setField(term64763, term64763.getClass(), "dropTarget", null);
        setField(term64763, term64763.getClass(), "popups", null);
        setField(term64763, term64763.getClass(), "name", null);
        setBooleanField(term64763, term64763.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64763, term64763.getClass(), "focusable", false);
        setIntField(term64763, term64763.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64763, term64763.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64763, term64763.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64763, term64763.getClass(), "acc", null);
        setField(term64763, term64763.getClass(), "minSize", null);
        setBooleanField(term64763, term64763.getClass(), "minSizeSet", false);
        setField(term64763, term64763.getClass(), "prefSize", null);
        setBooleanField(term64763, term64763.getClass(), "prefSizeSet", false);
        setField(term64763, term64763.getClass(), "maxSize", null);
        setBooleanField(term64763, term64763.getClass(), "maxSizeSet", false);
        setField(term64763, term64763.getClass(), "componentOrientation", null);
        setBooleanField(term64763, term64763.getClass(), "newEventsOnly", false);
        setField(term64763, term64763.getClass(), "componentListener", null);
        setField(term64763, term64763.getClass(), "focusListener", null);
        setField(term64763, term64763.getClass(), "hierarchyListener", null);
        setField(term64763, term64763.getClass(), "hierarchyBoundsListener", null);
        setField(term64763, term64763.getClass(), "keyListener", null);
        setField(term64763, term64763.getClass(), "mouseListener", null);
        setField(term64763, term64763.getClass(), "mouseMotionListener", null);
        setField(term64763, term64763.getClass(), "mouseWheelListener", null);
        setField(term64763, term64763.getClass(), "inputMethodListener", null);
        setLongField(term64763, term64763.getClass(), "eventMask", 0L);
        setField(term64763, term64763.getClass(), "changeSupport", null);
        setField(term64763, term64763.getClass(), "objectLock", null);
        setBooleanField(term64763, term64763.getClass(), "isPacked", false);
        setIntField(term64763, term64763.getClass(), "boundsOp", 0);
        setField(term64763, term64763.getClass(), "compoundShape", null);
        setField(term64763, term64763.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64763, term64763.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64763, term64763.getClass(), "backgroundEraseDisabled", false);
        setField(term64763, term64763.getClass(), "eventCache", null);
        setBooleanField(term64763, term64763.getClass(), "coalescingEnabled", false);
        setBooleanField(term64763, term64763.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64763, term64763.getClass(), "componentSerializedDataVersion", 0);
        setField(term64763, term64763.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBottom", argTypes, term64763, args);
    }

};


