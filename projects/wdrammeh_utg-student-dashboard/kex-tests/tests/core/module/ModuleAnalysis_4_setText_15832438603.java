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
     Object term291437;

    public ModuleAnalysis_4_setText_15832438603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291437 = newInstance(Class.forName("core.module.ModuleAnalysis$4"));
        setField(term291437, term291437.getClass(), "this$0", null);
        setIntField(term291437, term291437.getClass(), "mnemonic", 0);
        setIntField(term291437, term291437.getClass(), "mnemonicIndex", 0);
        setField(term291437, term291437.getClass(), "text", null);
        setField(term291437, term291437.getClass(), "defaultIcon", null);
        setField(term291437, term291437.getClass(), "disabledIcon", null);
        setBooleanField(term291437, term291437.getClass(), "disabledIconSet", false);
        setIntField(term291437, term291437.getClass(), "verticalAlignment", 0);
        setIntField(term291437, term291437.getClass(), "horizontalAlignment", 0);
        setIntField(term291437, term291437.getClass(), "verticalTextPosition", 0);
        setIntField(term291437, term291437.getClass(), "horizontalTextPosition", 0);
        setIntField(term291437, term291437.getClass(), "iconTextGap", 0);
        setField(term291437, term291437.getClass(), "labelFor", null);
        setBooleanField(term291437, term291437.getClass(), "isAlignmentXSet", false);
        setFloatField(term291437, term291437.getClass(), "alignmentX", 0.0F);
        setBooleanField(term291437, term291437.getClass(), "isAlignmentYSet", false);
        setFloatField(term291437, term291437.getClass(), "alignmentY", 0.0F);
        setField(term291437, term291437.getClass(), "ui", null);
        setField(term291437, term291437.getClass(), "listenerList", null);
        setField(term291437, term291437.getClass(), "clientProperties", null);
        setField(term291437, term291437.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term291437, term291437.getClass(), "autoscrolls", false);
        setField(term291437, term291437.getClass(), "border", null);
        setIntField(term291437, term291437.getClass(), "flags", 0);
        setField(term291437, term291437.getClass(), "inputVerifier", null);
        setBooleanField(term291437, term291437.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term291437, term291437.getClass(), "paintingChild", null);
        setField(term291437, term291437.getClass(), "popupMenu", null);
        setField(term291437, term291437.getClass(), "revalidateRunnableScheduled", null);
        setField(term291437, term291437.getClass(), "focusInputMap", null);
        setField(term291437, term291437.getClass(), "ancestorInputMap", null);
        setField(term291437, term291437.getClass(), "windowInputMap", null);
        setField(term291437, term291437.getClass(), "actionMap", null);
        setField(term291437, term291437.getClass(), "aaHint", null);
        setField(term291437, term291437.getClass(), "lcdRenderingHint", null);
        setField(term291437, term291437.getClass(), "component", null);
        setField(term291437, term291437.getClass(), "layoutMgr", null);
        setField(term291437, term291437.getClass(), "dispatcher", null);
        setField(term291437, term291437.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term291437, term291437.getClass(), "focusCycleRoot", false);
        setBooleanField(term291437, term291437.getClass(), "focusTraversalPolicyProvider", false);
        setField(term291437, term291437.getClass(), "printingThreads", null);
        setBooleanField(term291437, term291437.getClass(), "printing", false);
        setField(term291437, term291437.getClass(), "containerListener", null);
        setIntField(term291437, term291437.getClass(), "listeningChildren", 0);
        setIntField(term291437, term291437.getClass(), "listeningBoundsChildren", 0);
        setIntField(term291437, term291437.getClass(), "descendantsCount", 0);
        setField(term291437, term291437.getClass(), "preserveBackgroundColor", null);
        setIntField(term291437, term291437.getClass(), "numOfHWComponents", 0);
        setIntField(term291437, term291437.getClass(), "numOfLWComponents", 0);
        setField(term291437, term291437.getClass(), "modalComp", null);
        setField(term291437, term291437.getClass(), "modalAppContext", null);
        setIntField(term291437, term291437.getClass(), "containerSerializedDataVersion", 0);
        setField(term291437, term291437.getClass(), "peer", null);
        setField(term291437, term291437.getClass(), "parent", null);
        setField(term291437, term291437.getClass(), "appContext", null);
        setIntField(term291437, term291437.getClass(), "x", 0);
        setIntField(term291437, term291437.getClass(), "y", 0);
        setIntField(term291437, term291437.getClass(), "width", 0);
        setIntField(term291437, term291437.getClass(), "height", 0);
        setField(term291437, term291437.getClass(), "foreground", null);
        setField(term291437, term291437.getClass(), "background", null);
        setField(term291437, term291437.getClass(), "font", null);
        setField(term291437, term291437.getClass(), "peerFont", null);
        setField(term291437, term291437.getClass(), "cursor", null);
        setField(term291437, term291437.getClass(), "locale", null);
        setField(term291437, term291437.getClass(), "graphicsConfig", null);
        setField(term291437, term291437.getClass(), "bufferStrategy", null);
        setBooleanField(term291437, term291437.getClass(), "ignoreRepaint", false);
        setBooleanField(term291437, term291437.getClass(), "visible", false);
        setBooleanField(term291437, term291437.getClass(), "enabled", false);
        setBooleanField(term291437, term291437.getClass(), "valid", false);
        setField(term291437, term291437.getClass(), "dropTarget", null);
        setField(term291437, term291437.getClass(), "popups", null);
        setField(term291437, term291437.getClass(), "name", null);
        setBooleanField(term291437, term291437.getClass(), "nameExplicitlySet", false);
        setBooleanField(term291437, term291437.getClass(), "focusable", false);
        setIntField(term291437, term291437.getClass(), "isFocusTraversableOverridden", 0);
        setField(term291437, term291437.getClass(), "focusTraversalKeys", null);
        setBooleanField(term291437, term291437.getClass(), "focusTraversalKeysEnabled", false);
        setField(term291437, term291437.getClass(), "acc", null);
        setField(term291437, term291437.getClass(), "minSize", null);
        setBooleanField(term291437, term291437.getClass(), "minSizeSet", false);
        setField(term291437, term291437.getClass(), "prefSize", null);
        setBooleanField(term291437, term291437.getClass(), "prefSizeSet", false);
        setField(term291437, term291437.getClass(), "maxSize", null);
        setBooleanField(term291437, term291437.getClass(), "maxSizeSet", false);
        setField(term291437, term291437.getClass(), "componentOrientation", null);
        setBooleanField(term291437, term291437.getClass(), "newEventsOnly", false);
        setField(term291437, term291437.getClass(), "componentListener", null);
        setField(term291437, term291437.getClass(), "focusListener", null);
        setField(term291437, term291437.getClass(), "hierarchyListener", null);
        setField(term291437, term291437.getClass(), "hierarchyBoundsListener", null);
        setField(term291437, term291437.getClass(), "keyListener", null);
        setField(term291437, term291437.getClass(), "mouseListener", null);
        setField(term291437, term291437.getClass(), "mouseMotionListener", null);
        setField(term291437, term291437.getClass(), "mouseWheelListener", null);
        setField(term291437, term291437.getClass(), "inputMethodListener", null);
        setLongField(term291437, term291437.getClass(), "eventMask", 0L);
        setField(term291437, term291437.getClass(), "changeSupport", null);
        setField(term291437, term291437.getClass(), "objectLock", null);
        setBooleanField(term291437, term291437.getClass(), "isPacked", false);
        setIntField(term291437, term291437.getClass(), "boundsOp", 0);
        setField(term291437, term291437.getClass(), "compoundShape", null);
        setField(term291437, term291437.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term291437, term291437.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term291437, term291437.getClass(), "backgroundEraseDisabled", false);
        setField(term291437, term291437.getClass(), "eventCache", null);
        setBooleanField(term291437, term291437.getClass(), "coalescingEnabled", false);
        setBooleanField(term291437, term291437.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term291437, term291437.getClass(), "componentSerializedDataVersion", 0);
        setField(term291437, term291437.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term291437, args);
    }

};


