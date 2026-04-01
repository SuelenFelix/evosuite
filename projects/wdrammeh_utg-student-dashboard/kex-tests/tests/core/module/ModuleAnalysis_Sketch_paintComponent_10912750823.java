package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ModuleAnalysis_Sketch_paintComponent_10912750823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190090;

    public ModuleAnalysis_Sketch_paintComponent_10912750823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190090 = newInstance(Class.forName("core.module.ModuleAnalysis$Sketch"));
        setBooleanField(term190090, term190090.getClass(), "reflectTheme", false);
        setBooleanField(term190090, term190090.getClass(), "isAlignmentXSet", false);
        setFloatField(term190090, term190090.getClass(), "alignmentX", 0.0F);
        setBooleanField(term190090, term190090.getClass(), "isAlignmentYSet", false);
        setFloatField(term190090, term190090.getClass(), "alignmentY", 0.0F);
        setField(term190090, term190090.getClass(), "ui", null);
        setField(term190090, term190090.getClass(), "listenerList", null);
        setField(term190090, term190090.getClass(), "clientProperties", null);
        setField(term190090, term190090.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term190090, term190090.getClass(), "autoscrolls", false);
        setField(term190090, term190090.getClass(), "border", null);
        setIntField(term190090, term190090.getClass(), "flags", 0);
        setField(term190090, term190090.getClass(), "inputVerifier", null);
        setBooleanField(term190090, term190090.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term190090, term190090.getClass(), "paintingChild", null);
        setField(term190090, term190090.getClass(), "popupMenu", null);
        setField(term190090, term190090.getClass(), "revalidateRunnableScheduled", null);
        setField(term190090, term190090.getClass(), "focusInputMap", null);
        setField(term190090, term190090.getClass(), "ancestorInputMap", null);
        setField(term190090, term190090.getClass(), "windowInputMap", null);
        setField(term190090, term190090.getClass(), "actionMap", null);
        setField(term190090, term190090.getClass(), "aaHint", null);
        setField(term190090, term190090.getClass(), "lcdRenderingHint", null);
        setField(term190090, term190090.getClass(), "component", null);
        setField(term190090, term190090.getClass(), "layoutMgr", null);
        setField(term190090, term190090.getClass(), "dispatcher", null);
        setField(term190090, term190090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term190090, term190090.getClass(), "focusCycleRoot", false);
        setBooleanField(term190090, term190090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term190090, term190090.getClass(), "printingThreads", null);
        setBooleanField(term190090, term190090.getClass(), "printing", false);
        setField(term190090, term190090.getClass(), "containerListener", null);
        setIntField(term190090, term190090.getClass(), "listeningChildren", 0);
        setIntField(term190090, term190090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term190090, term190090.getClass(), "descendantsCount", 0);
        setField(term190090, term190090.getClass(), "preserveBackgroundColor", null);
        setIntField(term190090, term190090.getClass(), "numOfHWComponents", 0);
        setIntField(term190090, term190090.getClass(), "numOfLWComponents", 0);
        setField(term190090, term190090.getClass(), "modalComp", null);
        setField(term190090, term190090.getClass(), "modalAppContext", null);
        setIntField(term190090, term190090.getClass(), "containerSerializedDataVersion", 0);
        setField(term190090, term190090.getClass(), "peer", null);
        setField(term190090, term190090.getClass(), "parent", null);
        setField(term190090, term190090.getClass(), "appContext", null);
        setIntField(term190090, term190090.getClass(), "x", 0);
        setIntField(term190090, term190090.getClass(), "y", 0);
        setIntField(term190090, term190090.getClass(), "width", 0);
        setIntField(term190090, term190090.getClass(), "height", 0);
        setField(term190090, term190090.getClass(), "foreground", null);
        setField(term190090, term190090.getClass(), "background", null);
        setField(term190090, term190090.getClass(), "font", null);
        setField(term190090, term190090.getClass(), "peerFont", null);
        setField(term190090, term190090.getClass(), "cursor", null);
        setField(term190090, term190090.getClass(), "locale", null);
        setField(term190090, term190090.getClass(), "graphicsConfig", null);
        setField(term190090, term190090.getClass(), "bufferStrategy", null);
        setBooleanField(term190090, term190090.getClass(), "ignoreRepaint", false);
        setBooleanField(term190090, term190090.getClass(), "visible", false);
        setBooleanField(term190090, term190090.getClass(), "enabled", false);
        setBooleanField(term190090, term190090.getClass(), "valid", false);
        setField(term190090, term190090.getClass(), "dropTarget", null);
        setField(term190090, term190090.getClass(), "popups", null);
        setField(term190090, term190090.getClass(), "name", null);
        setBooleanField(term190090, term190090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term190090, term190090.getClass(), "focusable", false);
        setIntField(term190090, term190090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term190090, term190090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term190090, term190090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term190090, term190090.getClass(), "acc", null);
        setField(term190090, term190090.getClass(), "minSize", null);
        setBooleanField(term190090, term190090.getClass(), "minSizeSet", false);
        setField(term190090, term190090.getClass(), "prefSize", null);
        setBooleanField(term190090, term190090.getClass(), "prefSizeSet", false);
        setField(term190090, term190090.getClass(), "maxSize", null);
        setBooleanField(term190090, term190090.getClass(), "maxSizeSet", false);
        setField(term190090, term190090.getClass(), "componentOrientation", null);
        setBooleanField(term190090, term190090.getClass(), "newEventsOnly", false);
        setField(term190090, term190090.getClass(), "componentListener", null);
        setField(term190090, term190090.getClass(), "focusListener", null);
        setField(term190090, term190090.getClass(), "hierarchyListener", null);
        setField(term190090, term190090.getClass(), "hierarchyBoundsListener", null);
        setField(term190090, term190090.getClass(), "keyListener", null);
        setField(term190090, term190090.getClass(), "mouseListener", null);
        setField(term190090, term190090.getClass(), "mouseMotionListener", null);
        setField(term190090, term190090.getClass(), "mouseWheelListener", null);
        setField(term190090, term190090.getClass(), "inputMethodListener", null);
        setLongField(term190090, term190090.getClass(), "eventMask", 0L);
        setField(term190090, term190090.getClass(), "changeSupport", null);
        setField(term190090, term190090.getClass(), "objectLock", null);
        setBooleanField(term190090, term190090.getClass(), "isPacked", false);
        setIntField(term190090, term190090.getClass(), "boundsOp", 0);
        setField(term190090, term190090.getClass(), "compoundShape", null);
        setField(term190090, term190090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term190090, term190090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term190090, term190090.getClass(), "backgroundEraseDisabled", false);
        setField(term190090, term190090.getClass(), "eventCache", null);
        setBooleanField(term190090, term190090.getClass(), "coalescingEnabled", false);
        setBooleanField(term190090, term190090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term190090, term190090.getClass(), "componentSerializedDataVersion", 0);
        setField(term190090, term190090.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$Sketch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term190090, args);
    }

};


