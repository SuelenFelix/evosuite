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

public class RealmSetupView_setupRealmConfig_6663236887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350870;

    public RealmSetupView_setupRealmConfig_6663236887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350870 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmSetupView"));
        setField(term350870, term350870.getClass(), "comboRaceSelect", null);
        setField(term350870, term350870.getClass(), "comboGovernmentSelect", null);
        setField(term350870, term350870.getClass(), "checkElderRealm", null);
        setField(term350870, term350870.getClass(), "realmName", null);
        setField(term350870, term350870.getClass(), "raceImgs", null);
        setField(term350870, term350870.getClass(), "comboRealmColor", null);
        setField(term350870, term350870.getClass(), "comboDifficult", null);
        setField(term350870, term350870.getClass(), "comboScenario", null);
        setField(term350870, term350870.getClass(), "config", null);
        setField(term350870, term350870.getClass(), "actionListener", null);
        setBooleanField(term350870, term350870.getClass(), "allowChangingRealm", false);
        setIntField(term350870, term350870.getClass(), "realmIndex", 0);
        setField(term350870, term350870.getClass(), "spaceRaceInfo", null);
        setField(term350870, term350870.getClass(), "infoPanelForSpaceRace", null);
        setField(term350870, term350870.getClass(), "governmentInfo", null);
        setField(term350870, term350870.getClass(), "fullPanel", null);
        setIntField(term350870, term350870.getClass(), "rigidSize", 0);
        setIntField(term350870, term350870.getClass(), "maxComboWidth", 0);
        setBooleanField(term350870, term350870.getClass(), "isAlignmentXSet", false);
        setFloatField(term350870, term350870.getClass(), "alignmentX", 0.0F);
        setBooleanField(term350870, term350870.getClass(), "isAlignmentYSet", false);
        setFloatField(term350870, term350870.getClass(), "alignmentY", 0.0F);
        setField(term350870, term350870.getClass(), "ui", null);
        setField(term350870, term350870.getClass(), "listenerList", null);
        setField(term350870, term350870.getClass(), "clientProperties", null);
        setField(term350870, term350870.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term350870, term350870.getClass(), "autoscrolls", false);
        setField(term350870, term350870.getClass(), "border", null);
        setIntField(term350870, term350870.getClass(), "flags", 0);
        setField(term350870, term350870.getClass(), "inputVerifier", null);
        setBooleanField(term350870, term350870.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term350870, term350870.getClass(), "paintingChild", null);
        setField(term350870, term350870.getClass(), "popupMenu", null);
        setField(term350870, term350870.getClass(), "revalidateRunnableScheduled", null);
        setField(term350870, term350870.getClass(), "focusInputMap", null);
        setField(term350870, term350870.getClass(), "ancestorInputMap", null);
        setField(term350870, term350870.getClass(), "windowInputMap", null);
        setField(term350870, term350870.getClass(), "actionMap", null);
        setField(term350870, term350870.getClass(), "aaHint", null);
        setField(term350870, term350870.getClass(), "lcdRenderingHint", null);
        setField(term350870, term350870.getClass(), "component", null);
        setField(term350870, term350870.getClass(), "layoutMgr", null);
        setField(term350870, term350870.getClass(), "dispatcher", null);
        setField(term350870, term350870.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term350870, term350870.getClass(), "focusCycleRoot", false);
        setBooleanField(term350870, term350870.getClass(), "focusTraversalPolicyProvider", false);
        setField(term350870, term350870.getClass(), "printingThreads", null);
        setBooleanField(term350870, term350870.getClass(), "printing", false);
        setField(term350870, term350870.getClass(), "containerListener", null);
        setIntField(term350870, term350870.getClass(), "listeningChildren", 0);
        setIntField(term350870, term350870.getClass(), "listeningBoundsChildren", 0);
        setIntField(term350870, term350870.getClass(), "descendantsCount", 0);
        setField(term350870, term350870.getClass(), "preserveBackgroundColor", null);
        setIntField(term350870, term350870.getClass(), "numOfHWComponents", 0);
        setIntField(term350870, term350870.getClass(), "numOfLWComponents", 0);
        setField(term350870, term350870.getClass(), "modalComp", null);
        setField(term350870, term350870.getClass(), "modalAppContext", null);
        setIntField(term350870, term350870.getClass(), "containerSerializedDataVersion", 0);
        setField(term350870, term350870.getClass(), "peer", null);
        setField(term350870, term350870.getClass(), "parent", null);
        setField(term350870, term350870.getClass(), "appContext", null);
        setIntField(term350870, term350870.getClass(), "x", 0);
        setIntField(term350870, term350870.getClass(), "y", 0);
        setIntField(term350870, term350870.getClass(), "width", 0);
        setIntField(term350870, term350870.getClass(), "height", 0);
        setField(term350870, term350870.getClass(), "foreground", null);
        setField(term350870, term350870.getClass(), "background", null);
        setField(term350870, term350870.getClass(), "font", null);
        setField(term350870, term350870.getClass(), "peerFont", null);
        setField(term350870, term350870.getClass(), "cursor", null);
        setField(term350870, term350870.getClass(), "locale", null);
        setField(term350870, term350870.getClass(), "graphicsConfig", null);
        setField(term350870, term350870.getClass(), "bufferStrategy", null);
        setBooleanField(term350870, term350870.getClass(), "ignoreRepaint", false);
        setBooleanField(term350870, term350870.getClass(), "visible", false);
        setBooleanField(term350870, term350870.getClass(), "enabled", false);
        setBooleanField(term350870, term350870.getClass(), "valid", false);
        setField(term350870, term350870.getClass(), "dropTarget", null);
        setField(term350870, term350870.getClass(), "popups", null);
        setField(term350870, term350870.getClass(), "name", null);
        setBooleanField(term350870, term350870.getClass(), "nameExplicitlySet", false);
        setBooleanField(term350870, term350870.getClass(), "focusable", false);
        setIntField(term350870, term350870.getClass(), "isFocusTraversableOverridden", 0);
        setField(term350870, term350870.getClass(), "focusTraversalKeys", null);
        setBooleanField(term350870, term350870.getClass(), "focusTraversalKeysEnabled", false);
        setField(term350870, term350870.getClass(), "acc", null);
        setField(term350870, term350870.getClass(), "minSize", null);
        setBooleanField(term350870, term350870.getClass(), "minSizeSet", false);
        setField(term350870, term350870.getClass(), "prefSize", null);
        setBooleanField(term350870, term350870.getClass(), "prefSizeSet", false);
        setField(term350870, term350870.getClass(), "maxSize", null);
        setBooleanField(term350870, term350870.getClass(), "maxSizeSet", false);
        setField(term350870, term350870.getClass(), "componentOrientation", null);
        setBooleanField(term350870, term350870.getClass(), "newEventsOnly", false);
        setField(term350870, term350870.getClass(), "componentListener", null);
        setField(term350870, term350870.getClass(), "focusListener", null);
        setField(term350870, term350870.getClass(), "hierarchyListener", null);
        setField(term350870, term350870.getClass(), "hierarchyBoundsListener", null);
        setField(term350870, term350870.getClass(), "keyListener", null);
        setField(term350870, term350870.getClass(), "mouseListener", null);
        setField(term350870, term350870.getClass(), "mouseMotionListener", null);
        setField(term350870, term350870.getClass(), "mouseWheelListener", null);
        setField(term350870, term350870.getClass(), "inputMethodListener", null);
        setLongField(term350870, term350870.getClass(), "eventMask", 0L);
        setField(term350870, term350870.getClass(), "changeSupport", null);
        setField(term350870, term350870.getClass(), "objectLock", null);
        setBooleanField(term350870, term350870.getClass(), "isPacked", false);
        setIntField(term350870, term350870.getClass(), "boundsOp", 0);
        setField(term350870, term350870.getClass(), "compoundShape", null);
        setField(term350870, term350870.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term350870, term350870.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term350870, term350870.getClass(), "backgroundEraseDisabled", false);
        setField(term350870, term350870.getClass(), "eventCache", null);
        setBooleanField(term350870, term350870.getClass(), "coalescingEnabled", false);
        setBooleanField(term350870, term350870.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term350870, term350870.getClass(), "componentSerializedDataVersion", 0);
        setField(term350870, term350870.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmSetupView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setupRealmConfig", argTypes, term350870, args);
    }

};


