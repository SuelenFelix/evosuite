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

public class Board_setUpBody_10087747166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193151;

    public Board_setUpBody_10087747166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193151 = newInstance(Class.forName("core.Board"));
        setField(term193151, term193151.getClass(), "contentPanel", null);
        setField(term193151, term193151.getClass(), "bodyLayer", null);
        setField(term193151, term193151.getClass(), "cardLayout", null);
        setField(term193151, term193151.getClass(), "semesterActivity", null);
        setField(term193151, term193151.getClass(), "moduleActivity", null);
        setField(term193151, term193151.getClass(), "settingsUI", null);
        setField(term193151, term193151.getClass(), "transcriptActivity", null);
        setField(term193151, term193151.getClass(), "analysisActivity", null);
        setField(term193151, term193151.getClass(), "helpActivity", null);
        setField(term193151, term193151.getClass(), "about", null);
        setField(term193151, term193151.getClass(), "taskActivity", null);
        setField(term193151, term193151.getClass(), "newsPresent", null);
        setField(term193151, term193151.getClass(), "alertActivity", null);
        setIntField(term193151, term193151.getClass(), "defaultCloseOperation", 0);
        setField(term193151, term193151.getClass(), "transferHandler", null);
        setField(term193151, term193151.getClass(), "rootPane", null);
        setBooleanField(term193151, term193151.getClass(), "rootPaneCheckingEnabled", false);
        setField(term193151, term193151.getClass(), "accessibleContext", null);
        setField(term193151, term193151.getClass(), "maximizedBounds", null);
        setField(term193151, term193151.getClass(), "title", null);
        setField(term193151, term193151.getClass(), "menuBar", null);
        setBooleanField(term193151, term193151.getClass(), "resizable", false);
        setBooleanField(term193151, term193151.getClass(), "undecorated", false);
        setBooleanField(term193151, term193151.getClass(), "mbManagement", false);
        setIntField(term193151, term193151.getClass(), "state", 0);
        setField(term193151, term193151.getClass(), "ownedWindows", null);
        setIntField(term193151, term193151.getClass(), "frameSerializedDataVersion", 0);
        setField(term193151, term193151.getClass(), "warningString", null);
        setField(term193151, term193151.getClass(), "icons", null);
        setField(term193151, term193151.getClass(), "temporaryLostComponent", null);
        setBooleanField(term193151, term193151.getClass(), "syncLWRequests", false);
        setBooleanField(term193151, term193151.getClass(), "beforeFirstShow", false);
        setBooleanField(term193151, term193151.getClass(), "disposing", false);
        setField(term193151, term193151.getClass(), "disposerRecord", null);
        setBooleanField(term193151, term193151.getClass(), "alwaysOnTop", false);
        setField(term193151, term193151.getClass(), "ownedWindowList", null);
        setField(term193151, term193151.getClass(), "weakThis", null);
        setBooleanField(term193151, term193151.getClass(), "showWithParent", false);
        setField(term193151, term193151.getClass(), "modalBlocker", null);
        setField(term193151, term193151.getClass(), "modalExclusionType", null);
        setField(term193151, term193151.getClass(), "windowListener", null);
        setField(term193151, term193151.getClass(), "windowStateListener", null);
        setField(term193151, term193151.getClass(), "windowFocusListener", null);
        setField(term193151, term193151.getClass(), "inputContext", null);
        setField(term193151, term193151.getClass(), "inputContextLock", null);
        setField(term193151, term193151.getClass(), "focusMgr", null);
        setBooleanField(term193151, term193151.getClass(), "focusableWindowState", false);
        setBooleanField(term193151, term193151.getClass(), "autoRequestFocus", false);
        setBooleanField(term193151, term193151.getClass(), "isInShow", false);
        setFloatField(term193151, term193151.getClass(), "opacity", 0.0F);
        setField(term193151, term193151.getClass(), "shape", null);
        setBooleanField(term193151, term193151.getClass(), "isTrayIconWindow", false);
        setIntField(term193151, term193151.getClass(), "securityWarningWidth", 0);
        setIntField(term193151, term193151.getClass(), "securityWarningHeight", 0);
        setDoubleField(term193151, term193151.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term193151, term193151.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term193151, term193151.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term193151, term193151.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term193151, term193151.getClass(), "anchor", null);
        setField(term193151, term193151.getClass(), "type", null);
        setIntField(term193151, term193151.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term193151, term193151.getClass(), "locationByPlatform", false);
        setField(term193151, term193151.getClass(), "component", null);
        setField(term193151, term193151.getClass(), "layoutMgr", null);
        setField(term193151, term193151.getClass(), "dispatcher", null);
        setField(term193151, term193151.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term193151, term193151.getClass(), "focusCycleRoot", false);
        setBooleanField(term193151, term193151.getClass(), "focusTraversalPolicyProvider", false);
        setField(term193151, term193151.getClass(), "printingThreads", null);
        setBooleanField(term193151, term193151.getClass(), "printing", false);
        setField(term193151, term193151.getClass(), "containerListener", null);
        setIntField(term193151, term193151.getClass(), "listeningChildren", 0);
        setIntField(term193151, term193151.getClass(), "listeningBoundsChildren", 0);
        setIntField(term193151, term193151.getClass(), "descendantsCount", 0);
        setField(term193151, term193151.getClass(), "preserveBackgroundColor", null);
        setIntField(term193151, term193151.getClass(), "numOfHWComponents", 0);
        setIntField(term193151, term193151.getClass(), "numOfLWComponents", 0);
        setField(term193151, term193151.getClass(), "modalComp", null);
        setField(term193151, term193151.getClass(), "modalAppContext", null);
        setIntField(term193151, term193151.getClass(), "containerSerializedDataVersion", 0);
        setField(term193151, term193151.getClass(), "peer", null);
        setField(term193151, term193151.getClass(), "parent", null);
        setField(term193151, term193151.getClass(), "appContext", null);
        setIntField(term193151, term193151.getClass(), "x", 0);
        setIntField(term193151, term193151.getClass(), "y", 0);
        setIntField(term193151, term193151.getClass(), "width", 0);
        setIntField(term193151, term193151.getClass(), "height", 0);
        setField(term193151, term193151.getClass(), "foreground", null);
        setField(term193151, term193151.getClass(), "background", null);
        setField(term193151, term193151.getClass(), "font", null);
        setField(term193151, term193151.getClass(), "peerFont", null);
        setField(term193151, term193151.getClass(), "cursor", null);
        setField(term193151, term193151.getClass(), "locale", null);
        setField(term193151, term193151.getClass(), "graphicsConfig", null);
        setField(term193151, term193151.getClass(), "bufferStrategy", null);
        setBooleanField(term193151, term193151.getClass(), "ignoreRepaint", false);
        setBooleanField(term193151, term193151.getClass(), "visible", false);
        setBooleanField(term193151, term193151.getClass(), "enabled", false);
        setBooleanField(term193151, term193151.getClass(), "valid", false);
        setField(term193151, term193151.getClass(), "dropTarget", null);
        setField(term193151, term193151.getClass(), "popups", null);
        setField(term193151, term193151.getClass(), "name", null);
        setBooleanField(term193151, term193151.getClass(), "nameExplicitlySet", false);
        setBooleanField(term193151, term193151.getClass(), "focusable", false);
        setIntField(term193151, term193151.getClass(), "isFocusTraversableOverridden", 0);
        setField(term193151, term193151.getClass(), "focusTraversalKeys", null);
        setBooleanField(term193151, term193151.getClass(), "focusTraversalKeysEnabled", false);
        setField(term193151, term193151.getClass(), "acc", null);
        setField(term193151, term193151.getClass(), "minSize", null);
        setBooleanField(term193151, term193151.getClass(), "minSizeSet", false);
        setField(term193151, term193151.getClass(), "prefSize", null);
        setBooleanField(term193151, term193151.getClass(), "prefSizeSet", false);
        setField(term193151, term193151.getClass(), "maxSize", null);
        setBooleanField(term193151, term193151.getClass(), "maxSizeSet", false);
        setField(term193151, term193151.getClass(), "componentOrientation", null);
        setBooleanField(term193151, term193151.getClass(), "newEventsOnly", false);
        setField(term193151, term193151.getClass(), "componentListener", null);
        setField(term193151, term193151.getClass(), "focusListener", null);
        setField(term193151, term193151.getClass(), "hierarchyListener", null);
        setField(term193151, term193151.getClass(), "hierarchyBoundsListener", null);
        setField(term193151, term193151.getClass(), "keyListener", null);
        setField(term193151, term193151.getClass(), "mouseListener", null);
        setField(term193151, term193151.getClass(), "mouseMotionListener", null);
        setField(term193151, term193151.getClass(), "mouseWheelListener", null);
        setField(term193151, term193151.getClass(), "inputMethodListener", null);
        setLongField(term193151, term193151.getClass(), "eventMask", 0L);
        setField(term193151, term193151.getClass(), "changeSupport", null);
        setField(term193151, term193151.getClass(), "objectLock", null);
        setBooleanField(term193151, term193151.getClass(), "isPacked", false);
        setIntField(term193151, term193151.getClass(), "boundsOp", 0);
        setField(term193151, term193151.getClass(), "compoundShape", null);
        setField(term193151, term193151.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term193151, term193151.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term193151, term193151.getClass(), "backgroundEraseDisabled", false);
        setField(term193151, term193151.getClass(), "eventCache", null);
        setBooleanField(term193151, term193151.getClass(), "coalescingEnabled", false);
        setBooleanField(term193151, term193151.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term193151, term193151.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setUpBody", argTypes, term193151, args);
    }

};


