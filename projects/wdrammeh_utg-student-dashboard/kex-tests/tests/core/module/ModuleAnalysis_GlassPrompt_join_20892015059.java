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
     Object term38373;
     Object term38434;

    public ModuleAnalysis_GlassPrompt_join_20892015059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38373 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term38373, term38373.getClass(), "substancePanel", null);
        setIntField(term38373, term38373.getClass(), "defaultCloseOperation", 0);
        setField(term38373, term38373.getClass(), "rootPane", null);
        setBooleanField(term38373, term38373.getClass(), "rootPaneCheckingEnabled", false);
        setField(term38373, term38373.getClass(), "transferHandler", null);
        setField(term38373, term38373.getClass(), "accessibleContext", null);
        setBooleanField(term38373, term38373.getClass(), "resizable", false);
        setBooleanField(term38373, term38373.getClass(), "undecorated", false);
        setBooleanField(term38373, term38373.getClass(), "initialized", false);
        setBooleanField(term38373, term38373.getClass(), "modal", false);
        setField(term38373, term38373.getClass(), "modalityType", null);
        setField(term38373, term38373.getClass(), "blockedWindows", null);
        setField(term38373, term38373.getClass(), "title", null);
        setField(term38373, term38373.getClass(), "modalFilter", null);
        setField(term38373, term38373.getClass(), "secondaryLoop", null);
        setBooleanField(term38373, term38373.getClass(), "isInHide", false);
        setBooleanField(term38373, term38373.getClass(), "isInDispose", false);
        setField(term38373, term38373.getClass(), "warningString", null);
        setField(term38373, term38373.getClass(), "icons", null);
        setField(term38373, term38373.getClass(), "temporaryLostComponent", null);
        setBooleanField(term38373, term38373.getClass(), "syncLWRequests", false);
        setBooleanField(term38373, term38373.getClass(), "beforeFirstShow", false);
        setBooleanField(term38373, term38373.getClass(), "disposing", false);
        setField(term38373, term38373.getClass(), "disposerRecord", null);
        setIntField(term38373, term38373.getClass(), "state", 0);
        setBooleanField(term38373, term38373.getClass(), "alwaysOnTop", false);
        setField(term38373, term38373.getClass(), "ownedWindowList", null);
        setField(term38373, term38373.getClass(), "weakThis", null);
        setBooleanField(term38373, term38373.getClass(), "showWithParent", false);
        setField(term38373, term38373.getClass(), "modalBlocker", null);
        setField(term38373, term38373.getClass(), "modalExclusionType", null);
        setField(term38373, term38373.getClass(), "windowListener", null);
        setField(term38373, term38373.getClass(), "windowStateListener", null);
        setField(term38373, term38373.getClass(), "windowFocusListener", null);
        setField(term38373, term38373.getClass(), "inputContext", null);
        setField(term38373, term38373.getClass(), "inputContextLock", null);
        setField(term38373, term38373.getClass(), "focusMgr", null);
        setBooleanField(term38373, term38373.getClass(), "focusableWindowState", false);
        setBooleanField(term38373, term38373.getClass(), "autoRequestFocus", false);
        setBooleanField(term38373, term38373.getClass(), "isInShow", false);
        setFloatField(term38373, term38373.getClass(), "opacity", 0.0F);
        setField(term38373, term38373.getClass(), "shape", null);
        setBooleanField(term38373, term38373.getClass(), "isTrayIconWindow", false);
        setIntField(term38373, term38373.getClass(), "securityWarningWidth", 0);
        setIntField(term38373, term38373.getClass(), "securityWarningHeight", 0);
        setDoubleField(term38373, term38373.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term38373, term38373.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term38373, term38373.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term38373, term38373.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term38373, term38373.getClass(), "anchor", null);
        setField(term38373, term38373.getClass(), "type", null);
        setIntField(term38373, term38373.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term38373, term38373.getClass(), "locationByPlatform", false);
        setField(term38373, term38373.getClass(), "component", null);
        setField(term38373, term38373.getClass(), "layoutMgr", null);
        setField(term38373, term38373.getClass(), "dispatcher", null);
        setField(term38373, term38373.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term38373, term38373.getClass(), "focusCycleRoot", false);
        setBooleanField(term38373, term38373.getClass(), "focusTraversalPolicyProvider", false);
        setField(term38373, term38373.getClass(), "printingThreads", null);
        setBooleanField(term38373, term38373.getClass(), "printing", false);
        setField(term38373, term38373.getClass(), "containerListener", null);
        setIntField(term38373, term38373.getClass(), "listeningChildren", 0);
        setIntField(term38373, term38373.getClass(), "listeningBoundsChildren", 0);
        setIntField(term38373, term38373.getClass(), "descendantsCount", 0);
        setField(term38373, term38373.getClass(), "preserveBackgroundColor", null);
        setIntField(term38373, term38373.getClass(), "numOfHWComponents", 0);
        setIntField(term38373, term38373.getClass(), "numOfLWComponents", 0);
        setField(term38373, term38373.getClass(), "modalComp", null);
        setField(term38373, term38373.getClass(), "modalAppContext", null);
        setIntField(term38373, term38373.getClass(), "containerSerializedDataVersion", 0);
        setField(term38373, term38373.getClass(), "peer", null);
        setField(term38373, term38373.getClass(), "parent", null);
        setField(term38373, term38373.getClass(), "appContext", null);
        setIntField(term38373, term38373.getClass(), "x", 0);
        setIntField(term38373, term38373.getClass(), "y", 0);
        setIntField(term38373, term38373.getClass(), "width", 0);
        setIntField(term38373, term38373.getClass(), "height", 0);
        setField(term38373, term38373.getClass(), "foreground", null);
        setField(term38373, term38373.getClass(), "background", null);
        setField(term38373, term38373.getClass(), "font", null);
        setField(term38373, term38373.getClass(), "peerFont", null);
        setField(term38373, term38373.getClass(), "cursor", null);
        setField(term38373, term38373.getClass(), "locale", null);
        setField(term38373, term38373.getClass(), "graphicsConfig", null);
        setField(term38373, term38373.getClass(), "bufferStrategy", null);
        setBooleanField(term38373, term38373.getClass(), "ignoreRepaint", false);
        setBooleanField(term38373, term38373.getClass(), "visible", false);
        setBooleanField(term38373, term38373.getClass(), "enabled", false);
        setBooleanField(term38373, term38373.getClass(), "valid", false);
        setField(term38373, term38373.getClass(), "dropTarget", null);
        setField(term38373, term38373.getClass(), "popups", null);
        setField(term38373, term38373.getClass(), "name", null);
        setBooleanField(term38373, term38373.getClass(), "nameExplicitlySet", false);
        setBooleanField(term38373, term38373.getClass(), "focusable", false);
        setIntField(term38373, term38373.getClass(), "isFocusTraversableOverridden", 0);
        setField(term38373, term38373.getClass(), "focusTraversalKeys", null);
        setBooleanField(term38373, term38373.getClass(), "focusTraversalKeysEnabled", false);
        setField(term38373, term38373.getClass(), "acc", null);
        setField(term38373, term38373.getClass(), "minSize", null);
        setBooleanField(term38373, term38373.getClass(), "minSizeSet", false);
        setField(term38373, term38373.getClass(), "prefSize", null);
        setBooleanField(term38373, term38373.getClass(), "prefSizeSet", false);
        setField(term38373, term38373.getClass(), "maxSize", null);
        setBooleanField(term38373, term38373.getClass(), "maxSizeSet", false);
        setField(term38373, term38373.getClass(), "componentOrientation", null);
        setBooleanField(term38373, term38373.getClass(), "newEventsOnly", false);
        setField(term38373, term38373.getClass(), "componentListener", null);
        setField(term38373, term38373.getClass(), "focusListener", null);
        setField(term38373, term38373.getClass(), "hierarchyListener", null);
        setField(term38373, term38373.getClass(), "hierarchyBoundsListener", null);
        setField(term38373, term38373.getClass(), "keyListener", null);
        setField(term38373, term38373.getClass(), "mouseListener", null);
        setField(term38373, term38373.getClass(), "mouseMotionListener", null);
        setField(term38373, term38373.getClass(), "mouseWheelListener", null);
        setField(term38373, term38373.getClass(), "inputMethodListener", null);
        setLongField(term38373, term38373.getClass(), "eventMask", 0L);
        setField(term38373, term38373.getClass(), "changeSupport", null);
        setField(term38373, term38373.getClass(), "objectLock", null);
        setBooleanField(term38373, term38373.getClass(), "isPacked", false);
        setIntField(term38373, term38373.getClass(), "boundsOp", 0);
        setField(term38373, term38373.getClass(), "compoundShape", null);
        setField(term38373, term38373.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term38373, term38373.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term38373, term38373.getClass(), "backgroundEraseDisabled", false);
        setField(term38373, term38373.getClass(), "eventCache", null);
        setBooleanField(term38373, term38373.getClass(), "coalescingEnabled", false);
        setBooleanField(term38373, term38373.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term38373, term38373.getClass(), "componentSerializedDataVersion", 0);
        term38434 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term38434;
        args[1] = null;
        callMethod(klass, "join", argTypes, term38373, args);
    }

};


