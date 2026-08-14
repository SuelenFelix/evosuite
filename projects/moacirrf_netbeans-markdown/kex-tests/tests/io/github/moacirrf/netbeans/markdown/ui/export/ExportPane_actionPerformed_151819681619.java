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

public class ExportPane_actionPerformed_151819681619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36568;

    public ExportPane_actionPerformed_151819681619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36568 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term36568, term36568.getClass(), "exporterConfig", null);
        setField(term36568, term36568.getClass(), "onExportedFile", null);
        setField(term36568, term36568.getClass(), "buttonsPane", null);
        setField(term36568, term36568.getClass(), "destinyFolderErrorMessage", null);
        setField(term36568, term36568.getClass(), "destinyPane", null);
        setField(term36568, term36568.getClass(), "docxExport", null);
        setField(term36568, term36568.getClass(), "htmlExport", null);
        setField(term36568, term36568.getClass(), "jButton1", null);
        setField(term36568, term36568.getClass(), "jLabel1", null);
        setField(term36568, term36568.getClass(), "jPanel1", null);
        setField(term36568, term36568.getClass(), "jScrollPane1", null);
        setField(term36568, term36568.getClass(), "joinFiles", null);
        setField(term36568, term36568.getClass(), "newUniqueName", null);
        setField(term36568, term36568.getClass(), "pathDestiny", null);
        setField(term36568, term36568.getClass(), "pdfExport", null);
        setField(term36568, term36568.getClass(), "progressBar", null);
        setField(term36568, term36568.getClass(), "progressPane", null);
        setField(term36568, term36568.getClass(), "tableFiles", null);
        setField(term36568, term36568.getClass(), "uniqueFilePane", null);
        setField(term36568, term36568.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term36568, term36568.getClass(), "isAlignmentXSet", false);
        setFloatField(term36568, term36568.getClass(), "alignmentX", 0.0F);
        setBooleanField(term36568, term36568.getClass(), "isAlignmentYSet", false);
        setFloatField(term36568, term36568.getClass(), "alignmentY", 0.0F);
        setField(term36568, term36568.getClass(), "ui", null);
        setField(term36568, term36568.getClass(), "listenerList", null);
        setField(term36568, term36568.getClass(), "clientProperties", null);
        setField(term36568, term36568.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term36568, term36568.getClass(), "autoscrolls", false);
        setField(term36568, term36568.getClass(), "border", null);
        setIntField(term36568, term36568.getClass(), "flags", 0);
        setField(term36568, term36568.getClass(), "inputVerifier", null);
        setBooleanField(term36568, term36568.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term36568, term36568.getClass(), "paintingChild", null);
        setField(term36568, term36568.getClass(), "popupMenu", null);
        setField(term36568, term36568.getClass(), "revalidateRunnableScheduled", null);
        setField(term36568, term36568.getClass(), "focusInputMap", null);
        setField(term36568, term36568.getClass(), "ancestorInputMap", null);
        setField(term36568, term36568.getClass(), "windowInputMap", null);
        setField(term36568, term36568.getClass(), "actionMap", null);
        setField(term36568, term36568.getClass(), "aaHint", null);
        setField(term36568, term36568.getClass(), "lcdRenderingHint", null);
        setField(term36568, term36568.getClass(), "component", null);
        setField(term36568, term36568.getClass(), "layoutMgr", null);
        setField(term36568, term36568.getClass(), "dispatcher", null);
        setField(term36568, term36568.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term36568, term36568.getClass(), "focusCycleRoot", false);
        setBooleanField(term36568, term36568.getClass(), "focusTraversalPolicyProvider", false);
        setField(term36568, term36568.getClass(), "printingThreads", null);
        setBooleanField(term36568, term36568.getClass(), "printing", false);
        setField(term36568, term36568.getClass(), "containerListener", null);
        setIntField(term36568, term36568.getClass(), "listeningChildren", 0);
        setIntField(term36568, term36568.getClass(), "listeningBoundsChildren", 0);
        setIntField(term36568, term36568.getClass(), "descendantsCount", 0);
        setField(term36568, term36568.getClass(), "preserveBackgroundColor", null);
        setIntField(term36568, term36568.getClass(), "numOfHWComponents", 0);
        setIntField(term36568, term36568.getClass(), "numOfLWComponents", 0);
        setField(term36568, term36568.getClass(), "modalComp", null);
        setField(term36568, term36568.getClass(), "modalAppContext", null);
        setIntField(term36568, term36568.getClass(), "containerSerializedDataVersion", 0);
        setField(term36568, term36568.getClass(), "peer", null);
        setField(term36568, term36568.getClass(), "parent", null);
        setField(term36568, term36568.getClass(), "appContext", null);
        setIntField(term36568, term36568.getClass(), "x", 0);
        setIntField(term36568, term36568.getClass(), "y", 0);
        setIntField(term36568, term36568.getClass(), "width", 0);
        setIntField(term36568, term36568.getClass(), "height", 0);
        setField(term36568, term36568.getClass(), "foreground", null);
        setField(term36568, term36568.getClass(), "background", null);
        setField(term36568, term36568.getClass(), "font", null);
        setField(term36568, term36568.getClass(), "peerFont", null);
        setField(term36568, term36568.getClass(), "cursor", null);
        setField(term36568, term36568.getClass(), "locale", null);
        setField(term36568, term36568.getClass(), "graphicsConfig", null);
        setField(term36568, term36568.getClass(), "bufferStrategy", null);
        setBooleanField(term36568, term36568.getClass(), "ignoreRepaint", false);
        setBooleanField(term36568, term36568.getClass(), "visible", false);
        setBooleanField(term36568, term36568.getClass(), "enabled", false);
        setBooleanField(term36568, term36568.getClass(), "valid", false);
        setField(term36568, term36568.getClass(), "dropTarget", null);
        setField(term36568, term36568.getClass(), "popups", null);
        setField(term36568, term36568.getClass(), "name", null);
        setBooleanField(term36568, term36568.getClass(), "nameExplicitlySet", false);
        setBooleanField(term36568, term36568.getClass(), "focusable", false);
        setIntField(term36568, term36568.getClass(), "isFocusTraversableOverridden", 0);
        setField(term36568, term36568.getClass(), "focusTraversalKeys", null);
        setBooleanField(term36568, term36568.getClass(), "focusTraversalKeysEnabled", false);
        setField(term36568, term36568.getClass(), "acc", null);
        setField(term36568, term36568.getClass(), "minSize", null);
        setBooleanField(term36568, term36568.getClass(), "minSizeSet", false);
        setField(term36568, term36568.getClass(), "prefSize", null);
        setBooleanField(term36568, term36568.getClass(), "prefSizeSet", false);
        setField(term36568, term36568.getClass(), "maxSize", null);
        setBooleanField(term36568, term36568.getClass(), "maxSizeSet", false);
        setField(term36568, term36568.getClass(), "componentOrientation", null);
        setBooleanField(term36568, term36568.getClass(), "newEventsOnly", false);
        setField(term36568, term36568.getClass(), "componentListener", null);
        setField(term36568, term36568.getClass(), "focusListener", null);
        setField(term36568, term36568.getClass(), "hierarchyListener", null);
        setField(term36568, term36568.getClass(), "hierarchyBoundsListener", null);
        setField(term36568, term36568.getClass(), "keyListener", null);
        setField(term36568, term36568.getClass(), "mouseListener", null);
        setField(term36568, term36568.getClass(), "mouseMotionListener", null);
        setField(term36568, term36568.getClass(), "mouseWheelListener", null);
        setField(term36568, term36568.getClass(), "inputMethodListener", null);
        setLongField(term36568, term36568.getClass(), "eventMask", 0L);
        setField(term36568, term36568.getClass(), "changeSupport", null);
        setField(term36568, term36568.getClass(), "objectLock", null);
        setBooleanField(term36568, term36568.getClass(), "isPacked", false);
        setIntField(term36568, term36568.getClass(), "boundsOp", 0);
        setField(term36568, term36568.getClass(), "compoundShape", null);
        setField(term36568, term36568.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term36568, term36568.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term36568, term36568.getClass(), "backgroundEraseDisabled", false);
        setField(term36568, term36568.getClass(), "eventCache", null);
        setBooleanField(term36568, term36568.getClass(), "coalescingEnabled", false);
        setBooleanField(term36568, term36568.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term36568, term36568.getClass(), "componentSerializedDataVersion", 0);
        setField(term36568, term36568.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term36568, args);
    }

};


