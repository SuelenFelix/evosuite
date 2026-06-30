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

public class UserOption_getVolBell_109844380518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316767;

    public UserOption_getVolBell_109844380518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316773 = new Long(3535528164828723056L);
        term316767 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term316769 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term316771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term316787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term316797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term316802 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term316767, term316767.getClass(), "id", 6266575106429719459L);
        setLongField(term316769, term316769.getClass(), "id", 6715193949786683983L);
        setLongField(term316771, term316771.getClass(), "id", 6699201383494578535L);
        setField(term316771, term316771.getClass(), "extId", term316773);
        setField(term316771, term316771.getClass(), "luid", "DUyELMAZHH");
        setIntField(term316788, term316788.getClass(), "year", 2021);
        setShortField(term316788, term316788.getClass(), "month", (short) 9);
        setShortField(term316788, term316788.getClass(), "day", (short) 3);
        setField(term316787, term316787.getClass(), "date", term316788);
        setByteField(term316792, term316792.getClass(), "hour", (byte) 14);
        setByteField(term316792, term316792.getClass(), "minute", (byte) 19);
        setByteField(term316792, term316792.getClass(), "second", (byte) 24);
        setIntField(term316792, term316792.getClass(), "nano", 810013387);
        setField(term316787, term316787.getClass(), "time", term316792);
        setField(term316771, term316771.getClass(), "registerTime", term316787);
        setIntField(term316798, term316798.getClass(), "year", 2020);
        setShortField(term316798, term316798.getClass(), "month", (short) 5);
        setShortField(term316798, term316798.getClass(), "day", (short) 1);
        setField(term316797, term316797.getClass(), "date", term316798);
        setByteField(term316802, term316802.getClass(), "hour", (byte) 18);
        setByteField(term316802, term316802.getClass(), "minute", (byte) 14);
        setByteField(term316802, term316802.getClass(), "second", (byte) 55);
        setIntField(term316802, term316802.getClass(), "nano", 33109610);
        setField(term316797, term316797.getClass(), "time", term316802);
        setField(term316771, term316771.getClass(), "accessTime", term316797);
        setField(term316769, term316769.getClass(), "card", term316771);
        setField(term316769, term316769.getClass(), "userName", "bATTZPTLhT");
        setIntField(term316769, term316769.getClass(), "level", -1846243901);
        setIntField(term316769, term316769.getClass(), "reincarnationNum", -1411820482);
        setLongField(term316769, term316769.getClass(), "exp", 3889250642256515731L);
        setLongField(term316769, term316769.getClass(), "point", 3155566865217543589L);
        setLongField(term316769, term316769.getClass(), "totalPoint", -3509538254467320510L);
        setIntField(term316769, term316769.getClass(), "playCount", 1823492708);
        setIntField(term316769, term316769.getClass(), "jewelCount", -1140992225);
        setIntField(term316769, term316769.getClass(), "totalJewelCount", 1321444482);
        setIntField(term316769, term316769.getClass(), "medalCount", -1915743308);
        setIntField(term316769, term316769.getClass(), "playerRating", -935541323);
        setIntField(term316769, term316769.getClass(), "highestRating", -352537764);
        setIntField(term316769, term316769.getClass(), "battlePoint", 902717471);
        setIntField(term316769, term316769.getClass(), "bestBattlePoint", 1004855346);
        setIntField(term316769, term316769.getClass(), "overDamageBattlePoint", 962330182);
        setBooleanField(term316769, term316769.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term316769, term316769.getClass(), "nameplateId", -878487713);
        setIntField(term316769, term316769.getClass(), "trophyId", -932089225);
        setIntField(term316769, term316769.getClass(), "cardId", -1934347867);
        setIntField(term316769, term316769.getClass(), "characterId", -1706749349);
        setIntField(term316769, term316769.getClass(), "characterVoiceNo", 1691853647);
        setIntField(term316769, term316769.getClass(), "tabSetting", 1333947633);
        setIntField(term316769, term316769.getClass(), "tabSortSetting", 908983527);
        setIntField(term316769, term316769.getClass(), "cardCategorySetting", -1560925180);
        setIntField(term316769, term316769.getClass(), "cardSortSetting", 1622612061);
        setIntField(term316769, term316769.getClass(), "rivalScoreCategorySetting", 640198610);
        setIntField(term316769, term316769.getClass(), "playedTutorialBit", -1523209592);
        setIntField(term316769, term316769.getClass(), "firstTutorialCancelNum", -457921907);
        setLongField(term316769, term316769.getClass(), "sumTechHighScore", 6816768395172012602L);
        setLongField(term316769, term316769.getClass(), "sumTechBasicHighScore", 6935123108732736199L);
        setLongField(term316769, term316769.getClass(), "sumTechAdvancedHighScore", 2111620713740038932L);
        setLongField(term316769, term316769.getClass(), "sumTechExpertHighScore", 3014177079901634228L);
        setLongField(term316769, term316769.getClass(), "sumTechMasterHighScore", 2905290893351982836L);
        setLongField(term316769, term316769.getClass(), "sumTechLunaticHighScore", -7490395211514146773L);
        setLongField(term316769, term316769.getClass(), "sumBattleHighScore", -1330430759048619915L);
        setLongField(term316769, term316769.getClass(), "sumBattleBasicHighScore", -9058042479834143617L);
        setLongField(term316769, term316769.getClass(), "sumBattleAdvancedHighScore", 1780085796373447500L);
        setLongField(term316769, term316769.getClass(), "sumBattleExpertHighScore", 3567338130826274842L);
        setLongField(term316769, term316769.getClass(), "sumBattleMasterHighScore", 8776523461053084112L);
        setLongField(term316769, term316769.getClass(), "sumBattleLunaticHighScore", 1989321094452251040L);
        setField(term316769, term316769.getClass(), "eventWatchedDate", "jokTyZlMUG");
        setField(term316769, term316769.getClass(), "cmEventWatchedDate", "OsLnVWKqPb");
        setField(term316769, term316769.getClass(), "firstGameId", "RqEPAfcDuX");
        setField(term316769, term316769.getClass(), "firstRomVersion", "PAVnkSNDwe");
        setField(term316769, term316769.getClass(), "firstDataVersion", "TgdGeQmGMA");
        setField(term316769, term316769.getClass(), "firstPlayDate", "vMmmRBKzxv");
        setField(term316769, term316769.getClass(), "lastGameId", "dbUwucIqCO");
        setField(term316769, term316769.getClass(), "lastRomVersion", "AhqUNtWQVg");
        setField(term316769, term316769.getClass(), "lastDataVersion", "sBTzWGBKhY");
        setField(term316769, term316769.getClass(), "compatibleCmVersion", "Mfcgvxpbnq");
        setField(term316769, term316769.getClass(), "lastPlayDate", "LnhpoXdDdU");
        setIntField(term316769, term316769.getClass(), "lastPlaceId", 374781737);
        setField(term316769, term316769.getClass(), "lastPlaceName", "LUsytuiGtv");
        setIntField(term316769, term316769.getClass(), "lastRegionId", -24327473);
        setField(term316769, term316769.getClass(), "lastRegionName", "HNdnDLZCXT");
        setIntField(term316769, term316769.getClass(), "lastAllNetId", 830748113);
        setField(term316769, term316769.getClass(), "lastClientId", "EHdXgTVIIm");
        setIntField(term316769, term316769.getClass(), "lastUsedDeckId", 417460026);
        setIntField(term316769, term316769.getClass(), "lastPlayMusicLevel", 406315107);
        setIntField(term316769, term316769.getClass(), "lastEmoneyBrand", -627062045);
        setField(term316767, term316767.getClass(), "user", term316769);
        setIntField(term316767, term316767.getClass(), "optionSet", -1445021691);
        setIntField(term316767, term316767.getClass(), "speed", 805552435);
        setIntField(term316767, term316767.getClass(), "mirror", -510125131);
        setIntField(term316767, term316767.getClass(), "judgeTiming", -1779207838);
        setIntField(term316767, term316767.getClass(), "judgeAdjustment", 1830020074);
        setIntField(term316767, term316767.getClass(), "abort", 140147901);
        setIntField(term316767, term316767.getClass(), "stealthField", 515631328);
        setIntField(term316767, term316767.getClass(), "tapSound", -357842866);
        setIntField(term316767, term316767.getClass(), "volGuide", -1168689785);
        setIntField(term316767, term316767.getClass(), "volAll", -1840348757);
        setIntField(term316767, term316767.getClass(), "volTap", -340590811);
        setIntField(term316767, term316767.getClass(), "volCrTap", -1540241431);
        setIntField(term316767, term316767.getClass(), "volHold", 800643630);
        setIntField(term316767, term316767.getClass(), "volSide", -1079929581);
        setIntField(term316767, term316767.getClass(), "volFlick", 873897701);
        setIntField(term316767, term316767.getClass(), "volBell", -607796853);
        setIntField(term316767, term316767.getClass(), "volEnemy", 1810207932);
        setIntField(term316767, term316767.getClass(), "volSkill", 803744323);
        setIntField(term316767, term316767.getClass(), "volDamage", -215426677);
        setIntField(term316767, term316767.getClass(), "colorField", 1586987957);
        setIntField(term316767, term316767.getClass(), "colorLaneBright", -649453025);
        setIntField(term316767, term316767.getClass(), "colorWallBright", -1667643659);
        setIntField(term316767, term316767.getClass(), "colorLane", 1757803433);
        setIntField(term316767, term316767.getClass(), "colorSide", -940989595);
        setIntField(term316767, term316767.getClass(), "effectDamage", -261496296);
        setIntField(term316767, term316767.getClass(), "effectPos", -2142832958);
        setIntField(term316767, term316767.getClass(), "judgeDisp", -888715935);
        setIntField(term316767, term316767.getClass(), "judgePos", 221566635);
        setIntField(term316767, term316767.getClass(), "judgeBreak", -437204927);
        setIntField(term316767, term316767.getClass(), "judgeHit", -92896812);
        setIntField(term316767, term316767.getClass(), "platinumBreakDisp", -1870054138);
        setIntField(term316767, term316767.getClass(), "judgeCriticalBreak", -1417253764);
        setIntField(term316767, term316767.getClass(), "matching", 721738065);
        setIntField(term316767, term316767.getClass(), "dispPlayerLv", 462609120);
        setIntField(term316767, term316767.getClass(), "dispRating", 171730946);
        setIntField(term316767, term316767.getClass(), "dispBP", -575803963);
        setIntField(term316767, term316767.getClass(), "headphone", 1406908575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolBell", argTypes, term316767, args);
    }

};


