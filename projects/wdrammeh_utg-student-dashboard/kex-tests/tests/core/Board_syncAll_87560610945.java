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

public class Board_syncAll_87560610945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199133;

    public Board_syncAll_87560610945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199133 = newInstance(Class.forName("core.Board"));
        setField(term199133, term199133.getClass(), "contentPanel", null);
        setField(term199133, term199133.getClass(), "bodyLayer", null);
        setField(term199133, term199133.getClass(), "cardLayout", null);
        setField(term199133, term199133.getClass(), "semesterActivity", null);
        setField(term199133, term199133.getClass(), "moduleActivity", null);
        setField(term199133, term199133.getClass(), "settingsUI", null);
        setField(term199133, term199133.getClass(), "transcriptActivity", null);
        setField(term199133, term199133.getClass(), "analysisActivity", null);
        setField(term199133, term199133.getClass(), "helpActivity", null);
        setField(term199133, term199133.getClass(), "about", null);
        setField(term199133, term199133.getClass(), "taskActivity", null);
        setField(term199133, term199133.getClass(), "newsPresent", null);
        setField(term199133, term199133.getClass(), "alertActivity", null);
        setIntField(term199133, term199133.getClass(), "defaultCloseOperation", 0);
        setField(term199133, term199133.getClass(), "transferHandler", null);
        setField(term199133, term199133.getClass(), "rootPane", null);
        setBooleanField(term199133, term199133.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199133, term199133.getClass(), "accessibleContext", null);
        setField(term199133, term199133.getClass(), "maximizedBounds", null);
        setField(term199133, term199133.getClass(), "title", null);
        setField(term199133, term199133.getClass(), "menuBar", null);
        setBooleanField(term199133, term199133.getClass(), "resizable", false);
        setBooleanField(term199133, term199133.getClass(), "undecorated", false);
        setBooleanField(term199133, term199133.getClass(), "mbManagement", false);
        setIntField(term199133, term199133.getClass(), "state", 0);
        setField(term199133, term199133.getClass(), "ownedWindows", null);
        setIntField(term199133, term199133.getClass(), "frameSerializedDataVersion", 0);
        setField(term199133, term199133.getClass(), "warningString", null);
        setField(term199133, term199133.getClass(), "icons", null);
        setField(term199133, term199133.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199133, term199133.getClass(), "syncLWRequests", false);
        setBooleanField(term199133, term199133.getClass(), "beforeFirstShow", false);
        setBooleanField(term199133, term199133.getClass(), "disposing", false);
        setField(term199133, term199133.getClass(), "disposerRecord", null);
        setBooleanField(term199133, term199133.getClass(), "alwaysOnTop", false);
        setField(term199133, term199133.getClass(), "ownedWindowList", null);
        setField(term199133, term199133.getClass(), "weakThis", null);
        setBooleanField(term199133, term199133.getClass(), "showWithParent", false);
        setField(term199133, term199133.getClass(), "modalBlocker", null);
        setField(term199133, term199133.getClass(), "modalExclusionType", null);
        setField(term199133, term199133.getClass(), "windowListener", null);
        setField(term199133, term199133.getClass(), "windowStateListener", null);
        setField(term199133, term199133.getClass(), "windowFocusListener", null);
        setField(term199133, term199133.getClass(), "inputContext", null);
        setField(term199133, term199133.getClass(), "inputContextLock", null);
        setField(term199133, term199133.getClass(), "focusMgr", null);
        setBooleanField(term199133, term199133.getClass(), "focusableWindowState", false);
        setBooleanField(term199133, term199133.getClass(), "autoRequestFocus", false);
        setBooleanField(term199133, term199133.getClass(), "isInShow", false);
        setFloatField(term199133, term199133.getClass(), "opacity", 0.0F);
        setField(term199133, term199133.getClass(), "shape", null);
        setBooleanField(term199133, term199133.getClass(), "isTrayIconWindow", false);
        setIntField(term199133, term199133.getClass(), "securityWarningWidth", 0);
        setIntField(term199133, term199133.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199133, term199133.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199133, term199133.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199133, term199133.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199133, term199133.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199133, term199133.getClass(), "anchor", null);
        setField(term199133, term199133.getClass(), "type", null);
        setIntField(term199133, term199133.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199133, term199133.getClass(), "locationByPlatform", false);
        setField(term199133, term199133.getClass(), "component", null);
        setField(term199133, term199133.getClass(), "layoutMgr", null);
        setField(term199133, term199133.getClass(), "dispatcher", null);
        setField(term199133, term199133.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199133, term199133.getClass(), "focusCycleRoot", false);
        setBooleanField(term199133, term199133.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199133, term199133.getClass(), "printingThreads", null);
        setBooleanField(term199133, term199133.getClass(), "printing", false);
        setField(term199133, term199133.getClass(), "containerListener", null);
        setIntField(term199133, term199133.getClass(), "listeningChildren", 0);
        setIntField(term199133, term199133.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199133, term199133.getClass(), "descendantsCount", 0);
        setField(term199133, term199133.getClass(), "preserveBackgroundColor", null);
        setIntField(term199133, term199133.getClass(), "numOfHWComponents", 0);
        setIntField(term199133, term199133.getClass(), "numOfLWComponents", 0);
        setField(term199133, term199133.getClass(), "modalComp", null);
        setField(term199133, term199133.getClass(), "modalAppContext", null);
        setIntField(term199133, term199133.getClass(), "containerSerializedDataVersion", 0);
        setField(term199133, term199133.getClass(), "peer", null);
        setField(term199133, term199133.getClass(), "parent", null);
        setField(term199133, term199133.getClass(), "appContext", null);
        setIntField(term199133, term199133.getClass(), "x", 0);
        setIntField(term199133, term199133.getClass(), "y", 0);
        setIntField(term199133, term199133.getClass(), "width", 0);
        setIntField(term199133, term199133.getClass(), "height", 0);
        setField(term199133, term199133.getClass(), "foreground", null);
        setField(term199133, term199133.getClass(), "background", null);
        setField(term199133, term199133.getClass(), "font", null);
        setField(term199133, term199133.getClass(), "peerFont", null);
        setField(term199133, term199133.getClass(), "cursor", null);
        setField(term199133, term199133.getClass(), "locale", null);
        setField(term199133, term199133.getClass(), "graphicsConfig", null);
        setField(term199133, term199133.getClass(), "bufferStrategy", null);
        setBooleanField(term199133, term199133.getClass(), "ignoreRepaint", false);
        setBooleanField(term199133, term199133.getClass(), "visible", false);
        setBooleanField(term199133, term199133.getClass(), "enabled", false);
        setBooleanField(term199133, term199133.getClass(), "valid", false);
        setField(term199133, term199133.getClass(), "dropTarget", null);
        setField(term199133, term199133.getClass(), "popups", null);
        setField(term199133, term199133.getClass(), "name", null);
        setBooleanField(term199133, term199133.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199133, term199133.getClass(), "focusable", false);
        setIntField(term199133, term199133.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199133, term199133.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199133, term199133.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199133, term199133.getClass(), "acc", null);
        setField(term199133, term199133.getClass(), "minSize", null);
        setBooleanField(term199133, term199133.getClass(), "minSizeSet", false);
        setField(term199133, term199133.getClass(), "prefSize", null);
        setBooleanField(term199133, term199133.getClass(), "prefSizeSet", false);
        setField(term199133, term199133.getClass(), "maxSize", null);
        setBooleanField(term199133, term199133.getClass(), "maxSizeSet", false);
        setField(term199133, term199133.getClass(), "componentOrientation", null);
        setBooleanField(term199133, term199133.getClass(), "newEventsOnly", false);
        setField(term199133, term199133.getClass(), "componentListener", null);
        setField(term199133, term199133.getClass(), "focusListener", null);
        setField(term199133, term199133.getClass(), "hierarchyListener", null);
        setField(term199133, term199133.getClass(), "hierarchyBoundsListener", null);
        setField(term199133, term199133.getClass(), "keyListener", null);
        setField(term199133, term199133.getClass(), "mouseListener", null);
        setField(term199133, term199133.getClass(), "mouseMotionListener", null);
        setField(term199133, term199133.getClass(), "mouseWheelListener", null);
        setField(term199133, term199133.getClass(), "inputMethodListener", null);
        setLongField(term199133, term199133.getClass(), "eventMask", 0L);
        setField(term199133, term199133.getClass(), "changeSupport", null);
        setField(term199133, term199133.getClass(), "objectLock", null);
        setBooleanField(term199133, term199133.getClass(), "isPacked", false);
        setIntField(term199133, term199133.getClass(), "boundsOp", 0);
        setField(term199133, term199133.getClass(), "compoundShape", null);
        setField(term199133, term199133.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199133, term199133.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199133, term199133.getClass(), "backgroundEraseDisabled", false);
        setField(term199133, term199133.getClass(), "eventCache", null);
        setBooleanField(term199133, term199133.getClass(), "coalescingEnabled", false);
        setBooleanField(term199133, term199133.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199133, term199133.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "syncAll", argTypes, term199133, args);
    }

};


