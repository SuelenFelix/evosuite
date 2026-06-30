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

public class UserOption_setMatching_56604860074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343128;
     Object term343430;

    public UserOption_setMatching_56604860074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term343134 = new Long(5638814204437933939L);
        term343128 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term343130 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term343132 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term343148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term343153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term343158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term343159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term343163 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term343128, term343128.getClass(), "id", -1451063170947923209L);
        setLongField(term343130, term343130.getClass(), "id", -1444902580326243236L);
        setLongField(term343132, term343132.getClass(), "id", -4681664295129316503L);
        setField(term343132, term343132.getClass(), "extId", term343134);
        setField(term343132, term343132.getClass(), "luid", "FWklZXcGFN");
        setIntField(term343149, term343149.getClass(), "year", 2022);
        setShortField(term343149, term343149.getClass(), "month", (short) 8);
        setShortField(term343149, term343149.getClass(), "day", (short) 18);
        setField(term343148, term343148.getClass(), "date", term343149);
        setByteField(term343153, term343153.getClass(), "hour", (byte) 12);
        setByteField(term343153, term343153.getClass(), "minute", (byte) 42);
        setByteField(term343153, term343153.getClass(), "second", (byte) 38);
        setIntField(term343153, term343153.getClass(), "nano", 751593185);
        setField(term343148, term343148.getClass(), "time", term343153);
        setField(term343132, term343132.getClass(), "registerTime", term343148);
        setIntField(term343159, term343159.getClass(), "year", 2014);
        setShortField(term343159, term343159.getClass(), "month", (short) 6);
        setShortField(term343159, term343159.getClass(), "day", (short) 1);
        setField(term343158, term343158.getClass(), "date", term343159);
        setByteField(term343163, term343163.getClass(), "hour", (byte) 9);
        setByteField(term343163, term343163.getClass(), "minute", (byte) 1);
        setByteField(term343163, term343163.getClass(), "second", (byte) 49);
        setIntField(term343163, term343163.getClass(), "nano", 340400672);
        setField(term343158, term343158.getClass(), "time", term343163);
        setField(term343132, term343132.getClass(), "accessTime", term343158);
        setField(term343130, term343130.getClass(), "card", term343132);
        setField(term343130, term343130.getClass(), "userName", "cUTGvzwrGF");
        setIntField(term343130, term343130.getClass(), "level", 720922070);
        setIntField(term343130, term343130.getClass(), "reincarnationNum", 1149741307);
        setLongField(term343130, term343130.getClass(), "exp", 7279904764577963412L);
        setLongField(term343130, term343130.getClass(), "point", -737233937886602501L);
        setLongField(term343130, term343130.getClass(), "totalPoint", 9110711119156437417L);
        setIntField(term343130, term343130.getClass(), "playCount", -2136633259);
        setIntField(term343130, term343130.getClass(), "jewelCount", 1746983826);
        setIntField(term343130, term343130.getClass(), "totalJewelCount", -988253987);
        setIntField(term343130, term343130.getClass(), "medalCount", 636756098);
        setIntField(term343130, term343130.getClass(), "playerRating", 734043224);
        setIntField(term343130, term343130.getClass(), "highestRating", -668594446);
        setIntField(term343130, term343130.getClass(), "battlePoint", 119165844);
        setIntField(term343130, term343130.getClass(), "bestBattlePoint", 479479404);
        setIntField(term343130, term343130.getClass(), "overDamageBattlePoint", 264020178);
        setBooleanField(term343130, term343130.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term343130, term343130.getClass(), "nameplateId", 1869110181);
        setIntField(term343130, term343130.getClass(), "trophyId", -1855510337);
        setIntField(term343130, term343130.getClass(), "cardId", -511279379);
        setIntField(term343130, term343130.getClass(), "characterId", 106081153);
        setIntField(term343130, term343130.getClass(), "characterVoiceNo", -1187225625);
        setIntField(term343130, term343130.getClass(), "tabSetting", -2128845125);
        setIntField(term343130, term343130.getClass(), "tabSortSetting", -2071097025);
        setIntField(term343130, term343130.getClass(), "cardCategorySetting", 1382119349);
        setIntField(term343130, term343130.getClass(), "cardSortSetting", 1912184942);
        setIntField(term343130, term343130.getClass(), "rivalScoreCategorySetting", 1240175878);
        setIntField(term343130, term343130.getClass(), "playedTutorialBit", -82474792);
        setIntField(term343130, term343130.getClass(), "firstTutorialCancelNum", -1689908870);
        setLongField(term343130, term343130.getClass(), "sumTechHighScore", 3889145554422997529L);
        setLongField(term343130, term343130.getClass(), "sumTechBasicHighScore", 7818431497309568175L);
        setLongField(term343130, term343130.getClass(), "sumTechAdvancedHighScore", 3914407117637389318L);
        setLongField(term343130, term343130.getClass(), "sumTechExpertHighScore", -5541125739356862906L);
        setLongField(term343130, term343130.getClass(), "sumTechMasterHighScore", -1812541650697447461L);
        setLongField(term343130, term343130.getClass(), "sumTechLunaticHighScore", 5749163333997945922L);
        setLongField(term343130, term343130.getClass(), "sumBattleHighScore", 2866705039284161999L);
        setLongField(term343130, term343130.getClass(), "sumBattleBasicHighScore", 8850721707785163662L);
        setLongField(term343130, term343130.getClass(), "sumBattleAdvancedHighScore", 3449714630591057079L);
        setLongField(term343130, term343130.getClass(), "sumBattleExpertHighScore", -2796563674333373619L);
        setLongField(term343130, term343130.getClass(), "sumBattleMasterHighScore", -5203401272468935728L);
        setLongField(term343130, term343130.getClass(), "sumBattleLunaticHighScore", 1800200340561677889L);
        setField(term343130, term343130.getClass(), "eventWatchedDate", "EIoSYoFzsF");
        setField(term343130, term343130.getClass(), "cmEventWatchedDate", "ZxAhFVSQFh");
        setField(term343130, term343130.getClass(), "firstGameId", "PiBeAVaRjg");
        setField(term343130, term343130.getClass(), "firstRomVersion", "nlXIyApYNK");
        setField(term343130, term343130.getClass(), "firstDataVersion", "lcKmdGEPEo");
        setField(term343130, term343130.getClass(), "firstPlayDate", "DSPusjmVev");
        setField(term343130, term343130.getClass(), "lastGameId", "bKRWFxaaCC");
        setField(term343130, term343130.getClass(), "lastRomVersion", "WuJBbdQuxL");
        setField(term343130, term343130.getClass(), "lastDataVersion", "jYSDTzXDeJ");
        setField(term343130, term343130.getClass(), "compatibleCmVersion", "AheuvbpcEh");
        setField(term343130, term343130.getClass(), "lastPlayDate", "BaYMWtEGJe");
        setIntField(term343130, term343130.getClass(), "lastPlaceId", 1682370238);
        setField(term343130, term343130.getClass(), "lastPlaceName", "xiifOymEOj");
        setIntField(term343130, term343130.getClass(), "lastRegionId", -1056877052);
        setField(term343130, term343130.getClass(), "lastRegionName", "jmFGKCVUkF");
        setIntField(term343130, term343130.getClass(), "lastAllNetId", 1342764510);
        setField(term343130, term343130.getClass(), "lastClientId", "OhVIvilgZx");
        setIntField(term343130, term343130.getClass(), "lastUsedDeckId", -444573956);
        setIntField(term343130, term343130.getClass(), "lastPlayMusicLevel", 395731131);
        setIntField(term343130, term343130.getClass(), "lastEmoneyBrand", 1554827520);
        setField(term343128, term343128.getClass(), "user", term343130);
        setIntField(term343128, term343128.getClass(), "optionSet", -204128038);
        setIntField(term343128, term343128.getClass(), "speed", -911301593);
        setIntField(term343128, term343128.getClass(), "mirror", -1062163073);
        setIntField(term343128, term343128.getClass(), "judgeTiming", 1082951792);
        setIntField(term343128, term343128.getClass(), "judgeAdjustment", -1229716052);
        setIntField(term343128, term343128.getClass(), "abort", 1584428173);
        setIntField(term343128, term343128.getClass(), "stealthField", 1926824813);
        setIntField(term343128, term343128.getClass(), "tapSound", 244762748);
        setIntField(term343128, term343128.getClass(), "volGuide", -1371887170);
        setIntField(term343128, term343128.getClass(), "volAll", -2022951027);
        setIntField(term343128, term343128.getClass(), "volTap", -955274362);
        setIntField(term343128, term343128.getClass(), "volCrTap", 1722177985);
        setIntField(term343128, term343128.getClass(), "volHold", -1181703812);
        setIntField(term343128, term343128.getClass(), "volSide", -1581182288);
        setIntField(term343128, term343128.getClass(), "volFlick", -796193285);
        setIntField(term343128, term343128.getClass(), "volBell", 1217303633);
        setIntField(term343128, term343128.getClass(), "volEnemy", 1220548867);
        setIntField(term343128, term343128.getClass(), "volSkill", 1994419798);
        setIntField(term343128, term343128.getClass(), "volDamage", -689705982);
        setIntField(term343128, term343128.getClass(), "colorField", 1012166398);
        setIntField(term343128, term343128.getClass(), "colorLaneBright", 849081368);
        setIntField(term343128, term343128.getClass(), "colorWallBright", -2141116271);
        setIntField(term343128, term343128.getClass(), "colorLane", -1729436948);
        setIntField(term343128, term343128.getClass(), "colorSide", -917813544);
        setIntField(term343128, term343128.getClass(), "effectDamage", -1393469093);
        setIntField(term343128, term343128.getClass(), "effectPos", -2078764464);
        setIntField(term343128, term343128.getClass(), "judgeDisp", -873821065);
        setIntField(term343128, term343128.getClass(), "judgePos", -1279780109);
        setIntField(term343128, term343128.getClass(), "judgeBreak", 1131035835);
        setIntField(term343128, term343128.getClass(), "judgeHit", 1977850559);
        setIntField(term343128, term343128.getClass(), "platinumBreakDisp", -1283796896);
        setIntField(term343128, term343128.getClass(), "judgeCriticalBreak", 159793261);
        setIntField(term343128, term343128.getClass(), "matching", 99196204);
        setIntField(term343128, term343128.getClass(), "dispPlayerLv", 239914222);
        setIntField(term343128, term343128.getClass(), "dispRating", 1933523772);
        setIntField(term343128, term343128.getClass(), "dispBP", -708521298);
        setIntField(term343128, term343128.getClass(), "headphone", 511797655);
        term343430 = new Integer(954336176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term343430;
        callMethod(klass, "setMatching", argTypes, term343128, args);
    }

};


