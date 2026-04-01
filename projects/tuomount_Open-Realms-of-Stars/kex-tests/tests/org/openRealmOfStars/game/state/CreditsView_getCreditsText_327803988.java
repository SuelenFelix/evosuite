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

public class CreditsView_getCreditsText_327803988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501834;

    public CreditsView_getCreditsText_327803988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501834 = newInstance(Class.forName("org.openRealmOfStars.game.state.CreditsView"));
        setField(term1501834, term1501834.getClass(), "textArea", null);
        setBooleanField(term1501834, term1501834.getClass(), "isAlignmentXSet", false);
        setFloatField(term1501834, term1501834.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1501834, term1501834.getClass(), "isAlignmentYSet", false);
        setFloatField(term1501834, term1501834.getClass(), "alignmentY", 0.0F);
        setField(term1501834, term1501834.getClass(), "ui", null);
        setField(term1501834, term1501834.getClass(), "listenerList", null);
        setField(term1501834, term1501834.getClass(), "clientProperties", null);
        setField(term1501834, term1501834.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1501834, term1501834.getClass(), "autoscrolls", false);
        setField(term1501834, term1501834.getClass(), "border", null);
        setIntField(term1501834, term1501834.getClass(), "flags", 0);
        setField(term1501834, term1501834.getClass(), "inputVerifier", null);
        setBooleanField(term1501834, term1501834.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1501834, term1501834.getClass(), "paintingChild", null);
        setField(term1501834, term1501834.getClass(), "popupMenu", null);
        setField(term1501834, term1501834.getClass(), "revalidateRunnableScheduled", null);
        setField(term1501834, term1501834.getClass(), "focusInputMap", null);
        setField(term1501834, term1501834.getClass(), "ancestorInputMap", null);
        setField(term1501834, term1501834.getClass(), "windowInputMap", null);
        setField(term1501834, term1501834.getClass(), "actionMap", null);
        setField(term1501834, term1501834.getClass(), "aaHint", null);
        setField(term1501834, term1501834.getClass(), "lcdRenderingHint", null);
        setField(term1501834, term1501834.getClass(), "component", null);
        setField(term1501834, term1501834.getClass(), "layoutMgr", null);
        setField(term1501834, term1501834.getClass(), "dispatcher", null);
        setField(term1501834, term1501834.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1501834, term1501834.getClass(), "focusCycleRoot", false);
        setBooleanField(term1501834, term1501834.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1501834, term1501834.getClass(), "printingThreads", null);
        setBooleanField(term1501834, term1501834.getClass(), "printing", false);
        setField(term1501834, term1501834.getClass(), "containerListener", null);
        setIntField(term1501834, term1501834.getClass(), "listeningChildren", 0);
        setIntField(term1501834, term1501834.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1501834, term1501834.getClass(), "descendantsCount", 0);
        setField(term1501834, term1501834.getClass(), "preserveBackgroundColor", null);
        setIntField(term1501834, term1501834.getClass(), "numOfHWComponents", 0);
        setIntField(term1501834, term1501834.getClass(), "numOfLWComponents", 0);
        setField(term1501834, term1501834.getClass(), "modalComp", null);
        setField(term1501834, term1501834.getClass(), "modalAppContext", null);
        setIntField(term1501834, term1501834.getClass(), "containerSerializedDataVersion", 0);
        setField(term1501834, term1501834.getClass(), "peer", null);
        setField(term1501834, term1501834.getClass(), "parent", null);
        setField(term1501834, term1501834.getClass(), "appContext", null);
        setIntField(term1501834, term1501834.getClass(), "x", 0);
        setIntField(term1501834, term1501834.getClass(), "y", 0);
        setIntField(term1501834, term1501834.getClass(), "width", 0);
        setIntField(term1501834, term1501834.getClass(), "height", 0);
        setField(term1501834, term1501834.getClass(), "foreground", null);
        setField(term1501834, term1501834.getClass(), "background", null);
        setField(term1501834, term1501834.getClass(), "font", null);
        setField(term1501834, term1501834.getClass(), "peerFont", null);
        setField(term1501834, term1501834.getClass(), "cursor", null);
        setField(term1501834, term1501834.getClass(), "locale", null);
        setField(term1501834, term1501834.getClass(), "graphicsConfig", null);
        setField(term1501834, term1501834.getClass(), "bufferStrategy", null);
        setBooleanField(term1501834, term1501834.getClass(), "ignoreRepaint", false);
        setBooleanField(term1501834, term1501834.getClass(), "visible", false);
        setBooleanField(term1501834, term1501834.getClass(), "enabled", false);
        setBooleanField(term1501834, term1501834.getClass(), "valid", false);
        setField(term1501834, term1501834.getClass(), "dropTarget", null);
        setField(term1501834, term1501834.getClass(), "popups", null);
        setField(term1501834, term1501834.getClass(), "name", null);
        setBooleanField(term1501834, term1501834.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1501834, term1501834.getClass(), "focusable", false);
        setIntField(term1501834, term1501834.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1501834, term1501834.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1501834, term1501834.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1501834, term1501834.getClass(), "acc", null);
        setField(term1501834, term1501834.getClass(), "minSize", null);
        setBooleanField(term1501834, term1501834.getClass(), "minSizeSet", false);
        setField(term1501834, term1501834.getClass(), "prefSize", null);
        setBooleanField(term1501834, term1501834.getClass(), "prefSizeSet", false);
        setField(term1501834, term1501834.getClass(), "maxSize", null);
        setBooleanField(term1501834, term1501834.getClass(), "maxSizeSet", false);
        setField(term1501834, term1501834.getClass(), "componentOrientation", null);
        setBooleanField(term1501834, term1501834.getClass(), "newEventsOnly", false);
        setField(term1501834, term1501834.getClass(), "componentListener", null);
        setField(term1501834, term1501834.getClass(), "focusListener", null);
        setField(term1501834, term1501834.getClass(), "hierarchyListener", null);
        setField(term1501834, term1501834.getClass(), "hierarchyBoundsListener", null);
        setField(term1501834, term1501834.getClass(), "keyListener", null);
        setField(term1501834, term1501834.getClass(), "mouseListener", null);
        setField(term1501834, term1501834.getClass(), "mouseMotionListener", null);
        setField(term1501834, term1501834.getClass(), "mouseWheelListener", null);
        setField(term1501834, term1501834.getClass(), "inputMethodListener", null);
        setLongField(term1501834, term1501834.getClass(), "eventMask", 0L);
        setField(term1501834, term1501834.getClass(), "changeSupport", null);
        setField(term1501834, term1501834.getClass(), "objectLock", null);
        setBooleanField(term1501834, term1501834.getClass(), "isPacked", false);
        setIntField(term1501834, term1501834.getClass(), "boundsOp", 0);
        setField(term1501834, term1501834.getClass(), "compoundShape", null);
        setField(term1501834, term1501834.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1501834, term1501834.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1501834, term1501834.getClass(), "backgroundEraseDisabled", false);
        setField(term1501834, term1501834.getClass(), "eventCache", null);
        setBooleanField(term1501834, term1501834.getClass(), "coalescingEnabled", false);
        setBooleanField(term1501834, term1501834.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1501834, term1501834.getClass(), "componentSerializedDataVersion", 0);
        setField(term1501834, term1501834.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.CreditsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreditsText", argTypes, term1501834, args);
    }

};


