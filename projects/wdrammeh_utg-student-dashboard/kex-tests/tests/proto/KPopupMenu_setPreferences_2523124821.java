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
     Object term36560;

    public KPopupMenu_setPreferences_2523124821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36560 = newInstance(Class.forName("proto.KPopupMenu"));
        setField(term36560, term36560.getClass(), "invoker", null);
        setField(term36560, term36560.getClass(), "popup", null);
        setField(term36560, term36560.getClass(), "frame", null);
        setIntField(term36560, term36560.getClass(), "desiredLocationX", 0);
        setIntField(term36560, term36560.getClass(), "desiredLocationY", 0);
        setField(term36560, term36560.getClass(), "label", null);
        setBooleanField(term36560, term36560.getClass(), "paintBorder", false);
        setField(term36560, term36560.getClass(), "margin", null);
        setBooleanField(term36560, term36560.getClass(), "lightWeightPopup", false);
        setField(term36560, term36560.getClass(), "selectionModel", null);
        setBooleanField(term36560, term36560.getClass(), "isAlignmentXSet", false);
        setFloatField(term36560, term36560.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36560, term36560.getClass(), "isAlignmentYSet", false);
        setFloatField(term36560, term36560.getClass(), "alignmentY", 0.0F);
        setField(term36560, term36560.getClass(), "ui", null);
        setField(term36560, term36560.getClass(), "listenerList", null);
        setField(term36560, term36560.getClass(), "clientProperties", null);
        setField(term36560, term36560.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36560, term36560.getClass(), "autoscrolls", false);
        setField(term36560, term36560.getClass(), "border", null);
        setIntField(term36560, term36560.getClass(), "flags", 0);
        setField(term36560, term36560.getClass(), "inputVerifier", null);
        setBooleanField(term36560, term36560.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36560, term36560.getClass(), "paintingChild", null);
        setField(term36560, term36560.getClass(), "popupMenu", null);
        setField(term36560, term36560.getClass(), "revalidateRunnableScheduled", null);
        setField(term36560, term36560.getClass(), "focusInputMap", null);
        setField(term36560, term36560.getClass(), "ancestorInputMap", null);
        setField(term36560, term36560.getClass(), "windowInputMap", null);
        setField(term36560, term36560.getClass(), "actionMap", null);
        setField(term36560, term36560.getClass(), "aaHint", null);
        setField(term36560, term36560.getClass(), "lcdRenderingHint", null);
        setField(term36560, term36560.getClass(), "component", null);
        setField(term36560, term36560.getClass(), "layoutMgr", null);
        setField(term36560, term36560.getClass(), "dispatcher", null);
        setField(term36560, term36560.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36560, term36560.getClass(), "focusCycleRoot", false);
        setBooleanField(term36560, term36560.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36560, term36560.getClass(), "printingThreads", null);
        setBooleanField(term36560, term36560.getClass(), "printing", false);
        setField(term36560, term36560.getClass(), "containerListener", null);
        setIntField(term36560, term36560.getClass(), "listeningChildren", 0);
        setIntField(term36560, term36560.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36560, term36560.getClass(), "descendantsCount", 0);
        setField(term36560, term36560.getClass(), "preserveBackgroundColor", null);
        setIntField(term36560, term36560.getClass(), "numOfHWComponents", 0);
        setIntField(term36560, term36560.getClass(), "numOfLWComponents", 0);
        setField(term36560, term36560.getClass(), "modalComp", null);
        setField(term36560, term36560.getClass(), "modalAppContext", null);
        setIntField(term36560, term36560.getClass(), "containerSerializedDataVersion", 0);
        setField(term36560, term36560.getClass(), "peer", null);
        setField(term36560, term36560.getClass(), "parent", null);
        setField(term36560, term36560.getClass(), "appContext", null);
        setIntField(term36560, term36560.getClass(), "x", 0);
        setIntField(term36560, term36560.getClass(), "y", 0);
        setIntField(term36560, term36560.getClass(), "width", 0);
        setIntField(term36560, term36560.getClass(), "height", 0);
        setField(term36560, term36560.getClass(), "foreground", null);
        setField(term36560, term36560.getClass(), "background", null);
        setField(term36560, term36560.getClass(), "font", null);
        setField(term36560, term36560.getClass(), "peerFont", null);
        setField(term36560, term36560.getClass(), "cursor", null);
        setField(term36560, term36560.getClass(), "locale", null);
        setField(term36560, term36560.getClass(), "graphicsConfig", null);
        setField(term36560, term36560.getClass(), "bufferStrategy", null);
        setBooleanField(term36560, term36560.getClass(), "ignoreRepaint", false);
        setBooleanField(term36560, term36560.getClass(), "visible", false);
        setBooleanField(term36560, term36560.getClass(), "enabled", false);
        setBooleanField(term36560, term36560.getClass(), "valid", false);
        setField(term36560, term36560.getClass(), "dropTarget", null);
        setField(term36560, term36560.getClass(), "popups", null);
        setField(term36560, term36560.getClass(), "name", null);
        setBooleanField(term36560, term36560.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36560, term36560.getClass(), "focusable", false);
        setIntField(term36560, term36560.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36560, term36560.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36560, term36560.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36560, term36560.getClass(), "acc", null);
        setField(term36560, term36560.getClass(), "minSize", null);
        setBooleanField(term36560, term36560.getClass(), "minSizeSet", false);
        setField(term36560, term36560.getClass(), "prefSize", null);
        setBooleanField(term36560, term36560.getClass(), "prefSizeSet", false);
        setField(term36560, term36560.getClass(), "maxSize", null);
        setBooleanField(term36560, term36560.getClass(), "maxSizeSet", false);
        setField(term36560, term36560.getClass(), "componentOrientation", null);
        setBooleanField(term36560, term36560.getClass(), "newEventsOnly", false);
        setField(term36560, term36560.getClass(), "componentListener", null);
        setField(term36560, term36560.getClass(), "focusListener", null);
        setField(term36560, term36560.getClass(), "hierarchyListener", null);
        setField(term36560, term36560.getClass(), "hierarchyBoundsListener", null);
        setField(term36560, term36560.getClass(), "keyListener", null);
        setField(term36560, term36560.getClass(), "mouseListener", null);
        setField(term36560, term36560.getClass(), "mouseMotionListener", null);
        setField(term36560, term36560.getClass(), "mouseWheelListener", null);
        setField(term36560, term36560.getClass(), "inputMethodListener", null);
        setLongField(term36560, term36560.getClass(), "eventMask", 0L);
        setField(term36560, term36560.getClass(), "changeSupport", null);
        setField(term36560, term36560.getClass(), "objectLock", null);
        setBooleanField(term36560, term36560.getClass(), "isPacked", false);
        setIntField(term36560, term36560.getClass(), "boundsOp", 0);
        setField(term36560, term36560.getClass(), "compoundShape", null);
        setField(term36560, term36560.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36560, term36560.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36560, term36560.getClass(), "backgroundEraseDisabled", false);
        setField(term36560, term36560.getClass(), "eventCache", null);
        setBooleanField(term36560, term36560.getClass(), "coalescingEnabled", false);
        setBooleanField(term36560, term36560.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36560, term36560.getClass(), "componentSerializedDataVersion", 0);
        setField(term36560, term36560.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KPopupMenu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term36560, args);
    }

};


