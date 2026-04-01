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
     Object term199013;

    public Board_effectNameFormatChanges_45322049343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199013 = newInstance(Class.forName("core.Board"));
        setField(term199013, term199013.getClass(), "contentPanel", null);
        setField(term199013, term199013.getClass(), "bodyLayer", null);
        setField(term199013, term199013.getClass(), "cardLayout", null);
        setField(term199013, term199013.getClass(), "semesterActivity", null);
        setField(term199013, term199013.getClass(), "moduleActivity", null);
        setField(term199013, term199013.getClass(), "settingsUI", null);
        setField(term199013, term199013.getClass(), "transcriptActivity", null);
        setField(term199013, term199013.getClass(), "analysisActivity", null);
        setField(term199013, term199013.getClass(), "helpActivity", null);
        setField(term199013, term199013.getClass(), "about", null);
        setField(term199013, term199013.getClass(), "taskActivity", null);
        setField(term199013, term199013.getClass(), "newsPresent", null);
        setField(term199013, term199013.getClass(), "alertActivity", null);
        setIntField(term199013, term199013.getClass(), "defaultCloseOperation", 0);
        setField(term199013, term199013.getClass(), "transferHandler", null);
        setField(term199013, term199013.getClass(), "rootPane", null);
        setBooleanField(term199013, term199013.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199013, term199013.getClass(), "accessibleContext", null);
        setField(term199013, term199013.getClass(), "maximizedBounds", null);
        setField(term199013, term199013.getClass(), "title", null);
        setField(term199013, term199013.getClass(), "menuBar", null);
        setBooleanField(term199013, term199013.getClass(), "resizable", false);
        setBooleanField(term199013, term199013.getClass(), "undecorated", false);
        setBooleanField(term199013, term199013.getClass(), "mbManagement", false);
        setIntField(term199013, term199013.getClass(), "state", 0);
        setField(term199013, term199013.getClass(), "ownedWindows", null);
        setIntField(term199013, term199013.getClass(), "frameSerializedDataVersion", 0);
        setField(term199013, term199013.getClass(), "warningString", null);
        setField(term199013, term199013.getClass(), "icons", null);
        setField(term199013, term199013.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199013, term199013.getClass(), "syncLWRequests", false);
        setBooleanField(term199013, term199013.getClass(), "beforeFirstShow", false);
        setBooleanField(term199013, term199013.getClass(), "disposing", false);
        setField(term199013, term199013.getClass(), "disposerRecord", null);
        setBooleanField(term199013, term199013.getClass(), "alwaysOnTop", false);
        setField(term199013, term199013.getClass(), "ownedWindowList", null);
        setField(term199013, term199013.getClass(), "weakThis", null);
        setBooleanField(term199013, term199013.getClass(), "showWithParent", false);
        setField(term199013, term199013.getClass(), "modalBlocker", null);
        setField(term199013, term199013.getClass(), "modalExclusionType", null);
        setField(term199013, term199013.getClass(), "windowListener", null);
        setField(term199013, term199013.getClass(), "windowStateListener", null);
        setField(term199013, term199013.getClass(), "windowFocusListener", null);
        setField(term199013, term199013.getClass(), "inputContext", null);
        setField(term199013, term199013.getClass(), "inputContextLock", null);
        setField(term199013, term199013.getClass(), "focusMgr", null);
        setBooleanField(term199013, term199013.getClass(), "focusableWindowState", false);
        setBooleanField(term199013, term199013.getClass(), "autoRequestFocus", false);
        setBooleanField(term199013, term199013.getClass(), "isInShow", false);
        setFloatField(term199013, term199013.getClass(), "opacity", 0.0F);
        setField(term199013, term199013.getClass(), "shape", null);
        setBooleanField(term199013, term199013.getClass(), "isTrayIconWindow", false);
        setIntField(term199013, term199013.getClass(), "securityWarningWidth", 0);
        setIntField(term199013, term199013.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199013, term199013.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199013, term199013.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199013, term199013.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199013, term199013.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199013, term199013.getClass(), "anchor", null);
        setField(term199013, term199013.getClass(), "type", null);
        setIntField(term199013, term199013.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199013, term199013.getClass(), "locationByPlatform", false);
        setField(term199013, term199013.getClass(), "component", null);
        setField(term199013, term199013.getClass(), "layoutMgr", null);
        setField(term199013, term199013.getClass(), "dispatcher", null);
        setField(term199013, term199013.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199013, term199013.getClass(), "focusCycleRoot", false);
        setBooleanField(term199013, term199013.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199013, term199013.getClass(), "printingThreads", null);
        setBooleanField(term199013, term199013.getClass(), "printing", false);
        setField(term199013, term199013.getClass(), "containerListener", null);
        setIntField(term199013, term199013.getClass(), "listeningChildren", 0);
        setIntField(term199013, term199013.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199013, term199013.getClass(), "descendantsCount", 0);
        setField(term199013, term199013.getClass(), "preserveBackgroundColor", null);
        setIntField(term199013, term199013.getClass(), "numOfHWComponents", 0);
        setIntField(term199013, term199013.getClass(), "numOfLWComponents", 0);
        setField(term199013, term199013.getClass(), "modalComp", null);
        setField(term199013, term199013.getClass(), "modalAppContext", null);
        setIntField(term199013, term199013.getClass(), "containerSerializedDataVersion", 0);
        setField(term199013, term199013.getClass(), "peer", null);
        setField(term199013, term199013.getClass(), "parent", null);
        setField(term199013, term199013.getClass(), "appContext", null);
        setIntField(term199013, term199013.getClass(), "x", 0);
        setIntField(term199013, term199013.getClass(), "y", 0);
        setIntField(term199013, term199013.getClass(), "width", 0);
        setIntField(term199013, term199013.getClass(), "height", 0);
        setField(term199013, term199013.getClass(), "foreground", null);
        setField(term199013, term199013.getClass(), "background", null);
        setField(term199013, term199013.getClass(), "font", null);
        setField(term199013, term199013.getClass(), "peerFont", null);
        setField(term199013, term199013.getClass(), "cursor", null);
        setField(term199013, term199013.getClass(), "locale", null);
        setField(term199013, term199013.getClass(), "graphicsConfig", null);
        setField(term199013, term199013.getClass(), "bufferStrategy", null);
        setBooleanField(term199013, term199013.getClass(), "ignoreRepaint", false);
        setBooleanField(term199013, term199013.getClass(), "visible", false);
        setBooleanField(term199013, term199013.getClass(), "enabled", false);
        setBooleanField(term199013, term199013.getClass(), "valid", false);
        setField(term199013, term199013.getClass(), "dropTarget", null);
        setField(term199013, term199013.getClass(), "popups", null);
        setField(term199013, term199013.getClass(), "name", null);
        setBooleanField(term199013, term199013.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199013, term199013.getClass(), "focusable", false);
        setIntField(term199013, term199013.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199013, term199013.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199013, term199013.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199013, term199013.getClass(), "acc", null);
        setField(term199013, term199013.getClass(), "minSize", null);
        setBooleanField(term199013, term199013.getClass(), "minSizeSet", false);
        setField(term199013, term199013.getClass(), "prefSize", null);
        setBooleanField(term199013, term199013.getClass(), "prefSizeSet", false);
        setField(term199013, term199013.getClass(), "maxSize", null);
        setBooleanField(term199013, term199013.getClass(), "maxSizeSet", false);
        setField(term199013, term199013.getClass(), "componentOrientation", null);
        setBooleanField(term199013, term199013.getClass(), "newEventsOnly", false);
        setField(term199013, term199013.getClass(), "componentListener", null);
        setField(term199013, term199013.getClass(), "focusListener", null);
        setField(term199013, term199013.getClass(), "hierarchyListener", null);
        setField(term199013, term199013.getClass(), "hierarchyBoundsListener", null);
        setField(term199013, term199013.getClass(), "keyListener", null);
        setField(term199013, term199013.getClass(), "mouseListener", null);
        setField(term199013, term199013.getClass(), "mouseMotionListener", null);
        setField(term199013, term199013.getClass(), "mouseWheelListener", null);
        setField(term199013, term199013.getClass(), "inputMethodListener", null);
        setLongField(term199013, term199013.getClass(), "eventMask", 0L);
        setField(term199013, term199013.getClass(), "changeSupport", null);
        setField(term199013, term199013.getClass(), "objectLock", null);
        setBooleanField(term199013, term199013.getClass(), "isPacked", false);
        setIntField(term199013, term199013.getClass(), "boundsOp", 0);
        setField(term199013, term199013.getClass(), "compoundShape", null);
        setField(term199013, term199013.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199013, term199013.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199013, term199013.getClass(), "backgroundEraseDisabled", false);
        setField(term199013, term199013.getClass(), "eventCache", null);
        setBooleanField(term199013, term199013.getClass(), "coalescingEnabled", false);
        setBooleanField(term199013, term199013.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199013, term199013.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectNameFormatChanges", argTypes, term199013, args);
    }

};


