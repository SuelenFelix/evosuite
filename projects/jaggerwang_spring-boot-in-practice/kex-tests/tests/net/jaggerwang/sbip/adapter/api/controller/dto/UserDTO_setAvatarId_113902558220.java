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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_setAvatarId_113902558220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10081;
     Object term10306;

    public UserDTO_setAvatarId_113902558220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10082 = new Long(-1885698929232124806L);
        Long term10132 = new Long(5731563613239387113L);
        Long term10167 = new Long(3381333711768010594L);
        Long term10169 = new Long(3580984732036213717L);
        Class<? extends Object> term10359 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term10358 = ((Class) term10359).getDeclaredField((String) "LOCAL");
        ((Field) term10358).setAccessible(true);
        Object enum18 = ((Field) term10358).get((Object) null);
        Long term10217 = new Long(5330761990446327930L);
        HashMap term10263 = new HashMap();
        Long term10272 = new Long(-3954795081650780841L);
        Long term10274 = new Long(3288791194263207397L);
        Long term10276 = new Long(3288941170644426558L);
        Long term10278 = new Long(-8338004844694486146L);
        Long term10280 = new Long(6426732259596412988L);
        Long term10282 = new Long(185793058502220865L);
        Boolean term10304 = new Boolean(false);
        term10081 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term10146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10151 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10166 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term10204 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term10231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10246 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10271 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term10284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10299 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10081, term10081.getClass(), "id", term10082);
        setField(term10081, term10081.getClass(), "username", "AZdLeSugwv");
        setField(term10081, term10081.getClass(), "password", "RMsXuyzKJV");
        setField(term10081, term10081.getClass(), "mobile", "FwPbDZcHmB");
        setField(term10081, term10081.getClass(), "email", "hOncybyCAH");
        setField(term10081, term10081.getClass(), "avatarId", term10132);
        setField(term10081, term10081.getClass(), "intro", "QduALnDSVo");
        setIntField(term10147, term10147.getClass(), "year", 2029);
        setShortField(term10147, term10147.getClass(), "month", (short) 7);
        setShortField(term10147, term10147.getClass(), "day", (short) 19);
        setField(term10146, term10146.getClass(), "date", term10147);
        setByteField(term10151, term10151.getClass(), "hour", (byte) 17);
        setByteField(term10151, term10151.getClass(), "minute", (byte) 37);
        setByteField(term10151, term10151.getClass(), "second", (byte) 21);
        setIntField(term10151, term10151.getClass(), "nano", 320093277);
        setField(term10146, term10146.getClass(), "time", term10151);
        setField(term10081, term10081.getClass(), "createdAt", term10146);
        setIntField(term10157, term10157.getClass(), "year", 2028);
        setShortField(term10157, term10157.getClass(), "month", (short) 1);
        setShortField(term10157, term10157.getClass(), "day", (short) 11);
        setField(term10156, term10156.getClass(), "date", term10157);
        setByteField(term10161, term10161.getClass(), "hour", (byte) 22);
        setByteField(term10161, term10161.getClass(), "minute", (byte) 3);
        setByteField(term10161, term10161.getClass(), "second", (byte) 39);
        setIntField(term10161, term10161.getClass(), "nano", 175567313);
        setField(term10156, term10156.getClass(), "time", term10161);
        setField(term10081, term10081.getClass(), "updatedAt", term10156);
        setField(term10166, term10166.getClass(), "id", term10167);
        setField(term10166, term10166.getClass(), "userId", term10169);
        setField(term10166, term10166.getClass(), "region", enum18);
        setField(term10166, term10166.getClass(), "bucket", "izPpKDErnQ");
        setField(term10166, term10166.getClass(), "path", "NnpwZBUTvx");
        setField(term10204, term10204.getClass(), "name", "tlQSNgTkQX");
        setField(term10204, term10204.getClass(), "size", term10217);
        setField(term10204, term10204.getClass(), "type", "PCipZnmBOF");
        setField(term10166, term10166.getClass(), "meta", term10204);
        setIntField(term10232, term10232.getClass(), "year", 2028);
        setShortField(term10232, term10232.getClass(), "month", (short) 4);
        setShortField(term10232, term10232.getClass(), "day", (short) 11);
        setField(term10231, term10231.getClass(), "date", term10232);
        setByteField(term10236, term10236.getClass(), "hour", (byte) 4);
        setByteField(term10236, term10236.getClass(), "minute", (byte) 45);
        setByteField(term10236, term10236.getClass(), "second", (byte) 2);
        setIntField(term10236, term10236.getClass(), "nano", 374177968);
        setField(term10231, term10231.getClass(), "time", term10236);
        setField(term10166, term10166.getClass(), "createdAt", term10231);
        setIntField(term10242, term10242.getClass(), "year", 2021);
        setShortField(term10242, term10242.getClass(), "month", (short) 4);
        setShortField(term10242, term10242.getClass(), "day", (short) 22);
        setField(term10241, term10241.getClass(), "date", term10242);
        setByteField(term10246, term10246.getClass(), "hour", (byte) 17);
        setByteField(term10246, term10246.getClass(), "minute", (byte) 6);
        setByteField(term10246, term10246.getClass(), "second", (byte) 33);
        setIntField(term10246, term10246.getClass(), "nano", 21410850);
        setField(term10241, term10241.getClass(), "time", term10246);
        setField(term10166, term10166.getClass(), "updatedAt", term10241);
        setField(term10166, term10166.getClass(), "url", "zcorEihhLK");
        setField(term10166, term10166.getClass(), "thumbs", term10263);
        setField(term10081, term10081.getClass(), "avatar", term10166);
        setField(term10271, term10271.getClass(), "id", term10272);
        setField(term10271, term10271.getClass(), "userId", term10274);
        setField(term10271, term10271.getClass(), "postCount", term10276);
        setField(term10271, term10271.getClass(), "likeCount", term10278);
        setField(term10271, term10271.getClass(), "followingCount", term10280);
        setField(term10271, term10271.getClass(), "followerCount", term10282);
        setIntField(term10285, term10285.getClass(), "year", 2026);
        setShortField(term10285, term10285.getClass(), "month", (short) 10);
        setShortField(term10285, term10285.getClass(), "day", (short) 19);
        setField(term10284, term10284.getClass(), "date", term10285);
        setByteField(term10289, term10289.getClass(), "hour", (byte) 7);
        setByteField(term10289, term10289.getClass(), "minute", (byte) 22);
        setByteField(term10289, term10289.getClass(), "second", (byte) 11);
        setIntField(term10289, term10289.getClass(), "nano", 17846677);
        setField(term10284, term10284.getClass(), "time", term10289);
        setField(term10271, term10271.getClass(), "createdAt", term10284);
        setIntField(term10295, term10295.getClass(), "year", 2018);
        setShortField(term10295, term10295.getClass(), "month", (short) 10);
        setShortField(term10295, term10295.getClass(), "day", (short) 17);
        setField(term10294, term10294.getClass(), "date", term10295);
        setByteField(term10299, term10299.getClass(), "hour", (byte) 5);
        setByteField(term10299, term10299.getClass(), "minute", (byte) 10);
        setByteField(term10299, term10299.getClass(), "second", (byte) 23);
        setIntField(term10299, term10299.getClass(), "nano", 571520422);
        setField(term10294, term10294.getClass(), "time", term10299);
        setField(term10271, term10271.getClass(), "updatedAt", term10294);
        setField(term10081, term10081.getClass(), "stat", term10271);
        setField(term10081, term10081.getClass(), "following", term10304);
        term10306 = new Long(-7698746988132548371L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term10306;
        callMethod(klass, "setAvatarId", argTypes, term10081, args);
    }

};


