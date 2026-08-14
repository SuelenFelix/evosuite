package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createEventHead_13259218063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2529;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createEventHead_13259218063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2679 = Class.forName((String) "java.io.File$PathStatus");
        Field term2678 = ((Class) term2679).getDeclaredField((String) "CHECKED");
        ((Field) term2678).setAccessible(true);
        Object enum9 = ((Field) term2678).get((Object) null);
        ArrayList term2579 = new ArrayList();
        HashMap term2627 = new HashMap();
        HashMap term2644 = new HashMap();
        term2529 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term2542 = newInstance(Class.forName("java.io.File"));
        setField(term2529, term2529.getClass(), "liveName", "bLPjGVBhlX");
        setField(term2542, term2542.getClass(), "path", "whBvTVIIlC");
        setField(term2542, term2542.getClass(), "status", enum9);
        setIntField(term2542, term2542.getClass(), "prefixLength", 97029295);
        setField(term2542, term2542.getClass(), "filePath", null);
        setField(term2529, term2529.getClass(), "saveFilePath", term2542);
        setField(term2529, term2529.getClass(), "saveFileSuffix", "IgRJUzaCwW");
        setField(term2529, term2529.getClass(), "sqliteFileList", term2579);
        setField(term2529, term2529.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term2529, term2529.getClass(), "maxFontSize", -1371869594);
        setIntField(term2529, term2529.getClass(), "mixFontSize", -2095575670);
        setBooleanField(term2529, term2529.getClass(), "showSenderName", false);
        setIntField(term2529, term2529.getClass(), "videoWidth", 1225272962);
        setIntField(term2529, term2529.getClass(), "videoHeight", 1324040357);
        setField(term2529, term2529.getClass(), "NORMAL_STYLE_FONT", "JUmudUmaaV");
        setField(term2529, term2529.getClass(), "NORMAL_STYLE_NAME", "KoyGrUJeJW");
        setFloatField(term2529, term2529.getClass(), "NORMAL_FONT_SIZE", 0.5254275F);
        setField(term2529, term2529.getClass(), "fileNameTimeFormat", "HqBOwkVqjD");
        setFloatField(term2529, term2529.getClass(), "screenProp", 0.2857073F);
        setIntField(term2529, term2529.getClass(), "showTime", -1588772968);
        setField(term2529, term2529.getClass(), "danMuFormatIndexMap", term2627);
        setField(term2529, term2529.getClass(), "danMuUserInfoModelHashMap", term2644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createEventHead", argTypes, term2529, args);
    }

};


