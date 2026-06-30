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

public class ProfileResp_getCourseClass_162107284121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1744;

    public ProfileResp_getCourseClass_162107284121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1744 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1786 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1787 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1791 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1796 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1797 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1801 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1744, term1744.getClass(), "userName", "gGSMzuGICf");
        setIntField(term1744, term1744.getClass(), "level", -860131894);
        setField(term1744, term1744.getClass(), "exp", "hxCBltsObl");
        setLongField(term1744, term1744.getClass(), "point", -4598158870068953328L);
        setLongField(term1744, term1744.getClass(), "totalPoint", 138235087558060686L);
        setIntField(term1744, term1744.getClass(), "playCount", -1022990421);
        setIntField(term1744, term1744.getClass(), "playerRating", 1045547089);
        setIntField(term1744, term1744.getClass(), "highestRating", -1122880881);
        setIntField(term1744, term1744.getClass(), "nameplateId", -542712742);
        setIntField(term1744, term1744.getClass(), "frameId", -1254072822);
        setIntField(term1744, term1744.getClass(), "characterId", -1111249833);
        setIntField(term1744, term1744.getClass(), "trophyId", -1692331299);
        setIntField(term1744, term1744.getClass(), "totalMapNum", 479531250);
        setLongField(term1744, term1744.getClass(), "totalHiScore", 5381386339318883012L);
        setLongField(term1744, term1744.getClass(), "totalBasicHighScore", -1333707622307134180L);
        setLongField(term1744, term1744.getClass(), "totalAdvancedHighScore", -4360569253593381888L);
        setLongField(term1744, term1744.getClass(), "totalExpertHighScore", 1457594663983990440L);
        setLongField(term1744, term1744.getClass(), "totalMasterHighScore", 3452833434644634217L);
        setIntField(term1744, term1744.getClass(), "friendCount", 1320570890);
        setIntField(term1787, term1787.getClass(), "year", 2020);
        setShortField(term1787, term1787.getClass(), "month", (short) 8);
        setShortField(term1787, term1787.getClass(), "day", (short) 15);
        setField(term1786, term1786.getClass(), "date", term1787);
        setByteField(term1791, term1791.getClass(), "hour", (byte) 2);
        setByteField(term1791, term1791.getClass(), "minute", (byte) 0);
        setByteField(term1791, term1791.getClass(), "second", (byte) 38);
        setIntField(term1791, term1791.getClass(), "nano", 146431486);
        setField(term1786, term1786.getClass(), "time", term1791);
        setField(term1744, term1744.getClass(), "firstPlayDate", term1786);
        setIntField(term1797, term1797.getClass(), "year", 2014);
        setShortField(term1797, term1797.getClass(), "month", (short) 11);
        setShortField(term1797, term1797.getClass(), "day", (short) 8);
        setField(term1796, term1796.getClass(), "date", term1797);
        setByteField(term1801, term1801.getClass(), "hour", (byte) 8);
        setByteField(term1801, term1801.getClass(), "minute", (byte) 43);
        setByteField(term1801, term1801.getClass(), "second", (byte) 32);
        setIntField(term1801, term1801.getClass(), "nano", 154434838);
        setField(term1796, term1796.getClass(), "time", term1801);
        setField(term1744, term1744.getClass(), "lastPlayDate", term1796);
        setIntField(term1744, term1744.getClass(), "courseClass", -130649791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseClass", argTypes, term1744, args);
    }

};


