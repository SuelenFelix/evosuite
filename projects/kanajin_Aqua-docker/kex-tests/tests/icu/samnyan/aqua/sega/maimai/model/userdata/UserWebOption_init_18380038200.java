package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserWebOption_init_18380038200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37261;

    public UserWebOption_init_18380038200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37265 = new Long(1084801489398441516L);
        term37261 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term37263 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term37279 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37280 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37284 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37294 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37261, term37261.getClass(), "id", 4255811647459029682L);
        setLongField(term37263, term37263.getClass(), "id", 8000844860910174690L);
        setField(term37263, term37263.getClass(), "extId", term37265);
        setField(term37263, term37263.getClass(), "luid", "TDaodpHTRK");
        setIntField(term37280, term37280.getClass(), "year", 2019);
        setShortField(term37280, term37280.getClass(), "month", (short) 9);
        setShortField(term37280, term37280.getClass(), "day", (short) 3);
        setField(term37279, term37279.getClass(), "date", term37280);
        setByteField(term37284, term37284.getClass(), "hour", (byte) 2);
        setByteField(term37284, term37284.getClass(), "minute", (byte) 32);
        setByteField(term37284, term37284.getClass(), "second", (byte) 30);
        setIntField(term37284, term37284.getClass(), "nano", 339846128);
        setField(term37279, term37279.getClass(), "time", term37284);
        setField(term37263, term37263.getClass(), "registerTime", term37279);
        setIntField(term37290, term37290.getClass(), "year", 2029);
        setShortField(term37290, term37290.getClass(), "month", (short) 11);
        setShortField(term37290, term37290.getClass(), "day", (short) 6);
        setField(term37289, term37289.getClass(), "date", term37290);
        setByteField(term37294, term37294.getClass(), "hour", (byte) 2);
        setByteField(term37294, term37294.getClass(), "minute", (byte) 55);
        setByteField(term37294, term37294.getClass(), "second", (byte) 43);
        setIntField(term37294, term37294.getClass(), "nano", 109400580);
        setField(term37289, term37289.getClass(), "time", term37294);
        setField(term37263, term37263.getClass(), "accessTime", term37289);
        setField(term37261, term37261.getClass(), "card", term37263);
        setIntField(term37261, term37261.getClass(), "lastDataVersion", 3658317);
        setField(term37261, term37261.getClass(), "userName", "JayazbYDLK");
        setIntField(term37261, term37261.getClass(), "point", -1463342660);
        setIntField(term37261, term37261.getClass(), "totalPoint", 20803526);
        setIntField(term37261, term37261.getClass(), "iconId", 1322938574);
        setIntField(term37261, term37261.getClass(), "nameplateId", -1636808378);
        setIntField(term37261, term37261.getClass(), "frameId", 1132856767);
        setIntField(term37261, term37261.getClass(), "trophyId", 1028135109);
        setIntField(term37261, term37261.getClass(), "playCount", -576638264);
        setIntField(term37261, term37261.getClass(), "playVsCount", -582124031);
        setIntField(term37261, term37261.getClass(), "playSyncCount", -1908433542);
        setIntField(term37261, term37261.getClass(), "winCount", 700489923);
        setIntField(term37261, term37261.getClass(), "helpCount", -1490991707);
        setIntField(term37261, term37261.getClass(), "comboCount", -1869327557);
        setIntField(term37261, term37261.getClass(), "feverCount", -1846337897);
        setIntField(term37261, term37261.getClass(), "totalHiScore", 1156768326);
        setIntField(term37261, term37261.getClass(), "totalEasyHighScore", -393842466);
        setIntField(term37261, term37261.getClass(), "totalBasicHighScore", 2011572896);
        setIntField(term37261, term37261.getClass(), "totalAdvancedHighScore", 1517650676);
        setIntField(term37261, term37261.getClass(), "totalExpertHighScore", -1559743160);
        setIntField(term37261, term37261.getClass(), "totalMasterHighScore", -2067828357);
        setIntField(term37261, term37261.getClass(), "totalReMasterHighScore", -2049221981);
        setIntField(term37261, term37261.getClass(), "totalHighSync", 2046964718);
        setIntField(term37261, term37261.getClass(), "totalEasySync", 1610353449);
        setIntField(term37261, term37261.getClass(), "totalBasicSync", -1431201540);
        setIntField(term37261, term37261.getClass(), "totalAdvancedSync", 921611666);
        setIntField(term37261, term37261.getClass(), "totalExpertSync", 505159138);
        setIntField(term37261, term37261.getClass(), "totalMasterSync", 816436710);
        setIntField(term37261, term37261.getClass(), "totalReMasterSync", 1372386941);
        setIntField(term37261, term37261.getClass(), "playerRating", -558285340);
        setIntField(term37261, term37261.getClass(), "highestRating", -1351747599);
        setIntField(term37261, term37261.getClass(), "rankAuthTailId", 376811147);
        setField(term37261, term37261.getClass(), "eventWatchedDate", "ORDuSTrpNA");
        setField(term37261, term37261.getClass(), "webLimitDate", "hysThIPoEJ");
        setIntField(term37261, term37261.getClass(), "challengeTrackPhase", 1230466580);
        setIntField(term37261, term37261.getClass(), "firstPlayBits", -367049771);
        setField(term37261, term37261.getClass(), "lastPlayDate", "dfZepHfGwh");
        setIntField(term37261, term37261.getClass(), "lastPlaceId", 469812226);
        setField(term37261, term37261.getClass(), "lastPlaceName", "zjfMxUERFZ");
        setIntField(term37261, term37261.getClass(), "lastRegionId", 1798598374);
        setField(term37261, term37261.getClass(), "lastRegionName", "ooVlhmiOff");
        setField(term37261, term37261.getClass(), "lastClientId", "dUNzDLXJcj");
        setField(term37261, term37261.getClass(), "lastCountryCode", "OrVSjRJVwa");
        setIntField(term37261, term37261.getClass(), "eventPoint", -1689820547);
        setIntField(term37261, term37261.getClass(), "totalLv", 100902964);
        setIntField(term37261, term37261.getClass(), "lastLoginBonusDay", -619984116);
        setIntField(term37261, term37261.getClass(), "lastSurvivalBonusDay", -468766084);
        setIntField(term37261, term37261.getClass(), "loginBonusLv", -1511205639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term37261;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


