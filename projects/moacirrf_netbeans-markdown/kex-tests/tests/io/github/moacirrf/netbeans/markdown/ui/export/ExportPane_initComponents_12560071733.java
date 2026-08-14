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

public class ExportPane_initComponents_12560071733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4266;

    public ExportPane_initComponents_12560071733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4266 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane"));
        setField(term4266, term4266.getClass(), "exporterConfig", null);
        setField(term4266, term4266.getClass(), "onExportedFile", null);
        setField(term4266, term4266.getClass(), "buttonsPane", null);
        setField(term4266, term4266.getClass(), "destinyFolderErrorMessage", null);
        setField(term4266, term4266.getClass(), "destinyPane", null);
        setField(term4266, term4266.getClass(), "docxExport", null);
        setField(term4266, term4266.getClass(), "htmlExport", null);
        setField(term4266, term4266.getClass(), "jButton1", null);
        setField(term4266, term4266.getClass(), "jLabel1", null);
        setField(term4266, term4266.getClass(), "jPanel1", null);
        setField(term4266, term4266.getClass(), "jScrollPane1", null);
        setField(term4266, term4266.getClass(), "joinFiles", null);
        setField(term4266, term4266.getClass(), "newUniqueName", null);
        setField(term4266, term4266.getClass(), "pathDestiny", null);
        setField(term4266, term4266.getClass(), "pdfExport", null);
        setField(term4266, term4266.getClass(), "progressBar", null);
        setField(term4266, term4266.getClass(), "progressPane", null);
        setField(term4266, term4266.getClass(), "tableFiles", null);
        setField(term4266, term4266.getClass(), "uniqueFilePane", null);
        setField(term4266, term4266.getClass(), "uniqueNameErrorLabel", null);
        setBooleanField(term4266, term4266.getClass(), "isAlignmentXSet", false);
        setFloatField(term4266, term4266.getClass(), "alignmentX", 0.0F);
        setBooleanField(term4266, term4266.getClass(), "isAlignmentYSet", false);
        setFloatField(term4266, term4266.getClass(), "alignmentY", 0.0F);
        setField(term4266, term4266.getClass(), "ui", null);
        setField(term4266, term4266.getClass(), "listenerList", null);
        setField(term4266, term4266.getClass(), "clientProperties", null);
        setField(term4266, term4266.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term4266, term4266.getClass(), "autoscrolls", false);
        setField(term4266, term4266.getClass(), "border", null);
        setIntField(term4266, term4266.getClass(), "flags", 0);
        setField(term4266, term4266.getClass(), "inputVerifier", null);
        setBooleanField(term4266, term4266.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term4266, term4266.getClass(), "paintingChild", null);
        setField(term4266, term4266.getClass(), "popupMenu", null);
        setField(term4266, term4266.getClass(), "revalidateRunnableScheduled", null);
        setField(term4266, term4266.getClass(), "focusInputMap", null);
        setField(term4266, term4266.getClass(), "ancestorInputMap", null);
        setField(term4266, term4266.getClass(), "windowInputMap", null);
        setField(term4266, term4266.getClass(), "actionMap", null);
        setField(term4266, term4266.getClass(), "aaHint", null);
        setField(term4266, term4266.getClass(), "lcdRenderingHint", null);
        setField(term4266, term4266.getClass(), "component", null);
        setField(term4266, term4266.getClass(), "layoutMgr", null);
        setField(term4266, term4266.getClass(), "dispatcher", null);
        setField(term4266, term4266.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4266, term4266.getClass(), "focusCycleRoot", false);
        setBooleanField(term4266, term4266.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4266, term4266.getClass(), "printingThreads", null);
        setBooleanField(term4266, term4266.getClass(), "printing", false);
        setField(term4266, term4266.getClass(), "containerListener", null);
        setIntField(term4266, term4266.getClass(), "listeningChildren", 0);
        setIntField(term4266, term4266.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4266, term4266.getClass(), "descendantsCount", 0);
        setField(term4266, term4266.getClass(), "preserveBackgroundColor", null);
        setIntField(term4266, term4266.getClass(), "numOfHWComponents", 0);
        setIntField(term4266, term4266.getClass(), "numOfLWComponents", 0);
        setField(term4266, term4266.getClass(), "modalComp", null);
        setField(term4266, term4266.getClass(), "modalAppContext", null);
        setIntField(term4266, term4266.getClass(), "containerSerializedDataVersion", 0);
        setField(term4266, term4266.getClass(), "peer", null);
        setField(term4266, term4266.getClass(), "parent", null);
        setField(term4266, term4266.getClass(), "appContext", null);
        setIntField(term4266, term4266.getClass(), "x", 0);
        setIntField(term4266, term4266.getClass(), "y", 0);
        setIntField(term4266, term4266.getClass(), "width", 0);
        setIntField(term4266, term4266.getClass(), "height", 0);
        setField(term4266, term4266.getClass(), "foreground", null);
        setField(term4266, term4266.getClass(), "background", null);
        setField(term4266, term4266.getClass(), "font", null);
        setField(term4266, term4266.getClass(), "peerFont", null);
        setField(term4266, term4266.getClass(), "cursor", null);
        setField(term4266, term4266.getClass(), "locale", null);
        setField(term4266, term4266.getClass(), "graphicsConfig", null);
        setField(term4266, term4266.getClass(), "bufferStrategy", null);
        setBooleanField(term4266, term4266.getClass(), "ignoreRepaint", false);
        setBooleanField(term4266, term4266.getClass(), "visible", false);
        setBooleanField(term4266, term4266.getClass(), "enabled", false);
        setBooleanField(term4266, term4266.getClass(), "valid", false);
        setField(term4266, term4266.getClass(), "dropTarget", null);
        setField(term4266, term4266.getClass(), "popups", null);
        setField(term4266, term4266.getClass(), "name", null);
        setBooleanField(term4266, term4266.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4266, term4266.getClass(), "focusable", false);
        setIntField(term4266, term4266.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4266, term4266.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4266, term4266.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4266, term4266.getClass(), "acc", null);
        setField(term4266, term4266.getClass(), "minSize", null);
        setBooleanField(term4266, term4266.getClass(), "minSizeSet", false);
        setField(term4266, term4266.getClass(), "prefSize", null);
        setBooleanField(term4266, term4266.getClass(), "prefSizeSet", false);
        setField(term4266, term4266.getClass(), "maxSize", null);
        setBooleanField(term4266, term4266.getClass(), "maxSizeSet", false);
        setField(term4266, term4266.getClass(), "componentOrientation", null);
        setBooleanField(term4266, term4266.getClass(), "newEventsOnly", false);
        setField(term4266, term4266.getClass(), "componentListener", null);
        setField(term4266, term4266.getClass(), "focusListener", null);
        setField(term4266, term4266.getClass(), "hierarchyListener", null);
        setField(term4266, term4266.getClass(), "hierarchyBoundsListener", null);
        setField(term4266, term4266.getClass(), "keyListener", null);
        setField(term4266, term4266.getClass(), "mouseListener", null);
        setField(term4266, term4266.getClass(), "mouseMotionListener", null);
        setField(term4266, term4266.getClass(), "mouseWheelListener", null);
        setField(term4266, term4266.getClass(), "inputMethodListener", null);
        setLongField(term4266, term4266.getClass(), "eventMask", 0L);
        setField(term4266, term4266.getClass(), "changeSupport", null);
        setField(term4266, term4266.getClass(), "objectLock", null);
        setBooleanField(term4266, term4266.getClass(), "isPacked", false);
        setIntField(term4266, term4266.getClass(), "boundsOp", 0);
        setField(term4266, term4266.getClass(), "compoundShape", null);
        setField(term4266, term4266.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4266, term4266.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4266, term4266.getClass(), "backgroundEraseDisabled", false);
        setField(term4266, term4266.getClass(), "eventCache", null);
        setBooleanField(term4266, term4266.getClass(), "coalescingEnabled", false);
        setBooleanField(term4266, term4266.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4266, term4266.getClass(), "componentSerializedDataVersion", 0);
        setField(term4266, term4266.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initComponents", argTypes, term4266, args);
    }

};


