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

public class UserActivity_toString_180874146622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292667;

    public UserActivity_toString_180874146622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term292673 = new Long(-814922776357887557L);
        term292667 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term292669 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term292671 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term292687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292692 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292702 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term292667, term292667.getClass(), "id", 790513566984839281L);
        setLongField(term292669, term292669.getClass(), "id", -363969857872953771L);
        setLongField(term292671, term292671.getClass(), "id", -3909603758899902138L);
        setField(term292671, term292671.getClass(), "extId", term292673);
        setField(term292671, term292671.getClass(), "luid", "bLgBVBwSSr");
        setIntField(term292688, term292688.getClass(), "year", 2023);
        setShortField(term292688, term292688.getClass(), "month", (short) 12);
        setShortField(term292688, term292688.getClass(), "day", (short) 14);
        setField(term292687, term292687.getClass(), "date", term292688);
        setByteField(term292692, term292692.getClass(), "hour", (byte) 15);
        setByteField(term292692, term292692.getClass(), "minute", (byte) 9);
        setByteField(term292692, term292692.getClass(), "second", (byte) 28);
        setIntField(term292692, term292692.getClass(), "nano", 738602156);
        setField(term292687, term292687.getClass(), "time", term292692);
        setField(term292671, term292671.getClass(), "registerTime", term292687);
        setIntField(term292698, term292698.getClass(), "year", 2016);
        setShortField(term292698, term292698.getClass(), "month", (short) 3);
        setShortField(term292698, term292698.getClass(), "day", (short) 3);
        setField(term292697, term292697.getClass(), "date", term292698);
        setByteField(term292702, term292702.getClass(), "hour", (byte) 16);
        setByteField(term292702, term292702.getClass(), "minute", (byte) 51);
        setByteField(term292702, term292702.getClass(), "second", (byte) 42);
        setIntField(term292702, term292702.getClass(), "nano", 212771956);
        setField(term292697, term292697.getClass(), "time", term292702);
        setField(term292671, term292671.getClass(), "accessTime", term292697);
        setField(term292669, term292669.getClass(), "card", term292671);
        setField(term292669, term292669.getClass(), "userName", "LoKsDbhNbo");
        setIntField(term292669, term292669.getClass(), "level", -1345415060);
        setIntField(term292669, term292669.getClass(), "reincarnationNum", -408639521);
        setLongField(term292669, term292669.getClass(), "exp", -4331776305355465270L);
        setLongField(term292669, term292669.getClass(), "point", 799090249501954059L);
        setLongField(term292669, term292669.getClass(), "totalPoint", -4683845136727836074L);
        setIntField(term292669, term292669.getClass(), "playCount", 1757333328);
        setIntField(term292669, term292669.getClass(), "jewelCount", 127436166);
        setIntField(term292669, term292669.getClass(), "totalJewelCount", 730050663);
        setIntField(term292669, term292669.getClass(), "medalCount", 534469982);
        setIntField(term292669, term292669.getClass(), "playerRating", -907905819);
        setIntField(term292669, term292669.getClass(), "highestRating", -1500119769);
        setIntField(term292669, term292669.getClass(), "battlePoint", -1417307655);
        setIntField(term292669, term292669.getClass(), "bestBattlePoint", 240874437);
        setIntField(term292669, term292669.getClass(), "overDamageBattlePoint", 370086289);
        setBooleanField(term292669, term292669.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term292669, term292669.getClass(), "nameplateId", 119174295);
        setIntField(term292669, term292669.getClass(), "trophyId", 1966165296);
        setIntField(term292669, term292669.getClass(), "cardId", 304905588);
        setIntField(term292669, term292669.getClass(), "characterId", 1232105225);
        setIntField(term292669, term292669.getClass(), "characterVoiceNo", 1494500438);
        setIntField(term292669, term292669.getClass(), "tabSetting", 258371010);
        setIntField(term292669, term292669.getClass(), "tabSortSetting", 1003310321);
        setIntField(term292669, term292669.getClass(), "cardCategorySetting", 93804935);
        setIntField(term292669, term292669.getClass(), "cardSortSetting", 353661913);
        setIntField(term292669, term292669.getClass(), "rivalScoreCategorySetting", 1326478677);
        setIntField(term292669, term292669.getClass(), "playedTutorialBit", -834401320);
        setIntField(term292669, term292669.getClass(), "firstTutorialCancelNum", -1159555670);
        setLongField(term292669, term292669.getClass(), "sumTechHighScore", 1860709479164305742L);
        setLongField(term292669, term292669.getClass(), "sumTechBasicHighScore", 3030889562438215598L);
        setLongField(term292669, term292669.getClass(), "sumTechAdvancedHighScore", -894972392759533093L);
        setLongField(term292669, term292669.getClass(), "sumTechExpertHighScore", 5817217258077665678L);
        setLongField(term292669, term292669.getClass(), "sumTechMasterHighScore", 76885810668932193L);
        setLongField(term292669, term292669.getClass(), "sumTechLunaticHighScore", 4704091389807727617L);
        setLongField(term292669, term292669.getClass(), "sumBattleHighScore", 4461061846609904980L);
        setLongField(term292669, term292669.getClass(), "sumBattleBasicHighScore", 1494353259700845534L);
        setLongField(term292669, term292669.getClass(), "sumBattleAdvancedHighScore", 857939224667998485L);
        setLongField(term292669, term292669.getClass(), "sumBattleExpertHighScore", -4559490383939671147L);
        setLongField(term292669, term292669.getClass(), "sumBattleMasterHighScore", 178313591629125712L);
        setLongField(term292669, term292669.getClass(), "sumBattleLunaticHighScore", -96453868597841877L);
        setField(term292669, term292669.getClass(), "eventWatchedDate", "GWRasXJpVB");
        setField(term292669, term292669.getClass(), "cmEventWatchedDate", "NxETFVBNah");
        setField(term292669, term292669.getClass(), "firstGameId", "djQXCEqeOZ");
        setField(term292669, term292669.getClass(), "firstRomVersion", "jQItbqdgru");
        setField(term292669, term292669.getClass(), "firstDataVersion", "eESpOcBzik");
        setField(term292669, term292669.getClass(), "firstPlayDate", "xTQmAOqrKo");
        setField(term292669, term292669.getClass(), "lastGameId", "pJPSrRkLki");
        setField(term292669, term292669.getClass(), "lastRomVersion", "CctsyEvwWN");
        setField(term292669, term292669.getClass(), "lastDataVersion", "DZhtgksRJV");
        setField(term292669, term292669.getClass(), "compatibleCmVersion", "kEOZgldknG");
        setField(term292669, term292669.getClass(), "lastPlayDate", "TgjFBWvVUx");
        setIntField(term292669, term292669.getClass(), "lastPlaceId", -1202869344);
        setField(term292669, term292669.getClass(), "lastPlaceName", "qyZMBaqUiw");
        setIntField(term292669, term292669.getClass(), "lastRegionId", -224281094);
        setField(term292669, term292669.getClass(), "lastRegionName", "LScHUVQpVE");
        setIntField(term292669, term292669.getClass(), "lastAllNetId", 665079055);
        setField(term292669, term292669.getClass(), "lastClientId", "FbQsgUOoDY");
        setIntField(term292669, term292669.getClass(), "lastUsedDeckId", -35694438);
        setIntField(term292669, term292669.getClass(), "lastPlayMusicLevel", -1010322296);
        setIntField(term292669, term292669.getClass(), "lastEmoneyBrand", -925486854);
        setField(term292667, term292667.getClass(), "user", term292669);
        setIntField(term292667, term292667.getClass(), "kind", 1067945533);
        setIntField(term292667, term292667.getClass(), "activityId", 1635163759);
        setIntField(term292667, term292667.getClass(), "sortNumber", -1183115171);
        setIntField(term292667, term292667.getClass(), "param1", -1473536555);
        setIntField(term292667, term292667.getClass(), "param2", -741876612);
        setIntField(term292667, term292667.getClass(), "param3", 472842962);
        setIntField(term292667, term292667.getClass(), "param4", -1859274829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term292667, args);
    }

};


