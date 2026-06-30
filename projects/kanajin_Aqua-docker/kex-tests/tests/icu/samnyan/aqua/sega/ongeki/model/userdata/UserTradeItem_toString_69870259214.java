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

public class UserTradeItem_toString_69870259214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156689;

    public UserTradeItem_toString_69870259214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term156695 = new Long(6636235983121346803L);
        term156689 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term156691 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term156693 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term156709 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156710 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156714 = newInstance(Class.forName("java.time.LocalTime"));
        Object term156719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term156720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term156724 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term156689, term156689.getClass(), "id", -405219218622827050L);
        setLongField(term156691, term156691.getClass(), "id", -7747257192309626292L);
        setLongField(term156693, term156693.getClass(), "id", -8822705404052551615L);
        setField(term156693, term156693.getClass(), "extId", term156695);
        setField(term156693, term156693.getClass(), "luid", "BaRcksFiYp");
        setIntField(term156710, term156710.getClass(), "year", 2024);
        setShortField(term156710, term156710.getClass(), "month", (short) 10);
        setShortField(term156710, term156710.getClass(), "day", (short) 29);
        setField(term156709, term156709.getClass(), "date", term156710);
        setByteField(term156714, term156714.getClass(), "hour", (byte) 8);
        setByteField(term156714, term156714.getClass(), "minute", (byte) 39);
        setByteField(term156714, term156714.getClass(), "second", (byte) 36);
        setIntField(term156714, term156714.getClass(), "nano", 718768967);
        setField(term156709, term156709.getClass(), "time", term156714);
        setField(term156693, term156693.getClass(), "registerTime", term156709);
        setIntField(term156720, term156720.getClass(), "year", 2010);
        setShortField(term156720, term156720.getClass(), "month", (short) 4);
        setShortField(term156720, term156720.getClass(), "day", (short) 5);
        setField(term156719, term156719.getClass(), "date", term156720);
        setByteField(term156724, term156724.getClass(), "hour", (byte) 6);
        setByteField(term156724, term156724.getClass(), "minute", (byte) 31);
        setByteField(term156724, term156724.getClass(), "second", (byte) 49);
        setIntField(term156724, term156724.getClass(), "nano", 665880484);
        setField(term156719, term156719.getClass(), "time", term156724);
        setField(term156693, term156693.getClass(), "accessTime", term156719);
        setField(term156691, term156691.getClass(), "card", term156693);
        setField(term156691, term156691.getClass(), "userName", "qCsUoglQjM");
        setIntField(term156691, term156691.getClass(), "level", -379015970);
        setIntField(term156691, term156691.getClass(), "reincarnationNum", -1423225080);
        setLongField(term156691, term156691.getClass(), "exp", 7252665916057218138L);
        setLongField(term156691, term156691.getClass(), "point", 6912164524535243699L);
        setLongField(term156691, term156691.getClass(), "totalPoint", 7571018035199029898L);
        setIntField(term156691, term156691.getClass(), "playCount", 333862631);
        setIntField(term156691, term156691.getClass(), "jewelCount", -50668397);
        setIntField(term156691, term156691.getClass(), "totalJewelCount", -259152632);
        setIntField(term156691, term156691.getClass(), "medalCount", 1739990377);
        setIntField(term156691, term156691.getClass(), "playerRating", -1151136793);
        setIntField(term156691, term156691.getClass(), "highestRating", 879241247);
        setIntField(term156691, term156691.getClass(), "battlePoint", 1067606467);
        setIntField(term156691, term156691.getClass(), "bestBattlePoint", -1111900633);
        setIntField(term156691, term156691.getClass(), "overDamageBattlePoint", 113501041);
        setBooleanField(term156691, term156691.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term156691, term156691.getClass(), "nameplateId", 1055313115);
        setIntField(term156691, term156691.getClass(), "trophyId", 611928031);
        setIntField(term156691, term156691.getClass(), "cardId", -1840936599);
        setIntField(term156691, term156691.getClass(), "characterId", 962187390);
        setIntField(term156691, term156691.getClass(), "characterVoiceNo", -1537949190);
        setIntField(term156691, term156691.getClass(), "tabSetting", 1687498557);
        setIntField(term156691, term156691.getClass(), "tabSortSetting", 1883200409);
        setIntField(term156691, term156691.getClass(), "cardCategorySetting", -1909739775);
        setIntField(term156691, term156691.getClass(), "cardSortSetting", -1671310444);
        setIntField(term156691, term156691.getClass(), "rivalScoreCategorySetting", 902257077);
        setIntField(term156691, term156691.getClass(), "playedTutorialBit", -1582930822);
        setIntField(term156691, term156691.getClass(), "firstTutorialCancelNum", 1105555311);
        setLongField(term156691, term156691.getClass(), "sumTechHighScore", -3423660656787101905L);
        setLongField(term156691, term156691.getClass(), "sumTechBasicHighScore", 5184225522070807597L);
        setLongField(term156691, term156691.getClass(), "sumTechAdvancedHighScore", 4236454922411772640L);
        setLongField(term156691, term156691.getClass(), "sumTechExpertHighScore", 1708134081013823426L);
        setLongField(term156691, term156691.getClass(), "sumTechMasterHighScore", -4324302825174686661L);
        setLongField(term156691, term156691.getClass(), "sumTechLunaticHighScore", -6842571177438982724L);
        setLongField(term156691, term156691.getClass(), "sumBattleHighScore", 4190870724733110372L);
        setLongField(term156691, term156691.getClass(), "sumBattleBasicHighScore", 5014808953079526280L);
        setLongField(term156691, term156691.getClass(), "sumBattleAdvancedHighScore", 5539013659578446033L);
        setLongField(term156691, term156691.getClass(), "sumBattleExpertHighScore", 6844271349135839950L);
        setLongField(term156691, term156691.getClass(), "sumBattleMasterHighScore", 8959077806809187885L);
        setLongField(term156691, term156691.getClass(), "sumBattleLunaticHighScore", -5776525253846609674L);
        setField(term156691, term156691.getClass(), "eventWatchedDate", "BVcWJbDXrQ");
        setField(term156691, term156691.getClass(), "cmEventWatchedDate", "PNxbmyThZc");
        setField(term156691, term156691.getClass(), "firstGameId", "fdRVcZbqUf");
        setField(term156691, term156691.getClass(), "firstRomVersion", "aSUSvETRSv");
        setField(term156691, term156691.getClass(), "firstDataVersion", "daQciREiuI");
        setField(term156691, term156691.getClass(), "firstPlayDate", "AFRfAPZdqf");
        setField(term156691, term156691.getClass(), "lastGameId", "cZrxYHSQhL");
        setField(term156691, term156691.getClass(), "lastRomVersion", "fhPRWcwAlA");
        setField(term156691, term156691.getClass(), "lastDataVersion", "hNoRxfoxPM");
        setField(term156691, term156691.getClass(), "compatibleCmVersion", "AkemusjkVp");
        setField(term156691, term156691.getClass(), "lastPlayDate", "rqjMeNBTEM");
        setIntField(term156691, term156691.getClass(), "lastPlaceId", -1070743074);
        setField(term156691, term156691.getClass(), "lastPlaceName", "WNUzKkDpZX");
        setIntField(term156691, term156691.getClass(), "lastRegionId", -897878983);
        setField(term156691, term156691.getClass(), "lastRegionName", "aduqofSIXN");
        setIntField(term156691, term156691.getClass(), "lastAllNetId", 2049311616);
        setField(term156691, term156691.getClass(), "lastClientId", "oDCJeRRdBM");
        setIntField(term156691, term156691.getClass(), "lastUsedDeckId", -745539968);
        setIntField(term156691, term156691.getClass(), "lastPlayMusicLevel", 206348186);
        setIntField(term156691, term156691.getClass(), "lastEmoneyBrand", -983562694);
        setField(term156689, term156689.getClass(), "user", term156691);
        setIntField(term156689, term156689.getClass(), "chapterId", 1376849243);
        setIntField(term156689, term156689.getClass(), "tradeItemId", 511751479);
        setIntField(term156689, term156689.getClass(), "tradeCount", -905042992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term156689, args);
    }

};


