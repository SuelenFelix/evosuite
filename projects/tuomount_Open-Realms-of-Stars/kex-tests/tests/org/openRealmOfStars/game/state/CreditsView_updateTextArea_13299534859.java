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

public class CreditsView_updateTextArea_13299534859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501875;

    public CreditsView_updateTextArea_13299534859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501875 = newInstance(Class.forName("org.openRealmOfStars.game.state.CreditsView"));
        setField(term1501875, term1501875.getClass(), "textArea", null);
        setBooleanField(term1501875, term1501875.getClass(), "isAlignmentXSet", false);
        setFloatField(term1501875, term1501875.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1501875, term1501875.getClass(), "isAlignmentYSet", false);
        setFloatField(term1501875, term1501875.getClass(), "alignmentY", 0.0F);
        setField(term1501875, term1501875.getClass(), "ui", null);
        setField(term1501875, term1501875.getClass(), "listenerList", null);
        setField(term1501875, term1501875.getClass(), "clientProperties", null);
        setField(term1501875, term1501875.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1501875, term1501875.getClass(), "autoscrolls", false);
        setField(term1501875, term1501875.getClass(), "border", null);
        setIntField(term1501875, term1501875.getClass(), "flags", 0);
        setField(term1501875, term1501875.getClass(), "inputVerifier", null);
        setBooleanField(term1501875, term1501875.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1501875, term1501875.getClass(), "paintingChild", null);
        setField(term1501875, term1501875.getClass(), "popupMenu", null);
        setField(term1501875, term1501875.getClass(), "revalidateRunnableScheduled", null);
        setField(term1501875, term1501875.getClass(), "focusInputMap", null);
        setField(term1501875, term1501875.getClass(), "ancestorInputMap", null);
        setField(term1501875, term1501875.getClass(), "windowInputMap", null);
        setField(term1501875, term1501875.getClass(), "actionMap", null);
        setField(term1501875, term1501875.getClass(), "aaHint", null);
        setField(term1501875, term1501875.getClass(), "lcdRenderingHint", null);
        setField(term1501875, term1501875.getClass(), "component", null);
        setField(term1501875, term1501875.getClass(), "layoutMgr", null);
        setField(term1501875, term1501875.getClass(), "dispatcher", null);
        setField(term1501875, term1501875.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1501875, term1501875.getClass(), "focusCycleRoot", false);
        setBooleanField(term1501875, term1501875.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1501875, term1501875.getClass(), "printingThreads", null);
        setBooleanField(term1501875, term1501875.getClass(), "printing", false);
        setField(term1501875, term1501875.getClass(), "containerListener", null);
        setIntField(term1501875, term1501875.getClass(), "listeningChildren", 0);
        setIntField(term1501875, term1501875.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1501875, term1501875.getClass(), "descendantsCount", 0);
        setField(term1501875, term1501875.getClass(), "preserveBackgroundColor", null);
        setIntField(term1501875, term1501875.getClass(), "numOfHWComponents", 0);
        setIntField(term1501875, term1501875.getClass(), "numOfLWComponents", 0);
        setField(term1501875, term1501875.getClass(), "modalComp", null);
        setField(term1501875, term1501875.getClass(), "modalAppContext", null);
        setIntField(term1501875, term1501875.getClass(), "containerSerializedDataVersion", 0);
        setField(term1501875, term1501875.getClass(), "peer", null);
        setField(term1501875, term1501875.getClass(), "parent", null);
        setField(term1501875, term1501875.getClass(), "appContext", null);
        setIntField(term1501875, term1501875.getClass(), "x", 0);
        setIntField(term1501875, term1501875.getClass(), "y", 0);
        setIntField(term1501875, term1501875.getClass(), "width", 0);
        setIntField(term1501875, term1501875.getClass(), "height", 0);
        setField(term1501875, term1501875.getClass(), "foreground", null);
        setField(term1501875, term1501875.getClass(), "background", null);
        setField(term1501875, term1501875.getClass(), "font", null);
        setField(term1501875, term1501875.getClass(), "peerFont", null);
        setField(term1501875, term1501875.getClass(), "cursor", null);
        setField(term1501875, term1501875.getClass(), "locale", null);
        setField(term1501875, term1501875.getClass(), "graphicsConfig", null);
        setField(term1501875, term1501875.getClass(), "bufferStrategy", null);
        setBooleanField(term1501875, term1501875.getClass(), "ignoreRepaint", false);
        setBooleanField(term1501875, term1501875.getClass(), "visible", false);
        setBooleanField(term1501875, term1501875.getClass(), "enabled", false);
        setBooleanField(term1501875, term1501875.getClass(), "valid", false);
        setField(term1501875, term1501875.getClass(), "dropTarget", null);
        setField(term1501875, term1501875.getClass(), "popups", null);
        setField(term1501875, term1501875.getClass(), "name", null);
        setBooleanField(term1501875, term1501875.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1501875, term1501875.getClass(), "focusable", false);
        setIntField(term1501875, term1501875.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1501875, term1501875.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1501875, term1501875.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1501875, term1501875.getClass(), "acc", null);
        setField(term1501875, term1501875.getClass(), "minSize", null);
        setBooleanField(term1501875, term1501875.getClass(), "minSizeSet", false);
        setField(term1501875, term1501875.getClass(), "prefSize", null);
        setBooleanField(term1501875, term1501875.getClass(), "prefSizeSet", false);
        setField(term1501875, term1501875.getClass(), "maxSize", null);
        setBooleanField(term1501875, term1501875.getClass(), "maxSizeSet", false);
        setField(term1501875, term1501875.getClass(), "componentOrientation", null);
        setBooleanField(term1501875, term1501875.getClass(), "newEventsOnly", false);
        setField(term1501875, term1501875.getClass(), "componentListener", null);
        setField(term1501875, term1501875.getClass(), "focusListener", null);
        setField(term1501875, term1501875.getClass(), "hierarchyListener", null);
        setField(term1501875, term1501875.getClass(), "hierarchyBoundsListener", null);
        setField(term1501875, term1501875.getClass(), "keyListener", null);
        setField(term1501875, term1501875.getClass(), "mouseListener", null);
        setField(term1501875, term1501875.getClass(), "mouseMotionListener", null);
        setField(term1501875, term1501875.getClass(), "mouseWheelListener", null);
        setField(term1501875, term1501875.getClass(), "inputMethodListener", null);
        setLongField(term1501875, term1501875.getClass(), "eventMask", 0L);
        setField(term1501875, term1501875.getClass(), "changeSupport", null);
        setField(term1501875, term1501875.getClass(), "objectLock", null);
        setBooleanField(term1501875, term1501875.getClass(), "isPacked", false);
        setIntField(term1501875, term1501875.getClass(), "boundsOp", 0);
        setField(term1501875, term1501875.getClass(), "compoundShape", null);
        setField(term1501875, term1501875.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1501875, term1501875.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1501875, term1501875.getClass(), "backgroundEraseDisabled", false);
        setField(term1501875, term1501875.getClass(), "eventCache", null);
        setBooleanField(term1501875, term1501875.getClass(), "coalescingEnabled", false);
        setBooleanField(term1501875, term1501875.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1501875, term1501875.getClass(), "componentSerializedDataVersion", 0);
        setField(term1501875, term1501875.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.CreditsView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateTextArea", argTypes, term1501875, args);
    }

};


