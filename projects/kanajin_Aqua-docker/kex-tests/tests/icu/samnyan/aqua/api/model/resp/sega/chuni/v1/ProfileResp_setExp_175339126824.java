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

public class ProfileResp_setExp_175339126824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2017;

    public ProfileResp_setExp_175339126824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2017 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2064 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2074 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2017, term2017.getClass(), "userName", "jDtqGUpnZN");
        setIntField(term2017, term2017.getClass(), "level", -945116798);
        setField(term2017, term2017.getClass(), "exp", "nGKItKLYNC");
        setLongField(term2017, term2017.getClass(), "point", -8892586408602479513L);
        setLongField(term2017, term2017.getClass(), "totalPoint", 4616440478358528406L);
        setIntField(term2017, term2017.getClass(), "playCount", 1593461795);
        setIntField(term2017, term2017.getClass(), "playerRating", 515182546);
        setIntField(term2017, term2017.getClass(), "highestRating", -936895502);
        setIntField(term2017, term2017.getClass(), "nameplateId", -129547140);
        setIntField(term2017, term2017.getClass(), "frameId", 199287428);
        setIntField(term2017, term2017.getClass(), "characterId", -1195339592);
        setIntField(term2017, term2017.getClass(), "trophyId", -376422566);
        setIntField(term2017, term2017.getClass(), "totalMapNum", 306847454);
        setLongField(term2017, term2017.getClass(), "totalHiScore", 3427570961451840069L);
        setLongField(term2017, term2017.getClass(), "totalBasicHighScore", 4502292577098212311L);
        setLongField(term2017, term2017.getClass(), "totalAdvancedHighScore", -3730936709704460408L);
        setLongField(term2017, term2017.getClass(), "totalExpertHighScore", -8614778293741404325L);
        setLongField(term2017, term2017.getClass(), "totalMasterHighScore", -5447369594017685765L);
        setIntField(term2017, term2017.getClass(), "friendCount", 1745276158);
        setIntField(term2060, term2060.getClass(), "year", 2012);
        setShortField(term2060, term2060.getClass(), "month", (short) 4);
        setShortField(term2060, term2060.getClass(), "day", (short) 25);
        setField(term2059, term2059.getClass(), "date", term2060);
        setByteField(term2064, term2064.getClass(), "hour", (byte) 21);
        setByteField(term2064, term2064.getClass(), "minute", (byte) 14);
        setByteField(term2064, term2064.getClass(), "second", (byte) 15);
        setIntField(term2064, term2064.getClass(), "nano", 561700934);
        setField(term2059, term2059.getClass(), "time", term2064);
        setField(term2017, term2017.getClass(), "firstPlayDate", term2059);
        setIntField(term2070, term2070.getClass(), "year", 2011);
        setShortField(term2070, term2070.getClass(), "month", (short) 10);
        setShortField(term2070, term2070.getClass(), "day", (short) 25);
        setField(term2069, term2069.getClass(), "date", term2070);
        setByteField(term2074, term2074.getClass(), "hour", (byte) 10);
        setByteField(term2074, term2074.getClass(), "minute", (byte) 33);
        setByteField(term2074, term2074.getClass(), "second", (byte) 8);
        setIntField(term2074, term2074.getClass(), "nano", 268304014);
        setField(term2069, term2069.getClass(), "time", term2074);
        setField(term2017, term2017.getClass(), "lastPlayDate", term2069);
        setIntField(term2017, term2017.getClass(), "courseClass", 2009020256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setExp", argTypes, term2017, args);
    }

};


