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

public class FileDTO_FileDTOBuilder_updatedAt_11539005788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55972;
     Object term56080;

    public FileDTO_FileDTOBuilder_updatedAt_11539005788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55973 = new Long(-6376003179103732362L);
        Long term55975 = new Long(-2050936198165389315L);
        Class<? extends Object> term56091 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term56090 = ((Class) term56091).getDeclaredField((String) "LOCAL");
        ((Field) term56090).setAccessible(true);
        Object enum109 = ((Field) term56090).get((Object) null);
        Long term56023 = new Long(-8751837616810275039L);
        HashMap term56069 = new HashMap();
        term55972 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term56010 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term56037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56042 = newInstance(Class.forName("java.time.LocalTime"));
        Object term56047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56052 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term55972, term55972.getClass(), "id", term55973);
        setField(term55972, term55972.getClass(), "userId", term55975);
        setField(term55972, term55972.getClass(), "region", enum109);
        setField(term55972, term55972.getClass(), "bucket", "OLYhTSqTqJ");
        setField(term55972, term55972.getClass(), "path", "AIHoadcpQz");
        setField(term56010, term56010.getClass(), "name", "fWMsLtuOEV");
        setField(term56010, term56010.getClass(), "size", term56023);
        setField(term56010, term56010.getClass(), "type", "fvgZQBalnd");
        setField(term55972, term55972.getClass(), "meta", term56010);
        setIntField(term56038, term56038.getClass(), "year", 2028);
        setShortField(term56038, term56038.getClass(), "month", (short) 1);
        setShortField(term56038, term56038.getClass(), "day", (short) 9);
        setField(term56037, term56037.getClass(), "date", term56038);
        setByteField(term56042, term56042.getClass(), "hour", (byte) 10);
        setByteField(term56042, term56042.getClass(), "minute", (byte) 17);
        setByteField(term56042, term56042.getClass(), "second", (byte) 24);
        setIntField(term56042, term56042.getClass(), "nano", 95983008);
        setField(term56037, term56037.getClass(), "time", term56042);
        setField(term55972, term55972.getClass(), "createdAt", term56037);
        setIntField(term56048, term56048.getClass(), "year", 2016);
        setShortField(term56048, term56048.getClass(), "month", (short) 12);
        setShortField(term56048, term56048.getClass(), "day", (short) 23);
        setField(term56047, term56047.getClass(), "date", term56048);
        setByteField(term56052, term56052.getClass(), "hour", (byte) 13);
        setByteField(term56052, term56052.getClass(), "minute", (byte) 59);
        setByteField(term56052, term56052.getClass(), "second", (byte) 38);
        setIntField(term56052, term56052.getClass(), "nano", 70840095);
        setField(term56047, term56047.getClass(), "time", term56052);
        setField(term55972, term55972.getClass(), "updatedAt", term56047);
        setField(term55972, term55972.getClass(), "url", "tViQSKUCLE");
        setField(term55972, term55972.getClass(), "thumbs", term56069);
        term56080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term56085 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term56081, term56081.getClass(), "year", 2029);
        setShortField(term56081, term56081.getClass(), "month", (short) 7);
        setShortField(term56081, term56081.getClass(), "day", (short) 14);
        setField(term56080, term56080.getClass(), "date", term56081);
        setByteField(term56085, term56085.getClass(), "hour", (byte) 23);
        setByteField(term56085, term56085.getClass(), "minute", (byte) 7);
        setByteField(term56085, term56085.getClass(), "second", (byte) 5);
        setIntField(term56085, term56085.getClass(), "nano", 909102915);
        setField(term56080, term56080.getClass(), "time", term56085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term56080;
        callMethod(klass, "updatedAt", argTypes, term55972, args);
    }

};


