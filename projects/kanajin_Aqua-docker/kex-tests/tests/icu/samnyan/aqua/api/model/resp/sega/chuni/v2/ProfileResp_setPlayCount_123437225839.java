package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setPlayCount_123437225839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119378;
     Object term119453;

    public ProfileResp_setPlayCount_123437225839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119378 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term119421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119436 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term119378, term119378.getClass(), "userName", "zJwrZrBJEV");
        setIntField(term119378, term119378.getClass(), "level", 1873725673);
        setField(term119378, term119378.getClass(), "exp", "VZVBTcOgtj");
        setLongField(term119378, term119378.getClass(), "point", 3180630027369982060L);
        setLongField(term119378, term119378.getClass(), "totalPoint", 6674236555977199465L);
        setIntField(term119378, term119378.getClass(), "playCount", -1416553615);
        setIntField(term119378, term119378.getClass(), "playerRating", -1306951218);
        setIntField(term119378, term119378.getClass(), "highestRating", -2015485460);
        setIntField(term119378, term119378.getClass(), "nameplateId", -1579496222);
        setIntField(term119378, term119378.getClass(), "frameId", -35179669);
        setIntField(term119378, term119378.getClass(), "characterId", -872486823);
        setIntField(term119378, term119378.getClass(), "trophyId", -600539158);
        setIntField(term119378, term119378.getClass(), "totalMapNum", -2068853623);
        setLongField(term119378, term119378.getClass(), "totalHiScore", -3049611432827209269L);
        setLongField(term119378, term119378.getClass(), "totalBasicHighScore", 8552991378907316462L);
        setLongField(term119378, term119378.getClass(), "totalAdvancedHighScore", 2603695605373080196L);
        setLongField(term119378, term119378.getClass(), "totalExpertHighScore", -2594505434263742926L);
        setLongField(term119378, term119378.getClass(), "totalMasterHighScore", 4609669195881358391L);
        setLongField(term119378, term119378.getClass(), "totalUltimaHighScore", -6405933697029315049L);
        setIntField(term119378, term119378.getClass(), "friendCount", 869218995);
        setIntField(term119422, term119422.getClass(), "year", 2014);
        setShortField(term119422, term119422.getClass(), "month", (short) 8);
        setShortField(term119422, term119422.getClass(), "day", (short) 5);
        setField(term119421, term119421.getClass(), "date", term119422);
        setByteField(term119426, term119426.getClass(), "hour", (byte) 15);
        setByteField(term119426, term119426.getClass(), "minute", (byte) 23);
        setByteField(term119426, term119426.getClass(), "second", (byte) 4);
        setIntField(term119426, term119426.getClass(), "nano", 313866387);
        setField(term119421, term119421.getClass(), "time", term119426);
        setField(term119378, term119378.getClass(), "firstPlayDate", term119421);
        setIntField(term119432, term119432.getClass(), "year", 2026);
        setShortField(term119432, term119432.getClass(), "month", (short) 11);
        setShortField(term119432, term119432.getClass(), "day", (short) 1);
        setField(term119431, term119431.getClass(), "date", term119432);
        setByteField(term119436, term119436.getClass(), "hour", (byte) 22);
        setByteField(term119436, term119436.getClass(), "minute", (byte) 54);
        setByteField(term119436, term119436.getClass(), "second", (byte) 43);
        setIntField(term119436, term119436.getClass(), "nano", 475420940);
        setField(term119431, term119431.getClass(), "time", term119436);
        setField(term119378, term119378.getClass(), "lastPlayDate", term119431);
        setIntField(term119378, term119378.getClass(), "courseClass", -150230629);
        setIntField(term119378, term119378.getClass(), "overPowerPoint", 926646648);
        setIntField(term119378, term119378.getClass(), "overPowerRate", -284998039);
        setIntField(term119378, term119378.getClass(), "mapIconId", 2051746635);
        setIntField(term119378, term119378.getClass(), "voiceId", 631219831);
        setIntField(term119378, term119378.getClass(), "avatarWear", -1160359109);
        setIntField(term119378, term119378.getClass(), "avatarHead", 1338692397);
        setIntField(term119378, term119378.getClass(), "avatarFace", 719473561);
        setIntField(term119378, term119378.getClass(), "avatarSkin", 10659001);
        setIntField(term119378, term119378.getClass(), "avatarItem", 101204539);
        setIntField(term119378, term119378.getClass(), "avatarFront", 1723990339);
        setIntField(term119378, term119378.getClass(), "avatarBack", 549784374);
        term119453 = new Integer(-878719656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119453;
        callMethod(klass, "setPlayCount", argTypes, term119378, args);
    }

};


