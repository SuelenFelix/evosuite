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

public class HelpView_handleActions_196191840910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617544;

    public HelpView_handleActions_196191840910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617544 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView"));
        setField(term617544, term617544.getClass(), "infoText", null);
        setField(term617544, term617544.getClass(), "tutorialTree", null);
        setField(term617544, term617544.getClass(), "checkBox", null);
        setField(term617544, term617544.getClass(), "searchText", null);
        setField(term617544, term617544.getClass(), "matchesText", null);
        setField(term617544, term617544.getClass(), "root", null);
        setIntField(term617544, term617544.getClass(), "numberOfMatches", 0);
        setField(term617544, term617544.getClass(), "lastSearchText", null);
        setIntField(term617544, term617544.getClass(), "currentMatch", 0);
        setBooleanField(term617544, term617544.getClass(), "isAlignmentXSet", false);
        setFloatField(term617544, term617544.getClass(), "alignmentX", 0.0F);
        setBooleanField(term617544, term617544.getClass(), "isAlignmentYSet", false);
        setFloatField(term617544, term617544.getClass(), "alignmentY", 0.0F);
        setField(term617544, term617544.getClass(), "ui", null);
        setField(term617544, term617544.getClass(), "listenerList", null);
        setField(term617544, term617544.getClass(), "clientProperties", null);
        setField(term617544, term617544.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term617544, term617544.getClass(), "autoscrolls", false);
        setField(term617544, term617544.getClass(), "border", null);
        setIntField(term617544, term617544.getClass(), "flags", 0);
        setField(term617544, term617544.getClass(), "inputVerifier", null);
        setBooleanField(term617544, term617544.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term617544, term617544.getClass(), "paintingChild", null);
        setField(term617544, term617544.getClass(), "popupMenu", null);
        setField(term617544, term617544.getClass(), "revalidateRunnableScheduled", null);
        setField(term617544, term617544.getClass(), "focusInputMap", null);
        setField(term617544, term617544.getClass(), "ancestorInputMap", null);
        setField(term617544, term617544.getClass(), "windowInputMap", null);
        setField(term617544, term617544.getClass(), "actionMap", null);
        setField(term617544, term617544.getClass(), "aaHint", null);
        setField(term617544, term617544.getClass(), "lcdRenderingHint", null);
        setField(term617544, term617544.getClass(), "component", null);
        setField(term617544, term617544.getClass(), "layoutMgr", null);
        setField(term617544, term617544.getClass(), "dispatcher", null);
        setField(term617544, term617544.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term617544, term617544.getClass(), "focusCycleRoot", false);
        setBooleanField(term617544, term617544.getClass(), "focusTraversalPolicyProvider", false);
        setField(term617544, term617544.getClass(), "printingThreads", null);
        setBooleanField(term617544, term617544.getClass(), "printing", false);
        setField(term617544, term617544.getClass(), "containerListener", null);
        setIntField(term617544, term617544.getClass(), "listeningChildren", 0);
        setIntField(term617544, term617544.getClass(), "listeningBoundsChildren", 0);
        setIntField(term617544, term617544.getClass(), "descendantsCount", 0);
        setField(term617544, term617544.getClass(), "preserveBackgroundColor", null);
        setIntField(term617544, term617544.getClass(), "numOfHWComponents", 0);
        setIntField(term617544, term617544.getClass(), "numOfLWComponents", 0);
        setField(term617544, term617544.getClass(), "modalComp", null);
        setField(term617544, term617544.getClass(), "modalAppContext", null);
        setIntField(term617544, term617544.getClass(), "containerSerializedDataVersion", 0);
        setField(term617544, term617544.getClass(), "peer", null);
        setField(term617544, term617544.getClass(), "parent", null);
        setField(term617544, term617544.getClass(), "appContext", null);
        setIntField(term617544, term617544.getClass(), "x", 0);
        setIntField(term617544, term617544.getClass(), "y", 0);
        setIntField(term617544, term617544.getClass(), "width", 0);
        setIntField(term617544, term617544.getClass(), "height", 0);
        setField(term617544, term617544.getClass(), "foreground", null);
        setField(term617544, term617544.getClass(), "background", null);
        setField(term617544, term617544.getClass(), "font", null);
        setField(term617544, term617544.getClass(), "peerFont", null);
        setField(term617544, term617544.getClass(), "cursor", null);
        setField(term617544, term617544.getClass(), "locale", null);
        setField(term617544, term617544.getClass(), "graphicsConfig", null);
        setField(term617544, term617544.getClass(), "bufferStrategy", null);
        setBooleanField(term617544, term617544.getClass(), "ignoreRepaint", false);
        setBooleanField(term617544, term617544.getClass(), "visible", false);
        setBooleanField(term617544, term617544.getClass(), "enabled", false);
        setBooleanField(term617544, term617544.getClass(), "valid", false);
        setField(term617544, term617544.getClass(), "dropTarget", null);
        setField(term617544, term617544.getClass(), "popups", null);
        setField(term617544, term617544.getClass(), "name", null);
        setBooleanField(term617544, term617544.getClass(), "nameExplicitlySet", false);
        setBooleanField(term617544, term617544.getClass(), "focusable", false);
        setIntField(term617544, term617544.getClass(), "isFocusTraversableOverridden", 0);
        setField(term617544, term617544.getClass(), "focusTraversalKeys", null);
        setBooleanField(term617544, term617544.getClass(), "focusTraversalKeysEnabled", false);
        setField(term617544, term617544.getClass(), "acc", null);
        setField(term617544, term617544.getClass(), "minSize", null);
        setBooleanField(term617544, term617544.getClass(), "minSizeSet", false);
        setField(term617544, term617544.getClass(), "prefSize", null);
        setBooleanField(term617544, term617544.getClass(), "prefSizeSet", false);
        setField(term617544, term617544.getClass(), "maxSize", null);
        setBooleanField(term617544, term617544.getClass(), "maxSizeSet", false);
        setField(term617544, term617544.getClass(), "componentOrientation", null);
        setBooleanField(term617544, term617544.getClass(), "newEventsOnly", false);
        setField(term617544, term617544.getClass(), "componentListener", null);
        setField(term617544, term617544.getClass(), "focusListener", null);
        setField(term617544, term617544.getClass(), "hierarchyListener", null);
        setField(term617544, term617544.getClass(), "hierarchyBoundsListener", null);
        setField(term617544, term617544.getClass(), "keyListener", null);
        setField(term617544, term617544.getClass(), "mouseListener", null);
        setField(term617544, term617544.getClass(), "mouseMotionListener", null);
        setField(term617544, term617544.getClass(), "mouseWheelListener", null);
        setField(term617544, term617544.getClass(), "inputMethodListener", null);
        setLongField(term617544, term617544.getClass(), "eventMask", 0L);
        setField(term617544, term617544.getClass(), "changeSupport", null);
        setField(term617544, term617544.getClass(), "objectLock", null);
        setBooleanField(term617544, term617544.getClass(), "isPacked", false);
        setIntField(term617544, term617544.getClass(), "boundsOp", 0);
        setField(term617544, term617544.getClass(), "compoundShape", null);
        setField(term617544, term617544.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term617544, term617544.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term617544, term617544.getClass(), "backgroundEraseDisabled", false);
        setField(term617544, term617544.getClass(), "eventCache", null);
        setBooleanField(term617544, term617544.getClass(), "coalescingEnabled", false);
        setBooleanField(term617544, term617544.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term617544, term617544.getClass(), "componentSerializedDataVersion", 0);
        setField(term617544, term617544.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term617544, args);
    }

};


