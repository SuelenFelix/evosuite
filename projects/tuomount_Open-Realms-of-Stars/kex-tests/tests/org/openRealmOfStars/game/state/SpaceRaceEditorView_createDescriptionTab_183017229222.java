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

public class SpaceRaceEditorView_createDescriptionTab_183017229222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574972;

    public SpaceRaceEditorView_createDescriptionTab_183017229222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574972 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574972, term1574972.getClass(), "screenWidth", 0);
        setIntField(term1574972, term1574972.getClass(), "screenHeight", 0);
        setIntField(term1574972, term1574972.getClass(), "gapY", 0);
        setField(term1574972, term1574972.getClass(), "spaceRaceNameField", null);
        setField(term1574972, term1574972.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574972, term1574972.getClass(), "shipTimer", null);
        setField(term1574972, term1574972.getClass(), "bridgeIdCombo", null);
        setField(term1574972, term1574972.getClass(), "attitudeCombo", null);
        setField(term1574972, term1574972.getClass(), "socialCombo", null);
        setField(term1574972, term1574972.getClass(), "genderCombo", null);
        setField(term1574972, term1574972.getClass(), "speechCombo", null);
        setField(term1574972, term1574972.getClass(), "nameGenCombo", null);
        setField(term1574972, term1574972.getClass(), "interiorPanel", null);
        setField(term1574972, term1574972.getClass(), "interiorPanel2", null);
        setField(term1574972, term1574972.getClass(), "raceImages", null);
        setIntField(term1574972, term1574972.getClass(), "customImageIndex", 0);
        setField(term1574972, term1574972.getClass(), "diplomacyMusics", null);
        setIntField(term1574972, term1574972.getClass(), "customMusicIndex", 0);
        setField(term1574972, term1574972.getClass(), "spaceRaceImageCombo", null);
        setField(term1574972, term1574972.getClass(), "browseButton", null);
        setField(term1574972, term1574972.getClass(), "browseMusicButton", null);
        setField(term1574972, term1574972.getClass(), "bridgeEffectCombo", null);
        setField(term1574972, term1574972.getClass(), "spaceShipIdCombo", null);
        setField(term1574972, term1574972.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574972, term1574972.getClass(), "hullImageCount", 0);
        setField(term1574972, term1574972.getClass(), "hullImage", null);
        setField(term1574972, term1574972.getClass(), "hullNameLabel", null);
        setField(term1574972, term1574972.getClass(), "descriptionText", null);
        setField(term1574972, term1574972.getClass(), "newRace", null);
        setField(term1574972, term1574972.getClass(), "traitPanel", null);
        setBooleanField(term1574972, term1574972.getClass(), "conflictWithId", false);
        setField(term1574972, term1574972.getClass(), "game", null);
        setBooleanField(term1574972, term1574972.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574972, term1574972.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574972, term1574972.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574972, term1574972.getClass(), "alignmentY", 0.0F);
        setField(term1574972, term1574972.getClass(), "ui", null);
        setField(term1574972, term1574972.getClass(), "listenerList", null);
        setField(term1574972, term1574972.getClass(), "clientProperties", null);
        setField(term1574972, term1574972.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574972, term1574972.getClass(), "autoscrolls", false);
        setField(term1574972, term1574972.getClass(), "border", null);
        setIntField(term1574972, term1574972.getClass(), "flags", 0);
        setField(term1574972, term1574972.getClass(), "inputVerifier", null);
        setBooleanField(term1574972, term1574972.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574972, term1574972.getClass(), "paintingChild", null);
        setField(term1574972, term1574972.getClass(), "popupMenu", null);
        setField(term1574972, term1574972.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574972, term1574972.getClass(), "focusInputMap", null);
        setField(term1574972, term1574972.getClass(), "ancestorInputMap", null);
        setField(term1574972, term1574972.getClass(), "windowInputMap", null);
        setField(term1574972, term1574972.getClass(), "actionMap", null);
        setField(term1574972, term1574972.getClass(), "aaHint", null);
        setField(term1574972, term1574972.getClass(), "lcdRenderingHint", null);
        setField(term1574972, term1574972.getClass(), "component", null);
        setField(term1574972, term1574972.getClass(), "layoutMgr", null);
        setField(term1574972, term1574972.getClass(), "dispatcher", null);
        setField(term1574972, term1574972.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574972, term1574972.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574972, term1574972.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574972, term1574972.getClass(), "printingThreads", null);
        setBooleanField(term1574972, term1574972.getClass(), "printing", false);
        setField(term1574972, term1574972.getClass(), "containerListener", null);
        setIntField(term1574972, term1574972.getClass(), "listeningChildren", 0);
        setIntField(term1574972, term1574972.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574972, term1574972.getClass(), "descendantsCount", 0);
        setField(term1574972, term1574972.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574972, term1574972.getClass(), "numOfHWComponents", 0);
        setIntField(term1574972, term1574972.getClass(), "numOfLWComponents", 0);
        setField(term1574972, term1574972.getClass(), "modalComp", null);
        setField(term1574972, term1574972.getClass(), "modalAppContext", null);
        setIntField(term1574972, term1574972.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574972, term1574972.getClass(), "peer", null);
        setField(term1574972, term1574972.getClass(), "parent", null);
        setField(term1574972, term1574972.getClass(), "appContext", null);
        setIntField(term1574972, term1574972.getClass(), "x", 0);
        setIntField(term1574972, term1574972.getClass(), "y", 0);
        setIntField(term1574972, term1574972.getClass(), "width", 0);
        setIntField(term1574972, term1574972.getClass(), "height", 0);
        setField(term1574972, term1574972.getClass(), "foreground", null);
        setField(term1574972, term1574972.getClass(), "background", null);
        setField(term1574972, term1574972.getClass(), "font", null);
        setField(term1574972, term1574972.getClass(), "peerFont", null);
        setField(term1574972, term1574972.getClass(), "cursor", null);
        setField(term1574972, term1574972.getClass(), "locale", null);
        setField(term1574972, term1574972.getClass(), "graphicsConfig", null);
        setField(term1574972, term1574972.getClass(), "bufferStrategy", null);
        setBooleanField(term1574972, term1574972.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574972, term1574972.getClass(), "visible", false);
        setBooleanField(term1574972, term1574972.getClass(), "enabled", false);
        setBooleanField(term1574972, term1574972.getClass(), "valid", false);
        setField(term1574972, term1574972.getClass(), "dropTarget", null);
        setField(term1574972, term1574972.getClass(), "popups", null);
        setField(term1574972, term1574972.getClass(), "name", null);
        setBooleanField(term1574972, term1574972.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574972, term1574972.getClass(), "focusable", false);
        setIntField(term1574972, term1574972.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574972, term1574972.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574972, term1574972.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574972, term1574972.getClass(), "acc", null);
        setField(term1574972, term1574972.getClass(), "minSize", null);
        setBooleanField(term1574972, term1574972.getClass(), "minSizeSet", false);
        setField(term1574972, term1574972.getClass(), "prefSize", null);
        setBooleanField(term1574972, term1574972.getClass(), "prefSizeSet", false);
        setField(term1574972, term1574972.getClass(), "maxSize", null);
        setBooleanField(term1574972, term1574972.getClass(), "maxSizeSet", false);
        setField(term1574972, term1574972.getClass(), "componentOrientation", null);
        setBooleanField(term1574972, term1574972.getClass(), "newEventsOnly", false);
        setField(term1574972, term1574972.getClass(), "componentListener", null);
        setField(term1574972, term1574972.getClass(), "focusListener", null);
        setField(term1574972, term1574972.getClass(), "hierarchyListener", null);
        setField(term1574972, term1574972.getClass(), "hierarchyBoundsListener", null);
        setField(term1574972, term1574972.getClass(), "keyListener", null);
        setField(term1574972, term1574972.getClass(), "mouseListener", null);
        setField(term1574972, term1574972.getClass(), "mouseMotionListener", null);
        setField(term1574972, term1574972.getClass(), "mouseWheelListener", null);
        setField(term1574972, term1574972.getClass(), "inputMethodListener", null);
        setLongField(term1574972, term1574972.getClass(), "eventMask", 0L);
        setField(term1574972, term1574972.getClass(), "changeSupport", null);
        setField(term1574972, term1574972.getClass(), "objectLock", null);
        setBooleanField(term1574972, term1574972.getClass(), "isPacked", false);
        setIntField(term1574972, term1574972.getClass(), "boundsOp", 0);
        setField(term1574972, term1574972.getClass(), "compoundShape", null);
        setField(term1574972, term1574972.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574972, term1574972.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574972, term1574972.getClass(), "backgroundEraseDisabled", false);
        setField(term1574972, term1574972.getClass(), "eventCache", null);
        setBooleanField(term1574972, term1574972.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574972, term1574972.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574972, term1574972.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574972, term1574972.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDescriptionTab", argTypes, term1574972, args);
    }

};


