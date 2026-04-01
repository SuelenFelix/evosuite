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

public class VoteView_updatePanels_142372352010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157769;

    public VoteView_updatePanels_142372352010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157769 = newInstance(Class.forName("org.openRealmOfStars.game.state.VoteView"));
        setField(term157769, term157769.getClass(), "voteLabel", null);
        setIntField(term157769, term157769.getClass(), "voteIndex", 0);
        setField(term157769, term157769.getClass(), "map", null);
        setField(term157769, term157769.getClass(), "voteTitle", null);
        setField(term157769, term157769.getClass(), "votingTime", null);
        setField(term157769, term157769.getClass(), "voteYesBtn", null);
        setField(term157769, term157769.getClass(), "voteNoBtn", null);
        setField(term157769, term157769.getClass(), "voteAbstain", null);
        setField(term157769, term157769.getClass(), "votedText", null);
        setField(term157769, term157769.getClass(), "votingInfoText", null);
        setField(term157769, term157769.getClass(), "votingInfoTitle", null);
        setBooleanField(term157769, term157769.getClass(), "isAlignmentXSet", false);
        setFloatField(term157769, term157769.getClass(), "alignmentX", 0.0F);
        setBooleanField(term157769, term157769.getClass(), "isAlignmentYSet", false);
        setFloatField(term157769, term157769.getClass(), "alignmentY", 0.0F);
        setField(term157769, term157769.getClass(), "ui", null);
        setField(term157769, term157769.getClass(), "listenerList", null);
        setField(term157769, term157769.getClass(), "clientProperties", null);
        setField(term157769, term157769.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term157769, term157769.getClass(), "autoscrolls", false);
        setField(term157769, term157769.getClass(), "border", null);
        setIntField(term157769, term157769.getClass(), "flags", 0);
        setField(term157769, term157769.getClass(), "inputVerifier", null);
        setBooleanField(term157769, term157769.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term157769, term157769.getClass(), "paintingChild", null);
        setField(term157769, term157769.getClass(), "popupMenu", null);
        setField(term157769, term157769.getClass(), "revalidateRunnableScheduled", null);
        setField(term157769, term157769.getClass(), "focusInputMap", null);
        setField(term157769, term157769.getClass(), "ancestorInputMap", null);
        setField(term157769, term157769.getClass(), "windowInputMap", null);
        setField(term157769, term157769.getClass(), "actionMap", null);
        setField(term157769, term157769.getClass(), "aaHint", null);
        setField(term157769, term157769.getClass(), "lcdRenderingHint", null);
        setField(term157769, term157769.getClass(), "component", null);
        setField(term157769, term157769.getClass(), "layoutMgr", null);
        setField(term157769, term157769.getClass(), "dispatcher", null);
        setField(term157769, term157769.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term157769, term157769.getClass(), "focusCycleRoot", false);
        setBooleanField(term157769, term157769.getClass(), "focusTraversalPolicyProvider", false);
        setField(term157769, term157769.getClass(), "printingThreads", null);
        setBooleanField(term157769, term157769.getClass(), "printing", false);
        setField(term157769, term157769.getClass(), "containerListener", null);
        setIntField(term157769, term157769.getClass(), "listeningChildren", 0);
        setIntField(term157769, term157769.getClass(), "listeningBoundsChildren", 0);
        setIntField(term157769, term157769.getClass(), "descendantsCount", 0);
        setField(term157769, term157769.getClass(), "preserveBackgroundColor", null);
        setIntField(term157769, term157769.getClass(), "numOfHWComponents", 0);
        setIntField(term157769, term157769.getClass(), "numOfLWComponents", 0);
        setField(term157769, term157769.getClass(), "modalComp", null);
        setField(term157769, term157769.getClass(), "modalAppContext", null);
        setIntField(term157769, term157769.getClass(), "containerSerializedDataVersion", 0);
        setField(term157769, term157769.getClass(), "peer", null);
        setField(term157769, term157769.getClass(), "parent", null);
        setField(term157769, term157769.getClass(), "appContext", null);
        setIntField(term157769, term157769.getClass(), "x", 0);
        setIntField(term157769, term157769.getClass(), "y", 0);
        setIntField(term157769, term157769.getClass(), "width", 0);
        setIntField(term157769, term157769.getClass(), "height", 0);
        setField(term157769, term157769.getClass(), "foreground", null);
        setField(term157769, term157769.getClass(), "background", null);
        setField(term157769, term157769.getClass(), "font", null);
        setField(term157769, term157769.getClass(), "peerFont", null);
        setField(term157769, term157769.getClass(), "cursor", null);
        setField(term157769, term157769.getClass(), "locale", null);
        setField(term157769, term157769.getClass(), "graphicsConfig", null);
        setField(term157769, term157769.getClass(), "bufferStrategy", null);
        setBooleanField(term157769, term157769.getClass(), "ignoreRepaint", false);
        setBooleanField(term157769, term157769.getClass(), "visible", false);
        setBooleanField(term157769, term157769.getClass(), "enabled", false);
        setBooleanField(term157769, term157769.getClass(), "valid", false);
        setField(term157769, term157769.getClass(), "dropTarget", null);
        setField(term157769, term157769.getClass(), "popups", null);
        setField(term157769, term157769.getClass(), "name", null);
        setBooleanField(term157769, term157769.getClass(), "nameExplicitlySet", false);
        setBooleanField(term157769, term157769.getClass(), "focusable", false);
        setIntField(term157769, term157769.getClass(), "isFocusTraversableOverridden", 0);
        setField(term157769, term157769.getClass(), "focusTraversalKeys", null);
        setBooleanField(term157769, term157769.getClass(), "focusTraversalKeysEnabled", false);
        setField(term157769, term157769.getClass(), "acc", null);
        setField(term157769, term157769.getClass(), "minSize", null);
        setBooleanField(term157769, term157769.getClass(), "minSizeSet", false);
        setField(term157769, term157769.getClass(), "prefSize", null);
        setBooleanField(term157769, term157769.getClass(), "prefSizeSet", false);
        setField(term157769, term157769.getClass(), "maxSize", null);
        setBooleanField(term157769, term157769.getClass(), "maxSizeSet", false);
        setField(term157769, term157769.getClass(), "componentOrientation", null);
        setBooleanField(term157769, term157769.getClass(), "newEventsOnly", false);
        setField(term157769, term157769.getClass(), "componentListener", null);
        setField(term157769, term157769.getClass(), "focusListener", null);
        setField(term157769, term157769.getClass(), "hierarchyListener", null);
        setField(term157769, term157769.getClass(), "hierarchyBoundsListener", null);
        setField(term157769, term157769.getClass(), "keyListener", null);
        setField(term157769, term157769.getClass(), "mouseListener", null);
        setField(term157769, term157769.getClass(), "mouseMotionListener", null);
        setField(term157769, term157769.getClass(), "mouseWheelListener", null);
        setField(term157769, term157769.getClass(), "inputMethodListener", null);
        setLongField(term157769, term157769.getClass(), "eventMask", 0L);
        setField(term157769, term157769.getClass(), "changeSupport", null);
        setField(term157769, term157769.getClass(), "objectLock", null);
        setBooleanField(term157769, term157769.getClass(), "isPacked", false);
        setIntField(term157769, term157769.getClass(), "boundsOp", 0);
        setField(term157769, term157769.getClass(), "compoundShape", null);
        setField(term157769, term157769.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term157769, term157769.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term157769, term157769.getClass(), "backgroundEraseDisabled", false);
        setField(term157769, term157769.getClass(), "eventCache", null);
        setBooleanField(term157769, term157769.getClass(), "coalescingEnabled", false);
        setBooleanField(term157769, term157769.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term157769, term157769.getClass(), "componentSerializedDataVersion", 0);
        setField(term157769, term157769.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VoteView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanels", argTypes, term157769, args);
    }

};


