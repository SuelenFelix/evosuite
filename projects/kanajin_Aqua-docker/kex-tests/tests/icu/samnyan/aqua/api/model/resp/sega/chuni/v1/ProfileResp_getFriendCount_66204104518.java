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

public class ProfileResp_getFriendCount_66204104518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1495;

    public ProfileResp_getFriendCount_66204104518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1495 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp"));
        Object term1537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1552 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1495, term1495.getClass(), "userName", "xrwlQZdwCp");
        setIntField(term1495, term1495.getClass(), "level", 1152356969);
        setField(term1495, term1495.getClass(), "exp", "IDCWpPLRkE");
        setLongField(term1495, term1495.getClass(), "point", 8313800941204938919L);
        setLongField(term1495, term1495.getClass(), "totalPoint", -1214968196781083707L);
        setIntField(term1495, term1495.getClass(), "playCount", -1667990367);
        setIntField(term1495, term1495.getClass(), "playerRating", -1214628358);
        setIntField(term1495, term1495.getClass(), "highestRating", 1102721075);
        setIntField(term1495, term1495.getClass(), "nameplateId", -426764678);
        setIntField(term1495, term1495.getClass(), "frameId", -1222614956);
        setIntField(term1495, term1495.getClass(), "characterId", -1870495012);
        setIntField(term1495, term1495.getClass(), "trophyId", -1310015129);
        setIntField(term1495, term1495.getClass(), "totalMapNum", -2104981311);
        setLongField(term1495, term1495.getClass(), "totalHiScore", -1804015692891701666L);
        setLongField(term1495, term1495.getClass(), "totalBasicHighScore", -6432617521836576658L);
        setLongField(term1495, term1495.getClass(), "totalAdvancedHighScore", -2255965562447970862L);
        setLongField(term1495, term1495.getClass(), "totalExpertHighScore", 148047808219672941L);
        setLongField(term1495, term1495.getClass(), "totalMasterHighScore", 7489064039921396098L);
        setIntField(term1495, term1495.getClass(), "friendCount", -571169753);
        setIntField(term1538, term1538.getClass(), "year", 2010);
        setShortField(term1538, term1538.getClass(), "month", (short) 1);
        setShortField(term1538, term1538.getClass(), "day", (short) 17);
        setField(term1537, term1537.getClass(), "date", term1538);
        setByteField(term1542, term1542.getClass(), "hour", (byte) 13);
        setByteField(term1542, term1542.getClass(), "minute", (byte) 5);
        setByteField(term1542, term1542.getClass(), "second", (byte) 51);
        setIntField(term1542, term1542.getClass(), "nano", 362260580);
        setField(term1537, term1537.getClass(), "time", term1542);
        setField(term1495, term1495.getClass(), "firstPlayDate", term1537);
        setIntField(term1548, term1548.getClass(), "year", 2010);
        setShortField(term1548, term1548.getClass(), "month", (short) 9);
        setShortField(term1548, term1548.getClass(), "day", (short) 28);
        setField(term1547, term1547.getClass(), "date", term1548);
        setByteField(term1552, term1552.getClass(), "hour", (byte) 6);
        setByteField(term1552, term1552.getClass(), "minute", (byte) 4);
        setByteField(term1552, term1552.getClass(), "second", (byte) 54);
        setIntField(term1552, term1552.getClass(), "nano", 604713782);
        setField(term1547, term1547.getClass(), "time", term1552);
        setField(term1495, term1495.getClass(), "lastPlayDate", term1547);
        setIntField(term1495, term1495.getClass(), "courseClass", 318591690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriendCount", argTypes, term1495, args);
    }

};


