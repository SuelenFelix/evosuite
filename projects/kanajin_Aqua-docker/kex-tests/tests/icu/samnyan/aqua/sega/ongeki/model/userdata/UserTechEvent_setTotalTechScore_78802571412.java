package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserTechEvent_setTotalTechScore_78802571412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356969;
     Object term357251;

    public UserTechEvent_setTotalTechScore_78802571412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term356975 = new Long(2355652609935652353L);
        term356969 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term356971 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term356973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term356989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term356990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term356994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term356999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term356969, term356969.getClass(), "id", 8332231466933195544L);
        setLongField(term356971, term356971.getClass(), "id", -7083180515034141332L);
        setLongField(term356973, term356973.getClass(), "id", 2585265000010013961L);
        setField(term356973, term356973.getClass(), "extId", term356975);
        setField(term356973, term356973.getClass(), "luid", "pHRTNuwZAK");
        setIntField(term356990, term356990.getClass(), "year", 2013);
        setShortField(term356990, term356990.getClass(), "month", (short) 12);
        setShortField(term356990, term356990.getClass(), "day", (short) 7);
        setField(term356989, term356989.getClass(), "date", term356990);
        setByteField(term356994, term356994.getClass(), "hour", (byte) 23);
        setByteField(term356994, term356994.getClass(), "minute", (byte) 33);
        setByteField(term356994, term356994.getClass(), "second", (byte) 8);
        setIntField(term356994, term356994.getClass(), "nano", 995839786);
        setField(term356989, term356989.getClass(), "time", term356994);
        setField(term356973, term356973.getClass(), "registerTime", term356989);
        setIntField(term357000, term357000.getClass(), "year", 2029);
        setShortField(term357000, term357000.getClass(), "month", (short) 6);
        setShortField(term357000, term357000.getClass(), "day", (short) 25);
        setField(term356999, term356999.getClass(), "date", term357000);
        setByteField(term357004, term357004.getClass(), "hour", (byte) 13);
        setByteField(term357004, term357004.getClass(), "minute", (byte) 19);
        setByteField(term357004, term357004.getClass(), "second", (byte) 14);
        setIntField(term357004, term357004.getClass(), "nano", 144413166);
        setField(term356999, term356999.getClass(), "time", term357004);
        setField(term356973, term356973.getClass(), "accessTime", term356999);
        setField(term356971, term356971.getClass(), "card", term356973);
        setField(term356971, term356971.getClass(), "userName", "dLORHEiWhQ");
        setIntField(term356971, term356971.getClass(), "level", 2010217781);
        setIntField(term356971, term356971.getClass(), "reincarnationNum", 393859217);
        setLongField(term356971, term356971.getClass(), "exp", 6678882764707572983L);
        setLongField(term356971, term356971.getClass(), "point", 2779682899453006215L);
        setLongField(term356971, term356971.getClass(), "totalPoint", 9090962669416298576L);
        setIntField(term356971, term356971.getClass(), "playCount", 296879904);
        setIntField(term356971, term356971.getClass(), "jewelCount", -1809115588);
        setIntField(term356971, term356971.getClass(), "totalJewelCount", -2078103801);
        setIntField(term356971, term356971.getClass(), "medalCount", -1867517941);
        setIntField(term356971, term356971.getClass(), "playerRating", 517297616);
        setIntField(term356971, term356971.getClass(), "highestRating", 707394817);
        setIntField(term356971, term356971.getClass(), "battlePoint", 150740827);
        setIntField(term356971, term356971.getClass(), "bestBattlePoint", 1814342889);
        setIntField(term356971, term356971.getClass(), "overDamageBattlePoint", -84407805);
        setBooleanField(term356971, term356971.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term356971, term356971.getClass(), "nameplateId", 908432684);
        setIntField(term356971, term356971.getClass(), "trophyId", -1711460389);
        setIntField(term356971, term356971.getClass(), "cardId", -1512364202);
        setIntField(term356971, term356971.getClass(), "characterId", -1902545203);
        setIntField(term356971, term356971.getClass(), "characterVoiceNo", 1140011899);
        setIntField(term356971, term356971.getClass(), "tabSetting", -456966912);
        setIntField(term356971, term356971.getClass(), "tabSortSetting", 647627686);
        setIntField(term356971, term356971.getClass(), "cardCategorySetting", -745139921);
        setIntField(term356971, term356971.getClass(), "cardSortSetting", -1745153304);
        setIntField(term356971, term356971.getClass(), "rivalScoreCategorySetting", -968246568);
        setIntField(term356971, term356971.getClass(), "playedTutorialBit", -1335969330);
        setIntField(term356971, term356971.getClass(), "firstTutorialCancelNum", -225280908);
        setLongField(term356971, term356971.getClass(), "sumTechHighScore", 1992793234696277225L);
        setLongField(term356971, term356971.getClass(), "sumTechBasicHighScore", 5458607683006959978L);
        setLongField(term356971, term356971.getClass(), "sumTechAdvancedHighScore", 2928100280390535115L);
        setLongField(term356971, term356971.getClass(), "sumTechExpertHighScore", 503067562723774855L);
        setLongField(term356971, term356971.getClass(), "sumTechMasterHighScore", -3341922971083395787L);
        setLongField(term356971, term356971.getClass(), "sumTechLunaticHighScore", -8864304180410800646L);
        setLongField(term356971, term356971.getClass(), "sumBattleHighScore", 2817938043917692667L);
        setLongField(term356971, term356971.getClass(), "sumBattleBasicHighScore", 6106522177536038196L);
        setLongField(term356971, term356971.getClass(), "sumBattleAdvancedHighScore", 6077998028031048806L);
        setLongField(term356971, term356971.getClass(), "sumBattleExpertHighScore", 9004980311123922941L);
        setLongField(term356971, term356971.getClass(), "sumBattleMasterHighScore", -6611293246433755373L);
        setLongField(term356971, term356971.getClass(), "sumBattleLunaticHighScore", -7977745937186483455L);
        setField(term356971, term356971.getClass(), "eventWatchedDate", "beHKTyEsPG");
        setField(term356971, term356971.getClass(), "cmEventWatchedDate", "tFQbHKqwNK");
        setField(term356971, term356971.getClass(), "firstGameId", "oMmWgfbmwS");
        setField(term356971, term356971.getClass(), "firstRomVersion", "QreFiHgQtA");
        setField(term356971, term356971.getClass(), "firstDataVersion", "BTPXZrdCMh");
        setField(term356971, term356971.getClass(), "firstPlayDate", "QsTeQoennG");
        setField(term356971, term356971.getClass(), "lastGameId", "usqBzmmwqY");
        setField(term356971, term356971.getClass(), "lastRomVersion", "JkifeWxvfj");
        setField(term356971, term356971.getClass(), "lastDataVersion", "OwqAVeoEmD");
        setField(term356971, term356971.getClass(), "compatibleCmVersion", "elULqOCaCg");
        setField(term356971, term356971.getClass(), "lastPlayDate", "JzQtKVDWeX");
        setIntField(term356971, term356971.getClass(), "lastPlaceId", 119436095);
        setField(term356971, term356971.getClass(), "lastPlaceName", "VtkumdeGYO");
        setIntField(term356971, term356971.getClass(), "lastRegionId", 2144217610);
        setField(term356971, term356971.getClass(), "lastRegionName", "chSGxkbeAc");
        setIntField(term356971, term356971.getClass(), "lastAllNetId", -260970475);
        setField(term356971, term356971.getClass(), "lastClientId", "wnxOndGYJi");
        setIntField(term356971, term356971.getClass(), "lastUsedDeckId", -1914668834);
        setIntField(term356971, term356971.getClass(), "lastPlayMusicLevel", -1077375760);
        setIntField(term356971, term356971.getClass(), "lastEmoneyBrand", 763912471);
        setField(term356969, term356969.getClass(), "user", term356971);
        setIntField(term356969, term356969.getClass(), "eventId", 543268107);
        setIntField(term356969, term356969.getClass(), "totalTechScore", -277768062);
        setIntField(term356969, term356969.getClass(), "totalPlatinumScore", 1660579366);
        setField(term356969, term356969.getClass(), "techRecordDate", "BOLQzJFvBT");
        setBooleanField(term356969, term356969.getClass(), "isRankingRewarded", true);
        setBooleanField(term356969, term356969.getClass(), "isTotalTechNewRecord", false);
        term357251 = new Integer(1070048738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term357251;
        callMethod(klass, "setTotalTechScore", argTypes, term356969, args);
    }

};


