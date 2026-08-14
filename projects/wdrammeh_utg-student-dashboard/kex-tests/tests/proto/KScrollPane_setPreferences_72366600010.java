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

public class KScrollPane_setPreferences_72366600010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66211;

    public KScrollPane_setPreferences_72366600010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66211 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term66211, term66211.getClass(), "viewportBorder", null);
        setIntField(term66211, term66211.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term66211, term66211.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term66211, term66211.getClass(), "viewport", null);
        setField(term66211, term66211.getClass(), "verticalScrollBar", null);
        setField(term66211, term66211.getClass(), "horizontalScrollBar", null);
        setField(term66211, term66211.getClass(), "rowHeader", null);
        setField(term66211, term66211.getClass(), "columnHeader", null);
        setField(term66211, term66211.getClass(), "lowerLeft", null);
        setField(term66211, term66211.getClass(), "lowerRight", null);
        setField(term66211, term66211.getClass(), "upperLeft", null);
        setField(term66211, term66211.getClass(), "upperRight", null);
        setBooleanField(term66211, term66211.getClass(), "wheelScrollState", false);
        setBooleanField(term66211, term66211.getClass(), "isAlignmentXSet", false);
        setFloatField(term66211, term66211.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66211, term66211.getClass(), "isAlignmentYSet", false);
        setFloatField(term66211, term66211.getClass(), "alignmentY", 0.0F);
        setField(term66211, term66211.getClass(), "ui", null);
        setField(term66211, term66211.getClass(), "listenerList", null);
        setField(term66211, term66211.getClass(), "clientProperties", null);
        setField(term66211, term66211.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66211, term66211.getClass(), "autoscrolls", false);
        setField(term66211, term66211.getClass(), "border", null);
        setIntField(term66211, term66211.getClass(), "flags", 0);
        setField(term66211, term66211.getClass(), "inputVerifier", null);
        setBooleanField(term66211, term66211.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66211, term66211.getClass(), "paintingChild", null);
        setField(term66211, term66211.getClass(), "popupMenu", null);
        setField(term66211, term66211.getClass(), "revalidateRunnableScheduled", null);
        setField(term66211, term66211.getClass(), "focusInputMap", null);
        setField(term66211, term66211.getClass(), "ancestorInputMap", null);
        setField(term66211, term66211.getClass(), "windowInputMap", null);
        setField(term66211, term66211.getClass(), "actionMap", null);
        setField(term66211, term66211.getClass(), "aaHint", null);
        setField(term66211, term66211.getClass(), "lcdRenderingHint", null);
        setField(term66211, term66211.getClass(), "component", null);
        setField(term66211, term66211.getClass(), "layoutMgr", null);
        setField(term66211, term66211.getClass(), "dispatcher", null);
        setField(term66211, term66211.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66211, term66211.getClass(), "focusCycleRoot", false);
        setBooleanField(term66211, term66211.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66211, term66211.getClass(), "printingThreads", null);
        setBooleanField(term66211, term66211.getClass(), "printing", false);
        setField(term66211, term66211.getClass(), "containerListener", null);
        setIntField(term66211, term66211.getClass(), "listeningChildren", 0);
        setIntField(term66211, term66211.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66211, term66211.getClass(), "descendantsCount", 0);
        setField(term66211, term66211.getClass(), "preserveBackgroundColor", null);
        setIntField(term66211, term66211.getClass(), "numOfHWComponents", 0);
        setIntField(term66211, term66211.getClass(), "numOfLWComponents", 0);
        setField(term66211, term66211.getClass(), "modalComp", null);
        setField(term66211, term66211.getClass(), "modalAppContext", null);
        setIntField(term66211, term66211.getClass(), "containerSerializedDataVersion", 0);
        setField(term66211, term66211.getClass(), "peer", null);
        setField(term66211, term66211.getClass(), "parent", null);
        setField(term66211, term66211.getClass(), "appContext", null);
        setIntField(term66211, term66211.getClass(), "x", 0);
        setIntField(term66211, term66211.getClass(), "y", 0);
        setIntField(term66211, term66211.getClass(), "width", 0);
        setIntField(term66211, term66211.getClass(), "height", 0);
        setField(term66211, term66211.getClass(), "foreground", null);
        setField(term66211, term66211.getClass(), "background", null);
        setField(term66211, term66211.getClass(), "font", null);
        setField(term66211, term66211.getClass(), "peerFont", null);
        setField(term66211, term66211.getClass(), "cursor", null);
        setField(term66211, term66211.getClass(), "locale", null);
        setField(term66211, term66211.getClass(), "graphicsConfig", null);
        setField(term66211, term66211.getClass(), "bufferStrategy", null);
        setBooleanField(term66211, term66211.getClass(), "ignoreRepaint", false);
        setBooleanField(term66211, term66211.getClass(), "visible", false);
        setBooleanField(term66211, term66211.getClass(), "enabled", false);
        setBooleanField(term66211, term66211.getClass(), "valid", false);
        setField(term66211, term66211.getClass(), "dropTarget", null);
        setField(term66211, term66211.getClass(), "popups", null);
        setField(term66211, term66211.getClass(), "name", null);
        setBooleanField(term66211, term66211.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66211, term66211.getClass(), "focusable", false);
        setIntField(term66211, term66211.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66211, term66211.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66211, term66211.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66211, term66211.getClass(), "acc", null);
        setField(term66211, term66211.getClass(), "minSize", null);
        setBooleanField(term66211, term66211.getClass(), "minSizeSet", false);
        setField(term66211, term66211.getClass(), "prefSize", null);
        setBooleanField(term66211, term66211.getClass(), "prefSizeSet", false);
        setField(term66211, term66211.getClass(), "maxSize", null);
        setBooleanField(term66211, term66211.getClass(), "maxSizeSet", false);
        setField(term66211, term66211.getClass(), "componentOrientation", null);
        setBooleanField(term66211, term66211.getClass(), "newEventsOnly", false);
        setField(term66211, term66211.getClass(), "componentListener", null);
        setField(term66211, term66211.getClass(), "focusListener", null);
        setField(term66211, term66211.getClass(), "hierarchyListener", null);
        setField(term66211, term66211.getClass(), "hierarchyBoundsListener", null);
        setField(term66211, term66211.getClass(), "keyListener", null);
        setField(term66211, term66211.getClass(), "mouseListener", null);
        setField(term66211, term66211.getClass(), "mouseMotionListener", null);
        setField(term66211, term66211.getClass(), "mouseWheelListener", null);
        setField(term66211, term66211.getClass(), "inputMethodListener", null);
        setLongField(term66211, term66211.getClass(), "eventMask", 0L);
        setField(term66211, term66211.getClass(), "changeSupport", null);
        setField(term66211, term66211.getClass(), "objectLock", null);
        setBooleanField(term66211, term66211.getClass(), "isPacked", false);
        setIntField(term66211, term66211.getClass(), "boundsOp", 0);
        setField(term66211, term66211.getClass(), "compoundShape", null);
        setField(term66211, term66211.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66211, term66211.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66211, term66211.getClass(), "backgroundEraseDisabled", false);
        setField(term66211, term66211.getClass(), "eventCache", null);
        setBooleanField(term66211, term66211.getClass(), "coalescingEnabled", false);
        setBooleanField(term66211, term66211.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66211, term66211.getClass(), "componentSerializedDataVersion", 0);
        setField(term66211, term66211.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term66211, args);
    }

};


