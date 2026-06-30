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

public class UserGameOptionEx_getExt10_157174273112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314959;

    public UserGameOptionEx_getExt10_157174273112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314965 = new Long(-8211240904293846981L);
        term314959 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term314961 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term314963 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term314979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314984 = newInstance(Class.forName("java.time.LocalTime"));
        Object term314989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term314990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315016 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315120 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315121 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315125 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term315171 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term314959, term314959.getClass(), "id", -2417443285364775510L);
        setLongField(term314961, term314961.getClass(), "id", 949202874215055193L);
        setLongField(term314963, term314963.getClass(), "id", 1783419213507924258L);
        setField(term314963, term314963.getClass(), "extId", term314965);
        setField(term314963, term314963.getClass(), "luid", "uZkkVJREva");
        setIntField(term314980, term314980.getClass(), "year", 2023);
        setShortField(term314980, term314980.getClass(), "month", (short) 2);
        setShortField(term314980, term314980.getClass(), "day", (short) 14);
        setField(term314979, term314979.getClass(), "date", term314980);
        setByteField(term314984, term314984.getClass(), "hour", (byte) 22);
        setByteField(term314984, term314984.getClass(), "minute", (byte) 16);
        setByteField(term314984, term314984.getClass(), "second", (byte) 40);
        setIntField(term314984, term314984.getClass(), "nano", 533323069);
        setField(term314979, term314979.getClass(), "time", term314984);
        setField(term314963, term314963.getClass(), "registerTime", term314979);
        setIntField(term314990, term314990.getClass(), "year", 2020);
        setShortField(term314990, term314990.getClass(), "month", (short) 7);
        setShortField(term314990, term314990.getClass(), "day", (short) 8);
        setField(term314989, term314989.getClass(), "date", term314990);
        setByteField(term314994, term314994.getClass(), "hour", (byte) 14);
        setByteField(term314994, term314994.getClass(), "minute", (byte) 59);
        setByteField(term314994, term314994.getClass(), "second", (byte) 4);
        setIntField(term314994, term314994.getClass(), "nano", 788049901);
        setField(term314989, term314989.getClass(), "time", term314994);
        setField(term314963, term314963.getClass(), "accessTime", term314989);
        setField(term314961, term314961.getClass(), "card", term314963);
        setField(term314961, term314961.getClass(), "userName", "lYGZmmgWDd");
        setIntField(term315012, term315012.getClass(), "year", 2023);
        setShortField(term315012, term315012.getClass(), "month", (short) 5);
        setShortField(term315012, term315012.getClass(), "day", (short) 22);
        setField(term315011, term315011.getClass(), "date", term315012);
        setByteField(term315016, term315016.getClass(), "hour", (byte) 9);
        setByteField(term315016, term315016.getClass(), "minute", (byte) 6);
        setByteField(term315016, term315016.getClass(), "second", (byte) 16);
        setIntField(term315016, term315016.getClass(), "nano", 224742611);
        setField(term315011, term315011.getClass(), "time", term315016);
        setField(term314961, term314961.getClass(), "lastLoginDate", term315011);
        setBooleanField(term314961, term314961.getClass(), "isWebJoin", false);
        setField(term314961, term314961.getClass(), "webLimitDate", "YzjQFbbtMR");
        setIntField(term314961, term314961.getClass(), "level", 966660807);
        setIntField(term314961, term314961.getClass(), "reincarnationNum", 491650010);
        setField(term314961, term314961.getClass(), "exp", "iyFhYDVxSB");
        setLongField(term314961, term314961.getClass(), "point", -5770029271908830026L);
        setLongField(term314961, term314961.getClass(), "totalPoint", -2743414055159250540L);
        setIntField(term314961, term314961.getClass(), "playCount", -288034028);
        setIntField(term314961, term314961.getClass(), "multiPlayCount", 701792790);
        setIntField(term314961, term314961.getClass(), "multiWinCount", -1716961612);
        setIntField(term314961, term314961.getClass(), "requestResCount", 676440749);
        setIntField(term314961, term314961.getClass(), "acceptResCount", -1284761868);
        setIntField(term314961, term314961.getClass(), "successResCount", -1743993538);
        setIntField(term314961, term314961.getClass(), "playerRating", -1368813525);
        setIntField(term314961, term314961.getClass(), "highestRating", -309765050);
        setIntField(term314961, term314961.getClass(), "nameplateId", 145184885);
        setIntField(term314961, term314961.getClass(), "frameId", -2108989861);
        setIntField(term314961, term314961.getClass(), "characterId", 756442239);
        setIntField(term314961, term314961.getClass(), "trophyId", 414458522);
        setIntField(term314961, term314961.getClass(), "playedTutorialBit", -1165049012);
        setIntField(term314961, term314961.getClass(), "firstTutorialCancelNum", 830585633);
        setIntField(term314961, term314961.getClass(), "masterTutorialCancelNum", 563816474);
        setIntField(term314961, term314961.getClass(), "totalRepertoireCount", 2043443606);
        setIntField(term314961, term314961.getClass(), "totalMapNum", 2062774736);
        setLongField(term314961, term314961.getClass(), "totalHiScore", 2480072034623900419L);
        setLongField(term314961, term314961.getClass(), "totalBasicHighScore", -3021838392534799239L);
        setLongField(term314961, term314961.getClass(), "totalAdvancedHighScore", 5341137410137975896L);
        setLongField(term314961, term314961.getClass(), "totalExpertHighScore", -6578012856501009609L);
        setLongField(term314961, term314961.getClass(), "totalMasterHighScore", -629451464740461051L);
        setIntField(term315073, term315073.getClass(), "year", 2018);
        setShortField(term315073, term315073.getClass(), "month", (short) 11);
        setShortField(term315073, term315073.getClass(), "day", (short) 6);
        setField(term315072, term315072.getClass(), "date", term315073);
        setByteField(term315077, term315077.getClass(), "hour", (byte) 23);
        setByteField(term315077, term315077.getClass(), "minute", (byte) 32);
        setByteField(term315077, term315077.getClass(), "second", (byte) 18);
        setIntField(term315077, term315077.getClass(), "nano", 479431819);
        setField(term315072, term315072.getClass(), "time", term315077);
        setField(term314961, term314961.getClass(), "eventWatchedDate", term315072);
        setIntField(term314961, term314961.getClass(), "friendCount", 463174911);
        setBooleanField(term314961, term314961.getClass(), "isMaimai", false);
        setField(term314961, term314961.getClass(), "firstGameId", "wqmAianxQK");
        setField(term314961, term314961.getClass(), "firstRomVersion", "FbERbbZMNs");
        setField(term314961, term314961.getClass(), "firstDataVersion", "qKghCzRGvs");
        setIntField(term315121, term315121.getClass(), "year", 2011);
        setShortField(term315121, term315121.getClass(), "month", (short) 5);
        setShortField(term315121, term315121.getClass(), "day", (short) 17);
        setField(term315120, term315120.getClass(), "date", term315121);
        setByteField(term315125, term315125.getClass(), "hour", (byte) 8);
        setByteField(term315125, term315125.getClass(), "minute", (byte) 54);
        setByteField(term315125, term315125.getClass(), "second", (byte) 22);
        setIntField(term315125, term315125.getClass(), "nano", 725590014);
        setField(term315120, term315120.getClass(), "time", term315125);
        setField(term314961, term314961.getClass(), "firstPlayDate", term315120);
        setField(term314961, term314961.getClass(), "lastGameId", "zpshVYDLcR");
        setField(term314961, term314961.getClass(), "lastRomVersion", "jbBXnlcBeK");
        setField(term314961, term314961.getClass(), "lastDataVersion", "uascBPqTuU");
        setIntField(term315167, term315167.getClass(), "year", 2028);
        setShortField(term315167, term315167.getClass(), "month", (short) 7);
        setShortField(term315167, term315167.getClass(), "day", (short) 10);
        setField(term315166, term315166.getClass(), "date", term315167);
        setByteField(term315171, term315171.getClass(), "hour", (byte) 12);
        setByteField(term315171, term315171.getClass(), "minute", (byte) 51);
        setByteField(term315171, term315171.getClass(), "second", (byte) 46);
        setIntField(term315171, term315171.getClass(), "nano", 83169275);
        setField(term315166, term315166.getClass(), "time", term315171);
        setField(term314961, term314961.getClass(), "lastPlayDate", term315166);
        setIntField(term314961, term314961.getClass(), "lastPlaceId", -620459616);
        setField(term314961, term314961.getClass(), "lastPlaceName", "dFOpjLmNnE");
        setField(term314961, term314961.getClass(), "lastRegionId", "CCgshdCJTR");
        setField(term314961, term314961.getClass(), "lastRegionName", "tObTOEkwsm");
        setField(term314961, term314961.getClass(), "lastAllNetId", "UKoBRBiZED");
        setField(term314961, term314961.getClass(), "lastClientId", "QYLIYhaAna");
        setField(term314959, term314959.getClass(), "user", term314961);
        setIntField(term314959, term314959.getClass(), "ext1", 682190199);
        setIntField(term314959, term314959.getClass(), "ext2", -1682379076);
        setIntField(term314959, term314959.getClass(), "ext3", 994259344);
        setIntField(term314959, term314959.getClass(), "ext4", -1427424428);
        setIntField(term314959, term314959.getClass(), "ext5", -278748584);
        setIntField(term314959, term314959.getClass(), "ext6", -1834193100);
        setIntField(term314959, term314959.getClass(), "ext7", -2074763689);
        setIntField(term314959, term314959.getClass(), "ext8", -226564422);
        setIntField(term314959, term314959.getClass(), "ext9", -2112898804);
        setIntField(term314959, term314959.getClass(), "ext10", 1845963013);
        setIntField(term314959, term314959.getClass(), "ext11", 395416491);
        setIntField(term314959, term314959.getClass(), "ext12", 752498302);
        setIntField(term314959, term314959.getClass(), "ext13", 1000541485);
        setIntField(term314959, term314959.getClass(), "ext14", 1590249777);
        setIntField(term314959, term314959.getClass(), "ext15", -1635943696);
        setIntField(term314959, term314959.getClass(), "ext16", 2104695444);
        setIntField(term314959, term314959.getClass(), "ext17", -1440794507);
        setIntField(term314959, term314959.getClass(), "ext18", 1693404841);
        setIntField(term314959, term314959.getClass(), "ext19", 844829703);
        setIntField(term314959, term314959.getClass(), "ext20", 1091087007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt10", argTypes, term314959, args);
    }

};


