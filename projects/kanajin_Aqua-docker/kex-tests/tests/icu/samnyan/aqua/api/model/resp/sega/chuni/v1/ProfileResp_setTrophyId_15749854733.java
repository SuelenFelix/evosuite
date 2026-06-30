package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ProfileResp_setTrophyId_15749854733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2802;
     Object term2865;

    public ProfileResp_setTrophyId_15749854733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2802 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2859 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2802, term2802.getClass(), "userName", "tPlsykYBqO");
        setIntField(term2802, term2802.getClass(), "level", -1553893255);
        setField(term2802, term2802.getClass(), "exp", "bLPjGVBhlX");
        setLongField(term2802, term2802.getClass(), "point", 21047099434645581L);
        setLongField(term2802, term2802.getClass(), "totalPoint", -8862087040734407227L);
        setIntField(term2802, term2802.getClass(), "playCount", 1303442927);
        setIntField(term2802, term2802.getClass(), "playerRating", 794568325);
        setIntField(term2802, term2802.getClass(), "highestRating", -434468428);
        setIntField(term2802, term2802.getClass(), "nameplateId", 1559605714);
        setIntField(term2802, term2802.getClass(), "frameId", 1146601902);
        setIntField(term2802, term2802.getClass(), "characterId", -1938881385);
        setIntField(term2802, term2802.getClass(), "trophyId", -1629418973);
        setIntField(term2802, term2802.getClass(), "totalMapNum", -100825168);
        setLongField(term2802, term2802.getClass(), "totalHiScore", -6394943900800506753L);
        setLongField(term2802, term2802.getClass(), "totalBasicHighScore", -4867941246533901410L);
        setLongField(term2802, term2802.getClass(), "totalAdvancedHighScore", 1044883697493326351L);
        setLongField(term2802, term2802.getClass(), "totalExpertHighScore", -7406618974062419277L);
        setLongField(term2802, term2802.getClass(), "totalMasterHighScore", 868503089567085985L);
        setIntField(term2802, term2802.getClass(), "friendCount", 768407648);
        setIntField(term2845, term2845.getClass(), "year", 2018);
        setShortField(term2845, term2845.getClass(), "month", (short) 2);
        setShortField(term2845, term2845.getClass(), "day", (short) 14);
        setField(term2844, term2844.getClass(), "date", term2845);
        setByteField(term2849, term2849.getClass(), "hour", (byte) 2);
        setByteField(term2849, term2849.getClass(), "minute", (byte) 40);
        setByteField(term2849, term2849.getClass(), "second", (byte) 48);
        setIntField(term2849, term2849.getClass(), "nano", 371006728);
        setField(term2844, term2844.getClass(), "time", term2849);
        setField(term2802, term2802.getClass(), "firstPlayDate", term2844);
        setIntField(term2855, term2855.getClass(), "year", 2025);
        setShortField(term2855, term2855.getClass(), "month", (short) 8);
        setShortField(term2855, term2855.getClass(), "day", (short) 22);
        setField(term2854, term2854.getClass(), "date", term2855);
        setByteField(term2859, term2859.getClass(), "hour", (byte) 6);
        setByteField(term2859, term2859.getClass(), "minute", (byte) 48);
        setByteField(term2859, term2859.getClass(), "second", (byte) 49);
        setIntField(term2859, term2859.getClass(), "nano", 46400229);
        setField(term2854, term2854.getClass(), "time", term2859);
        setField(term2802, term2802.getClass(), "lastPlayDate", term2854);
        setIntField(term2802, term2802.getClass(), "courseClass", -350454594);
        term2865 = new Integer(-1148142995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2865;
        callMethod(klass, "setTrophyId", argTypes, term2802, args);
    }

};


