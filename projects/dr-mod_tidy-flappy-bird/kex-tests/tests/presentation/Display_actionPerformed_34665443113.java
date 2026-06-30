package presentation;

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
import static presentation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Display_actionPerformed_34665443113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2024;

    public Display_actionPerformed_34665443113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2024 = newInstance(Class.forName("presentation.Display"));
        setField(term2024, term2024.getClass(), "game", null);
        setBooleanField(term2024, term2024.getClass(), "isAlignmentXSet", false);
        setFloatField(term2024, term2024.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2024, term2024.getClass(), "isAlignmentYSet", false);
        setFloatField(term2024, term2024.getClass(), "alignmentY", 0.0F);
        setField(term2024, term2024.getClass(), "ui", null);
        setField(term2024, term2024.getClass(), "listenerList", null);
        setField(term2024, term2024.getClass(), "clientProperties", null);
        setField(term2024, term2024.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2024, term2024.getClass(), "autoscrolls", false);
        setField(term2024, term2024.getClass(), "border", null);
        setIntField(term2024, term2024.getClass(), "flags", 0);
        setField(term2024, term2024.getClass(), "inputVerifier", null);
        setBooleanField(term2024, term2024.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2024, term2024.getClass(), "paintingChild", null);
        setField(term2024, term2024.getClass(), "popupMenu", null);
        setField(term2024, term2024.getClass(), "revalidateRunnableScheduled", null);
        setField(term2024, term2024.getClass(), "focusInputMap", null);
        setField(term2024, term2024.getClass(), "ancestorInputMap", null);
        setField(term2024, term2024.getClass(), "windowInputMap", null);
        setField(term2024, term2024.getClass(), "actionMap", null);
        setField(term2024, term2024.getClass(), "aaHint", null);
        setField(term2024, term2024.getClass(), "lcdRenderingHint", null);
        setField(term2024, term2024.getClass(), "component", null);
        setField(term2024, term2024.getClass(), "layoutMgr", null);
        setField(term2024, term2024.getClass(), "dispatcher", null);
        setField(term2024, term2024.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2024, term2024.getClass(), "focusCycleRoot", false);
        setBooleanField(term2024, term2024.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2024, term2024.getClass(), "printingThreads", null);
        setBooleanField(term2024, term2024.getClass(), "printing", false);
        setField(term2024, term2024.getClass(), "containerListener", null);
        setIntField(term2024, term2024.getClass(), "listeningChildren", 0);
        setIntField(term2024, term2024.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2024, term2024.getClass(), "descendantsCount", 0);
        setField(term2024, term2024.getClass(), "preserveBackgroundColor", null);
        setIntField(term2024, term2024.getClass(), "numOfHWComponents", 0);
        setIntField(term2024, term2024.getClass(), "numOfLWComponents", 0);
        setField(term2024, term2024.getClass(), "modalComp", null);
        setField(term2024, term2024.getClass(), "modalAppContext", null);
        setIntField(term2024, term2024.getClass(), "containerSerializedDataVersion", 0);
        setField(term2024, term2024.getClass(), "peer", null);
        setField(term2024, term2024.getClass(), "parent", null);
        setField(term2024, term2024.getClass(), "appContext", null);
        setIntField(term2024, term2024.getClass(), "x", 0);
        setIntField(term2024, term2024.getClass(), "y", 0);
        setIntField(term2024, term2024.getClass(), "width", 0);
        setIntField(term2024, term2024.getClass(), "height", 0);
        setField(term2024, term2024.getClass(), "foreground", null);
        setField(term2024, term2024.getClass(), "background", null);
        setField(term2024, term2024.getClass(), "font", null);
        setField(term2024, term2024.getClass(), "peerFont", null);
        setField(term2024, term2024.getClass(), "cursor", null);
        setField(term2024, term2024.getClass(), "locale", null);
        setField(term2024, term2024.getClass(), "graphicsConfig", null);
        setField(term2024, term2024.getClass(), "bufferStrategy", null);
        setBooleanField(term2024, term2024.getClass(), "ignoreRepaint", false);
        setBooleanField(term2024, term2024.getClass(), "visible", false);
        setBooleanField(term2024, term2024.getClass(), "enabled", false);
        setBooleanField(term2024, term2024.getClass(), "valid", false);
        setField(term2024, term2024.getClass(), "dropTarget", null);
        setField(term2024, term2024.getClass(), "popups", null);
        setField(term2024, term2024.getClass(), "name", null);
        setBooleanField(term2024, term2024.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2024, term2024.getClass(), "focusable", false);
        setIntField(term2024, term2024.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2024, term2024.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2024, term2024.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2024, term2024.getClass(), "acc", null);
        setField(term2024, term2024.getClass(), "minSize", null);
        setBooleanField(term2024, term2024.getClass(), "minSizeSet", false);
        setField(term2024, term2024.getClass(), "prefSize", null);
        setBooleanField(term2024, term2024.getClass(), "prefSizeSet", false);
        setField(term2024, term2024.getClass(), "maxSize", null);
        setBooleanField(term2024, term2024.getClass(), "maxSizeSet", false);
        setField(term2024, term2024.getClass(), "componentOrientation", null);
        setBooleanField(term2024, term2024.getClass(), "newEventsOnly", false);
        setField(term2024, term2024.getClass(), "componentListener", null);
        setField(term2024, term2024.getClass(), "focusListener", null);
        setField(term2024, term2024.getClass(), "hierarchyListener", null);
        setField(term2024, term2024.getClass(), "hierarchyBoundsListener", null);
        setField(term2024, term2024.getClass(), "keyListener", null);
        setField(term2024, term2024.getClass(), "mouseListener", null);
        setField(term2024, term2024.getClass(), "mouseMotionListener", null);
        setField(term2024, term2024.getClass(), "mouseWheelListener", null);
        setField(term2024, term2024.getClass(), "inputMethodListener", null);
        setLongField(term2024, term2024.getClass(), "eventMask", 0L);
        setField(term2024, term2024.getClass(), "changeSupport", null);
        setField(term2024, term2024.getClass(), "objectLock", null);
        setBooleanField(term2024, term2024.getClass(), "isPacked", false);
        setIntField(term2024, term2024.getClass(), "boundsOp", 0);
        setField(term2024, term2024.getClass(), "compoundShape", null);
        setField(term2024, term2024.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2024, term2024.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2024, term2024.getClass(), "backgroundEraseDisabled", false);
        setField(term2024, term2024.getClass(), "eventCache", null);
        setBooleanField(term2024, term2024.getClass(), "coalescingEnabled", false);
        setBooleanField(term2024, term2024.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2024, term2024.getClass(), "componentSerializedDataVersion", 0);
        setField(term2024, term2024.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("presentation.Display");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term2024, args);
    }

};


