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

public class UserGameOptionEx_setId_68695318223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319887;
     Object term320185;

    public UserGameOptionEx_setId_68695318223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319893 = new Long(3968143267572761057L);
        term319887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term319889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term319891 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term319907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term319939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term319940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320005 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320099 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term319887, term319887.getClass(), "id", -4948801887280762934L);
        setLongField(term319889, term319889.getClass(), "id", -8337123816733562994L);
        setLongField(term319891, term319891.getClass(), "id", -8921672016906534362L);
        setField(term319891, term319891.getClass(), "extId", term319893);
        setField(term319891, term319891.getClass(), "luid", "nwmhNXaAzK");
        setIntField(term319908, term319908.getClass(), "year", 2022);
        setShortField(term319908, term319908.getClass(), "month", (short) 9);
        setShortField(term319908, term319908.getClass(), "day", (short) 3);
        setField(term319907, term319907.getClass(), "date", term319908);
        setByteField(term319912, term319912.getClass(), "hour", (byte) 20);
        setByteField(term319912, term319912.getClass(), "minute", (byte) 14);
        setByteField(term319912, term319912.getClass(), "second", (byte) 52);
        setIntField(term319912, term319912.getClass(), "nano", 296900393);
        setField(term319907, term319907.getClass(), "time", term319912);
        setField(term319891, term319891.getClass(), "registerTime", term319907);
        setIntField(term319918, term319918.getClass(), "year", 2011);
        setShortField(term319918, term319918.getClass(), "month", (short) 2);
        setShortField(term319918, term319918.getClass(), "day", (short) 26);
        setField(term319917, term319917.getClass(), "date", term319918);
        setByteField(term319922, term319922.getClass(), "hour", (byte) 18);
        setByteField(term319922, term319922.getClass(), "minute", (byte) 33);
        setByteField(term319922, term319922.getClass(), "second", (byte) 0);
        setIntField(term319922, term319922.getClass(), "nano", 554713726);
        setField(term319917, term319917.getClass(), "time", term319922);
        setField(term319891, term319891.getClass(), "accessTime", term319917);
        setField(term319889, term319889.getClass(), "card", term319891);
        setField(term319889, term319889.getClass(), "userName", "AHKEcReWeg");
        setIntField(term319940, term319940.getClass(), "year", 2017);
        setShortField(term319940, term319940.getClass(), "month", (short) 11);
        setShortField(term319940, term319940.getClass(), "day", (short) 4);
        setField(term319939, term319939.getClass(), "date", term319940);
        setByteField(term319944, term319944.getClass(), "hour", (byte) 14);
        setByteField(term319944, term319944.getClass(), "minute", (byte) 47);
        setByteField(term319944, term319944.getClass(), "second", (byte) 10);
        setIntField(term319944, term319944.getClass(), "nano", 727167948);
        setField(term319939, term319939.getClass(), "time", term319944);
        setField(term319889, term319889.getClass(), "lastLoginDate", term319939);
        setBooleanField(term319889, term319889.getClass(), "isWebJoin", false);
        setField(term319889, term319889.getClass(), "webLimitDate", "vQJCcjYzFl");
        setIntField(term319889, term319889.getClass(), "level", 1518458868);
        setIntField(term319889, term319889.getClass(), "reincarnationNum", 102665908);
        setField(term319889, term319889.getClass(), "exp", "mXQgfYcOFG");
        setLongField(term319889, term319889.getClass(), "point", 1234590873555457498L);
        setLongField(term319889, term319889.getClass(), "totalPoint", -5594266310801831914L);
        setIntField(term319889, term319889.getClass(), "playCount", 285235008);
        setIntField(term319889, term319889.getClass(), "multiPlayCount", -1345450442);
        setIntField(term319889, term319889.getClass(), "multiWinCount", 1422151864);
        setIntField(term319889, term319889.getClass(), "requestResCount", -509282716);
        setIntField(term319889, term319889.getClass(), "acceptResCount", -9134510);
        setIntField(term319889, term319889.getClass(), "successResCount", 1178675259);
        setIntField(term319889, term319889.getClass(), "playerRating", 435909030);
        setIntField(term319889, term319889.getClass(), "highestRating", 663569895);
        setIntField(term319889, term319889.getClass(), "nameplateId", -308690623);
        setIntField(term319889, term319889.getClass(), "frameId", -1499435550);
        setIntField(term319889, term319889.getClass(), "characterId", 953179902);
        setIntField(term319889, term319889.getClass(), "trophyId", 1376611138);
        setIntField(term319889, term319889.getClass(), "playedTutorialBit", 1432720232);
        setIntField(term319889, term319889.getClass(), "firstTutorialCancelNum", -220448129);
        setIntField(term319889, term319889.getClass(), "masterTutorialCancelNum", 1764740473);
        setIntField(term319889, term319889.getClass(), "totalRepertoireCount", 1947047031);
        setIntField(term319889, term319889.getClass(), "totalMapNum", 409008942);
        setLongField(term319889, term319889.getClass(), "totalHiScore", -8038991382672778520L);
        setLongField(term319889, term319889.getClass(), "totalBasicHighScore", 1528436527758807897L);
        setLongField(term319889, term319889.getClass(), "totalAdvancedHighScore", 8596776356769062426L);
        setLongField(term319889, term319889.getClass(), "totalExpertHighScore", 5489801275022449174L);
        setLongField(term319889, term319889.getClass(), "totalMasterHighScore", 3670199197813857510L);
        setIntField(term320001, term320001.getClass(), "year", 2024);
        setShortField(term320001, term320001.getClass(), "month", (short) 3);
        setShortField(term320001, term320001.getClass(), "day", (short) 16);
        setField(term320000, term320000.getClass(), "date", term320001);
        setByteField(term320005, term320005.getClass(), "hour", (byte) 10);
        setByteField(term320005, term320005.getClass(), "minute", (byte) 23);
        setByteField(term320005, term320005.getClass(), "second", (byte) 18);
        setIntField(term320005, term320005.getClass(), "nano", 780555862);
        setField(term320000, term320000.getClass(), "time", term320005);
        setField(term319889, term319889.getClass(), "eventWatchedDate", term320000);
        setIntField(term319889, term319889.getClass(), "friendCount", -682037881);
        setBooleanField(term319889, term319889.getClass(), "isMaimai", false);
        setField(term319889, term319889.getClass(), "firstGameId", "sXBPfVUQIw");
        setField(term319889, term319889.getClass(), "firstRomVersion", "uVQuCdoyqo");
        setField(term319889, term319889.getClass(), "firstDataVersion", "idDWMqSfdr");
        setIntField(term320049, term320049.getClass(), "year", 2029);
        setShortField(term320049, term320049.getClass(), "month", (short) 7);
        setShortField(term320049, term320049.getClass(), "day", (short) 23);
        setField(term320048, term320048.getClass(), "date", term320049);
        setByteField(term320053, term320053.getClass(), "hour", (byte) 7);
        setByteField(term320053, term320053.getClass(), "minute", (byte) 10);
        setByteField(term320053, term320053.getClass(), "second", (byte) 21);
        setIntField(term320053, term320053.getClass(), "nano", 135418103);
        setField(term320048, term320048.getClass(), "time", term320053);
        setField(term319889, term319889.getClass(), "firstPlayDate", term320048);
        setField(term319889, term319889.getClass(), "lastGameId", "COnaqgWCuo");
        setField(term319889, term319889.getClass(), "lastRomVersion", "vnCQFMDnJC");
        setField(term319889, term319889.getClass(), "lastDataVersion", "bCkDkObuRH");
        setIntField(term320095, term320095.getClass(), "year", 2013);
        setShortField(term320095, term320095.getClass(), "month", (short) 3);
        setShortField(term320095, term320095.getClass(), "day", (short) 24);
        setField(term320094, term320094.getClass(), "date", term320095);
        setByteField(term320099, term320099.getClass(), "hour", (byte) 20);
        setByteField(term320099, term320099.getClass(), "minute", (byte) 2);
        setByteField(term320099, term320099.getClass(), "second", (byte) 36);
        setIntField(term320099, term320099.getClass(), "nano", 629328423);
        setField(term320094, term320094.getClass(), "time", term320099);
        setField(term319889, term319889.getClass(), "lastPlayDate", term320094);
        setIntField(term319889, term319889.getClass(), "lastPlaceId", 319801026);
        setField(term319889, term319889.getClass(), "lastPlaceName", "fXsvnPoTrp");
        setField(term319889, term319889.getClass(), "lastRegionId", "nfPBEOploM");
        setField(term319889, term319889.getClass(), "lastRegionName", "geOXZNZZIn");
        setField(term319889, term319889.getClass(), "lastAllNetId", "WklUkZmIds");
        setField(term319889, term319889.getClass(), "lastClientId", "qsaAfuuDnj");
        setField(term319887, term319887.getClass(), "user", term319889);
        setIntField(term319887, term319887.getClass(), "ext1", -53670685);
        setIntField(term319887, term319887.getClass(), "ext2", -1141764709);
        setIntField(term319887, term319887.getClass(), "ext3", -1884053350);
        setIntField(term319887, term319887.getClass(), "ext4", 1432928549);
        setIntField(term319887, term319887.getClass(), "ext5", 1831668967);
        setIntField(term319887, term319887.getClass(), "ext6", 1945358126);
        setIntField(term319887, term319887.getClass(), "ext7", 1544403394);
        setIntField(term319887, term319887.getClass(), "ext8", -1417937275);
        setIntField(term319887, term319887.getClass(), "ext9", 283533258);
        setIntField(term319887, term319887.getClass(), "ext10", -674714132);
        setIntField(term319887, term319887.getClass(), "ext11", 369679869);
        setIntField(term319887, term319887.getClass(), "ext12", -1045666157);
        setIntField(term319887, term319887.getClass(), "ext13", -1294400546);
        setIntField(term319887, term319887.getClass(), "ext14", 189925564);
        setIntField(term319887, term319887.getClass(), "ext15", -1624176648);
        setIntField(term319887, term319887.getClass(), "ext16", -1110552515);
        setIntField(term319887, term319887.getClass(), "ext17", 1693657312);
        setIntField(term319887, term319887.getClass(), "ext18", -1593288718);
        setIntField(term319887, term319887.getClass(), "ext19", -1708472547);
        setIntField(term319887, term319887.getClass(), "ext20", 874901091);
        term320185 = new Long(-6945994942019671231L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term320185;
        callMethod(klass, "setId", argTypes, term319887, args);
    }

};


