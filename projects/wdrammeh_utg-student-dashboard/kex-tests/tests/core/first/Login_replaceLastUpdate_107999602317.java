package core.first;

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
import static core.first.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Login_replaceLastUpdate_107999602317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7972;

    public Login_replaceLastUpdate_107999602317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7972 = newInstance(Class.forName("core.first.Login"));
        setField(term7972, term7972.getClass(), "parent", null);
        setIntField(term7972, term7972.getClass(), "defaultCloseOperation", 0);
        setField(term7972, term7972.getClass(), "rootPane", null);
        setBooleanField(term7972, term7972.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7972, term7972.getClass(), "transferHandler", null);
        setField(term7972, term7972.getClass(), "accessibleContext", null);
        setBooleanField(term7972, term7972.getClass(), "resizable", false);
        setBooleanField(term7972, term7972.getClass(), "undecorated", false);
        setBooleanField(term7972, term7972.getClass(), "initialized", false);
        setBooleanField(term7972, term7972.getClass(), "modal", false);
        setField(term7972, term7972.getClass(), "modalityType", null);
        setField(term7972, term7972.getClass(), "blockedWindows", null);
        setField(term7972, term7972.getClass(), "title", null);
        setField(term7972, term7972.getClass(), "modalFilter", null);
        setField(term7972, term7972.getClass(), "secondaryLoop", null);
        setBooleanField(term7972, term7972.getClass(), "isInHide", false);
        setBooleanField(term7972, term7972.getClass(), "isInDispose", false);
        setField(term7972, term7972.getClass(), "warningString", null);
        setField(term7972, term7972.getClass(), "icons", null);
        setField(term7972, term7972.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7972, term7972.getClass(), "syncLWRequests", false);
        setBooleanField(term7972, term7972.getClass(), "beforeFirstShow", false);
        setBooleanField(term7972, term7972.getClass(), "disposing", false);
        setField(term7972, term7972.getClass(), "disposerRecord", null);
        setIntField(term7972, term7972.getClass(), "state", 0);
        setBooleanField(term7972, term7972.getClass(), "alwaysOnTop", false);
        setField(term7972, term7972.getClass(), "ownedWindowList", null);
        setField(term7972, term7972.getClass(), "weakThis", null);
        setBooleanField(term7972, term7972.getClass(), "showWithParent", false);
        setField(term7972, term7972.getClass(), "modalBlocker", null);
        setField(term7972, term7972.getClass(), "modalExclusionType", null);
        setField(term7972, term7972.getClass(), "windowListener", null);
        setField(term7972, term7972.getClass(), "windowStateListener", null);
        setField(term7972, term7972.getClass(), "windowFocusListener", null);
        setField(term7972, term7972.getClass(), "inputContext", null);
        setField(term7972, term7972.getClass(), "inputContextLock", null);
        setField(term7972, term7972.getClass(), "focusMgr", null);
        setBooleanField(term7972, term7972.getClass(), "focusableWindowState", false);
        setBooleanField(term7972, term7972.getClass(), "autoRequestFocus", false);
        setBooleanField(term7972, term7972.getClass(), "isInShow", false);
        setFloatField(term7972, term7972.getClass(), "opacity", 0.0F);
        setField(term7972, term7972.getClass(), "shape", null);
        setBooleanField(term7972, term7972.getClass(), "isTrayIconWindow", false);
        setIntField(term7972, term7972.getClass(), "securityWarningWidth", 0);
        setIntField(term7972, term7972.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7972, term7972.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7972, term7972.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7972, term7972.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7972, term7972.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7972, term7972.getClass(), "anchor", null);
        setField(term7972, term7972.getClass(), "type", null);
        setIntField(term7972, term7972.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7972, term7972.getClass(), "locationByPlatform", false);
        setField(term7972, term7972.getClass(), "component", null);
        setField(term7972, term7972.getClass(), "layoutMgr", null);
        setField(term7972, term7972.getClass(), "dispatcher", null);
        setField(term7972, term7972.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7972, term7972.getClass(), "focusCycleRoot", false);
        setBooleanField(term7972, term7972.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7972, term7972.getClass(), "printingThreads", null);
        setBooleanField(term7972, term7972.getClass(), "printing", false);
        setField(term7972, term7972.getClass(), "containerListener", null);
        setIntField(term7972, term7972.getClass(), "listeningChildren", 0);
        setIntField(term7972, term7972.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7972, term7972.getClass(), "descendantsCount", 0);
        setField(term7972, term7972.getClass(), "preserveBackgroundColor", null);
        setIntField(term7972, term7972.getClass(), "numOfHWComponents", 0);
        setIntField(term7972, term7972.getClass(), "numOfLWComponents", 0);
        setField(term7972, term7972.getClass(), "modalComp", null);
        setField(term7972, term7972.getClass(), "modalAppContext", null);
        setIntField(term7972, term7972.getClass(), "containerSerializedDataVersion", 0);
        setField(term7972, term7972.getClass(), "peer", null);
        setField(term7972, term7972.getClass(), "parent", null);
        setField(term7972, term7972.getClass(), "appContext", null);
        setIntField(term7972, term7972.getClass(), "x", 0);
        setIntField(term7972, term7972.getClass(), "y", 0);
        setIntField(term7972, term7972.getClass(), "width", 0);
        setIntField(term7972, term7972.getClass(), "height", 0);
        setField(term7972, term7972.getClass(), "foreground", null);
        setField(term7972, term7972.getClass(), "background", null);
        setField(term7972, term7972.getClass(), "font", null);
        setField(term7972, term7972.getClass(), "peerFont", null);
        setField(term7972, term7972.getClass(), "cursor", null);
        setField(term7972, term7972.getClass(), "locale", null);
        setField(term7972, term7972.getClass(), "graphicsConfig", null);
        setField(term7972, term7972.getClass(), "bufferStrategy", null);
        setBooleanField(term7972, term7972.getClass(), "ignoreRepaint", false);
        setBooleanField(term7972, term7972.getClass(), "visible", false);
        setBooleanField(term7972, term7972.getClass(), "enabled", false);
        setBooleanField(term7972, term7972.getClass(), "valid", false);
        setField(term7972, term7972.getClass(), "dropTarget", null);
        setField(term7972, term7972.getClass(), "popups", null);
        setField(term7972, term7972.getClass(), "name", null);
        setBooleanField(term7972, term7972.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7972, term7972.getClass(), "focusable", false);
        setIntField(term7972, term7972.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7972, term7972.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7972, term7972.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7972, term7972.getClass(), "acc", null);
        setField(term7972, term7972.getClass(), "minSize", null);
        setBooleanField(term7972, term7972.getClass(), "minSizeSet", false);
        setField(term7972, term7972.getClass(), "prefSize", null);
        setBooleanField(term7972, term7972.getClass(), "prefSizeSet", false);
        setField(term7972, term7972.getClass(), "maxSize", null);
        setBooleanField(term7972, term7972.getClass(), "maxSizeSet", false);
        setField(term7972, term7972.getClass(), "componentOrientation", null);
        setBooleanField(term7972, term7972.getClass(), "newEventsOnly", false);
        setField(term7972, term7972.getClass(), "componentListener", null);
        setField(term7972, term7972.getClass(), "focusListener", null);
        setField(term7972, term7972.getClass(), "hierarchyListener", null);
        setField(term7972, term7972.getClass(), "hierarchyBoundsListener", null);
        setField(term7972, term7972.getClass(), "keyListener", null);
        setField(term7972, term7972.getClass(), "mouseListener", null);
        setField(term7972, term7972.getClass(), "mouseMotionListener", null);
        setField(term7972, term7972.getClass(), "mouseWheelListener", null);
        setField(term7972, term7972.getClass(), "inputMethodListener", null);
        setLongField(term7972, term7972.getClass(), "eventMask", 0L);
        setField(term7972, term7972.getClass(), "changeSupport", null);
        setField(term7972, term7972.getClass(), "objectLock", null);
        setBooleanField(term7972, term7972.getClass(), "isPacked", false);
        setIntField(term7972, term7972.getClass(), "boundsOp", 0);
        setField(term7972, term7972.getClass(), "compoundShape", null);
        setField(term7972, term7972.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7972, term7972.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7972, term7972.getClass(), "backgroundEraseDisabled", false);
        setField(term7972, term7972.getClass(), "eventCache", null);
        setBooleanField(term7972, term7972.getClass(), "coalescingEnabled", false);
        setBooleanField(term7972, term7972.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7972, term7972.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "replaceLastUpdate", argTypes, term7972, args);
    }

};


