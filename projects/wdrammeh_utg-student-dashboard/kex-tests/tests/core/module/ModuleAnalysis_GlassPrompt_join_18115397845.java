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

public class ModuleAnalysis_GlassPrompt_join_18115397845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81559;
     Object term81620;

    public ModuleAnalysis_GlassPrompt_join_18115397845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81559 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term81559, term81559.getClass(), "substancePanel", null);
        setIntField(term81559, term81559.getClass(), "defaultCloseOperation", 0);
        setField(term81559, term81559.getClass(), "rootPane", null);
        setBooleanField(term81559, term81559.getClass(), "rootPaneCheckingEnabled", false);
        setField(term81559, term81559.getClass(), "transferHandler", null);
        setField(term81559, term81559.getClass(), "accessibleContext", null);
        setBooleanField(term81559, term81559.getClass(), "resizable", false);
        setBooleanField(term81559, term81559.getClass(), "undecorated", false);
        setBooleanField(term81559, term81559.getClass(), "initialized", false);
        setBooleanField(term81559, term81559.getClass(), "modal", false);
        setField(term81559, term81559.getClass(), "modalityType", null);
        setField(term81559, term81559.getClass(), "blockedWindows", null);
        setField(term81559, term81559.getClass(), "title", null);
        setField(term81559, term81559.getClass(), "modalFilter", null);
        setField(term81559, term81559.getClass(), "secondaryLoop", null);
        setBooleanField(term81559, term81559.getClass(), "isInHide", false);
        setBooleanField(term81559, term81559.getClass(), "isInDispose", false);
        setField(term81559, term81559.getClass(), "warningString", null);
        setField(term81559, term81559.getClass(), "icons", null);
        setField(term81559, term81559.getClass(), "temporaryLostComponent", null);
        setBooleanField(term81559, term81559.getClass(), "syncLWRequests", false);
        setBooleanField(term81559, term81559.getClass(), "beforeFirstShow", false);
        setBooleanField(term81559, term81559.getClass(), "disposing", false);
        setField(term81559, term81559.getClass(), "disposerRecord", null);
        setIntField(term81559, term81559.getClass(), "state", 0);
        setBooleanField(term81559, term81559.getClass(), "alwaysOnTop", false);
        setField(term81559, term81559.getClass(), "ownedWindowList", null);
        setField(term81559, term81559.getClass(), "weakThis", null);
        setBooleanField(term81559, term81559.getClass(), "showWithParent", false);
        setField(term81559, term81559.getClass(), "modalBlocker", null);
        setField(term81559, term81559.getClass(), "modalExclusionType", null);
        setField(term81559, term81559.getClass(), "windowListener", null);
        setField(term81559, term81559.getClass(), "windowStateListener", null);
        setField(term81559, term81559.getClass(), "windowFocusListener", null);
        setField(term81559, term81559.getClass(), "inputContext", null);
        setField(term81559, term81559.getClass(), "inputContextLock", null);
        setField(term81559, term81559.getClass(), "focusMgr", null);
        setBooleanField(term81559, term81559.getClass(), "focusableWindowState", false);
        setBooleanField(term81559, term81559.getClass(), "autoRequestFocus", false);
        setBooleanField(term81559, term81559.getClass(), "isInShow", false);
        setFloatField(term81559, term81559.getClass(), "opacity", 0.0F);
        setField(term81559, term81559.getClass(), "shape", null);
        setBooleanField(term81559, term81559.getClass(), "isTrayIconWindow", false);
        setIntField(term81559, term81559.getClass(), "securityWarningWidth", 0);
        setIntField(term81559, term81559.getClass(), "securityWarningHeight", 0);
        setDoubleField(term81559, term81559.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term81559, term81559.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term81559, term81559.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term81559, term81559.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term81559, term81559.getClass(), "anchor", null);
        setField(term81559, term81559.getClass(), "type", null);
        setIntField(term81559, term81559.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term81559, term81559.getClass(), "locationByPlatform", false);
        setField(term81559, term81559.getClass(), "component", null);
        setField(term81559, term81559.getClass(), "layoutMgr", null);
        setField(term81559, term81559.getClass(), "dispatcher", null);
        setField(term81559, term81559.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term81559, term81559.getClass(), "focusCycleRoot", false);
        setBooleanField(term81559, term81559.getClass(), "focusTraversalPolicyProvider", false);
        setField(term81559, term81559.getClass(), "printingThreads", null);
        setBooleanField(term81559, term81559.getClass(), "printing", false);
        setField(term81559, term81559.getClass(), "containerListener", null);
        setIntField(term81559, term81559.getClass(), "listeningChildren", 0);
        setIntField(term81559, term81559.getClass(), "listeningBoundsChildren", 0);
        setIntField(term81559, term81559.getClass(), "descendantsCount", 0);
        setField(term81559, term81559.getClass(), "preserveBackgroundColor", null);
        setIntField(term81559, term81559.getClass(), "numOfHWComponents", 0);
        setIntField(term81559, term81559.getClass(), "numOfLWComponents", 0);
        setField(term81559, term81559.getClass(), "modalComp", null);
        setField(term81559, term81559.getClass(), "modalAppContext", null);
        setIntField(term81559, term81559.getClass(), "containerSerializedDataVersion", 0);
        setField(term81559, term81559.getClass(), "peer", null);
        setField(term81559, term81559.getClass(), "parent", null);
        setField(term81559, term81559.getClass(), "appContext", null);
        setIntField(term81559, term81559.getClass(), "x", 0);
        setIntField(term81559, term81559.getClass(), "y", 0);
        setIntField(term81559, term81559.getClass(), "width", 0);
        setIntField(term81559, term81559.getClass(), "height", 0);
        setField(term81559, term81559.getClass(), "foreground", null);
        setField(term81559, term81559.getClass(), "background", null);
        setField(term81559, term81559.getClass(), "font", null);
        setField(term81559, term81559.getClass(), "peerFont", null);
        setField(term81559, term81559.getClass(), "cursor", null);
        setField(term81559, term81559.getClass(), "locale", null);
        setField(term81559, term81559.getClass(), "graphicsConfig", null);
        setField(term81559, term81559.getClass(), "bufferStrategy", null);
        setBooleanField(term81559, term81559.getClass(), "ignoreRepaint", false);
        setBooleanField(term81559, term81559.getClass(), "visible", false);
        setBooleanField(term81559, term81559.getClass(), "enabled", false);
        setBooleanField(term81559, term81559.getClass(), "valid", false);
        setField(term81559, term81559.getClass(), "dropTarget", null);
        setField(term81559, term81559.getClass(), "popups", null);
        setField(term81559, term81559.getClass(), "name", null);
        setBooleanField(term81559, term81559.getClass(), "nameExplicitlySet", false);
        setBooleanField(term81559, term81559.getClass(), "focusable", false);
        setIntField(term81559, term81559.getClass(), "isFocusTraversableOverridden", 0);
        setField(term81559, term81559.getClass(), "focusTraversalKeys", null);
        setBooleanField(term81559, term81559.getClass(), "focusTraversalKeysEnabled", false);
        setField(term81559, term81559.getClass(), "acc", null);
        setField(term81559, term81559.getClass(), "minSize", null);
        setBooleanField(term81559, term81559.getClass(), "minSizeSet", false);
        setField(term81559, term81559.getClass(), "prefSize", null);
        setBooleanField(term81559, term81559.getClass(), "prefSizeSet", false);
        setField(term81559, term81559.getClass(), "maxSize", null);
        setBooleanField(term81559, term81559.getClass(), "maxSizeSet", false);
        setField(term81559, term81559.getClass(), "componentOrientation", null);
        setBooleanField(term81559, term81559.getClass(), "newEventsOnly", false);
        setField(term81559, term81559.getClass(), "componentListener", null);
        setField(term81559, term81559.getClass(), "focusListener", null);
        setField(term81559, term81559.getClass(), "hierarchyListener", null);
        setField(term81559, term81559.getClass(), "hierarchyBoundsListener", null);
        setField(term81559, term81559.getClass(), "keyListener", null);
        setField(term81559, term81559.getClass(), "mouseListener", null);
        setField(term81559, term81559.getClass(), "mouseMotionListener", null);
        setField(term81559, term81559.getClass(), "mouseWheelListener", null);
        setField(term81559, term81559.getClass(), "inputMethodListener", null);
        setLongField(term81559, term81559.getClass(), "eventMask", 0L);
        setField(term81559, term81559.getClass(), "changeSupport", null);
        setField(term81559, term81559.getClass(), "objectLock", null);
        setBooleanField(term81559, term81559.getClass(), "isPacked", false);
        setIntField(term81559, term81559.getClass(), "boundsOp", 0);
        setField(term81559, term81559.getClass(), "compoundShape", null);
        setField(term81559, term81559.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term81559, term81559.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term81559, term81559.getClass(), "backgroundEraseDisabled", false);
        setField(term81559, term81559.getClass(), "eventCache", null);
        setBooleanField(term81559, term81559.getClass(), "coalescingEnabled", false);
        setBooleanField(term81559, term81559.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term81559, term81559.getClass(), "componentSerializedDataVersion", 0);
        term81620 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("core.module.Course");
        Object[] args = new Object[2];
        args[0] = term81620;
        args[1] = null;
        callMethod(klass, "join", argTypes, term81559, args);
    }

};


