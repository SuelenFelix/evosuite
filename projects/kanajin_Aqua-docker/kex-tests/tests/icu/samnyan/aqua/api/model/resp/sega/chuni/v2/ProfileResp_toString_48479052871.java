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

public class ProfileResp_toString_48479052871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122494;

    public ProfileResp_toString_48479052871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122494 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term122537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term122547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122552 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122494, term122494.getClass(), "userName", "cilVUGuAzp");
        setIntField(term122494, term122494.getClass(), "level", 424454393);
        setField(term122494, term122494.getClass(), "exp", "DEGmRHMLsx");
        setLongField(term122494, term122494.getClass(), "point", -326178667255451482L);
        setLongField(term122494, term122494.getClass(), "totalPoint", -6509162164214360986L);
        setIntField(term122494, term122494.getClass(), "playCount", 822101646);
        setIntField(term122494, term122494.getClass(), "playerRating", 1663751609);
        setIntField(term122494, term122494.getClass(), "highestRating", -568433491);
        setIntField(term122494, term122494.getClass(), "nameplateId", 1484064902);
        setIntField(term122494, term122494.getClass(), "frameId", 1108380697);
        setIntField(term122494, term122494.getClass(), "characterId", -406053057);
        setIntField(term122494, term122494.getClass(), "trophyId", -260188968);
        setIntField(term122494, term122494.getClass(), "totalMapNum", 300583917);
        setLongField(term122494, term122494.getClass(), "totalHiScore", 6528399195629894038L);
        setLongField(term122494, term122494.getClass(), "totalBasicHighScore", 3734991362872212520L);
        setLongField(term122494, term122494.getClass(), "totalAdvancedHighScore", 3957811447955161607L);
        setLongField(term122494, term122494.getClass(), "totalExpertHighScore", 4612592882614688935L);
        setLongField(term122494, term122494.getClass(), "totalMasterHighScore", 4240989961327298281L);
        setLongField(term122494, term122494.getClass(), "totalUltimaHighScore", 7859125111975904146L);
        setIntField(term122494, term122494.getClass(), "friendCount", -691121872);
        setIntField(term122538, term122538.getClass(), "year", 2021);
        setShortField(term122538, term122538.getClass(), "month", (short) 4);
        setShortField(term122538, term122538.getClass(), "day", (short) 6);
        setField(term122537, term122537.getClass(), "date", term122538);
        setByteField(term122542, term122542.getClass(), "hour", (byte) 0);
        setByteField(term122542, term122542.getClass(), "minute", (byte) 3);
        setByteField(term122542, term122542.getClass(), "second", (byte) 57);
        setIntField(term122542, term122542.getClass(), "nano", 998474916);
        setField(term122537, term122537.getClass(), "time", term122542);
        setField(term122494, term122494.getClass(), "firstPlayDate", term122537);
        setIntField(term122548, term122548.getClass(), "year", 2016);
        setShortField(term122548, term122548.getClass(), "month", (short) 12);
        setShortField(term122548, term122548.getClass(), "day", (short) 31);
        setField(term122547, term122547.getClass(), "date", term122548);
        setByteField(term122552, term122552.getClass(), "hour", (byte) 19);
        setByteField(term122552, term122552.getClass(), "minute", (byte) 42);
        setByteField(term122552, term122552.getClass(), "second", (byte) 42);
        setIntField(term122552, term122552.getClass(), "nano", 729309039);
        setField(term122547, term122547.getClass(), "time", term122552);
        setField(term122494, term122494.getClass(), "lastPlayDate", term122547);
        setIntField(term122494, term122494.getClass(), "courseClass", -619078906);
        setIntField(term122494, term122494.getClass(), "overPowerPoint", -490164887);
        setIntField(term122494, term122494.getClass(), "overPowerRate", 689303196);
        setIntField(term122494, term122494.getClass(), "mapIconId", -1903016332);
        setIntField(term122494, term122494.getClass(), "voiceId", 1870786759);
        setIntField(term122494, term122494.getClass(), "avatarWear", -971562965);
        setIntField(term122494, term122494.getClass(), "avatarHead", -1743078203);
        setIntField(term122494, term122494.getClass(), "avatarFace", 1361590273);
        setIntField(term122494, term122494.getClass(), "avatarSkin", 1899175332);
        setIntField(term122494, term122494.getClass(), "avatarItem", -1922924707);
        setIntField(term122494, term122494.getClass(), "avatarFront", -2119921035);
        setIntField(term122494, term122494.getClass(), "avatarBack", -934354700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term122494, args);
    }

};


