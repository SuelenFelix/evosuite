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

public class UserData_getBattlePoint_158360184014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27840;

    public UserData_getBattlePoint_158360184014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27844 = new Long(-1610676979013636850L);
        term27840 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term27842 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27873 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term27840, term27840.getClass(), "id", -5919044245258983254L);
        setLongField(term27842, term27842.getClass(), "id", 8229243567352210338L);
        setField(term27842, term27842.getClass(), "extId", term27844);
        setField(term27842, term27842.getClass(), "luid", "acPRDlpsid");
        setIntField(term27859, term27859.getClass(), "year", 2017);
        setShortField(term27859, term27859.getClass(), "month", (short) 6);
        setShortField(term27859, term27859.getClass(), "day", (short) 28);
        setField(term27858, term27858.getClass(), "date", term27859);
        setByteField(term27863, term27863.getClass(), "hour", (byte) 8);
        setByteField(term27863, term27863.getClass(), "minute", (byte) 1);
        setByteField(term27863, term27863.getClass(), "second", (byte) 14);
        setIntField(term27863, term27863.getClass(), "nano", 501033715);
        setField(term27858, term27858.getClass(), "time", term27863);
        setField(term27842, term27842.getClass(), "registerTime", term27858);
        setIntField(term27869, term27869.getClass(), "year", 2016);
        setShortField(term27869, term27869.getClass(), "month", (short) 10);
        setShortField(term27869, term27869.getClass(), "day", (short) 10);
        setField(term27868, term27868.getClass(), "date", term27869);
        setByteField(term27873, term27873.getClass(), "hour", (byte) 16);
        setByteField(term27873, term27873.getClass(), "minute", (byte) 7);
        setByteField(term27873, term27873.getClass(), "second", (byte) 16);
        setIntField(term27873, term27873.getClass(), "nano", 995200309);
        setField(term27868, term27868.getClass(), "time", term27873);
        setField(term27842, term27842.getClass(), "accessTime", term27868);
        setField(term27840, term27840.getClass(), "card", term27842);
        setField(term27840, term27840.getClass(), "userName", "YyojIzvxLZ");
        setIntField(term27840, term27840.getClass(), "level", 1176415280);
        setIntField(term27840, term27840.getClass(), "reincarnationNum", -1272714687);
        setLongField(term27840, term27840.getClass(), "exp", 1651638210050263261L);
        setLongField(term27840, term27840.getClass(), "point", -9187816361133186528L);
        setLongField(term27840, term27840.getClass(), "totalPoint", 7069791900685590489L);
        setIntField(term27840, term27840.getClass(), "playCount", -762778853);
        setIntField(term27840, term27840.getClass(), "jewelCount", 946727239);
        setIntField(term27840, term27840.getClass(), "totalJewelCount", 349182490);
        setIntField(term27840, term27840.getClass(), "medalCount", -353671511);
        setIntField(term27840, term27840.getClass(), "playerRating", 1598831363);
        setIntField(term27840, term27840.getClass(), "highestRating", -690367798);
        setIntField(term27840, term27840.getClass(), "battlePoint", 1863738073);
        setIntField(term27840, term27840.getClass(), "bestBattlePoint", 2009028243);
        setIntField(term27840, term27840.getClass(), "overDamageBattlePoint", 1900131331);
        setBooleanField(term27840, term27840.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term27840, term27840.getClass(), "nameplateId", -1489604464);
        setIntField(term27840, term27840.getClass(), "trophyId", 601642248);
        setIntField(term27840, term27840.getClass(), "cardId", -1186936928);
        setIntField(term27840, term27840.getClass(), "characterId", -315380004);
        setIntField(term27840, term27840.getClass(), "characterVoiceNo", -1945754843);
        setIntField(term27840, term27840.getClass(), "tabSetting", -1512221115);
        setIntField(term27840, term27840.getClass(), "tabSortSetting", -515486706);
        setIntField(term27840, term27840.getClass(), "cardCategorySetting", -612862488);
        setIntField(term27840, term27840.getClass(), "cardSortSetting", 52739905);
        setIntField(term27840, term27840.getClass(), "rivalScoreCategorySetting", -2105349391);
        setIntField(term27840, term27840.getClass(), "playedTutorialBit", -1176968921);
        setIntField(term27840, term27840.getClass(), "firstTutorialCancelNum", -1986225025);
        setLongField(term27840, term27840.getClass(), "sumTechHighScore", -5849408670992771988L);
        setLongField(term27840, term27840.getClass(), "sumTechBasicHighScore", 3210450133277104L);
        setLongField(term27840, term27840.getClass(), "sumTechAdvancedHighScore", 6637550433135455885L);
        setLongField(term27840, term27840.getClass(), "sumTechExpertHighScore", -5562622835440119601L);
        setLongField(term27840, term27840.getClass(), "sumTechMasterHighScore", 493485007607912369L);
        setLongField(term27840, term27840.getClass(), "sumTechLunaticHighScore", -8980424779299328600L);
        setLongField(term27840, term27840.getClass(), "sumBattleHighScore", -7229609748965405580L);
        setLongField(term27840, term27840.getClass(), "sumBattleBasicHighScore", 7507072654888524944L);
        setLongField(term27840, term27840.getClass(), "sumBattleAdvancedHighScore", 8778744391146217826L);
        setLongField(term27840, term27840.getClass(), "sumBattleExpertHighScore", 7377514870475587049L);
        setLongField(term27840, term27840.getClass(), "sumBattleMasterHighScore", 3437866678450547130L);
        setLongField(term27840, term27840.getClass(), "sumBattleLunaticHighScore", -2375099996964834173L);
        setField(term27840, term27840.getClass(), "eventWatchedDate", "fxapaYlZea");
        setField(term27840, term27840.getClass(), "cmEventWatchedDate", "VJgREHwfRM");
        setField(term27840, term27840.getClass(), "firstGameId", "kXnpLIZTAr");
        setField(term27840, term27840.getClass(), "firstRomVersion", "ZiMAmqpbzk");
        setField(term27840, term27840.getClass(), "firstDataVersion", "UwJtBPAtSU");
        setField(term27840, term27840.getClass(), "firstPlayDate", "nBaMiSdFmS");
        setField(term27840, term27840.getClass(), "lastGameId", "ezwGsjqTai");
        setField(term27840, term27840.getClass(), "lastRomVersion", "ngeHWMRjnn");
        setField(term27840, term27840.getClass(), "lastDataVersion", "FOKfDXQxMM");
        setField(term27840, term27840.getClass(), "compatibleCmVersion", "gbxMvhrWpA");
        setField(term27840, term27840.getClass(), "lastPlayDate", "huNTIobUHx");
        setIntField(term27840, term27840.getClass(), "lastPlaceId", -838689952);
        setField(term27840, term27840.getClass(), "lastPlaceName", "MrVeCmRVzF");
        setIntField(term27840, term27840.getClass(), "lastRegionId", -307464652);
        setField(term27840, term27840.getClass(), "lastRegionName", "CPVnQYACKw");
        setIntField(term27840, term27840.getClass(), "lastAllNetId", 460605690);
        setField(term27840, term27840.getClass(), "lastClientId", "sbdLhVCRsw");
        setIntField(term27840, term27840.getClass(), "lastUsedDeckId", 2119231643);
        setIntField(term27840, term27840.getClass(), "lastPlayMusicLevel", 688546450);
        setIntField(term27840, term27840.getClass(), "lastEmoneyBrand", 115635779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattlePoint", argTypes, term27840, args);
    }

};


