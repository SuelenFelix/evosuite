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

public class ProfileResp_getHighestRating_3885024267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116288;

    public ProfileResp_getHighestRating_3885024267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116288 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term116331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116336 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116346 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term116288, term116288.getClass(), "userName", "uFkjaLucai");
        setIntField(term116288, term116288.getClass(), "level", 2126535448);
        setField(term116288, term116288.getClass(), "exp", "VBgGrYiYVS");
        setLongField(term116288, term116288.getClass(), "point", 2068218325920681528L);
        setLongField(term116288, term116288.getClass(), "totalPoint", 3229316393582526543L);
        setIntField(term116288, term116288.getClass(), "playCount", -960386903);
        setIntField(term116288, term116288.getClass(), "playerRating", -1909432960);
        setIntField(term116288, term116288.getClass(), "highestRating", -45762403);
        setIntField(term116288, term116288.getClass(), "nameplateId", 686712312);
        setIntField(term116288, term116288.getClass(), "frameId", -1838739398);
        setIntField(term116288, term116288.getClass(), "characterId", 1580920627);
        setIntField(term116288, term116288.getClass(), "trophyId", -1896847025);
        setIntField(term116288, term116288.getClass(), "totalMapNum", -83008051);
        setLongField(term116288, term116288.getClass(), "totalHiScore", 7987158063319221350L);
        setLongField(term116288, term116288.getClass(), "totalBasicHighScore", -8217768358078527574L);
        setLongField(term116288, term116288.getClass(), "totalAdvancedHighScore", 1833548258048611102L);
        setLongField(term116288, term116288.getClass(), "totalExpertHighScore", -3911821256636668468L);
        setLongField(term116288, term116288.getClass(), "totalMasterHighScore", -7705844481900898064L);
        setLongField(term116288, term116288.getClass(), "totalUltimaHighScore", 5717095891175483546L);
        setIntField(term116288, term116288.getClass(), "friendCount", -575632283);
        setIntField(term116332, term116332.getClass(), "year", 2018);
        setShortField(term116332, term116332.getClass(), "month", (short) 2);
        setShortField(term116332, term116332.getClass(), "day", (short) 23);
        setField(term116331, term116331.getClass(), "date", term116332);
        setByteField(term116336, term116336.getClass(), "hour", (byte) 16);
        setByteField(term116336, term116336.getClass(), "minute", (byte) 2);
        setByteField(term116336, term116336.getClass(), "second", (byte) 21);
        setIntField(term116336, term116336.getClass(), "nano", 227169316);
        setField(term116331, term116331.getClass(), "time", term116336);
        setField(term116288, term116288.getClass(), "firstPlayDate", term116331);
        setIntField(term116342, term116342.getClass(), "year", 2015);
        setShortField(term116342, term116342.getClass(), "month", (short) 9);
        setShortField(term116342, term116342.getClass(), "day", (short) 19);
        setField(term116341, term116341.getClass(), "date", term116342);
        setByteField(term116346, term116346.getClass(), "hour", (byte) 3);
        setByteField(term116346, term116346.getClass(), "minute", (byte) 19);
        setByteField(term116346, term116346.getClass(), "second", (byte) 15);
        setIntField(term116346, term116346.getClass(), "nano", 398202767);
        setField(term116341, term116341.getClass(), "time", term116346);
        setField(term116288, term116288.getClass(), "lastPlayDate", term116341);
        setIntField(term116288, term116288.getClass(), "courseClass", -1017301833);
        setIntField(term116288, term116288.getClass(), "overPowerPoint", 263254665);
        setIntField(term116288, term116288.getClass(), "overPowerRate", -1946169873);
        setIntField(term116288, term116288.getClass(), "mapIconId", -286509748);
        setIntField(term116288, term116288.getClass(), "voiceId", -1487043563);
        setIntField(term116288, term116288.getClass(), "avatarWear", -2015495456);
        setIntField(term116288, term116288.getClass(), "avatarHead", 1732948136);
        setIntField(term116288, term116288.getClass(), "avatarFace", -1904229779);
        setIntField(term116288, term116288.getClass(), "avatarSkin", 2007153651);
        setIntField(term116288, term116288.getClass(), "avatarItem", 1343239444);
        setIntField(term116288, term116288.getClass(), "avatarFront", -132548890);
        setIntField(term116288, term116288.getClass(), "avatarBack", -528909753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term116288, args);
    }

};


