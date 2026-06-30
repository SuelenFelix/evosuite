package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class News_NewsDialog_primaryClick_19876174172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273341;

    public News_NewsDialog_primaryClick_19876174172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273341 = newInstance(Class.forName("core.News$NewsDialog"));
        setField(term273341, term273341.getClass(), "keyContent", null);
        setField(term273341, term273341.getClass(), "bodyContent", null);
        setField(term273341, term273341.getClass(), "associateLink", null);
        setField(term273341, term273341.getClass(), "allContent", null);
        setField(term273341, term273341.getClass(), "textPane", null);
        setIntField(term273341, term273341.getClass(), "defaultCloseOperation", 0);
        setField(term273341, term273341.getClass(), "rootPane", null);
        setBooleanField(term273341, term273341.getClass(), "rootPaneCheckingEnabled", false);
        setField(term273341, term273341.getClass(), "transferHandler", null);
        setField(term273341, term273341.getClass(), "accessibleContext", null);
        setBooleanField(term273341, term273341.getClass(), "resizable", false);
        setBooleanField(term273341, term273341.getClass(), "undecorated", false);
        setBooleanField(term273341, term273341.getClass(), "initialized", false);
        setBooleanField(term273341, term273341.getClass(), "modal", false);
        setField(term273341, term273341.getClass(), "modalityType", null);
        setField(term273341, term273341.getClass(), "blockedWindows", null);
        setField(term273341, term273341.getClass(), "title", null);
        setField(term273341, term273341.getClass(), "modalFilter", null);
        setField(term273341, term273341.getClass(), "secondaryLoop", null);
        setBooleanField(term273341, term273341.getClass(), "isInHide", false);
        setBooleanField(term273341, term273341.getClass(), "isInDispose", false);
        setField(term273341, term273341.getClass(), "warningString", null);
        setField(term273341, term273341.getClass(), "icons", null);
        setField(term273341, term273341.getClass(), "temporaryLostComponent", null);
        setBooleanField(term273341, term273341.getClass(), "syncLWRequests", false);
        setBooleanField(term273341, term273341.getClass(), "beforeFirstShow", false);
        setBooleanField(term273341, term273341.getClass(), "disposing", false);
        setField(term273341, term273341.getClass(), "disposerRecord", null);
        setIntField(term273341, term273341.getClass(), "state", 0);
        setBooleanField(term273341, term273341.getClass(), "alwaysOnTop", false);
        setField(term273341, term273341.getClass(), "ownedWindowList", null);
        setField(term273341, term273341.getClass(), "weakThis", null);
        setBooleanField(term273341, term273341.getClass(), "showWithParent", false);
        setField(term273341, term273341.getClass(), "modalBlocker", null);
        setField(term273341, term273341.getClass(), "modalExclusionType", null);
        setField(term273341, term273341.getClass(), "windowListener", null);
        setField(term273341, term273341.getClass(), "windowStateListener", null);
        setField(term273341, term273341.getClass(), "windowFocusListener", null);
        setField(term273341, term273341.getClass(), "inputContext", null);
        setField(term273341, term273341.getClass(), "inputContextLock", null);
        setField(term273341, term273341.getClass(), "focusMgr", null);
        setBooleanField(term273341, term273341.getClass(), "focusableWindowState", false);
        setBooleanField(term273341, term273341.getClass(), "autoRequestFocus", false);
        setBooleanField(term273341, term273341.getClass(), "isInShow", false);
        setFloatField(term273341, term273341.getClass(), "opacity", 0.0F);
        setField(term273341, term273341.getClass(), "shape", null);
        setBooleanField(term273341, term273341.getClass(), "isTrayIconWindow", false);
        setIntField(term273341, term273341.getClass(), "securityWarningWidth", 0);
        setIntField(term273341, term273341.getClass(), "securityWarningHeight", 0);
        setDoubleField(term273341, term273341.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term273341, term273341.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term273341, term273341.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term273341, term273341.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term273341, term273341.getClass(), "anchor", null);
        setField(term273341, term273341.getClass(), "type", null);
        setIntField(term273341, term273341.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term273341, term273341.getClass(), "locationByPlatform", false);
        setField(term273341, term273341.getClass(), "component", null);
        setField(term273341, term273341.getClass(), "layoutMgr", null);
        setField(term273341, term273341.getClass(), "dispatcher", null);
        setField(term273341, term273341.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term273341, term273341.getClass(), "focusCycleRoot", false);
        setBooleanField(term273341, term273341.getClass(), "focusTraversalPolicyProvider", false);
        setField(term273341, term273341.getClass(), "printingThreads", null);
        setBooleanField(term273341, term273341.getClass(), "printing", false);
        setField(term273341, term273341.getClass(), "containerListener", null);
        setIntField(term273341, term273341.getClass(), "listeningChildren", 0);
        setIntField(term273341, term273341.getClass(), "listeningBoundsChildren", 0);
        setIntField(term273341, term273341.getClass(), "descendantsCount", 0);
        setField(term273341, term273341.getClass(), "preserveBackgroundColor", null);
        setIntField(term273341, term273341.getClass(), "numOfHWComponents", 0);
        setIntField(term273341, term273341.getClass(), "numOfLWComponents", 0);
        setField(term273341, term273341.getClass(), "modalComp", null);
        setField(term273341, term273341.getClass(), "modalAppContext", null);
        setIntField(term273341, term273341.getClass(), "containerSerializedDataVersion", 0);
        setField(term273341, term273341.getClass(), "peer", null);
        setField(term273341, term273341.getClass(), "parent", null);
        setField(term273341, term273341.getClass(), "appContext", null);
        setIntField(term273341, term273341.getClass(), "x", 0);
        setIntField(term273341, term273341.getClass(), "y", 0);
        setIntField(term273341, term273341.getClass(), "width", 0);
        setIntField(term273341, term273341.getClass(), "height", 0);
        setField(term273341, term273341.getClass(), "foreground", null);
        setField(term273341, term273341.getClass(), "background", null);
        setField(term273341, term273341.getClass(), "font", null);
        setField(term273341, term273341.getClass(), "peerFont", null);
        setField(term273341, term273341.getClass(), "cursor", null);
        setField(term273341, term273341.getClass(), "locale", null);
        setField(term273341, term273341.getClass(), "graphicsConfig", null);
        setField(term273341, term273341.getClass(), "bufferStrategy", null);
        setBooleanField(term273341, term273341.getClass(), "ignoreRepaint", false);
        setBooleanField(term273341, term273341.getClass(), "visible", false);
        setBooleanField(term273341, term273341.getClass(), "enabled", false);
        setBooleanField(term273341, term273341.getClass(), "valid", false);
        setField(term273341, term273341.getClass(), "dropTarget", null);
        setField(term273341, term273341.getClass(), "popups", null);
        setField(term273341, term273341.getClass(), "name", null);
        setBooleanField(term273341, term273341.getClass(), "nameExplicitlySet", false);
        setBooleanField(term273341, term273341.getClass(), "focusable", false);
        setIntField(term273341, term273341.getClass(), "isFocusTraversableOverridden", 0);
        setField(term273341, term273341.getClass(), "focusTraversalKeys", null);
        setBooleanField(term273341, term273341.getClass(), "focusTraversalKeysEnabled", false);
        setField(term273341, term273341.getClass(), "acc", null);
        setField(term273341, term273341.getClass(), "minSize", null);
        setBooleanField(term273341, term273341.getClass(), "minSizeSet", false);
        setField(term273341, term273341.getClass(), "prefSize", null);
        setBooleanField(term273341, term273341.getClass(), "prefSizeSet", false);
        setField(term273341, term273341.getClass(), "maxSize", null);
        setBooleanField(term273341, term273341.getClass(), "maxSizeSet", false);
        setField(term273341, term273341.getClass(), "componentOrientation", null);
        setBooleanField(term273341, term273341.getClass(), "newEventsOnly", false);
        setField(term273341, term273341.getClass(), "componentListener", null);
        setField(term273341, term273341.getClass(), "focusListener", null);
        setField(term273341, term273341.getClass(), "hierarchyListener", null);
        setField(term273341, term273341.getClass(), "hierarchyBoundsListener", null);
        setField(term273341, term273341.getClass(), "keyListener", null);
        setField(term273341, term273341.getClass(), "mouseListener", null);
        setField(term273341, term273341.getClass(), "mouseMotionListener", null);
        setField(term273341, term273341.getClass(), "mouseWheelListener", null);
        setField(term273341, term273341.getClass(), "inputMethodListener", null);
        setLongField(term273341, term273341.getClass(), "eventMask", 0L);
        setField(term273341, term273341.getClass(), "changeSupport", null);
        setField(term273341, term273341.getClass(), "objectLock", null);
        setBooleanField(term273341, term273341.getClass(), "isPacked", false);
        setIntField(term273341, term273341.getClass(), "boundsOp", 0);
        setField(term273341, term273341.getClass(), "compoundShape", null);
        setField(term273341, term273341.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term273341, term273341.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term273341, term273341.getClass(), "backgroundEraseDisabled", false);
        setField(term273341, term273341.getClass(), "eventCache", null);
        setBooleanField(term273341, term273341.getClass(), "coalescingEnabled", false);
        setBooleanField(term273341, term273341.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term273341, term273341.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News$NewsDialog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KButton");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "primaryClick", argTypes, term273341, args);
    }

};


