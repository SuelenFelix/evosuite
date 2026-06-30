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
import java.lang.Long;

public class ProfileResp_setTotalAdvancedHighScore_201007694637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3142;
     Object term3205;

    public ProfileResp_setTotalAdvancedHighScore_201007694637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3142 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term3184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3199 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3142, term3142.getClass(), "userName", "oVgzLbrsFr");
        setIntField(term3142, term3142.getClass(), "level", 765766290);
        setField(term3142, term3142.getClass(), "exp", "vQVyKLdtaz");
        setLongField(term3142, term3142.getClass(), "point", 8000844860910174690L);
        setLongField(term3142, term3142.getClass(), "totalPoint", 2209808079059619773L);
        setIntField(term3142, term3142.getClass(), "playCount", -1284825282);
        setIntField(term3142, term3142.getClass(), "playerRating", -1941343035);
        setIntField(term3142, term3142.getClass(), "highestRating", 947897214);
        setIntField(term3142, term3142.getClass(), "nameplateId", 1496340209);
        setIntField(term3142, term3142.getClass(), "frameId", -1748391876);
        setIntField(term3142, term3142.getClass(), "characterId", 43258317);
        setIntField(term3142, term3142.getClass(), "trophyId", 1707220033);
        setIntField(term3142, term3142.getClass(), "totalMapNum", -1792504217);
        setLongField(term3142, term3142.getClass(), "totalHiScore", 8403492202041709902L);
        setLongField(term3142, term3142.getClass(), "totalBasicHighScore", -113028659747841511L);
        setLongField(term3142, term3142.getClass(), "totalAdvancedHighScore", 7271112616766426991L);
        setLongField(term3142, term3142.getClass(), "totalExpertHighScore", -8514728180792822493L);
        setLongField(term3142, term3142.getClass(), "totalMasterHighScore", 5315236285592892506L);
        setIntField(term3142, term3142.getClass(), "friendCount", 1824538861);
        setIntField(term3185, term3185.getClass(), "year", 2010);
        setShortField(term3185, term3185.getClass(), "month", (short) 2);
        setShortField(term3185, term3185.getClass(), "day", (short) 24);
        setField(term3184, term3184.getClass(), "date", term3185);
        setByteField(term3189, term3189.getClass(), "hour", (byte) 17);
        setByteField(term3189, term3189.getClass(), "minute", (byte) 58);
        setByteField(term3189, term3189.getClass(), "second", (byte) 56);
        setIntField(term3189, term3189.getClass(), "nano", 291725532);
        setField(term3184, term3184.getClass(), "time", term3189);
        setField(term3142, term3142.getClass(), "firstPlayDate", term3184);
        setIntField(term3195, term3195.getClass(), "year", 2028);
        setShortField(term3195, term3195.getClass(), "month", (short) 7);
        setShortField(term3195, term3195.getClass(), "day", (short) 22);
        setField(term3194, term3194.getClass(), "date", term3195);
        setByteField(term3199, term3199.getClass(), "hour", (byte) 18);
        setByteField(term3199, term3199.getClass(), "minute", (byte) 33);
        setByteField(term3199, term3199.getClass(), "second", (byte) 7);
        setIntField(term3199, term3199.getClass(), "nano", 763613074);
        setField(term3194, term3194.getClass(), "time", term3199);
        setField(term3142, term3142.getClass(), "lastPlayDate", term3194);
        setIntField(term3142, term3142.getClass(), "courseClass", 499519708);
        term3205 = new Long(-6969704322644192945L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3205;
        callMethod(klass, "setTotalAdvancedHighScore", argTypes, term3142, args);
    }

};


