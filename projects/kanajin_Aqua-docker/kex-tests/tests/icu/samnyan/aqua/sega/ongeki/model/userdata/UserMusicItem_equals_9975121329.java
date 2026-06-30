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

public class UserMusicItem_equals_9975121329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4269;
     Object term4536;

    public UserMusicItem_equals_9975121329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4275 = new Long(-2813493605142626659L);
        term4269 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term4271 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term4273 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4289 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4290 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4294 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4304 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4269, term4269.getClass(), "id", -78240609295693193L);
        setLongField(term4271, term4271.getClass(), "id", 3090901538358721367L);
        setLongField(term4273, term4273.getClass(), "id", -1677189124507026637L);
        setField(term4273, term4273.getClass(), "extId", term4275);
        setField(term4273, term4273.getClass(), "luid", "VeDtgDzGAN");
        setIntField(term4290, term4290.getClass(), "year", 2014);
        setShortField(term4290, term4290.getClass(), "month", (short) 7);
        setShortField(term4290, term4290.getClass(), "day", (short) 13);
        setField(term4289, term4289.getClass(), "date", term4290);
        setByteField(term4294, term4294.getClass(), "hour", (byte) 21);
        setByteField(term4294, term4294.getClass(), "minute", (byte) 46);
        setByteField(term4294, term4294.getClass(), "second", (byte) 0);
        setIntField(term4294, term4294.getClass(), "nano", 887884128);
        setField(term4289, term4289.getClass(), "time", term4294);
        setField(term4273, term4273.getClass(), "registerTime", term4289);
        setIntField(term4300, term4300.getClass(), "year", 2023);
        setShortField(term4300, term4300.getClass(), "month", (short) 3);
        setShortField(term4300, term4300.getClass(), "day", (short) 7);
        setField(term4299, term4299.getClass(), "date", term4300);
        setByteField(term4304, term4304.getClass(), "hour", (byte) 21);
        setByteField(term4304, term4304.getClass(), "minute", (byte) 15);
        setByteField(term4304, term4304.getClass(), "second", (byte) 43);
        setIntField(term4304, term4304.getClass(), "nano", 639721472);
        setField(term4299, term4299.getClass(), "time", term4304);
        setField(term4273, term4273.getClass(), "accessTime", term4299);
        setField(term4271, term4271.getClass(), "card", term4273);
        setField(term4271, term4271.getClass(), "userName", "aWYOWZFyaX");
        setIntField(term4271, term4271.getClass(), "level", -2003192918);
        setIntField(term4271, term4271.getClass(), "reincarnationNum", -1362856620);
        setLongField(term4271, term4271.getClass(), "exp", 4795660804170399986L);
        setLongField(term4271, term4271.getClass(), "point", -4030863184426321096L);
        setLongField(term4271, term4271.getClass(), "totalPoint", -8010214112439224349L);
        setIntField(term4271, term4271.getClass(), "playCount", -1835839814);
        setIntField(term4271, term4271.getClass(), "jewelCount", -1404350380);
        setIntField(term4271, term4271.getClass(), "totalJewelCount", -2013924238);
        setIntField(term4271, term4271.getClass(), "medalCount", 579006268);
        setIntField(term4271, term4271.getClass(), "playerRating", -1694747156);
        setIntField(term4271, term4271.getClass(), "highestRating", 1466373988);
        setIntField(term4271, term4271.getClass(), "battlePoint", -358526505);
        setIntField(term4271, term4271.getClass(), "bestBattlePoint", 1843268026);
        setIntField(term4271, term4271.getClass(), "overDamageBattlePoint", 954660603);
        setBooleanField(term4271, term4271.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term4271, term4271.getClass(), "nameplateId", -1351605385);
        setIntField(term4271, term4271.getClass(), "trophyId", 278355793);
        setIntField(term4271, term4271.getClass(), "cardId", -310648604);
        setIntField(term4271, term4271.getClass(), "characterId", -648200466);
        setIntField(term4271, term4271.getClass(), "characterVoiceNo", 2007134147);
        setIntField(term4271, term4271.getClass(), "tabSetting", 993388358);
        setIntField(term4271, term4271.getClass(), "tabSortSetting", -765191335);
        setIntField(term4271, term4271.getClass(), "cardCategorySetting", -1697741155);
        setIntField(term4271, term4271.getClass(), "cardSortSetting", 1295839803);
        setIntField(term4271, term4271.getClass(), "rivalScoreCategorySetting", -1891015523);
        setIntField(term4271, term4271.getClass(), "playedTutorialBit", -1560631747);
        setIntField(term4271, term4271.getClass(), "firstTutorialCancelNum", 1215150180);
        setLongField(term4271, term4271.getClass(), "sumTechHighScore", -6673920710396545553L);
        setLongField(term4271, term4271.getClass(), "sumTechBasicHighScore", 3412644969878030772L);
        setLongField(term4271, term4271.getClass(), "sumTechAdvancedHighScore", 6698455537431331246L);
        setLongField(term4271, term4271.getClass(), "sumTechExpertHighScore", -8327432141027603933L);
        setLongField(term4271, term4271.getClass(), "sumTechMasterHighScore", -433040798405298080L);
        setLongField(term4271, term4271.getClass(), "sumTechLunaticHighScore", -1505191021111100819L);
        setLongField(term4271, term4271.getClass(), "sumBattleHighScore", -1000830646340880796L);
        setLongField(term4271, term4271.getClass(), "sumBattleBasicHighScore", 5973526439563541711L);
        setLongField(term4271, term4271.getClass(), "sumBattleAdvancedHighScore", 5246058710498845622L);
        setLongField(term4271, term4271.getClass(), "sumBattleExpertHighScore", 4394651392080968777L);
        setLongField(term4271, term4271.getClass(), "sumBattleMasterHighScore", -7310273014364148916L);
        setLongField(term4271, term4271.getClass(), "sumBattleLunaticHighScore", 8863790908271299748L);
        setField(term4271, term4271.getClass(), "eventWatchedDate", "BRIVNtfUWU");
        setField(term4271, term4271.getClass(), "cmEventWatchedDate", "DbiCVtPPCT");
        setField(term4271, term4271.getClass(), "firstGameId", "WzFopsaDuG");
        setField(term4271, term4271.getClass(), "firstRomVersion", "PapWxkhEWe");
        setField(term4271, term4271.getClass(), "firstDataVersion", "smnHEqRFRx");
        setField(term4271, term4271.getClass(), "firstPlayDate", "XYtryyobou");
        setField(term4271, term4271.getClass(), "lastGameId", "OYbzXylRWW");
        setField(term4271, term4271.getClass(), "lastRomVersion", "DSNsTGYXDF");
        setField(term4271, term4271.getClass(), "lastDataVersion", "sQvGcVjdEx");
        setField(term4271, term4271.getClass(), "compatibleCmVersion", "rLHAoqXgPh");
        setField(term4271, term4271.getClass(), "lastPlayDate", "zUlRdimJtU");
        setIntField(term4271, term4271.getClass(), "lastPlaceId", -1422859977);
        setField(term4271, term4271.getClass(), "lastPlaceName", "vwbEQQNQrx");
        setIntField(term4271, term4271.getClass(), "lastRegionId", -1972436591);
        setField(term4271, term4271.getClass(), "lastRegionName", "xtftXXMbem");
        setIntField(term4271, term4271.getClass(), "lastAllNetId", 68922753);
        setField(term4271, term4271.getClass(), "lastClientId", "cudZvLMQon");
        setIntField(term4271, term4271.getClass(), "lastUsedDeckId", -220791533);
        setIntField(term4271, term4271.getClass(), "lastPlayMusicLevel", 1741500243);
        setIntField(term4271, term4271.getClass(), "lastEmoneyBrand", -2070466617);
        setField(term4269, term4269.getClass(), "user", term4271);
        setIntField(term4269, term4269.getClass(), "musicId", -1127721881);
        setIntField(term4269, term4269.getClass(), "status", 1074848808);
        term4536 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4536;
        callMethod(klass, "equals", argTypes, term4269, args);
    }

};


