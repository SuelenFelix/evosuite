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

public class Board_effectNameFormatChanges_45322049343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199027;

    public Board_effectNameFormatChanges_45322049343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199027 = newInstance(Class.forName("core.Board"));
        setField(term199027, term199027.getClass(), "contentPanel", null);
        setField(term199027, term199027.getClass(), "bodyLayer", null);
        setField(term199027, term199027.getClass(), "cardLayout", null);
        setField(term199027, term199027.getClass(), "semesterActivity", null);
        setField(term199027, term199027.getClass(), "moduleActivity", null);
        setField(term199027, term199027.getClass(), "settingsUI", null);
        setField(term199027, term199027.getClass(), "transcriptActivity", null);
        setField(term199027, term199027.getClass(), "analysisActivity", null);
        setField(term199027, term199027.getClass(), "helpActivity", null);
        setField(term199027, term199027.getClass(), "about", null);
        setField(term199027, term199027.getClass(), "taskActivity", null);
        setField(term199027, term199027.getClass(), "newsPresent", null);
        setField(term199027, term199027.getClass(), "alertActivity", null);
        setIntField(term199027, term199027.getClass(), "defaultCloseOperation", 0);
        setField(term199027, term199027.getClass(), "transferHandler", null);
        setField(term199027, term199027.getClass(), "rootPane", null);
        setBooleanField(term199027, term199027.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199027, term199027.getClass(), "accessibleContext", null);
        setField(term199027, term199027.getClass(), "maximizedBounds", null);
        setField(term199027, term199027.getClass(), "title", null);
        setField(term199027, term199027.getClass(), "menuBar", null);
        setBooleanField(term199027, term199027.getClass(), "resizable", false);
        setBooleanField(term199027, term199027.getClass(), "undecorated", false);
        setBooleanField(term199027, term199027.getClass(), "mbManagement", false);
        setIntField(term199027, term199027.getClass(), "state", 0);
        setField(term199027, term199027.getClass(), "ownedWindows", null);
        setIntField(term199027, term199027.getClass(), "frameSerializedDataVersion", 0);
        setField(term199027, term199027.getClass(), "warningString", null);
        setField(term199027, term199027.getClass(), "icons", null);
        setField(term199027, term199027.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199027, term199027.getClass(), "syncLWRequests", false);
        setBooleanField(term199027, term199027.getClass(), "beforeFirstShow", false);
        setBooleanField(term199027, term199027.getClass(), "disposing", false);
        setField(term199027, term199027.getClass(), "disposerRecord", null);
        setBooleanField(term199027, term199027.getClass(), "alwaysOnTop", false);
        setField(term199027, term199027.getClass(), "ownedWindowList", null);
        setField(term199027, term199027.getClass(), "weakThis", null);
        setBooleanField(term199027, term199027.getClass(), "showWithParent", false);
        setField(term199027, term199027.getClass(), "modalBlocker", null);
        setField(term199027, term199027.getClass(), "modalExclusionType", null);
        setField(term199027, term199027.getClass(), "windowListener", null);
        setField(term199027, term199027.getClass(), "windowStateListener", null);
        setField(term199027, term199027.getClass(), "windowFocusListener", null);
        setField(term199027, term199027.getClass(), "inputContext", null);
        setField(term199027, term199027.getClass(), "inputContextLock", null);
        setField(term199027, term199027.getClass(), "focusMgr", null);
        setBooleanField(term199027, term199027.getClass(), "focusableWindowState", false);
        setBooleanField(term199027, term199027.getClass(), "autoRequestFocus", false);
        setBooleanField(term199027, term199027.getClass(), "isInShow", false);
        setFloatField(term199027, term199027.getClass(), "opacity", 0.0F);
        setField(term199027, term199027.getClass(), "shape", null);
        setBooleanField(term199027, term199027.getClass(), "isTrayIconWindow", false);
        setIntField(term199027, term199027.getClass(), "securityWarningWidth", 0);
        setIntField(term199027, term199027.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199027, term199027.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199027, term199027.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199027, term199027.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199027, term199027.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199027, term199027.getClass(), "anchor", null);
        setField(term199027, term199027.getClass(), "type", null);
        setIntField(term199027, term199027.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199027, term199027.getClass(), "locationByPlatform", false);
        setField(term199027, term199027.getClass(), "component", null);
        setField(term199027, term199027.getClass(), "layoutMgr", null);
        setField(term199027, term199027.getClass(), "dispatcher", null);
        setField(term199027, term199027.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199027, term199027.getClass(), "focusCycleRoot", false);
        setBooleanField(term199027, term199027.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199027, term199027.getClass(), "printingThreads", null);
        setBooleanField(term199027, term199027.getClass(), "printing", false);
        setField(term199027, term199027.getClass(), "containerListener", null);
        setIntField(term199027, term199027.getClass(), "listeningChildren", 0);
        setIntField(term199027, term199027.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199027, term199027.getClass(), "descendantsCount", 0);
        setField(term199027, term199027.getClass(), "preserveBackgroundColor", null);
        setIntField(term199027, term199027.getClass(), "numOfHWComponents", 0);
        setIntField(term199027, term199027.getClass(), "numOfLWComponents", 0);
        setField(term199027, term199027.getClass(), "modalComp", null);
        setField(term199027, term199027.getClass(), "modalAppContext", null);
        setIntField(term199027, term199027.getClass(), "containerSerializedDataVersion", 0);
        setField(term199027, term199027.getClass(), "peer", null);
        setField(term199027, term199027.getClass(), "parent", null);
        setField(term199027, term199027.getClass(), "appContext", null);
        setIntField(term199027, term199027.getClass(), "x", 0);
        setIntField(term199027, term199027.getClass(), "y", 0);
        setIntField(term199027, term199027.getClass(), "width", 0);
        setIntField(term199027, term199027.getClass(), "height", 0);
        setField(term199027, term199027.getClass(), "foreground", null);
        setField(term199027, term199027.getClass(), "background", null);
        setField(term199027, term199027.getClass(), "font", null);
        setField(term199027, term199027.getClass(), "peerFont", null);
        setField(term199027, term199027.getClass(), "cursor", null);
        setField(term199027, term199027.getClass(), "locale", null);
        setField(term199027, term199027.getClass(), "graphicsConfig", null);
        setField(term199027, term199027.getClass(), "bufferStrategy", null);
        setBooleanField(term199027, term199027.getClass(), "ignoreRepaint", false);
        setBooleanField(term199027, term199027.getClass(), "visible", false);
        setBooleanField(term199027, term199027.getClass(), "enabled", false);
        setBooleanField(term199027, term199027.getClass(), "valid", false);
        setField(term199027, term199027.getClass(), "dropTarget", null);
        setField(term199027, term199027.getClass(), "popups", null);
        setField(term199027, term199027.getClass(), "name", null);
        setBooleanField(term199027, term199027.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199027, term199027.getClass(), "focusable", false);
        setIntField(term199027, term199027.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199027, term199027.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199027, term199027.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199027, term199027.getClass(), "acc", null);
        setField(term199027, term199027.getClass(), "minSize", null);
        setBooleanField(term199027, term199027.getClass(), "minSizeSet", false);
        setField(term199027, term199027.getClass(), "prefSize", null);
        setBooleanField(term199027, term199027.getClass(), "prefSizeSet", false);
        setField(term199027, term199027.getClass(), "maxSize", null);
        setBooleanField(term199027, term199027.getClass(), "maxSizeSet", false);
        setField(term199027, term199027.getClass(), "componentOrientation", null);
        setBooleanField(term199027, term199027.getClass(), "newEventsOnly", false);
        setField(term199027, term199027.getClass(), "componentListener", null);
        setField(term199027, term199027.getClass(), "focusListener", null);
        setField(term199027, term199027.getClass(), "hierarchyListener", null);
        setField(term199027, term199027.getClass(), "hierarchyBoundsListener", null);
        setField(term199027, term199027.getClass(), "keyListener", null);
        setField(term199027, term199027.getClass(), "mouseListener", null);
        setField(term199027, term199027.getClass(), "mouseMotionListener", null);
        setField(term199027, term199027.getClass(), "mouseWheelListener", null);
        setField(term199027, term199027.getClass(), "inputMethodListener", null);
        setLongField(term199027, term199027.getClass(), "eventMask", 0L);
        setField(term199027, term199027.getClass(), "changeSupport", null);
        setField(term199027, term199027.getClass(), "objectLock", null);
        setBooleanField(term199027, term199027.getClass(), "isPacked", false);
        setIntField(term199027, term199027.getClass(), "boundsOp", 0);
        setField(term199027, term199027.getClass(), "compoundShape", null);
        setField(term199027, term199027.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199027, term199027.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199027, term199027.getClass(), "backgroundEraseDisabled", false);
        setField(term199027, term199027.getClass(), "eventCache", null);
        setBooleanField(term199027, term199027.getClass(), "coalescingEnabled", false);
        setBooleanField(term199027, term199027.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199027, term199027.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectNameFormatChanges", argTypes, term199027, args);
    }

};


