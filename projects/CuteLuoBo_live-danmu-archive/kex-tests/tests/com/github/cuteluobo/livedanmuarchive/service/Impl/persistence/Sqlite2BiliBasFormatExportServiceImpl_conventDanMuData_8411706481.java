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
import java.lang.Long;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Float;

public class Sqlite2BiliBasFormatExportServiceImpl_conventDanMuData_8411706481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4903;
     Object term5064;
     Object term5066;
     Object term5172;
     Object term5174;
     Object term5177;
     Object term5179;

    public Sqlite2BiliBasFormatExportServiceImpl_conventDanMuData_8411706481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5222 = Class.forName((String) "java.io.File$PathStatus");
        Field term5221 = ((Class) term5222).getDeclaredField((String) "INVALID");
        ((Field) term5221).setAccessible(true);
        Object enum17 = ((Field) term5221).get((Object) null);
        Class<? extends Object> term5375 = Class.forName((String) "java.io.File$PathStatus");
        Field term5374 = ((Class) term5375).getDeclaredField((String) "INVALID");
        ((Field) term5374).setAccessible(true);
        Object enum18 = ((Field) term5374).get((Object) null);
        Object term4979 = newInstance(Class.forName("java.io.File"));
        setField(term4979, term4979.getClass(), "path", "");
        setField(term4979, term4979.getClass(), "status", enum18);
        setIntField(term4979, term4979.getClass(), "prefixLength", 906181092);
        setField(term4979, term4979.getClass(), "filePath", null);
        Object term4984 = newInstance(Class.forName("java.io.File"));
        setField(term4984, term4984.getClass(), "path", "");
        setField(term4984, term4984.getClass(), "status", enum17);
        setIntField(term4984, term4984.getClass(), "prefixLength", 1045657203);
        setField(term4984, term4984.getClass(), "filePath", null);
        ArrayList term4977 = new ArrayList();
        ((ArrayList) term4977).add(term4979);
        ((ArrayList) term4977).add(term4984);
        HashMap term5033 = new HashMap();
        HashMap term5050 = new HashMap();
        term4903 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term4940 = newInstance(Class.forName("java.io.File"));
        setField(term4903, term4903.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "PznxWXsZME");
        setField(term4903, term4903.getClass(), "NORMAL_COLOR", "ZzIujlwVsw");
        setField(term4903, term4903.getClass(), "liveName", "LWyEaeIyAo");
        setField(term4940, term4940.getClass(), "path", "yVMkkQhvmN");
        setField(term4940, term4940.getClass(), "status", enum17);
        setIntField(term4940, term4940.getClass(), "prefixLength", -1963434938);
        setField(term4940, term4940.getClass(), "filePath", null);
        setField(term4903, term4903.getClass(), "saveFilePath", term4940);
        setField(term4903, term4903.getClass(), "saveFileSuffix", "mvrkADEgpp");
        setField(term4903, term4903.getClass(), "sqliteFileList", term4977);
        setField(term4903, term4903.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term4903, term4903.getClass(), "maxFontSize", 1386130016);
        setIntField(term4903, term4903.getClass(), "mixFontSize", 1072005683);
        setBooleanField(term4903, term4903.getClass(), "showSenderName", true);
        setIntField(term4903, term4903.getClass(), "videoWidth", 1861318859);
        setIntField(term4903, term4903.getClass(), "videoHeight", 1474524152);
        setField(term4903, term4903.getClass(), "NORMAL_STYLE_FONT", "EeBVbzjcCI");
        setField(term4903, term4903.getClass(), "NORMAL_STYLE_NAME", "UfQtPRyWRC");
        setFloatField(term4903, term4903.getClass(), "NORMAL_FONT_SIZE", 0.76550204F);
        setField(term4903, term4903.getClass(), "fileNameTimeFormat", "FPvxVzzSvD");
        setFloatField(term4903, term4903.getClass(), "screenProp", 0.26441735F);
        setIntField(term4903, term4903.getClass(), "showTime", 568954359);
        setField(term4903, term4903.getClass(), "danMuFormatIndexMap", term5033);
        setField(term4903, term4903.getClass(), "danMuUserInfoModelHashMap", term5050);
        term5064 = new Long(2535595959091595249L);
        term5066 = (Object[]) newArray("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData", 7);
        Object term5067 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5082 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5097 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5112 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5127 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5142 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term5157 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term5067, term5067.getClass(), "startTime", -5476826692763582090L);
        setField(term5067, term5067.getClass(), "content", "MwwjNtdOFT");
        setFloatField(term5067, term5067.getClass(), "fontSize", 0.13745493F);
        setElement(term5066, 0, term5067);
        setLongField(term5082, term5082.getClass(), "startTime", -872011222785455006L);
        setField(term5082, term5082.getClass(), "content", "VYkqXKVlAJ");
        setFloatField(term5082, term5082.getClass(), "fontSize", 0.20144695F);
        setElement(term5066, 1, term5082);
        setLongField(term5097, term5097.getClass(), "startTime", -316468845751588286L);
        setField(term5097, term5097.getClass(), "content", "XkIoWJRNwN");
        setFloatField(term5097, term5097.getClass(), "fontSize", 0.7031006F);
        setElement(term5066, 2, term5097);
        setLongField(term5112, term5112.getClass(), "startTime", 5127676408959197577L);
        setField(term5112, term5112.getClass(), "content", "aNWLJdrZMq");
        setFloatField(term5112, term5112.getClass(), "fontSize", 0.9431611F);
        setElement(term5066, 3, term5112);
        setLongField(term5127, term5127.getClass(), "startTime", -6573104506744284592L);
        setField(term5127, term5127.getClass(), "content", "HHmNoYxIGj");
        setFloatField(term5127, term5127.getClass(), "fontSize", 0.95272815F);
        setElement(term5066, 4, term5127);
        setLongField(term5142, term5142.getClass(), "startTime", -4920224193275732920L);
        setField(term5142, term5142.getClass(), "content", "PtirvZmsGt");
        setFloatField(term5142, term5142.getClass(), "fontSize", 0.7254646F);
        setElement(term5066, 5, term5142);
        setLongField(term5157, term5157.getClass(), "startTime", 8428634514691209827L);
        setField(term5157, term5157.getClass(), "content", "HWkpTmtlrc");
        setFloatField(term5157, term5157.getClass(), "fontSize", 0.9828442F);
        setElement(term5066, 6, term5157);
        term5172 = new Integer(480137250);
        term5174 = new LinkedList();
        term5177 = new Float(0.9472605F);
        term5179 = new Integer(-341152642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = float.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term5064;
        args[1] = term5066;
        args[2] = term5172;
        args[3] = term5174;
        args[4] = term5177;
        args[5] = term5179;
        callMethod(klass, "conventDanMuData", argTypes, term4903, args);
    }

};


