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

public class ProfileResp_setLevel_5064032823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1932;
     Object term1995;

    public ProfileResp_setLevel_5064032823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1932 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1989 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1932, term1932.getClass(), "userName", "LvtrsXUliU");
        setIntField(term1932, term1932.getClass(), "level", 1507074215);
        setField(term1932, term1932.getClass(), "exp", "xLbjWUgOIL");
        setLongField(term1932, term1932.getClass(), "point", -2783999800714825789L);
        setLongField(term1932, term1932.getClass(), "totalPoint", 4266570509071948633L);
        setIntField(term1932, term1932.getClass(), "playCount", -282881827);
        setIntField(term1932, term1932.getClass(), "playerRating", -1183353915);
        setIntField(term1932, term1932.getClass(), "highestRating", -420030135);
        setIntField(term1932, term1932.getClass(), "nameplateId", 267763294);
        setIntField(term1932, term1932.getClass(), "frameId", -1497710478);
        setIntField(term1932, term1932.getClass(), "characterId", 49950830);
        setIntField(term1932, term1932.getClass(), "trophyId", -525257914);
        setIntField(term1932, term1932.getClass(), "totalMapNum", 147209682);
        setLongField(term1932, term1932.getClass(), "totalHiScore", -7291742736502427077L);
        setLongField(term1932, term1932.getClass(), "totalBasicHighScore", -8121849829073967555L);
        setLongField(term1932, term1932.getClass(), "totalAdvancedHighScore", 5219030281405653303L);
        setLongField(term1932, term1932.getClass(), "totalExpertHighScore", -8471550651709805183L);
        setLongField(term1932, term1932.getClass(), "totalMasterHighScore", -948292411727204525L);
        setIntField(term1932, term1932.getClass(), "friendCount", 34470066);
        setIntField(term1975, term1975.getClass(), "year", 2027);
        setShortField(term1975, term1975.getClass(), "month", (short) 8);
        setShortField(term1975, term1975.getClass(), "day", (short) 23);
        setField(term1974, term1974.getClass(), "date", term1975);
        setByteField(term1979, term1979.getClass(), "hour", (byte) 15);
        setByteField(term1979, term1979.getClass(), "minute", (byte) 12);
        setByteField(term1979, term1979.getClass(), "second", (byte) 6);
        setIntField(term1979, term1979.getClass(), "nano", 541218258);
        setField(term1974, term1974.getClass(), "time", term1979);
        setField(term1932, term1932.getClass(), "firstPlayDate", term1974);
        setIntField(term1985, term1985.getClass(), "year", 2013);
        setShortField(term1985, term1985.getClass(), "month", (short) 5);
        setShortField(term1985, term1985.getClass(), "day", (short) 26);
        setField(term1984, term1984.getClass(), "date", term1985);
        setByteField(term1989, term1989.getClass(), "hour", (byte) 4);
        setByteField(term1989, term1989.getClass(), "minute", (byte) 39);
        setByteField(term1989, term1989.getClass(), "second", (byte) 5);
        setIntField(term1989, term1989.getClass(), "nano", 392869354);
        setField(term1984, term1984.getClass(), "time", term1989);
        setField(term1932, term1932.getClass(), "lastPlayDate", term1984);
        setIntField(term1932, term1932.getClass(), "courseClass", 2058711405);
        term1995 = new Integer(1743683601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1995;
        callMethod(klass, "setLevel", argTypes, term1932, args);
    }

};


