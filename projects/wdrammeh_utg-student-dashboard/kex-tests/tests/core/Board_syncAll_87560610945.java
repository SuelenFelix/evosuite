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
     Object term199147;

    public Board_syncAll_87560610945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199147 = newInstance(Class.forName("core.Board"));
        setField(term199147, term199147.getClass(), "contentPanel", null);
        setField(term199147, term199147.getClass(), "bodyLayer", null);
        setField(term199147, term199147.getClass(), "cardLayout", null);
        setField(term199147, term199147.getClass(), "semesterActivity", null);
        setField(term199147, term199147.getClass(), "moduleActivity", null);
        setField(term199147, term199147.getClass(), "settingsUI", null);
        setField(term199147, term199147.getClass(), "transcriptActivity", null);
        setField(term199147, term199147.getClass(), "analysisActivity", null);
        setField(term199147, term199147.getClass(), "helpActivity", null);
        setField(term199147, term199147.getClass(), "about", null);
        setField(term199147, term199147.getClass(), "taskActivity", null);
        setField(term199147, term199147.getClass(), "newsPresent", null);
        setField(term199147, term199147.getClass(), "alertActivity", null);
        setIntField(term199147, term199147.getClass(), "defaultCloseOperation", 0);
        setField(term199147, term199147.getClass(), "transferHandler", null);
        setField(term199147, term199147.getClass(), "rootPane", null);
        setBooleanField(term199147, term199147.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199147, term199147.getClass(), "accessibleContext", null);
        setField(term199147, term199147.getClass(), "maximizedBounds", null);
        setField(term199147, term199147.getClass(), "title", null);
        setField(term199147, term199147.getClass(), "menuBar", null);
        setBooleanField(term199147, term199147.getClass(), "resizable", false);
        setBooleanField(term199147, term199147.getClass(), "undecorated", false);
        setBooleanField(term199147, term199147.getClass(), "mbManagement", false);
        setIntField(term199147, term199147.getClass(), "state", 0);
        setField(term199147, term199147.getClass(), "ownedWindows", null);
        setIntField(term199147, term199147.getClass(), "frameSerializedDataVersion", 0);
        setField(term199147, term199147.getClass(), "warningString", null);
        setField(term199147, term199147.getClass(), "icons", null);
        setField(term199147, term199147.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199147, term199147.getClass(), "syncLWRequests", false);
        setBooleanField(term199147, term199147.getClass(), "beforeFirstShow", false);
        setBooleanField(term199147, term199147.getClass(), "disposing", false);
        setField(term199147, term199147.getClass(), "disposerRecord", null);
        setBooleanField(term199147, term199147.getClass(), "alwaysOnTop", false);
        setField(term199147, term199147.getClass(), "ownedWindowList", null);
        setField(term199147, term199147.getClass(), "weakThis", null);
        setBooleanField(term199147, term199147.getClass(), "showWithParent", false);
        setField(term199147, term199147.getClass(), "modalBlocker", null);
        setField(term199147, term199147.getClass(), "modalExclusionType", null);
        setField(term199147, term199147.getClass(), "windowListener", null);
        setField(term199147, term199147.getClass(), "windowStateListener", null);
        setField(term199147, term199147.getClass(), "windowFocusListener", null);
        setField(term199147, term199147.getClass(), "inputContext", null);
        setField(term199147, term199147.getClass(), "inputContextLock", null);
        setField(term199147, term199147.getClass(), "focusMgr", null);
        setBooleanField(term199147, term199147.getClass(), "focusableWindowState", false);
        setBooleanField(term199147, term199147.getClass(), "autoRequestFocus", false);
        setBooleanField(term199147, term199147.getClass(), "isInShow", false);
        setFloatField(term199147, term199147.getClass(), "opacity", 0.0F);
        setField(term199147, term199147.getClass(), "shape", null);
        setBooleanField(term199147, term199147.getClass(), "isTrayIconWindow", false);
        setIntField(term199147, term199147.getClass(), "securityWarningWidth", 0);
        setIntField(term199147, term199147.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199147, term199147.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199147, term199147.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199147, term199147.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199147, term199147.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199147, term199147.getClass(), "anchor", null);
        setField(term199147, term199147.getClass(), "type", null);
        setIntField(term199147, term199147.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199147, term199147.getClass(), "locationByPlatform", false);
        setField(term199147, term199147.getClass(), "component", null);
        setField(term199147, term199147.getClass(), "layoutMgr", null);
        setField(term199147, term199147.getClass(), "dispatcher", null);
        setField(term199147, term199147.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199147, term199147.getClass(), "focusCycleRoot", false);
        setBooleanField(term199147, term199147.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199147, term199147.getClass(), "printingThreads", null);
        setBooleanField(term199147, term199147.getClass(), "printing", false);
        setField(term199147, term199147.getClass(), "containerListener", null);
        setIntField(term199147, term199147.getClass(), "listeningChildren", 0);
        setIntField(term199147, term199147.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199147, term199147.getClass(), "descendantsCount", 0);
        setField(term199147, term199147.getClass(), "preserveBackgroundColor", null);
        setIntField(term199147, term199147.getClass(), "numOfHWComponents", 0);
        setIntField(term199147, term199147.getClass(), "numOfLWComponents", 0);
        setField(term199147, term199147.getClass(), "modalComp", null);
        setField(term199147, term199147.getClass(), "modalAppContext", null);
        setIntField(term199147, term199147.getClass(), "containerSerializedDataVersion", 0);
        setField(term199147, term199147.getClass(), "peer", null);
        setField(term199147, term199147.getClass(), "parent", null);
        setField(term199147, term199147.getClass(), "appContext", null);
        setIntField(term199147, term199147.getClass(), "x", 0);
        setIntField(term199147, term199147.getClass(), "y", 0);
        setIntField(term199147, term199147.getClass(), "width", 0);
        setIntField(term199147, term199147.getClass(), "height", 0);
        setField(term199147, term199147.getClass(), "foreground", null);
        setField(term199147, term199147.getClass(), "background", null);
        setField(term199147, term199147.getClass(), "font", null);
        setField(term199147, term199147.getClass(), "peerFont", null);
        setField(term199147, term199147.getClass(), "cursor", null);
        setField(term199147, term199147.getClass(), "locale", null);
        setField(term199147, term199147.getClass(), "graphicsConfig", null);
        setField(term199147, term199147.getClass(), "bufferStrategy", null);
        setBooleanField(term199147, term199147.getClass(), "ignoreRepaint", false);
        setBooleanField(term199147, term199147.getClass(), "visible", false);
        setBooleanField(term199147, term199147.getClass(), "enabled", false);
        setBooleanField(term199147, term199147.getClass(), "valid", false);
        setField(term199147, term199147.getClass(), "dropTarget", null);
        setField(term199147, term199147.getClass(), "popups", null);
        setField(term199147, term199147.getClass(), "name", null);
        setBooleanField(term199147, term199147.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199147, term199147.getClass(), "focusable", false);
        setIntField(term199147, term199147.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199147, term199147.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199147, term199147.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199147, term199147.getClass(), "acc", null);
        setField(term199147, term199147.getClass(), "minSize", null);
        setBooleanField(term199147, term199147.getClass(), "minSizeSet", false);
        setField(term199147, term199147.getClass(), "prefSize", null);
        setBooleanField(term199147, term199147.getClass(), "prefSizeSet", false);
        setField(term199147, term199147.getClass(), "maxSize", null);
        setBooleanField(term199147, term199147.getClass(), "maxSizeSet", false);
        setField(term199147, term199147.getClass(), "componentOrientation", null);
        setBooleanField(term199147, term199147.getClass(), "newEventsOnly", false);
        setField(term199147, term199147.getClass(), "componentListener", null);
        setField(term199147, term199147.getClass(), "focusListener", null);
        setField(term199147, term199147.getClass(), "hierarchyListener", null);
        setField(term199147, term199147.getClass(), "hierarchyBoundsListener", null);
        setField(term199147, term199147.getClass(), "keyListener", null);
        setField(term199147, term199147.getClass(), "mouseListener", null);
        setField(term199147, term199147.getClass(), "mouseMotionListener", null);
        setField(term199147, term199147.getClass(), "mouseWheelListener", null);
        setField(term199147, term199147.getClass(), "inputMethodListener", null);
        setLongField(term199147, term199147.getClass(), "eventMask", 0L);
        setField(term199147, term199147.getClass(), "changeSupport", null);
        setField(term199147, term199147.getClass(), "objectLock", null);
        setBooleanField(term199147, term199147.getClass(), "isPacked", false);
        setIntField(term199147, term199147.getClass(), "boundsOp", 0);
        setField(term199147, term199147.getClass(), "compoundShape", null);
        setField(term199147, term199147.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199147, term199147.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199147, term199147.getClass(), "backgroundEraseDisabled", false);
        setField(term199147, term199147.getClass(), "eventCache", null);
        setBooleanField(term199147, term199147.getClass(), "coalescingEnabled", false);
        setBooleanField(term199147, term199147.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199147, term199147.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "syncAll", argTypes, term199147, args);
    }

};


