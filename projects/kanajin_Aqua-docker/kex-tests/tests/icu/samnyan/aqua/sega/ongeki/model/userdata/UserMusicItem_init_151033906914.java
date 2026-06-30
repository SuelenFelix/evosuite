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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserMusicItem_init_151033906914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5979;
     Object term5981;
     Object term6244;
     Object term6246;

    public UserMusicItem_init_151033906914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5979 = new Long(-4714000263923324167L);
        Long term5985 = new Long(-5476826692763582090L);
        term5981 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term5983 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6009 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6010 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6014 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5981, term5981.getClass(), "id", 6906379511067694917L);
        setLongField(term5983, term5983.getClass(), "id", -9204303423581447271L);
        setField(term5983, term5983.getClass(), "extId", term5985);
        setField(term5983, term5983.getClass(), "luid", "NzBMMhkhpT");
        setIntField(term6000, term6000.getClass(), "year", 2021);
        setShortField(term6000, term6000.getClass(), "month", (short) 8);
        setShortField(term6000, term6000.getClass(), "day", (short) 12);
        setField(term5999, term5999.getClass(), "date", term6000);
        setByteField(term6004, term6004.getClass(), "hour", (byte) 2);
        setByteField(term6004, term6004.getClass(), "minute", (byte) 17);
        setByteField(term6004, term6004.getClass(), "second", (byte) 51);
        setIntField(term6004, term6004.getClass(), "nano", 207375141);
        setField(term5999, term5999.getClass(), "time", term6004);
        setField(term5983, term5983.getClass(), "registerTime", term5999);
        setIntField(term6010, term6010.getClass(), "year", 2025);
        setShortField(term6010, term6010.getClass(), "month", (short) 11);
        setShortField(term6010, term6010.getClass(), "day", (short) 3);
        setField(term6009, term6009.getClass(), "date", term6010);
        setByteField(term6014, term6014.getClass(), "hour", (byte) 21);
        setByteField(term6014, term6014.getClass(), "minute", (byte) 24);
        setByteField(term6014, term6014.getClass(), "second", (byte) 23);
        setIntField(term6014, term6014.getClass(), "nano", 210986721);
        setField(term6009, term6009.getClass(), "time", term6014);
        setField(term5983, term5983.getClass(), "accessTime", term6009);
        setField(term5981, term5981.getClass(), "card", term5983);
        setField(term5981, term5981.getClass(), "userName", "qCpEbQDHdF");
        setIntField(term5981, term5981.getClass(), "level", 752152965);
        setIntField(term5981, term5981.getClass(), "reincarnationNum", -1577069773);
        setLongField(term5981, term5981.getClass(), "exp", 6248239231585852341L);
        setLongField(term5981, term5981.getClass(), "point", -88538481937688851L);
        setLongField(term5981, term5981.getClass(), "totalPoint", 4069264186851023313L);
        setIntField(term5981, term5981.getClass(), "playCount", -266625190);
        setIntField(term5981, term5981.getClass(), "jewelCount", 489201218);
        setIntField(term5981, term5981.getClass(), "totalJewelCount", 464181937);
        setIntField(term5981, term5981.getClass(), "medalCount", -1455526612);
        setIntField(term5981, term5981.getClass(), "playerRating", -941356098);
        setIntField(term5981, term5981.getClass(), "highestRating", -201517446);
        setIntField(term5981, term5981.getClass(), "battlePoint", -97742366);
        setIntField(term5981, term5981.getClass(), "bestBattlePoint", 1638851942);
        setIntField(term5981, term5981.getClass(), "overDamageBattlePoint", 1374790203);
        setBooleanField(term5981, term5981.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term5981, term5981.getClass(), "nameplateId", 1160010161);
        setIntField(term5981, term5981.getClass(), "trophyId", -423900705);
        setIntField(term5981, term5981.getClass(), "cardId", -525570815);
        setIntField(term5981, term5981.getClass(), "characterId", 754055848);
        setIntField(term5981, term5981.getClass(), "characterVoiceNo", -19246901);
        setIntField(term5981, term5981.getClass(), "tabSetting", -370828664);
        setIntField(term5981, term5981.getClass(), "tabSortSetting", 1168633950);
        setIntField(term5981, term5981.getClass(), "cardCategorySetting", 1607082164);
        setIntField(term5981, term5981.getClass(), "cardSortSetting", 1890399366);
        setIntField(term5981, term5981.getClass(), "rivalScoreCategorySetting", -1867239125);
        setIntField(term5981, term5981.getClass(), "playedTutorialBit", 952869601);
        setIntField(term5981, term5981.getClass(), "firstTutorialCancelNum", 91958879);
        setLongField(term5981, term5981.getClass(), "sumTechHighScore", 5184635470881147510L);
        setLongField(term5981, term5981.getClass(), "sumTechBasicHighScore", 918397384129253729L);
        setLongField(term5981, term5981.getClass(), "sumTechAdvancedHighScore", -2187638136407967948L);
        setLongField(term5981, term5981.getClass(), "sumTechExpertHighScore", 8708846223293804408L);
        setLongField(term5981, term5981.getClass(), "sumTechMasterHighScore", -2986201902216133814L);
        setLongField(term5981, term5981.getClass(), "sumTechLunaticHighScore", 4255811647459029682L);
        setLongField(term5981, term5981.getClass(), "sumBattleHighScore", 8000844860910174690L);
        setLongField(term5981, term5981.getClass(), "sumBattleBasicHighScore", 2209808079059619773L);
        setLongField(term5981, term5981.getClass(), "sumBattleAdvancedHighScore", 8403492202041709902L);
        setLongField(term5981, term5981.getClass(), "sumBattleExpertHighScore", -113028659747841511L);
        setLongField(term5981, term5981.getClass(), "sumBattleMasterHighScore", 7271112616766426991L);
        setLongField(term5981, term5981.getClass(), "sumBattleLunaticHighScore", -8514728180792822493L);
        setField(term5981, term5981.getClass(), "eventWatchedDate", "AHbZyFOmlo");
        setField(term5981, term5981.getClass(), "cmEventWatchedDate", "TwfWVQGiIj");
        setField(term5981, term5981.getClass(), "firstGameId", "gUvcueTURF");
        setField(term5981, term5981.getClass(), "firstRomVersion", "EwQBhZjCIT");
        setField(term5981, term5981.getClass(), "firstDataVersion", "aSkmSwTnEw");
        setField(term5981, term5981.getClass(), "firstPlayDate", "xvkbvaEGYd");
        setField(term5981, term5981.getClass(), "lastGameId", "HBGNxdNURv");
        setField(term5981, term5981.getClass(), "lastRomVersion", "mfCpTPPQQm");
        setField(term5981, term5981.getClass(), "lastDataVersion", "OcJCIDNIXA");
        setField(term5981, term5981.getClass(), "compatibleCmVersion", "XfRABIFVEp");
        setField(term5981, term5981.getClass(), "lastPlayDate", "MHGKyEnwKc");
        setIntField(term5981, term5981.getClass(), "lastPlaceId", -645429025);
        setField(term5981, term5981.getClass(), "lastPlaceName", "ShIELyuULw");
        setIntField(term5981, term5981.getClass(), "lastRegionId", -688213483);
        setField(term5981, term5981.getClass(), "lastRegionName", "IpQuOGMgmj");
        setIntField(term5981, term5981.getClass(), "lastAllNetId", 644154104);
        setField(term5981, term5981.getClass(), "lastClientId", "pJbnHTYrxn");
        setIntField(term5981, term5981.getClass(), "lastUsedDeckId", 76650923);
        setIntField(term5981, term5981.getClass(), "lastPlayMusicLevel", 1003743923);
        setIntField(term5981, term5981.getClass(), "lastEmoneyBrand", 1887772522);
        term6244 = new Integer(354196060);
        term6246 = new Integer(-1840305774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term5979;
        args[1] = term5981;
        args[2] = term6244;
        args[3] = term6246;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


