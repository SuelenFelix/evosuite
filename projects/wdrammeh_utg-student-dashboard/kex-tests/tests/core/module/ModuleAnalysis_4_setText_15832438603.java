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

public class ModuleAnalysis_4_setText_15832438603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80763;

    public ModuleAnalysis_4_setText_15832438603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80763 = newInstance(Class.forName("core.module.ModuleAnalysis$4"));
        setField(term80763, term80763.getClass(), "this$0", null);
        setIntField(term80763, term80763.getClass(), "mnemonic", 0);
        setIntField(term80763, term80763.getClass(), "mnemonicIndex", 0);
        setField(term80763, term80763.getClass(), "text", null);
        setField(term80763, term80763.getClass(), "defaultIcon", null);
        setField(term80763, term80763.getClass(), "disabledIcon", null);
        setBooleanField(term80763, term80763.getClass(), "disabledIconSet", false);
        setIntField(term80763, term80763.getClass(), "verticalAlignment", 0);
        setIntField(term80763, term80763.getClass(), "horizontalAlignment", 0);
        setIntField(term80763, term80763.getClass(), "verticalTextPosition", 0);
        setIntField(term80763, term80763.getClass(), "horizontalTextPosition", 0);
        setIntField(term80763, term80763.getClass(), "iconTextGap", 0);
        setField(term80763, term80763.getClass(), "labelFor", null);
        setBooleanField(term80763, term80763.getClass(), "isAlignmentXSet", false);
        setFloatField(term80763, term80763.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80763, term80763.getClass(), "isAlignmentYSet", false);
        setFloatField(term80763, term80763.getClass(), "alignmentY", 0.0F);
        setField(term80763, term80763.getClass(), "ui", null);
        setField(term80763, term80763.getClass(), "listenerList", null);
        setField(term80763, term80763.getClass(), "clientProperties", null);
        setField(term80763, term80763.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80763, term80763.getClass(), "autoscrolls", false);
        setField(term80763, term80763.getClass(), "border", null);
        setIntField(term80763, term80763.getClass(), "flags", 0);
        setField(term80763, term80763.getClass(), "inputVerifier", null);
        setBooleanField(term80763, term80763.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80763, term80763.getClass(), "paintingChild", null);
        setField(term80763, term80763.getClass(), "popupMenu", null);
        setField(term80763, term80763.getClass(), "revalidateRunnableScheduled", null);
        setField(term80763, term80763.getClass(), "focusInputMap", null);
        setField(term80763, term80763.getClass(), "ancestorInputMap", null);
        setField(term80763, term80763.getClass(), "windowInputMap", null);
        setField(term80763, term80763.getClass(), "actionMap", null);
        setField(term80763, term80763.getClass(), "aaHint", null);
        setField(term80763, term80763.getClass(), "lcdRenderingHint", null);
        setField(term80763, term80763.getClass(), "component", null);
        setField(term80763, term80763.getClass(), "layoutMgr", null);
        setField(term80763, term80763.getClass(), "dispatcher", null);
        setField(term80763, term80763.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80763, term80763.getClass(), "focusCycleRoot", false);
        setBooleanField(term80763, term80763.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80763, term80763.getClass(), "printingThreads", null);
        setBooleanField(term80763, term80763.getClass(), "printing", false);
        setField(term80763, term80763.getClass(), "containerListener", null);
        setIntField(term80763, term80763.getClass(), "listeningChildren", 0);
        setIntField(term80763, term80763.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80763, term80763.getClass(), "descendantsCount", 0);
        setField(term80763, term80763.getClass(), "preserveBackgroundColor", null);
        setIntField(term80763, term80763.getClass(), "numOfHWComponents", 0);
        setIntField(term80763, term80763.getClass(), "numOfLWComponents", 0);
        setField(term80763, term80763.getClass(), "modalComp", null);
        setField(term80763, term80763.getClass(), "modalAppContext", null);
        setIntField(term80763, term80763.getClass(), "containerSerializedDataVersion", 0);
        setField(term80763, term80763.getClass(), "peer", null);
        setField(term80763, term80763.getClass(), "parent", null);
        setField(term80763, term80763.getClass(), "appContext", null);
        setIntField(term80763, term80763.getClass(), "x", 0);
        setIntField(term80763, term80763.getClass(), "y", 0);
        setIntField(term80763, term80763.getClass(), "width", 0);
        setIntField(term80763, term80763.getClass(), "height", 0);
        setField(term80763, term80763.getClass(), "foreground", null);
        setField(term80763, term80763.getClass(), "background", null);
        setField(term80763, term80763.getClass(), "font", null);
        setField(term80763, term80763.getClass(), "peerFont", null);
        setField(term80763, term80763.getClass(), "cursor", null);
        setField(term80763, term80763.getClass(), "locale", null);
        setField(term80763, term80763.getClass(), "graphicsConfig", null);
        setField(term80763, term80763.getClass(), "bufferStrategy", null);
        setBooleanField(term80763, term80763.getClass(), "ignoreRepaint", false);
        setBooleanField(term80763, term80763.getClass(), "visible", false);
        setBooleanField(term80763, term80763.getClass(), "enabled", false);
        setBooleanField(term80763, term80763.getClass(), "valid", false);
        setField(term80763, term80763.getClass(), "dropTarget", null);
        setField(term80763, term80763.getClass(), "popups", null);
        setField(term80763, term80763.getClass(), "name", null);
        setBooleanField(term80763, term80763.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80763, term80763.getClass(), "focusable", false);
        setIntField(term80763, term80763.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80763, term80763.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80763, term80763.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80763, term80763.getClass(), "acc", null);
        setField(term80763, term80763.getClass(), "minSize", null);
        setBooleanField(term80763, term80763.getClass(), "minSizeSet", false);
        setField(term80763, term80763.getClass(), "prefSize", null);
        setBooleanField(term80763, term80763.getClass(), "prefSizeSet", false);
        setField(term80763, term80763.getClass(), "maxSize", null);
        setBooleanField(term80763, term80763.getClass(), "maxSizeSet", false);
        setField(term80763, term80763.getClass(), "componentOrientation", null);
        setBooleanField(term80763, term80763.getClass(), "newEventsOnly", false);
        setField(term80763, term80763.getClass(), "componentListener", null);
        setField(term80763, term80763.getClass(), "focusListener", null);
        setField(term80763, term80763.getClass(), "hierarchyListener", null);
        setField(term80763, term80763.getClass(), "hierarchyBoundsListener", null);
        setField(term80763, term80763.getClass(), "keyListener", null);
        setField(term80763, term80763.getClass(), "mouseListener", null);
        setField(term80763, term80763.getClass(), "mouseMotionListener", null);
        setField(term80763, term80763.getClass(), "mouseWheelListener", null);
        setField(term80763, term80763.getClass(), "inputMethodListener", null);
        setLongField(term80763, term80763.getClass(), "eventMask", 0L);
        setField(term80763, term80763.getClass(), "changeSupport", null);
        setField(term80763, term80763.getClass(), "objectLock", null);
        setBooleanField(term80763, term80763.getClass(), "isPacked", false);
        setIntField(term80763, term80763.getClass(), "boundsOp", 0);
        setField(term80763, term80763.getClass(), "compoundShape", null);
        setField(term80763, term80763.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80763, term80763.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80763, term80763.getClass(), "backgroundEraseDisabled", false);
        setField(term80763, term80763.getClass(), "eventCache", null);
        setBooleanField(term80763, term80763.getClass(), "coalescingEnabled", false);
        setBooleanField(term80763, term80763.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80763, term80763.getClass(), "componentSerializedDataVersion", 0);
        setField(term80763, term80763.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term80763, args);
    }

};


