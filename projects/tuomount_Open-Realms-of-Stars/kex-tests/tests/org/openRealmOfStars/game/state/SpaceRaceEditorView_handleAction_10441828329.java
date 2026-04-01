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

public class SpaceRaceEditorView_handleAction_10441828329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575308;

    public SpaceRaceEditorView_handleAction_10441828329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575308 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575308, term1575308.getClass(), "screenWidth", 0);
        setIntField(term1575308, term1575308.getClass(), "screenHeight", 0);
        setIntField(term1575308, term1575308.getClass(), "gapY", 0);
        setField(term1575308, term1575308.getClass(), "spaceRaceNameField", null);
        setField(term1575308, term1575308.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575308, term1575308.getClass(), "shipTimer", null);
        setField(term1575308, term1575308.getClass(), "bridgeIdCombo", null);
        setField(term1575308, term1575308.getClass(), "attitudeCombo", null);
        setField(term1575308, term1575308.getClass(), "socialCombo", null);
        setField(term1575308, term1575308.getClass(), "genderCombo", null);
        setField(term1575308, term1575308.getClass(), "speechCombo", null);
        setField(term1575308, term1575308.getClass(), "nameGenCombo", null);
        setField(term1575308, term1575308.getClass(), "interiorPanel", null);
        setField(term1575308, term1575308.getClass(), "interiorPanel2", null);
        setField(term1575308, term1575308.getClass(), "raceImages", null);
        setIntField(term1575308, term1575308.getClass(), "customImageIndex", 0);
        setField(term1575308, term1575308.getClass(), "diplomacyMusics", null);
        setIntField(term1575308, term1575308.getClass(), "customMusicIndex", 0);
        setField(term1575308, term1575308.getClass(), "spaceRaceImageCombo", null);
        setField(term1575308, term1575308.getClass(), "browseButton", null);
        setField(term1575308, term1575308.getClass(), "browseMusicButton", null);
        setField(term1575308, term1575308.getClass(), "bridgeEffectCombo", null);
        setField(term1575308, term1575308.getClass(), "spaceShipIdCombo", null);
        setField(term1575308, term1575308.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575308, term1575308.getClass(), "hullImageCount", 0);
        setField(term1575308, term1575308.getClass(), "hullImage", null);
        setField(term1575308, term1575308.getClass(), "hullNameLabel", null);
        setField(term1575308, term1575308.getClass(), "descriptionText", null);
        setField(term1575308, term1575308.getClass(), "newRace", null);
        setField(term1575308, term1575308.getClass(), "traitPanel", null);
        setBooleanField(term1575308, term1575308.getClass(), "conflictWithId", false);
        setField(term1575308, term1575308.getClass(), "game", null);
        setBooleanField(term1575308, term1575308.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575308, term1575308.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575308, term1575308.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575308, term1575308.getClass(), "alignmentY", 0.0F);
        setField(term1575308, term1575308.getClass(), "ui", null);
        setField(term1575308, term1575308.getClass(), "listenerList", null);
        setField(term1575308, term1575308.getClass(), "clientProperties", null);
        setField(term1575308, term1575308.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575308, term1575308.getClass(), "autoscrolls", false);
        setField(term1575308, term1575308.getClass(), "border", null);
        setIntField(term1575308, term1575308.getClass(), "flags", 0);
        setField(term1575308, term1575308.getClass(), "inputVerifier", null);
        setBooleanField(term1575308, term1575308.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575308, term1575308.getClass(), "paintingChild", null);
        setField(term1575308, term1575308.getClass(), "popupMenu", null);
        setField(term1575308, term1575308.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575308, term1575308.getClass(), "focusInputMap", null);
        setField(term1575308, term1575308.getClass(), "ancestorInputMap", null);
        setField(term1575308, term1575308.getClass(), "windowInputMap", null);
        setField(term1575308, term1575308.getClass(), "actionMap", null);
        setField(term1575308, term1575308.getClass(), "aaHint", null);
        setField(term1575308, term1575308.getClass(), "lcdRenderingHint", null);
        setField(term1575308, term1575308.getClass(), "component", null);
        setField(term1575308, term1575308.getClass(), "layoutMgr", null);
        setField(term1575308, term1575308.getClass(), "dispatcher", null);
        setField(term1575308, term1575308.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575308, term1575308.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575308, term1575308.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575308, term1575308.getClass(), "printingThreads", null);
        setBooleanField(term1575308, term1575308.getClass(), "printing", false);
        setField(term1575308, term1575308.getClass(), "containerListener", null);
        setIntField(term1575308, term1575308.getClass(), "listeningChildren", 0);
        setIntField(term1575308, term1575308.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575308, term1575308.getClass(), "descendantsCount", 0);
        setField(term1575308, term1575308.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575308, term1575308.getClass(), "numOfHWComponents", 0);
        setIntField(term1575308, term1575308.getClass(), "numOfLWComponents", 0);
        setField(term1575308, term1575308.getClass(), "modalComp", null);
        setField(term1575308, term1575308.getClass(), "modalAppContext", null);
        setIntField(term1575308, term1575308.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575308, term1575308.getClass(), "peer", null);
        setField(term1575308, term1575308.getClass(), "parent", null);
        setField(term1575308, term1575308.getClass(), "appContext", null);
        setIntField(term1575308, term1575308.getClass(), "x", 0);
        setIntField(term1575308, term1575308.getClass(), "y", 0);
        setIntField(term1575308, term1575308.getClass(), "width", 0);
        setIntField(term1575308, term1575308.getClass(), "height", 0);
        setField(term1575308, term1575308.getClass(), "foreground", null);
        setField(term1575308, term1575308.getClass(), "background", null);
        setField(term1575308, term1575308.getClass(), "font", null);
        setField(term1575308, term1575308.getClass(), "peerFont", null);
        setField(term1575308, term1575308.getClass(), "cursor", null);
        setField(term1575308, term1575308.getClass(), "locale", null);
        setField(term1575308, term1575308.getClass(), "graphicsConfig", null);
        setField(term1575308, term1575308.getClass(), "bufferStrategy", null);
        setBooleanField(term1575308, term1575308.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575308, term1575308.getClass(), "visible", false);
        setBooleanField(term1575308, term1575308.getClass(), "enabled", false);
        setBooleanField(term1575308, term1575308.getClass(), "valid", false);
        setField(term1575308, term1575308.getClass(), "dropTarget", null);
        setField(term1575308, term1575308.getClass(), "popups", null);
        setField(term1575308, term1575308.getClass(), "name", null);
        setBooleanField(term1575308, term1575308.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575308, term1575308.getClass(), "focusable", false);
        setIntField(term1575308, term1575308.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575308, term1575308.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575308, term1575308.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575308, term1575308.getClass(), "acc", null);
        setField(term1575308, term1575308.getClass(), "minSize", null);
        setBooleanField(term1575308, term1575308.getClass(), "minSizeSet", false);
        setField(term1575308, term1575308.getClass(), "prefSize", null);
        setBooleanField(term1575308, term1575308.getClass(), "prefSizeSet", false);
        setField(term1575308, term1575308.getClass(), "maxSize", null);
        setBooleanField(term1575308, term1575308.getClass(), "maxSizeSet", false);
        setField(term1575308, term1575308.getClass(), "componentOrientation", null);
        setBooleanField(term1575308, term1575308.getClass(), "newEventsOnly", false);
        setField(term1575308, term1575308.getClass(), "componentListener", null);
        setField(term1575308, term1575308.getClass(), "focusListener", null);
        setField(term1575308, term1575308.getClass(), "hierarchyListener", null);
        setField(term1575308, term1575308.getClass(), "hierarchyBoundsListener", null);
        setField(term1575308, term1575308.getClass(), "keyListener", null);
        setField(term1575308, term1575308.getClass(), "mouseListener", null);
        setField(term1575308, term1575308.getClass(), "mouseMotionListener", null);
        setField(term1575308, term1575308.getClass(), "mouseWheelListener", null);
        setField(term1575308, term1575308.getClass(), "inputMethodListener", null);
        setLongField(term1575308, term1575308.getClass(), "eventMask", 0L);
        setField(term1575308, term1575308.getClass(), "changeSupport", null);
        setField(term1575308, term1575308.getClass(), "objectLock", null);
        setBooleanField(term1575308, term1575308.getClass(), "isPacked", false);
        setIntField(term1575308, term1575308.getClass(), "boundsOp", 0);
        setField(term1575308, term1575308.getClass(), "compoundShape", null);
        setField(term1575308, term1575308.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575308, term1575308.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575308, term1575308.getClass(), "backgroundEraseDisabled", false);
        setField(term1575308, term1575308.getClass(), "eventCache", null);
        setBooleanField(term1575308, term1575308.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575308, term1575308.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575308, term1575308.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575308, term1575308.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1575308, args);
    }

};


