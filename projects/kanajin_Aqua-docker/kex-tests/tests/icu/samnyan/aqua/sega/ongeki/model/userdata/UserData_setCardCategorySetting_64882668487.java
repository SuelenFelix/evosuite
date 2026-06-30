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

public class UserData_setCardCategorySetting_64882668487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58833;
     Object term59096;

    public UserData_setCardCategorySetting_64882668487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58837 = new Long(7495904023107549024L);
        term58833 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term58835 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term58851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58866 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term58833, term58833.getClass(), "id", -8767451917246862609L);
        setLongField(term58835, term58835.getClass(), "id", 1886820706698769775L);
        setField(term58835, term58835.getClass(), "extId", term58837);
        setField(term58835, term58835.getClass(), "luid", "ZsvLlzqETk");
        setIntField(term58852, term58852.getClass(), "year", 2020);
        setShortField(term58852, term58852.getClass(), "month", (short) 5);
        setShortField(term58852, term58852.getClass(), "day", (short) 31);
        setField(term58851, term58851.getClass(), "date", term58852);
        setByteField(term58856, term58856.getClass(), "hour", (byte) 17);
        setByteField(term58856, term58856.getClass(), "minute", (byte) 5);
        setByteField(term58856, term58856.getClass(), "second", (byte) 38);
        setIntField(term58856, term58856.getClass(), "nano", 709012300);
        setField(term58851, term58851.getClass(), "time", term58856);
        setField(term58835, term58835.getClass(), "registerTime", term58851);
        setIntField(term58862, term58862.getClass(), "year", 2021);
        setShortField(term58862, term58862.getClass(), "month", (short) 7);
        setShortField(term58862, term58862.getClass(), "day", (short) 6);
        setField(term58861, term58861.getClass(), "date", term58862);
        setByteField(term58866, term58866.getClass(), "hour", (byte) 12);
        setByteField(term58866, term58866.getClass(), "minute", (byte) 46);
        setByteField(term58866, term58866.getClass(), "second", (byte) 42);
        setIntField(term58866, term58866.getClass(), "nano", 512890850);
        setField(term58861, term58861.getClass(), "time", term58866);
        setField(term58835, term58835.getClass(), "accessTime", term58861);
        setField(term58833, term58833.getClass(), "card", term58835);
        setField(term58833, term58833.getClass(), "userName", "DqrZwuHriF");
        setIntField(term58833, term58833.getClass(), "level", 147233013);
        setIntField(term58833, term58833.getClass(), "reincarnationNum", -828376022);
        setLongField(term58833, term58833.getClass(), "exp", 8154151569172957467L);
        setLongField(term58833, term58833.getClass(), "point", -1835390437836814514L);
        setLongField(term58833, term58833.getClass(), "totalPoint", 5164274630708382393L);
        setIntField(term58833, term58833.getClass(), "playCount", -1133227278);
        setIntField(term58833, term58833.getClass(), "jewelCount", -1998106900);
        setIntField(term58833, term58833.getClass(), "totalJewelCount", -1628037152);
        setIntField(term58833, term58833.getClass(), "medalCount", -1550570392);
        setIntField(term58833, term58833.getClass(), "playerRating", -59951395);
        setIntField(term58833, term58833.getClass(), "highestRating", -294114307);
        setIntField(term58833, term58833.getClass(), "battlePoint", -745407686);
        setIntField(term58833, term58833.getClass(), "bestBattlePoint", -1183051462);
        setIntField(term58833, term58833.getClass(), "overDamageBattlePoint", -572029073);
        setBooleanField(term58833, term58833.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term58833, term58833.getClass(), "nameplateId", 1348271533);
        setIntField(term58833, term58833.getClass(), "trophyId", 1234771885);
        setIntField(term58833, term58833.getClass(), "cardId", 1821658782);
        setIntField(term58833, term58833.getClass(), "characterId", 871613900);
        setIntField(term58833, term58833.getClass(), "characterVoiceNo", 1322676409);
        setIntField(term58833, term58833.getClass(), "tabSetting", -954764876);
        setIntField(term58833, term58833.getClass(), "tabSortSetting", 1870177323);
        setIntField(term58833, term58833.getClass(), "cardCategorySetting", -1027146644);
        setIntField(term58833, term58833.getClass(), "cardSortSetting", 341013967);
        setIntField(term58833, term58833.getClass(), "rivalScoreCategorySetting", 1873439089);
        setIntField(term58833, term58833.getClass(), "playedTutorialBit", -1069668783);
        setIntField(term58833, term58833.getClass(), "firstTutorialCancelNum", -301450995);
        setLongField(term58833, term58833.getClass(), "sumTechHighScore", 4110746064383978605L);
        setLongField(term58833, term58833.getClass(), "sumTechBasicHighScore", 6102098033693999355L);
        setLongField(term58833, term58833.getClass(), "sumTechAdvancedHighScore", -3823857953281104599L);
        setLongField(term58833, term58833.getClass(), "sumTechExpertHighScore", 7198604597199389645L);
        setLongField(term58833, term58833.getClass(), "sumTechMasterHighScore", 5086825752167561926L);
        setLongField(term58833, term58833.getClass(), "sumTechLunaticHighScore", -4725887165801530567L);
        setLongField(term58833, term58833.getClass(), "sumBattleHighScore", 164578074703380846L);
        setLongField(term58833, term58833.getClass(), "sumBattleBasicHighScore", -2204297060614169845L);
        setLongField(term58833, term58833.getClass(), "sumBattleAdvancedHighScore", -4706256794979273095L);
        setLongField(term58833, term58833.getClass(), "sumBattleExpertHighScore", 7093662559318062264L);
        setLongField(term58833, term58833.getClass(), "sumBattleMasterHighScore", -2279010181902401809L);
        setLongField(term58833, term58833.getClass(), "sumBattleLunaticHighScore", 7042770535756514171L);
        setField(term58833, term58833.getClass(), "eventWatchedDate", "daaMmTkwOR");
        setField(term58833, term58833.getClass(), "cmEventWatchedDate", "WfJKDOFrUv");
        setField(term58833, term58833.getClass(), "firstGameId", "CbwfWaINrF");
        setField(term58833, term58833.getClass(), "firstRomVersion", "AVCzSfXhGU");
        setField(term58833, term58833.getClass(), "firstDataVersion", "nTUCmQGFDE");
        setField(term58833, term58833.getClass(), "firstPlayDate", "rfFTBanxEx");
        setField(term58833, term58833.getClass(), "lastGameId", "MQJTCGewxT");
        setField(term58833, term58833.getClass(), "lastRomVersion", "DRdgywxCcP");
        setField(term58833, term58833.getClass(), "lastDataVersion", "uelmUHzwnS");
        setField(term58833, term58833.getClass(), "compatibleCmVersion", "iKuSKqVzvy");
        setField(term58833, term58833.getClass(), "lastPlayDate", "SgyGAlytLF");
        setIntField(term58833, term58833.getClass(), "lastPlaceId", 753886838);
        setField(term58833, term58833.getClass(), "lastPlaceName", "OoXopVvpwr");
        setIntField(term58833, term58833.getClass(), "lastRegionId", -1802788931);
        setField(term58833, term58833.getClass(), "lastRegionName", "lwwreKJCFL");
        setIntField(term58833, term58833.getClass(), "lastAllNetId", 505497573);
        setField(term58833, term58833.getClass(), "lastClientId", "PWBggYjpOQ");
        setIntField(term58833, term58833.getClass(), "lastUsedDeckId", 1848062442);
        setIntField(term58833, term58833.getClass(), "lastPlayMusicLevel", -122481618);
        setIntField(term58833, term58833.getClass(), "lastEmoneyBrand", -82929535);
        term59096 = new Integer(1850505181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59096;
        callMethod(klass, "setCardCategorySetting", argTypes, term58833, args);
    }

};


