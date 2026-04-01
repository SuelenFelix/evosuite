package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EndStoryView_getCurrentRealm_17964858389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577219;

    public EndStoryView_getCurrentRealm_17964858389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577219 = newInstance(Class.forName("org.openRealmOfStars.game.state.EndStoryView"));
        setField(term1577219, term1577219.getClass(), "textArea", null);
        setField(term1577219, term1577219.getClass(), "map", null);
        setField(term1577219, term1577219.getClass(), "centerPanel", null);
        setField(term1577219, term1577219.getClass(), "imagePanel", null);
        setIntField(term1577219, term1577219.getClass(), "index", 0);
        setField(term1577219, term1577219.getClass(), "realm", null);
        setBooleanField(term1577219, term1577219.getClass(), "isAlignmentXSet", false);
        setFloatField(term1577219, term1577219.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1577219, term1577219.getClass(), "isAlignmentYSet", false);
        setFloatField(term1577219, term1577219.getClass(), "alignmentY", 0.0F);
        setField(term1577219, term1577219.getClass(), "ui", null);
        setField(term1577219, term1577219.getClass(), "listenerList", null);
        setField(term1577219, term1577219.getClass(), "clientProperties", null);
        setField(term1577219, term1577219.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1577219, term1577219.getClass(), "autoscrolls", false);
        setField(term1577219, term1577219.getClass(), "border", null);
        setIntField(term1577219, term1577219.getClass(), "flags", 0);
        setField(term1577219, term1577219.getClass(), "inputVerifier", null);
        setBooleanField(term1577219, term1577219.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1577219, term1577219.getClass(), "paintingChild", null);
        setField(term1577219, term1577219.getClass(), "popupMenu", null);
        setField(term1577219, term1577219.getClass(), "revalidateRunnableScheduled", null);
        setField(term1577219, term1577219.getClass(), "focusInputMap", null);
        setField(term1577219, term1577219.getClass(), "ancestorInputMap", null);
        setField(term1577219, term1577219.getClass(), "windowInputMap", null);
        setField(term1577219, term1577219.getClass(), "actionMap", null);
        setField(term1577219, term1577219.getClass(), "aaHint", null);
        setField(term1577219, term1577219.getClass(), "lcdRenderingHint", null);
        setField(term1577219, term1577219.getClass(), "component", null);
        setField(term1577219, term1577219.getClass(), "layoutMgr", null);
        setField(term1577219, term1577219.getClass(), "dispatcher", null);
        setField(term1577219, term1577219.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1577219, term1577219.getClass(), "focusCycleRoot", false);
        setBooleanField(term1577219, term1577219.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1577219, term1577219.getClass(), "printingThreads", null);
        setBooleanField(term1577219, term1577219.getClass(), "printing", false);
        setField(term1577219, term1577219.getClass(), "containerListener", null);
        setIntField(term1577219, term1577219.getClass(), "listeningChildren", 0);
        setIntField(term1577219, term1577219.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1577219, term1577219.getClass(), "descendantsCount", 0);
        setField(term1577219, term1577219.getClass(), "preserveBackgroundColor", null);
        setIntField(term1577219, term1577219.getClass(), "numOfHWComponents", 0);
        setIntField(term1577219, term1577219.getClass(), "numOfLWComponents", 0);
        setField(term1577219, term1577219.getClass(), "modalComp", null);
        setField(term1577219, term1577219.getClass(), "modalAppContext", null);
        setIntField(term1577219, term1577219.getClass(), "containerSerializedDataVersion", 0);
        setField(term1577219, term1577219.getClass(), "peer", null);
        setField(term1577219, term1577219.getClass(), "parent", null);
        setField(term1577219, term1577219.getClass(), "appContext", null);
        setIntField(term1577219, term1577219.getClass(), "x", 0);
        setIntField(term1577219, term1577219.getClass(), "y", 0);
        setIntField(term1577219, term1577219.getClass(), "width", 0);
        setIntField(term1577219, term1577219.getClass(), "height", 0);
        setField(term1577219, term1577219.getClass(), "foreground", null);
        setField(term1577219, term1577219.getClass(), "background", null);
        setField(term1577219, term1577219.getClass(), "font", null);
        setField(term1577219, term1577219.getClass(), "peerFont", null);
        setField(term1577219, term1577219.getClass(), "cursor", null);
        setField(term1577219, term1577219.getClass(), "locale", null);
        setField(term1577219, term1577219.getClass(), "graphicsConfig", null);
        setField(term1577219, term1577219.getClass(), "bufferStrategy", null);
        setBooleanField(term1577219, term1577219.getClass(), "ignoreRepaint", false);
        setBooleanField(term1577219, term1577219.getClass(), "visible", false);
        setBooleanField(term1577219, term1577219.getClass(), "enabled", false);
        setBooleanField(term1577219, term1577219.getClass(), "valid", false);
        setField(term1577219, term1577219.getClass(), "dropTarget", null);
        setField(term1577219, term1577219.getClass(), "popups", null);
        setField(term1577219, term1577219.getClass(), "name", null);
        setBooleanField(term1577219, term1577219.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1577219, term1577219.getClass(), "focusable", false);
        setIntField(term1577219, term1577219.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1577219, term1577219.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1577219, term1577219.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1577219, term1577219.getClass(), "acc", null);
        setField(term1577219, term1577219.getClass(), "minSize", null);
        setBooleanField(term1577219, term1577219.getClass(), "minSizeSet", false);
        setField(term1577219, term1577219.getClass(), "prefSize", null);
        setBooleanField(term1577219, term1577219.getClass(), "prefSizeSet", false);
        setField(term1577219, term1577219.getClass(), "maxSize", null);
        setBooleanField(term1577219, term1577219.getClass(), "maxSizeSet", false);
        setField(term1577219, term1577219.getClass(), "componentOrientation", null);
        setBooleanField(term1577219, term1577219.getClass(), "newEventsOnly", false);
        setField(term1577219, term1577219.getClass(), "componentListener", null);
        setField(term1577219, term1577219.getClass(), "focusListener", null);
        setField(term1577219, term1577219.getClass(), "hierarchyListener", null);
        setField(term1577219, term1577219.getClass(), "hierarchyBoundsListener", null);
        setField(term1577219, term1577219.getClass(), "keyListener", null);
        setField(term1577219, term1577219.getClass(), "mouseListener", null);
        setField(term1577219, term1577219.getClass(), "mouseMotionListener", null);
        setField(term1577219, term1577219.getClass(), "mouseWheelListener", null);
        setField(term1577219, term1577219.getClass(), "inputMethodListener", null);
        setLongField(term1577219, term1577219.getClass(), "eventMask", 0L);
        setField(term1577219, term1577219.getClass(), "changeSupport", null);
        setField(term1577219, term1577219.getClass(), "objectLock", null);
        setBooleanField(term1577219, term1577219.getClass(), "isPacked", false);
        setIntField(term1577219, term1577219.getClass(), "boundsOp", 0);
        setField(term1577219, term1577219.getClass(), "compoundShape", null);
        setField(term1577219, term1577219.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1577219, term1577219.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1577219, term1577219.getClass(), "backgroundEraseDisabled", false);
        setField(term1577219, term1577219.getClass(), "eventCache", null);
        setBooleanField(term1577219, term1577219.getClass(), "coalescingEnabled", false);
        setBooleanField(term1577219, term1577219.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1577219, term1577219.getClass(), "componentSerializedDataVersion", 0);
        setField(term1577219, term1577219.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EndStoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentRealm", argTypes, term1577219, args);
    }

};


