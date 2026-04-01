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

public class Board_getInstance_18484586636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198591;

    public Board_getInstance_18484586636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198591 = newInstance(Class.forName("core.Board"));
        setField(term198591, term198591.getClass(), "contentPanel", null);
        setField(term198591, term198591.getClass(), "bodyLayer", null);
        setField(term198591, term198591.getClass(), "cardLayout", null);
        setField(term198591, term198591.getClass(), "semesterActivity", null);
        setField(term198591, term198591.getClass(), "moduleActivity", null);
        setField(term198591, term198591.getClass(), "settingsUI", null);
        setField(term198591, term198591.getClass(), "transcriptActivity", null);
        setField(term198591, term198591.getClass(), "analysisActivity", null);
        setField(term198591, term198591.getClass(), "helpActivity", null);
        setField(term198591, term198591.getClass(), "about", null);
        setField(term198591, term198591.getClass(), "taskActivity", null);
        setField(term198591, term198591.getClass(), "newsPresent", null);
        setField(term198591, term198591.getClass(), "alertActivity", null);
        setIntField(term198591, term198591.getClass(), "defaultCloseOperation", 0);
        setField(term198591, term198591.getClass(), "transferHandler", null);
        setField(term198591, term198591.getClass(), "rootPane", null);
        setBooleanField(term198591, term198591.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198591, term198591.getClass(), "accessibleContext", null);
        setField(term198591, term198591.getClass(), "maximizedBounds", null);
        setField(term198591, term198591.getClass(), "title", null);
        setField(term198591, term198591.getClass(), "menuBar", null);
        setBooleanField(term198591, term198591.getClass(), "resizable", false);
        setBooleanField(term198591, term198591.getClass(), "undecorated", false);
        setBooleanField(term198591, term198591.getClass(), "mbManagement", false);
        setIntField(term198591, term198591.getClass(), "state", 0);
        setField(term198591, term198591.getClass(), "ownedWindows", null);
        setIntField(term198591, term198591.getClass(), "frameSerializedDataVersion", 0);
        setField(term198591, term198591.getClass(), "warningString", null);
        setField(term198591, term198591.getClass(), "icons", null);
        setField(term198591, term198591.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198591, term198591.getClass(), "syncLWRequests", false);
        setBooleanField(term198591, term198591.getClass(), "beforeFirstShow", false);
        setBooleanField(term198591, term198591.getClass(), "disposing", false);
        setField(term198591, term198591.getClass(), "disposerRecord", null);
        setBooleanField(term198591, term198591.getClass(), "alwaysOnTop", false);
        setField(term198591, term198591.getClass(), "ownedWindowList", null);
        setField(term198591, term198591.getClass(), "weakThis", null);
        setBooleanField(term198591, term198591.getClass(), "showWithParent", false);
        setField(term198591, term198591.getClass(), "modalBlocker", null);
        setField(term198591, term198591.getClass(), "modalExclusionType", null);
        setField(term198591, term198591.getClass(), "windowListener", null);
        setField(term198591, term198591.getClass(), "windowStateListener", null);
        setField(term198591, term198591.getClass(), "windowFocusListener", null);
        setField(term198591, term198591.getClass(), "inputContext", null);
        setField(term198591, term198591.getClass(), "inputContextLock", null);
        setField(term198591, term198591.getClass(), "focusMgr", null);
        setBooleanField(term198591, term198591.getClass(), "focusableWindowState", false);
        setBooleanField(term198591, term198591.getClass(), "autoRequestFocus", false);
        setBooleanField(term198591, term198591.getClass(), "isInShow", false);
        setFloatField(term198591, term198591.getClass(), "opacity", 0.0F);
        setField(term198591, term198591.getClass(), "shape", null);
        setBooleanField(term198591, term198591.getClass(), "isTrayIconWindow", false);
        setIntField(term198591, term198591.getClass(), "securityWarningWidth", 0);
        setIntField(term198591, term198591.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198591, term198591.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198591, term198591.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198591, term198591.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198591, term198591.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198591, term198591.getClass(), "anchor", null);
        setField(term198591, term198591.getClass(), "type", null);
        setIntField(term198591, term198591.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198591, term198591.getClass(), "locationByPlatform", false);
        setField(term198591, term198591.getClass(), "component", null);
        setField(term198591, term198591.getClass(), "layoutMgr", null);
        setField(term198591, term198591.getClass(), "dispatcher", null);
        setField(term198591, term198591.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198591, term198591.getClass(), "focusCycleRoot", false);
        setBooleanField(term198591, term198591.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198591, term198591.getClass(), "printingThreads", null);
        setBooleanField(term198591, term198591.getClass(), "printing", false);
        setField(term198591, term198591.getClass(), "containerListener", null);
        setIntField(term198591, term198591.getClass(), "listeningChildren", 0);
        setIntField(term198591, term198591.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198591, term198591.getClass(), "descendantsCount", 0);
        setField(term198591, term198591.getClass(), "preserveBackgroundColor", null);
        setIntField(term198591, term198591.getClass(), "numOfHWComponents", 0);
        setIntField(term198591, term198591.getClass(), "numOfLWComponents", 0);
        setField(term198591, term198591.getClass(), "modalComp", null);
        setField(term198591, term198591.getClass(), "modalAppContext", null);
        setIntField(term198591, term198591.getClass(), "containerSerializedDataVersion", 0);
        setField(term198591, term198591.getClass(), "peer", null);
        setField(term198591, term198591.getClass(), "parent", null);
        setField(term198591, term198591.getClass(), "appContext", null);
        setIntField(term198591, term198591.getClass(), "x", 0);
        setIntField(term198591, term198591.getClass(), "y", 0);
        setIntField(term198591, term198591.getClass(), "width", 0);
        setIntField(term198591, term198591.getClass(), "height", 0);
        setField(term198591, term198591.getClass(), "foreground", null);
        setField(term198591, term198591.getClass(), "background", null);
        setField(term198591, term198591.getClass(), "font", null);
        setField(term198591, term198591.getClass(), "peerFont", null);
        setField(term198591, term198591.getClass(), "cursor", null);
        setField(term198591, term198591.getClass(), "locale", null);
        setField(term198591, term198591.getClass(), "graphicsConfig", null);
        setField(term198591, term198591.getClass(), "bufferStrategy", null);
        setBooleanField(term198591, term198591.getClass(), "ignoreRepaint", false);
        setBooleanField(term198591, term198591.getClass(), "visible", false);
        setBooleanField(term198591, term198591.getClass(), "enabled", false);
        setBooleanField(term198591, term198591.getClass(), "valid", false);
        setField(term198591, term198591.getClass(), "dropTarget", null);
        setField(term198591, term198591.getClass(), "popups", null);
        setField(term198591, term198591.getClass(), "name", null);
        setBooleanField(term198591, term198591.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198591, term198591.getClass(), "focusable", false);
        setIntField(term198591, term198591.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198591, term198591.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198591, term198591.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198591, term198591.getClass(), "acc", null);
        setField(term198591, term198591.getClass(), "minSize", null);
        setBooleanField(term198591, term198591.getClass(), "minSizeSet", false);
        setField(term198591, term198591.getClass(), "prefSize", null);
        setBooleanField(term198591, term198591.getClass(), "prefSizeSet", false);
        setField(term198591, term198591.getClass(), "maxSize", null);
        setBooleanField(term198591, term198591.getClass(), "maxSizeSet", false);
        setField(term198591, term198591.getClass(), "componentOrientation", null);
        setBooleanField(term198591, term198591.getClass(), "newEventsOnly", false);
        setField(term198591, term198591.getClass(), "componentListener", null);
        setField(term198591, term198591.getClass(), "focusListener", null);
        setField(term198591, term198591.getClass(), "hierarchyListener", null);
        setField(term198591, term198591.getClass(), "hierarchyBoundsListener", null);
        setField(term198591, term198591.getClass(), "keyListener", null);
        setField(term198591, term198591.getClass(), "mouseListener", null);
        setField(term198591, term198591.getClass(), "mouseMotionListener", null);
        setField(term198591, term198591.getClass(), "mouseWheelListener", null);
        setField(term198591, term198591.getClass(), "inputMethodListener", null);
        setLongField(term198591, term198591.getClass(), "eventMask", 0L);
        setField(term198591, term198591.getClass(), "changeSupport", null);
        setField(term198591, term198591.getClass(), "objectLock", null);
        setBooleanField(term198591, term198591.getClass(), "isPacked", false);
        setIntField(term198591, term198591.getClass(), "boundsOp", 0);
        setField(term198591, term198591.getClass(), "compoundShape", null);
        setField(term198591, term198591.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198591, term198591.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198591, term198591.getClass(), "backgroundEraseDisabled", false);
        setField(term198591, term198591.getClass(), "eventCache", null);
        setBooleanField(term198591, term198591.getClass(), "coalescingEnabled", false);
        setBooleanField(term198591, term198591.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198591, term198591.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstance", argTypes, term198591, args);
    }

};


