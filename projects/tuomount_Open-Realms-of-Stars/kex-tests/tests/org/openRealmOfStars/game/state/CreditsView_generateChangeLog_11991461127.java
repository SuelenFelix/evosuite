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

public class CreditsView_generateChangeLog_11991461127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501793;

    public CreditsView_generateChangeLog_11991461127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501793 = newInstance(Class.forName("org.openRealmOfStars.game.state.CreditsView"));
        setField(term1501793, term1501793.getClass(), "textArea", null);
        setBooleanField(term1501793, term1501793.getClass(), "isAlignmentXSet", false);
        setFloatField(term1501793, term1501793.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1501793, term1501793.getClass(), "isAlignmentYSet", false);
        setFloatField(term1501793, term1501793.getClass(), "alignmentY", 0.0F);
        setField(term1501793, term1501793.getClass(), "ui", null);
        setField(term1501793, term1501793.getClass(), "listenerList", null);
        setField(term1501793, term1501793.getClass(), "clientProperties", null);
        setField(term1501793, term1501793.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1501793, term1501793.getClass(), "autoscrolls", false);
        setField(term1501793, term1501793.getClass(), "border", null);
        setIntField(term1501793, term1501793.getClass(), "flags", 0);
        setField(term1501793, term1501793.getClass(), "inputVerifier", null);
        setBooleanField(term1501793, term1501793.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1501793, term1501793.getClass(), "paintingChild", null);
        setField(term1501793, term1501793.getClass(), "popupMenu", null);
        setField(term1501793, term1501793.getClass(), "revalidateRunnableScheduled", null);
        setField(term1501793, term1501793.getClass(), "focusInputMap", null);
        setField(term1501793, term1501793.getClass(), "ancestorInputMap", null);
        setField(term1501793, term1501793.getClass(), "windowInputMap", null);
        setField(term1501793, term1501793.getClass(), "actionMap", null);
        setField(term1501793, term1501793.getClass(), "aaHint", null);
        setField(term1501793, term1501793.getClass(), "lcdRenderingHint", null);
        setField(term1501793, term1501793.getClass(), "component", null);
        setField(term1501793, term1501793.getClass(), "layoutMgr", null);
        setField(term1501793, term1501793.getClass(), "dispatcher", null);
        setField(term1501793, term1501793.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1501793, term1501793.getClass(), "focusCycleRoot", false);
        setBooleanField(term1501793, term1501793.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1501793, term1501793.getClass(), "printingThreads", null);
        setBooleanField(term1501793, term1501793.getClass(), "printing", false);
        setField(term1501793, term1501793.getClass(), "containerListener", null);
        setIntField(term1501793, term1501793.getClass(), "listeningChildren", 0);
        setIntField(term1501793, term1501793.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1501793, term1501793.getClass(), "descendantsCount", 0);
        setField(term1501793, term1501793.getClass(), "preserveBackgroundColor", null);
        setIntField(term1501793, term1501793.getClass(), "numOfHWComponents", 0);
        setIntField(term1501793, term1501793.getClass(), "numOfLWComponents", 0);
        setField(term1501793, term1501793.getClass(), "modalComp", null);
        setField(term1501793, term1501793.getClass(), "modalAppContext", null);
        setIntField(term1501793, term1501793.getClass(), "containerSerializedDataVersion", 0);
        setField(term1501793, term1501793.getClass(), "peer", null);
        setField(term1501793, term1501793.getClass(), "parent", null);
        setField(term1501793, term1501793.getClass(), "appContext", null);
        setIntField(term1501793, term1501793.getClass(), "x", 0);
        setIntField(term1501793, term1501793.getClass(), "y", 0);
        setIntField(term1501793, term1501793.getClass(), "width", 0);
        setIntField(term1501793, term1501793.getClass(), "height", 0);
        setField(term1501793, term1501793.getClass(), "foreground", null);
        setField(term1501793, term1501793.getClass(), "background", null);
        setField(term1501793, term1501793.getClass(), "font", null);
        setField(term1501793, term1501793.getClass(), "peerFont", null);
        setField(term1501793, term1501793.getClass(), "cursor", null);
        setField(term1501793, term1501793.getClass(), "locale", null);
        setField(term1501793, term1501793.getClass(), "graphicsConfig", null);
        setField(term1501793, term1501793.getClass(), "bufferStrategy", null);
        setBooleanField(term1501793, term1501793.getClass(), "ignoreRepaint", false);
        setBooleanField(term1501793, term1501793.getClass(), "visible", false);
        setBooleanField(term1501793, term1501793.getClass(), "enabled", false);
        setBooleanField(term1501793, term1501793.getClass(), "valid", false);
        setField(term1501793, term1501793.getClass(), "dropTarget", null);
        setField(term1501793, term1501793.getClass(), "popups", null);
        setField(term1501793, term1501793.getClass(), "name", null);
        setBooleanField(term1501793, term1501793.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1501793, term1501793.getClass(), "focusable", false);
        setIntField(term1501793, term1501793.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1501793, term1501793.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1501793, term1501793.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1501793, term1501793.getClass(), "acc", null);
        setField(term1501793, term1501793.getClass(), "minSize", null);
        setBooleanField(term1501793, term1501793.getClass(), "minSizeSet", false);
        setField(term1501793, term1501793.getClass(), "prefSize", null);
        setBooleanField(term1501793, term1501793.getClass(), "prefSizeSet", false);
        setField(term1501793, term1501793.getClass(), "maxSize", null);
        setBooleanField(term1501793, term1501793.getClass(), "maxSizeSet", false);
        setField(term1501793, term1501793.getClass(), "componentOrientation", null);
        setBooleanField(term1501793, term1501793.getClass(), "newEventsOnly", false);
        setField(term1501793, term1501793.getClass(), "componentListener", null);
        setField(term1501793, term1501793.getClass(), "focusListener", null);
        setField(term1501793, term1501793.getClass(), "hierarchyListener", null);
        setField(term1501793, term1501793.getClass(), "hierarchyBoundsListener", null);
        setField(term1501793, term1501793.getClass(), "keyListener", null);
        setField(term1501793, term1501793.getClass(), "mouseListener", null);
        setField(term1501793, term1501793.getClass(), "mouseMotionListener", null);
        setField(term1501793, term1501793.getClass(), "mouseWheelListener", null);
        setField(term1501793, term1501793.getClass(), "inputMethodListener", null);
        setLongField(term1501793, term1501793.getClass(), "eventMask", 0L);
        setField(term1501793, term1501793.getClass(), "changeSupport", null);
        setField(term1501793, term1501793.getClass(), "objectLock", null);
        setBooleanField(term1501793, term1501793.getClass(), "isPacked", false);
        setIntField(term1501793, term1501793.getClass(), "boundsOp", 0);
        setField(term1501793, term1501793.getClass(), "compoundShape", null);
        setField(term1501793, term1501793.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1501793, term1501793.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1501793, term1501793.getClass(), "backgroundEraseDisabled", false);
        setField(term1501793, term1501793.getClass(), "eventCache", null);
        setBooleanField(term1501793, term1501793.getClass(), "coalescingEnabled", false);
        setBooleanField(term1501793, term1501793.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1501793, term1501793.getClass(), "componentSerializedDataVersion", 0);
        setField(term1501793, term1501793.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.CreditsView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "generateChangeLog", argTypes, term1501793, args);
    }

};


