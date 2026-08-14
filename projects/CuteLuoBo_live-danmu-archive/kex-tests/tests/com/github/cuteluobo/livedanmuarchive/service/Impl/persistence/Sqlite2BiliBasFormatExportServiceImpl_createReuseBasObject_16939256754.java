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
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createReuseBasObject_16939256754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6718;
     Object term6876;
     Object term6878;
     Object term6880;
     Object term6882;
     Object term6884;
     Object term6910;
     Object term6916;
     Object term6918;
     Object term6920;

    public Sqlite2BiliBasFormatExportServiceImpl_createReuseBasObject_16939256754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6963 = Class.forName((String) "java.io.File$PathStatus");
        Field term6962 = ((Class) term6963).getDeclaredField((String) "INVALID");
        ((Field) term6962).setAccessible(true);
        Object enum23 = ((Field) term6962).get((Object) null);
        Class<? extends Object> term7116 = Class.forName((String) "java.io.File$PathStatus");
        Field term7115 = ((Class) term7116).getDeclaredField((String) "CHECKED");
        ((Field) term7115).setAccessible(true);
        Object enum24 = ((Field) term7115).get((Object) null);
        Object term6794 = newInstance(Class.forName("java.io.File"));
        setField(term6794, term6794.getClass(), "path", "");
        setField(term6794, term6794.getClass(), "status", enum24);
        setIntField(term6794, term6794.getClass(), "prefixLength", 1398204340);
        setField(term6794, term6794.getClass(), "filePath", null);
        ArrayList term6792 = new ArrayList();
        ((ArrayList) term6792).add(term6794);
        HashMap term6845 = new HashMap();
        HashMap term6862 = new HashMap();
        term6718 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term6755 = newInstance(Class.forName("java.io.File"));
        setField(term6718, term6718.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "PgPzMSEjjX");
        setField(term6718, term6718.getClass(), "NORMAL_COLOR", "wzsPSPcRdj");
        setField(term6718, term6718.getClass(), "liveName", "kGMQdqJYyB");
        setField(term6755, term6755.getClass(), "path", "XJJNClzHRf");
        setField(term6755, term6755.getClass(), "status", enum23);
        setIntField(term6755, term6755.getClass(), "prefixLength", -523949691);
        setField(term6755, term6755.getClass(), "filePath", null);
        setField(term6718, term6718.getClass(), "saveFilePath", term6755);
        setField(term6718, term6718.getClass(), "saveFileSuffix", "HDaezxQfQR");
        setField(term6718, term6718.getClass(), "sqliteFileList", term6792);
        setField(term6718, term6718.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term6718, term6718.getClass(), "maxFontSize", 229204365);
        setIntField(term6718, term6718.getClass(), "mixFontSize", -461771056);
        setBooleanField(term6718, term6718.getClass(), "showSenderName", false);
        setIntField(term6718, term6718.getClass(), "videoWidth", -243422082);
        setIntField(term6718, term6718.getClass(), "videoHeight", 1384592638);
        setField(term6718, term6718.getClass(), "NORMAL_STYLE_FONT", "nhoHrZfnIN");
        setField(term6718, term6718.getClass(), "NORMAL_STYLE_NAME", "ZkMALXpEAZ");
        setFloatField(term6718, term6718.getClass(), "NORMAL_FONT_SIZE", 0.7332741F);
        setField(term6718, term6718.getClass(), "fileNameTimeFormat", "tXfQjSqDzN");
        setFloatField(term6718, term6718.getClass(), "screenProp", 0.15826964F);
        setIntField(term6718, term6718.getClass(), "showTime", -1002370457);
        setField(term6718, term6718.getClass(), "danMuFormatIndexMap", term6845);
        setField(term6718, term6718.getClass(), "danMuUserInfoModelHashMap", term6862);
        term6876 = new Boolean(true);
        term6878 = new Boolean(false);
        term6880 = new Integer(-1274456137);
        term6882 = new Float(0.45691717F);
        term6884 = new Long(-2585684163342970173L);
        term6910 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setIntField(term6910, term6910.getClass(), "fontColor", 1041916673);
        setIntField(term6910, term6910.getClass(), "fontSize", 25);
        setIntField(term6910, term6910.getClass(), "textSpeed", -601863069);
        setIntField(term6910, term6910.getClass(), "transitionType", 1);
        setIntField(term6910, term6910.getClass(), "popupStyle", 663292551);
        term6916 = new Long(8059786003080744426L);
        term6918 = new Long(-4365849114644724155L);
        term6920 = new Float(0.17877543F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = float.class;
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        argTypes[8] = long.class;
        argTypes[9] = long.class;
        argTypes[10] = float.class;
        Object[] args = new Object[11];
        args[0] = term6876;
        args[1] = term6878;
        args[2] = term6880;
        args[3] = term6882;
        args[4] = term6884;
        args[5] = "RMsXuyzKJV";
        args[6] = "FwPbDZcHmB";
        args[7] = term6910;
        args[8] = term6916;
        args[9] = term6918;
        args[10] = term6920;
        callMethod(klass, "createReuseBasObject", argTypes, term6718, args);
    }

};


