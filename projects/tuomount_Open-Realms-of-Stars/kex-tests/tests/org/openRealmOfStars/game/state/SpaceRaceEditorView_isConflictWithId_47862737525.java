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

public class SpaceRaceEditorView_isConflictWithId_47862737525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575116;

    public SpaceRaceEditorView_isConflictWithId_47862737525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575116 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575116, term1575116.getClass(), "screenWidth", 0);
        setIntField(term1575116, term1575116.getClass(), "screenHeight", 0);
        setIntField(term1575116, term1575116.getClass(), "gapY", 0);
        setField(term1575116, term1575116.getClass(), "spaceRaceNameField", null);
        setField(term1575116, term1575116.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575116, term1575116.getClass(), "shipTimer", null);
        setField(term1575116, term1575116.getClass(), "bridgeIdCombo", null);
        setField(term1575116, term1575116.getClass(), "attitudeCombo", null);
        setField(term1575116, term1575116.getClass(), "socialCombo", null);
        setField(term1575116, term1575116.getClass(), "genderCombo", null);
        setField(term1575116, term1575116.getClass(), "speechCombo", null);
        setField(term1575116, term1575116.getClass(), "nameGenCombo", null);
        setField(term1575116, term1575116.getClass(), "interiorPanel", null);
        setField(term1575116, term1575116.getClass(), "interiorPanel2", null);
        setField(term1575116, term1575116.getClass(), "raceImages", null);
        setIntField(term1575116, term1575116.getClass(), "customImageIndex", 0);
        setField(term1575116, term1575116.getClass(), "diplomacyMusics", null);
        setIntField(term1575116, term1575116.getClass(), "customMusicIndex", 0);
        setField(term1575116, term1575116.getClass(), "spaceRaceImageCombo", null);
        setField(term1575116, term1575116.getClass(), "browseButton", null);
        setField(term1575116, term1575116.getClass(), "browseMusicButton", null);
        setField(term1575116, term1575116.getClass(), "bridgeEffectCombo", null);
        setField(term1575116, term1575116.getClass(), "spaceShipIdCombo", null);
        setField(term1575116, term1575116.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575116, term1575116.getClass(), "hullImageCount", 0);
        setField(term1575116, term1575116.getClass(), "hullImage", null);
        setField(term1575116, term1575116.getClass(), "hullNameLabel", null);
        setField(term1575116, term1575116.getClass(), "descriptionText", null);
        setField(term1575116, term1575116.getClass(), "newRace", null);
        setField(term1575116, term1575116.getClass(), "traitPanel", null);
        setBooleanField(term1575116, term1575116.getClass(), "conflictWithId", false);
        setField(term1575116, term1575116.getClass(), "game", null);
        setBooleanField(term1575116, term1575116.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575116, term1575116.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575116, term1575116.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575116, term1575116.getClass(), "alignmentY", 0.0F);
        setField(term1575116, term1575116.getClass(), "ui", null);
        setField(term1575116, term1575116.getClass(), "listenerList", null);
        setField(term1575116, term1575116.getClass(), "clientProperties", null);
        setField(term1575116, term1575116.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575116, term1575116.getClass(), "autoscrolls", false);
        setField(term1575116, term1575116.getClass(), "border", null);
        setIntField(term1575116, term1575116.getClass(), "flags", 0);
        setField(term1575116, term1575116.getClass(), "inputVerifier", null);
        setBooleanField(term1575116, term1575116.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575116, term1575116.getClass(), "paintingChild", null);
        setField(term1575116, term1575116.getClass(), "popupMenu", null);
        setField(term1575116, term1575116.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575116, term1575116.getClass(), "focusInputMap", null);
        setField(term1575116, term1575116.getClass(), "ancestorInputMap", null);
        setField(term1575116, term1575116.getClass(), "windowInputMap", null);
        setField(term1575116, term1575116.getClass(), "actionMap", null);
        setField(term1575116, term1575116.getClass(), "aaHint", null);
        setField(term1575116, term1575116.getClass(), "lcdRenderingHint", null);
        setField(term1575116, term1575116.getClass(), "component", null);
        setField(term1575116, term1575116.getClass(), "layoutMgr", null);
        setField(term1575116, term1575116.getClass(), "dispatcher", null);
        setField(term1575116, term1575116.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575116, term1575116.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575116, term1575116.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575116, term1575116.getClass(), "printingThreads", null);
        setBooleanField(term1575116, term1575116.getClass(), "printing", false);
        setField(term1575116, term1575116.getClass(), "containerListener", null);
        setIntField(term1575116, term1575116.getClass(), "listeningChildren", 0);
        setIntField(term1575116, term1575116.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575116, term1575116.getClass(), "descendantsCount", 0);
        setField(term1575116, term1575116.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575116, term1575116.getClass(), "numOfHWComponents", 0);
        setIntField(term1575116, term1575116.getClass(), "numOfLWComponents", 0);
        setField(term1575116, term1575116.getClass(), "modalComp", null);
        setField(term1575116, term1575116.getClass(), "modalAppContext", null);
        setIntField(term1575116, term1575116.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575116, term1575116.getClass(), "peer", null);
        setField(term1575116, term1575116.getClass(), "parent", null);
        setField(term1575116, term1575116.getClass(), "appContext", null);
        setIntField(term1575116, term1575116.getClass(), "x", 0);
        setIntField(term1575116, term1575116.getClass(), "y", 0);
        setIntField(term1575116, term1575116.getClass(), "width", 0);
        setIntField(term1575116, term1575116.getClass(), "height", 0);
        setField(term1575116, term1575116.getClass(), "foreground", null);
        setField(term1575116, term1575116.getClass(), "background", null);
        setField(term1575116, term1575116.getClass(), "font", null);
        setField(term1575116, term1575116.getClass(), "peerFont", null);
        setField(term1575116, term1575116.getClass(), "cursor", null);
        setField(term1575116, term1575116.getClass(), "locale", null);
        setField(term1575116, term1575116.getClass(), "graphicsConfig", null);
        setField(term1575116, term1575116.getClass(), "bufferStrategy", null);
        setBooleanField(term1575116, term1575116.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575116, term1575116.getClass(), "visible", false);
        setBooleanField(term1575116, term1575116.getClass(), "enabled", false);
        setBooleanField(term1575116, term1575116.getClass(), "valid", false);
        setField(term1575116, term1575116.getClass(), "dropTarget", null);
        setField(term1575116, term1575116.getClass(), "popups", null);
        setField(term1575116, term1575116.getClass(), "name", null);
        setBooleanField(term1575116, term1575116.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575116, term1575116.getClass(), "focusable", false);
        setIntField(term1575116, term1575116.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575116, term1575116.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575116, term1575116.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575116, term1575116.getClass(), "acc", null);
        setField(term1575116, term1575116.getClass(), "minSize", null);
        setBooleanField(term1575116, term1575116.getClass(), "minSizeSet", false);
        setField(term1575116, term1575116.getClass(), "prefSize", null);
        setBooleanField(term1575116, term1575116.getClass(), "prefSizeSet", false);
        setField(term1575116, term1575116.getClass(), "maxSize", null);
        setBooleanField(term1575116, term1575116.getClass(), "maxSizeSet", false);
        setField(term1575116, term1575116.getClass(), "componentOrientation", null);
        setBooleanField(term1575116, term1575116.getClass(), "newEventsOnly", false);
        setField(term1575116, term1575116.getClass(), "componentListener", null);
        setField(term1575116, term1575116.getClass(), "focusListener", null);
        setField(term1575116, term1575116.getClass(), "hierarchyListener", null);
        setField(term1575116, term1575116.getClass(), "hierarchyBoundsListener", null);
        setField(term1575116, term1575116.getClass(), "keyListener", null);
        setField(term1575116, term1575116.getClass(), "mouseListener", null);
        setField(term1575116, term1575116.getClass(), "mouseMotionListener", null);
        setField(term1575116, term1575116.getClass(), "mouseWheelListener", null);
        setField(term1575116, term1575116.getClass(), "inputMethodListener", null);
        setLongField(term1575116, term1575116.getClass(), "eventMask", 0L);
        setField(term1575116, term1575116.getClass(), "changeSupport", null);
        setField(term1575116, term1575116.getClass(), "objectLock", null);
        setBooleanField(term1575116, term1575116.getClass(), "isPacked", false);
        setIntField(term1575116, term1575116.getClass(), "boundsOp", 0);
        setField(term1575116, term1575116.getClass(), "compoundShape", null);
        setField(term1575116, term1575116.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575116, term1575116.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575116, term1575116.getClass(), "backgroundEraseDisabled", false);
        setField(term1575116, term1575116.getClass(), "eventCache", null);
        setBooleanField(term1575116, term1575116.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575116, term1575116.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575116, term1575116.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575116, term1575116.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConflictWithId", argTypes, term1575116, args);
    }

};


