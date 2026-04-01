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

public class Board_effectNotificationToolTip_22941318339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198773;

    public Board_effectNotificationToolTip_22941318339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198773 = newInstance(Class.forName("core.Board"));
        setField(term198773, term198773.getClass(), "contentPanel", null);
        setField(term198773, term198773.getClass(), "bodyLayer", null);
        setField(term198773, term198773.getClass(), "cardLayout", null);
        setField(term198773, term198773.getClass(), "semesterActivity", null);
        setField(term198773, term198773.getClass(), "moduleActivity", null);
        setField(term198773, term198773.getClass(), "settingsUI", null);
        setField(term198773, term198773.getClass(), "transcriptActivity", null);
        setField(term198773, term198773.getClass(), "analysisActivity", null);
        setField(term198773, term198773.getClass(), "helpActivity", null);
        setField(term198773, term198773.getClass(), "about", null);
        setField(term198773, term198773.getClass(), "taskActivity", null);
        setField(term198773, term198773.getClass(), "newsPresent", null);
        setField(term198773, term198773.getClass(), "alertActivity", null);
        setIntField(term198773, term198773.getClass(), "defaultCloseOperation", 0);
        setField(term198773, term198773.getClass(), "transferHandler", null);
        setField(term198773, term198773.getClass(), "rootPane", null);
        setBooleanField(term198773, term198773.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198773, term198773.getClass(), "accessibleContext", null);
        setField(term198773, term198773.getClass(), "maximizedBounds", null);
        setField(term198773, term198773.getClass(), "title", null);
        setField(term198773, term198773.getClass(), "menuBar", null);
        setBooleanField(term198773, term198773.getClass(), "resizable", false);
        setBooleanField(term198773, term198773.getClass(), "undecorated", false);
        setBooleanField(term198773, term198773.getClass(), "mbManagement", false);
        setIntField(term198773, term198773.getClass(), "state", 0);
        setField(term198773, term198773.getClass(), "ownedWindows", null);
        setIntField(term198773, term198773.getClass(), "frameSerializedDataVersion", 0);
        setField(term198773, term198773.getClass(), "warningString", null);
        setField(term198773, term198773.getClass(), "icons", null);
        setField(term198773, term198773.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198773, term198773.getClass(), "syncLWRequests", false);
        setBooleanField(term198773, term198773.getClass(), "beforeFirstShow", false);
        setBooleanField(term198773, term198773.getClass(), "disposing", false);
        setField(term198773, term198773.getClass(), "disposerRecord", null);
        setBooleanField(term198773, term198773.getClass(), "alwaysOnTop", false);
        setField(term198773, term198773.getClass(), "ownedWindowList", null);
        setField(term198773, term198773.getClass(), "weakThis", null);
        setBooleanField(term198773, term198773.getClass(), "showWithParent", false);
        setField(term198773, term198773.getClass(), "modalBlocker", null);
        setField(term198773, term198773.getClass(), "modalExclusionType", null);
        setField(term198773, term198773.getClass(), "windowListener", null);
        setField(term198773, term198773.getClass(), "windowStateListener", null);
        setField(term198773, term198773.getClass(), "windowFocusListener", null);
        setField(term198773, term198773.getClass(), "inputContext", null);
        setField(term198773, term198773.getClass(), "inputContextLock", null);
        setField(term198773, term198773.getClass(), "focusMgr", null);
        setBooleanField(term198773, term198773.getClass(), "focusableWindowState", false);
        setBooleanField(term198773, term198773.getClass(), "autoRequestFocus", false);
        setBooleanField(term198773, term198773.getClass(), "isInShow", false);
        setFloatField(term198773, term198773.getClass(), "opacity", 0.0F);
        setField(term198773, term198773.getClass(), "shape", null);
        setBooleanField(term198773, term198773.getClass(), "isTrayIconWindow", false);
        setIntField(term198773, term198773.getClass(), "securityWarningWidth", 0);
        setIntField(term198773, term198773.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198773, term198773.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198773, term198773.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198773, term198773.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198773, term198773.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198773, term198773.getClass(), "anchor", null);
        setField(term198773, term198773.getClass(), "type", null);
        setIntField(term198773, term198773.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198773, term198773.getClass(), "locationByPlatform", false);
        setField(term198773, term198773.getClass(), "component", null);
        setField(term198773, term198773.getClass(), "layoutMgr", null);
        setField(term198773, term198773.getClass(), "dispatcher", null);
        setField(term198773, term198773.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198773, term198773.getClass(), "focusCycleRoot", false);
        setBooleanField(term198773, term198773.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198773, term198773.getClass(), "printingThreads", null);
        setBooleanField(term198773, term198773.getClass(), "printing", false);
        setField(term198773, term198773.getClass(), "containerListener", null);
        setIntField(term198773, term198773.getClass(), "listeningChildren", 0);
        setIntField(term198773, term198773.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198773, term198773.getClass(), "descendantsCount", 0);
        setField(term198773, term198773.getClass(), "preserveBackgroundColor", null);
        setIntField(term198773, term198773.getClass(), "numOfHWComponents", 0);
        setIntField(term198773, term198773.getClass(), "numOfLWComponents", 0);
        setField(term198773, term198773.getClass(), "modalComp", null);
        setField(term198773, term198773.getClass(), "modalAppContext", null);
        setIntField(term198773, term198773.getClass(), "containerSerializedDataVersion", 0);
        setField(term198773, term198773.getClass(), "peer", null);
        setField(term198773, term198773.getClass(), "parent", null);
        setField(term198773, term198773.getClass(), "appContext", null);
        setIntField(term198773, term198773.getClass(), "x", 0);
        setIntField(term198773, term198773.getClass(), "y", 0);
        setIntField(term198773, term198773.getClass(), "width", 0);
        setIntField(term198773, term198773.getClass(), "height", 0);
        setField(term198773, term198773.getClass(), "foreground", null);
        setField(term198773, term198773.getClass(), "background", null);
        setField(term198773, term198773.getClass(), "font", null);
        setField(term198773, term198773.getClass(), "peerFont", null);
        setField(term198773, term198773.getClass(), "cursor", null);
        setField(term198773, term198773.getClass(), "locale", null);
        setField(term198773, term198773.getClass(), "graphicsConfig", null);
        setField(term198773, term198773.getClass(), "bufferStrategy", null);
        setBooleanField(term198773, term198773.getClass(), "ignoreRepaint", false);
        setBooleanField(term198773, term198773.getClass(), "visible", false);
        setBooleanField(term198773, term198773.getClass(), "enabled", false);
        setBooleanField(term198773, term198773.getClass(), "valid", false);
        setField(term198773, term198773.getClass(), "dropTarget", null);
        setField(term198773, term198773.getClass(), "popups", null);
        setField(term198773, term198773.getClass(), "name", null);
        setBooleanField(term198773, term198773.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198773, term198773.getClass(), "focusable", false);
        setIntField(term198773, term198773.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198773, term198773.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198773, term198773.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198773, term198773.getClass(), "acc", null);
        setField(term198773, term198773.getClass(), "minSize", null);
        setBooleanField(term198773, term198773.getClass(), "minSizeSet", false);
        setField(term198773, term198773.getClass(), "prefSize", null);
        setBooleanField(term198773, term198773.getClass(), "prefSizeSet", false);
        setField(term198773, term198773.getClass(), "maxSize", null);
        setBooleanField(term198773, term198773.getClass(), "maxSizeSet", false);
        setField(term198773, term198773.getClass(), "componentOrientation", null);
        setBooleanField(term198773, term198773.getClass(), "newEventsOnly", false);
        setField(term198773, term198773.getClass(), "componentListener", null);
        setField(term198773, term198773.getClass(), "focusListener", null);
        setField(term198773, term198773.getClass(), "hierarchyListener", null);
        setField(term198773, term198773.getClass(), "hierarchyBoundsListener", null);
        setField(term198773, term198773.getClass(), "keyListener", null);
        setField(term198773, term198773.getClass(), "mouseListener", null);
        setField(term198773, term198773.getClass(), "mouseMotionListener", null);
        setField(term198773, term198773.getClass(), "mouseWheelListener", null);
        setField(term198773, term198773.getClass(), "inputMethodListener", null);
        setLongField(term198773, term198773.getClass(), "eventMask", 0L);
        setField(term198773, term198773.getClass(), "changeSupport", null);
        setField(term198773, term198773.getClass(), "objectLock", null);
        setBooleanField(term198773, term198773.getClass(), "isPacked", false);
        setIntField(term198773, term198773.getClass(), "boundsOp", 0);
        setField(term198773, term198773.getClass(), "compoundShape", null);
        setField(term198773, term198773.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198773, term198773.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198773, term198773.getClass(), "backgroundEraseDisabled", false);
        setField(term198773, term198773.getClass(), "eventCache", null);
        setBooleanField(term198773, term198773.getClass(), "coalescingEnabled", false);
        setBooleanField(term198773, term198773.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198773, term198773.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "effectNotificationToolTip", argTypes, term198773, args);
    }

};


