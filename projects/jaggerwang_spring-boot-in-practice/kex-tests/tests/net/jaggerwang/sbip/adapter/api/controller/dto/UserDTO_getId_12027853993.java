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

public class UserDTO_getId_12027853993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692;

    public UserDTO_getId_12027853993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term693 = new Long(2535595959091595249L);
        Long term743 = new Long(-5476826692763582090L);
        Long term778 = new Long(-872011222785455006L);
        Long term780 = new Long(-316468845751588286L);
        Class<? extends Object> term968 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term967 = ((Class) term968).getDeclaredField((String) "LOCAL");
        ((Field) term967).setAccessible(true);
        Object enum1 = ((Field) term967).get((Object) null);
        Long term828 = new Long(5127676408959197577L);
        HashMap term874 = new HashMap();
        Long term883 = new Long(-6573104506744284592L);
        Long term885 = new Long(-4920224193275732920L);
        Long term887 = new Long(8428634514691209827L);
        Long term889 = new Long(-2585684163342970173L);
        Long term891 = new Long(8059786003080744426L);
        Long term893 = new Long(-4365849114644724155L);
        Boolean term915 = new Boolean(false);
        term692 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term762 = newInstance(Class.forName("java.time.LocalTime"));
        Object term767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term777 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term815 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term857 = newInstance(Class.forName("java.time.LocalTime"));
        Object term882 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term910 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term692, term692.getClass(), "id", term693);
        setField(term692, term692.getClass(), "username", "ZiaGIbnzTs");
        setField(term692, term692.getClass(), "password", "tbcdzjIfER");
        setField(term692, term692.getClass(), "mobile", "HyxfbSQYBe");
        setField(term692, term692.getClass(), "email", "pCTimMblYc");
        setField(term692, term692.getClass(), "avatarId", term743);
        setField(term692, term692.getClass(), "intro", "hNxWaHcfhY");
        setIntField(term758, term758.getClass(), "year", 2029);
        setShortField(term758, term758.getClass(), "month", (short) 8);
        setShortField(term758, term758.getClass(), "day", (short) 29);
        setField(term757, term757.getClass(), "date", term758);
        setByteField(term762, term762.getClass(), "hour", (byte) 15);
        setByteField(term762, term762.getClass(), "minute", (byte) 50);
        setByteField(term762, term762.getClass(), "second", (byte) 1);
        setIntField(term762, term762.getClass(), "nano", 277971904);
        setField(term757, term757.getClass(), "time", term762);
        setField(term692, term692.getClass(), "createdAt", term757);
        setIntField(term768, term768.getClass(), "year", 2022);
        setShortField(term768, term768.getClass(), "month", (short) 11);
        setShortField(term768, term768.getClass(), "day", (short) 16);
        setField(term767, term767.getClass(), "date", term768);
        setByteField(term772, term772.getClass(), "hour", (byte) 15);
        setByteField(term772, term772.getClass(), "minute", (byte) 54);
        setByteField(term772, term772.getClass(), "second", (byte) 2);
        setIntField(term772, term772.getClass(), "nano", 733274103);
        setField(term767, term767.getClass(), "time", term772);
        setField(term692, term692.getClass(), "updatedAt", term767);
        setField(term777, term777.getClass(), "id", term778);
        setField(term777, term777.getClass(), "userId", term780);
        setField(term777, term777.getClass(), "region", enum1);
        setField(term777, term777.getClass(), "bucket", "RkybSrpybU");
        setField(term777, term777.getClass(), "path", "xOEqzGAmDU");
        setField(term815, term815.getClass(), "name", "eZFUvlxvGV");
        setField(term815, term815.getClass(), "size", term828);
        setField(term815, term815.getClass(), "type", "BYqFIqCKAV");
        setField(term777, term777.getClass(), "meta", term815);
        setIntField(term843, term843.getClass(), "year", 2019);
        setShortField(term843, term843.getClass(), "month", (short) 2);
        setShortField(term843, term843.getClass(), "day", (short) 21);
        setField(term842, term842.getClass(), "date", term843);
        setByteField(term847, term847.getClass(), "hour", (byte) 5);
        setByteField(term847, term847.getClass(), "minute", (byte) 41);
        setByteField(term847, term847.getClass(), "second", (byte) 11);
        setIntField(term847, term847.getClass(), "nano", 859829782);
        setField(term842, term842.getClass(), "time", term847);
        setField(term777, term777.getClass(), "createdAt", term842);
        setIntField(term853, term853.getClass(), "year", 2018);
        setShortField(term853, term853.getClass(), "month", (short) 9);
        setShortField(term853, term853.getClass(), "day", (short) 28);
        setField(term852, term852.getClass(), "date", term853);
        setByteField(term857, term857.getClass(), "hour", (byte) 3);
        setByteField(term857, term857.getClass(), "minute", (byte) 37);
        setByteField(term857, term857.getClass(), "second", (byte) 46);
        setIntField(term857, term857.getClass(), "nano", 763326845);
        setField(term852, term852.getClass(), "time", term857);
        setField(term777, term777.getClass(), "updatedAt", term852);
        setField(term777, term777.getClass(), "url", "vrQLuWIDJX");
        setField(term777, term777.getClass(), "thumbs", term874);
        setField(term692, term692.getClass(), "avatar", term777);
        setField(term882, term882.getClass(), "id", term883);
        setField(term882, term882.getClass(), "userId", term885);
        setField(term882, term882.getClass(), "postCount", term887);
        setField(term882, term882.getClass(), "likeCount", term889);
        setField(term882, term882.getClass(), "followingCount", term891);
        setField(term882, term882.getClass(), "followerCount", term893);
        setIntField(term896, term896.getClass(), "year", 2012);
        setShortField(term896, term896.getClass(), "month", (short) 9);
        setShortField(term896, term896.getClass(), "day", (short) 11);
        setField(term895, term895.getClass(), "date", term896);
        setByteField(term900, term900.getClass(), "hour", (byte) 22);
        setByteField(term900, term900.getClass(), "minute", (byte) 10);
        setByteField(term900, term900.getClass(), "second", (byte) 8);
        setIntField(term900, term900.getClass(), "nano", 380008862);
        setField(term895, term895.getClass(), "time", term900);
        setField(term882, term882.getClass(), "createdAt", term895);
        setIntField(term906, term906.getClass(), "year", 2021);
        setShortField(term906, term906.getClass(), "month", (short) 9);
        setShortField(term906, term906.getClass(), "day", (short) 7);
        setField(term905, term905.getClass(), "date", term906);
        setByteField(term910, term910.getClass(), "hour", (byte) 5);
        setByteField(term910, term910.getClass(), "minute", (byte) 25);
        setByteField(term910, term910.getClass(), "second", (byte) 7);
        setIntField(term910, term910.getClass(), "nano", 755924076);
        setField(term905, term905.getClass(), "time", term910);
        setField(term882, term882.getClass(), "updatedAt", term905);
        setField(term692, term692.getClass(), "stat", term882);
        setField(term692, term692.getClass(), "following", term915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term692, args);
    }

};


