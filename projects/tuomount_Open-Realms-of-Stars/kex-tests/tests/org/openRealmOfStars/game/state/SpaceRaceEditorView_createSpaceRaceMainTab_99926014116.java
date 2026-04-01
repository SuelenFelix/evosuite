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

public class SpaceRaceEditorView_createSpaceRaceMainTab_99926014116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1574684;

    public SpaceRaceEditorView_createSpaceRaceMainTab_99926014116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1574684 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView"));
        setIntField(term1574684, term1574684.getClass(), "screenWidth", 0);
        setIntField(term1574684, term1574684.getClass(), "screenHeight", 0);
        setIntField(term1574684, term1574684.getClass(), "gapY", 0);
        setField(term1574684, term1574684.getClass(), "spaceRaceNameField", null);
        setField(term1574684, term1574684.getClass(), "spaceRaceNameSingleField", null);
        setField(term1574684, term1574684.getClass(), "shipTimer", null);
        setField(term1574684, term1574684.getClass(), "bridgeIdCombo", null);
        setField(term1574684, term1574684.getClass(), "attitudeCombo", null);
        setField(term1574684, term1574684.getClass(), "socialCombo", null);
        setField(term1574684, term1574684.getClass(), "genderCombo", null);
        setField(term1574684, term1574684.getClass(), "speechCombo", null);
        setField(term1574684, term1574684.getClass(), "nameGenCombo", null);
        setField(term1574684, term1574684.getClass(), "interiorPanel", null);
        setField(term1574684, term1574684.getClass(), "interiorPanel2", null);
        setField(term1574684, term1574684.getClass(), "raceImages", null);
        setIntField(term1574684, term1574684.getClass(), "customImageIndex", 0);
        setField(term1574684, term1574684.getClass(), "diplomacyMusics", null);
        setIntField(term1574684, term1574684.getClass(), "customMusicIndex", 0);
        setField(term1574684, term1574684.getClass(), "spaceRaceImageCombo", null);
        setField(term1574684, term1574684.getClass(), "browseButton", null);
        setField(term1574684, term1574684.getClass(), "browseMusicButton", null);
        setField(term1574684, term1574684.getClass(), "bridgeEffectCombo", null);
        setField(term1574684, term1574684.getClass(), "spaceShipIdCombo", null);
        setField(term1574684, term1574684.getClass(), "diplomacyMusicCombo", null);
        setIntField(term1574684, term1574684.getClass(), "hullImageCount", 0);
        setField(term1574684, term1574684.getClass(), "hullImage", null);
        setField(term1574684, term1574684.getClass(), "hullNameLabel", null);
        setField(term1574684, term1574684.getClass(), "descriptionText", null);
        setField(term1574684, term1574684.getClass(), "newRace", null);
        setField(term1574684, term1574684.getClass(), "traitPanel", null);
        setBooleanField(term1574684, term1574684.getClass(), "conflictWithId", false);
        setField(term1574684, term1574684.getClass(), "game", null);
        setBooleanField(term1574684, term1574684.getClass(), "isAlignmentXSet", false);
        setFloatField(term1574684, term1574684.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1574684, term1574684.getClass(), "isAlignmentYSet", false);
        setFloatField(term1574684, term1574684.getClass(), "alignmentY", 0.0F);
        setField(term1574684, term1574684.getClass(), "ui", null);
        setField(term1574684, term1574684.getClass(), "listenerList", null);
        setField(term1574684, term1574684.getClass(), "clientProperties", null);
        setField(term1574684, term1574684.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1574684, term1574684.getClass(), "autoscrolls", false);
        setField(term1574684, term1574684.getClass(), "border", null);
        setIntField(term1574684, term1574684.getClass(), "flags", 0);
        setField(term1574684, term1574684.getClass(), "inputVerifier", null);
        setBooleanField(term1574684, term1574684.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1574684, term1574684.getClass(), "paintingChild", null);
        setField(term1574684, term1574684.getClass(), "popupMenu", null);
        setField(term1574684, term1574684.getClass(), "revalidateRunnableScheduled", null);
        setField(term1574684, term1574684.getClass(), "focusInputMap", null);
        setField(term1574684, term1574684.getClass(), "ancestorInputMap", null);
        setField(term1574684, term1574684.getClass(), "windowInputMap", null);
        setField(term1574684, term1574684.getClass(), "actionMap", null);
        setField(term1574684, term1574684.getClass(), "aaHint", null);
        setField(term1574684, term1574684.getClass(), "lcdRenderingHint", null);
        setField(term1574684, term1574684.getClass(), "component", null);
        setField(term1574684, term1574684.getClass(), "layoutMgr", null);
        setField(term1574684, term1574684.getClass(), "dispatcher", null);
        setField(term1574684, term1574684.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1574684, term1574684.getClass(), "focusCycleRoot", false);
        setBooleanField(term1574684, term1574684.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1574684, term1574684.getClass(), "printingThreads", null);
        setBooleanField(term1574684, term1574684.getClass(), "printing", false);
        setField(term1574684, term1574684.getClass(), "containerListener", null);
        setIntField(term1574684, term1574684.getClass(), "listeningChildren", 0);
        setIntField(term1574684, term1574684.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1574684, term1574684.getClass(), "descendantsCount", 0);
        setField(term1574684, term1574684.getClass(), "preserveBackgroundColor", null);
        setIntField(term1574684, term1574684.getClass(), "numOfHWComponents", 0);
        setIntField(term1574684, term1574684.getClass(), "numOfLWComponents", 0);
        setField(term1574684, term1574684.getClass(), "modalComp", null);
        setField(term1574684, term1574684.getClass(), "modalAppContext", null);
        setIntField(term1574684, term1574684.getClass(), "containerSerializedDataVersion", 0);
        setField(term1574684, term1574684.getClass(), "peer", null);
        setField(term1574684, term1574684.getClass(), "parent", null);
        setField(term1574684, term1574684.getClass(), "appContext", null);
        setIntField(term1574684, term1574684.getClass(), "x", 0);
        setIntField(term1574684, term1574684.getClass(), "y", 0);
        setIntField(term1574684, term1574684.getClass(), "width", 0);
        setIntField(term1574684, term1574684.getClass(), "height", 0);
        setField(term1574684, term1574684.getClass(), "foreground", null);
        setField(term1574684, term1574684.getClass(), "background", null);
        setField(term1574684, term1574684.getClass(), "font", null);
        setField(term1574684, term1574684.getClass(), "peerFont", null);
        setField(term1574684, term1574684.getClass(), "cursor", null);
        setField(term1574684, term1574684.getClass(), "locale", null);
        setField(term1574684, term1574684.getClass(), "graphicsConfig", null);
        setField(term1574684, term1574684.getClass(), "bufferStrategy", null);
        setBooleanField(term1574684, term1574684.getClass(), "ignoreRepaint", false);
        setBooleanField(term1574684, term1574684.getClass(), "visible", false);
        setBooleanField(term1574684, term1574684.getClass(), "enabled", false);
        setBooleanField(term1574684, term1574684.getClass(), "valid", false);
        setField(term1574684, term1574684.getClass(), "dropTarget", null);
        setField(term1574684, term1574684.getClass(), "popups", null);
        setField(term1574684, term1574684.getClass(), "name", null);
        setBooleanField(term1574684, term1574684.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1574684, term1574684.getClass(), "focusable", false);
        setIntField(term1574684, term1574684.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1574684, term1574684.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1574684, term1574684.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1574684, term1574684.getClass(), "acc", null);
        setField(term1574684, term1574684.getClass(), "minSize", null);
        setBooleanField(term1574684, term1574684.getClass(), "minSizeSet", false);
        setField(term1574684, term1574684.getClass(), "prefSize", null);
        setBooleanField(term1574684, term1574684.getClass(), "prefSizeSet", false);
        setField(term1574684, term1574684.getClass(), "maxSize", null);
        setBooleanField(term1574684, term1574684.getClass(), "maxSizeSet", false);
        setField(term1574684, term1574684.getClass(), "componentOrientation", null);
        setBooleanField(term1574684, term1574684.getClass(), "newEventsOnly", false);
        setField(term1574684, term1574684.getClass(), "componentListener", null);
        setField(term1574684, term1574684.getClass(), "focusListener", null);
        setField(term1574684, term1574684.getClass(), "hierarchyListener", null);
        setField(term1574684, term1574684.getClass(), "hierarchyBoundsListener", null);
        setField(term1574684, term1574684.getClass(), "keyListener", null);
        setField(term1574684, term1574684.getClass(), "mouseListener", null);
        setField(term1574684, term1574684.getClass(), "mouseMotionListener", null);
        setField(term1574684, term1574684.getClass(), "mouseWheelListener", null);
        setField(term1574684, term1574684.getClass(), "inputMethodListener", null);
        setLongField(term1574684, term1574684.getClass(), "eventMask", 0L);
        setField(term1574684, term1574684.getClass(), "changeSupport", null);
        setField(term1574684, term1574684.getClass(), "objectLock", null);
        setBooleanField(term1574684, term1574684.getClass(), "isPacked", false);
        setIntField(term1574684, term1574684.getClass(), "boundsOp", 0);
        setField(term1574684, term1574684.getClass(), "compoundShape", null);
        setField(term1574684, term1574684.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1574684, term1574684.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1574684, term1574684.getClass(), "backgroundEraseDisabled", false);
        setField(term1574684, term1574684.getClass(), "eventCache", null);
        setBooleanField(term1574684, term1574684.getClass(), "coalescingEnabled", false);
        setBooleanField(term1574684, term1574684.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1574684, term1574684.getClass(), "componentSerializedDataVersion", 0);
        setField(term1574684, term1574684.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createSpaceRaceMainTab", argTypes, term1574684, args);
    }

};


