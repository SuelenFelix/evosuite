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

public class ResearchView_handleCmdUpdate_180157273412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52365;

    public ResearchView_handleCmdUpdate_180157273412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52365 = newInstance(Class.forName("org.openRealmOfStars.game.state.ResearchView"));
        setField(term52365, term52365.getClass(), "player", null);
        setIntField(term52365, term52365.getClass(), "totalResearch", 0);
        setField(term52365, term52365.getClass(), "combatRese", null);
        setField(term52365, term52365.getClass(), "defenseRese", null);
        setField(term52365, term52365.getClass(), "hullRese", null);
        setField(term52365, term52365.getClass(), "improvementRese", null);
        setField(term52365, term52365.getClass(), "propulsionRese", null);
        setField(term52365, term52365.getClass(), "electronicsRese", null);
        setField(term52365, term52365.getClass(), "techList", null);
        setField(term52365, term52365.getClass(), "artifactList", null);
        setField(term52365, term52365.getClass(), "infoText", null);
        setIntField(term52365, term52365.getClass(), "maximumGameLength", 0);
        setIntField(term52365, term52365.getClass(), "playSoundFromSliders", 0);
        setBooleanField(term52365, term52365.getClass(), "isAlignmentXSet", false);
        setFloatField(term52365, term52365.getClass(), "alignmentX", 0.0F);
        setBooleanField(term52365, term52365.getClass(), "isAlignmentYSet", false);
        setFloatField(term52365, term52365.getClass(), "alignmentY", 0.0F);
        setField(term52365, term52365.getClass(), "ui", null);
        setField(term52365, term52365.getClass(), "listenerList", null);
        setField(term52365, term52365.getClass(), "clientProperties", null);
        setField(term52365, term52365.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term52365, term52365.getClass(), "autoscrolls", false);
        setField(term52365, term52365.getClass(), "border", null);
        setIntField(term52365, term52365.getClass(), "flags", 0);
        setField(term52365, term52365.getClass(), "inputVerifier", null);
        setBooleanField(term52365, term52365.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term52365, term52365.getClass(), "paintingChild", null);
        setField(term52365, term52365.getClass(), "popupMenu", null);
        setField(term52365, term52365.getClass(), "revalidateRunnableScheduled", null);
        setField(term52365, term52365.getClass(), "focusInputMap", null);
        setField(term52365, term52365.getClass(), "ancestorInputMap", null);
        setField(term52365, term52365.getClass(), "windowInputMap", null);
        setField(term52365, term52365.getClass(), "actionMap", null);
        setField(term52365, term52365.getClass(), "aaHint", null);
        setField(term52365, term52365.getClass(), "lcdRenderingHint", null);
        setField(term52365, term52365.getClass(), "component", null);
        setField(term52365, term52365.getClass(), "layoutMgr", null);
        setField(term52365, term52365.getClass(), "dispatcher", null);
        setField(term52365, term52365.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term52365, term52365.getClass(), "focusCycleRoot", false);
        setBooleanField(term52365, term52365.getClass(), "focusTraversalPolicyProvider", false);
        setField(term52365, term52365.getClass(), "printingThreads", null);
        setBooleanField(term52365, term52365.getClass(), "printing", false);
        setField(term52365, term52365.getClass(), "containerListener", null);
        setIntField(term52365, term52365.getClass(), "listeningChildren", 0);
        setIntField(term52365, term52365.getClass(), "listeningBoundsChildren", 0);
        setIntField(term52365, term52365.getClass(), "descendantsCount", 0);
        setField(term52365, term52365.getClass(), "preserveBackgroundColor", null);
        setIntField(term52365, term52365.getClass(), "numOfHWComponents", 0);
        setIntField(term52365, term52365.getClass(), "numOfLWComponents", 0);
        setField(term52365, term52365.getClass(), "modalComp", null);
        setField(term52365, term52365.getClass(), "modalAppContext", null);
        setIntField(term52365, term52365.getClass(), "containerSerializedDataVersion", 0);
        setField(term52365, term52365.getClass(), "peer", null);
        setField(term52365, term52365.getClass(), "parent", null);
        setField(term52365, term52365.getClass(), "appContext", null);
        setIntField(term52365, term52365.getClass(), "x", 0);
        setIntField(term52365, term52365.getClass(), "y", 0);
        setIntField(term52365, term52365.getClass(), "width", 0);
        setIntField(term52365, term52365.getClass(), "height", 0);
        setField(term52365, term52365.getClass(), "foreground", null);
        setField(term52365, term52365.getClass(), "background", null);
        setField(term52365, term52365.getClass(), "font", null);
        setField(term52365, term52365.getClass(), "peerFont", null);
        setField(term52365, term52365.getClass(), "cursor", null);
        setField(term52365, term52365.getClass(), "locale", null);
        setField(term52365, term52365.getClass(), "graphicsConfig", null);
        setField(term52365, term52365.getClass(), "bufferStrategy", null);
        setBooleanField(term52365, term52365.getClass(), "ignoreRepaint", false);
        setBooleanField(term52365, term52365.getClass(), "visible", false);
        setBooleanField(term52365, term52365.getClass(), "enabled", false);
        setBooleanField(term52365, term52365.getClass(), "valid", false);
        setField(term52365, term52365.getClass(), "dropTarget", null);
        setField(term52365, term52365.getClass(), "popups", null);
        setField(term52365, term52365.getClass(), "name", null);
        setBooleanField(term52365, term52365.getClass(), "nameExplicitlySet", false);
        setBooleanField(term52365, term52365.getClass(), "focusable", false);
        setIntField(term52365, term52365.getClass(), "isFocusTraversableOverridden", 0);
        setField(term52365, term52365.getClass(), "focusTraversalKeys", null);
        setBooleanField(term52365, term52365.getClass(), "focusTraversalKeysEnabled", false);
        setField(term52365, term52365.getClass(), "acc", null);
        setField(term52365, term52365.getClass(), "minSize", null);
        setBooleanField(term52365, term52365.getClass(), "minSizeSet", false);
        setField(term52365, term52365.getClass(), "prefSize", null);
        setBooleanField(term52365, term52365.getClass(), "prefSizeSet", false);
        setField(term52365, term52365.getClass(), "maxSize", null);
        setBooleanField(term52365, term52365.getClass(), "maxSizeSet", false);
        setField(term52365, term52365.getClass(), "componentOrientation", null);
        setBooleanField(term52365, term52365.getClass(), "newEventsOnly", false);
        setField(term52365, term52365.getClass(), "componentListener", null);
        setField(term52365, term52365.getClass(), "focusListener", null);
        setField(term52365, term52365.getClass(), "hierarchyListener", null);
        setField(term52365, term52365.getClass(), "hierarchyBoundsListener", null);
        setField(term52365, term52365.getClass(), "keyListener", null);
        setField(term52365, term52365.getClass(), "mouseListener", null);
        setField(term52365, term52365.getClass(), "mouseMotionListener", null);
        setField(term52365, term52365.getClass(), "mouseWheelListener", null);
        setField(term52365, term52365.getClass(), "inputMethodListener", null);
        setLongField(term52365, term52365.getClass(), "eventMask", 0L);
        setField(term52365, term52365.getClass(), "changeSupport", null);
        setField(term52365, term52365.getClass(), "objectLock", null);
        setBooleanField(term52365, term52365.getClass(), "isPacked", false);
        setIntField(term52365, term52365.getClass(), "boundsOp", 0);
        setField(term52365, term52365.getClass(), "compoundShape", null);
        setField(term52365, term52365.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term52365, term52365.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term52365, term52365.getClass(), "backgroundEraseDisabled", false);
        setField(term52365, term52365.getClass(), "eventCache", null);
        setBooleanField(term52365, term52365.getClass(), "coalescingEnabled", false);
        setBooleanField(term52365, term52365.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term52365, term52365.getClass(), "componentSerializedDataVersion", 0);
        setField(term52365, term52365.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ResearchView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleCmdUpdate", argTypes, term52365, args);
    }

};


