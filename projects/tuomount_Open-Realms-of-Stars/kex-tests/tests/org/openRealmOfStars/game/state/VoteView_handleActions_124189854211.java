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

public class VoteView_handleActions_124189854211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157811;

    public VoteView_handleActions_124189854211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157811 = newInstance(Class.forName("org.openRealmOfStars.game.state.VoteView"));
        setField(term157811, term157811.getClass(), "voteLabel", null);
        setIntField(term157811, term157811.getClass(), "voteIndex", 0);
        setField(term157811, term157811.getClass(), "map", null);
        setField(term157811, term157811.getClass(), "voteTitle", null);
        setField(term157811, term157811.getClass(), "votingTime", null);
        setField(term157811, term157811.getClass(), "voteYesBtn", null);
        setField(term157811, term157811.getClass(), "voteNoBtn", null);
        setField(term157811, term157811.getClass(), "voteAbstain", null);
        setField(term157811, term157811.getClass(), "votedText", null);
        setField(term157811, term157811.getClass(), "votingInfoText", null);
        setField(term157811, term157811.getClass(), "votingInfoTitle", null);
        setBooleanField(term157811, term157811.getClass(), "isAlignmentXSet", false);
        setFloatField(term157811, term157811.getClass(), "alignmentX", 0.0F);
        setBooleanField(term157811, term157811.getClass(), "isAlignmentYSet", false);
        setFloatField(term157811, term157811.getClass(), "alignmentY", 0.0F);
        setField(term157811, term157811.getClass(), "ui", null);
        setField(term157811, term157811.getClass(), "listenerList", null);
        setField(term157811, term157811.getClass(), "clientProperties", null);
        setField(term157811, term157811.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term157811, term157811.getClass(), "autoscrolls", false);
        setField(term157811, term157811.getClass(), "border", null);
        setIntField(term157811, term157811.getClass(), "flags", 0);
        setField(term157811, term157811.getClass(), "inputVerifier", null);
        setBooleanField(term157811, term157811.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term157811, term157811.getClass(), "paintingChild", null);
        setField(term157811, term157811.getClass(), "popupMenu", null);
        setField(term157811, term157811.getClass(), "revalidateRunnableScheduled", null);
        setField(term157811, term157811.getClass(), "focusInputMap", null);
        setField(term157811, term157811.getClass(), "ancestorInputMap", null);
        setField(term157811, term157811.getClass(), "windowInputMap", null);
        setField(term157811, term157811.getClass(), "actionMap", null);
        setField(term157811, term157811.getClass(), "aaHint", null);
        setField(term157811, term157811.getClass(), "lcdRenderingHint", null);
        setField(term157811, term157811.getClass(), "component", null);
        setField(term157811, term157811.getClass(), "layoutMgr", null);
        setField(term157811, term157811.getClass(), "dispatcher", null);
        setField(term157811, term157811.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term157811, term157811.getClass(), "focusCycleRoot", false);
        setBooleanField(term157811, term157811.getClass(), "focusTraversalPolicyProvider", false);
        setField(term157811, term157811.getClass(), "printingThreads", null);
        setBooleanField(term157811, term157811.getClass(), "printing", false);
        setField(term157811, term157811.getClass(), "containerListener", null);
        setIntField(term157811, term157811.getClass(), "listeningChildren", 0);
        setIntField(term157811, term157811.getClass(), "listeningBoundsChildren", 0);
        setIntField(term157811, term157811.getClass(), "descendantsCount", 0);
        setField(term157811, term157811.getClass(), "preserveBackgroundColor", null);
        setIntField(term157811, term157811.getClass(), "numOfHWComponents", 0);
        setIntField(term157811, term157811.getClass(), "numOfLWComponents", 0);
        setField(term157811, term157811.getClass(), "modalComp", null);
        setField(term157811, term157811.getClass(), "modalAppContext", null);
        setIntField(term157811, term157811.getClass(), "containerSerializedDataVersion", 0);
        setField(term157811, term157811.getClass(), "peer", null);
        setField(term157811, term157811.getClass(), "parent", null);
        setField(term157811, term157811.getClass(), "appContext", null);
        setIntField(term157811, term157811.getClass(), "x", 0);
        setIntField(term157811, term157811.getClass(), "y", 0);
        setIntField(term157811, term157811.getClass(), "width", 0);
        setIntField(term157811, term157811.getClass(), "height", 0);
        setField(term157811, term157811.getClass(), "foreground", null);
        setField(term157811, term157811.getClass(), "background", null);
        setField(term157811, term157811.getClass(), "font", null);
        setField(term157811, term157811.getClass(), "peerFont", null);
        setField(term157811, term157811.getClass(), "cursor", null);
        setField(term157811, term157811.getClass(), "locale", null);
        setField(term157811, term157811.getClass(), "graphicsConfig", null);
        setField(term157811, term157811.getClass(), "bufferStrategy", null);
        setBooleanField(term157811, term157811.getClass(), "ignoreRepaint", false);
        setBooleanField(term157811, term157811.getClass(), "visible", false);
        setBooleanField(term157811, term157811.getClass(), "enabled", false);
        setBooleanField(term157811, term157811.getClass(), "valid", false);
        setField(term157811, term157811.getClass(), "dropTarget", null);
        setField(term157811, term157811.getClass(), "popups", null);
        setField(term157811, term157811.getClass(), "name", null);
        setBooleanField(term157811, term157811.getClass(), "nameExplicitlySet", false);
        setBooleanField(term157811, term157811.getClass(), "focusable", false);
        setIntField(term157811, term157811.getClass(), "isFocusTraversableOverridden", 0);
        setField(term157811, term157811.getClass(), "focusTraversalKeys", null);
        setBooleanField(term157811, term157811.getClass(), "focusTraversalKeysEnabled", false);
        setField(term157811, term157811.getClass(), "acc", null);
        setField(term157811, term157811.getClass(), "minSize", null);
        setBooleanField(term157811, term157811.getClass(), "minSizeSet", false);
        setField(term157811, term157811.getClass(), "prefSize", null);
        setBooleanField(term157811, term157811.getClass(), "prefSizeSet", false);
        setField(term157811, term157811.getClass(), "maxSize", null);
        setBooleanField(term157811, term157811.getClass(), "maxSizeSet", false);
        setField(term157811, term157811.getClass(), "componentOrientation", null);
        setBooleanField(term157811, term157811.getClass(), "newEventsOnly", false);
        setField(term157811, term157811.getClass(), "componentListener", null);
        setField(term157811, term157811.getClass(), "focusListener", null);
        setField(term157811, term157811.getClass(), "hierarchyListener", null);
        setField(term157811, term157811.getClass(), "hierarchyBoundsListener", null);
        setField(term157811, term157811.getClass(), "keyListener", null);
        setField(term157811, term157811.getClass(), "mouseListener", null);
        setField(term157811, term157811.getClass(), "mouseMotionListener", null);
        setField(term157811, term157811.getClass(), "mouseWheelListener", null);
        setField(term157811, term157811.getClass(), "inputMethodListener", null);
        setLongField(term157811, term157811.getClass(), "eventMask", 0L);
        setField(term157811, term157811.getClass(), "changeSupport", null);
        setField(term157811, term157811.getClass(), "objectLock", null);
        setBooleanField(term157811, term157811.getClass(), "isPacked", false);
        setIntField(term157811, term157811.getClass(), "boundsOp", 0);
        setField(term157811, term157811.getClass(), "compoundShape", null);
        setField(term157811, term157811.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term157811, term157811.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term157811, term157811.getClass(), "backgroundEraseDisabled", false);
        setField(term157811, term157811.getClass(), "eventCache", null);
        setBooleanField(term157811, term157811.getClass(), "coalescingEnabled", false);
        setBooleanField(term157811, term157811.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term157811, term157811.getClass(), "componentSerializedDataVersion", 0);
        setField(term157811, term157811.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VoteView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term157811, args);
    }

};


