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
import java.lang.Boolean;

public class Board_setReady_158309430438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198725;
     Object term198785;

    public Board_setReady_158309430438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198725 = newInstance(Class.forName("core.Board"));
        setField(term198725, term198725.getClass(), "contentPanel", null);
        setField(term198725, term198725.getClass(), "bodyLayer", null);
        setField(term198725, term198725.getClass(), "cardLayout", null);
        setField(term198725, term198725.getClass(), "semesterActivity", null);
        setField(term198725, term198725.getClass(), "moduleActivity", null);
        setField(term198725, term198725.getClass(), "settingsUI", null);
        setField(term198725, term198725.getClass(), "transcriptActivity", null);
        setField(term198725, term198725.getClass(), "analysisActivity", null);
        setField(term198725, term198725.getClass(), "helpActivity", null);
        setField(term198725, term198725.getClass(), "about", null);
        setField(term198725, term198725.getClass(), "taskActivity", null);
        setField(term198725, term198725.getClass(), "newsPresent", null);
        setField(term198725, term198725.getClass(), "alertActivity", null);
        setIntField(term198725, term198725.getClass(), "defaultCloseOperation", 0);
        setField(term198725, term198725.getClass(), "transferHandler", null);
        setField(term198725, term198725.getClass(), "rootPane", null);
        setBooleanField(term198725, term198725.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198725, term198725.getClass(), "accessibleContext", null);
        setField(term198725, term198725.getClass(), "maximizedBounds", null);
        setField(term198725, term198725.getClass(), "title", null);
        setField(term198725, term198725.getClass(), "menuBar", null);
        setBooleanField(term198725, term198725.getClass(), "resizable", false);
        setBooleanField(term198725, term198725.getClass(), "undecorated", false);
        setBooleanField(term198725, term198725.getClass(), "mbManagement", false);
        setIntField(term198725, term198725.getClass(), "state", 0);
        setField(term198725, term198725.getClass(), "ownedWindows", null);
        setIntField(term198725, term198725.getClass(), "frameSerializedDataVersion", 0);
        setField(term198725, term198725.getClass(), "warningString", null);
        setField(term198725, term198725.getClass(), "icons", null);
        setField(term198725, term198725.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198725, term198725.getClass(), "syncLWRequests", false);
        setBooleanField(term198725, term198725.getClass(), "beforeFirstShow", false);
        setBooleanField(term198725, term198725.getClass(), "disposing", false);
        setField(term198725, term198725.getClass(), "disposerRecord", null);
        setBooleanField(term198725, term198725.getClass(), "alwaysOnTop", false);
        setField(term198725, term198725.getClass(), "ownedWindowList", null);
        setField(term198725, term198725.getClass(), "weakThis", null);
        setBooleanField(term198725, term198725.getClass(), "showWithParent", false);
        setField(term198725, term198725.getClass(), "modalBlocker", null);
        setField(term198725, term198725.getClass(), "modalExclusionType", null);
        setField(term198725, term198725.getClass(), "windowListener", null);
        setField(term198725, term198725.getClass(), "windowStateListener", null);
        setField(term198725, term198725.getClass(), "windowFocusListener", null);
        setField(term198725, term198725.getClass(), "inputContext", null);
        setField(term198725, term198725.getClass(), "inputContextLock", null);
        setField(term198725, term198725.getClass(), "focusMgr", null);
        setBooleanField(term198725, term198725.getClass(), "focusableWindowState", false);
        setBooleanField(term198725, term198725.getClass(), "autoRequestFocus", false);
        setBooleanField(term198725, term198725.getClass(), "isInShow", false);
        setFloatField(term198725, term198725.getClass(), "opacity", 0.0F);
        setField(term198725, term198725.getClass(), "shape", null);
        setBooleanField(term198725, term198725.getClass(), "isTrayIconWindow", false);
        setIntField(term198725, term198725.getClass(), "securityWarningWidth", 0);
        setIntField(term198725, term198725.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198725, term198725.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198725, term198725.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198725, term198725.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198725, term198725.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198725, term198725.getClass(), "anchor", null);
        setField(term198725, term198725.getClass(), "type", null);
        setIntField(term198725, term198725.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198725, term198725.getClass(), "locationByPlatform", false);
        setField(term198725, term198725.getClass(), "component", null);
        setField(term198725, term198725.getClass(), "layoutMgr", null);
        setField(term198725, term198725.getClass(), "dispatcher", null);
        setField(term198725, term198725.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198725, term198725.getClass(), "focusCycleRoot", false);
        setBooleanField(term198725, term198725.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198725, term198725.getClass(), "printingThreads", null);
        setBooleanField(term198725, term198725.getClass(), "printing", false);
        setField(term198725, term198725.getClass(), "containerListener", null);
        setIntField(term198725, term198725.getClass(), "listeningChildren", 0);
        setIntField(term198725, term198725.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198725, term198725.getClass(), "descendantsCount", 0);
        setField(term198725, term198725.getClass(), "preserveBackgroundColor", null);
        setIntField(term198725, term198725.getClass(), "numOfHWComponents", 0);
        setIntField(term198725, term198725.getClass(), "numOfLWComponents", 0);
        setField(term198725, term198725.getClass(), "modalComp", null);
        setField(term198725, term198725.getClass(), "modalAppContext", null);
        setIntField(term198725, term198725.getClass(), "containerSerializedDataVersion", 0);
        setField(term198725, term198725.getClass(), "peer", null);
        setField(term198725, term198725.getClass(), "parent", null);
        setField(term198725, term198725.getClass(), "appContext", null);
        setIntField(term198725, term198725.getClass(), "x", 0);
        setIntField(term198725, term198725.getClass(), "y", 0);
        setIntField(term198725, term198725.getClass(), "width", 0);
        setIntField(term198725, term198725.getClass(), "height", 0);
        setField(term198725, term198725.getClass(), "foreground", null);
        setField(term198725, term198725.getClass(), "background", null);
        setField(term198725, term198725.getClass(), "font", null);
        setField(term198725, term198725.getClass(), "peerFont", null);
        setField(term198725, term198725.getClass(), "cursor", null);
        setField(term198725, term198725.getClass(), "locale", null);
        setField(term198725, term198725.getClass(), "graphicsConfig", null);
        setField(term198725, term198725.getClass(), "bufferStrategy", null);
        setBooleanField(term198725, term198725.getClass(), "ignoreRepaint", false);
        setBooleanField(term198725, term198725.getClass(), "visible", false);
        setBooleanField(term198725, term198725.getClass(), "enabled", false);
        setBooleanField(term198725, term198725.getClass(), "valid", false);
        setField(term198725, term198725.getClass(), "dropTarget", null);
        setField(term198725, term198725.getClass(), "popups", null);
        setField(term198725, term198725.getClass(), "name", null);
        setBooleanField(term198725, term198725.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198725, term198725.getClass(), "focusable", false);
        setIntField(term198725, term198725.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198725, term198725.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198725, term198725.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198725, term198725.getClass(), "acc", null);
        setField(term198725, term198725.getClass(), "minSize", null);
        setBooleanField(term198725, term198725.getClass(), "minSizeSet", false);
        setField(term198725, term198725.getClass(), "prefSize", null);
        setBooleanField(term198725, term198725.getClass(), "prefSizeSet", false);
        setField(term198725, term198725.getClass(), "maxSize", null);
        setBooleanField(term198725, term198725.getClass(), "maxSizeSet", false);
        setField(term198725, term198725.getClass(), "componentOrientation", null);
        setBooleanField(term198725, term198725.getClass(), "newEventsOnly", false);
        setField(term198725, term198725.getClass(), "componentListener", null);
        setField(term198725, term198725.getClass(), "focusListener", null);
        setField(term198725, term198725.getClass(), "hierarchyListener", null);
        setField(term198725, term198725.getClass(), "hierarchyBoundsListener", null);
        setField(term198725, term198725.getClass(), "keyListener", null);
        setField(term198725, term198725.getClass(), "mouseListener", null);
        setField(term198725, term198725.getClass(), "mouseMotionListener", null);
        setField(term198725, term198725.getClass(), "mouseWheelListener", null);
        setField(term198725, term198725.getClass(), "inputMethodListener", null);
        setLongField(term198725, term198725.getClass(), "eventMask", 0L);
        setField(term198725, term198725.getClass(), "changeSupport", null);
        setField(term198725, term198725.getClass(), "objectLock", null);
        setBooleanField(term198725, term198725.getClass(), "isPacked", false);
        setIntField(term198725, term198725.getClass(), "boundsOp", 0);
        setField(term198725, term198725.getClass(), "compoundShape", null);
        setField(term198725, term198725.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198725, term198725.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198725, term198725.getClass(), "backgroundEraseDisabled", false);
        setField(term198725, term198725.getClass(), "eventCache", null);
        setBooleanField(term198725, term198725.getClass(), "coalescingEnabled", false);
        setBooleanField(term198725, term198725.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198725, term198725.getClass(), "componentSerializedDataVersion", 0);
        term198785 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term198785;
        callMethod(klass, "setReady", argTypes, term198725, args);
    }

};


