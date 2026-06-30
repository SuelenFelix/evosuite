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

public class ProfileResp_getPoint_19347841383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;

    public ProfileResp_getPoint_19347841383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term250, term250.getClass(), "userName", "SzjVpOQTyS");
        setIntField(term250, term250.getClass(), "level", -226514366);
        setField(term250, term250.getClass(), "exp", "MjGYSRKTNF");
        setLongField(term250, term250.getClass(), "point", -2585684163342970173L);
        setLongField(term250, term250.getClass(), "totalPoint", 8059786003080744426L);
        setIntField(term250, term250.getClass(), "playCount", 1193880199);
        setIntField(term250, term250.getClass(), "playerRating", -1087774327);
        setIntField(term250, term250.getClass(), "highestRating", -1530420153);
        setIntField(term250, term250.getClass(), "nameplateId", -469968304);
        setIntField(term250, term250.getClass(), "frameId", -1145578966);
        setIntField(term250, term250.getClass(), "characterId", 679763016);
        setIntField(term250, term250.getClass(), "trophyId", 1962444399);
        setIntField(term250, term250.getClass(), "totalMapNum", 767834723);
        setLongField(term250, term250.getClass(), "totalHiScore", -4365849114644724155L);
        setLongField(term250, term250.getClass(), "totalBasicHighScore", 2486810210675247493L);
        setLongField(term250, term250.getClass(), "totalAdvancedHighScore", 7009926388951271268L);
        setLongField(term250, term250.getClass(), "totalExpertHighScore", -7672528020740371001L);
        setLongField(term250, term250.getClass(), "totalMasterHighScore", -4502405999831680926L);
        setIntField(term250, term250.getClass(), "friendCount", -602026508);
        setIntField(term293, term293.getClass(), "year", 2025);
        setShortField(term293, term293.getClass(), "month", (short) 4);
        setShortField(term293, term293.getClass(), "day", (short) 24);
        setField(term292, term292.getClass(), "date", term293);
        setByteField(term297, term297.getClass(), "hour", (byte) 18);
        setByteField(term297, term297.getClass(), "minute", (byte) 11);
        setByteField(term297, term297.getClass(), "second", (byte) 40);
        setIntField(term297, term297.getClass(), "nano", 137454929);
        setField(term292, term292.getClass(), "time", term297);
        setField(term250, term250.getClass(), "firstPlayDate", term292);
        setIntField(term303, term303.getClass(), "year", 2024);
        setShortField(term303, term303.getClass(), "month", (short) 1);
        setShortField(term303, term303.getClass(), "day", (short) 24);
        setField(term302, term302.getClass(), "date", term303);
        setByteField(term307, term307.getClass(), "hour", (byte) 20);
        setByteField(term307, term307.getClass(), "minute", (byte) 28);
        setByteField(term307, term307.getClass(), "second", (byte) 39);
        setIntField(term307, term307.getClass(), "nano", 952728177);
        setField(term302, term302.getClass(), "time", term307);
        setField(term250, term250.getClass(), "lastPlayDate", term302);
        setIntField(term250, term250.getClass(), "courseClass", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term250, args);
    }

};


