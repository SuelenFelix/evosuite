package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getPlayCount_203065837810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4011;

    public ExternalUserData_getPlayCount_203065837810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4011 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term4036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4041 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4102 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4191 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4192 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4196 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4011, term4011.getClass(), "accessCode", "jwsfVjMoJT");
        setField(term4011, term4011.getClass(), "userName", "ZfdXfCCFDf");
        setIntField(term4037, term4037.getClass(), "year", 2015);
        setShortField(term4037, term4037.getClass(), "month", (short) 12);
        setShortField(term4037, term4037.getClass(), "day", (short) 23);
        setField(term4036, term4036.getClass(), "date", term4037);
        setByteField(term4041, term4041.getClass(), "hour", (byte) 14);
        setByteField(term4041, term4041.getClass(), "minute", (byte) 17);
        setByteField(term4041, term4041.getClass(), "second", (byte) 50);
        setIntField(term4041, term4041.getClass(), "nano", 325544804);
        setField(term4036, term4036.getClass(), "time", term4041);
        setField(term4011, term4011.getClass(), "lastLoginDate", term4036);
        setBooleanField(term4011, term4011.getClass(), "isWebJoin", true);
        setField(term4011, term4011.getClass(), "webLimitDate", "MwwjNtdOFT");
        setIntField(term4011, term4011.getClass(), "level", -1347358701);
        setIntField(term4011, term4011.getClass(), "reincarnationNum", 806595993);
        setField(term4011, term4011.getClass(), "exp", "VYkqXKVlAJ");
        setLongField(term4011, term4011.getClass(), "point", -5248475803419977214L);
        setLongField(term4011, term4011.getClass(), "totalPoint", -6723783499250797216L);
        setIntField(term4011, term4011.getClass(), "playCount", 548228925);
        setIntField(term4011, term4011.getClass(), "multiPlayCount", -749861210);
        setIntField(term4011, term4011.getClass(), "multiWinCount", 1694224101);
        setIntField(term4011, term4011.getClass(), "requestResCount", 937859191);
        setIntField(term4011, term4011.getClass(), "acceptResCount", -916584829);
        setIntField(term4011, term4011.getClass(), "successResCount", -2131181468);
        setIntField(term4011, term4011.getClass(), "playerRating", 282916351);
        setIntField(term4011, term4011.getClass(), "highestRating", 880977281);
        setIntField(term4011, term4011.getClass(), "nameplateId", 371943306);
        setIntField(term4011, term4011.getClass(), "frameId", 982388293);
        setIntField(term4011, term4011.getClass(), "characterId", -159494544);
        setIntField(term4011, term4011.getClass(), "trophyId", -75206835);
        setIntField(term4011, term4011.getClass(), "playedTutorialBit", -1618206977);
        setIntField(term4011, term4011.getClass(), "firstTutorialCancelNum", -1747406163);
        setIntField(term4011, term4011.getClass(), "masterTutorialCancelNum", 388157121);
        setIntField(term4011, term4011.getClass(), "totalRepertoireCount", 1684998508);
        setIntField(term4011, term4011.getClass(), "totalMapNum", -1476644457);
        setLongField(term4011, term4011.getClass(), "totalHiScore", 41775768178052008L);
        setLongField(term4011, term4011.getClass(), "totalBasicHighScore", 6682528376118987775L);
        setLongField(term4011, term4011.getClass(), "totalAdvancedHighScore", 682356318767179819L);
        setLongField(term4011, term4011.getClass(), "totalExpertHighScore", -7291743527973326814L);
        setLongField(term4011, term4011.getClass(), "totalMasterHighScore", -5963439350418910964L);
        setIntField(term4098, term4098.getClass(), "year", 2027);
        setShortField(term4098, term4098.getClass(), "month", (short) 11);
        setShortField(term4098, term4098.getClass(), "day", (short) 8);
        setField(term4097, term4097.getClass(), "date", term4098);
        setByteField(term4102, term4102.getClass(), "hour", (byte) 11);
        setByteField(term4102, term4102.getClass(), "minute", (byte) 59);
        setByteField(term4102, term4102.getClass(), "second", (byte) 14);
        setIntField(term4102, term4102.getClass(), "nano", 322375591);
        setField(term4097, term4097.getClass(), "time", term4102);
        setField(term4011, term4011.getClass(), "eventWatchedDate", term4097);
        setIntField(term4011, term4011.getClass(), "friendCount", 1270666529);
        setBooleanField(term4011, term4011.getClass(), "isMaimai", true);
        setField(term4011, term4011.getClass(), "firstGameId", "XkIoWJRNwN");
        setField(term4011, term4011.getClass(), "firstRomVersion", "aNWLJdrZMq");
        setField(term4011, term4011.getClass(), "firstDataVersion", "HHmNoYxIGj");
        setIntField(term4146, term4146.getClass(), "year", 2020);
        setShortField(term4146, term4146.getClass(), "month", (short) 8);
        setShortField(term4146, term4146.getClass(), "day", (short) 15);
        setField(term4145, term4145.getClass(), "date", term4146);
        setByteField(term4150, term4150.getClass(), "hour", (byte) 2);
        setByteField(term4150, term4150.getClass(), "minute", (byte) 0);
        setByteField(term4150, term4150.getClass(), "second", (byte) 38);
        setIntField(term4150, term4150.getClass(), "nano", 146431486);
        setField(term4145, term4145.getClass(), "time", term4150);
        setField(term4011, term4011.getClass(), "firstPlayDate", term4145);
        setField(term4011, term4011.getClass(), "lastGameId", "PtirvZmsGt");
        setField(term4011, term4011.getClass(), "lastRomVersion", "HWkpTmtlrc");
        setField(term4011, term4011.getClass(), "lastDataVersion", "hMmaoREuCK");
        setIntField(term4192, term4192.getClass(), "year", 2014);
        setShortField(term4192, term4192.getClass(), "month", (short) 11);
        setShortField(term4192, term4192.getClass(), "day", (short) 8);
        setField(term4191, term4191.getClass(), "date", term4192);
        setByteField(term4196, term4196.getClass(), "hour", (byte) 8);
        setByteField(term4196, term4196.getClass(), "minute", (byte) 43);
        setByteField(term4196, term4196.getClass(), "second", (byte) 32);
        setIntField(term4196, term4196.getClass(), "nano", 154434838);
        setField(term4191, term4191.getClass(), "time", term4196);
        setField(term4011, term4011.getClass(), "lastPlayDate", term4191);
        setIntField(term4011, term4011.getClass(), "lastPlaceId", -1146679443);
        setField(term4011, term4011.getClass(), "lastPlaceName", "VeDtgDzGAN");
        setField(term4011, term4011.getClass(), "lastRegionId", "aWYOWZFyaX");
        setField(term4011, term4011.getClass(), "lastRegionName", "BRIVNtfUWU");
        setField(term4011, term4011.getClass(), "lastAllNetId", "DbiCVtPPCT");
        setField(term4011, term4011.getClass(), "lastClientId", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term4011, args);
    }

};


