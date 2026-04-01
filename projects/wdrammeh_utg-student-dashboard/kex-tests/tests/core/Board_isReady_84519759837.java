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

public class Board_isReady_84519759837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198651;

    public Board_isReady_84519759837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198651 = newInstance(Class.forName("core.Board"));
        setField(term198651, term198651.getClass(), "contentPanel", null);
        setField(term198651, term198651.getClass(), "bodyLayer", null);
        setField(term198651, term198651.getClass(), "cardLayout", null);
        setField(term198651, term198651.getClass(), "semesterActivity", null);
        setField(term198651, term198651.getClass(), "moduleActivity", null);
        setField(term198651, term198651.getClass(), "settingsUI", null);
        setField(term198651, term198651.getClass(), "transcriptActivity", null);
        setField(term198651, term198651.getClass(), "analysisActivity", null);
        setField(term198651, term198651.getClass(), "helpActivity", null);
        setField(term198651, term198651.getClass(), "about", null);
        setField(term198651, term198651.getClass(), "taskActivity", null);
        setField(term198651, term198651.getClass(), "newsPresent", null);
        setField(term198651, term198651.getClass(), "alertActivity", null);
        setIntField(term198651, term198651.getClass(), "defaultCloseOperation", 0);
        setField(term198651, term198651.getClass(), "transferHandler", null);
        setField(term198651, term198651.getClass(), "rootPane", null);
        setBooleanField(term198651, term198651.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198651, term198651.getClass(), "accessibleContext", null);
        setField(term198651, term198651.getClass(), "maximizedBounds", null);
        setField(term198651, term198651.getClass(), "title", null);
        setField(term198651, term198651.getClass(), "menuBar", null);
        setBooleanField(term198651, term198651.getClass(), "resizable", false);
        setBooleanField(term198651, term198651.getClass(), "undecorated", false);
        setBooleanField(term198651, term198651.getClass(), "mbManagement", false);
        setIntField(term198651, term198651.getClass(), "state", 0);
        setField(term198651, term198651.getClass(), "ownedWindows", null);
        setIntField(term198651, term198651.getClass(), "frameSerializedDataVersion", 0);
        setField(term198651, term198651.getClass(), "warningString", null);
        setField(term198651, term198651.getClass(), "icons", null);
        setField(term198651, term198651.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198651, term198651.getClass(), "syncLWRequests", false);
        setBooleanField(term198651, term198651.getClass(), "beforeFirstShow", false);
        setBooleanField(term198651, term198651.getClass(), "disposing", false);
        setField(term198651, term198651.getClass(), "disposerRecord", null);
        setBooleanField(term198651, term198651.getClass(), "alwaysOnTop", false);
        setField(term198651, term198651.getClass(), "ownedWindowList", null);
        setField(term198651, term198651.getClass(), "weakThis", null);
        setBooleanField(term198651, term198651.getClass(), "showWithParent", false);
        setField(term198651, term198651.getClass(), "modalBlocker", null);
        setField(term198651, term198651.getClass(), "modalExclusionType", null);
        setField(term198651, term198651.getClass(), "windowListener", null);
        setField(term198651, term198651.getClass(), "windowStateListener", null);
        setField(term198651, term198651.getClass(), "windowFocusListener", null);
        setField(term198651, term198651.getClass(), "inputContext", null);
        setField(term198651, term198651.getClass(), "inputContextLock", null);
        setField(term198651, term198651.getClass(), "focusMgr", null);
        setBooleanField(term198651, term198651.getClass(), "focusableWindowState", false);
        setBooleanField(term198651, term198651.getClass(), "autoRequestFocus", false);
        setBooleanField(term198651, term198651.getClass(), "isInShow", false);
        setFloatField(term198651, term198651.getClass(), "opacity", 0.0F);
        setField(term198651, term198651.getClass(), "shape", null);
        setBooleanField(term198651, term198651.getClass(), "isTrayIconWindow", false);
        setIntField(term198651, term198651.getClass(), "securityWarningWidth", 0);
        setIntField(term198651, term198651.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198651, term198651.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198651, term198651.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198651, term198651.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198651, term198651.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198651, term198651.getClass(), "anchor", null);
        setField(term198651, term198651.getClass(), "type", null);
        setIntField(term198651, term198651.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198651, term198651.getClass(), "locationByPlatform", false);
        setField(term198651, term198651.getClass(), "component", null);
        setField(term198651, term198651.getClass(), "layoutMgr", null);
        setField(term198651, term198651.getClass(), "dispatcher", null);
        setField(term198651, term198651.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198651, term198651.getClass(), "focusCycleRoot", false);
        setBooleanField(term198651, term198651.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198651, term198651.getClass(), "printingThreads", null);
        setBooleanField(term198651, term198651.getClass(), "printing", false);
        setField(term198651, term198651.getClass(), "containerListener", null);
        setIntField(term198651, term198651.getClass(), "listeningChildren", 0);
        setIntField(term198651, term198651.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198651, term198651.getClass(), "descendantsCount", 0);
        setField(term198651, term198651.getClass(), "preserveBackgroundColor", null);
        setIntField(term198651, term198651.getClass(), "numOfHWComponents", 0);
        setIntField(term198651, term198651.getClass(), "numOfLWComponents", 0);
        setField(term198651, term198651.getClass(), "modalComp", null);
        setField(term198651, term198651.getClass(), "modalAppContext", null);
        setIntField(term198651, term198651.getClass(), "containerSerializedDataVersion", 0);
        setField(term198651, term198651.getClass(), "peer", null);
        setField(term198651, term198651.getClass(), "parent", null);
        setField(term198651, term198651.getClass(), "appContext", null);
        setIntField(term198651, term198651.getClass(), "x", 0);
        setIntField(term198651, term198651.getClass(), "y", 0);
        setIntField(term198651, term198651.getClass(), "width", 0);
        setIntField(term198651, term198651.getClass(), "height", 0);
        setField(term198651, term198651.getClass(), "foreground", null);
        setField(term198651, term198651.getClass(), "background", null);
        setField(term198651, term198651.getClass(), "font", null);
        setField(term198651, term198651.getClass(), "peerFont", null);
        setField(term198651, term198651.getClass(), "cursor", null);
        setField(term198651, term198651.getClass(), "locale", null);
        setField(term198651, term198651.getClass(), "graphicsConfig", null);
        setField(term198651, term198651.getClass(), "bufferStrategy", null);
        setBooleanField(term198651, term198651.getClass(), "ignoreRepaint", false);
        setBooleanField(term198651, term198651.getClass(), "visible", false);
        setBooleanField(term198651, term198651.getClass(), "enabled", false);
        setBooleanField(term198651, term198651.getClass(), "valid", false);
        setField(term198651, term198651.getClass(), "dropTarget", null);
        setField(term198651, term198651.getClass(), "popups", null);
        setField(term198651, term198651.getClass(), "name", null);
        setBooleanField(term198651, term198651.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198651, term198651.getClass(), "focusable", false);
        setIntField(term198651, term198651.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198651, term198651.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198651, term198651.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198651, term198651.getClass(), "acc", null);
        setField(term198651, term198651.getClass(), "minSize", null);
        setBooleanField(term198651, term198651.getClass(), "minSizeSet", false);
        setField(term198651, term198651.getClass(), "prefSize", null);
        setBooleanField(term198651, term198651.getClass(), "prefSizeSet", false);
        setField(term198651, term198651.getClass(), "maxSize", null);
        setBooleanField(term198651, term198651.getClass(), "maxSizeSet", false);
        setField(term198651, term198651.getClass(), "componentOrientation", null);
        setBooleanField(term198651, term198651.getClass(), "newEventsOnly", false);
        setField(term198651, term198651.getClass(), "componentListener", null);
        setField(term198651, term198651.getClass(), "focusListener", null);
        setField(term198651, term198651.getClass(), "hierarchyListener", null);
        setField(term198651, term198651.getClass(), "hierarchyBoundsListener", null);
        setField(term198651, term198651.getClass(), "keyListener", null);
        setField(term198651, term198651.getClass(), "mouseListener", null);
        setField(term198651, term198651.getClass(), "mouseMotionListener", null);
        setField(term198651, term198651.getClass(), "mouseWheelListener", null);
        setField(term198651, term198651.getClass(), "inputMethodListener", null);
        setLongField(term198651, term198651.getClass(), "eventMask", 0L);
        setField(term198651, term198651.getClass(), "changeSupport", null);
        setField(term198651, term198651.getClass(), "objectLock", null);
        setBooleanField(term198651, term198651.getClass(), "isPacked", false);
        setIntField(term198651, term198651.getClass(), "boundsOp", 0);
        setField(term198651, term198651.getClass(), "compoundShape", null);
        setField(term198651, term198651.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198651, term198651.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198651, term198651.getClass(), "backgroundEraseDisabled", false);
        setField(term198651, term198651.getClass(), "eventCache", null);
        setBooleanField(term198651, term198651.getClass(), "coalescingEnabled", false);
        setBooleanField(term198651, term198651.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198651, term198651.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReady", argTypes, term198651, args);
    }

};


