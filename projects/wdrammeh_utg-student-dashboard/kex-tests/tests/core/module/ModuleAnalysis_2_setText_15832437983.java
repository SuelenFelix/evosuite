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

public class ModuleAnalysis_2_setText_15832437983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295397;

    public ModuleAnalysis_2_setText_15832437983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295397 = newInstance(Class.forName("core.module.ModuleAnalysis$2"));
        setField(term295397, term295397.getClass(), "this$0", null);
        setIntField(term295397, term295397.getClass(), "mnemonic", 0);
        setIntField(term295397, term295397.getClass(), "mnemonicIndex", 0);
        setField(term295397, term295397.getClass(), "text", null);
        setField(term295397, term295397.getClass(), "defaultIcon", null);
        setField(term295397, term295397.getClass(), "disabledIcon", null);
        setBooleanField(term295397, term295397.getClass(), "disabledIconSet", false);
        setIntField(term295397, term295397.getClass(), "verticalAlignment", 0);
        setIntField(term295397, term295397.getClass(), "horizontalAlignment", 0);
        setIntField(term295397, term295397.getClass(), "verticalTextPosition", 0);
        setIntField(term295397, term295397.getClass(), "horizontalTextPosition", 0);
        setIntField(term295397, term295397.getClass(), "iconTextGap", 0);
        setField(term295397, term295397.getClass(), "labelFor", null);
        setBooleanField(term295397, term295397.getClass(), "isAlignmentXSet", false);
        setFloatField(term295397, term295397.getClass(), "alignmentX", 0.0F);
        setBooleanField(term295397, term295397.getClass(), "isAlignmentYSet", false);
        setFloatField(term295397, term295397.getClass(), "alignmentY", 0.0F);
        setField(term295397, term295397.getClass(), "ui", null);
        setField(term295397, term295397.getClass(), "listenerList", null);
        setField(term295397, term295397.getClass(), "clientProperties", null);
        setField(term295397, term295397.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term295397, term295397.getClass(), "autoscrolls", false);
        setField(term295397, term295397.getClass(), "border", null);
        setIntField(term295397, term295397.getClass(), "flags", 0);
        setField(term295397, term295397.getClass(), "inputVerifier", null);
        setBooleanField(term295397, term295397.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term295397, term295397.getClass(), "paintingChild", null);
        setField(term295397, term295397.getClass(), "popupMenu", null);
        setField(term295397, term295397.getClass(), "revalidateRunnableScheduled", null);
        setField(term295397, term295397.getClass(), "focusInputMap", null);
        setField(term295397, term295397.getClass(), "ancestorInputMap", null);
        setField(term295397, term295397.getClass(), "windowInputMap", null);
        setField(term295397, term295397.getClass(), "actionMap", null);
        setField(term295397, term295397.getClass(), "aaHint", null);
        setField(term295397, term295397.getClass(), "lcdRenderingHint", null);
        setField(term295397, term295397.getClass(), "component", null);
        setField(term295397, term295397.getClass(), "layoutMgr", null);
        setField(term295397, term295397.getClass(), "dispatcher", null);
        setField(term295397, term295397.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term295397, term295397.getClass(), "focusCycleRoot", false);
        setBooleanField(term295397, term295397.getClass(), "focusTraversalPolicyProvider", false);
        setField(term295397, term295397.getClass(), "printingThreads", null);
        setBooleanField(term295397, term295397.getClass(), "printing", false);
        setField(term295397, term295397.getClass(), "containerListener", null);
        setIntField(term295397, term295397.getClass(), "listeningChildren", 0);
        setIntField(term295397, term295397.getClass(), "listeningBoundsChildren", 0);
        setIntField(term295397, term295397.getClass(), "descendantsCount", 0);
        setField(term295397, term295397.getClass(), "preserveBackgroundColor", null);
        setIntField(term295397, term295397.getClass(), "numOfHWComponents", 0);
        setIntField(term295397, term295397.getClass(), "numOfLWComponents", 0);
        setField(term295397, term295397.getClass(), "modalComp", null);
        setField(term295397, term295397.getClass(), "modalAppContext", null);
        setIntField(term295397, term295397.getClass(), "containerSerializedDataVersion", 0);
        setField(term295397, term295397.getClass(), "peer", null);
        setField(term295397, term295397.getClass(), "parent", null);
        setField(term295397, term295397.getClass(), "appContext", null);
        setIntField(term295397, term295397.getClass(), "x", 0);
        setIntField(term295397, term295397.getClass(), "y", 0);
        setIntField(term295397, term295397.getClass(), "width", 0);
        setIntField(term295397, term295397.getClass(), "height", 0);
        setField(term295397, term295397.getClass(), "foreground", null);
        setField(term295397, term295397.getClass(), "background", null);
        setField(term295397, term295397.getClass(), "font", null);
        setField(term295397, term295397.getClass(), "peerFont", null);
        setField(term295397, term295397.getClass(), "cursor", null);
        setField(term295397, term295397.getClass(), "locale", null);
        setField(term295397, term295397.getClass(), "graphicsConfig", null);
        setField(term295397, term295397.getClass(), "bufferStrategy", null);
        setBooleanField(term295397, term295397.getClass(), "ignoreRepaint", false);
        setBooleanField(term295397, term295397.getClass(), "visible", false);
        setBooleanField(term295397, term295397.getClass(), "enabled", false);
        setBooleanField(term295397, term295397.getClass(), "valid", false);
        setField(term295397, term295397.getClass(), "dropTarget", null);
        setField(term295397, term295397.getClass(), "popups", null);
        setField(term295397, term295397.getClass(), "name", null);
        setBooleanField(term295397, term295397.getClass(), "nameExplicitlySet", false);
        setBooleanField(term295397, term295397.getClass(), "focusable", false);
        setIntField(term295397, term295397.getClass(), "isFocusTraversableOverridden", 0);
        setField(term295397, term295397.getClass(), "focusTraversalKeys", null);
        setBooleanField(term295397, term295397.getClass(), "focusTraversalKeysEnabled", false);
        setField(term295397, term295397.getClass(), "acc", null);
        setField(term295397, term295397.getClass(), "minSize", null);
        setBooleanField(term295397, term295397.getClass(), "minSizeSet", false);
        setField(term295397, term295397.getClass(), "prefSize", null);
        setBooleanField(term295397, term295397.getClass(), "prefSizeSet", false);
        setField(term295397, term295397.getClass(), "maxSize", null);
        setBooleanField(term295397, term295397.getClass(), "maxSizeSet", false);
        setField(term295397, term295397.getClass(), "componentOrientation", null);
        setBooleanField(term295397, term295397.getClass(), "newEventsOnly", false);
        setField(term295397, term295397.getClass(), "componentListener", null);
        setField(term295397, term295397.getClass(), "focusListener", null);
        setField(term295397, term295397.getClass(), "hierarchyListener", null);
        setField(term295397, term295397.getClass(), "hierarchyBoundsListener", null);
        setField(term295397, term295397.getClass(), "keyListener", null);
        setField(term295397, term295397.getClass(), "mouseListener", null);
        setField(term295397, term295397.getClass(), "mouseMotionListener", null);
        setField(term295397, term295397.getClass(), "mouseWheelListener", null);
        setField(term295397, term295397.getClass(), "inputMethodListener", null);
        setLongField(term295397, term295397.getClass(), "eventMask", 0L);
        setField(term295397, term295397.getClass(), "changeSupport", null);
        setField(term295397, term295397.getClass(), "objectLock", null);
        setBooleanField(term295397, term295397.getClass(), "isPacked", false);
        setIntField(term295397, term295397.getClass(), "boundsOp", 0);
        setField(term295397, term295397.getClass(), "compoundShape", null);
        setField(term295397, term295397.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term295397, term295397.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term295397, term295397.getClass(), "backgroundEraseDisabled", false);
        setField(term295397, term295397.getClass(), "eventCache", null);
        setBooleanField(term295397, term295397.getClass(), "coalescingEnabled", false);
        setBooleanField(term295397, term295397.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term295397, term295397.getClass(), "componentSerializedDataVersion", 0);
        setField(term295397, term295397.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term295397, args);
    }

};


