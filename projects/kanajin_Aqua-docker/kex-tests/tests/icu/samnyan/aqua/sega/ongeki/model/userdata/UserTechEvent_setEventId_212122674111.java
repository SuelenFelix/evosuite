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

public class UserTechEvent_setEventId_212122674111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356515;
     Object term356797;

    public UserTechEvent_setEventId_212122674111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term356521 = new Long(-1865007698397606253L);
        term356515 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term356517 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term356519 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term356535 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term356536 = newInstance(Class.forName("java.time.LocalDate"));
        Object term356540 = newInstance(Class.forName("java.time.LocalTime"));
        Object term356545 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term356546 = newInstance(Class.forName("java.time.LocalDate"));
        Object term356550 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term356515, term356515.getClass(), "id", -3855933092488046050L);
        setLongField(term356517, term356517.getClass(), "id", -8463226875327539710L);
        setLongField(term356519, term356519.getClass(), "id", -1298775991565660437L);
        setField(term356519, term356519.getClass(), "extId", term356521);
        setField(term356519, term356519.getClass(), "luid", "hrsKgCGBqS");
        setIntField(term356536, term356536.getClass(), "year", 2023);
        setShortField(term356536, term356536.getClass(), "month", (short) 10);
        setShortField(term356536, term356536.getClass(), "day", (short) 3);
        setField(term356535, term356535.getClass(), "date", term356536);
        setByteField(term356540, term356540.getClass(), "hour", (byte) 12);
        setByteField(term356540, term356540.getClass(), "minute", (byte) 9);
        setByteField(term356540, term356540.getClass(), "second", (byte) 7);
        setIntField(term356540, term356540.getClass(), "nano", 486463028);
        setField(term356535, term356535.getClass(), "time", term356540);
        setField(term356519, term356519.getClass(), "registerTime", term356535);
        setIntField(term356546, term356546.getClass(), "year", 2026);
        setShortField(term356546, term356546.getClass(), "month", (short) 3);
        setShortField(term356546, term356546.getClass(), "day", (short) 23);
        setField(term356545, term356545.getClass(), "date", term356546);
        setByteField(term356550, term356550.getClass(), "hour", (byte) 15);
        setByteField(term356550, term356550.getClass(), "minute", (byte) 45);
        setByteField(term356550, term356550.getClass(), "second", (byte) 3);
        setIntField(term356550, term356550.getClass(), "nano", 712034652);
        setField(term356545, term356545.getClass(), "time", term356550);
        setField(term356519, term356519.getClass(), "accessTime", term356545);
        setField(term356517, term356517.getClass(), "card", term356519);
        setField(term356517, term356517.getClass(), "userName", "oCeHCTSNPQ");
        setIntField(term356517, term356517.getClass(), "level", 1543260834);
        setIntField(term356517, term356517.getClass(), "reincarnationNum", -1816497982);
        setLongField(term356517, term356517.getClass(), "exp", -4760190800953823952L);
        setLongField(term356517, term356517.getClass(), "point", 613276327544407071L);
        setLongField(term356517, term356517.getClass(), "totalPoint", 4738068992321127738L);
        setIntField(term356517, term356517.getClass(), "playCount", -1094263531);
        setIntField(term356517, term356517.getClass(), "jewelCount", -882836007);
        setIntField(term356517, term356517.getClass(), "totalJewelCount", 1898732537);
        setIntField(term356517, term356517.getClass(), "medalCount", -188432554);
        setIntField(term356517, term356517.getClass(), "playerRating", 2048037012);
        setIntField(term356517, term356517.getClass(), "highestRating", 1439251579);
        setIntField(term356517, term356517.getClass(), "battlePoint", 1072263729);
        setIntField(term356517, term356517.getClass(), "bestBattlePoint", -942974196);
        setIntField(term356517, term356517.getClass(), "overDamageBattlePoint", -445020067);
        setBooleanField(term356517, term356517.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term356517, term356517.getClass(), "nameplateId", -1194687350);
        setIntField(term356517, term356517.getClass(), "trophyId", -265509979);
        setIntField(term356517, term356517.getClass(), "cardId", -2137461606);
        setIntField(term356517, term356517.getClass(), "characterId", 734327184);
        setIntField(term356517, term356517.getClass(), "characterVoiceNo", -39538216);
        setIntField(term356517, term356517.getClass(), "tabSetting", -842518026);
        setIntField(term356517, term356517.getClass(), "tabSortSetting", -1604691351);
        setIntField(term356517, term356517.getClass(), "cardCategorySetting", 1677301464);
        setIntField(term356517, term356517.getClass(), "cardSortSetting", -1872506876);
        setIntField(term356517, term356517.getClass(), "rivalScoreCategorySetting", 1516334438);
        setIntField(term356517, term356517.getClass(), "playedTutorialBit", 1219627860);
        setIntField(term356517, term356517.getClass(), "firstTutorialCancelNum", 53962207);
        setLongField(term356517, term356517.getClass(), "sumTechHighScore", -1073751509149452116L);
        setLongField(term356517, term356517.getClass(), "sumTechBasicHighScore", -1305936240326006927L);
        setLongField(term356517, term356517.getClass(), "sumTechAdvancedHighScore", -8910799110465913402L);
        setLongField(term356517, term356517.getClass(), "sumTechExpertHighScore", 3632111586476699862L);
        setLongField(term356517, term356517.getClass(), "sumTechMasterHighScore", 823823980696023240L);
        setLongField(term356517, term356517.getClass(), "sumTechLunaticHighScore", 2601957094094370967L);
        setLongField(term356517, term356517.getClass(), "sumBattleHighScore", 3977172026466611032L);
        setLongField(term356517, term356517.getClass(), "sumBattleBasicHighScore", 5970092402270804697L);
        setLongField(term356517, term356517.getClass(), "sumBattleAdvancedHighScore", -6390857717594363448L);
        setLongField(term356517, term356517.getClass(), "sumBattleExpertHighScore", -7764811322544493640L);
        setLongField(term356517, term356517.getClass(), "sumBattleMasterHighScore", 5601649678896166847L);
        setLongField(term356517, term356517.getClass(), "sumBattleLunaticHighScore", -7447253313803839861L);
        setField(term356517, term356517.getClass(), "eventWatchedDate", "SOBVESgXhD");
        setField(term356517, term356517.getClass(), "cmEventWatchedDate", "FUUrETeqTW");
        setField(term356517, term356517.getClass(), "firstGameId", "KlOojNxfBG");
        setField(term356517, term356517.getClass(), "firstRomVersion", "hCFIfxqHii");
        setField(term356517, term356517.getClass(), "firstDataVersion", "FLUMgaQzXi");
        setField(term356517, term356517.getClass(), "firstPlayDate", "firRatwwsv");
        setField(term356517, term356517.getClass(), "lastGameId", "jklReDfGwK");
        setField(term356517, term356517.getClass(), "lastRomVersion", "kesqxSdRSJ");
        setField(term356517, term356517.getClass(), "lastDataVersion", "nTrxmBQSmQ");
        setField(term356517, term356517.getClass(), "compatibleCmVersion", "YMTMppTRcY");
        setField(term356517, term356517.getClass(), "lastPlayDate", "RASgFwVGWH");
        setIntField(term356517, term356517.getClass(), "lastPlaceId", 753018072);
        setField(term356517, term356517.getClass(), "lastPlaceName", "kPPTLgPOHr");
        setIntField(term356517, term356517.getClass(), "lastRegionId", 1490352486);
        setField(term356517, term356517.getClass(), "lastRegionName", "zxcdzyDZux");
        setIntField(term356517, term356517.getClass(), "lastAllNetId", -1149890129);
        setField(term356517, term356517.getClass(), "lastClientId", "aMGJklsoLZ");
        setIntField(term356517, term356517.getClass(), "lastUsedDeckId", 990337027);
        setIntField(term356517, term356517.getClass(), "lastPlayMusicLevel", -1560937231);
        setIntField(term356517, term356517.getClass(), "lastEmoneyBrand", 1505904236);
        setField(term356515, term356515.getClass(), "user", term356517);
        setIntField(term356515, term356515.getClass(), "eventId", -1460174198);
        setIntField(term356515, term356515.getClass(), "totalTechScore", -791498167);
        setIntField(term356515, term356515.getClass(), "totalPlatinumScore", 1151147685);
        setField(term356515, term356515.getClass(), "techRecordDate", "MxjPynRJZL");
        setBooleanField(term356515, term356515.getClass(), "isRankingRewarded", false);
        setBooleanField(term356515, term356515.getClass(), "isTotalTechNewRecord", false);
        term356797 = new Integer(1333024010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356797;
        callMethod(klass, "setEventId", argTypes, term356515, args);
    }

};


