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

public class ExportPane_joinFilesActionPerformed_81898917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12372;

    public ExportPane_joinFilesActionPerformed_81898917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12372 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term12372, term12372.getClass(), "exporterConfig", null);
        setField(term12372, term12372.getClass(), "onExportedFile", null);
        setField(term12372, term12372.getClass(), "buttonsPane", null);
        setField(term12372, term12372.getClass(), "destinyFolderErrorMessage", null);
        setField(term12372, term12372.getClass(), "destinyPane", null);
        setField(term12372, term12372.getClass(), "docxExport", null);
        setField(term12372, term12372.getClass(), "htmlExport", null);
        setField(term12372, term12372.getClass(), "jButton1", null);
        setField(term12372, term12372.getClass(), "jLabel1", null);
        setField(term12372, term12372.getClass(), "jPanel1", null);
        setField(term12372, term12372.getClass(), "jScrollPane1", null);
        setField(term12372, term12372.getClass(), "joinFiles", null);
        setField(term12372, term12372.getClass(), "newUniqueName", null);
        setField(term12372, term12372.getClass(), "pathDestiny", null);
        setField(term12372, term12372.getClass(), "pdfExport", null);
        setField(term12372, term12372.getClass(), "progressBar", null);
        setField(term12372, term12372.getClass(), "progressPane", null);
        setField(term12372, term12372.getClass(), "tableFiles", null);
        setField(term12372, term12372.getClass(), "uniqueFilePane", null);
        setField(term12372, term12372.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term12372, term12372.getClass(), "isAlignmentXSet", false);
        setFloatField(term12372, term12372.getClass(), "alignmentX", 0.0F);
        setBooleanField(term12372, term12372.getClass(), "isAlignmentYSet", false);
        setFloatField(term12372, term12372.getClass(), "alignmentY", 0.0F);
        setField(term12372, term12372.getClass(), "ui", null);
        setField(term12372, term12372.getClass(), "listenerList", null);
        setField(term12372, term12372.getClass(), "clientProperties", null);
        setField(term12372, term12372.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term12372, term12372.getClass(), "autoscrolls", false);
        setField(term12372, term12372.getClass(), "border", null);
        setIntField(term12372, term12372.getClass(), "flags", 0);
        setField(term12372, term12372.getClass(), "inputVerifier", null);
        setBooleanField(term12372, term12372.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term12372, term12372.getClass(), "paintingChild", null);
        setField(term12372, term12372.getClass(), "popupMenu", null);
        setField(term12372, term12372.getClass(), "revalidateRunnableScheduled", null);
        setField(term12372, term12372.getClass(), "focusInputMap", null);
        setField(term12372, term12372.getClass(), "ancestorInputMap", null);
        setField(term12372, term12372.getClass(), "windowInputMap", null);
        setField(term12372, term12372.getClass(), "actionMap", null);
        setField(term12372, term12372.getClass(), "aaHint", null);
        setField(term12372, term12372.getClass(), "lcdRenderingHint", null);
        setField(term12372, term12372.getClass(), "component", null);
        setField(term12372, term12372.getClass(), "layoutMgr", null);
        setField(term12372, term12372.getClass(), "dispatcher", null);
        setField(term12372, term12372.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term12372, term12372.getClass(), "focusCycleRoot", false);
        setBooleanField(term12372, term12372.getClass(), "focusTraversalPolicyProvider", false);
        setField(term12372, term12372.getClass(), "printingThreads", null);
        setBooleanField(term12372, term12372.getClass(), "printing", false);
        setField(term12372, term12372.getClass(), "containerListener", null);
        setIntField(term12372, term12372.getClass(), "listeningChildren", 0);
        setIntField(term12372, term12372.getClass(), "listeningBoundsChildren", 0);
        setIntField(term12372, term12372.getClass(), "descendantsCount", 0);
        setField(term12372, term12372.getClass(), "preserveBackgroundColor", null);
        setIntField(term12372, term12372.getClass(), "numOfHWComponents", 0);
        setIntField(term12372, term12372.getClass(), "numOfLWComponents", 0);
        setField(term12372, term12372.getClass(), "modalComp", null);
        setField(term12372, term12372.getClass(), "modalAppContext", null);
        setIntField(term12372, term12372.getClass(), "containerSerializedDataVersion", 0);
        setField(term12372, term12372.getClass(), "peer", null);
        setField(term12372, term12372.getClass(), "parent", null);
        setField(term12372, term12372.getClass(), "appContext", null);
        setIntField(term12372, term12372.getClass(), "x", 0);
        setIntField(term12372, term12372.getClass(), "y", 0);
        setIntField(term12372, term12372.getClass(), "width", 0);
        setIntField(term12372, term12372.getClass(), "height", 0);
        setField(term12372, term12372.getClass(), "foreground", null);
        setField(term12372, term12372.getClass(), "background", null);
        setField(term12372, term12372.getClass(), "font", null);
        setField(term12372, term12372.getClass(), "peerFont", null);
        setField(term12372, term12372.getClass(), "cursor", null);
        setField(term12372, term12372.getClass(), "locale", null);
        setField(term12372, term12372.getClass(), "graphicsConfig", null);
        setField(term12372, term12372.getClass(), "bufferStrategy", null);
        setBooleanField(term12372, term12372.getClass(), "ignoreRepaint", false);
        setBooleanField(term12372, term12372.getClass(), "visible", false);
        setBooleanField(term12372, term12372.getClass(), "enabled", false);
        setBooleanField(term12372, term12372.getClass(), "valid", false);
        setField(term12372, term12372.getClass(), "dropTarget", null);
        setField(term12372, term12372.getClass(), "popups", null);
        setField(term12372, term12372.getClass(), "name", null);
        setBooleanField(term12372, term12372.getClass(), "nameExplicitlySet", false);
        setBooleanField(term12372, term12372.getClass(), "focusable", false);
        setIntField(term12372, term12372.getClass(), "isFocusTraversableOverridden", 0);
        setField(term12372, term12372.getClass(), "focusTraversalKeys", null);
        setBooleanField(term12372, term12372.getClass(), "focusTraversalKeysEnabled", false);
        setField(term12372, term12372.getClass(), "acc", null);
        setField(term12372, term12372.getClass(), "minSize", null);
        setBooleanField(term12372, term12372.getClass(), "minSizeSet", false);
        setField(term12372, term12372.getClass(), "prefSize", null);
        setBooleanField(term12372, term12372.getClass(), "prefSizeSet", false);
        setField(term12372, term12372.getClass(), "maxSize", null);
        setBooleanField(term12372, term12372.getClass(), "maxSizeSet", false);
        setField(term12372, term12372.getClass(), "componentOrientation", null);
        setBooleanField(term12372, term12372.getClass(), "newEventsOnly", false);
        setField(term12372, term12372.getClass(), "componentListener", null);
        setField(term12372, term12372.getClass(), "focusListener", null);
        setField(term12372, term12372.getClass(), "hierarchyListener", null);
        setField(term12372, term12372.getClass(), "hierarchyBoundsListener", null);
        setField(term12372, term12372.getClass(), "keyListener", null);
        setField(term12372, term12372.getClass(), "mouseListener", null);
        setField(term12372, term12372.getClass(), "mouseMotionListener", null);
        setField(term12372, term12372.getClass(), "mouseWheelListener", null);
        setField(term12372, term12372.getClass(), "inputMethodListener", null);
        setLongField(term12372, term12372.getClass(), "eventMask", 0L);
        setField(term12372, term12372.getClass(), "changeSupport", null);
        setField(term12372, term12372.getClass(), "objectLock", null);
        setBooleanField(term12372, term12372.getClass(), "isPacked", false);
        setIntField(term12372, term12372.getClass(), "boundsOp", 0);
        setField(term12372, term12372.getClass(), "compoundShape", null);
        setField(term12372, term12372.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term12372, term12372.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term12372, term12372.getClass(), "backgroundEraseDisabled", false);
        setField(term12372, term12372.getClass(), "eventCache", null);
        setBooleanField(term12372, term12372.getClass(), "coalescingEnabled", false);
        setBooleanField(term12372, term12372.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term12372, term12372.getClass(), "componentSerializedDataVersion", 0);
        setField(term12372, term12372.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "joinFilesActionPerformed", argTypes, term12372, args);
    }

};


