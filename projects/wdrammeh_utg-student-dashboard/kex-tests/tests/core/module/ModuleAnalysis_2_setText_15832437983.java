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
     Object term84737;

    public ModuleAnalysis_2_setText_15832437983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84737 = newInstance(Class.forName("core.module.ModuleAnalysis$2"));
        setField(term84737, term84737.getClass(), "this$0", null);
        setIntField(term84737, term84737.getClass(), "mnemonic", 0);
        setIntField(term84737, term84737.getClass(), "mnemonicIndex", 0);
        setField(term84737, term84737.getClass(), "text", null);
        setField(term84737, term84737.getClass(), "defaultIcon", null);
        setField(term84737, term84737.getClass(), "disabledIcon", null);
        setBooleanField(term84737, term84737.getClass(), "disabledIconSet", false);
        setIntField(term84737, term84737.getClass(), "verticalAlignment", 0);
        setIntField(term84737, term84737.getClass(), "horizontalAlignment", 0);
        setIntField(term84737, term84737.getClass(), "verticalTextPosition", 0);
        setIntField(term84737, term84737.getClass(), "horizontalTextPosition", 0);
        setIntField(term84737, term84737.getClass(), "iconTextGap", 0);
        setField(term84737, term84737.getClass(), "labelFor", null);
        setBooleanField(term84737, term84737.getClass(), "isAlignmentXSet", false);
        setFloatField(term84737, term84737.getClass(), "alignmentX", 0.0F);
        setBooleanField(term84737, term84737.getClass(), "isAlignmentYSet", false);
        setFloatField(term84737, term84737.getClass(), "alignmentY", 0.0F);
        setField(term84737, term84737.getClass(), "ui", null);
        setField(term84737, term84737.getClass(), "listenerList", null);
        setField(term84737, term84737.getClass(), "clientProperties", null);
        setField(term84737, term84737.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term84737, term84737.getClass(), "autoscrolls", false);
        setField(term84737, term84737.getClass(), "border", null);
        setIntField(term84737, term84737.getClass(), "flags", 0);
        setField(term84737, term84737.getClass(), "inputVerifier", null);
        setBooleanField(term84737, term84737.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term84737, term84737.getClass(), "paintingChild", null);
        setField(term84737, term84737.getClass(), "popupMenu", null);
        setField(term84737, term84737.getClass(), "revalidateRunnableScheduled", null);
        setField(term84737, term84737.getClass(), "focusInputMap", null);
        setField(term84737, term84737.getClass(), "ancestorInputMap", null);
        setField(term84737, term84737.getClass(), "windowInputMap", null);
        setField(term84737, term84737.getClass(), "actionMap", null);
        setField(term84737, term84737.getClass(), "aaHint", null);
        setField(term84737, term84737.getClass(), "lcdRenderingHint", null);
        setField(term84737, term84737.getClass(), "component", null);
        setField(term84737, term84737.getClass(), "layoutMgr", null);
        setField(term84737, term84737.getClass(), "dispatcher", null);
        setField(term84737, term84737.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term84737, term84737.getClass(), "focusCycleRoot", false);
        setBooleanField(term84737, term84737.getClass(), "focusTraversalPolicyProvider", false);
        setField(term84737, term84737.getClass(), "printingThreads", null);
        setBooleanField(term84737, term84737.getClass(), "printing", false);
        setField(term84737, term84737.getClass(), "containerListener", null);
        setIntField(term84737, term84737.getClass(), "listeningChildren", 0);
        setIntField(term84737, term84737.getClass(), "listeningBoundsChildren", 0);
        setIntField(term84737, term84737.getClass(), "descendantsCount", 0);
        setField(term84737, term84737.getClass(), "preserveBackgroundColor", null);
        setIntField(term84737, term84737.getClass(), "numOfHWComponents", 0);
        setIntField(term84737, term84737.getClass(), "numOfLWComponents", 0);
        setField(term84737, term84737.getClass(), "modalComp", null);
        setField(term84737, term84737.getClass(), "modalAppContext", null);
        setIntField(term84737, term84737.getClass(), "containerSerializedDataVersion", 0);
        setField(term84737, term84737.getClass(), "peer", null);
        setField(term84737, term84737.getClass(), "parent", null);
        setField(term84737, term84737.getClass(), "appContext", null);
        setIntField(term84737, term84737.getClass(), "x", 0);
        setIntField(term84737, term84737.getClass(), "y", 0);
        setIntField(term84737, term84737.getClass(), "width", 0);
        setIntField(term84737, term84737.getClass(), "height", 0);
        setField(term84737, term84737.getClass(), "foreground", null);
        setField(term84737, term84737.getClass(), "background", null);
        setField(term84737, term84737.getClass(), "font", null);
        setField(term84737, term84737.getClass(), "peerFont", null);
        setField(term84737, term84737.getClass(), "cursor", null);
        setField(term84737, term84737.getClass(), "locale", null);
        setField(term84737, term84737.getClass(), "graphicsConfig", null);
        setField(term84737, term84737.getClass(), "bufferStrategy", null);
        setBooleanField(term84737, term84737.getClass(), "ignoreRepaint", false);
        setBooleanField(term84737, term84737.getClass(), "visible", false);
        setBooleanField(term84737, term84737.getClass(), "enabled", false);
        setBooleanField(term84737, term84737.getClass(), "valid", false);
        setField(term84737, term84737.getClass(), "dropTarget", null);
        setField(term84737, term84737.getClass(), "popups", null);
        setField(term84737, term84737.getClass(), "name", null);
        setBooleanField(term84737, term84737.getClass(), "nameExplicitlySet", false);
        setBooleanField(term84737, term84737.getClass(), "focusable", false);
        setIntField(term84737, term84737.getClass(), "isFocusTraversableOverridden", 0);
        setField(term84737, term84737.getClass(), "focusTraversalKeys", null);
        setBooleanField(term84737, term84737.getClass(), "focusTraversalKeysEnabled", false);
        setField(term84737, term84737.getClass(), "acc", null);
        setField(term84737, term84737.getClass(), "minSize", null);
        setBooleanField(term84737, term84737.getClass(), "minSizeSet", false);
        setField(term84737, term84737.getClass(), "prefSize", null);
        setBooleanField(term84737, term84737.getClass(), "prefSizeSet", false);
        setField(term84737, term84737.getClass(), "maxSize", null);
        setBooleanField(term84737, term84737.getClass(), "maxSizeSet", false);
        setField(term84737, term84737.getClass(), "componentOrientation", null);
        setBooleanField(term84737, term84737.getClass(), "newEventsOnly", false);
        setField(term84737, term84737.getClass(), "componentListener", null);
        setField(term84737, term84737.getClass(), "focusListener", null);
        setField(term84737, term84737.getClass(), "hierarchyListener", null);
        setField(term84737, term84737.getClass(), "hierarchyBoundsListener", null);
        setField(term84737, term84737.getClass(), "keyListener", null);
        setField(term84737, term84737.getClass(), "mouseListener", null);
        setField(term84737, term84737.getClass(), "mouseMotionListener", null);
        setField(term84737, term84737.getClass(), "mouseWheelListener", null);
        setField(term84737, term84737.getClass(), "inputMethodListener", null);
        setLongField(term84737, term84737.getClass(), "eventMask", 0L);
        setField(term84737, term84737.getClass(), "changeSupport", null);
        setField(term84737, term84737.getClass(), "objectLock", null);
        setBooleanField(term84737, term84737.getClass(), "isPacked", false);
        setIntField(term84737, term84737.getClass(), "boundsOp", 0);
        setField(term84737, term84737.getClass(), "compoundShape", null);
        setField(term84737, term84737.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term84737, term84737.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term84737, term84737.getClass(), "backgroundEraseDisabled", false);
        setField(term84737, term84737.getClass(), "eventCache", null);
        setBooleanField(term84737, term84737.getClass(), "coalescingEnabled", false);
        setBooleanField(term84737, term84737.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term84737, term84737.getClass(), "componentSerializedDataVersion", 0);
        setField(term84737, term84737.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term84737, args);
    }

};


