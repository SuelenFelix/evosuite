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
     Object term61145;

    public ModuleAnalysis_Sketch_paintComponent_10912750823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61145 = newInstance(Class.forName("core.module.ModuleAnalysis$Sketch"));
        setBooleanField(term61145, term61145.getClass(), "reflectTheme", false);
        setBooleanField(term61145, term61145.getClass(), "isAlignmentXSet", false);
        setFloatField(term61145, term61145.getClass(), "alignmentX", 0.0F);
        setBooleanField(term61145, term61145.getClass(), "isAlignmentYSet", false);
        setFloatField(term61145, term61145.getClass(), "alignmentY", 0.0F);
        setField(term61145, term61145.getClass(), "ui", null);
        setField(term61145, term61145.getClass(), "listenerList", null);
        setField(term61145, term61145.getClass(), "clientProperties", null);
        setField(term61145, term61145.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term61145, term61145.getClass(), "autoscrolls", false);
        setField(term61145, term61145.getClass(), "border", null);
        setIntField(term61145, term61145.getClass(), "flags", 0);
        setField(term61145, term61145.getClass(), "inputVerifier", null);
        setBooleanField(term61145, term61145.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term61145, term61145.getClass(), "paintingChild", null);
        setField(term61145, term61145.getClass(), "popupMenu", null);
        setField(term61145, term61145.getClass(), "revalidateRunnableScheduled", null);
        setField(term61145, term61145.getClass(), "focusInputMap", null);
        setField(term61145, term61145.getClass(), "ancestorInputMap", null);
        setField(term61145, term61145.getClass(), "windowInputMap", null);
        setField(term61145, term61145.getClass(), "actionMap", null);
        setField(term61145, term61145.getClass(), "aaHint", null);
        setField(term61145, term61145.getClass(), "lcdRenderingHint", null);
        setField(term61145, term61145.getClass(), "component", null);
        setField(term61145, term61145.getClass(), "layoutMgr", null);
        setField(term61145, term61145.getClass(), "dispatcher", null);
        setField(term61145, term61145.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61145, term61145.getClass(), "focusCycleRoot", false);
        setBooleanField(term61145, term61145.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61145, term61145.getClass(), "printingThreads", null);
        setBooleanField(term61145, term61145.getClass(), "printing", false);
        setField(term61145, term61145.getClass(), "containerListener", null);
        setIntField(term61145, term61145.getClass(), "listeningChildren", 0);
        setIntField(term61145, term61145.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61145, term61145.getClass(), "descendantsCount", 0);
        setField(term61145, term61145.getClass(), "preserveBackgroundColor", null);
        setIntField(term61145, term61145.getClass(), "numOfHWComponents", 0);
        setIntField(term61145, term61145.getClass(), "numOfLWComponents", 0);
        setField(term61145, term61145.getClass(), "modalComp", null);
        setField(term61145, term61145.getClass(), "modalAppContext", null);
        setIntField(term61145, term61145.getClass(), "containerSerializedDataVersion", 0);
        setField(term61145, term61145.getClass(), "peer", null);
        setField(term61145, term61145.getClass(), "parent", null);
        setField(term61145, term61145.getClass(), "appContext", null);
        setIntField(term61145, term61145.getClass(), "x", 0);
        setIntField(term61145, term61145.getClass(), "y", 0);
        setIntField(term61145, term61145.getClass(), "width", 0);
        setIntField(term61145, term61145.getClass(), "height", 0);
        setField(term61145, term61145.getClass(), "foreground", null);
        setField(term61145, term61145.getClass(), "background", null);
        setField(term61145, term61145.getClass(), "font", null);
        setField(term61145, term61145.getClass(), "peerFont", null);
        setField(term61145, term61145.getClass(), "cursor", null);
        setField(term61145, term61145.getClass(), "locale", null);
        setField(term61145, term61145.getClass(), "graphicsConfig", null);
        setField(term61145, term61145.getClass(), "bufferStrategy", null);
        setBooleanField(term61145, term61145.getClass(), "ignoreRepaint", false);
        setBooleanField(term61145, term61145.getClass(), "visible", false);
        setBooleanField(term61145, term61145.getClass(), "enabled", false);
        setBooleanField(term61145, term61145.getClass(), "valid", false);
        setField(term61145, term61145.getClass(), "dropTarget", null);
        setField(term61145, term61145.getClass(), "popups", null);
        setField(term61145, term61145.getClass(), "name", null);
        setBooleanField(term61145, term61145.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61145, term61145.getClass(), "focusable", false);
        setIntField(term61145, term61145.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61145, term61145.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61145, term61145.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61145, term61145.getClass(), "acc", null);
        setField(term61145, term61145.getClass(), "minSize", null);
        setBooleanField(term61145, term61145.getClass(), "minSizeSet", false);
        setField(term61145, term61145.getClass(), "prefSize", null);
        setBooleanField(term61145, term61145.getClass(), "prefSizeSet", false);
        setField(term61145, term61145.getClass(), "maxSize", null);
        setBooleanField(term61145, term61145.getClass(), "maxSizeSet", false);
        setField(term61145, term61145.getClass(), "componentOrientation", null);
        setBooleanField(term61145, term61145.getClass(), "newEventsOnly", false);
        setField(term61145, term61145.getClass(), "componentListener", null);
        setField(term61145, term61145.getClass(), "focusListener", null);
        setField(term61145, term61145.getClass(), "hierarchyListener", null);
        setField(term61145, term61145.getClass(), "hierarchyBoundsListener", null);
        setField(term61145, term61145.getClass(), "keyListener", null);
        setField(term61145, term61145.getClass(), "mouseListener", null);
        setField(term61145, term61145.getClass(), "mouseMotionListener", null);
        setField(term61145, term61145.getClass(), "mouseWheelListener", null);
        setField(term61145, term61145.getClass(), "inputMethodListener", null);
        setLongField(term61145, term61145.getClass(), "eventMask", 0L);
        setField(term61145, term61145.getClass(), "changeSupport", null);
        setField(term61145, term61145.getClass(), "objectLock", null);
        setBooleanField(term61145, term61145.getClass(), "isPacked", false);
        setIntField(term61145, term61145.getClass(), "boundsOp", 0);
        setField(term61145, term61145.getClass(), "compoundShape", null);
        setField(term61145, term61145.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61145, term61145.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61145, term61145.getClass(), "backgroundEraseDisabled", false);
        setField(term61145, term61145.getClass(), "eventCache", null);
        setBooleanField(term61145, term61145.getClass(), "coalescingEnabled", false);
        setBooleanField(term61145, term61145.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61145, term61145.getClass(), "componentSerializedDataVersion", 0);
        setField(term61145, term61145.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$Sketch");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term61145, args);
    }

};


