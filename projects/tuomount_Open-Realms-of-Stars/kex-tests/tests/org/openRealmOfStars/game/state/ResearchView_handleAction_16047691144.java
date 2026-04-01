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

public class ResearchView_handleAction_16047691144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21968;

    public ResearchView_handleAction_16047691144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21968 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term21968, term21968.getClass(), "player", null);
        setIntField(term21968, term21968.getClass(), "totalResearch", 0);
        setField(term21968, term21968.getClass(), "combatRese", null);
        setField(term21968, term21968.getClass(), "defenseRese", null);
        setField(term21968, term21968.getClass(), "hullRese", null);
        setField(term21968, term21968.getClass(), "improvementRese", null);
        setField(term21968, term21968.getClass(), "propulsionRese", null);
        setField(term21968, term21968.getClass(), "electronicsRese", null);
        setField(term21968, term21968.getClass(), "techList", null);
        setField(term21968, term21968.getClass(), "artifactList", null);
        setField(term21968, term21968.getClass(), "infoText", null);
        setIntField(term21968, term21968.getClass(), "maximumGameLength", 0);
        setIntField(term21968, term21968.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term21968, term21968.getClass(), "isAlignmentXSet", false);
        setFloatField(term21968, term21968.getClass(), "alignmentX", 0.0F);
        setBooleanField(term21968, term21968.getClass(), "isAlignmentYSet", false);
        setFloatField(term21968, term21968.getClass(), "alignmentY", 0.0F);
        setField(term21968, term21968.getClass(), "ui", null);
        setField(term21968, term21968.getClass(), "listenerList", null);
        setField(term21968, term21968.getClass(), "clientProperties", null);
        setField(term21968, term21968.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term21968, term21968.getClass(), "autoscrolls", false);
        setField(term21968, term21968.getClass(), "border", null);
        setIntField(term21968, term21968.getClass(), "flags", 0);
        setField(term21968, term21968.getClass(), "inputVerifier", null);
        setBooleanField(term21968, term21968.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term21968, term21968.getClass(), "paintingChild", null);
        setField(term21968, term21968.getClass(), "popupMenu", null);
        setField(term21968, term21968.getClass(), "revalidateRunnableScheduled", null);
        setField(term21968, term21968.getClass(), "focusInputMap", null);
        setField(term21968, term21968.getClass(), "ancestorInputMap", null);
        setField(term21968, term21968.getClass(), "windowInputMap", null);
        setField(term21968, term21968.getClass(), "actionMap", null);
        setField(term21968, term21968.getClass(), "aaHint", null);
        setField(term21968, term21968.getClass(), "lcdRenderingHint", null);
        setField(term21968, term21968.getClass(), "component", null);
        setField(term21968, term21968.getClass(), "layoutMgr", null);
        setField(term21968, term21968.getClass(), "dispatcher", null);
        setField(term21968, term21968.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term21968, term21968.getClass(), "focusCycleRoot", false);
        setBooleanField(term21968, term21968.getClass(), "focusTraversalPolicyProvider", false);
        setField(term21968, term21968.getClass(), "printingThreads", null);
        setBooleanField(term21968, term21968.getClass(), "printing", false);
        setField(term21968, term21968.getClass(), "containerListener", null);
        setIntField(term21968, term21968.getClass(), "listeningChildren", 0);
        setIntField(term21968, term21968.getClass(), "listeningBoundsChildren", 0);
        setIntField(term21968, term21968.getClass(), "descendantsCount", 0);
        setField(term21968, term21968.getClass(), "preserveBackgroundColor", null);
        setIntField(term21968, term21968.getClass(), "numOfHWComponents", 0);
        setIntField(term21968, term21968.getClass(), "numOfLWComponents", 0);
        setField(term21968, term21968.getClass(), "modalComp", null);
        setField(term21968, term21968.getClass(), "modalAppContext", null);
        setIntField(term21968, term21968.getClass(), "containerSerializedDataVersion", 0);
        setField(term21968, term21968.getClass(), "peer", null);
        setField(term21968, term21968.getClass(), "parent", null);
        setField(term21968, term21968.getClass(), "appContext", null);
        setIntField(term21968, term21968.getClass(), "x", 0);
        setIntField(term21968, term21968.getClass(), "y", 0);
        setIntField(term21968, term21968.getClass(), "width", 0);
        setIntField(term21968, term21968.getClass(), "height", 0);
        setField(term21968, term21968.getClass(), "foreground", null);
        setField(term21968, term21968.getClass(), "background", null);
        setField(term21968, term21968.getClass(), "font", null);
        setField(term21968, term21968.getClass(), "peerFont", null);
        setField(term21968, term21968.getClass(), "cursor", null);
        setField(term21968, term21968.getClass(), "locale", null);
        setField(term21968, term21968.getClass(), "graphicsConfig", null);
        setField(term21968, term21968.getClass(), "bufferStrategy", null);
        setBooleanField(term21968, term21968.getClass(), "ignoreRepaint", false);
        setBooleanField(term21968, term21968.getClass(), "visible", false);
        setBooleanField(term21968, term21968.getClass(), "enabled", false);
        setBooleanField(term21968, term21968.getClass(), "valid", false);
        setField(term21968, term21968.getClass(), "dropTarget", null);
        setField(term21968, term21968.getClass(), "popups", null);
        setField(term21968, term21968.getClass(), "name", null);
        setBooleanField(term21968, term21968.getClass(), "nameExplicitlySet", false);
        setBooleanField(term21968, term21968.getClass(), "focusable", false);
        setIntField(term21968, term21968.getClass(), "isFocusTraversableOverridden", 0);
        setField(term21968, term21968.getClass(), "focusTraversalKeys", null);
        setBooleanField(term21968, term21968.getClass(), "focusTraversalKeysEnabled", false);
        setField(term21968, term21968.getClass(), "acc", null);
        setField(term21968, term21968.getClass(), "minSize", null);
        setBooleanField(term21968, term21968.getClass(), "minSizeSet", false);
        setField(term21968, term21968.getClass(), "prefSize", null);
        setBooleanField(term21968, term21968.getClass(), "prefSizeSet", false);
        setField(term21968, term21968.getClass(), "maxSize", null);
        setBooleanField(term21968, term21968.getClass(), "maxSizeSet", false);
        setField(term21968, term21968.getClass(), "componentOrientation", null);
        setBooleanField(term21968, term21968.getClass(), "newEventsOnly", false);
        setField(term21968, term21968.getClass(), "componentListener", null);
        setField(term21968, term21968.getClass(), "focusListener", null);
        setField(term21968, term21968.getClass(), "hierarchyListener", null);
        setField(term21968, term21968.getClass(), "hierarchyBoundsListener", null);
        setField(term21968, term21968.getClass(), "keyListener", null);
        setField(term21968, term21968.getClass(), "mouseListener", null);
        setField(term21968, term21968.getClass(), "mouseMotionListener", null);
        setField(term21968, term21968.getClass(), "mouseWheelListener", null);
        setField(term21968, term21968.getClass(), "inputMethodListener", null);
        setLongField(term21968, term21968.getClass(), "eventMask", 0L);
        setField(term21968, term21968.getClass(), "changeSupport", null);
        setField(term21968, term21968.getClass(), "objectLock", null);
        setBooleanField(term21968, term21968.getClass(), "isPacked", false);
        setIntField(term21968, term21968.getClass(), "boundsOp", 0);
        setField(term21968, term21968.getClass(), "compoundShape", null);
        setField(term21968, term21968.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term21968, term21968.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term21968, term21968.getClass(), "backgroundEraseDisabled", false);
        setField(term21968, term21968.getClass(), "eventCache", null);
        setBooleanField(term21968, term21968.getClass(), "coalescingEnabled", false);
        setBooleanField(term21968, term21968.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term21968, term21968.getClass(), "componentSerializedDataVersion", 0);
        setField(term21968, term21968.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term21968, args);
    }

};


