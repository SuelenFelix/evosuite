package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExportPane_newPane_197812720820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36609;

    public ExportPane_newPane_197812720820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36609 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term36609, term36609.getClass(), "exporterConfig", null);
        setField(term36609, term36609.getClass(), "onExportedFile", null);
        setField(term36609, term36609.getClass(), "buttonsPane", null);
        setField(term36609, term36609.getClass(), "destinyFolderErrorMessage", null);
        setField(term36609, term36609.getClass(), "destinyPane", null);
        setField(term36609, term36609.getClass(), "docxExport", null);
        setField(term36609, term36609.getClass(), "htmlExport", null);
        setField(term36609, term36609.getClass(), "jButton1", null);
        setField(term36609, term36609.getClass(), "jLabel1", null);
        setField(term36609, term36609.getClass(), "jPanel1", null);
        setField(term36609, term36609.getClass(), "jScrollPane1", null);
        setField(term36609, term36609.getClass(), "joinFiles", null);
        setField(term36609, term36609.getClass(), "newUniqueName", null);
        setField(term36609, term36609.getClass(), "pathDestiny", null);
        setField(term36609, term36609.getClass(), "pdfExport", null);
        setField(term36609, term36609.getClass(), "progressBar", null);
        setField(term36609, term36609.getClass(), "progressPane", null);
        setField(term36609, term36609.getClass(), "tableFiles", null);
        setField(term36609, term36609.getClass(), "uniqueFilePane", null);
        setField(term36609, term36609.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term36609, term36609.getClass(), "isAlignmentXSet", false);
        setFloatField(term36609, term36609.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36609, term36609.getClass(), "isAlignmentYSet", false);
        setFloatField(term36609, term36609.getClass(), "alignmentY", 0.0F);
        setField(term36609, term36609.getClass(), "ui", null);
        setField(term36609, term36609.getClass(), "listenerList", null);
        setField(term36609, term36609.getClass(), "clientProperties", null);
        setField(term36609, term36609.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36609, term36609.getClass(), "autoscrolls", false);
        setField(term36609, term36609.getClass(), "border", null);
        setIntField(term36609, term36609.getClass(), "flags", 0);
        setField(term36609, term36609.getClass(), "inputVerifier", null);
        setBooleanField(term36609, term36609.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36609, term36609.getClass(), "paintingChild", null);
        setField(term36609, term36609.getClass(), "popupMenu", null);
        setField(term36609, term36609.getClass(), "revalidateRunnableScheduled", null);
        setField(term36609, term36609.getClass(), "focusInputMap", null);
        setField(term36609, term36609.getClass(), "ancestorInputMap", null);
        setField(term36609, term36609.getClass(), "windowInputMap", null);
        setField(term36609, term36609.getClass(), "actionMap", null);
        setField(term36609, term36609.getClass(), "aaHint", null);
        setField(term36609, term36609.getClass(), "lcdRenderingHint", null);
        setField(term36609, term36609.getClass(), "component", null);
        setField(term36609, term36609.getClass(), "layoutMgr", null);
        setField(term36609, term36609.getClass(), "dispatcher", null);
        setField(term36609, term36609.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36609, term36609.getClass(), "focusCycleRoot", false);
        setBooleanField(term36609, term36609.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36609, term36609.getClass(), "printingThreads", null);
        setBooleanField(term36609, term36609.getClass(), "printing", false);
        setField(term36609, term36609.getClass(), "containerListener", null);
        setIntField(term36609, term36609.getClass(), "listeningChildren", 0);
        setIntField(term36609, term36609.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36609, term36609.getClass(), "descendantsCount", 0);
        setField(term36609, term36609.getClass(), "preserveBackgroundColor", null);
        setIntField(term36609, term36609.getClass(), "numOfHWComponents", 0);
        setIntField(term36609, term36609.getClass(), "numOfLWComponents", 0);
        setField(term36609, term36609.getClass(), "modalComp", null);
        setField(term36609, term36609.getClass(), "modalAppContext", null);
        setIntField(term36609, term36609.getClass(), "containerSerializedDataVersion", 0);
        setField(term36609, term36609.getClass(), "peer", null);
        setField(term36609, term36609.getClass(), "parent", null);
        setField(term36609, term36609.getClass(), "appContext", null);
        setIntField(term36609, term36609.getClass(), "x", 0);
        setIntField(term36609, term36609.getClass(), "y", 0);
        setIntField(term36609, term36609.getClass(), "width", 0);
        setIntField(term36609, term36609.getClass(), "height", 0);
        setField(term36609, term36609.getClass(), "foreground", null);
        setField(term36609, term36609.getClass(), "background", null);
        setField(term36609, term36609.getClass(), "font", null);
        setField(term36609, term36609.getClass(), "peerFont", null);
        setField(term36609, term36609.getClass(), "cursor", null);
        setField(term36609, term36609.getClass(), "locale", null);
        setField(term36609, term36609.getClass(), "graphicsConfig", null);
        setField(term36609, term36609.getClass(), "bufferStrategy", null);
        setBooleanField(term36609, term36609.getClass(), "ignoreRepaint", false);
        setBooleanField(term36609, term36609.getClass(), "visible", false);
        setBooleanField(term36609, term36609.getClass(), "enabled", false);
        setBooleanField(term36609, term36609.getClass(), "valid", false);
        setField(term36609, term36609.getClass(), "dropTarget", null);
        setField(term36609, term36609.getClass(), "popups", null);
        setField(term36609, term36609.getClass(), "name", null);
        setBooleanField(term36609, term36609.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36609, term36609.getClass(), "focusable", false);
        setIntField(term36609, term36609.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36609, term36609.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36609, term36609.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36609, term36609.getClass(), "acc", null);
        setField(term36609, term36609.getClass(), "minSize", null);
        setBooleanField(term36609, term36609.getClass(), "minSizeSet", false);
        setField(term36609, term36609.getClass(), "prefSize", null);
        setBooleanField(term36609, term36609.getClass(), "prefSizeSet", false);
        setField(term36609, term36609.getClass(), "maxSize", null);
        setBooleanField(term36609, term36609.getClass(), "maxSizeSet", false);
        setField(term36609, term36609.getClass(), "componentOrientation", null);
        setBooleanField(term36609, term36609.getClass(), "newEventsOnly", false);
        setField(term36609, term36609.getClass(), "componentListener", null);
        setField(term36609, term36609.getClass(), "focusListener", null);
        setField(term36609, term36609.getClass(), "hierarchyListener", null);
        setField(term36609, term36609.getClass(), "hierarchyBoundsListener", null);
        setField(term36609, term36609.getClass(), "keyListener", null);
        setField(term36609, term36609.getClass(), "mouseListener", null);
        setField(term36609, term36609.getClass(), "mouseMotionListener", null);
        setField(term36609, term36609.getClass(), "mouseWheelListener", null);
        setField(term36609, term36609.getClass(), "inputMethodListener", null);
        setLongField(term36609, term36609.getClass(), "eventMask", 0L);
        setField(term36609, term36609.getClass(), "changeSupport", null);
        setField(term36609, term36609.getClass(), "objectLock", null);
        setBooleanField(term36609, term36609.getClass(), "isPacked", false);
        setIntField(term36609, term36609.getClass(), "boundsOp", 0);
        setField(term36609, term36609.getClass(), "compoundShape", null);
        setField(term36609, term36609.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36609, term36609.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36609, term36609.getClass(), "backgroundEraseDisabled", false);
        setField(term36609, term36609.getClass(), "eventCache", null);
        setBooleanField(term36609, term36609.getClass(), "coalescingEnabled", false);
        setBooleanField(term36609, term36609.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36609, term36609.getClass(), "componentSerializedDataVersion", 0);
        setField(term36609, term36609.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "newPane", argTypes, term36609, args);
    }

};


