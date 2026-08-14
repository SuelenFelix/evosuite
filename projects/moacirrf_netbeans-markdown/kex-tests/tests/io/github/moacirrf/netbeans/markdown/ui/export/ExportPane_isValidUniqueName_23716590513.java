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

public class ExportPane_isValidUniqueName_23716590513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24482;

    public ExportPane_isValidUniqueName_23716590513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24482 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term24482, term24482.getClass(), "exporterConfig", null);
        setField(term24482, term24482.getClass(), "onExportedFile", null);
        setField(term24482, term24482.getClass(), "buttonsPane", null);
        setField(term24482, term24482.getClass(), "destinyFolderErrorMessage", null);
        setField(term24482, term24482.getClass(), "destinyPane", null);
        setField(term24482, term24482.getClass(), "docxExport", null);
        setField(term24482, term24482.getClass(), "htmlExport", null);
        setField(term24482, term24482.getClass(), "jButton1", null);
        setField(term24482, term24482.getClass(), "jLabel1", null);
        setField(term24482, term24482.getClass(), "jPanel1", null);
        setField(term24482, term24482.getClass(), "jScrollPane1", null);
        setField(term24482, term24482.getClass(), "joinFiles", null);
        setField(term24482, term24482.getClass(), "newUniqueName", null);
        setField(term24482, term24482.getClass(), "pathDestiny", null);
        setField(term24482, term24482.getClass(), "pdfExport", null);
        setField(term24482, term24482.getClass(), "progressBar", null);
        setField(term24482, term24482.getClass(), "progressPane", null);
        setField(term24482, term24482.getClass(), "tableFiles", null);
        setField(term24482, term24482.getClass(), "uniqueFilePane", null);
        setField(term24482, term24482.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term24482, term24482.getClass(), "isAlignmentXSet", false);
        setFloatField(term24482, term24482.getClass(), "alignmentX", 0.0F);
        setBooleanField(term24482, term24482.getClass(), "isAlignmentYSet", false);
        setFloatField(term24482, term24482.getClass(), "alignmentY", 0.0F);
        setField(term24482, term24482.getClass(), "ui", null);
        setField(term24482, term24482.getClass(), "listenerList", null);
        setField(term24482, term24482.getClass(), "clientProperties", null);
        setField(term24482, term24482.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term24482, term24482.getClass(), "autoscrolls", false);
        setField(term24482, term24482.getClass(), "border", null);
        setIntField(term24482, term24482.getClass(), "flags", 0);
        setField(term24482, term24482.getClass(), "inputVerifier", null);
        setBooleanField(term24482, term24482.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term24482, term24482.getClass(), "paintingChild", null);
        setField(term24482, term24482.getClass(), "popupMenu", null);
        setField(term24482, term24482.getClass(), "revalidateRunnableScheduled", null);
        setField(term24482, term24482.getClass(), "focusInputMap", null);
        setField(term24482, term24482.getClass(), "ancestorInputMap", null);
        setField(term24482, term24482.getClass(), "windowInputMap", null);
        setField(term24482, term24482.getClass(), "actionMap", null);
        setField(term24482, term24482.getClass(), "aaHint", null);
        setField(term24482, term24482.getClass(), "lcdRenderingHint", null);
        setField(term24482, term24482.getClass(), "component", null);
        setField(term24482, term24482.getClass(), "layoutMgr", null);
        setField(term24482, term24482.getClass(), "dispatcher", null);
        setField(term24482, term24482.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term24482, term24482.getClass(), "focusCycleRoot", false);
        setBooleanField(term24482, term24482.getClass(), "focusTraversalPolicyProvider", false);
        setField(term24482, term24482.getClass(), "printingThreads", null);
        setBooleanField(term24482, term24482.getClass(), "printing", false);
        setField(term24482, term24482.getClass(), "containerListener", null);
        setIntField(term24482, term24482.getClass(), "listeningChildren", 0);
        setIntField(term24482, term24482.getClass(), "listeningBoundsChildren", 0);
        setIntField(term24482, term24482.getClass(), "descendantsCount", 0);
        setField(term24482, term24482.getClass(), "preserveBackgroundColor", null);
        setIntField(term24482, term24482.getClass(), "numOfHWComponents", 0);
        setIntField(term24482, term24482.getClass(), "numOfLWComponents", 0);
        setField(term24482, term24482.getClass(), "modalComp", null);
        setField(term24482, term24482.getClass(), "modalAppContext", null);
        setIntField(term24482, term24482.getClass(), "containerSerializedDataVersion", 0);
        setField(term24482, term24482.getClass(), "peer", null);
        setField(term24482, term24482.getClass(), "parent", null);
        setField(term24482, term24482.getClass(), "appContext", null);
        setIntField(term24482, term24482.getClass(), "x", 0);
        setIntField(term24482, term24482.getClass(), "y", 0);
        setIntField(term24482, term24482.getClass(), "width", 0);
        setIntField(term24482, term24482.getClass(), "height", 0);
        setField(term24482, term24482.getClass(), "foreground", null);
        setField(term24482, term24482.getClass(), "background", null);
        setField(term24482, term24482.getClass(), "font", null);
        setField(term24482, term24482.getClass(), "peerFont", null);
        setField(term24482, term24482.getClass(), "cursor", null);
        setField(term24482, term24482.getClass(), "locale", null);
        setField(term24482, term24482.getClass(), "graphicsConfig", null);
        setField(term24482, term24482.getClass(), "bufferStrategy", null);
        setBooleanField(term24482, term24482.getClass(), "ignoreRepaint", false);
        setBooleanField(term24482, term24482.getClass(), "visible", false);
        setBooleanField(term24482, term24482.getClass(), "enabled", false);
        setBooleanField(term24482, term24482.getClass(), "valid", false);
        setField(term24482, term24482.getClass(), "dropTarget", null);
        setField(term24482, term24482.getClass(), "popups", null);
        setField(term24482, term24482.getClass(), "name", null);
        setBooleanField(term24482, term24482.getClass(), "nameExplicitlySet", false);
        setBooleanField(term24482, term24482.getClass(), "focusable", false);
        setIntField(term24482, term24482.getClass(), "isFocusTraversableOverridden", 0);
        setField(term24482, term24482.getClass(), "focusTraversalKeys", null);
        setBooleanField(term24482, term24482.getClass(), "focusTraversalKeysEnabled", false);
        setField(term24482, term24482.getClass(), "acc", null);
        setField(term24482, term24482.getClass(), "minSize", null);
        setBooleanField(term24482, term24482.getClass(), "minSizeSet", false);
        setField(term24482, term24482.getClass(), "prefSize", null);
        setBooleanField(term24482, term24482.getClass(), "prefSizeSet", false);
        setField(term24482, term24482.getClass(), "maxSize", null);
        setBooleanField(term24482, term24482.getClass(), "maxSizeSet", false);
        setField(term24482, term24482.getClass(), "componentOrientation", null);
        setBooleanField(term24482, term24482.getClass(), "newEventsOnly", false);
        setField(term24482, term24482.getClass(), "componentListener", null);
        setField(term24482, term24482.getClass(), "focusListener", null);
        setField(term24482, term24482.getClass(), "hierarchyListener", null);
        setField(term24482, term24482.getClass(), "hierarchyBoundsListener", null);
        setField(term24482, term24482.getClass(), "keyListener", null);
        setField(term24482, term24482.getClass(), "mouseListener", null);
        setField(term24482, term24482.getClass(), "mouseMotionListener", null);
        setField(term24482, term24482.getClass(), "mouseWheelListener", null);
        setField(term24482, term24482.getClass(), "inputMethodListener", null);
        setLongField(term24482, term24482.getClass(), "eventMask", 0L);
        setField(term24482, term24482.getClass(), "changeSupport", null);
        setField(term24482, term24482.getClass(), "objectLock", null);
        setBooleanField(term24482, term24482.getClass(), "isPacked", false);
        setIntField(term24482, term24482.getClass(), "boundsOp", 0);
        setField(term24482, term24482.getClass(), "compoundShape", null);
        setField(term24482, term24482.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term24482, term24482.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term24482, term24482.getClass(), "backgroundEraseDisabled", false);
        setField(term24482, term24482.getClass(), "eventCache", null);
        setBooleanField(term24482, term24482.getClass(), "coalescingEnabled", false);
        setBooleanField(term24482, term24482.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term24482, term24482.getClass(), "componentSerializedDataVersion", 0);
        setField(term24482, term24482.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValidUniqueName", argTypes, term24482, args);
    }

};


