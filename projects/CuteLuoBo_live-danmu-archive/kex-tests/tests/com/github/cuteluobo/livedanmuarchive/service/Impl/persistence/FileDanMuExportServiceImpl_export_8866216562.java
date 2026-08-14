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
import java.lang.Long;

public class FileDanMuExportServiceImpl_export_8866216562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985;
     Object term1049;

    public FileDanMuExportServiceImpl_export_8866216562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1118 = Class.forName((String) "java.io.File$PathStatus");
        Field term1117 = ((Class) term1118).getDeclaredField((String) "INVALID");
        ((Field) term1117).setAccessible(true);
        Object enum3 = ((Field) term1117).get((Object) null);
        term985 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl"));
        Object term986 = newInstance(Class.forName("java.io.File"));
        setField(term985, term985.getClass(), "logger", null);
        setField(term986, term986.getClass(), "path", "IoAlmYsBwc");
        setField(term986, term986.getClass(), "status", enum3);
        setIntField(term986, term986.getClass(), "prefixLength", 590364439);
        setField(term986, term986.getClass(), "filePath", null);
        setField(term985, term985.getClass(), "savePath", term986);
        setIntField(term985, term985.getClass(), "fileSplitMinutes", 865208305);
        setLongField(term985, term985.getClass(), "startRecordTimeStamp", -8400487765614892086L);
        setField(term985, term985.getClass(), "fileNamePrefix", "TEParAifyi");
        setField(term985, term985.getClass(), "timeExportFormat", "OWDIEULEFu");
        setField(term985, term985.getClass(), "fileNameSuffix", "dWRymuLBtr");
        Long term1093 = new Long(4872422362414183754L);
        term1049 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term1050 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term1087 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term1050, term1050.getClass(), "uid", "AijpHYOFuy");
        setField(term1050, term1050.getClass(), "nickName", "SbAoxhfrkn");
        setField(term1049, term1049.getClass(), "userIfo", term1050);
        setField(term1049, term1049.getClass(), "content", "kuTXqwMtDB");
        setIntField(term1087, term1087.getClass(), "fontColor", -1275173084);
        setIntField(term1087, term1087.getClass(), "fontSize", 25);
        setIntField(term1087, term1087.getClass(), "textSpeed", -244121226);
        setIntField(term1087, term1087.getClass(), "transitionType", 1);
        setIntField(term1087, term1087.getClass(), "popupStyle", -203030934);
        setField(term1049, term1049.getClass(), "danMuFormatData", term1087);
        setField(term1049, term1049.getClass(), "timestamp", term1093);
        setField(term1049, term1049.getClass(), "msgType", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term1049;
        callMethod(klass, "export", argTypes, term985, args);
    }

};


