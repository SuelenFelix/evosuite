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

public class ProfileResp_getAvatarWear_160757545327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118188;

    public ProfileResp_getAvatarWear_160757545327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118188 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118246 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118188, term118188.getClass(), "userName", "CQDMYzEnmt");
        setIntField(term118188, term118188.getClass(), "level", 1867447684);
        setField(term118188, term118188.getClass(), "exp", "MCCXNLKile");
        setLongField(term118188, term118188.getClass(), "point", 8775279542599344811L);
        setLongField(term118188, term118188.getClass(), "totalPoint", 1472742204877182326L);
        setIntField(term118188, term118188.getClass(), "playCount", 1463683115);
        setIntField(term118188, term118188.getClass(), "playerRating", 1027146543);
        setIntField(term118188, term118188.getClass(), "highestRating", -185429346);
        setIntField(term118188, term118188.getClass(), "nameplateId", 1567008155);
        setIntField(term118188, term118188.getClass(), "frameId", 343778885);
        setIntField(term118188, term118188.getClass(), "characterId", 1926019370);
        setIntField(term118188, term118188.getClass(), "trophyId", 1496533843);
        setIntField(term118188, term118188.getClass(), "totalMapNum", -1437177897);
        setLongField(term118188, term118188.getClass(), "totalHiScore", 4220981015637651293L);
        setLongField(term118188, term118188.getClass(), "totalBasicHighScore", 3340166480123086586L);
        setLongField(term118188, term118188.getClass(), "totalAdvancedHighScore", 8645399904701489103L);
        setLongField(term118188, term118188.getClass(), "totalExpertHighScore", -1787167769341199205L);
        setLongField(term118188, term118188.getClass(), "totalMasterHighScore", 3803233753524357284L);
        setLongField(term118188, term118188.getClass(), "totalUltimaHighScore", -3179090767436662155L);
        setIntField(term118188, term118188.getClass(), "friendCount", -1875554082);
        setIntField(term118232, term118232.getClass(), "year", 2013);
        setShortField(term118232, term118232.getClass(), "month", (short) 6);
        setShortField(term118232, term118232.getClass(), "day", (short) 27);
        setField(term118231, term118231.getClass(), "date", term118232);
        setByteField(term118236, term118236.getClass(), "hour", (byte) 20);
        setByteField(term118236, term118236.getClass(), "minute", (byte) 33);
        setByteField(term118236, term118236.getClass(), "second", (byte) 55);
        setIntField(term118236, term118236.getClass(), "nano", 633734038);
        setField(term118231, term118231.getClass(), "time", term118236);
        setField(term118188, term118188.getClass(), "firstPlayDate", term118231);
        setIntField(term118242, term118242.getClass(), "year", 2013);
        setShortField(term118242, term118242.getClass(), "month", (short) 4);
        setShortField(term118242, term118242.getClass(), "day", (short) 19);
        setField(term118241, term118241.getClass(), "date", term118242);
        setByteField(term118246, term118246.getClass(), "hour", (byte) 12);
        setByteField(term118246, term118246.getClass(), "minute", (byte) 5);
        setByteField(term118246, term118246.getClass(), "second", (byte) 57);
        setIntField(term118246, term118246.getClass(), "nano", 731801276);
        setField(term118241, term118241.getClass(), "time", term118246);
        setField(term118188, term118188.getClass(), "lastPlayDate", term118241);
        setIntField(term118188, term118188.getClass(), "courseClass", -178038413);
        setIntField(term118188, term118188.getClass(), "overPowerPoint", 639529818);
        setIntField(term118188, term118188.getClass(), "overPowerRate", -670776932);
        setIntField(term118188, term118188.getClass(), "mapIconId", -1070469342);
        setIntField(term118188, term118188.getClass(), "voiceId", -1386236171);
        setIntField(term118188, term118188.getClass(), "avatarWear", 225710080);
        setIntField(term118188, term118188.getClass(), "avatarHead", 823588438);
        setIntField(term118188, term118188.getClass(), "avatarFace", -1852556078);
        setIntField(term118188, term118188.getClass(), "avatarSkin", -1462229480);
        setIntField(term118188, term118188.getClass(), "avatarItem", -704891210);
        setIntField(term118188, term118188.getClass(), "avatarFront", 1213800619);
        setIntField(term118188, term118188.getClass(), "avatarBack", -1685793429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarWear", argTypes, term118188, args);
    }

};


