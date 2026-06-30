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

public class UserData_getSumTechMasterHighScore_40364142334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36300;

    public UserData_getSumTechMasterHighScore_40364142334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36304 = new Long(5946780097489996391L);
        term36300 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term36302 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36300, term36300.getClass(), "id", 3445409355788900348L);
        setLongField(term36302, term36302.getClass(), "id", -8079148366910851953L);
        setField(term36302, term36302.getClass(), "extId", term36304);
        setField(term36302, term36302.getClass(), "luid", "IaEqlVwmNS");
        setIntField(term36319, term36319.getClass(), "year", 2023);
        setShortField(term36319, term36319.getClass(), "month", (short) 8);
        setShortField(term36319, term36319.getClass(), "day", (short) 21);
        setField(term36318, term36318.getClass(), "date", term36319);
        setByteField(term36323, term36323.getClass(), "hour", (byte) 10);
        setByteField(term36323, term36323.getClass(), "minute", (byte) 36);
        setByteField(term36323, term36323.getClass(), "second", (byte) 15);
        setIntField(term36323, term36323.getClass(), "nano", 257070204);
        setField(term36318, term36318.getClass(), "time", term36323);
        setField(term36302, term36302.getClass(), "registerTime", term36318);
        setIntField(term36329, term36329.getClass(), "year", 2012);
        setShortField(term36329, term36329.getClass(), "month", (short) 12);
        setShortField(term36329, term36329.getClass(), "day", (short) 14);
        setField(term36328, term36328.getClass(), "date", term36329);
        setByteField(term36333, term36333.getClass(), "hour", (byte) 1);
        setByteField(term36333, term36333.getClass(), "minute", (byte) 47);
        setByteField(term36333, term36333.getClass(), "second", (byte) 3);
        setIntField(term36333, term36333.getClass(), "nano", 359751066);
        setField(term36328, term36328.getClass(), "time", term36333);
        setField(term36302, term36302.getClass(), "accessTime", term36328);
        setField(term36300, term36300.getClass(), "card", term36302);
        setField(term36300, term36300.getClass(), "userName", "ljNOgdPWrL");
        setIntField(term36300, term36300.getClass(), "level", -665938382);
        setIntField(term36300, term36300.getClass(), "reincarnationNum", 325391588);
        setLongField(term36300, term36300.getClass(), "exp", 7775195107098215044L);
        setLongField(term36300, term36300.getClass(), "point", -1826927759081147983L);
        setLongField(term36300, term36300.getClass(), "totalPoint", 1770574028303523867L);
        setIntField(term36300, term36300.getClass(), "playCount", 1443046313);
        setIntField(term36300, term36300.getClass(), "jewelCount", 1055117337);
        setIntField(term36300, term36300.getClass(), "totalJewelCount", -705616896);
        setIntField(term36300, term36300.getClass(), "medalCount", 1057965724);
        setIntField(term36300, term36300.getClass(), "playerRating", 2134707657);
        setIntField(term36300, term36300.getClass(), "highestRating", -357630956);
        setIntField(term36300, term36300.getClass(), "battlePoint", -1068878345);
        setIntField(term36300, term36300.getClass(), "bestBattlePoint", 1386128235);
        setIntField(term36300, term36300.getClass(), "overDamageBattlePoint", -1047109164);
        setBooleanField(term36300, term36300.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term36300, term36300.getClass(), "nameplateId", -1650626012);
        setIntField(term36300, term36300.getClass(), "trophyId", -2045231879);
        setIntField(term36300, term36300.getClass(), "cardId", 1678025090);
        setIntField(term36300, term36300.getClass(), "characterId", 714453255);
        setIntField(term36300, term36300.getClass(), "characterVoiceNo", 2096762388);
        setIntField(term36300, term36300.getClass(), "tabSetting", -1646872343);
        setIntField(term36300, term36300.getClass(), "tabSortSetting", -140841633);
        setIntField(term36300, term36300.getClass(), "cardCategorySetting", 1970986976);
        setIntField(term36300, term36300.getClass(), "cardSortSetting", 530909877);
        setIntField(term36300, term36300.getClass(), "rivalScoreCategorySetting", -123945804);
        setIntField(term36300, term36300.getClass(), "playedTutorialBit", 2133669766);
        setIntField(term36300, term36300.getClass(), "firstTutorialCancelNum", -1423215684);
        setLongField(term36300, term36300.getClass(), "sumTechHighScore", 6434856191210114702L);
        setLongField(term36300, term36300.getClass(), "sumTechBasicHighScore", 1306769240431962876L);
        setLongField(term36300, term36300.getClass(), "sumTechAdvancedHighScore", -431846534131845221L);
        setLongField(term36300, term36300.getClass(), "sumTechExpertHighScore", -1676755477328808985L);
        setLongField(term36300, term36300.getClass(), "sumTechMasterHighScore", 6429812737969607903L);
        setLongField(term36300, term36300.getClass(), "sumTechLunaticHighScore", -3581079819917173688L);
        setLongField(term36300, term36300.getClass(), "sumBattleHighScore", 1841313452085873331L);
        setLongField(term36300, term36300.getClass(), "sumBattleBasicHighScore", -4019650338948804968L);
        setLongField(term36300, term36300.getClass(), "sumBattleAdvancedHighScore", 4836157943217062601L);
        setLongField(term36300, term36300.getClass(), "sumBattleExpertHighScore", -9063283724358706942L);
        setLongField(term36300, term36300.getClass(), "sumBattleMasterHighScore", -8579515460152917650L);
        setLongField(term36300, term36300.getClass(), "sumBattleLunaticHighScore", -3033236171719733686L);
        setField(term36300, term36300.getClass(), "eventWatchedDate", "oBlIZiyRMS");
        setField(term36300, term36300.getClass(), "cmEventWatchedDate", "QUYAkhtCNh");
        setField(term36300, term36300.getClass(), "firstGameId", "kOaAQOLyqd");
        setField(term36300, term36300.getClass(), "firstRomVersion", "ICBWiKaeHC");
        setField(term36300, term36300.getClass(), "firstDataVersion", "WAljagiCzu");
        setField(term36300, term36300.getClass(), "firstPlayDate", "XKMXfDZajw");
        setField(term36300, term36300.getClass(), "lastGameId", "avZoBQSrBy");
        setField(term36300, term36300.getClass(), "lastRomVersion", "KIXGeHXdwi");
        setField(term36300, term36300.getClass(), "lastDataVersion", "tTfdvLMwEE");
        setField(term36300, term36300.getClass(), "compatibleCmVersion", "DiSkERzqOE");
        setField(term36300, term36300.getClass(), "lastPlayDate", "hPSZZeYqHQ");
        setIntField(term36300, term36300.getClass(), "lastPlaceId", -1096652631);
        setField(term36300, term36300.getClass(), "lastPlaceName", "scReMUKyGq");
        setIntField(term36300, term36300.getClass(), "lastRegionId", 1116810901);
        setField(term36300, term36300.getClass(), "lastRegionName", "FmIpnxjRxA");
        setIntField(term36300, term36300.getClass(), "lastAllNetId", 1944430959);
        setField(term36300, term36300.getClass(), "lastClientId", "FTjxxGvyun");
        setIntField(term36300, term36300.getClass(), "lastUsedDeckId", 98801346);
        setIntField(term36300, term36300.getClass(), "lastPlayMusicLevel", 2133290622);
        setIntField(term36300, term36300.getClass(), "lastEmoneyBrand", -164869996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechMasterHighScore", argTypes, term36300, args);
    }

};


