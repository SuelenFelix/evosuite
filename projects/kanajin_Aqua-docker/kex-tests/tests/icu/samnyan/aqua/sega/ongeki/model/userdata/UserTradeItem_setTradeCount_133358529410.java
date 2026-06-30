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

public class UserTradeItem_setTradeCount_133358529410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154973;
     Object term155241;

    public UserTradeItem_setTradeCount_133358529410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154979 = new Long(4341016500855678917L);
        term154973 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term154975 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term154977 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term154993 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154998 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155008 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term154973, term154973.getClass(), "id", 5301845140827278235L);
        setLongField(term154975, term154975.getClass(), "id", -2293526197698880438L);
        setLongField(term154977, term154977.getClass(), "id", -7542520442432811164L);
        setField(term154977, term154977.getClass(), "extId", term154979);
        setField(term154977, term154977.getClass(), "luid", "XaqYbQZIGI");
        setIntField(term154994, term154994.getClass(), "year", 2021);
        setShortField(term154994, term154994.getClass(), "month", (short) 10);
        setShortField(term154994, term154994.getClass(), "day", (short) 12);
        setField(term154993, term154993.getClass(), "date", term154994);
        setByteField(term154998, term154998.getClass(), "hour", (byte) 10);
        setByteField(term154998, term154998.getClass(), "minute", (byte) 35);
        setByteField(term154998, term154998.getClass(), "second", (byte) 54);
        setIntField(term154998, term154998.getClass(), "nano", 943613873);
        setField(term154993, term154993.getClass(), "time", term154998);
        setField(term154977, term154977.getClass(), "registerTime", term154993);
        setIntField(term155004, term155004.getClass(), "year", 2014);
        setShortField(term155004, term155004.getClass(), "month", (short) 12);
        setShortField(term155004, term155004.getClass(), "day", (short) 24);
        setField(term155003, term155003.getClass(), "date", term155004);
        setByteField(term155008, term155008.getClass(), "hour", (byte) 14);
        setByteField(term155008, term155008.getClass(), "minute", (byte) 18);
        setByteField(term155008, term155008.getClass(), "second", (byte) 26);
        setIntField(term155008, term155008.getClass(), "nano", 945081214);
        setField(term155003, term155003.getClass(), "time", term155008);
        setField(term154977, term154977.getClass(), "accessTime", term155003);
        setField(term154975, term154975.getClass(), "card", term154977);
        setField(term154975, term154975.getClass(), "userName", "grTooFWhNl");
        setIntField(term154975, term154975.getClass(), "level", 1446394868);
        setIntField(term154975, term154975.getClass(), "reincarnationNum", -385831603);
        setLongField(term154975, term154975.getClass(), "exp", 786188601032302867L);
        setLongField(term154975, term154975.getClass(), "point", -6815616200339425410L);
        setLongField(term154975, term154975.getClass(), "totalPoint", -8594295939316003249L);
        setIntField(term154975, term154975.getClass(), "playCount", -1896400624);
        setIntField(term154975, term154975.getClass(), "jewelCount", -186142402);
        setIntField(term154975, term154975.getClass(), "totalJewelCount", -87117118);
        setIntField(term154975, term154975.getClass(), "medalCount", 240936347);
        setIntField(term154975, term154975.getClass(), "playerRating", -1531057884);
        setIntField(term154975, term154975.getClass(), "highestRating", -942173626);
        setIntField(term154975, term154975.getClass(), "battlePoint", 209865960);
        setIntField(term154975, term154975.getClass(), "bestBattlePoint", -1616150864);
        setIntField(term154975, term154975.getClass(), "overDamageBattlePoint", -1945453513);
        setBooleanField(term154975, term154975.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term154975, term154975.getClass(), "nameplateId", -1022307429);
        setIntField(term154975, term154975.getClass(), "trophyId", 1058681211);
        setIntField(term154975, term154975.getClass(), "cardId", -1476609706);
        setIntField(term154975, term154975.getClass(), "characterId", -807331064);
        setIntField(term154975, term154975.getClass(), "characterVoiceNo", 4051182);
        setIntField(term154975, term154975.getClass(), "tabSetting", -868532730);
        setIntField(term154975, term154975.getClass(), "tabSortSetting", -90828570);
        setIntField(term154975, term154975.getClass(), "cardCategorySetting", -340081641);
        setIntField(term154975, term154975.getClass(), "cardSortSetting", -1412324757);
        setIntField(term154975, term154975.getClass(), "rivalScoreCategorySetting", 140849786);
        setIntField(term154975, term154975.getClass(), "playedTutorialBit", 34056751);
        setIntField(term154975, term154975.getClass(), "firstTutorialCancelNum", 1802001091);
        setLongField(term154975, term154975.getClass(), "sumTechHighScore", 7554651752347702837L);
        setLongField(term154975, term154975.getClass(), "sumTechBasicHighScore", 4606173792606034286L);
        setLongField(term154975, term154975.getClass(), "sumTechAdvancedHighScore", -6040050173440547733L);
        setLongField(term154975, term154975.getClass(), "sumTechExpertHighScore", -6854077062848517634L);
        setLongField(term154975, term154975.getClass(), "sumTechMasterHighScore", 6000592757438147771L);
        setLongField(term154975, term154975.getClass(), "sumTechLunaticHighScore", 349646802409059185L);
        setLongField(term154975, term154975.getClass(), "sumBattleHighScore", 7073772449355072737L);
        setLongField(term154975, term154975.getClass(), "sumBattleBasicHighScore", -284959417941334238L);
        setLongField(term154975, term154975.getClass(), "sumBattleAdvancedHighScore", -2642626234707592872L);
        setLongField(term154975, term154975.getClass(), "sumBattleExpertHighScore", -7405060556842728806L);
        setLongField(term154975, term154975.getClass(), "sumBattleMasterHighScore", -4527791479018516668L);
        setLongField(term154975, term154975.getClass(), "sumBattleLunaticHighScore", -2612967577904398834L);
        setField(term154975, term154975.getClass(), "eventWatchedDate", "ndJgNFVDzv");
        setField(term154975, term154975.getClass(), "cmEventWatchedDate", "GLSpCLEiGN");
        setField(term154975, term154975.getClass(), "firstGameId", "JiekpKxKqu");
        setField(term154975, term154975.getClass(), "firstRomVersion", "fZAngeuZqR");
        setField(term154975, term154975.getClass(), "firstDataVersion", "zlkNfxvlVJ");
        setField(term154975, term154975.getClass(), "firstPlayDate", "RWefwvwipX");
        setField(term154975, term154975.getClass(), "lastGameId", "FXnVCgcJAm");
        setField(term154975, term154975.getClass(), "lastRomVersion", "noOpWudfzV");
        setField(term154975, term154975.getClass(), "lastDataVersion", "OWORKBHHIN");
        setField(term154975, term154975.getClass(), "compatibleCmVersion", "sbvPxiaOoC");
        setField(term154975, term154975.getClass(), "lastPlayDate", "rrCIslqAVq");
        setIntField(term154975, term154975.getClass(), "lastPlaceId", -1767833537);
        setField(term154975, term154975.getClass(), "lastPlaceName", "DneBWnIeDx");
        setIntField(term154975, term154975.getClass(), "lastRegionId", -215734173);
        setField(term154975, term154975.getClass(), "lastRegionName", "pDqUZCoDIX");
        setIntField(term154975, term154975.getClass(), "lastAllNetId", -1841017701);
        setField(term154975, term154975.getClass(), "lastClientId", "ErlJXmBNko");
        setIntField(term154975, term154975.getClass(), "lastUsedDeckId", 1099125651);
        setIntField(term154975, term154975.getClass(), "lastPlayMusicLevel", 338123354);
        setIntField(term154975, term154975.getClass(), "lastEmoneyBrand", -830092964);
        setField(term154973, term154973.getClass(), "user", term154975);
        setIntField(term154973, term154973.getClass(), "chapterId", 2137377172);
        setIntField(term154973, term154973.getClass(), "tradeItemId", 1981927891);
        setIntField(term154973, term154973.getClass(), "tradeCount", -1835063179);
        term155241 = new Integer(-184092475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term155241;
        callMethod(klass, "setTradeCount", argTypes, term154973, args);
    }

};


