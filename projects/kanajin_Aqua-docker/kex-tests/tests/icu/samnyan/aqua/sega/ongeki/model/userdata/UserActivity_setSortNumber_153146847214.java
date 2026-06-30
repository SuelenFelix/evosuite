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

public class UserActivity_setSortNumber_153146847214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289199;
     Object term289471;

    public UserActivity_setSortNumber_153146847214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term289205 = new Long(-1889784286465977825L);
        term289199 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term289201 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term289203 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term289219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289224 = newInstance(Class.forName("java.time.LocalTime"));
        Object term289229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term289230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289234 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term289199, term289199.getClass(), "id", -6314344690113839189L);
        setLongField(term289201, term289201.getClass(), "id", -1178662261704957528L);
        setLongField(term289203, term289203.getClass(), "id", 6269383899131609347L);
        setField(term289203, term289203.getClass(), "extId", term289205);
        setField(term289203, term289203.getClass(), "luid", "EIfTZcAWvK");
        setIntField(term289220, term289220.getClass(), "year", 2018);
        setShortField(term289220, term289220.getClass(), "month", (short) 6);
        setShortField(term289220, term289220.getClass(), "day", (short) 8);
        setField(term289219, term289219.getClass(), "date", term289220);
        setByteField(term289224, term289224.getClass(), "hour", (byte) 23);
        setByteField(term289224, term289224.getClass(), "minute", (byte) 32);
        setByteField(term289224, term289224.getClass(), "second", (byte) 0);
        setIntField(term289224, term289224.getClass(), "nano", 186364385);
        setField(term289219, term289219.getClass(), "time", term289224);
        setField(term289203, term289203.getClass(), "registerTime", term289219);
        setIntField(term289230, term289230.getClass(), "year", 2015);
        setShortField(term289230, term289230.getClass(), "month", (short) 11);
        setShortField(term289230, term289230.getClass(), "day", (short) 5);
        setField(term289229, term289229.getClass(), "date", term289230);
        setByteField(term289234, term289234.getClass(), "hour", (byte) 22);
        setByteField(term289234, term289234.getClass(), "minute", (byte) 42);
        setByteField(term289234, term289234.getClass(), "second", (byte) 31);
        setIntField(term289234, term289234.getClass(), "nano", 474325990);
        setField(term289229, term289229.getClass(), "time", term289234);
        setField(term289203, term289203.getClass(), "accessTime", term289229);
        setField(term289201, term289201.getClass(), "card", term289203);
        setField(term289201, term289201.getClass(), "userName", "UTxMkvUfrZ");
        setIntField(term289201, term289201.getClass(), "level", -2000318351);
        setIntField(term289201, term289201.getClass(), "reincarnationNum", -546143038);
        setLongField(term289201, term289201.getClass(), "exp", 912987366987003193L);
        setLongField(term289201, term289201.getClass(), "point", -7198156713059141125L);
        setLongField(term289201, term289201.getClass(), "totalPoint", -8621692508390726821L);
        setIntField(term289201, term289201.getClass(), "playCount", -438943320);
        setIntField(term289201, term289201.getClass(), "jewelCount", -963703305);
        setIntField(term289201, term289201.getClass(), "totalJewelCount", -1575517096);
        setIntField(term289201, term289201.getClass(), "medalCount", -1555155741);
        setIntField(term289201, term289201.getClass(), "playerRating", -843128749);
        setIntField(term289201, term289201.getClass(), "highestRating", -50966948);
        setIntField(term289201, term289201.getClass(), "battlePoint", -577117972);
        setIntField(term289201, term289201.getClass(), "bestBattlePoint", 249389565);
        setIntField(term289201, term289201.getClass(), "overDamageBattlePoint", 1948918019);
        setBooleanField(term289201, term289201.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term289201, term289201.getClass(), "nameplateId", 1600591455);
        setIntField(term289201, term289201.getClass(), "trophyId", 808094613);
        setIntField(term289201, term289201.getClass(), "cardId", -503272617);
        setIntField(term289201, term289201.getClass(), "characterId", -1473729491);
        setIntField(term289201, term289201.getClass(), "characterVoiceNo", -1623388187);
        setIntField(term289201, term289201.getClass(), "tabSetting", 1607913383);
        setIntField(term289201, term289201.getClass(), "tabSortSetting", 2006007230);
        setIntField(term289201, term289201.getClass(), "cardCategorySetting", -382780133);
        setIntField(term289201, term289201.getClass(), "cardSortSetting", -1041950061);
        setIntField(term289201, term289201.getClass(), "rivalScoreCategorySetting", 992724986);
        setIntField(term289201, term289201.getClass(), "playedTutorialBit", 1038663559);
        setIntField(term289201, term289201.getClass(), "firstTutorialCancelNum", -491669609);
        setLongField(term289201, term289201.getClass(), "sumTechHighScore", -802983541303191763L);
        setLongField(term289201, term289201.getClass(), "sumTechBasicHighScore", 742123350796177792L);
        setLongField(term289201, term289201.getClass(), "sumTechAdvancedHighScore", -936755589674504107L);
        setLongField(term289201, term289201.getClass(), "sumTechExpertHighScore", 1655270901730542339L);
        setLongField(term289201, term289201.getClass(), "sumTechMasterHighScore", 36348805822182382L);
        setLongField(term289201, term289201.getClass(), "sumTechLunaticHighScore", -882912974115051667L);
        setLongField(term289201, term289201.getClass(), "sumBattleHighScore", -5828315111868552932L);
        setLongField(term289201, term289201.getClass(), "sumBattleBasicHighScore", 8575572334761429235L);
        setLongField(term289201, term289201.getClass(), "sumBattleAdvancedHighScore", 3574725280614968268L);
        setLongField(term289201, term289201.getClass(), "sumBattleExpertHighScore", 3102405375207612227L);
        setLongField(term289201, term289201.getClass(), "sumBattleMasterHighScore", 859632859682932505L);
        setLongField(term289201, term289201.getClass(), "sumBattleLunaticHighScore", -7982277640742909313L);
        setField(term289201, term289201.getClass(), "eventWatchedDate", "NQsrTzOjPP");
        setField(term289201, term289201.getClass(), "cmEventWatchedDate", "AaBJKKMloo");
        setField(term289201, term289201.getClass(), "firstGameId", "xPudQMxgBM");
        setField(term289201, term289201.getClass(), "firstRomVersion", "dZjsEGIcWz");
        setField(term289201, term289201.getClass(), "firstDataVersion", "svjpGAjnRN");
        setField(term289201, term289201.getClass(), "firstPlayDate", "pttzoCMsTO");
        setField(term289201, term289201.getClass(), "lastGameId", "UZDKpgGSjX");
        setField(term289201, term289201.getClass(), "lastRomVersion", "foaQZmXMHo");
        setField(term289201, term289201.getClass(), "lastDataVersion", "BTiRFFuMmf");
        setField(term289201, term289201.getClass(), "compatibleCmVersion", "eUQNprkBYk");
        setField(term289201, term289201.getClass(), "lastPlayDate", "RCWgKGfqgy");
        setIntField(term289201, term289201.getClass(), "lastPlaceId", 827670895);
        setField(term289201, term289201.getClass(), "lastPlaceName", "RownRxaaCW");
        setIntField(term289201, term289201.getClass(), "lastRegionId", 237718968);
        setField(term289201, term289201.getClass(), "lastRegionName", "QJsmuCTCTh");
        setIntField(term289201, term289201.getClass(), "lastAllNetId", -1792182061);
        setField(term289201, term289201.getClass(), "lastClientId", "kTuulZLRxo");
        setIntField(term289201, term289201.getClass(), "lastUsedDeckId", -1787992861);
        setIntField(term289201, term289201.getClass(), "lastPlayMusicLevel", -866392377);
        setIntField(term289201, term289201.getClass(), "lastEmoneyBrand", -476020616);
        setField(term289199, term289199.getClass(), "user", term289201);
        setIntField(term289199, term289199.getClass(), "kind", 1560427540);
        setIntField(term289199, term289199.getClass(), "activityId", -2014999573);
        setIntField(term289199, term289199.getClass(), "sortNumber", -463779247);
        setIntField(term289199, term289199.getClass(), "param1", -374588532);
        setIntField(term289199, term289199.getClass(), "param2", -147991856);
        setIntField(term289199, term289199.getClass(), "param3", -1877681987);
        setIntField(term289199, term289199.getClass(), "param4", 2008337811);
        term289471 = new Integer(1964182678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289471;
        callMethod(klass, "setSortNumber", argTypes, term289199, args);
    }

};


