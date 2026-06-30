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

public class UserKop_getAreaId_2291449845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273061;

    public UserKop_getAreaId_2291449845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273067 = new Long(8640463098965331396L);
        term273061 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term273063 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term273065 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term273081 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273082 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273086 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273096 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273061, term273061.getClass(), "id", -3141616557728371938L);
        setLongField(term273063, term273063.getClass(), "id", 5856519380743730900L);
        setLongField(term273065, term273065.getClass(), "id", -8465837051485668399L);
        setField(term273065, term273065.getClass(), "extId", term273067);
        setField(term273065, term273065.getClass(), "luid", "oTXsJGhPMO");
        setIntField(term273082, term273082.getClass(), "year", 2022);
        setShortField(term273082, term273082.getClass(), "month", (short) 6);
        setShortField(term273082, term273082.getClass(), "day", (short) 19);
        setField(term273081, term273081.getClass(), "date", term273082);
        setByteField(term273086, term273086.getClass(), "hour", (byte) 15);
        setByteField(term273086, term273086.getClass(), "minute", (byte) 38);
        setByteField(term273086, term273086.getClass(), "second", (byte) 10);
        setIntField(term273086, term273086.getClass(), "nano", 24107837);
        setField(term273081, term273081.getClass(), "time", term273086);
        setField(term273065, term273065.getClass(), "registerTime", term273081);
        setIntField(term273092, term273092.getClass(), "year", 2025);
        setShortField(term273092, term273092.getClass(), "month", (short) 3);
        setShortField(term273092, term273092.getClass(), "day", (short) 12);
        setField(term273091, term273091.getClass(), "date", term273092);
        setByteField(term273096, term273096.getClass(), "hour", (byte) 23);
        setByteField(term273096, term273096.getClass(), "minute", (byte) 18);
        setByteField(term273096, term273096.getClass(), "second", (byte) 49);
        setIntField(term273096, term273096.getClass(), "nano", 554399902);
        setField(term273091, term273091.getClass(), "time", term273096);
        setField(term273065, term273065.getClass(), "accessTime", term273091);
        setField(term273063, term273063.getClass(), "card", term273065);
        setField(term273063, term273063.getClass(), "userName", "VKSQjeEwka");
        setIntField(term273063, term273063.getClass(), "level", -1311729867);
        setIntField(term273063, term273063.getClass(), "reincarnationNum", -1200285703);
        setLongField(term273063, term273063.getClass(), "exp", 3884082146833094381L);
        setLongField(term273063, term273063.getClass(), "point", 5347964522902878449L);
        setLongField(term273063, term273063.getClass(), "totalPoint", -6399289914085130370L);
        setIntField(term273063, term273063.getClass(), "playCount", 1578047630);
        setIntField(term273063, term273063.getClass(), "jewelCount", -266967108);
        setIntField(term273063, term273063.getClass(), "totalJewelCount", -1251353595);
        setIntField(term273063, term273063.getClass(), "medalCount", -1106786876);
        setIntField(term273063, term273063.getClass(), "playerRating", -1985822835);
        setIntField(term273063, term273063.getClass(), "highestRating", -47812160);
        setIntField(term273063, term273063.getClass(), "battlePoint", -1473188946);
        setIntField(term273063, term273063.getClass(), "bestBattlePoint", 659834492);
        setIntField(term273063, term273063.getClass(), "overDamageBattlePoint", 1792053121);
        setBooleanField(term273063, term273063.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term273063, term273063.getClass(), "nameplateId", 1546609260);
        setIntField(term273063, term273063.getClass(), "trophyId", 714773981);
        setIntField(term273063, term273063.getClass(), "cardId", -1344815823);
        setIntField(term273063, term273063.getClass(), "characterId", 1199437462);
        setIntField(term273063, term273063.getClass(), "characterVoiceNo", -2079545024);
        setIntField(term273063, term273063.getClass(), "tabSetting", -507889735);
        setIntField(term273063, term273063.getClass(), "tabSortSetting", 1324579088);
        setIntField(term273063, term273063.getClass(), "cardCategorySetting", -896063951);
        setIntField(term273063, term273063.getClass(), "cardSortSetting", -1627319943);
        setIntField(term273063, term273063.getClass(), "rivalScoreCategorySetting", 88183349);
        setIntField(term273063, term273063.getClass(), "playedTutorialBit", -170217683);
        setIntField(term273063, term273063.getClass(), "firstTutorialCancelNum", -1344453784);
        setLongField(term273063, term273063.getClass(), "sumTechHighScore", 1530672874918410705L);
        setLongField(term273063, term273063.getClass(), "sumTechBasicHighScore", -6655121235167409628L);
        setLongField(term273063, term273063.getClass(), "sumTechAdvancedHighScore", -8282880649726465919L);
        setLongField(term273063, term273063.getClass(), "sumTechExpertHighScore", -6411702594182735307L);
        setLongField(term273063, term273063.getClass(), "sumTechMasterHighScore", 7051482691766700370L);
        setLongField(term273063, term273063.getClass(), "sumTechLunaticHighScore", 8878117138932980189L);
        setLongField(term273063, term273063.getClass(), "sumBattleHighScore", 3211545370978154136L);
        setLongField(term273063, term273063.getClass(), "sumBattleBasicHighScore", 4891224521937823114L);
        setLongField(term273063, term273063.getClass(), "sumBattleAdvancedHighScore", 8363078945328010417L);
        setLongField(term273063, term273063.getClass(), "sumBattleExpertHighScore", 2019985972335610249L);
        setLongField(term273063, term273063.getClass(), "sumBattleMasterHighScore", 7450713490061541958L);
        setLongField(term273063, term273063.getClass(), "sumBattleLunaticHighScore", 4019507640794494449L);
        setField(term273063, term273063.getClass(), "eventWatchedDate", "rvyeTnWWlf");
        setField(term273063, term273063.getClass(), "cmEventWatchedDate", "qwmljKSBGF");
        setField(term273063, term273063.getClass(), "firstGameId", "ehfwuHuJCM");
        setField(term273063, term273063.getClass(), "firstRomVersion", "ohwhPbAzfO");
        setField(term273063, term273063.getClass(), "firstDataVersion", "oaMSqXLhMk");
        setField(term273063, term273063.getClass(), "firstPlayDate", "JOvcnvkLRz");
        setField(term273063, term273063.getClass(), "lastGameId", "pxPcAihzBr");
        setField(term273063, term273063.getClass(), "lastRomVersion", "GzKodkVNkA");
        setField(term273063, term273063.getClass(), "lastDataVersion", "mEXwOlYBEo");
        setField(term273063, term273063.getClass(), "compatibleCmVersion", "MHYIXqSlwf");
        setField(term273063, term273063.getClass(), "lastPlayDate", "sJpbENqPxH");
        setIntField(term273063, term273063.getClass(), "lastPlaceId", 871996273);
        setField(term273063, term273063.getClass(), "lastPlaceName", "ldhzrfViik");
        setIntField(term273063, term273063.getClass(), "lastRegionId", -1602801244);
        setField(term273063, term273063.getClass(), "lastRegionName", "lvGRyBZXCP");
        setIntField(term273063, term273063.getClass(), "lastAllNetId", 1845202050);
        setField(term273063, term273063.getClass(), "lastClientId", "bnLazzhSKG");
        setIntField(term273063, term273063.getClass(), "lastUsedDeckId", -259872076);
        setIntField(term273063, term273063.getClass(), "lastPlayMusicLevel", 198838341);
        setIntField(term273063, term273063.getClass(), "lastEmoneyBrand", -327992686);
        setField(term273061, term273061.getClass(), "user", term273063);
        setField(term273061, term273061.getClass(), "authKey", "iQmPksKQuQ");
        setIntField(term273061, term273061.getClass(), "kopId", 274261047);
        setIntField(term273061, term273061.getClass(), "areaId", 94059237);
        setIntField(term273061, term273061.getClass(), "totalTechScore", 261356472);
        setIntField(term273061, term273061.getClass(), "totalPlatinumScore", -1633964080);
        setField(term273061, term273061.getClass(), "techRecordDate", "paffgSIgia");
        setBooleanField(term273061, term273061.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAreaId", argTypes, term273061, args);
    }

};


