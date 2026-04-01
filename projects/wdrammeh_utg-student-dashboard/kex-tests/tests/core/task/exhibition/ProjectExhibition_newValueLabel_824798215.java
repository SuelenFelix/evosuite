package core.task.exhibition;

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
import static core.task.exhibition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectExhibition_newValueLabel_824798215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375819;

    public ProjectExhibition_newValueLabel_824798215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375819 = newInstance(Class.forName("core.task.exhibition.ProjectExhibition"));
        setIntField(term375819, term375819.getClass(), "defaultCloseOperation", 0);
        setField(term375819, term375819.getClass(), "rootPane", null);
        setBooleanField(term375819, term375819.getClass(), "rootPaneCheckingEnabled", false);
        setField(term375819, term375819.getClass(), "transferHandler", null);
        setField(term375819, term375819.getClass(), "accessibleContext", null);
        setBooleanField(term375819, term375819.getClass(), "resizable", false);
        setBooleanField(term375819, term375819.getClass(), "undecorated", false);
        setBooleanField(term375819, term375819.getClass(), "initialized", false);
        setBooleanField(term375819, term375819.getClass(), "modal", false);
        setField(term375819, term375819.getClass(), "modalityType", null);
        setField(term375819, term375819.getClass(), "blockedWindows", null);
        setField(term375819, term375819.getClass(), "title", null);
        setField(term375819, term375819.getClass(), "modalFilter", null);
        setField(term375819, term375819.getClass(), "secondaryLoop", null);
        setBooleanField(term375819, term375819.getClass(), "isInHide", false);
        setBooleanField(term375819, term375819.getClass(), "isInDispose", false);
        setField(term375819, term375819.getClass(), "warningString", null);
        setField(term375819, term375819.getClass(), "icons", null);
        setField(term375819, term375819.getClass(), "temporaryLostComponent", null);
        setBooleanField(term375819, term375819.getClass(), "syncLWRequests", false);
        setBooleanField(term375819, term375819.getClass(), "beforeFirstShow", false);
        setBooleanField(term375819, term375819.getClass(), "disposing", false);
        setField(term375819, term375819.getClass(), "disposerRecord", null);
        setIntField(term375819, term375819.getClass(), "state", 0);
        setBooleanField(term375819, term375819.getClass(), "alwaysOnTop", false);
        setField(term375819, term375819.getClass(), "ownedWindowList", null);
        setField(term375819, term375819.getClass(), "weakThis", null);
        setBooleanField(term375819, term375819.getClass(), "showWithParent", false);
        setField(term375819, term375819.getClass(), "modalBlocker", null);
        setField(term375819, term375819.getClass(), "modalExclusionType", null);
        setField(term375819, term375819.getClass(), "windowListener", null);
        setField(term375819, term375819.getClass(), "windowStateListener", null);
        setField(term375819, term375819.getClass(), "windowFocusListener", null);
        setField(term375819, term375819.getClass(), "inputContext", null);
        setField(term375819, term375819.getClass(), "inputContextLock", null);
        setField(term375819, term375819.getClass(), "focusMgr", null);
        setBooleanField(term375819, term375819.getClass(), "focusableWindowState", false);
        setBooleanField(term375819, term375819.getClass(), "autoRequestFocus", false);
        setBooleanField(term375819, term375819.getClass(), "isInShow", false);
        setFloatField(term375819, term375819.getClass(), "opacity", 0.0F);
        setField(term375819, term375819.getClass(), "shape", null);
        setBooleanField(term375819, term375819.getClass(), "isTrayIconWindow", false);
        setIntField(term375819, term375819.getClass(), "securityWarningWidth", 0);
        setIntField(term375819, term375819.getClass(), "securityWarningHeight", 0);
        setDoubleField(term375819, term375819.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term375819, term375819.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term375819, term375819.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term375819, term375819.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term375819, term375819.getClass(), "anchor", null);
        setField(term375819, term375819.getClass(), "type", null);
        setIntField(term375819, term375819.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term375819, term375819.getClass(), "locationByPlatform", false);
        setField(term375819, term375819.getClass(), "component", null);
        setField(term375819, term375819.getClass(), "layoutMgr", null);
        setField(term375819, term375819.getClass(), "dispatcher", null);
        setField(term375819, term375819.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term375819, term375819.getClass(), "focusCycleRoot", false);
        setBooleanField(term375819, term375819.getClass(), "focusTraversalPolicyProvider", false);
        setField(term375819, term375819.getClass(), "printingThreads", null);
        setBooleanField(term375819, term375819.getClass(), "printing", false);
        setField(term375819, term375819.getClass(), "containerListener", null);
        setIntField(term375819, term375819.getClass(), "listeningChildren", 0);
        setIntField(term375819, term375819.getClass(), "listeningBoundsChildren", 0);
        setIntField(term375819, term375819.getClass(), "descendantsCount", 0);
        setField(term375819, term375819.getClass(), "preserveBackgroundColor", null);
        setIntField(term375819, term375819.getClass(), "numOfHWComponents", 0);
        setIntField(term375819, term375819.getClass(), "numOfLWComponents", 0);
        setField(term375819, term375819.getClass(), "modalComp", null);
        setField(term375819, term375819.getClass(), "modalAppContext", null);
        setIntField(term375819, term375819.getClass(), "containerSerializedDataVersion", 0);
        setField(term375819, term375819.getClass(), "peer", null);
        setField(term375819, term375819.getClass(), "parent", null);
        setField(term375819, term375819.getClass(), "appContext", null);
        setIntField(term375819, term375819.getClass(), "x", 0);
        setIntField(term375819, term375819.getClass(), "y", 0);
        setIntField(term375819, term375819.getClass(), "width", 0);
        setIntField(term375819, term375819.getClass(), "height", 0);
        setField(term375819, term375819.getClass(), "foreground", null);
        setField(term375819, term375819.getClass(), "background", null);
        setField(term375819, term375819.getClass(), "font", null);
        setField(term375819, term375819.getClass(), "peerFont", null);
        setField(term375819, term375819.getClass(), "cursor", null);
        setField(term375819, term375819.getClass(), "locale", null);
        setField(term375819, term375819.getClass(), "graphicsConfig", null);
        setField(term375819, term375819.getClass(), "bufferStrategy", null);
        setBooleanField(term375819, term375819.getClass(), "ignoreRepaint", false);
        setBooleanField(term375819, term375819.getClass(), "visible", false);
        setBooleanField(term375819, term375819.getClass(), "enabled", false);
        setBooleanField(term375819, term375819.getClass(), "valid", false);
        setField(term375819, term375819.getClass(), "dropTarget", null);
        setField(term375819, term375819.getClass(), "popups", null);
        setField(term375819, term375819.getClass(), "name", null);
        setBooleanField(term375819, term375819.getClass(), "nameExplicitlySet", false);
        setBooleanField(term375819, term375819.getClass(), "focusable", false);
        setIntField(term375819, term375819.getClass(), "isFocusTraversableOverridden", 0);
        setField(term375819, term375819.getClass(), "focusTraversalKeys", null);
        setBooleanField(term375819, term375819.getClass(), "focusTraversalKeysEnabled", false);
        setField(term375819, term375819.getClass(), "acc", null);
        setField(term375819, term375819.getClass(), "minSize", null);
        setBooleanField(term375819, term375819.getClass(), "minSizeSet", false);
        setField(term375819, term375819.getClass(), "prefSize", null);
        setBooleanField(term375819, term375819.getClass(), "prefSizeSet", false);
        setField(term375819, term375819.getClass(), "maxSize", null);
        setBooleanField(term375819, term375819.getClass(), "maxSizeSet", false);
        setField(term375819, term375819.getClass(), "componentOrientation", null);
        setBooleanField(term375819, term375819.getClass(), "newEventsOnly", false);
        setField(term375819, term375819.getClass(), "componentListener", null);
        setField(term375819, term375819.getClass(), "focusListener", null);
        setField(term375819, term375819.getClass(), "hierarchyListener", null);
        setField(term375819, term375819.getClass(), "hierarchyBoundsListener", null);
        setField(term375819, term375819.getClass(), "keyListener", null);
        setField(term375819, term375819.getClass(), "mouseListener", null);
        setField(term375819, term375819.getClass(), "mouseMotionListener", null);
        setField(term375819, term375819.getClass(), "mouseWheelListener", null);
        setField(term375819, term375819.getClass(), "inputMethodListener", null);
        setLongField(term375819, term375819.getClass(), "eventMask", 0L);
        setField(term375819, term375819.getClass(), "changeSupport", null);
        setField(term375819, term375819.getClass(), "objectLock", null);
        setBooleanField(term375819, term375819.getClass(), "isPacked", false);
        setIntField(term375819, term375819.getClass(), "boundsOp", 0);
        setField(term375819, term375819.getClass(), "compoundShape", null);
        setField(term375819, term375819.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term375819, term375819.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term375819, term375819.getClass(), "backgroundEraseDisabled", false);
        setField(term375819, term375819.getClass(), "eventCache", null);
        setBooleanField(term375819, term375819.getClass(), "coalescingEnabled", false);
        setBooleanField(term375819, term375819.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term375819, term375819.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.ProjectExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term375819, args);
    }

};


