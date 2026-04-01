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

public class SpaceRaceEditorView_createAppearanceTab_56106102521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574924;

    public SpaceRaceEditorView_createAppearanceTab_56106102521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574924 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574924, term1574924.getClass(), "screenWidth", 0);
        setIntField(term1574924, term1574924.getClass(), "screenHeight", 0);
        setIntField(term1574924, term1574924.getClass(), "gapY", 0);
        setField(term1574924, term1574924.getClass(), "spaceRaceNameField", null);
        setField(term1574924, term1574924.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574924, term1574924.getClass(), "shipTimer", null);
        setField(term1574924, term1574924.getClass(), "bridgeIdCombo", null);
        setField(term1574924, term1574924.getClass(), "attitudeCombo", null);
        setField(term1574924, term1574924.getClass(), "socialCombo", null);
        setField(term1574924, term1574924.getClass(), "genderCombo", null);
        setField(term1574924, term1574924.getClass(), "speechCombo", null);
        setField(term1574924, term1574924.getClass(), "nameGenCombo", null);
        setField(term1574924, term1574924.getClass(), "interiorPanel", null);
        setField(term1574924, term1574924.getClass(), "interiorPanel2", null);
        setField(term1574924, term1574924.getClass(), "raceImages", null);
        setIntField(term1574924, term1574924.getClass(), "customImageIndex", 0);
        setField(term1574924, term1574924.getClass(), "diplomacyMusics", null);
        setIntField(term1574924, term1574924.getClass(), "customMusicIndex", 0);
        setField(term1574924, term1574924.getClass(), "spaceRaceImageCombo", null);
        setField(term1574924, term1574924.getClass(), "browseButton", null);
        setField(term1574924, term1574924.getClass(), "browseMusicButton", null);
        setField(term1574924, term1574924.getClass(), "bridgeEffectCombo", null);
        setField(term1574924, term1574924.getClass(), "spaceShipIdCombo", null);
        setField(term1574924, term1574924.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574924, term1574924.getClass(), "hullImageCount", 0);
        setField(term1574924, term1574924.getClass(), "hullImage", null);
        setField(term1574924, term1574924.getClass(), "hullNameLabel", null);
        setField(term1574924, term1574924.getClass(), "descriptionText", null);
        setField(term1574924, term1574924.getClass(), "newRace", null);
        setField(term1574924, term1574924.getClass(), "traitPanel", null);
        setBooleanField(term1574924, term1574924.getClass(), "conflictWithId", false);
        setField(term1574924, term1574924.getClass(), "game", null);
        setBooleanField(term1574924, term1574924.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574924, term1574924.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574924, term1574924.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574924, term1574924.getClass(), "alignmentY", 0.0F);
        setField(term1574924, term1574924.getClass(), "ui", null);
        setField(term1574924, term1574924.getClass(), "listenerList", null);
        setField(term1574924, term1574924.getClass(), "clientProperties", null);
        setField(term1574924, term1574924.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574924, term1574924.getClass(), "autoscrolls", false);
        setField(term1574924, term1574924.getClass(), "border", null);
        setIntField(term1574924, term1574924.getClass(), "flags", 0);
        setField(term1574924, term1574924.getClass(), "inputVerifier", null);
        setBooleanField(term1574924, term1574924.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574924, term1574924.getClass(), "paintingChild", null);
        setField(term1574924, term1574924.getClass(), "popupMenu", null);
        setField(term1574924, term1574924.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574924, term1574924.getClass(), "focusInputMap", null);
        setField(term1574924, term1574924.getClass(), "ancestorInputMap", null);
        setField(term1574924, term1574924.getClass(), "windowInputMap", null);
        setField(term1574924, term1574924.getClass(), "actionMap", null);
        setField(term1574924, term1574924.getClass(), "aaHint", null);
        setField(term1574924, term1574924.getClass(), "lcdRenderingHint", null);
        setField(term1574924, term1574924.getClass(), "component", null);
        setField(term1574924, term1574924.getClass(), "layoutMgr", null);
        setField(term1574924, term1574924.getClass(), "dispatcher", null);
        setField(term1574924, term1574924.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574924, term1574924.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574924, term1574924.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574924, term1574924.getClass(), "printingThreads", null);
        setBooleanField(term1574924, term1574924.getClass(), "printing", false);
        setField(term1574924, term1574924.getClass(), "containerListener", null);
        setIntField(term1574924, term1574924.getClass(), "listeningChildren", 0);
        setIntField(term1574924, term1574924.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574924, term1574924.getClass(), "descendantsCount", 0);
        setField(term1574924, term1574924.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574924, term1574924.getClass(), "numOfHWComponents", 0);
        setIntField(term1574924, term1574924.getClass(), "numOfLWComponents", 0);
        setField(term1574924, term1574924.getClass(), "modalComp", null);
        setField(term1574924, term1574924.getClass(), "modalAppContext", null);
        setIntField(term1574924, term1574924.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574924, term1574924.getClass(), "peer", null);
        setField(term1574924, term1574924.getClass(), "parent", null);
        setField(term1574924, term1574924.getClass(), "appContext", null);
        setIntField(term1574924, term1574924.getClass(), "x", 0);
        setIntField(term1574924, term1574924.getClass(), "y", 0);
        setIntField(term1574924, term1574924.getClass(), "width", 0);
        setIntField(term1574924, term1574924.getClass(), "height", 0);
        setField(term1574924, term1574924.getClass(), "foreground", null);
        setField(term1574924, term1574924.getClass(), "background", null);
        setField(term1574924, term1574924.getClass(), "font", null);
        setField(term1574924, term1574924.getClass(), "peerFont", null);
        setField(term1574924, term1574924.getClass(), "cursor", null);
        setField(term1574924, term1574924.getClass(), "locale", null);
        setField(term1574924, term1574924.getClass(), "graphicsConfig", null);
        setField(term1574924, term1574924.getClass(), "bufferStrategy", null);
        setBooleanField(term1574924, term1574924.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574924, term1574924.getClass(), "visible", false);
        setBooleanField(term1574924, term1574924.getClass(), "enabled", false);
        setBooleanField(term1574924, term1574924.getClass(), "valid", false);
        setField(term1574924, term1574924.getClass(), "dropTarget", null);
        setField(term1574924, term1574924.getClass(), "popups", null);
        setField(term1574924, term1574924.getClass(), "name", null);
        setBooleanField(term1574924, term1574924.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574924, term1574924.getClass(), "focusable", false);
        setIntField(term1574924, term1574924.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574924, term1574924.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574924, term1574924.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574924, term1574924.getClass(), "acc", null);
        setField(term1574924, term1574924.getClass(), "minSize", null);
        setBooleanField(term1574924, term1574924.getClass(), "minSizeSet", false);
        setField(term1574924, term1574924.getClass(), "prefSize", null);
        setBooleanField(term1574924, term1574924.getClass(), "prefSizeSet", false);
        setField(term1574924, term1574924.getClass(), "maxSize", null);
        setBooleanField(term1574924, term1574924.getClass(), "maxSizeSet", false);
        setField(term1574924, term1574924.getClass(), "componentOrientation", null);
        setBooleanField(term1574924, term1574924.getClass(), "newEventsOnly", false);
        setField(term1574924, term1574924.getClass(), "componentListener", null);
        setField(term1574924, term1574924.getClass(), "focusListener", null);
        setField(term1574924, term1574924.getClass(), "hierarchyListener", null);
        setField(term1574924, term1574924.getClass(), "hierarchyBoundsListener", null);
        setField(term1574924, term1574924.getClass(), "keyListener", null);
        setField(term1574924, term1574924.getClass(), "mouseListener", null);
        setField(term1574924, term1574924.getClass(), "mouseMotionListener", null);
        setField(term1574924, term1574924.getClass(), "mouseWheelListener", null);
        setField(term1574924, term1574924.getClass(), "inputMethodListener", null);
        setLongField(term1574924, term1574924.getClass(), "eventMask", 0L);
        setField(term1574924, term1574924.getClass(), "changeSupport", null);
        setField(term1574924, term1574924.getClass(), "objectLock", null);
        setBooleanField(term1574924, term1574924.getClass(), "isPacked", false);
        setIntField(term1574924, term1574924.getClass(), "boundsOp", 0);
        setField(term1574924, term1574924.getClass(), "compoundShape", null);
        setField(term1574924, term1574924.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574924, term1574924.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574924, term1574924.getClass(), "backgroundEraseDisabled", false);
        setField(term1574924, term1574924.getClass(), "eventCache", null);
        setBooleanField(term1574924, term1574924.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574924, term1574924.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574924, term1574924.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574924, term1574924.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createAppearanceTab", argTypes, term1574924, args);
    }

};


