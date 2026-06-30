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

public class UserCard_isAcquired_67587734416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119683;

    public UserCard_isAcquired_67587734416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119689 = new Long(918397384129253729L);
        term119683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term119685 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term119687 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term119703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119708 = newInstance(Class.forName("java.time.LocalTime"));
        Object term119713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term119714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term119718 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term119683, term119683.getClass(), "id", -6102220116948409664L);
        setLongField(term119685, term119685.getClass(), "id", 6465003282975504465L);
        setLongField(term119687, term119687.getClass(), "id", -5180197912905445262L);
        setField(term119687, term119687.getClass(), "extId", term119689);
        setField(term119687, term119687.getClass(), "luid", "rcSNzDRILu");
        setIntField(term119704, term119704.getClass(), "year", 2013);
        setShortField(term119704, term119704.getClass(), "month", (short) 11);
        setShortField(term119704, term119704.getClass(), "day", (short) 15);
        setField(term119703, term119703.getClass(), "date", term119704);
        setByteField(term119708, term119708.getClass(), "hour", (byte) 16);
        setByteField(term119708, term119708.getClass(), "minute", (byte) 0);
        setByteField(term119708, term119708.getClass(), "second", (byte) 59);
        setIntField(term119708, term119708.getClass(), "nano", 823311700);
        setField(term119703, term119703.getClass(), "time", term119708);
        setField(term119687, term119687.getClass(), "registerTime", term119703);
        setIntField(term119714, term119714.getClass(), "year", 2017);
        setShortField(term119714, term119714.getClass(), "month", (short) 11);
        setShortField(term119714, term119714.getClass(), "day", (short) 30);
        setField(term119713, term119713.getClass(), "date", term119714);
        setByteField(term119718, term119718.getClass(), "hour", (byte) 23);
        setByteField(term119718, term119718.getClass(), "minute", (byte) 28);
        setByteField(term119718, term119718.getClass(), "second", (byte) 34);
        setIntField(term119718, term119718.getClass(), "nano", 684347789);
        setField(term119713, term119713.getClass(), "time", term119718);
        setField(term119687, term119687.getClass(), "accessTime", term119713);
        setField(term119685, term119685.getClass(), "card", term119687);
        setField(term119685, term119685.getClass(), "userName", "VAFzJeEFAQ");
        setIntField(term119685, term119685.getClass(), "level", 1262903454);
        setIntField(term119685, term119685.getClass(), "reincarnationNum", 1854068400);
        setLongField(term119685, term119685.getClass(), "exp", -8600540675658281925L);
        setLongField(term119685, term119685.getClass(), "point", -8807920657748272707L);
        setLongField(term119685, term119685.getClass(), "totalPoint", -5145493255578520084L);
        setIntField(term119685, term119685.getClass(), "playCount", -2058269574);
        setIntField(term119685, term119685.getClass(), "jewelCount", 1108197466);
        setIntField(term119685, term119685.getClass(), "totalJewelCount", -2027597725);
        setIntField(term119685, term119685.getClass(), "medalCount", -1205843165);
        setIntField(term119685, term119685.getClass(), "playerRating", -163945873);
        setIntField(term119685, term119685.getClass(), "highestRating", 23998582);
        setIntField(term119685, term119685.getClass(), "battlePoint", 1341914996);
        setIntField(term119685, term119685.getClass(), "bestBattlePoint", 1542038802);
        setIntField(term119685, term119685.getClass(), "overDamageBattlePoint", -1984766098);
        setBooleanField(term119685, term119685.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term119685, term119685.getClass(), "nameplateId", 1561867809);
        setIntField(term119685, term119685.getClass(), "trophyId", -1510472330);
        setIntField(term119685, term119685.getClass(), "cardId", -601862318);
        setIntField(term119685, term119685.getClass(), "characterId", -705569141);
        setIntField(term119685, term119685.getClass(), "characterVoiceNo", 1284403118);
        setIntField(term119685, term119685.getClass(), "tabSetting", 686147513);
        setIntField(term119685, term119685.getClass(), "tabSortSetting", 2007232253);
        setIntField(term119685, term119685.getClass(), "cardCategorySetting", 257006440);
        setIntField(term119685, term119685.getClass(), "cardSortSetting", 689441775);
        setIntField(term119685, term119685.getClass(), "rivalScoreCategorySetting", -1560830255);
        setIntField(term119685, term119685.getClass(), "playedTutorialBit", 686840690);
        setIntField(term119685, term119685.getClass(), "firstTutorialCancelNum", -487218195);
        setLongField(term119685, term119685.getClass(), "sumTechHighScore", -3030102582715798903L);
        setLongField(term119685, term119685.getClass(), "sumTechBasicHighScore", 7672458152252612386L);
        setLongField(term119685, term119685.getClass(), "sumTechAdvancedHighScore", -5034572575920747358L);
        setLongField(term119685, term119685.getClass(), "sumTechExpertHighScore", 8592327495243592980L);
        setLongField(term119685, term119685.getClass(), "sumTechMasterHighScore", 1939696366552939894L);
        setLongField(term119685, term119685.getClass(), "sumTechLunaticHighScore", -3125429670322717223L);
        setLongField(term119685, term119685.getClass(), "sumBattleHighScore", 4531128196429978652L);
        setLongField(term119685, term119685.getClass(), "sumBattleBasicHighScore", -7615828573362675703L);
        setLongField(term119685, term119685.getClass(), "sumBattleAdvancedHighScore", 4539124625936724888L);
        setLongField(term119685, term119685.getClass(), "sumBattleExpertHighScore", 7721797347459072164L);
        setLongField(term119685, term119685.getClass(), "sumBattleMasterHighScore", -274830541904370339L);
        setLongField(term119685, term119685.getClass(), "sumBattleLunaticHighScore", -3823756632277492942L);
        setField(term119685, term119685.getClass(), "eventWatchedDate", "yqhryWPaPb");
        setField(term119685, term119685.getClass(), "cmEventWatchedDate", "TBvkESDYGc");
        setField(term119685, term119685.getClass(), "firstGameId", "xPXaeMXfJb");
        setField(term119685, term119685.getClass(), "firstRomVersion", "ujCcQbAWoz");
        setField(term119685, term119685.getClass(), "firstDataVersion", "gJKBShUpxP");
        setField(term119685, term119685.getClass(), "firstPlayDate", "AgLTAjLwXk");
        setField(term119685, term119685.getClass(), "lastGameId", "INoAjOhMEq");
        setField(term119685, term119685.getClass(), "lastRomVersion", "HGacYAJJio");
        setField(term119685, term119685.getClass(), "lastDataVersion", "iUabaxtEPQ");
        setField(term119685, term119685.getClass(), "compatibleCmVersion", "BeULrSYHKm");
        setField(term119685, term119685.getClass(), "lastPlayDate", "nseWRZaaYe");
        setIntField(term119685, term119685.getClass(), "lastPlaceId", 18590676);
        setField(term119685, term119685.getClass(), "lastPlaceName", "mCxcdmaOlh");
        setIntField(term119685, term119685.getClass(), "lastRegionId", 1751204196);
        setField(term119685, term119685.getClass(), "lastRegionName", "LjgkHxxdOu");
        setIntField(term119685, term119685.getClass(), "lastAllNetId", 1354011295);
        setField(term119685, term119685.getClass(), "lastClientId", "AHOCvVqPAa");
        setIntField(term119685, term119685.getClass(), "lastUsedDeckId", -550112969);
        setIntField(term119685, term119685.getClass(), "lastPlayMusicLevel", -552322473);
        setIntField(term119685, term119685.getClass(), "lastEmoneyBrand", 1170114628);
        setField(term119683, term119683.getClass(), "user", term119685);
        setIntField(term119683, term119683.getClass(), "cardId", -1);
        setIntField(term119683, term119683.getClass(), "digitalStock", 1);
        setIntField(term119683, term119683.getClass(), "analogStock", -1506923134);
        setIntField(term119683, term119683.getClass(), "level", -689038383);
        setIntField(term119683, term119683.getClass(), "maxLevel", 10);
        setIntField(term119683, term119683.getClass(), "exp", 1931533980);
        setIntField(term119683, term119683.getClass(), "printCount", 1998184383);
        setIntField(term119683, term119683.getClass(), "useCount", -2144790292);
        setBooleanField(term119683, term119683.getClass(), "isNew", true);
        setField(term119683, term119683.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term119683, term119683.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term119683, term119683.getClass(), "skillId", 51322657);
        setBooleanField(term119683, term119683.getClass(), "isAcquired", true);
        setField(term119683, term119683.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAcquired", argTypes, term119683, args);
    }

};


