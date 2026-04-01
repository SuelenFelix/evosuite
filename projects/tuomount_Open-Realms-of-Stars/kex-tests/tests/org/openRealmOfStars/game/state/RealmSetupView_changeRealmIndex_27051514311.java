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
import java.lang.Integer;

public class RealmSetupView_changeRealmIndex_27051514311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351052;
     Object term351097;

    public RealmSetupView_changeRealmIndex_27051514311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351052 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmSetupView"));
        setField(term351052, term351052.getClass(), "comboRaceSelect", null);
        setField(term351052, term351052.getClass(), "comboGovernmentSelect", null);
        setField(term351052, term351052.getClass(), "checkElderRealm", null);
        setField(term351052, term351052.getClass(), "realmName", null);
        setField(term351052, term351052.getClass(), "raceImgs", null);
        setField(term351052, term351052.getClass(), "comboRealmColor", null);
        setField(term351052, term351052.getClass(), "comboDifficult", null);
        setField(term351052, term351052.getClass(), "comboScenario", null);
        setField(term351052, term351052.getClass(), "config", null);
        setField(term351052, term351052.getClass(), "actionListener", null);
        setBooleanField(term351052, term351052.getClass(), "allowChangingRealm", false);
        setIntField(term351052, term351052.getClass(), "realmIndex", 0);
        setField(term351052, term351052.getClass(), "spaceRaceInfo", null);
        setField(term351052, term351052.getClass(), "infoPanelForSpaceRace", null);
        setField(term351052, term351052.getClass(), "governmentInfo", null);
        setField(term351052, term351052.getClass(), "fullPanel", null);
        setIntField(term351052, term351052.getClass(), "rigidSize", 0);
        setIntField(term351052, term351052.getClass(), "maxComboWidth", 0);
        setBooleanField(term351052, term351052.getClass(), "isAlignmentXSet", false);
        setFloatField(term351052, term351052.getClass(), "alignmentX", 0.0F);
        setBooleanField(term351052, term351052.getClass(), "isAlignmentYSet", false);
        setFloatField(term351052, term351052.getClass(), "alignmentY", 0.0F);
        setField(term351052, term351052.getClass(), "ui", null);
        setField(term351052, term351052.getClass(), "listenerList", null);
        setField(term351052, term351052.getClass(), "clientProperties", null);
        setField(term351052, term351052.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term351052, term351052.getClass(), "autoscrolls", false);
        setField(term351052, term351052.getClass(), "border", null);
        setIntField(term351052, term351052.getClass(), "flags", 0);
        setField(term351052, term351052.getClass(), "inputVerifier", null);
        setBooleanField(term351052, term351052.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term351052, term351052.getClass(), "paintingChild", null);
        setField(term351052, term351052.getClass(), "popupMenu", null);
        setField(term351052, term351052.getClass(), "revalidateRunnableScheduled", null);
        setField(term351052, term351052.getClass(), "focusInputMap", null);
        setField(term351052, term351052.getClass(), "ancestorInputMap", null);
        setField(term351052, term351052.getClass(), "windowInputMap", null);
        setField(term351052, term351052.getClass(), "actionMap", null);
        setField(term351052, term351052.getClass(), "aaHint", null);
        setField(term351052, term351052.getClass(), "lcdRenderingHint", null);
        setField(term351052, term351052.getClass(), "component", null);
        setField(term351052, term351052.getClass(), "layoutMgr", null);
        setField(term351052, term351052.getClass(), "dispatcher", null);
        setField(term351052, term351052.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term351052, term351052.getClass(), "focusCycleRoot", false);
        setBooleanField(term351052, term351052.getClass(), "focusTraversalPolicyProvider", false);
        setField(term351052, term351052.getClass(), "printingThreads", null);
        setBooleanField(term351052, term351052.getClass(), "printing", false);
        setField(term351052, term351052.getClass(), "containerListener", null);
        setIntField(term351052, term351052.getClass(), "listeningChildren", 0);
        setIntField(term351052, term351052.getClass(), "listeningBoundsChildren", 0);
        setIntField(term351052, term351052.getClass(), "descendantsCount", 0);
        setField(term351052, term351052.getClass(), "preserveBackgroundColor", null);
        setIntField(term351052, term351052.getClass(), "numOfHWComponents", 0);
        setIntField(term351052, term351052.getClass(), "numOfLWComponents", 0);
        setField(term351052, term351052.getClass(), "modalComp", null);
        setField(term351052, term351052.getClass(), "modalAppContext", null);
        setIntField(term351052, term351052.getClass(), "containerSerializedDataVersion", 0);
        setField(term351052, term351052.getClass(), "peer", null);
        setField(term351052, term351052.getClass(), "parent", null);
        setField(term351052, term351052.getClass(), "appContext", null);
        setIntField(term351052, term351052.getClass(), "x", 0);
        setIntField(term351052, term351052.getClass(), "y", 0);
        setIntField(term351052, term351052.getClass(), "width", 0);
        setIntField(term351052, term351052.getClass(), "height", 0);
        setField(term351052, term351052.getClass(), "foreground", null);
        setField(term351052, term351052.getClass(), "background", null);
        setField(term351052, term351052.getClass(), "font", null);
        setField(term351052, term351052.getClass(), "peerFont", null);
        setField(term351052, term351052.getClass(), "cursor", null);
        setField(term351052, term351052.getClass(), "locale", null);
        setField(term351052, term351052.getClass(), "graphicsConfig", null);
        setField(term351052, term351052.getClass(), "bufferStrategy", null);
        setBooleanField(term351052, term351052.getClass(), "ignoreRepaint", false);
        setBooleanField(term351052, term351052.getClass(), "visible", false);
        setBooleanField(term351052, term351052.getClass(), "enabled", false);
        setBooleanField(term351052, term351052.getClass(), "valid", false);
        setField(term351052, term351052.getClass(), "dropTarget", null);
        setField(term351052, term351052.getClass(), "popups", null);
        setField(term351052, term351052.getClass(), "name", null);
        setBooleanField(term351052, term351052.getClass(), "nameExplicitlySet", false);
        setBooleanField(term351052, term351052.getClass(), "focusable", false);
        setIntField(term351052, term351052.getClass(), "isFocusTraversableOverridden", 0);
        setField(term351052, term351052.getClass(), "focusTraversalKeys", null);
        setBooleanField(term351052, term351052.getClass(), "focusTraversalKeysEnabled", false);
        setField(term351052, term351052.getClass(), "acc", null);
        setField(term351052, term351052.getClass(), "minSize", null);
        setBooleanField(term351052, term351052.getClass(), "minSizeSet", false);
        setField(term351052, term351052.getClass(), "prefSize", null);
        setBooleanField(term351052, term351052.getClass(), "prefSizeSet", false);
        setField(term351052, term351052.getClass(), "maxSize", null);
        setBooleanField(term351052, term351052.getClass(), "maxSizeSet", false);
        setField(term351052, term351052.getClass(), "componentOrientation", null);
        setBooleanField(term351052, term351052.getClass(), "newEventsOnly", false);
        setField(term351052, term351052.getClass(), "componentListener", null);
        setField(term351052, term351052.getClass(), "focusListener", null);
        setField(term351052, term351052.getClass(), "hierarchyListener", null);
        setField(term351052, term351052.getClass(), "hierarchyBoundsListener", null);
        setField(term351052, term351052.getClass(), "keyListener", null);
        setField(term351052, term351052.getClass(), "mouseListener", null);
        setField(term351052, term351052.getClass(), "mouseMotionListener", null);
        setField(term351052, term351052.getClass(), "mouseWheelListener", null);
        setField(term351052, term351052.getClass(), "inputMethodListener", null);
        setLongField(term351052, term351052.getClass(), "eventMask", 0L);
        setField(term351052, term351052.getClass(), "changeSupport", null);
        setField(term351052, term351052.getClass(), "objectLock", null);
        setBooleanField(term351052, term351052.getClass(), "isPacked", false);
        setIntField(term351052, term351052.getClass(), "boundsOp", 0);
        setField(term351052, term351052.getClass(), "compoundShape", null);
        setField(term351052, term351052.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term351052, term351052.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term351052, term351052.getClass(), "backgroundEraseDisabled", false);
        setField(term351052, term351052.getClass(), "eventCache", null);
        setBooleanField(term351052, term351052.getClass(), "coalescingEnabled", false);
        setBooleanField(term351052, term351052.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term351052, term351052.getClass(), "componentSerializedDataVersion", 0);
        setField(term351052, term351052.getClass(), "accessibleContext", null);
        term351097 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmSetupView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term351097;
        callMethod(klass, "changeRealmIndex", argTypes, term351052, args);
    }

};


