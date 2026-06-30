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

public class UserData_setOverDamageBattlePoint_199207029578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55008;
     Object term55271;

    public UserData_setOverDamageBattlePoint_199207029578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55012 = new Long(-1804015692891701666L);
        term55008 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term55010 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55036 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55037 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55041 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55008, term55008.getClass(), "id", -5051305828138891800L);
        setLongField(term55010, term55010.getClass(), "id", 8023209931514440397L);
        setField(term55010, term55010.getClass(), "extId", term55012);
        setField(term55010, term55010.getClass(), "luid", "twDnEqZglX");
        setIntField(term55027, term55027.getClass(), "year", 2010);
        setShortField(term55027, term55027.getClass(), "month", (short) 5);
        setShortField(term55027, term55027.getClass(), "day", (short) 19);
        setField(term55026, term55026.getClass(), "date", term55027);
        setByteField(term55031, term55031.getClass(), "hour", (byte) 12);
        setByteField(term55031, term55031.getClass(), "minute", (byte) 17);
        setByteField(term55031, term55031.getClass(), "second", (byte) 52);
        setIntField(term55031, term55031.getClass(), "nano", 273610077);
        setField(term55026, term55026.getClass(), "time", term55031);
        setField(term55010, term55010.getClass(), "registerTime", term55026);
        setIntField(term55037, term55037.getClass(), "year", 2017);
        setShortField(term55037, term55037.getClass(), "month", (short) 4);
        setShortField(term55037, term55037.getClass(), "day", (short) 5);
        setField(term55036, term55036.getClass(), "date", term55037);
        setByteField(term55041, term55041.getClass(), "hour", (byte) 15);
        setByteField(term55041, term55041.getClass(), "minute", (byte) 9);
        setByteField(term55041, term55041.getClass(), "second", (byte) 36);
        setIntField(term55041, term55041.getClass(), "nano", 504876449);
        setField(term55036, term55036.getClass(), "time", term55041);
        setField(term55010, term55010.getClass(), "accessTime", term55036);
        setField(term55008, term55008.getClass(), "card", term55010);
        setField(term55008, term55008.getClass(), "userName", "TWzZFATLAj");
        setIntField(term55008, term55008.getClass(), "level", -1878694006);
        setIntField(term55008, term55008.getClass(), "reincarnationNum", 1950167487);
        setLongField(term55008, term55008.getClass(), "exp", 3229827238251743416L);
        setLongField(term55008, term55008.getClass(), "point", -1624594002510583135L);
        setLongField(term55008, term55008.getClass(), "totalPoint", -8686015569355599560L);
        setIntField(term55008, term55008.getClass(), "playCount", 1031826708);
        setIntField(term55008, term55008.getClass(), "jewelCount", -735726273);
        setIntField(term55008, term55008.getClass(), "totalJewelCount", 1618278091);
        setIntField(term55008, term55008.getClass(), "medalCount", -548967985);
        setIntField(term55008, term55008.getClass(), "playerRating", -1923425156);
        setIntField(term55008, term55008.getClass(), "highestRating", 1237861885);
        setIntField(term55008, term55008.getClass(), "battlePoint", 1433214025);
        setIntField(term55008, term55008.getClass(), "bestBattlePoint", 1424797105);
        setIntField(term55008, term55008.getClass(), "overDamageBattlePoint", 386281072);
        setBooleanField(term55008, term55008.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term55008, term55008.getClass(), "nameplateId", -782180775);
        setIntField(term55008, term55008.getClass(), "trophyId", -1971308334);
        setIntField(term55008, term55008.getClass(), "cardId", -2070149565);
        setIntField(term55008, term55008.getClass(), "characterId", 1682543276);
        setIntField(term55008, term55008.getClass(), "characterVoiceNo", 156914536);
        setIntField(term55008, term55008.getClass(), "tabSetting", -1745894636);
        setIntField(term55008, term55008.getClass(), "tabSortSetting", 571282234);
        setIntField(term55008, term55008.getClass(), "cardCategorySetting", 1131350330);
        setIntField(term55008, term55008.getClass(), "cardSortSetting", -1463702476);
        setIntField(term55008, term55008.getClass(), "rivalScoreCategorySetting", 90151812);
        setIntField(term55008, term55008.getClass(), "playedTutorialBit", -416703693);
        setIntField(term55008, term55008.getClass(), "firstTutorialCancelNum", -1718111500);
        setLongField(term55008, term55008.getClass(), "sumTechHighScore", 5562155951994796526L);
        setLongField(term55008, term55008.getClass(), "sumTechBasicHighScore", -292696468317320629L);
        setLongField(term55008, term55008.getClass(), "sumTechAdvancedHighScore", 225938424578773140L);
        setLongField(term55008, term55008.getClass(), "sumTechExpertHighScore", 2075261430191543110L);
        setLongField(term55008, term55008.getClass(), "sumTechMasterHighScore", 6988441824698665724L);
        setLongField(term55008, term55008.getClass(), "sumTechLunaticHighScore", -4515956536909746513L);
        setLongField(term55008, term55008.getClass(), "sumBattleHighScore", -6677795573873753988L);
        setLongField(term55008, term55008.getClass(), "sumBattleBasicHighScore", 7779093916932577607L);
        setLongField(term55008, term55008.getClass(), "sumBattleAdvancedHighScore", 3437816211301899263L);
        setLongField(term55008, term55008.getClass(), "sumBattleExpertHighScore", 5390474329543871819L);
        setLongField(term55008, term55008.getClass(), "sumBattleMasterHighScore", 8749770092315515620L);
        setLongField(term55008, term55008.getClass(), "sumBattleLunaticHighScore", 1347723683044734453L);
        setField(term55008, term55008.getClass(), "eventWatchedDate", "QjsqHrtVMY");
        setField(term55008, term55008.getClass(), "cmEventWatchedDate", "PlQZGGhnZK");
        setField(term55008, term55008.getClass(), "firstGameId", "sTtLCWDEPO");
        setField(term55008, term55008.getClass(), "firstRomVersion", "UGMtNRjhnC");
        setField(term55008, term55008.getClass(), "firstDataVersion", "oTnPmmIphJ");
        setField(term55008, term55008.getClass(), "firstPlayDate", "vTgJolwQXF");
        setField(term55008, term55008.getClass(), "lastGameId", "QuNSfeKtAH");
        setField(term55008, term55008.getClass(), "lastRomVersion", "vFhRdscfFA");
        setField(term55008, term55008.getClass(), "lastDataVersion", "ZmfocrvaII");
        setField(term55008, term55008.getClass(), "compatibleCmVersion", "LTbQXrGKuA");
        setField(term55008, term55008.getClass(), "lastPlayDate", "gzmGmDALUv");
        setIntField(term55008, term55008.getClass(), "lastPlaceId", 2134049264);
        setField(term55008, term55008.getClass(), "lastPlaceName", "ZRoptBRTDM");
        setIntField(term55008, term55008.getClass(), "lastRegionId", -619693439);
        setField(term55008, term55008.getClass(), "lastRegionName", "vVVFChfeBQ");
        setIntField(term55008, term55008.getClass(), "lastAllNetId", 1886882056);
        setField(term55008, term55008.getClass(), "lastClientId", "aASfcqfBbh");
        setIntField(term55008, term55008.getClass(), "lastUsedDeckId", -689559993);
        setIntField(term55008, term55008.getClass(), "lastPlayMusicLevel", 263696243);
        setIntField(term55008, term55008.getClass(), "lastEmoneyBrand", -2012537672);
        term55271 = new Integer(-879433115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term55271;
        callMethod(klass, "setOverDamageBattlePoint", argTypes, term55008, args);
    }

};


