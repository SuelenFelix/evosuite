package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserActivity_setKind_98909814212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297046;
     Object term297331;

    public UserActivity_setKind_98909814212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term297052 = new Long(-5044181804110715069L);
        term297046 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term297048 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term297050 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term297066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297098 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297099 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297103 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297159 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297160 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297164 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297212 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297253 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297254 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297258 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term297046, term297046.getClass(), "id", -3717040050675321204L);
        setLongField(term297048, term297048.getClass(), "id", -311687515551036519L);
        setLongField(term297050, term297050.getClass(), "id", 87551356764990866L);
        setField(term297050, term297050.getClass(), "extId", term297052);
        setField(term297050, term297050.getClass(), "luid", "UaGWyukANs");
        setIntField(term297067, term297067.getClass(), "year", 2012);
        setShortField(term297067, term297067.getClass(), "month", (short) 7);
        setShortField(term297067, term297067.getClass(), "day", (short) 6);
        setField(term297066, term297066.getClass(), "date", term297067);
        setByteField(term297071, term297071.getClass(), "hour", (byte) 20);
        setByteField(term297071, term297071.getClass(), "minute", (byte) 25);
        setByteField(term297071, term297071.getClass(), "second", (byte) 33);
        setIntField(term297071, term297071.getClass(), "nano", 591877300);
        setField(term297066, term297066.getClass(), "time", term297071);
        setField(term297050, term297050.getClass(), "registerTime", term297066);
        setIntField(term297077, term297077.getClass(), "year", 2013);
        setShortField(term297077, term297077.getClass(), "month", (short) 8);
        setShortField(term297077, term297077.getClass(), "day", (short) 9);
        setField(term297076, term297076.getClass(), "date", term297077);
        setByteField(term297081, term297081.getClass(), "hour", (byte) 17);
        setByteField(term297081, term297081.getClass(), "minute", (byte) 29);
        setByteField(term297081, term297081.getClass(), "second", (byte) 13);
        setIntField(term297081, term297081.getClass(), "nano", 374150063);
        setField(term297076, term297076.getClass(), "time", term297081);
        setField(term297050, term297050.getClass(), "accessTime", term297076);
        setField(term297048, term297048.getClass(), "card", term297050);
        setField(term297048, term297048.getClass(), "userName", "XHgoSKsgYP");
        setIntField(term297099, term297099.getClass(), "year", 2014);
        setShortField(term297099, term297099.getClass(), "month", (short) 4);
        setShortField(term297099, term297099.getClass(), "day", (short) 24);
        setField(term297098, term297098.getClass(), "date", term297099);
        setByteField(term297103, term297103.getClass(), "hour", (byte) 7);
        setByteField(term297103, term297103.getClass(), "minute", (byte) 12);
        setByteField(term297103, term297103.getClass(), "second", (byte) 45);
        setIntField(term297103, term297103.getClass(), "nano", 483203416);
        setField(term297098, term297098.getClass(), "time", term297103);
        setField(term297048, term297048.getClass(), "lastLoginDate", term297098);
        setBooleanField(term297048, term297048.getClass(), "isWebJoin", true);
        setField(term297048, term297048.getClass(), "webLimitDate", "iQPdAhoTek");
        setIntField(term297048, term297048.getClass(), "level", -1814939038);
        setIntField(term297048, term297048.getClass(), "reincarnationNum", -1698429753);
        setField(term297048, term297048.getClass(), "exp", "IBmkVoFQfR");
        setLongField(term297048, term297048.getClass(), "point", 8849213552795917680L);
        setLongField(term297048, term297048.getClass(), "totalPoint", 8129767110064217080L);
        setIntField(term297048, term297048.getClass(), "playCount", 2137622499);
        setIntField(term297048, term297048.getClass(), "multiPlayCount", 1999042147);
        setIntField(term297048, term297048.getClass(), "multiWinCount", -105005664);
        setIntField(term297048, term297048.getClass(), "requestResCount", -118190113);
        setIntField(term297048, term297048.getClass(), "acceptResCount", -1851844767);
        setIntField(term297048, term297048.getClass(), "successResCount", 1134995273);
        setIntField(term297048, term297048.getClass(), "playerRating", 545058087);
        setIntField(term297048, term297048.getClass(), "highestRating", 277397630);
        setIntField(term297048, term297048.getClass(), "nameplateId", -1151022473);
        setIntField(term297048, term297048.getClass(), "frameId", 1720989427);
        setIntField(term297048, term297048.getClass(), "characterId", -735574672);
        setIntField(term297048, term297048.getClass(), "trophyId", -2067044834);
        setIntField(term297048, term297048.getClass(), "playedTutorialBit", -626419373);
        setIntField(term297048, term297048.getClass(), "firstTutorialCancelNum", -1266872592);
        setIntField(term297048, term297048.getClass(), "masterTutorialCancelNum", -1078848410);
        setIntField(term297048, term297048.getClass(), "totalRepertoireCount", -1693716421);
        setIntField(term297048, term297048.getClass(), "totalMapNum", 165867345);
        setLongField(term297048, term297048.getClass(), "totalHiScore", -7275485705677278587L);
        setLongField(term297048, term297048.getClass(), "totalBasicHighScore", -211018543573261035L);
        setLongField(term297048, term297048.getClass(), "totalAdvancedHighScore", 7578564556666028187L);
        setLongField(term297048, term297048.getClass(), "totalExpertHighScore", 652539985166333609L);
        setLongField(term297048, term297048.getClass(), "totalMasterHighScore", 6734275631255863271L);
        setIntField(term297160, term297160.getClass(), "year", 2017);
        setShortField(term297160, term297160.getClass(), "month", (short) 9);
        setShortField(term297160, term297160.getClass(), "day", (short) 14);
        setField(term297159, term297159.getClass(), "date", term297160);
        setByteField(term297164, term297164.getClass(), "hour", (byte) 0);
        setByteField(term297164, term297164.getClass(), "minute", (byte) 2);
        setByteField(term297164, term297164.getClass(), "second", (byte) 32);
        setIntField(term297164, term297164.getClass(), "nano", 944569536);
        setField(term297159, term297159.getClass(), "time", term297164);
        setField(term297048, term297048.getClass(), "eventWatchedDate", term297159);
        setIntField(term297048, term297048.getClass(), "friendCount", 483143938);
        setBooleanField(term297048, term297048.getClass(), "isMaimai", true);
        setField(term297048, term297048.getClass(), "firstGameId", "fvqExLyjOZ");
        setField(term297048, term297048.getClass(), "firstRomVersion", "XkzjjKogww");
        setField(term297048, term297048.getClass(), "firstDataVersion", "twjymkvbft");
        setIntField(term297208, term297208.getClass(), "year", 2014);
        setShortField(term297208, term297208.getClass(), "month", (short) 4);
        setShortField(term297208, term297208.getClass(), "day", (short) 1);
        setField(term297207, term297207.getClass(), "date", term297208);
        setByteField(term297212, term297212.getClass(), "hour", (byte) 20);
        setByteField(term297212, term297212.getClass(), "minute", (byte) 35);
        setByteField(term297212, term297212.getClass(), "second", (byte) 44);
        setIntField(term297212, term297212.getClass(), "nano", 274130298);
        setField(term297207, term297207.getClass(), "time", term297212);
        setField(term297048, term297048.getClass(), "firstPlayDate", term297207);
        setField(term297048, term297048.getClass(), "lastGameId", "YwLqpBnVFV");
        setField(term297048, term297048.getClass(), "lastRomVersion", "brGgmTeuRs");
        setField(term297048, term297048.getClass(), "lastDataVersion", "zMLmSyuwNB");
        setIntField(term297254, term297254.getClass(), "year", 2010);
        setShortField(term297254, term297254.getClass(), "month", (short) 5);
        setShortField(term297254, term297254.getClass(), "day", (short) 25);
        setField(term297253, term297253.getClass(), "date", term297254);
        setByteField(term297258, term297258.getClass(), "hour", (byte) 12);
        setByteField(term297258, term297258.getClass(), "minute", (byte) 32);
        setByteField(term297258, term297258.getClass(), "second", (byte) 15);
        setIntField(term297258, term297258.getClass(), "nano", 194719937);
        setField(term297253, term297253.getClass(), "time", term297258);
        setField(term297048, term297048.getClass(), "lastPlayDate", term297253);
        setIntField(term297048, term297048.getClass(), "lastPlaceId", 1477129324);
        setField(term297048, term297048.getClass(), "lastPlaceName", "QtjqcVtEVk");
        setField(term297048, term297048.getClass(), "lastRegionId", "KggRnGvBBV");
        setField(term297048, term297048.getClass(), "lastRegionName", "xqIPePiGzm");
        setField(term297048, term297048.getClass(), "lastAllNetId", "aTdFvWUkRg");
        setField(term297048, term297048.getClass(), "lastClientId", "EvatbEpuBU");
        setField(term297046, term297046.getClass(), "user", term297048);
        setIntField(term297046, term297046.getClass(), "kind", -119068926);
        setIntField(term297046, term297046.getClass(), "activityId", 1491404701);
        setIntField(term297046, term297046.getClass(), "sortNumber", 1616183536);
        setIntField(term297046, term297046.getClass(), "param1", 771552165);
        setIntField(term297046, term297046.getClass(), "param2", -1365886136);
        setIntField(term297046, term297046.getClass(), "param3", -2049839076);
        setIntField(term297046, term297046.getClass(), "param4", -304064614);
        term297331 = new Integer(-2083558546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term297331;
        callMethod(klass, "setKind", argTypes, term297046, args);
    }

};


