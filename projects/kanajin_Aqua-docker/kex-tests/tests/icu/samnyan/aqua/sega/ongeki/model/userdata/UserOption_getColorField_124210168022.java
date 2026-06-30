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

public class UserOption_getColorField_124210168022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318615;

    public UserOption_getColorField_124210168022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318621 = new Long(-8697239524885136781L);
        term318615 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term318617 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term318619 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term318635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term318645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term318646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term318650 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term318615, term318615.getClass(), "id", -4534498638488398363L);
        setLongField(term318617, term318617.getClass(), "id", -9219754727685202264L);
        setLongField(term318619, term318619.getClass(), "id", -7850908826872517714L);
        setField(term318619, term318619.getClass(), "extId", term318621);
        setField(term318619, term318619.getClass(), "luid", "xnIIvspPpv");
        setIntField(term318636, term318636.getClass(), "year", 2019);
        setShortField(term318636, term318636.getClass(), "month", (short) 5);
        setShortField(term318636, term318636.getClass(), "day", (short) 15);
        setField(term318635, term318635.getClass(), "date", term318636);
        setByteField(term318640, term318640.getClass(), "hour", (byte) 19);
        setByteField(term318640, term318640.getClass(), "minute", (byte) 22);
        setByteField(term318640, term318640.getClass(), "second", (byte) 51);
        setIntField(term318640, term318640.getClass(), "nano", 636844001);
        setField(term318635, term318635.getClass(), "time", term318640);
        setField(term318619, term318619.getClass(), "registerTime", term318635);
        setIntField(term318646, term318646.getClass(), "year", 2020);
        setShortField(term318646, term318646.getClass(), "month", (short) 6);
        setShortField(term318646, term318646.getClass(), "day", (short) 17);
        setField(term318645, term318645.getClass(), "date", term318646);
        setByteField(term318650, term318650.getClass(), "hour", (byte) 3);
        setByteField(term318650, term318650.getClass(), "minute", (byte) 34);
        setByteField(term318650, term318650.getClass(), "second", (byte) 37);
        setIntField(term318650, term318650.getClass(), "nano", 374939630);
        setField(term318645, term318645.getClass(), "time", term318650);
        setField(term318619, term318619.getClass(), "accessTime", term318645);
        setField(term318617, term318617.getClass(), "card", term318619);
        setField(term318617, term318617.getClass(), "userName", "uyPbrmFyeJ");
        setIntField(term318617, term318617.getClass(), "level", 2100151655);
        setIntField(term318617, term318617.getClass(), "reincarnationNum", 1588210372);
        setLongField(term318617, term318617.getClass(), "exp", 181657875417972841L);
        setLongField(term318617, term318617.getClass(), "point", -3002638350098579493L);
        setLongField(term318617, term318617.getClass(), "totalPoint", -2662616435687980385L);
        setIntField(term318617, term318617.getClass(), "playCount", -674611574);
        setIntField(term318617, term318617.getClass(), "jewelCount", -2003828321);
        setIntField(term318617, term318617.getClass(), "totalJewelCount", 2103465115);
        setIntField(term318617, term318617.getClass(), "medalCount", 146989742);
        setIntField(term318617, term318617.getClass(), "playerRating", 605822696);
        setIntField(term318617, term318617.getClass(), "highestRating", 485883961);
        setIntField(term318617, term318617.getClass(), "battlePoint", 499510238);
        setIntField(term318617, term318617.getClass(), "bestBattlePoint", 1033869905);
        setIntField(term318617, term318617.getClass(), "overDamageBattlePoint", -600875251);
        setBooleanField(term318617, term318617.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term318617, term318617.getClass(), "nameplateId", -1424347518);
        setIntField(term318617, term318617.getClass(), "trophyId", 1147983173);
        setIntField(term318617, term318617.getClass(), "cardId", 1467584460);
        setIntField(term318617, term318617.getClass(), "characterId", 2104798361);
        setIntField(term318617, term318617.getClass(), "characterVoiceNo", -1835154134);
        setIntField(term318617, term318617.getClass(), "tabSetting", -800065707);
        setIntField(term318617, term318617.getClass(), "tabSortSetting", -272802569);
        setIntField(term318617, term318617.getClass(), "cardCategorySetting", 670911517);
        setIntField(term318617, term318617.getClass(), "cardSortSetting", 316657137);
        setIntField(term318617, term318617.getClass(), "rivalScoreCategorySetting", 1046848217);
        setIntField(term318617, term318617.getClass(), "playedTutorialBit", 179638951);
        setIntField(term318617, term318617.getClass(), "firstTutorialCancelNum", 622316819);
        setLongField(term318617, term318617.getClass(), "sumTechHighScore", -6821701868437334548L);
        setLongField(term318617, term318617.getClass(), "sumTechBasicHighScore", -8563934963331005763L);
        setLongField(term318617, term318617.getClass(), "sumTechAdvancedHighScore", 1533095523700257919L);
        setLongField(term318617, term318617.getClass(), "sumTechExpertHighScore", -6898116976404731665L);
        setLongField(term318617, term318617.getClass(), "sumTechMasterHighScore", -5260754824902783210L);
        setLongField(term318617, term318617.getClass(), "sumTechLunaticHighScore", 6682107235767480703L);
        setLongField(term318617, term318617.getClass(), "sumBattleHighScore", -948760768379746275L);
        setLongField(term318617, term318617.getClass(), "sumBattleBasicHighScore", 320944802166433914L);
        setLongField(term318617, term318617.getClass(), "sumBattleAdvancedHighScore", -6753171562444288214L);
        setLongField(term318617, term318617.getClass(), "sumBattleExpertHighScore", -8354978781638050925L);
        setLongField(term318617, term318617.getClass(), "sumBattleMasterHighScore", -5666250966179520634L);
        setLongField(term318617, term318617.getClass(), "sumBattleLunaticHighScore", -429579653507725754L);
        setField(term318617, term318617.getClass(), "eventWatchedDate", "IlMXSUsxva");
        setField(term318617, term318617.getClass(), "cmEventWatchedDate", "NTdujMfVat");
        setField(term318617, term318617.getClass(), "firstGameId", "WQTXcFNGDy");
        setField(term318617, term318617.getClass(), "firstRomVersion", "bWLHjGwGbU");
        setField(term318617, term318617.getClass(), "firstDataVersion", "LeToSAspHZ");
        setField(term318617, term318617.getClass(), "firstPlayDate", "QymIouEYke");
        setField(term318617, term318617.getClass(), "lastGameId", "RPFwcbVhvK");
        setField(term318617, term318617.getClass(), "lastRomVersion", "ztWRRDeVwF");
        setField(term318617, term318617.getClass(), "lastDataVersion", "PNPxBAFpQw");
        setField(term318617, term318617.getClass(), "compatibleCmVersion", "NNLJDDBwex");
        setField(term318617, term318617.getClass(), "lastPlayDate", "DUMrRSuAcN");
        setIntField(term318617, term318617.getClass(), "lastPlaceId", -497878383);
        setField(term318617, term318617.getClass(), "lastPlaceName", "KrEYvzcpkI");
        setIntField(term318617, term318617.getClass(), "lastRegionId", 174909941);
        setField(term318617, term318617.getClass(), "lastRegionName", "LgMtmRmJQD");
        setIntField(term318617, term318617.getClass(), "lastAllNetId", 1772241968);
        setField(term318617, term318617.getClass(), "lastClientId", "VahMbDgekD");
        setIntField(term318617, term318617.getClass(), "lastUsedDeckId", 1483704590);
        setIntField(term318617, term318617.getClass(), "lastPlayMusicLevel", 18843099);
        setIntField(term318617, term318617.getClass(), "lastEmoneyBrand", -1823419269);
        setField(term318615, term318615.getClass(), "user", term318617);
        setIntField(term318615, term318615.getClass(), "optionSet", -9517269);
        setIntField(term318615, term318615.getClass(), "speed", 2085118514);
        setIntField(term318615, term318615.getClass(), "mirror", 916423456);
        setIntField(term318615, term318615.getClass(), "judgeTiming", 546964860);
        setIntField(term318615, term318615.getClass(), "judgeAdjustment", 1497574264);
        setIntField(term318615, term318615.getClass(), "abort", -183274267);
        setIntField(term318615, term318615.getClass(), "stealthField", -1455013934);
        setIntField(term318615, term318615.getClass(), "tapSound", -1394825694);
        setIntField(term318615, term318615.getClass(), "volGuide", -474075258);
        setIntField(term318615, term318615.getClass(), "volAll", 1127264454);
        setIntField(term318615, term318615.getClass(), "volTap", -697722007);
        setIntField(term318615, term318615.getClass(), "volCrTap", 161065405);
        setIntField(term318615, term318615.getClass(), "volHold", -1351043887);
        setIntField(term318615, term318615.getClass(), "volSide", 511479005);
        setIntField(term318615, term318615.getClass(), "volFlick", -714180213);
        setIntField(term318615, term318615.getClass(), "volBell", -655900902);
        setIntField(term318615, term318615.getClass(), "volEnemy", -667551572);
        setIntField(term318615, term318615.getClass(), "volSkill", 92818196);
        setIntField(term318615, term318615.getClass(), "volDamage", -1505250714);
        setIntField(term318615, term318615.getClass(), "colorField", 1504281371);
        setIntField(term318615, term318615.getClass(), "colorLaneBright", 567809344);
        setIntField(term318615, term318615.getClass(), "colorWallBright", 625901286);
        setIntField(term318615, term318615.getClass(), "colorLane", 1346970976);
        setIntField(term318615, term318615.getClass(), "colorSide", -1856255868);
        setIntField(term318615, term318615.getClass(), "effectDamage", 690818772);
        setIntField(term318615, term318615.getClass(), "effectPos", -1927492779);
        setIntField(term318615, term318615.getClass(), "judgeDisp", -1303981582);
        setIntField(term318615, term318615.getClass(), "judgePos", -2082469614);
        setIntField(term318615, term318615.getClass(), "judgeBreak", -1658261170);
        setIntField(term318615, term318615.getClass(), "judgeHit", 1887898657);
        setIntField(term318615, term318615.getClass(), "platinumBreakDisp", 571611857);
        setIntField(term318615, term318615.getClass(), "judgeCriticalBreak", -1017883695);
        setIntField(term318615, term318615.getClass(), "matching", 191218168);
        setIntField(term318615, term318615.getClass(), "dispPlayerLv", 96951862);
        setIntField(term318615, term318615.getClass(), "dispRating", -974809266);
        setIntField(term318615, term318615.getClass(), "dispBP", 558582959);
        setIntField(term318615, term318615.getClass(), "headphone", -1727379065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorField", argTypes, term318615, args);
    }

};


