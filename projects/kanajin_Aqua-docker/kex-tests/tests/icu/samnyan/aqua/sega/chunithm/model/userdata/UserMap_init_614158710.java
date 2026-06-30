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

public class UserMap_init_614158710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278399;

    public UserMap_init_614158710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278403 = new Long(-955253666696787757L);
        term278399 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term278401 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278417 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278418 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278422 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278427 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278428 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278432 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278563 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278609 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278399, term278399.getClass(), "id", -8620869190650173980L);
        setLongField(term278401, term278401.getClass(), "id", 4948940116725271685L);
        setField(term278401, term278401.getClass(), "extId", term278403);
        setField(term278401, term278401.getClass(), "luid", "aTxAeHZsQJ");
        setIntField(term278418, term278418.getClass(), "year", 2014);
        setShortField(term278418, term278418.getClass(), "month", (short) 9);
        setShortField(term278418, term278418.getClass(), "day", (short) 6);
        setField(term278417, term278417.getClass(), "date", term278418);
        setByteField(term278422, term278422.getClass(), "hour", (byte) 16);
        setByteField(term278422, term278422.getClass(), "minute", (byte) 26);
        setByteField(term278422, term278422.getClass(), "second", (byte) 53);
        setIntField(term278422, term278422.getClass(), "nano", 773213175);
        setField(term278417, term278417.getClass(), "time", term278422);
        setField(term278401, term278401.getClass(), "registerTime", term278417);
        setIntField(term278428, term278428.getClass(), "year", 2028);
        setShortField(term278428, term278428.getClass(), "month", (short) 12);
        setShortField(term278428, term278428.getClass(), "day", (short) 17);
        setField(term278427, term278427.getClass(), "date", term278428);
        setByteField(term278432, term278432.getClass(), "hour", (byte) 17);
        setByteField(term278432, term278432.getClass(), "minute", (byte) 34);
        setByteField(term278432, term278432.getClass(), "second", (byte) 54);
        setIntField(term278432, term278432.getClass(), "nano", 506198290);
        setField(term278427, term278427.getClass(), "time", term278432);
        setField(term278401, term278401.getClass(), "accessTime", term278427);
        setField(term278399, term278399.getClass(), "card", term278401);
        setField(term278399, term278399.getClass(), "userName", "VeVoOlkaSZ");
        setIntField(term278450, term278450.getClass(), "year", 2020);
        setShortField(term278450, term278450.getClass(), "month", (short) 3);
        setShortField(term278450, term278450.getClass(), "day", (short) 22);
        setField(term278449, term278449.getClass(), "date", term278450);
        setByteField(term278454, term278454.getClass(), "hour", (byte) 7);
        setByteField(term278454, term278454.getClass(), "minute", (byte) 47);
        setByteField(term278454, term278454.getClass(), "second", (byte) 25);
        setIntField(term278454, term278454.getClass(), "nano", 507945689);
        setField(term278449, term278449.getClass(), "time", term278454);
        setField(term278399, term278399.getClass(), "lastLoginDate", term278449);
        setBooleanField(term278399, term278399.getClass(), "isWebJoin", false);
        setField(term278399, term278399.getClass(), "webLimitDate", "wdxwtYvPiv");
        setIntField(term278399, term278399.getClass(), "level", 1941649114);
        setIntField(term278399, term278399.getClass(), "reincarnationNum", -287321760);
        setField(term278399, term278399.getClass(), "exp", "xUmjORhtNm");
        setLongField(term278399, term278399.getClass(), "point", -6075212730718245215L);
        setLongField(term278399, term278399.getClass(), "totalPoint", 3441925780374037370L);
        setIntField(term278399, term278399.getClass(), "playCount", -1313321034);
        setIntField(term278399, term278399.getClass(), "multiPlayCount", 131693432);
        setIntField(term278399, term278399.getClass(), "multiWinCount", -884613349);
        setIntField(term278399, term278399.getClass(), "requestResCount", -227022389);
        setIntField(term278399, term278399.getClass(), "acceptResCount", -780249262);
        setIntField(term278399, term278399.getClass(), "successResCount", -1608693876);
        setIntField(term278399, term278399.getClass(), "playerRating", 1682226516);
        setIntField(term278399, term278399.getClass(), "highestRating", 982039024);
        setIntField(term278399, term278399.getClass(), "nameplateId", 1025928124);
        setIntField(term278399, term278399.getClass(), "frameId", 1080394714);
        setIntField(term278399, term278399.getClass(), "characterId", -1472341235);
        setIntField(term278399, term278399.getClass(), "trophyId", -1801361943);
        setIntField(term278399, term278399.getClass(), "playedTutorialBit", 596985150);
        setIntField(term278399, term278399.getClass(), "firstTutorialCancelNum", -1036612528);
        setIntField(term278399, term278399.getClass(), "masterTutorialCancelNum", 678116826);
        setIntField(term278399, term278399.getClass(), "totalRepertoireCount", -968589797);
        setIntField(term278399, term278399.getClass(), "totalMapNum", 1905421633);
        setLongField(term278399, term278399.getClass(), "totalHiScore", 4988917650917706238L);
        setLongField(term278399, term278399.getClass(), "totalBasicHighScore", 1043913825539769213L);
        setLongField(term278399, term278399.getClass(), "totalAdvancedHighScore", 8013717398432595872L);
        setLongField(term278399, term278399.getClass(), "totalExpertHighScore", 3067135285195138576L);
        setLongField(term278399, term278399.getClass(), "totalMasterHighScore", -751429747053624215L);
        setIntField(term278511, term278511.getClass(), "year", 2025);
        setShortField(term278511, term278511.getClass(), "month", (short) 3);
        setShortField(term278511, term278511.getClass(), "day", (short) 17);
        setField(term278510, term278510.getClass(), "date", term278511);
        setByteField(term278515, term278515.getClass(), "hour", (byte) 18);
        setByteField(term278515, term278515.getClass(), "minute", (byte) 18);
        setByteField(term278515, term278515.getClass(), "second", (byte) 32);
        setIntField(term278515, term278515.getClass(), "nano", 233902869);
        setField(term278510, term278510.getClass(), "time", term278515);
        setField(term278399, term278399.getClass(), "eventWatchedDate", term278510);
        setIntField(term278399, term278399.getClass(), "friendCount", 83824083);
        setBooleanField(term278399, term278399.getClass(), "isMaimai", true);
        setField(term278399, term278399.getClass(), "firstGameId", "aAllLDsbll");
        setField(term278399, term278399.getClass(), "firstRomVersion", "tATJNkymBw");
        setField(term278399, term278399.getClass(), "firstDataVersion", "bkSURJdLBL");
        setIntField(term278559, term278559.getClass(), "year", 2013);
        setShortField(term278559, term278559.getClass(), "month", (short) 9);
        setShortField(term278559, term278559.getClass(), "day", (short) 18);
        setField(term278558, term278558.getClass(), "date", term278559);
        setByteField(term278563, term278563.getClass(), "hour", (byte) 2);
        setByteField(term278563, term278563.getClass(), "minute", (byte) 59);
        setByteField(term278563, term278563.getClass(), "second", (byte) 59);
        setIntField(term278563, term278563.getClass(), "nano", 249336731);
        setField(term278558, term278558.getClass(), "time", term278563);
        setField(term278399, term278399.getClass(), "firstPlayDate", term278558);
        setField(term278399, term278399.getClass(), "lastGameId", "aNcXIRUToO");
        setField(term278399, term278399.getClass(), "lastRomVersion", "nBABxWLGOf");
        setField(term278399, term278399.getClass(), "lastDataVersion", "jdlTBcTsNZ");
        setIntField(term278605, term278605.getClass(), "year", 2029);
        setShortField(term278605, term278605.getClass(), "month", (short) 1);
        setShortField(term278605, term278605.getClass(), "day", (short) 30);
        setField(term278604, term278604.getClass(), "date", term278605);
        setByteField(term278609, term278609.getClass(), "hour", (byte) 17);
        setByteField(term278609, term278609.getClass(), "minute", (byte) 19);
        setByteField(term278609, term278609.getClass(), "second", (byte) 8);
        setIntField(term278609, term278609.getClass(), "nano", 177498037);
        setField(term278604, term278604.getClass(), "time", term278609);
        setField(term278399, term278399.getClass(), "lastPlayDate", term278604);
        setIntField(term278399, term278399.getClass(), "lastPlaceId", 808572108);
        setField(term278399, term278399.getClass(), "lastPlaceName", "fZOYubmjQr");
        setField(term278399, term278399.getClass(), "lastRegionId", "NgDePNgOTA");
        setField(term278399, term278399.getClass(), "lastRegionName", "vSBdHCYUVt");
        setField(term278399, term278399.getClass(), "lastAllNetId", "THvGTpdqrf");
        setField(term278399, term278399.getClass(), "lastClientId", "ucbQApFAaL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term278399;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


