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

public class UserMissionPoint_canEqual_125510559310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11164;
     Object term11431;

    public UserMissionPoint_canEqual_125510559310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11170 = new Long(-7672528020740371001L);
        term11164 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term11166 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term11168 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term11184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11189 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11199 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term11164, term11164.getClass(), "id", -4663904610228258188L);
        setLongField(term11166, term11166.getClass(), "id", 3824691451696451167L);
        setLongField(term11168, term11168.getClass(), "id", -6237686742902369498L);
        setField(term11168, term11168.getClass(), "extId", term11170);
        setField(term11168, term11168.getClass(), "luid", "UimMMORkzd");
        setIntField(term11185, term11185.getClass(), "year", 2011);
        setShortField(term11185, term11185.getClass(), "month", (short) 6);
        setShortField(term11185, term11185.getClass(), "day", (short) 26);
        setField(term11184, term11184.getClass(), "date", term11185);
        setByteField(term11189, term11189.getClass(), "hour", (byte) 22);
        setByteField(term11189, term11189.getClass(), "minute", (byte) 39);
        setByteField(term11189, term11189.getClass(), "second", (byte) 11);
        setIntField(term11189, term11189.getClass(), "nano", 686293604);
        setField(term11184, term11184.getClass(), "time", term11189);
        setField(term11168, term11168.getClass(), "registerTime", term11184);
        setIntField(term11195, term11195.getClass(), "year", 2012);
        setShortField(term11195, term11195.getClass(), "month", (short) 7);
        setShortField(term11195, term11195.getClass(), "day", (short) 21);
        setField(term11194, term11194.getClass(), "date", term11195);
        setByteField(term11199, term11199.getClass(), "hour", (byte) 13);
        setByteField(term11199, term11199.getClass(), "minute", (byte) 41);
        setByteField(term11199, term11199.getClass(), "second", (byte) 44);
        setIntField(term11199, term11199.getClass(), "nano", 394467282);
        setField(term11194, term11194.getClass(), "time", term11199);
        setField(term11168, term11168.getClass(), "accessTime", term11194);
        setField(term11166, term11166.getClass(), "card", term11168);
        setField(term11166, term11166.getClass(), "userName", "huVIXUWLtI");
        setIntField(term11166, term11166.getClass(), "level", -98060427);
        setIntField(term11166, term11166.getClass(), "reincarnationNum", -1272268399);
        setLongField(term11166, term11166.getClass(), "exp", -2286229228641472715L);
        setLongField(term11166, term11166.getClass(), "point", 7464122056779140588L);
        setLongField(term11166, term11166.getClass(), "totalPoint", 6542357174275680335L);
        setIntField(term11166, term11166.getClass(), "playCount", 1120271104);
        setIntField(term11166, term11166.getClass(), "jewelCount", -128435804);
        setIntField(term11166, term11166.getClass(), "totalJewelCount", 2136158480);
        setIntField(term11166, term11166.getClass(), "medalCount", 2118747457);
        setIntField(term11166, term11166.getClass(), "playerRating", 1868344256);
        setIntField(term11166, term11166.getClass(), "highestRating", 1857693976);
        setIntField(term11166, term11166.getClass(), "battlePoint", 1631305277);
        setIntField(term11166, term11166.getClass(), "bestBattlePoint", 162113491);
        setIntField(term11166, term11166.getClass(), "overDamageBattlePoint", -932147928);
        setBooleanField(term11166, term11166.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term11166, term11166.getClass(), "nameplateId", 487369012);
        setIntField(term11166, term11166.getClass(), "trophyId", -179238712);
        setIntField(term11166, term11166.getClass(), "cardId", -2018735535);
        setIntField(term11166, term11166.getClass(), "characterId", -658524954);
        setIntField(term11166, term11166.getClass(), "characterVoiceNo", -2009613557);
        setIntField(term11166, term11166.getClass(), "tabSetting", 654195547);
        setIntField(term11166, term11166.getClass(), "tabSortSetting", 1622857008);
        setIntField(term11166, term11166.getClass(), "cardCategorySetting", 934338954);
        setIntField(term11166, term11166.getClass(), "cardSortSetting", 598635505);
        setIntField(term11166, term11166.getClass(), "rivalScoreCategorySetting", -944986533);
        setIntField(term11166, term11166.getClass(), "playedTutorialBit", 1894454926);
        setIntField(term11166, term11166.getClass(), "firstTutorialCancelNum", 1415142780);
        setLongField(term11166, term11166.getClass(), "sumTechHighScore", 206360660645917003L);
        setLongField(term11166, term11166.getClass(), "sumTechBasicHighScore", 8680715663951713735L);
        setLongField(term11166, term11166.getClass(), "sumTechAdvancedHighScore", -4905558793519537969L);
        setLongField(term11166, term11166.getClass(), "sumTechExpertHighScore", 4354242424632479389L);
        setLongField(term11166, term11166.getClass(), "sumTechMasterHighScore", -4146453776626172590L);
        setLongField(term11166, term11166.getClass(), "sumTechLunaticHighScore", -5876259280451647338L);
        setLongField(term11166, term11166.getClass(), "sumBattleHighScore", -4562564710769146498L);
        setLongField(term11166, term11166.getClass(), "sumBattleBasicHighScore", -6254265799185295775L);
        setLongField(term11166, term11166.getClass(), "sumBattleAdvancedHighScore", 3831994970480278159L);
        setLongField(term11166, term11166.getClass(), "sumBattleExpertHighScore", -5714578622746827780L);
        setLongField(term11166, term11166.getClass(), "sumBattleMasterHighScore", 8918129626022907229L);
        setLongField(term11166, term11166.getClass(), "sumBattleLunaticHighScore", 6269054578518955349L);
        setField(term11166, term11166.getClass(), "eventWatchedDate", "vhKzFyKPOT");
        setField(term11166, term11166.getClass(), "cmEventWatchedDate", "nQhIgWXdRc");
        setField(term11166, term11166.getClass(), "firstGameId", "EusenEbIoF");
        setField(term11166, term11166.getClass(), "firstRomVersion", "SScVQYSvWH");
        setField(term11166, term11166.getClass(), "firstDataVersion", "MnovcqFhCl");
        setField(term11166, term11166.getClass(), "firstPlayDate", "qYtAeLzOhW");
        setField(term11166, term11166.getClass(), "lastGameId", "tJzmOfcUnY");
        setField(term11166, term11166.getClass(), "lastRomVersion", "TKlccZUpjz");
        setField(term11166, term11166.getClass(), "lastDataVersion", "GGzwMoHZXC");
        setField(term11166, term11166.getClass(), "compatibleCmVersion", "IpmgwHTgnG");
        setField(term11166, term11166.getClass(), "lastPlayDate", "tIpkeYIezR");
        setIntField(term11166, term11166.getClass(), "lastPlaceId", -574105759);
        setField(term11166, term11166.getClass(), "lastPlaceName", "YkZtEtthvz");
        setIntField(term11166, term11166.getClass(), "lastRegionId", -1165271567);
        setField(term11166, term11166.getClass(), "lastRegionName", "dwlZSxlXOo");
        setIntField(term11166, term11166.getClass(), "lastAllNetId", 376834234);
        setField(term11166, term11166.getClass(), "lastClientId", "lKrEAkypza");
        setIntField(term11166, term11166.getClass(), "lastUsedDeckId", -1911972560);
        setIntField(term11166, term11166.getClass(), "lastPlayMusicLevel", -642716895);
        setIntField(term11166, term11166.getClass(), "lastEmoneyBrand", 1743398246);
        setField(term11164, term11164.getClass(), "user", term11166);
        setIntField(term11164, term11164.getClass(), "eventId", -934658823);
        setLongField(term11164, term11164.getClass(), "point", -143609946830350439L);
        term11431 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11431;
        callMethod(klass, "canEqual", argTypes, term11164, args);
    }

};


