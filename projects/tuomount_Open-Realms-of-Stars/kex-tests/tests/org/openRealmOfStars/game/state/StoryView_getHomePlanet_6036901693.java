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

public class StoryView_getHomePlanet_6036901693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170865;

    public StoryView_getHomePlanet_6036901693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170865 = newInstance(Class.forName("org.openRealmOfStars.game.state.StoryView"));
        setField(term170865, term170865.getClass(), "textArea", null);
        setField(term170865, term170865.getClass(), "map", null);
        setField(term170865, term170865.getClass(), "realm", null);
        setBooleanField(term170865, term170865.getClass(), "isAlignmentXSet", false);
        setFloatField(term170865, term170865.getClass(), "alignmentX", 0.0F);
        setBooleanField(term170865, term170865.getClass(), "isAlignmentYSet", false);
        setFloatField(term170865, term170865.getClass(), "alignmentY", 0.0F);
        setField(term170865, term170865.getClass(), "ui", null);
        setField(term170865, term170865.getClass(), "listenerList", null);
        setField(term170865, term170865.getClass(), "clientProperties", null);
        setField(term170865, term170865.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term170865, term170865.getClass(), "autoscrolls", false);
        setField(term170865, term170865.getClass(), "border", null);
        setIntField(term170865, term170865.getClass(), "flags", 0);
        setField(term170865, term170865.getClass(), "inputVerifier", null);
        setBooleanField(term170865, term170865.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term170865, term170865.getClass(), "paintingChild", null);
        setField(term170865, term170865.getClass(), "popupMenu", null);
        setField(term170865, term170865.getClass(), "revalidateRunnableScheduled", null);
        setField(term170865, term170865.getClass(), "focusInputMap", null);
        setField(term170865, term170865.getClass(), "ancestorInputMap", null);
        setField(term170865, term170865.getClass(), "windowInputMap", null);
        setField(term170865, term170865.getClass(), "actionMap", null);
        setField(term170865, term170865.getClass(), "aaHint", null);
        setField(term170865, term170865.getClass(), "lcdRenderingHint", null);
        setField(term170865, term170865.getClass(), "component", null);
        setField(term170865, term170865.getClass(), "layoutMgr", null);
        setField(term170865, term170865.getClass(), "dispatcher", null);
        setField(term170865, term170865.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term170865, term170865.getClass(), "focusCycleRoot", false);
        setBooleanField(term170865, term170865.getClass(), "focusTraversalPolicyProvider", false);
        setField(term170865, term170865.getClass(), "printingThreads", null);
        setBooleanField(term170865, term170865.getClass(), "printing", false);
        setField(term170865, term170865.getClass(), "containerListener", null);
        setIntField(term170865, term170865.getClass(), "listeningChildren", 0);
        setIntField(term170865, term170865.getClass(), "listeningBoundsChildren", 0);
        setIntField(term170865, term170865.getClass(), "descendantsCount", 0);
        setField(term170865, term170865.getClass(), "preserveBackgroundColor", null);
        setIntField(term170865, term170865.getClass(), "numOfHWComponents", 0);
        setIntField(term170865, term170865.getClass(), "numOfLWComponents", 0);
        setField(term170865, term170865.getClass(), "modalComp", null);
        setField(term170865, term170865.getClass(), "modalAppContext", null);
        setIntField(term170865, term170865.getClass(), "containerSerializedDataVersion", 0);
        setField(term170865, term170865.getClass(), "peer", null);
        setField(term170865, term170865.getClass(), "parent", null);
        setField(term170865, term170865.getClass(), "appContext", null);
        setIntField(term170865, term170865.getClass(), "x", 0);
        setIntField(term170865, term170865.getClass(), "y", 0);
        setIntField(term170865, term170865.getClass(), "width", 0);
        setIntField(term170865, term170865.getClass(), "height", 0);
        setField(term170865, term170865.getClass(), "foreground", null);
        setField(term170865, term170865.getClass(), "background", null);
        setField(term170865, term170865.getClass(), "font", null);
        setField(term170865, term170865.getClass(), "peerFont", null);
        setField(term170865, term170865.getClass(), "cursor", null);
        setField(term170865, term170865.getClass(), "locale", null);
        setField(term170865, term170865.getClass(), "graphicsConfig", null);
        setField(term170865, term170865.getClass(), "bufferStrategy", null);
        setBooleanField(term170865, term170865.getClass(), "ignoreRepaint", false);
        setBooleanField(term170865, term170865.getClass(), "visible", false);
        setBooleanField(term170865, term170865.getClass(), "enabled", false);
        setBooleanField(term170865, term170865.getClass(), "valid", false);
        setField(term170865, term170865.getClass(), "dropTarget", null);
        setField(term170865, term170865.getClass(), "popups", null);
        setField(term170865, term170865.getClass(), "name", null);
        setBooleanField(term170865, term170865.getClass(), "nameExplicitlySet", false);
        setBooleanField(term170865, term170865.getClass(), "focusable", false);
        setIntField(term170865, term170865.getClass(), "isFocusTraversableOverridden", 0);
        setField(term170865, term170865.getClass(), "focusTraversalKeys", null);
        setBooleanField(term170865, term170865.getClass(), "focusTraversalKeysEnabled", false);
        setField(term170865, term170865.getClass(), "acc", null);
        setField(term170865, term170865.getClass(), "minSize", null);
        setBooleanField(term170865, term170865.getClass(), "minSizeSet", false);
        setField(term170865, term170865.getClass(), "prefSize", null);
        setBooleanField(term170865, term170865.getClass(), "prefSizeSet", false);
        setField(term170865, term170865.getClass(), "maxSize", null);
        setBooleanField(term170865, term170865.getClass(), "maxSizeSet", false);
        setField(term170865, term170865.getClass(), "componentOrientation", null);
        setBooleanField(term170865, term170865.getClass(), "newEventsOnly", false);
        setField(term170865, term170865.getClass(), "componentListener", null);
        setField(term170865, term170865.getClass(), "focusListener", null);
        setField(term170865, term170865.getClass(), "hierarchyListener", null);
        setField(term170865, term170865.getClass(), "hierarchyBoundsListener", null);
        setField(term170865, term170865.getClass(), "keyListener", null);
        setField(term170865, term170865.getClass(), "mouseListener", null);
        setField(term170865, term170865.getClass(), "mouseMotionListener", null);
        setField(term170865, term170865.getClass(), "mouseWheelListener", null);
        setField(term170865, term170865.getClass(), "inputMethodListener", null);
        setLongField(term170865, term170865.getClass(), "eventMask", 0L);
        setField(term170865, term170865.getClass(), "changeSupport", null);
        setField(term170865, term170865.getClass(), "objectLock", null);
        setBooleanField(term170865, term170865.getClass(), "isPacked", false);
        setIntField(term170865, term170865.getClass(), "boundsOp", 0);
        setField(term170865, term170865.getClass(), "compoundShape", null);
        setField(term170865, term170865.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term170865, term170865.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term170865, term170865.getClass(), "backgroundEraseDisabled", false);
        setField(term170865, term170865.getClass(), "eventCache", null);
        setBooleanField(term170865, term170865.getClass(), "coalescingEnabled", false);
        setBooleanField(term170865, term170865.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term170865, term170865.getClass(), "componentSerializedDataVersion", 0);
        setField(term170865, term170865.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHomePlanet", argTypes, term170865, args);
    }

};


