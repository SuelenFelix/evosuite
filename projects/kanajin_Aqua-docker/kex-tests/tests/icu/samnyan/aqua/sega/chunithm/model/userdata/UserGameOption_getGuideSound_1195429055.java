package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOption_getGuideSound_1195429055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50971;

    public UserGameOption_getGuideSound_1195429055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50977 = new Long(-8652538484981166496L);
        term50971 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term50973 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term50975 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term50991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term50992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term50996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51006 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51084 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51085 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51089 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51132 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51133 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51137 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51178 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51179 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51183 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term50971, term50971.getClass(), "id", 4157679554798000555L);
        setLongField(term50973, term50973.getClass(), "id", -6869725878798445523L);
        setLongField(term50975, term50975.getClass(), "id", -1338195308090100406L);
        setField(term50975, term50975.getClass(), "extId", term50977);
        setField(term50975, term50975.getClass(), "luid", "TDQIAXaJru");
        setIntField(term50992, term50992.getClass(), "year", 2018);
        setShortField(term50992, term50992.getClass(), "month", (short) 11);
        setShortField(term50992, term50992.getClass(), "day", (short) 14);
        setField(term50991, term50991.getClass(), "date", term50992);
        setByteField(term50996, term50996.getClass(), "hour", (byte) 18);
        setByteField(term50996, term50996.getClass(), "minute", (byte) 31);
        setByteField(term50996, term50996.getClass(), "second", (byte) 15);
        setIntField(term50996, term50996.getClass(), "nano", 39699749);
        setField(term50991, term50991.getClass(), "time", term50996);
        setField(term50975, term50975.getClass(), "registerTime", term50991);
        setIntField(term51002, term51002.getClass(), "year", 2019);
        setShortField(term51002, term51002.getClass(), "month", (short) 4);
        setShortField(term51002, term51002.getClass(), "day", (short) 21);
        setField(term51001, term51001.getClass(), "date", term51002);
        setByteField(term51006, term51006.getClass(), "hour", (byte) 12);
        setByteField(term51006, term51006.getClass(), "minute", (byte) 13);
        setByteField(term51006, term51006.getClass(), "second", (byte) 21);
        setIntField(term51006, term51006.getClass(), "nano", 906802544);
        setField(term51001, term51001.getClass(), "time", term51006);
        setField(term50975, term50975.getClass(), "accessTime", term51001);
        setField(term50973, term50973.getClass(), "card", term50975);
        setField(term50973, term50973.getClass(), "userName", "frPMFqGmrE");
        setIntField(term51024, term51024.getClass(), "year", 2010);
        setShortField(term51024, term51024.getClass(), "month", (short) 1);
        setShortField(term51024, term51024.getClass(), "day", (short) 25);
        setField(term51023, term51023.getClass(), "date", term51024);
        setByteField(term51028, term51028.getClass(), "hour", (byte) 2);
        setByteField(term51028, term51028.getClass(), "minute", (byte) 58);
        setByteField(term51028, term51028.getClass(), "second", (byte) 38);
        setIntField(term51028, term51028.getClass(), "nano", 91985442);
        setField(term51023, term51023.getClass(), "time", term51028);
        setField(term50973, term50973.getClass(), "lastLoginDate", term51023);
        setBooleanField(term50973, term50973.getClass(), "isWebJoin", true);
        setField(term50973, term50973.getClass(), "webLimitDate", "DvfOYWcNBN");
        setIntField(term50973, term50973.getClass(), "level", -182792320);
        setIntField(term50973, term50973.getClass(), "reincarnationNum", 409164749);
        setField(term50973, term50973.getClass(), "exp", "cvbvwpPlNk");
        setLongField(term50973, term50973.getClass(), "point", 3619359432967414857L);
        setLongField(term50973, term50973.getClass(), "totalPoint", 6722117607141885589L);
        setIntField(term50973, term50973.getClass(), "playCount", 896581942);
        setIntField(term50973, term50973.getClass(), "multiPlayCount", 108670537);
        setIntField(term50973, term50973.getClass(), "multiWinCount", -94326012);
        setIntField(term50973, term50973.getClass(), "requestResCount", -665192132);
        setIntField(term50973, term50973.getClass(), "acceptResCount", 720355914);
        setIntField(term50973, term50973.getClass(), "successResCount", -775874930);
        setIntField(term50973, term50973.getClass(), "playerRating", 1404363846);
        setIntField(term50973, term50973.getClass(), "highestRating", -2081298107);
        setIntField(term50973, term50973.getClass(), "nameplateId", -231030486);
        setIntField(term50973, term50973.getClass(), "frameId", 908016119);
        setIntField(term50973, term50973.getClass(), "characterId", 110988463);
        setIntField(term50973, term50973.getClass(), "trophyId", 955685902);
        setIntField(term50973, term50973.getClass(), "playedTutorialBit", 462054815);
        setIntField(term50973, term50973.getClass(), "firstTutorialCancelNum", 406100677);
        setIntField(term50973, term50973.getClass(), "masterTutorialCancelNum", 778368290);
        setIntField(term50973, term50973.getClass(), "totalRepertoireCount", 963185413);
        setIntField(term50973, term50973.getClass(), "totalMapNum", 1937434591);
        setLongField(term50973, term50973.getClass(), "totalHiScore", -6209056926999752933L);
        setLongField(term50973, term50973.getClass(), "totalBasicHighScore", 475071242551560384L);
        setLongField(term50973, term50973.getClass(), "totalAdvancedHighScore", 279205148356106270L);
        setLongField(term50973, term50973.getClass(), "totalExpertHighScore", -3702098864254881563L);
        setLongField(term50973, term50973.getClass(), "totalMasterHighScore", 1787205862282614159L);
        setIntField(term51085, term51085.getClass(), "year", 2016);
        setShortField(term51085, term51085.getClass(), "month", (short) 8);
        setShortField(term51085, term51085.getClass(), "day", (short) 5);
        setField(term51084, term51084.getClass(), "date", term51085);
        setByteField(term51089, term51089.getClass(), "hour", (byte) 0);
        setByteField(term51089, term51089.getClass(), "minute", (byte) 44);
        setByteField(term51089, term51089.getClass(), "second", (byte) 0);
        setIntField(term51089, term51089.getClass(), "nano", 108509);
        setField(term51084, term51084.getClass(), "time", term51089);
        setField(term50973, term50973.getClass(), "eventWatchedDate", term51084);
        setIntField(term50973, term50973.getClass(), "friendCount", 759908235);
        setBooleanField(term50973, term50973.getClass(), "isMaimai", false);
        setField(term50973, term50973.getClass(), "firstGameId", "uCdLbhvYeG");
        setField(term50973, term50973.getClass(), "firstRomVersion", "ipoyEHBfoG");
        setField(term50973, term50973.getClass(), "firstDataVersion", "iSBTpbiteU");
        setIntField(term51133, term51133.getClass(), "year", 2020);
        setShortField(term51133, term51133.getClass(), "month", (short) 3);
        setShortField(term51133, term51133.getClass(), "day", (short) 11);
        setField(term51132, term51132.getClass(), "date", term51133);
        setByteField(term51137, term51137.getClass(), "hour", (byte) 3);
        setByteField(term51137, term51137.getClass(), "minute", (byte) 24);
        setByteField(term51137, term51137.getClass(), "second", (byte) 7);
        setIntField(term51137, term51137.getClass(), "nano", 685767594);
        setField(term51132, term51132.getClass(), "time", term51137);
        setField(term50973, term50973.getClass(), "firstPlayDate", term51132);
        setField(term50973, term50973.getClass(), "lastGameId", "MTwFbEoMZj");
        setField(term50973, term50973.getClass(), "lastRomVersion", "uEQbnHbyAn");
        setField(term50973, term50973.getClass(), "lastDataVersion", "JpFIuyNEKW");
        setIntField(term51179, term51179.getClass(), "year", 2014);
        setShortField(term51179, term51179.getClass(), "month", (short) 9);
        setShortField(term51179, term51179.getClass(), "day", (short) 30);
        setField(term51178, term51178.getClass(), "date", term51179);
        setByteField(term51183, term51183.getClass(), "hour", (byte) 6);
        setByteField(term51183, term51183.getClass(), "minute", (byte) 5);
        setByteField(term51183, term51183.getClass(), "second", (byte) 42);
        setIntField(term51183, term51183.getClass(), "nano", 798954614);
        setField(term51178, term51178.getClass(), "time", term51183);
        setField(term50973, term50973.getClass(), "lastPlayDate", term51178);
        setIntField(term50973, term50973.getClass(), "lastPlaceId", -1220035028);
        setField(term50973, term50973.getClass(), "lastPlaceName", "NksHsgcqDx");
        setField(term50973, term50973.getClass(), "lastRegionId", "RjSNvOEvcT");
        setField(term50973, term50973.getClass(), "lastRegionName", "HLzuMxigqS");
        setField(term50973, term50973.getClass(), "lastAllNetId", "wiBOoDCyzd");
        setField(term50973, term50973.getClass(), "lastClientId", "TIaFKUJELS");
        setField(term50971, term50971.getClass(), "user", term50973);
        setIntField(term50971, term50971.getClass(), "bgInfo", 211574528);
        setIntField(term50971, term50971.getClass(), "fieldColor", 984819165);
        setIntField(term50971, term50971.getClass(), "guideSound", 1276438509);
        setIntField(term50971, term50971.getClass(), "soundEffect", -934156422);
        setIntField(term50971, term50971.getClass(), "guideLine", -1644931931);
        setIntField(term50971, term50971.getClass(), "speed", -1890108963);
        setIntField(term50971, term50971.getClass(), "optionSet", 1848496553);
        setIntField(term50971, term50971.getClass(), "matching", 79714955);
        setIntField(term50971, term50971.getClass(), "judgePos", -1409613044);
        setIntField(term50971, term50971.getClass(), "rating", -1594530234);
        setIntField(term50971, term50971.getClass(), "judgeJustice", -414324261);
        setIntField(term50971, term50971.getClass(), "judgeAttack", -1729893211);
        setIntField(term50971, term50971.getClass(), "headphone", -1648760670);
        setIntField(term50971, term50971.getClass(), "playerLevel", 590703291);
        setIntField(term50971, term50971.getClass(), "successTap", -2033199492);
        setIntField(term50971, term50971.getClass(), "successExTap", 350096397);
        setIntField(term50971, term50971.getClass(), "successSlideHold", -325295536);
        setIntField(term50971, term50971.getClass(), "successAir", -411068820);
        setIntField(term50971, term50971.getClass(), "successFlick", -608484309);
        setIntField(term50971, term50971.getClass(), "successSkill", -396456847);
        setIntField(term50971, term50971.getClass(), "successTapTimbre", 1826615515);
        setIntField(term50971, term50971.getClass(), "privacy", 1129458600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideSound", argTypes, term50971, args);
    }

};


