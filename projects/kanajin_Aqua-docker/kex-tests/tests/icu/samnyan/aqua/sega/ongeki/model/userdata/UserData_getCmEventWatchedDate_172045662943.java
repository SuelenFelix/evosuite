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

public class UserData_getCmEventWatchedDate_172045662943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40107;

    public UserData_getCmEventWatchedDate_172045662943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40111 = new Long(-2177368829816872572L);
        term40107 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term40109 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40125 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40126 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40130 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40140 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40107, term40107.getClass(), "id", -8478725267603949004L);
        setLongField(term40109, term40109.getClass(), "id", 7338947505433756976L);
        setField(term40109, term40109.getClass(), "extId", term40111);
        setField(term40109, term40109.getClass(), "luid", "btdGZUcaZl");
        setIntField(term40126, term40126.getClass(), "year", 2023);
        setShortField(term40126, term40126.getClass(), "month", (short) 12);
        setShortField(term40126, term40126.getClass(), "day", (short) 12);
        setField(term40125, term40125.getClass(), "date", term40126);
        setByteField(term40130, term40130.getClass(), "hour", (byte) 0);
        setByteField(term40130, term40130.getClass(), "minute", (byte) 12);
        setByteField(term40130, term40130.getClass(), "second", (byte) 38);
        setIntField(term40130, term40130.getClass(), "nano", 430999236);
        setField(term40125, term40125.getClass(), "time", term40130);
        setField(term40109, term40109.getClass(), "registerTime", term40125);
        setIntField(term40136, term40136.getClass(), "year", 2018);
        setShortField(term40136, term40136.getClass(), "month", (short) 6);
        setShortField(term40136, term40136.getClass(), "day", (short) 17);
        setField(term40135, term40135.getClass(), "date", term40136);
        setByteField(term40140, term40140.getClass(), "hour", (byte) 1);
        setByteField(term40140, term40140.getClass(), "minute", (byte) 3);
        setByteField(term40140, term40140.getClass(), "second", (byte) 5);
        setIntField(term40140, term40140.getClass(), "nano", 914834044);
        setField(term40135, term40135.getClass(), "time", term40140);
        setField(term40109, term40109.getClass(), "accessTime", term40135);
        setField(term40107, term40107.getClass(), "card", term40109);
        setField(term40107, term40107.getClass(), "userName", "WnEAVdCxna");
        setIntField(term40107, term40107.getClass(), "level", -1289681614);
        setIntField(term40107, term40107.getClass(), "reincarnationNum", 496461454);
        setLongField(term40107, term40107.getClass(), "exp", -6284173466459484010L);
        setLongField(term40107, term40107.getClass(), "point", -5513509665682251667L);
        setLongField(term40107, term40107.getClass(), "totalPoint", 4680638415078495388L);
        setIntField(term40107, term40107.getClass(), "playCount", -697047947);
        setIntField(term40107, term40107.getClass(), "jewelCount", 505327656);
        setIntField(term40107, term40107.getClass(), "totalJewelCount", 1779734830);
        setIntField(term40107, term40107.getClass(), "medalCount", -714618793);
        setIntField(term40107, term40107.getClass(), "playerRating", 1350743761);
        setIntField(term40107, term40107.getClass(), "highestRating", -2100246850);
        setIntField(term40107, term40107.getClass(), "battlePoint", 174682854);
        setIntField(term40107, term40107.getClass(), "bestBattlePoint", -1618786023);
        setIntField(term40107, term40107.getClass(), "overDamageBattlePoint", -316033780);
        setBooleanField(term40107, term40107.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term40107, term40107.getClass(), "nameplateId", -1242223364);
        setIntField(term40107, term40107.getClass(), "trophyId", -347672279);
        setIntField(term40107, term40107.getClass(), "cardId", -2001561246);
        setIntField(term40107, term40107.getClass(), "characterId", -526492477);
        setIntField(term40107, term40107.getClass(), "characterVoiceNo", 934758494);
        setIntField(term40107, term40107.getClass(), "tabSetting", -1458746421);
        setIntField(term40107, term40107.getClass(), "tabSortSetting", 1248508832);
        setIntField(term40107, term40107.getClass(), "cardCategorySetting", -1508290965);
        setIntField(term40107, term40107.getClass(), "cardSortSetting", -537204050);
        setIntField(term40107, term40107.getClass(), "rivalScoreCategorySetting", 549083285);
        setIntField(term40107, term40107.getClass(), "playedTutorialBit", 110630919);
        setIntField(term40107, term40107.getClass(), "firstTutorialCancelNum", 2002558305);
        setLongField(term40107, term40107.getClass(), "sumTechHighScore", 7744119580121297988L);
        setLongField(term40107, term40107.getClass(), "sumTechBasicHighScore", 5705211845607271062L);
        setLongField(term40107, term40107.getClass(), "sumTechAdvancedHighScore", 4947168794582157385L);
        setLongField(term40107, term40107.getClass(), "sumTechExpertHighScore", -9079056015194933995L);
        setLongField(term40107, term40107.getClass(), "sumTechMasterHighScore", -8867721217716506903L);
        setLongField(term40107, term40107.getClass(), "sumTechLunaticHighScore", -1244148850479968082L);
        setLongField(term40107, term40107.getClass(), "sumBattleHighScore", 8346326079558512850L);
        setLongField(term40107, term40107.getClass(), "sumBattleBasicHighScore", 4554910377138538493L);
        setLongField(term40107, term40107.getClass(), "sumBattleAdvancedHighScore", -2306787824604312942L);
        setLongField(term40107, term40107.getClass(), "sumBattleExpertHighScore", 5604034478428783596L);
        setLongField(term40107, term40107.getClass(), "sumBattleMasterHighScore", 2830531040991289470L);
        setLongField(term40107, term40107.getClass(), "sumBattleLunaticHighScore", -5227262300045722571L);
        setField(term40107, term40107.getClass(), "eventWatchedDate", "lnPIxHHyEK");
        setField(term40107, term40107.getClass(), "cmEventWatchedDate", "unvQfYuBUz");
        setField(term40107, term40107.getClass(), "firstGameId", "RqnYUpQBbG");
        setField(term40107, term40107.getClass(), "firstRomVersion", "sKnuhmcjCC");
        setField(term40107, term40107.getClass(), "firstDataVersion", "oCBbVNwMnb");
        setField(term40107, term40107.getClass(), "firstPlayDate", "miJxAzOVJy");
        setField(term40107, term40107.getClass(), "lastGameId", "kjqlBVaviD");
        setField(term40107, term40107.getClass(), "lastRomVersion", "iVRXRDCrcM");
        setField(term40107, term40107.getClass(), "lastDataVersion", "WAZFhrxcSM");
        setField(term40107, term40107.getClass(), "compatibleCmVersion", "gCRUlTuVMX");
        setField(term40107, term40107.getClass(), "lastPlayDate", "tYBgGQtkhi");
        setIntField(term40107, term40107.getClass(), "lastPlaceId", -1729207675);
        setField(term40107, term40107.getClass(), "lastPlaceName", "PhGPFLIMKH");
        setIntField(term40107, term40107.getClass(), "lastRegionId", -861852803);
        setField(term40107, term40107.getClass(), "lastRegionName", "pWCYcLhoms");
        setIntField(term40107, term40107.getClass(), "lastAllNetId", -2085852488);
        setField(term40107, term40107.getClass(), "lastClientId", "IWNJVfvTuw");
        setIntField(term40107, term40107.getClass(), "lastUsedDeckId", 600214846);
        setIntField(term40107, term40107.getClass(), "lastPlayMusicLevel", 697208850);
        setIntField(term40107, term40107.getClass(), "lastEmoneyBrand", -973142506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmEventWatchedDate", argTypes, term40107, args);
    }

};


