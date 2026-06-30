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

public class UserOption_setVolBell_45417607757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335240;
     Object term335542;

    public UserOption_setVolBell_45417607757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335246 = new Long(-3243599172737171562L);
        term335240 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term335242 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term335244 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term335260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term335261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term335265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term335270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term335271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term335275 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term335240, term335240.getClass(), "id", -4371876085850626564L);
        setLongField(term335242, term335242.getClass(), "id", -4886216627158011257L);
        setLongField(term335244, term335244.getClass(), "id", 4778783606619425967L);
        setField(term335244, term335244.getClass(), "extId", term335246);
        setField(term335244, term335244.getClass(), "luid", "DPupvKXFAm");
        setIntField(term335261, term335261.getClass(), "year", 2013);
        setShortField(term335261, term335261.getClass(), "month", (short) 8);
        setShortField(term335261, term335261.getClass(), "day", (short) 23);
        setField(term335260, term335260.getClass(), "date", term335261);
        setByteField(term335265, term335265.getClass(), "hour", (byte) 4);
        setByteField(term335265, term335265.getClass(), "minute", (byte) 50);
        setByteField(term335265, term335265.getClass(), "second", (byte) 59);
        setIntField(term335265, term335265.getClass(), "nano", 855943637);
        setField(term335260, term335260.getClass(), "time", term335265);
        setField(term335244, term335244.getClass(), "registerTime", term335260);
        setIntField(term335271, term335271.getClass(), "year", 2018);
        setShortField(term335271, term335271.getClass(), "month", (short) 6);
        setShortField(term335271, term335271.getClass(), "day", (short) 28);
        setField(term335270, term335270.getClass(), "date", term335271);
        setByteField(term335275, term335275.getClass(), "hour", (byte) 18);
        setByteField(term335275, term335275.getClass(), "minute", (byte) 0);
        setByteField(term335275, term335275.getClass(), "second", (byte) 57);
        setIntField(term335275, term335275.getClass(), "nano", 78069460);
        setField(term335270, term335270.getClass(), "time", term335275);
        setField(term335244, term335244.getClass(), "accessTime", term335270);
        setField(term335242, term335242.getClass(), "card", term335244);
        setField(term335242, term335242.getClass(), "userName", "QoUTGzzJOU");
        setIntField(term335242, term335242.getClass(), "level", 1249242856);
        setIntField(term335242, term335242.getClass(), "reincarnationNum", -190048990);
        setLongField(term335242, term335242.getClass(), "exp", -6923520755865335648L);
        setLongField(term335242, term335242.getClass(), "point", 1212146741116659134L);
        setLongField(term335242, term335242.getClass(), "totalPoint", -5117811394940208296L);
        setIntField(term335242, term335242.getClass(), "playCount", -1935429679);
        setIntField(term335242, term335242.getClass(), "jewelCount", -554673891);
        setIntField(term335242, term335242.getClass(), "totalJewelCount", -251032545);
        setIntField(term335242, term335242.getClass(), "medalCount", 1189578043);
        setIntField(term335242, term335242.getClass(), "playerRating", 134993418);
        setIntField(term335242, term335242.getClass(), "highestRating", 899329896);
        setIntField(term335242, term335242.getClass(), "battlePoint", 1969467726);
        setIntField(term335242, term335242.getClass(), "bestBattlePoint", -294880903);
        setIntField(term335242, term335242.getClass(), "overDamageBattlePoint", 2088678362);
        setBooleanField(term335242, term335242.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term335242, term335242.getClass(), "nameplateId", 885425637);
        setIntField(term335242, term335242.getClass(), "trophyId", 1462433844);
        setIntField(term335242, term335242.getClass(), "cardId", 1015647678);
        setIntField(term335242, term335242.getClass(), "characterId", 602816125);
        setIntField(term335242, term335242.getClass(), "characterVoiceNo", 1795040343);
        setIntField(term335242, term335242.getClass(), "tabSetting", -587672463);
        setIntField(term335242, term335242.getClass(), "tabSortSetting", -1766502608);
        setIntField(term335242, term335242.getClass(), "cardCategorySetting", -861754909);
        setIntField(term335242, term335242.getClass(), "cardSortSetting", 1215454509);
        setIntField(term335242, term335242.getClass(), "rivalScoreCategorySetting", 2016511613);
        setIntField(term335242, term335242.getClass(), "playedTutorialBit", -1900550630);
        setIntField(term335242, term335242.getClass(), "firstTutorialCancelNum", -406153526);
        setLongField(term335242, term335242.getClass(), "sumTechHighScore", -14137903882284399L);
        setLongField(term335242, term335242.getClass(), "sumTechBasicHighScore", 4379923506671863475L);
        setLongField(term335242, term335242.getClass(), "sumTechAdvancedHighScore", -2461267461622002369L);
        setLongField(term335242, term335242.getClass(), "sumTechExpertHighScore", -2294524780365764227L);
        setLongField(term335242, term335242.getClass(), "sumTechMasterHighScore", 6668294619696995157L);
        setLongField(term335242, term335242.getClass(), "sumTechLunaticHighScore", 6648802008001601459L);
        setLongField(term335242, term335242.getClass(), "sumBattleHighScore", -4548489878482949931L);
        setLongField(term335242, term335242.getClass(), "sumBattleBasicHighScore", 1615001723287199522L);
        setLongField(term335242, term335242.getClass(), "sumBattleAdvancedHighScore", 1706259504202764161L);
        setLongField(term335242, term335242.getClass(), "sumBattleExpertHighScore", 2177039363765860942L);
        setLongField(term335242, term335242.getClass(), "sumBattleMasterHighScore", 5538684155490324057L);
        setLongField(term335242, term335242.getClass(), "sumBattleLunaticHighScore", 5853776565280230804L);
        setField(term335242, term335242.getClass(), "eventWatchedDate", "knVBPTvMnL");
        setField(term335242, term335242.getClass(), "cmEventWatchedDate", "SijbCfwSPn");
        setField(term335242, term335242.getClass(), "firstGameId", "tIvfERHYla");
        setField(term335242, term335242.getClass(), "firstRomVersion", "wZNlLwpvPy");
        setField(term335242, term335242.getClass(), "firstDataVersion", "hbvAcTQHyP");
        setField(term335242, term335242.getClass(), "firstPlayDate", "ogeqthtDFQ");
        setField(term335242, term335242.getClass(), "lastGameId", "nFDNREwMxY");
        setField(term335242, term335242.getClass(), "lastRomVersion", "QRjWIMIpVB");
        setField(term335242, term335242.getClass(), "lastDataVersion", "RGGUBIKLUa");
        setField(term335242, term335242.getClass(), "compatibleCmVersion", "tcpRLmMZAh");
        setField(term335242, term335242.getClass(), "lastPlayDate", "BALCoWwOGD");
        setIntField(term335242, term335242.getClass(), "lastPlaceId", -1372314617);
        setField(term335242, term335242.getClass(), "lastPlaceName", "EeIJlPEevc");
        setIntField(term335242, term335242.getClass(), "lastRegionId", -1217148452);
        setField(term335242, term335242.getClass(), "lastRegionName", "dKIQEFzYdb");
        setIntField(term335242, term335242.getClass(), "lastAllNetId", 581630479);
        setField(term335242, term335242.getClass(), "lastClientId", "vTHGXQRmdx");
        setIntField(term335242, term335242.getClass(), "lastUsedDeckId", 966233608);
        setIntField(term335242, term335242.getClass(), "lastPlayMusicLevel", 177375352);
        setIntField(term335242, term335242.getClass(), "lastEmoneyBrand", -291982705);
        setField(term335240, term335240.getClass(), "user", term335242);
        setIntField(term335240, term335240.getClass(), "optionSet", -456051628);
        setIntField(term335240, term335240.getClass(), "speed", 1532386600);
        setIntField(term335240, term335240.getClass(), "mirror", 1360468237);
        setIntField(term335240, term335240.getClass(), "judgeTiming", 1305439693);
        setIntField(term335240, term335240.getClass(), "judgeAdjustment", 2138637439);
        setIntField(term335240, term335240.getClass(), "abort", 517482553);
        setIntField(term335240, term335240.getClass(), "stealthField", -71896434);
        setIntField(term335240, term335240.getClass(), "tapSound", -2115511822);
        setIntField(term335240, term335240.getClass(), "volGuide", -1506505893);
        setIntField(term335240, term335240.getClass(), "volAll", -1032174367);
        setIntField(term335240, term335240.getClass(), "volTap", -1888551037);
        setIntField(term335240, term335240.getClass(), "volCrTap", -1852167753);
        setIntField(term335240, term335240.getClass(), "volHold", 904581134);
        setIntField(term335240, term335240.getClass(), "volSide", 1130902200);
        setIntField(term335240, term335240.getClass(), "volFlick", -1394201607);
        setIntField(term335240, term335240.getClass(), "volBell", 1573455524);
        setIntField(term335240, term335240.getClass(), "volEnemy", -1763400835);
        setIntField(term335240, term335240.getClass(), "volSkill", 160711891);
        setIntField(term335240, term335240.getClass(), "volDamage", 1578668421);
        setIntField(term335240, term335240.getClass(), "colorField", -2002852158);
        setIntField(term335240, term335240.getClass(), "colorLaneBright", -1724262929);
        setIntField(term335240, term335240.getClass(), "colorWallBright", -1952919394);
        setIntField(term335240, term335240.getClass(), "colorLane", 817553289);
        setIntField(term335240, term335240.getClass(), "colorSide", 406751635);
        setIntField(term335240, term335240.getClass(), "effectDamage", 321495792);
        setIntField(term335240, term335240.getClass(), "effectPos", 1501361646);
        setIntField(term335240, term335240.getClass(), "judgeDisp", 1647674293);
        setIntField(term335240, term335240.getClass(), "judgePos", -1463168954);
        setIntField(term335240, term335240.getClass(), "judgeBreak", -1137477769);
        setIntField(term335240, term335240.getClass(), "judgeHit", -1988799403);
        setIntField(term335240, term335240.getClass(), "platinumBreakDisp", 1376474833);
        setIntField(term335240, term335240.getClass(), "judgeCriticalBreak", -1644075738);
        setIntField(term335240, term335240.getClass(), "matching", -1250724277);
        setIntField(term335240, term335240.getClass(), "dispPlayerLv", -1435876936);
        setIntField(term335240, term335240.getClass(), "dispRating", 41406904);
        setIntField(term335240, term335240.getClass(), "dispBP", 1643308628);
        setIntField(term335240, term335240.getClass(), "headphone", 706240161);
        term335542 = new Integer(-627943905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term335542;
        callMethod(klass, "setVolBell", argTypes, term335240, args);
    }

};


