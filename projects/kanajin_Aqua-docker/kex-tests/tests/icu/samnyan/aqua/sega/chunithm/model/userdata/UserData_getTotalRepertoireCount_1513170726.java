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

public class UserData_getTotalRepertoireCount_1513170726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140457;

    public UserData_getTotalRepertoireCount_1513170726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140461 = new Long(-593735869267672817L);
        term140457 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term140459 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140480 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140485 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140486 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140490 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140507 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140508 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140512 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140568 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140569 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140573 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140667 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140457, term140457.getClass(), "id", -3949646833091670623L);
        setLongField(term140459, term140459.getClass(), "id", 6452661156585832400L);
        setField(term140459, term140459.getClass(), "extId", term140461);
        setField(term140459, term140459.getClass(), "luid", "DiWPwuubfu");
        setIntField(term140476, term140476.getClass(), "year", 2019);
        setShortField(term140476, term140476.getClass(), "month", (short) 3);
        setShortField(term140476, term140476.getClass(), "day", (short) 27);
        setField(term140475, term140475.getClass(), "date", term140476);
        setByteField(term140480, term140480.getClass(), "hour", (byte) 10);
        setByteField(term140480, term140480.getClass(), "minute", (byte) 13);
        setByteField(term140480, term140480.getClass(), "second", (byte) 46);
        setIntField(term140480, term140480.getClass(), "nano", 425017391);
        setField(term140475, term140475.getClass(), "time", term140480);
        setField(term140459, term140459.getClass(), "registerTime", term140475);
        setIntField(term140486, term140486.getClass(), "year", 2026);
        setShortField(term140486, term140486.getClass(), "month", (short) 5);
        setShortField(term140486, term140486.getClass(), "day", (short) 13);
        setField(term140485, term140485.getClass(), "date", term140486);
        setByteField(term140490, term140490.getClass(), "hour", (byte) 7);
        setByteField(term140490, term140490.getClass(), "minute", (byte) 33);
        setByteField(term140490, term140490.getClass(), "second", (byte) 4);
        setIntField(term140490, term140490.getClass(), "nano", 912546150);
        setField(term140485, term140485.getClass(), "time", term140490);
        setField(term140459, term140459.getClass(), "accessTime", term140485);
        setField(term140457, term140457.getClass(), "card", term140459);
        setField(term140457, term140457.getClass(), "userName", "vXgtAGmDaN");
        setIntField(term140508, term140508.getClass(), "year", 2012);
        setShortField(term140508, term140508.getClass(), "month", (short) 3);
        setShortField(term140508, term140508.getClass(), "day", (short) 10);
        setField(term140507, term140507.getClass(), "date", term140508);
        setByteField(term140512, term140512.getClass(), "hour", (byte) 20);
        setByteField(term140512, term140512.getClass(), "minute", (byte) 26);
        setByteField(term140512, term140512.getClass(), "second", (byte) 51);
        setIntField(term140512, term140512.getClass(), "nano", 858538390);
        setField(term140507, term140507.getClass(), "time", term140512);
        setField(term140457, term140457.getClass(), "lastLoginDate", term140507);
        setBooleanField(term140457, term140457.getClass(), "isWebJoin", true);
        setField(term140457, term140457.getClass(), "webLimitDate", "RAzeZQXqkC");
        setIntField(term140457, term140457.getClass(), "level", 954482242);
        setIntField(term140457, term140457.getClass(), "reincarnationNum", -1145866715);
        setField(term140457, term140457.getClass(), "exp", "NxfBiMaFGb");
        setLongField(term140457, term140457.getClass(), "point", 8434360451654713658L);
        setLongField(term140457, term140457.getClass(), "totalPoint", 7064473722660118998L);
        setIntField(term140457, term140457.getClass(), "playCount", -792401883);
        setIntField(term140457, term140457.getClass(), "multiPlayCount", -1513455266);
        setIntField(term140457, term140457.getClass(), "multiWinCount", 1576242915);
        setIntField(term140457, term140457.getClass(), "requestResCount", -13617495);
        setIntField(term140457, term140457.getClass(), "acceptResCount", -1165634173);
        setIntField(term140457, term140457.getClass(), "successResCount", -634884793);
        setIntField(term140457, term140457.getClass(), "playerRating", 1476138937);
        setIntField(term140457, term140457.getClass(), "highestRating", 1547525653);
        setIntField(term140457, term140457.getClass(), "nameplateId", 244752248);
        setIntField(term140457, term140457.getClass(), "frameId", -354095413);
        setIntField(term140457, term140457.getClass(), "characterId", 1842115165);
        setIntField(term140457, term140457.getClass(), "trophyId", 809042157);
        setIntField(term140457, term140457.getClass(), "playedTutorialBit", 123189112);
        setIntField(term140457, term140457.getClass(), "firstTutorialCancelNum", 1409363541);
        setIntField(term140457, term140457.getClass(), "masterTutorialCancelNum", -529449674);
        setIntField(term140457, term140457.getClass(), "totalRepertoireCount", -2050329736);
        setIntField(term140457, term140457.getClass(), "totalMapNum", 1971429499);
        setLongField(term140457, term140457.getClass(), "totalHiScore", -3328202565303629170L);
        setLongField(term140457, term140457.getClass(), "totalBasicHighScore", -7303222772169138653L);
        setLongField(term140457, term140457.getClass(), "totalAdvancedHighScore", -5237668391482898957L);
        setLongField(term140457, term140457.getClass(), "totalExpertHighScore", 6347050696926206807L);
        setLongField(term140457, term140457.getClass(), "totalMasterHighScore", -6693328220911275400L);
        setIntField(term140569, term140569.getClass(), "year", 2022);
        setShortField(term140569, term140569.getClass(), "month", (short) 8);
        setShortField(term140569, term140569.getClass(), "day", (short) 20);
        setField(term140568, term140568.getClass(), "date", term140569);
        setByteField(term140573, term140573.getClass(), "hour", (byte) 9);
        setByteField(term140573, term140573.getClass(), "minute", (byte) 40);
        setByteField(term140573, term140573.getClass(), "second", (byte) 35);
        setIntField(term140573, term140573.getClass(), "nano", 266150293);
        setField(term140568, term140568.getClass(), "time", term140573);
        setField(term140457, term140457.getClass(), "eventWatchedDate", term140568);
        setIntField(term140457, term140457.getClass(), "friendCount", 761194460);
        setBooleanField(term140457, term140457.getClass(), "isMaimai", true);
        setField(term140457, term140457.getClass(), "firstGameId", "xKDTKfQIei");
        setField(term140457, term140457.getClass(), "firstRomVersion", "QHAkxVuuIr");
        setField(term140457, term140457.getClass(), "firstDataVersion", "OhJSELmFDf");
        setIntField(term140617, term140617.getClass(), "year", 2012);
        setShortField(term140617, term140617.getClass(), "month", (short) 11);
        setShortField(term140617, term140617.getClass(), "day", (short) 23);
        setField(term140616, term140616.getClass(), "date", term140617);
        setByteField(term140621, term140621.getClass(), "hour", (byte) 23);
        setByteField(term140621, term140621.getClass(), "minute", (byte) 42);
        setByteField(term140621, term140621.getClass(), "second", (byte) 28);
        setIntField(term140621, term140621.getClass(), "nano", 672620461);
        setField(term140616, term140616.getClass(), "time", term140621);
        setField(term140457, term140457.getClass(), "firstPlayDate", term140616);
        setField(term140457, term140457.getClass(), "lastGameId", "WjtvlnduZO");
        setField(term140457, term140457.getClass(), "lastRomVersion", "EccuEVvNyG");
        setField(term140457, term140457.getClass(), "lastDataVersion", "kqWUPOtRYQ");
        setIntField(term140663, term140663.getClass(), "year", 2014);
        setShortField(term140663, term140663.getClass(), "month", (short) 6);
        setShortField(term140663, term140663.getClass(), "day", (short) 1);
        setField(term140662, term140662.getClass(), "date", term140663);
        setByteField(term140667, term140667.getClass(), "hour", (byte) 10);
        setByteField(term140667, term140667.getClass(), "minute", (byte) 37);
        setByteField(term140667, term140667.getClass(), "second", (byte) 27);
        setIntField(term140667, term140667.getClass(), "nano", 894301972);
        setField(term140662, term140662.getClass(), "time", term140667);
        setField(term140457, term140457.getClass(), "lastPlayDate", term140662);
        setIntField(term140457, term140457.getClass(), "lastPlaceId", 2101170479);
        setField(term140457, term140457.getClass(), "lastPlaceName", "vtFFfsxqsd");
        setField(term140457, term140457.getClass(), "lastRegionId", "OgafASdxEn");
        setField(term140457, term140457.getClass(), "lastRegionName", "SdEDpqIgHG");
        setField(term140457, term140457.getClass(), "lastAllNetId", "KiOHPfuKbp");
        setField(term140457, term140457.getClass(), "lastClientId", "faneZfiPkz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRepertoireCount", argTypes, term140457, args);
    }

};


