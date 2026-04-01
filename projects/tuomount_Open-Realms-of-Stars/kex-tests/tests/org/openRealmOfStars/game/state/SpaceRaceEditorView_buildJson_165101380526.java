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

public class SpaceRaceEditorView_buildJson_165101380526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575164;

    public SpaceRaceEditorView_buildJson_165101380526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575164 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575164, term1575164.getClass(), "screenWidth", 0);
        setIntField(term1575164, term1575164.getClass(), "screenHeight", 0);
        setIntField(term1575164, term1575164.getClass(), "gapY", 0);
        setField(term1575164, term1575164.getClass(), "spaceRaceNameField", null);
        setField(term1575164, term1575164.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575164, term1575164.getClass(), "shipTimer", null);
        setField(term1575164, term1575164.getClass(), "bridgeIdCombo", null);
        setField(term1575164, term1575164.getClass(), "attitudeCombo", null);
        setField(term1575164, term1575164.getClass(), "socialCombo", null);
        setField(term1575164, term1575164.getClass(), "genderCombo", null);
        setField(term1575164, term1575164.getClass(), "speechCombo", null);
        setField(term1575164, term1575164.getClass(), "nameGenCombo", null);
        setField(term1575164, term1575164.getClass(), "interiorPanel", null);
        setField(term1575164, term1575164.getClass(), "interiorPanel2", null);
        setField(term1575164, term1575164.getClass(), "raceImages", null);
        setIntField(term1575164, term1575164.getClass(), "customImageIndex", 0);
        setField(term1575164, term1575164.getClass(), "diplomacyMusics", null);
        setIntField(term1575164, term1575164.getClass(), "customMusicIndex", 0);
        setField(term1575164, term1575164.getClass(), "spaceRaceImageCombo", null);
        setField(term1575164, term1575164.getClass(), "browseButton", null);
        setField(term1575164, term1575164.getClass(), "browseMusicButton", null);
        setField(term1575164, term1575164.getClass(), "bridgeEffectCombo", null);
        setField(term1575164, term1575164.getClass(), "spaceShipIdCombo", null);
        setField(term1575164, term1575164.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575164, term1575164.getClass(), "hullImageCount", 0);
        setField(term1575164, term1575164.getClass(), "hullImage", null);
        setField(term1575164, term1575164.getClass(), "hullNameLabel", null);
        setField(term1575164, term1575164.getClass(), "descriptionText", null);
        setField(term1575164, term1575164.getClass(), "newRace", null);
        setField(term1575164, term1575164.getClass(), "traitPanel", null);
        setBooleanField(term1575164, term1575164.getClass(), "conflictWithId", false);
        setField(term1575164, term1575164.getClass(), "game", null);
        setBooleanField(term1575164, term1575164.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575164, term1575164.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575164, term1575164.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575164, term1575164.getClass(), "alignmentY", 0.0F);
        setField(term1575164, term1575164.getClass(), "ui", null);
        setField(term1575164, term1575164.getClass(), "listenerList", null);
        setField(term1575164, term1575164.getClass(), "clientProperties", null);
        setField(term1575164, term1575164.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575164, term1575164.getClass(), "autoscrolls", false);
        setField(term1575164, term1575164.getClass(), "border", null);
        setIntField(term1575164, term1575164.getClass(), "flags", 0);
        setField(term1575164, term1575164.getClass(), "inputVerifier", null);
        setBooleanField(term1575164, term1575164.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575164, term1575164.getClass(), "paintingChild", null);
        setField(term1575164, term1575164.getClass(), "popupMenu", null);
        setField(term1575164, term1575164.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575164, term1575164.getClass(), "focusInputMap", null);
        setField(term1575164, term1575164.getClass(), "ancestorInputMap", null);
        setField(term1575164, term1575164.getClass(), "windowInputMap", null);
        setField(term1575164, term1575164.getClass(), "actionMap", null);
        setField(term1575164, term1575164.getClass(), "aaHint", null);
        setField(term1575164, term1575164.getClass(), "lcdRenderingHint", null);
        setField(term1575164, term1575164.getClass(), "component", null);
        setField(term1575164, term1575164.getClass(), "layoutMgr", null);
        setField(term1575164, term1575164.getClass(), "dispatcher", null);
        setField(term1575164, term1575164.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575164, term1575164.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575164, term1575164.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575164, term1575164.getClass(), "printingThreads", null);
        setBooleanField(term1575164, term1575164.getClass(), "printing", false);
        setField(term1575164, term1575164.getClass(), "containerListener", null);
        setIntField(term1575164, term1575164.getClass(), "listeningChildren", 0);
        setIntField(term1575164, term1575164.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575164, term1575164.getClass(), "descendantsCount", 0);
        setField(term1575164, term1575164.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575164, term1575164.getClass(), "numOfHWComponents", 0);
        setIntField(term1575164, term1575164.getClass(), "numOfLWComponents", 0);
        setField(term1575164, term1575164.getClass(), "modalComp", null);
        setField(term1575164, term1575164.getClass(), "modalAppContext", null);
        setIntField(term1575164, term1575164.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575164, term1575164.getClass(), "peer", null);
        setField(term1575164, term1575164.getClass(), "parent", null);
        setField(term1575164, term1575164.getClass(), "appContext", null);
        setIntField(term1575164, term1575164.getClass(), "x", 0);
        setIntField(term1575164, term1575164.getClass(), "y", 0);
        setIntField(term1575164, term1575164.getClass(), "width", 0);
        setIntField(term1575164, term1575164.getClass(), "height", 0);
        setField(term1575164, term1575164.getClass(), "foreground", null);
        setField(term1575164, term1575164.getClass(), "background", null);
        setField(term1575164, term1575164.getClass(), "font", null);
        setField(term1575164, term1575164.getClass(), "peerFont", null);
        setField(term1575164, term1575164.getClass(), "cursor", null);
        setField(term1575164, term1575164.getClass(), "locale", null);
        setField(term1575164, term1575164.getClass(), "graphicsConfig", null);
        setField(term1575164, term1575164.getClass(), "bufferStrategy", null);
        setBooleanField(term1575164, term1575164.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575164, term1575164.getClass(), "visible", false);
        setBooleanField(term1575164, term1575164.getClass(), "enabled", false);
        setBooleanField(term1575164, term1575164.getClass(), "valid", false);
        setField(term1575164, term1575164.getClass(), "dropTarget", null);
        setField(term1575164, term1575164.getClass(), "popups", null);
        setField(term1575164, term1575164.getClass(), "name", null);
        setBooleanField(term1575164, term1575164.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575164, term1575164.getClass(), "focusable", false);
        setIntField(term1575164, term1575164.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575164, term1575164.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575164, term1575164.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575164, term1575164.getClass(), "acc", null);
        setField(term1575164, term1575164.getClass(), "minSize", null);
        setBooleanField(term1575164, term1575164.getClass(), "minSizeSet", false);
        setField(term1575164, term1575164.getClass(), "prefSize", null);
        setBooleanField(term1575164, term1575164.getClass(), "prefSizeSet", false);
        setField(term1575164, term1575164.getClass(), "maxSize", null);
        setBooleanField(term1575164, term1575164.getClass(), "maxSizeSet", false);
        setField(term1575164, term1575164.getClass(), "componentOrientation", null);
        setBooleanField(term1575164, term1575164.getClass(), "newEventsOnly", false);
        setField(term1575164, term1575164.getClass(), "componentListener", null);
        setField(term1575164, term1575164.getClass(), "focusListener", null);
        setField(term1575164, term1575164.getClass(), "hierarchyListener", null);
        setField(term1575164, term1575164.getClass(), "hierarchyBoundsListener", null);
        setField(term1575164, term1575164.getClass(), "keyListener", null);
        setField(term1575164, term1575164.getClass(), "mouseListener", null);
        setField(term1575164, term1575164.getClass(), "mouseMotionListener", null);
        setField(term1575164, term1575164.getClass(), "mouseWheelListener", null);
        setField(term1575164, term1575164.getClass(), "inputMethodListener", null);
        setLongField(term1575164, term1575164.getClass(), "eventMask", 0L);
        setField(term1575164, term1575164.getClass(), "changeSupport", null);
        setField(term1575164, term1575164.getClass(), "objectLock", null);
        setBooleanField(term1575164, term1575164.getClass(), "isPacked", false);
        setIntField(term1575164, term1575164.getClass(), "boundsOp", 0);
        setField(term1575164, term1575164.getClass(), "compoundShape", null);
        setField(term1575164, term1575164.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575164, term1575164.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575164, term1575164.getClass(), "backgroundEraseDisabled", false);
        setField(term1575164, term1575164.getClass(), "eventCache", null);
        setBooleanField(term1575164, term1575164.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575164, term1575164.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575164, term1575164.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575164, term1575164.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildJson", argTypes, term1575164, args);
    }

};


