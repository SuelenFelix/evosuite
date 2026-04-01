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

public class RealmSetupView_handleActions_9699841509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350960;

    public RealmSetupView_handleActions_9699841509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350960 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmSetupView"));
        setField(term350960, term350960.getClass(), "comboRaceSelect", null);
        setField(term350960, term350960.getClass(), "comboGovernmentSelect", null);
        setField(term350960, term350960.getClass(), "checkElderRealm", null);
        setField(term350960, term350960.getClass(), "realmName", null);
        setField(term350960, term350960.getClass(), "raceImgs", null);
        setField(term350960, term350960.getClass(), "comboRealmColor", null);
        setField(term350960, term350960.getClass(), "comboDifficult", null);
        setField(term350960, term350960.getClass(), "comboScenario", null);
        setField(term350960, term350960.getClass(), "config", null);
        setField(term350960, term350960.getClass(), "actionListener", null);
        setBooleanField(term350960, term350960.getClass(), "allowChangingRealm", false);
        setIntField(term350960, term350960.getClass(), "realmIndex", 0);
        setField(term350960, term350960.getClass(), "spaceRaceInfo", null);
        setField(term350960, term350960.getClass(), "infoPanelForSpaceRace", null);
        setField(term350960, term350960.getClass(), "governmentInfo", null);
        setField(term350960, term350960.getClass(), "fullPanel", null);
        setIntField(term350960, term350960.getClass(), "rigidSize", 0);
        setIntField(term350960, term350960.getClass(), "maxComboWidth", 0);
        setBooleanField(term350960, term350960.getClass(), "isAlignmentXSet", false);
        setFloatField(term350960, term350960.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350960, term350960.getClass(), "isAlignmentYSet", false);
        setFloatField(term350960, term350960.getClass(), "alignmentY", 0.0F);
        setField(term350960, term350960.getClass(), "ui", null);
        setField(term350960, term350960.getClass(), "listenerList", null);
        setField(term350960, term350960.getClass(), "clientProperties", null);
        setField(term350960, term350960.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350960, term350960.getClass(), "autoscrolls", false);
        setField(term350960, term350960.getClass(), "border", null);
        setIntField(term350960, term350960.getClass(), "flags", 0);
        setField(term350960, term350960.getClass(), "inputVerifier", null);
        setBooleanField(term350960, term350960.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350960, term350960.getClass(), "paintingChild", null);
        setField(term350960, term350960.getClass(), "popupMenu", null);
        setField(term350960, term350960.getClass(), "revalidateRunnableScheduled", null);
        setField(term350960, term350960.getClass(), "focusInputMap", null);
        setField(term350960, term350960.getClass(), "ancestorInputMap", null);
        setField(term350960, term350960.getClass(), "windowInputMap", null);
        setField(term350960, term350960.getClass(), "actionMap", null);
        setField(term350960, term350960.getClass(), "aaHint", null);
        setField(term350960, term350960.getClass(), "lcdRenderingHint", null);
        setField(term350960, term350960.getClass(), "component", null);
        setField(term350960, term350960.getClass(), "layoutMgr", null);
        setField(term350960, term350960.getClass(), "dispatcher", null);
        setField(term350960, term350960.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350960, term350960.getClass(), "focusCycleRoot", false);
        setBooleanField(term350960, term350960.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350960, term350960.getClass(), "printingThreads", null);
        setBooleanField(term350960, term350960.getClass(), "printing", false);
        setField(term350960, term350960.getClass(), "containerListener", null);
        setIntField(term350960, term350960.getClass(), "listeningChildren", 0);
        setIntField(term350960, term350960.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350960, term350960.getClass(), "descendantsCount", 0);
        setField(term350960, term350960.getClass(), "preserveBackgroundColor", null);
        setIntField(term350960, term350960.getClass(), "numOfHWComponents", 0);
        setIntField(term350960, term350960.getClass(), "numOfLWComponents", 0);
        setField(term350960, term350960.getClass(), "modalComp", null);
        setField(term350960, term350960.getClass(), "modalAppContext", null);
        setIntField(term350960, term350960.getClass(), "containerSerializedDataVersion", 0);
        setField(term350960, term350960.getClass(), "peer", null);
        setField(term350960, term350960.getClass(), "parent", null);
        setField(term350960, term350960.getClass(), "appContext", null);
        setIntField(term350960, term350960.getClass(), "x", 0);
        setIntField(term350960, term350960.getClass(), "y", 0);
        setIntField(term350960, term350960.getClass(), "width", 0);
        setIntField(term350960, term350960.getClass(), "height", 0);
        setField(term350960, term350960.getClass(), "foreground", null);
        setField(term350960, term350960.getClass(), "background", null);
        setField(term350960, term350960.getClass(), "font", null);
        setField(term350960, term350960.getClass(), "peerFont", null);
        setField(term350960, term350960.getClass(), "cursor", null);
        setField(term350960, term350960.getClass(), "locale", null);
        setField(term350960, term350960.getClass(), "graphicsConfig", null);
        setField(term350960, term350960.getClass(), "bufferStrategy", null);
        setBooleanField(term350960, term350960.getClass(), "ignoreRepaint", false);
        setBooleanField(term350960, term350960.getClass(), "visible", false);
        setBooleanField(term350960, term350960.getClass(), "enabled", false);
        setBooleanField(term350960, term350960.getClass(), "valid", false);
        setField(term350960, term350960.getClass(), "dropTarget", null);
        setField(term350960, term350960.getClass(), "popups", null);
        setField(term350960, term350960.getClass(), "name", null);
        setBooleanField(term350960, term350960.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350960, term350960.getClass(), "focusable", false);
        setIntField(term350960, term350960.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350960, term350960.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350960, term350960.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350960, term350960.getClass(), "acc", null);
        setField(term350960, term350960.getClass(), "minSize", null);
        setBooleanField(term350960, term350960.getClass(), "minSizeSet", false);
        setField(term350960, term350960.getClass(), "prefSize", null);
        setBooleanField(term350960, term350960.getClass(), "prefSizeSet", false);
        setField(term350960, term350960.getClass(), "maxSize", null);
        setBooleanField(term350960, term350960.getClass(), "maxSizeSet", false);
        setField(term350960, term350960.getClass(), "componentOrientation", null);
        setBooleanField(term350960, term350960.getClass(), "newEventsOnly", false);
        setField(term350960, term350960.getClass(), "componentListener", null);
        setField(term350960, term350960.getClass(), "focusListener", null);
        setField(term350960, term350960.getClass(), "hierarchyListener", null);
        setField(term350960, term350960.getClass(), "hierarchyBoundsListener", null);
        setField(term350960, term350960.getClass(), "keyListener", null);
        setField(term350960, term350960.getClass(), "mouseListener", null);
        setField(term350960, term350960.getClass(), "mouseMotionListener", null);
        setField(term350960, term350960.getClass(), "mouseWheelListener", null);
        setField(term350960, term350960.getClass(), "inputMethodListener", null);
        setLongField(term350960, term350960.getClass(), "eventMask", 0L);
        setField(term350960, term350960.getClass(), "changeSupport", null);
        setField(term350960, term350960.getClass(), "objectLock", null);
        setBooleanField(term350960, term350960.getClass(), "isPacked", false);
        setIntField(term350960, term350960.getClass(), "boundsOp", 0);
        setField(term350960, term350960.getClass(), "compoundShape", null);
        setField(term350960, term350960.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350960, term350960.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350960, term350960.getClass(), "backgroundEraseDisabled", false);
        setField(term350960, term350960.getClass(), "eventCache", null);
        setBooleanField(term350960, term350960.getClass(), "coalescingEnabled", false);
        setBooleanField(term350960, term350960.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350960, term350960.getClass(), "componentSerializedDataVersion", 0);
        setField(term350960, term350960.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmSetupView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term350960, args);
    }

};


