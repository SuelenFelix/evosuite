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

public class UserData_getSumTechExpertHighScore_199291829533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35877;

    public UserData_getSumTechExpertHighScore_199291829533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35881 = new Long(-1983291584002806658L);
        term35877 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term35879 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35910 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35877, term35877.getClass(), "id", 2969840922415466505L);
        setLongField(term35879, term35879.getClass(), "id", 59088120026756366L);
        setField(term35879, term35879.getClass(), "extId", term35881);
        setField(term35879, term35879.getClass(), "luid", "gDGZwlpOZx");
        setIntField(term35896, term35896.getClass(), "year", 2029);
        setShortField(term35896, term35896.getClass(), "month", (short) 11);
        setShortField(term35896, term35896.getClass(), "day", (short) 8);
        setField(term35895, term35895.getClass(), "date", term35896);
        setByteField(term35900, term35900.getClass(), "hour", (byte) 23);
        setByteField(term35900, term35900.getClass(), "minute", (byte) 43);
        setByteField(term35900, term35900.getClass(), "second", (byte) 12);
        setIntField(term35900, term35900.getClass(), "nano", 586227255);
        setField(term35895, term35895.getClass(), "time", term35900);
        setField(term35879, term35879.getClass(), "registerTime", term35895);
        setIntField(term35906, term35906.getClass(), "year", 2014);
        setShortField(term35906, term35906.getClass(), "month", (short) 1);
        setShortField(term35906, term35906.getClass(), "day", (short) 23);
        setField(term35905, term35905.getClass(), "date", term35906);
        setByteField(term35910, term35910.getClass(), "hour", (byte) 19);
        setByteField(term35910, term35910.getClass(), "minute", (byte) 52);
        setByteField(term35910, term35910.getClass(), "second", (byte) 9);
        setIntField(term35910, term35910.getClass(), "nano", 235326975);
        setField(term35905, term35905.getClass(), "time", term35910);
        setField(term35879, term35879.getClass(), "accessTime", term35905);
        setField(term35877, term35877.getClass(), "card", term35879);
        setField(term35877, term35877.getClass(), "userName", "gkDpxkHPDg");
        setIntField(term35877, term35877.getClass(), "level", 968035207);
        setIntField(term35877, term35877.getClass(), "reincarnationNum", -643589717);
        setLongField(term35877, term35877.getClass(), "exp", 6233688650098278772L);
        setLongField(term35877, term35877.getClass(), "point", 1825930100036048086L);
        setLongField(term35877, term35877.getClass(), "totalPoint", -2725312432196215741L);
        setIntField(term35877, term35877.getClass(), "playCount", -1599482698);
        setIntField(term35877, term35877.getClass(), "jewelCount", -370600915);
        setIntField(term35877, term35877.getClass(), "totalJewelCount", -311572875);
        setIntField(term35877, term35877.getClass(), "medalCount", 355595594);
        setIntField(term35877, term35877.getClass(), "playerRating", 842697786);
        setIntField(term35877, term35877.getClass(), "highestRating", 1685808201);
        setIntField(term35877, term35877.getClass(), "battlePoint", 1565114969);
        setIntField(term35877, term35877.getClass(), "bestBattlePoint", 806831765);
        setIntField(term35877, term35877.getClass(), "overDamageBattlePoint", -1445658721);
        setBooleanField(term35877, term35877.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term35877, term35877.getClass(), "nameplateId", 872435483);
        setIntField(term35877, term35877.getClass(), "trophyId", 110611143);
        setIntField(term35877, term35877.getClass(), "cardId", 793381056);
        setIntField(term35877, term35877.getClass(), "characterId", 65007514);
        setIntField(term35877, term35877.getClass(), "characterVoiceNo", 1731844126);
        setIntField(term35877, term35877.getClass(), "tabSetting", -861962061);
        setIntField(term35877, term35877.getClass(), "tabSortSetting", -1867124507);
        setIntField(term35877, term35877.getClass(), "cardCategorySetting", 416116291);
        setIntField(term35877, term35877.getClass(), "cardSortSetting", 1104795023);
        setIntField(term35877, term35877.getClass(), "rivalScoreCategorySetting", -1833777337);
        setIntField(term35877, term35877.getClass(), "playedTutorialBit", -2068333492);
        setIntField(term35877, term35877.getClass(), "firstTutorialCancelNum", 1892862475);
        setLongField(term35877, term35877.getClass(), "sumTechHighScore", -4647685842587984295L);
        setLongField(term35877, term35877.getClass(), "sumTechBasicHighScore", -7620419977716696564L);
        setLongField(term35877, term35877.getClass(), "sumTechAdvancedHighScore", 102282101180071600L);
        setLongField(term35877, term35877.getClass(), "sumTechExpertHighScore", -1795306210380148654L);
        setLongField(term35877, term35877.getClass(), "sumTechMasterHighScore", -1441295073480062630L);
        setLongField(term35877, term35877.getClass(), "sumTechLunaticHighScore", -4618196261828717815L);
        setLongField(term35877, term35877.getClass(), "sumBattleHighScore", -1396670214756396961L);
        setLongField(term35877, term35877.getClass(), "sumBattleBasicHighScore", 1795641040165405529L);
        setLongField(term35877, term35877.getClass(), "sumBattleAdvancedHighScore", 6002848910891080375L);
        setLongField(term35877, term35877.getClass(), "sumBattleExpertHighScore", 1959851788493022882L);
        setLongField(term35877, term35877.getClass(), "sumBattleMasterHighScore", -8272873308287230741L);
        setLongField(term35877, term35877.getClass(), "sumBattleLunaticHighScore", -1471967517386315328L);
        setField(term35877, term35877.getClass(), "eventWatchedDate", "pADwkrWiMW");
        setField(term35877, term35877.getClass(), "cmEventWatchedDate", "FDORDJuAXQ");
        setField(term35877, term35877.getClass(), "firstGameId", "yjqoDeLBLg");
        setField(term35877, term35877.getClass(), "firstRomVersion", "DCepDqVwas");
        setField(term35877, term35877.getClass(), "firstDataVersion", "wKIBUlfNCx");
        setField(term35877, term35877.getClass(), "firstPlayDate", "iGfMUWRvod");
        setField(term35877, term35877.getClass(), "lastGameId", "zUXaSvayQe");
        setField(term35877, term35877.getClass(), "lastRomVersion", "bPVcnnQPSC");
        setField(term35877, term35877.getClass(), "lastDataVersion", "PQLyoEKWSa");
        setField(term35877, term35877.getClass(), "compatibleCmVersion", "HOgkhttJZS");
        setField(term35877, term35877.getClass(), "lastPlayDate", "goqNSmXSSS");
        setIntField(term35877, term35877.getClass(), "lastPlaceId", -807914927);
        setField(term35877, term35877.getClass(), "lastPlaceName", "AkViBLdqXM");
        setIntField(term35877, term35877.getClass(), "lastRegionId", -313873930);
        setField(term35877, term35877.getClass(), "lastRegionName", "UlxGFzEifL");
        setIntField(term35877, term35877.getClass(), "lastAllNetId", -1064231188);
        setField(term35877, term35877.getClass(), "lastClientId", "HilHTbDKDF");
        setIntField(term35877, term35877.getClass(), "lastUsedDeckId", 1631564781);
        setIntField(term35877, term35877.getClass(), "lastPlayMusicLevel", -3085808);
        setIntField(term35877, term35877.getClass(), "lastEmoneyBrand", 1975783377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechExpertHighScore", argTypes, term35877, args);
    }

};


