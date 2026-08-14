package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_FileDTOBuilder_path_6394284155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54753;

    public FileDTO_FileDTOBuilder_path_6394284155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54754 = new Long(-6772311116874630960L);
        Long term54756 = new Long(6971596090562280868L);
        Class<? extends Object> term54874 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term54873 = ((Class) term54874).getDeclaredField((String) "LOCAL");
        ((Field) term54873).setAccessible(true);
        Object enum106 = ((Field) term54873).get((Object) null);
        Long term54804 = new Long(7340409588443647231L);
        HashMap term54850 = new HashMap();
        term54753 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term54791 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term54818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54823 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54833 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term54753, term54753.getClass(), "id", term54754);
        setField(term54753, term54753.getClass(), "userId", term54756);
        setField(term54753, term54753.getClass(), "region", enum106);
        setField(term54753, term54753.getClass(), "bucket", "HilHTbDKDF");
        setField(term54753, term54753.getClass(), "path", "IaEqlVwmNS");
        setField(term54791, term54791.getClass(), "name", "ljNOgdPWrL");
        setField(term54791, term54791.getClass(), "size", term54804);
        setField(term54791, term54791.getClass(), "type", "oBlIZiyRMS");
        setField(term54753, term54753.getClass(), "meta", term54791);
        setIntField(term54819, term54819.getClass(), "year", 2021);
        setShortField(term54819, term54819.getClass(), "month", (short) 9);
        setShortField(term54819, term54819.getClass(), "day", (short) 27);
        setField(term54818, term54818.getClass(), "date", term54819);
        setByteField(term54823, term54823.getClass(), "hour", (byte) 20);
        setByteField(term54823, term54823.getClass(), "minute", (byte) 43);
        setByteField(term54823, term54823.getClass(), "second", (byte) 41);
        setIntField(term54823, term54823.getClass(), "nano", 5544728);
        setField(term54818, term54818.getClass(), "time", term54823);
        setField(term54753, term54753.getClass(), "createdAt", term54818);
        setIntField(term54829, term54829.getClass(), "year", 2028);
        setShortField(term54829, term54829.getClass(), "month", (short) 1);
        setShortField(term54829, term54829.getClass(), "day", (short) 21);
        setField(term54828, term54828.getClass(), "date", term54829);
        setByteField(term54833, term54833.getClass(), "hour", (byte) 22);
        setByteField(term54833, term54833.getClass(), "minute", (byte) 51);
        setByteField(term54833, term54833.getClass(), "second", (byte) 58);
        setIntField(term54833, term54833.getClass(), "nano", 921867240);
        setField(term54828, term54828.getClass(), "time", term54833);
        setField(term54753, term54753.getClass(), "updatedAt", term54828);
        setField(term54753, term54753.getClass(), "url", "QUYAkhtCNh");
        setField(term54753, term54753.getClass(), "thumbs", term54850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ICBWiKaeHC";
        callMethod(klass, "path", argTypes, term54753, args);
    }

};


