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

public class ModuleAnalysis_GlassPrompt_join_20892015059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83407;
     Object term83468;

    public ModuleAnalysis_GlassPrompt_join_20892015059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83407 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term83407, term83407.getClass(), "substancePanel", null);
        setIntField(term83407, term83407.getClass(), "defaultCloseOperation", 0);
        setField(term83407, term83407.getClass(), "rootPane", null);
        setBooleanField(term83407, term83407.getClass(), "rootPaneCheckingEnabled", false);
        setField(term83407, term83407.getClass(), "transferHandler", null);
        setField(term83407, term83407.getClass(), "accessibleContext", null);
        setBooleanField(term83407, term83407.getClass(), "resizable", false);
        setBooleanField(term83407, term83407.getClass(), "undecorated", false);
        setBooleanField(term83407, term83407.getClass(), "initialized", false);
        setBooleanField(term83407, term83407.getClass(), "modal", false);
        setField(term83407, term83407.getClass(), "modalityType", null);
        setField(term83407, term83407.getClass(), "blockedWindows", null);
        setField(term83407, term83407.getClass(), "title", null);
        setField(term83407, term83407.getClass(), "modalFilter", null);
        setField(term83407, term83407.getClass(), "secondaryLoop", null);
        setBooleanField(term83407, term83407.getClass(), "isInHide", false);
        setBooleanField(term83407, term83407.getClass(), "isInDispose", false);
        setField(term83407, term83407.getClass(), "warningString", null);
        setField(term83407, term83407.getClass(), "icons", null);
        setField(term83407, term83407.getClass(), "temporaryLostComponent", null);
        setBooleanField(term83407, term83407.getClass(), "syncLWRequests", false);
        setBooleanField(term83407, term83407.getClass(), "beforeFirstShow", false);
        setBooleanField(term83407, term83407.getClass(), "disposing", false);
        setField(term83407, term83407.getClass(), "disposerRecord", null);
        setIntField(term83407, term83407.getClass(), "state", 0);
        setBooleanField(term83407, term83407.getClass(), "alwaysOnTop", false);
        setField(term83407, term83407.getClass(), "ownedWindowList", null);
        setField(term83407, term83407.getClass(), "weakThis", null);
        setBooleanField(term83407, term83407.getClass(), "showWithParent", false);
        setField(term83407, term83407.getClass(), "modalBlocker", null);
        setField(term83407, term83407.getClass(), "modalExclusionType", null);
        setField(term83407, term83407.getClass(), "windowListener", null);
        setField(term83407, term83407.getClass(), "windowStateListener", null);
        setField(term83407, term83407.getClass(), "windowFocusListener", null);
        setField(term83407, term83407.getClass(), "inputContext", null);
        setField(term83407, term83407.getClass(), "inputContextLock", null);
        setField(term83407, term83407.getClass(), "focusMgr", null);
        setBooleanField(term83407, term83407.getClass(), "focusableWindowState", false);
        setBooleanField(term83407, term83407.getClass(), "autoRequestFocus", false);
        setBooleanField(term83407, term83407.getClass(), "isInShow", false);
        setFloatField(term83407, term83407.getClass(), "opacity", 0.0F);
        setField(term83407, term83407.getClass(), "shape", null);
        setBooleanField(term83407, term83407.getClass(), "isTrayIconWindow", false);
        setIntField(term83407, term83407.getClass(), "securityWarningWidth", 0);
        setIntField(term83407, term83407.getClass(), "securityWarningHeight", 0);
        setDoubleField(term83407, term83407.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term83407, term83407.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term83407, term83407.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term83407, term83407.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term83407, term83407.getClass(), "anchor", null);
        setField(term83407, term83407.getClass(), "type", null);
        setIntField(term83407, term83407.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term83407, term83407.getClass(), "locationByPlatform", false);
        setField(term83407, term83407.getClass(), "component", null);
        setField(term83407, term83407.getClass(), "layoutMgr", null);
        setField(term83407, term83407.getClass(), "dispatcher", null);
        setField(term83407, term83407.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term83407, term83407.getClass(), "focusCycleRoot", false);
        setBooleanField(term83407, term83407.getClass(), "focusTraversalPolicyProvider", false);
        setField(term83407, term83407.getClass(), "printingThreads", null);
        setBooleanField(term83407, term83407.getClass(), "printing", false);
        setField(term83407, term83407.getClass(), "containerListener", null);
        setIntField(term83407, term83407.getClass(), "listeningChildren", 0);
        setIntField(term83407, term83407.getClass(), "listeningBoundsChildren", 0);
        setIntField(term83407, term83407.getClass(), "descendantsCount", 0);
        setField(term83407, term83407.getClass(), "preserveBackgroundColor", null);
        setIntField(term83407, term83407.getClass(), "numOfHWComponents", 0);
        setIntField(term83407, term83407.getClass(), "numOfLWComponents", 0);
        setField(term83407, term83407.getClass(), "modalComp", null);
        setField(term83407, term83407.getClass(), "modalAppContext", null);
        setIntField(term83407, term83407.getClass(), "containerSerializedDataVersion", 0);
        setField(term83407, term83407.getClass(), "peer", null);
        setField(term83407, term83407.getClass(), "parent", null);
        setField(term83407, term83407.getClass(), "appContext", null);
        setIntField(term83407, term83407.getClass(), "x", 0);
        setIntField(term83407, term83407.getClass(), "y", 0);
        setIntField(term83407, term83407.getClass(), "width", 0);
        setIntField(term83407, term83407.getClass(), "height", 0);
        setField(term83407, term83407.getClass(), "foreground", null);
        setField(term83407, term83407.getClass(), "background", null);
        setField(term83407, term83407.getClass(), "font", null);
        setField(term83407, term83407.getClass(), "peerFont", null);
        setField(term83407, term83407.getClass(), "cursor", null);
        setField(term83407, term83407.getClass(), "locale", null);
        setField(term83407, term83407.getClass(), "graphicsConfig", null);
        setField(term83407, term83407.getClass(), "bufferStrategy", null);
        setBooleanField(term83407, term83407.getClass(), "ignoreRepaint", false);
        setBooleanField(term83407, term83407.getClass(), "visible", false);
        setBooleanField(term83407, term83407.getClass(), "enabled", false);
        setBooleanField(term83407, term83407.getClass(), "valid", false);
        setField(term83407, term83407.getClass(), "dropTarget", null);
        setField(term83407, term83407.getClass(), "popups", null);
        setField(term83407, term83407.getClass(), "name", null);
        setBooleanField(term83407, term83407.getClass(), "nameExplicitlySet", false);
        setBooleanField(term83407, term83407.getClass(), "focusable", false);
        setIntField(term83407, term83407.getClass(), "isFocusTraversableOverridden", 0);
        setField(term83407, term83407.getClass(), "focusTraversalKeys", null);
        setBooleanField(term83407, term83407.getClass(), "focusTraversalKeysEnabled", false);
        setField(term83407, term83407.getClass(), "acc", null);
        setField(term83407, term83407.getClass(), "minSize", null);
        setBooleanField(term83407, term83407.getClass(), "minSizeSet", false);
        setField(term83407, term83407.getClass(), "prefSize", null);
        setBooleanField(term83407, term83407.getClass(), "prefSizeSet", false);
        setField(term83407, term83407.getClass(), "maxSize", null);
        setBooleanField(term83407, term83407.getClass(), "maxSizeSet", false);
        setField(term83407, term83407.getClass(), "componentOrientation", null);
        setBooleanField(term83407, term83407.getClass(), "newEventsOnly", false);
        setField(term83407, term83407.getClass(), "componentListener", null);
        setField(term83407, term83407.getClass(), "focusListener", null);
        setField(term83407, term83407.getClass(), "hierarchyListener", null);
        setField(term83407, term83407.getClass(), "hierarchyBoundsListener", null);
        setField(term83407, term83407.getClass(), "keyListener", null);
        setField(term83407, term83407.getClass(), "mouseListener", null);
        setField(term83407, term83407.getClass(), "mouseMotionListener", null);
        setField(term83407, term83407.getClass(), "mouseWheelListener", null);
        setField(term83407, term83407.getClass(), "inputMethodListener", null);
        setLongField(term83407, term83407.getClass(), "eventMask", 0L);
        setField(term83407, term83407.getClass(), "changeSupport", null);
        setField(term83407, term83407.getClass(), "objectLock", null);
        setBooleanField(term83407, term83407.getClass(), "isPacked", false);
        setIntField(term83407, term83407.getClass(), "boundsOp", 0);
        setField(term83407, term83407.getClass(), "compoundShape", null);
        setField(term83407, term83407.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term83407, term83407.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term83407, term83407.getClass(), "backgroundEraseDisabled", false);
        setField(term83407, term83407.getClass(), "eventCache", null);
        setBooleanField(term83407, term83407.getClass(), "coalescingEnabled", false);
        setBooleanField(term83407, term83407.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term83407, term83407.getClass(), "componentSerializedDataVersion", 0);
        term83468 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term83468;
        args[1] = null;
        callMethod(klass, "join", argTypes, term83407, args);
    }

};


