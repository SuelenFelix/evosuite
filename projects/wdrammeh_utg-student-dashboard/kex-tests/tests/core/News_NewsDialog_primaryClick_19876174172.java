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
     Object term273347;

    public News_NewsDialog_primaryClick_19876174172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273347 = newInstance(Class.forName("core.News$NewsDialog"));
        setField(term273347, term273347.getClass(), "keyContent", null);
        setField(term273347, term273347.getClass(), "bodyContent", null);
        setField(term273347, term273347.getClass(), "associateLink", null);
        setField(term273347, term273347.getClass(), "allContent", null);
        setField(term273347, term273347.getClass(), "textPane", null);
        setIntField(term273347, term273347.getClass(), "defaultCloseOperation", 0);
        setField(term273347, term273347.getClass(), "rootPane", null);
        setBooleanField(term273347, term273347.getClass(), "rootPaneCheckingEnabled", false);
        setField(term273347, term273347.getClass(), "transferHandler", null);
        setField(term273347, term273347.getClass(), "accessibleContext", null);
        setBooleanField(term273347, term273347.getClass(), "resizable", false);
        setBooleanField(term273347, term273347.getClass(), "undecorated", false);
        setBooleanField(term273347, term273347.getClass(), "initialized", false);
        setBooleanField(term273347, term273347.getClass(), "modal", false);
        setField(term273347, term273347.getClass(), "modalityType", null);
        setField(term273347, term273347.getClass(), "blockedWindows", null);
        setField(term273347, term273347.getClass(), "title", null);
        setField(term273347, term273347.getClass(), "modalFilter", null);
        setField(term273347, term273347.getClass(), "secondaryLoop", null);
        setBooleanField(term273347, term273347.getClass(), "isInHide", false);
        setBooleanField(term273347, term273347.getClass(), "isInDispose", false);
        setField(term273347, term273347.getClass(), "warningString", null);
        setField(term273347, term273347.getClass(), "icons", null);
        setField(term273347, term273347.getClass(), "temporaryLostComponent", null);
        setBooleanField(term273347, term273347.getClass(), "syncLWRequests", false);
        setBooleanField(term273347, term273347.getClass(), "beforeFirstShow", false);
        setBooleanField(term273347, term273347.getClass(), "disposing", false);
        setField(term273347, term273347.getClass(), "disposerRecord", null);
        setIntField(term273347, term273347.getClass(), "state", 0);
        setBooleanField(term273347, term273347.getClass(), "alwaysOnTop", false);
        setField(term273347, term273347.getClass(), "ownedWindowList", null);
        setField(term273347, term273347.getClass(), "weakThis", null);
        setBooleanField(term273347, term273347.getClass(), "showWithParent", false);
        setField(term273347, term273347.getClass(), "modalBlocker", null);
        setField(term273347, term273347.getClass(), "modalExclusionType", null);
        setField(term273347, term273347.getClass(), "windowListener", null);
        setField(term273347, term273347.getClass(), "windowStateListener", null);
        setField(term273347, term273347.getClass(), "windowFocusListener", null);
        setField(term273347, term273347.getClass(), "inputContext", null);
        setField(term273347, term273347.getClass(), "inputContextLock", null);
        setField(term273347, term273347.getClass(), "focusMgr", null);
        setBooleanField(term273347, term273347.getClass(), "focusableWindowState", false);
        setBooleanField(term273347, term273347.getClass(), "autoRequestFocus", false);
        setBooleanField(term273347, term273347.getClass(), "isInShow", false);
        setFloatField(term273347, term273347.getClass(), "opacity", 0.0F);
        setField(term273347, term273347.getClass(), "shape", null);
        setBooleanField(term273347, term273347.getClass(), "isTrayIconWindow", false);
        setIntField(term273347, term273347.getClass(), "securityWarningWidth", 0);
        setIntField(term273347, term273347.getClass(), "securityWarningHeight", 0);
        setDoubleField(term273347, term273347.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term273347, term273347.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term273347, term273347.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term273347, term273347.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term273347, term273347.getClass(), "anchor", null);
        setField(term273347, term273347.getClass(), "type", null);
        setIntField(term273347, term273347.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term273347, term273347.getClass(), "locationByPlatform", false);
        setField(term273347, term273347.getClass(), "component", null);
        setField(term273347, term273347.getClass(), "layoutMgr", null);
        setField(term273347, term273347.getClass(), "dispatcher", null);
        setField(term273347, term273347.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term273347, term273347.getClass(), "focusCycleRoot", false);
        setBooleanField(term273347, term273347.getClass(), "focusTraversalPolicyProvider", false);
        setField(term273347, term273347.getClass(), "printingThreads", null);
        setBooleanField(term273347, term273347.getClass(), "printing", false);
        setField(term273347, term273347.getClass(), "containerListener", null);
        setIntField(term273347, term273347.getClass(), "listeningChildren", 0);
        setIntField(term273347, term273347.getClass(), "listeningBoundsChildren", 0);
        setIntField(term273347, term273347.getClass(), "descendantsCount", 0);
        setField(term273347, term273347.getClass(), "preserveBackgroundColor", null);
        setIntField(term273347, term273347.getClass(), "numOfHWComponents", 0);
        setIntField(term273347, term273347.getClass(), "numOfLWComponents", 0);
        setField(term273347, term273347.getClass(), "modalComp", null);
        setField(term273347, term273347.getClass(), "modalAppContext", null);
        setIntField(term273347, term273347.getClass(), "containerSerializedDataVersion", 0);
        setField(term273347, term273347.getClass(), "peer", null);
        setField(term273347, term273347.getClass(), "parent", null);
        setField(term273347, term273347.getClass(), "appContext", null);
        setIntField(term273347, term273347.getClass(), "x", 0);
        setIntField(term273347, term273347.getClass(), "y", 0);
        setIntField(term273347, term273347.getClass(), "width", 0);
        setIntField(term273347, term273347.getClass(), "height", 0);
        setField(term273347, term273347.getClass(), "foreground", null);
        setField(term273347, term273347.getClass(), "background", null);
        setField(term273347, term273347.getClass(), "font", null);
        setField(term273347, term273347.getClass(), "peerFont", null);
        setField(term273347, term273347.getClass(), "cursor", null);
        setField(term273347, term273347.getClass(), "locale", null);
        setField(term273347, term273347.getClass(), "graphicsConfig", null);
        setField(term273347, term273347.getClass(), "bufferStrategy", null);
        setBooleanField(term273347, term273347.getClass(), "ignoreRepaint", false);
        setBooleanField(term273347, term273347.getClass(), "visible", false);
        setBooleanField(term273347, term273347.getClass(), "enabled", false);
        setBooleanField(term273347, term273347.getClass(), "valid", false);
        setField(term273347, term273347.getClass(), "dropTarget", null);
        setField(term273347, term273347.getClass(), "popups", null);
        setField(term273347, term273347.getClass(), "name", null);
        setBooleanField(term273347, term273347.getClass(), "nameExplicitlySet", false);
        setBooleanField(term273347, term273347.getClass(), "focusable", false);
        setIntField(term273347, term273347.getClass(), "isFocusTraversableOverridden", 0);
        setField(term273347, term273347.getClass(), "focusTraversalKeys", null);
        setBooleanField(term273347, term273347.getClass(), "focusTraversalKeysEnabled", false);
        setField(term273347, term273347.getClass(), "acc", null);
        setField(term273347, term273347.getClass(), "minSize", null);
        setBooleanField(term273347, term273347.getClass(), "minSizeSet", false);
        setField(term273347, term273347.getClass(), "prefSize", null);
        setBooleanField(term273347, term273347.getClass(), "prefSizeSet", false);
        setField(term273347, term273347.getClass(), "maxSize", null);
        setBooleanField(term273347, term273347.getClass(), "maxSizeSet", false);
        setField(term273347, term273347.getClass(), "componentOrientation", null);
        setBooleanField(term273347, term273347.getClass(), "newEventsOnly", false);
        setField(term273347, term273347.getClass(), "componentListener", null);
        setField(term273347, term273347.getClass(), "focusListener", null);
        setField(term273347, term273347.getClass(), "hierarchyListener", null);
        setField(term273347, term273347.getClass(), "hierarchyBoundsListener", null);
        setField(term273347, term273347.getClass(), "keyListener", null);
        setField(term273347, term273347.getClass(), "mouseListener", null);
        setField(term273347, term273347.getClass(), "mouseMotionListener", null);
        setField(term273347, term273347.getClass(), "mouseWheelListener", null);
        setField(term273347, term273347.getClass(), "inputMethodListener", null);
        setLongField(term273347, term273347.getClass(), "eventMask", 0L);
        setField(term273347, term273347.getClass(), "changeSupport", null);
        setField(term273347, term273347.getClass(), "objectLock", null);
        setBooleanField(term273347, term273347.getClass(), "isPacked", false);
        setIntField(term273347, term273347.getClass(), "boundsOp", 0);
        setField(term273347, term273347.getClass(), "compoundShape", null);
        setField(term273347, term273347.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term273347, term273347.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term273347, term273347.getClass(), "backgroundEraseDisabled", false);
        setField(term273347, term273347.getClass(), "eventCache", null);
        setBooleanField(term273347, term273347.getClass(), "coalescingEnabled", false);
        setBooleanField(term273347, term273347.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term273347, term273347.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.News$NewsDialog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KButton");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "primaryClick", argTypes, term273347, args);
    }

};


