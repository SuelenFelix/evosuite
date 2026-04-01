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

public class VoteView_createCenterPanel_21107288547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157643;

    public VoteView_createCenterPanel_21107288547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157643 = newInstance(Class.forName("org.openRealmOfStars.game.state.VoteView"));
        setField(term157643, term157643.getClass(), "voteLabel", null);
        setIntField(term157643, term157643.getClass(), "voteIndex", 0);
        setField(term157643, term157643.getClass(), "map", null);
        setField(term157643, term157643.getClass(), "voteTitle", null);
        setField(term157643, term157643.getClass(), "votingTime", null);
        setField(term157643, term157643.getClass(), "voteYesBtn", null);
        setField(term157643, term157643.getClass(), "voteNoBtn", null);
        setField(term157643, term157643.getClass(), "voteAbstain", null);
        setField(term157643, term157643.getClass(), "votedText", null);
        setField(term157643, term157643.getClass(), "votingInfoText", null);
        setField(term157643, term157643.getClass(), "votingInfoTitle", null);
        setBooleanField(term157643, term157643.getClass(), "isAlignmentXSet", false);
        setFloatField(term157643, term157643.getClass(), "alignmentX", 0.0F);
        setBooleanField(term157643, term157643.getClass(), "isAlignmentYSet", false);
        setFloatField(term157643, term157643.getClass(), "alignmentY", 0.0F);
        setField(term157643, term157643.getClass(), "ui", null);
        setField(term157643, term157643.getClass(), "listenerList", null);
        setField(term157643, term157643.getClass(), "clientProperties", null);
        setField(term157643, term157643.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term157643, term157643.getClass(), "autoscrolls", false);
        setField(term157643, term157643.getClass(), "border", null);
        setIntField(term157643, term157643.getClass(), "flags", 0);
        setField(term157643, term157643.getClass(), "inputVerifier", null);
        setBooleanField(term157643, term157643.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term157643, term157643.getClass(), "paintingChild", null);
        setField(term157643, term157643.getClass(), "popupMenu", null);
        setField(term157643, term157643.getClass(), "revalidateRunnableScheduled", null);
        setField(term157643, term157643.getClass(), "focusInputMap", null);
        setField(term157643, term157643.getClass(), "ancestorInputMap", null);
        setField(term157643, term157643.getClass(), "windowInputMap", null);
        setField(term157643, term157643.getClass(), "actionMap", null);
        setField(term157643, term157643.getClass(), "aaHint", null);
        setField(term157643, term157643.getClass(), "lcdRenderingHint", null);
        setField(term157643, term157643.getClass(), "component", null);
        setField(term157643, term157643.getClass(), "layoutMgr", null);
        setField(term157643, term157643.getClass(), "dispatcher", null);
        setField(term157643, term157643.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term157643, term157643.getClass(), "focusCycleRoot", false);
        setBooleanField(term157643, term157643.getClass(), "focusTraversalPolicyProvider", false);
        setField(term157643, term157643.getClass(), "printingThreads", null);
        setBooleanField(term157643, term157643.getClass(), "printing", false);
        setField(term157643, term157643.getClass(), "containerListener", null);
        setIntField(term157643, term157643.getClass(), "listeningChildren", 0);
        setIntField(term157643, term157643.getClass(), "listeningBoundsChildren", 0);
        setIntField(term157643, term157643.getClass(), "descendantsCount", 0);
        setField(term157643, term157643.getClass(), "preserveBackgroundColor", null);
        setIntField(term157643, term157643.getClass(), "numOfHWComponents", 0);
        setIntField(term157643, term157643.getClass(), "numOfLWComponents", 0);
        setField(term157643, term157643.getClass(), "modalComp", null);
        setField(term157643, term157643.getClass(), "modalAppContext", null);
        setIntField(term157643, term157643.getClass(), "containerSerializedDataVersion", 0);
        setField(term157643, term157643.getClass(), "peer", null);
        setField(term157643, term157643.getClass(), "parent", null);
        setField(term157643, term157643.getClass(), "appContext", null);
        setIntField(term157643, term157643.getClass(), "x", 0);
        setIntField(term157643, term157643.getClass(), "y", 0);
        setIntField(term157643, term157643.getClass(), "width", 0);
        setIntField(term157643, term157643.getClass(), "height", 0);
        setField(term157643, term157643.getClass(), "foreground", null);
        setField(term157643, term157643.getClass(), "background", null);
        setField(term157643, term157643.getClass(), "font", null);
        setField(term157643, term157643.getClass(), "peerFont", null);
        setField(term157643, term157643.getClass(), "cursor", null);
        setField(term157643, term157643.getClass(), "locale", null);
        setField(term157643, term157643.getClass(), "graphicsConfig", null);
        setField(term157643, term157643.getClass(), "bufferStrategy", null);
        setBooleanField(term157643, term157643.getClass(), "ignoreRepaint", false);
        setBooleanField(term157643, term157643.getClass(), "visible", false);
        setBooleanField(term157643, term157643.getClass(), "enabled", false);
        setBooleanField(term157643, term157643.getClass(), "valid", false);
        setField(term157643, term157643.getClass(), "dropTarget", null);
        setField(term157643, term157643.getClass(), "popups", null);
        setField(term157643, term157643.getClass(), "name", null);
        setBooleanField(term157643, term157643.getClass(), "nameExplicitlySet", false);
        setBooleanField(term157643, term157643.getClass(), "focusable", false);
        setIntField(term157643, term157643.getClass(), "isFocusTraversableOverridden", 0);
        setField(term157643, term157643.getClass(), "focusTraversalKeys", null);
        setBooleanField(term157643, term157643.getClass(), "focusTraversalKeysEnabled", false);
        setField(term157643, term157643.getClass(), "acc", null);
        setField(term157643, term157643.getClass(), "minSize", null);
        setBooleanField(term157643, term157643.getClass(), "minSizeSet", false);
        setField(term157643, term157643.getClass(), "prefSize", null);
        setBooleanField(term157643, term157643.getClass(), "prefSizeSet", false);
        setField(term157643, term157643.getClass(), "maxSize", null);
        setBooleanField(term157643, term157643.getClass(), "maxSizeSet", false);
        setField(term157643, term157643.getClass(), "componentOrientation", null);
        setBooleanField(term157643, term157643.getClass(), "newEventsOnly", false);
        setField(term157643, term157643.getClass(), "componentListener", null);
        setField(term157643, term157643.getClass(), "focusListener", null);
        setField(term157643, term157643.getClass(), "hierarchyListener", null);
        setField(term157643, term157643.getClass(), "hierarchyBoundsListener", null);
        setField(term157643, term157643.getClass(), "keyListener", null);
        setField(term157643, term157643.getClass(), "mouseListener", null);
        setField(term157643, term157643.getClass(), "mouseMotionListener", null);
        setField(term157643, term157643.getClass(), "mouseWheelListener", null);
        setField(term157643, term157643.getClass(), "inputMethodListener", null);
        setLongField(term157643, term157643.getClass(), "eventMask", 0L);
        setField(term157643, term157643.getClass(), "changeSupport", null);
        setField(term157643, term157643.getClass(), "objectLock", null);
        setBooleanField(term157643, term157643.getClass(), "isPacked", false);
        setIntField(term157643, term157643.getClass(), "boundsOp", 0);
        setField(term157643, term157643.getClass(), "compoundShape", null);
        setField(term157643, term157643.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term157643, term157643.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term157643, term157643.getClass(), "backgroundEraseDisabled", false);
        setField(term157643, term157643.getClass(), "eventCache", null);
        setBooleanField(term157643, term157643.getClass(), "coalescingEnabled", false);
        setBooleanField(term157643, term157643.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term157643, term157643.getClass(), "componentSerializedDataVersion", 0);
        setField(term157643, term157643.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VoteView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createCenterPanel", argTypes, term157643, args);
    }

};


