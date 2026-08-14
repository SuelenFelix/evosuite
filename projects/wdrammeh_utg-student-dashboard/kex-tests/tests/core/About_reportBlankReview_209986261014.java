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
     Object term140088;

    public About_reportBlankReview_209986261014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140088 = newInstance(Class.forName("core.About"));
        setField(term140088, term140088.getClass(), "midCard", null);
        setField(term140088, term140088.getClass(), "midLayer", null);
        setIntField(term140088, term140088.getClass(), "defaultCloseOperation", 0);
        setField(term140088, term140088.getClass(), "rootPane", null);
        setBooleanField(term140088, term140088.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140088, term140088.getClass(), "transferHandler", null);
        setField(term140088, term140088.getClass(), "accessibleContext", null);
        setBooleanField(term140088, term140088.getClass(), "resizable", false);
        setBooleanField(term140088, term140088.getClass(), "undecorated", false);
        setBooleanField(term140088, term140088.getClass(), "initialized", false);
        setBooleanField(term140088, term140088.getClass(), "modal", false);
        setField(term140088, term140088.getClass(), "modalityType", null);
        setField(term140088, term140088.getClass(), "blockedWindows", null);
        setField(term140088, term140088.getClass(), "title", null);
        setField(term140088, term140088.getClass(), "modalFilter", null);
        setField(term140088, term140088.getClass(), "secondaryLoop", null);
        setBooleanField(term140088, term140088.getClass(), "isInHide", false);
        setBooleanField(term140088, term140088.getClass(), "isInDispose", false);
        setField(term140088, term140088.getClass(), "warningString", null);
        setField(term140088, term140088.getClass(), "icons", null);
        setField(term140088, term140088.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140088, term140088.getClass(), "syncLWRequests", false);
        setBooleanField(term140088, term140088.getClass(), "beforeFirstShow", false);
        setBooleanField(term140088, term140088.getClass(), "disposing", false);
        setField(term140088, term140088.getClass(), "disposerRecord", null);
        setIntField(term140088, term140088.getClass(), "state", 0);
        setBooleanField(term140088, term140088.getClass(), "alwaysOnTop", false);
        setField(term140088, term140088.getClass(), "ownedWindowList", null);
        setField(term140088, term140088.getClass(), "weakThis", null);
        setBooleanField(term140088, term140088.getClass(), "showWithParent", false);
        setField(term140088, term140088.getClass(), "modalBlocker", null);
        setField(term140088, term140088.getClass(), "modalExclusionType", null);
        setField(term140088, term140088.getClass(), "windowListener", null);
        setField(term140088, term140088.getClass(), "windowStateListener", null);
        setField(term140088, term140088.getClass(), "windowFocusListener", null);
        setField(term140088, term140088.getClass(), "inputContext", null);
        setField(term140088, term140088.getClass(), "inputContextLock", null);
        setField(term140088, term140088.getClass(), "focusMgr", null);
        setBooleanField(term140088, term140088.getClass(), "focusableWindowState", false);
        setBooleanField(term140088, term140088.getClass(), "autoRequestFocus", false);
        setBooleanField(term140088, term140088.getClass(), "isInShow", false);
        setFloatField(term140088, term140088.getClass(), "opacity", 0.0F);
        setField(term140088, term140088.getClass(), "shape", null);
        setBooleanField(term140088, term140088.getClass(), "isTrayIconWindow", false);
        setIntField(term140088, term140088.getClass(), "securityWarningWidth", 0);
        setIntField(term140088, term140088.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140088, term140088.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140088, term140088.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140088, term140088.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140088, term140088.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140088, term140088.getClass(), "anchor", null);
        setField(term140088, term140088.getClass(), "type", null);
        setIntField(term140088, term140088.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140088, term140088.getClass(), "locationByPlatform", false);
        setField(term140088, term140088.getClass(), "component", null);
        setField(term140088, term140088.getClass(), "layoutMgr", null);
        setField(term140088, term140088.getClass(), "dispatcher", null);
        setField(term140088, term140088.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140088, term140088.getClass(), "focusCycleRoot", false);
        setBooleanField(term140088, term140088.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140088, term140088.getClass(), "printingThreads", null);
        setBooleanField(term140088, term140088.getClass(), "printing", false);
        setField(term140088, term140088.getClass(), "containerListener", null);
        setIntField(term140088, term140088.getClass(), "listeningChildren", 0);
        setIntField(term140088, term140088.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140088, term140088.getClass(), "descendantsCount", 0);
        setField(term140088, term140088.getClass(), "preserveBackgroundColor", null);
        setIntField(term140088, term140088.getClass(), "numOfHWComponents", 0);
        setIntField(term140088, term140088.getClass(), "numOfLWComponents", 0);
        setField(term140088, term140088.getClass(), "modalComp", null);
        setField(term140088, term140088.getClass(), "modalAppContext", null);
        setIntField(term140088, term140088.getClass(), "containerSerializedDataVersion", 0);
        setField(term140088, term140088.getClass(), "peer", null);
        setField(term140088, term140088.getClass(), "parent", null);
        setField(term140088, term140088.getClass(), "appContext", null);
        setIntField(term140088, term140088.getClass(), "x", 0);
        setIntField(term140088, term140088.getClass(), "y", 0);
        setIntField(term140088, term140088.getClass(), "width", 0);
        setIntField(term140088, term140088.getClass(), "height", 0);
        setField(term140088, term140088.getClass(), "foreground", null);
        setField(term140088, term140088.getClass(), "background", null);
        setField(term140088, term140088.getClass(), "font", null);
        setField(term140088, term140088.getClass(), "peerFont", null);
        setField(term140088, term140088.getClass(), "cursor", null);
        setField(term140088, term140088.getClass(), "locale", null);
        setField(term140088, term140088.getClass(), "graphicsConfig", null);
        setField(term140088, term140088.getClass(), "bufferStrategy", null);
        setBooleanField(term140088, term140088.getClass(), "ignoreRepaint", false);
        setBooleanField(term140088, term140088.getClass(), "visible", false);
        setBooleanField(term140088, term140088.getClass(), "enabled", false);
        setBooleanField(term140088, term140088.getClass(), "valid", false);
        setField(term140088, term140088.getClass(), "dropTarget", null);
        setField(term140088, term140088.getClass(), "popups", null);
        setField(term140088, term140088.getClass(), "name", null);
        setBooleanField(term140088, term140088.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140088, term140088.getClass(), "focusable", false);
        setIntField(term140088, term140088.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140088, term140088.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140088, term140088.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140088, term140088.getClass(), "acc", null);
        setField(term140088, term140088.getClass(), "minSize", null);
        setBooleanField(term140088, term140088.getClass(), "minSizeSet", false);
        setField(term140088, term140088.getClass(), "prefSize", null);
        setBooleanField(term140088, term140088.getClass(), "prefSizeSet", false);
        setField(term140088, term140088.getClass(), "maxSize", null);
        setBooleanField(term140088, term140088.getClass(), "maxSizeSet", false);
        setField(term140088, term140088.getClass(), "componentOrientation", null);
        setBooleanField(term140088, term140088.getClass(), "newEventsOnly", false);
        setField(term140088, term140088.getClass(), "componentListener", null);
        setField(term140088, term140088.getClass(), "focusListener", null);
        setField(term140088, term140088.getClass(), "hierarchyListener", null);
        setField(term140088, term140088.getClass(), "hierarchyBoundsListener", null);
        setField(term140088, term140088.getClass(), "keyListener", null);
        setField(term140088, term140088.getClass(), "mouseListener", null);
        setField(term140088, term140088.getClass(), "mouseMotionListener", null);
        setField(term140088, term140088.getClass(), "mouseWheelListener", null);
        setField(term140088, term140088.getClass(), "inputMethodListener", null);
        setLongField(term140088, term140088.getClass(), "eventMask", 0L);
        setField(term140088, term140088.getClass(), "changeSupport", null);
        setField(term140088, term140088.getClass(), "objectLock", null);
        setBooleanField(term140088, term140088.getClass(), "isPacked", false);
        setIntField(term140088, term140088.getClass(), "boundsOp", 0);
        setField(term140088, term140088.getClass(), "compoundShape", null);
        setField(term140088, term140088.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140088, term140088.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140088, term140088.getClass(), "backgroundEraseDisabled", false);
        setField(term140088, term140088.getClass(), "eventCache", null);
        setBooleanField(term140088, term140088.getClass(), "coalescingEnabled", false);
        setBooleanField(term140088, term140088.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140088, term140088.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KTextArea");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "reportBlankReview", argTypes, term140088, args);
    }

};


