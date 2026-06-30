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

public class UserData_setBattlePoint_88354988276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54158;
     Object term54421;

    public UserData_setBattlePoint_88354988276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54162 = new Long(8313800941204938919L);
        term54158 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term54160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54158, term54158.getClass(), "id", -8354421580727921114L);
        setLongField(term54160, term54160.getClass(), "id", -618571331806918749L);
        setField(term54160, term54160.getClass(), "extId", term54162);
        setField(term54160, term54160.getClass(), "luid", "urrmpQzmTU");
        setIntField(term54177, term54177.getClass(), "year", 2011);
        setShortField(term54177, term54177.getClass(), "month", (short) 9);
        setShortField(term54177, term54177.getClass(), "day", (short) 7);
        setField(term54176, term54176.getClass(), "date", term54177);
        setByteField(term54181, term54181.getClass(), "hour", (byte) 0);
        setByteField(term54181, term54181.getClass(), "minute", (byte) 51);
        setByteField(term54181, term54181.getClass(), "second", (byte) 44);
        setIntField(term54181, term54181.getClass(), "nano", 245610060);
        setField(term54176, term54176.getClass(), "time", term54181);
        setField(term54160, term54160.getClass(), "registerTime", term54176);
        setIntField(term54187, term54187.getClass(), "year", 2018);
        setShortField(term54187, term54187.getClass(), "month", (short) 1);
        setShortField(term54187, term54187.getClass(), "day", (short) 29);
        setField(term54186, term54186.getClass(), "date", term54187);
        setByteField(term54191, term54191.getClass(), "hour", (byte) 22);
        setByteField(term54191, term54191.getClass(), "minute", (byte) 20);
        setByteField(term54191, term54191.getClass(), "second", (byte) 36);
        setIntField(term54191, term54191.getClass(), "nano", 74678080);
        setField(term54186, term54186.getClass(), "time", term54191);
        setField(term54160, term54160.getClass(), "accessTime", term54186);
        setField(term54158, term54158.getClass(), "card", term54160);
        setField(term54158, term54158.getClass(), "userName", "GWoZyTTlNx");
        setIntField(term54158, term54158.getClass(), "level", -762480882);
        setIntField(term54158, term54158.getClass(), "reincarnationNum", -263338308);
        setLongField(term54158, term54158.getClass(), "exp", -1963615592479122073L);
        setLongField(term54158, term54158.getClass(), "point", -2675023620754967902L);
        setLongField(term54158, term54158.getClass(), "totalPoint", 634576993708159924L);
        setIntField(term54158, term54158.getClass(), "playCount", 1496385296);
        setIntField(term54158, term54158.getClass(), "jewelCount", -1339659575);
        setIntField(term54158, term54158.getClass(), "totalJewelCount", 2123597267);
        setIntField(term54158, term54158.getClass(), "medalCount", -147077267);
        setIntField(term54158, term54158.getClass(), "playerRating", -550222549);
        setIntField(term54158, term54158.getClass(), "highestRating", -499576898);
        setIntField(term54158, term54158.getClass(), "battlePoint", -686129078);
        setIntField(term54158, term54158.getClass(), "bestBattlePoint", 1016118972);
        setIntField(term54158, term54158.getClass(), "overDamageBattlePoint", 1276607451);
        setBooleanField(term54158, term54158.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term54158, term54158.getClass(), "nameplateId", -547325184);
        setIntField(term54158, term54158.getClass(), "trophyId", 1470261214);
        setIntField(term54158, term54158.getClass(), "cardId", 1402619496);
        setIntField(term54158, term54158.getClass(), "characterId", 1253501512);
        setIntField(term54158, term54158.getClass(), "characterVoiceNo", 594655877);
        setIntField(term54158, term54158.getClass(), "tabSetting", 281155455);
        setIntField(term54158, term54158.getClass(), "tabSortSetting", 85079003);
        setIntField(term54158, term54158.getClass(), "cardCategorySetting", -2010823131);
        setIntField(term54158, term54158.getClass(), "cardSortSetting", -1368198865);
        setIntField(term54158, term54158.getClass(), "rivalScoreCategorySetting", -14635574);
        setIntField(term54158, term54158.getClass(), "playedTutorialBit", 2111644026);
        setIntField(term54158, term54158.getClass(), "firstTutorialCancelNum", 1000189054);
        setLongField(term54158, term54158.getClass(), "sumTechHighScore", 9144301579937337002L);
        setLongField(term54158, term54158.getClass(), "sumTechBasicHighScore", -7592880897361848994L);
        setLongField(term54158, term54158.getClass(), "sumTechAdvancedHighScore", -1132124748716009489L);
        setLongField(term54158, term54158.getClass(), "sumTechExpertHighScore", 6417149748828373606L);
        setLongField(term54158, term54158.getClass(), "sumTechMasterHighScore", -4468743939548166452L);
        setLongField(term54158, term54158.getClass(), "sumTechLunaticHighScore", -5290478444594322181L);
        setLongField(term54158, term54158.getClass(), "sumBattleHighScore", -113007539486440473L);
        setLongField(term54158, term54158.getClass(), "sumBattleBasicHighScore", -616506848183935936L);
        setLongField(term54158, term54158.getClass(), "sumBattleAdvancedHighScore", 6025328557132642962L);
        setLongField(term54158, term54158.getClass(), "sumBattleExpertHighScore", 7776435893105438545L);
        setLongField(term54158, term54158.getClass(), "sumBattleMasterHighScore", 4661005768418307444L);
        setLongField(term54158, term54158.getClass(), "sumBattleLunaticHighScore", 1720514282517245063L);
        setField(term54158, term54158.getClass(), "eventWatchedDate", "ntUYcalSmz");
        setField(term54158, term54158.getClass(), "cmEventWatchedDate", "lnZXLpyQoO");
        setField(term54158, term54158.getClass(), "firstGameId", "lOIEIGbwPj");
        setField(term54158, term54158.getClass(), "firstRomVersion", "TvmWaJWmLY");
        setField(term54158, term54158.getClass(), "firstDataVersion", "TSUdwgvHgU");
        setField(term54158, term54158.getClass(), "firstPlayDate", "YBQxTjzIrN");
        setField(term54158, term54158.getClass(), "lastGameId", "xfqaJVcHGx");
        setField(term54158, term54158.getClass(), "lastRomVersion", "bANxpqKESI");
        setField(term54158, term54158.getClass(), "lastDataVersion", "sgpUSVSuVZ");
        setField(term54158, term54158.getClass(), "compatibleCmVersion", "ZOYhOzwINI");
        setField(term54158, term54158.getClass(), "lastPlayDate", "sPqjQQfymN");
        setIntField(term54158, term54158.getClass(), "lastPlaceId", 832500285);
        setField(term54158, term54158.getClass(), "lastPlaceName", "tNKFzflLBd");
        setIntField(term54158, term54158.getClass(), "lastRegionId", 1519973734);
        setField(term54158, term54158.getClass(), "lastRegionName", "xHLlctEoGh");
        setIntField(term54158, term54158.getClass(), "lastAllNetId", -988300994);
        setField(term54158, term54158.getClass(), "lastClientId", "aqgUzcnqpE");
        setIntField(term54158, term54158.getClass(), "lastUsedDeckId", 1939692211);
        setIntField(term54158, term54158.getClass(), "lastPlayMusicLevel", 121806851);
        setIntField(term54158, term54158.getClass(), "lastEmoneyBrand", 1753247664);
        term54421 = new Integer(521507971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term54421;
        callMethod(klass, "setBattlePoint", argTypes, term54158, args);
    }

};


