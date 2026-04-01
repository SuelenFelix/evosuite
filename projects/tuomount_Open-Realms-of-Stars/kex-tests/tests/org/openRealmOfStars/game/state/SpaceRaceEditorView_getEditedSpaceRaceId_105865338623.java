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

public class SpaceRaceEditorView_getEditedSpaceRaceId_105865338623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575020;

    public SpaceRaceEditorView_getEditedSpaceRaceId_105865338623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1575020 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1575020, term1575020.getClass(), "screenWidth", 0);
        setIntField(term1575020, term1575020.getClass(), "screenHeight", 0);
        setIntField(term1575020, term1575020.getClass(), "gapY", 0);
        setField(term1575020, term1575020.getClass(), "spaceRaceNameField", null);
        setField(term1575020, term1575020.getClass(), "spaceRaceNameSingleField", null);
        setField(term1575020, term1575020.getClass(), "shipTimer", null);
        setField(term1575020, term1575020.getClass(), "bridgeIdCombo", null);
        setField(term1575020, term1575020.getClass(), "attitudeCombo", null);
        setField(term1575020, term1575020.getClass(), "socialCombo", null);
        setField(term1575020, term1575020.getClass(), "genderCombo", null);
        setField(term1575020, term1575020.getClass(), "speechCombo", null);
        setField(term1575020, term1575020.getClass(), "nameGenCombo", null);
        setField(term1575020, term1575020.getClass(), "interiorPanel", null);
        setField(term1575020, term1575020.getClass(), "interiorPanel2", null);
        setField(term1575020, term1575020.getClass(), "raceImages", null);
        setIntField(term1575020, term1575020.getClass(), "customImageIndex", 0);
        setField(term1575020, term1575020.getClass(), "diplomacyMusics", null);
        setIntField(term1575020, term1575020.getClass(), "customMusicIndex", 0);
        setField(term1575020, term1575020.getClass(), "spaceRaceImageCombo", null);
        setField(term1575020, term1575020.getClass(), "browseButton", null);
        setField(term1575020, term1575020.getClass(), "browseMusicButton", null);
        setField(term1575020, term1575020.getClass(), "bridgeEffectCombo", null);
        setField(term1575020, term1575020.getClass(), "spaceShipIdCombo", null);
        setField(term1575020, term1575020.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1575020, term1575020.getClass(), "hullImageCount", 0);
        setField(term1575020, term1575020.getClass(), "hullImage", null);
        setField(term1575020, term1575020.getClass(), "hullNameLabel", null);
        setField(term1575020, term1575020.getClass(), "descriptionText", null);
        setField(term1575020, term1575020.getClass(), "newRace", null);
        setField(term1575020, term1575020.getClass(), "traitPanel", null);
        setBooleanField(term1575020, term1575020.getClass(), "conflictWithId", false);
        setField(term1575020, term1575020.getClass(), "game", null);
        setBooleanField(term1575020, term1575020.getClass(), "isAlignmentXSet", false);
        setFloatField(term1575020, term1575020.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1575020, term1575020.getClass(), "isAlignmentYSet", false);
        setFloatField(term1575020, term1575020.getClass(), "alignmentY", 0.0F);
        setField(term1575020, term1575020.getClass(), "ui", null);
        setField(term1575020, term1575020.getClass(), "listenerList", null);
        setField(term1575020, term1575020.getClass(), "clientProperties", null);
        setField(term1575020, term1575020.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1575020, term1575020.getClass(), "autoscrolls", false);
        setField(term1575020, term1575020.getClass(), "border", null);
        setIntField(term1575020, term1575020.getClass(), "flags", 0);
        setField(term1575020, term1575020.getClass(), "inputVerifier", null);
        setBooleanField(term1575020, term1575020.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1575020, term1575020.getClass(), "paintingChild", null);
        setField(term1575020, term1575020.getClass(), "popupMenu", null);
        setField(term1575020, term1575020.getClass(), "revalidateRunnableScheduled", null);
        setField(term1575020, term1575020.getClass(), "focusInputMap", null);
        setField(term1575020, term1575020.getClass(), "ancestorInputMap", null);
        setField(term1575020, term1575020.getClass(), "windowInputMap", null);
        setField(term1575020, term1575020.getClass(), "actionMap", null);
        setField(term1575020, term1575020.getClass(), "aaHint", null);
        setField(term1575020, term1575020.getClass(), "lcdRenderingHint", null);
        setField(term1575020, term1575020.getClass(), "component", null);
        setField(term1575020, term1575020.getClass(), "layoutMgr", null);
        setField(term1575020, term1575020.getClass(), "dispatcher", null);
        setField(term1575020, term1575020.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1575020, term1575020.getClass(), "focusCycleRoot", false);
        setBooleanField(term1575020, term1575020.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1575020, term1575020.getClass(), "printingThreads", null);
        setBooleanField(term1575020, term1575020.getClass(), "printing", false);
        setField(term1575020, term1575020.getClass(), "containerListener", null);
        setIntField(term1575020, term1575020.getClass(), "listeningChildren", 0);
        setIntField(term1575020, term1575020.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1575020, term1575020.getClass(), "descendantsCount", 0);
        setField(term1575020, term1575020.getClass(), "preserveBackgroundColor", null);
        setIntField(term1575020, term1575020.getClass(), "numOfHWComponents", 0);
        setIntField(term1575020, term1575020.getClass(), "numOfLWComponents", 0);
        setField(term1575020, term1575020.getClass(), "modalComp", null);
        setField(term1575020, term1575020.getClass(), "modalAppContext", null);
        setIntField(term1575020, term1575020.getClass(), "containerSerializedDataVersion", 0);
        setField(term1575020, term1575020.getClass(), "peer", null);
        setField(term1575020, term1575020.getClass(), "parent", null);
        setField(term1575020, term1575020.getClass(), "appContext", null);
        setIntField(term1575020, term1575020.getClass(), "x", 0);
        setIntField(term1575020, term1575020.getClass(), "y", 0);
        setIntField(term1575020, term1575020.getClass(), "width", 0);
        setIntField(term1575020, term1575020.getClass(), "height", 0);
        setField(term1575020, term1575020.getClass(), "foreground", null);
        setField(term1575020, term1575020.getClass(), "background", null);
        setField(term1575020, term1575020.getClass(), "font", null);
        setField(term1575020, term1575020.getClass(), "peerFont", null);
        setField(term1575020, term1575020.getClass(), "cursor", null);
        setField(term1575020, term1575020.getClass(), "locale", null);
        setField(term1575020, term1575020.getClass(), "graphicsConfig", null);
        setField(term1575020, term1575020.getClass(), "bufferStrategy", null);
        setBooleanField(term1575020, term1575020.getClass(), "ignoreRepaint", false);
        setBooleanField(term1575020, term1575020.getClass(), "visible", false);
        setBooleanField(term1575020, term1575020.getClass(), "enabled", false);
        setBooleanField(term1575020, term1575020.getClass(), "valid", false);
        setField(term1575020, term1575020.getClass(), "dropTarget", null);
        setField(term1575020, term1575020.getClass(), "popups", null);
        setField(term1575020, term1575020.getClass(), "name", null);
        setBooleanField(term1575020, term1575020.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1575020, term1575020.getClass(), "focusable", false);
        setIntField(term1575020, term1575020.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1575020, term1575020.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1575020, term1575020.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1575020, term1575020.getClass(), "acc", null);
        setField(term1575020, term1575020.getClass(), "minSize", null);
        setBooleanField(term1575020, term1575020.getClass(), "minSizeSet", false);
        setField(term1575020, term1575020.getClass(), "prefSize", null);
        setBooleanField(term1575020, term1575020.getClass(), "prefSizeSet", false);
        setField(term1575020, term1575020.getClass(), "maxSize", null);
        setBooleanField(term1575020, term1575020.getClass(), "maxSizeSet", false);
        setField(term1575020, term1575020.getClass(), "componentOrientation", null);
        setBooleanField(term1575020, term1575020.getClass(), "newEventsOnly", false);
        setField(term1575020, term1575020.getClass(), "componentListener", null);
        setField(term1575020, term1575020.getClass(), "focusListener", null);
        setField(term1575020, term1575020.getClass(), "hierarchyListener", null);
        setField(term1575020, term1575020.getClass(), "hierarchyBoundsListener", null);
        setField(term1575020, term1575020.getClass(), "keyListener", null);
        setField(term1575020, term1575020.getClass(), "mouseListener", null);
        setField(term1575020, term1575020.getClass(), "mouseMotionListener", null);
        setField(term1575020, term1575020.getClass(), "mouseWheelListener", null);
        setField(term1575020, term1575020.getClass(), "inputMethodListener", null);
        setLongField(term1575020, term1575020.getClass(), "eventMask", 0L);
        setField(term1575020, term1575020.getClass(), "changeSupport", null);
        setField(term1575020, term1575020.getClass(), "objectLock", null);
        setBooleanField(term1575020, term1575020.getClass(), "isPacked", false);
        setIntField(term1575020, term1575020.getClass(), "boundsOp", 0);
        setField(term1575020, term1575020.getClass(), "compoundShape", null);
        setField(term1575020, term1575020.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1575020, term1575020.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1575020, term1575020.getClass(), "backgroundEraseDisabled", false);
        setField(term1575020, term1575020.getClass(), "eventCache", null);
        setBooleanField(term1575020, term1575020.getClass(), "coalescingEnabled", false);
        setBooleanField(term1575020, term1575020.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1575020, term1575020.getClass(), "componentSerializedDataVersion", 0);
        setField(term1575020, term1575020.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEditedSpaceRaceId", argTypes, term1575020, args);
    }

};


