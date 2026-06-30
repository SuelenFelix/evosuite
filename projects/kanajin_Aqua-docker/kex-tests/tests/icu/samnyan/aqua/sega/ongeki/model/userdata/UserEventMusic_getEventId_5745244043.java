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

public class UserEventMusic_getEventId_5745244043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370386;

    public UserEventMusic_getEventId_5745244043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term370392 = new Long(-7087265016767824631L);
        term370386 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term370388 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term370390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term370406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term370407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term370411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term370416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term370417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term370421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term370386, term370386.getClass(), "id", -1611471482067020256L);
        setLongField(term370388, term370388.getClass(), "id", -3910913382502420872L);
        setLongField(term370390, term370390.getClass(), "id", -6962883351915495210L);
        setField(term370390, term370390.getClass(), "extId", term370392);
        setField(term370390, term370390.getClass(), "luid", "cOBOEHUNtr");
        setIntField(term370407, term370407.getClass(), "year", 2019);
        setShortField(term370407, term370407.getClass(), "month", (short) 4);
        setShortField(term370407, term370407.getClass(), "day", (short) 16);
        setField(term370406, term370406.getClass(), "date", term370407);
        setByteField(term370411, term370411.getClass(), "hour", (byte) 11);
        setByteField(term370411, term370411.getClass(), "minute", (byte) 11);
        setByteField(term370411, term370411.getClass(), "second", (byte) 50);
        setIntField(term370411, term370411.getClass(), "nano", 334265252);
        setField(term370406, term370406.getClass(), "time", term370411);
        setField(term370390, term370390.getClass(), "registerTime", term370406);
        setIntField(term370417, term370417.getClass(), "year", 2023);
        setShortField(term370417, term370417.getClass(), "month", (short) 11);
        setShortField(term370417, term370417.getClass(), "day", (short) 28);
        setField(term370416, term370416.getClass(), "date", term370417);
        setByteField(term370421, term370421.getClass(), "hour", (byte) 18);
        setByteField(term370421, term370421.getClass(), "minute", (byte) 47);
        setByteField(term370421, term370421.getClass(), "second", (byte) 5);
        setIntField(term370421, term370421.getClass(), "nano", 872817342);
        setField(term370416, term370416.getClass(), "time", term370421);
        setField(term370390, term370390.getClass(), "accessTime", term370416);
        setField(term370388, term370388.getClass(), "card", term370390);
        setField(term370388, term370388.getClass(), "userName", "KlridfxkHE");
        setIntField(term370388, term370388.getClass(), "level", 1830416061);
        setIntField(term370388, term370388.getClass(), "reincarnationNum", -680528169);
        setLongField(term370388, term370388.getClass(), "exp", -1135910498702950297L);
        setLongField(term370388, term370388.getClass(), "point", -7133102079263856734L);
        setLongField(term370388, term370388.getClass(), "totalPoint", 1451487566004597238L);
        setIntField(term370388, term370388.getClass(), "playCount", 381921768);
        setIntField(term370388, term370388.getClass(), "jewelCount", 390522986);
        setIntField(term370388, term370388.getClass(), "totalJewelCount", -1538165829);
        setIntField(term370388, term370388.getClass(), "medalCount", -1795451181);
        setIntField(term370388, term370388.getClass(), "playerRating", -2020804950);
        setIntField(term370388, term370388.getClass(), "highestRating", -1376499575);
        setIntField(term370388, term370388.getClass(), "battlePoint", -1823925405);
        setIntField(term370388, term370388.getClass(), "bestBattlePoint", -1515509597);
        setIntField(term370388, term370388.getClass(), "overDamageBattlePoint", -455672217);
        setBooleanField(term370388, term370388.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term370388, term370388.getClass(), "nameplateId", -2142694832);
        setIntField(term370388, term370388.getClass(), "trophyId", 1909640071);
        setIntField(term370388, term370388.getClass(), "cardId", -660511985);
        setIntField(term370388, term370388.getClass(), "characterId", -715608910);
        setIntField(term370388, term370388.getClass(), "characterVoiceNo", 1277008130);
        setIntField(term370388, term370388.getClass(), "tabSetting", -1089832030);
        setIntField(term370388, term370388.getClass(), "tabSortSetting", 266106846);
        setIntField(term370388, term370388.getClass(), "cardCategorySetting", 1991430774);
        setIntField(term370388, term370388.getClass(), "cardSortSetting", 1310033471);
        setIntField(term370388, term370388.getClass(), "rivalScoreCategorySetting", 529038653);
        setIntField(term370388, term370388.getClass(), "playedTutorialBit", 2094579303);
        setIntField(term370388, term370388.getClass(), "firstTutorialCancelNum", -329007371);
        setLongField(term370388, term370388.getClass(), "sumTechHighScore", -2855481006059072219L);
        setLongField(term370388, term370388.getClass(), "sumTechBasicHighScore", -8156691375553208928L);
        setLongField(term370388, term370388.getClass(), "sumTechAdvancedHighScore", -2482062630874807400L);
        setLongField(term370388, term370388.getClass(), "sumTechExpertHighScore", 3521554323006794406L);
        setLongField(term370388, term370388.getClass(), "sumTechMasterHighScore", -3915622337189931979L);
        setLongField(term370388, term370388.getClass(), "sumTechLunaticHighScore", -8891976073521500910L);
        setLongField(term370388, term370388.getClass(), "sumBattleHighScore", -7672436442741270315L);
        setLongField(term370388, term370388.getClass(), "sumBattleBasicHighScore", -3174706274710994440L);
        setLongField(term370388, term370388.getClass(), "sumBattleAdvancedHighScore", -3403816675561106470L);
        setLongField(term370388, term370388.getClass(), "sumBattleExpertHighScore", 5745408816928451583L);
        setLongField(term370388, term370388.getClass(), "sumBattleMasterHighScore", 202728492239016526L);
        setLongField(term370388, term370388.getClass(), "sumBattleLunaticHighScore", 7027642032566924319L);
        setField(term370388, term370388.getClass(), "eventWatchedDate", "cnsKxKBeIL");
        setField(term370388, term370388.getClass(), "cmEventWatchedDate", "wuuwhbZnIf");
        setField(term370388, term370388.getClass(), "firstGameId", "gsssaGAxkG");
        setField(term370388, term370388.getClass(), "firstRomVersion", "BPAgxwADzs");
        setField(term370388, term370388.getClass(), "firstDataVersion", "AXbEknZQal");
        setField(term370388, term370388.getClass(), "firstPlayDate", "CikvEVxAwN");
        setField(term370388, term370388.getClass(), "lastGameId", "eXdIVEadak");
        setField(term370388, term370388.getClass(), "lastRomVersion", "shrssrqLCu");
        setField(term370388, term370388.getClass(), "lastDataVersion", "YVkCJXYvcs");
        setField(term370388, term370388.getClass(), "compatibleCmVersion", "LSuzDzzkRF");
        setField(term370388, term370388.getClass(), "lastPlayDate", "UpZNaBLJck");
        setIntField(term370388, term370388.getClass(), "lastPlaceId", -2105435975);
        setField(term370388, term370388.getClass(), "lastPlaceName", "SzyaMGYSKf");
        setIntField(term370388, term370388.getClass(), "lastRegionId", -1262131564);
        setField(term370388, term370388.getClass(), "lastRegionName", "eTCSYKLsdP");
        setIntField(term370388, term370388.getClass(), "lastAllNetId", 572191592);
        setField(term370388, term370388.getClass(), "lastClientId", "UzEeKtsLXK");
        setIntField(term370388, term370388.getClass(), "lastUsedDeckId", 1819075854);
        setIntField(term370388, term370388.getClass(), "lastPlayMusicLevel", 756161070);
        setIntField(term370388, term370388.getClass(), "lastEmoneyBrand", -1895857287);
        setField(term370386, term370386.getClass(), "user", term370388);
        setIntField(term370386, term370386.getClass(), "eventId", 1065230869);
        setIntField(term370386, term370386.getClass(), "type", -1839787842);
        setIntField(term370386, term370386.getClass(), "musicId", -949600111);
        setIntField(term370386, term370386.getClass(), "level", -980684681);
        setIntField(term370386, term370386.getClass(), "techScoreMax", -934376844);
        setIntField(term370386, term370386.getClass(), "platinumScoreMax", 17166568);
        setField(term370386, term370386.getClass(), "techRecordDate", "DGEFqUrMDr");
        setBooleanField(term370386, term370386.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term370386, args);
    }

};


