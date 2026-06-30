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

public class Board_attachListeners_7573895458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194121;

    public Board_attachListeners_7573895458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194121 = newInstance(Class.forName("core.Board"));
        setField(term194121, term194121.getClass(), "contentPanel", null);
        setField(term194121, term194121.getClass(), "bodyLayer", null);
        setField(term194121, term194121.getClass(), "cardLayout", null);
        setField(term194121, term194121.getClass(), "semesterActivity", null);
        setField(term194121, term194121.getClass(), "moduleActivity", null);
        setField(term194121, term194121.getClass(), "settingsUI", null);
        setField(term194121, term194121.getClass(), "transcriptActivity", null);
        setField(term194121, term194121.getClass(), "analysisActivity", null);
        setField(term194121, term194121.getClass(), "helpActivity", null);
        setField(term194121, term194121.getClass(), "about", null);
        setField(term194121, term194121.getClass(), "taskActivity", null);
        setField(term194121, term194121.getClass(), "newsPresent", null);
        setField(term194121, term194121.getClass(), "alertActivity", null);
        setIntField(term194121, term194121.getClass(), "defaultCloseOperation", 0);
        setField(term194121, term194121.getClass(), "transferHandler", null);
        setField(term194121, term194121.getClass(), "rootPane", null);
        setBooleanField(term194121, term194121.getClass(), "rootPaneCheckingEnabled", false);
        setField(term194121, term194121.getClass(), "accessibleContext", null);
        setField(term194121, term194121.getClass(), "maximizedBounds", null);
        setField(term194121, term194121.getClass(), "title", null);
        setField(term194121, term194121.getClass(), "menuBar", null);
        setBooleanField(term194121, term194121.getClass(), "resizable", false);
        setBooleanField(term194121, term194121.getClass(), "undecorated", false);
        setBooleanField(term194121, term194121.getClass(), "mbManagement", false);
        setIntField(term194121, term194121.getClass(), "state", 0);
        setField(term194121, term194121.getClass(), "ownedWindows", null);
        setIntField(term194121, term194121.getClass(), "frameSerializedDataVersion", 0);
        setField(term194121, term194121.getClass(), "warningString", null);
        setField(term194121, term194121.getClass(), "icons", null);
        setField(term194121, term194121.getClass(), "temporaryLostComponent", null);
        setBooleanField(term194121, term194121.getClass(), "syncLWRequests", false);
        setBooleanField(term194121, term194121.getClass(), "beforeFirstShow", false);
        setBooleanField(term194121, term194121.getClass(), "disposing", false);
        setField(term194121, term194121.getClass(), "disposerRecord", null);
        setBooleanField(term194121, term194121.getClass(), "alwaysOnTop", false);
        setField(term194121, term194121.getClass(), "ownedWindowList", null);
        setField(term194121, term194121.getClass(), "weakThis", null);
        setBooleanField(term194121, term194121.getClass(), "showWithParent", false);
        setField(term194121, term194121.getClass(), "modalBlocker", null);
        setField(term194121, term194121.getClass(), "modalExclusionType", null);
        setField(term194121, term194121.getClass(), "windowListener", null);
        setField(term194121, term194121.getClass(), "windowStateListener", null);
        setField(term194121, term194121.getClass(), "windowFocusListener", null);
        setField(term194121, term194121.getClass(), "inputContext", null);
        setField(term194121, term194121.getClass(), "inputContextLock", null);
        setField(term194121, term194121.getClass(), "focusMgr", null);
        setBooleanField(term194121, term194121.getClass(), "focusableWindowState", false);
        setBooleanField(term194121, term194121.getClass(), "autoRequestFocus", false);
        setBooleanField(term194121, term194121.getClass(), "isInShow", false);
        setFloatField(term194121, term194121.getClass(), "opacity", 0.0F);
        setField(term194121, term194121.getClass(), "shape", null);
        setBooleanField(term194121, term194121.getClass(), "isTrayIconWindow", false);
        setIntField(term194121, term194121.getClass(), "securityWarningWidth", 0);
        setIntField(term194121, term194121.getClass(), "securityWarningHeight", 0);
        setDoubleField(term194121, term194121.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term194121, term194121.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term194121, term194121.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term194121, term194121.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term194121, term194121.getClass(), "anchor", null);
        setField(term194121, term194121.getClass(), "type", null);
        setIntField(term194121, term194121.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term194121, term194121.getClass(), "locationByPlatform", false);
        setField(term194121, term194121.getClass(), "component", null);
        setField(term194121, term194121.getClass(), "layoutMgr", null);
        setField(term194121, term194121.getClass(), "dispatcher", null);
        setField(term194121, term194121.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term194121, term194121.getClass(), "focusCycleRoot", false);
        setBooleanField(term194121, term194121.getClass(), "focusTraversalPolicyProvider", false);
        setField(term194121, term194121.getClass(), "printingThreads", null);
        setBooleanField(term194121, term194121.getClass(), "printing", false);
        setField(term194121, term194121.getClass(), "containerListener", null);
        setIntField(term194121, term194121.getClass(), "listeningChildren", 0);
        setIntField(term194121, term194121.getClass(), "listeningBoundsChildren", 0);
        setIntField(term194121, term194121.getClass(), "descendantsCount", 0);
        setField(term194121, term194121.getClass(), "preserveBackgroundColor", null);
        setIntField(term194121, term194121.getClass(), "numOfHWComponents", 0);
        setIntField(term194121, term194121.getClass(), "numOfLWComponents", 0);
        setField(term194121, term194121.getClass(), "modalComp", null);
        setField(term194121, term194121.getClass(), "modalAppContext", null);
        setIntField(term194121, term194121.getClass(), "containerSerializedDataVersion", 0);
        setField(term194121, term194121.getClass(), "peer", null);
        setField(term194121, term194121.getClass(), "parent", null);
        setField(term194121, term194121.getClass(), "appContext", null);
        setIntField(term194121, term194121.getClass(), "x", 0);
        setIntField(term194121, term194121.getClass(), "y", 0);
        setIntField(term194121, term194121.getClass(), "width", 0);
        setIntField(term194121, term194121.getClass(), "height", 0);
        setField(term194121, term194121.getClass(), "foreground", null);
        setField(term194121, term194121.getClass(), "background", null);
        setField(term194121, term194121.getClass(), "font", null);
        setField(term194121, term194121.getClass(), "peerFont", null);
        setField(term194121, term194121.getClass(), "cursor", null);
        setField(term194121, term194121.getClass(), "locale", null);
        setField(term194121, term194121.getClass(), "graphicsConfig", null);
        setField(term194121, term194121.getClass(), "bufferStrategy", null);
        setBooleanField(term194121, term194121.getClass(), "ignoreRepaint", false);
        setBooleanField(term194121, term194121.getClass(), "visible", false);
        setBooleanField(term194121, term194121.getClass(), "enabled", false);
        setBooleanField(term194121, term194121.getClass(), "valid", false);
        setField(term194121, term194121.getClass(), "dropTarget", null);
        setField(term194121, term194121.getClass(), "popups", null);
        setField(term194121, term194121.getClass(), "name", null);
        setBooleanField(term194121, term194121.getClass(), "nameExplicitlySet", false);
        setBooleanField(term194121, term194121.getClass(), "focusable", false);
        setIntField(term194121, term194121.getClass(), "isFocusTraversableOverridden", 0);
        setField(term194121, term194121.getClass(), "focusTraversalKeys", null);
        setBooleanField(term194121, term194121.getClass(), "focusTraversalKeysEnabled", false);
        setField(term194121, term194121.getClass(), "acc", null);
        setField(term194121, term194121.getClass(), "minSize", null);
        setBooleanField(term194121, term194121.getClass(), "minSizeSet", false);
        setField(term194121, term194121.getClass(), "prefSize", null);
        setBooleanField(term194121, term194121.getClass(), "prefSizeSet", false);
        setField(term194121, term194121.getClass(), "maxSize", null);
        setBooleanField(term194121, term194121.getClass(), "maxSizeSet", false);
        setField(term194121, term194121.getClass(), "componentOrientation", null);
        setBooleanField(term194121, term194121.getClass(), "newEventsOnly", false);
        setField(term194121, term194121.getClass(), "componentListener", null);
        setField(term194121, term194121.getClass(), "focusListener", null);
        setField(term194121, term194121.getClass(), "hierarchyListener", null);
        setField(term194121, term194121.getClass(), "hierarchyBoundsListener", null);
        setField(term194121, term194121.getClass(), "keyListener", null);
        setField(term194121, term194121.getClass(), "mouseListener", null);
        setField(term194121, term194121.getClass(), "mouseMotionListener", null);
        setField(term194121, term194121.getClass(), "mouseWheelListener", null);
        setField(term194121, term194121.getClass(), "inputMethodListener", null);
        setLongField(term194121, term194121.getClass(), "eventMask", 0L);
        setField(term194121, term194121.getClass(), "changeSupport", null);
        setField(term194121, term194121.getClass(), "objectLock", null);
        setBooleanField(term194121, term194121.getClass(), "isPacked", false);
        setIntField(term194121, term194121.getClass(), "boundsOp", 0);
        setField(term194121, term194121.getClass(), "compoundShape", null);
        setField(term194121, term194121.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term194121, term194121.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term194121, term194121.getClass(), "backgroundEraseDisabled", false);
        setField(term194121, term194121.getClass(), "eventCache", null);
        setBooleanField(term194121, term194121.getClass(), "coalescingEnabled", false);
        setBooleanField(term194121, term194121.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term194121, term194121.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "attachListeners", argTypes, term194121, args);
    }

};


