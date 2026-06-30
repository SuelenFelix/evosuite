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

public class ProfileResp_setPlayCount_72881363327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2292;
     Object term2355;

    public ProfileResp_setPlayCount_72881363327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2292 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term2334 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2335 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2339 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2344 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2349 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2292, term2292.getClass(), "userName", "ffYhPOzlUs");
        setIntField(term2292, term2292.getClass(), "level", 1252951645);
        setField(term2292, term2292.getClass(), "exp", "MLqYREekMl");
        setLongField(term2292, term2292.getClass(), "point", -1000830646340880796L);
        setLongField(term2292, term2292.getClass(), "totalPoint", 5973526439563541711L);
        setIntField(term2292, term2292.getClass(), "playCount", 574481092);
        setIntField(term2292, term2292.getClass(), "playerRating", -310528004);
        setIntField(term2292, term2292.getClass(), "highestRating", -634976996);
        setIntField(term2292, term2292.getClass(), "nameplateId", -1015274146);
        setIntField(term2292, term2292.getClass(), "frameId", -49052672);
        setIntField(term2292, term2292.getClass(), "characterId", 339372704);
        setIntField(term2292, term2292.getClass(), "trophyId", -851097944);
        setIntField(term2292, term2292.getClass(), "totalMapNum", 803925431);
        setLongField(term2292, term2292.getClass(), "totalHiScore", 5246058710498845622L);
        setLongField(term2292, term2292.getClass(), "totalBasicHighScore", 4394651392080968777L);
        setLongField(term2292, term2292.getClass(), "totalAdvancedHighScore", -7310273014364148916L);
        setLongField(term2292, term2292.getClass(), "totalExpertHighScore", 8863790908271299748L);
        setLongField(term2292, term2292.getClass(), "totalMasterHighScore", 9205327385733285058L);
        setIntField(term2292, term2292.getClass(), "friendCount", 76929641);
        setIntField(term2335, term2335.getClass(), "year", 2025);
        setShortField(term2335, term2335.getClass(), "month", (short) 9);
        setShortField(term2335, term2335.getClass(), "day", (short) 25);
        setField(term2334, term2334.getClass(), "date", term2335);
        setByteField(term2339, term2339.getClass(), "hour", (byte) 20);
        setByteField(term2339, term2339.getClass(), "minute", (byte) 0);
        setByteField(term2339, term2339.getClass(), "second", (byte) 25);
        setIntField(term2339, term2339.getClass(), "nano", 65871584);
        setField(term2334, term2334.getClass(), "time", term2339);
        setField(term2292, term2292.getClass(), "firstPlayDate", term2334);
        setIntField(term2345, term2345.getClass(), "year", 2011);
        setShortField(term2345, term2345.getClass(), "month", (short) 9);
        setShortField(term2345, term2345.getClass(), "day", (short) 25);
        setField(term2344, term2344.getClass(), "date", term2345);
        setByteField(term2349, term2349.getClass(), "hour", (byte) 16);
        setByteField(term2349, term2349.getClass(), "minute", (byte) 45);
        setByteField(term2349, term2349.getClass(), "second", (byte) 19);
        setIntField(term2349, term2349.getClass(), "nano", 962864785);
        setField(term2344, term2344.getClass(), "time", term2349);
        setField(term2292, term2292.getClass(), "lastPlayDate", term2344);
        setIntField(term2292, term2292.getClass(), "courseClass", -2003192918);
        term2355 = new Integer(-1362856620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2355;
        callMethod(klass, "setPlayCount", argTypes, term2292, args);
    }

};


