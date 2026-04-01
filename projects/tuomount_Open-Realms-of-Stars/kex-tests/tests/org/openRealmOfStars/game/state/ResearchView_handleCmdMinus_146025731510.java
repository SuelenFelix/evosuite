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

public class ResearchView_handleCmdMinus_146025731510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44892;

    public ResearchView_handleCmdMinus_146025731510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44892 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term44892, term44892.getClass(), "player", null);
        setIntField(term44892, term44892.getClass(), "totalResearch", 0);
        setField(term44892, term44892.getClass(), "combatRese", null);
        setField(term44892, term44892.getClass(), "defenseRese", null);
        setField(term44892, term44892.getClass(), "hullRese", null);
        setField(term44892, term44892.getClass(), "improvementRese", null);
        setField(term44892, term44892.getClass(), "propulsionRese", null);
        setField(term44892, term44892.getClass(), "electronicsRese", null);
        setField(term44892, term44892.getClass(), "techList", null);
        setField(term44892, term44892.getClass(), "artifactList", null);
        setField(term44892, term44892.getClass(), "infoText", null);
        setIntField(term44892, term44892.getClass(), "maximumGameLength", 0);
        setIntField(term44892, term44892.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term44892, term44892.getClass(), "isAlignmentXSet", false);
        setFloatField(term44892, term44892.getClass(), "alignmentX", 0.0F);
        setBooleanField(term44892, term44892.getClass(), "isAlignmentYSet", false);
        setFloatField(term44892, term44892.getClass(), "alignmentY", 0.0F);
        setField(term44892, term44892.getClass(), "ui", null);
        setField(term44892, term44892.getClass(), "listenerList", null);
        setField(term44892, term44892.getClass(), "clientProperties", null);
        setField(term44892, term44892.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term44892, term44892.getClass(), "autoscrolls", false);
        setField(term44892, term44892.getClass(), "border", null);
        setIntField(term44892, term44892.getClass(), "flags", 0);
        setField(term44892, term44892.getClass(), "inputVerifier", null);
        setBooleanField(term44892, term44892.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term44892, term44892.getClass(), "paintingChild", null);
        setField(term44892, term44892.getClass(), "popupMenu", null);
        setField(term44892, term44892.getClass(), "revalidateRunnableScheduled", null);
        setField(term44892, term44892.getClass(), "focusInputMap", null);
        setField(term44892, term44892.getClass(), "ancestorInputMap", null);
        setField(term44892, term44892.getClass(), "windowInputMap", null);
        setField(term44892, term44892.getClass(), "actionMap", null);
        setField(term44892, term44892.getClass(), "aaHint", null);
        setField(term44892, term44892.getClass(), "lcdRenderingHint", null);
        setField(term44892, term44892.getClass(), "component", null);
        setField(term44892, term44892.getClass(), "layoutMgr", null);
        setField(term44892, term44892.getClass(), "dispatcher", null);
        setField(term44892, term44892.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term44892, term44892.getClass(), "focusCycleRoot", false);
        setBooleanField(term44892, term44892.getClass(), "focusTraversalPolicyProvider", false);
        setField(term44892, term44892.getClass(), "printingThreads", null);
        setBooleanField(term44892, term44892.getClass(), "printing", false);
        setField(term44892, term44892.getClass(), "containerListener", null);
        setIntField(term44892, term44892.getClass(), "listeningChildren", 0);
        setIntField(term44892, term44892.getClass(), "listeningBoundsChildren", 0);
        setIntField(term44892, term44892.getClass(), "descendantsCount", 0);
        setField(term44892, term44892.getClass(), "preserveBackgroundColor", null);
        setIntField(term44892, term44892.getClass(), "numOfHWComponents", 0);
        setIntField(term44892, term44892.getClass(), "numOfLWComponents", 0);
        setField(term44892, term44892.getClass(), "modalComp", null);
        setField(term44892, term44892.getClass(), "modalAppContext", null);
        setIntField(term44892, term44892.getClass(), "containerSerializedDataVersion", 0);
        setField(term44892, term44892.getClass(), "peer", null);
        setField(term44892, term44892.getClass(), "parent", null);
        setField(term44892, term44892.getClass(), "appContext", null);
        setIntField(term44892, term44892.getClass(), "x", 0);
        setIntField(term44892, term44892.getClass(), "y", 0);
        setIntField(term44892, term44892.getClass(), "width", 0);
        setIntField(term44892, term44892.getClass(), "height", 0);
        setField(term44892, term44892.getClass(), "foreground", null);
        setField(term44892, term44892.getClass(), "background", null);
        setField(term44892, term44892.getClass(), "font", null);
        setField(term44892, term44892.getClass(), "peerFont", null);
        setField(term44892, term44892.getClass(), "cursor", null);
        setField(term44892, term44892.getClass(), "locale", null);
        setField(term44892, term44892.getClass(), "graphicsConfig", null);
        setField(term44892, term44892.getClass(), "bufferStrategy", null);
        setBooleanField(term44892, term44892.getClass(), "ignoreRepaint", false);
        setBooleanField(term44892, term44892.getClass(), "visible", false);
        setBooleanField(term44892, term44892.getClass(), "enabled", false);
        setBooleanField(term44892, term44892.getClass(), "valid", false);
        setField(term44892, term44892.getClass(), "dropTarget", null);
        setField(term44892, term44892.getClass(), "popups", null);
        setField(term44892, term44892.getClass(), "name", null);
        setBooleanField(term44892, term44892.getClass(), "nameExplicitlySet", false);
        setBooleanField(term44892, term44892.getClass(), "focusable", false);
        setIntField(term44892, term44892.getClass(), "isFocusTraversableOverridden", 0);
        setField(term44892, term44892.getClass(), "focusTraversalKeys", null);
        setBooleanField(term44892, term44892.getClass(), "focusTraversalKeysEnabled", false);
        setField(term44892, term44892.getClass(), "acc", null);
        setField(term44892, term44892.getClass(), "minSize", null);
        setBooleanField(term44892, term44892.getClass(), "minSizeSet", false);
        setField(term44892, term44892.getClass(), "prefSize", null);
        setBooleanField(term44892, term44892.getClass(), "prefSizeSet", false);
        setField(term44892, term44892.getClass(), "maxSize", null);
        setBooleanField(term44892, term44892.getClass(), "maxSizeSet", false);
        setField(term44892, term44892.getClass(), "componentOrientation", null);
        setBooleanField(term44892, term44892.getClass(), "newEventsOnly", false);
        setField(term44892, term44892.getClass(), "componentListener", null);
        setField(term44892, term44892.getClass(), "focusListener", null);
        setField(term44892, term44892.getClass(), "hierarchyListener", null);
        setField(term44892, term44892.getClass(), "hierarchyBoundsListener", null);
        setField(term44892, term44892.getClass(), "keyListener", null);
        setField(term44892, term44892.getClass(), "mouseListener", null);
        setField(term44892, term44892.getClass(), "mouseMotionListener", null);
        setField(term44892, term44892.getClass(), "mouseWheelListener", null);
        setField(term44892, term44892.getClass(), "inputMethodListener", null);
        setLongField(term44892, term44892.getClass(), "eventMask", 0L);
        setField(term44892, term44892.getClass(), "changeSupport", null);
        setField(term44892, term44892.getClass(), "objectLock", null);
        setBooleanField(term44892, term44892.getClass(), "isPacked", false);
        setIntField(term44892, term44892.getClass(), "boundsOp", 0);
        setField(term44892, term44892.getClass(), "compoundShape", null);
        setField(term44892, term44892.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term44892, term44892.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term44892, term44892.getClass(), "backgroundEraseDisabled", false);
        setField(term44892, term44892.getClass(), "eventCache", null);
        setBooleanField(term44892, term44892.getClass(), "coalescingEnabled", false);
        setBooleanField(term44892, term44892.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term44892, term44892.getClass(), "componentSerializedDataVersion", 0);
        setField(term44892, term44892.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleCmdMinus", argTypes, term44892, args);
    }

};


