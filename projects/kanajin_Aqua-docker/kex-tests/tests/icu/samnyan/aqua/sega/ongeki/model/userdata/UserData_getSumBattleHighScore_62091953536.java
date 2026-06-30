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

public class UserData_getSumBattleHighScore_62091953536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37146;

    public UserData_getSumBattleHighScore_62091953536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37150 = new Long(2701184207686293431L);
        term37146 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term37148 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term37164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37169 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37179 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37146, term37146.getClass(), "id", 590621623960257295L);
        setLongField(term37148, term37148.getClass(), "id", -3940823299046887533L);
        setField(term37148, term37148.getClass(), "extId", term37150);
        setField(term37148, term37148.getClass(), "luid", "PECfBejlfo");
        setIntField(term37165, term37165.getClass(), "year", 2020);
        setShortField(term37165, term37165.getClass(), "month", (short) 2);
        setShortField(term37165, term37165.getClass(), "day", (short) 1);
        setField(term37164, term37164.getClass(), "date", term37165);
        setByteField(term37169, term37169.getClass(), "hour", (byte) 0);
        setByteField(term37169, term37169.getClass(), "minute", (byte) 46);
        setByteField(term37169, term37169.getClass(), "second", (byte) 1);
        setIntField(term37169, term37169.getClass(), "nano", 544722812);
        setField(term37164, term37164.getClass(), "time", term37169);
        setField(term37148, term37148.getClass(), "registerTime", term37164);
        setIntField(term37175, term37175.getClass(), "year", 2027);
        setShortField(term37175, term37175.getClass(), "month", (short) 8);
        setShortField(term37175, term37175.getClass(), "day", (short) 16);
        setField(term37174, term37174.getClass(), "date", term37175);
        setByteField(term37179, term37179.getClass(), "hour", (byte) 15);
        setByteField(term37179, term37179.getClass(), "minute", (byte) 1);
        setByteField(term37179, term37179.getClass(), "second", (byte) 18);
        setIntField(term37179, term37179.getClass(), "nano", 245350825);
        setField(term37174, term37174.getClass(), "time", term37179);
        setField(term37148, term37148.getClass(), "accessTime", term37174);
        setField(term37146, term37146.getClass(), "card", term37148);
        setField(term37146, term37146.getClass(), "userName", "SDbDgydVpg");
        setIntField(term37146, term37146.getClass(), "level", 2119043046);
        setIntField(term37146, term37146.getClass(), "reincarnationNum", 375507053);
        setLongField(term37146, term37146.getClass(), "exp", 1916346681449508616L);
        setLongField(term37146, term37146.getClass(), "point", 8115348150286567116L);
        setLongField(term37146, term37146.getClass(), "totalPoint", 6549453781602844135L);
        setIntField(term37146, term37146.getClass(), "playCount", 1803067672);
        setIntField(term37146, term37146.getClass(), "jewelCount", -844822506);
        setIntField(term37146, term37146.getClass(), "totalJewelCount", -586687174);
        setIntField(term37146, term37146.getClass(), "medalCount", 583343799);
        setIntField(term37146, term37146.getClass(), "playerRating", 1831635466);
        setIntField(term37146, term37146.getClass(), "highestRating", -981606069);
        setIntField(term37146, term37146.getClass(), "battlePoint", 548729456);
        setIntField(term37146, term37146.getClass(), "bestBattlePoint", 482026097);
        setIntField(term37146, term37146.getClass(), "overDamageBattlePoint", -528954009);
        setBooleanField(term37146, term37146.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term37146, term37146.getClass(), "nameplateId", -918570985);
        setIntField(term37146, term37146.getClass(), "trophyId", 242181753);
        setIntField(term37146, term37146.getClass(), "cardId", -1356117545);
        setIntField(term37146, term37146.getClass(), "characterId", -1539896141);
        setIntField(term37146, term37146.getClass(), "characterVoiceNo", 798480099);
        setIntField(term37146, term37146.getClass(), "tabSetting", -1624038595);
        setIntField(term37146, term37146.getClass(), "tabSortSetting", 1593619323);
        setIntField(term37146, term37146.getClass(), "cardCategorySetting", -232601868);
        setIntField(term37146, term37146.getClass(), "cardSortSetting", -1743056588);
        setIntField(term37146, term37146.getClass(), "rivalScoreCategorySetting", 576646846);
        setIntField(term37146, term37146.getClass(), "playedTutorialBit", 916507296);
        setIntField(term37146, term37146.getClass(), "firstTutorialCancelNum", 1307887729);
        setLongField(term37146, term37146.getClass(), "sumTechHighScore", -7858384696957926965L);
        setLongField(term37146, term37146.getClass(), "sumTechBasicHighScore", -7639406314873940496L);
        setLongField(term37146, term37146.getClass(), "sumTechAdvancedHighScore", -5550345592284314693L);
        setLongField(term37146, term37146.getClass(), "sumTechExpertHighScore", -5478680438603251116L);
        setLongField(term37146, term37146.getClass(), "sumTechMasterHighScore", 3362279702053141081L);
        setLongField(term37146, term37146.getClass(), "sumTechLunaticHighScore", -58248142535266417L);
        setLongField(term37146, term37146.getClass(), "sumBattleHighScore", 370832762515262203L);
        setLongField(term37146, term37146.getClass(), "sumBattleBasicHighScore", 6931806194311088657L);
        setLongField(term37146, term37146.getClass(), "sumBattleAdvancedHighScore", -6104317529539097644L);
        setLongField(term37146, term37146.getClass(), "sumBattleExpertHighScore", 4456551328322151200L);
        setLongField(term37146, term37146.getClass(), "sumBattleMasterHighScore", 6700719103019158902L);
        setLongField(term37146, term37146.getClass(), "sumBattleLunaticHighScore", 4224749228659425276L);
        setField(term37146, term37146.getClass(), "eventWatchedDate", "EEMaiNkiOH");
        setField(term37146, term37146.getClass(), "cmEventWatchedDate", "sFdmTylvqh");
        setField(term37146, term37146.getClass(), "firstGameId", "rgniLaOaiz");
        setField(term37146, term37146.getClass(), "firstRomVersion", "fzQzzdIOMC");
        setField(term37146, term37146.getClass(), "firstDataVersion", "hLVDOhfCKX");
        setField(term37146, term37146.getClass(), "firstPlayDate", "yXLTfzOgfX");
        setField(term37146, term37146.getClass(), "lastGameId", "MANlfBKTPY");
        setField(term37146, term37146.getClass(), "lastRomVersion", "mRoEmuCJhW");
        setField(term37146, term37146.getClass(), "lastDataVersion", "JJUWbMXpyM");
        setField(term37146, term37146.getClass(), "compatibleCmVersion", "KDrRQWVXok");
        setField(term37146, term37146.getClass(), "lastPlayDate", "oOOwvWgxtf");
        setIntField(term37146, term37146.getClass(), "lastPlaceId", 1628336669);
        setField(term37146, term37146.getClass(), "lastPlaceName", "ywoADeiUfF");
        setIntField(term37146, term37146.getClass(), "lastRegionId", 466807421);
        setField(term37146, term37146.getClass(), "lastRegionName", "loHiudJxbt");
        setIntField(term37146, term37146.getClass(), "lastAllNetId", -407675703);
        setField(term37146, term37146.getClass(), "lastClientId", "lRbxbybNew");
        setIntField(term37146, term37146.getClass(), "lastUsedDeckId", -429960516);
        setIntField(term37146, term37146.getClass(), "lastPlayMusicLevel", -630727180);
        setIntField(term37146, term37146.getClass(), "lastEmoneyBrand", -1234361060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleHighScore", argTypes, term37146, args);
    }

};


