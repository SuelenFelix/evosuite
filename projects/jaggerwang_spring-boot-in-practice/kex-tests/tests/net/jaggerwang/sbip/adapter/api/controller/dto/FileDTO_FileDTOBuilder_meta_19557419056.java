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

public class FileDTO_FileDTOBuilder_meta_19557419056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55155;
     Object term55263;

    public FileDTO_FileDTOBuilder_meta_19557419056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55156 = new Long(8307567070673352896L);
        Long term55158 = new Long(7685476896447838804L);
        Class<? extends Object> term55291 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term55290 = ((Class) term55291).getDeclaredField((String) "LOCAL");
        ((Field) term55290).setAccessible(true);
        Object enum107 = ((Field) term55290).get((Object) null);
        Long term55206 = new Long(-7583612555465533678L);
        HashMap term55252 = new HashMap();
        term55155 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder"));
        Object term55193 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term55220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55225 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55230 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55231 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55235 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term55155, term55155.getClass(), "id", term55156);
        setField(term55155, term55155.getClass(), "userId", term55158);
        setField(term55155, term55155.getClass(), "region", enum107);
        setField(term55155, term55155.getClass(), "bucket", "WAljagiCzu");
        setField(term55155, term55155.getClass(), "path", "XKMXfDZajw");
        setField(term55193, term55193.getClass(), "name", "avZoBQSrBy");
        setField(term55193, term55193.getClass(), "size", term55206);
        setField(term55193, term55193.getClass(), "type", "KIXGeHXdwi");
        setField(term55155, term55155.getClass(), "meta", term55193);
        setIntField(term55221, term55221.getClass(), "year", 2024);
        setShortField(term55221, term55221.getClass(), "month", (short) 12);
        setShortField(term55221, term55221.getClass(), "day", (short) 29);
        setField(term55220, term55220.getClass(), "date", term55221);
        setByteField(term55225, term55225.getClass(), "hour", (byte) 22);
        setByteField(term55225, term55225.getClass(), "minute", (byte) 7);
        setByteField(term55225, term55225.getClass(), "second", (byte) 1);
        setIntField(term55225, term55225.getClass(), "nano", 924286363);
        setField(term55220, term55220.getClass(), "time", term55225);
        setField(term55155, term55155.getClass(), "createdAt", term55220);
        setIntField(term55231, term55231.getClass(), "year", 2011);
        setShortField(term55231, term55231.getClass(), "month", (short) 12);
        setShortField(term55231, term55231.getClass(), "day", (short) 13);
        setField(term55230, term55230.getClass(), "date", term55231);
        setByteField(term55235, term55235.getClass(), "hour", (byte) 4);
        setByteField(term55235, term55235.getClass(), "minute", (byte) 19);
        setByteField(term55235, term55235.getClass(), "second", (byte) 3);
        setIntField(term55235, term55235.getClass(), "nano", 325415099);
        setField(term55230, term55230.getClass(), "time", term55235);
        setField(term55155, term55155.getClass(), "updatedAt", term55230);
        setField(term55155, term55155.getClass(), "url", "tTfdvLMwEE");
        setField(term55155, term55155.getClass(), "thumbs", term55252);
        Long term55276 = new Long(-1040140369921518682L);
        term55263 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        setField(term55263, term55263.getClass(), "name", "hPSZZeYqHQ");
        setField(term55263, term55263.getClass(), "size", term55276);
        setField(term55263, term55263.getClass(), "type", "scReMUKyGq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO$FileDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta");
        Object[] args = new Object[1];
        args[0] = term55263;
        callMethod(klass, "meta", argTypes, term55155, args);
    }

};


