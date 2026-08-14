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
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createShowCode_20539138058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8996;
     Object term9184;
     Object term9198;
     Object term9200;

    public Sqlite2BiliBasFormatExportServiceImpl_createShowCode_20539138058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9243 = Class.forName((String) "java.io.File$PathStatus");
        Field term9242 = ((Class) term9243).getDeclaredField((String) "INVALID");
        ((Field) term9242).setAccessible(true);
        Object enum31 = ((Field) term9242).get((Object) null);
        Class<? extends Object> term9396 = Class.forName((String) "java.io.File$PathStatus");
        Field term9395 = ((Class) term9396).getDeclaredField((String) "INVALID");
        ((Field) term9395).setAccessible(true);
        Object enum32 = ((Field) term9395).get((Object) null);
        Object term9072 = newInstance(Class.forName("java.io.File"));
        setField(term9072, term9072.getClass(), "path", "");
        setField(term9072, term9072.getClass(), "status", enum32);
        setIntField(term9072, term9072.getClass(), "prefixLength", 880977281);
        setField(term9072, term9072.getClass(), "filePath", null);
        Object term9077 = newInstance(Class.forName("java.io.File"));
        setField(term9077, term9077.getClass(), "path", "");
        setField(term9077, term9077.getClass(), "status", enum31);
        setIntField(term9077, term9077.getClass(), "prefixLength", 371943306);
        setField(term9077, term9077.getClass(), "filePath", null);
        Object term9080 = newInstance(Class.forName("java.io.File"));
        setField(term9080, term9080.getClass(), "path", "");
        setField(term9080, term9080.getClass(), "status", enum31);
        setIntField(term9080, term9080.getClass(), "prefixLength", 982388293);
        setField(term9080, term9080.getClass(), "filePath", null);
        ArrayList term9070 = new ArrayList();
        ((ArrayList) term9070).add(term9072);
        ((ArrayList) term9070).add(term9077);
        ((ArrayList) term9070).add(term9080);
        HashMap term9129 = new HashMap();
        HashMap term9146 = new HashMap();
        term8996 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term9033 = newInstance(Class.forName("java.io.File"));
        setField(term8996, term8996.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "pvDEABOxLt");
        setField(term8996, term8996.getClass(), "NORMAL_COLOR", "beAMpkroCQ");
        setField(term8996, term8996.getClass(), "liveName", "uSUvKAyuvd");
        setField(term9033, term9033.getClass(), "path", "onQLVONGuf");
        setField(term9033, term9033.getClass(), "status", enum31);
        setIntField(term9033, term9033.getClass(), "prefixLength", 282916351);
        setField(term9033, term9033.getClass(), "filePath", null);
        setField(term8996, term8996.getClass(), "saveFilePath", term9033);
        setField(term8996, term8996.getClass(), "saveFileSuffix", "SOrEHbcbmn");
        setField(term8996, term8996.getClass(), "sqliteFileList", term9070);
        setField(term8996, term8996.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term8996, term8996.getClass(), "maxFontSize", -159494544);
        setIntField(term8996, term8996.getClass(), "mixFontSize", -75206835);
        setBooleanField(term8996, term8996.getClass(), "showSenderName", true);
        setIntField(term8996, term8996.getClass(), "videoWidth", -1618206977);
        setIntField(term8996, term8996.getClass(), "videoHeight", -1747406163);
        setField(term8996, term8996.getClass(), "NORMAL_STYLE_FONT", "SPtPatHeOm");
        setField(term8996, term8996.getClass(), "NORMAL_STYLE_NAME", "ywmcuThdfL");
        setFloatField(term8996, term8996.getClass(), "NORMAL_FONT_SIZE", 0.38000882F);
        setField(term8996, term8996.getClass(), "fileNameTimeFormat", "GBOEuByOfr");
        setFloatField(term8996, term8996.getClass(), "screenProp", 0.10577053F);
        setIntField(term8996, term8996.getClass(), "showTime", 388157121);
        setField(term8996, term8996.getClass(), "danMuFormatIndexMap", term9129);
        setField(term8996, term8996.getClass(), "danMuUserInfoModelHashMap", term9146);
        term9184 = new Float(0.5840714F);
        term9198 = new Long(-7672528020740371001L);
        term9200 = new Float(0.478669F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = float.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = float.class;
        Object[] args = new Object[6];
        args[0] = "OcfNzHYdki";
        args[1] = "uPuCVuZYOI";
        args[2] = term9184;
        args[3] = "TweMFhxNdj";
        args[4] = term9198;
        args[5] = term9200;
        callMethod(klass, "createShowCode", argTypes, term8996, args);
    }

};


