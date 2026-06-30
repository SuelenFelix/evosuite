package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class AssignmentSelf_MemberExhibitor_appendNewMember_12245635122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26899;
     Object term26962;

    public AssignmentSelf_MemberExhibitor_appendNewMember_12245635122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26899 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor"));
        setIntField(term26899, term26899.getClass(), "pX", 0);
        setIntField(term26899, term26899.getClass(), "pY", 0);
        setField(term26899, term26899.getClass(), "membersPanel", null);
        setField(term26899, term26899.getClass(), "memberAdder", null);
        setField(term26899, term26899.getClass(), "assignmentSelf", null);
        setIntField(term26899, term26899.getClass(), "defaultCloseOperation", 0);
        setField(term26899, term26899.getClass(), "rootPane", null);
        setBooleanField(term26899, term26899.getClass(), "rootPaneCheckingEnabled", false);
        setField(term26899, term26899.getClass(), "transferHandler", null);
        setField(term26899, term26899.getClass(), "accessibleContext", null);
        setBooleanField(term26899, term26899.getClass(), "resizable", false);
        setBooleanField(term26899, term26899.getClass(), "undecorated", false);
        setBooleanField(term26899, term26899.getClass(), "initialized", false);
        setBooleanField(term26899, term26899.getClass(), "modal", false);
        setField(term26899, term26899.getClass(), "modalityType", null);
        setField(term26899, term26899.getClass(), "blockedWindows", null);
        setField(term26899, term26899.getClass(), "title", null);
        setField(term26899, term26899.getClass(), "modalFilter", null);
        setField(term26899, term26899.getClass(), "secondaryLoop", null);
        setBooleanField(term26899, term26899.getClass(), "isInHide", false);
        setBooleanField(term26899, term26899.getClass(), "isInDispose", false);
        setField(term26899, term26899.getClass(), "warningString", null);
        setField(term26899, term26899.getClass(), "icons", null);
        setField(term26899, term26899.getClass(), "temporaryLostComponent", null);
        setBooleanField(term26899, term26899.getClass(), "syncLWRequests", false);
        setBooleanField(term26899, term26899.getClass(), "beforeFirstShow", false);
        setBooleanField(term26899, term26899.getClass(), "disposing", false);
        setField(term26899, term26899.getClass(), "disposerRecord", null);
        setIntField(term26899, term26899.getClass(), "state", 0);
        setBooleanField(term26899, term26899.getClass(), "alwaysOnTop", false);
        setField(term26899, term26899.getClass(), "ownedWindowList", null);
        setField(term26899, term26899.getClass(), "weakThis", null);
        setBooleanField(term26899, term26899.getClass(), "showWithParent", false);
        setField(term26899, term26899.getClass(), "modalBlocker", null);
        setField(term26899, term26899.getClass(), "modalExclusionType", null);
        setField(term26899, term26899.getClass(), "windowListener", null);
        setField(term26899, term26899.getClass(), "windowStateListener", null);
        setField(term26899, term26899.getClass(), "windowFocusListener", null);
        setField(term26899, term26899.getClass(), "inputContext", null);
        setField(term26899, term26899.getClass(), "inputContextLock", null);
        setField(term26899, term26899.getClass(), "focusMgr", null);
        setBooleanField(term26899, term26899.getClass(), "focusableWindowState", false);
        setBooleanField(term26899, term26899.getClass(), "autoRequestFocus", false);
        setBooleanField(term26899, term26899.getClass(), "isInShow", false);
        setFloatField(term26899, term26899.getClass(), "opacity", 0.0F);
        setField(term26899, term26899.getClass(), "shape", null);
        setBooleanField(term26899, term26899.getClass(), "isTrayIconWindow", false);
        setIntField(term26899, term26899.getClass(), "securityWarningWidth", 0);
        setIntField(term26899, term26899.getClass(), "securityWarningHeight", 0);
        setDoubleField(term26899, term26899.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term26899, term26899.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term26899, term26899.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term26899, term26899.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term26899, term26899.getClass(), "anchor", null);
        setField(term26899, term26899.getClass(), "type", null);
        setIntField(term26899, term26899.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term26899, term26899.getClass(), "locationByPlatform", false);
        setField(term26899, term26899.getClass(), "component", null);
        setField(term26899, term26899.getClass(), "layoutMgr", null);
        setField(term26899, term26899.getClass(), "dispatcher", null);
        setField(term26899, term26899.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26899, term26899.getClass(), "focusCycleRoot", false);
        setBooleanField(term26899, term26899.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26899, term26899.getClass(), "printingThreads", null);
        setBooleanField(term26899, term26899.getClass(), "printing", false);
        setField(term26899, term26899.getClass(), "containerListener", null);
        setIntField(term26899, term26899.getClass(), "listeningChildren", 0);
        setIntField(term26899, term26899.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26899, term26899.getClass(), "descendantsCount", 0);
        setField(term26899, term26899.getClass(), "preserveBackgroundColor", null);
        setIntField(term26899, term26899.getClass(), "numOfHWComponents", 0);
        setIntField(term26899, term26899.getClass(), "numOfLWComponents", 0);
        setField(term26899, term26899.getClass(), "modalComp", null);
        setField(term26899, term26899.getClass(), "modalAppContext", null);
        setIntField(term26899, term26899.getClass(), "containerSerializedDataVersion", 0);
        setField(term26899, term26899.getClass(), "peer", null);
        setField(term26899, term26899.getClass(), "parent", null);
        setField(term26899, term26899.getClass(), "appContext", null);
        setIntField(term26899, term26899.getClass(), "x", 0);
        setIntField(term26899, term26899.getClass(), "y", 0);
        setIntField(term26899, term26899.getClass(), "width", 0);
        setIntField(term26899, term26899.getClass(), "height", 0);
        setField(term26899, term26899.getClass(), "foreground", null);
        setField(term26899, term26899.getClass(), "background", null);
        setField(term26899, term26899.getClass(), "font", null);
        setField(term26899, term26899.getClass(), "peerFont", null);
        setField(term26899, term26899.getClass(), "cursor", null);
        setField(term26899, term26899.getClass(), "locale", null);
        setField(term26899, term26899.getClass(), "graphicsConfig", null);
        setField(term26899, term26899.getClass(), "bufferStrategy", null);
        setBooleanField(term26899, term26899.getClass(), "ignoreRepaint", false);
        setBooleanField(term26899, term26899.getClass(), "visible", false);
        setBooleanField(term26899, term26899.getClass(), "enabled", false);
        setBooleanField(term26899, term26899.getClass(), "valid", false);
        setField(term26899, term26899.getClass(), "dropTarget", null);
        setField(term26899, term26899.getClass(), "popups", null);
        setField(term26899, term26899.getClass(), "name", null);
        setBooleanField(term26899, term26899.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26899, term26899.getClass(), "focusable", false);
        setIntField(term26899, term26899.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26899, term26899.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26899, term26899.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26899, term26899.getClass(), "acc", null);
        setField(term26899, term26899.getClass(), "minSize", null);
        setBooleanField(term26899, term26899.getClass(), "minSizeSet", false);
        setField(term26899, term26899.getClass(), "prefSize", null);
        setBooleanField(term26899, term26899.getClass(), "prefSizeSet", false);
        setField(term26899, term26899.getClass(), "maxSize", null);
        setBooleanField(term26899, term26899.getClass(), "maxSizeSet", false);
        setField(term26899, term26899.getClass(), "componentOrientation", null);
        setBooleanField(term26899, term26899.getClass(), "newEventsOnly", false);
        setField(term26899, term26899.getClass(), "componentListener", null);
        setField(term26899, term26899.getClass(), "focusListener", null);
        setField(term26899, term26899.getClass(), "hierarchyListener", null);
        setField(term26899, term26899.getClass(), "hierarchyBoundsListener", null);
        setField(term26899, term26899.getClass(), "keyListener", null);
        setField(term26899, term26899.getClass(), "mouseListener", null);
        setField(term26899, term26899.getClass(), "mouseMotionListener", null);
        setField(term26899, term26899.getClass(), "mouseWheelListener", null);
        setField(term26899, term26899.getClass(), "inputMethodListener", null);
        setLongField(term26899, term26899.getClass(), "eventMask", 0L);
        setField(term26899, term26899.getClass(), "changeSupport", null);
        setField(term26899, term26899.getClass(), "objectLock", null);
        setBooleanField(term26899, term26899.getClass(), "isPacked", false);
        setIntField(term26899, term26899.getClass(), "boundsOp", 0);
        setField(term26899, term26899.getClass(), "compoundShape", null);
        setField(term26899, term26899.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26899, term26899.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26899, term26899.getClass(), "backgroundEraseDisabled", false);
        setField(term26899, term26899.getClass(), "eventCache", null);
        setBooleanField(term26899, term26899.getClass(), "coalescingEnabled", false);
        setBooleanField(term26899, term26899.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26899, term26899.getClass(), "componentSerializedDataVersion", 0);
        term26962 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26962;
        callMethod(klass, "appendNewMember", argTypes, term26899, args);
    }

};


