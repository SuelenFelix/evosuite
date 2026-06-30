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

public class UserKop_setKopId_203775441113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277300;
     Object term277594;

    public UserKop_setKopId_203775441113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277306 = new Long(2551047634163864862L);
        term277300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term277302 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term277304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term277320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term277330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term277331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term277300, term277300.getClass(), "id", -6701464857654733022L);
        setLongField(term277302, term277302.getClass(), "id", 6478779853968207342L);
        setLongField(term277304, term277304.getClass(), "id", -2817374342783832456L);
        setField(term277304, term277304.getClass(), "extId", term277306);
        setField(term277304, term277304.getClass(), "luid", "kcBYZtVjEn");
        setIntField(term277321, term277321.getClass(), "year", 2015);
        setShortField(term277321, term277321.getClass(), "month", (short) 1);
        setShortField(term277321, term277321.getClass(), "day", (short) 10);
        setField(term277320, term277320.getClass(), "date", term277321);
        setByteField(term277325, term277325.getClass(), "hour", (byte) 5);
        setByteField(term277325, term277325.getClass(), "minute", (byte) 5);
        setByteField(term277325, term277325.getClass(), "second", (byte) 35);
        setIntField(term277325, term277325.getClass(), "nano", 682478512);
        setField(term277320, term277320.getClass(), "time", term277325);
        setField(term277304, term277304.getClass(), "registerTime", term277320);
        setIntField(term277331, term277331.getClass(), "year", 2017);
        setShortField(term277331, term277331.getClass(), "month", (short) 7);
        setShortField(term277331, term277331.getClass(), "day", (short) 4);
        setField(term277330, term277330.getClass(), "date", term277331);
        setByteField(term277335, term277335.getClass(), "hour", (byte) 11);
        setByteField(term277335, term277335.getClass(), "minute", (byte) 29);
        setByteField(term277335, term277335.getClass(), "second", (byte) 31);
        setIntField(term277335, term277335.getClass(), "nano", 651239663);
        setField(term277330, term277330.getClass(), "time", term277335);
        setField(term277304, term277304.getClass(), "accessTime", term277330);
        setField(term277302, term277302.getClass(), "card", term277304);
        setField(term277302, term277302.getClass(), "userName", "zVemyNDAME");
        setIntField(term277302, term277302.getClass(), "level", 1183720893);
        setIntField(term277302, term277302.getClass(), "reincarnationNum", -2070454841);
        setLongField(term277302, term277302.getClass(), "exp", -7383737643708747224L);
        setLongField(term277302, term277302.getClass(), "point", 4782274577724891769L);
        setLongField(term277302, term277302.getClass(), "totalPoint", -5010370737836244619L);
        setIntField(term277302, term277302.getClass(), "playCount", -1979379044);
        setIntField(term277302, term277302.getClass(), "jewelCount", -819678964);
        setIntField(term277302, term277302.getClass(), "totalJewelCount", 789003717);
        setIntField(term277302, term277302.getClass(), "medalCount", -1194710271);
        setIntField(term277302, term277302.getClass(), "playerRating", 1397618451);
        setIntField(term277302, term277302.getClass(), "highestRating", -781404647);
        setIntField(term277302, term277302.getClass(), "battlePoint", 184970542);
        setIntField(term277302, term277302.getClass(), "bestBattlePoint", -1573176387);
        setIntField(term277302, term277302.getClass(), "overDamageBattlePoint", -46543611);
        setBooleanField(term277302, term277302.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term277302, term277302.getClass(), "nameplateId", -210290916);
        setIntField(term277302, term277302.getClass(), "trophyId", 475578696);
        setIntField(term277302, term277302.getClass(), "cardId", 736182747);
        setIntField(term277302, term277302.getClass(), "characterId", -1570132066);
        setIntField(term277302, term277302.getClass(), "characterVoiceNo", 269052692);
        setIntField(term277302, term277302.getClass(), "tabSetting", -1128288920);
        setIntField(term277302, term277302.getClass(), "tabSortSetting", 47526027);
        setIntField(term277302, term277302.getClass(), "cardCategorySetting", -78594996);
        setIntField(term277302, term277302.getClass(), "cardSortSetting", 792357631);
        setIntField(term277302, term277302.getClass(), "rivalScoreCategorySetting", -779223318);
        setIntField(term277302, term277302.getClass(), "playedTutorialBit", 1058126335);
        setIntField(term277302, term277302.getClass(), "firstTutorialCancelNum", 1016877148);
        setLongField(term277302, term277302.getClass(), "sumTechHighScore", -2829341670362269526L);
        setLongField(term277302, term277302.getClass(), "sumTechBasicHighScore", 1472760900284991933L);
        setLongField(term277302, term277302.getClass(), "sumTechAdvancedHighScore", 8273765169897837582L);
        setLongField(term277302, term277302.getClass(), "sumTechExpertHighScore", -8782587854015097598L);
        setLongField(term277302, term277302.getClass(), "sumTechMasterHighScore", 7272019478537381104L);
        setLongField(term277302, term277302.getClass(), "sumTechLunaticHighScore", -5296724240458200891L);
        setLongField(term277302, term277302.getClass(), "sumBattleHighScore", -1576282907014115105L);
        setLongField(term277302, term277302.getClass(), "sumBattleBasicHighScore", -5137243742847518808L);
        setLongField(term277302, term277302.getClass(), "sumBattleAdvancedHighScore", -2856025696037251335L);
        setLongField(term277302, term277302.getClass(), "sumBattleExpertHighScore", 5484286418179975508L);
        setLongField(term277302, term277302.getClass(), "sumBattleMasterHighScore", 8649137888779367532L);
        setLongField(term277302, term277302.getClass(), "sumBattleLunaticHighScore", 3900300410219052188L);
        setField(term277302, term277302.getClass(), "eventWatchedDate", "wTfSVITNMz");
        setField(term277302, term277302.getClass(), "cmEventWatchedDate", "pNYXsbHfzE");
        setField(term277302, term277302.getClass(), "firstGameId", "DWQRVUVtua");
        setField(term277302, term277302.getClass(), "firstRomVersion", "eDVTORBely");
        setField(term277302, term277302.getClass(), "firstDataVersion", "AoncmgwbVO");
        setField(term277302, term277302.getClass(), "firstPlayDate", "RDNNYsIlUn");
        setField(term277302, term277302.getClass(), "lastGameId", "bLadkkAEee");
        setField(term277302, term277302.getClass(), "lastRomVersion", "wYWbALYzmk");
        setField(term277302, term277302.getClass(), "lastDataVersion", "OlbnRaLyPO");
        setField(term277302, term277302.getClass(), "compatibleCmVersion", "goQZKOBhTr");
        setField(term277302, term277302.getClass(), "lastPlayDate", "eaDGkLMDMl");
        setIntField(term277302, term277302.getClass(), "lastPlaceId", -345585488);
        setField(term277302, term277302.getClass(), "lastPlaceName", "dfvKtdkmjZ");
        setIntField(term277302, term277302.getClass(), "lastRegionId", -2075030152);
        setField(term277302, term277302.getClass(), "lastRegionName", "XOFlovlfIj");
        setIntField(term277302, term277302.getClass(), "lastAllNetId", -289377183);
        setField(term277302, term277302.getClass(), "lastClientId", "gdTreEAwDY");
        setIntField(term277302, term277302.getClass(), "lastUsedDeckId", 1596980453);
        setIntField(term277302, term277302.getClass(), "lastPlayMusicLevel", 46546661);
        setIntField(term277302, term277302.getClass(), "lastEmoneyBrand", 1714498443);
        setField(term277300, term277300.getClass(), "user", term277302);
        setField(term277300, term277300.getClass(), "authKey", "JEuvsJnhAW");
        setIntField(term277300, term277300.getClass(), "kopId", -1124083193);
        setIntField(term277300, term277300.getClass(), "areaId", 1318212836);
        setIntField(term277300, term277300.getClass(), "totalTechScore", 505663128);
        setIntField(term277300, term277300.getClass(), "totalPlatinumScore", 1478138673);
        setField(term277300, term277300.getClass(), "techRecordDate", "qrIWqPjdov");
        setBooleanField(term277300, term277300.getClass(), "isTotalTechNewRecord", true);
        term277594 = new Integer(-1274242843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277594;
        callMethod(klass, "setKopId", argTypes, term277300, args);
    }

};


