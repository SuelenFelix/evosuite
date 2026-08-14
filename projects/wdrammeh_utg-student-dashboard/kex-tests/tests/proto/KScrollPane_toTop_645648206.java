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
     Object term63518;

    public KScrollPane_toTop_645648206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63518 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term63518, term63518.getClass(), "viewportBorder", null);
        setIntField(term63518, term63518.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term63518, term63518.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term63518, term63518.getClass(), "viewport", null);
        setField(term63518, term63518.getClass(), "verticalScrollBar", null);
        setField(term63518, term63518.getClass(), "horizontalScrollBar", null);
        setField(term63518, term63518.getClass(), "rowHeader", null);
        setField(term63518, term63518.getClass(), "columnHeader", null);
        setField(term63518, term63518.getClass(), "lowerLeft", null);
        setField(term63518, term63518.getClass(), "lowerRight", null);
        setField(term63518, term63518.getClass(), "upperLeft", null);
        setField(term63518, term63518.getClass(), "upperRight", null);
        setBooleanField(term63518, term63518.getClass(), "wheelScrollState", false);
        setBooleanField(term63518, term63518.getClass(), "isAlignmentXSet", false);
        setFloatField(term63518, term63518.getClass(), "alignmentX", 0.0F);
        setBooleanField(term63518, term63518.getClass(), "isAlignmentYSet", false);
        setFloatField(term63518, term63518.getClass(), "alignmentY", 0.0F);
        setField(term63518, term63518.getClass(), "ui", null);
        setField(term63518, term63518.getClass(), "listenerList", null);
        setField(term63518, term63518.getClass(), "clientProperties", null);
        setField(term63518, term63518.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term63518, term63518.getClass(), "autoscrolls", false);
        setField(term63518, term63518.getClass(), "border", null);
        setIntField(term63518, term63518.getClass(), "flags", 0);
        setField(term63518, term63518.getClass(), "inputVerifier", null);
        setBooleanField(term63518, term63518.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term63518, term63518.getClass(), "paintingChild", null);
        setField(term63518, term63518.getClass(), "popupMenu", null);
        setField(term63518, term63518.getClass(), "revalidateRunnableScheduled", null);
        setField(term63518, term63518.getClass(), "focusInputMap", null);
        setField(term63518, term63518.getClass(), "ancestorInputMap", null);
        setField(term63518, term63518.getClass(), "windowInputMap", null);
        setField(term63518, term63518.getClass(), "actionMap", null);
        setField(term63518, term63518.getClass(), "aaHint", null);
        setField(term63518, term63518.getClass(), "lcdRenderingHint", null);
        setField(term63518, term63518.getClass(), "component", null);
        setField(term63518, term63518.getClass(), "layoutMgr", null);
        setField(term63518, term63518.getClass(), "dispatcher", null);
        setField(term63518, term63518.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term63518, term63518.getClass(), "focusCycleRoot", false);
        setBooleanField(term63518, term63518.getClass(), "focusTraversalPolicyProvider", false);
        setField(term63518, term63518.getClass(), "printingThreads", null);
        setBooleanField(term63518, term63518.getClass(), "printing", false);
        setField(term63518, term63518.getClass(), "containerListener", null);
        setIntField(term63518, term63518.getClass(), "listeningChildren", 0);
        setIntField(term63518, term63518.getClass(), "listeningBoundsChildren", 0);
        setIntField(term63518, term63518.getClass(), "descendantsCount", 0);
        setField(term63518, term63518.getClass(), "preserveBackgroundColor", null);
        setIntField(term63518, term63518.getClass(), "numOfHWComponents", 0);
        setIntField(term63518, term63518.getClass(), "numOfLWComponents", 0);
        setField(term63518, term63518.getClass(), "modalComp", null);
        setField(term63518, term63518.getClass(), "modalAppContext", null);
        setIntField(term63518, term63518.getClass(), "containerSerializedDataVersion", 0);
        setField(term63518, term63518.getClass(), "peer", null);
        setField(term63518, term63518.getClass(), "parent", null);
        setField(term63518, term63518.getClass(), "appContext", null);
        setIntField(term63518, term63518.getClass(), "x", 0);
        setIntField(term63518, term63518.getClass(), "y", 0);
        setIntField(term63518, term63518.getClass(), "width", 0);
        setIntField(term63518, term63518.getClass(), "height", 0);
        setField(term63518, term63518.getClass(), "foreground", null);
        setField(term63518, term63518.getClass(), "background", null);
        setField(term63518, term63518.getClass(), "font", null);
        setField(term63518, term63518.getClass(), "peerFont", null);
        setField(term63518, term63518.getClass(), "cursor", null);
        setField(term63518, term63518.getClass(), "locale", null);
        setField(term63518, term63518.getClass(), "graphicsConfig", null);
        setField(term63518, term63518.getClass(), "bufferStrategy", null);
        setBooleanField(term63518, term63518.getClass(), "ignoreRepaint", false);
        setBooleanField(term63518, term63518.getClass(), "visible", false);
        setBooleanField(term63518, term63518.getClass(), "enabled", false);
        setBooleanField(term63518, term63518.getClass(), "valid", false);
        setField(term63518, term63518.getClass(), "dropTarget", null);
        setField(term63518, term63518.getClass(), "popups", null);
        setField(term63518, term63518.getClass(), "name", null);
        setBooleanField(term63518, term63518.getClass(), "nameExplicitlySet", false);
        setBooleanField(term63518, term63518.getClass(), "focusable", false);
        setIntField(term63518, term63518.getClass(), "isFocusTraversableOverridden", 0);
        setField(term63518, term63518.getClass(), "focusTraversalKeys", null);
        setBooleanField(term63518, term63518.getClass(), "focusTraversalKeysEnabled", false);
        setField(term63518, term63518.getClass(), "acc", null);
        setField(term63518, term63518.getClass(), "minSize", null);
        setBooleanField(term63518, term63518.getClass(), "minSizeSet", false);
        setField(term63518, term63518.getClass(), "prefSize", null);
        setBooleanField(term63518, term63518.getClass(), "prefSizeSet", false);
        setField(term63518, term63518.getClass(), "maxSize", null);
        setBooleanField(term63518, term63518.getClass(), "maxSizeSet", false);
        setField(term63518, term63518.getClass(), "componentOrientation", null);
        setBooleanField(term63518, term63518.getClass(), "newEventsOnly", false);
        setField(term63518, term63518.getClass(), "componentListener", null);
        setField(term63518, term63518.getClass(), "focusListener", null);
        setField(term63518, term63518.getClass(), "hierarchyListener", null);
        setField(term63518, term63518.getClass(), "hierarchyBoundsListener", null);
        setField(term63518, term63518.getClass(), "keyListener", null);
        setField(term63518, term63518.getClass(), "mouseListener", null);
        setField(term63518, term63518.getClass(), "mouseMotionListener", null);
        setField(term63518, term63518.getClass(), "mouseWheelListener", null);
        setField(term63518, term63518.getClass(), "inputMethodListener", null);
        setLongField(term63518, term63518.getClass(), "eventMask", 0L);
        setField(term63518, term63518.getClass(), "changeSupport", null);
        setField(term63518, term63518.getClass(), "objectLock", null);
        setBooleanField(term63518, term63518.getClass(), "isPacked", false);
        setIntField(term63518, term63518.getClass(), "boundsOp", 0);
        setField(term63518, term63518.getClass(), "compoundShape", null);
        setField(term63518, term63518.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term63518, term63518.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term63518, term63518.getClass(), "backgroundEraseDisabled", false);
        setField(term63518, term63518.getClass(), "eventCache", null);
        setBooleanField(term63518, term63518.getClass(), "coalescingEnabled", false);
        setBooleanField(term63518, term63518.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term63518, term63518.getClass(), "componentSerializedDataVersion", 0);
        setField(term63518, term63518.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toTop", argTypes, term63518, args);
    }

};


