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

public class About_reportBlankReview_209986261014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140090;

    public About_reportBlankReview_209986261014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140090 = newInstance(Class.forName("core.About"));
        setField(term140090, term140090.getClass(), "midCard", null);
        setField(term140090, term140090.getClass(), "midLayer", null);
        setIntField(term140090, term140090.getClass(), "defaultCloseOperation", 0);
        setField(term140090, term140090.getClass(), "rootPane", null);
        setBooleanField(term140090, term140090.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140090, term140090.getClass(), "transferHandler", null);
        setField(term140090, term140090.getClass(), "accessibleContext", null);
        setBooleanField(term140090, term140090.getClass(), "resizable", false);
        setBooleanField(term140090, term140090.getClass(), "undecorated", false);
        setBooleanField(term140090, term140090.getClass(), "initialized", false);
        setBooleanField(term140090, term140090.getClass(), "modal", false);
        setField(term140090, term140090.getClass(), "modalityType", null);
        setField(term140090, term140090.getClass(), "blockedWindows", null);
        setField(term140090, term140090.getClass(), "title", null);
        setField(term140090, term140090.getClass(), "modalFilter", null);
        setField(term140090, term140090.getClass(), "secondaryLoop", null);
        setBooleanField(term140090, term140090.getClass(), "isInHide", false);
        setBooleanField(term140090, term140090.getClass(), "isInDispose", false);
        setField(term140090, term140090.getClass(), "warningString", null);
        setField(term140090, term140090.getClass(), "icons", null);
        setField(term140090, term140090.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140090, term140090.getClass(), "syncLWRequests", false);
        setBooleanField(term140090, term140090.getClass(), "beforeFirstShow", false);
        setBooleanField(term140090, term140090.getClass(), "disposing", false);
        setField(term140090, term140090.getClass(), "disposerRecord", null);
        setIntField(term140090, term140090.getClass(), "state", 0);
        setBooleanField(term140090, term140090.getClass(), "alwaysOnTop", false);
        setField(term140090, term140090.getClass(), "ownedWindowList", null);
        setField(term140090, term140090.getClass(), "weakThis", null);
        setBooleanField(term140090, term140090.getClass(), "showWithParent", false);
        setField(term140090, term140090.getClass(), "modalBlocker", null);
        setField(term140090, term140090.getClass(), "modalExclusionType", null);
        setField(term140090, term140090.getClass(), "windowListener", null);
        setField(term140090, term140090.getClass(), "windowStateListener", null);
        setField(term140090, term140090.getClass(), "windowFocusListener", null);
        setField(term140090, term140090.getClass(), "inputContext", null);
        setField(term140090, term140090.getClass(), "inputContextLock", null);
        setField(term140090, term140090.getClass(), "focusMgr", null);
        setBooleanField(term140090, term140090.getClass(), "focusableWindowState", false);
        setBooleanField(term140090, term140090.getClass(), "autoRequestFocus", false);
        setBooleanField(term140090, term140090.getClass(), "isInShow", false);
        setFloatField(term140090, term140090.getClass(), "opacity", 0.0F);
        setField(term140090, term140090.getClass(), "shape", null);
        setBooleanField(term140090, term140090.getClass(), "isTrayIconWindow", false);
        setIntField(term140090, term140090.getClass(), "securityWarningWidth", 0);
        setIntField(term140090, term140090.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140090, term140090.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140090, term140090.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140090, term140090.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140090, term140090.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140090, term140090.getClass(), "anchor", null);
        setField(term140090, term140090.getClass(), "type", null);
        setIntField(term140090, term140090.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140090, term140090.getClass(), "locationByPlatform", false);
        setField(term140090, term140090.getClass(), "component", null);
        setField(term140090, term140090.getClass(), "layoutMgr", null);
        setField(term140090, term140090.getClass(), "dispatcher", null);
        setField(term140090, term140090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140090, term140090.getClass(), "focusCycleRoot", false);
        setBooleanField(term140090, term140090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140090, term140090.getClass(), "printingThreads", null);
        setBooleanField(term140090, term140090.getClass(), "printing", false);
        setField(term140090, term140090.getClass(), "containerListener", null);
        setIntField(term140090, term140090.getClass(), "listeningChildren", 0);
        setIntField(term140090, term140090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140090, term140090.getClass(), "descendantsCount", 0);
        setField(term140090, term140090.getClass(), "preserveBackgroundColor", null);
        setIntField(term140090, term140090.getClass(), "numOfHWComponents", 0);
        setIntField(term140090, term140090.getClass(), "numOfLWComponents", 0);
        setField(term140090, term140090.getClass(), "modalComp", null);
        setField(term140090, term140090.getClass(), "modalAppContext", null);
        setIntField(term140090, term140090.getClass(), "containerSerializedDataVersion", 0);
        setField(term140090, term140090.getClass(), "peer", null);
        setField(term140090, term140090.getClass(), "parent", null);
        setField(term140090, term140090.getClass(), "appContext", null);
        setIntField(term140090, term140090.getClass(), "x", 0);
        setIntField(term140090, term140090.getClass(), "y", 0);
        setIntField(term140090, term140090.getClass(), "width", 0);
        setIntField(term140090, term140090.getClass(), "height", 0);
        setField(term140090, term140090.getClass(), "foreground", null);
        setField(term140090, term140090.getClass(), "background", null);
        setField(term140090, term140090.getClass(), "font", null);
        setField(term140090, term140090.getClass(), "peerFont", null);
        setField(term140090, term140090.getClass(), "cursor", null);
        setField(term140090, term140090.getClass(), "locale", null);
        setField(term140090, term140090.getClass(), "graphicsConfig", null);
        setField(term140090, term140090.getClass(), "bufferStrategy", null);
        setBooleanField(term140090, term140090.getClass(), "ignoreRepaint", false);
        setBooleanField(term140090, term140090.getClass(), "visible", false);
        setBooleanField(term140090, term140090.getClass(), "enabled", false);
        setBooleanField(term140090, term140090.getClass(), "valid", false);
        setField(term140090, term140090.getClass(), "dropTarget", null);
        setField(term140090, term140090.getClass(), "popups", null);
        setField(term140090, term140090.getClass(), "name", null);
        setBooleanField(term140090, term140090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140090, term140090.getClass(), "focusable", false);
        setIntField(term140090, term140090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140090, term140090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140090, term140090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140090, term140090.getClass(), "acc", null);
        setField(term140090, term140090.getClass(), "minSize", null);
        setBooleanField(term140090, term140090.getClass(), "minSizeSet", false);
        setField(term140090, term140090.getClass(), "prefSize", null);
        setBooleanField(term140090, term140090.getClass(), "prefSizeSet", false);
        setField(term140090, term140090.getClass(), "maxSize", null);
        setBooleanField(term140090, term140090.getClass(), "maxSizeSet", false);
        setField(term140090, term140090.getClass(), "componentOrientation", null);
        setBooleanField(term140090, term140090.getClass(), "newEventsOnly", false);
        setField(term140090, term140090.getClass(), "componentListener", null);
        setField(term140090, term140090.getClass(), "focusListener", null);
        setField(term140090, term140090.getClass(), "hierarchyListener", null);
        setField(term140090, term140090.getClass(), "hierarchyBoundsListener", null);
        setField(term140090, term140090.getClass(), "keyListener", null);
        setField(term140090, term140090.getClass(), "mouseListener", null);
        setField(term140090, term140090.getClass(), "mouseMotionListener", null);
        setField(term140090, term140090.getClass(), "mouseWheelListener", null);
        setField(term140090, term140090.getClass(), "inputMethodListener", null);
        setLongField(term140090, term140090.getClass(), "eventMask", 0L);
        setField(term140090, term140090.getClass(), "changeSupport", null);
        setField(term140090, term140090.getClass(), "objectLock", null);
        setBooleanField(term140090, term140090.getClass(), "isPacked", false);
        setIntField(term140090, term140090.getClass(), "boundsOp", 0);
        setField(term140090, term140090.getClass(), "compoundShape", null);
        setField(term140090, term140090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140090, term140090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140090, term140090.getClass(), "backgroundEraseDisabled", false);
        setField(term140090, term140090.getClass(), "eventCache", null);
        setBooleanField(term140090, term140090.getClass(), "coalescingEnabled", false);
        setBooleanField(term140090, term140090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140090, term140090.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KTextArea");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportBlankReview", argTypes, term140090, args);
    }

};


