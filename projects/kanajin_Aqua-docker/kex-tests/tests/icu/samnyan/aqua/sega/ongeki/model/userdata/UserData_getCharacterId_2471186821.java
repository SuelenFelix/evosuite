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

public class UserData_getCharacterId_2471186821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30801;

    public UserData_getCharacterId_2471186821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30805 = new Long(-5248475803419977214L);
        term30801 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term30803 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term30819 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30820 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30824 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30834 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term30801, term30801.getClass(), "id", 9005525882295990505L);
        setLongField(term30803, term30803.getClass(), "id", -604910205679247392L);
        setField(term30803, term30803.getClass(), "extId", term30805);
        setField(term30803, term30803.getClass(), "luid", "IlQxArYcgB");
        setIntField(term30820, term30820.getClass(), "year", 2029);
        setShortField(term30820, term30820.getClass(), "month", (short) 5);
        setShortField(term30820, term30820.getClass(), "day", (short) 11);
        setField(term30819, term30819.getClass(), "date", term30820);
        setByteField(term30824, term30824.getClass(), "hour", (byte) 20);
        setByteField(term30824, term30824.getClass(), "minute", (byte) 17);
        setByteField(term30824, term30824.getClass(), "second", (byte) 32);
        setIntField(term30824, term30824.getClass(), "nano", 327503582);
        setField(term30819, term30819.getClass(), "time", term30824);
        setField(term30803, term30803.getClass(), "registerTime", term30819);
        setIntField(term30830, term30830.getClass(), "year", 2012);
        setShortField(term30830, term30830.getClass(), "month", (short) 10);
        setShortField(term30830, term30830.getClass(), "day", (short) 1);
        setField(term30829, term30829.getClass(), "date", term30830);
        setByteField(term30834, term30834.getClass(), "hour", (byte) 9);
        setByteField(term30834, term30834.getClass(), "minute", (byte) 27);
        setByteField(term30834, term30834.getClass(), "second", (byte) 33);
        setIntField(term30834, term30834.getClass(), "nano", 714912000);
        setField(term30829, term30829.getClass(), "time", term30834);
        setField(term30803, term30803.getClass(), "accessTime", term30829);
        setField(term30801, term30801.getClass(), "card", term30803);
        setField(term30801, term30801.getClass(), "userName", "lIgKCvCuoH");
        setIntField(term30801, term30801.getClass(), "level", -1672904007);
        setIntField(term30801, term30801.getClass(), "reincarnationNum", -217232010);
        setLongField(term30801, term30801.getClass(), "exp", 2280240558714436788L);
        setLongField(term30801, term30801.getClass(), "point", 9164041864010757052L);
        setLongField(term30801, term30801.getClass(), "totalPoint", -4710087184100544875L);
        setIntField(term30801, term30801.getClass(), "playCount", 2053372601);
        setIntField(term30801, term30801.getClass(), "jewelCount", -1828855069);
        setIntField(term30801, term30801.getClass(), "totalJewelCount", -1213694931);
        setIntField(term30801, term30801.getClass(), "medalCount", -1255656944);
        setIntField(term30801, term30801.getClass(), "playerRating", -377697034);
        setIntField(term30801, term30801.getClass(), "highestRating", 1102778743);
        setIntField(term30801, term30801.getClass(), "battlePoint", 1300928519);
        setIntField(term30801, term30801.getClass(), "bestBattlePoint", 338172676);
        setIntField(term30801, term30801.getClass(), "overDamageBattlePoint", -1896960942);
        setBooleanField(term30801, term30801.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term30801, term30801.getClass(), "nameplateId", -935912608);
        setIntField(term30801, term30801.getClass(), "trophyId", 505087197);
        setIntField(term30801, term30801.getClass(), "cardId", 427005798);
        setIntField(term30801, term30801.getClass(), "characterId", -993454505);
        setIntField(term30801, term30801.getClass(), "characterVoiceNo", -238353821);
        setIntField(term30801, term30801.getClass(), "tabSetting", -818992228);
        setIntField(term30801, term30801.getClass(), "tabSortSetting", 2087429143);
        setIntField(term30801, term30801.getClass(), "cardCategorySetting", -1892890104);
        setIntField(term30801, term30801.getClass(), "cardSortSetting", 2003356558);
        setIntField(term30801, term30801.getClass(), "rivalScoreCategorySetting", -638126185);
        setIntField(term30801, term30801.getClass(), "playedTutorialBit", 28070985);
        setIntField(term30801, term30801.getClass(), "firstTutorialCancelNum", 334110739);
        setLongField(term30801, term30801.getClass(), "sumTechHighScore", 8351267378333718210L);
        setLongField(term30801, term30801.getClass(), "sumTechBasicHighScore", 9162413454188628116L);
        setLongField(term30801, term30801.getClass(), "sumTechAdvancedHighScore", 6077385331237778943L);
        setLongField(term30801, term30801.getClass(), "sumTechExpertHighScore", -5803004674995774129L);
        setLongField(term30801, term30801.getClass(), "sumTechMasterHighScore", 5467431248910278098L);
        setLongField(term30801, term30801.getClass(), "sumTechLunaticHighScore", -6624097117784103684L);
        setLongField(term30801, term30801.getClass(), "sumBattleHighScore", 4418899868035922058L);
        setLongField(term30801, term30801.getClass(), "sumBattleBasicHighScore", 4663932691158406829L);
        setLongField(term30801, term30801.getClass(), "sumBattleAdvancedHighScore", -5802364286448544947L);
        setLongField(term30801, term30801.getClass(), "sumBattleExpertHighScore", 7633060281229939158L);
        setLongField(term30801, term30801.getClass(), "sumBattleMasterHighScore", 4171742078739516731L);
        setLongField(term30801, term30801.getClass(), "sumBattleLunaticHighScore", 4391974157316283404L);
        setField(term30801, term30801.getClass(), "eventWatchedDate", "dHuWgRwLOm");
        setField(term30801, term30801.getClass(), "cmEventWatchedDate", "PsTQDxNIld");
        setField(term30801, term30801.getClass(), "firstGameId", "uoBijJjvaj");
        setField(term30801, term30801.getClass(), "firstRomVersion", "BdsLFSRWda");
        setField(term30801, term30801.getClass(), "firstDataVersion", "tMhhBYonAI");
        setField(term30801, term30801.getClass(), "firstPlayDate", "AaQRshwIQC");
        setField(term30801, term30801.getClass(), "lastGameId", "rHgKCfgCsg");
        setField(term30801, term30801.getClass(), "lastRomVersion", "AWtIUOuutt");
        setField(term30801, term30801.getClass(), "lastDataVersion", "jBgJZpHifl");
        setField(term30801, term30801.getClass(), "compatibleCmVersion", "azMTTmEXnh");
        setField(term30801, term30801.getClass(), "lastPlayDate", "BjJtxwsIpt");
        setIntField(term30801, term30801.getClass(), "lastPlaceId", -1724529322);
        setField(term30801, term30801.getClass(), "lastPlaceName", "gUQhOyGfzF");
        setIntField(term30801, term30801.getClass(), "lastRegionId", 1843465187);
        setField(term30801, term30801.getClass(), "lastRegionName", "IqDObvPBZX");
        setIntField(term30801, term30801.getClass(), "lastAllNetId", 529595969);
        setField(term30801, term30801.getClass(), "lastClientId", "NITCrIISoC");
        setIntField(term30801, term30801.getClass(), "lastUsedDeckId", -1548733886);
        setIntField(term30801, term30801.getClass(), "lastPlayMusicLevel", 1543539715);
        setIntField(term30801, term30801.getClass(), "lastEmoneyBrand", 1744599521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term30801, args);
    }

};


