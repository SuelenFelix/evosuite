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

public class UserTechCount_canEqual_199182524812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367253;
     Object term367521;

    public UserTechCount_canEqual_199182524812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term367259 = new Long(-4507768716367203234L);
        term367253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount"));
        Object term367255 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term367257 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term367273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term367274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term367278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term367283 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term367284 = newInstance(Class.forName("java.time.LocalDate"));
        Object term367288 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term367253, term367253.getClass(), "id", 3971625546186250215L);
        setLongField(term367255, term367255.getClass(), "id", 4655689844468197418L);
        setLongField(term367257, term367257.getClass(), "id", -5927296037995423142L);
        setField(term367257, term367257.getClass(), "extId", term367259);
        setField(term367257, term367257.getClass(), "luid", "jESyGLSaom");
        setIntField(term367274, term367274.getClass(), "year", 2011);
        setShortField(term367274, term367274.getClass(), "month", (short) 11);
        setShortField(term367274, term367274.getClass(), "day", (short) 11);
        setField(term367273, term367273.getClass(), "date", term367274);
        setByteField(term367278, term367278.getClass(), "hour", (byte) 9);
        setByteField(term367278, term367278.getClass(), "minute", (byte) 8);
        setByteField(term367278, term367278.getClass(), "second", (byte) 12);
        setIntField(term367278, term367278.getClass(), "nano", 285984981);
        setField(term367273, term367273.getClass(), "time", term367278);
        setField(term367257, term367257.getClass(), "registerTime", term367273);
        setIntField(term367284, term367284.getClass(), "year", 2027);
        setShortField(term367284, term367284.getClass(), "month", (short) 10);
        setShortField(term367284, term367284.getClass(), "day", (short) 17);
        setField(term367283, term367283.getClass(), "date", term367284);
        setByteField(term367288, term367288.getClass(), "hour", (byte) 3);
        setByteField(term367288, term367288.getClass(), "minute", (byte) 39);
        setByteField(term367288, term367288.getClass(), "second", (byte) 47);
        setIntField(term367288, term367288.getClass(), "nano", 565585874);
        setField(term367283, term367283.getClass(), "time", term367288);
        setField(term367257, term367257.getClass(), "accessTime", term367283);
        setField(term367255, term367255.getClass(), "card", term367257);
        setField(term367255, term367255.getClass(), "userName", "IFIxLPsttX");
        setIntField(term367255, term367255.getClass(), "level", -1622120453);
        setIntField(term367255, term367255.getClass(), "reincarnationNum", -1101912487);
        setLongField(term367255, term367255.getClass(), "exp", -2165548803673657409L);
        setLongField(term367255, term367255.getClass(), "point", 138871701373594304L);
        setLongField(term367255, term367255.getClass(), "totalPoint", 6260739391760253299L);
        setIntField(term367255, term367255.getClass(), "playCount", -224199100);
        setIntField(term367255, term367255.getClass(), "jewelCount", -1531675655);
        setIntField(term367255, term367255.getClass(), "totalJewelCount", 493450423);
        setIntField(term367255, term367255.getClass(), "medalCount", 84926910);
        setIntField(term367255, term367255.getClass(), "playerRating", 1746519231);
        setIntField(term367255, term367255.getClass(), "highestRating", -235502828);
        setIntField(term367255, term367255.getClass(), "battlePoint", -2056707780);
        setIntField(term367255, term367255.getClass(), "bestBattlePoint", -200251233);
        setIntField(term367255, term367255.getClass(), "overDamageBattlePoint", 1696161346);
        setBooleanField(term367255, term367255.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term367255, term367255.getClass(), "nameplateId", 2043344110);
        setIntField(term367255, term367255.getClass(), "trophyId", 1175579475);
        setIntField(term367255, term367255.getClass(), "cardId", -1861349788);
        setIntField(term367255, term367255.getClass(), "characterId", -2062498594);
        setIntField(term367255, term367255.getClass(), "characterVoiceNo", 1063882635);
        setIntField(term367255, term367255.getClass(), "tabSetting", -214400242);
        setIntField(term367255, term367255.getClass(), "tabSortSetting", 615997221);
        setIntField(term367255, term367255.getClass(), "cardCategorySetting", -1437307091);
        setIntField(term367255, term367255.getClass(), "cardSortSetting", 1971598263);
        setIntField(term367255, term367255.getClass(), "rivalScoreCategorySetting", -924377568);
        setIntField(term367255, term367255.getClass(), "playedTutorialBit", 1996952172);
        setIntField(term367255, term367255.getClass(), "firstTutorialCancelNum", 2019345867);
        setLongField(term367255, term367255.getClass(), "sumTechHighScore", -4104204291253225784L);
        setLongField(term367255, term367255.getClass(), "sumTechBasicHighScore", 5768296391353467504L);
        setLongField(term367255, term367255.getClass(), "sumTechAdvancedHighScore", 2356299915702702061L);
        setLongField(term367255, term367255.getClass(), "sumTechExpertHighScore", -421297597845072001L);
        setLongField(term367255, term367255.getClass(), "sumTechMasterHighScore", 6692630236231399348L);
        setLongField(term367255, term367255.getClass(), "sumTechLunaticHighScore", -7448851179069664015L);
        setLongField(term367255, term367255.getClass(), "sumBattleHighScore", -4814300074338522062L);
        setLongField(term367255, term367255.getClass(), "sumBattleBasicHighScore", 5336244954668468419L);
        setLongField(term367255, term367255.getClass(), "sumBattleAdvancedHighScore", 7426589827624073425L);
        setLongField(term367255, term367255.getClass(), "sumBattleExpertHighScore", 1474697738701226748L);
        setLongField(term367255, term367255.getClass(), "sumBattleMasterHighScore", 3649275930561204050L);
        setLongField(term367255, term367255.getClass(), "sumBattleLunaticHighScore", 9080701961633185882L);
        setField(term367255, term367255.getClass(), "eventWatchedDate", "KayCcpFesM");
        setField(term367255, term367255.getClass(), "cmEventWatchedDate", "XVSBRgQQgL");
        setField(term367255, term367255.getClass(), "firstGameId", "pYMjdJOHNj");
        setField(term367255, term367255.getClass(), "firstRomVersion", "kqyAvdVMrZ");
        setField(term367255, term367255.getClass(), "firstDataVersion", "mawPGgkwQY");
        setField(term367255, term367255.getClass(), "firstPlayDate", "dBmhFEOBha");
        setField(term367255, term367255.getClass(), "lastGameId", "TcgcnHZoAw");
        setField(term367255, term367255.getClass(), "lastRomVersion", "wMuBmjZFWJ");
        setField(term367255, term367255.getClass(), "lastDataVersion", "yidOYxCzaF");
        setField(term367255, term367255.getClass(), "compatibleCmVersion", "fAIiyNXvbk");
        setField(term367255, term367255.getClass(), "lastPlayDate", "GifpbbREHt");
        setIntField(term367255, term367255.getClass(), "lastPlaceId", -2024464529);
        setField(term367255, term367255.getClass(), "lastPlaceName", "NcawrazChV");
        setIntField(term367255, term367255.getClass(), "lastRegionId", -619565976);
        setField(term367255, term367255.getClass(), "lastRegionName", "pltFaROPIz");
        setIntField(term367255, term367255.getClass(), "lastAllNetId", 1239541310);
        setField(term367255, term367255.getClass(), "lastClientId", "aseVSmVnWP");
        setIntField(term367255, term367255.getClass(), "lastUsedDeckId", -1150157819);
        setIntField(term367255, term367255.getClass(), "lastPlayMusicLevel", 2137778816);
        setIntField(term367255, term367255.getClass(), "lastEmoneyBrand", 621494734);
        setField(term367253, term367253.getClass(), "user", term367255);
        setIntField(term367253, term367253.getClass(), "levelId", -1836538276);
        setIntField(term367253, term367253.getClass(), "allBreakCount", -76529712);
        setIntField(term367253, term367253.getClass(), "allBreakPlusCount", -1791284882);
        term367521 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechCount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term367521;
        callMethod(klass, "canEqual", argTypes, term367253, args);
    }

};


