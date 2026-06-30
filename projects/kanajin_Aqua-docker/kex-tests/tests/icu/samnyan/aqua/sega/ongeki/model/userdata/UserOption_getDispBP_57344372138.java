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

public class UserOption_getDispBP_57344372138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326007;

    public UserOption_getDispBP_57344372138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326013 = new Long(-8792567429538693571L);
        term326007 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term326009 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term326011 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term326027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326042 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326007, term326007.getClass(), "id", 199916388447497099L);
        setLongField(term326009, term326009.getClass(), "id", -4827900550600043292L);
        setLongField(term326011, term326011.getClass(), "id", 2171806599031200561L);
        setField(term326011, term326011.getClass(), "extId", term326013);
        setField(term326011, term326011.getClass(), "luid", "InjyQBInsS");
        setIntField(term326028, term326028.getClass(), "year", 2011);
        setShortField(term326028, term326028.getClass(), "month", (short) 12);
        setShortField(term326028, term326028.getClass(), "day", (short) 20);
        setField(term326027, term326027.getClass(), "date", term326028);
        setByteField(term326032, term326032.getClass(), "hour", (byte) 19);
        setByteField(term326032, term326032.getClass(), "minute", (byte) 23);
        setByteField(term326032, term326032.getClass(), "second", (byte) 21);
        setIntField(term326032, term326032.getClass(), "nano", 283781067);
        setField(term326027, term326027.getClass(), "time", term326032);
        setField(term326011, term326011.getClass(), "registerTime", term326027);
        setIntField(term326038, term326038.getClass(), "year", 2026);
        setShortField(term326038, term326038.getClass(), "month", (short) 2);
        setShortField(term326038, term326038.getClass(), "day", (short) 15);
        setField(term326037, term326037.getClass(), "date", term326038);
        setByteField(term326042, term326042.getClass(), "hour", (byte) 8);
        setByteField(term326042, term326042.getClass(), "minute", (byte) 30);
        setByteField(term326042, term326042.getClass(), "second", (byte) 47);
        setIntField(term326042, term326042.getClass(), "nano", 206898289);
        setField(term326037, term326037.getClass(), "time", term326042);
        setField(term326011, term326011.getClass(), "accessTime", term326037);
        setField(term326009, term326009.getClass(), "card", term326011);
        setField(term326009, term326009.getClass(), "userName", "KcyZuvegQG");
        setIntField(term326009, term326009.getClass(), "level", -1412602608);
        setIntField(term326009, term326009.getClass(), "reincarnationNum", 1807348810);
        setLongField(term326009, term326009.getClass(), "exp", -5472831339846305368L);
        setLongField(term326009, term326009.getClass(), "point", 7812018661498325777L);
        setLongField(term326009, term326009.getClass(), "totalPoint", 750945838105921904L);
        setIntField(term326009, term326009.getClass(), "playCount", -1694174538);
        setIntField(term326009, term326009.getClass(), "jewelCount", 1878283114);
        setIntField(term326009, term326009.getClass(), "totalJewelCount", 157478469);
        setIntField(term326009, term326009.getClass(), "medalCount", 1895936214);
        setIntField(term326009, term326009.getClass(), "playerRating", -269407784);
        setIntField(term326009, term326009.getClass(), "highestRating", -291747510);
        setIntField(term326009, term326009.getClass(), "battlePoint", 1615694883);
        setIntField(term326009, term326009.getClass(), "bestBattlePoint", -2109845436);
        setIntField(term326009, term326009.getClass(), "overDamageBattlePoint", 1378872325);
        setBooleanField(term326009, term326009.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term326009, term326009.getClass(), "nameplateId", 1725642232);
        setIntField(term326009, term326009.getClass(), "trophyId", 1060164792);
        setIntField(term326009, term326009.getClass(), "cardId", -1175124443);
        setIntField(term326009, term326009.getClass(), "characterId", 2133185637);
        setIntField(term326009, term326009.getClass(), "characterVoiceNo", 1104179684);
        setIntField(term326009, term326009.getClass(), "tabSetting", 1662746660);
        setIntField(term326009, term326009.getClass(), "tabSortSetting", -733280541);
        setIntField(term326009, term326009.getClass(), "cardCategorySetting", 1425351604);
        setIntField(term326009, term326009.getClass(), "cardSortSetting", -782491470);
        setIntField(term326009, term326009.getClass(), "rivalScoreCategorySetting", -7016340);
        setIntField(term326009, term326009.getClass(), "playedTutorialBit", 339793157);
        setIntField(term326009, term326009.getClass(), "firstTutorialCancelNum", -422003147);
        setLongField(term326009, term326009.getClass(), "sumTechHighScore", 268292160133324716L);
        setLongField(term326009, term326009.getClass(), "sumTechBasicHighScore", 6511012840693257298L);
        setLongField(term326009, term326009.getClass(), "sumTechAdvancedHighScore", 5537924405712899301L);
        setLongField(term326009, term326009.getClass(), "sumTechExpertHighScore", 2137378255928556381L);
        setLongField(term326009, term326009.getClass(), "sumTechMasterHighScore", -5599771349173632062L);
        setLongField(term326009, term326009.getClass(), "sumTechLunaticHighScore", -3648556939142406654L);
        setLongField(term326009, term326009.getClass(), "sumBattleHighScore", -7920555986037475212L);
        setLongField(term326009, term326009.getClass(), "sumBattleBasicHighScore", 5165867439975266735L);
        setLongField(term326009, term326009.getClass(), "sumBattleAdvancedHighScore", 1056293374921704596L);
        setLongField(term326009, term326009.getClass(), "sumBattleExpertHighScore", -4129320121400090692L);
        setLongField(term326009, term326009.getClass(), "sumBattleMasterHighScore", -1763854963433313873L);
        setLongField(term326009, term326009.getClass(), "sumBattleLunaticHighScore", -7335310166619806326L);
        setField(term326009, term326009.getClass(), "eventWatchedDate", "CLXWbgJyoh");
        setField(term326009, term326009.getClass(), "cmEventWatchedDate", "dHgFysUAyz");
        setField(term326009, term326009.getClass(), "firstGameId", "aZofURUNAa");
        setField(term326009, term326009.getClass(), "firstRomVersion", "KaaMTLikwQ");
        setField(term326009, term326009.getClass(), "firstDataVersion", "lnnzGpcUYv");
        setField(term326009, term326009.getClass(), "firstPlayDate", "cuLYqdUbcL");
        setField(term326009, term326009.getClass(), "lastGameId", "zaFTQCZBqf");
        setField(term326009, term326009.getClass(), "lastRomVersion", "hzhpVIiVcm");
        setField(term326009, term326009.getClass(), "lastDataVersion", "xBEICPrayB");
        setField(term326009, term326009.getClass(), "compatibleCmVersion", "JedqkPlmuP");
        setField(term326009, term326009.getClass(), "lastPlayDate", "PDPQtkPUcj");
        setIntField(term326009, term326009.getClass(), "lastPlaceId", 1878428188);
        setField(term326009, term326009.getClass(), "lastPlaceName", "WjvrIsdCnX");
        setIntField(term326009, term326009.getClass(), "lastRegionId", 1901781646);
        setField(term326009, term326009.getClass(), "lastRegionName", "hXtnMUXphj");
        setIntField(term326009, term326009.getClass(), "lastAllNetId", 1644076721);
        setField(term326009, term326009.getClass(), "lastClientId", "yvZqmxMOJp");
        setIntField(term326009, term326009.getClass(), "lastUsedDeckId", -1386441498);
        setIntField(term326009, term326009.getClass(), "lastPlayMusicLevel", -886465257);
        setIntField(term326009, term326009.getClass(), "lastEmoneyBrand", 1025547476);
        setField(term326007, term326007.getClass(), "user", term326009);
        setIntField(term326007, term326007.getClass(), "optionSet", 323645298);
        setIntField(term326007, term326007.getClass(), "speed", -367596044);
        setIntField(term326007, term326007.getClass(), "mirror", 863830324);
        setIntField(term326007, term326007.getClass(), "judgeTiming", -287166867);
        setIntField(term326007, term326007.getClass(), "judgeAdjustment", -1047971269);
        setIntField(term326007, term326007.getClass(), "abort", 1758019697);
        setIntField(term326007, term326007.getClass(), "stealthField", -20489655);
        setIntField(term326007, term326007.getClass(), "tapSound", -1938582471);
        setIntField(term326007, term326007.getClass(), "volGuide", 2000158636);
        setIntField(term326007, term326007.getClass(), "volAll", -217671869);
        setIntField(term326007, term326007.getClass(), "volTap", 333292112);
        setIntField(term326007, term326007.getClass(), "volCrTap", 807196387);
        setIntField(term326007, term326007.getClass(), "volHold", -639986541);
        setIntField(term326007, term326007.getClass(), "volSide", 719892319);
        setIntField(term326007, term326007.getClass(), "volFlick", -1295794802);
        setIntField(term326007, term326007.getClass(), "volBell", -1282312652);
        setIntField(term326007, term326007.getClass(), "volEnemy", 154258613);
        setIntField(term326007, term326007.getClass(), "volSkill", -1539553993);
        setIntField(term326007, term326007.getClass(), "volDamage", -116413193);
        setIntField(term326007, term326007.getClass(), "colorField", 1503835558);
        setIntField(term326007, term326007.getClass(), "colorLaneBright", 23268813);
        setIntField(term326007, term326007.getClass(), "colorWallBright", 1025525105);
        setIntField(term326007, term326007.getClass(), "colorLane", -1587346736);
        setIntField(term326007, term326007.getClass(), "colorSide", 854695480);
        setIntField(term326007, term326007.getClass(), "effectDamage", -271085868);
        setIntField(term326007, term326007.getClass(), "effectPos", 513463512);
        setIntField(term326007, term326007.getClass(), "judgeDisp", 351567254);
        setIntField(term326007, term326007.getClass(), "judgePos", -1193358976);
        setIntField(term326007, term326007.getClass(), "judgeBreak", 708429698);
        setIntField(term326007, term326007.getClass(), "judgeHit", -563977321);
        setIntField(term326007, term326007.getClass(), "platinumBreakDisp", 1096674590);
        setIntField(term326007, term326007.getClass(), "judgeCriticalBreak", 1195592198);
        setIntField(term326007, term326007.getClass(), "matching", 677106708);
        setIntField(term326007, term326007.getClass(), "dispPlayerLv", -733462620);
        setIntField(term326007, term326007.getClass(), "dispRating", 1367393789);
        setIntField(term326007, term326007.getClass(), "dispBP", -899726130);
        setIntField(term326007, term326007.getClass(), "headphone", -583413424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispBP", argTypes, term326007, args);
    }

};


