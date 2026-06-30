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

public class UserOption_setVolSkill_127093052159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term336168;
     Object term336470;

    public UserOption_setVolSkill_127093052159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term336174 = new Long(-1283936527800858962L);
        term336168 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term336170 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term336172 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term336188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term336189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term336198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term336199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336203 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term336168, term336168.getClass(), "id", -5277154069180097382L);
        setLongField(term336170, term336170.getClass(), "id", -2802050906121131426L);
        setLongField(term336172, term336172.getClass(), "id", 5933843078625325857L);
        setField(term336172, term336172.getClass(), "extId", term336174);
        setField(term336172, term336172.getClass(), "luid", "HdpeKuZuqv");
        setIntField(term336189, term336189.getClass(), "year", 2023);
        setShortField(term336189, term336189.getClass(), "month", (short) 8);
        setShortField(term336189, term336189.getClass(), "day", (short) 12);
        setField(term336188, term336188.getClass(), "date", term336189);
        setByteField(term336193, term336193.getClass(), "hour", (byte) 2);
        setByteField(term336193, term336193.getClass(), "minute", (byte) 35);
        setByteField(term336193, term336193.getClass(), "second", (byte) 42);
        setIntField(term336193, term336193.getClass(), "nano", 500080806);
        setField(term336188, term336188.getClass(), "time", term336193);
        setField(term336172, term336172.getClass(), "registerTime", term336188);
        setIntField(term336199, term336199.getClass(), "year", 2029);
        setShortField(term336199, term336199.getClass(), "month", (short) 6);
        setShortField(term336199, term336199.getClass(), "day", (short) 26);
        setField(term336198, term336198.getClass(), "date", term336199);
        setByteField(term336203, term336203.getClass(), "hour", (byte) 11);
        setByteField(term336203, term336203.getClass(), "minute", (byte) 25);
        setByteField(term336203, term336203.getClass(), "second", (byte) 43);
        setIntField(term336203, term336203.getClass(), "nano", 933618016);
        setField(term336198, term336198.getClass(), "time", term336203);
        setField(term336172, term336172.getClass(), "accessTime", term336198);
        setField(term336170, term336170.getClass(), "card", term336172);
        setField(term336170, term336170.getClass(), "userName", "MaEHZcmHmh");
        setIntField(term336170, term336170.getClass(), "level", 981607290);
        setIntField(term336170, term336170.getClass(), "reincarnationNum", 1191607691);
        setLongField(term336170, term336170.getClass(), "exp", 6813640083684366185L);
        setLongField(term336170, term336170.getClass(), "point", -5548177212232604579L);
        setLongField(term336170, term336170.getClass(), "totalPoint", -1627029747661182999L);
        setIntField(term336170, term336170.getClass(), "playCount", -633453605);
        setIntField(term336170, term336170.getClass(), "jewelCount", 985076572);
        setIntField(term336170, term336170.getClass(), "totalJewelCount", 1600799427);
        setIntField(term336170, term336170.getClass(), "medalCount", 2107094258);
        setIntField(term336170, term336170.getClass(), "playerRating", 1092820584);
        setIntField(term336170, term336170.getClass(), "highestRating", -1545792578);
        setIntField(term336170, term336170.getClass(), "battlePoint", -1366367099);
        setIntField(term336170, term336170.getClass(), "bestBattlePoint", 1674855220);
        setIntField(term336170, term336170.getClass(), "overDamageBattlePoint", 1678094487);
        setBooleanField(term336170, term336170.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term336170, term336170.getClass(), "nameplateId", 231229956);
        setIntField(term336170, term336170.getClass(), "trophyId", -1197711206);
        setIntField(term336170, term336170.getClass(), "cardId", 1890759814);
        setIntField(term336170, term336170.getClass(), "characterId", -272366329);
        setIntField(term336170, term336170.getClass(), "characterVoiceNo", -711204478);
        setIntField(term336170, term336170.getClass(), "tabSetting", 77255205);
        setIntField(term336170, term336170.getClass(), "tabSortSetting", 1052150480);
        setIntField(term336170, term336170.getClass(), "cardCategorySetting", -285729820);
        setIntField(term336170, term336170.getClass(), "cardSortSetting", 2113711445);
        setIntField(term336170, term336170.getClass(), "rivalScoreCategorySetting", -528909594);
        setIntField(term336170, term336170.getClass(), "playedTutorialBit", -67698578);
        setIntField(term336170, term336170.getClass(), "firstTutorialCancelNum", 344256601);
        setLongField(term336170, term336170.getClass(), "sumTechHighScore", -5095417670080396993L);
        setLongField(term336170, term336170.getClass(), "sumTechBasicHighScore", 9178991641744485340L);
        setLongField(term336170, term336170.getClass(), "sumTechAdvancedHighScore", -3774643617169026194L);
        setLongField(term336170, term336170.getClass(), "sumTechExpertHighScore", 6051785970326169940L);
        setLongField(term336170, term336170.getClass(), "sumTechMasterHighScore", -6269564736655849329L);
        setLongField(term336170, term336170.getClass(), "sumTechLunaticHighScore", -5865338016213384359L);
        setLongField(term336170, term336170.getClass(), "sumBattleHighScore", -5906495968715846202L);
        setLongField(term336170, term336170.getClass(), "sumBattleBasicHighScore", 5074756342602672910L);
        setLongField(term336170, term336170.getClass(), "sumBattleAdvancedHighScore", -8343497890625069189L);
        setLongField(term336170, term336170.getClass(), "sumBattleExpertHighScore", -7812235104894517487L);
        setLongField(term336170, term336170.getClass(), "sumBattleMasterHighScore", -5053545420962246304L);
        setLongField(term336170, term336170.getClass(), "sumBattleLunaticHighScore", -2796208948410925785L);
        setField(term336170, term336170.getClass(), "eventWatchedDate", "MWNVBqtjon");
        setField(term336170, term336170.getClass(), "cmEventWatchedDate", "LnwUhmCKuI");
        setField(term336170, term336170.getClass(), "firstGameId", "GFNNgiUeWv");
        setField(term336170, term336170.getClass(), "firstRomVersion", "pxEnYoLJKa");
        setField(term336170, term336170.getClass(), "firstDataVersion", "WwzPjOodXl");
        setField(term336170, term336170.getClass(), "firstPlayDate", "kBKXxcqWKV");
        setField(term336170, term336170.getClass(), "lastGameId", "SsEwCpGPWL");
        setField(term336170, term336170.getClass(), "lastRomVersion", "WqhgPgtzsO");
        setField(term336170, term336170.getClass(), "lastDataVersion", "wkPwZCIzFG");
        setField(term336170, term336170.getClass(), "compatibleCmVersion", "dLSiXEXlbo");
        setField(term336170, term336170.getClass(), "lastPlayDate", "ibzrXCjwwz");
        setIntField(term336170, term336170.getClass(), "lastPlaceId", -1091390775);
        setField(term336170, term336170.getClass(), "lastPlaceName", "kuWyPPnwDE");
        setIntField(term336170, term336170.getClass(), "lastRegionId", 312248271);
        setField(term336170, term336170.getClass(), "lastRegionName", "PfyIGJfoHj");
        setIntField(term336170, term336170.getClass(), "lastAllNetId", -225922252);
        setField(term336170, term336170.getClass(), "lastClientId", "jdLJhGkLSN");
        setIntField(term336170, term336170.getClass(), "lastUsedDeckId", -538320573);
        setIntField(term336170, term336170.getClass(), "lastPlayMusicLevel", -1955695110);
        setIntField(term336170, term336170.getClass(), "lastEmoneyBrand", -710276392);
        setField(term336168, term336168.getClass(), "user", term336170);
        setIntField(term336168, term336168.getClass(), "optionSet", 245922739);
        setIntField(term336168, term336168.getClass(), "speed", -1516801754);
        setIntField(term336168, term336168.getClass(), "mirror", 1321462973);
        setIntField(term336168, term336168.getClass(), "judgeTiming", 508313103);
        setIntField(term336168, term336168.getClass(), "judgeAdjustment", 1227224250);
        setIntField(term336168, term336168.getClass(), "abort", -105148060);
        setIntField(term336168, term336168.getClass(), "stealthField", 1562852288);
        setIntField(term336168, term336168.getClass(), "tapSound", 661414898);
        setIntField(term336168, term336168.getClass(), "volGuide", -412059873);
        setIntField(term336168, term336168.getClass(), "volAll", -1330975573);
        setIntField(term336168, term336168.getClass(), "volTap", -195714577);
        setIntField(term336168, term336168.getClass(), "volCrTap", 902486272);
        setIntField(term336168, term336168.getClass(), "volHold", -275673665);
        setIntField(term336168, term336168.getClass(), "volSide", -1334844241);
        setIntField(term336168, term336168.getClass(), "volFlick", -413714919);
        setIntField(term336168, term336168.getClass(), "volBell", -720491891);
        setIntField(term336168, term336168.getClass(), "volEnemy", -1718868542);
        setIntField(term336168, term336168.getClass(), "volSkill", 845100825);
        setIntField(term336168, term336168.getClass(), "volDamage", -1075029293);
        setIntField(term336168, term336168.getClass(), "colorField", -139704619);
        setIntField(term336168, term336168.getClass(), "colorLaneBright", 289931043);
        setIntField(term336168, term336168.getClass(), "colorWallBright", 220036542);
        setIntField(term336168, term336168.getClass(), "colorLane", 2080640156);
        setIntField(term336168, term336168.getClass(), "colorSide", 766384724);
        setIntField(term336168, term336168.getClass(), "effectDamage", 1755652463);
        setIntField(term336168, term336168.getClass(), "effectPos", -562037229);
        setIntField(term336168, term336168.getClass(), "judgeDisp", 868642369);
        setIntField(term336168, term336168.getClass(), "judgePos", -176214444);
        setIntField(term336168, term336168.getClass(), "judgeBreak", 281761996);
        setIntField(term336168, term336168.getClass(), "judgeHit", -731481120);
        setIntField(term336168, term336168.getClass(), "platinumBreakDisp", -1483655293);
        setIntField(term336168, term336168.getClass(), "judgeCriticalBreak", 855645383);
        setIntField(term336168, term336168.getClass(), "matching", -1064960196);
        setIntField(term336168, term336168.getClass(), "dispPlayerLv", -1152187596);
        setIntField(term336168, term336168.getClass(), "dispRating", -1694897674);
        setIntField(term336168, term336168.getClass(), "dispBP", 1697377622);
        setIntField(term336168, term336168.getClass(), "headphone", 62690851);
        term336470 = new Integer(1818221976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term336470;
        callMethod(klass, "setVolSkill", argTypes, term336168, args);
    }

};


