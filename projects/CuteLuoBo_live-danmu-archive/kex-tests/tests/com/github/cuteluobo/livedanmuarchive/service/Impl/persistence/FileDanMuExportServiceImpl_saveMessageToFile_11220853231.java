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

public class FileDanMuExportServiceImpl_saveMessageToFile_11220853231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;
     Object term704;

    public FileDanMuExportServiceImpl_saveMessageToFile_11220853231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term773 = Class.forName((String) "java.io.File$PathStatus");
        Field term772 = ((Class) term773).getDeclaredField((String) "CHECKED");
        ((Field) term772).setAccessible(true);
        Object enum2 = ((Field) term772).get((Object) null);
        term640 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl"));
        Object term641 = newInstance(Class.forName("java.io.File"));
        setField(term640, term640.getClass(), "logger", null);
        setField(term641, term641.getClass(), "path", "hNxWaHcfhY");
        setField(term641, term641.getClass(), "status", enum2);
        setIntField(term641, term641.getClass(), "prefixLength", -6029667);
        setField(term641, term641.getClass(), "filePath", null);
        setField(term640, term640.getClass(), "savePath", term641);
        setIntField(term640, term640.getClass(), "fileSplitMinutes", -2068769794);
        setLongField(term640, term640.getClass(), "startRecordTimeStamp", -8257434502486459194L);
        setField(term640, term640.getClass(), "fileNamePrefix", "RkybSrpybU");
        setField(term640, term640.getClass(), "timeExportFormat", "xOEqzGAmDU");
        setField(term640, term640.getClass(), "fileNameSuffix", "eZFUvlxvGV");
        Long term748 = new Long(7411271909051562686L);
        term704 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term705 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term742 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term705, term705.getClass(), "uid", "BYqFIqCKAV");
        setField(term705, term705.getClass(), "nickName", "vrQLuWIDJX");
        setField(term704, term704.getClass(), "userIfo", term705);
        setField(term704, term704.getClass(), "content", "flxyYxBRtu");
        setIntField(term742, term742.getClass(), "fontColor", -117576464);
        setIntField(term742, term742.getClass(), "fontSize", 25);
        setIntField(term742, term742.getClass(), "textSpeed", -1007160944);
        setIntField(term742, term742.getClass(), "transitionType", 1);
        setIntField(term742, term742.getClass(), "popupStyle", 1135664017);
        setField(term704, term704.getClass(), "danMuFormatData", term742);
        setField(term704, term704.getClass(), "timestamp", term748);
        setField(term704, term704.getClass(), "msgType", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Object[] args = new Object[1];
        args[0] = term704;
        callMethod(klass, "saveMessageToFile", argTypes, term640, args);
    }

};


