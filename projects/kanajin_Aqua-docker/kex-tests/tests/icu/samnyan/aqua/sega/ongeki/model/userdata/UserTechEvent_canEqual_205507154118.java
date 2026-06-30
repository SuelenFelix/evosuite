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

public class UserTechEvent_canEqual_205507154118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359712;
     Object term359994;

    public UserTechEvent_canEqual_205507154118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term359718 = new Long(-5414076154478910734L);
        term359712 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term359714 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term359716 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term359732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term359733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term359737 = newInstance(Class.forName("java.time.LocalTime"));
        Object term359742 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term359743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term359747 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term359712, term359712.getClass(), "id", 1603982410416438451L);
        setLongField(term359714, term359714.getClass(), "id", -6184831856938946066L);
        setLongField(term359716, term359716.getClass(), "id", -3193089424937511548L);
        setField(term359716, term359716.getClass(), "extId", term359718);
        setField(term359716, term359716.getClass(), "luid", "YkPYtluLoD");
        setIntField(term359733, term359733.getClass(), "year", 2012);
        setShortField(term359733, term359733.getClass(), "month", (short) 11);
        setShortField(term359733, term359733.getClass(), "day", (short) 3);
        setField(term359732, term359732.getClass(), "date", term359733);
        setByteField(term359737, term359737.getClass(), "hour", (byte) 5);
        setByteField(term359737, term359737.getClass(), "minute", (byte) 57);
        setByteField(term359737, term359737.getClass(), "second", (byte) 38);
        setIntField(term359737, term359737.getClass(), "nano", 147251565);
        setField(term359732, term359732.getClass(), "time", term359737);
        setField(term359716, term359716.getClass(), "registerTime", term359732);
        setIntField(term359743, term359743.getClass(), "year", 2021);
        setShortField(term359743, term359743.getClass(), "month", (short) 11);
        setShortField(term359743, term359743.getClass(), "day", (short) 27);
        setField(term359742, term359742.getClass(), "date", term359743);
        setByteField(term359747, term359747.getClass(), "hour", (byte) 17);
        setByteField(term359747, term359747.getClass(), "minute", (byte) 43);
        setByteField(term359747, term359747.getClass(), "second", (byte) 51);
        setIntField(term359747, term359747.getClass(), "nano", 787947149);
        setField(term359742, term359742.getClass(), "time", term359747);
        setField(term359716, term359716.getClass(), "accessTime", term359742);
        setField(term359714, term359714.getClass(), "card", term359716);
        setField(term359714, term359714.getClass(), "userName", "EHSvFqFadd");
        setIntField(term359714, term359714.getClass(), "level", -479382651);
        setIntField(term359714, term359714.getClass(), "reincarnationNum", -1802263420);
        setLongField(term359714, term359714.getClass(), "exp", 5131944284181894000L);
        setLongField(term359714, term359714.getClass(), "point", 1719225038072770728L);
        setLongField(term359714, term359714.getClass(), "totalPoint", 8094530769353228427L);
        setIntField(term359714, term359714.getClass(), "playCount", 2064357446);
        setIntField(term359714, term359714.getClass(), "jewelCount", 671172951);
        setIntField(term359714, term359714.getClass(), "totalJewelCount", -1087519453);
        setIntField(term359714, term359714.getClass(), "medalCount", -880477844);
        setIntField(term359714, term359714.getClass(), "playerRating", -591966027);
        setIntField(term359714, term359714.getClass(), "highestRating", -66252364);
        setIntField(term359714, term359714.getClass(), "battlePoint", -602517095);
        setIntField(term359714, term359714.getClass(), "bestBattlePoint", 1921366352);
        setIntField(term359714, term359714.getClass(), "overDamageBattlePoint", 1238184082);
        setBooleanField(term359714, term359714.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term359714, term359714.getClass(), "nameplateId", 1584435082);
        setIntField(term359714, term359714.getClass(), "trophyId", -1536494457);
        setIntField(term359714, term359714.getClass(), "cardId", 1802658954);
        setIntField(term359714, term359714.getClass(), "characterId", -34187836);
        setIntField(term359714, term359714.getClass(), "characterVoiceNo", -753442260);
        setIntField(term359714, term359714.getClass(), "tabSetting", 1117087800);
        setIntField(term359714, term359714.getClass(), "tabSortSetting", 1563164527);
        setIntField(term359714, term359714.getClass(), "cardCategorySetting", -1319855997);
        setIntField(term359714, term359714.getClass(), "cardSortSetting", 1776758858);
        setIntField(term359714, term359714.getClass(), "rivalScoreCategorySetting", -1033691641);
        setIntField(term359714, term359714.getClass(), "playedTutorialBit", -652063512);
        setIntField(term359714, term359714.getClass(), "firstTutorialCancelNum", 493778019);
        setLongField(term359714, term359714.getClass(), "sumTechHighScore", 9038586588127928707L);
        setLongField(term359714, term359714.getClass(), "sumTechBasicHighScore", -7244492656008816966L);
        setLongField(term359714, term359714.getClass(), "sumTechAdvancedHighScore", -2355750823534916840L);
        setLongField(term359714, term359714.getClass(), "sumTechExpertHighScore", 3538659852046158304L);
        setLongField(term359714, term359714.getClass(), "sumTechMasterHighScore", -1219434498645011541L);
        setLongField(term359714, term359714.getClass(), "sumTechLunaticHighScore", 486687431808170636L);
        setLongField(term359714, term359714.getClass(), "sumBattleHighScore", -8393993093306077529L);
        setLongField(term359714, term359714.getClass(), "sumBattleBasicHighScore", 252244941973924990L);
        setLongField(term359714, term359714.getClass(), "sumBattleAdvancedHighScore", 1129934171941265602L);
        setLongField(term359714, term359714.getClass(), "sumBattleExpertHighScore", -1230239997807992470L);
        setLongField(term359714, term359714.getClass(), "sumBattleMasterHighScore", 677996904867062366L);
        setLongField(term359714, term359714.getClass(), "sumBattleLunaticHighScore", 4267096003859061755L);
        setField(term359714, term359714.getClass(), "eventWatchedDate", "uatyJVVkuh");
        setField(term359714, term359714.getClass(), "cmEventWatchedDate", "TJamUXzKwL");
        setField(term359714, term359714.getClass(), "firstGameId", "NefUeTpLNQ");
        setField(term359714, term359714.getClass(), "firstRomVersion", "fkoYwHvULG");
        setField(term359714, term359714.getClass(), "firstDataVersion", "hCGkeVUnyl");
        setField(term359714, term359714.getClass(), "firstPlayDate", "cXGPSCFmzx");
        setField(term359714, term359714.getClass(), "lastGameId", "StllJtCsUw");
        setField(term359714, term359714.getClass(), "lastRomVersion", "vWQQZntGOv");
        setField(term359714, term359714.getClass(), "lastDataVersion", "yxlVzXBuqU");
        setField(term359714, term359714.getClass(), "compatibleCmVersion", "QmESxVdSXD");
        setField(term359714, term359714.getClass(), "lastPlayDate", "mwdzLXoSCo");
        setIntField(term359714, term359714.getClass(), "lastPlaceId", -1841596761);
        setField(term359714, term359714.getClass(), "lastPlaceName", "oYAsfIzlrY");
        setIntField(term359714, term359714.getClass(), "lastRegionId", -27133697);
        setField(term359714, term359714.getClass(), "lastRegionName", "clTVGzuIFk");
        setIntField(term359714, term359714.getClass(), "lastAllNetId", 44998209);
        setField(term359714, term359714.getClass(), "lastClientId", "UrpxRrzfoq");
        setIntField(term359714, term359714.getClass(), "lastUsedDeckId", 1157758353);
        setIntField(term359714, term359714.getClass(), "lastPlayMusicLevel", 1254297102);
        setIntField(term359714, term359714.getClass(), "lastEmoneyBrand", 477859521);
        setField(term359712, term359712.getClass(), "user", term359714);
        setIntField(term359712, term359712.getClass(), "eventId", -1549054911);
        setIntField(term359712, term359712.getClass(), "totalTechScore", 1169909339);
        setIntField(term359712, term359712.getClass(), "totalPlatinumScore", -170156922);
        setField(term359712, term359712.getClass(), "techRecordDate", "qcRWuBzMrq");
        setBooleanField(term359712, term359712.getClass(), "isRankingRewarded", false);
        setBooleanField(term359712, term359712.getClass(), "isTotalTechNewRecord", true);
        term359994 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term359994;
        callMethod(klass, "canEqual", argTypes, term359712, args);
    }

};


