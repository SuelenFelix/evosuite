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

public class ResearchView_updatePanel_205079275014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58502;

    public ResearchView_updatePanel_205079275014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58502 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term58502, term58502.getClass(), "player", null);
        setIntField(term58502, term58502.getClass(), "totalResearch", 0);
        setField(term58502, term58502.getClass(), "combatRese", null);
        setField(term58502, term58502.getClass(), "defenseRese", null);
        setField(term58502, term58502.getClass(), "hullRese", null);
        setField(term58502, term58502.getClass(), "improvementRese", null);
        setField(term58502, term58502.getClass(), "propulsionRese", null);
        setField(term58502, term58502.getClass(), "electronicsRese", null);
        setField(term58502, term58502.getClass(), "techList", null);
        setField(term58502, term58502.getClass(), "artifactList", null);
        setField(term58502, term58502.getClass(), "infoText", null);
        setIntField(term58502, term58502.getClass(), "maximumGameLength", 0);
        setIntField(term58502, term58502.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term58502, term58502.getClass(), "isAlignmentXSet", false);
        setFloatField(term58502, term58502.getClass(), "alignmentX", 0.0F);
        setBooleanField(term58502, term58502.getClass(), "isAlignmentYSet", false);
        setFloatField(term58502, term58502.getClass(), "alignmentY", 0.0F);
        setField(term58502, term58502.getClass(), "ui", null);
        setField(term58502, term58502.getClass(), "listenerList", null);
        setField(term58502, term58502.getClass(), "clientProperties", null);
        setField(term58502, term58502.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term58502, term58502.getClass(), "autoscrolls", false);
        setField(term58502, term58502.getClass(), "border", null);
        setIntField(term58502, term58502.getClass(), "flags", 0);
        setField(term58502, term58502.getClass(), "inputVerifier", null);
        setBooleanField(term58502, term58502.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term58502, term58502.getClass(), "paintingChild", null);
        setField(term58502, term58502.getClass(), "popupMenu", null);
        setField(term58502, term58502.getClass(), "revalidateRunnableScheduled", null);
        setField(term58502, term58502.getClass(), "focusInputMap", null);
        setField(term58502, term58502.getClass(), "ancestorInputMap", null);
        setField(term58502, term58502.getClass(), "windowInputMap", null);
        setField(term58502, term58502.getClass(), "actionMap", null);
        setField(term58502, term58502.getClass(), "aaHint", null);
        setField(term58502, term58502.getClass(), "lcdRenderingHint", null);
        setField(term58502, term58502.getClass(), "component", null);
        setField(term58502, term58502.getClass(), "layoutMgr", null);
        setField(term58502, term58502.getClass(), "dispatcher", null);
        setField(term58502, term58502.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term58502, term58502.getClass(), "focusCycleRoot", false);
        setBooleanField(term58502, term58502.getClass(), "focusTraversalPolicyProvider", false);
        setField(term58502, term58502.getClass(), "printingThreads", null);
        setBooleanField(term58502, term58502.getClass(), "printing", false);
        setField(term58502, term58502.getClass(), "containerListener", null);
        setIntField(term58502, term58502.getClass(), "listeningChildren", 0);
        setIntField(term58502, term58502.getClass(), "listeningBoundsChildren", 0);
        setIntField(term58502, term58502.getClass(), "descendantsCount", 0);
        setField(term58502, term58502.getClass(), "preserveBackgroundColor", null);
        setIntField(term58502, term58502.getClass(), "numOfHWComponents", 0);
        setIntField(term58502, term58502.getClass(), "numOfLWComponents", 0);
        setField(term58502, term58502.getClass(), "modalComp", null);
        setField(term58502, term58502.getClass(), "modalAppContext", null);
        setIntField(term58502, term58502.getClass(), "containerSerializedDataVersion", 0);
        setField(term58502, term58502.getClass(), "peer", null);
        setField(term58502, term58502.getClass(), "parent", null);
        setField(term58502, term58502.getClass(), "appContext", null);
        setIntField(term58502, term58502.getClass(), "x", 0);
        setIntField(term58502, term58502.getClass(), "y", 0);
        setIntField(term58502, term58502.getClass(), "width", 0);
        setIntField(term58502, term58502.getClass(), "height", 0);
        setField(term58502, term58502.getClass(), "foreground", null);
        setField(term58502, term58502.getClass(), "background", null);
        setField(term58502, term58502.getClass(), "font", null);
        setField(term58502, term58502.getClass(), "peerFont", null);
        setField(term58502, term58502.getClass(), "cursor", null);
        setField(term58502, term58502.getClass(), "locale", null);
        setField(term58502, term58502.getClass(), "graphicsConfig", null);
        setField(term58502, term58502.getClass(), "bufferStrategy", null);
        setBooleanField(term58502, term58502.getClass(), "ignoreRepaint", false);
        setBooleanField(term58502, term58502.getClass(), "visible", false);
        setBooleanField(term58502, term58502.getClass(), "enabled", false);
        setBooleanField(term58502, term58502.getClass(), "valid", false);
        setField(term58502, term58502.getClass(), "dropTarget", null);
        setField(term58502, term58502.getClass(), "popups", null);
        setField(term58502, term58502.getClass(), "name", null);
        setBooleanField(term58502, term58502.getClass(), "nameExplicitlySet", false);
        setBooleanField(term58502, term58502.getClass(), "focusable", false);
        setIntField(term58502, term58502.getClass(), "isFocusTraversableOverridden", 0);
        setField(term58502, term58502.getClass(), "focusTraversalKeys", null);
        setBooleanField(term58502, term58502.getClass(), "focusTraversalKeysEnabled", false);
        setField(term58502, term58502.getClass(), "acc", null);
        setField(term58502, term58502.getClass(), "minSize", null);
        setBooleanField(term58502, term58502.getClass(), "minSizeSet", false);
        setField(term58502, term58502.getClass(), "prefSize", null);
        setBooleanField(term58502, term58502.getClass(), "prefSizeSet", false);
        setField(term58502, term58502.getClass(), "maxSize", null);
        setBooleanField(term58502, term58502.getClass(), "maxSizeSet", false);
        setField(term58502, term58502.getClass(), "componentOrientation", null);
        setBooleanField(term58502, term58502.getClass(), "newEventsOnly", false);
        setField(term58502, term58502.getClass(), "componentListener", null);
        setField(term58502, term58502.getClass(), "focusListener", null);
        setField(term58502, term58502.getClass(), "hierarchyListener", null);
        setField(term58502, term58502.getClass(), "hierarchyBoundsListener", null);
        setField(term58502, term58502.getClass(), "keyListener", null);
        setField(term58502, term58502.getClass(), "mouseListener", null);
        setField(term58502, term58502.getClass(), "mouseMotionListener", null);
        setField(term58502, term58502.getClass(), "mouseWheelListener", null);
        setField(term58502, term58502.getClass(), "inputMethodListener", null);
        setLongField(term58502, term58502.getClass(), "eventMask", 0L);
        setField(term58502, term58502.getClass(), "changeSupport", null);
        setField(term58502, term58502.getClass(), "objectLock", null);
        setBooleanField(term58502, term58502.getClass(), "isPacked", false);
        setIntField(term58502, term58502.getClass(), "boundsOp", 0);
        setField(term58502, term58502.getClass(), "compoundShape", null);
        setField(term58502, term58502.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term58502, term58502.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term58502, term58502.getClass(), "backgroundEraseDisabled", false);
        setField(term58502, term58502.getClass(), "eventCache", null);
        setBooleanField(term58502, term58502.getClass(), "coalescingEnabled", false);
        setBooleanField(term58502, term58502.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term58502, term58502.getClass(), "componentSerializedDataVersion", 0);
        setField(term58502, term58502.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term58502, args);
    }

};


