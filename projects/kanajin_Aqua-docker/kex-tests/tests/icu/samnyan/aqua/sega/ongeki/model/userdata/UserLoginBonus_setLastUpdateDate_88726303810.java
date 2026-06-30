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

public class UserLoginBonus_setLastUpdateDate_88726303810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305702;

    public UserLoginBonus_setLastUpdateDate_88726303810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term305708 = new Long(8699742215739444902L);
        term305702 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term305704 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term305706 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term305722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term305732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term305733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305737 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term305702, term305702.getClass(), "id", 7103201952072820145L);
        setLongField(term305704, term305704.getClass(), "id", -4888225559114707996L);
        setLongField(term305706, term305706.getClass(), "id", -4554126540714250463L);
        setField(term305706, term305706.getClass(), "extId", term305708);
        setField(term305706, term305706.getClass(), "luid", "fwFmEEZWcB");
        setIntField(term305723, term305723.getClass(), "year", 2028);
        setShortField(term305723, term305723.getClass(), "month", (short) 1);
        setShortField(term305723, term305723.getClass(), "day", (short) 6);
        setField(term305722, term305722.getClass(), "date", term305723);
        setByteField(term305727, term305727.getClass(), "hour", (byte) 1);
        setByteField(term305727, term305727.getClass(), "minute", (byte) 50);
        setByteField(term305727, term305727.getClass(), "second", (byte) 47);
        setIntField(term305727, term305727.getClass(), "nano", 279955882);
        setField(term305722, term305722.getClass(), "time", term305727);
        setField(term305706, term305706.getClass(), "registerTime", term305722);
        setIntField(term305733, term305733.getClass(), "year", 2014);
        setShortField(term305733, term305733.getClass(), "month", (short) 6);
        setShortField(term305733, term305733.getClass(), "day", (short) 17);
        setField(term305732, term305732.getClass(), "date", term305733);
        setByteField(term305737, term305737.getClass(), "hour", (byte) 2);
        setByteField(term305737, term305737.getClass(), "minute", (byte) 21);
        setByteField(term305737, term305737.getClass(), "second", (byte) 23);
        setIntField(term305737, term305737.getClass(), "nano", 330795404);
        setField(term305732, term305732.getClass(), "time", term305737);
        setField(term305706, term305706.getClass(), "accessTime", term305732);
        setField(term305704, term305704.getClass(), "card", term305706);
        setField(term305704, term305704.getClass(), "userName", "AICUpHDOzG");
        setIntField(term305704, term305704.getClass(), "level", -931635900);
        setIntField(term305704, term305704.getClass(), "reincarnationNum", 1716832300);
        setLongField(term305704, term305704.getClass(), "exp", -562045854611448271L);
        setLongField(term305704, term305704.getClass(), "point", -724367372585075401L);
        setLongField(term305704, term305704.getClass(), "totalPoint", -7938840393994275552L);
        setIntField(term305704, term305704.getClass(), "playCount", 928949891);
        setIntField(term305704, term305704.getClass(), "jewelCount", 1803982857);
        setIntField(term305704, term305704.getClass(), "totalJewelCount", 1375084537);
        setIntField(term305704, term305704.getClass(), "medalCount", 1145555332);
        setIntField(term305704, term305704.getClass(), "playerRating", -1502279844);
        setIntField(term305704, term305704.getClass(), "highestRating", -323144971);
        setIntField(term305704, term305704.getClass(), "battlePoint", 1354120150);
        setIntField(term305704, term305704.getClass(), "bestBattlePoint", -612634238);
        setIntField(term305704, term305704.getClass(), "overDamageBattlePoint", -1471750499);
        setBooleanField(term305704, term305704.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term305704, term305704.getClass(), "nameplateId", 624532733);
        setIntField(term305704, term305704.getClass(), "trophyId", 1295979256);
        setIntField(term305704, term305704.getClass(), "cardId", 1969513702);
        setIntField(term305704, term305704.getClass(), "characterId", 1141181858);
        setIntField(term305704, term305704.getClass(), "characterVoiceNo", 936701005);
        setIntField(term305704, term305704.getClass(), "tabSetting", -1415304789);
        setIntField(term305704, term305704.getClass(), "tabSortSetting", -2124127326);
        setIntField(term305704, term305704.getClass(), "cardCategorySetting", 1735477568);
        setIntField(term305704, term305704.getClass(), "cardSortSetting", 191580865);
        setIntField(term305704, term305704.getClass(), "rivalScoreCategorySetting", -474320117);
        setIntField(term305704, term305704.getClass(), "playedTutorialBit", 1595884206);
        setIntField(term305704, term305704.getClass(), "firstTutorialCancelNum", 214954245);
        setLongField(term305704, term305704.getClass(), "sumTechHighScore", 1823547512329020776L);
        setLongField(term305704, term305704.getClass(), "sumTechBasicHighScore", -2500297298059388487L);
        setLongField(term305704, term305704.getClass(), "sumTechAdvancedHighScore", 490487854949803759L);
        setLongField(term305704, term305704.getClass(), "sumTechExpertHighScore", 602642381540532088L);
        setLongField(term305704, term305704.getClass(), "sumTechMasterHighScore", 7105982476263822648L);
        setLongField(term305704, term305704.getClass(), "sumTechLunaticHighScore", 1973725502882852690L);
        setLongField(term305704, term305704.getClass(), "sumBattleHighScore", 8686113513634153602L);
        setLongField(term305704, term305704.getClass(), "sumBattleBasicHighScore", 9145063653488869109L);
        setLongField(term305704, term305704.getClass(), "sumBattleAdvancedHighScore", -2873301331293217601L);
        setLongField(term305704, term305704.getClass(), "sumBattleExpertHighScore", 5534352094957975636L);
        setLongField(term305704, term305704.getClass(), "sumBattleMasterHighScore", -3715179693646268738L);
        setLongField(term305704, term305704.getClass(), "sumBattleLunaticHighScore", -8408977084782865054L);
        setField(term305704, term305704.getClass(), "eventWatchedDate", "DmkTfwDLZj");
        setField(term305704, term305704.getClass(), "cmEventWatchedDate", "bHRIWgbDGz");
        setField(term305704, term305704.getClass(), "firstGameId", "twivmCinJk");
        setField(term305704, term305704.getClass(), "firstRomVersion", "eJyhQVneUo");
        setField(term305704, term305704.getClass(), "firstDataVersion", "oPFkgizJGX");
        setField(term305704, term305704.getClass(), "firstPlayDate", "ZyJFJOIYqn");
        setField(term305704, term305704.getClass(), "lastGameId", "KuaRCYIXDE");
        setField(term305704, term305704.getClass(), "lastRomVersion", "FidXoPwlYA");
        setField(term305704, term305704.getClass(), "lastDataVersion", "ZOXdaxYVyA");
        setField(term305704, term305704.getClass(), "compatibleCmVersion", "hfzTDZlagT");
        setField(term305704, term305704.getClass(), "lastPlayDate", "QiQadgoFeJ");
        setIntField(term305704, term305704.getClass(), "lastPlaceId", 619427296);
        setField(term305704, term305704.getClass(), "lastPlaceName", "MiQeaqHnsr");
        setIntField(term305704, term305704.getClass(), "lastRegionId", 221397997);
        setField(term305704, term305704.getClass(), "lastRegionName", "VPvnDPrxpV");
        setIntField(term305704, term305704.getClass(), "lastAllNetId", -135418088);
        setField(term305704, term305704.getClass(), "lastClientId", "snxtaDACxI");
        setIntField(term305704, term305704.getClass(), "lastUsedDeckId", 445224644);
        setIntField(term305704, term305704.getClass(), "lastPlayMusicLevel", 1687112200);
        setIntField(term305704, term305704.getClass(), "lastEmoneyBrand", -1985802241);
        setField(term305702, term305702.getClass(), "user", term305704);
        setIntField(term305702, term305702.getClass(), "bonusId", 1190891102);
        setIntField(term305702, term305702.getClass(), "bonusCount", -723584432);
        setField(term305702, term305702.getClass(), "lastUpdateDate", "duHWXIEHJg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZIBJhPTjUC";
        callMethod(klass, "setLastUpdateDate", argTypes, term305702, args);
    }

};


