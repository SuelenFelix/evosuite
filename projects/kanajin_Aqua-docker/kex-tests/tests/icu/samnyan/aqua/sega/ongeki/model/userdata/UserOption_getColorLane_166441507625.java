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

public class UserOption_getColorLane_166441507625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320001;

    public UserOption_getColorLane_166441507625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term320007 = new Long(1909175111101717943L);
        term320001 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term320003 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term320005 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term320021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320026 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320036 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term320001, term320001.getClass(), "id", 5460773837165705834L);
        setLongField(term320003, term320003.getClass(), "id", 2020334463177712049L);
        setLongField(term320005, term320005.getClass(), "id", 9057658241676103593L);
        setField(term320005, term320005.getClass(), "extId", term320007);
        setField(term320005, term320005.getClass(), "luid", "OePvhoTVgk");
        setIntField(term320022, term320022.getClass(), "year", 2012);
        setShortField(term320022, term320022.getClass(), "month", (short) 4);
        setShortField(term320022, term320022.getClass(), "day", (short) 11);
        setField(term320021, term320021.getClass(), "date", term320022);
        setByteField(term320026, term320026.getClass(), "hour", (byte) 8);
        setByteField(term320026, term320026.getClass(), "minute", (byte) 39);
        setByteField(term320026, term320026.getClass(), "second", (byte) 15);
        setIntField(term320026, term320026.getClass(), "nano", 771140262);
        setField(term320021, term320021.getClass(), "time", term320026);
        setField(term320005, term320005.getClass(), "registerTime", term320021);
        setIntField(term320032, term320032.getClass(), "year", 2025);
        setShortField(term320032, term320032.getClass(), "month", (short) 2);
        setShortField(term320032, term320032.getClass(), "day", (short) 28);
        setField(term320031, term320031.getClass(), "date", term320032);
        setByteField(term320036, term320036.getClass(), "hour", (byte) 9);
        setByteField(term320036, term320036.getClass(), "minute", (byte) 31);
        setByteField(term320036, term320036.getClass(), "second", (byte) 25);
        setIntField(term320036, term320036.getClass(), "nano", 744387778);
        setField(term320031, term320031.getClass(), "time", term320036);
        setField(term320005, term320005.getClass(), "accessTime", term320031);
        setField(term320003, term320003.getClass(), "card", term320005);
        setField(term320003, term320003.getClass(), "userName", "SEobXMSCLR");
        setIntField(term320003, term320003.getClass(), "level", 1608009655);
        setIntField(term320003, term320003.getClass(), "reincarnationNum", 408495396);
        setLongField(term320003, term320003.getClass(), "exp", 7710943634570148106L);
        setLongField(term320003, term320003.getClass(), "point", 9051191914467744459L);
        setLongField(term320003, term320003.getClass(), "totalPoint", -3156985813282859954L);
        setIntField(term320003, term320003.getClass(), "playCount", -1287378637);
        setIntField(term320003, term320003.getClass(), "jewelCount", -1709427691);
        setIntField(term320003, term320003.getClass(), "totalJewelCount", 1484226812);
        setIntField(term320003, term320003.getClass(), "medalCount", 904753779);
        setIntField(term320003, term320003.getClass(), "playerRating", 876478608);
        setIntField(term320003, term320003.getClass(), "highestRating", 2046140958);
        setIntField(term320003, term320003.getClass(), "battlePoint", 941525036);
        setIntField(term320003, term320003.getClass(), "bestBattlePoint", 1171226298);
        setIntField(term320003, term320003.getClass(), "overDamageBattlePoint", 1695362080);
        setBooleanField(term320003, term320003.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term320003, term320003.getClass(), "nameplateId", -1046191107);
        setIntField(term320003, term320003.getClass(), "trophyId", -477065644);
        setIntField(term320003, term320003.getClass(), "cardId", -1410896763);
        setIntField(term320003, term320003.getClass(), "characterId", 1096733578);
        setIntField(term320003, term320003.getClass(), "characterVoiceNo", -1994019277);
        setIntField(term320003, term320003.getClass(), "tabSetting", 67033897);
        setIntField(term320003, term320003.getClass(), "tabSortSetting", -2096740582);
        setIntField(term320003, term320003.getClass(), "cardCategorySetting", -1163791986);
        setIntField(term320003, term320003.getClass(), "cardSortSetting", 1886209665);
        setIntField(term320003, term320003.getClass(), "rivalScoreCategorySetting", -1949218758);
        setIntField(term320003, term320003.getClass(), "playedTutorialBit", -253546603);
        setIntField(term320003, term320003.getClass(), "firstTutorialCancelNum", -963517351);
        setLongField(term320003, term320003.getClass(), "sumTechHighScore", -4771251909449334096L);
        setLongField(term320003, term320003.getClass(), "sumTechBasicHighScore", -4345016927642128401L);
        setLongField(term320003, term320003.getClass(), "sumTechAdvancedHighScore", 7324227468192091332L);
        setLongField(term320003, term320003.getClass(), "sumTechExpertHighScore", -6612765314758784411L);
        setLongField(term320003, term320003.getClass(), "sumTechMasterHighScore", -8136662428399873657L);
        setLongField(term320003, term320003.getClass(), "sumTechLunaticHighScore", -1677159035663296939L);
        setLongField(term320003, term320003.getClass(), "sumBattleHighScore", -7078579844088138424L);
        setLongField(term320003, term320003.getClass(), "sumBattleBasicHighScore", 7024390905243331312L);
        setLongField(term320003, term320003.getClass(), "sumBattleAdvancedHighScore", -4599226947111343821L);
        setLongField(term320003, term320003.getClass(), "sumBattleExpertHighScore", -8330264935611181415L);
        setLongField(term320003, term320003.getClass(), "sumBattleMasterHighScore", 7523445015742969998L);
        setLongField(term320003, term320003.getClass(), "sumBattleLunaticHighScore", 5698760343285069770L);
        setField(term320003, term320003.getClass(), "eventWatchedDate", "xOJcrtAIFi");
        setField(term320003, term320003.getClass(), "cmEventWatchedDate", "KzCWGxztaR");
        setField(term320003, term320003.getClass(), "firstGameId", "AxDKfVVUDO");
        setField(term320003, term320003.getClass(), "firstRomVersion", "ejoPwHmKAf");
        setField(term320003, term320003.getClass(), "firstDataVersion", "MkffYiDZoD");
        setField(term320003, term320003.getClass(), "firstPlayDate", "lDPFDvPkJl");
        setField(term320003, term320003.getClass(), "lastGameId", "vyaViixWTQ");
        setField(term320003, term320003.getClass(), "lastRomVersion", "dredLJYcvq");
        setField(term320003, term320003.getClass(), "lastDataVersion", "PgOMaGaTVL");
        setField(term320003, term320003.getClass(), "compatibleCmVersion", "PhcELEqKqy");
        setField(term320003, term320003.getClass(), "lastPlayDate", "IAAEwsblqe");
        setIntField(term320003, term320003.getClass(), "lastPlaceId", 864055212);
        setField(term320003, term320003.getClass(), "lastPlaceName", "trKoLUEnBW");
        setIntField(term320003, term320003.getClass(), "lastRegionId", 1184807785);
        setField(term320003, term320003.getClass(), "lastRegionName", "sXXNwyrnhf");
        setIntField(term320003, term320003.getClass(), "lastAllNetId", 735819860);
        setField(term320003, term320003.getClass(), "lastClientId", "lfTLQXSGTf");
        setIntField(term320003, term320003.getClass(), "lastUsedDeckId", -1670828262);
        setIntField(term320003, term320003.getClass(), "lastPlayMusicLevel", 527256961);
        setIntField(term320003, term320003.getClass(), "lastEmoneyBrand", -1777445737);
        setField(term320001, term320001.getClass(), "user", term320003);
        setIntField(term320001, term320001.getClass(), "optionSet", 1876169364);
        setIntField(term320001, term320001.getClass(), "speed", -1400487724);
        setIntField(term320001, term320001.getClass(), "mirror", -1316616936);
        setIntField(term320001, term320001.getClass(), "judgeTiming", 330384030);
        setIntField(term320001, term320001.getClass(), "judgeAdjustment", -2043022756);
        setIntField(term320001, term320001.getClass(), "abort", -258648971);
        setIntField(term320001, term320001.getClass(), "stealthField", 1123491164);
        setIntField(term320001, term320001.getClass(), "tapSound", 745567108);
        setIntField(term320001, term320001.getClass(), "volGuide", 133647513);
        setIntField(term320001, term320001.getClass(), "volAll", -1745895896);
        setIntField(term320001, term320001.getClass(), "volTap", 776266698);
        setIntField(term320001, term320001.getClass(), "volCrTap", -1675062292);
        setIntField(term320001, term320001.getClass(), "volHold", 1028674442);
        setIntField(term320001, term320001.getClass(), "volSide", 772946407);
        setIntField(term320001, term320001.getClass(), "volFlick", 1119082872);
        setIntField(term320001, term320001.getClass(), "volBell", 1522667983);
        setIntField(term320001, term320001.getClass(), "volEnemy", 964318558);
        setIntField(term320001, term320001.getClass(), "volSkill", 1561399123);
        setIntField(term320001, term320001.getClass(), "volDamage", -950244264);
        setIntField(term320001, term320001.getClass(), "colorField", 1723471468);
        setIntField(term320001, term320001.getClass(), "colorLaneBright", 745496858);
        setIntField(term320001, term320001.getClass(), "colorWallBright", -1526063417);
        setIntField(term320001, term320001.getClass(), "colorLane", 1961525437);
        setIntField(term320001, term320001.getClass(), "colorSide", 1861004157);
        setIntField(term320001, term320001.getClass(), "effectDamage", -1352870464);
        setIntField(term320001, term320001.getClass(), "effectPos", 1761749930);
        setIntField(term320001, term320001.getClass(), "judgeDisp", 504205086);
        setIntField(term320001, term320001.getClass(), "judgePos", -1379958870);
        setIntField(term320001, term320001.getClass(), "judgeBreak", 893992877);
        setIntField(term320001, term320001.getClass(), "judgeHit", -1164183548);
        setIntField(term320001, term320001.getClass(), "platinumBreakDisp", -1280943590);
        setIntField(term320001, term320001.getClass(), "judgeCriticalBreak", 97517122);
        setIntField(term320001, term320001.getClass(), "matching", -1670371262);
        setIntField(term320001, term320001.getClass(), "dispPlayerLv", 1575814483);
        setIntField(term320001, term320001.getClass(), "dispRating", -1492418372);
        setIntField(term320001, term320001.getClass(), "dispBP", 1128181288);
        setIntField(term320001, term320001.getClass(), "headphone", -744965178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorLane", argTypes, term320001, args);
    }

};


