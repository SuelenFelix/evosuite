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

public class KPopupMenu_setPreferences_2523124821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36593;

    public KPopupMenu_setPreferences_2523124821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36593 = newInstance(Class.forName("proto.KPopupMenu"));
        setField(term36593, term36593.getClass(), "invoker", null);
        setField(term36593, term36593.getClass(), "popup", null);
        setField(term36593, term36593.getClass(), "frame", null);
        setIntField(term36593, term36593.getClass(), "desiredLocationX", 0);
        setIntField(term36593, term36593.getClass(), "desiredLocationY", 0);
        setField(term36593, term36593.getClass(), "label", null);
        setBooleanField(term36593, term36593.getClass(), "paintBorder", false);
        setField(term36593, term36593.getClass(), "margin", null);
        setBooleanField(term36593, term36593.getClass(), "lightWeightPopup", false);
        setField(term36593, term36593.getClass(), "selectionModel", null);
        setBooleanField(term36593, term36593.getClass(), "isAlignmentXSet", false);
        setFloatField(term36593, term36593.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36593, term36593.getClass(), "isAlignmentYSet", false);
        setFloatField(term36593, term36593.getClass(), "alignmentY", 0.0F);
        setField(term36593, term36593.getClass(), "ui", null);
        setField(term36593, term36593.getClass(), "listenerList", null);
        setField(term36593, term36593.getClass(), "clientProperties", null);
        setField(term36593, term36593.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36593, term36593.getClass(), "autoscrolls", false);
        setField(term36593, term36593.getClass(), "border", null);
        setIntField(term36593, term36593.getClass(), "flags", 0);
        setField(term36593, term36593.getClass(), "inputVerifier", null);
        setBooleanField(term36593, term36593.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36593, term36593.getClass(), "paintingChild", null);
        setField(term36593, term36593.getClass(), "popupMenu", null);
        setField(term36593, term36593.getClass(), "revalidateRunnableScheduled", null);
        setField(term36593, term36593.getClass(), "focusInputMap", null);
        setField(term36593, term36593.getClass(), "ancestorInputMap", null);
        setField(term36593, term36593.getClass(), "windowInputMap", null);
        setField(term36593, term36593.getClass(), "actionMap", null);
        setField(term36593, term36593.getClass(), "aaHint", null);
        setField(term36593, term36593.getClass(), "lcdRenderingHint", null);
        setField(term36593, term36593.getClass(), "component", null);
        setField(term36593, term36593.getClass(), "layoutMgr", null);
        setField(term36593, term36593.getClass(), "dispatcher", null);
        setField(term36593, term36593.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36593, term36593.getClass(), "focusCycleRoot", false);
        setBooleanField(term36593, term36593.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36593, term36593.getClass(), "printingThreads", null);
        setBooleanField(term36593, term36593.getClass(), "printing", false);
        setField(term36593, term36593.getClass(), "containerListener", null);
        setIntField(term36593, term36593.getClass(), "listeningChildren", 0);
        setIntField(term36593, term36593.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36593, term36593.getClass(), "descendantsCount", 0);
        setField(term36593, term36593.getClass(), "preserveBackgroundColor", null);
        setIntField(term36593, term36593.getClass(), "numOfHWComponents", 0);
        setIntField(term36593, term36593.getClass(), "numOfLWComponents", 0);
        setField(term36593, term36593.getClass(), "modalComp", null);
        setField(term36593, term36593.getClass(), "modalAppContext", null);
        setIntField(term36593, term36593.getClass(), "containerSerializedDataVersion", 0);
        setField(term36593, term36593.getClass(), "peer", null);
        setField(term36593, term36593.getClass(), "parent", null);
        setField(term36593, term36593.getClass(), "appContext", null);
        setIntField(term36593, term36593.getClass(), "x", 0);
        setIntField(term36593, term36593.getClass(), "y", 0);
        setIntField(term36593, term36593.getClass(), "width", 0);
        setIntField(term36593, term36593.getClass(), "height", 0);
        setField(term36593, term36593.getClass(), "foreground", null);
        setField(term36593, term36593.getClass(), "background", null);
        setField(term36593, term36593.getClass(), "font", null);
        setField(term36593, term36593.getClass(), "peerFont", null);
        setField(term36593, term36593.getClass(), "cursor", null);
        setField(term36593, term36593.getClass(), "locale", null);
        setField(term36593, term36593.getClass(), "graphicsConfig", null);
        setField(term36593, term36593.getClass(), "bufferStrategy", null);
        setBooleanField(term36593, term36593.getClass(), "ignoreRepaint", false);
        setBooleanField(term36593, term36593.getClass(), "visible", false);
        setBooleanField(term36593, term36593.getClass(), "enabled", false);
        setBooleanField(term36593, term36593.getClass(), "valid", false);
        setField(term36593, term36593.getClass(), "dropTarget", null);
        setField(term36593, term36593.getClass(), "popups", null);
        setField(term36593, term36593.getClass(), "name", null);
        setBooleanField(term36593, term36593.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36593, term36593.getClass(), "focusable", false);
        setIntField(term36593, term36593.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36593, term36593.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36593, term36593.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36593, term36593.getClass(), "acc", null);
        setField(term36593, term36593.getClass(), "minSize", null);
        setBooleanField(term36593, term36593.getClass(), "minSizeSet", false);
        setField(term36593, term36593.getClass(), "prefSize", null);
        setBooleanField(term36593, term36593.getClass(), "prefSizeSet", false);
        setField(term36593, term36593.getClass(), "maxSize", null);
        setBooleanField(term36593, term36593.getClass(), "maxSizeSet", false);
        setField(term36593, term36593.getClass(), "componentOrientation", null);
        setBooleanField(term36593, term36593.getClass(), "newEventsOnly", false);
        setField(term36593, term36593.getClass(), "componentListener", null);
        setField(term36593, term36593.getClass(), "focusListener", null);
        setField(term36593, term36593.getClass(), "hierarchyListener", null);
        setField(term36593, term36593.getClass(), "hierarchyBoundsListener", null);
        setField(term36593, term36593.getClass(), "keyListener", null);
        setField(term36593, term36593.getClass(), "mouseListener", null);
        setField(term36593, term36593.getClass(), "mouseMotionListener", null);
        setField(term36593, term36593.getClass(), "mouseWheelListener", null);
        setField(term36593, term36593.getClass(), "inputMethodListener", null);
        setLongField(term36593, term36593.getClass(), "eventMask", 0L);
        setField(term36593, term36593.getClass(), "changeSupport", null);
        setField(term36593, term36593.getClass(), "objectLock", null);
        setBooleanField(term36593, term36593.getClass(), "isPacked", false);
        setIntField(term36593, term36593.getClass(), "boundsOp", 0);
        setField(term36593, term36593.getClass(), "compoundShape", null);
        setField(term36593, term36593.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36593, term36593.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36593, term36593.getClass(), "backgroundEraseDisabled", false);
        setField(term36593, term36593.getClass(), "eventCache", null);
        setBooleanField(term36593, term36593.getClass(), "coalescingEnabled", false);
        setBooleanField(term36593, term36593.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36593, term36593.getClass(), "componentSerializedDataVersion", 0);
        setField(term36593, term36593.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPopupMenu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term36593, args);
    }

};


