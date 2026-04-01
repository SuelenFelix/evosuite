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
import java.lang.Integer;

public class ModuleAnalysis_GlassPrompt_join_16661094487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82458;
     Object term82519;

    public ModuleAnalysis_GlassPrompt_join_16661094487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82458 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term82458, term82458.getClass(), "substancePanel", null);
        setIntField(term82458, term82458.getClass(), "defaultCloseOperation", 0);
        setField(term82458, term82458.getClass(), "rootPane", null);
        setBooleanField(term82458, term82458.getClass(), "rootPaneCheckingEnabled", false);
        setField(term82458, term82458.getClass(), "transferHandler", null);
        setField(term82458, term82458.getClass(), "accessibleContext", null);
        setBooleanField(term82458, term82458.getClass(), "resizable", false);
        setBooleanField(term82458, term82458.getClass(), "undecorated", false);
        setBooleanField(term82458, term82458.getClass(), "initialized", false);
        setBooleanField(term82458, term82458.getClass(), "modal", false);
        setField(term82458, term82458.getClass(), "modalityType", null);
        setField(term82458, term82458.getClass(), "blockedWindows", null);
        setField(term82458, term82458.getClass(), "title", null);
        setField(term82458, term82458.getClass(), "modalFilter", null);
        setField(term82458, term82458.getClass(), "secondaryLoop", null);
        setBooleanField(term82458, term82458.getClass(), "isInHide", false);
        setBooleanField(term82458, term82458.getClass(), "isInDispose", false);
        setField(term82458, term82458.getClass(), "warningString", null);
        setField(term82458, term82458.getClass(), "icons", null);
        setField(term82458, term82458.getClass(), "temporaryLostComponent", null);
        setBooleanField(term82458, term82458.getClass(), "syncLWRequests", false);
        setBooleanField(term82458, term82458.getClass(), "beforeFirstShow", false);
        setBooleanField(term82458, term82458.getClass(), "disposing", false);
        setField(term82458, term82458.getClass(), "disposerRecord", null);
        setIntField(term82458, term82458.getClass(), "state", 0);
        setBooleanField(term82458, term82458.getClass(), "alwaysOnTop", false);
        setField(term82458, term82458.getClass(), "ownedWindowList", null);
        setField(term82458, term82458.getClass(), "weakThis", null);
        setBooleanField(term82458, term82458.getClass(), "showWithParent", false);
        setField(term82458, term82458.getClass(), "modalBlocker", null);
        setField(term82458, term82458.getClass(), "modalExclusionType", null);
        setField(term82458, term82458.getClass(), "windowListener", null);
        setField(term82458, term82458.getClass(), "windowStateListener", null);
        setField(term82458, term82458.getClass(), "windowFocusListener", null);
        setField(term82458, term82458.getClass(), "inputContext", null);
        setField(term82458, term82458.getClass(), "inputContextLock", null);
        setField(term82458, term82458.getClass(), "focusMgr", null);
        setBooleanField(term82458, term82458.getClass(), "focusableWindowState", false);
        setBooleanField(term82458, term82458.getClass(), "autoRequestFocus", false);
        setBooleanField(term82458, term82458.getClass(), "isInShow", false);
        setFloatField(term82458, term82458.getClass(), "opacity", 0.0F);
        setField(term82458, term82458.getClass(), "shape", null);
        setBooleanField(term82458, term82458.getClass(), "isTrayIconWindow", false);
        setIntField(term82458, term82458.getClass(), "securityWarningWidth", 0);
        setIntField(term82458, term82458.getClass(), "securityWarningHeight", 0);
        setDoubleField(term82458, term82458.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term82458, term82458.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term82458, term82458.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term82458, term82458.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term82458, term82458.getClass(), "anchor", null);
        setField(term82458, term82458.getClass(), "type", null);
        setIntField(term82458, term82458.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term82458, term82458.getClass(), "locationByPlatform", false);
        setField(term82458, term82458.getClass(), "component", null);
        setField(term82458, term82458.getClass(), "layoutMgr", null);
        setField(term82458, term82458.getClass(), "dispatcher", null);
        setField(term82458, term82458.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term82458, term82458.getClass(), "focusCycleRoot", false);
        setBooleanField(term82458, term82458.getClass(), "focusTraversalPolicyProvider", false);
        setField(term82458, term82458.getClass(), "printingThreads", null);
        setBooleanField(term82458, term82458.getClass(), "printing", false);
        setField(term82458, term82458.getClass(), "containerListener", null);
        setIntField(term82458, term82458.getClass(), "listeningChildren", 0);
        setIntField(term82458, term82458.getClass(), "listeningBoundsChildren", 0);
        setIntField(term82458, term82458.getClass(), "descendantsCount", 0);
        setField(term82458, term82458.getClass(), "preserveBackgroundColor", null);
        setIntField(term82458, term82458.getClass(), "numOfHWComponents", 0);
        setIntField(term82458, term82458.getClass(), "numOfLWComponents", 0);
        setField(term82458, term82458.getClass(), "modalComp", null);
        setField(term82458, term82458.getClass(), "modalAppContext", null);
        setIntField(term82458, term82458.getClass(), "containerSerializedDataVersion", 0);
        setField(term82458, term82458.getClass(), "peer", null);
        setField(term82458, term82458.getClass(), "parent", null);
        setField(term82458, term82458.getClass(), "appContext", null);
        setIntField(term82458, term82458.getClass(), "x", 0);
        setIntField(term82458, term82458.getClass(), "y", 0);
        setIntField(term82458, term82458.getClass(), "width", 0);
        setIntField(term82458, term82458.getClass(), "height", 0);
        setField(term82458, term82458.getClass(), "foreground", null);
        setField(term82458, term82458.getClass(), "background", null);
        setField(term82458, term82458.getClass(), "font", null);
        setField(term82458, term82458.getClass(), "peerFont", null);
        setField(term82458, term82458.getClass(), "cursor", null);
        setField(term82458, term82458.getClass(), "locale", null);
        setField(term82458, term82458.getClass(), "graphicsConfig", null);
        setField(term82458, term82458.getClass(), "bufferStrategy", null);
        setBooleanField(term82458, term82458.getClass(), "ignoreRepaint", false);
        setBooleanField(term82458, term82458.getClass(), "visible", false);
        setBooleanField(term82458, term82458.getClass(), "enabled", false);
        setBooleanField(term82458, term82458.getClass(), "valid", false);
        setField(term82458, term82458.getClass(), "dropTarget", null);
        setField(term82458, term82458.getClass(), "popups", null);
        setField(term82458, term82458.getClass(), "name", null);
        setBooleanField(term82458, term82458.getClass(), "nameExplicitlySet", false);
        setBooleanField(term82458, term82458.getClass(), "focusable", false);
        setIntField(term82458, term82458.getClass(), "isFocusTraversableOverridden", 0);
        setField(term82458, term82458.getClass(), "focusTraversalKeys", null);
        setBooleanField(term82458, term82458.getClass(), "focusTraversalKeysEnabled", false);
        setField(term82458, term82458.getClass(), "acc", null);
        setField(term82458, term82458.getClass(), "minSize", null);
        setBooleanField(term82458, term82458.getClass(), "minSizeSet", false);
        setField(term82458, term82458.getClass(), "prefSize", null);
        setBooleanField(term82458, term82458.getClass(), "prefSizeSet", false);
        setField(term82458, term82458.getClass(), "maxSize", null);
        setBooleanField(term82458, term82458.getClass(), "maxSizeSet", false);
        setField(term82458, term82458.getClass(), "componentOrientation", null);
        setBooleanField(term82458, term82458.getClass(), "newEventsOnly", false);
        setField(term82458, term82458.getClass(), "componentListener", null);
        setField(term82458, term82458.getClass(), "focusListener", null);
        setField(term82458, term82458.getClass(), "hierarchyListener", null);
        setField(term82458, term82458.getClass(), "hierarchyBoundsListener", null);
        setField(term82458, term82458.getClass(), "keyListener", null);
        setField(term82458, term82458.getClass(), "mouseListener", null);
        setField(term82458, term82458.getClass(), "mouseMotionListener", null);
        setField(term82458, term82458.getClass(), "mouseWheelListener", null);
        setField(term82458, term82458.getClass(), "inputMethodListener", null);
        setLongField(term82458, term82458.getClass(), "eventMask", 0L);
        setField(term82458, term82458.getClass(), "changeSupport", null);
        setField(term82458, term82458.getClass(), "objectLock", null);
        setBooleanField(term82458, term82458.getClass(), "isPacked", false);
        setIntField(term82458, term82458.getClass(), "boundsOp", 0);
        setField(term82458, term82458.getClass(), "compoundShape", null);
        setField(term82458, term82458.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term82458, term82458.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term82458, term82458.getClass(), "backgroundEraseDisabled", false);
        setField(term82458, term82458.getClass(), "eventCache", null);
        setBooleanField(term82458, term82458.getClass(), "coalescingEnabled", false);
        setBooleanField(term82458, term82458.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term82458, term82458.getClass(), "componentSerializedDataVersion", 0);
        term82519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term82519;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "join", argTypes, term82458, args);
    }

};


