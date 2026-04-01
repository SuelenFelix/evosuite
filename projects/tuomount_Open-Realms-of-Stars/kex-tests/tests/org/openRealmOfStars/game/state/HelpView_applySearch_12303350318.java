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
import java.lang.Boolean;

public class HelpView_applySearch_12303350318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615851;
     Object term615894;

    public HelpView_applySearch_12303350318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615851 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView"));
        setField(term615851, term615851.getClass(), "infoText", null);
        setField(term615851, term615851.getClass(), "tutorialTree", null);
        setField(term615851, term615851.getClass(), "checkBox", null);
        setField(term615851, term615851.getClass(), "searchText", null);
        setField(term615851, term615851.getClass(), "matchesText", null);
        setField(term615851, term615851.getClass(), "root", null);
        setIntField(term615851, term615851.getClass(), "numberOfMatches", 0);
        setField(term615851, term615851.getClass(), "lastSearchText", null);
        setIntField(term615851, term615851.getClass(), "currentMatch", 0);
        setBooleanField(term615851, term615851.getClass(), "isAlignmentXSet", false);
        setFloatField(term615851, term615851.getClass(), "alignmentX", 0.0F);
        setBooleanField(term615851, term615851.getClass(), "isAlignmentYSet", false);
        setFloatField(term615851, term615851.getClass(), "alignmentY", 0.0F);
        setField(term615851, term615851.getClass(), "ui", null);
        setField(term615851, term615851.getClass(), "listenerList", null);
        setField(term615851, term615851.getClass(), "clientProperties", null);
        setField(term615851, term615851.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term615851, term615851.getClass(), "autoscrolls", false);
        setField(term615851, term615851.getClass(), "border", null);
        setIntField(term615851, term615851.getClass(), "flags", 0);
        setField(term615851, term615851.getClass(), "inputVerifier", null);
        setBooleanField(term615851, term615851.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term615851, term615851.getClass(), "paintingChild", null);
        setField(term615851, term615851.getClass(), "popupMenu", null);
        setField(term615851, term615851.getClass(), "revalidateRunnableScheduled", null);
        setField(term615851, term615851.getClass(), "focusInputMap", null);
        setField(term615851, term615851.getClass(), "ancestorInputMap", null);
        setField(term615851, term615851.getClass(), "windowInputMap", null);
        setField(term615851, term615851.getClass(), "actionMap", null);
        setField(term615851, term615851.getClass(), "aaHint", null);
        setField(term615851, term615851.getClass(), "lcdRenderingHint", null);
        setField(term615851, term615851.getClass(), "component", null);
        setField(term615851, term615851.getClass(), "layoutMgr", null);
        setField(term615851, term615851.getClass(), "dispatcher", null);
        setField(term615851, term615851.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term615851, term615851.getClass(), "focusCycleRoot", false);
        setBooleanField(term615851, term615851.getClass(), "focusTraversalPolicyProvider", false);
        setField(term615851, term615851.getClass(), "printingThreads", null);
        setBooleanField(term615851, term615851.getClass(), "printing", false);
        setField(term615851, term615851.getClass(), "containerListener", null);
        setIntField(term615851, term615851.getClass(), "listeningChildren", 0);
        setIntField(term615851, term615851.getClass(), "listeningBoundsChildren", 0);
        setIntField(term615851, term615851.getClass(), "descendantsCount", 0);
        setField(term615851, term615851.getClass(), "preserveBackgroundColor", null);
        setIntField(term615851, term615851.getClass(), "numOfHWComponents", 0);
        setIntField(term615851, term615851.getClass(), "numOfLWComponents", 0);
        setField(term615851, term615851.getClass(), "modalComp", null);
        setField(term615851, term615851.getClass(), "modalAppContext", null);
        setIntField(term615851, term615851.getClass(), "containerSerializedDataVersion", 0);
        setField(term615851, term615851.getClass(), "peer", null);
        setField(term615851, term615851.getClass(), "parent", null);
        setField(term615851, term615851.getClass(), "appContext", null);
        setIntField(term615851, term615851.getClass(), "x", 0);
        setIntField(term615851, term615851.getClass(), "y", 0);
        setIntField(term615851, term615851.getClass(), "width", 0);
        setIntField(term615851, term615851.getClass(), "height", 0);
        setField(term615851, term615851.getClass(), "foreground", null);
        setField(term615851, term615851.getClass(), "background", null);
        setField(term615851, term615851.getClass(), "font", null);
        setField(term615851, term615851.getClass(), "peerFont", null);
        setField(term615851, term615851.getClass(), "cursor", null);
        setField(term615851, term615851.getClass(), "locale", null);
        setField(term615851, term615851.getClass(), "graphicsConfig", null);
        setField(term615851, term615851.getClass(), "bufferStrategy", null);
        setBooleanField(term615851, term615851.getClass(), "ignoreRepaint", false);
        setBooleanField(term615851, term615851.getClass(), "visible", false);
        setBooleanField(term615851, term615851.getClass(), "enabled", false);
        setBooleanField(term615851, term615851.getClass(), "valid", false);
        setField(term615851, term615851.getClass(), "dropTarget", null);
        setField(term615851, term615851.getClass(), "popups", null);
        setField(term615851, term615851.getClass(), "name", null);
        setBooleanField(term615851, term615851.getClass(), "nameExplicitlySet", false);
        setBooleanField(term615851, term615851.getClass(), "focusable", false);
        setIntField(term615851, term615851.getClass(), "isFocusTraversableOverridden", 0);
        setField(term615851, term615851.getClass(), "focusTraversalKeys", null);
        setBooleanField(term615851, term615851.getClass(), "focusTraversalKeysEnabled", false);
        setField(term615851, term615851.getClass(), "acc", null);
        setField(term615851, term615851.getClass(), "minSize", null);
        setBooleanField(term615851, term615851.getClass(), "minSizeSet", false);
        setField(term615851, term615851.getClass(), "prefSize", null);
        setBooleanField(term615851, term615851.getClass(), "prefSizeSet", false);
        setField(term615851, term615851.getClass(), "maxSize", null);
        setBooleanField(term615851, term615851.getClass(), "maxSizeSet", false);
        setField(term615851, term615851.getClass(), "componentOrientation", null);
        setBooleanField(term615851, term615851.getClass(), "newEventsOnly", false);
        setField(term615851, term615851.getClass(), "componentListener", null);
        setField(term615851, term615851.getClass(), "focusListener", null);
        setField(term615851, term615851.getClass(), "hierarchyListener", null);
        setField(term615851, term615851.getClass(), "hierarchyBoundsListener", null);
        setField(term615851, term615851.getClass(), "keyListener", null);
        setField(term615851, term615851.getClass(), "mouseListener", null);
        setField(term615851, term615851.getClass(), "mouseMotionListener", null);
        setField(term615851, term615851.getClass(), "mouseWheelListener", null);
        setField(term615851, term615851.getClass(), "inputMethodListener", null);
        setLongField(term615851, term615851.getClass(), "eventMask", 0L);
        setField(term615851, term615851.getClass(), "changeSupport", null);
        setField(term615851, term615851.getClass(), "objectLock", null);
        setBooleanField(term615851, term615851.getClass(), "isPacked", false);
        setIntField(term615851, term615851.getClass(), "boundsOp", 0);
        setField(term615851, term615851.getClass(), "compoundShape", null);
        setField(term615851, term615851.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term615851, term615851.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term615851, term615851.getClass(), "backgroundEraseDisabled", false);
        setField(term615851, term615851.getClass(), "eventCache", null);
        setBooleanField(term615851, term615851.getClass(), "coalescingEnabled", false);
        setBooleanField(term615851, term615851.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term615851, term615851.getClass(), "componentSerializedDataVersion", 0);
        setField(term615851, term615851.getClass(), "accessibleContext", null);
        term615894 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term615894;
        callMethod(klass, "applySearch", argTypes, term615851, args);
    }

};


