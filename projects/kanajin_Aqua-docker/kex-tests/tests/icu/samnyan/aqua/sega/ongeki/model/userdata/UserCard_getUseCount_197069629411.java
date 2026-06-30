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

public class UserCard_getUseCount_197069629411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116843;

    public UserCard_getUseCount_197069629411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116849 = new Long(-9204303423581447271L);
        term116843 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term116845 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term116847 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term116863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116878 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term116843, term116843.getClass(), "id", -3413817283601493614L);
        setLongField(term116845, term116845.getClass(), "id", 1792171186875938051L);
        setLongField(term116847, term116847.getClass(), "id", -7572992706433807080L);
        setField(term116847, term116847.getClass(), "extId", term116849);
        setField(term116847, term116847.getClass(), "luid", "pZsKceaypG");
        setIntField(term116864, term116864.getClass(), "year", 2010);
        setShortField(term116864, term116864.getClass(), "month", (short) 1);
        setShortField(term116864, term116864.getClass(), "day", (short) 25);
        setField(term116863, term116863.getClass(), "date", term116864);
        setByteField(term116868, term116868.getClass(), "hour", (byte) 2);
        setByteField(term116868, term116868.getClass(), "minute", (byte) 58);
        setByteField(term116868, term116868.getClass(), "second", (byte) 38);
        setIntField(term116868, term116868.getClass(), "nano", 91985442);
        setField(term116863, term116863.getClass(), "time", term116868);
        setField(term116847, term116847.getClass(), "registerTime", term116863);
        setIntField(term116874, term116874.getClass(), "year", 2016);
        setShortField(term116874, term116874.getClass(), "month", (short) 8);
        setShortField(term116874, term116874.getClass(), "day", (short) 5);
        setField(term116873, term116873.getClass(), "date", term116874);
        setByteField(term116878, term116878.getClass(), "hour", (byte) 0);
        setByteField(term116878, term116878.getClass(), "minute", (byte) 44);
        setByteField(term116878, term116878.getClass(), "second", (byte) 0);
        setIntField(term116878, term116878.getClass(), "nano", 108509);
        setField(term116873, term116873.getClass(), "time", term116878);
        setField(term116847, term116847.getClass(), "accessTime", term116873);
        setField(term116845, term116845.getClass(), "card", term116847);
        setField(term116845, term116845.getClass(), "userName", "XZfWiBghln");
        setIntField(term116845, term116845.getClass(), "level", -745219395);
        setIntField(term116845, term116845.getClass(), "reincarnationNum", 1205528550);
        setLongField(term116845, term116845.getClass(), "exp", 6381717981848057414L);
        setLongField(term116845, term116845.getClass(), "point", -7918934546275014386L);
        setLongField(term116845, term116845.getClass(), "totalPoint", 6059741189973328435L);
        setIntField(term116845, term116845.getClass(), "playCount", -1936901017);
        setIntField(term116845, term116845.getClass(), "jewelCount", -1504411382);
        setIntField(term116845, term116845.getClass(), "totalJewelCount", -283531377);
        setIntField(term116845, term116845.getClass(), "medalCount", -314963964);
        setIntField(term116845, term116845.getClass(), "playerRating", 1047233857);
        setIntField(term116845, term116845.getClass(), "highestRating", 180900029);
        setIntField(term116845, term116845.getClass(), "battlePoint", 1084899159);
        setIntField(term116845, term116845.getClass(), "bestBattlePoint", -613970307);
        setIntField(term116845, term116845.getClass(), "overDamageBattlePoint", 2045590105);
        setBooleanField(term116845, term116845.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term116845, term116845.getClass(), "nameplateId", -2052631286);
        setIntField(term116845, term116845.getClass(), "trophyId", -1474168411);
        setIntField(term116845, term116845.getClass(), "cardId", -233688868);
        setIntField(term116845, term116845.getClass(), "characterId", 1222014341);
        setIntField(term116845, term116845.getClass(), "characterVoiceNo", -2043344667);
        setIntField(term116845, term116845.getClass(), "tabSetting", 1173313312);
        setIntField(term116845, term116845.getClass(), "tabSortSetting", 1956926414);
        setIntField(term116845, term116845.getClass(), "cardCategorySetting", -1787169684);
        setIntField(term116845, term116845.getClass(), "cardSortSetting", 1564406673);
        setIntField(term116845, term116845.getClass(), "rivalScoreCategorySetting", 1505760902);
        setIntField(term116845, term116845.getClass(), "playedTutorialBit", 1276810708);
        setIntField(term116845, term116845.getClass(), "firstTutorialCancelNum", -375398621);
        setLongField(term116845, term116845.getClass(), "sumTechHighScore", 4511856667622318751L);
        setLongField(term116845, term116845.getClass(), "sumTechBasicHighScore", 8217387676864929174L);
        setLongField(term116845, term116845.getClass(), "sumTechAdvancedHighScore", -2400126170395987933L);
        setLongField(term116845, term116845.getClass(), "sumTechExpertHighScore", -323444339356337436L);
        setLongField(term116845, term116845.getClass(), "sumTechMasterHighScore", -1516856062016520287L);
        setLongField(term116845, term116845.getClass(), "sumTechLunaticHighScore", -6572885025393605032L);
        setLongField(term116845, term116845.getClass(), "sumBattleHighScore", 1545876578766248342L);
        setLongField(term116845, term116845.getClass(), "sumBattleBasicHighScore", -220718414597615522L);
        setLongField(term116845, term116845.getClass(), "sumBattleAdvancedHighScore", 5177517643223018484L);
        setLongField(term116845, term116845.getClass(), "sumBattleExpertHighScore", -3934057876521797067L);
        setLongField(term116845, term116845.getClass(), "sumBattleMasterHighScore", 6659925498290372973L);
        setLongField(term116845, term116845.getClass(), "sumBattleLunaticHighScore", 2250315847064733903L);
        setField(term116845, term116845.getClass(), "eventWatchedDate", "mzCiczKZrz");
        setField(term116845, term116845.getClass(), "cmEventWatchedDate", "KHTorTPpue");
        setField(term116845, term116845.getClass(), "firstGameId", "UZGFzJfIBQ");
        setField(term116845, term116845.getClass(), "firstRomVersion", "HVZdePgPWv");
        setField(term116845, term116845.getClass(), "firstDataVersion", "VhpcclRPZX");
        setField(term116845, term116845.getClass(), "firstPlayDate", "jecnsmPrVs");
        setField(term116845, term116845.getClass(), "lastGameId", "QkdgrEdqYo");
        setField(term116845, term116845.getClass(), "lastRomVersion", "oqAIcYaMFy");
        setField(term116845, term116845.getClass(), "lastDataVersion", "eMJZEUCuiE");
        setField(term116845, term116845.getClass(), "compatibleCmVersion", "psNXkIHjLW");
        setField(term116845, term116845.getClass(), "lastPlayDate", "DeWUQxbivp");
        setIntField(term116845, term116845.getClass(), "lastPlaceId", 856069240);
        setField(term116845, term116845.getClass(), "lastPlaceName", "PcRiAbKXvK");
        setIntField(term116845, term116845.getClass(), "lastRegionId", 1617630705);
        setField(term116845, term116845.getClass(), "lastRegionName", "EhjpwiDlaG");
        setIntField(term116845, term116845.getClass(), "lastAllNetId", -2035560140);
        setField(term116845, term116845.getClass(), "lastClientId", "HowhKdqLBn");
        setIntField(term116845, term116845.getClass(), "lastUsedDeckId", 532665626);
        setIntField(term116845, term116845.getClass(), "lastPlayMusicLevel", 1052620858);
        setIntField(term116845, term116845.getClass(), "lastEmoneyBrand", 784368731);
        setField(term116843, term116843.getClass(), "user", term116845);
        setIntField(term116843, term116843.getClass(), "cardId", -1);
        setIntField(term116843, term116843.getClass(), "digitalStock", 1);
        setIntField(term116843, term116843.getClass(), "analogStock", -325400272);
        setIntField(term116843, term116843.getClass(), "level", -439065543);
        setIntField(term116843, term116843.getClass(), "maxLevel", 10);
        setIntField(term116843, term116843.getClass(), "exp", -2067100921);
        setIntField(term116843, term116843.getClass(), "printCount", -630380701);
        setIntField(term116843, term116843.getClass(), "useCount", -1571228038);
        setBooleanField(term116843, term116843.getClass(), "isNew", true);
        setField(term116843, term116843.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term116843, term116843.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term116843, term116843.getClass(), "skillId", 483151429);
        setBooleanField(term116843, term116843.getClass(), "isAcquired", true);
        setField(term116843, term116843.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUseCount", argTypes, term116843, args);
    }

};


