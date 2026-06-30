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
     Object term66162;

    public KScrollPane_setPreferences_72366600010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66162 = newInstance(Class.forName("proto.KScrollPane"));
        setField(term66162, term66162.getClass(), "viewportBorder", null);
        setIntField(term66162, term66162.getClass(), "verticalScrollBarPolicy", 0);
        setIntField(term66162, term66162.getClass(), "horizontalScrollBarPolicy", 0);
        setField(term66162, term66162.getClass(), "viewport", null);
        setField(term66162, term66162.getClass(), "verticalScrollBar", null);
        setField(term66162, term66162.getClass(), "horizontalScrollBar", null);
        setField(term66162, term66162.getClass(), "rowHeader", null);
        setField(term66162, term66162.getClass(), "columnHeader", null);
        setField(term66162, term66162.getClass(), "lowerLeft", null);
        setField(term66162, term66162.getClass(), "lowerRight", null);
        setField(term66162, term66162.getClass(), "upperLeft", null);
        setField(term66162, term66162.getClass(), "upperRight", null);
        setBooleanField(term66162, term66162.getClass(), "wheelScrollState", false);
        setBooleanField(term66162, term66162.getClass(), "isAlignmentXSet", false);
        setFloatField(term66162, term66162.getClass(), "alignmentX", 0.0F);
        setBooleanField(term66162, term66162.getClass(), "isAlignmentYSet", false);
        setFloatField(term66162, term66162.getClass(), "alignmentY", 0.0F);
        setField(term66162, term66162.getClass(), "ui", null);
        setField(term66162, term66162.getClass(), "listenerList", null);
        setField(term66162, term66162.getClass(), "clientProperties", null);
        setField(term66162, term66162.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term66162, term66162.getClass(), "autoscrolls", false);
        setField(term66162, term66162.getClass(), "border", null);
        setIntField(term66162, term66162.getClass(), "flags", 0);
        setField(term66162, term66162.getClass(), "inputVerifier", null);
        setBooleanField(term66162, term66162.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term66162, term66162.getClass(), "paintingChild", null);
        setField(term66162, term66162.getClass(), "popupMenu", null);
        setField(term66162, term66162.getClass(), "revalidateRunnableScheduled", null);
        setField(term66162, term66162.getClass(), "focusInputMap", null);
        setField(term66162, term66162.getClass(), "ancestorInputMap", null);
        setField(term66162, term66162.getClass(), "windowInputMap", null);
        setField(term66162, term66162.getClass(), "actionMap", null);
        setField(term66162, term66162.getClass(), "aaHint", null);
        setField(term66162, term66162.getClass(), "lcdRenderingHint", null);
        setField(term66162, term66162.getClass(), "component", null);
        setField(term66162, term66162.getClass(), "layoutMgr", null);
        setField(term66162, term66162.getClass(), "dispatcher", null);
        setField(term66162, term66162.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term66162, term66162.getClass(), "focusCycleRoot", false);
        setBooleanField(term66162, term66162.getClass(), "focusTraversalPolicyProvider", false);
        setField(term66162, term66162.getClass(), "printingThreads", null);
        setBooleanField(term66162, term66162.getClass(), "printing", false);
        setField(term66162, term66162.getClass(), "containerListener", null);
        setIntField(term66162, term66162.getClass(), "listeningChildren", 0);
        setIntField(term66162, term66162.getClass(), "listeningBoundsChildren", 0);
        setIntField(term66162, term66162.getClass(), "descendantsCount", 0);
        setField(term66162, term66162.getClass(), "preserveBackgroundColor", null);
        setIntField(term66162, term66162.getClass(), "numOfHWComponents", 0);
        setIntField(term66162, term66162.getClass(), "numOfLWComponents", 0);
        setField(term66162, term66162.getClass(), "modalComp", null);
        setField(term66162, term66162.getClass(), "modalAppContext", null);
        setIntField(term66162, term66162.getClass(), "containerSerializedDataVersion", 0);
        setField(term66162, term66162.getClass(), "peer", null);
        setField(term66162, term66162.getClass(), "parent", null);
        setField(term66162, term66162.getClass(), "appContext", null);
        setIntField(term66162, term66162.getClass(), "x", 0);
        setIntField(term66162, term66162.getClass(), "y", 0);
        setIntField(term66162, term66162.getClass(), "width", 0);
        setIntField(term66162, term66162.getClass(), "height", 0);
        setField(term66162, term66162.getClass(), "foreground", null);
        setField(term66162, term66162.getClass(), "background", null);
        setField(term66162, term66162.getClass(), "font", null);
        setField(term66162, term66162.getClass(), "peerFont", null);
        setField(term66162, term66162.getClass(), "cursor", null);
        setField(term66162, term66162.getClass(), "locale", null);
        setField(term66162, term66162.getClass(), "graphicsConfig", null);
        setField(term66162, term66162.getClass(), "bufferStrategy", null);
        setBooleanField(term66162, term66162.getClass(), "ignoreRepaint", false);
        setBooleanField(term66162, term66162.getClass(), "visible", false);
        setBooleanField(term66162, term66162.getClass(), "enabled", false);
        setBooleanField(term66162, term66162.getClass(), "valid", false);
        setField(term66162, term66162.getClass(), "dropTarget", null);
        setField(term66162, term66162.getClass(), "popups", null);
        setField(term66162, term66162.getClass(), "name", null);
        setBooleanField(term66162, term66162.getClass(), "nameExplicitlySet", false);
        setBooleanField(term66162, term66162.getClass(), "focusable", false);
        setIntField(term66162, term66162.getClass(), "isFocusTraversableOverridden", 0);
        setField(term66162, term66162.getClass(), "focusTraversalKeys", null);
        setBooleanField(term66162, term66162.getClass(), "focusTraversalKeysEnabled", false);
        setField(term66162, term66162.getClass(), "acc", null);
        setField(term66162, term66162.getClass(), "minSize", null);
        setBooleanField(term66162, term66162.getClass(), "minSizeSet", false);
        setField(term66162, term66162.getClass(), "prefSize", null);
        setBooleanField(term66162, term66162.getClass(), "prefSizeSet", false);
        setField(term66162, term66162.getClass(), "maxSize", null);
        setBooleanField(term66162, term66162.getClass(), "maxSizeSet", false);
        setField(term66162, term66162.getClass(), "componentOrientation", null);
        setBooleanField(term66162, term66162.getClass(), "newEventsOnly", false);
        setField(term66162, term66162.getClass(), "componentListener", null);
        setField(term66162, term66162.getClass(), "focusListener", null);
        setField(term66162, term66162.getClass(), "hierarchyListener", null);
        setField(term66162, term66162.getClass(), "hierarchyBoundsListener", null);
        setField(term66162, term66162.getClass(), "keyListener", null);
        setField(term66162, term66162.getClass(), "mouseListener", null);
        setField(term66162, term66162.getClass(), "mouseMotionListener", null);
        setField(term66162, term66162.getClass(), "mouseWheelListener", null);
        setField(term66162, term66162.getClass(), "inputMethodListener", null);
        setLongField(term66162, term66162.getClass(), "eventMask", 0L);
        setField(term66162, term66162.getClass(), "changeSupport", null);
        setField(term66162, term66162.getClass(), "objectLock", null);
        setBooleanField(term66162, term66162.getClass(), "isPacked", false);
        setIntField(term66162, term66162.getClass(), "boundsOp", 0);
        setField(term66162, term66162.getClass(), "compoundShape", null);
        setField(term66162, term66162.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term66162, term66162.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term66162, term66162.getClass(), "backgroundEraseDisabled", false);
        setField(term66162, term66162.getClass(), "eventCache", null);
        setBooleanField(term66162, term66162.getClass(), "coalescingEnabled", false);
        setBooleanField(term66162, term66162.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term66162, term66162.getClass(), "componentSerializedDataVersion", 0);
        setField(term66162, term66162.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KScrollPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term66162, args);
    }

};


