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
     Object term37385;
     Object term37446;

    public ModuleAnalysis_GlassPrompt_join_16661094487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37385 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term37385, term37385.getClass(), "substancePanel", null);
        setIntField(term37385, term37385.getClass(), "defaultCloseOperation", 0);
        setField(term37385, term37385.getClass(), "rootPane", null);
        setBooleanField(term37385, term37385.getClass(), "rootPaneCheckingEnabled", false);
        setField(term37385, term37385.getClass(), "transferHandler", null);
        setField(term37385, term37385.getClass(), "accessibleContext", null);
        setBooleanField(term37385, term37385.getClass(), "resizable", false);
        setBooleanField(term37385, term37385.getClass(), "undecorated", false);
        setBooleanField(term37385, term37385.getClass(), "initialized", false);
        setBooleanField(term37385, term37385.getClass(), "modal", false);
        setField(term37385, term37385.getClass(), "modalityType", null);
        setField(term37385, term37385.getClass(), "blockedWindows", null);
        setField(term37385, term37385.getClass(), "title", null);
        setField(term37385, term37385.getClass(), "modalFilter", null);
        setField(term37385, term37385.getClass(), "secondaryLoop", null);
        setBooleanField(term37385, term37385.getClass(), "isInHide", false);
        setBooleanField(term37385, term37385.getClass(), "isInDispose", false);
        setField(term37385, term37385.getClass(), "warningString", null);
        setField(term37385, term37385.getClass(), "icons", null);
        setField(term37385, term37385.getClass(), "temporaryLostComponent", null);
        setBooleanField(term37385, term37385.getClass(), "syncLWRequests", false);
        setBooleanField(term37385, term37385.getClass(), "beforeFirstShow", false);
        setBooleanField(term37385, term37385.getClass(), "disposing", false);
        setField(term37385, term37385.getClass(), "disposerRecord", null);
        setIntField(term37385, term37385.getClass(), "state", 0);
        setBooleanField(term37385, term37385.getClass(), "alwaysOnTop", false);
        setField(term37385, term37385.getClass(), "ownedWindowList", null);
        setField(term37385, term37385.getClass(), "weakThis", null);
        setBooleanField(term37385, term37385.getClass(), "showWithParent", false);
        setField(term37385, term37385.getClass(), "modalBlocker", null);
        setField(term37385, term37385.getClass(), "modalExclusionType", null);
        setField(term37385, term37385.getClass(), "windowListener", null);
        setField(term37385, term37385.getClass(), "windowStateListener", null);
        setField(term37385, term37385.getClass(), "windowFocusListener", null);
        setField(term37385, term37385.getClass(), "inputContext", null);
        setField(term37385, term37385.getClass(), "inputContextLock", null);
        setField(term37385, term37385.getClass(), "focusMgr", null);
        setBooleanField(term37385, term37385.getClass(), "focusableWindowState", false);
        setBooleanField(term37385, term37385.getClass(), "autoRequestFocus", false);
        setBooleanField(term37385, term37385.getClass(), "isInShow", false);
        setFloatField(term37385, term37385.getClass(), "opacity", 0.0F);
        setField(term37385, term37385.getClass(), "shape", null);
        setBooleanField(term37385, term37385.getClass(), "isTrayIconWindow", false);
        setIntField(term37385, term37385.getClass(), "securityWarningWidth", 0);
        setIntField(term37385, term37385.getClass(), "securityWarningHeight", 0);
        setDoubleField(term37385, term37385.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term37385, term37385.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term37385, term37385.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term37385, term37385.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term37385, term37385.getClass(), "anchor", null);
        setField(term37385, term37385.getClass(), "type", null);
        setIntField(term37385, term37385.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term37385, term37385.getClass(), "locationByPlatform", false);
        setField(term37385, term37385.getClass(), "component", null);
        setField(term37385, term37385.getClass(), "layoutMgr", null);
        setField(term37385, term37385.getClass(), "dispatcher", null);
        setField(term37385, term37385.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term37385, term37385.getClass(), "focusCycleRoot", false);
        setBooleanField(term37385, term37385.getClass(), "focusTraversalPolicyProvider", false);
        setField(term37385, term37385.getClass(), "printingThreads", null);
        setBooleanField(term37385, term37385.getClass(), "printing", false);
        setField(term37385, term37385.getClass(), "containerListener", null);
        setIntField(term37385, term37385.getClass(), "listeningChildren", 0);
        setIntField(term37385, term37385.getClass(), "listeningBoundsChildren", 0);
        setIntField(term37385, term37385.getClass(), "descendantsCount", 0);
        setField(term37385, term37385.getClass(), "preserveBackgroundColor", null);
        setIntField(term37385, term37385.getClass(), "numOfHWComponents", 0);
        setIntField(term37385, term37385.getClass(), "numOfLWComponents", 0);
        setField(term37385, term37385.getClass(), "modalComp", null);
        setField(term37385, term37385.getClass(), "modalAppContext", null);
        setIntField(term37385, term37385.getClass(), "containerSerializedDataVersion", 0);
        setField(term37385, term37385.getClass(), "peer", null);
        setField(term37385, term37385.getClass(), "parent", null);
        setField(term37385, term37385.getClass(), "appContext", null);
        setIntField(term37385, term37385.getClass(), "x", 0);
        setIntField(term37385, term37385.getClass(), "y", 0);
        setIntField(term37385, term37385.getClass(), "width", 0);
        setIntField(term37385, term37385.getClass(), "height", 0);
        setField(term37385, term37385.getClass(), "foreground", null);
        setField(term37385, term37385.getClass(), "background", null);
        setField(term37385, term37385.getClass(), "font", null);
        setField(term37385, term37385.getClass(), "peerFont", null);
        setField(term37385, term37385.getClass(), "cursor", null);
        setField(term37385, term37385.getClass(), "locale", null);
        setField(term37385, term37385.getClass(), "graphicsConfig", null);
        setField(term37385, term37385.getClass(), "bufferStrategy", null);
        setBooleanField(term37385, term37385.getClass(), "ignoreRepaint", false);
        setBooleanField(term37385, term37385.getClass(), "visible", false);
        setBooleanField(term37385, term37385.getClass(), "enabled", false);
        setBooleanField(term37385, term37385.getClass(), "valid", false);
        setField(term37385, term37385.getClass(), "dropTarget", null);
        setField(term37385, term37385.getClass(), "popups", null);
        setField(term37385, term37385.getClass(), "name", null);
        setBooleanField(term37385, term37385.getClass(), "nameExplicitlySet", false);
        setBooleanField(term37385, term37385.getClass(), "focusable", false);
        setIntField(term37385, term37385.getClass(), "isFocusTraversableOverridden", 0);
        setField(term37385, term37385.getClass(), "focusTraversalKeys", null);
        setBooleanField(term37385, term37385.getClass(), "focusTraversalKeysEnabled", false);
        setField(term37385, term37385.getClass(), "acc", null);
        setField(term37385, term37385.getClass(), "minSize", null);
        setBooleanField(term37385, term37385.getClass(), "minSizeSet", false);
        setField(term37385, term37385.getClass(), "prefSize", null);
        setBooleanField(term37385, term37385.getClass(), "prefSizeSet", false);
        setField(term37385, term37385.getClass(), "maxSize", null);
        setBooleanField(term37385, term37385.getClass(), "maxSizeSet", false);
        setField(term37385, term37385.getClass(), "componentOrientation", null);
        setBooleanField(term37385, term37385.getClass(), "newEventsOnly", false);
        setField(term37385, term37385.getClass(), "componentListener", null);
        setField(term37385, term37385.getClass(), "focusListener", null);
        setField(term37385, term37385.getClass(), "hierarchyListener", null);
        setField(term37385, term37385.getClass(), "hierarchyBoundsListener", null);
        setField(term37385, term37385.getClass(), "keyListener", null);
        setField(term37385, term37385.getClass(), "mouseListener", null);
        setField(term37385, term37385.getClass(), "mouseMotionListener", null);
        setField(term37385, term37385.getClass(), "mouseWheelListener", null);
        setField(term37385, term37385.getClass(), "inputMethodListener", null);
        setLongField(term37385, term37385.getClass(), "eventMask", 0L);
        setField(term37385, term37385.getClass(), "changeSupport", null);
        setField(term37385, term37385.getClass(), "objectLock", null);
        setBooleanField(term37385, term37385.getClass(), "isPacked", false);
        setIntField(term37385, term37385.getClass(), "boundsOp", 0);
        setField(term37385, term37385.getClass(), "compoundShape", null);
        setField(term37385, term37385.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term37385, term37385.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term37385, term37385.getClass(), "backgroundEraseDisabled", false);
        setField(term37385, term37385.getClass(), "eventCache", null);
        setBooleanField(term37385, term37385.getClass(), "coalescingEnabled", false);
        setBooleanField(term37385, term37385.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term37385, term37385.getClass(), "componentSerializedDataVersion", 0);
        term37446 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term37446;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "join", argTypes, term37385, args);
    }

};


