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

public class ProfileResp_setCourseClass_84607888143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3668;
     Object term3731;

    public ProfileResp_setCourseClass_84607888143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3668 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3725 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3668, term3668.getClass(), "userName", "PkWMRdJcBb");
        setIntField(term3668, term3668.getClass(), "level", -1549607466);
        setField(term3668, term3668.getClass(), "exp", "jSpAteRute");
        setLongField(term3668, term3668.getClass(), "point", -5935517391653614345L);
        setLongField(term3668, term3668.getClass(), "totalPoint", -6521561238735301071L);
        setIntField(term3668, term3668.getClass(), "playCount", 853609788);
        setIntField(term3668, term3668.getClass(), "playerRating", -197820800);
        setIntField(term3668, term3668.getClass(), "highestRating", 723812297);
        setIntField(term3668, term3668.getClass(), "nameplateId", 1639448749);
        setIntField(term3668, term3668.getClass(), "frameId", 873659088);
        setIntField(term3668, term3668.getClass(), "characterId", -975748721);
        setIntField(term3668, term3668.getClass(), "trophyId", 433248783);
        setIntField(term3668, term3668.getClass(), "totalMapNum", -507944154);
        setLongField(term3668, term3668.getClass(), "totalHiScore", -6609679920238945303L);
        setLongField(term3668, term3668.getClass(), "totalBasicHighScore", -7296330380944173376L);
        setLongField(term3668, term3668.getClass(), "totalAdvancedHighScore", -8890284990655172580L);
        setLongField(term3668, term3668.getClass(), "totalExpertHighScore", -5951743062322506095L);
        setLongField(term3668, term3668.getClass(), "totalMasterHighScore", 768144790810175653L);
        setIntField(term3668, term3668.getClass(), "friendCount", -1736183862);
        setIntField(term3711, term3711.getClass(), "year", 2023);
        setShortField(term3711, term3711.getClass(), "month", (short) 5);
        setShortField(term3711, term3711.getClass(), "day", (short) 23);
        setField(term3710, term3710.getClass(), "date", term3711);
        setByteField(term3715, term3715.getClass(), "hour", (byte) 0);
        setByteField(term3715, term3715.getClass(), "minute", (byte) 50);
        setByteField(term3715, term3715.getClass(), "second", (byte) 5);
        setIntField(term3715, term3715.getClass(), "nano", 296286825);
        setField(term3710, term3710.getClass(), "time", term3715);
        setField(term3668, term3668.getClass(), "firstPlayDate", term3710);
        setIntField(term3721, term3721.getClass(), "year", 2015);
        setShortField(term3721, term3721.getClass(), "month", (short) 2);
        setShortField(term3721, term3721.getClass(), "day", (short) 5);
        setField(term3720, term3720.getClass(), "date", term3721);
        setByteField(term3725, term3725.getClass(), "hour", (byte) 3);
        setByteField(term3725, term3725.getClass(), "minute", (byte) 26);
        setByteField(term3725, term3725.getClass(), "second", (byte) 49);
        setIntField(term3725, term3725.getClass(), "nano", 995758570);
        setField(term3720, term3720.getClass(), "time", term3725);
        setField(term3668, term3668.getClass(), "lastPlayDate", term3720);
        setIntField(term3668, term3668.getClass(), "courseClass", 897010381);
        term3731 = new Integer(-15712667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3731;
        callMethod(klass, "setCourseClass", argTypes, term3668, args);
    }

};


