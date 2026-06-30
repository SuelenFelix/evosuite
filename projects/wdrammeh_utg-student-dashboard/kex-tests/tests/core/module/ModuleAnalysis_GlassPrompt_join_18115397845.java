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
     Object term36492;
     Object term36553;

    public ModuleAnalysis_GlassPrompt_join_18115397845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36492 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt"));
        setField(term36492, term36492.getClass(), "substancePanel", null);
        setIntField(term36492, term36492.getClass(), "defaultCloseOperation", 0);
        setField(term36492, term36492.getClass(), "rootPane", null);
        setBooleanField(term36492, term36492.getClass(), "rootPaneCheckingEnabled", false);
        setField(term36492, term36492.getClass(), "transferHandler", null);
        setField(term36492, term36492.getClass(), "accessibleContext", null);
        setBooleanField(term36492, term36492.getClass(), "resizable", false);
        setBooleanField(term36492, term36492.getClass(), "undecorated", false);
        setBooleanField(term36492, term36492.getClass(), "initialized", false);
        setBooleanField(term36492, term36492.getClass(), "modal", false);
        setField(term36492, term36492.getClass(), "modalityType", null);
        setField(term36492, term36492.getClass(), "blockedWindows", null);
        setField(term36492, term36492.getClass(), "title", null);
        setField(term36492, term36492.getClass(), "modalFilter", null);
        setField(term36492, term36492.getClass(), "secondaryLoop", null);
        setBooleanField(term36492, term36492.getClass(), "isInHide", false);
        setBooleanField(term36492, term36492.getClass(), "isInDispose", false);
        setField(term36492, term36492.getClass(), "warningString", null);
        setField(term36492, term36492.getClass(), "icons", null);
        setField(term36492, term36492.getClass(), "temporaryLostComponent", null);
        setBooleanField(term36492, term36492.getClass(), "syncLWRequests", false);
        setBooleanField(term36492, term36492.getClass(), "beforeFirstShow", false);
        setBooleanField(term36492, term36492.getClass(), "disposing", false);
        setField(term36492, term36492.getClass(), "disposerRecord", null);
        setIntField(term36492, term36492.getClass(), "state", 0);
        setBooleanField(term36492, term36492.getClass(), "alwaysOnTop", false);
        setField(term36492, term36492.getClass(), "ownedWindowList", null);
        setField(term36492, term36492.getClass(), "weakThis", null);
        setBooleanField(term36492, term36492.getClass(), "showWithParent", false);
        setField(term36492, term36492.getClass(), "modalBlocker", null);
        setField(term36492, term36492.getClass(), "modalExclusionType", null);
        setField(term36492, term36492.getClass(), "windowListener", null);
        setField(term36492, term36492.getClass(), "windowStateListener", null);
        setField(term36492, term36492.getClass(), "windowFocusListener", null);
        setField(term36492, term36492.getClass(), "inputContext", null);
        setField(term36492, term36492.getClass(), "inputContextLock", null);
        setField(term36492, term36492.getClass(), "focusMgr", null);
        setBooleanField(term36492, term36492.getClass(), "focusableWindowState", false);
        setBooleanField(term36492, term36492.getClass(), "autoRequestFocus", false);
        setBooleanField(term36492, term36492.getClass(), "isInShow", false);
        setFloatField(term36492, term36492.getClass(), "opacity", 0.0F);
        setField(term36492, term36492.getClass(), "shape", null);
        setBooleanField(term36492, term36492.getClass(), "isTrayIconWindow", false);
        setIntField(term36492, term36492.getClass(), "securityWarningWidth", 0);
        setIntField(term36492, term36492.getClass(), "securityWarningHeight", 0);
        setDoubleField(term36492, term36492.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term36492, term36492.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term36492, term36492.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term36492, term36492.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term36492, term36492.getClass(), "anchor", null);
        setField(term36492, term36492.getClass(), "type", null);
        setIntField(term36492, term36492.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term36492, term36492.getClass(), "locationByPlatform", false);
        setField(term36492, term36492.getClass(), "component", null);
        setField(term36492, term36492.getClass(), "layoutMgr", null);
        setField(term36492, term36492.getClass(), "dispatcher", null);
        setField(term36492, term36492.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36492, term36492.getClass(), "focusCycleRoot", false);
        setBooleanField(term36492, term36492.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36492, term36492.getClass(), "printingThreads", null);
        setBooleanField(term36492, term36492.getClass(), "printing", false);
        setField(term36492, term36492.getClass(), "containerListener", null);
        setIntField(term36492, term36492.getClass(), "listeningChildren", 0);
        setIntField(term36492, term36492.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36492, term36492.getClass(), "descendantsCount", 0);
        setField(term36492, term36492.getClass(), "preserveBackgroundColor", null);
        setIntField(term36492, term36492.getClass(), "numOfHWComponents", 0);
        setIntField(term36492, term36492.getClass(), "numOfLWComponents", 0);
        setField(term36492, term36492.getClass(), "modalComp", null);
        setField(term36492, term36492.getClass(), "modalAppContext", null);
        setIntField(term36492, term36492.getClass(), "containerSerializedDataVersion", 0);
        setField(term36492, term36492.getClass(), "peer", null);
        setField(term36492, term36492.getClass(), "parent", null);
        setField(term36492, term36492.getClass(), "appContext", null);
        setIntField(term36492, term36492.getClass(), "x", 0);
        setIntField(term36492, term36492.getClass(), "y", 0);
        setIntField(term36492, term36492.getClass(), "width", 0);
        setIntField(term36492, term36492.getClass(), "height", 0);
        setField(term36492, term36492.getClass(), "foreground", null);
        setField(term36492, term36492.getClass(), "background", null);
        setField(term36492, term36492.getClass(), "font", null);
        setField(term36492, term36492.getClass(), "peerFont", null);
        setField(term36492, term36492.getClass(), "cursor", null);
        setField(term36492, term36492.getClass(), "locale", null);
        setField(term36492, term36492.getClass(), "graphicsConfig", null);
        setField(term36492, term36492.getClass(), "bufferStrategy", null);
        setBooleanField(term36492, term36492.getClass(), "ignoreRepaint", false);
        setBooleanField(term36492, term36492.getClass(), "visible", false);
        setBooleanField(term36492, term36492.getClass(), "enabled", false);
        setBooleanField(term36492, term36492.getClass(), "valid", false);
        setField(term36492, term36492.getClass(), "dropTarget", null);
        setField(term36492, term36492.getClass(), "popups", null);
        setField(term36492, term36492.getClass(), "name", null);
        setBooleanField(term36492, term36492.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36492, term36492.getClass(), "focusable", false);
        setIntField(term36492, term36492.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36492, term36492.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36492, term36492.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36492, term36492.getClass(), "acc", null);
        setField(term36492, term36492.getClass(), "minSize", null);
        setBooleanField(term36492, term36492.getClass(), "minSizeSet", false);
        setField(term36492, term36492.getClass(), "prefSize", null);
        setBooleanField(term36492, term36492.getClass(), "prefSizeSet", false);
        setField(term36492, term36492.getClass(), "maxSize", null);
        setBooleanField(term36492, term36492.getClass(), "maxSizeSet", false);
        setField(term36492, term36492.getClass(), "componentOrientation", null);
        setBooleanField(term36492, term36492.getClass(), "newEventsOnly", false);
        setField(term36492, term36492.getClass(), "componentListener", null);
        setField(term36492, term36492.getClass(), "focusListener", null);
        setField(term36492, term36492.getClass(), "hierarchyListener", null);
        setField(term36492, term36492.getClass(), "hierarchyBoundsListener", null);
        setField(term36492, term36492.getClass(), "keyListener", null);
        setField(term36492, term36492.getClass(), "mouseListener", null);
        setField(term36492, term36492.getClass(), "mouseMotionListener", null);
        setField(term36492, term36492.getClass(), "mouseWheelListener", null);
        setField(term36492, term36492.getClass(), "inputMethodListener", null);
        setLongField(term36492, term36492.getClass(), "eventMask", 0L);
        setField(term36492, term36492.getClass(), "changeSupport", null);
        setField(term36492, term36492.getClass(), "objectLock", null);
        setBooleanField(term36492, term36492.getClass(), "isPacked", false);
        setIntField(term36492, term36492.getClass(), "boundsOp", 0);
        setField(term36492, term36492.getClass(), "compoundShape", null);
        setField(term36492, term36492.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36492, term36492.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36492, term36492.getClass(), "backgroundEraseDisabled", false);
        setField(term36492, term36492.getClass(), "eventCache", null);
        setBooleanField(term36492, term36492.getClass(), "coalescingEnabled", false);
        setBooleanField(term36492, term36492.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36492, term36492.getClass(), "componentSerializedDataVersion", 0);
        term36553 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("core.module.Course");
        Object[] args = new Object[2];
        args[0] = term36553;
        args[1] = null;
        callMethod(klass, "join", argTypes, term36492, args);
    }

};


