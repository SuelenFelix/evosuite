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

public class KLabel_setPreferences_17879962327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57099;

    public KLabel_setPreferences_17879962327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57099 = newInstance(Class.forName("proto.KLabel"));
        setIntField(term57099, term57099.getClass(), "mnemonic", 0);
        setIntField(term57099, term57099.getClass(), "mnemonicIndex", 0);
        setField(term57099, term57099.getClass(), "text", null);
        setField(term57099, term57099.getClass(), "defaultIcon", null);
        setField(term57099, term57099.getClass(), "disabledIcon", null);
        setBooleanField(term57099, term57099.getClass(), "disabledIconSet", false);
        setIntField(term57099, term57099.getClass(), "verticalAlignment", 0);
        setIntField(term57099, term57099.getClass(), "horizontalAlignment", 0);
        setIntField(term57099, term57099.getClass(), "verticalTextPosition", 0);
        setIntField(term57099, term57099.getClass(), "horizontalTextPosition", 0);
        setIntField(term57099, term57099.getClass(), "iconTextGap", 0);
        setField(term57099, term57099.getClass(), "labelFor", null);
        setBooleanField(term57099, term57099.getClass(), "isAlignmentXSet", false);
        setFloatField(term57099, term57099.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57099, term57099.getClass(), "isAlignmentYSet", false);
        setFloatField(term57099, term57099.getClass(), "alignmentY", 0.0F);
        setField(term57099, term57099.getClass(), "ui", null);
        setField(term57099, term57099.getClass(), "listenerList", null);
        setField(term57099, term57099.getClass(), "clientProperties", null);
        setField(term57099, term57099.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57099, term57099.getClass(), "autoscrolls", false);
        setField(term57099, term57099.getClass(), "border", null);
        setIntField(term57099, term57099.getClass(), "flags", 0);
        setField(term57099, term57099.getClass(), "inputVerifier", null);
        setBooleanField(term57099, term57099.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57099, term57099.getClass(), "paintingChild", null);
        setField(term57099, term57099.getClass(), "popupMenu", null);
        setField(term57099, term57099.getClass(), "revalidateRunnableScheduled", null);
        setField(term57099, term57099.getClass(), "focusInputMap", null);
        setField(term57099, term57099.getClass(), "ancestorInputMap", null);
        setField(term57099, term57099.getClass(), "windowInputMap", null);
        setField(term57099, term57099.getClass(), "actionMap", null);
        setField(term57099, term57099.getClass(), "aaHint", null);
        setField(term57099, term57099.getClass(), "lcdRenderingHint", null);
        setField(term57099, term57099.getClass(), "component", null);
        setField(term57099, term57099.getClass(), "layoutMgr", null);
        setField(term57099, term57099.getClass(), "dispatcher", null);
        setField(term57099, term57099.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57099, term57099.getClass(), "focusCycleRoot", false);
        setBooleanField(term57099, term57099.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57099, term57099.getClass(), "printingThreads", null);
        setBooleanField(term57099, term57099.getClass(), "printing", false);
        setField(term57099, term57099.getClass(), "containerListener", null);
        setIntField(term57099, term57099.getClass(), "listeningChildren", 0);
        setIntField(term57099, term57099.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57099, term57099.getClass(), "descendantsCount", 0);
        setField(term57099, term57099.getClass(), "preserveBackgroundColor", null);
        setIntField(term57099, term57099.getClass(), "numOfHWComponents", 0);
        setIntField(term57099, term57099.getClass(), "numOfLWComponents", 0);
        setField(term57099, term57099.getClass(), "modalComp", null);
        setField(term57099, term57099.getClass(), "modalAppContext", null);
        setIntField(term57099, term57099.getClass(), "containerSerializedDataVersion", 0);
        setField(term57099, term57099.getClass(), "peer", null);
        setField(term57099, term57099.getClass(), "parent", null);
        setField(term57099, term57099.getClass(), "appContext", null);
        setIntField(term57099, term57099.getClass(), "x", 0);
        setIntField(term57099, term57099.getClass(), "y", 0);
        setIntField(term57099, term57099.getClass(), "width", 0);
        setIntField(term57099, term57099.getClass(), "height", 0);
        setField(term57099, term57099.getClass(), "foreground", null);
        setField(term57099, term57099.getClass(), "background", null);
        setField(term57099, term57099.getClass(), "font", null);
        setField(term57099, term57099.getClass(), "peerFont", null);
        setField(term57099, term57099.getClass(), "cursor", null);
        setField(term57099, term57099.getClass(), "locale", null);
        setField(term57099, term57099.getClass(), "graphicsConfig", null);
        setField(term57099, term57099.getClass(), "bufferStrategy", null);
        setBooleanField(term57099, term57099.getClass(), "ignoreRepaint", false);
        setBooleanField(term57099, term57099.getClass(), "visible", false);
        setBooleanField(term57099, term57099.getClass(), "enabled", false);
        setBooleanField(term57099, term57099.getClass(), "valid", false);
        setField(term57099, term57099.getClass(), "dropTarget", null);
        setField(term57099, term57099.getClass(), "popups", null);
        setField(term57099, term57099.getClass(), "name", null);
        setBooleanField(term57099, term57099.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57099, term57099.getClass(), "focusable", false);
        setIntField(term57099, term57099.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57099, term57099.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57099, term57099.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57099, term57099.getClass(), "acc", null);
        setField(term57099, term57099.getClass(), "minSize", null);
        setBooleanField(term57099, term57099.getClass(), "minSizeSet", false);
        setField(term57099, term57099.getClass(), "prefSize", null);
        setBooleanField(term57099, term57099.getClass(), "prefSizeSet", false);
        setField(term57099, term57099.getClass(), "maxSize", null);
        setBooleanField(term57099, term57099.getClass(), "maxSizeSet", false);
        setField(term57099, term57099.getClass(), "componentOrientation", null);
        setBooleanField(term57099, term57099.getClass(), "newEventsOnly", false);
        setField(term57099, term57099.getClass(), "componentListener", null);
        setField(term57099, term57099.getClass(), "focusListener", null);
        setField(term57099, term57099.getClass(), "hierarchyListener", null);
        setField(term57099, term57099.getClass(), "hierarchyBoundsListener", null);
        setField(term57099, term57099.getClass(), "keyListener", null);
        setField(term57099, term57099.getClass(), "mouseListener", null);
        setField(term57099, term57099.getClass(), "mouseMotionListener", null);
        setField(term57099, term57099.getClass(), "mouseWheelListener", null);
        setField(term57099, term57099.getClass(), "inputMethodListener", null);
        setLongField(term57099, term57099.getClass(), "eventMask", 0L);
        setField(term57099, term57099.getClass(), "changeSupport", null);
        setField(term57099, term57099.getClass(), "objectLock", null);
        setBooleanField(term57099, term57099.getClass(), "isPacked", false);
        setIntField(term57099, term57099.getClass(), "boundsOp", 0);
        setField(term57099, term57099.getClass(), "compoundShape", null);
        setField(term57099, term57099.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57099, term57099.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57099, term57099.getClass(), "backgroundEraseDisabled", false);
        setField(term57099, term57099.getClass(), "eventCache", null);
        setBooleanField(term57099, term57099.getClass(), "coalescingEnabled", false);
        setBooleanField(term57099, term57099.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57099, term57099.getClass(), "componentSerializedDataVersion", 0);
        setField(term57099, term57099.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term57099, args);
    }

};


