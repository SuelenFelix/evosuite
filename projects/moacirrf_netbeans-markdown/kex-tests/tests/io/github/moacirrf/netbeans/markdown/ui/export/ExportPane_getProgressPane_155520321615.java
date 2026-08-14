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

public class ExportPane_getProgressPane_155520321615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28328;

    public ExportPane_getProgressPane_155520321615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28328 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term28328, term28328.getClass(), "exporterConfig", null);
        setField(term28328, term28328.getClass(), "onExportedFile", null);
        setField(term28328, term28328.getClass(), "buttonsPane", null);
        setField(term28328, term28328.getClass(), "destinyFolderErrorMessage", null);
        setField(term28328, term28328.getClass(), "destinyPane", null);
        setField(term28328, term28328.getClass(), "docxExport", null);
        setField(term28328, term28328.getClass(), "htmlExport", null);
        setField(term28328, term28328.getClass(), "jButton1", null);
        setField(term28328, term28328.getClass(), "jLabel1", null);
        setField(term28328, term28328.getClass(), "jPanel1", null);
        setField(term28328, term28328.getClass(), "jScrollPane1", null);
        setField(term28328, term28328.getClass(), "joinFiles", null);
        setField(term28328, term28328.getClass(), "newUniqueName", null);
        setField(term28328, term28328.getClass(), "pathDestiny", null);
        setField(term28328, term28328.getClass(), "pdfExport", null);
        setField(term28328, term28328.getClass(), "progressBar", null);
        setField(term28328, term28328.getClass(), "progressPane", null);
        setField(term28328, term28328.getClass(), "tableFiles", null);
        setField(term28328, term28328.getClass(), "uniqueFilePane", null);
        setField(term28328, term28328.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term28328, term28328.getClass(), "isAlignmentXSet", false);
        setFloatField(term28328, term28328.getClass(), "alignmentX", 0.0F);
        setBooleanField(term28328, term28328.getClass(), "isAlignmentYSet", false);
        setFloatField(term28328, term28328.getClass(), "alignmentY", 0.0F);
        setField(term28328, term28328.getClass(), "ui", null);
        setField(term28328, term28328.getClass(), "listenerList", null);
        setField(term28328, term28328.getClass(), "clientProperties", null);
        setField(term28328, term28328.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term28328, term28328.getClass(), "autoscrolls", false);
        setField(term28328, term28328.getClass(), "border", null);
        setIntField(term28328, term28328.getClass(), "flags", 0);
        setField(term28328, term28328.getClass(), "inputVerifier", null);
        setBooleanField(term28328, term28328.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term28328, term28328.getClass(), "paintingChild", null);
        setField(term28328, term28328.getClass(), "popupMenu", null);
        setField(term28328, term28328.getClass(), "revalidateRunnableScheduled", null);
        setField(term28328, term28328.getClass(), "focusInputMap", null);
        setField(term28328, term28328.getClass(), "ancestorInputMap", null);
        setField(term28328, term28328.getClass(), "windowInputMap", null);
        setField(term28328, term28328.getClass(), "actionMap", null);
        setField(term28328, term28328.getClass(), "aaHint", null);
        setField(term28328, term28328.getClass(), "lcdRenderingHint", null);
        setField(term28328, term28328.getClass(), "component", null);
        setField(term28328, term28328.getClass(), "layoutMgr", null);
        setField(term28328, term28328.getClass(), "dispatcher", null);
        setField(term28328, term28328.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28328, term28328.getClass(), "focusCycleRoot", false);
        setBooleanField(term28328, term28328.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28328, term28328.getClass(), "printingThreads", null);
        setBooleanField(term28328, term28328.getClass(), "printing", false);
        setField(term28328, term28328.getClass(), "containerListener", null);
        setIntField(term28328, term28328.getClass(), "listeningChildren", 0);
        setIntField(term28328, term28328.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28328, term28328.getClass(), "descendantsCount", 0);
        setField(term28328, term28328.getClass(), "preserveBackgroundColor", null);
        setIntField(term28328, term28328.getClass(), "numOfHWComponents", 0);
        setIntField(term28328, term28328.getClass(), "numOfLWComponents", 0);
        setField(term28328, term28328.getClass(), "modalComp", null);
        setField(term28328, term28328.getClass(), "modalAppContext", null);
        setIntField(term28328, term28328.getClass(), "containerSerializedDataVersion", 0);
        setField(term28328, term28328.getClass(), "peer", null);
        setField(term28328, term28328.getClass(), "parent", null);
        setField(term28328, term28328.getClass(), "appContext", null);
        setIntField(term28328, term28328.getClass(), "x", 0);
        setIntField(term28328, term28328.getClass(), "y", 0);
        setIntField(term28328, term28328.getClass(), "width", 0);
        setIntField(term28328, term28328.getClass(), "height", 0);
        setField(term28328, term28328.getClass(), "foreground", null);
        setField(term28328, term28328.getClass(), "background", null);
        setField(term28328, term28328.getClass(), "font", null);
        setField(term28328, term28328.getClass(), "peerFont", null);
        setField(term28328, term28328.getClass(), "cursor", null);
        setField(term28328, term28328.getClass(), "locale", null);
        setField(term28328, term28328.getClass(), "graphicsConfig", null);
        setField(term28328, term28328.getClass(), "bufferStrategy", null);
        setBooleanField(term28328, term28328.getClass(), "ignoreRepaint", false);
        setBooleanField(term28328, term28328.getClass(), "visible", false);
        setBooleanField(term28328, term28328.getClass(), "enabled", false);
        setBooleanField(term28328, term28328.getClass(), "valid", false);
        setField(term28328, term28328.getClass(), "dropTarget", null);
        setField(term28328, term28328.getClass(), "popups", null);
        setField(term28328, term28328.getClass(), "name", null);
        setBooleanField(term28328, term28328.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28328, term28328.getClass(), "focusable", false);
        setIntField(term28328, term28328.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28328, term28328.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28328, term28328.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28328, term28328.getClass(), "acc", null);
        setField(term28328, term28328.getClass(), "minSize", null);
        setBooleanField(term28328, term28328.getClass(), "minSizeSet", false);
        setField(term28328, term28328.getClass(), "prefSize", null);
        setBooleanField(term28328, term28328.getClass(), "prefSizeSet", false);
        setField(term28328, term28328.getClass(), "maxSize", null);
        setBooleanField(term28328, term28328.getClass(), "maxSizeSet", false);
        setField(term28328, term28328.getClass(), "componentOrientation", null);
        setBooleanField(term28328, term28328.getClass(), "newEventsOnly", false);
        setField(term28328, term28328.getClass(), "componentListener", null);
        setField(term28328, term28328.getClass(), "focusListener", null);
        setField(term28328, term28328.getClass(), "hierarchyListener", null);
        setField(term28328, term28328.getClass(), "hierarchyBoundsListener", null);
        setField(term28328, term28328.getClass(), "keyListener", null);
        setField(term28328, term28328.getClass(), "mouseListener", null);
        setField(term28328, term28328.getClass(), "mouseMotionListener", null);
        setField(term28328, term28328.getClass(), "mouseWheelListener", null);
        setField(term28328, term28328.getClass(), "inputMethodListener", null);
        setLongField(term28328, term28328.getClass(), "eventMask", 0L);
        setField(term28328, term28328.getClass(), "changeSupport", null);
        setField(term28328, term28328.getClass(), "objectLock", null);
        setBooleanField(term28328, term28328.getClass(), "isPacked", false);
        setIntField(term28328, term28328.getClass(), "boundsOp", 0);
        setField(term28328, term28328.getClass(), "compoundShape", null);
        setField(term28328, term28328.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28328, term28328.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28328, term28328.getClass(), "backgroundEraseDisabled", false);
        setField(term28328, term28328.getClass(), "eventCache", null);
        setBooleanField(term28328, term28328.getClass(), "coalescingEnabled", false);
        setBooleanField(term28328, term28328.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28328, term28328.getClass(), "componentSerializedDataVersion", 0);
        setField(term28328, term28328.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgressPane", argTypes, term28328, args);
    }

};


