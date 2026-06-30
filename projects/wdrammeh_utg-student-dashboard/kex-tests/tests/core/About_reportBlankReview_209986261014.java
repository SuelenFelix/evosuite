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
     Object term140086;

    public About_reportBlankReview_209986261014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140086 = newInstance(Class.forName("core.About"));
        setField(term140086, term140086.getClass(), "midCard", null);
        setField(term140086, term140086.getClass(), "midLayer", null);
        setIntField(term140086, term140086.getClass(), "defaultCloseOperation", 0);
        setField(term140086, term140086.getClass(), "rootPane", null);
        setBooleanField(term140086, term140086.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140086, term140086.getClass(), "transferHandler", null);
        setField(term140086, term140086.getClass(), "accessibleContext", null);
        setBooleanField(term140086, term140086.getClass(), "resizable", false);
        setBooleanField(term140086, term140086.getClass(), "undecorated", false);
        setBooleanField(term140086, term140086.getClass(), "initialized", false);
        setBooleanField(term140086, term140086.getClass(), "modal", false);
        setField(term140086, term140086.getClass(), "modalityType", null);
        setField(term140086, term140086.getClass(), "blockedWindows", null);
        setField(term140086, term140086.getClass(), "title", null);
        setField(term140086, term140086.getClass(), "modalFilter", null);
        setField(term140086, term140086.getClass(), "secondaryLoop", null);
        setBooleanField(term140086, term140086.getClass(), "isInHide", false);
        setBooleanField(term140086, term140086.getClass(), "isInDispose", false);
        setField(term140086, term140086.getClass(), "warningString", null);
        setField(term140086, term140086.getClass(), "icons", null);
        setField(term140086, term140086.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140086, term140086.getClass(), "syncLWRequests", false);
        setBooleanField(term140086, term140086.getClass(), "beforeFirstShow", false);
        setBooleanField(term140086, term140086.getClass(), "disposing", false);
        setField(term140086, term140086.getClass(), "disposerRecord", null);
        setIntField(term140086, term140086.getClass(), "state", 0);
        setBooleanField(term140086, term140086.getClass(), "alwaysOnTop", false);
        setField(term140086, term140086.getClass(), "ownedWindowList", null);
        setField(term140086, term140086.getClass(), "weakThis", null);
        setBooleanField(term140086, term140086.getClass(), "showWithParent", false);
        setField(term140086, term140086.getClass(), "modalBlocker", null);
        setField(term140086, term140086.getClass(), "modalExclusionType", null);
        setField(term140086, term140086.getClass(), "windowListener", null);
        setField(term140086, term140086.getClass(), "windowStateListener", null);
        setField(term140086, term140086.getClass(), "windowFocusListener", null);
        setField(term140086, term140086.getClass(), "inputContext", null);
        setField(term140086, term140086.getClass(), "inputContextLock", null);
        setField(term140086, term140086.getClass(), "focusMgr", null);
        setBooleanField(term140086, term140086.getClass(), "focusableWindowState", false);
        setBooleanField(term140086, term140086.getClass(), "autoRequestFocus", false);
        setBooleanField(term140086, term140086.getClass(), "isInShow", false);
        setFloatField(term140086, term140086.getClass(), "opacity", 0.0F);
        setField(term140086, term140086.getClass(), "shape", null);
        setBooleanField(term140086, term140086.getClass(), "isTrayIconWindow", false);
        setIntField(term140086, term140086.getClass(), "securityWarningWidth", 0);
        setIntField(term140086, term140086.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140086, term140086.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140086, term140086.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140086, term140086.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140086, term140086.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140086, term140086.getClass(), "anchor", null);
        setField(term140086, term140086.getClass(), "type", null);
        setIntField(term140086, term140086.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140086, term140086.getClass(), "locationByPlatform", false);
        setField(term140086, term140086.getClass(), "component", null);
        setField(term140086, term140086.getClass(), "layoutMgr", null);
        setField(term140086, term140086.getClass(), "dispatcher", null);
        setField(term140086, term140086.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140086, term140086.getClass(), "focusCycleRoot", false);
        setBooleanField(term140086, term140086.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140086, term140086.getClass(), "printingThreads", null);
        setBooleanField(term140086, term140086.getClass(), "printing", false);
        setField(term140086, term140086.getClass(), "containerListener", null);
        setIntField(term140086, term140086.getClass(), "listeningChildren", 0);
        setIntField(term140086, term140086.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140086, term140086.getClass(), "descendantsCount", 0);
        setField(term140086, term140086.getClass(), "preserveBackgroundColor", null);
        setIntField(term140086, term140086.getClass(), "numOfHWComponents", 0);
        setIntField(term140086, term140086.getClass(), "numOfLWComponents", 0);
        setField(term140086, term140086.getClass(), "modalComp", null);
        setField(term140086, term140086.getClass(), "modalAppContext", null);
        setIntField(term140086, term140086.getClass(), "containerSerializedDataVersion", 0);
        setField(term140086, term140086.getClass(), "peer", null);
        setField(term140086, term140086.getClass(), "parent", null);
        setField(term140086, term140086.getClass(), "appContext", null);
        setIntField(term140086, term140086.getClass(), "x", 0);
        setIntField(term140086, term140086.getClass(), "y", 0);
        setIntField(term140086, term140086.getClass(), "width", 0);
        setIntField(term140086, term140086.getClass(), "height", 0);
        setField(term140086, term140086.getClass(), "foreground", null);
        setField(term140086, term140086.getClass(), "background", null);
        setField(term140086, term140086.getClass(), "font", null);
        setField(term140086, term140086.getClass(), "peerFont", null);
        setField(term140086, term140086.getClass(), "cursor", null);
        setField(term140086, term140086.getClass(), "locale", null);
        setField(term140086, term140086.getClass(), "graphicsConfig", null);
        setField(term140086, term140086.getClass(), "bufferStrategy", null);
        setBooleanField(term140086, term140086.getClass(), "ignoreRepaint", false);
        setBooleanField(term140086, term140086.getClass(), "visible", false);
        setBooleanField(term140086, term140086.getClass(), "enabled", false);
        setBooleanField(term140086, term140086.getClass(), "valid", false);
        setField(term140086, term140086.getClass(), "dropTarget", null);
        setField(term140086, term140086.getClass(), "popups", null);
        setField(term140086, term140086.getClass(), "name", null);
        setBooleanField(term140086, term140086.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140086, term140086.getClass(), "focusable", false);
        setIntField(term140086, term140086.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140086, term140086.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140086, term140086.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140086, term140086.getClass(), "acc", null);
        setField(term140086, term140086.getClass(), "minSize", null);
        setBooleanField(term140086, term140086.getClass(), "minSizeSet", false);
        setField(term140086, term140086.getClass(), "prefSize", null);
        setBooleanField(term140086, term140086.getClass(), "prefSizeSet", false);
        setField(term140086, term140086.getClass(), "maxSize", null);
        setBooleanField(term140086, term140086.getClass(), "maxSizeSet", false);
        setField(term140086, term140086.getClass(), "componentOrientation", null);
        setBooleanField(term140086, term140086.getClass(), "newEventsOnly", false);
        setField(term140086, term140086.getClass(), "componentListener", null);
        setField(term140086, term140086.getClass(), "focusListener", null);
        setField(term140086, term140086.getClass(), "hierarchyListener", null);
        setField(term140086, term140086.getClass(), "hierarchyBoundsListener", null);
        setField(term140086, term140086.getClass(), "keyListener", null);
        setField(term140086, term140086.getClass(), "mouseListener", null);
        setField(term140086, term140086.getClass(), "mouseMotionListener", null);
        setField(term140086, term140086.getClass(), "mouseWheelListener", null);
        setField(term140086, term140086.getClass(), "inputMethodListener", null);
        setLongField(term140086, term140086.getClass(), "eventMask", 0L);
        setField(term140086, term140086.getClass(), "changeSupport", null);
        setField(term140086, term140086.getClass(), "objectLock", null);
        setBooleanField(term140086, term140086.getClass(), "isPacked", false);
        setIntField(term140086, term140086.getClass(), "boundsOp", 0);
        setField(term140086, term140086.getClass(), "compoundShape", null);
        setField(term140086, term140086.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140086, term140086.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140086, term140086.getClass(), "backgroundEraseDisabled", false);
        setField(term140086, term140086.getClass(), "eventCache", null);
        setBooleanField(term140086, term140086.getClass(), "coalescingEnabled", false);
        setBooleanField(term140086, term140086.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140086, term140086.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KTextArea");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportBlankReview", argTypes, term140086, args);
    }

};


