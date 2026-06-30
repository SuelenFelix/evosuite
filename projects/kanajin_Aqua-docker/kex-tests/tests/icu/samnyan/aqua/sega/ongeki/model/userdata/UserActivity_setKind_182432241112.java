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

public class UserActivity_setKind_182432241112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288331;
     Object term288603;

    public UserActivity_setKind_182432241112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term288337 = new Long(-7062466217011408314L);
        term288331 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term288333 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term288335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term288351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term288361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term288331, term288331.getClass(), "id", -8611865520202474542L);
        setLongField(term288333, term288333.getClass(), "id", 1205223358178151829L);
        setLongField(term288335, term288335.getClass(), "id", 9186226516233741118L);
        setField(term288335, term288335.getClass(), "extId", term288337);
        setField(term288335, term288335.getClass(), "luid", "PfONuRjuSj");
        setIntField(term288352, term288352.getClass(), "year", 2020);
        setShortField(term288352, term288352.getClass(), "month", (short) 8);
        setShortField(term288352, term288352.getClass(), "day", (short) 1);
        setField(term288351, term288351.getClass(), "date", term288352);
        setByteField(term288356, term288356.getClass(), "hour", (byte) 19);
        setByteField(term288356, term288356.getClass(), "minute", (byte) 47);
        setByteField(term288356, term288356.getClass(), "second", (byte) 48);
        setIntField(term288356, term288356.getClass(), "nano", 301525077);
        setField(term288351, term288351.getClass(), "time", term288356);
        setField(term288335, term288335.getClass(), "registerTime", term288351);
        setIntField(term288362, term288362.getClass(), "year", 2029);
        setShortField(term288362, term288362.getClass(), "month", (short) 9);
        setShortField(term288362, term288362.getClass(), "day", (short) 8);
        setField(term288361, term288361.getClass(), "date", term288362);
        setByteField(term288366, term288366.getClass(), "hour", (byte) 1);
        setByteField(term288366, term288366.getClass(), "minute", (byte) 47);
        setByteField(term288366, term288366.getClass(), "second", (byte) 55);
        setIntField(term288366, term288366.getClass(), "nano", 12248155);
        setField(term288361, term288361.getClass(), "time", term288366);
        setField(term288335, term288335.getClass(), "accessTime", term288361);
        setField(term288333, term288333.getClass(), "card", term288335);
        setField(term288333, term288333.getClass(), "userName", "BxmcTjXInn");
        setIntField(term288333, term288333.getClass(), "level", -652403316);
        setIntField(term288333, term288333.getClass(), "reincarnationNum", -99177890);
        setLongField(term288333, term288333.getClass(), "exp", -5160160944169340758L);
        setLongField(term288333, term288333.getClass(), "point", -6139769410422559629L);
        setLongField(term288333, term288333.getClass(), "totalPoint", 1032633691778252752L);
        setIntField(term288333, term288333.getClass(), "playCount", 1381580503);
        setIntField(term288333, term288333.getClass(), "jewelCount", 1449095969);
        setIntField(term288333, term288333.getClass(), "totalJewelCount", 1586424206);
        setIntField(term288333, term288333.getClass(), "medalCount", 1331599209);
        setIntField(term288333, term288333.getClass(), "playerRating", -1291785671);
        setIntField(term288333, term288333.getClass(), "highestRating", -1846188963);
        setIntField(term288333, term288333.getClass(), "battlePoint", -378822383);
        setIntField(term288333, term288333.getClass(), "bestBattlePoint", -1683396631);
        setIntField(term288333, term288333.getClass(), "overDamageBattlePoint", -1186369376);
        setBooleanField(term288333, term288333.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term288333, term288333.getClass(), "nameplateId", 815530303);
        setIntField(term288333, term288333.getClass(), "trophyId", 2137150532);
        setIntField(term288333, term288333.getClass(), "cardId", 175483868);
        setIntField(term288333, term288333.getClass(), "characterId", -878852703);
        setIntField(term288333, term288333.getClass(), "characterVoiceNo", 217174894);
        setIntField(term288333, term288333.getClass(), "tabSetting", 1409041223);
        setIntField(term288333, term288333.getClass(), "tabSortSetting", -1174673068);
        setIntField(term288333, term288333.getClass(), "cardCategorySetting", -1459746793);
        setIntField(term288333, term288333.getClass(), "cardSortSetting", -279967601);
        setIntField(term288333, term288333.getClass(), "rivalScoreCategorySetting", -1365630426);
        setIntField(term288333, term288333.getClass(), "playedTutorialBit", 1879163737);
        setIntField(term288333, term288333.getClass(), "firstTutorialCancelNum", -1375213258);
        setLongField(term288333, term288333.getClass(), "sumTechHighScore", -6878329421773074055L);
        setLongField(term288333, term288333.getClass(), "sumTechBasicHighScore", -3420448096196512622L);
        setLongField(term288333, term288333.getClass(), "sumTechAdvancedHighScore", 379010524349715117L);
        setLongField(term288333, term288333.getClass(), "sumTechExpertHighScore", 4019969439359623258L);
        setLongField(term288333, term288333.getClass(), "sumTechMasterHighScore", 6983734890482941415L);
        setLongField(term288333, term288333.getClass(), "sumTechLunaticHighScore", 8658224413772243512L);
        setLongField(term288333, term288333.getClass(), "sumBattleHighScore", 2990186381381100511L);
        setLongField(term288333, term288333.getClass(), "sumBattleBasicHighScore", -4429579347495865118L);
        setLongField(term288333, term288333.getClass(), "sumBattleAdvancedHighScore", -8549358265561694260L);
        setLongField(term288333, term288333.getClass(), "sumBattleExpertHighScore", -1328932620639364869L);
        setLongField(term288333, term288333.getClass(), "sumBattleMasterHighScore", 7369580403825030477L);
        setLongField(term288333, term288333.getClass(), "sumBattleLunaticHighScore", -892084305976221800L);
        setField(term288333, term288333.getClass(), "eventWatchedDate", "aVPQtBXJuy");
        setField(term288333, term288333.getClass(), "cmEventWatchedDate", "SWtqfxdgNg");
        setField(term288333, term288333.getClass(), "firstGameId", "jsgrwgnbEn");
        setField(term288333, term288333.getClass(), "firstRomVersion", "vwbyoYQzvo");
        setField(term288333, term288333.getClass(), "firstDataVersion", "RtAsTvbELo");
        setField(term288333, term288333.getClass(), "firstPlayDate", "reFozIJLZz");
        setField(term288333, term288333.getClass(), "lastGameId", "oGDahLAYSF");
        setField(term288333, term288333.getClass(), "lastRomVersion", "RNRZKctZBC");
        setField(term288333, term288333.getClass(), "lastDataVersion", "OzqbIrAqJB");
        setField(term288333, term288333.getClass(), "compatibleCmVersion", "oHBNAywdjX");
        setField(term288333, term288333.getClass(), "lastPlayDate", "LtXEvmsGft");
        setIntField(term288333, term288333.getClass(), "lastPlaceId", -580235834);
        setField(term288333, term288333.getClass(), "lastPlaceName", "lQlNRkcQRY");
        setIntField(term288333, term288333.getClass(), "lastRegionId", 1181558786);
        setField(term288333, term288333.getClass(), "lastRegionName", "tGFJhbkqHf");
        setIntField(term288333, term288333.getClass(), "lastAllNetId", -1568789746);
        setField(term288333, term288333.getClass(), "lastClientId", "IPPRLZGZBn");
        setIntField(term288333, term288333.getClass(), "lastUsedDeckId", -1942621984);
        setIntField(term288333, term288333.getClass(), "lastPlayMusicLevel", -854433925);
        setIntField(term288333, term288333.getClass(), "lastEmoneyBrand", -1818927728);
        setField(term288331, term288331.getClass(), "user", term288333);
        setIntField(term288331, term288331.getClass(), "kind", 653066001);
        setIntField(term288331, term288331.getClass(), "activityId", -1176620233);
        setIntField(term288331, term288331.getClass(), "sortNumber", -415346336);
        setIntField(term288331, term288331.getClass(), "param1", -651043129);
        setIntField(term288331, term288331.getClass(), "param2", -1070416601);
        setIntField(term288331, term288331.getClass(), "param3", 1760447346);
        setIntField(term288331, term288331.getClass(), "param4", -1931685197);
        term288603 = new Integer(-809040939);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term288603;
        callMethod(klass, "setKind", argTypes, term288331, args);
    }

};


